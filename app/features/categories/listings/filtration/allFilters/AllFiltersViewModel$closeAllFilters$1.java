package com.forsale.app.features.categories.listings.filtration.allFilters;

import com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AllFiltersViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel$closeAllFilters$1", f = "AllFiltersViewModel.kt", l = {162}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AllFiltersViewModel$closeAllFilters$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f29021a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AllFiltersViewModel f29022b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllFiltersViewModel$closeAllFilters$1(AllFiltersViewModel allFiltersViewModel, zz.a<? super AllFiltersViewModel$closeAllFilters$1> aVar) {
        super(2, aVar);
        this.f29022b = allFiltersViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AllFiltersViewModel$closeAllFilters$1(this.f29022b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f29021a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            MutableSharedFlow<AllFiltersViewModel.a> D0 = this.f29022b.D0();
            mutableStateFlow = this.f29022b.f29005t0;
            AllFiltersViewModel.a.b bVar = new AllFiltersViewModel.a.b(((Boolean) mutableStateFlow.getValue()).booleanValue());
            this.f29021a = 1;
            if (D0.emit(bVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AllFiltersViewModel$closeAllFilters$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
