package com.forsale.app.features.categories.home.homelandingscreen;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.k0;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.utils.analytics.HomeVisitedSources;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import z3.h;
/* compiled from: VerticalFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class a implements h {

    /* renamed from: d  reason: collision with root package name */
    public static final C0265a f24079d = new C0265a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f24080e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final int f24081a;

    /* renamed from: b  reason: collision with root package name */
    private final CategoryEntity f24082b;

    /* renamed from: c  reason: collision with root package name */
    private final HomeVisitedSources f24083c;

    /* compiled from: VerticalFragmentArgs.kt */
    /* renamed from: com.forsale.app.features.categories.home.homelandingscreen.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0265a {
        private C0265a() {
        }

        public /* synthetic */ C0265a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(Bundle bundle) {
            int i11;
            CategoryEntity categoryEntity;
            HomeVisitedSources homeVisitedSources;
            o.i(bundle, "bundle");
            bundle.setClassLoader(a.class.getClassLoader());
            if (bundle.containsKey("categoryID")) {
                i11 = bundle.getInt("categoryID");
            } else {
                i11 = -1;
            }
            if (bundle.containsKey("parent_category")) {
                if (!Parcelable.class.isAssignableFrom(CategoryEntity.class) && !Serializable.class.isAssignableFrom(CategoryEntity.class)) {
                    String name = CategoryEntity.class.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
                categoryEntity = (CategoryEntity) bundle.get("parent_category");
            } else {
                categoryEntity = null;
            }
            if (bundle.containsKey("verticalSource")) {
                if (!Parcelable.class.isAssignableFrom(HomeVisitedSources.class) && !Serializable.class.isAssignableFrom(HomeVisitedSources.class)) {
                    String name2 = HomeVisitedSources.class.getName();
                    throw new UnsupportedOperationException(name2 + " must implement Parcelable or Serializable or must be an Enum.");
                }
                homeVisitedSources = (HomeVisitedSources) bundle.get("verticalSource");
                if (homeVisitedSources == null) {
                    throw new IllegalArgumentException("Argument \"verticalSource\" is marked as non-null but was passed a null value.");
                }
            } else {
                homeVisitedSources = HomeVisitedSources.NAV_BAR;
            }
            return new a(i11, categoryEntity, homeVisitedSources);
        }

        public final a b(k0 savedStateHandle) {
            Integer num;
            CategoryEntity categoryEntity;
            HomeVisitedSources homeVisitedSources;
            o.i(savedStateHandle, "savedStateHandle");
            if (savedStateHandle.e("categoryID")) {
                num = (Integer) savedStateHandle.f("categoryID");
                if (num == null) {
                    throw new IllegalArgumentException("Argument \"categoryID\" of type integer does not support null values");
                }
            } else {
                num = -1;
            }
            if (savedStateHandle.e("parent_category")) {
                if (!Parcelable.class.isAssignableFrom(CategoryEntity.class) && !Serializable.class.isAssignableFrom(CategoryEntity.class)) {
                    String name = CategoryEntity.class.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
                categoryEntity = (CategoryEntity) savedStateHandle.f("parent_category");
            } else {
                categoryEntity = null;
            }
            if (savedStateHandle.e("verticalSource")) {
                if (!Parcelable.class.isAssignableFrom(HomeVisitedSources.class) && !Serializable.class.isAssignableFrom(HomeVisitedSources.class)) {
                    String name2 = HomeVisitedSources.class.getName();
                    throw new UnsupportedOperationException(name2 + " must implement Parcelable or Serializable or must be an Enum.");
                }
                homeVisitedSources = (HomeVisitedSources) savedStateHandle.f("verticalSource");
                if (homeVisitedSources == null) {
                    throw new IllegalArgumentException("Argument \"verticalSource\" is marked as non-null but was passed a null value");
                }
            } else {
                homeVisitedSources = HomeVisitedSources.NAV_BAR;
            }
            return new a(num.intValue(), categoryEntity, homeVisitedSources);
        }
    }

    public a() {
        this(0, null, null, 7, null);
    }

    public static final a fromBundle(Bundle bundle) {
        return f24079d.a(bundle);
    }

    public final CategoryEntity a() {
        return this.f24082b;
    }

    public final HomeVisitedSources b() {
        return this.f24083c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f24081a == aVar.f24081a && o.d(this.f24082b, aVar.f24082b) && this.f24083c == aVar.f24083c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.f24081a) * 31;
        CategoryEntity categoryEntity = this.f24082b;
        if (categoryEntity == null) {
            hashCode = 0;
        } else {
            hashCode = categoryEntity.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.f24083c.hashCode();
    }

    public String toString() {
        int i11 = this.f24081a;
        CategoryEntity categoryEntity = this.f24082b;
        HomeVisitedSources homeVisitedSources = this.f24083c;
        return "VerticalFragmentArgs(categoryID=" + i11 + ", parentCategory=" + categoryEntity + ", verticalSource=" + homeVisitedSources + ")";
    }

    public a(int i11, CategoryEntity categoryEntity, HomeVisitedSources verticalSource) {
        o.i(verticalSource, "verticalSource");
        this.f24081a = i11;
        this.f24082b = categoryEntity;
        this.f24083c = verticalSource;
    }

    public /* synthetic */ a(int i11, CategoryEntity categoryEntity, HomeVisitedSources homeVisitedSources, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? -1 : i11, (i12 & 2) != 0 ? null : categoryEntity, (i12 & 4) != 0 ? HomeVisitedSources.NAV_BAR : homeVisitedSources);
    }
}
