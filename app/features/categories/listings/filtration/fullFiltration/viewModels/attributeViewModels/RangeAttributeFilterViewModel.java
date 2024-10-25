package com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.ExtraAttributeEntity;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository;
import com.forsale.app.datalayer.repositories.FiltersRepository;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel;
import com.forsale.app.features.postad.extraattributes.enums.AttributeType;
import com.forsale.app.utils.analytics.listingfiltration.a;
import com.google.android.gms.common.api.Api;
import fc.c;
import g00.l;
import g00.p;
import hc.b;
import kotlin.Triple;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* compiled from: RangeAttributeFilterViewModel.kt */
/* loaded from: classes2.dex */
public final class RangeAttributeFilterViewModel extends FilterViewModel {
    public static final a I = new a(null);
    public static final int J = 8;
    private final b A;
    private final MutableStateFlow<Integer> B;
    private final MutableStateFlow<Integer> C;
    private final MutableStateFlow<GetListingsBody.FiltrationData.Range> D;
    private final h E;
    private final h F;
    private final StateFlow<Object> G;
    private final MutableStateFlow<ExtraAttributeEntity.LocalUnit> H;

    /* renamed from: x  reason: collision with root package name */
    private final ExtraAttributeRawRepository f29354x;

    /* renamed from: y  reason: collision with root package name */
    private final CategoryEntity f29355y;

    /* renamed from: z  reason: collision with root package name */
    private final MutableSharedFlow<Triple<FilterViewModel<?, ?, ?>, com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a, Integer>> f29356z;

    /* compiled from: RangeAttributeFilterViewModel.kt */
    @d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel$1", f = "RangeAttributeFilterViewModel.kt", l = {67}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f29367a;

        /* renamed from: b  reason: collision with root package name */
        int f29368b;

        AnonymousClass1(zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(aVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [kotlinx.coroutines.flow.MutableStateFlow] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            MutableStateFlow<GetListingsBody.FiltrationData.Range> mutableStateFlow;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f29368b;
            if (i11 != 0) {
                if (i11 == 1) {
                    mutableStateFlow = (MutableStateFlow) this.f29367a;
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                MutableStateFlow<GetListingsBody.FiltrationData.Range> i02 = RangeAttributeFilterViewModel.this.i0();
                RangeAttributeFilterViewModel rangeAttributeFilterViewModel = RangeAttributeFilterViewModel.this;
                this.f29367a = i02;
                this.f29368b = 1;
                Object S = rangeAttributeFilterViewModel.S(this);
                if (S == f11) {
                    return f11;
                }
                mutableStateFlow = i02;
                obj = S;
            }
            mutableStateFlow.setValue(obj);
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* compiled from: RangeAttributeFilterViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeAttributeFilterViewModel(CoroutineScope cs2, ListingsResponse.UISettings.FiltrationSetting setting, FiltersMediator mediator, ExtraAttributeRawRepository attRepo, FiltersRepository filtersRepository, CategoryEntity rootCategory, GetListingsBody.FiltrationData.Attribute<GetListingsBody.FiltrationData.Range> attribute, boolean z11, MutableSharedFlow<Triple<FilterViewModel<?, ?, ?>, com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a, Integer>> onFilterClicked) {
        super(cs2, setting, mediator, filtersRepository, attribute, z11, onFilterClicked);
        Integer num;
        Integer num2;
        h a11;
        h a12;
        o.i(cs2, "cs");
        o.i(setting, "setting");
        o.i(mediator, "mediator");
        o.i(attRepo, "attRepo");
        o.i(filtersRepository, "filtersRepository");
        o.i(rootCategory, "rootCategory");
        o.i(onFilterClicked, "onFilterClicked");
        this.f29354x = attRepo;
        this.f29355y = rootCategory;
        this.f29356z = onFilterClicked;
        this.A = new b();
        GetListingsBody.FiltrationData.Attribute attribute2 = (GetListingsBody.FiltrationData.Attribute) n().getValue();
        if (attribute2 != null) {
            num = attribute2.getFrom();
        } else {
            num = null;
        }
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(num);
        this.B = MutableStateFlow;
        GetListingsBody.FiltrationData.Attribute attribute3 = (GetListingsBody.FiltrationData.Attribute) n().getValue();
        if (attribute3 != null) {
            num2 = attribute3.getTo();
        } else {
            num2 = null;
        }
        MutableStateFlow<Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(num2);
        this.C = MutableStateFlow2;
        this.D = StateFlowKt.MutableStateFlow(new GetListingsBody.FiltrationData.Range(0, Integer.valueOf((int) Api.BaseClientBuilder.API_PRIORITY_OTHER)));
        a11 = kotlin.d.a(new g00.a<Flow<? extends Integer>>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel$minPlaceHolder$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Flow<Integer> invoke() {
                final MutableStateFlow<GetListingsBody.FiltrationData.Range> i02 = RangeAttributeFilterViewModel.this.i0();
                return 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000b: RETURN  
                      (wrap: kotlinx.coroutines.flow.Flow<java.lang.Integer> : 0x0008: CONSTRUCTOR  (r1v0 kotlinx.coroutines.flow.Flow<java.lang.Integer> A[REMOVE]) = 
                      (r0v1 'i02' kotlinx.coroutines.flow.MutableStateFlow<com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Range> A[DONT_INLINE])
                     call: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel$minPlaceHolder$2$invoke$$inlined$map$1.<init>(kotlinx.coroutines.flow.Flow):void type: CONSTRUCTOR)
                     in method: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel$minPlaceHolder$2.b():kotlinx.coroutines.flow.Flow<java.lang.Integer>, file: classes2.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel$minPlaceHolder$2$invoke$$inlined$map$1, state: NOT_LOADED
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
                    com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel r0 = com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel.this
                    kotlinx.coroutines.flow.MutableStateFlow r0 = r0.i0()
                    com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel$minPlaceHolder$2$invoke$$inlined$map$1 r1 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel$minPlaceHolder$2$invoke$$inlined$map$1
                    r1.<init>(r0)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel$minPlaceHolder$2.invoke():kotlinx.coroutines.flow.Flow");
            }
        });
        this.E = a11;
        a12 = kotlin.d.a(new g00.a<Flow<? extends Integer>>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel$maxPlaceHolder$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Flow<Integer> invoke() {
                final MutableStateFlow<GetListingsBody.FiltrationData.Range> i02 = RangeAttributeFilterViewModel.this.i0();
                return 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000b: RETURN  
                      (wrap: kotlinx.coroutines.flow.Flow<java.lang.Integer> : 0x0008: CONSTRUCTOR  (r1v0 kotlinx.coroutines.flow.Flow<java.lang.Integer> A[REMOVE]) = 
                      (r0v1 'i02' kotlinx.coroutines.flow.MutableStateFlow<com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Range> A[DONT_INLINE])
                     call: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel$maxPlaceHolder$2$invoke$$inlined$map$1.<init>(kotlinx.coroutines.flow.Flow):void type: CONSTRUCTOR)
                     in method: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel$maxPlaceHolder$2.b():kotlinx.coroutines.flow.Flow<java.lang.Integer>, file: classes2.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel$maxPlaceHolder$2$invoke$$inlined$map$1, state: NOT_LOADED
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
                    com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel r0 = com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel.this
                    kotlinx.coroutines.flow.MutableStateFlow r0 = r0.i0()
                    com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel$maxPlaceHolder$2$invoke$$inlined$map$1 r1 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel$maxPlaceHolder$2$invoke$$inlined$map$1
                    r1.<init>(r0)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel$maxPlaceHolder$2.invoke():kotlinx.coroutines.flow.Flow");
            }
        });
        this.F = a12;
        this.G = FlowKt.stateIn(FlowKt.flowCombine(MutableStateFlow, MutableStateFlow2, new RangeAttributeFilterViewModel$currentRange$1(this, null)), cs2, SharingStarted.Companion.getEagerly(), new GetListingsBody.FiltrationData.Range(null, null, 3, null));
        this.H = StateFlowKt.MutableStateFlow(null);
        BuildersKt__Builders_commonKt.launch$default(cs2, null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0(Integer num, Integer num2) {
        GetListingsBody.FiltrationData.Range range;
        boolean z11;
        GetListingsBody.FiltrationData.Attribute attribute = (GetListingsBody.FiltrationData.Attribute) n().getValue();
        if (attribute != null) {
            range = attribute.getRange();
        } else {
            range = null;
        }
        if (range == null) {
            range = new GetListingsBody.FiltrationData.Range(null, null, 3, null);
        }
        Integer component1 = range.component1();
        Integer component2 = range.component2();
        if (o.d(component1, num) && o.d(component2, num2)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            return;
        }
        q().b(this.D.getValue(), num, num2, new l<GetListingsBody.FiltrationData.Range, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel$setAttributeRangeAndNotify$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(GetListingsBody.FiltrationData.Range range2) {
                GetListingsBody.FiltrationData.Attribute attribute2;
                Integer attributeId = RangeAttributeFilterViewModel.this.w().getAttributeId();
                if (attributeId != null) {
                    RangeAttributeFilterViewModel rangeAttributeFilterViewModel = RangeAttributeFilterViewModel.this;
                    int intValue = attributeId.intValue();
                    MutableStateFlow n11 = rangeAttributeFilterViewModel.n();
                    if (range2 == null) {
                        attribute2 = null;
                    } else {
                        attribute2 = new GetListingsBody.FiltrationData.Attribute(intValue, AttributeType.NUMBER.getValue(), null, range2.getFrom(), range2.getTo(), 4, null);
                    }
                    n11.setValue(attribute2);
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(GetListingsBody.FiltrationData.Range range2) {
                b(range2);
                return wz.p.f75480a;
            }
        }, new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel$setAttributeRangeAndNotify$2
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
                s11 = RangeAttributeFilterViewModel.this.s();
                s11.o(RangeAttributeFilterViewModel.this);
            }
        });
    }

    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    public Object N(zz.a<? super com.forsale.app.utils.analytics.listingfiltration.a> aVar) {
        GetListingsBody.FiltrationData.Range range;
        GetListingsBody.FiltrationData.Attribute attribute = (GetListingsBody.FiltrationData.Attribute) n().getValue();
        if (attribute != null && (range = attribute.getRange()) != null) {
            return new a.c(x(), range);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object S(zz.a<? super com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData.Range> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel$pullFiltrationRange$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel$pullFiltrationRange$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel$pullFiltrationRange$1) r0
            int r1 = r0.f29383d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29383d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel$pullFiltrationRange$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel$pullFiltrationRange$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f29381b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29383d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f29380a
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel) r0
            kotlin.f.b(r5)
            goto L54
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.f.b(r5)
            com.forsale.app.datalayer.network.responses.ListingsResponse$UISettings$FiltrationSetting r5 = r4.w()
            java.lang.Integer r5 = r5.getAttributeId()
            if (r5 == 0) goto L7f
            int r5 = r5.intValue()
            com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository r2 = r4.f29354x
            r0.f29380a = r4
            r0.f29383d = r3
            java.lang.Object r5 = r2.getExtraAttributesById(r5, r0)
            if (r5 != r1) goto L53
            return r1
        L53:
            r0 = r4
        L54:
            com.forsale.app.datalayer.database.ExtraAttributeEntity r5 = (com.forsale.app.datalayer.database.ExtraAttributeEntity) r5
            r1 = 0
            if (r5 == 0) goto L7d
            kotlinx.coroutines.flow.MutableStateFlow<com.forsale.app.datalayer.database.ExtraAttributeEntity$LocalUnit> r0 = r0.H
            com.forsale.app.datalayer.database.ExtraAttributeEntity$AttrUnit r2 = r5.getUnit()
            if (r2 == 0) goto L65
            com.forsale.app.datalayer.database.ExtraAttributeEntity$LocalUnit r1 = r2.getUnit()
        L65:
            r0.setValue(r1)
            com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Range r1 = new com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Range
            int r0 = r5.getMin()
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.a.d(r0)
            int r5 = r5.getMax()
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)
            r1.<init>(r0, r5)
        L7d:
            if (r1 != 0) goto L90
        L7f:
            com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Range r1 = new com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Range
            r5 = 0
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.a.d(r0)
            r1.<init>(r5, r0)
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel.S(zz.a):java.lang.Object");
    }

    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    public void T() {
        super.T();
        this.B.setValue(null);
        this.C.setValue(null);
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
            l0(num, num2);
        }
    }

    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    /* renamed from: d0 */
    public b q() {
        return this.A;
    }

    public final MutableStateFlow<Integer> e0() {
        return this.C;
    }

    public final Flow<Integer> f0() {
        return (Flow) this.F.getValue();
    }

    public final MutableStateFlow<Integer> g0() {
        return this.B;
    }

    public final Flow<Integer> h0() {
        return (Flow) this.E.getValue();
    }

    public final MutableStateFlow<GetListingsBody.FiltrationData.Range> i0() {
        return this.D;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(zz.a<? super com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel$generateFilterCapsule$1
            if (r0 == 0) goto L13
            r0 = r9
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel$generateFilterCapsule$1 r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel$generateFilterCapsule$1) r0
            int r1 = r0.f29377d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29377d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel$generateFilterCapsule$1 r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel$generateFilterCapsule$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f29375b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f29377d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f29374a
            com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel r0 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel) r0
            kotlin.f.b(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            kotlin.f.b(r9)
            r0.f29374a = r8
            r0.f29377d = r3
            java.lang.Object r9 = r8.S(r0)
            if (r9 != r1) goto L43
            return r1
        L43:
            r0 = r8
        L44:
            com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Range r9 = (com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData.Range) r9
            kotlinx.coroutines.flow.MutableStateFlow r1 = r0.n()
            java.lang.Object r1 = r1.getValue()
            com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Attribute r1 = (com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData.Attribute) r1
            if (r1 == 0) goto L57
            com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData$Range r1 = r1.getRange()
            goto L58
        L57:
            r1 = 0
        L58:
            kotlinx.coroutines.flow.MutableStateFlow<com.forsale.app.datalayer.database.ExtraAttributeEntity$LocalUnit> r2 = r0.H
            java.lang.Object r2 = r2.getValue()
            com.forsale.app.datalayer.database.ExtraAttributeEntity$LocalUnit r2 = (com.forsale.app.datalayer.database.ExtraAttributeEntity.LocalUnit) r2
            fc.a r3 = new fc.a
            java.lang.String r4 = r0.r()
            java.lang.String r5 = r0.x()
            com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterScreenTypes r6 = r0.y()
            java.lang.String r7 = "null cannot be cast to non-null type com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterScreenTypes.NewScreen"
            kotlin.jvm.internal.o.g(r6, r7)
            com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterScreenTypes$NewScreen r6 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterScreenTypes.NewScreen) r6
            com.forsale.app.datalayer.database.CategoryEntity r0 = r0.f29355y
            r3.<init>(r4, r5, r6, r0)
            com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a$c r0 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a$c
            r0.<init>(r9, r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel.j(zz.a):java.lang.Object");
    }

    public final MutableStateFlow<ExtraAttributeEntity.LocalUnit> j0() {
        return this.H;
    }

    @Override // com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel
    /* renamed from: k0 */
    public int G(GetListingsBody.FiltrationData.Attribute<GetListingsBody.FiltrationData.Range> attribute) {
        Integer num;
        Integer num2 = null;
        if (attribute != null) {
            num = attribute.getTo();
        } else {
            num = null;
        }
        if (num == null) {
            if (attribute != null) {
                num2 = attribute.getFrom();
            }
            if (num2 == null) {
                return 0;
            }
        }
        return 1;
    }
}
