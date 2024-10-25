package com.forsale.app.features.categories.listingdetails.buyerscreen.otherads;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import cb.a;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.layouts.SectionTitleData;
import com.forsale.designSystem.layouts.SectionTitleKt;
import e2.h;
import g00.l;
import g00.q;
import j0.d;
import j0.d1;
import j0.e1;
import j0.k;
import j0.v0;
import java.util.List;
import kotlin.jvm.internal.o;
import p1.g;
import t9.y0;
import v0.b;
import w.f;
import wz.p;
/* compiled from: SimilarAdsSection.kt */
/* loaded from: classes2.dex */
public final class SimilarAdsSectionKt {
    public static final void a(final a aVar, final List<RecommendedListingsViewModel> buyerSimilarAdsModel, final l<? super a, p> onSeeAllClicked, androidx.compose.runtime.a aVar2, final int i11) {
        o.i(buyerSimilarAdsModel, "buyerSimilarAdsModel");
        o.i(onSeeAllClicked, "onSeeAllClicked");
        androidx.compose.runtime.a h11 = aVar2.h(-612454655);
        if (c.I()) {
            c.U(-612454655, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.SimilarAdsSection (SimilarAdsSection.kt:38)");
        }
        c.a aVar3 = androidx.compose.ui.c.f7566a;
        float f11 = 16;
        androidx.compose.ui.c a11 = ni.a.a(PaddingKt.m(aVar3, 0.0f, 0.0f, 0.0f, h.l(f11), 7, null));
        h11.C(-483455358);
        Arrangement arrangement = Arrangement.f3698a;
        a0 a12 = e.a(arrangement.h(), b.f74009a.k(), h11, 0);
        h11.C(-1323940314);
        int a13 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a14 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(a11);
        if (!(h11.k() instanceof d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a14);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a15 = Updater.a(h11);
        Updater.c(a15, a12, companion.e());
        Updater.c(a15, s11, companion.g());
        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
        if (a15.f() || !o.d(a15.D(), Integer.valueOf(a13))) {
            a15.u(Integer.valueOf(a13));
            a15.p(Integer.valueOf(a13), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        SectionTitleKt.a(PaddingKt.k(aVar3, h.l(f11), 0.0f, 2, null), SectionTitleData.f41869a.a(), r0.b.b(h11, -602905991, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.SimilarAdsSectionKt$SimilarAdsSection$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar4, int i12) {
                if ((i12 & 11) == 2 && aVar4.i()) {
                    aVar4.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-602905991, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.SimilarAdsSection.<anonymous>.<anonymous> (SimilarAdsSection.kt:49)");
                }
                int i13 = y0.f70513j1;
                Object[] objArr = new Object[1];
                a aVar5 = a.this;
                objArr[0] = (aVar5 == null || (r2 = aVar5.a()) == null) ? "" : "";
                String c12 = g.c(i13, objArr, aVar4, 64);
                dk.a aVar6 = dk.a.f54291a;
                int i14 = dk.a.f54292b;
                TextKt.a(c12, null, 0, 0, false, 0, 0, null, aVar6.c(aVar4, i14).l(), aVar6.a(aVar4, i14).e().m(aVar4, yj.d.f76453b), 0, aVar4, 0, 0, 1278);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                b(aVar4, num.intValue());
                return p.f75480a;
            }
        }), null, r0.b.b(h11, -1718874117, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.SimilarAdsSectionKt$SimilarAdsSection$1$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar4, int i12) {
                if ((i12 & 11) == 2 && aVar4.i()) {
                    aVar4.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-1718874117, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.SimilarAdsSection.<anonymous>.<anonymous> (SimilarAdsSection.kt:59)");
                }
                final l<a, p> lVar = onSeeAllClicked;
                final a aVar5 = aVar;
                IconButtonKt.a(new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.SimilarAdsSectionKt$SimilarAdsSection$1$2.1
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
                        lVar.invoke(aVar5);
                    }
                }, null, false, null, ComposableSingletons$SimilarAdsSectionKt.f26424a.a(), aVar4, 24576, 14);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                b(aVar4, num.intValue());
                return p.f75480a;
            }
        }), null, h11, (SectionTitleData.f41870b << 3) | 24966, 40);
        LazyDslKt.b(null, LazyListStateKt.c(0, 0, h11, 0, 3), PaddingKt.c(h.l(f11), 0.0f, 2, null), false, arrangement.o(h.l(12)), null, null, false, new l<LazyListScope, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.SimilarAdsSectionKt$SimilarAdsSection$1$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(LazyListScope LazyRow) {
                o.i(LazyRow, "$this$LazyRow");
                final List<RecommendedListingsViewModel> list = buyerSimilarAdsModel;
                LazyRow.f(list.size(), null, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001e: INVOKE  
                      (r6v0 'LazyRow' androidx.compose.foundation.lazy.LazyListScope)
                      (wrap: int : 0x0007: INVOKE  (r1v0 int A[REMOVE]) = 
                      (r0v1 'list' java.util.List<com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecommendedListingsViewModel>)
                     type: INTERFACE call: java.util.List.size():int)
                      (null g00.l<? super java.lang.Integer, ? extends java.lang.Object>)
                      (wrap: g00.l<java.lang.Integer, java.lang.Object> : 0x000d: CONSTRUCTOR  (r2v0 g00.l<java.lang.Integer, java.lang.Object> A[REMOVE]) = 
                      (r0v1 'list' java.util.List<com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecommendedListingsViewModel> A[DONT_INLINE])
                     call: com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.SimilarAdsSectionKt$SimilarAdsSection$1$3$invoke$$inlined$itemsIndexed$default$2.<init>(java.util.List):void type: CONSTRUCTOR)
                      (wrap: r0.a : 0x0019: INVOKE  (r0v3 r0.a A[REMOVE]) = 
                      (-1091073711 int)
                      true
                      (wrap: g00.r<x.a, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x0012: CONSTRUCTOR  (r3v0 g00.r<x.a, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = 
                      (r0v1 'list' java.util.List<com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecommendedListingsViewModel> A[DONT_INLINE])
                      (r0v1 'list' java.util.List<com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecommendedListingsViewModel> A[DONT_INLINE])
                     call: com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.SimilarAdsSectionKt$SimilarAdsSection$1$3$invoke$$inlined$itemsIndexed$default$3.<init>(java.util.List, java.util.List):void type: CONSTRUCTOR)
                     type: STATIC call: r0.b.c(int, boolean, java.lang.Object):r0.a)
                     type: INTERFACE call: androidx.compose.foundation.lazy.LazyListScope.f(int, g00.l, g00.l, g00.r):void in method: com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.SimilarAdsSectionKt$SimilarAdsSection$1$3.b(androidx.compose.foundation.lazy.LazyListScope):void, file: classes2.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.SimilarAdsSectionKt$SimilarAdsSection$1$3$invoke$$inlined$itemsIndexed$default$2, state: NOT_LOADED
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
                    java.util.List<com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecommendedListingsViewModel> r0 = r1
                    int r1 = r0.size()
                    com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.SimilarAdsSectionKt$SimilarAdsSection$1$3$invoke$$inlined$itemsIndexed$default$2 r2 = new com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.SimilarAdsSectionKt$SimilarAdsSection$1$3$invoke$$inlined$itemsIndexed$default$2
                    r2.<init>(r0)
                    com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.SimilarAdsSectionKt$SimilarAdsSection$1$3$invoke$$inlined$itemsIndexed$default$3 r3 = new com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.SimilarAdsSectionKt$SimilarAdsSection$1$3$invoke$$inlined$itemsIndexed$default$3
                    r3.<init>(r0, r0)
                    r0 = -1091073711(0xffffffffbef78951, float:-0.48346952)
                    r4 = 1
                    r0.a r0 = r0.b.c(r0, r4, r3)
                    r3 = 0
                    r6.f(r1, r3, r2, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.SimilarAdsSectionKt$SimilarAdsSection$1$3.b(androidx.compose.foundation.lazy.LazyListScope):void");
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(LazyListScope lazyListScope) {
                b(lazyListScope);
                return p.f75480a;
            }
        }, h11, 24960, 233);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.SimilarAdsSectionKt$SimilarAdsSection$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i12) {
                    SimilarAdsSectionKt.a(a.this, buyerSimilarAdsModel, onSeeAllClicked, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }
}
