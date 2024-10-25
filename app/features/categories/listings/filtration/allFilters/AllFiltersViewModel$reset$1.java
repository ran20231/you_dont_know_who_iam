package com.forsale.app.features.categories.listings.filtration.allFilters;

import com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AllFiltersViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel$reset$1", f = "AllFiltersViewModel.kt", l = {183, 185}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AllFiltersViewModel$reset$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f29040a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AllFiltersViewModel f29041b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllFiltersViewModel$reset$1(AllFiltersViewModel allFiltersViewModel, zz.a<? super AllFiltersViewModel$reset$1> aVar) {
        super(2, aVar);
        this.f29041b = allFiltersViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AllFiltersViewModel$reset$1(this.f29041b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object P0;
        MutableStateFlow mutableStateFlow;
        FiltersMediator filtersMediator;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f29040a;
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
            AllFiltersViewModel allFiltersViewModel = this.f29041b;
            this.f29040a = 1;
            P0 = allFiltersViewModel.P0(this);
            if (P0 == f11) {
                return f11;
            }
        }
        mutableStateFlow = this.f29041b.f29005t0;
        mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.a.a(true));
        filtersMediator = this.f29041b.f29003r0;
        if (filtersMediator != null) {
            this.f29040a = 2;
            if (filtersMediator.t(this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AllFiltersViewModel$reset$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
