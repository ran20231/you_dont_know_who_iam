package com.forsale.app.features.categories.home.propertyhome;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.k0;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.utils.analytics.HomeVisitedSources;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import z3.h;
/* compiled from: PropertyHomeFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class b implements h {

    /* renamed from: d  reason: collision with root package name */
    public static final a f24978d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f24979e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final CategoryEntity f24980a;

    /* renamed from: b  reason: collision with root package name */
    private final int f24981b;

    /* renamed from: c  reason: collision with root package name */
    private final HomeVisitedSources f24982c;

    /* compiled from: PropertyHomeFragmentArgs.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(Bundle bundle) {
            int i11;
            HomeVisitedSources homeVisitedSources;
            o.i(bundle, "bundle");
            bundle.setClassLoader(b.class.getClassLoader());
            if (bundle.containsKey("categoryId")) {
                i11 = bundle.getInt("categoryId");
            } else {
                i11 = -1;
            }
            if (bundle.containsKey("category")) {
                if (!Parcelable.class.isAssignableFrom(CategoryEntity.class) && !Serializable.class.isAssignableFrom(CategoryEntity.class)) {
                    String name = CategoryEntity.class.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
                CategoryEntity categoryEntity = (CategoryEntity) bundle.get("category");
                if (categoryEntity != null) {
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
                        homeVisitedSources = HomeVisitedSources.HOME_PAGE;
                    }
                    return new b(categoryEntity, i11, homeVisitedSources);
                }
                throw new IllegalArgumentException("Argument \"category\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Required argument \"category\" is missing and does not have an android:defaultValue");
        }

        public final b b(k0 savedStateHandle) {
            Integer num;
            HomeVisitedSources homeVisitedSources;
            o.i(savedStateHandle, "savedStateHandle");
            if (savedStateHandle.e("categoryId")) {
                num = (Integer) savedStateHandle.f("categoryId");
                if (num == null) {
                    throw new IllegalArgumentException("Argument \"categoryId\" of type integer does not support null values");
                }
            } else {
                num = -1;
            }
            if (savedStateHandle.e("category")) {
                if (!Parcelable.class.isAssignableFrom(CategoryEntity.class) && !Serializable.class.isAssignableFrom(CategoryEntity.class)) {
                    String name = CategoryEntity.class.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
                CategoryEntity categoryEntity = (CategoryEntity) savedStateHandle.f("category");
                if (categoryEntity != null) {
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
                        homeVisitedSources = HomeVisitedSources.HOME_PAGE;
                    }
                    return new b(categoryEntity, num.intValue(), homeVisitedSources);
                }
                throw new IllegalArgumentException("Argument \"category\" is marked as non-null but was passed a null value");
            }
            throw new IllegalArgumentException("Required argument \"category\" is missing and does not have an android:defaultValue");
        }
    }

    public b(CategoryEntity category, int i11, HomeVisitedSources verticalSource) {
        o.i(category, "category");
        o.i(verticalSource, "verticalSource");
        this.f24980a = category;
        this.f24981b = i11;
        this.f24982c = verticalSource;
    }

    public static final b fromBundle(Bundle bundle) {
        return f24978d.a(bundle);
    }

    public final CategoryEntity a() {
        return this.f24980a;
    }

    public final int b() {
        return this.f24981b;
    }

    public final HomeVisitedSources c() {
        return this.f24982c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (o.d(this.f24980a, bVar.f24980a) && this.f24981b == bVar.f24981b && this.f24982c == bVar.f24982c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f24980a.hashCode() * 31) + Integer.hashCode(this.f24981b)) * 31) + this.f24982c.hashCode();
    }

    public String toString() {
        CategoryEntity categoryEntity = this.f24980a;
        int i11 = this.f24981b;
        HomeVisitedSources homeVisitedSources = this.f24982c;
        return "PropertyHomeFragmentArgs(category=" + categoryEntity + ", categoryId=" + i11 + ", verticalSource=" + homeVisitedSources + ")";
    }
}
