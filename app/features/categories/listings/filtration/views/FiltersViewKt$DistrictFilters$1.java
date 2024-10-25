package com.forsale.app.features.categories.listings.filtration.views;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import bc.a;
import g00.l;
import g00.q;
import g00.r;
import j0.d;
import j0.e;
import j0.e1;
import j0.k;
import j0.n1;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import r0.b;
import w.u;
import wz.p;
/* compiled from: FiltersView.kt */
/* loaded from: classes2.dex */
final class FiltersViewKt$DistrictFilters$1 extends Lambda implements l<LazyListScope, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<a> f30274a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f30275b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l<a, p> f30276c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FiltersViewKt$DistrictFilters$1(List<a> list, String str, l<? super a, p> lVar) {
        super(1);
        this.f30274a = list;
        this.f30275b = str;
        this.f30276c = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }

    public final void c(LazyListScope LazyRow) {
        o.i(LazyRow, "$this$LazyRow");
        final List<a> list = this.f30274a;
        final String str = this.f30275b;
        final l<a, p> lVar = this.f30276c;
        final FiltersViewKt$DistrictFilters$1$invoke$$inlined$items$default$1 filtersViewKt$DistrictFilters$1$invoke$$inlined$items$default$1 = new l() { // from class: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$DistrictFilters$1$invoke$$inlined$items$default$1
            @Override // g00.l
            /* renamed from: b */
            public final Void invoke(a aVar) {
                return null;
            }
        };
        LazyRow.f(list.size(), null, new l<Integer, Object>() { // from class: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$DistrictFilters$1$invoke$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Object b(int i11) {
                return l.this.invoke(list.get(i11));
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return b(num.intValue());
            }
        }, b.c(-632812321, true, new r<x.a, Integer, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$DistrictFilters$1$invoke$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public final void b(x.a aVar, int i11, androidx.compose.runtime.a aVar2, int i12) {
                int i13;
                boolean e11;
                int i14;
                int i15;
                if ((i12 & 14) == 0) {
                    if (aVar2.T(aVar)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i13 = i12 | i15;
                } else {
                    i13 = i12;
                }
                if ((i12 & 112) == 0) {
                    if (aVar2.d(i11)) {
                        i14 = 32;
                    } else {
                        i14 = 16;
                    }
                    i13 |= i14;
                }
                if ((i13 & 731) == 146 && aVar2.i()) {
                    aVar2.L();
                    return;
                }
                if (c.I()) {
                    c.U(-632812321, i13, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                }
                final a aVar3 = (a) list.get(i11);
                final n1 b11 = z.b(aVar3.e(), null, aVar2, 8, 1);
                c.a aVar4 = androidx.compose.ui.c.f7566a;
                aVar2.C(693286680);
                a0 a11 = androidx.compose.foundation.layout.o.a(Arrangement.f3698a.g(), v0.b.f74009a.l(), aVar2, 0);
                aVar2.C(-1323940314);
                int a12 = e.a(aVar2, 0);
                k s11 = aVar2.s();
                ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                g00.a<ComposeUiNode> a13 = companion.a();
                q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar4);
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
                g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
                if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                    a14.u(Integer.valueOf(a12));
                    a14.p(Integer.valueOf(a12), b12);
                }
                c11.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                aVar2.C(2058660585);
                u uVar = u.f74924a;
                e11 = FiltersViewKt$DistrictFilters$1.e(b11);
                final String str2 = str;
                r0.a b13 = b.b(aVar2, 1914667746, true, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x010d: INVOKE  (r10v3 'b13' r0.a) = 
                      (r20v0 'aVar2' androidx.compose.runtime.a)
                      (1914667746 int)
                      true
                      (wrap: g00.p<androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x0107: CONSTRUCTOR  (r10v2 g00.p<androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = (r1v2 'aVar3' bc.a A[DONT_INLINE]), (r11v4 'str2' java.lang.String A[DONT_INLINE]) call: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$DistrictFilters$1$1$1$1.<init>(bc.a, java.lang.String):void type: CONSTRUCTOR)
                     type: STATIC call: r0.b.b(androidx.compose.runtime.a, int, boolean, java.lang.Object):r0.a in method: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$DistrictFilters$1$invoke$$inlined$items$default$4.b(x.a, int, androidx.compose.runtime.a, int):void, file: classes2.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$DistrictFilters$1$1$1$1, state: NOT_LOADED
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
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt$DistrictFilters$1$invoke$$inlined$items$default$4.b(x.a, int, androidx.compose.runtime.a, int):void");
            }

            @Override // g00.r
            public /* bridge */ /* synthetic */ p d(x.a aVar, Integer num, androidx.compose.runtime.a aVar2, Integer num2) {
                b(aVar, num.intValue(), aVar2, num2.intValue());
                return p.f75480a;
            }
        }));
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(LazyListScope lazyListScope) {
        c(lazyListScope);
        return p.f75480a;
    }
}
