package com.forsale.adserver.usecases.offersInteractors;

import com.forsale.adserver.datalayer.offersdata.OffersFactory;
import g00.p;
import java.util.List;
import kotlin.collections.q;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OffersInteractor.kt */
@d(c = "com.forsale.adserver.usecases.offersInteractors.OffersInteractor$loadAllFeaturedOffers$1", f = "OffersInteractor.kt", l = {31}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class OffersInteractor$loadAllFeaturedOffers$1 extends SuspendLambda implements p<CoroutineScope, a<? super List<? extends g9.d>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f20815a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ OffersInteractor f20816b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersInteractor$loadAllFeaturedOffers$1(OffersInteractor offersInteractor, a<? super OffersInteractor$loadAllFeaturedOffers$1> aVar) {
        super(2, aVar);
        this.f20816b = offersInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new OffersInteractor$loadAllFeaturedOffers$1(this.f20816b, aVar);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, a<? super List<? extends g9.d>> aVar) {
        return invoke2(coroutineScope, (a<? super List<g9.d>>) aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        OffersFactory offersFactory;
        List f12;
        f11 = b.f();
        int i11 = this.f20815a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            offersFactory = this.f20816b.f20809b;
            this.f20815a = 1;
            obj = offersFactory.a(this);
            if (obj == f11) {
                return f11;
            }
        }
        f12 = q.f((Iterable) obj);
        return f12;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, a<? super List<g9.d>> aVar) {
        return ((OffersInteractor$loadAllFeaturedOffers$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
