package com.forsale.app.features.categories.home.allverticals;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.k0;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource;
import com.forsale.app.utils.analytics.HomeVisitedSources;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: AllVerticalsFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class b implements z3.h {

    /* renamed from: d  reason: collision with root package name */
    public static final a f23785d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f23786e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final CategoryEntity f23787a;

    /* renamed from: b  reason: collision with root package name */
    private final HomeVisitedSources f23788b;

    /* renamed from: c  reason: collision with root package name */
    private final CategoryListingsAnalyticSource f23789c;

    /* compiled from: AllVerticalsFragmentArgs.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(Bundle bundle) {
            HomeVisitedSources homeVisitedSources;
            CategoryListingsAnalyticSource categoryListingsAnalyticSource;
            o.i(bundle, "bundle");
            bundle.setClassLoader(b.class.getClassLoader());
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
                    if (bundle.containsKey("analyticSource")) {
                        if (!Parcelable.class.isAssignableFrom(CategoryListingsAnalyticSource.class) && !Serializable.class.isAssignableFrom(CategoryListingsAnalyticSource.class)) {
                            String name3 = CategoryListingsAnalyticSource.class.getName();
                            throw new UnsupportedOperationException(name3 + " must implement Parcelable or Serializable or must be an Enum.");
                        }
                        categoryListingsAnalyticSource = (CategoryListingsAnalyticSource) bundle.get("analyticSource");
                    } else {
                        categoryListingsAnalyticSource = null;
                    }
                    return new b(categoryEntity, homeVisitedSources, categoryListingsAnalyticSource);
                }
                throw new IllegalArgumentException("Argument \"category\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Required argument \"category\" is missing and does not have an android:defaultValue");
        }

        public final b b(k0 savedStateHandle) {
            HomeVisitedSources homeVisitedSources;
            CategoryListingsAnalyticSource categoryListingsAnalyticSource;
            o.i(savedStateHandle, "savedStateHandle");
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
                    if (savedStateHandle.e("analyticSource")) {
                        if (!Parcelable.class.isAssignableFrom(CategoryListingsAnalyticSource.class) && !Serializable.class.isAssignableFrom(CategoryListingsAnalyticSource.class)) {
                            String name3 = CategoryListingsAnalyticSource.class.getName();
                            throw new UnsupportedOperationException(name3 + " must implement Parcelable or Serializable or must be an Enum.");
                        }
                        categoryListingsAnalyticSource = (CategoryListingsAnalyticSource) savedStateHandle.f("analyticSource");
                    } else {
                        categoryListingsAnalyticSource = null;
                    }
                    return new b(categoryEntity, homeVisitedSources, categoryListingsAnalyticSource);
                }
                throw new IllegalArgumentException("Argument \"category\" is marked as non-null but was passed a null value");
            }
            throw new IllegalArgumentException("Required argument \"category\" is missing and does not have an android:defaultValue");
        }
    }

    public b(CategoryEntity category, HomeVisitedSources verticalSource, CategoryListingsAnalyticSource categoryListingsAnalyticSource) {
        o.i(category, "category");
        o.i(verticalSource, "verticalSource");
        this.f23787a = category;
        this.f23788b = verticalSource;
        this.f23789c = categoryListingsAnalyticSource;
    }

    public static final b fromBundle(Bundle bundle) {
        return f23785d.a(bundle);
    }

    public final CategoryListingsAnalyticSource a() {
        return this.f23789c;
    }

    public final CategoryEntity b() {
        return this.f23787a;
    }

    public final HomeVisitedSources c() {
        return this.f23788b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (o.d(this.f23787a, bVar.f23787a) && this.f23788b == bVar.f23788b && o.d(this.f23789c, bVar.f23789c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f23787a.hashCode() * 31) + this.f23788b.hashCode()) * 31;
        CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.f23789c;
        if (categoryListingsAnalyticSource == null) {
            hashCode = 0;
        } else {
            hashCode = categoryListingsAnalyticSource.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        CategoryEntity categoryEntity = this.f23787a;
        HomeVisitedSources homeVisitedSources = this.f23788b;
        CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.f23789c;
        return "AllVerticalsFragmentArgs(category=" + categoryEntity + ", verticalSource=" + homeVisitedSources + ", analyticSource=" + categoryListingsAnalyticSource + ")";
    }
}
