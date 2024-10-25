package com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet;

import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterViewModel;
import com.forsale.app.utils.analytics.listingfiltration.a;
import fc.c;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RangeFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterViewModel$applyFilters$1", f = "RangeFilterViewModel.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class RangeFilterViewModel$applyFilters$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f29936a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ RangeFilterViewModel f29937b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeFilterViewModel$applyFilters$1(RangeFilterViewModel rangeFilterViewModel, zz.a<? super RangeFilterViewModel$applyFilters$1> aVar) {
        super(2, aVar);
        this.f29937b = rangeFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new RangeFilterViewModel$applyFilters$1(this.f29937b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        a.c H0;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f29936a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            GetListingsBody.FiltrationData.Range a11 = this.f29937b.D0().a(this.f29937b.y0().c(), this.f29937b.B0().getValue(), this.f29937b.z0().getValue());
            H0 = this.f29937b.H0(a11);
            MutableSharedFlow<RangeFilterViewModel.a> x02 = this.f29937b.x0();
            RangeFilterViewModel.a.C0333a c0333a = new RangeFilterViewModel.a.C0333a(new c.b(a11, H0));
            this.f29936a = 1;
            if (x02.emit(c0333a, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((RangeFilterViewModel$applyFilters$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
