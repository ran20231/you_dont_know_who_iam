package com.forsale.app.features.categories.normal;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.k0;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.utils.analytics.SubCategoriesPosition;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import z3.h;
/* compiled from: SubCategoriesFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class a implements h {

    /* renamed from: e  reason: collision with root package name */
    public static final C0339a f31075e = new C0339a(null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f31076f = 8;

    /* renamed from: a  reason: collision with root package name */
    private final CategoryEntity f31077a;

    /* renamed from: b  reason: collision with root package name */
    private final String f31078b;

    /* renamed from: c  reason: collision with root package name */
    private final SubCategoriesPosition f31079c;

    /* renamed from: d  reason: collision with root package name */
    private final SubCategoryAnalyticsSource f31080d;

    /* compiled from: SubCategoriesFragmentArgs.kt */
    /* renamed from: com.forsale.app.features.categories.normal.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0339a {
        private C0339a() {
        }

        public /* synthetic */ C0339a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(Bundle bundle) {
            CategoryEntity categoryEntity;
            String str;
            SubCategoriesPosition subCategoriesPosition;
            o.i(bundle, "bundle");
            bundle.setClassLoader(a.class.getClassLoader());
            SubCategoryAnalyticsSource subCategoryAnalyticsSource = null;
            if (bundle.containsKey("PARENT_CATEGORY")) {
                if (!Parcelable.class.isAssignableFrom(CategoryEntity.class) && !Serializable.class.isAssignableFrom(CategoryEntity.class)) {
                    throw new UnsupportedOperationException(CategoryEntity.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                categoryEntity = (CategoryEntity) bundle.get("PARENT_CATEGORY");
            } else {
                categoryEntity = null;
            }
            if (bundle.containsKey("CATEGORY_TITLE")) {
                str = bundle.getString("CATEGORY_TITLE");
            } else {
                str = null;
            }
            if (bundle.containsKey("SUB_CATEGORIES_POSITION")) {
                if (!Parcelable.class.isAssignableFrom(SubCategoriesPosition.class) && !Serializable.class.isAssignableFrom(SubCategoriesPosition.class)) {
                    throw new UnsupportedOperationException(SubCategoriesPosition.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                subCategoriesPosition = (SubCategoriesPosition) bundle.get("SUB_CATEGORIES_POSITION");
                if (subCategoriesPosition == null) {
                    throw new IllegalArgumentException("Argument \"SUB_CATEGORIES_POSITION\" is marked as non-null but was passed a null value.");
                }
            } else {
                subCategoriesPosition = SubCategoriesPosition.DEFAULT;
            }
            if (bundle.containsKey("analyticSource")) {
                if (!Parcelable.class.isAssignableFrom(SubCategoryAnalyticsSource.class) && !Serializable.class.isAssignableFrom(SubCategoryAnalyticsSource.class)) {
                    throw new UnsupportedOperationException(SubCategoryAnalyticsSource.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                subCategoryAnalyticsSource = (SubCategoryAnalyticsSource) bundle.get("analyticSource");
            }
            return new a(categoryEntity, str, subCategoriesPosition, subCategoryAnalyticsSource);
        }

        public final a b(k0 savedStateHandle) {
            CategoryEntity categoryEntity;
            String str;
            SubCategoriesPosition subCategoriesPosition;
            o.i(savedStateHandle, "savedStateHandle");
            SubCategoryAnalyticsSource subCategoryAnalyticsSource = null;
            if (savedStateHandle.e("PARENT_CATEGORY")) {
                if (!Parcelable.class.isAssignableFrom(CategoryEntity.class) && !Serializable.class.isAssignableFrom(CategoryEntity.class)) {
                    throw new UnsupportedOperationException(CategoryEntity.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                categoryEntity = (CategoryEntity) savedStateHandle.f("PARENT_CATEGORY");
            } else {
                categoryEntity = null;
            }
            if (savedStateHandle.e("CATEGORY_TITLE")) {
                str = (String) savedStateHandle.f("CATEGORY_TITLE");
            } else {
                str = null;
            }
            if (savedStateHandle.e("SUB_CATEGORIES_POSITION")) {
                if (!Parcelable.class.isAssignableFrom(SubCategoriesPosition.class) && !Serializable.class.isAssignableFrom(SubCategoriesPosition.class)) {
                    throw new UnsupportedOperationException(SubCategoriesPosition.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                subCategoriesPosition = (SubCategoriesPosition) savedStateHandle.f("SUB_CATEGORIES_POSITION");
                if (subCategoriesPosition == null) {
                    throw new IllegalArgumentException("Argument \"SUB_CATEGORIES_POSITION\" is marked as non-null but was passed a null value");
                }
            } else {
                subCategoriesPosition = SubCategoriesPosition.DEFAULT;
            }
            if (savedStateHandle.e("analyticSource")) {
                if (!Parcelable.class.isAssignableFrom(SubCategoryAnalyticsSource.class) && !Serializable.class.isAssignableFrom(SubCategoryAnalyticsSource.class)) {
                    throw new UnsupportedOperationException(SubCategoryAnalyticsSource.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                subCategoryAnalyticsSource = (SubCategoryAnalyticsSource) savedStateHandle.f("analyticSource");
            }
            return new a(categoryEntity, str, subCategoriesPosition, subCategoryAnalyticsSource);
        }
    }

    public a() {
        this(null, null, null, null, 15, null);
    }

    public static final a fromBundle(Bundle bundle) {
        return f31075e.a(bundle);
    }

    public final SubCategoryAnalyticsSource a() {
        return this.f31080d;
    }

    public final CategoryEntity b() {
        return this.f31077a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (o.d(this.f31077a, aVar.f31077a) && o.d(this.f31078b, aVar.f31078b) && this.f31079c == aVar.f31079c && o.d(this.f31080d, aVar.f31080d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        CategoryEntity categoryEntity = this.f31077a;
        int i11 = 0;
        if (categoryEntity == null) {
            hashCode = 0;
        } else {
            hashCode = categoryEntity.hashCode();
        }
        int i12 = hashCode * 31;
        String str = this.f31078b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int hashCode3 = (((i12 + hashCode2) * 31) + this.f31079c.hashCode()) * 31;
        SubCategoryAnalyticsSource subCategoryAnalyticsSource = this.f31080d;
        if (subCategoryAnalyticsSource != null) {
            i11 = subCategoryAnalyticsSource.hashCode();
        }
        return hashCode3 + i11;
    }

    public String toString() {
        CategoryEntity categoryEntity = this.f31077a;
        String str = this.f31078b;
        SubCategoriesPosition subCategoriesPosition = this.f31079c;
        SubCategoryAnalyticsSource subCategoryAnalyticsSource = this.f31080d;
        return "SubCategoriesFragmentArgs(PARENTCATEGORY=" + categoryEntity + ", CATEGORYTITLE=" + str + ", SUBCATEGORIESPOSITION=" + subCategoriesPosition + ", analyticSource=" + subCategoryAnalyticsSource + ")";
    }

    public a(CategoryEntity categoryEntity, String str, SubCategoriesPosition SUBCATEGORIESPOSITION, SubCategoryAnalyticsSource subCategoryAnalyticsSource) {
        o.i(SUBCATEGORIESPOSITION, "SUBCATEGORIESPOSITION");
        this.f31077a = categoryEntity;
        this.f31078b = str;
        this.f31079c = SUBCATEGORIESPOSITION;
        this.f31080d = subCategoryAnalyticsSource;
    }

    public /* synthetic */ a(CategoryEntity categoryEntity, String str, SubCategoriesPosition subCategoriesPosition, SubCategoryAnalyticsSource subCategoryAnalyticsSource, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : categoryEntity, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? SubCategoriesPosition.DEFAULT : subCategoriesPosition, (i11 & 8) != 0 ? null : subCategoryAnalyticsSource);
    }
}
