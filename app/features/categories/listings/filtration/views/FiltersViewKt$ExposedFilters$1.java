package com.forsale.app.features.categories.listings.filtration.views;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.ResetAllViewModel;
import com.forsale.designSystem.buttons.ButtonsKt;
import e2.h;
import g00.a;
import g00.l;
import g00.q;
import g00.r;
import j0.d;
import j0.e;
import j0.e1;
import j0.k;
import j0.n1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import r0.b;
import w.u;
import wz.p;
/* compiled from: FiltersView.kt */
/* loaded from: classes2.dex */
final class FiltersViewKt$ExposedFilters$1 extends Lambda implements l<LazyListScope, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<FilterViewModel<?, ?, ?>> f30285a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f30286b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f30287c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ a<p> f30288d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f30289e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ c f30290f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ g00.p<FilterViewModel<?, ?, ?>, Integer, p> f30291g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ l<FilterViewModel<?, ?, ?>, p> f30292h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FiltersViewKt$ExposedFilters$1(List<? extends FilterViewModel<?, ?, ?>> list, boolean z11, boolean z12, a<p> aVar, int i11, c cVar, g00.p<? super FilterViewModel<?, ?, ?>, ? super Integer, p> pVar, l<? super FilterViewModel<?, ?, ?>, p> lVar) {
        super(1);
        this.f30285a = list;
        this.f30286b = z11;
        this.f30287c = z12;
        this.f30288d = aVar;
        this.f30289e = i11;
        this.f30290f = cVar;
        this.f30291g = pVar;
        this.f30292h = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }

    public final void g(LazyListScope LazyRow) {
        o.i(LazyRow, "$this$LazyRow");
        final boolean z11 = this.f30286b;
        final boolean z12 = this.f30287c;
        final a<p> aVar = this.f30288d;
        final int i11 = this.f30289e;
        LazyListScope.b(LazyRow, "All Filters", null, b.c(81005998, true, new q<x.a, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$ExposedFilters$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            public final void b(x.a stickyHeader, androidx.compose.runtime.a aVar2, int i12) {
                o.i(stickyHeader, "$this$stickyHeader");
                if ((i12 & 81) == 16 && aVar2.i()) {
                    aVar2.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(81005998, i12, -1, "com.forsale.app.features.categories.listings.filtration.views.ExposedFilters.<anonymous>.<anonymous> (FiltersView.kt:278)");
                }
                boolean z13 = z11;
                boolean z14 = z12;
                a<p> aVar3 = aVar;
                int i13 = i11;
                FiltersViewKt.a(z13, z14, aVar3, aVar2, ((i13 >> 6) & 896) | ((i13 >> 3) & 112));
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.q
            public /* bridge */ /* synthetic */ p invoke(x.a aVar2, androidx.compose.runtime.a aVar3, Integer num) {
                b(aVar2, aVar3, num.intValue());
                return p.f75480a;
            }
        }), 2, null);
        Object obj = null;
        if (!this.f30285a.isEmpty()) {
            final ArrayList arrayList = new ArrayList();
            for (Object obj2 : this.f30285a) {
                if (!(((FilterViewModel) obj2) instanceof ResetAllViewModel)) {
                    arrayList.add(obj2);
                }
            }
            final c cVar = this.f30290f;
            final List<FilterViewModel<?, ?, ?>> list = this.f30285a;
            final g00.p<FilterViewModel<?, ?, ?>, Integer, p> pVar = this.f30291g;
            final FiltersViewKt$ExposedFilters$1$invoke$$inlined$items$default$1 filtersViewKt$ExposedFilters$1$invoke$$inlined$items$default$1 = new l() { // from class: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$ExposedFilters$1$invoke$$inlined$items$default$1
                @Override // g00.l
                /* renamed from: b */
                public final Void invoke(FilterViewModel<?, ?, ?> filterViewModel) {
                    return null;
                }
            };
            LazyRow.f(arrayList.size(), null, new l<Integer, Object>() { // from class: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$ExposedFilters$1$invoke$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final Object b(int i12) {
                    return l.this.invoke(arrayList.get(i12));
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return b(num.intValue());
                }
            }, b.c(-632812321, true, new r<x.a, Integer, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$ExposedFilters$1$invoke$$inlined$items$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                public final void b(x.a aVar2, int i12, androidx.compose.runtime.a aVar3, int i13) {
                    int i14;
                    boolean i15;
                    boolean h11;
                    boolean m11;
                    int i16;
                    int i17;
                    if ((i13 & 14) == 0) {
                        if (aVar3.T(aVar2)) {
                            i17 = 4;
                        } else {
                            i17 = 2;
                        }
                        i14 = i13 | i17;
                    } else {
                        i14 = i13;
                    }
                    if ((i13 & 112) == 0) {
                        if (aVar3.d(i12)) {
                            i16 = 32;
                        } else {
                            i16 = 16;
                        }
                        i14 |= i16;
                    }
                    if ((i14 & 731) == 146 && aVar3.i()) {
                        aVar3.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-632812321, i14, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                    }
                    final FilterViewModel filterViewModel = (FilterViewModel) arrayList.get(i12);
                    n1 b11 = z.b(filterViewModel.v(), null, aVar3, 8, 1);
                    n1 b12 = z.b(filterViewModel.F(), null, aVar3, 8, 1);
                    n1 b13 = z.b(filterViewModel.E(), null, aVar3, 8, 1);
                    i15 = FiltersViewKt$ExposedFilters$1.i(b12);
                    if (i15) {
                        float f11 = 8;
                        c k11 = PaddingKt.k(cVar, 0.0f, h.l(f11), 1, null);
                        aVar3.C(693286680);
                        a0 a11 = androidx.compose.foundation.layout.o.a(Arrangement.f3698a.g(), v0.b.f74009a.l(), aVar3, 0);
                        aVar3.C(-1323940314);
                        int a12 = e.a(aVar3, 0);
                        k s11 = aVar3.s();
                        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                        a<ComposeUiNode> a13 = companion.a();
                        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(k11);
                        if (!(aVar3.k() instanceof d)) {
                            e.c();
                        }
                        aVar3.I();
                        if (aVar3.f()) {
                            aVar3.y(a13);
                        } else {
                            aVar3.t();
                        }
                        androidx.compose.runtime.a a14 = Updater.a(aVar3);
                        Updater.c(a14, a11, companion.e());
                        Updater.c(a14, s11, companion.g());
                        g00.p<ComposeUiNode, Integer, p> b14 = companion.b();
                        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                            a14.u(Integer.valueOf(a12));
                            a14.p(Integer.valueOf(a12), b14);
                        }
                        c11.invoke(e1.a(e1.b(aVar3)), aVar3, 0);
                        aVar3.C(2058660585);
                        u uVar = u.f74924a;
                        SpacerKt.a(SizeKt.u(c.f7566a, h.l(f11)), aVar3, 6);
                        h11 = FiltersViewKt$ExposedFilters$1.h(b11);
                        m11 = FiltersViewKt$ExposedFilters$1.m(b13);
                        r0.a b15 = b.b(aVar3, -1032218221, true, 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x013e: INVOKE  (r9v3 'b15' r0.a) = 
                              (r19v0 'aVar3' androidx.compose.runtime.a)
                              (-1032218221 int)
                              true
                              (wrap: g00.p<androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x0138: CONSTRUCTOR  (r9v2 g00.p<androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = 
                              (r1v2 'filterViewModel' com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel A[DONT_INLINE])
                             call: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$ExposedFilters$1$3$1$1.<init>(com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel):void type: CONSTRUCTOR)
                             type: STATIC call: r0.b.b(androidx.compose.runtime.a, int, boolean, java.lang.Object):r0.a in method: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$ExposedFilters$1$invoke$$inlined$items$default$4.b(x.a, int, androidx.compose.runtime.a, int):void, file: classes2.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$ExposedFilters$1$3$1$1, state: NOT_LOADED
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
                            	... 25 more
                            */
                        /*
                            Method dump skipped, instructions count: 380
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$ExposedFilters$1$invoke$$inlined$items$default$4.b(x.a, int, androidx.compose.runtime.a, int):void");
                    }

                    @Override // g00.r
                    public /* bridge */ /* synthetic */ p d(x.a aVar2, Integer num, androidx.compose.runtime.a aVar3, Integer num2) {
                        b(aVar2, num.intValue(), aVar3, num2.intValue());
                        return p.f75480a;
                    }
                }));
            }
            Iterator<T> it2 = this.f30285a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((FilterViewModel) next) instanceof ResetAllViewModel) {
                    obj = next;
                    break;
                }
            }
            final FilterViewModel filterViewModel = (FilterViewModel) obj;
            if (filterViewModel != null) {
                final l<FilterViewModel<?, ?, ?>, p> lVar = this.f30292h;
                LazyListScope.l(LazyRow, null, null, b.c(-1980895062, true, new q<x.a, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$ExposedFilters$1$5$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    private static final boolean c(n1<Boolean> n1Var) {
                        return n1Var.getValue().booleanValue();
                    }

                    public final void b(x.a item, androidx.compose.runtime.a aVar2, int i12) {
                        o.i(item, "$this$item");
                        if ((i12 & 81) == 16 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-1980895062, i12, -1, "com.forsale.app.features.categories.listings.filtration.views.ExposedFilters.<anonymous>.<anonymous>.<anonymous> (FiltersView.kt:313)");
                        }
                        FilterViewModel<?, ?, ?> filterViewModel2 = filterViewModel;
                        o.g(filterViewModel2, "null cannot be cast to non-null type com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.generalViewModels.ResetAllViewModel");
                        if (c(z.b(((ResetAllViewModel) filterViewModel2).c0(), null, aVar2, 8, 1))) {
                            c.a aVar3 = c.f7566a;
                            float f11 = 8;
                            c m11 = PaddingKt.m(aVar3, h.l(f11), h.l(f11), 0.0f, h.l(f11), 4, null);
                            final l<FilterViewModel<?, ?, ?>, p> lVar2 = lVar;
                            final FilterViewModel<?, ?, ?> filterViewModel3 = filterViewModel;
                            aVar2.C(693286680);
                            a0 a11 = androidx.compose.foundation.layout.o.a(Arrangement.f3698a.g(), v0.b.f74009a.l(), aVar2, 0);
                            aVar2.C(-1323940314);
                            int a12 = e.a(aVar2, 0);
                            k s11 = aVar2.s();
                            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                            a<ComposeUiNode> a13 = companion.a();
                            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(m11);
                            if (!(aVar2.k() instanceof d)) {
                                e.c();
                            }
                            aVar2.I();
                            if (aVar2.f()) {
                                aVar2.y(a13);
                            } else {
                                aVar2.t();
                            }
                            androidx.compose.runtime.a a14 = Updater.a(aVar2);
                            Updater.c(a14, a11, companion.e());
                            Updater.c(a14, s11, companion.g());
                            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
                            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                                a14.u(Integer.valueOf(a12));
                                a14.p(Integer.valueOf(a12), b11);
                            }
                            c11.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                            aVar2.C(2058660585);
                            u uVar = u.f74924a;
                            ButtonsKt.k(
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0120: INVOKE  
                                  (wrap: g00.a<wz.p> : 0x0108: CONSTRUCTOR  (r2v9 g00.a<wz.p> A[REMOVE]) = 
                                  (r0v3 'lVar2' g00.l<com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<?, ?, ?>, wz.p> A[DONT_INLINE])
                                  (r1v1 'filterViewModel3' com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel<?, ?, ?> A[DONT_INLINE])
                                 call: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$ExposedFilters$1$5$1$1$1.<init>(g00.l, com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel):void type: CONSTRUCTOR)
                                  (wrap: androidx.compose.ui.c : 0x00fc: INVOKE  (r3v7 androidx.compose.ui.c A[REMOVE]) = 
                                  (r13v9 'aVar3' androidx.compose.ui.c$a)
                                  (wrap: float : 0x00f8: INVOKE  (r15v10 float A[REMOVE]) = (32 int) type: STATIC call: e2.h.l(float):float)
                                 type: STATIC call: androidx.compose.foundation.layout.SizeKt.i(androidx.compose.ui.c, float):androidx.compose.ui.c)
                                  (wrap: com.forsale.designSystem.buttons.ButtonData : 0x0102: INVOKE  (r4v2 com.forsale.designSystem.buttons.ButtonData A[REMOVE]) = 
                                  (wrap: com.forsale.designSystem.buttons.ButtonData$a : 0x0100: SGET  (r13v10 com.forsale.designSystem.buttons.ButtonData$a A[REMOVE]) =  com.forsale.designSystem.buttons.ButtonData.a com.forsale.designSystem.buttons.ButtonData$a)
                                 type: VIRTUAL call: com.forsale.designSystem.buttons.ButtonData.a.c():com.forsale.designSystem.buttons.ButtonData)
                                  false
                                  true
                                  (null v.k)
                                  (wrap: g00.q<w.t, androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x0110: INVOKE  (r8v5 g00.q<w.t, androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = 
                                  (wrap: com.forsale.app.features.categories.listings.filtration.views.ComposableSingletons$FiltersViewKt : 0x010e: SGET  (r13v11 com.forsale.app.features.categories.listings.filtration.views.ComposableSingletons$FiltersViewKt A[REMOVE]) =  com.forsale.app.features.categories.listings.filtration.views.ComposableSingletons$FiltersViewKt.a com.forsale.app.features.categories.listings.filtration.views.ComposableSingletons$FiltersViewKt)
                                 type: VIRTUAL call: com.forsale.app.features.categories.listings.filtration.views.ComposableSingletons$FiltersViewKt.c():g00.q)
                                  (r14v0 'aVar2' androidx.compose.runtime.a)
                                  (wrap: int : 0x011b: ARITH  (r10v0 int A[REMOVE]) = (wrap: int : 0x0116: ARITH  (r13v13 int A[REMOVE]) = (wrap: int : 0x0114: SGET  (r13v12 int A[REMOVE]) =  com.forsale.designSystem.buttons.ButtonData.b int) << (6 int)) | (1597488 int))
                                  (40 int)
                                 type: STATIC call: com.forsale.designSystem.buttons.ButtonsKt.k(g00.a, androidx.compose.ui.c, com.forsale.designSystem.buttons.ButtonData, boolean, boolean, v.k, g00.q, androidx.compose.runtime.a, int, int):void in method: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$ExposedFilters$1$5$1.b(x.a, androidx.compose.runtime.a, int):void, file: classes2.dex
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$ExposedFilters$1$5$1$1$1, state: NOT_LOADED
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
                                	... 25 more
                                */
                            /*
                                Method dump skipped, instructions count: 313
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$ExposedFilters$1$5$1.b(x.a, androidx.compose.runtime.a, int):void");
                        }

                        @Override // g00.q
                        public /* bridge */ /* synthetic */ p invoke(x.a aVar2, androidx.compose.runtime.a aVar3, Integer num) {
                            b(aVar2, aVar3, num.intValue());
                            return p.f75480a;
                        }
                    }), 3, null);
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(LazyListScope lazyListScope) {
                g(lazyListScope);
                return p.f75480a;
            }
        }
