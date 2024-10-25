package com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews;

import aj.b;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import c0.g;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.features.categories.listings.items.listingItems.featuredListingItem.VerticalListingItemViewModel;
import com.forsale.designSystem.buttons.ButtonData;
import com.forsale.designSystem.layouts.SectionTitleKt;
import e2.h;
import g00.a;
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
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.o;
import v0.b;
import w.f;
import w.t;
import w.u;
import wz.p;
/* compiled from: FeaturedSectionView.kt */
/* loaded from: classes2.dex */
public final class FeaturedSectionViewKt {
    public static final void a(final List<VerticalListingItemViewModel> autoFeaturedListing, final q<? super ListingItemBrief, ? super Integer, ? super List<Integer>, p> onListingItemClicked, final a<p> onSeeAllClicked, final l<? super Integer, p> onSectionSwiped, androidx.compose.runtime.a aVar, final int i11) {
        Integer b11;
        boolean z11;
        o.i(autoFeaturedListing, "autoFeaturedListing");
        o.i(onListingItemClicked, "onListingItemClicked");
        o.i(onSeeAllClicked, "onSeeAllClicked");
        o.i(onSectionSwiped, "onSectionSwiped");
        androidx.compose.runtime.a h11 = aVar.h(-185876338);
        if (c.I()) {
            c.U(-185876338, i11, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.AutoFeaturedListings (FeaturedSectionView.kt:141)");
        }
        final LazyListState c11 = LazyListStateKt.c(0, 0, h11, 0, 3);
        h11.C(-492369756);
        Object D = h11.D();
        if (D == androidx.compose.runtime.a.f7182a.a()) {
            D = z.d(new a<Integer>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedSectionViewKt$AutoFeaturedListings$maxItemReachedAds$2$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // g00.a
                public final Integer invoke() {
                    Object v02;
                    List<Integer> a11 = b.a(LazyListState.this.x());
                    if (a11.isEmpty() || autoFeaturedListing.isEmpty()) {
                        return null;
                    }
                    v02 = CollectionsKt___CollectionsKt.v0(a11);
                    return Integer.valueOf(((Number) v02).intValue() + 1);
                }
            });
            h11.u(D);
        }
        h11.S();
        n1 n1Var = (n1) D;
        if (c11.e() && (b11 = b(n1Var)) != null) {
            if (b11.intValue() > autoFeaturedListing.size()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                b11 = null;
            }
            if (b11 != null) {
                onSectionSwiped.invoke(Integer.valueOf(b11.intValue()));
            }
        }
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        float f11 = 16;
        androidx.compose.ui.c a11 = TestTagKt.a(PaddingKt.k(aVar2, 0.0f, h.l(f11), 1, null), "featuredSection");
        h11.C(-483455358);
        a0 a12 = e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), h11, 0);
        h11.C(-1323940314);
        int a13 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        a<ComposeUiNode> a14 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(a11);
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
        g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
        if (a15.f() || !o.d(a15.D(), Integer.valueOf(a13))) {
            a15.u(Integer.valueOf(a13));
            a15.p(Integer.valueOf(a13), b12);
        }
        c12.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        androidx.compose.ui.c k11 = PaddingKt.k(aVar2, h.l(f11), 0.0f, 2, null);
        ComposableSingletons$FeaturedSectionViewKt composableSingletons$FeaturedSectionViewKt = ComposableSingletons$FeaturedSectionViewKt.f23586a;
        SectionTitleKt.a(k11, null, composableSingletons$FeaturedSectionViewKt.b(), r0.b.b(h11, 838459981, true, new q<t, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedSectionViewKt$AutoFeaturedListings$3$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r18v0, types: [androidx.compose.runtime.a] */
            /* JADX WARN: Type inference failed for: r5v2 */
            public final void b(t SectionTitle, androidx.compose.runtime.a aVar3, int i12) {
                o.i(SectionTitle, "$this$SectionTitle");
                if ((i12 & 81) == 16 && aVar3.i()) {
                    aVar3.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(838459981, i12, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.AutoFeaturedListings.<anonymous>.<anonymous> (FeaturedSectionView.kt:169)");
                }
                androidx.compose.ui.c a16 = TestTagKt.a(androidx.compose.ui.c.f7566a, "seeAllButton");
                ButtonData c13 = ButtonData.f40994a.c();
                w.o a17 = PaddingKt.a(h.l(0));
                final a<p> aVar4 = onSeeAllClicked;
                aVar3.C(1157296644);
                boolean T = aVar3.T(aVar4);
                Object D2 = aVar3.D();
                if (T || D2 == androidx.compose.runtime.a.f7182a.a()) {
                    D2 = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0063: CONSTRUCTOR  (r5v1 'D2' java.lang.Object) = (r0v6 'aVar4' g00.a<wz.p> A[DONT_INLINE]) call: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedSectionViewKt$AutoFeaturedListings$3$1$1$1.<init>(g00.a):void type: CONSTRUCTOR in method: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedSectionViewKt$AutoFeaturedListings$3$1.b(w.t, androidx.compose.runtime.a, int):void, file: classes2.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedSectionViewKt$AutoFeaturedListings$3$1$1$1, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                        	... 25 more
                        */
                    /*
                        this = this;
                        r11 = r18
                        r0 = r19
                        java.lang.String r1 = "$this$SectionTitle"
                        r2 = r17
                        kotlin.jvm.internal.o.i(r2, r1)
                        r1 = r0 & 81
                        r2 = 16
                        if (r1 != r2) goto L1e
                        boolean r1 = r18.i()
                        if (r1 != 0) goto L18
                        goto L1e
                    L18:
                        r18.L()
                        r15 = r16
                        goto L92
                    L1e:
                        boolean r1 = androidx.compose.runtime.c.I()
                        if (r1 == 0) goto L2d
                        r1 = -1
                        java.lang.String r2 = "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.AutoFeaturedListings.<anonymous>.<anonymous> (FeaturedSectionView.kt:169)"
                        r3 = 838459981(0x31f9e24d, float:7.272581E-9)
                        androidx.compose.runtime.c.U(r3, r0, r1, r2)
                    L2d:
                        androidx.compose.ui.c$a r0 = androidx.compose.ui.c.f7566a
                        java.lang.String r1 = "seeAllButton"
                        androidx.compose.ui.c r1 = androidx.compose.ui.platform.TestTagKt.a(r0, r1)
                        com.forsale.designSystem.buttons.ButtonData$a r0 = com.forsale.designSystem.buttons.ButtonData.f40994a
                        com.forsale.designSystem.buttons.ButtonData r2 = r0.c()
                        r0 = 0
                        float r0 = (float) r0
                        float r0 = e2.h.l(r0)
                        w.o r4 = androidx.compose.foundation.layout.PaddingKt.a(r0)
                        r15 = r16
                        g00.a<wz.p> r0 = r1
                        r3 = 1157296644(0x44faf204, float:2007.563)
                        r11.C(r3)
                        boolean r3 = r11.T(r0)
                        java.lang.Object r5 = r18.D()
                        if (r3 != 0) goto L61
                        androidx.compose.runtime.a$a r3 = androidx.compose.runtime.a.f7182a
                        java.lang.Object r3 = r3.a()
                        if (r5 != r3) goto L69
                    L61:
                        com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedSectionViewKt$AutoFeaturedListings$3$1$1$1 r5 = new com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedSectionViewKt$AutoFeaturedListings$3$1$1$1
                        r5.<init>(r0)
                        r11.u(r5)
                    L69:
                        r18.S()
                        r0 = r5
                        g00.a r0 = (g00.a) r0
                        r3 = 0
                        r5 = 0
                        r6 = 0
                        r7 = 0
                        r8 = 0
                        r9 = 0
                        com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.ComposableSingletons$FeaturedSectionViewKt r10 = com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.ComposableSingletons$FeaturedSectionViewKt.f23586a
                        g00.q r10 = r10.c()
                        int r12 = com.forsale.designSystem.buttons.ButtonData.f40995b
                        int r12 = r12 << 6
                        r12 = r12 | 24624(0x6030, float:3.4506E-41)
                        r13 = 6
                        r14 = 1000(0x3e8, float:1.401E-42)
                        r11 = r18
                        com.forsale.designSystem.buttons.ButtonsKt.l(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                        boolean r0 = androidx.compose.runtime.c.I()
                        if (r0 == 0) goto L92
                        androidx.compose.runtime.c.T()
                    L92:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedSectionViewKt$AutoFeaturedListings$3$1.b(w.t, androidx.compose.runtime.a, int):void");
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(t tVar, androidx.compose.runtime.a aVar3, Integer num) {
                    b(tVar, aVar3, num.intValue());
                    return p.f75480a;
                }
            }), null, composableSingletons$FeaturedSectionViewKt.d(), h11, 200070, 18);
            d(autoFeaturedListing, onListingItemClicked, c11, h11, (i11 & 112) | 8);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedSectionViewKt$AutoFeaturedListings$4
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar3, int i12) {
                        FeaturedSectionViewKt.a(autoFeaturedListing, onListingItemClicked, onSeeAllClicked, onSectionSwiped, aVar3, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                        b(aVar3, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        private static final Integer b(n1<Integer> n1Var) {
            return n1Var.getValue();
        }

        /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0179  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0185  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final void c(final com.forsale.app.features.categories.home.allverticals.f r15, final int r16, g00.r<? super com.forsale.app.datalayer.network.responses.ListingItemBrief, ? super com.forsale.app.features.categories.listingdetails.ListingDetailsAnalyticSource, ? super java.lang.Integer, ? super java.util.List<java.lang.Integer>, wz.p> r17, g00.q<? super com.forsale.app.features.categories.listings.ListingsTypes, ? super java.lang.String, ? super java.lang.String, wz.p> r18, g00.q<? super java.lang.String, ? super java.lang.Integer, ? super java.lang.Integer, wz.p> r19, androidx.compose.runtime.a r20, final int r21, final int r22) {
            /*
                Method dump skipped, instructions count: 408
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedSectionViewKt.c(com.forsale.app.features.categories.home.allverticals.f, int, g00.r, g00.q, g00.q, androidx.compose.runtime.a, int, int):void");
        }

        public static final void d(final List<VerticalListingItemViewModel> featuredListing, final q<? super ListingItemBrief, ? super Integer, ? super List<Integer>, p> onListingItemClicked, final LazyListState scrollState, androidx.compose.runtime.a aVar, final int i11) {
            o.i(featuredListing, "featuredListing");
            o.i(onListingItemClicked, "onListingItemClicked");
            o.i(scrollState, "scrollState");
            androidx.compose.runtime.a h11 = aVar.h(-122935980);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-122935980, i11, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedList (FeaturedSectionView.kt:192)");
            }
            h11.C(-492369756);
            Object D = h11.D();
            if (D == androidx.compose.runtime.a.f7182a.a()) {
                D = c0.e(Integer.valueOf(featuredListing.size()), null, 2, null);
                h11.u(D);
            }
            h11.S();
            k0 k0Var = (k0) D;
            LazyDslKt.b(PaddingKt.m(androidx.compose.ui.c.f7566a, 0.0f, h.l(8), 0.0f, 0.0f, 13, null), scrollState, PaddingKt.c(h.l(16), 0.0f, 2, null), false, Arrangement.f3698a.o(h.l(12)), null, null, false, new l<LazyListScope, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedSectionViewKt$FeaturedList$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void b(LazyListScope LazyRow) {
                    o.i(LazyRow, "$this$LazyRow");
                    final List<VerticalListingItemViewModel> list = featuredListing;
                    final q<ListingItemBrief, Integer, List<Integer>, p> qVar = onListingItemClicked;
                    final int i12 = i11;
                    LazyRow.f(list.size(), null, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0022: INVOKE  
                          (r7v0 'LazyRow' androidx.compose.foundation.lazy.LazyListScope)
                          (wrap: int : 0x000b: INVOKE  (r3v0 int A[REMOVE]) = 
                          (r0v1 'list' java.util.List<com.forsale.app.features.categories.listings.items.listingItems.featuredListingItem.VerticalListingItemViewModel>)
                         type: INTERFACE call: java.util.List.size():int)
                          (null g00.l<? super java.lang.Integer, ? extends java.lang.Object>)
                          (wrap: g00.l<java.lang.Integer, java.lang.Object> : 0x0011: CONSTRUCTOR  (r4v0 g00.l<java.lang.Integer, java.lang.Object> A[REMOVE]) = 
                          (r0v1 'list' java.util.List<com.forsale.app.features.categories.listings.items.listingItems.featuredListingItem.VerticalListingItemViewModel> A[DONT_INLINE])
                         call: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedSectionViewKt$FeaturedList$1$invoke$$inlined$itemsIndexed$default$2.<init>(java.util.List):void type: CONSTRUCTOR)
                          (wrap: r0.a : 0x001d: INVOKE  (r0v3 r0.a A[REMOVE]) = 
                          (-1091073711 int)
                          true
                          (wrap: g00.r<x.a, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x0016: CONSTRUCTOR  (r5v0 g00.r<x.a, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = 
                          (r0v1 'list' java.util.List<com.forsale.app.features.categories.listings.items.listingItems.featuredListingItem.VerticalListingItemViewModel> A[DONT_INLINE])
                          (r1v0 'qVar' g00.q<com.forsale.app.datalayer.network.responses.ListingItemBrief, java.lang.Integer, java.util.List<java.lang.Integer>, wz.p> A[DONT_INLINE])
                          (r2v0 'i12' int A[DONT_INLINE])
                         call: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedSectionViewKt$FeaturedList$1$invoke$$inlined$itemsIndexed$default$3.<init>(java.util.List, g00.q, int):void type: CONSTRUCTOR)
                         type: STATIC call: r0.b.c(int, boolean, java.lang.Object):r0.a)
                         type: INTERFACE call: androidx.compose.foundation.lazy.LazyListScope.f(int, g00.l, g00.l, g00.r):void in method: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedSectionViewKt$FeaturedList$1.b(androidx.compose.foundation.lazy.LazyListScope):void, file: classes2.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedSectionViewKt$FeaturedList$1$invoke$$inlined$itemsIndexed$default$2, state: NOT_LOADED
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
                        java.util.List<com.forsale.app.features.categories.listings.items.listingItems.featuredListingItem.VerticalListingItemViewModel> r0 = r1
                        g00.q<com.forsale.app.datalayer.network.responses.ListingItemBrief, java.lang.Integer, java.util.List<java.lang.Integer>, wz.p> r1 = r2
                        int r2 = r3
                        int r3 = r0.size()
                        com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedSectionViewKt$FeaturedList$1$invoke$$inlined$itemsIndexed$default$2 r4 = new com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedSectionViewKt$FeaturedList$1$invoke$$inlined$itemsIndexed$default$2
                        r4.<init>(r0)
                        com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedSectionViewKt$FeaturedList$1$invoke$$inlined$itemsIndexed$default$3 r5 = new com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedSectionViewKt$FeaturedList$1$invoke$$inlined$itemsIndexed$default$3
                        r5.<init>(r0, r1, r2)
                        r0 = -1091073711(0xffffffffbef78951, float:-0.48346952)
                        r1 = 1
                        r0.a r0 = r0.b.c(r0, r1, r5)
                        r1 = 0
                        r7.f(r3, r1, r4, r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedSectionViewKt$FeaturedList$1.b(androidx.compose.foundation.lazy.LazyListScope):void");
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(LazyListScope lazyListScope) {
                    b(lazyListScope);
                    return p.f75480a;
                }
            }, h11, ((i11 >> 3) & 112) | 24966, 232);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedSectionViewKt$FeaturedList$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        FeaturedSectionViewKt.d(featuredListing, onListingItemClicked, scrollState, aVar2, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        public static final void e(androidx.compose.runtime.a aVar, final int i11) {
            androidx.compose.runtime.a h11 = aVar.h(998507243);
            if (i11 == 0 && h11.i()) {
                h11.L();
            } else {
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(998507243, i11, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedLoadingState (FeaturedSectionView.kt:45)");
                }
                c.a aVar2 = androidx.compose.ui.c.f7566a;
                float f11 = 16;
                androidx.compose.ui.c k11 = PaddingKt.k(SizeKt.h(aVar2, 0.0f, 1, null), 0.0f, h.l(f11), 1, null);
                h11.C(-483455358);
                Arrangement arrangement = Arrangement.f3698a;
                Arrangement.m h12 = arrangement.h();
                b.a aVar3 = v0.b.f74009a;
                a0 a11 = e.a(h12, aVar3.k(), h11, 0);
                h11.C(-1323940314);
                int a12 = j0.e.a(h11, 0);
                k s11 = h11.s();
                ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                a<ComposeUiNode> a13 = companion.a();
                q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(k11);
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
                androidx.compose.ui.c k12 = PaddingKt.k(SizeKt.h(aVar2, 0.0f, 1, null), h.l(f11), 0.0f, 2, null);
                h11.C(693286680);
                a0 a15 = androidx.compose.foundation.layout.o.a(arrangement.g(), aVar3.l(), h11, 0);
                h11.C(-1323940314);
                int a16 = j0.e.a(h11, 0);
                k s12 = h11.s();
                a<ComposeUiNode> a17 = companion.a();
                q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(k12);
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
                float f12 = 4;
                BoxKt.a(com.forsale.ui.components.skeleton.a.a(SizeKt.i(SizeKt.u(aVar2, h.l(152)), h.l(27)), true, g.c(h.l(f12)), 0L, 0L, h11, 54, 12), h11, 0);
                SpacerKt.a(t.d(uVar, aVar2, 1.0f, false, 2, null), h11, 0);
                float f13 = 20;
                BoxKt.a(com.forsale.ui.components.skeleton.a.a(SizeKt.i(SizeKt.u(aVar2, h.l(48)), h.l(f13)), true, g.c(h.l(f12)), 0L, 0L, h11, 54, 12), h11, 0);
                h11.S();
                h11.w();
                h11.S();
                h11.S();
                SpacerKt.a(SizeKt.i(aVar2, h.l(f12)), h11, 6);
                BoxKt.a(com.forsale.ui.components.skeleton.a.a(PaddingKt.k(SizeKt.i(SizeKt.u(aVar2, h.l(216)), h.l(f13)), h.l(f11), 0.0f, 2, null), true, g.c(h.l(f12)), 0L, 0L, h11, 54, 12), h11, 0);
                SpacerKt.a(SizeKt.i(aVar2, h.l(8)), h11, 6);
                LazyDslKt.b(null, null, PaddingKt.c(h.l(f11), 0.0f, 2, null), false, arrangement.o(h.l(12)), null, null, false, new l<LazyListScope, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedSectionViewKt$FeaturedLoadingState$1$2
                    public final void b(LazyListScope LazyRow) {
                        o.i(LazyRow, "$this$LazyRow");
                        LazyListScope.e(LazyRow, 5, null, null, ComposableSingletons$FeaturedSectionViewKt.f23586a.a(), 6, null);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(LazyListScope lazyListScope) {
                        b(lazyListScope);
                        return p.f75480a;
                    }
                }, h11, 100688256, 235);
                h11.S();
                h11.w();
                h11.S();
                h11.S();
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedSectionViewKt$FeaturedLoadingState$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar4, int i12) {
                        FeaturedSectionViewKt.e(aVar4, v0.a(i11 | 1));
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
