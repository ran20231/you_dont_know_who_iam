package com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet;

import dc.c;
import g00.p;
import java.util.List;
import kotlin.collections.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* compiled from: SelectableFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterViewModel$resetFilters$1", f = "SelectableFilterViewModel.kt", l = {206}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SelectableFilterViewModel$resetFilters$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f30059a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SelectableFilterViewModel f30060b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectableFilterViewModel$resetFilters$1(SelectableFilterViewModel selectableFilterViewModel, zz.a<? super SelectableFilterViewModel$resetFilters$1> aVar) {
        super(2, aVar);
        this.f30060b = selectableFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SelectableFilterViewModel$resetFilters$1(this.f30060b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Integer num;
        List<Integer> r11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f30059a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            MutableStateFlow<List<Integer>> N0 = this.f30060b.N0();
            c P0 = this.f30060b.P0();
            if (P0 != null) {
                num = kotlin.coroutines.jvm.internal.a.d(P0.e());
            } else {
                num = null;
            }
            r11 = r.r(num);
            this.f30059a = 1;
            if (N0.emit(r11, this) == f11) {
                return f11;
            }
        }
        this.f30060b.J0().setValue(kotlin.coroutines.jvm.internal.a.a(true));
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SelectableFilterViewModel$resetFilters$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
