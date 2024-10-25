package com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.chips.ChipsKt;
import com.forsale.designSystem.iconography.IconKt;
import com.forsale.ui.components.flows.FlowKt;
import e2.h;
import g00.l;
import g00.q;
import j0.d;
import j0.d1;
import j0.e1;
import j0.k;
import j0.k0;
import j0.n1;
import j0.v0;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
import kotlin.text.s;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import p1.g;
import t9.y0;
import v0.b;
import w.f;
import w.u;
import wz.p;
/* compiled from: LocationFilterBSView.kt */
/* loaded from: classes2.dex */
public final class LocationFilterBSViewKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v22 */
    public static final void a(final c modifier, final LocationFilterViewModel viewModel, androidx.compose.runtime.a aVar, final int i11) {
        List n11;
        List n12;
        List n13;
        List n14;
        boolean v11;
        o.i(modifier, "modifier");
        o.i(viewModel, "viewModel");
        androidx.compose.runtime.a h11 = aVar.h(1403677141);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1403677141, i11, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationBottomSheetContent (LocationFilterBSView.kt:34)");
        }
        MutableStateFlow<List<LocationTreeNode>> S0 = viewModel.S0();
        n11 = r.n();
        n1 a11 = z.a(S0, n11, null, h11, 56, 2);
        final n1 a12 = z.a(viewModel.K0(), null, null, h11, 56, 2);
        n1 a13 = z.a(viewModel.R0(), "", null, h11, 56, 2);
        Flow<List<String>> H0 = viewModel.H0();
        n12 = r.n();
        n1 a14 = z.a(H0, n12, null, h11, 56, 2);
        Flow<List<LocationTreeNode>> O0 = viewModel.O0();
        n13 = r.n();
        n1 a15 = z.a(O0, n13, null, h11, 56, 2);
        Flow<List<LocationTreeNode>> N0 = viewModel.N0();
        n14 = r.n();
        n1 a16 = z.a(N0, n14, null, h11, 56, 2);
        c f11 = SizeKt.f(androidx.compose.ui.input.nestedscroll.a.b(modifier, aj.c.e(null, h11, 0, 1), null, 2, null), 0.0f, 1, null);
        h11.C(-483455358);
        Arrangement arrangement = Arrangement.f3698a;
        Arrangement.m h12 = arrangement.h();
        b.a aVar2 = v0.b.f74009a;
        a0 a17 = e.a(h12, aVar2.k(), h11, 0);
        h11.C(-1323940314);
        int a18 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a19 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(f11);
        if (!(h11.k() instanceof d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a19);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a21 = Updater.a(h11);
        Updater.c(a21, a17, companion.e());
        Updater.c(a21, s11, companion.g());
        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
        if (a21.f() || !o.d(a21.D(), Integer.valueOf(a18))) {
            a21.u(Integer.valueOf(a18));
            a21.p(Integer.valueOf(a18), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        c b12 = BackgroundKt.b(SizeKt.f(c.f7566a, 0.0f, 1, null), dk.a.f54291a.a(h11, dk.a.f54292b).e().h(h11, yj.d.f76453b), null, 2, null);
        Arrangement.f o11 = arrangement.o(h.l(16));
        h11.C(-483455358);
        a0 a22 = e.a(o11, aVar2.k(), h11, 6);
        h11.C(-1323940314);
        int a23 = j0.e.a(h11, 0);
        k s12 = h11.s();
        g00.a<ComposeUiNode> a24 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(b12);
        if (!(h11.k() instanceof d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a24);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a25 = Updater.a(h11);
        Updater.c(a25, a22, companion.e());
        Updater.c(a25, s12, companion.g());
        g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
        if (a25.f() || !o.d(a25.D(), Integer.valueOf(a23))) {
            a25.u(Integer.valueOf(a23));
            a25.p(Integer.valueOf(a23), b13);
        }
        c12.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        o(b(a11), new l<LocationTreeNode, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$LocationBottomSheetContent$1$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(LocationTreeNode it2) {
                LocationTreeNode c13;
                o.i(it2, "it");
                LocationFilterViewModel.this.W0(it2);
                c13 = LocationFilterBSViewKt.c(a12);
                if (c13 != null) {
                    c13.o(it2, false);
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(LocationTreeNode locationTreeNode) {
                b(locationTreeNode);
                return p.f75480a;
            }
        }, h11, 8);
        v11 = s.v(d(a13));
        if (v11) {
            h11.C(510546638);
            List<LocationTreeNode> f12 = f(a15);
            List<LocationTreeNode> g11 = g(a16);
            boolean z11 = !b(a11).isEmpty();
            l<LocationTreeNode, p> lVar = new l<LocationTreeNode, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$LocationBottomSheetContent$1$1$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(LocationTreeNode it2) {
                    o.i(it2, "it");
                    LocationFilterViewModel.this.G0(it2);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(LocationTreeNode locationTreeNode) {
                    b(locationTreeNode);
                    return p.f75480a;
                }
            };
            h11.C(1157296644);
            boolean T = h11.T(a12);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new l<LocationTreeNode, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$LocationBottomSheetContent$1$1$3$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(LocationTreeNode it2) {
                        LocationTreeNode c13;
                        o.i(it2, "it");
                        c13 = LocationFilterBSViewKt.c(a12);
                        if (c13 != null) {
                            c13.o(it2, true);
                        }
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(LocationTreeNode locationTreeNode) {
                        b(locationTreeNode);
                        return p.f75480a;
                    }
                };
                h11.u(D);
            }
            h11.S();
            j(f12, g11, z11, lVar, D, h11, 72);
            h11.S();
        } else {
            h11.C(510547101);
            if (c(a12) != null) {
                LocationTreeNode c13 = c(a12);
                o.f(c13);
                List<String> e11 = e(a14);
                boolean z12 = !b(a11).isEmpty();
                h11.C(1157296644);
                boolean T2 = h11.T(a12);
                Object D2 = h11.D();
                if (T2 || D2 == androidx.compose.runtime.a.f7182a.a()) {
                    D2 = new l<LocationTreeNode, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$LocationBottomSheetContent$1$1$4$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void b(LocationTreeNode it2) {
                            LocationTreeNode c14;
                            o.i(it2, "it");
                            c14 = LocationFilterBSViewKt.c(a12);
                            if (c14 != null) {
                                c14.o(it2, true);
                            }
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ p invoke(LocationTreeNode locationTreeNode) {
                            b(locationTreeNode);
                            return p.f75480a;
                        }
                    };
                    h11.u(D2);
                }
                h11.S();
                l(c13, e11, z12, (l) D2, h11, 72);
            }
            h11.S();
        }
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$LocationBottomSheetContent$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i12) {
                    LocationFilterBSViewKt.a(c.this, viewModel, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    private static final List<LocationTreeNode> b(n1<? extends List<LocationTreeNode>> n1Var) {
        return n1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocationTreeNode c(n1<LocationTreeNode> n1Var) {
        return n1Var.getValue();
    }

    private static final String d(n1<String> n1Var) {
        return n1Var.getValue();
    }

    private static final List<String> e(n1<? extends List<String>> n1Var) {
        return n1Var.getValue();
    }

    private static final List<LocationTreeNode> f(n1<? extends List<LocationTreeNode>> n1Var) {
        return n1Var.getValue();
    }

    private static final List<LocationTreeNode> g(n1<? extends List<LocationTreeNode>> n1Var) {
        return n1Var.getValue();
    }

    public static final void h(final String title, final List<LocationTreeNode> locationsList, l<? super LocationTreeNode, p> lVar, final l<? super LocationTreeNode, p> onItemSelected, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        l<? super LocationTreeNode, p> lVar2;
        o.i(title, "title");
        o.i(locationsList, "locationsList");
        o.i(onItemSelected, "onItemSelected");
        androidx.compose.runtime.a h11 = aVar.h(707454293);
        if ((i12 & 4) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(707454293, i11, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationsChips (LocationFilterBSView.kt:155)");
        }
        Arrangement.f o11 = Arrangement.f3698a.o(h.l(12));
        h11.C(-483455358);
        c.a aVar2 = c.f7566a;
        a0 a11 = e.a(o11, v0.b.f74009a.k(), h11, 6);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar2);
        if (!(h11.k() instanceof d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a13);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a14 = Updater.a(h11);
        Updater.c(a14, a11, companion.e());
        Updater.c(a14, s11, companion.g());
        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        dk.a aVar3 = dk.a.f54291a;
        int i13 = dk.a.f54292b;
        final l<? super LocationTreeNode, p> lVar3 = lVar2;
        TextKt.a(title, null, 0, 0, false, 0, 0, null, aVar3.c(h11, i13).c(), aVar3.a(h11, i13).e().j(h11, yj.d.f76453b), 0, h11, i11 & 14, 0, 1278);
        float f11 = 8;
        FlowKt.b(null, null, null, h.l(f11), null, h.l(f11), null, r0.b.b(h11, -1365876379, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$LocationsChips$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar4, int i14) {
                if ((i14 & 11) == 2 && aVar4.i()) {
                    aVar4.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-1365876379, i14, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationsChips.<anonymous>.<anonymous> (LocationFilterBSView.kt:163)");
                }
                if (lVar3 != null) {
                    aVar4.C(588534998);
                    final l<LocationTreeNode, p> lVar4 = lVar3;
                    final l<LocationTreeNode, p> lVar5 = onItemSelected;
                    for (final LocationTreeNode locationTreeNode : locationsList) {
                        ChipsKt.c(null, r0.b.b(aVar4, -1981684311, true, 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0079: INVOKE  
                              (null androidx.compose.ui.c)
                              (wrap: r0.a : 0x0052: INVOKE  (r3v4 r0.a A[REMOVE]) = 
                              (r18v0 'aVar4' androidx.compose.runtime.a)
                              (-1981684311 int)
                              true
                              (wrap: g00.p<androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x004c: CONSTRUCTOR  (r3v3 g00.p<androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = 
                              (r1v15 'locationTreeNode' com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode A[DONT_INLINE])
                             call: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$LocationsChips$1$1$1$1.<init>(com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode):void type: CONSTRUCTOR)
                             type: STATIC call: r0.b.b(androidx.compose.runtime.a, int, boolean, java.lang.Object):r0.a)
                              (wrap: r0.a : 0x005e: INVOKE  (r4v5 r0.a A[REMOVE]) = 
                              (r18v0 'aVar4' androidx.compose.runtime.a)
                              (-154185272 int)
                              true
                              (wrap: g00.p<androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x0058: CONSTRUCTOR  (r4v4 g00.p<androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = 
                              (r14v0 'lVar4' g00.l<com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode, wz.p> A[DONT_INLINE])
                              (r1v15 'locationTreeNode' com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode A[DONT_INLINE])
                             call: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$LocationsChips$1$1$1$2.<init>(g00.l, com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode):void type: CONSTRUCTOR)
                             type: STATIC call: r0.b.b(androidx.compose.runtime.a, int, boolean, java.lang.Object):r0.a)
                              (null xj.a)
                              false
                              false
                              (wrap: g00.l<java.lang.Boolean, wz.p> : 0x0067: CONSTRUCTOR  (r8v1 g00.l<java.lang.Boolean, wz.p> A[REMOVE]) = 
                              (r15v0 'lVar5' g00.l<com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode, wz.p> A[DONT_INLINE])
                              (r1v15 'locationTreeNode' com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode A[DONT_INLINE])
                             call: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$LocationsChips$1$1$1$3.<init>(g00.l, com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode):void type: CONSTRUCTOR)
                              (null v.k)
                              (r18v0 'aVar4' androidx.compose.runtime.a)
                              (432 int)
                              (185 int)
                             type: STATIC call: com.forsale.designSystem.chips.ChipsKt.c(androidx.compose.ui.c, g00.p, g00.p, xj.a, boolean, boolean, g00.l, v.k, androidx.compose.runtime.a, int, int):void in method: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$LocationsChips$1$1.b(androidx.compose.runtime.a, int):void, file: classes2.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$LocationsChips$1$1$1$1, state: NOT_LOADED
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
                            	... 31 more
                            */
                        /*
                            this = this;
                            r0 = r17
                            r12 = r18
                            r1 = r19
                            r2 = r1 & 11
                            r3 = 2
                            if (r2 != r3) goto L17
                            boolean r2 = r18.i()
                            if (r2 != 0) goto L12
                            goto L17
                        L12:
                            r18.L()
                            goto Lce
                        L17:
                            boolean r2 = androidx.compose.runtime.c.I()
                            if (r2 == 0) goto L26
                            r2 = -1
                            java.lang.String r3 = "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationsChips.<anonymous>.<anonymous> (LocationFilterBSView.kt:163)"
                            r4 = -1365876379(0xffffffffae966165, float:-6.838511E-11)
                            androidx.compose.runtime.c.U(r4, r1, r2, r3)
                        L26:
                            g00.l<com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode, wz.p> r1 = r1
                            r13 = 1
                            if (r1 == 0) goto L81
                            r1 = 588534998(0x231454d6, float:8.041061E-18)
                            r12.C(r1)
                            java.util.List<com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode> r1 = r2
                            java.lang.Iterable r1 = (java.lang.Iterable) r1
                            g00.l<com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode, wz.p> r14 = r1
                            g00.l<com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode, wz.p> r15 = r3
                            java.util.Iterator r16 = r1.iterator()
                        L3d:
                            boolean r1 = r16.hasNext()
                            if (r1 == 0) goto L7d
                            java.lang.Object r1 = r16.next()
                            com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode r1 = (com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode) r1
                            r2 = 0
                            com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$LocationsChips$1$1$1$1 r3 = new com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$LocationsChips$1$1$1$1
                            r3.<init>(r1)
                            r4 = -1981684311(0xffffffff89e1e5a9, float:-5.438275E-33)
                            r0.a r3 = r0.b.b(r12, r4, r13, r3)
                            com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$LocationsChips$1$1$1$2 r4 = new com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$LocationsChips$1$1$1$2
                            r4.<init>(r14, r1)
                            r5 = -154185272(0xfffffffff6cf51c8, float:-2.1024691E33)
                            r0.a r4 = r0.b.b(r12, r5, r13, r4)
                            r5 = 0
                            r6 = 0
                            r7 = 0
                            com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$LocationsChips$1$1$1$3 r8 = new com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$LocationsChips$1$1$1$3
                            r8.<init>(r15, r1)
                            r9 = 0
                            r10 = 432(0x1b0, float:6.05E-43)
                            r11 = 185(0xb9, float:2.59E-43)
                            r1 = r2
                            r2 = r3
                            r3 = r4
                            r4 = r5
                            r5 = r6
                            r6 = r7
                            r7 = r8
                            r8 = r9
                            r9 = r18
                            com.forsale.designSystem.chips.ChipsKt.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                            goto L3d
                        L7d:
                            r18.S()
                            goto Lc5
                        L81:
                            r1 = 588535827(0x23145813, float:8.0417465E-18)
                            r12.C(r1)
                            java.util.List<com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode> r1 = r2
                            java.lang.Iterable r1 = (java.lang.Iterable) r1
                            g00.l<com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode, wz.p> r10 = r3
                            java.util.Iterator r11 = r1.iterator()
                        L91:
                            boolean r1 = r11.hasNext()
                            if (r1 == 0) goto Lc2
                            java.lang.Object r1 = r11.next()
                            com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode r1 = (com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode) r1
                            r2 = 0
                            r3 = 0
                            com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$LocationsChips$1$1$2$1 r4 = new com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$LocationsChips$1$1$2$1
                            r4.<init>(r1)
                            r5 = -1938479033(0xffffffff8c752847, float:-1.8886234E-31)
                            r0.a r4 = r0.b.b(r12, r5, r13, r4)
                            r5 = 0
                            com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$LocationsChips$1$1$2$2 r6 = new com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$LocationsChips$1$1$2$2
                            r6.<init>(r10, r1)
                            r7 = 0
                            r8 = 384(0x180, float:5.38E-43)
                            r9 = 43
                            r1 = r2
                            r2 = r3
                            r3 = r4
                            r4 = r5
                            r5 = r6
                            r6 = r7
                            r7 = r18
                            com.forsale.designSystem.chips.ChipsKt.d(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                            goto L91
                        Lc2:
                            r18.S()
                        Lc5:
                            boolean r1 = androidx.compose.runtime.c.I()
                            if (r1 == 0) goto Lce
                            androidx.compose.runtime.c.T()
                        Lce:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$LocationsChips$1$1.b(androidx.compose.runtime.a, int):void");
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                        b(aVar4, num.intValue());
                        return p.f75480a;
                    }
                }), h11, 12782592, 87);
                h11.S();
                h11.w();
                h11.S();
                h11.S();
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
                d1 l11 = h11.l();
                if (l11 != null) {
                    l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$LocationsChips$2
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar4, int i14) {
                            LocationFilterBSViewKt.h(title, locationsList, lVar3, onItemSelected, aVar4, v0.a(i11 | 1), i12);
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                            b(aVar4, num.intValue());
                            return p.f75480a;
                        }
                    });
                }
            }

            public static final void i(final List<LocationTreeNode> randomLocations, final boolean z11, final l<? super LocationTreeNode, p> onItemSelected, androidx.compose.runtime.a aVar, final int i11) {
                o.i(randomLocations, "randomLocations");
                o.i(onItemSelected, "onItemSelected");
                androidx.compose.runtime.a h11 = aVar.h(1300423413);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(1300423413, i11, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.RandomLocations (LocationFilterBSView.kt:135)");
                }
                if (!randomLocations.isEmpty()) {
                    h11.C(-245399162);
                    if (z11) {
                        p(h11, 0);
                    }
                    h11.S();
                    SpacerKt.a(SizeKt.i(c.f7566a, h.l(16)), h11, 6);
                    h(g.b(y0.f70466g4, h11, 0), randomLocations, null, onItemSelected, h11, ((i11 << 3) & 7168) | 64, 4);
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
                d1 l11 = h11.l();
                if (l11 != null) {
                    l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$RandomLocations$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar2, int i12) {
                            LocationFilterBSViewKt.i(randomLocations, z11, onItemSelected, aVar2, v0.a(i11 | 1));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return p.f75480a;
                        }
                    });
                }
            }

            public static final void j(final List<LocationTreeNode> recentLocations, final List<LocationTreeNode> randomLocations, final boolean z11, final l<? super LocationTreeNode, p> onRecentDeleted, final l<? super LocationTreeNode, p> onItemSelected, androidx.compose.runtime.a aVar, final int i11) {
                boolean z12;
                o.i(recentLocations, "recentLocations");
                o.i(randomLocations, "randomLocations");
                o.i(onRecentDeleted, "onRecentDeleted");
                o.i(onItemSelected, "onItemSelected");
                androidx.compose.runtime.a h11 = aVar.h(-519248486);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-519248486, i11, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.RecentAndRandomLocations (LocationFilterBSView.kt:87)");
                }
                c.a aVar2 = c.f7566a;
                float f11 = 16;
                c m11 = PaddingKt.m(ScrollKt.f(aVar2, ScrollKt.c(0, h11, 0, 1), false, null, false, 14, null), h.l(f11), 0.0f, h.l(f11), h.l(f11), 2, null);
                h11.C(-483455358);
                a0 a11 = e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), h11, 0);
                h11.C(-1323940314);
                int a12 = j0.e.a(h11, 0);
                k s11 = h11.s();
                ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                g00.a<ComposeUiNode> a13 = companion.a();
                q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(m11);
                if (!(h11.k() instanceof d)) {
                    j0.e.c();
                }
                h11.I();
                if (h11.f()) {
                    h11.y(a13);
                } else {
                    h11.t();
                }
                androidx.compose.runtime.a a14 = Updater.a(h11);
                Updater.c(a14, a11, companion.e());
                Updater.c(a14, s11, companion.g());
                g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
                if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                    a14.u(Integer.valueOf(a12));
                    a14.p(Integer.valueOf(a12), b11);
                }
                c11.invoke(e1.a(e1.b(h11)), h11, 0);
                h11.C(2058660585);
                f fVar = f.f74891a;
                int i12 = i11 >> 3;
                k(recentLocations, z11, onRecentDeleted, onItemSelected, h11, (i12 & 112) | 8 | (i12 & 896) | (i12 & 7168));
                h11.C(-703493151);
                List<LocationTreeNode> list = recentLocations;
                if (!list.isEmpty()) {
                    SpacerKt.a(SizeKt.i(aVar2, h.l(f11)), h11, 6);
                }
                h11.S();
                if (!(!list.isEmpty()) && !z11) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                i(randomLocations, z12, onItemSelected, h11, ((i11 >> 6) & 896) | 8);
                h11.S();
                h11.w();
                h11.S();
                h11.S();
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
                d1 l11 = h11.l();
                if (l11 != null) {
                    l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$RecentAndRandomLocations$2
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar3, int i13) {
                            LocationFilterBSViewKt.j(recentLocations, randomLocations, z11, onRecentDeleted, onItemSelected, aVar3, v0.a(i11 | 1));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                            b(aVar3, num.intValue());
                            return p.f75480a;
                        }
                    });
                }
            }

            public static final void k(final List<LocationTreeNode> recentLocations, final boolean z11, final l<? super LocationTreeNode, p> onRecentDeleted, final l<? super LocationTreeNode, p> onItemSelected, androidx.compose.runtime.a aVar, final int i11) {
                o.i(recentLocations, "recentLocations");
                o.i(onRecentDeleted, "onRecentDeleted");
                o.i(onItemSelected, "onItemSelected");
                androidx.compose.runtime.a h11 = aVar.h(1917094362);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(1917094362, i11, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.RecentLocations (LocationFilterBSView.kt:116)");
                }
                if (!recentLocations.isEmpty()) {
                    h11.C(-1655192830);
                    if (z11) {
                        p(h11, 0);
                    }
                    h11.S();
                    SpacerKt.a(SizeKt.i(c.f7566a, h.l(16)), h11, 6);
                    h(g.b(y0.f70533k4, h11, 0), recentLocations, onRecentDeleted, onItemSelected, h11, (i11 & 896) | 64 | (i11 & 7168), 0);
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
                d1 l11 = h11.l();
                if (l11 != null) {
                    l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$RecentLocations$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar2, int i12) {
                            LocationFilterBSViewKt.k(recentLocations, z11, onRecentDeleted, onItemSelected, aVar2, v0.a(i11 | 1));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return p.f75480a;
                        }
                    });
                }
            }

            public static final void l(final LocationTreeNode fullLocationTree, final List<String> allPossibleSearchKeywords, final boolean z11, final l<? super LocationTreeNode, p> addToRecent, androidx.compose.runtime.a aVar, final int i11) {
                o.i(fullLocationTree, "fullLocationTree");
                o.i(allPossibleSearchKeywords, "allPossibleSearchKeywords");
                o.i(addToRecent, "addToRecent");
                androidx.compose.runtime.a h11 = aVar.h(-1348030519);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-1348030519, i11, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.SearchResults (LocationFilterBSView.kt:231)");
                }
                final List<LocationTreeNode> f11 = fullLocationTree.f(new l<LocationTreeNode, Boolean>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$SearchResults$filteredList$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // g00.l
                    /* renamed from: b */
                    public final Boolean invoke(LocationTreeNode it2) {
                        o.i(it2, "it");
                        return Boolean.valueOf(kc.b.d(it2.i().f(), allPossibleSearchKeywords));
                    }
                });
                LazyDslKt.a(PaddingKt.k(c.f7566a, h.l(16), 0.0f, 2, null), null, null, false, null, null, null, false, new l<LazyListScope, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$SearchResults$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void b(LazyListScope LazyColumn) {
                        o.i(LazyColumn, "$this$LazyColumn");
                        if (z11) {
                            LazyListScope.l(LazyColumn, null, null, ComposableSingletons$LocationFilterBSViewKt.f29703a.a(), 3, null);
                        }
                        if (!f11.isEmpty()) {
                            final List<LocationTreeNode> list = f11;
                            final l<LocationTreeNode, p> lVar = addToRecent;
                            final int i12 = i11;
                            LazyColumn.f(list.size(), null, 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003c: INVOKE  
                                  (r12v0 'LazyColumn' androidx.compose.foundation.lazy.LazyListScope)
                                  (wrap: int : 0x0025: INVOKE  (r3v0 int A[REMOVE]) = 
                                  (r0v5 'list' java.util.List<com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode>)
                                 type: INTERFACE call: java.util.List.size():int)
                                  (null g00.l<? super java.lang.Integer, ? extends java.lang.Object>)
                                  (wrap: g00.l<java.lang.Integer, java.lang.Object> : 0x002b: CONSTRUCTOR  (r4v0 g00.l<java.lang.Integer, java.lang.Object> A[REMOVE]) = 
                                  (r0v5 'list' java.util.List<com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode> A[DONT_INLINE])
                                 call: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$SearchResults$1$invoke$$inlined$itemsIndexed$default$2.<init>(java.util.List):void type: CONSTRUCTOR)
                                  (wrap: r0.a : 0x0037: INVOKE  (r0v7 r0.a A[REMOVE]) = 
                                  (-1091073711 int)
                                  true
                                  (wrap: g00.r<x.a, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x0030: CONSTRUCTOR  (r5v1 g00.r<x.a, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = 
                                  (r0v5 'list' java.util.List<com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode> A[DONT_INLINE])
                                  (r0v5 'list' java.util.List<com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode> A[DONT_INLINE])
                                  (r1v0 'lVar' g00.l<com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode, wz.p> A[DONT_INLINE])
                                  (r2v0 'i12' int A[DONT_INLINE])
                                 call: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$SearchResults$1$invoke$$inlined$itemsIndexed$default$3.<init>(java.util.List, java.util.List, g00.l, int):void type: CONSTRUCTOR)
                                 type: STATIC call: r0.b.c(int, boolean, java.lang.Object):r0.a)
                                 type: INTERFACE call: androidx.compose.foundation.lazy.LazyListScope.f(int, g00.l, g00.l, g00.r):void in method: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$SearchResults$1.b(androidx.compose.foundation.lazy.LazyListScope):void, file: classes2.dex
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
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$SearchResults$1$invoke$$inlined$itemsIndexed$default$2, state: NOT_LOADED
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
                                	... 23 more
                                */
                            /*
                                this = this;
                                java.lang.String r0 = "$this$LazyColumn"
                                kotlin.jvm.internal.o.i(r12, r0)
                                boolean r0 = r1
                                if (r0 == 0) goto L17
                                r2 = 0
                                r3 = 0
                                com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.ComposableSingletons$LocationFilterBSViewKt r0 = com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.ComposableSingletons$LocationFilterBSViewKt.f29703a
                                g00.q r4 = r0.a()
                                r5 = 3
                                r6 = 0
                                r1 = r12
                                androidx.compose.foundation.lazy.LazyListScope.l(r1, r2, r3, r4, r5, r6)
                            L17:
                                java.util.List<com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode> r0 = r2
                                boolean r0 = r0.isEmpty()
                                if (r0 != 0) goto L40
                                java.util.List<com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode> r0 = r2
                                g00.l<com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode, wz.p> r1 = r3
                                int r2 = r4
                                int r3 = r0.size()
                                com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$SearchResults$1$invoke$$inlined$itemsIndexed$default$2 r4 = new com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$SearchResults$1$invoke$$inlined$itemsIndexed$default$2
                                r4.<init>(r0)
                                com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$SearchResults$1$invoke$$inlined$itemsIndexed$default$3 r5 = new com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$SearchResults$1$invoke$$inlined$itemsIndexed$default$3
                                r5.<init>(r0, r0, r1, r2)
                                r0 = -1091073711(0xffffffffbef78951, float:-0.48346952)
                                r1 = 1
                                r0.a r0 = r0.b.c(r0, r1, r5)
                                r1 = 0
                                r12.f(r3, r1, r4, r0)
                                goto L4e
                            L40:
                                r6 = 0
                                r7 = 0
                                com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.ComposableSingletons$LocationFilterBSViewKt r0 = com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.ComposableSingletons$LocationFilterBSViewKt.f29703a
                                g00.q r8 = r0.b()
                                r9 = 3
                                r10 = 0
                                r5 = r12
                                androidx.compose.foundation.lazy.LazyListScope.l(r5, r6, r7, r8, r9, r10)
                            L4e:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$SearchResults$1.b(androidx.compose.foundation.lazy.LazyListScope):void");
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ p invoke(LazyListScope lazyListScope) {
                            b(lazyListScope);
                            return p.f75480a;
                        }
                    }, h11, 6, 254);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                    d1 l11 = h11.l();
                    if (l11 != null) {
                        l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$SearchResults$2
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void b(androidx.compose.runtime.a aVar2, int i12) {
                                LocationFilterBSViewKt.l(LocationTreeNode.this, allPossibleSearchKeywords, z11, addToRecent, aVar2, v0.a(i11 | 1));
                            }

                            @Override // g00.p
                            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                                b(aVar2, num.intValue());
                                return p.f75480a;
                            }
                        });
                    }
                }

                public static final void m(final LocationTreeNode locationItem, final boolean z11, final l<? super LocationTreeNode, p> addToRecent, androidx.compose.runtime.a aVar, final int i11) {
                    o.i(locationItem, "locationItem");
                    o.i(addToRecent, "addToRecent");
                    androidx.compose.runtime.a h11 = aVar.h(575812390);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(575812390, i11, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.SearchResultsItem (LocationFilterBSView.kt:256)");
                    }
                    if (!n(locationItem.m())) {
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                        d1 l11 = h11.l();
                        if (l11 != null) {
                            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$SearchResultsItem$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                                    LocationFilterBSViewKt.m(LocationTreeNode.this, z11, addToRecent, aVar2, v0.a(i11 | 1));
                                }

                                @Override // g00.p
                                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                                    b(aVar2, num.intValue());
                                    return p.f75480a;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    c.a aVar2 = c.f7566a;
                    float f11 = 16;
                    c e11 = ClickableKt.e(PaddingKt.m(aVar2, 0.0f, h.l(f11), 0.0f, 0.0f, 13, null), false, null, null, new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$SearchResultsItem$2
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // g00.a
                        public /* bridge */ /* synthetic */ p invoke() {
                            invoke2();
                            return p.f75480a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            addToRecent.invoke(locationItem);
                        }
                    }, 7, null);
                    h11.C(-483455358);
                    Arrangement arrangement = Arrangement.f3698a;
                    Arrangement.m h12 = arrangement.h();
                    b.a aVar3 = v0.b.f74009a;
                    a0 a11 = e.a(h12, aVar3.k(), h11, 0);
                    h11.C(-1323940314);
                    int a12 = j0.e.a(h11, 0);
                    k s11 = h11.s();
                    ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                    g00.a<ComposeUiNode> a13 = companion.a();
                    q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(e11);
                    if (!(h11.k() instanceof d)) {
                        j0.e.c();
                    }
                    h11.I();
                    if (h11.f()) {
                        h11.y(a13);
                    } else {
                        h11.t();
                    }
                    androidx.compose.runtime.a a14 = Updater.a(h11);
                    Updater.c(a14, a11, companion.e());
                    Updater.c(a14, s11, companion.g());
                    g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
                    if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                        a14.u(Integer.valueOf(a12));
                        a14.p(Integer.valueOf(a12), b11);
                    }
                    c11.invoke(e1.a(e1.b(h11)), h11, 0);
                    h11.C(2058660585);
                    f fVar = f.f74891a;
                    Arrangement.f o11 = arrangement.o(h.l(8));
                    b.c i12 = aVar3.i();
                    h11.C(693286680);
                    a0 a15 = androidx.compose.foundation.layout.o.a(o11, i12, h11, 54);
                    h11.C(-1323940314);
                    int a16 = j0.e.a(h11, 0);
                    k s12 = h11.s();
                    g00.a<ComposeUiNode> a17 = companion.a();
                    q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(aVar2);
                    if (!(h11.k() instanceof d)) {
                        j0.e.c();
                    }
                    h11.I();
                    if (h11.f()) {
                        h11.y(a17);
                    } else {
                        h11.t();
                    }
                    androidx.compose.runtime.a a18 = Updater.a(h11);
                    Updater.c(a18, a15, companion.e());
                    Updater.c(a18, s12, companion.g());
                    g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
                    if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
                        a18.u(Integer.valueOf(a16));
                        a18.p(Integer.valueOf(a16), b12);
                    }
                    c12.invoke(e1.a(e1.b(h11)), h11, 0);
                    h11.C(2058660585);
                    u uVar = u.f74924a;
                    c p11 = SizeKt.p(aVar2, h.l(20));
                    Painter d11 = p1.e.d(sj.d.C, h11, 0);
                    dk.a aVar4 = dk.a.f54291a;
                    int i13 = dk.a.f54292b;
                    yj.d e12 = aVar4.a(h11, i13).e();
                    int i14 = yj.d.f76453b;
                    IconKt.a(d11, p11, null, e12.j(h11, i14), false, 0.0f, h11, 56, 52);
                    TextKt.a(locationItem.i().i(), null, 0, 0, false, 0, 0, null, aVar4.c(h11, i13).c(), aVar4.a(h11, i13).e().m(h11, i14), 0, h11, 0, 0, 1278);
                    h11.S();
                    h11.w();
                    h11.S();
                    h11.S();
                    SpacerKt.a(SizeKt.i(aVar2, h.l(f11)), h11, 6);
                    h11.C(-1746491598);
                    if (!z11) {
                        p(h11, 0);
                    }
                    h11.S();
                    h11.S();
                    h11.w();
                    h11.S();
                    h11.S();
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                    d1 l12 = h11.l();
                    if (l12 != null) {
                        l12.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$SearchResultsItem$4
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void b(androidx.compose.runtime.a aVar5, int i15) {
                                LocationFilterBSViewKt.m(LocationTreeNode.this, z11, addToRecent, aVar5, v0.a(i11 | 1));
                            }

                            @Override // g00.p
                            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                                b(aVar5, num.intValue());
                                return p.f75480a;
                            }
                        });
                    }
                }

                private static final boolean n(k0<Boolean> k0Var) {
                    return k0Var.getValue().booleanValue();
                }

                public static final void o(final List<LocationTreeNode> selectedOptions, final l<? super LocationTreeNode, p> unSelectNode, androidx.compose.runtime.a aVar, final int i11) {
                    o.i(selectedOptions, "selectedOptions");
                    o.i(unSelectNode, "unSelectNode");
                    androidx.compose.runtime.a h11 = aVar.h(-1595390735);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-1595390735, i11, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.SelectedOptions (LocationFilterBSView.kt:200)");
                    }
                    if (selectedOptions.isEmpty()) {
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                        d1 l11 = h11.l();
                        if (l11 != null) {
                            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$SelectedOptions$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                                    LocationFilterBSViewKt.o(selectedOptions, unSelectNode, aVar2, v0.a(i11 | 1));
                                }

                                @Override // g00.p
                                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                                    b(aVar2, num.intValue());
                                    return p.f75480a;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    float f11 = 16;
                    LazyDslKt.b(PaddingKt.m(c.f7566a, 0.0f, h.l(f11), 0.0f, 0.0f, 13, null), null, PaddingKt.c(h.l(f11), 0.0f, 2, null), false, Arrangement.f3698a.o(h.l(8)), null, null, false, new l<LazyListScope, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$SelectedOptions$2
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void b(LazyListScope LazyRow) {
                            o.i(LazyRow, "$this$LazyRow");
                            final List<LocationTreeNode> list = selectedOptions;
                            final l<LocationTreeNode, p> lVar = unSelectNode;
                            final LocationFilterBSViewKt$SelectedOptions$2$invoke$$inlined$items$default$1 locationFilterBSViewKt$SelectedOptions$2$invoke$$inlined$items$default$1 = LocationFilterBSViewKt$SelectedOptions$2$invoke$$inlined$items$default$1.f29713a;
                            LazyRow.f(list.size(), null, 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0022: INVOKE  
                                  (r6v0 'LazyRow' androidx.compose.foundation.lazy.LazyListScope)
                                  (wrap: int : 0x000b: INVOKE  (r3v0 int A[REMOVE]) = 
                                  (r0v1 'list' java.util.List<com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode>)
                                 type: INTERFACE call: java.util.List.size():int)
                                  (null g00.l<? super java.lang.Integer, ? extends java.lang.Object>)
                                  (wrap: g00.l<java.lang.Integer, java.lang.Object> : 0x0011: CONSTRUCTOR  (r4v0 g00.l<java.lang.Integer, java.lang.Object> A[REMOVE]) = 
                                  (r2v0 'locationFilterBSViewKt$SelectedOptions$2$invoke$$inlined$items$default$1' com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$SelectedOptions$2$invoke$$inlined$items$default$1 A[DONT_INLINE])
                                  (r0v1 'list' java.util.List<com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode> A[DONT_INLINE])
                                 call: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$SelectedOptions$2$invoke$$inlined$items$default$3.<init>(g00.l, java.util.List):void type: CONSTRUCTOR)
                                  (wrap: r0.a : 0x001d: INVOKE  (r0v3 r0.a A[REMOVE]) = 
                                  (-632812321 int)
                                  true
                                  (wrap: g00.r<x.a, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x0016: CONSTRUCTOR  (r2v1 g00.r<x.a, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = 
                                  (r0v1 'list' java.util.List<com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode> A[DONT_INLINE])
                                  (r1v0 'lVar' g00.l<com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode, wz.p> A[DONT_INLINE])
                                 call: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$SelectedOptions$2$invoke$$inlined$items$default$4.<init>(java.util.List, g00.l):void type: CONSTRUCTOR)
                                 type: STATIC call: r0.b.c(int, boolean, java.lang.Object):r0.a)
                                 type: INTERFACE call: androidx.compose.foundation.lazy.LazyListScope.f(int, g00.l, g00.l, g00.r):void in method: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$SelectedOptions$2.b(androidx.compose.foundation.lazy.LazyListScope):void, file: classes2.dex
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$SelectedOptions$2$invoke$$inlined$items$default$3, state: NOT_LOADED
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
                                kotlin.jvm.internal.o.i(r6, r0)
                                java.util.List<com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode> r0 = r1
                                g00.l<com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode, wz.p> r1 = r2
                                com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$SelectedOptions$2$invoke$$inlined$items$default$1 r2 = com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$SelectedOptions$2$invoke$$inlined$items$default$1.f29713a
                                int r3 = r0.size()
                                com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$SelectedOptions$2$invoke$$inlined$items$default$3 r4 = new com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$SelectedOptions$2$invoke$$inlined$items$default$3
                                r4.<init>(r2, r0)
                                com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$SelectedOptions$2$invoke$$inlined$items$default$4 r2 = new com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$SelectedOptions$2$invoke$$inlined$items$default$4
                                r2.<init>(r0, r1)
                                r0 = -632812321(0xffffffffda480cdf, float:-1.40772868E16)
                                r1 = 1
                                r0.a r0 = r0.b.c(r0, r1, r2)
                                r1 = 0
                                r6.f(r3, r1, r4, r0)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$SelectedOptions$2.b(androidx.compose.foundation.lazy.LazyListScope):void");
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ p invoke(LazyListScope lazyListScope) {
                            b(lazyListScope);
                            return p.f75480a;
                        }
                    }, h11, 24966, 234);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                    d1 l12 = h11.l();
                    if (l12 != null) {
                        l12.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$SelectedOptions$3
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void b(androidx.compose.runtime.a aVar2, int i12) {
                                LocationFilterBSViewKt.o(selectedOptions, unSelectNode, aVar2, v0.a(i11 | 1));
                            }

                            @Override // g00.p
                            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                                b(aVar2, num.intValue());
                                return p.f75480a;
                            }
                        });
                    }
                }

                public static final void p(androidx.compose.runtime.a aVar, final int i11) {
                    androidx.compose.runtime.a h11 = aVar.h(-387362367);
                    if (i11 == 0 && h11.i()) {
                        h11.L();
                    } else {
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-387362367, i11, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.Spacer (LocationFilterBSView.kt:279)");
                        }
                        SpacerKt.a(BackgroundKt.b(SizeKt.h(SizeKt.i(c.f7566a, h.l(1)), 0.0f, 1, null), dk.a.f54291a.a(h11, dk.a.f54292b).e().d(h11, yj.d.f76453b), null, 2, null), h11, 0);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }
                    d1 l11 = h11.l();
                    if (l11 != null) {
                        l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterBSViewKt$Spacer$1
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void b(androidx.compose.runtime.a aVar2, int i12) {
                                LocationFilterBSViewKt.p(aVar2, v0.a(i11 | 1));
                            }

                            @Override // g00.p
                            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                                b(aVar2, num.intValue());
                                return p.f75480a;
                            }
                        });
                    }
                }
            }
