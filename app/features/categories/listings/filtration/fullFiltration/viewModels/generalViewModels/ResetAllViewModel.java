package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels;

import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.repositories.FiltersRepository;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import wz.p;
/* compiled from: ResetAllViewModel.kt */
/* loaded from: classes2.dex */
public final class ResetAllViewModel extends FilterViewModel {

    /* renamed from: x  reason: collision with root package name */
    private final CoroutineScope f29565x;

    /* renamed from: y  reason: collision with root package name */
    private final MutableSharedFlow<Triple<FilterViewModel<?, ?, ?>, a, Integer>> f29566y;

    /* renamed from: z  reason: collision with root package name */
    private final StateFlow<Boolean> f29567z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetAllViewModel(CoroutineScope cs2, FiltersMediator mediator, FiltersRepository filtersRepository, MutableSharedFlow<Triple<FilterViewModel<?, ?, ?>, a, Integer>> onFilterClicked) {
        super(cs2, new ListingsResponse.UISettings.FiltrationSetting(null, null, null, null, null, null, null, null, null, null, null, 2047, null), mediator, filtersRepository, null, false, onFilterClicked);
        o.i(cs2, "cs");
        o.i(mediator, "mediator");
        o.i(filtersRepository, "filtersRepository");
        o.i(onFilterClicked, "onFilterClicked");
        this.f29565x = cs2;
        this.f29566y = onFilterClicked;
        final StateFlow<Integer> l11 = mediator.l();
        this.f29567z = FlowKt.stateIn(new Flow<Boolean>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.ResetAllViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.ResetAllViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f29570a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ ResetAllViewModel f29571b;

                /* compiled from: Emitters.kt */
                @d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.ResetAllViewModel$special$$inlined$map$1$2", f = "ResetAllViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.ResetAllViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f29572a;

                    /* renamed from: b  reason: collision with root package name */
                    int f29573b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f29572a = obj;
                        this.f29573b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, ResetAllViewModel resetAllViewModel) {
                    this.f29570a = flowCollector;
                    this.f29571b = resetAllViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, zz.a r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.ResetAllViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.ResetAllViewModel$special$$inlined$map$1$2$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.ResetAllViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f29573b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f29573b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.ResetAllViewModel$special$$inlined$map$1$2$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.ResetAllViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f29572a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f29573b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L56
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f29570a
                        java.lang.Number r5 = (java.lang.Number) r5
                        int r5 = r5.intValue()
                        com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.ResetAllViewModel r2 = r4.f29571b
                        boolean r2 = r2.t()
                        if (r2 != 0) goto L48
                        if (r5 <= 0) goto L48
                        r5 = r3
                        goto L49
                    L48:
                        r5 = 0
                    L49:
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
                        r0.f29573b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L56
                        return r1
                    L56:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.ResetAllViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), aVar);
                f11 = b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        }, cs2, SharingStarted.Companion.getEagerly(), Boolean.FALSE);
    }

    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    public void J(int i11) {
        BuildersKt__Builders_commonKt.launch$default(this.f29565x, null, null, new ResetAllViewModel$onFilterClicked$1(this, null), 3, null);
    }

    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    public Object S(zz.a<? super p> aVar) {
        return p.f75480a;
    }

    public final StateFlow<Boolean> c0() {
        return this.f29567z;
    }
}
