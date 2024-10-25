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
/* compiled from: LoadOffersInteractor.kt */
@d(c = "com.forsale.adserver.usecases.offersInteractors.LoadOffersInteractor$invoke$2", f = "LoadOffersInteractor.kt", l = {35}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LoadOffersInteractor$invoke$2 extends SuspendLambda implements l<a<? super List<? extends g9.d>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f20800a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LoadOffersInteractor f20801b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Integer f20802c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f20803d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadOffersInteractor$invoke$2(LoadOffersInteractor loadOffersInteractor, Integer num, int i11, a<? super LoadOffersInteractor$invoke$2> aVar) {
        super(1, aVar);
        this.f20801b = loadOffersInteractor;
        this.f20802c = num;
        this.f20803d = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(a<?> aVar) {
        return new LoadOffersInteractor$invoke$2(this.f20801b, this.f20802c, this.f20803d, aVar);
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
        int i11 = this.f20800a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            offersFactory = this.f20801b.f20794a;
            Integer num = this.f20802c;
            int i12 = this.f20803d;
            this.f20800a = 1;
            obj = offersFactory.c(num, i12, this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(a<? super List<g9.d>> aVar) {
        return ((LoadOffersInteractor$invoke$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
