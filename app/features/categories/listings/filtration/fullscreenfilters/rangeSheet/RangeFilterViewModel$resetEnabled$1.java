package com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet;

import g00.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import wz.p;
/* compiled from: RangeFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterViewModel$resetEnabled$1", f = "RangeFilterViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RangeFilterViewModel$resetEnabled$1 extends SuspendLambda implements q<Integer, Integer, zz.a<? super Boolean>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f29938a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f29939b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f29940c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RangeFilterViewModel$resetEnabled$1(zz.a<? super RangeFilterViewModel$resetEnabled$1> aVar) {
        super(3, aVar);
    }

    @Override // g00.q
    /* renamed from: b */
    public final Object invoke(Integer num, Integer num2, zz.a<? super Boolean> aVar) {
        RangeFilterViewModel$resetEnabled$1 rangeFilterViewModel$resetEnabled$1 = new RangeFilterViewModel$resetEnabled$1(aVar);
        rangeFilterViewModel$resetEnabled$1.f29939b = num;
        rangeFilterViewModel$resetEnabled$1.f29940c = num2;
        return rangeFilterViewModel$resetEnabled$1.invokeSuspend(p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f29938a == 0) {
            f.b(obj);
            Integer num = (Integer) this.f29939b;
            Integer num2 = (Integer) this.f29940c;
            if (num == null && num2 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            return kotlin.coroutines.jvm.internal.a.a(z11);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
