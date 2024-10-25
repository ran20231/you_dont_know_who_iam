package com.forsale.app.ui.bottomsheets.wanteditems;

import android.os.Bundle;
import android.os.Parcelable;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.datalayer.database.ProhibitedKeywordEntity;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: AddWantedItemBottomSheetArgs.kt */
/* loaded from: classes3.dex */
public final class a implements z3.h {

    /* renamed from: d  reason: collision with root package name */
    public static final C0441a f39279d = new C0441a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f39280e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final CategoryEntity f39281a;

    /* renamed from: b  reason: collision with root package name */
    private final String f39282b;

    /* renamed from: c  reason: collision with root package name */
    private final DistrictEntity f39283c;

    /* compiled from: AddWantedItemBottomSheetArgs.kt */
    /* renamed from: com.forsale.app.ui.bottomsheets.wanteditems.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0441a {
        private C0441a() {
        }

        public /* synthetic */ C0441a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(Bundle bundle) {
            CategoryEntity categoryEntity;
            String str;
            o.i(bundle, "bundle");
            bundle.setClassLoader(a.class.getClassLoader());
            DistrictEntity districtEntity = null;
            if (bundle.containsKey("categoryEntity")) {
                if (!Parcelable.class.isAssignableFrom(CategoryEntity.class) && !Serializable.class.isAssignableFrom(CategoryEntity.class)) {
                    throw new UnsupportedOperationException(CategoryEntity.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                categoryEntity = (CategoryEntity) bundle.get("categoryEntity");
            } else {
                categoryEntity = null;
            }
            if (bundle.containsKey(ProhibitedKeywordEntity.KEYWORD)) {
                str = bundle.getString(ProhibitedKeywordEntity.KEYWORD);
            } else {
                str = null;
            }
            if (bundle.containsKey("districtEntity")) {
                if (!Parcelable.class.isAssignableFrom(DistrictEntity.class) && !Serializable.class.isAssignableFrom(DistrictEntity.class)) {
                    throw new UnsupportedOperationException(DistrictEntity.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                districtEntity = (DistrictEntity) bundle.get("districtEntity");
            }
            return new a(categoryEntity, str, districtEntity);
        }
    }

    public a() {
        this(null, null, null, 7, null);
    }

    public static final a fromBundle(Bundle bundle) {
        return f39279d.a(bundle);
    }

    public final CategoryEntity a() {
        return this.f39281a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (o.d(this.f39281a, aVar.f39281a) && o.d(this.f39282b, aVar.f39282b) && o.d(this.f39283c, aVar.f39283c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        CategoryEntity categoryEntity = this.f39281a;
        int i11 = 0;
        if (categoryEntity == null) {
            hashCode = 0;
        } else {
            hashCode = categoryEntity.hashCode();
        }
        int i12 = hashCode * 31;
        String str = this.f39282b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        DistrictEntity districtEntity = this.f39283c;
        if (districtEntity != null) {
            i11 = districtEntity.hashCode();
        }
        return i13 + i11;
    }

    public String toString() {
        CategoryEntity categoryEntity = this.f39281a;
        String str = this.f39282b;
        DistrictEntity districtEntity = this.f39283c;
        return "AddWantedItemBottomSheetArgs(categoryEntity=" + categoryEntity + ", keyword=" + str + ", districtEntity=" + districtEntity + ")";
    }

    public a(CategoryEntity categoryEntity, String str, DistrictEntity districtEntity) {
        this.f39281a = categoryEntity;
        this.f39282b = str;
        this.f39283c = districtEntity;
    }

    public /* synthetic */ a(CategoryEntity categoryEntity, String str, DistrictEntity districtEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : categoryEntity, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : districtEntity);
    }
}
