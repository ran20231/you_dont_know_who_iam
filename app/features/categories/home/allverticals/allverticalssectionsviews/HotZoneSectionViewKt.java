package com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import c0.g;
import coil.compose.AsyncImagePainter;
import com.forsale.adserver.view.models.AdsModel;
import com.forsale.adserver.view.screens.detailsScreen.a;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel;
import com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsViewKt;
import com.forsale.app.features.categories.listings.items.listingItems.featuredListingItem.VerticalListingItemViewModel;
import com.forsale.app.utils.analytics.PLFSource;
import com.forsale.core.util.ContextExtensionKt;
import com.forsale.designSystem.SurfaceKt;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.buttons.ButtonData;
import com.forsale.designSystem.buttons.ButtonsKt;
import com.forsale.designSystem.layouts.PlaceHolderKt;
import com.forsale.designSystem.layouts.PosterKt;
import com.forsale.designSystem.layouts.c;
import e2.d;
import e2.h;
import e2.r;
import g00.l;
import g00.q;
import hk.a;
import j0.d1;
import j0.e;
import j0.e1;
import j0.k;
import j0.k0;
import j0.n1;
import j0.v0;
import java.util.List;
import kotlin.jvm.internal.o;
import r0.b;
import w.t;
import wz.p;
/* compiled from: HotZoneSectionView.kt */
/* loaded from: classes2.dex */
public final class HotZoneSectionViewKt {
    public static final void a(final AllVerticalsViewModel.b hotZoneContent, final q<? super ListingItemBrief, ? super Integer, ? super List<Integer>, p> onListingItemClicked, final l<? super String, p> onSeeAllClicked, final l<? super Integer, p> onSectionSwiped, final g00.p<? super AdsModel, ? super a, p> onAdClicked, final l<? super PLFSource, p> openPLFScreen, androidx.compose.runtime.a aVar, final int i11) {
        o.i(hotZoneContent, "hotZoneContent");
        o.i(onListingItemClicked, "onListingItemClicked");
        o.i(onSeeAllClicked, "onSeeAllClicked");
        o.i(onSectionSwiped, "onSectionSwiped");
        o.i(onAdClicked, "onAdClicked");
        o.i(openPLFScreen, "openPLFScreen");
        androidx.compose.runtime.a h11 = aVar.h(14752957);
        if (c.I()) {
            c.U(14752957, i11, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedSectionContent (HotZoneSectionView.kt:61)");
        }
        h11.C(-492369756);
        Object D = h11.D();
        if (D == androidx.compose.runtime.a.f7182a.a()) {
            D = c0.e(h.f(h.l(0)), null, 2, null);
            h11.u(D);
        }
        h11.S();
        final k0 k0Var = (k0) D;
        final d dVar = (d) h11.q(CompositionLocalsKt.e());
        r0.a aVar2 = null;
        l<LazyListScope, p> lVar = new l<LazyListScope, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$FeaturedSectionContent$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void b(LazyListScope ListingsCarousel) {
                o.i(ListingsCarousel, "$this$ListingsCarousel");
                List<VerticalListingItemViewModel> c11 = AllVerticalsViewModel.b.this.c();
                boolean g11 = AllVerticalsViewModel.b.this.g();
                q<ListingItemBrief, Integer, List<Integer>, p> qVar = onListingItemClicked;
                g00.p<AdsModel, a, p> pVar = onAdClicked;
                final d dVar2 = dVar;
                final k0<h> k0Var2 = k0Var;
                HotZoneSectionViewKt.o(ListingsCarousel, c11, qVar, pVar, g11, new l<androidx.compose.ui.layout.l, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$FeaturedSectionContent$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(androidx.compose.ui.layout.l it2) {
                        o.i(it2, "it");
                        HotZoneSectionViewKt.c(k0Var2, d.this.x(r.f(it2.a())));
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.ui.layout.l lVar2) {
                        b(lVar2);
                        return p.f75480a;
                    }
                });
                final AllVerticalsViewModel.b bVar = AllVerticalsViewModel.b.this;
                final l<PLFSource, p> lVar2 = openPLFScreen;
                final int i12 = i11;
                final k0<h> k0Var3 = k0Var;
                LazyListScope.l(ListingsCarousel, null, null, b.c(31519630, true, new q<x.a, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$FeaturedSectionContent$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    public final void b(x.a item, androidx.compose.runtime.a aVar3, int i13) {
                        float b11;
                        o.i(item, "$this$item");
                        if ((i13 & 81) == 16 && aVar3.i()) {
                            aVar3.L();
                            return;
                        }
                        if (c.I()) {
                            c.U(31519630, i13, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedSectionContent.<anonymous>.<anonymous> (HotZoneSectionView.kt:76)");
                        }
                        AllVerticalsViewModel.c b12 = AllVerticalsViewModel.b.this.b();
                        if (b12 != null) {
                            AllVerticalsViewModel.b bVar2 = AllVerticalsViewModel.b.this;
                            final l<PLFSource, p> lVar3 = lVar2;
                            k0<h> k0Var4 = k0Var3;
                            boolean g12 = bVar2.g();
                            b11 = HotZoneSectionViewKt.b(k0Var4);
                            aVar3.C(1157296644);
                            boolean T = aVar3.T(lVar3);
                            Object D2 = aVar3.D();
                            if (T || D2 == androidx.compose.runtime.a.f7182a.a()) {
                                D2 = 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0056: CONSTRUCTOR  (r3v1 'D2' java.lang.Object) = (r9v1 'lVar3' g00.l<com.forsale.app.utils.analytics.PLFSource, wz.p> A[DONT_INLINE]) call: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$FeaturedSectionContent$1$2$1$1$1.<init>(g00.l):void type: CONSTRUCTOR in method: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$FeaturedSectionContent$1.2.b(x.a, androidx.compose.runtime.a, int):void, file: classes2.dex
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
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$FeaturedSectionContent$1$2$1$1$1, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                                    	... 31 more
                                    */
                                /*
                                    this = this;
                                    java.lang.String r0 = "$this$item"
                                    kotlin.jvm.internal.o.i(r7, r0)
                                    r7 = r9 & 81
                                    r0 = 16
                                    if (r7 != r0) goto L16
                                    boolean r7 = r8.i()
                                    if (r7 != 0) goto L12
                                    goto L16
                                L12:
                                    r8.L()
                                    goto L70
                                L16:
                                    boolean r7 = androidx.compose.runtime.c.I()
                                    if (r7 == 0) goto L25
                                    r7 = -1
                                    java.lang.String r0 = "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedSectionContent.<anonymous>.<anonymous> (HotZoneSectionView.kt:76)"
                                    r1 = 31519630(0x1e0f38e, float:8.263409E-38)
                                    androidx.compose.runtime.c.U(r1, r9, r7, r0)
                                L25:
                                    com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$b r7 = com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel.b.this
                                    com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$c r1 = r7.b()
                                    if (r1 != 0) goto L2e
                                    goto L67
                                L2e:
                                    com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$b r7 = com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel.b.this
                                    g00.l<com.forsale.app.utils.analytics.PLFSource, wz.p> r9 = r2
                                    j0.k0<e2.h> r0 = r4
                                    boolean r7 = r7.g()
                                    float r2 = com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt.i(r0)
                                    r0 = 1157296644(0x44faf204, float:2007.563)
                                    r8.C(r0)
                                    boolean r0 = r8.T(r9)
                                    java.lang.Object r3 = r8.D()
                                    if (r0 != 0) goto L54
                                    androidx.compose.runtime.a$a r0 = androidx.compose.runtime.a.f7182a
                                    java.lang.Object r0 = r0.a()
                                    if (r3 != r0) goto L5c
                                L54:
                                    com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$FeaturedSectionContent$1$2$1$1$1 r3 = new com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$FeaturedSectionContent$1$2$1$1$1
                                    r3.<init>(r9)
                                    r8.u(r3)
                                L5c:
                                    r8.S()
                                    g00.a r3 = (g00.a) r3
                                    r5 = 0
                                    r0 = r7
                                    r4 = r8
                                    com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt.d(r0, r1, r2, r3, r4, r5)
                                L67:
                                    boolean r7 = androidx.compose.runtime.c.I()
                                    if (r7 == 0) goto L70
                                    androidx.compose.runtime.c.T()
                                L70:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$FeaturedSectionContent$1.AnonymousClass2.b(x.a, androidx.compose.runtime.a, int):void");
                            }

                            @Override // g00.q
                            public /* bridge */ /* synthetic */ p invoke(x.a aVar3, androidx.compose.runtime.a aVar4, Integer num) {
                                b(aVar3, aVar4, num.intValue());
                                return p.f75480a;
                            }
                        }), 3, null);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(LazyListScope lazyListScope) {
                        b(lazyListScope);
                        return p.f75480a;
                    }
                };
                r0.a b11 = b.b(h11, -2003435077, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$FeaturedSectionContent$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar3, int i12) {
                        if ((i12 & 11) == 2 && aVar3.i()) {
                            aVar3.L();
                            return;
                        }
                        if (c.I()) {
                            c.U(-2003435077, i12, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedSectionContent.<anonymous> (HotZoneSectionView.kt:89)");
                        }
                        TextKt.a(AllVerticalsViewModel.b.this.f().getLocalized(), TestTagKt.a(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), "featuredTitle"), 0, 0, false, 0, 0, null, null, 0L, 0, aVar3, 48, 0, 2044);
                        if (c.I()) {
                            c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                        b(aVar3, num.intValue());
                        return p.f75480a;
                    }
                });
                r0.a b12 = b.b(h11, -1827106820, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$FeaturedSectionContent$3
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar3, int i12) {
                        if ((i12 & 11) == 2 && aVar3.i()) {
                            aVar3.L();
                            return;
                        }
                        if (c.I()) {
                            c.U(-1827106820, i12, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedSectionContent.<anonymous> (HotZoneSectionView.kt:97)");
                        }
                        TextKt.a(AllVerticalsViewModel.b.this.e().getLocalized(), null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar3, 0, 0, 2046);
                        if (c.I()) {
                            c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                        b(aVar3, num.intValue());
                        return p.f75480a;
                    }
                });
                if (hotZoneContent.d()) {
                    aVar2 = b.b(h11, -191896256, true, new q<t, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$FeaturedSectionContent$4
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        public final void b(t tVar, androidx.compose.runtime.a aVar3, int i12) {
                            o.i(tVar, "$this$null");
                            if ((i12 & 81) == 16 && aVar3.i()) {
                                aVar3.L();
                                return;
                            }
                            if (c.I()) {
                                c.U(-191896256, i12, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.FeaturedSectionContent.<anonymous> (HotZoneSectionView.kt:101)");
                            }
                            final l<String, p> lVar2 = onSeeAllClicked;
                            final AllVerticalsViewModel.b bVar = hotZoneContent;
                            HotZoneSectionViewKt.h(new g00.a<p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$FeaturedSectionContent$4.1
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
                                    lVar2.invoke(bVar.f().getLocalized());
                                }
                            }, aVar3, 0);
                            if (c.I()) {
                                c.T();
                            }
                        }

                        @Override // g00.q
                        public /* bridge */ /* synthetic */ p invoke(t tVar, androidx.compose.runtime.a aVar3, Integer num) {
                            b(tVar, aVar3, num.intValue());
                            return p.f75480a;
                        }
                    });
                }
                CommonViewsKt.a(lVar, 0, b11, b12, aVar2, onSectionSwiped, h11, ((i11 << 6) & 458752) | 3456, 2);
                if (c.I()) {
                    c.T();
                }
                d1 l11 = h11.l();
                if (l11 != null) {
                    l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$FeaturedSectionContent$5
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar3, int i12) {
                            HotZoneSectionViewKt.a(AllVerticalsViewModel.b.this, onListingItemClicked, onSeeAllClicked, onSectionSwiped, onAdClicked, openPLFScreen, aVar3, v0.a(i11 | 1));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                            b(aVar3, num.intValue());
                            return p.f75480a;
                        }
                    });
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final float b(k0<h> k0Var) {
                return k0Var.getValue().q();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void c(k0<h> k0Var, float f11) {
                k0Var.setValue(h.f(f11));
            }

            public static final void d(final boolean z11, final AllVerticalsViewModel.c fillerContent, final float f11, final g00.a<p> onFillerClicked, androidx.compose.runtime.a aVar, final int i11) {
                int i12;
                int i13;
                int i14;
                int i15;
                int i16;
                o.i(fillerContent, "fillerContent");
                o.i(onFillerClicked, "onFillerClicked");
                androidx.compose.runtime.a h11 = aVar.h(1354868936);
                if ((i11 & 14) == 0) {
                    if (h11.a(z11)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i12 = i16 | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 112) == 0) {
                    if (h11.T(fillerContent)) {
                        i15 = 32;
                    } else {
                        i15 = 16;
                    }
                    i12 |= i15;
                }
                if ((i11 & 896) == 0) {
                    if (h11.b(f11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i11 & 7168) == 0) {
                    if (h11.F(onFillerClicked)) {
                        i13 = RecyclerView.l.FLAG_MOVED;
                    } else {
                        i13 = 1024;
                    }
                    i12 |= i13;
                }
                if ((i12 & 5851) == 1170 && h11.i()) {
                    h11.L();
                } else {
                    if (c.I()) {
                        c.U(1354868936, i12, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.Filler (HotZoneSectionView.kt:116)");
                    }
                    final Context context = (Context) h11.q(AndroidCompositionLocals_androidKt.g());
                    if (z11) {
                        h11.C(1511803753);
                        e(null, fillerContent.a(), new g00.a<p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$Filler$1
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                String b11 = AllVerticalsViewModel.c.this.b();
                                if (b11 != null) {
                                    final Context context2 = context;
                                    ContextExtensionKt.a(context2, b11, 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000f: INVOKE  
                                          (r1v0 'context2' android.content.Context)
                                          (r0v1 'b11' java.lang.String)
                                          (wrap: g00.l<java.lang.Exception, wz.p> : 0x000c: CONSTRUCTOR  (r2v0 g00.l<java.lang.Exception, wz.p> A[REMOVE]) = (r1v0 'context2' android.content.Context A[DONT_INLINE]) call: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$Filler$1$1$1.<init>(android.content.Context):void type: CONSTRUCTOR)
                                         type: STATIC call: com.forsale.core.util.ContextExtensionKt.a(android.content.Context, java.lang.String, g00.l):void in method: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$Filler$1.invoke():void, file: classes2.dex
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
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$Filler$1$1$1, state: NOT_LOADED
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
                                        com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$c r0 = com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel.c.this
                                        java.lang.String r0 = r0.b()
                                        if (r0 == 0) goto L12
                                        android.content.Context r1 = r2
                                        com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$Filler$1$1$1 r2 = new com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$Filler$1$1$1
                                        r2.<init>(r1)
                                        com.forsale.core.util.ContextExtensionKt.a(r1, r0, r2)
                                    L12:
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$Filler$1.invoke2():void");
                                }
                            }, h11, 0, 1);
                            h11.S();
                        } else {
                            h11.C(1511804141);
                            e(SizeKt.u(SizeKt.i(androidx.compose.ui.c.f7566a, f11), h.l(254)), fillerContent.a(), onFillerClicked, h11, (i12 >> 3) & 896, 0);
                            h11.S();
                        }
                        if (c.I()) {
                            c.T();
                        }
                    }
                    d1 l11 = h11.l();
                    if (l11 != null) {
                        l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$Filler$2
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void b(androidx.compose.runtime.a aVar2, int i17) {
                                HotZoneSectionViewKt.d(z11, fillerContent, f11, onFillerClicked, aVar2, v0.a(i11 | 1));
                            }

                            @Override // g00.p
                            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                                b(aVar2, num.intValue());
                                return p.f75480a;
                            }
                        });
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void e(androidx.compose.ui.c cVar, final String str, final g00.a<p> aVar, androidx.compose.runtime.a aVar2, final int i11, final int i12) {
                    Object obj;
                    int i13;
                    int i14;
                    int i15;
                    int i16;
                    androidx.compose.ui.c cVar2;
                    Object obj2;
                    AsyncImagePainter asyncImagePainter;
                    androidx.compose.runtime.a h11 = aVar2.h(565456123);
                    int i17 = i12 & 1;
                    if (i17 != 0) {
                        i13 = i11 | 6;
                        obj = cVar;
                    } else if ((i11 & 14) == 0) {
                        obj = cVar;
                        if (h11.T(obj)) {
                            i14 = 4;
                        } else {
                            i14 = 2;
                        }
                        i13 = i14 | i11;
                    } else {
                        obj = cVar;
                        i13 = i11;
                    }
                    if ((i12 & 2) != 0) {
                        i13 |= 48;
                    } else if ((i11 & 112) == 0) {
                        if (h11.T(str)) {
                            i15 = 32;
                        } else {
                            i15 = 16;
                        }
                        i13 |= i15;
                    }
                    if ((i12 & 4) != 0) {
                        i13 |= 384;
                    } else if ((i11 & 896) == 0) {
                        if (h11.F(aVar)) {
                            i16 = 256;
                        } else {
                            i16 = 128;
                        }
                        i13 |= i16;
                    }
                    final int i18 = i13;
                    if ((i18 & 731) == 146 && h11.i()) {
                        h11.L();
                    } else {
                        if (i17 != 0) {
                            cVar2 = AspectRatioKt.b(SizeKt.u(androidx.compose.ui.c.f7566a, HorizontalListingsViewKt.l()), 1.0f, false, 2, null);
                        } else {
                            cVar2 = obj;
                        }
                        if (c.I()) {
                            c.U(565456123, i18, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.PosterWithPlaceHolder (HotZoneSectionView.kt:201)");
                        }
                        h11.C(-492369756);
                        Object D = h11.D();
                        a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
                        if (D == c0064a.a()) {
                            D = c0.e(Boolean.FALSE, null, 2, null);
                            h11.u(D);
                        }
                        h11.S();
                        final k0 k0Var = (k0) D;
                        if (str == null) {
                            obj2 = Integer.valueOf(sj.d.A);
                        } else {
                            obj2 = str;
                        }
                        h11.C(1157296644);
                        boolean T = h11.T(k0Var);
                        Object D2 = h11.D();
                        if (T || D2 == c0064a.a()) {
                            D2 = new l<AsyncImagePainter.b.c, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$PosterWithPlaceHolder$painter$1$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                public final void b(AsyncImagePainter.b.c it2) {
                                    o.i(it2, "it");
                                    HotZoneSectionViewKt.g(k0Var, true);
                                }

                                @Override // g00.l
                                public /* bridge */ /* synthetic */ p invoke(AsyncImagePainter.b.c cVar3) {
                                    b(cVar3);
                                    return p.f75480a;
                                }
                            };
                            h11.u(D2);
                        }
                        h11.S();
                        l lVar = (l) D2;
                        h11.C(1157296644);
                        boolean T2 = h11.T(k0Var);
                        Object D3 = h11.D();
                        if (T2 || D3 == c0064a.a()) {
                            D3 = new l<AsyncImagePainter.b.d, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$PosterWithPlaceHolder$painter$2$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                public final void b(AsyncImagePainter.b.d it2) {
                                    o.i(it2, "it");
                                    HotZoneSectionViewKt.g(k0Var, false);
                                }

                                @Override // g00.l
                                public /* bridge */ /* synthetic */ p invoke(AsyncImagePainter.b.d dVar) {
                                    b(dVar);
                                    return p.f75480a;
                                }
                            };
                            h11.u(D3);
                        }
                        h11.S();
                        final androidx.compose.ui.c cVar3 = cVar2;
                        AsyncImagePainter b11 = h5.d.b(obj2, null, null, null, lVar, (l) D3, null, null, 0, h11, 8, 462);
                        h11.C(733328855);
                        c.a aVar3 = androidx.compose.ui.c.f7566a;
                        a0 g11 = BoxKt.g(v0.b.f74009a.o(), false, h11, 0);
                        h11.C(-1323940314);
                        int a11 = e.a(h11, 0);
                        k s11 = h11.s();
                        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                        g00.a<ComposeUiNode> a12 = companion.a();
                        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar3);
                        if (!(h11.k() instanceof j0.d)) {
                            e.c();
                        }
                        h11.I();
                        if (h11.f()) {
                            h11.y(a12);
                        } else {
                            h11.t();
                        }
                        androidx.compose.runtime.a a13 = Updater.a(h11);
                        Updater.c(a13, g11, companion.e());
                        Updater.c(a13, s11, companion.g());
                        g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
                        if (a13.f() || !o.d(a13.D(), Integer.valueOf(a11))) {
                            a13.u(Integer.valueOf(a11));
                            a13.p(Integer.valueOf(a11), b12);
                        }
                        c11.invoke(e1.a(e1.b(h11)), h11, 0);
                        h11.C(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
                        h11.C(-2147060223);
                        if (f(k0Var)) {
                            asyncImagePainter = b11;
                            SurfaceKt.c(null, g.c(h.l(8)), 0L, 0L, null, 0.0f, b.b(h11, -1688746216, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$PosterWithPlaceHolder$1$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                public final void b(androidx.compose.runtime.a aVar4, int i19) {
                                    if ((i19 & 11) == 2 && aVar4.i()) {
                                        aVar4.L();
                                        return;
                                    }
                                    if (androidx.compose.runtime.c.I()) {
                                        androidx.compose.runtime.c.U(-1688746216, i19, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.PosterWithPlaceHolder.<anonymous>.<anonymous> (HotZoneSectionView.kt:210)");
                                    }
                                    PlaceHolderKt.a(androidx.compose.ui.c.this, aVar4, i18 & 14);
                                    if (androidx.compose.runtime.c.I()) {
                                        androidx.compose.runtime.c.T();
                                    }
                                }

                                @Override // g00.p
                                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                                    b(aVar4, num.intValue());
                                    return p.f75480a;
                                }
                            }), h11, 1572864, 61);
                        } else {
                            asyncImagePainter = b11;
                        }
                        h11.S();
                        h11.C(1157296644);
                        boolean T3 = h11.T(aVar);
                        Object D4 = h11.D();
                        if (T3 || D4 == c0064a.a()) {
                            D4 = new g00.a<p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$PosterWithPlaceHolder$1$2$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    aVar.invoke();
                                }
                            };
                            h11.u(D4);
                        }
                        h11.S();
                        PosterKt.a(asyncImagePainter, ClickableKt.e(cVar3, false, null, null, (g00.a) D4, 7, null), h11, 0, 0);
                        h11.S();
                        h11.w();
                        h11.S();
                        h11.S();
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                        obj = cVar3;
                    }
                    d1 l11 = h11.l();
                    if (l11 != null) {
                        final androidx.compose.ui.c cVar4 = obj;
                        l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$PosterWithPlaceHolder$2
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void b(androidx.compose.runtime.a aVar4, int i19) {
                                HotZoneSectionViewKt.e(androidx.compose.ui.c.this, str, aVar, aVar4, v0.a(i11 | 1), i12);
                            }

                            @Override // g00.p
                            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                                b(aVar4, num.intValue());
                                return p.f75480a;
                            }
                        });
                    }
                }

                private static final boolean f(k0<Boolean> k0Var) {
                    return k0Var.getValue().booleanValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void g(k0<Boolean> k0Var, boolean z11) {
                    k0Var.setValue(Boolean.valueOf(z11));
                }

                public static final void h(final g00.a<p> onSeeAllClicked, androidx.compose.runtime.a aVar, final int i11) {
                    int i12;
                    androidx.compose.runtime.a aVar2;
                    int i13;
                    o.i(onSeeAllClicked, "onSeeAllClicked");
                    androidx.compose.runtime.a h11 = aVar.h(2021967055);
                    if ((i11 & 14) == 0) {
                        if (h11.F(onSeeAllClicked)) {
                            i13 = 4;
                        } else {
                            i13 = 2;
                        }
                        i12 = i13 | i11;
                    } else {
                        i12 = i11;
                    }
                    if ((i12 & 11) == 2 && h11.i()) {
                        h11.L();
                        aVar2 = h11;
                    } else {
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(2021967055, i12, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.TrailingAction (HotZoneSectionView.kt:229)");
                        }
                        androidx.compose.ui.c a11 = TestTagKt.a(androidx.compose.ui.c.f7566a, "hotZoneSeeAllButton");
                        ButtonData c11 = ButtonData.f40994a.c();
                        w.o a12 = PaddingKt.a(h.l(0));
                        h11.C(1157296644);
                        boolean T = h11.T(onSeeAllClicked);
                        Object D = h11.D();
                        if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                            D = new g00.a<p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$TrailingAction$1$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    onSeeAllClicked.invoke();
                                }
                            };
                            h11.u(D);
                        }
                        h11.S();
                        aVar2 = h11;
                        ButtonsKt.l((g00.a) D, a11, c11, false, a12, null, null, null, null, null, ComposableSingletons$HotZoneSectionViewKt.f23595a.a(), h11, (ButtonData.f40995b << 6) | 24624, 6, 1000);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }
                    d1 l11 = aVar2.l();
                    if (l11 != null) {
                        l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$TrailingAction$2
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void b(androidx.compose.runtime.a aVar3, int i14) {
                                HotZoneSectionViewKt.h(onSeeAllClicked, aVar3, v0.a(i11 | 1));
                            }

                            @Override // g00.p
                            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                                b(aVar3, num.intValue());
                                return p.f75480a;
                            }
                        });
                    }
                }

                private static final void n(LazyListScope lazyListScope, final List<VerticalListingItemViewModel> list, final g00.p<? super AdsModel, ? super com.forsale.adserver.view.screens.detailsScreen.a, p> pVar) {
                    lazyListScope.f(list.size(), null, new l<Integer, Object>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$commercialListing$$inlined$itemsIndexed$default$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final Object b(int i11) {
                            list.get(i11);
                            return null;
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                            return b(num.intValue());
                        }
                    }, b.c(-1091073711, true, new g00.r<x.a, Integer, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$commercialListing$$inlined$itemsIndexed$default$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(4);
                        }

                        public final void b(x.a aVar, final int i11, androidx.compose.runtime.a aVar2, int i12) {
                            int i13;
                            int i14;
                            int i15;
                            if ((i12 & 14) == 0) {
                                if (aVar2.T(aVar)) {
                                    i15 = 4;
                                } else {
                                    i15 = 2;
                                }
                                i13 = i15 | i12;
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
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.U(-1091073711, i13, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:183)");
                            }
                            final VerticalListingItemViewModel verticalListingItemViewModel = (VerticalListingItemViewModel) list.get(i11);
                            String L = verticalListingItemViewModel.L();
                            final g00.p pVar2 = pVar;
                            final List list2 = list;
                            HotZoneSectionViewKt.e(null, L, 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0059: INVOKE  
                                  (null androidx.compose.ui.c)
                                  (r1v0 'L' java.lang.String)
                                  (wrap: g00.a<wz.p> : 0x0053: CONSTRUCTOR  (r2v0 g00.a<wz.p> A[REMOVE]) = 
                                  (r10v4 'pVar2' g00.p A[DONT_INLINE])
                                  (r7v6 'verticalListingItemViewModel' com.forsale.app.features.categories.listings.items.listingItems.featuredListingItem.VerticalListingItemViewModel A[DONT_INLINE])
                                  (r3v0 'list2' java.util.List A[DONT_INLINE])
                                  (r8v0 'i11' int A[DONT_INLINE])
                                 call: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$commercialListing$1$1.<init>(g00.p, com.forsale.app.features.categories.listings.items.listingItems.featuredListingItem.VerticalListingItemViewModel, java.util.List, int):void type: CONSTRUCTOR)
                                  (r9v0 'aVar2' androidx.compose.runtime.a)
                                  (0 int)
                                  (1 int)
                                 type: STATIC call: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt.e(androidx.compose.ui.c, java.lang.String, g00.a, androidx.compose.runtime.a, int, int):void in method: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$commercialListing$$inlined$itemsIndexed$default$3.b(x.a, int, androidx.compose.runtime.a, int):void, file: classes2.dex
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$commercialListing$1$1, state: NOT_LOADED
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
                                this = this;
                                r0 = r10 & 14
                                if (r0 != 0) goto Lf
                                boolean r7 = r9.T(r7)
                                if (r7 == 0) goto Lc
                                r7 = 4
                                goto Ld
                            Lc:
                                r7 = 2
                            Ld:
                                r7 = r7 | r10
                                goto L10
                            Lf:
                                r7 = r10
                            L10:
                                r10 = r10 & 112(0x70, float:1.57E-43)
                                if (r10 != 0) goto L20
                                boolean r10 = r9.d(r8)
                                if (r10 == 0) goto L1d
                                r10 = 32
                                goto L1f
                            L1d:
                                r10 = 16
                            L1f:
                                r7 = r7 | r10
                            L20:
                                r10 = r7 & 731(0x2db, float:1.024E-42)
                                r0 = 146(0x92, float:2.05E-43)
                                if (r10 != r0) goto L31
                                boolean r10 = r9.i()
                                if (r10 != 0) goto L2d
                                goto L31
                            L2d:
                                r9.L()
                                goto L65
                            L31:
                                boolean r10 = androidx.compose.runtime.c.I()
                                if (r10 == 0) goto L40
                                r10 = -1
                                java.lang.String r0 = "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:183)"
                                r1 = -1091073711(0xffffffffbef78951, float:-0.48346952)
                                androidx.compose.runtime.c.U(r1, r7, r10, r0)
                            L40:
                                java.util.List r7 = r1
                                java.lang.Object r7 = r7.get(r8)
                                com.forsale.app.features.categories.listings.items.listingItems.featuredListingItem.VerticalListingItemViewModel r7 = (com.forsale.app.features.categories.listings.items.listingItems.featuredListingItem.VerticalListingItemViewModel) r7
                                r0 = 0
                                java.lang.String r1 = r7.L()
                                com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$commercialListing$1$1 r2 = new com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$commercialListing$1$1
                                g00.p r10 = r2
                                java.util.List r3 = r3
                                r2.<init>(r10, r7, r3, r8)
                                r4 = 0
                                r5 = 1
                                r3 = r9
                                com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt.k(r0, r1, r2, r3, r4, r5)
                                boolean r7 = androidx.compose.runtime.c.I()
                                if (r7 == 0) goto L65
                                androidx.compose.runtime.c.T()
                            L65:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$commercialListing$$inlined$itemsIndexed$default$3.b(x.a, int, androidx.compose.runtime.a, int):void");
                        }

                        @Override // g00.r
                        public /* bridge */ /* synthetic */ p d(x.a aVar, Integer num, androidx.compose.runtime.a aVar2, Integer num2) {
                            b(aVar, num.intValue(), aVar2, num2.intValue());
                            return p.f75480a;
                        }
                    }));
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void o(LazyListScope lazyListScope, List<VerticalListingItemViewModel> list, q<? super ListingItemBrief, ? super Integer, ? super List<Integer>, p> qVar, g00.p<? super AdsModel, ? super com.forsale.adserver.view.screens.detailsScreen.a, p> pVar, boolean z11, l<? super androidx.compose.ui.layout.l, p> lVar) {
                    if (z11) {
                        n(lazyListScope, list, pVar);
                    } else {
                        p(lazyListScope, list, qVar, lVar);
                    }
                }

                private static final void p(LazyListScope lazyListScope, final List<VerticalListingItemViewModel> list, final q<? super ListingItemBrief, ? super Integer, ? super List<Integer>, p> qVar, final l<? super androidx.compose.ui.layout.l, p> lVar) {
                    lazyListScope.f(list.size(), null, new l<Integer, Object>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$normalListings$$inlined$itemsIndexed$default$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final Object b(int i11) {
                            list.get(i11);
                            return null;
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                            return b(num.intValue());
                        }
                    }, b.c(-1091073711, true, new g00.r<x.a, Integer, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$normalListings$$inlined$itemsIndexed$default$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(4);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r10v10 */
                        /* JADX WARN: Type inference failed for: r25v0, types: [androidx.compose.runtime.a] */
                        public final void b(x.a aVar, final int i11, androidx.compose.runtime.a aVar2, int i12) {
                            int i13;
                            n1 a11;
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
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.U(-1091073711, i13, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:183)");
                            }
                            final VerticalListingItemViewModel verticalListingItemViewModel = (VerticalListingItemViewModel) list.get(i11);
                            c.a aVar3 = new c.a();
                            String L = verticalListingItemViewModel.L();
                            LiveData<? extends String> o11 = verticalListingItemViewModel.o();
                            aVar2.C(868944432);
                            if (o11 == null) {
                                a11 = null;
                            } else {
                                a11 = LiveDataAdapterKt.a(o11, aVar2, 8);
                            }
                            aVar2.S();
                            String str = (a11 == null || (str = (String) a11.getValue()) == null) ? "" : "";
                            String G = verticalListingItemViewModel.G();
                            if (G == null) {
                                G = "";
                            }
                            String D = verticalListingItemViewModel.D();
                            hk.a N = verticalListingItemViewModel.N();
                            String M = verticalListingItemViewModel.M();
                            List<String> U = verticalListingItemViewModel.U();
                            a.b A = verticalListingItemViewModel.A();
                            c.a aVar4 = androidx.compose.ui.c.f7566a;
                            aVar2.C(1157296644);
                            boolean T = aVar2.T(lVar);
                            Object D2 = aVar2.D();
                            if (T || D2 == androidx.compose.runtime.a.f7182a.a()) {
                                final l lVar2 = lVar;
                                D2 = 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00bb: CONSTRUCTOR  (r13v1 'D2' java.lang.Object) = (r10v3 'lVar2' g00.l A[DONT_INLINE]) call: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$normalListings$1$1$1.<init>(g00.l):void type: CONSTRUCTOR in method: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$normalListings$$inlined$itemsIndexed$default$3.b(x.a, int, androidx.compose.runtime.a, int):void, file: classes2.dex
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
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$normalListings$1$1$1, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                                    	... 25 more
                                    */
                                /*
                                    Method dump skipped, instructions count: 307
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.HotZoneSectionViewKt$normalListings$$inlined$itemsIndexed$default$3.b(x.a, int, androidx.compose.runtime.a, int):void");
                            }

                            @Override // g00.r
                            public /* bridge */ /* synthetic */ p d(x.a aVar, Integer num, androidx.compose.runtime.a aVar2, Integer num2) {
                                b(aVar, num.intValue(), aVar2, num2.intValue());
                                return p.f75480a;
                            }
                        }));
                    }
                }
