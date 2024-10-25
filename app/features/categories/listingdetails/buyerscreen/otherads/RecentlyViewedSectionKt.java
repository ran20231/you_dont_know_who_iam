package com.forsale.app.features.categories.listingdetails.buyerscreen.otherads;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.designSystem.layouts.SectionTitleData;
import com.forsale.designSystem.layouts.SectionTitleKt;
import e2.h;
import g00.a;
import g00.l;
import g00.q;
import j0.d;
import j0.d1;
import j0.e1;
import j0.k;
import j0.v0;
import java.util.List;
import kotlin.jvm.internal.o;
import v0.b;
import w.f;
import wz.p;
/* compiled from: RecentlyViewedSection.kt */
/* loaded from: classes2.dex */
public final class RecentlyViewedSectionKt {
    public static final void a(final List<RecommendedListingsViewModel> buyerRecentlyViewedModel, final a<p> onSeeAllClicked, androidx.compose.runtime.a aVar, final int i11) {
        o.i(buyerRecentlyViewedModel, "buyerRecentlyViewedModel");
        o.i(onSeeAllClicked, "onSeeAllClicked");
        androidx.compose.runtime.a h11 = aVar.h(563062524);
        if (c.I()) {
            c.U(563062524, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecentlyViewedSection (RecentlyViewedSection.kt:36)");
        }
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        float f11 = 16;
        androidx.compose.ui.c a11 = ni.a.a(PaddingKt.m(aVar2, 0.0f, 0.0f, 0.0f, h.l(f11), 7, null));
        h11.C(-483455358);
        Arrangement arrangement = Arrangement.f3698a;
        a0 a12 = e.a(arrangement.h(), b.f74009a.k(), h11, 0);
        h11.C(-1323940314);
        int a13 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        a<ComposeUiNode> a14 = companion.a();
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
        SectionTitleKt.a(PaddingKt.k(aVar2, h.l(f11), 0.0f, 2, null), SectionTitleData.f41869a.a(), ComposableSingletons$RecentlyViewedSectionKt.f26416a.a(), null, r0.b.b(h11, -1011142922, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecentlyViewedSectionKt$RecentlyViewedSection$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v0, types: [androidx.compose.runtime.a] */
            /* JADX WARN: Type inference failed for: r1v3 */
            public final void b(androidx.compose.runtime.a aVar3, int i12) {
                if ((i12 & 11) == 2 && aVar3.i()) {
                    aVar3.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-1011142922, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecentlyViewedSection.<anonymous>.<anonymous> (RecentlyViewedSection.kt:56)");
                }
                final a<p> aVar4 = onSeeAllClicked;
                aVar3.C(1157296644);
                boolean T = aVar3.T(aVar4);
                Object D = aVar3.D();
                if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                    D = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003b: CONSTRUCTOR  (r1v2 'D' java.lang.Object) = (r12v1 'aVar4' g00.a<wz.p> A[DONT_INLINE]) call: com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecentlyViewedSectionKt$RecentlyViewedSection$1$1$1$1.<init>(g00.a):void type: CONSTRUCTOR in method: com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecentlyViewedSectionKt$RecentlyViewedSection$1$1.b(androidx.compose.runtime.a, int):void, file: classes2.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecentlyViewedSectionKt$RecentlyViewedSection$1$1$1$1, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                        	... 25 more
                        */
                    /*
                        this = this;
                        r0 = r12 & 11
                        r1 = 2
                        if (r0 != r1) goto L10
                        boolean r0 = r11.i()
                        if (r0 != 0) goto Lc
                        goto L10
                    Lc:
                        r11.L()
                        goto L61
                    L10:
                        boolean r0 = androidx.compose.runtime.c.I()
                        if (r0 == 0) goto L1f
                        r0 = -1
                        java.lang.String r1 = "com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecentlyViewedSection.<anonymous>.<anonymous> (RecentlyViewedSection.kt:56)"
                        r2 = -1011142922(0xffffffffc3bb2ef6, float:-374.36688)
                        androidx.compose.runtime.c.U(r2, r12, r0, r1)
                    L1f:
                        g00.a<wz.p> r12 = r1
                        r0 = 1157296644(0x44faf204, float:2007.563)
                        r11.C(r0)
                        boolean r0 = r11.T(r12)
                        java.lang.Object r1 = r11.D()
                        if (r0 != 0) goto L39
                        androidx.compose.runtime.a$a r0 = androidx.compose.runtime.a.f7182a
                        java.lang.Object r0 = r0.a()
                        if (r1 != r0) goto L41
                    L39:
                        com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecentlyViewedSectionKt$RecentlyViewedSection$1$1$1$1 r1 = new com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecentlyViewedSectionKt$RecentlyViewedSection$1$1$1$1
                        r1.<init>(r12)
                        r11.u(r1)
                    L41:
                        r11.S()
                        r2 = r1
                        g00.a r2 = (g00.a) r2
                        r3 = 0
                        r4 = 0
                        r5 = 0
                        com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.ComposableSingletons$RecentlyViewedSectionKt r12 = com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.ComposableSingletons$RecentlyViewedSectionKt.f26416a
                        g00.p r6 = r12.b()
                        r8 = 24576(0x6000, float:3.4438E-41)
                        r9 = 14
                        r7 = r11
                        androidx.compose.material.IconButtonKt.a(r2, r3, r4, r5, r6, r7, r8, r9)
                        boolean r11 = androidx.compose.runtime.c.I()
                        if (r11 == 0) goto L61
                        androidx.compose.runtime.c.T()
                    L61:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecentlyViewedSectionKt$RecentlyViewedSection$1$1.b(androidx.compose.runtime.a, int):void");
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            }), null, h11, (SectionTitleData.f41870b << 3) | 24966, 40);
            LazyDslKt.b(null, LazyListStateKt.c(0, 0, h11, 0, 3), PaddingKt.c(h.l(f11), 0.0f, 2, null), false, arrangement.o(h.l(12)), null, null, false, new l<LazyListScope, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecentlyViewedSectionKt$RecentlyViewedSection$1$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(LazyListScope LazyRow) {
                    o.i(LazyRow, "$this$LazyRow");
                    final List<RecommendedListingsViewModel> list = buyerRecentlyViewedModel;
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
                         call: com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecentlyViewedSectionKt$RecentlyViewedSection$1$2$invoke$$inlined$itemsIndexed$default$2.<init>(java.util.List):void type: CONSTRUCTOR)
                          (wrap: r0.a : 0x0019: INVOKE  (r0v3 r0.a A[REMOVE]) = 
                          (-1091073711 int)
                          true
                          (wrap: g00.r<x.a, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x0012: CONSTRUCTOR  (r3v0 g00.r<x.a, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = 
                          (r0v1 'list' java.util.List<com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecommendedListingsViewModel> A[DONT_INLINE])
                          (r0v1 'list' java.util.List<com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecommendedListingsViewModel> A[DONT_INLINE])
                         call: com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecentlyViewedSectionKt$RecentlyViewedSection$1$2$invoke$$inlined$itemsIndexed$default$3.<init>(java.util.List, java.util.List):void type: CONSTRUCTOR)
                         type: STATIC call: r0.b.c(int, boolean, java.lang.Object):r0.a)
                         type: INTERFACE call: androidx.compose.foundation.lazy.LazyListScope.f(int, g00.l, g00.l, g00.r):void in method: com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecentlyViewedSectionKt$RecentlyViewedSection$1$2.b(androidx.compose.foundation.lazy.LazyListScope):void, file: classes2.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecentlyViewedSectionKt$RecentlyViewedSection$1$2$invoke$$inlined$itemsIndexed$default$2, state: NOT_LOADED
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
                        com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecentlyViewedSectionKt$RecentlyViewedSection$1$2$invoke$$inlined$itemsIndexed$default$2 r2 = new com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecentlyViewedSectionKt$RecentlyViewedSection$1$2$invoke$$inlined$itemsIndexed$default$2
                        r2.<init>(r0)
                        com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecentlyViewedSectionKt$RecentlyViewedSection$1$2$invoke$$inlined$itemsIndexed$default$3 r3 = new com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecentlyViewedSectionKt$RecentlyViewedSection$1$2$invoke$$inlined$itemsIndexed$default$3
                        r3.<init>(r0, r0)
                        r0 = -1091073711(0xffffffffbef78951, float:-0.48346952)
                        r4 = 1
                        r0.a r0 = r0.b.c(r0, r4, r3)
                        r3 = 0
                        r6.f(r1, r3, r2, r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecentlyViewedSectionKt$RecentlyViewedSection$1$2.b(androidx.compose.foundation.lazy.LazyListScope):void");
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
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.RecentlyViewedSectionKt$RecentlyViewedSection$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar3, int i12) {
                        RecentlyViewedSectionKt.a(buyerRecentlyViewedModel, onSeeAllClicked, aVar3, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                        b(aVar3, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }
    }
