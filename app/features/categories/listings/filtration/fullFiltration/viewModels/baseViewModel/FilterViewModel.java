package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import androidx.lifecycle.z;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.repositories.FiltersRepository;
import com.forsale.app.features.categories.listings.filtration.full.filterModels.ParentGroupModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterScreenTypes;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterViewType;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.commonViewModelsHandlers.SelectableHandler;
import dc.e;
import fc.b;
import fc.c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.d;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import wz.h;
import wz.p;
/* compiled from: FilterViewModel.kt */
/* loaded from: classes2.dex */
public abstract class FilterViewModel<FD, FR, E> {

    /* renamed from: a */
    private final CoroutineScope f29386a;

    /* renamed from: b */
    private final ListingsResponse.UISettings.FiltrationSetting f29387b;

    /* renamed from: c */
    private final FiltersMediator f29388c;

    /* renamed from: d */
    private final FiltersRepository f29389d;

    /* renamed from: e */
    private final boolean f29390e;

    /* renamed from: f */
    private final MutableSharedFlow<Triple<FilterViewModel<?, ?, ?>, a, Integer>> f29391f;

    /* renamed from: g */
    private final FilterScreenTypes f29392g;

    /* renamed from: h */
    private final hc.a f29393h;

    /* renamed from: i */
    private final h f29394i;

    /* renamed from: j */
    private final h f29395j;

    /* renamed from: k */
    private final MutableStateFlow<Long> f29396k;

    /* renamed from: l */
    private final StateFlow<b> f29397l;

    /* renamed from: m */
    private final StateFlow<Boolean> f29398m;

    /* renamed from: n */
    private final MutableStateFlow<Boolean> f29399n;

    /* renamed from: o */
    private final StateFlow<Boolean> f29400o;

    /* renamed from: p */
    private final StateFlow<Integer> f29401p;

    /* renamed from: q */
    private final StateFlow<Boolean> f29402q;

    /* renamed from: r */
    private final h f29403r;

    /* renamed from: s */
    private final h f29404s;

    /* renamed from: t */
    private final LiveData<Boolean> f29405t;

    /* renamed from: u */
    private final z<Boolean> f29406u;

    /* renamed from: v */
    private final LiveData<Boolean> f29407v;

    /* renamed from: w */
    private g00.a<p> f29408w;

    public FilterViewModel(CoroutineScope cs2, ListingsResponse.UISettings.FiltrationSetting setting, FiltersMediator mediator, FiltersRepository filtersRepository, final FD fd2, boolean z11, MutableSharedFlow<Triple<FilterViewModel<?, ?, ?>, a, Integer>> onFilterClicked) {
        h a11;
        h a12;
        h a13;
        h a14;
        o.i(cs2, "cs");
        o.i(setting, "setting");
        o.i(mediator, "mediator");
        o.i(filtersRepository, "filtersRepository");
        o.i(onFilterClicked, "onFilterClicked");
        this.f29386a = cs2;
        this.f29387b = setting;
        this.f29388c = mediator;
        this.f29389d = filtersRepository;
        this.f29390e = z11;
        this.f29391f = onFilterClicked;
        this.f29392g = com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.a.a(setting, this, z11);
        a11 = d.a(new g00.a<MutableStateFlow<FD>>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$filtrationData$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public final MutableStateFlow<FD> b() {
                return StateFlowKt.MutableStateFlow(fd2);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ Object invoke() {
                return b();
            }
        });
        this.f29394i = a11;
        a12 = d.a(new g00.a<StateFlow<? extends List<? extends e>>>(this) { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$filtrationDataView$2

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FilterViewModel<FD, FR, E> f29444a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f29444a = this;
            }

            @Override // g00.a
            /* renamed from: b */
            public final StateFlow<List<e>> invoke() {
                CoroutineScope coroutineScope;
                final MutableStateFlow n11 = this.f29444a.n();
                final FilterViewModel<FD, FR, E> filterViewModel = this.f29444a;
                Flow<List<? extends e>> flow = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000a: CONSTRUCTOR  (r2v0 'flow' kotlinx.coroutines.flow.Flow<java.util.List<? extends dc.e>>) = 
                      (r0v1 'n11' kotlinx.coroutines.flow.MutableStateFlow A[DONT_INLINE])
                      (r1v0 'filterViewModel' com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<FD, FR, E> A[DONT_INLINE])
                     call: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$filtrationDataView$2$invoke$$inlined$map$1.<init>(kotlinx.coroutines.flow.Flow, com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel):void type: CONSTRUCTOR in method: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$filtrationDataView$2.b():kotlinx.coroutines.flow.StateFlow<java.util.List<dc.e>>, file: classes2.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$filtrationDataView$2$invoke$$inlined$map$1, state: NOT_LOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                    	... 15 more
                    */
                /*
                    this = this;
                    com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<FD, FR, E> r0 = r4.f29444a
                    kotlinx.coroutines.flow.MutableStateFlow r0 = r0.n()
                    com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<FD, FR, E> r1 = r4.f29444a
                    com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$filtrationDataView$2$invoke$$inlined$map$1 r2 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$filtrationDataView$2$invoke$$inlined$map$1
                    r2.<init>(r0, r1)
                    com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<FD, FR, E> r0 = r4.f29444a
                    kotlinx.coroutines.CoroutineScope r0 = com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel.b(r0)
                    kotlinx.coroutines.flow.SharingStarted$Companion r1 = kotlinx.coroutines.flow.SharingStarted.Companion
                    kotlinx.coroutines.flow.SharingStarted r1 = r1.getLazily()
                    r3 = 0
                    kotlinx.coroutines.flow.StateFlow r0 = kotlinx.coroutines.flow.FlowKt.stateIn(r2, r0, r1, r3)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$filtrationDataView$2.invoke():kotlinx.coroutines.flow.StateFlow");
            }
        });
        this.f29395j = a12;
        MutableStateFlow<Long> MutableStateFlow = StateFlowKt.MutableStateFlow(0L);
        this.f29396k = MutableStateFlow;
        Flow flowCombine = FlowKt.flowCombine(n(), MutableStateFlow, new FilterViewModel$filtrationOptions$1(this, null));
        SharingStarted.Companion companion = SharingStarted.Companion;
        this.f29397l = FlowKt.stateIn(flowCombine, cs2, companion.getLazily(), b.a.f56209a);
        final MutableStateFlow<FD> n11 = n();
        Flow<Boolean> flow = new Flow<Boolean>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f29427a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ FilterViewModel f29428b;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$special$$inlined$map$1$2", f = "FilterViewModel.kt", l = {224, 223}, m = "emit")
                /* renamed from: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f29429a;

                    /* renamed from: b  reason: collision with root package name */
                    int f29430b;

                    /* renamed from: c  reason: collision with root package name */
                    Object f29431c;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f29429a = obj;
                        this.f29430b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, FilterViewModel filterViewModel) {
                    this.f29427a = flowCollector;
                    this.f29428b = filterViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[RETURN] */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, zz.a r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$special$$inlined$map$1$2$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f29430b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f29430b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$special$$inlined$map$1$2$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f29429a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f29430b
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3c
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        kotlin.f.b(r8)
                        goto L5d
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        java.lang.Object r7 = r0.f29431c
                        kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                        kotlin.f.b(r8)
                        goto L51
                    L3c:
                        kotlin.f.b(r8)
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.f29427a
                        com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel r2 = r6.f29428b
                        r0.f29431c = r8
                        r0.f29430b = r4
                        java.lang.Object r7 = r2.A(r7, r0)
                        if (r7 != r1) goto L4e
                        return r1
                    L4e:
                        r5 = r8
                        r8 = r7
                        r7 = r5
                    L51:
                        r2 = 0
                        r0.f29431c = r2
                        r0.f29430b = r3
                        java.lang.Object r7 = r7.emit(r8, r0)
                        if (r7 != r1) goto L5d
                        return r1
                    L5d:
                        wz.p r7 = wz.p.f75480a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        };
        SharingStarted lazily = companion.getLazily();
        Boolean bool = Boolean.FALSE;
        this.f29398m = FlowKt.stateIn(flow, cs2, lazily, bool);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.f29399n = MutableStateFlow2;
        this.f29400o = FlowKt.asStateFlow(MutableStateFlow2);
        final StateFlow<Integer> stateIn = FlowKt.stateIn(FlowKt.mapLatest(n(), new FilterViewModel$count$1(this)), cs2, companion.getEagerly(), 0);
        this.f29401p = stateIn;
        this.f29402q = FlowKt.stateIn(new Flow<Boolean>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$special$$inlined$map$2

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$special$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f29434a;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$special$$inlined$map$2$2", f = "FilterViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$special$$inlined$map$2$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f29435a;

                    /* renamed from: b  reason: collision with root package name */
                    int f29436b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f29435a = obj;
                        this.f29436b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f29434a = flowCollector;
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
                        boolean r0 = r6 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$special$$inlined$map$2$2$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f29436b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f29436b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$special$$inlined$map$2$2$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$special$$inlined$map$2$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f29435a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f29436b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L4e
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f29434a
                        java.lang.Number r5 = (java.lang.Number) r5
                        int r5 = r5.intValue()
                        if (r5 <= 0) goto L40
                        r5 = r3
                        goto L41
                    L40:
                        r5 = 0
                    L41:
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
                        r0.f29436b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4e
                        return r1
                    L4e:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        }, cs2, companion.getEagerly(), bool);
        a13 = d.a(new g00.a<StateFlow<? extends Boolean>>(this) { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$isVisibleState$2

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FilterViewModel<FD, FR, E> f29452a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f29452a = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // g00.a
            /* renamed from: b */
            public final StateFlow<Boolean> invoke() {
                boolean z12;
                CoroutineScope coroutineScope;
                Flow flow2;
                CoroutineScope coroutineScope2;
                final MutableStateFlow<?> n12;
                FilterViewModel<?, ?, ?> h11 = this.f29452a.h();
                boolean z13 = true;
                if (h11 != null && (n12 = h11.n()) != null) {
                    final FilterViewModel filterViewModel = this.f29452a;
                    flow2 = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: CONSTRUCTOR  (r4v4 'flow2' kotlinx.coroutines.flow.Flow) = 
                          (r0v16 'n12' kotlinx.coroutines.flow.MutableStateFlow<?> A[DONT_INLINE])
                          (r3v3 'filterViewModel' com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel A[DONT_INLINE])
                         call: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$isVisibleState$2$invoke$$inlined$map$1.<init>(kotlinx.coroutines.flow.Flow, com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel):void type: CONSTRUCTOR in method: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$isVisibleState$2.b():kotlinx.coroutines.flow.StateFlow<java.lang.Boolean>, file: classes2.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$isVisibleState$2$invoke$$inlined$map$1, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                        	... 21 more
                        */
                    /*
                        this = this;
                        com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<FD, FR, E> r0 = r11.f29452a
                        com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel r0 = r0.h()
                        r1 = 1
                        r2 = 0
                        if (r0 == 0) goto L18
                        kotlinx.coroutines.flow.MutableStateFlow r0 = r0.n()
                        if (r0 == 0) goto L18
                        com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<FD, FR, E> r3 = r11.f29452a
                        com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$isVisibleState$2$invoke$$inlined$map$1 r4 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$isVisibleState$2$invoke$$inlined$map$1
                        r4.<init>(r0, r3)
                        goto L4e
                    L18:
                        com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<FD, FR, E> r0 = r11.f29452a
                        com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$FiltrationSetting r0 = r0.w()
                        boolean r0 = r0.getDependOnParent()
                        if (r0 != 0) goto L32
                        com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<FD, FR, E> r0 = r11.f29452a
                        com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$FiltrationSetting r0 = r0.w()
                        boolean r0 = r0.isExposed()
                        if (r0 == 0) goto L32
                        r0 = r1
                        goto L33
                    L32:
                        r0 = r2
                    L33:
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                        kotlinx.coroutines.flow.MutableStateFlow r4 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(r0)
                        com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<FD, FR, E> r0 = r11.f29452a
                        kotlinx.coroutines.CoroutineScope r5 = com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel.b(r0)
                        r6 = 0
                        r7 = 0
                        com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$isVisibleState$2$2$1 r8 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$isVisibleState$2$2$1
                        r3 = 0
                        r8.<init>(r4, r0, r3)
                        r9 = 3
                        r10 = 0
                        kotlinx.coroutines.BuildersKt.launch$default(r5, r6, r7, r8, r9, r10)
                    L4e:
                        com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<FD, FR, E> r0 = r11.f29452a
                        kotlinx.coroutines.CoroutineScope r0 = com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel.b(r0)
                        kotlinx.coroutines.flow.SharingStarted$Companion r3 = kotlinx.coroutines.flow.SharingStarted.Companion
                        kotlinx.coroutines.flow.SharingStarted r3 = r3.getLazily()
                        com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<FD, FR, E> r5 = r11.f29452a
                        com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$FiltrationSetting r5 = r5.w()
                        boolean r5 = r5.getDependOnParent()
                        if (r5 != 0) goto L73
                        com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<FD, FR, E> r5 = r11.f29452a
                        com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$FiltrationSetting r5 = r5.w()
                        boolean r5 = r5.isExposed()
                        if (r5 == 0) goto L73
                        goto L74
                    L73:
                        r1 = r2
                    L74:
                        java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                        kotlinx.coroutines.flow.StateFlow r0 = kotlinx.coroutines.flow.FlowKt.stateIn(r4, r0, r3, r1)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$isVisibleState$2.invoke():kotlinx.coroutines.flow.StateFlow");
                }
            });
            this.f29403r = a13;
            a14 = d.a(new g00.a<b0<Boolean>>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$isVisible$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // g00.a
                public final b0<Boolean> invoke() {
                    return new b0<>(Boolean.TRUE);
                }
            });
            this.f29404s = a14;
            this.f29405t = FlowLiveDataConversions.c(new Flow<Boolean>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$special$$inlined$map$3

                /* compiled from: Emitters.kt */
                /* renamed from: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$special$$inlined$map$3$2  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass2<T> implements FlowCollector {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ FlowCollector f29439a;

                    /* compiled from: Emitters.kt */
                    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$special$$inlined$map$3$2", f = "FilterViewModel.kt", l = {223}, m = "emit")
                    /* renamed from: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$special$$inlined$map$3$2$1  reason: invalid class name */
                    /* loaded from: classes2.dex */
                    public static final class AnonymousClass1 extends ContinuationImpl {

                        /* renamed from: a  reason: collision with root package name */
                        /* synthetic */ Object f29440a;

                        /* renamed from: b  reason: collision with root package name */
                        int f29441b;

                        public AnonymousClass1(zz.a aVar) {
                            super(aVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.f29440a = obj;
                            this.f29441b |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.f29439a = flowCollector;
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
                            boolean r0 = r6 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$special$$inlined$map$3.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$special$$inlined$map$3$2$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.f29441b
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.f29441b = r1
                            goto L18
                        L13:
                            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$special$$inlined$map$3$2$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$special$$inlined$map$3$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.f29440a
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                            int r2 = r0.f29441b
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            kotlin.f.b(r6)
                            goto L4e
                        L29:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L31:
                            kotlin.f.b(r6)
                            kotlinx.coroutines.flow.FlowCollector r6 = r4.f29439a
                            java.lang.Number r5 = (java.lang.Number) r5
                            int r5 = r5.intValue()
                            if (r5 <= 0) goto L40
                            r5 = r3
                            goto L41
                        L40:
                            r5 = 0
                        L41:
                            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
                            r0.f29441b = r3
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L4e
                            return r1
                        L4e:
                            wz.p r5 = wz.p.f75480a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Boolean> flowCollector, zz.a aVar) {
                    Object f11;
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), aVar);
                    f11 = kotlin.coroutines.intrinsics.b.f();
                    if (collect == f11) {
                        return collect;
                    }
                    return p.f75480a;
                }
            }, null, 0L, 3, null);
            z<Boolean> zVar = new z<>();
            this.f29406u = zVar;
            this.f29407v = zVar;
        }

        static /* synthetic */ <FD, FR, E> Object C(FilterViewModel<FD, FR, E> filterViewModel, FD fd2, zz.a<? super Boolean> aVar) {
            return kotlin.coroutines.jvm.internal.a.a(false);
        }

        public final boolean D() {
            if (this.f29390e) {
                return true;
            }
            return this.f29387b.isExposed();
        }

        static /* synthetic */ <FD, FR, E> Object I(FilterViewModel<FD, FR, E> filterViewModel, FD fd2, zz.a<? super List<e>> aVar) {
            return null;
        }

        public static /* synthetic */ void K(FilterViewModel filterViewModel, int i11, int i12, Object obj) {
            if (obj == null) {
                if ((i12 & 1) != 0) {
                    i11 = 0;
                }
                filterViewModel.J(i11);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onFilterClicked");
        }

        static /* synthetic */ <FD, FR, E> Object M(FilterViewModel<FD, FR, E> filterViewModel, FilterViewModel<?, ?, ?> filterViewModel2, zz.a<? super p> aVar) {
            Object f11;
            Object emit = ((FilterViewModel) filterViewModel).f29396k.emit(kotlin.coroutines.jvm.internal.a.e(System.currentTimeMillis()), aVar);
            f11 = kotlin.coroutines.intrinsics.b.f();
            if (emit == f11) {
                return emit;
            }
            return p.f75480a;
        }

        static /* synthetic */ <FD, FR, E> Object O(FilterViewModel<FD, FR, E> filterViewModel, zz.a<? super com.forsale.app.utils.analytics.listingfiltration.a> aVar) {
            return null;
        }

        public static /* synthetic */ Object R(FilterViewModel filterViewModel, boolean z11, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    z11 = false;
                }
                return filterViewModel.Q(z11);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pullFiltrationData");
        }

        static /* synthetic */ <FD, FR, E> Object Z(FilterViewModel<FD, FR, E> filterViewModel, FD fd2, zz.a<? super b> aVar) {
            return b.a.f56209a;
        }

        public static final /* synthetic */ Object g(FilterViewModel filterViewModel, Object obj, zz.a aVar) {
            return kotlin.coroutines.jvm.internal.a.d(filterViewModel.G(obj));
        }

        static /* synthetic */ <FD, FR, E> Object k(FilterViewModel<FD, FR, E> filterViewModel, zz.a<? super a> aVar) {
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a.AbstractC0319a m(FilterViewModel filterViewModel, FilterViewType.FilterSelectionViewType filterSelectionViewType, List list, CategoryEntity categoryEntity, List list2, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 4) != 0) {
                    list2 = null;
                }
                return filterViewModel.l(filterSelectionViewType, list, categoryEntity, list2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateSelectionCapsule");
        }

        /* JADX WARN: Code restructure failed: missing block: B:52:0x0048, code lost:
            if (((java.util.Collection) r5).isEmpty() == false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x005b, code lost:
            if (r5.getFrom() == null) goto L14;
         */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x004b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object z(zz.a<? super java.lang.Boolean> r5) {
            /*
                r4 = this;
                boolean r0 = r5 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$hasData$1
                if (r0 == 0) goto L13
                r0 = r5
                com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$hasData$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$hasData$1) r0
                int r1 = r0.f29450c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f29450c = r1
                goto L18
            L13:
                com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$hasData$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel$hasData$1
                r0.<init>(r4, r5)
            L18:
                java.lang.Object r5 = r0.f29448a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                int r2 = r0.f29450c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.f.b(r5)
                goto L3d
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L31:
                kotlin.f.b(r5)
                r0.f29450c = r3
                java.lang.Object r5 = r4.S(r0)
                if (r5 != r1) goto L3d
                return r1
            L3d:
                boolean r0 = r5 instanceof java.util.List
                r1 = 0
                if (r0 == 0) goto L4b
                java.util.Collection r5 = (java.util.Collection) r5
                boolean r5 = r5.isEmpty()
                if (r5 != 0) goto L5e
                goto L5f
            L4b:
                boolean r0 = r5 instanceof com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData.Range
                if (r0 == 0) goto L5e
                com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Range r5 = (com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData.Range) r5
                java.lang.Integer r0 = r5.getTo()
                if (r0 != 0) goto L5f
                java.lang.Integer r5 = r5.getFrom()
                if (r5 == 0) goto L5e
                goto L5f
            L5e:
                r3 = r1
            L5f:
                java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r3)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel.z(zz.a):java.lang.Object");
        }

        public Object A(FD fd2, zz.a<? super Boolean> aVar) {
            return C(this, fd2, aVar);
        }

        public final StateFlow<Boolean> B() {
            return this.f29398m;
        }

        public final StateFlow<Boolean> E() {
            return this.f29400o;
        }

        public StateFlow<Boolean> F() {
            return (StateFlow) this.f29403r.getValue();
        }

        public int G(FD fd2) {
            if (fd2 == null) {
                return 0;
            }
            if (fd2 instanceof List) {
                return ((Collection) fd2).size();
            }
            return 1;
        }

        public Object H(FD fd2, zz.a<? super List<e>> aVar) {
            return I(this, fd2, aVar);
        }

        public void J(int i11) {
            BuildersKt__Builders_commonKt.launch$default(this.f29386a, null, null, new FilterViewModel$onFilterClicked$1(this, i11, null), 3, null);
        }

        public Object L(FilterViewModel<?, ?, ?> filterViewModel, zz.a<? super p> aVar) {
            return M(this, filterViewModel, aVar);
        }

        public Object N(zz.a<? super com.forsale.app.utils.analytics.listingfiltration.a> aVar) {
            return O(this, aVar);
        }

        public final Object P(zz.a<? super a> aVar) {
            if (!(this.f29392g instanceof FilterScreenTypes.NewScreen)) {
                return null;
            }
            return j(aVar);
        }

        public final FD Q(boolean z11) {
            FD value;
            if ((z11 && this.f29398m.getValue().booleanValue()) || (value = n().getValue()) == null) {
                return null;
            }
            if ((value instanceof List) && ((List) value).isEmpty()) {
                return null;
            }
            return value;
        }

        public abstract Object S(zz.a<? super FR> aVar);

        public void T() {
            n().setValue(null);
        }

        public final Object X(zz.a<? super p> aVar) {
            Object f11;
            Object emit = this.f29399n.emit(kotlin.coroutines.jvm.internal.a.a(false), aVar);
            f11 = kotlin.coroutines.intrinsics.b.f();
            if (emit == f11) {
                return emit;
            }
            return p.f75480a;
        }

        public Object Y(FD fd2, zz.a<? super b> aVar) {
            return Z(this, fd2, aVar);
        }

        public void a0(c filterResult) {
            o.i(filterResult, "filterResult");
        }

        public void f(int i11, boolean z11) {
            if (q() != null && (q() instanceof SelectableHandler)) {
                hc.a q11 = q();
                o.g(q11, "null cannot be cast to non-null type com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.commonViewModelsHandlers.SelectableHandler");
                if (!((SelectableHandler) q11).c()) {
                    if (z11) {
                        U(i11);
                        return;
                    } else {
                        W(i11);
                        return;
                    }
                }
                V(i11);
            }
        }

        public final FilterViewModel<?, ?, ?> h() {
            Object obj;
            Iterator<T> it2 = this.f29388c.i().iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (o.d(((FilterViewModel) obj).f29387b.getId(), this.f29387b.getParentId())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return (FilterViewModel) obj;
        }

        public final Object i(zz.a<? super p> aVar) {
            Object f11;
            Object emit = this.f29399n.emit(kotlin.coroutines.jvm.internal.a.a(true), aVar);
            f11 = kotlin.coroutines.intrinsics.b.f();
            if (emit == f11) {
                return emit;
            }
            return p.f75480a;
        }

        public Object j(zz.a<? super a> aVar) {
            return k(this, aVar);
        }

        public final a.AbstractC0319a l(FilterViewType.FilterSelectionViewType filterSelectionViewType, List<dc.c> options, CategoryEntity rootCategory, List<ParentGroupModel> list) {
            boolean z11;
            o.i(filterSelectionViewType, "<this>");
            o.i(options, "options");
            o.i(rootCategory, "rootCategory");
            String r11 = r();
            String x11 = x();
            FilterScreenTypes filterScreenTypes = this.f29392g;
            o.g(filterScreenTypes, "null cannot be cast to non-null type com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterScreenTypes.NewScreen");
            fc.a aVar = new fc.a(r11, x11, (FilterScreenTypes.NewScreen) filterScreenTypes, rootCategory);
            if (filterSelectionViewType instanceof FilterViewType.FilterSelectionViewType.Horizontal) {
                return new a.AbstractC0319a.C0320a(options, aVar);
            }
            if (filterSelectionViewType instanceof FilterViewType.FilterSelectionViewType.Vertical) {
                List<ParentGroupModel> list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    return new a.AbstractC0319a.b.C0321a(options, aVar);
                }
                return new a.AbstractC0319a.b.C0322b(options, list, aVar);
            }
            throw new NoWhenBranchMatchedException();
        }

        public final MutableStateFlow<FD> n() {
            return (MutableStateFlow) this.f29394i.getValue();
        }

        public final StateFlow<List<e>> o() {
            return (StateFlow) this.f29395j.getValue();
        }

        public final StateFlow<b> p() {
            return this.f29397l;
        }

        public hc.a q() {
            return this.f29393h;
        }

        public final String r() {
            return this.f29387b.getLocalizedLabel();
        }

        public final FiltersMediator s() {
            return this.f29388c;
        }

        public final boolean t() {
            return this.f29390e;
        }

        public final g00.a<p> u() {
            return this.f29408w;
        }

        public final StateFlow<Boolean> v() {
            return this.f29402q;
        }

        public final ListingsResponse.UISettings.FiltrationSetting w() {
            return this.f29387b;
        }

        public final String x() {
            return this.f29387b.getLabel().getEn();
        }

        public final FilterScreenTypes y() {
            return this.f29392g;
        }

        public void U(int i11) {
        }

        public void V(int i11) {
        }

        public void W(int i11) {
        }
    }
