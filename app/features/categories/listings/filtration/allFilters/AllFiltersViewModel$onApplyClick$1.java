package com.forsale.app.features.categories.listings.filtration.allFilters;

import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AllFiltersViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel$onApplyClick$1", f = "AllFiltersViewModel.kt", l = {130, 132}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AllFiltersViewModel$onApplyClick$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f29028a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AllFiltersViewModel f29029b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllFiltersViewModel$onApplyClick$1(AllFiltersViewModel allFiltersViewModel, zz.a<? super AllFiltersViewModel$onApplyClick$1> aVar) {
        super(2, aVar);
        this.f29029b = allFiltersViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AllFiltersViewModel$onApplyClick$1(this.f29029b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object N0;
        FiltersMediator filtersMediator;
        GetListingsBody.FiltrationData filtrationData;
        GetListingsBody.FiltrationData filtrationData2;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f29028a;
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
            AllFiltersViewModel allFiltersViewModel = this.f29029b;
            this.f29028a = 1;
            N0 = allFiltersViewModel.N0(this);
            if (N0 == f11) {
                return f11;
            }
        }
        filtersMediator = this.f29029b.f29003r0;
        if (filtersMediator != null) {
            filtrationData = filtersMediator.j();
        } else {
            filtrationData = null;
        }
        MutableSharedFlow<AllFiltersViewModel.a> D0 = this.f29029b.D0();
        if (filtrationData == null) {
            filtrationData2 = new GetListingsBody.FiltrationData(null, null, null, null, null, 31, null);
        } else {
            filtrationData2 = filtrationData;
        }
        AllFiltersViewModel.a.C0316a c0316a = new AllFiltersViewModel.a.C0316a(filtrationData2, !GetListingsBody.FiltrationData.Companion.equal(filtrationData, this.f29029b.E0().c()));
        this.f29028a = 2;
        if (D0.emit(c0316a, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AllFiltersViewModel$onApplyClick$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
