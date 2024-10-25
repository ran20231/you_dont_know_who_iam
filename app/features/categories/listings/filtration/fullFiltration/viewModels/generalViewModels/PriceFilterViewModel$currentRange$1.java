package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels;

import g00.q;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import wz.p;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PriceFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$currentRange$1", f = "PriceFilterViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PriceFilterViewModel$currentRange$1 extends SuspendLambda implements q<Integer, Integer, a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f29550a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f29551b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f29552c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PriceFilterViewModel f29553d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceFilterViewModel$currentRange$1(PriceFilterViewModel priceFilterViewModel, a<? super PriceFilterViewModel$currentRange$1> aVar) {
        super(3, aVar);
        this.f29553d = priceFilterViewModel;
    }

    @Override // g00.q
    /* renamed from: b */
    public final Object invoke(Integer num, Integer num2, a<? super p> aVar) {
        PriceFilterViewModel$currentRange$1 priceFilterViewModel$currentRange$1 = new PriceFilterViewModel$currentRange$1(this.f29553d, aVar);
        priceFilterViewModel$currentRange$1.f29551b = num;
        priceFilterViewModel$currentRange$1.f29552c = num2;
        return priceFilterViewModel$currentRange$1.invokeSuspend(p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.f();
        if (this.f29550a == 0) {
            f.b(obj);
            this.f29553d.m0((Integer) this.f29551b, (Integer) this.f29552c);
            return p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
