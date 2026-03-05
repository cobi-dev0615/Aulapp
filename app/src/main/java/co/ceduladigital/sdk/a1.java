package co.ceduladigital.sdk;

import android.os.Bundle;
import android.os.Parcelable;
import com.gse.aulapp.model.dto.ConfigurationSessionDto;
import com.gse.aulapp.model.enumerate.EnumClassType;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class a1 {
    public static b1 a(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        bundle.setClassLoader(b1.class.getClassLoader());
        if (!bundle.containsKey("sessionID")) {
            throw new IllegalArgumentException("Required argument \"sessionID\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("sessionID");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"sessionID\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("entryTime")) {
            throw new IllegalArgumentException("Required argument \"entryTime\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("entryTime");
        if (!bundle.containsKey("configurationSession")) {
            throw new IllegalArgumentException("Required argument \"configurationSession\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(ConfigurationSessionDto.class) && !Serializable.class.isAssignableFrom(ConfigurationSessionDto.class)) {
            throw new UnsupportedOperationException(ConfigurationSessionDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        ConfigurationSessionDto configurationSessionDto = (ConfigurationSessionDto) bundle.get("configurationSession");
        if (configurationSessionDto != null) {
            return new b1(string, string2, configurationSessionDto);
        }
        throw new IllegalArgumentException("Argument \"configurationSession\" is marked as non-null but was passed a null value.");
    }

    public static k2 b(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        bundle.setClassLoader(k2.class.getClassLoader());
        if (!bundle.containsKey("sessionID")) {
            throw new IllegalArgumentException("Required argument \"sessionID\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("sessionID");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"sessionID\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("isEnter")) {
            throw new IllegalArgumentException("Required argument \"isEnter\" is missing and does not have an android:defaultValue");
        }
        boolean z = bundle.getBoolean("isEnter");
        if (!bundle.containsKey("sessionType")) {
            throw new IllegalArgumentException("Required argument \"sessionType\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(EnumClassType.class) && !Serializable.class.isAssignableFrom(EnumClassType.class)) {
            throw new UnsupportedOperationException(EnumClassType.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        EnumClassType enumClassType = (EnumClassType) bundle.get("sessionType");
        if (enumClassType != null) {
            return new k2(string, z, enumClassType);
        }
        throw new IllegalArgumentException("Argument \"sessionType\" is marked as non-null but was passed a null value.");
    }

    public static p7 c(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        bundle.setClassLoader(p7.class.getClassLoader());
        if (!bundle.containsKey("sessionID")) {
            throw new IllegalArgumentException("Required argument \"sessionID\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("sessionID");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"sessionID\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("entryTime")) {
            throw new IllegalArgumentException("Required argument \"entryTime\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("entryTime");
        if (!bundle.containsKey("configurationSession")) {
            throw new IllegalArgumentException("Required argument \"configurationSession\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(ConfigurationSessionDto.class) && !Serializable.class.isAssignableFrom(ConfigurationSessionDto.class)) {
            throw new UnsupportedOperationException(ConfigurationSessionDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        ConfigurationSessionDto configurationSessionDto = (ConfigurationSessionDto) bundle.get("configurationSession");
        if (configurationSessionDto != null) {
            return new p7(string, string2, configurationSessionDto);
        }
        throw new IllegalArgumentException("Argument \"configurationSession\" is marked as non-null but was passed a null value.");
    }
}
