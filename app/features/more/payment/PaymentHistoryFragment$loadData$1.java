package com.forsale.app.features.more.payment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.s;
import androidx.paging.PagedList;
import com.forsale.app.datalayer.network.entities.PaymentHistoryEntity;
import com.forsale.app.utils.CoroutinesExtensionsKt;
import de.h;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import wz.e;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PaymentHistoryFragment.kt */
@d(c = "com.forsale.app.features.more.payment.PaymentHistoryFragment$loadData$1", f = "PaymentHistoryFragment.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PaymentHistoryFragment$loadData$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32762a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f32763b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PaymentHistoryFragment f32764c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PaymentHistoryFragment.kt */
    @d(c = "com.forsale.app.features.more.payment.PaymentHistoryFragment$loadData$1$1", f = "PaymentHistoryFragment.kt", l = {60}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.more.payment.PaymentHistoryFragment$loadData$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32765a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PaymentHistoryFragment f32766b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PaymentHistoryFragment.kt */
        /* renamed from: com.forsale.app.features.more.payment.PaymentHistoryFragment$loadData$1$1$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class a implements c0, k {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f32767a;

            a(h hVar) {
                this.f32767a = hVar;
            }

            @Override // androidx.lifecycle.c0
            /* renamed from: a */
            public final void onChanged(PagedList<PaymentHistoryEntity.PaymentRecord> pagedList) {
                this.f32767a.f(pagedList);
            }

            @Override // kotlin.jvm.internal.k
            public final e<?> c() {
                return new FunctionReferenceImpl(1, this.f32767a, h.class, "submitList", "submitList(Landroidx/paging/PagedList;)V", 0);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof c0) || !(obj instanceof k)) {
                    return false;
                }
                return o.d(c(), ((k) obj).c());
            }

            public final int hashCode() {
                return c().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PaymentHistoryFragment paymentHistoryFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f32766b = paymentHistoryFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f32766b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            h S;
            f11 = b.f();
            int i11 = this.f32765a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                PaymentHistoryViewModel B = this.f32766b.B();
                this.f32765a = 1;
                obj = B.A0(this);
                if (obj == f11) {
                    return f11;
                }
            }
            s viewLifecycleOwner = this.f32766b.getViewLifecycleOwner();
            S = this.f32766b.S();
            ((LiveData) obj).observe(viewLifecycleOwner, new a(S));
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentHistoryFragment$loadData$1(PaymentHistoryFragment paymentHistoryFragment, a<? super PaymentHistoryFragment$loadData$1> aVar) {
        super(2, aVar);
        this.f32764c = paymentHistoryFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        PaymentHistoryFragment$loadData$1 paymentHistoryFragment$loadData$1 = new PaymentHistoryFragment$loadData$1(this.f32764c, aVar);
        paymentHistoryFragment$loadData$1.f32763b = obj;
        return paymentHistoryFragment$loadData$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f32762a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f32764c, null);
            this.f32762a = 1;
            if (CoroutinesExtensionsKt.a((CoroutineScope) this.f32763b, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((PaymentHistoryFragment$loadData$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
