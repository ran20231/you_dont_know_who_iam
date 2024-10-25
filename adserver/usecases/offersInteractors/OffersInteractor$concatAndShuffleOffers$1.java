package com.forsale.adserver.usecases.offersInteractors;

import g00.p;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OffersInteractor.kt */
@d(c = "com.forsale.adserver.usecases.offersInteractors.OffersInteractor$concatAndShuffleOffers$1", f = "OffersInteractor.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class OffersInteractor$concatAndShuffleOffers$1 extends SuspendLambda implements p<CoroutineScope, a<? super List<? extends g9.d>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f20811a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ OffersInteractor f20812b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Integer f20813c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ List<g9.d> f20814d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersInteractor$concatAndShuffleOffers$1(OffersInteractor offersInteractor, Integer num, List<g9.d> list, a<? super OffersInteractor$concatAndShuffleOffers$1> aVar) {
        super(2, aVar);
        this.f20812b = offersInteractor;
        this.f20813c = num;
        this.f20814d = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new OffersInteractor$concatAndShuffleOffers$1(this.f20812b, this.f20813c, this.f20814d, aVar);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, a<? super List<? extends g9.d>> aVar) {
        return invoke2(coroutineScope, (a<? super List<g9.d>>) aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        List o11;
        List f12;
        List E0;
        f11 = b.f();
        int i11 = this.f20811a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            OffersInteractor offersInteractor = this.f20812b;
            Integer num = this.f20813c;
            this.f20811a = 1;
            obj = offersInteractor.p(num, this);
            if (obj == f11) {
                return f11;
            }
        }
        List list = (List) obj;
        List list2 = list;
        o11 = this.f20812b.o(this.f20814d, list);
        f12 = q.f(o11);
        E0 = CollectionsKt___CollectionsKt.E0(list2, f12);
        return E0;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, a<? super List<g9.d>> aVar) {
        return ((OffersInteractor$concatAndShuffleOffers$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
