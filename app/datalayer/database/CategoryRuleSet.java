package com.forsale.app.datalayer.database;

import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.app.utils.LocaleManager;
import com.leanplum.internal.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: CategoryRuleSet.kt */
/* loaded from: classes2.dex */
public final class CategoryRuleSet implements Parcelable {
    public static final Parcelable.Creator<CategoryRuleSet> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: CategoryRuleSet.kt */
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<CategoryRuleSet> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CategoryRuleSet createFromParcel(Parcel parcel) {
            o.i(parcel, "parcel");
            parcel.readInt();
            return new CategoryRuleSet();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CategoryRuleSet[] newArray(int i11) {
            return new CategoryRuleSet[i11];
        }
    }

    /* compiled from: CategoryRuleSet.kt */
    /* loaded from: classes2.dex */
    public static final class ImageConfiguration implements Parcelable {
        @c("max_images")
        private final int maxImages;
        @c("primary_required")
        private final boolean primaryRequired;
        public static final Parcelable.Creator<ImageConfiguration> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: CategoryRuleSet.kt */
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<ImageConfiguration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ImageConfiguration createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new ImageConfiguration(parcel.readInt() != 0, parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ImageConfiguration[] newArray(int i11) {
                return new ImageConfiguration[i11];
            }
        }

        public ImageConfiguration(boolean z11, int i11) {
            this.primaryRequired = z11;
            this.maxImages = i11;
        }

        public static /* synthetic */ ImageConfiguration copy$default(ImageConfiguration imageConfiguration, boolean z11, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                z11 = imageConfiguration.primaryRequired;
            }
            if ((i12 & 2) != 0) {
                i11 = imageConfiguration.maxImages;
            }
            return imageConfiguration.copy(z11, i11);
        }

        public final boolean component1() {
            return this.primaryRequired;
        }

        public final int component2() {
            return this.maxImages;
        }

        public final ImageConfiguration copy(boolean z11, int i11) {
            return new ImageConfiguration(z11, i11);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageConfiguration)) {
                return false;
            }
            ImageConfiguration imageConfiguration = (ImageConfiguration) obj;
            if (this.primaryRequired == imageConfiguration.primaryRequired && this.maxImages == imageConfiguration.maxImages) {
                return true;
            }
            return false;
        }

        public final int getMaxImages() {
            return this.maxImages;
        }

        public final boolean getPrimaryRequired() {
            return this.primaryRequired;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z11 = this.primaryRequired;
            ?? r02 = z11;
            if (z11) {
                r02 = 1;
            }
            return (r02 * 31) + Integer.hashCode(this.maxImages);
        }

        public String toString() {
            boolean z11 = this.primaryRequired;
            int i11 = this.maxImages;
            return "ImageConfiguration(primaryRequired=" + z11 + ", maxImages=" + i11 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeInt(this.primaryRequired ? 1 : 0);
            out.writeInt(this.maxImages);
        }
    }

    /* compiled from: CategoryRuleSet.kt */
    /* loaded from: classes2.dex */
    public static final class IntConfiguration implements Parcelable {
        @c("enabled")
        private final boolean enabled;
        @c("max_value")
        private final float maxValue;
        @c("min_value")
        private final float minValue;
        @c("range_validation_required")
        private final boolean rangeValidationRequired;
        @c("required")
        private final boolean required;
        public static final Parcelable.Creator<IntConfiguration> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: CategoryRuleSet.kt */
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<IntConfiguration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntConfiguration createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new IntConfiguration(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readFloat(), parcel.readFloat());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntConfiguration[] newArray(int i11) {
                return new IntConfiguration[i11];
            }
        }

        public IntConfiguration(boolean z11, boolean z12, boolean z13, float f11, float f12) {
            this.enabled = z11;
            this.required = z12;
            this.rangeValidationRequired = z13;
            this.minValue = f11;
            this.maxValue = f12;
        }

        public static /* synthetic */ IntConfiguration copy$default(IntConfiguration intConfiguration, boolean z11, boolean z12, boolean z13, float f11, float f12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = intConfiguration.enabled;
            }
            if ((i11 & 2) != 0) {
                z12 = intConfiguration.required;
            }
            boolean z14 = z12;
            if ((i11 & 4) != 0) {
                z13 = intConfiguration.rangeValidationRequired;
            }
            boolean z15 = z13;
            if ((i11 & 8) != 0) {
                f11 = intConfiguration.minValue;
            }
            float f13 = f11;
            if ((i11 & 16) != 0) {
                f12 = intConfiguration.maxValue;
            }
            return intConfiguration.copy(z11, z14, z15, f13, f12);
        }

        public final boolean component1() {
            return this.enabled;
        }

        public final boolean component2() {
            return this.required;
        }

        public final boolean component3() {
            return this.rangeValidationRequired;
        }

        public final float component4() {
            return this.minValue;
        }

        public final float component5() {
            return this.maxValue;
        }

        public final IntConfiguration copy(boolean z11, boolean z12, boolean z13, float f11, float f12) {
            return new IntConfiguration(z11, z12, z13, f11, f12);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IntConfiguration)) {
                return false;
            }
            IntConfiguration intConfiguration = (IntConfiguration) obj;
            if (this.enabled == intConfiguration.enabled && this.required == intConfiguration.required && this.rangeValidationRequired == intConfiguration.rangeValidationRequired && Float.compare(this.minValue, intConfiguration.minValue) == 0 && Float.compare(this.maxValue, intConfiguration.maxValue) == 0) {
                return true;
            }
            return false;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final float getMaxValue() {
            return this.maxValue;
        }

        public final float getMinValue() {
            return this.minValue;
        }

        public final boolean getRangeValidationRequired() {
            return this.rangeValidationRequired;
        }

        public final boolean getRequired() {
            return this.required;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
        public int hashCode() {
            boolean z11 = this.enabled;
            int i11 = 1;
            ?? r02 = z11;
            if (z11) {
                r02 = 1;
            }
            int i12 = r02 * 31;
            ?? r22 = this.required;
            int i13 = r22;
            if (r22 != 0) {
                i13 = 1;
            }
            int i14 = (i12 + i13) * 31;
            boolean z12 = this.rangeValidationRequired;
            if (!z12) {
                i11 = z12 ? 1 : 0;
            }
            return ((((i14 + i11) * 31) + Float.hashCode(this.minValue)) * 31) + Float.hashCode(this.maxValue);
        }

        public String toString() {
            boolean z11 = this.enabled;
            boolean z12 = this.required;
            boolean z13 = this.rangeValidationRequired;
            float f11 = this.minValue;
            float f12 = this.maxValue;
            return "IntConfiguration(enabled=" + z11 + ", required=" + z12 + ", rangeValidationRequired=" + z13 + ", minValue=" + f11 + ", maxValue=" + f12 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeInt(this.enabled ? 1 : 0);
            out.writeInt(this.required ? 1 : 0);
            out.writeInt(this.rangeValidationRequired ? 1 : 0);
            out.writeFloat(this.minValue);
            out.writeFloat(this.maxValue);
        }
    }

    /* compiled from: CategoryRuleSet.kt */
    /* loaded from: classes2.dex */
    public static final class Level implements Parcelable {
        @c("enabled")
        private final boolean enabled;
        @c("label_ar")
        private final String labelAr;
        @c("label_en")
        private final String labelEn;
        @c(DistrictEntity.LEVEL)
        private final int level;
        @c("required")
        private final boolean required;
        public static final Parcelable.Creator<Level> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: CategoryRuleSet.kt */
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<Level> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Level createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new Level(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Level[] newArray(int i11) {
                return new Level[i11];
            }
        }

        public Level(int i11, String labelAr, String labelEn, boolean z11, boolean z12) {
            o.i(labelAr, "labelAr");
            o.i(labelEn, "labelEn");
            this.level = i11;
            this.labelAr = labelAr;
            this.labelEn = labelEn;
            this.enabled = z11;
            this.required = z12;
        }

        public static /* synthetic */ Level copy$default(Level level, int i11, String str, String str2, boolean z11, boolean z12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = level.level;
            }
            if ((i12 & 2) != 0) {
                str = level.labelAr;
            }
            String str3 = str;
            if ((i12 & 4) != 0) {
                str2 = level.labelEn;
            }
            String str4 = str2;
            if ((i12 & 8) != 0) {
                z11 = level.enabled;
            }
            boolean z13 = z11;
            if ((i12 & 16) != 0) {
                z12 = level.required;
            }
            return level.copy(i11, str3, str4, z13, z12);
        }

        public final int component1() {
            return this.level;
        }

        public final String component2() {
            return this.labelAr;
        }

        public final String component3() {
            return this.labelEn;
        }

        public final boolean component4() {
            return this.enabled;
        }

        public final boolean component5() {
            return this.required;
        }

        public final Level copy(int i11, String labelAr, String labelEn, boolean z11, boolean z12) {
            o.i(labelAr, "labelAr");
            o.i(labelEn, "labelEn");
            return new Level(i11, labelAr, labelEn, z11, z12);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Level)) {
                return false;
            }
            Level level = (Level) obj;
            if (this.level == level.level && o.d(this.labelAr, level.labelAr) && o.d(this.labelEn, level.labelEn) && this.enabled == level.enabled && this.required == level.required) {
                return true;
            }
            return false;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final String getLabel() {
            if (LocaleManager.f39597a.r()) {
                return this.labelAr;
            }
            return this.labelEn;
        }

        public final String getLabelAr() {
            return this.labelAr;
        }

        public final String getLabelEn() {
            return this.labelEn;
        }

        public final int getLevel() {
            return this.level;
        }

        public final boolean getRequired() {
            return this.required;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((Integer.hashCode(this.level) * 31) + this.labelAr.hashCode()) * 31) + this.labelEn.hashCode()) * 31;
            boolean z11 = this.enabled;
            int i11 = 1;
            int i12 = z11;
            if (z11 != 0) {
                i12 = 1;
            }
            int i13 = (hashCode + i12) * 31;
            boolean z12 = this.required;
            if (!z12) {
                i11 = z12 ? 1 : 0;
            }
            return i13 + i11;
        }

        public String toString() {
            int i11 = this.level;
            String str = this.labelAr;
            String str2 = this.labelEn;
            boolean z11 = this.enabled;
            boolean z12 = this.required;
            return "Level(level=" + i11 + ", labelAr=" + str + ", labelEn=" + str2 + ", enabled=" + z11 + ", required=" + z12 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeInt(this.level);
            out.writeString(this.labelAr);
            out.writeString(this.labelEn);
            out.writeInt(this.enabled ? 1 : 0);
            out.writeInt(this.required ? 1 : 0);
        }
    }

    /* compiled from: CategoryRuleSet.kt */
    /* loaded from: classes2.dex */
    public static final class LocationConfiguration implements Parcelable {
        @c("required")
        private final boolean required;
        public static final Parcelable.Creator<LocationConfiguration> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: CategoryRuleSet.kt */
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<LocationConfiguration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocationConfiguration createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new LocationConfiguration(parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocationConfiguration[] newArray(int i11) {
                return new LocationConfiguration[i11];
            }
        }

        public LocationConfiguration(boolean z11) {
            this.required = z11;
        }

        public static /* synthetic */ LocationConfiguration copy$default(LocationConfiguration locationConfiguration, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = locationConfiguration.required;
            }
            return locationConfiguration.copy(z11);
        }

        public final boolean component1() {
            return this.required;
        }

        public final LocationConfiguration copy(boolean z11) {
            return new LocationConfiguration(z11);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof LocationConfiguration) && this.required == ((LocationConfiguration) obj).required) {
                return true;
            }
            return false;
        }

        public final boolean getRequired() {
            return this.required;
        }

        public int hashCode() {
            boolean z11 = this.required;
            if (z11) {
                return 1;
            }
            return z11 ? 1 : 0;
        }

        public String toString() {
            boolean z11 = this.required;
            return "LocationConfiguration(required=" + z11 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeInt(this.required ? 1 : 0);
        }
    }

    /* compiled from: CategoryRuleSet.kt */
    /* loaded from: classes2.dex */
    public static final class LocationExtraInfo implements Parcelable {
        @c("enabled")
        private final boolean enabled;
        @c("required")
        private final boolean required;
        public static final Parcelable.Creator<LocationExtraInfo> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: CategoryRuleSet.kt */
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<LocationExtraInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocationExtraInfo createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new LocationExtraInfo(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocationExtraInfo[] newArray(int i11) {
                return new LocationExtraInfo[i11];
            }
        }

        public LocationExtraInfo(boolean z11, boolean z12) {
            this.required = z11;
            this.enabled = z12;
        }

        public static /* synthetic */ LocationExtraInfo copy$default(LocationExtraInfo locationExtraInfo, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = locationExtraInfo.required;
            }
            if ((i11 & 2) != 0) {
                z12 = locationExtraInfo.enabled;
            }
            return locationExtraInfo.copy(z11, z12);
        }

        public final boolean component1() {
            return this.required;
        }

        public final boolean component2() {
            return this.enabled;
        }

        public final LocationExtraInfo copy(boolean z11, boolean z12) {
            return new LocationExtraInfo(z11, z12);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocationExtraInfo)) {
                return false;
            }
            LocationExtraInfo locationExtraInfo = (LocationExtraInfo) obj;
            if (this.required == locationExtraInfo.required && this.enabled == locationExtraInfo.enabled) {
                return true;
            }
            return false;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final boolean getRequired() {
            return this.required;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z11 = this.required;
            int i11 = 1;
            ?? r02 = z11;
            if (z11) {
                r02 = 1;
            }
            int i12 = r02 * 31;
            boolean z12 = this.enabled;
            if (!z12) {
                i11 = z12 ? 1 : 0;
            }
            return i12 + i11;
        }

        public String toString() {
            boolean z11 = this.required;
            boolean z12 = this.enabled;
            return "LocationExtraInfo(required=" + z11 + ", enabled=" + z12 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeInt(this.required ? 1 : 0);
            out.writeInt(this.enabled ? 1 : 0);
        }
    }

    /* compiled from: CategoryRuleSet.kt */
    /* loaded from: classes2.dex */
    public static final class LocationSettings implements Parcelable {
        @c("landmarks")
        private final LocationExtraInfo landmarks;
        @c(PointLevels.LEVELS)
        private final List<Level> levels;
        @c("map")
        private final LocationExtraInfo map;
        @c("street")
        private final LocationExtraInfo street;
        public static final Parcelable.Creator<LocationSettings> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: CategoryRuleSet.kt */
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<LocationSettings> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocationSettings createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                o.i(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        arrayList.add(Level.CREATOR.createFromParcel(parcel));
                    }
                }
                return new LocationSettings(arrayList, parcel.readInt() == 0 ? null : LocationExtraInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LocationExtraInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? LocationExtraInfo.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LocationSettings[] newArray(int i11) {
                return new LocationSettings[i11];
            }
        }

        public LocationSettings(List<Level> list, LocationExtraInfo locationExtraInfo, LocationExtraInfo locationExtraInfo2, LocationExtraInfo locationExtraInfo3) {
            this.levels = list;
            this.landmarks = locationExtraInfo;
            this.street = locationExtraInfo2;
            this.map = locationExtraInfo3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LocationSettings copy$default(LocationSettings locationSettings, List list, LocationExtraInfo locationExtraInfo, LocationExtraInfo locationExtraInfo2, LocationExtraInfo locationExtraInfo3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = locationSettings.levels;
            }
            if ((i11 & 2) != 0) {
                locationExtraInfo = locationSettings.landmarks;
            }
            if ((i11 & 4) != 0) {
                locationExtraInfo2 = locationSettings.street;
            }
            if ((i11 & 8) != 0) {
                locationExtraInfo3 = locationSettings.map;
            }
            return locationSettings.copy(list, locationExtraInfo, locationExtraInfo2, locationExtraInfo3);
        }

        public final List<Level> component1() {
            return this.levels;
        }

        public final LocationExtraInfo component2() {
            return this.landmarks;
        }

        public final LocationExtraInfo component3() {
            return this.street;
        }

        public final LocationExtraInfo component4() {
            return this.map;
        }

        public final LocationSettings copy(List<Level> list, LocationExtraInfo locationExtraInfo, LocationExtraInfo locationExtraInfo2, LocationExtraInfo locationExtraInfo3) {
            return new LocationSettings(list, locationExtraInfo, locationExtraInfo2, locationExtraInfo3);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocationSettings)) {
                return false;
            }
            LocationSettings locationSettings = (LocationSettings) obj;
            if (o.d(this.levels, locationSettings.levels) && o.d(this.landmarks, locationSettings.landmarks) && o.d(this.street, locationSettings.street) && o.d(this.map, locationSettings.map)) {
                return true;
            }
            return false;
        }

        public final LocationExtraInfo getLandmarks() {
            return this.landmarks;
        }

        public final List<Level> getLevels() {
            return this.levels;
        }

        public final LocationExtraInfo getMap() {
            return this.map;
        }

        public final LocationExtraInfo getStreet() {
            return this.street;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            List<Level> list = this.levels;
            int i11 = 0;
            if (list == null) {
                hashCode = 0;
            } else {
                hashCode = list.hashCode();
            }
            int i12 = hashCode * 31;
            LocationExtraInfo locationExtraInfo = this.landmarks;
            if (locationExtraInfo == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = locationExtraInfo.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            LocationExtraInfo locationExtraInfo2 = this.street;
            if (locationExtraInfo2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = locationExtraInfo2.hashCode();
            }
            int i14 = (i13 + hashCode3) * 31;
            LocationExtraInfo locationExtraInfo3 = this.map;
            if (locationExtraInfo3 != null) {
                i11 = locationExtraInfo3.hashCode();
            }
            return i14 + i11;
        }

        public String toString() {
            List<Level> list = this.levels;
            LocationExtraInfo locationExtraInfo = this.landmarks;
            LocationExtraInfo locationExtraInfo2 = this.street;
            LocationExtraInfo locationExtraInfo3 = this.map;
            return "LocationSettings(levels=" + list + ", landmarks=" + locationExtraInfo + ", street=" + locationExtraInfo2 + ", map=" + locationExtraInfo3 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            List<Level> list = this.levels;
            if (list == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(list.size());
                for (Level level : list) {
                    level.writeToParcel(out, i11);
                }
            }
            LocationExtraInfo locationExtraInfo = this.landmarks;
            if (locationExtraInfo == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                locationExtraInfo.writeToParcel(out, i11);
            }
            LocationExtraInfo locationExtraInfo2 = this.street;
            if (locationExtraInfo2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                locationExtraInfo2.writeToParcel(out, i11);
            }
            LocationExtraInfo locationExtraInfo3 = this.map;
            if (locationExtraInfo3 == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            locationExtraInfo3.writeToParcel(out, i11);
        }
    }

    /* compiled from: CategoryRuleSet.kt */
    /* loaded from: classes2.dex */
    public static final class RuleSet implements Parcelable {
        @c("description")
        private final StringConfiguration description;
        @c(Constants.Keys.LOCATION)
        private final LocationConfiguration location;
        @c("location_settings")
        private final LocationSettings locationSettings;
        @c("media")
        private final MediaConfiguration media;
        @c("price")
        private final IntConfiguration price;
        @c("tag")
        private final Tag tag;
        @c("title")
        private final StringConfiguration title;
        public static final Parcelable.Creator<RuleSet> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: CategoryRuleSet.kt */
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<RuleSet> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RuleSet createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new RuleSet(parcel.readInt() == 0 ? null : StringConfiguration.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StringConfiguration.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : IntConfiguration.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MediaConfiguration.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LocationConfiguration.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LocationSettings.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Tag.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RuleSet[] newArray(int i11) {
                return new RuleSet[i11];
            }
        }

        public RuleSet(StringConfiguration stringConfiguration, StringConfiguration stringConfiguration2, IntConfiguration intConfiguration, MediaConfiguration mediaConfiguration, LocationConfiguration locationConfiguration, LocationSettings locationSettings, Tag tag) {
            this.title = stringConfiguration;
            this.description = stringConfiguration2;
            this.price = intConfiguration;
            this.media = mediaConfiguration;
            this.location = locationConfiguration;
            this.locationSettings = locationSettings;
            this.tag = tag;
        }

        public static /* synthetic */ RuleSet copy$default(RuleSet ruleSet, StringConfiguration stringConfiguration, StringConfiguration stringConfiguration2, IntConfiguration intConfiguration, MediaConfiguration mediaConfiguration, LocationConfiguration locationConfiguration, LocationSettings locationSettings, Tag tag, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                stringConfiguration = ruleSet.title;
            }
            if ((i11 & 2) != 0) {
                stringConfiguration2 = ruleSet.description;
            }
            StringConfiguration stringConfiguration3 = stringConfiguration2;
            if ((i11 & 4) != 0) {
                intConfiguration = ruleSet.price;
            }
            IntConfiguration intConfiguration2 = intConfiguration;
            if ((i11 & 8) != 0) {
                mediaConfiguration = ruleSet.media;
            }
            MediaConfiguration mediaConfiguration2 = mediaConfiguration;
            if ((i11 & 16) != 0) {
                locationConfiguration = ruleSet.location;
            }
            LocationConfiguration locationConfiguration2 = locationConfiguration;
            if ((i11 & 32) != 0) {
                locationSettings = ruleSet.locationSettings;
            }
            LocationSettings locationSettings2 = locationSettings;
            if ((i11 & 64) != 0) {
                tag = ruleSet.tag;
            }
            return ruleSet.copy(stringConfiguration, stringConfiguration3, intConfiguration2, mediaConfiguration2, locationConfiguration2, locationSettings2, tag);
        }

        public final StringConfiguration component1() {
            return this.title;
        }

        public final StringConfiguration component2() {
            return this.description;
        }

        public final IntConfiguration component3() {
            return this.price;
        }

        public final MediaConfiguration component4() {
            return this.media;
        }

        public final LocationConfiguration component5() {
            return this.location;
        }

        public final LocationSettings component6() {
            return this.locationSettings;
        }

        public final Tag component7() {
            return this.tag;
        }

        public final RuleSet copy(StringConfiguration stringConfiguration, StringConfiguration stringConfiguration2, IntConfiguration intConfiguration, MediaConfiguration mediaConfiguration, LocationConfiguration locationConfiguration, LocationSettings locationSettings, Tag tag) {
            return new RuleSet(stringConfiguration, stringConfiguration2, intConfiguration, mediaConfiguration, locationConfiguration, locationSettings, tag);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RuleSet)) {
                return false;
            }
            RuleSet ruleSet = (RuleSet) obj;
            if (o.d(this.title, ruleSet.title) && o.d(this.description, ruleSet.description) && o.d(this.price, ruleSet.price) && o.d(this.media, ruleSet.media) && o.d(this.location, ruleSet.location) && o.d(this.locationSettings, ruleSet.locationSettings) && o.d(this.tag, ruleSet.tag)) {
                return true;
            }
            return false;
        }

        public final StringConfiguration getDescription() {
            return this.description;
        }

        public final LocationConfiguration getLocation() {
            return this.location;
        }

        public final LocationSettings getLocationSettings() {
            return this.locationSettings;
        }

        public final MediaConfiguration getMedia() {
            return this.media;
        }

        public final IntConfiguration getPrice() {
            return this.price;
        }

        public final Tag getTag() {
            return this.tag;
        }

        public final StringConfiguration getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            int hashCode6;
            StringConfiguration stringConfiguration = this.title;
            int i11 = 0;
            if (stringConfiguration == null) {
                hashCode = 0;
            } else {
                hashCode = stringConfiguration.hashCode();
            }
            int i12 = hashCode * 31;
            StringConfiguration stringConfiguration2 = this.description;
            if (stringConfiguration2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = stringConfiguration2.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            IntConfiguration intConfiguration = this.price;
            if (intConfiguration == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = intConfiguration.hashCode();
            }
            int i14 = (i13 + hashCode3) * 31;
            MediaConfiguration mediaConfiguration = this.media;
            if (mediaConfiguration == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = mediaConfiguration.hashCode();
            }
            int i15 = (i14 + hashCode4) * 31;
            LocationConfiguration locationConfiguration = this.location;
            if (locationConfiguration == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = locationConfiguration.hashCode();
            }
            int i16 = (i15 + hashCode5) * 31;
            LocationSettings locationSettings = this.locationSettings;
            if (locationSettings == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = locationSettings.hashCode();
            }
            int i17 = (i16 + hashCode6) * 31;
            Tag tag = this.tag;
            if (tag != null) {
                i11 = tag.hashCode();
            }
            return i17 + i11;
        }

        public String toString() {
            StringConfiguration stringConfiguration = this.title;
            StringConfiguration stringConfiguration2 = this.description;
            IntConfiguration intConfiguration = this.price;
            MediaConfiguration mediaConfiguration = this.media;
            LocationConfiguration locationConfiguration = this.location;
            LocationSettings locationSettings = this.locationSettings;
            Tag tag = this.tag;
            return "RuleSet(title=" + stringConfiguration + ", description=" + stringConfiguration2 + ", price=" + intConfiguration + ", media=" + mediaConfiguration + ", location=" + locationConfiguration + ", locationSettings=" + locationSettings + ", tag=" + tag + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            StringConfiguration stringConfiguration = this.title;
            if (stringConfiguration == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                stringConfiguration.writeToParcel(out, i11);
            }
            StringConfiguration stringConfiguration2 = this.description;
            if (stringConfiguration2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                stringConfiguration2.writeToParcel(out, i11);
            }
            IntConfiguration intConfiguration = this.price;
            if (intConfiguration == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                intConfiguration.writeToParcel(out, i11);
            }
            MediaConfiguration mediaConfiguration = this.media;
            if (mediaConfiguration == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                mediaConfiguration.writeToParcel(out, i11);
            }
            LocationConfiguration locationConfiguration = this.location;
            if (locationConfiguration == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                locationConfiguration.writeToParcel(out, i11);
            }
            LocationSettings locationSettings = this.locationSettings;
            if (locationSettings == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                locationSettings.writeToParcel(out, i11);
            }
            Tag tag = this.tag;
            if (tag == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            tag.writeToParcel(out, i11);
        }
    }

    /* compiled from: CategoryRuleSet.kt */
    /* loaded from: classes2.dex */
    public static final class StringConfiguration implements Parcelable {
        @c("enabled")
        private final boolean enabled;
        @c("max_chars")
        private final int maxChars;
        @c("min_chars")
        private final int minChars;
        @c("required")
        private final boolean required;
        public static final Parcelable.Creator<StringConfiguration> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: CategoryRuleSet.kt */
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<StringConfiguration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StringConfiguration createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new StringConfiguration(parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StringConfiguration[] newArray(int i11) {
                return new StringConfiguration[i11];
            }
        }

        public StringConfiguration(boolean z11, int i11, int i12, boolean z12) {
            this.enabled = z11;
            this.minChars = i11;
            this.maxChars = i12;
            this.required = z12;
        }

        public static /* synthetic */ StringConfiguration copy$default(StringConfiguration stringConfiguration, boolean z11, int i11, int i12, boolean z12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z11 = stringConfiguration.enabled;
            }
            if ((i13 & 2) != 0) {
                i11 = stringConfiguration.minChars;
            }
            if ((i13 & 4) != 0) {
                i12 = stringConfiguration.maxChars;
            }
            if ((i13 & 8) != 0) {
                z12 = stringConfiguration.required;
            }
            return stringConfiguration.copy(z11, i11, i12, z12);
        }

        public final boolean component1() {
            return this.enabled;
        }

        public final int component2() {
            return this.minChars;
        }

        public final int component3() {
            return this.maxChars;
        }

        public final boolean component4() {
            return this.required;
        }

        public final StringConfiguration copy(boolean z11, int i11, int i12, boolean z12) {
            return new StringConfiguration(z11, i11, i12, z12);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StringConfiguration)) {
                return false;
            }
            StringConfiguration stringConfiguration = (StringConfiguration) obj;
            if (this.enabled == stringConfiguration.enabled && this.minChars == stringConfiguration.minChars && this.maxChars == stringConfiguration.maxChars && this.required == stringConfiguration.required) {
                return true;
            }
            return false;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final int getMaxChars() {
            return this.maxChars;
        }

        public final int getMinChars() {
            return this.minChars;
        }

        public final boolean getRequired() {
            return this.required;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        public int hashCode() {
            boolean z11 = this.enabled;
            int i11 = 1;
            ?? r02 = z11;
            if (z11) {
                r02 = 1;
            }
            int hashCode = ((((r02 * 31) + Integer.hashCode(this.minChars)) * 31) + Integer.hashCode(this.maxChars)) * 31;
            boolean z12 = this.required;
            if (!z12) {
                i11 = z12 ? 1 : 0;
            }
            return hashCode + i11;
        }

        public String toString() {
            boolean z11 = this.enabled;
            int i11 = this.minChars;
            int i12 = this.maxChars;
            boolean z12 = this.required;
            return "StringConfiguration(enabled=" + z11 + ", minChars=" + i11 + ", maxChars=" + i12 + ", required=" + z12 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeInt(this.enabled ? 1 : 0);
            out.writeInt(this.minChars);
            out.writeInt(this.maxChars);
            out.writeInt(this.required ? 1 : 0);
        }
    }

    /* compiled from: CategoryRuleSet.kt */
    /* loaded from: classes2.dex */
    public static final class Tag implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Tag> CREATOR = new Creator();
        @c("enabled")
        private final boolean enabled;
        @c("label")
        private final Label tagLabel;

        /* compiled from: CategoryRuleSet.kt */
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<Tag> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Tag createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new Tag(parcel.readInt() != 0, Label.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Tag[] newArray(int i11) {
                return new Tag[i11];
            }
        }

        /* compiled from: CategoryRuleSet.kt */
        /* loaded from: classes2.dex */
        public static final class Label implements Parcelable {
            @c("label_ar")
            private final String labelAr;
            @c("label_en")
            private final String labelEn;
            public static final Parcelable.Creator<Label> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: CategoryRuleSet.kt */
            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<Label> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Label createFromParcel(Parcel parcel) {
                    o.i(parcel, "parcel");
                    return new Label(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Label[] newArray(int i11) {
                    return new Label[i11];
                }
            }

            public Label(String labelAr, String labelEn) {
                o.i(labelAr, "labelAr");
                o.i(labelEn, "labelEn");
                this.labelAr = labelAr;
                this.labelEn = labelEn;
            }

            public static /* synthetic */ Label copy$default(Label label, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = label.labelAr;
                }
                if ((i11 & 2) != 0) {
                    str2 = label.labelEn;
                }
                return label.copy(str, str2);
            }

            public final String component1() {
                return this.labelAr;
            }

            public final String component2() {
                return this.labelEn;
            }

            public final Label copy(String labelAr, String labelEn) {
                o.i(labelAr, "labelAr");
                o.i(labelEn, "labelEn");
                return new Label(labelAr, labelEn);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Label)) {
                    return false;
                }
                Label label = (Label) obj;
                if (o.d(this.labelAr, label.labelAr) && o.d(this.labelEn, label.labelEn)) {
                    return true;
                }
                return false;
            }

            public final String getLabel() {
                if (LocaleManager.f39597a.r()) {
                    return this.labelAr;
                }
                return this.labelEn;
            }

            public final String getLabelAr() {
                return this.labelAr;
            }

            public final String getLabelEn() {
                return this.labelEn;
            }

            public int hashCode() {
                return (this.labelAr.hashCode() * 31) + this.labelEn.hashCode();
            }

            public String toString() {
                String str = this.labelAr;
                String str2 = this.labelEn;
                return "Label(labelAr=" + str + ", labelEn=" + str2 + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                o.i(out, "out");
                out.writeString(this.labelAr);
                out.writeString(this.labelEn);
            }
        }

        public Tag(boolean z11, Label tagLabel) {
            o.i(tagLabel, "tagLabel");
            this.enabled = z11;
            this.tagLabel = tagLabel;
        }

        public static /* synthetic */ Tag copy$default(Tag tag, boolean z11, Label label, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = tag.enabled;
            }
            if ((i11 & 2) != 0) {
                label = tag.tagLabel;
            }
            return tag.copy(z11, label);
        }

        public final boolean component1() {
            return this.enabled;
        }

        public final Label component2() {
            return this.tagLabel;
        }

        public final Tag copy(boolean z11, Label tagLabel) {
            o.i(tagLabel, "tagLabel");
            return new Tag(z11, tagLabel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tag)) {
                return false;
            }
            Tag tag = (Tag) obj;
            if (this.enabled == tag.enabled && o.d(this.tagLabel, tag.tagLabel)) {
                return true;
            }
            return false;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final Label getTagLabel() {
            return this.tagLabel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z11 = this.enabled;
            ?? r02 = z11;
            if (z11) {
                r02 = 1;
            }
            return (r02 * 31) + this.tagLabel.hashCode();
        }

        public String toString() {
            boolean z11 = this.enabled;
            Label label = this.tagLabel;
            return "Tag(enabled=" + z11 + ", tagLabel=" + label + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeInt(this.enabled ? 1 : 0);
            this.tagLabel.writeToParcel(out, i11);
        }
    }

    /* compiled from: CategoryRuleSet.kt */
    /* loaded from: classes2.dex */
    public static final class Tutorial implements Parcelable {
        @c("descriptionAr")
        private final String descriptionAr;
        @c("descriptionEn")
        private final String descriptionEn;
        @c("image")
        private final String image;
        @c("titleAr")
        private final String titleAr;
        @c("titleEn")
        private final String titleEn;
        public static final Parcelable.Creator<Tutorial> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: CategoryRuleSet.kt */
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<Tutorial> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Tutorial createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new Tutorial(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Tutorial[] newArray(int i11) {
                return new Tutorial[i11];
            }
        }

        public Tutorial(String titleAr, String titleEn, String descriptionAr, String descriptionEn, String image) {
            o.i(titleAr, "titleAr");
            o.i(titleEn, "titleEn");
            o.i(descriptionAr, "descriptionAr");
            o.i(descriptionEn, "descriptionEn");
            o.i(image, "image");
            this.titleAr = titleAr;
            this.titleEn = titleEn;
            this.descriptionAr = descriptionAr;
            this.descriptionEn = descriptionEn;
            this.image = image;
        }

        public static /* synthetic */ Tutorial copy$default(Tutorial tutorial, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = tutorial.titleAr;
            }
            if ((i11 & 2) != 0) {
                str2 = tutorial.titleEn;
            }
            String str6 = str2;
            if ((i11 & 4) != 0) {
                str3 = tutorial.descriptionAr;
            }
            String str7 = str3;
            if ((i11 & 8) != 0) {
                str4 = tutorial.descriptionEn;
            }
            String str8 = str4;
            if ((i11 & 16) != 0) {
                str5 = tutorial.image;
            }
            return tutorial.copy(str, str6, str7, str8, str5);
        }

        public final String component1() {
            return this.titleAr;
        }

        public final String component2() {
            return this.titleEn;
        }

        public final String component3() {
            return this.descriptionAr;
        }

        public final String component4() {
            return this.descriptionEn;
        }

        public final String component5() {
            return this.image;
        }

        public final Tutorial copy(String titleAr, String titleEn, String descriptionAr, String descriptionEn, String image) {
            o.i(titleAr, "titleAr");
            o.i(titleEn, "titleEn");
            o.i(descriptionAr, "descriptionAr");
            o.i(descriptionEn, "descriptionEn");
            o.i(image, "image");
            return new Tutorial(titleAr, titleEn, descriptionAr, descriptionEn, image);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tutorial)) {
                return false;
            }
            Tutorial tutorial = (Tutorial) obj;
            if (o.d(this.titleAr, tutorial.titleAr) && o.d(this.titleEn, tutorial.titleEn) && o.d(this.descriptionAr, tutorial.descriptionAr) && o.d(this.descriptionEn, tutorial.descriptionEn) && o.d(this.image, tutorial.image)) {
                return true;
            }
            return false;
        }

        public final String getDescription() {
            if (LocaleManager.f39597a.r()) {
                return this.descriptionAr;
            }
            return this.descriptionEn;
        }

        public final String getDescriptionAr() {
            return this.descriptionAr;
        }

        public final String getDescriptionEn() {
            return this.descriptionEn;
        }

        public final String getImage() {
            return this.image;
        }

        public final String getTitle() {
            if (LocaleManager.f39597a.r()) {
                return this.titleAr;
            }
            return this.titleEn;
        }

        public final String getTitleAr() {
            return this.titleAr;
        }

        public final String getTitleEn() {
            return this.titleEn;
        }

        public int hashCode() {
            return (((((((this.titleAr.hashCode() * 31) + this.titleEn.hashCode()) * 31) + this.descriptionAr.hashCode()) * 31) + this.descriptionEn.hashCode()) * 31) + this.image.hashCode();
        }

        public String toString() {
            String str = this.titleAr;
            String str2 = this.titleEn;
            String str3 = this.descriptionAr;
            String str4 = this.descriptionEn;
            String str5 = this.image;
            return "Tutorial(titleAr=" + str + ", titleEn=" + str2 + ", descriptionAr=" + str3 + ", descriptionEn=" + str4 + ", image=" + str5 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeString(this.titleAr);
            out.writeString(this.titleEn);
            out.writeString(this.descriptionAr);
            out.writeString(this.descriptionEn);
            out.writeString(this.image);
        }
    }

    /* compiled from: CategoryRuleSet.kt */
    /* loaded from: classes2.dex */
    public static final class VideoConfiguration implements Parcelable {
        @c("enabled")
        private final boolean enabled;
        @c("max_length_seconds")
        private final int maxLengthSeconds;
        @c("max_size_kb")
        private final int maxSizeKb;
        public static final Parcelable.Creator<VideoConfiguration> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: CategoryRuleSet.kt */
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<VideoConfiguration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VideoConfiguration createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new VideoConfiguration(parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VideoConfiguration[] newArray(int i11) {
                return new VideoConfiguration[i11];
            }
        }

        public VideoConfiguration(boolean z11, int i11, int i12) {
            this.enabled = z11;
            this.maxLengthSeconds = i11;
            this.maxSizeKb = i12;
        }

        public static /* synthetic */ VideoConfiguration copy$default(VideoConfiguration videoConfiguration, boolean z11, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z11 = videoConfiguration.enabled;
            }
            if ((i13 & 2) != 0) {
                i11 = videoConfiguration.maxLengthSeconds;
            }
            if ((i13 & 4) != 0) {
                i12 = videoConfiguration.maxSizeKb;
            }
            return videoConfiguration.copy(z11, i11, i12);
        }

        public final boolean component1() {
            return this.enabled;
        }

        public final int component2() {
            return this.maxLengthSeconds;
        }

        public final int component3() {
            return this.maxSizeKb;
        }

        public final VideoConfiguration copy(boolean z11, int i11, int i12) {
            return new VideoConfiguration(z11, i11, i12);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoConfiguration)) {
                return false;
            }
            VideoConfiguration videoConfiguration = (VideoConfiguration) obj;
            if (this.enabled == videoConfiguration.enabled && this.maxLengthSeconds == videoConfiguration.maxLengthSeconds && this.maxSizeKb == videoConfiguration.maxSizeKb) {
                return true;
            }
            return false;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final int getMaxLengthSeconds() {
            return this.maxLengthSeconds;
        }

        public final int getMaxSizeKb() {
            return this.maxSizeKb;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public int hashCode() {
            boolean z11 = this.enabled;
            ?? r02 = z11;
            if (z11) {
                r02 = 1;
            }
            return (((r02 * 31) + Integer.hashCode(this.maxLengthSeconds)) * 31) + Integer.hashCode(this.maxSizeKb);
        }

        public String toString() {
            boolean z11 = this.enabled;
            int i11 = this.maxLengthSeconds;
            int i12 = this.maxSizeKb;
            return "VideoConfiguration(enabled=" + z11 + ", maxLengthSeconds=" + i11 + ", maxSizeKb=" + i12 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeInt(this.enabled ? 1 : 0);
            out.writeInt(this.maxLengthSeconds);
            out.writeInt(this.maxSizeKb);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeInt(1);
    }

    /* compiled from: CategoryRuleSet.kt */
    /* loaded from: classes2.dex */
    public static final class MediaConfiguration implements Parcelable {
        @c("enabled")
        private final boolean enabled;
        @c("images")
        private final ImageConfiguration images;
        @c("tutorials")
        private final List<Tutorial> tutorials;
        @c("video")
        private final VideoConfiguration video;
        public static final Parcelable.Creator<MediaConfiguration> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: CategoryRuleSet.kt */
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<MediaConfiguration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MediaConfiguration createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                o.i(parcel, "parcel");
                boolean z11 = parcel.readInt() != 0;
                ImageConfiguration createFromParcel = ImageConfiguration.CREATOR.createFromParcel(parcel);
                VideoConfiguration createFromParcel2 = VideoConfiguration.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        arrayList2.add(Tutorial.CREATOR.createFromParcel(parcel));
                    }
                    arrayList = arrayList2;
                }
                return new MediaConfiguration(z11, createFromParcel, createFromParcel2, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MediaConfiguration[] newArray(int i11) {
                return new MediaConfiguration[i11];
            }
        }

        public MediaConfiguration(boolean z11, ImageConfiguration images, VideoConfiguration video, List<Tutorial> list) {
            o.i(images, "images");
            o.i(video, "video");
            this.enabled = z11;
            this.images = images;
            this.video = video;
            this.tutorials = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MediaConfiguration copy$default(MediaConfiguration mediaConfiguration, boolean z11, ImageConfiguration imageConfiguration, VideoConfiguration videoConfiguration, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = mediaConfiguration.enabled;
            }
            if ((i11 & 2) != 0) {
                imageConfiguration = mediaConfiguration.images;
            }
            if ((i11 & 4) != 0) {
                videoConfiguration = mediaConfiguration.video;
            }
            if ((i11 & 8) != 0) {
                list = mediaConfiguration.tutorials;
            }
            return mediaConfiguration.copy(z11, imageConfiguration, videoConfiguration, list);
        }

        public final boolean component1() {
            return this.enabled;
        }

        public final ImageConfiguration component2() {
            return this.images;
        }

        public final VideoConfiguration component3() {
            return this.video;
        }

        public final List<Tutorial> component4() {
            return this.tutorials;
        }

        public final MediaConfiguration copy(boolean z11, ImageConfiguration images, VideoConfiguration video, List<Tutorial> list) {
            o.i(images, "images");
            o.i(video, "video");
            return new MediaConfiguration(z11, images, video, list);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaConfiguration)) {
                return false;
            }
            MediaConfiguration mediaConfiguration = (MediaConfiguration) obj;
            if (this.enabled == mediaConfiguration.enabled && o.d(this.images, mediaConfiguration.images) && o.d(this.video, mediaConfiguration.video) && o.d(this.tutorials, mediaConfiguration.tutorials)) {
                return true;
            }
            return false;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final ImageConfiguration getImages() {
            return this.images;
        }

        public final List<Tutorial> getTutorials() {
            return this.tutorials;
        }

        public final VideoConfiguration getVideo() {
            return this.video;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        public int hashCode() {
            int hashCode;
            boolean z11 = this.enabled;
            ?? r02 = z11;
            if (z11) {
                r02 = 1;
            }
            int hashCode2 = ((((r02 * 31) + this.images.hashCode()) * 31) + this.video.hashCode()) * 31;
            List<Tutorial> list = this.tutorials;
            if (list == null) {
                hashCode = 0;
            } else {
                hashCode = list.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            boolean z11 = this.enabled;
            ImageConfiguration imageConfiguration = this.images;
            VideoConfiguration videoConfiguration = this.video;
            List<Tutorial> list = this.tutorials;
            return "MediaConfiguration(enabled=" + z11 + ", images=" + imageConfiguration + ", video=" + videoConfiguration + ", tutorials=" + list + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeInt(this.enabled ? 1 : 0);
            this.images.writeToParcel(out, i11);
            this.video.writeToParcel(out, i11);
            List<Tutorial> list = this.tutorials;
            if (list == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(list.size());
            for (Tutorial tutorial : list) {
                tutorial.writeToParcel(out, i11);
            }
        }

        public /* synthetic */ MediaConfiguration(boolean z11, ImageConfiguration imageConfiguration, VideoConfiguration videoConfiguration, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(z11, imageConfiguration, videoConfiguration, (i11 & 8) != 0 ? null : list);
        }
    }
}
