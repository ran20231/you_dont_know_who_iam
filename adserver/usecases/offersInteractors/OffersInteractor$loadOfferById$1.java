package com.forsale.adserver.usecases.offersInteractors;

import com.forsale.adserver.datalayer.offersdata.OffersFactory;
import com.google.android.gms.common.ConnectionResult;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OffersInteractor.kt */
@d(c = "com.forsale.adserver.usecases.offersInteractors.OffersInteractor$loadOfferById$1", f = "OffersInteractor.kt", l = {ConnectionResult.API_DISABLED}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class OffersInteractor$loadOfferById$1 extends SuspendLambda implements p<CoroutineScope, a<? super g9.d>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f20828a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ OffersInteractor f20829b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f20830c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersInteractor$loadOfferById$1(OffersInteractor offersInteractor, int i11, a<? super OffersInteractor$loadOfferById$1> aVar) {
        super(2, aVar);
        this.f20829b = offersInteractor;
        this.f20830c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new OffersInteractor$loadOfferById$1(this.f20829b, this.f20830c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        OffersFactory offersFactory;
        f11 = b.f();
        int i11 = this.f20828a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            offersFactory = this.f20829b.f20809b;
            int i12 = this.f20830c;
            int b11 = this.f20829b.b();
            this.f20828a = 1;
            obj = offersFactory.g(i12, b11, this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super g9.d> aVar) {
        return ((OffersInteractor$loadOfferById$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
