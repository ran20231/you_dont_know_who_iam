package com.forsale.app.datalayer.database;

import com.forsale.app.utils.Languages;
import com.forsale.app.utils.LocaleManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: LocationEntity.kt */
/* loaded from: classes2.dex */
public final class LocationEntity {
    public static final String ID = "id";
    public static final String IS_ACTIVE = "is_active";
    public static final String LOCATIONS_TABLE = "locations";
    public static final String NAME_AR = "name_ar";
    public static final String NAME_EN = "name_en";
    public static final String REGION_ID = "region_id";
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final int f22317id;
    @c("is_active")
    private int isActive;
    @c("name_ar")
    private final String nameAr;
    @c("name_en")
    private final String nameEn;
    @c("region_id")
    private final int regionId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: LocationEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LocationEntity(int i11, String nameAr, String nameEn, int i12) {
        o.i(nameAr, "nameAr");
        o.i(nameEn, "nameEn");
        this.f22317id = i11;
        this.nameAr = nameAr;
        this.nameEn = nameEn;
        this.regionId = i12;
        this.isActive = 1;
    }

    public static /* synthetic */ LocationEntity copy$default(LocationEntity locationEntity, int i11, String str, String str2, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = locationEntity.f22317id;
        }
        if ((i13 & 2) != 0) {
            str = locationEntity.nameAr;
        }
        if ((i13 & 4) != 0) {
            str2 = locationEntity.nameEn;
        }
        if ((i13 & 8) != 0) {
            i12 = locationEntity.regionId;
        }
        return locationEntity.copy(i11, str, str2, i12);
    }

    public final int component1() {
        return this.f22317id;
    }

    public final String component2() {
        return this.nameAr;
    }

    public final String component3() {
        return this.nameEn;
    }

    public final int component4() {
        return this.regionId;
    }

    public final LocationEntity copy(int i11, String nameAr, String nameEn, int i12) {
        o.i(nameAr, "nameAr");
        o.i(nameEn, "nameEn");
        return new LocationEntity(i11, nameAr, nameEn, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationEntity)) {
            return false;
        }
        LocationEntity locationEntity = (LocationEntity) obj;
        if (this.f22317id == locationEntity.f22317id && o.d(this.nameAr, locationEntity.nameAr) && o.d(this.nameEn, locationEntity.nameEn) && this.regionId == locationEntity.regionId) {
            return true;
        }
        return false;
    }

    public final int getId() {
        return this.f22317id;
    }

    public final String getName() {
        if (o.d(LocaleManager.f39597a.k(), Languages.ENGLISH.getValue())) {
            return this.nameEn;
        }
        return this.nameAr;
    }

    public final String getNameAr() {
        return this.nameAr;
    }

    public final String getNameEn() {
        return this.nameEn;
    }

    public final int getRegionId() {
        return this.regionId;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f22317id) * 31) + this.nameAr.hashCode()) * 31) + this.nameEn.hashCode()) * 31) + Integer.hashCode(this.regionId);
    }

    public final int isActive() {
        return this.isActive;
    }

    public final void setActive(int i11) {
        this.isActive = i11;
    }

    public String toString() {
        int i11 = this.f22317id;
        String str = this.nameAr;
        String str2 = this.nameEn;
        int i12 = this.regionId;
        return "LocationEntity(id=" + i11 + ", nameAr=" + str + ", nameEn=" + str2 + ", regionId=" + i12 + ")";
    }
}
