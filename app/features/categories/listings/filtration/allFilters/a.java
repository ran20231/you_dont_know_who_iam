package com.forsale.app.features.categories.listings.filtration.allFilters;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.k0;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.AllFiltersPayload;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import z3.h;
/* compiled from: AllFiltersDialogFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class a implements h {

    /* renamed from: b  reason: collision with root package name */
    public static final C0317a f29047b = new C0317a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f29048c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final AllFiltersPayload f29049a;

    /* compiled from: AllFiltersDialogFragmentArgs.kt */
    /* renamed from: com.forsale.app.features.categories.listings.filtration.allFilters.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0317a {
        private C0317a() {
        }

        public /* synthetic */ C0317a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(Bundle bundle) {
            o.i(bundle, "bundle");
            bundle.setClassLoader(a.class.getClassLoader());
            if (bundle.containsKey("filterPayload")) {
                if (!Parcelable.class.isAssignableFrom(AllFiltersPayload.class) && !Serializable.class.isAssignableFrom(AllFiltersPayload.class)) {
                    String name = AllFiltersPayload.class.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
                AllFiltersPayload allFiltersPayload = (AllFiltersPayload) bundle.get("filterPayload");
                if (allFiltersPayload != null) {
                    return new a(allFiltersPayload);
                }
                throw new IllegalArgumentException("Argument \"filterPayload\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Required argument \"filterPayload\" is missing and does not have an android:defaultValue");
        }

        public final a b(k0 savedStateHandle) {
            o.i(savedStateHandle, "savedStateHandle");
            if (savedStateHandle.e("filterPayload")) {
                if (!Parcelable.class.isAssignableFrom(AllFiltersPayload.class) && !Serializable.class.isAssignableFrom(AllFiltersPayload.class)) {
                    String name = AllFiltersPayload.class.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
                AllFiltersPayload allFiltersPayload = (AllFiltersPayload) savedStateHandle.f("filterPayload");
                if (allFiltersPayload != null) {
                    return new a(allFiltersPayload);
                }
                throw new IllegalArgumentException("Argument \"filterPayload\" is marked as non-null but was passed a null value");
            }
            throw new IllegalArgumentException("Required argument \"filterPayload\" is missing and does not have an android:defaultValue");
        }
    }

    public a(AllFiltersPayload filterPayload) {
        o.i(filterPayload, "filterPayload");
        this.f29049a = filterPayload;
    }

    public static final a fromBundle(Bundle bundle) {
        return f29047b.a(bundle);
    }

    public final AllFiltersPayload a() {
        return this.f29049a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && o.d(this.f29049a, ((a) obj).f29049a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f29049a.hashCode();
    }

    public String toString() {
        AllFiltersPayload allFiltersPayload = this.f29049a;
        return "AllFiltersDialogFragmentArgs(filterPayload=" + allFiltersPayload + ")";
    }
}
