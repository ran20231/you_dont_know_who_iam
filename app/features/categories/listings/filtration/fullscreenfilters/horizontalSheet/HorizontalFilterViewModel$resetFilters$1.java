package com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet;

import com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterViewModel;
import dc.c;
import g00.p;
import java.util.List;
import kotlin.collections.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HorizontalFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterViewModel$resetFilters$1", f = "HorizontalFilterViewModel.kt", l = {l8.a.f62268e, 94}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class HorizontalFilterViewModel$resetFilters$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f29696a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HorizontalFilterViewModel f29697b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalFilterViewModel$resetFilters$1(HorizontalFilterViewModel horizontalFilterViewModel, zz.a<? super HorizontalFilterViewModel$resetFilters$1> aVar) {
        super(2, aVar);
        this.f29697b = horizontalFilterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new HorizontalFilterViewModel$resetFilters$1(this.f29697b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Integer num;
        List<Integer> r11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f29696a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            MutableStateFlow<List<Integer>> H0 = this.f29697b.H0();
            c I0 = this.f29697b.I0();
            if (I0 != null) {
                num = kotlin.coroutines.jvm.internal.a.d(I0.e());
            } else {
                num = null;
            }
            r11 = r.r(num);
            this.f29696a = 1;
            if (H0.emit(r11, this) == f11) {
                return f11;
            }
        }
        MutableSharedFlow<HorizontalFilterViewModel.a> B0 = this.f29697b.B0();
        HorizontalFilterViewModel.a.b bVar = HorizontalFilterViewModel.a.b.f29690a;
        this.f29696a = 2;
        if (B0.emit(bVar, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((HorizontalFilterViewModel$resetFilters$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
