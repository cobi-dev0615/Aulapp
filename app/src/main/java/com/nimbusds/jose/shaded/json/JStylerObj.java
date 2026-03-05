package com.nimbusds.jose.shaded.json;

import java.io.IOException;

/* loaded from: classes2.dex */
abstract class JStylerObj {
    public static final Escape4Web ESCAPE4Web;
    public static final EscapeLT ESCAPE_LT;
    public static final MPAgressive MP_AGGRESIVE;
    public static final MPSimple MP_SIMPLE;
    public static final MPTrue MP_TRUE;

    public static class Escape4Web implements StringProtector {
        private Escape4Web() {
        }

        @Override // com.nimbusds.jose.shaded.json.JStylerObj.StringProtector
        public void escape(String str, Appendable appendable) {
            try {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt == '\f') {
                        appendable.append("\\f");
                    } else if (charAt == '\r') {
                        appendable.append("\\r");
                    } else if (charAt == '\"') {
                        appendable.append("\\\"");
                    } else if (charAt == '/') {
                        appendable.append("\\/");
                    } else if (charAt != '\\') {
                        switch (charAt) {
                            case '\b':
                                appendable.append("\\b");
                                break;
                            case '\t':
                                appendable.append("\\t");
                                break;
                            case '\n':
                                appendable.append("\\n");
                                break;
                            default:
                                if ((charAt < 0 || charAt > 31) && ((charAt < 127 || charAt > 159) && (charAt < 8192 || charAt > 8447))) {
                                    appendable.append(charAt);
                                    break;
                                } else {
                                    appendable.append("\\u");
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> '\f') & 15));
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> '\b') & 15));
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> 4) & 15));
                                    appendable.append("0123456789ABCDEF".charAt(charAt & 15));
                                    break;
                                }
                                break;
                        }
                    } else {
                        appendable.append("\\\\");
                    }
                }
            } catch (IOException unused) {
                throw new RuntimeException("Impossible Error");
            }
        }
    }

    public static class EscapeLT implements StringProtector {
        private EscapeLT() {
        }

        @Override // com.nimbusds.jose.shaded.json.JStylerObj.StringProtector
        public void escape(String str, Appendable appendable) {
            try {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt == '\f') {
                        appendable.append("\\f");
                    } else if (charAt == '\r') {
                        appendable.append("\\r");
                    } else if (charAt == '\"') {
                        appendable.append("\\\"");
                    } else if (charAt != '\\') {
                        switch (charAt) {
                            case '\b':
                                appendable.append("\\b");
                                break;
                            case '\t':
                                appendable.append("\\t");
                                break;
                            case '\n':
                                appendable.append("\\n");
                                break;
                            default:
                                if ((charAt < 0 || charAt > 31) && ((charAt < 127 || charAt > 159) && (charAt < 8192 || charAt > 8447))) {
                                    appendable.append(charAt);
                                    break;
                                } else {
                                    appendable.append("\\u");
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> '\f') & 15));
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> '\b') & 15));
                                    appendable.append("0123456789ABCDEF".charAt((charAt >> 4) & 15));
                                    appendable.append("0123456789ABCDEF".charAt(charAt & 15));
                                    break;
                                }
                        }
                    } else {
                        appendable.append("\\\\");
                    }
                }
            } catch (IOException unused) {
                throw new RuntimeException("Impossible Exception");
            }
        }
    }

    public static class MPAgressive implements MustProtect {
        private MPAgressive() {
        }

        @Override // com.nimbusds.jose.shaded.json.JStylerObj.MustProtect
        public boolean mustBeProtect(String str) {
            if (str == null) {
                return false;
            }
            int length = str.length();
            if (length == 0 || str.trim() != str) {
                return true;
            }
            char charAt = str.charAt(0);
            if (JStylerObj.isSpecial(charAt) || JStylerObj.isUnicode(charAt)) {
                return true;
            }
            for (int i = 1; i < length; i++) {
                char charAt2 = str.charAt(i);
                if (JStylerObj.isSpecialClose(charAt2) || JStylerObj.isUnicode(charAt2)) {
                    return true;
                }
            }
            if (JStylerObj.isKeyword(str)) {
                return true;
            }
            char charAt3 = str.charAt(0);
            if ((charAt3 >= '0' && charAt3 <= '9') || charAt3 == '-') {
                int i2 = 1;
                while (i2 < length) {
                    charAt3 = str.charAt(i2);
                    if (charAt3 < '0' || charAt3 > '9') {
                        break;
                    }
                    i2++;
                }
                if (i2 == length) {
                    return true;
                }
                if (charAt3 == '.') {
                    i2++;
                }
                while (i2 < length) {
                    charAt3 = str.charAt(i2);
                    if (charAt3 < '0' || charAt3 > '9') {
                        break;
                    }
                    i2++;
                }
                if (i2 == length) {
                    return true;
                }
                if (charAt3 == 'E' || charAt3 == 'e') {
                    int i3 = i2 + 1;
                    if (i3 == length) {
                        return false;
                    }
                    char charAt4 = str.charAt(i3);
                    if (charAt4 == '+' || charAt4 == '-') {
                        i2 += 2;
                        str.charAt(i2);
                    } else {
                        i2 = i3;
                    }
                }
                if (i2 == length) {
                    return false;
                }
                while (i2 < length) {
                    char charAt5 = str.charAt(i2);
                    if (charAt5 < '0' || charAt5 > '9') {
                        break;
                    }
                    i2++;
                }
                if (i2 == length) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class MPSimple implements MustProtect {
        private MPSimple() {
        }

        @Override // com.nimbusds.jose.shaded.json.JStylerObj.MustProtect
        public boolean mustBeProtect(String str) {
            if (str == null) {
                return false;
            }
            int length = str.length();
            if (length == 0 || str.trim() != str) {
                return true;
            }
            char charAt = str.charAt(0);
            if ((charAt >= '0' && charAt <= '9') || charAt == '-') {
                return true;
            }
            for (int i = 0; i < length; i++) {
                char charAt2 = str.charAt(i);
                if (JStylerObj.isSpace(charAt2) || JStylerObj.isSpecial(charAt2) || JStylerObj.isSpecialChar(charAt2) || JStylerObj.isUnicode(charAt2)) {
                    return true;
                }
            }
            return JStylerObj.isKeyword(str);
        }
    }

    public static class MPTrue implements MustProtect {
        private MPTrue() {
        }

        @Override // com.nimbusds.jose.shaded.json.JStylerObj.MustProtect
        public boolean mustBeProtect(String str) {
            return true;
        }
    }

    public interface MustProtect {
        boolean mustBeProtect(String str);
    }

    public interface StringProtector {
        void escape(String str, Appendable appendable);
    }

    static {
        MP_SIMPLE = new MPSimple();
        MP_TRUE = new MPTrue();
        MP_AGGRESIVE = new MPAgressive();
        ESCAPE_LT = new EscapeLT();
        ESCAPE4Web = new Escape4Web();
    }

    public static boolean isKeyword(String str) {
        if (str.length() < 3) {
            return false;
        }
        char charAt = str.charAt(0);
        if (charAt == 'n') {
            return str.equals("null");
        }
        if (charAt == 't') {
            return str.equals("true");
        }
        if (charAt == 'f') {
            return str.equals("false");
        }
        if (charAt == 'N') {
            return str.equals("NaN");
        }
        return false;
    }

    public static boolean isSpace(char c) {
        return c == '\r' || c == '\n' || c == '\t' || c == ' ';
    }

    public static boolean isSpecial(char c) {
        return c == '{' || c == '[' || c == ',' || c == '}' || c == ']' || c == ':' || c == '\'' || c == '\"';
    }

    public static boolean isSpecialChar(char c) {
        return c == '\b' || c == '\f' || c == '\n';
    }

    public static boolean isSpecialClose(char c) {
        return c == '}' || c == ']' || c == ',' || c == ':';
    }

    public static boolean isUnicode(char c) {
        if (c >= 0 && c <= 31) {
            return true;
        }
        if (c < 127 || c > 159) {
            return c >= 8192 && c <= 8447;
        }
        return true;
    }
}
