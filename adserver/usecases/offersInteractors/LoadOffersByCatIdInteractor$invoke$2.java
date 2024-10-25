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
@d(c = "com.forsale.adserver.usecases.offersInteractors.LoadOffersByCatIdInteractor$invoke$2", f = "LoadOffersByCatIdInteractor.kt", l = {19}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LoadOffersByCatIdInteractor$invoke$2 extends SuspendLambda implements l<a<? super List<? extends g9.d>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f20779a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LoadOffersByCatIdInteractor f20780b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Integer f20781c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f20782d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadOffersByCatIdInteractor$invoke$2(LoadOffersByCatIdInteractor loadOffersByCatIdInteractor, Integer num, int i11, a<? super LoadOffersByCatIdInteractor$invoke$2> aVar) {
        super(1, aVar);
        this.f20780b = loadOffersByCatIdInteractor;
        this.f20781c = num;
        this.f20782d = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(a<?> aVar) {
        return new LoadOffersByCatIdInteractor$invoke$2(this.f20780b, this.f20781c, this.f20782d, aVar);
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
        int i11 = this.f20779a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            offersFactory = this.f20780b.f20771a;
            Integer num = this.f20781c;
            int i12 = this.f20782d;
            this.f20779a = 1;
            obj = offersFactory.c(num, i12, this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(a<? super List<g9.d>> aVar) {
        return ((LoadOffersByCatIdInteractor$invoke$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
