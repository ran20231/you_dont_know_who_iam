package com.forsale.app.features.more.buymoretoken.billingpackage;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.k0;
import com.forsale.app.datalayer.network.entities.PaymentOptionEntity;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: BillingPackageFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class a implements z3.h {

    /* renamed from: d  reason: collision with root package name */
    public static final C0347a f31766d = new C0347a(null);

    /* renamed from: a  reason: collision with root package name */
    private final PaymentOptionEntity f31767a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f31768b;

    /* renamed from: c  reason: collision with root package name */
    private final String f31769c;

    /* compiled from: BillingPackageFragmentArgs.kt */
    /* renamed from: com.forsale.app.features.more.buymoretoken.billingpackage.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0347a {
        private C0347a() {
        }

        public /* synthetic */ C0347a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(Bundle bundle) {
            boolean z11;
            String str;
            o.i(bundle, "bundle");
            bundle.setClassLoader(a.class.getClassLoader());
            if (bundle.containsKey("key_payment_option_entity")) {
                if (!Parcelable.class.isAssignableFrom(PaymentOptionEntity.class) && !Serializable.class.isAssignableFrom(PaymentOptionEntity.class)) {
                    String name = PaymentOptionEntity.class.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
                PaymentOptionEntity paymentOptionEntity = (PaymentOptionEntity) bundle.get("key_payment_option_entity");
                if (paymentOptionEntity != null) {
                    if (bundle.containsKey("from_plf")) {
                        z11 = bundle.getBoolean("from_plf");
                    } else {
                        z11 = false;
                    }
                    if (bundle.containsKey("plf_intention")) {
                        str = bundle.getString("plf_intention");
                    } else {
                        str = null;
                    }
                    return new a(paymentOptionEntity, z11, str);
                }
                throw new IllegalArgumentException("Argument \"key_payment_option_entity\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Required argument \"key_payment_option_entity\" is missing and does not have an android:defaultValue");
        }

        public final a b(k0 savedStateHandle) {
            Boolean bool;
            String str;
            o.i(savedStateHandle, "savedStateHandle");
            if (savedStateHandle.e("key_payment_option_entity")) {
                if (!Parcelable.class.isAssignableFrom(PaymentOptionEntity.class) && !Serializable.class.isAssignableFrom(PaymentOptionEntity.class)) {
                    String name = PaymentOptionEntity.class.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
                PaymentOptionEntity paymentOptionEntity = (PaymentOptionEntity) savedStateHandle.f("key_payment_option_entity");
                if (paymentOptionEntity != null) {
                    if (savedStateHandle.e("from_plf")) {
                        bool = (Boolean) savedStateHandle.f("from_plf");
                        if (bool == null) {
                            throw new IllegalArgumentException("Argument \"from_plf\" of type boolean does not support null values");
                        }
                    } else {
                        bool = Boolean.FALSE;
                    }
                    if (savedStateHandle.e("plf_intention")) {
                        str = (String) savedStateHandle.f("plf_intention");
                    } else {
                        str = null;
                    }
                    return new a(paymentOptionEntity, bool.booleanValue(), str);
                }
                throw new IllegalArgumentException("Argument \"key_payment_option_entity\" is marked as non-null but was passed a null value");
            }
            throw new IllegalArgumentException("Required argument \"key_payment_option_entity\" is missing and does not have an android:defaultValue");
        }
    }

    public a(PaymentOptionEntity keyPaymentOptionEntity, boolean z11, String str) {
        o.i(keyPaymentOptionEntity, "keyPaymentOptionEntity");
        this.f31767a = keyPaymentOptionEntity;
        this.f31768b = z11;
        this.f31769c = str;
    }

    public static final a fromBundle(Bundle bundle) {
        return f31766d.a(bundle);
    }

    public final boolean a() {
        return this.f31768b;
    }

    public final PaymentOptionEntity b() {
        return this.f31767a;
    }

    public final String c() {
        return this.f31769c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (o.d(this.f31767a, aVar.f31767a) && this.f31768b == aVar.f31768b && o.d(this.f31769c, aVar.f31769c)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f31767a.hashCode() * 31;
        boolean z11 = this.f31768b;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode2 + i11) * 31;
        String str = this.f31769c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i12 + hashCode;
    }

    public String toString() {
        PaymentOptionEntity paymentOptionEntity = this.f31767a;
        boolean z11 = this.f31768b;
        String str = this.f31769c;
        return "BillingPackageFragmentArgs(keyPaymentOptionEntity=" + paymentOptionEntity + ", fromPlf=" + z11 + ", plfIntention=" + str + ")";
    }
}
