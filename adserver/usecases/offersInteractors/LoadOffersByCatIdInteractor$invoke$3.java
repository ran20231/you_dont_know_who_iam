package com.forsale.adserver.usecases.offersInteractors;

import com.forsale.adserver.datalayer.offersdata.OffersFactory;
import g00.l;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import wz.p;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoadOffersByCatIdInteractor.kt */
@d(c = "com.forsale.adserver.usecases.offersInteractors.LoadOffersByCatIdInteractor$invoke$3", f = "LoadOffersByCatIdInteractor.kt", l = {20}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LoadOffersByCatIdInteractor$invoke$3 extends SuspendLambda implements l<a<? super List<? extends g9.d>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f20783a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LoadOffersByCatIdInteractor f20784b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<Integer> f20785c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Integer f20786d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f20787e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadOffersByCatIdInteractor$invoke$3(LoadOffersByCatIdInteractor loadOffersByCatIdInteractor, List<Integer> list, Integer num, int i11, a<? super LoadOffersByCatIdInteractor$invoke$3> aVar) {
        super(1, aVar);
        this.f20784b = loadOffersByCatIdInteractor;
        this.f20785c = list;
        this.f20786d = num;
        this.f20787e = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(a<?> aVar) {
        return new LoadOffersByCatIdInteractor$invoke$3(this.f20784b, this.f20785c, this.f20786d, this.f20787e, aVar);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ Object invoke(a<? super List<? extends g9.d>> aVar) {
        return invoke2((a<? super List<g9.d>>) aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        OffersFactory offersFactory;
        f11 = b.f();
        int i11 = this.f20783a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            offersFactory = this.f20784b.f20771a;
            List<Integer> list = this.f20785c;
            Integer num = this.f20786d;
            int i12 = this.f20787e;
            this.f20783a = 1;
            obj = offersFactory.l(list, num, i12, this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(a<? super List<g9.d>> aVar) {
        return ((LoadOffersByCatIdInteractor$invoke$3) create(aVar)).invokeSuspend(p.f75480a);
    }
}
