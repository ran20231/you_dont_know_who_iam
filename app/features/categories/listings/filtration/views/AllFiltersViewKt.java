package com.forsale.app.features.categories.listings.filtration.views;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import c0.g;
import com.forsale.app.datalayer.database.ExtraAttributeEntity;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterScreenTypes;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterViewType;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.BooleanAttributeFilterViewModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.RangeAttributeFilterViewModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.PriceFilterViewModel;
import com.forsale.designSystem.SurfaceKt;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.chips.ChipsData;
import com.forsale.designSystem.chips.ChipsKt;
import com.forsale.ui.components.flows.FlowKt;
import com.google.android.gms.common.api.Api;
import e2.h;
import fc.b;
import g00.l;
import g00.p;
import g00.q;
import j0.d1;
import j0.e1;
import j0.k;
import j0.n1;
import j0.v0;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import r0.b;
import w.f;
import z0.d;
/* compiled from: AllFiltersView.kt */
/* loaded from: classes2.dex */
public final class AllFiltersViewKt {
    public static final void a(final RangeAttributeFilterViewModel filter, final d focusManager, a aVar, final int i11) {
        o.i(filter, "filter");
        o.i(focusManager, "focusManager");
        a h11 = aVar.h(-977804326);
        if (c.I()) {
            c.U(-977804326, i11, -1, "com.forsale.app.features.categories.listings.filtration.views.AttributeRangeFilter (AllFiltersView.kt:219)");
        }
        n1 a11 = z.a(filter.h0(), 0, null, h11, 56, 2);
        n1 a12 = z.a(filter.f0(), Integer.valueOf((int) Api.BaseClientBuilder.API_PRIORITY_OTHER), null, h11, 56, 2);
        n1 a13 = z.a(filter.j0(), null, null, h11, 56, 2);
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        float f11 = 12;
        SpacerKt.a(SizeKt.i(aVar2, h.l(f11)), h11, 6);
        CommonViewsKt.h(PaddingKt.k(aVar2, h.l(f11), 0.0f, 2, null), focusManager, filter.g0(), filter.e0(), b(a11), c(a12), d(a13), h11, 4678, 0);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$AttributeRangeFilter$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar3, int i12) {
                    AllFiltersViewKt.a(RangeAttributeFilterViewModel.this, focusManager, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    private static final int b(n1<Integer> n1Var) {
        return n1Var.getValue().intValue();
    }

    private static final int c(n1<Integer> n1Var) {
        return n1Var.getValue().intValue();
    }

    private static final ExtraAttributeEntity.LocalUnit d(n1<ExtraAttributeEntity.LocalUnit> n1Var) {
        return n1Var.getValue();
    }

    public static final void e(final BooleanAttributeFilterViewModel filter, a aVar, final int i11) {
        o.i(filter, "filter");
        a h11 = aVar.h(156999463);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(156999463, i11, -1, "com.forsale.app.features.categories.listings.filtration.views.BooleanFilter (AllFiltersView.kt:236)");
        }
        final n1 b11 = z.b(filter.c0(), null, h11, 8, 1);
        float f11 = 8;
        FlowKt.b(PaddingKt.i(androidx.compose.ui.c.f7566a, h.l(12)), null, null, h.l(f11), null, h.l(f11), null, b.b(h11, 532624673, true, new p<a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$BooleanFilter$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void b(a aVar2, int i12) {
                List<dc.c> f12;
                if ((i12 & 11) == 2 && aVar2.i()) {
                    aVar2.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(532624673, i12, -1, "com.forsale.app.features.categories.listings.filtration.views.BooleanFilter.<anonymous> (AllFiltersView.kt:239)");
                }
                f12 = AllFiltersViewKt.f(b11);
                final BooleanAttributeFilterViewModel booleanAttributeFilterViewModel = filter;
                for (final dc.c cVar : f12) {
                    ChipsKt.b(null, ChipsData.f41251a.a(), null, cVar.l().getValue().booleanValue(), false, null, b.b(aVar2, -1484123737, true, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0085: INVOKE  
                          (null androidx.compose.ui.c)
                          (wrap: com.forsale.designSystem.chips.ChipsData : 0x0042: INVOKE  (r2v3 com.forsale.designSystem.chips.ChipsData A[REMOVE]) = 
                          (wrap: com.forsale.designSystem.chips.ChipsData$a : 0x0040: SGET  (r2v2 com.forsale.designSystem.chips.ChipsData$a A[REMOVE]) =  com.forsale.designSystem.chips.ChipsData.a com.forsale.designSystem.chips.ChipsData$a)
                         type: VIRTUAL call: com.forsale.designSystem.chips.ChipsData.a.a():com.forsale.designSystem.chips.ChipsData)
                          (null xj.a)
                          (wrap: boolean : 0x0050: INVOKE  (r4v0 boolean A[REMOVE]) = 
                          (wrap: java.lang.Boolean : 0x004a: INVOKE  (r3v2 java.lang.Boolean A[REMOVE]) = 
                          (wrap: j0.k0<java.lang.Boolean> : 0x0046: INVOKE  (r3v1 j0.k0<java.lang.Boolean> A[REMOVE]) = (r1v7 'cVar' dc.c) type: VIRTUAL call: dc.c.l():j0.k0)
                         type: INTERFACE call: j0.k0.getValue():java.lang.Object)
                         type: VIRTUAL call: java.lang.Boolean.booleanValue():boolean)
                          false
                          (null g00.p)
                          (wrap: r0.a : 0x0061: INVOKE  (r8v1 r0.a A[REMOVE]) = 
                          (r18v0 'aVar2' androidx.compose.runtime.a)
                          (-1484123737 int)
                          true
                          (wrap: g00.p<androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x005a: CONSTRUCTOR  (r8v0 g00.p<androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = (r1v7 'cVar' dc.c A[DONT_INLINE]) call: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$BooleanFilter$1$1$1.<init>(dc.c):void type: CONSTRUCTOR)
                         type: STATIC call: r0.b.b(androidx.compose.runtime.a, int, boolean, java.lang.Object):r0.a)
                          (wrap: r0.a : 0x006d: INVOKE  (r9v2 r0.a A[REMOVE]) = 
                          (r18v0 'aVar2' androidx.compose.runtime.a)
                          (1745876328 int)
                          true
                          (wrap: g00.p<androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x0067: CONSTRUCTOR  (r9v1 g00.p<androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = 
                          (r1v7 'cVar' dc.c A[DONT_INLINE])
                          (r15v0 'booleanAttributeFilterViewModel' com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.BooleanAttributeFilterViewModel A[DONT_INLINE])
                         call: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$BooleanFilter$1$1$2.<init>(dc.c, com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.BooleanAttributeFilterViewModel):void type: CONSTRUCTOR)
                         type: STATIC call: r0.b.b(androidx.compose.runtime.a, int, boolean, java.lang.Object):r0.a)
                          (wrap: g00.l<java.lang.Boolean, wz.p> : 0x0073: CONSTRUCTOR  (r10v1 g00.l<java.lang.Boolean, wz.p> A[REMOVE]) = 
                          (r1v7 'cVar' dc.c A[DONT_INLINE])
                          (r15v0 'booleanAttributeFilterViewModel' com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.BooleanAttributeFilterViewModel A[DONT_INLINE])
                         call: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$BooleanFilter$1$1$3.<init>(dc.c, com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.BooleanAttributeFilterViewModel):void type: CONSTRUCTOR)
                          (null v.k)
                          (r18v0 'aVar2' androidx.compose.runtime.a)
                          (14155776 int)
                          (565 int)
                         type: STATIC call: com.forsale.designSystem.chips.ChipsKt.b(androidx.compose.ui.c, com.forsale.designSystem.chips.ChipsData, xj.a, boolean, boolean, g00.p, g00.p, g00.p, g00.l, v.k, androidx.compose.runtime.a, int, int):void in method: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$BooleanFilter$1.b(androidx.compose.runtime.a, int):void, file: classes2.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:207)
                        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$BooleanFilter$1$1$1, state: NOT_LOADED
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
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1097)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:872)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                        	... 25 more
                        */
                    /*
                        this = this;
                        r0 = r17
                        r14 = r18
                        r1 = r19
                        r2 = r1 & 11
                        r3 = 2
                        if (r2 != r3) goto L17
                        boolean r2 = r18.i()
                        if (r2 != 0) goto L12
                        goto L17
                    L12:
                        r18.L()
                        goto L92
                    L17:
                        boolean r2 = androidx.compose.runtime.c.I()
                        if (r2 == 0) goto L26
                        r2 = -1
                        java.lang.String r3 = "com.forsale.app.features.categories.listings.filtration.views.BooleanFilter.<anonymous> (AllFiltersView.kt:239)"
                        r4 = 532624673(0x1fbf3521, float:8.097954E-20)
                        androidx.compose.runtime.c.U(r4, r1, r2, r3)
                    L26:
                        j0.n1<java.util.List<dc.c>> r1 = r1
                        java.util.List r1 = com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt.t(r1)
                        java.lang.Iterable r1 = (java.lang.Iterable) r1
                        com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.attributeViewModels.BooleanAttributeFilterViewModel r15 = r2
                        java.util.Iterator r16 = r1.iterator()
                    L34:
                        boolean r1 = r16.hasNext()
                        if (r1 == 0) goto L89
                        java.lang.Object r1 = r16.next()
                        dc.c r1 = (dc.c) r1
                        com.forsale.designSystem.chips.ChipsData$a r2 = com.forsale.designSystem.chips.ChipsData.f41251a
                        com.forsale.designSystem.chips.ChipsData r2 = r2.a()
                        j0.k0 r3 = r1.l()
                        java.lang.Object r3 = r3.getValue()
                        java.lang.Boolean r3 = (java.lang.Boolean) r3
                        boolean r4 = r3.booleanValue()
                        r3 = 0
                        r5 = 0
                        r6 = 0
                        r7 = 0
                        com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$BooleanFilter$1$1$1 r8 = new com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$BooleanFilter$1$1$1
                        r8.<init>(r1)
                        r9 = -1484123737(0xffffffffa78a11a7, float:-3.8321833E-15)
                        r10 = 1
                        r0.a r8 = r0.b.b(r14, r9, r10, r8)
                        com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$BooleanFilter$1$1$2 r9 = new com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$BooleanFilter$1$1$2
                        r9.<init>(r1, r15)
                        r11 = 1745876328(0x680ff568, float:2.7193014E24)
                        r0.a r9 = r0.b.b(r14, r11, r10, r9)
                        com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$BooleanFilter$1$1$3 r10 = new com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$BooleanFilter$1$1$3
                        r10.<init>(r1, r15)
                        r11 = 0
                        r12 = 14155776(0xd80000, float:1.9836467E-38)
                        r13 = 565(0x235, float:7.92E-43)
                        r1 = r3
                        r3 = r5
                        r5 = r6
                        r6 = r7
                        r7 = r8
                        r8 = r9
                        r9 = r10
                        r10 = r11
                        r11 = r18
                        com.forsale.designSystem.chips.ChipsKt.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                        goto L34
                    L89:
                        boolean r1 = androidx.compose.runtime.c.I()
                        if (r1 == 0) goto L92
                        androidx.compose.runtime.c.T()
                    L92:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$BooleanFilter$1.b(androidx.compose.runtime.a, int):void");
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            }), h11, 12782598, 86);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new p<a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$BooleanFilter$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(a aVar2, int i12) {
                        AllFiltersViewKt.e(BooleanAttributeFilterViewModel.this, aVar2, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return wz.p.f75480a;
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List<dc.c> f(n1<? extends List<dc.c>> n1Var) {
            return n1Var.getValue();
        }

        public static final void g(final d focusManager, final FilterViewModel<?, ?, ?> filter, final l<? super FilterViewModel<?, ?, ?>, wz.p> onOpenFilterScreenClicked, final p<? super String, ? super String, wz.p> recordSelectionRemoved, a aVar, final int i11) {
            PriceFilterViewModel priceFilterViewModel;
            o.i(focusManager, "focusManager");
            o.i(filter, "filter");
            o.i(onOpenFilterScreenClicked, "onOpenFilterScreenClicked");
            o.i(recordSelectionRemoved, "recordSelectionRemoved");
            a h11 = aVar.h(933081270);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(933081270, i11, -1, "com.forsale.app.features.categories.listings.filtration.views.CreateFilterView (AllFiltersView.kt:43)");
            }
            MutableStateFlow<String> mutableStateFlow = null;
            final n1 b11 = z.b(filter.E(), null, h11, 8, 1);
            if (filter instanceof PriceFilterViewModel) {
                priceFilterViewModel = (PriceFilterViewModel) filter;
            } else {
                priceFilterViewModel = null;
            }
            if (priceFilterViewModel != null) {
                mutableStateFlow = priceFilterViewModel.l0();
            }
            if (mutableStateFlow == null) {
                mutableStateFlow = StateFlowKt.MutableStateFlow("");
            }
            final n1 a11 = z.a(mutableStateFlow, "", null, h11, 56, 2);
            SurfaceKt.c(null, g.c(h.l(8)), dk.a.f54291a.a(h11, dk.a.f54292b).g().c(h11, yj.d.f76453b), 0L, null, h.l(1), b.b(h11, 2004616690, true, new p<a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$CreateFilterView$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar2, int i12) {
                    boolean h12;
                    q<w.c, a, Integer, wz.p> qVar;
                    if ((i12 & 11) == 2 && aVar2.i()) {
                        aVar2.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(2004616690, i12, -1, "com.forsale.app.features.categories.listings.filtration.views.CreateFilterView.<anonymous> (AllFiltersView.kt:53)");
                    }
                    c.a aVar3 = androidx.compose.ui.c.f7566a;
                    androidx.compose.ui.c k11 = PaddingKt.k(aVar3, 0.0f, h.l(12), 1, null);
                    final FilterViewModel<?, ?, ?> filterViewModel = filter;
                    p<String, String, wz.p> pVar = recordSelectionRemoved;
                    d dVar = focusManager;
                    int i13 = i11;
                    n1<Boolean> n1Var = b11;
                    final l<FilterViewModel<?, ?, ?>, wz.p> lVar = onOpenFilterScreenClicked;
                    final n1<String> n1Var2 = a11;
                    aVar2.C(-483455358);
                    a0 a12 = e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), aVar2, 0);
                    aVar2.C(-1323940314);
                    int a13 = j0.e.a(aVar2, 0);
                    k s11 = aVar2.s();
                    ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                    g00.a<ComposeUiNode> a14 = companion.a();
                    q<e1<ComposeUiNode>, a, Integer, wz.p> c11 = LayoutKt.c(k11);
                    if (!(aVar2.k() instanceof j0.d)) {
                        j0.e.c();
                    }
                    aVar2.I();
                    if (aVar2.f()) {
                        aVar2.y(a14);
                    } else {
                        aVar2.t();
                    }
                    a a15 = Updater.a(aVar2);
                    Updater.c(a15, a12, companion.e());
                    Updater.c(a15, s11, companion.g());
                    p<ComposeUiNode, Integer, wz.p> b12 = companion.b();
                    if (a15.f() || !o.d(a15.D(), Integer.valueOf(a13))) {
                        a15.u(Integer.valueOf(a13));
                        a15.p(Integer.valueOf(a13), b12);
                    }
                    c11.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                    aVar2.C(2058660585);
                    f fVar = f.f74891a;
                    h12 = AllFiltersViewKt.h(n1Var);
                    androidx.compose.ui.c e11 = ClickableKt.e(aVar3, !h12, null, null, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00f1: INVOKE  (r3v8 'e11' androidx.compose.ui.c) = 
                          (r9v0 'aVar3' androidx.compose.ui.c$a)
                          (wrap: boolean : ?: NOT  (r1v8 'h12' boolean))
                          (null java.lang.String)
                          (null q1.i)
                          (wrap: g00.a<wz.p> : 0x00e9: CONSTRUCTOR  (r13v4 g00.a<wz.p> A[REMOVE]) = 
                          (r11v0 'lVar' g00.l<com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<?, ?, ?>, wz.p> A[DONT_INLINE])
                          (r7v0 'filterViewModel' com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<?, ?, ?> A[DONT_INLINE])
                         call: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$CreateFilterView$1$1$1.<init>(g00.l, com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel):void type: CONSTRUCTOR)
                          (6 int)
                          (null java.lang.Object)
                         type: STATIC call: androidx.compose.foundation.ClickableKt.e(androidx.compose.ui.c, boolean, java.lang.String, q1.i, g00.a, int, java.lang.Object):androidx.compose.ui.c in method: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$CreateFilterView$1.b(androidx.compose.runtime.a, int):void, file: classes2.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$CreateFilterView$1$1$1, state: NOT_LOADED
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
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                        	... 19 more
                        */
                    /*
                        Method dump skipped, instructions count: 325
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$CreateFilterView$1.b(androidx.compose.runtime.a, int):void");
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            }), h11, 1769472, 25);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new p<a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$CreateFilterView$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(a aVar2, int i12) {
                        AllFiltersViewKt.g(d.this, filter, onOpenFilterScreenClicked, recordSelectionRemoved, aVar2, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return wz.p.f75480a;
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean h(n1<Boolean> n1Var) {
            return n1Var.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String i(n1<String> n1Var) {
            return n1Var.getValue();
        }

        public static final void j(final FilterViewModel<?, ?, ?> filter, final p<? super String, ? super String, wz.p> recordSelectionRemoved, final d focusManager, a aVar, final int i11) {
            o.i(filter, "filter");
            o.i(recordSelectionRemoved, "recordSelectionRemoved");
            o.i(focusManager, "focusManager");
            a h11 = aVar.h(1242752225);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1242752225, i11, -1, "com.forsale.app.features.categories.listings.filtration.views.FilterContent (AllFiltersView.kt:88)");
            }
            FilterScreenTypes y11 = filter.y();
            if (y11 instanceof FilterScreenTypes.NewScreen) {
                h11.C(1501770472);
                n(filter, recordSelectionRemoved, h11, (i11 & 112) | 8);
                h11.S();
            } else if (y11 instanceof FilterScreenTypes.InPlace) {
                h11.C(1501770598);
                m(filter, focusManager, h11, 72);
                h11.S();
            } else {
                h11.C(1501770646);
                h11.S();
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new p<a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$FilterContent$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(a aVar2, int i12) {
                        AllFiltersViewKt.j(filter, recordSelectionRemoved, focusManager, aVar2, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return wz.p.f75480a;
                    }
                });
            }
        }

        public static final void k(final FilterViewModel<?, ?, ?> filter, final boolean z11, a aVar, final int i11) {
            o.i(filter, "filter");
            a h11 = aVar.h(1931643151);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1931643151, i11, -1, "com.forsale.app.features.categories.listings.filtration.views.HorizontalFilter (AllFiltersView.kt:171)");
            }
            final n1 a11 = z.a(filter.p(), b.a.f56209a, null, h11, 56, 2);
            if (!(l(a11) instanceof b.C0620b)) {
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
                d1 l11 = h11.l();
                if (l11 != null) {
                    l11.a(new p<a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$HorizontalFilter$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void b(a aVar2, int i12) {
                            AllFiltersViewKt.k(filter, z11, aVar2, v0.a(i11 | 1));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ wz.p invoke(a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return wz.p.f75480a;
                        }
                    });
                    return;
                }
                return;
            }
            float f11 = 12;
            SpacerKt.a(SizeKt.i(androidx.compose.ui.c.f7566a, h.l(f11)), h11, 6);
            LazyDslKt.b(null, null, PaddingKt.c(h.l(f11), 0.0f, 2, null), false, Arrangement.f3698a.o(h.l(8)), null, null, false, new l<LazyListScope, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$HorizontalFilter$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void b(LazyListScope LazyRow) {
                    fc.b l12;
                    o.i(LazyRow, "$this$LazyRow");
                    l12 = AllFiltersViewKt.l(a11);
                    o.g(l12, "null cannot be cast to non-null type com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.FilterRange.SelectableFilterOptions");
                    final List<dc.c> a12 = ((b.C0620b) l12).a();
                    final boolean z12 = z11;
                    final FilterViewModel<?, ?, ?> filterViewModel = filter;
                    final AllFiltersViewKt$HorizontalFilter$2$invoke$$inlined$items$default$1 allFiltersViewKt$HorizontalFilter$2$invoke$$inlined$items$default$1 = AllFiltersViewKt$HorizontalFilter$2$invoke$$inlined$items$default$1.f30066a;
                    LazyRow.f(a12.size(), null, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0033: INVOKE  
                          (r7v0 'LazyRow' androidx.compose.foundation.lazy.LazyListScope)
                          (wrap: int : 0x001c: INVOKE  (r4v0 int A[REMOVE]) = (r0v4 'a12' java.util.List<dc.c>) type: INTERFACE call: java.util.List.size():int)
                          (null g00.l<? super java.lang.Integer, ? extends java.lang.Object>)
                          (wrap: g00.l<java.lang.Integer, java.lang.Object> : 0x0022: CONSTRUCTOR  (r5v0 g00.l<java.lang.Integer, java.lang.Object> A[REMOVE]) = 
                          (r3v0 'allFiltersViewKt$HorizontalFilter$2$invoke$$inlined$items$default$1' com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$HorizontalFilter$2$invoke$$inlined$items$default$1 A[DONT_INLINE])
                          (r0v4 'a12' java.util.List<dc.c> A[DONT_INLINE])
                         call: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$HorizontalFilter$2$invoke$$inlined$items$default$3.<init>(g00.l, java.util.List):void type: CONSTRUCTOR)
                          (wrap: r0.a : 0x002e: INVOKE  (r0v6 r0.a A[REMOVE]) = 
                          (-632812321 int)
                          true
                          (wrap: g00.r<x.a, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x0027: CONSTRUCTOR  (r3v1 g00.r<x.a, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = 
                          (r0v4 'a12' java.util.List<dc.c> A[DONT_INLINE])
                          (r1v1 'z12' boolean A[DONT_INLINE])
                          (r2v0 'filterViewModel' com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<?, ?, ?> A[DONT_INLINE])
                         call: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$HorizontalFilter$2$invoke$$inlined$items$default$4.<init>(java.util.List, boolean, com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel):void type: CONSTRUCTOR)
                         type: STATIC call: r0.b.c(int, boolean, java.lang.Object):r0.a)
                         type: INTERFACE call: androidx.compose.foundation.lazy.LazyListScope.f(int, g00.l, g00.l, g00.r):void in method: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$HorizontalFilter$2.b(androidx.compose.foundation.lazy.LazyListScope):void, file: classes2.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$HorizontalFilter$2$invoke$$inlined$items$default$3, state: NOT_LOADED
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
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                        	... 15 more
                        */
                    /*
                        this = this;
                        java.lang.String r0 = "$this$LazyRow"
                        kotlin.jvm.internal.o.i(r7, r0)
                        j0.n1<fc.b> r0 = r1
                        fc.b r0 = com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt.w(r0)
                        java.lang.String r1 = "null cannot be cast to non-null type com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.FilterRange.SelectableFilterOptions"
                        kotlin.jvm.internal.o.g(r0, r1)
                        fc.b$b r0 = (fc.b.C0620b) r0
                        java.util.List r0 = r0.a()
                        boolean r1 = r2
                        com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<?, ?, ?> r2 = r3
                        com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$HorizontalFilter$2$invoke$$inlined$items$default$1 r3 = com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$HorizontalFilter$2$invoke$$inlined$items$default$1.f30066a
                        int r4 = r0.size()
                        com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$HorizontalFilter$2$invoke$$inlined$items$default$3 r5 = new com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$HorizontalFilter$2$invoke$$inlined$items$default$3
                        r5.<init>(r3, r0)
                        com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$HorizontalFilter$2$invoke$$inlined$items$default$4 r3 = new com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$HorizontalFilter$2$invoke$$inlined$items$default$4
                        r3.<init>(r0, r1, r2)
                        r0 = -632812321(0xffffffffda480cdf, float:-1.40772868E16)
                        r1 = 1
                        r0.a r0 = r0.b.c(r0, r1, r3)
                        r1 = 0
                        r7.f(r4, r1, r5, r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$HorizontalFilter$2.b(androidx.compose.foundation.lazy.LazyListScope):void");
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(LazyListScope lazyListScope) {
                    b(lazyListScope);
                    return wz.p.f75480a;
                }
            }, h11, 24960, 235);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l12 = h11.l();
            if (l12 != null) {
                l12.a(new p<a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$HorizontalFilter$3
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(a aVar2, int i12) {
                        AllFiltersViewKt.k(filter, z11, aVar2, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return wz.p.f75480a;
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fc.b l(n1<? extends fc.b> n1Var) {
            return n1Var.getValue();
        }

        public static final void m(final FilterViewModel<?, ?, ?> filter, final d focusManager, a aVar, final int i11) {
            o.i(filter, "filter");
            o.i(focusManager, "focusManager");
            a h11 = aVar.h(1690922325);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1690922325, i11, -1, "com.forsale.app.features.categories.listings.filtration.views.InPlaceFilterContent (AllFiltersView.kt:111)");
            }
            FilterScreenTypes y11 = filter.y();
            o.g(y11, "null cannot be cast to non-null type com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterScreenTypes.InPlace");
            FilterScreenTypes.InPlace inPlace = (FilterScreenTypes.InPlace) y11;
            FilterViewType a11 = inPlace.a();
            if (a11 instanceof FilterViewType.FilterSelectionViewType.Horizontal) {
                h11.C(-587006498);
                k(filter, ((FilterViewType.FilterSelectionViewType.Horizontal) inPlace.a()).a(), h11, 8);
                h11.S();
            } else if (a11 instanceof FilterViewType.Bool) {
                h11.C(-587006351);
                e((BooleanAttributeFilterViewModel) filter, h11, 8);
                h11.S();
            } else if (a11 instanceof FilterViewType.Range.Price) {
                h11.C(-587006253);
                o((PriceFilterViewModel) filter, focusManager, h11, 72);
                h11.S();
            } else if (a11 instanceof FilterViewType.Range.RangedAttribute) {
                h11.C(-587006096);
                a((RangeAttributeFilterViewModel) filter, focusManager, h11, 72);
                h11.S();
            } else if (a11 instanceof FilterViewType.FilterSelectionViewType.Vertical) {
                h11.C(-587005915);
                h11.S();
            } else {
                h11.C(-587005905);
                h11.S();
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new p<a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$InPlaceFilterContent$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(a aVar2, int i12) {
                        AllFiltersViewKt.m(filter, focusManager, aVar2, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return wz.p.f75480a;
                    }
                });
            }
        }

        public static final void n(final FilterViewModel<?, ?, ?> filter, final p<? super String, ? super String, wz.p> recordSelectionRemoved, a aVar, final int i11) {
            o.i(filter, "filter");
            o.i(recordSelectionRemoved, "recordSelectionRemoved");
            a h11 = aVar.h(1899245850);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1899245850, i11, -1, "com.forsale.app.features.categories.listings.filtration.views.NewScreenFilterContent (AllFiltersView.kt:101)");
            }
            boolean z11 = true;
            List list = (List) z.b(filter.o(), null, h11, 8, 1).getValue();
            List list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                z11 = false;
            }
            if (z11) {
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
                d1 l11 = h11.l();
                if (l11 != null) {
                    l11.a(new p<a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$NewScreenFilterContent$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void b(a aVar2, int i12) {
                            AllFiltersViewKt.n(filter, recordSelectionRemoved, aVar2, v0.a(i11 | 1));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ wz.p invoke(a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return wz.p.f75480a;
                        }
                    });
                    return;
                }
                return;
            }
            s(list, new l<dc.e, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$NewScreenFilterContent$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void b(dc.e selectedView) {
                    o.i(selectedView, "selectedView");
                    filter.W(selectedView.a());
                    recordSelectionRemoved.invoke(filter.x(), selectedView.c());
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(dc.e eVar) {
                    b(eVar);
                    return wz.p.f75480a;
                }
            }, h11, 8);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l12 = h11.l();
            if (l12 != null) {
                l12.a(new p<a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$NewScreenFilterContent$3
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(a aVar2, int i12) {
                        AllFiltersViewKt.n(filter, recordSelectionRemoved, aVar2, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return wz.p.f75480a;
                    }
                });
            }
        }

        public static final void o(final PriceFilterViewModel filter, final d focusManager, a aVar, final int i11) {
            o.i(filter, "filter");
            o.i(focusManager, "focusManager");
            a h11 = aVar.h(1183577237);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1183577237, i11, -1, "com.forsale.app.features.categories.listings.filtration.views.PriceRangeFilter (AllFiltersView.kt:204)");
            }
            n1 a11 = z.a(filter.i0(), 0, null, h11, 56, 2);
            n1 a12 = z.a(filter.g0(), Integer.valueOf((int) Api.BaseClientBuilder.API_PRIORITY_OTHER), null, h11, 56, 2);
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            float f11 = 12;
            SpacerKt.a(SizeKt.i(aVar2, h.l(f11)), h11, 6);
            CommonViewsKt.h(PaddingKt.k(aVar2, h.l(f11), 0.0f, 2, null), focusManager, filter.h0(), filter.f0(), p(a11), q(a12), null, h11, 4678, 64);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new p<a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$PriceRangeFilter$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(a aVar3, int i12) {
                        AllFiltersViewKt.o(PriceFilterViewModel.this, focusManager, aVar3, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(a aVar3, Integer num) {
                        b(aVar3, num.intValue());
                        return wz.p.f75480a;
                    }
                });
            }
        }

        private static final int p(n1<Integer> n1Var) {
            return n1Var.getValue().intValue();
        }

        private static final int q(n1<Integer> n1Var) {
            return n1Var.getValue().intValue();
        }

        public static final void r(final dc.e selectedView, final l<? super Integer, wz.p> onRemove, a aVar, final int i11) {
            final int i12;
            int i13;
            int i14;
            o.i(selectedView, "selectedView");
            o.i(onRemove, "onRemove");
            a h11 = aVar.h(803736183);
            if ((i11 & 14) == 0) {
                if (h11.T(selectedView)) {
                    i14 = 4;
                } else {
                    i14 = 2;
                }
                i12 = i14 | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 112) == 0) {
                if (h11.F(onRemove)) {
                    i13 = 32;
                } else {
                    i13 = 16;
                }
                i12 |= i13;
            }
            if ((i12 & 91) == 18 && h11.i()) {
                h11.L();
            } else {
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(803736183, i12, -1, "com.forsale.app.features.categories.listings.filtration.views.SelectableChips (AllFiltersView.kt:155)");
                }
                ChipsKt.c(null, r0.b.b(h11, -1079637940, true, new p<a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$SelectableChips$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(2);
                    }

                    public final void b(a aVar2, int i15) {
                        if ((i15 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-1079637940, i15, -1, "com.forsale.app.features.categories.listings.filtration.views.SelectableChips.<anonymous> (AllFiltersView.kt:157)");
                        }
                        String b11 = dc.e.this.b();
                        dk.a aVar3 = dk.a.f54291a;
                        int i16 = dk.a.f54292b;
                        TextKt.a(b11, null, 0, 0, false, 0, 0, null, aVar3.c(aVar2, i16).c(), aVar3.a(aVar2, i16).e().m(aVar2, yj.d.f76453b), 0, aVar2, 0, 0, 1278);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return wz.p.f75480a;
                    }
                }), r0.b.b(h11, -1385272469, true, new p<a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$SelectableChips$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r12v0, types: [androidx.compose.runtime.a] */
                    /* JADX WARN: Type inference failed for: r7v3 */
                    public final void b(a aVar2, int i15) {
                        if ((i15 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-1385272469, i15, -1, "com.forsale.app.features.categories.listings.filtration.views.SelectableChips.<anonymous> (AllFiltersView.kt:163)");
                        }
                        Painter d11 = p1.e.d(sj.d.f68681r, aVar2, 0);
                        c.a aVar3 = androidx.compose.ui.c.f7566a;
                        final l<Integer, wz.p> lVar = onRemove;
                        final dc.e eVar = selectedView;
                        aVar2.C(511388516);
                        boolean T = aVar2.T(lVar) | aVar2.T(eVar);
                        Object D = aVar2.D();
                        if (T || D == a.f7182a.a()) {
                            D = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004e: CONSTRUCTOR  (r7v2 'D' java.lang.Object) = (r13v2 'lVar' g00.l<java.lang.Integer, wz.p> A[DONT_INLINE]), (r0v3 'eVar' dc.e A[DONT_INLINE]) call: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$SelectableChips$2$1$1.<init>(g00.l, dc.e):void type: CONSTRUCTOR in method: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$SelectableChips$2.b(androidx.compose.runtime.a, int):void, file: classes2.dex
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
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$SelectableChips$2$1$1, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                                	... 25 more
                                */
                            /*
                                this = this;
                                r0 = r13 & 11
                                r1 = 2
                                if (r0 != r1) goto L10
                                boolean r0 = r12.i()
                                if (r0 != 0) goto Lc
                                goto L10
                            Lc:
                                r12.L()
                                goto L77
                            L10:
                                boolean r0 = androidx.compose.runtime.c.I()
                                if (r0 == 0) goto L1f
                                r0 = -1
                                java.lang.String r1 = "com.forsale.app.features.categories.listings.filtration.views.SelectableChips.<anonymous> (AllFiltersView.kt:163)"
                                r2 = -1385272469(0xffffffffad6e6b6b, float:-1.3552585E-11)
                                androidx.compose.runtime.c.U(r2, r13, r0, r1)
                            L1f:
                                int r13 = sj.d.f68681r
                                r0 = 0
                                androidx.compose.ui.graphics.painter.Painter r1 = p1.e.d(r13, r12, r0)
                                androidx.compose.ui.c$a r2 = androidx.compose.ui.c.f7566a
                                r3 = 0
                                r4 = 0
                                r5 = 0
                                g00.l<java.lang.Integer, wz.p> r13 = r1
                                dc.e r0 = r2
                                r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
                                r12.C(r6)
                                boolean r6 = r12.T(r13)
                                boolean r7 = r12.T(r0)
                                r6 = r6 | r7
                                java.lang.Object r7 = r12.D()
                                if (r6 != 0) goto L4c
                                androidx.compose.runtime.a$a r6 = androidx.compose.runtime.a.f7182a
                                java.lang.Object r6 = r6.a()
                                if (r7 != r6) goto L54
                            L4c:
                                com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$SelectableChips$2$1$1 r7 = new com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$SelectableChips$2$1$1
                                r7.<init>(r13, r0)
                                r12.u(r7)
                            L54:
                                r12.S()
                                r6 = r7
                                g00.a r6 = (g00.a) r6
                                r7 = 7
                                r8 = 0
                                androidx.compose.ui.c r2 = androidx.compose.foundation.ClickableKt.e(r2, r3, r4, r5, r6, r7, r8)
                                java.lang.String r3 = "remove selected items"
                                r4 = 0
                                r6 = 0
                                r7 = 0
                                r9 = 392(0x188, float:5.5E-43)
                                r10 = 56
                                r8 = r12
                                com.forsale.designSystem.iconography.IconKt.a(r1, r2, r3, r4, r6, r7, r8, r9, r10)
                                boolean r12 = androidx.compose.runtime.c.I()
                                if (r12 == 0) goto L77
                                androidx.compose.runtime.c.T()
                            L77:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$SelectableChips$2.b(androidx.compose.runtime.a, int):void");
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ wz.p invoke(a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return wz.p.f75480a;
                        }
                    }), null, true, false, null, null, h11, 25008, 233);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }
                d1 l11 = h11.l();
                if (l11 != null) {
                    l11.a(new p<a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$SelectableChips$3
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void b(a aVar2, int i15) {
                            AllFiltersViewKt.r(dc.e.this, onRemove, aVar2, v0.a(i11 | 1));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ wz.p invoke(a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return wz.p.f75480a;
                        }
                    });
                }
            }

            public static final void s(final List<dc.e> selectedViews, final l<? super dc.e, wz.p> onRemoveSelectionClicked, a aVar, final int i11) {
                o.i(selectedViews, "selectedViews");
                o.i(onRemoveSelectionClicked, "onRemoveSelectionClicked");
                a h11 = aVar.h(1111485155);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(1111485155, i11, -1, "com.forsale.app.features.categories.listings.filtration.views.SelectedOptions (AllFiltersView.kt:135)");
                }
                float f11 = 12;
                LazyDslKt.b(PaddingKt.m(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), 0.0f, h.l(f11), 0.0f, 0.0f, 13, null), LazyListStateKt.c(0, 0, h11, 0, 3), PaddingKt.c(h.l(f11), 0.0f, 2, null), false, Arrangement.f3698a.o(h.l(8)), null, null, false, new l<LazyListScope, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$SelectedOptions$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void b(LazyListScope LazyRow) {
                        o.i(LazyRow, "$this$LazyRow");
                        final List<dc.e> list = selectedViews;
                        final l<dc.e, wz.p> lVar = onRemoveSelectionClicked;
                        final int i12 = i11;
                        final AllFiltersViewKt$SelectedOptions$1$invoke$$inlined$items$default$1 allFiltersViewKt$SelectedOptions$1$invoke$$inlined$items$default$1 = AllFiltersViewKt$SelectedOptions$1$invoke$$inlined$items$default$1.f30072a;
                        LazyRow.f(list.size(), null, 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0024: INVOKE  
                              (r7v0 'LazyRow' androidx.compose.foundation.lazy.LazyListScope)
                              (wrap: int : 0x000d: INVOKE  (r4v0 int A[REMOVE]) = (r0v1 'list' java.util.List<dc.e>) type: INTERFACE call: java.util.List.size():int)
                              (null g00.l<? super java.lang.Integer, ? extends java.lang.Object>)
                              (wrap: g00.l<java.lang.Integer, java.lang.Object> : 0x0013: CONSTRUCTOR  (r5v0 g00.l<java.lang.Integer, java.lang.Object> A[REMOVE]) = 
                              (r3v0 'allFiltersViewKt$SelectedOptions$1$invoke$$inlined$items$default$1' com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$SelectedOptions$1$invoke$$inlined$items$default$1 A[DONT_INLINE])
                              (r0v1 'list' java.util.List<dc.e> A[DONT_INLINE])
                             call: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$SelectedOptions$1$invoke$$inlined$items$default$3.<init>(g00.l, java.util.List):void type: CONSTRUCTOR)
                              (wrap: r0.a : 0x001f: INVOKE  (r0v3 r0.a A[REMOVE]) = 
                              (-632812321 int)
                              true
                              (wrap: g00.r<x.a, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x0018: CONSTRUCTOR  (r3v1 g00.r<x.a, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = 
                              (r0v1 'list' java.util.List<dc.e> A[DONT_INLINE])
                              (r1v0 'lVar' g00.l<dc.e, wz.p> A[DONT_INLINE])
                              (r2v0 'i12' int A[DONT_INLINE])
                             call: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$SelectedOptions$1$invoke$$inlined$items$default$4.<init>(java.util.List, g00.l, int):void type: CONSTRUCTOR)
                             type: STATIC call: r0.b.c(int, boolean, java.lang.Object):r0.a)
                             type: INTERFACE call: androidx.compose.foundation.lazy.LazyListScope.f(int, g00.l, g00.l, g00.r):void in method: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$SelectedOptions$1.b(androidx.compose.foundation.lazy.LazyListScope):void, file: classes2.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$SelectedOptions$1$invoke$$inlined$items$default$3, state: NOT_LOADED
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
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                            	... 15 more
                            */
                        /*
                            this = this;
                            java.lang.String r0 = "$this$LazyRow"
                            kotlin.jvm.internal.o.i(r7, r0)
                            java.util.List<dc.e> r0 = r1
                            g00.l<dc.e, wz.p> r1 = r2
                            int r2 = r3
                            com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$SelectedOptions$1$invoke$$inlined$items$default$1 r3 = com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$SelectedOptions$1$invoke$$inlined$items$default$1.f30072a
                            int r4 = r0.size()
                            com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$SelectedOptions$1$invoke$$inlined$items$default$3 r5 = new com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$SelectedOptions$1$invoke$$inlined$items$default$3
                            r5.<init>(r3, r0)
                            com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$SelectedOptions$1$invoke$$inlined$items$default$4 r3 = new com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$SelectedOptions$1$invoke$$inlined$items$default$4
                            r3.<init>(r0, r1, r2)
                            r0 = -632812321(0xffffffffda480cdf, float:-1.40772868E16)
                            r1 = 1
                            r0.a r0 = r0.b.c(r0, r1, r3)
                            r1 = 0
                            r7.f(r4, r1, r5, r0)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$SelectedOptions$1.b(androidx.compose.foundation.lazy.LazyListScope):void");
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ wz.p invoke(LazyListScope lazyListScope) {
                        b(lazyListScope);
                        return wz.p.f75480a;
                    }
                }, h11, 24966, 232);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
                d1 l11 = h11.l();
                if (l11 != null) {
                    l11.a(new p<a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.AllFiltersViewKt$SelectedOptions$2
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void b(a aVar2, int i12) {
                            AllFiltersViewKt.s(selectedViews, onRemoveSelectionClicked, aVar2, v0.a(i11 | 1));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ wz.p invoke(a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return wz.p.f75480a;
                        }
                    });
                }
            }
        }
