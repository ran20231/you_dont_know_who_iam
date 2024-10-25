package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.forsale.app.datalayer.repositories.FiltersRepository;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel;
import com.forsale.app.utils.analytics.listingfiltration.a;
import com.forsale.app.utils.itemutils.TextHolder;
import com.google.android.gms.common.api.Api;
import fc.c;
import g00.l;
import g00.p;
import hc.b;
import java.util.List;
import kotlin.Triple;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import wz.h;
import zz.a;
/* compiled from: PriceFilterViewModel.kt */
/* loaded from: classes2.dex */
public final class PriceFilterViewModel extends FilterViewModel<GetListingsBody.FiltrationData.Range, GetListingsBody.FiltrationData.Range, String> {
    private final MutableStateFlow<Integer> A;
    private final MutableStateFlow<Integer> B;
    private final b C;
    private final h D;
    private final h E;
    private final h F;
    private final StateFlow<Object> G;
    private final MutableStateFlow<String> H;
    private final MutableStateFlow<TextHolder.LocalizedText> I;

    /* renamed from: x  reason: collision with root package name */
    private final RegionsRepository f29525x;

    /* renamed from: y  reason: collision with root package name */
    private final CategoriesRepositories f29526y;

    /* renamed from: z  reason: collision with root package name */
    private final CategoryEntity f29527z;

    /* compiled from: PriceFilterViewModel.kt */
    @d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$1", f = "PriceFilterViewModel.kt", l = {71, 72, 73}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f29546a;

        /* renamed from: b  reason: collision with root package name */
        Object f29547b;

        /* renamed from: c  reason: collision with root package name */
        int f29548c;

        AnonymousClass1(a<? super AnonymousClass1> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(Object obj, a<?> aVar) {
            return new AnonymousClass1(aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x00b3 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
                int r1 = r9.f29548c
                r2 = 3
                r3 = 2
                r4 = 1
                java.lang.String r5 = ")"
                java.lang.String r6 = "("
                if (r1 == 0) goto L32
                if (r1 == r4) goto L2e
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                kotlin.f.b(r10)
                goto Lb4
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L22:
                java.lang.Object r1 = r9.f29547b
                com.forsale.app.datalayer.database.RegionEntity r1 = (com.forsale.app.datalayer.database.RegionEntity) r1
                java.lang.Object r3 = r9.f29546a
                com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel r3 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel) r3
                kotlin.f.b(r10)
                goto L71
            L2e:
                kotlin.f.b(r10)
                goto L44
            L32:
                kotlin.f.b(r10)
                com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel r10 = com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel.this
                com.forsale.app.datalayer.repositories.RegionsRepository r10 = r10.k0()
                r9.f29548c = r4
                java.lang.Object r10 = r10.getCurrentRegion(r9)
                if (r10 != r0) goto L44
                return r0
            L44:
                com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel r1 = com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel.this
                com.forsale.app.datalayer.database.RegionEntity r10 = (com.forsale.app.datalayer.database.RegionEntity) r10
                kotlinx.coroutines.flow.MutableStateFlow r4 = r1.l0()
                java.lang.String r7 = r10.getCurrency()
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r6)
                r8.append(r7)
                r8.append(r5)
                java.lang.String r7 = r8.toString()
                r9.f29546a = r1
                r9.f29547b = r10
                r9.f29548c = r3
                java.lang.Object r3 = r4.emit(r7, r9)
                if (r3 != r0) goto L6f
                return r0
            L6f:
                r3 = r1
                r1 = r10
            L71:
                kotlinx.coroutines.flow.MutableStateFlow r10 = r3.e0()
                com.forsale.app.utils.itemutils.TextHolder$LocalizedText r3 = new com.forsale.app.utils.itemutils.TextHolder$LocalizedText
                java.lang.String r4 = r1.getRegionCodeAr()
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r6)
                r7.append(r4)
                r7.append(r5)
                java.lang.String r4 = r7.toString()
                java.lang.String r1 = r1.getRegionCodeEn()
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r6)
                r7.append(r1)
                r7.append(r5)
                java.lang.String r1 = r7.toString()
                r3.<init>(r4, r1)
                r1 = 0
                r9.f29546a = r1
                r9.f29547b = r1
                r9.f29548c = r2
                java.lang.Object r10 = r10.emit(r3, r9)
                if (r10 != r0) goto Lb4
                return r0
            Lb4:
                wz.p r10 = wz.p.f75480a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceFilterViewModel(final CoroutineScope cs2, ListingsResponse.UISettings.FiltrationSetting setting, final FiltersMediator mediator, RegionsRepository regionsRepository, CategoriesRepositories categoriesRepositories, FiltersRepository filtersRepository, GetListingsBody.FiltrationData.Range range, boolean z11, MutableSharedFlow<Triple<FilterViewModel<?, ?, ?>, com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a, Integer>> onFilterClicked, CategoryEntity rootCategory) {
        super(cs2, setting, mediator, filtersRepository, range, z11, onFilterClicked);
        Integer num;
        Integer num2;
        h a11;
        h a12;
        h a13;
        o.i(cs2, "cs");
        o.i(setting, "setting");
        o.i(mediator, "mediator");
        o.i(regionsRepository, "regionsRepository");
        o.i(categoriesRepositories, "categoriesRepositories");
        o.i(filtersRepository, "filtersRepository");
        o.i(onFilterClicked, "onFilterClicked");
        o.i(rootCategory, "rootCategory");
        this.f29525x = regionsRepository;
        this.f29526y = categoriesRepositories;
        this.f29527z = rootCategory;
        GetListingsBody.FiltrationData.Range value = n().getValue();
        if (value != null) {
            num = value.getFrom();
        } else {
            num = null;
        }
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(num);
        this.A = MutableStateFlow;
        GetListingsBody.FiltrationData.Range value2 = n().getValue();
        if (value2 != null) {
            num2 = value2.getTo();
        } else {
            num2 = null;
        }
        MutableStateFlow<Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(num2);
        this.B = MutableStateFlow2;
        this.C = new b();
        a11 = kotlin.d.a(new g00.a<StateFlow<? extends GetListingsBody.FiltrationData.Range>>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$priceRange$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final StateFlow<GetListingsBody.FiltrationData.Range> invoke() {
                final StateFlow<List<Integer>> k11 = FiltersMediator.this.k();
                final PriceFilterViewModel priceFilterViewModel = this;
                return FlowKt.stateIn(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001a: RETURN  
                      (wrap: kotlinx.coroutines.flow.StateFlow<com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Range> : 0x0016: INVOKE  (r0v3 kotlinx.coroutines.flow.StateFlow<com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Range> A[REMOVE]) = 
                      (wrap: kotlinx.coroutines.flow.Flow<com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Range> : 0x000a: CONSTRUCTOR  (r2v0 kotlinx.coroutines.flow.Flow<com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Range> A[REMOVE]) = 
                      (r0v1 'k11' kotlinx.coroutines.flow.StateFlow<java.util.List<java.lang.Integer>> A[DONT_INLINE])
                      (r1v0 'priceFilterViewModel' com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel A[DONT_INLINE])
                     call: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$priceRange$2$invoke$$inlined$map$1.<init>(kotlinx.coroutines.flow.Flow, com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel):void type: CONSTRUCTOR)
                      (wrap: kotlinx.coroutines.CoroutineScope : 0x000d: IGET  (r0v2 kotlinx.coroutines.CoroutineScope A[REMOVE]) = 
                      (r4v0 'this' com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$priceRange$2 A[IMMUTABLE_TYPE, THIS])
                     com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$priceRange$2.b kotlinx.coroutines.CoroutineScope)
                      (wrap: kotlinx.coroutines.flow.SharingStarted : 0x0011: INVOKE  (r1v2 kotlinx.coroutines.flow.SharingStarted A[REMOVE]) = 
                      (wrap: kotlinx.coroutines.flow.SharingStarted$Companion : 0x000f: SGET  (r1v1 kotlinx.coroutines.flow.SharingStarted$Companion A[REMOVE]) =  kotlinx.coroutines.flow.SharingStarted.Companion kotlinx.coroutines.flow.SharingStarted$Companion)
                     type: VIRTUAL call: kotlinx.coroutines.flow.SharingStarted.Companion.getEagerly():kotlinx.coroutines.flow.SharingStarted)
                      (null java.lang.Object)
                     type: STATIC call: kotlinx.coroutines.flow.FlowKt.stateIn(kotlinx.coroutines.flow.Flow, kotlinx.coroutines.CoroutineScope, kotlinx.coroutines.flow.SharingStarted, java.lang.Object):kotlinx.coroutines.flow.StateFlow)
                     in method: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$priceRange$2.b():kotlinx.coroutines.flow.StateFlow<com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Range>, file: classes2.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$priceRange$2$invoke$$inlined$map$1, state: NOT_LOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1097)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:872)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                    	... 15 more
                    */
                /*
                    this = this;
                    com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator r0 = com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator.this
                    kotlinx.coroutines.flow.StateFlow r0 = r0.k()
                    com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel r1 = r3
                    com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$priceRange$2$invoke$$inlined$map$1 r2 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$priceRange$2$invoke$$inlined$map$1
                    r2.<init>(r0, r1)
                    kotlinx.coroutines.CoroutineScope r0 = r2
                    kotlinx.coroutines.flow.SharingStarted$Companion r1 = kotlinx.coroutines.flow.SharingStarted.Companion
                    kotlinx.coroutines.flow.SharingStarted r1 = r1.getEagerly()
                    r3 = 0
                    kotlinx.coroutines.flow.StateFlow r0 = kotlinx.coroutines.flow.FlowKt.stateIn(r2, r0, r1, r3)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$priceRange$2.invoke():kotlinx.coroutines.flow.StateFlow");
            }
        });
        this.D = a11;
        a12 = kotlin.d.a(new g00.a<Flow<? extends Integer>>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$minPlaceHolder$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Flow<Integer> invoke() {
                final StateFlow<GetListingsBody.FiltrationData.Range> j02 = PriceFilterViewModel.this.j0();
                return 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000b: RETURN  
                      (wrap: kotlinx.coroutines.flow.Flow<java.lang.Integer> : 0x0008: CONSTRUCTOR  (r1v0 kotlinx.coroutines.flow.Flow<java.lang.Integer> A[REMOVE]) = 
                      (r0v1 'j02' kotlinx.coroutines.flow.StateFlow<com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Range> A[DONT_INLINE])
                     call: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$minPlaceHolder$2$invoke$$inlined$map$1.<init>(kotlinx.coroutines.flow.Flow):void type: CONSTRUCTOR)
                     in method: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$minPlaceHolder$2.b():kotlinx.coroutines.flow.Flow<java.lang.Integer>, file: classes2.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$minPlaceHolder$2$invoke$$inlined$map$1, state: NOT_LOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                    	... 15 more
                    */
                /*
                    this = this;
                    com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel r0 = com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel.this
                    kotlinx.coroutines.flow.StateFlow r0 = r0.j0()
                    com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$minPlaceHolder$2$invoke$$inlined$map$1 r1 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$minPlaceHolder$2$invoke$$inlined$map$1
                    r1.<init>(r0)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$minPlaceHolder$2.invoke():kotlinx.coroutines.flow.Flow");
            }
        });
        this.E = a12;
        a13 = kotlin.d.a(new g00.a<Flow<? extends Integer>>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$maxPlaceHolder$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Flow<Integer> invoke() {
                final StateFlow<GetListingsBody.FiltrationData.Range> j02 = PriceFilterViewModel.this.j0();
                return 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000b: RETURN  
                      (wrap: kotlinx.coroutines.flow.Flow<java.lang.Integer> : 0x0008: CONSTRUCTOR  (r1v0 kotlinx.coroutines.flow.Flow<java.lang.Integer> A[REMOVE]) = 
                      (r0v1 'j02' kotlinx.coroutines.flow.StateFlow<com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Range> A[DONT_INLINE])
                     call: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$maxPlaceHolder$2$invoke$$inlined$map$1.<init>(kotlinx.coroutines.flow.Flow):void type: CONSTRUCTOR)
                     in method: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$maxPlaceHolder$2.b():kotlinx.coroutines.flow.Flow<java.lang.Integer>, file: classes2.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$maxPlaceHolder$2$invoke$$inlined$map$1, state: NOT_LOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                    	... 15 more
                    */
                /*
                    this = this;
                    com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel r0 = com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel.this
                    kotlinx.coroutines.flow.StateFlow r0 = r0.j0()
                    com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$maxPlaceHolder$2$invoke$$inlined$map$1 r1 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$maxPlaceHolder$2$invoke$$inlined$map$1
                    r1.<init>(r0)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$maxPlaceHolder$2.invoke():kotlinx.coroutines.flow.Flow");
            }
        });
        this.F = a13;
        this.G = FlowKt.stateIn(FlowKt.flowCombine(MutableStateFlow, MutableStateFlow2, new PriceFilterViewModel$currentRange$1(this, null)), cs2, SharingStarted.Companion.getEagerly(), new GetListingsBody.FiltrationData.Range(null, null, 3, null));
        this.H = StateFlowKt.MutableStateFlow(null);
        this.I = StateFlowKt.MutableStateFlow(null);
        BuildersKt__Builders_commonKt.launch$default(cs2, null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    public Object N(a<? super com.forsale.app.utils.analytics.listingfiltration.a> aVar) {
        GetListingsBody.FiltrationData.Range value = n().getValue();
        if (value != null) {
            return new a.c(x(), value);
        }
        return null;
    }

    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    public Object S(zz.a<? super GetListingsBody.FiltrationData.Range> aVar) {
        GetListingsBody.FiltrationData.Range value = j0().getValue();
        if (value == null) {
            return new GetListingsBody.FiltrationData.Range(kotlin.coroutines.jvm.internal.a.d(0), kotlin.coroutines.jvm.internal.a.d(Api.BaseClientBuilder.API_PRIORITY_OTHER));
        }
        return value;
    }

    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    public void T() {
        super.T();
        this.A.setValue(null);
        this.B.setValue(null);
    }

    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    public void a0(c filterResult) {
        Integer num;
        o.i(filterResult, "filterResult");
        if (filterResult instanceof c.b) {
            c.b bVar = (c.b) filterResult;
            GetListingsBody.FiltrationData.Range b11 = bVar.b();
            Integer num2 = null;
            if (b11 != null) {
                num = b11.getFrom();
            } else {
                num = null;
            }
            GetListingsBody.FiltrationData.Range b12 = bVar.b();
            if (b12 != null) {
                num2 = b12.getTo();
            }
            m0(num, num2);
        }
    }

    public final CategoriesRepositories c0() {
        return this.f29526y;
    }

    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    /* renamed from: d0 */
    public b q() {
        return this.C;
    }

    public final MutableStateFlow<TextHolder.LocalizedText> e0() {
        return this.I;
    }

    public final MutableStateFlow<Integer> f0() {
        return this.B;
    }

    public final Flow<Integer> g0() {
        return (Flow) this.F.getValue();
    }

    public final MutableStateFlow<Integer> h0() {
        return this.A;
    }

    public final Flow<Integer> i0() {
        return (Flow) this.E.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(zz.a<? super com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$generateFilterCapsule$1
            if (r0 == 0) goto L13
            r0 = r10
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$generateFilterCapsule$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$generateFilterCapsule$1) r0
            int r1 = r0.f29557d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29557d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$generateFilterCapsule$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$generateFilterCapsule$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f29555b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29557d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f29554a
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel) r0
            kotlin.f.b(r10)
            goto L44
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L35:
            kotlin.f.b(r10)
            r0.f29554a = r9
            r0.f29557d = r3
            java.lang.Object r10 = r9.S(r0)
            if (r10 != r1) goto L43
            return r1
        L43:
            r0 = r9
        L44:
            com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Range r10 = (com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData.Range) r10
            kotlinx.coroutines.flow.MutableStateFlow r1 = r0.n()
            java.lang.Object r1 = r1.getValue()
            com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Range r1 = (com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData.Range) r1
            fc.a r2 = new fc.a
            kotlin.jvm.internal.w r4 = kotlin.jvm.internal.w.f61809a
            java.lang.String r4 = r0.r()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = " %s"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.Object[] r5 = new java.lang.Object[r3]
            com.forsale.app.utils.LocaleManager r6 = com.forsale.app.utils.LocaleManager.f39597a
            boolean r6 = r6.r()
            r7 = 0
            if (r6 == 0) goto L83
            kotlinx.coroutines.flow.MutableStateFlow<com.forsale.app.utils.itemutils.TextHolder$LocalizedText> r6 = r0.I
            java.lang.Object r6 = r6.getValue()
            com.forsale.app.utils.itemutils.TextHolder$LocalizedText r6 = (com.forsale.app.utils.itemutils.TextHolder.LocalizedText) r6
            if (r6 == 0) goto L92
            java.lang.String r6 = r6.a()
            goto L93
        L83:
            kotlinx.coroutines.flow.MutableStateFlow<com.forsale.app.utils.itemutils.TextHolder$LocalizedText> r6 = r0.I
            java.lang.Object r6 = r6.getValue()
            com.forsale.app.utils.itemutils.TextHolder$LocalizedText r6 = (com.forsale.app.utils.itemutils.TextHolder.LocalizedText) r6
            if (r6 == 0) goto L92
            java.lang.String r6 = r6.b()
            goto L93
        L92:
            r6 = r7
        L93:
            if (r6 != 0) goto L97
            java.lang.String r6 = ""
        L97:
            r8 = 0
            r5[r8] = r6
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r5, r3)
            java.lang.String r3 = java.lang.String.format(r4, r3)
            java.lang.String r4 = "format(...)"
            kotlin.jvm.internal.o.h(r3, r4)
            java.lang.String r4 = r0.x()
            com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterScreenTypes r5 = r0.y()
            java.lang.String r6 = "null cannot be cast to non-null type com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterScreenTypes.NewScreen"
            kotlin.jvm.internal.o.g(r5, r6)
            com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterScreenTypes$NewScreen r5 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterScreenTypes.NewScreen) r5
            com.forsale.app.datalayer.database.CategoryEntity r0 = r0.f29527z
            r2.<init>(r3, r4, r5, r0)
            com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a$c r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a$c
            r0.<init>(r10, r1, r7, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel.j(zz.a):java.lang.Object");
    }

    public final StateFlow<GetListingsBody.FiltrationData.Range> j0() {
        return (StateFlow) this.D.getValue();
    }

    public final RegionsRepository k0() {
        return this.f29525x;
    }

    public final MutableStateFlow<String> l0() {
        return this.H;
    }

    public final void m0(Integer num, Integer num2) {
        boolean z11;
        GetListingsBody.FiltrationData.Range value = n().getValue();
        if (value == null) {
            value = new GetListingsBody.FiltrationData.Range(null, null, 3, null);
        }
        Integer component1 = value.component1();
        Integer component2 = value.component2();
        if (o.d(component1, num) && o.d(component2, num2)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            return;
        }
        q().b(j0().getValue(), num, num2, new l<GetListingsBody.FiltrationData.Range, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$setPriceAndNotifyChange$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(GetListingsBody.FiltrationData.Range range) {
                PriceFilterViewModel.this.n().setValue(range);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(GetListingsBody.FiltrationData.Range range) {
                b(range);
                return wz.p.f75480a;
            }
        }, new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel$setPriceAndNotifyChange$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ wz.p invoke() {
                invoke2();
                return wz.p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                FiltersMediator s11;
                s11 = PriceFilterViewModel.this.s();
                s11.o(PriceFilterViewModel.this);
            }
        });
    }
}
