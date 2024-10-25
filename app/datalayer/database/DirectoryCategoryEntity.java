package com.forsale.app.datalayer.database;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: DirectoryCategoryEntity.kt */
/* loaded from: classes2.dex */
public final class DirectoryCategoryEntity {
    public static final String DIRECTORY_CATEGORIES_TABLE = "directory_categories";
    public static final String ID = "id";
    public static final String IMAGE = "image";
    public static final String IS_ACTIVE = "is_active";
    public static final String NAME_AR = "name_ar";
    public static final String NAME_EN = "name_en";
    public static final String PARENT_ID = "parent_id";
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final int f22308id;
    @c("image")
    private final String image;
    @c("is_active")
    private int isActive;
    @c("name_ar")
    private final String nameAr;
    @c("name_en")
    private final String nameEn;
    @c("parent_id")
    private final int parentId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DirectoryCategoryEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DirectoryCategoryEntity(int i11, String nameAr, String nameEn, int i12, String str) {
        o.i(nameAr, "nameAr");
        o.i(nameEn, "nameEn");
        this.f22308id = i11;
        this.nameAr = nameAr;
        this.nameEn = nameEn;
        this.parentId = i12;
        this.image = str;
        this.isActive = 1;
    }

    public static /* synthetic */ DirectoryCategoryEntity copy$default(DirectoryCategoryEntity directoryCategoryEntity, int i11, String str, String str2, int i12, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = directoryCategoryEntity.f22308id;
        }
        if ((i13 & 2) != 0) {
            str = directoryCategoryEntity.nameAr;
        }
        String str4 = str;
        if ((i13 & 4) != 0) {
            str2 = directoryCategoryEntity.nameEn;
        }
        String str5 = str2;
        if ((i13 & 8) != 0) {
            i12 = directoryCategoryEntity.parentId;
        }
        int i14 = i12;
        if ((i13 & 16) != 0) {
            str3 = directoryCategoryEntity.image;
        }
        return directoryCategoryEntity.copy(i11, str4, str5, i14, str3);
    }

    public final int component1() {
        return this.f22308id;
    }

    public final String component2() {
        return this.nameAr;
    }

    public final String component3() {
        return this.nameEn;
    }

    public final int component4() {
        return this.parentId;
    }

    public final String component5() {
        return this.image;
    }

    public final DirectoryCategoryEntity copy(int i11, String nameAr, String nameEn, int i12, String str) {
        o.i(nameAr, "nameAr");
        o.i(nameEn, "nameEn");
        return new DirectoryCategoryEntity(i11, nameAr, nameEn, i12, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectoryCategoryEntity)) {
            return false;
        }
        DirectoryCategoryEntity directoryCategoryEntity = (DirectoryCategoryEntity) obj;
        if (this.f22308id == directoryCategoryEntity.f22308id && o.d(this.nameAr, directoryCategoryEntity.nameAr) && o.d(this.nameEn, directoryCategoryEntity.nameEn) && this.parentId == directoryCategoryEntity.parentId && o.d(this.image, directoryCategoryEntity.image)) {
            return true;
        }
        return false;
    }

    public final int getId() {
        return this.f22308id;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getNameAr() {
        return this.nameAr;
    }

    public final String getNameEn() {
        return this.nameEn;
    }

    public final int getParentId() {
        return this.parentId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((Integer.hashCode(this.f22308id) * 31) + this.nameAr.hashCode()) * 31) + this.nameEn.hashCode()) * 31) + Integer.hashCode(this.parentId)) * 31;
        String str = this.image;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final int isActive() {
        return this.isActive;
    }

    public final void setActive(int i11) {
        this.isActive = i11;
    }

    public String toString() {
        int i11 = this.f22308id;
        String str = this.nameAr;
        String str2 = this.nameEn;
        int i12 = this.parentId;
        String str3 = this.image;
        return "DirectoryCategoryEntity(id=" + i11 + ", nameAr=" + str + ", nameEn=" + str2 + ", parentId=" + i12 + ", image=" + str3 + ")";
    }
}
