package com.forsale.app.features.more.buymoretoken.paymentoption;

import android.os.Bundle;
import android.os.Parcelable;
import com.forsale.app.datalayer.network.entities.PaymentOptionEntity;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import t9.r0;
import z3.n;
/* compiled from: PaymentOptionsFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final C0351b f31839a = new C0351b(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PaymentOptionsFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class a implements n {

        /* renamed from: a  reason: collision with root package name */
        private final PaymentOptionEntity f31840a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f31841b;

        /* renamed from: c  reason: collision with root package name */
        private final String f31842c;

        /* renamed from: d  reason: collision with root package name */
        private final int f31843d;

        public a(PaymentOptionEntity keyPaymentOptionEntity, boolean z11, String str) {
            o.i(keyPaymentOptionEntity, "keyPaymentOptionEntity");
            this.f31840a = keyPaymentOptionEntity;
            this.f31841b = z11;
            this.f31842c = str;
            this.f31843d = r0.V;
        }

        @Override // z3.n
        public int a() {
            return this.f31843d;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(PaymentOptionEntity.class)) {
                PaymentOptionEntity paymentOptionEntity = this.f31840a;
                o.g(paymentOptionEntity, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("key_payment_option_entity", paymentOptionEntity);
            } else if (Serializable.class.isAssignableFrom(PaymentOptionEntity.class)) {
                PaymentOptionEntity paymentOptionEntity2 = this.f31840a;
                o.g(paymentOptionEntity2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("key_payment_option_entity", (Serializable) paymentOptionEntity2);
            } else {
                String name = PaymentOptionEntity.class.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putBoolean("from_plf", this.f31841b);
            bundle.putString("plf_intention", this.f31842c);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (o.d(this.f31840a, aVar.f31840a) && this.f31841b == aVar.f31841b && o.d(this.f31842c, aVar.f31842c)) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f31840a.hashCode() * 31;
            boolean z11 = this.f31841b;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            int i12 = (hashCode2 + i11) * 31;
            String str = this.f31842c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return i12 + hashCode;
        }

        public String toString() {
            PaymentOptionEntity paymentOptionEntity = this.f31840a;
            boolean z11 = this.f31841b;
            String str = this.f31842c;
            return "ActionPaymentOptionsFragmentToBillingPackageFragment(keyPaymentOptionEntity=" + paymentOptionEntity + ", fromPlf=" + z11 + ", plfIntention=" + str + ")";
        }
    }

    /* compiled from: PaymentOptionsFragmentDirections.kt */
    /* renamed from: com.forsale.app.features.more.buymoretoken.paymentoption.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0351b {
        private C0351b() {
        }

        public /* synthetic */ C0351b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n a(PaymentOptionEntity keyPaymentOptionEntity, boolean z11, String str) {
            o.i(keyPaymentOptionEntity, "keyPaymentOptionEntity");
            return new a(keyPaymentOptionEntity, z11, str);
        }
    }
}
