package com.forsale.app.ui.bottomsheets.wanteditems;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.k0;
import com.forsale.app.datalayer.network.responses.ItemSubscriptionResponse;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: DeleteWantedItemBottomSheetArgs.kt */
/* loaded from: classes3.dex */
public final class f implements z3.h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39287b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f39288c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final ItemSubscriptionResponse f39289a;

    /* compiled from: DeleteWantedItemBottomSheetArgs.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(Bundle bundle) {
            o.i(bundle, "bundle");
            bundle.setClassLoader(f.class.getClassLoader());
            if (bundle.containsKey("itemSubscription")) {
                if (!Parcelable.class.isAssignableFrom(ItemSubscriptionResponse.class) && !Serializable.class.isAssignableFrom(ItemSubscriptionResponse.class)) {
                    String name = ItemSubscriptionResponse.class.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
                ItemSubscriptionResponse itemSubscriptionResponse = (ItemSubscriptionResponse) bundle.get("itemSubscription");
                if (itemSubscriptionResponse != null) {
                    return new f(itemSubscriptionResponse);
                }
                throw new IllegalArgumentException("Argument \"itemSubscription\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Required argument \"itemSubscription\" is missing and does not have an android:defaultValue");
        }

        public final f b(k0 savedStateHandle) {
            o.i(savedStateHandle, "savedStateHandle");
            if (savedStateHandle.e("itemSubscription")) {
                if (!Parcelable.class.isAssignableFrom(ItemSubscriptionResponse.class) && !Serializable.class.isAssignableFrom(ItemSubscriptionResponse.class)) {
                    String name = ItemSubscriptionResponse.class.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
                ItemSubscriptionResponse itemSubscriptionResponse = (ItemSubscriptionResponse) savedStateHandle.f("itemSubscription");
                if (itemSubscriptionResponse != null) {
                    return new f(itemSubscriptionResponse);
                }
                throw new IllegalArgumentException("Argument \"itemSubscription\" is marked as non-null but was passed a null value");
            }
            throw new IllegalArgumentException("Required argument \"itemSubscription\" is missing and does not have an android:defaultValue");
        }
    }

    public f(ItemSubscriptionResponse itemSubscription) {
        o.i(itemSubscription, "itemSubscription");
        this.f39289a = itemSubscription;
    }

    public static final f fromBundle(Bundle bundle) {
        return f39287b.a(bundle);
    }

    public final ItemSubscriptionResponse a() {
        return this.f39289a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && o.d(this.f39289a, ((f) obj).f39289a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f39289a.hashCode();
    }

    public String toString() {
        ItemSubscriptionResponse itemSubscriptionResponse = this.f39289a;
        return "DeleteWantedItemBottomSheetArgs(itemSubscription=" + itemSubscriptionResponse + ")";
    }
}
