package com.getkeepsafe.relinker;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.getkeepsafe.relinker.ReLinker;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.io.ConstantsKt;

/* loaded from: classes.dex */
public class ApkLibraryInstaller implements ReLinker.LibraryInstaller {

    public static class ZipFileInZipEntry {
        public ZipEntry zipEntry;
        public ZipFile zipFile;

        public ZipFileInZipEntry(ZipFile zipFile, ZipEntry zipEntry) {
            this.zipFile = zipFile;
            this.zipEntry = zipEntry;
        }
    }

    private void closeSilently(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private long copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                outputStream.flush();
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    private ZipFileInZipEntry findAPKWithLibrary(Context context, String[] strArr, String str, ReLinkerInstance reLinkerInstance) {
        String[] sourceDirectories = sourceDirectories(context);
        int length = sourceDirectories.length;
        int i = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i >= length) {
                return null;
            }
            String str2 = sourceDirectories[i];
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i2 = i3;
                }
            }
            if (zipFile != null) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    if (i4 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb = new StringBuilder("lib");
                            char c = File.separatorChar;
                            sb.append(c);
                            sb.append(str3);
                            sb.append(c);
                            sb.append(str);
                            String sb2 = sb.toString();
                            reLinkerInstance.log("Looking for %s in APK %s...", sb2, str2);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                return new ZipFileInZipEntry(zipFile, entry);
                            }
                        }
                        i4 = i5;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i++;
        }
    }

    private String[] getSupportedABIs(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c = File.separatorChar;
        sb.append(c);
        sb.append("([^\\");
        sb.append(c);
        sb.append("]*)");
        sb.append(c);
        sb.append(str);
        Pattern compile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : sourceDirectories(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private String[] sourceDirectories(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0064, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return;
     */
    @Override // com.getkeepsafe.relinker.ReLinker.LibraryInstaller
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void installLibrary(Context context, String[] strArr, String str, File file, ReLinkerInstance reLinkerInstance) {
        String[] strArr2;
        ZipFile zipFile;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        long copy = 0;
        ZipFileInZipEntry zipFileInZipEntry = null;
        Closeable closeable = null;
        try {
            ZipFileInZipEntry findAPKWithLibrary = findAPKWithLibrary(context, strArr, str, reLinkerInstance);
            try {
                if (findAPKWithLibrary == null) {
                    try {
                        strArr2 = getSupportedABIs(context, str);
                    } catch (Exception e) {
                        strArr2 = new String[]{e.toString()};
                    }
                    throw new MissingLibraryException(str, strArr, strArr2);
                }
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    try {
                        if (i < 5) {
                            reLinkerInstance.log("Found %s! Extracting...", str);
                            try {
                                if (file.exists() || file.createNewFile()) {
                                    try {
                                        inputStream = findAPKWithLibrary.zipFile.getInputStream(findAPKWithLibrary.zipEntry);
                                        try {
                                            fileOutputStream = new FileOutputStream(file);
                                        } catch (FileNotFoundException unused) {
                                            fileOutputStream = null;
                                        } catch (IOException unused2) {
                                            fileOutputStream = null;
                                        } catch (Throwable th) {
                                            fileOutputStream = null;
                                            closeSilently(null);
                                            closeSilently(fileOutputStream);
                                            throw th;
                                        }
                                    } catch (FileNotFoundException unused3) {
                                        inputStream = null;
                                        fileOutputStream = null;
                                    } catch (IOException unused4) {
                                        inputStream = null;
                                        fileOutputStream = null;
                                    } catch (Throwable th2) {
                                        fileOutputStream = null;
                                        closeSilently(null);
                                        closeSilently(fileOutputStream);
                                        throw th2;
                                    }
                                    try {
                                        copy = copy(inputStream, fileOutputStream);
                                        fileOutputStream.getFD().sync();
                                    } catch (FileNotFoundException unused5) {
                                        closeSilently(inputStream);
                                        closeSilently(fileOutputStream);
                                        i = i2;
                                    } catch (IOException unused6) {
                                        closeSilently(inputStream);
                                        closeSilently(fileOutputStream);
                                        i = i2;
                                    } catch (Throwable th3) {
                                        closeSilently(inputStream);
                                        closeSilently(fileOutputStream);
                                        throw th3;
                                    }
                                    if (copy != file.length()) {
                                        closeSilently(inputStream);
                                        closeSilently(fileOutputStream);
                                    } else {
                                        closeSilently(inputStream);
                                        closeSilently(fileOutputStream);
                                        file.setReadable(true, false);
                                        file.setExecutable(true, false);
                                        file.setWritable(true);
                                        zipFile = findAPKWithLibrary.zipFile;
                                        if (zipFile == null) {
                                            return;
                                        }
                                    }
                                }
                            } catch (IOException unused7) {
                            }
                            i = i2;
                        } else {
                            reLinkerInstance.log("FATAL! Couldn't extract the library from the APK!");
                            zipFile = findAPKWithLibrary.zipFile;
                            if (zipFile == null) {
                                return;
                            }
                        }
                    } catch (Exception unused8) {
                        return;
                    }
                }
            } catch (Throwable th4) {
                if (findAPKWithLibrary != null) {
                    try {
                        ZipFile zipFile2 = findAPKWithLibrary.zipFile;
                        if (zipFile2 != null) {
                            zipFile2.close();
                        }
                    } catch (IOException unused9) {
                    }
                }
                throw th4;
            }
        } catch (Throwable th5) {
            /* decompilation artifact - exception swallowed */
        }
    }
}
