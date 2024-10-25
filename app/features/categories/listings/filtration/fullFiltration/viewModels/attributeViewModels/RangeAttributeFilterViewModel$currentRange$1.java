package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels;

import g00.q;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import wz.p;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RangeAttributeFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel$currentRange$1", f = "RangeAttributeFilterViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class RangeAttributeFilterViewModel$currentRange$1 extends SuspendLambda implements q<Integer, Integer, a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f29370a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f29371b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f29372c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ RangeAttributeFilterViewModel f29373d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeAttributeFilterViewModel$currentRange$1(RangeAttributeFilterViewModel rangeAttributeFilterViewModel, a<? super RangeAttributeFilterViewModel$currentRange$1> aVar) {
        super(3, aVar);
        this.f29373d = rangeAttributeFilterViewModel;
    }

    @Override // g00.q
    /* renamed from: b */
    public final Object invoke(Integer num, Integer num2, a<? super p> aVar) {
        RangeAttributeFilterViewModel$currentRange$1 rangeAttributeFilterViewModel$currentRange$1 = new RangeAttributeFilterViewModel$currentRange$1(this.f29373d, aVar);
        rangeAttributeFilterViewModel$currentRange$1.f29371b = num;
        rangeAttributeFilterViewModel$currentRange$1.f29372c = num2;
        return rangeAttributeFilterViewModel$currentRange$1.invokeSuspend(p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.f();
        if (this.f29370a == 0) {
            f.b(obj);
            this.f29373d.l0((Integer) this.f29371b, (Integer) this.f29372c);
            return p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
