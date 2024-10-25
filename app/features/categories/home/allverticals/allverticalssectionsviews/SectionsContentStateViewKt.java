package com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews;

import aj.b;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.DividerKt;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.z;
import com.forsale.adserver.view.models.AdsModel;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.features.categories.home.allverticals.AllVerticalsSectionType;
import com.forsale.app.features.categories.home.allverticals.f;
import com.forsale.app.features.categories.listingdetails.ListingDetailsAnalyticSource;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.utils.analytics.HomeVisitedSources;
import com.forsale.app.utils.analytics.PLFSource;
import e2.h;
import g00.l;
import g00.q;
import g00.r;
import j0.d1;
import j0.n1;
import j0.v0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s;
import kotlin.jvm.internal.o;
import wz.p;
import yj.d;
/* compiled from: SectionsContentStateView.kt */
/* loaded from: classes2.dex */
public final class SectionsContentStateViewKt {
    public static final void a(a aVar, final int i11) {
        a h11 = aVar.h(-384305312);
        if (i11 == 0 && h11.i()) {
            h11.L();
        } else {
            if (c.I()) {
                c.U(-384305312, i11, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.AllVerticalsSectionsLoadingState (SectionsContentStateView.kt:159)");
            }
            LazyDslKt.a(null, null, null, false, null, null, null, false, new l<LazyListScope, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.SectionsContentStateViewKt$AllVerticalsSectionsLoadingState$1
                public final void b(LazyListScope LazyColumn) {
                    o.i(LazyColumn, "$this$LazyColumn");
                    ComposableSingletons$SectionsContentStateViewKt composableSingletons$SectionsContentStateViewKt = ComposableSingletons$SectionsContentStateViewKt.f23598a;
                    LazyListScope.l(LazyColumn, null, null, composableSingletons$SectionsContentStateViewKt.a(), 3, null);
                    LazyListScope.l(LazyColumn, null, null, composableSingletons$SectionsContentStateViewKt.b(), 3, null);
                    LazyListScope.l(LazyColumn, null, null, composableSingletons$SectionsContentStateViewKt.c(), 3, null);
                    LazyListScope.l(LazyColumn, null, null, composableSingletons$SectionsContentStateViewKt.d(), 3, null);
                    LazyListScope.l(LazyColumn, null, null, composableSingletons$SectionsContentStateViewKt.e(), 3, null);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(LazyListScope lazyListScope) {
                    b(lazyListScope);
                    return p.f75480a;
                }
            }, h11, 100663296, 255);
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.SectionsContentStateViewKt$AllVerticalsSectionsLoadingState$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar2, int i12) {
                    SectionsContentStateViewKt.a(aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void b(final androidx.compose.ui.c modifier, a aVar, final int i11) {
        int i12;
        int i13;
        o.i(modifier, "modifier");
        a h11 = aVar.h(-267633554);
        if ((i11 & 14) == 0) {
            if (h11.T(modifier)) {
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
        } else {
            if (c.I()) {
                c.U(-267633554, i12, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.AutomotiveDivider (SectionsContentStateView.kt:154)");
            }
            DividerKt.a(modifier, dk.a.f54291a.a(h11, dk.a.f54292b).e().h(h11, d.f76453b), h.l(8), 0.0f, h11, (i12 & 14) | 384, 8);
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.SectionsContentStateViewKt$AutomotiveDivider$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar2, int i14) {
                    SectionsContentStateViewKt.b(androidx.compose.ui.c.this, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void c(final List<f> allVerticalsSections, final g00.p<? super CategoryEntity, ? super String, p> onCategoryItemClicked, r<? super ListingItemBrief, ? super ListingDetailsAnalyticSource, ? super Integer, ? super List<Integer>, p> rVar, q<? super ListingsTypes, ? super String, ? super String, p> qVar, q<? super List<String>, ? super String, ? super Integer, p> qVar2, q<? super String, ? super Integer, ? super Integer, p> qVar3, final g00.p<? super AdsModel, ? super com.forsale.adserver.view.screens.detailsScreen.a, p> onAdClicked, final HomeVisitedSources screenSource, final l<? super PLFSource, p> openPLFScreen, a aVar, final int i11, final int i12) {
        SectionsContentStateViewKt$SectionsContentStateView$1 sectionsContentStateViewKt$SectionsContentStateView$1;
        SectionsContentStateViewKt$SectionsContentStateView$2 sectionsContentStateViewKt$SectionsContentStateView$2;
        SectionsContentStateViewKt$SectionsContentStateView$3 sectionsContentStateViewKt$SectionsContentStateView$3;
        SectionsContentStateViewKt$SectionsContentStateView$4 sectionsContentStateViewKt$SectionsContentStateView$4;
        Integer d11;
        int y11;
        o.i(allVerticalsSections, "allVerticalsSections");
        o.i(onCategoryItemClicked, "onCategoryItemClicked");
        o.i(onAdClicked, "onAdClicked");
        o.i(screenSource, "screenSource");
        o.i(openPLFScreen, "openPLFScreen");
        a h11 = aVar.h(-747407739);
        if ((i12 & 4) != 0) {
            sectionsContentStateViewKt$SectionsContentStateView$1 = new r<ListingItemBrief, ListingDetailsAnalyticSource, Integer, List<? extends Integer>, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.SectionsContentStateViewKt$SectionsContentStateView$1
                public final void b(ListingItemBrief listingItemBrief, ListingDetailsAnalyticSource listingDetailsAnalyticSource, int i13, List<Integer> list) {
                    o.i(listingItemBrief, "<anonymous parameter 0>");
                    o.i(listingDetailsAnalyticSource, "<anonymous parameter 1>");
                    o.i(list, "<anonymous parameter 3>");
                }

                @Override // g00.r
                public /* bridge */ /* synthetic */ p d(ListingItemBrief listingItemBrief, ListingDetailsAnalyticSource listingDetailsAnalyticSource, Integer num, List<? extends Integer> list) {
                    b(listingItemBrief, listingDetailsAnalyticSource, num.intValue(), list);
                    return p.f75480a;
                }
            };
        } else {
            sectionsContentStateViewKt$SectionsContentStateView$1 = rVar;
        }
        if ((i12 & 8) != 0) {
            sectionsContentStateViewKt$SectionsContentStateView$2 = new q<ListingsTypes, String, String, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.SectionsContentStateViewKt$SectionsContentStateView$2
                public final void b(ListingsTypes listingsTypes, String str, String str2) {
                    o.i(listingsTypes, "<anonymous parameter 0>");
                    o.i(str2, "<anonymous parameter 2>");
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(ListingsTypes listingsTypes, String str, String str2) {
                    b(listingsTypes, str, str2);
                    return p.f75480a;
                }
            };
        } else {
            sectionsContentStateViewKt$SectionsContentStateView$2 = qVar;
        }
        if ((i12 & 16) != 0) {
            sectionsContentStateViewKt$SectionsContentStateView$3 = new q<List<? extends String>, String, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.SectionsContentStateViewKt$SectionsContentStateView$3
                public final void b(List<String> list, String str, int i13) {
                    o.i(list, "<anonymous parameter 0>");
                    o.i(str, "<anonymous parameter 1>");
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(List<? extends String> list, String str, Integer num) {
                    b(list, str, num.intValue());
                    return p.f75480a;
                }
            };
        } else {
            sectionsContentStateViewKt$SectionsContentStateView$3 = qVar2;
        }
        if ((i12 & 32) != 0) {
            sectionsContentStateViewKt$SectionsContentStateView$4 = new q<String, Integer, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.SectionsContentStateViewKt$SectionsContentStateView$4
                public final void b(String str, int i13, int i14) {
                    o.i(str, "<anonymous parameter 0>");
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(String str, Integer num, Integer num2) {
                    b(str, num.intValue(), num2.intValue());
                    return p.f75480a;
                }
            };
        } else {
            sectionsContentStateViewKt$SectionsContentStateView$4 = qVar3;
        }
        if (c.I()) {
            c.U(-747407739, i11, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.SectionsContentStateView (SectionsContentStateView.kt:43)");
        }
        boolean z11 = false;
        final LazyListState c11 = LazyListStateKt.c(0, 0, h11, 0, 3);
        h11.C(-492369756);
        Object D = h11.D();
        if (D == a.f7182a.a()) {
            D = z.d(new g00.a<Integer>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.SectionsContentStateViewKt$SectionsContentStateView$maxItemReachedAds$2$1
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
                    if (a11.isEmpty() || allVerticalsSections.isEmpty()) {
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
        if (c11.e() && (d11 = d(n1Var)) != null) {
            if (d11.intValue() > allVerticalsSections.size()) {
                z11 = true;
            }
            if (z11) {
                d11 = null;
            }
            if (d11 != null) {
                int intValue = d11.intValue();
                List<f> list = allVerticalsSections;
                y11 = s.y(list, 10);
                ArrayList arrayList = new ArrayList(y11);
                for (f fVar : list) {
                    arrayList.add(fVar.c().getSectionName());
                }
                sectionsContentStateViewKt$SectionsContentStateView$3.invoke(arrayList, allVerticalsSections.get(intValue - 1).c().getSectionName(), Integer.valueOf(intValue));
            }
        }
        final r<? super ListingItemBrief, ? super ListingDetailsAnalyticSource, ? super Integer, ? super List<Integer>, p> rVar2 = sectionsContentStateViewKt$SectionsContentStateView$1;
        final q<? super ListingsTypes, ? super String, ? super String, p> qVar4 = sectionsContentStateViewKt$SectionsContentStateView$2;
        final q<? super String, ? super Integer, ? super Integer, p> qVar5 = sectionsContentStateViewKt$SectionsContentStateView$4;
        final q<? super List<String>, ? super String, ? super Integer, p> qVar6 = sectionsContentStateViewKt$SectionsContentStateView$3;
        LazyDslKt.a(null, c11, null, false, null, null, null, false, new l<LazyListScope, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.SectionsContentStateViewKt$SectionsContentStateView$7

            /* compiled from: SectionsContentStateView.kt */
            /* loaded from: classes2.dex */
            public /* synthetic */ class a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f23771a;

                static {
                    int[] iArr = new int[AllVerticalsSectionType.values().length];
                    try {
                        iArr[AllVerticalsSectionType.BUSINESS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[AllVerticalsSectionType.CATEGORY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[AllVerticalsSectionType.AUTO_FEATURED_ADS.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[AllVerticalsSectionType.BUSINESS_COMMERCIAL_ADS.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[AllVerticalsSectionType.FEATURED_ADS.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[AllVerticalsSectionType.NEW_ARRIVALS.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[AllVerticalsSectionType.GAM.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    f23771a = iArr;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void b(LazyListScope LazyColumn) {
                o.i(LazyColumn, "$this$LazyColumn");
                final List<f> list2 = allVerticalsSections;
                final g00.p<CategoryEntity, String, p> pVar = onCategoryItemClicked;
                final int i13 = i11;
                final r<ListingItemBrief, ListingDetailsAnalyticSource, Integer, List<Integer>, p> rVar3 = rVar2;
                final q<ListingsTypes, String, String, p> qVar7 = qVar4;
                final q<String, Integer, Integer, p> qVar8 = qVar5;
                final g00.p<AdsModel, com.forsale.adserver.view.screens.detailsScreen.a, p> pVar2 = onAdClicked;
                final l<PLFSource, p> lVar = openPLFScreen;
                final HomeVisitedSources homeVisitedSources = screenSource;
                LazyColumn.f(list2.size(), null, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0030: INVOKE  
                      (r15v0 'LazyColumn' androidx.compose.foundation.lazy.LazyListScope)
                      (wrap: int : 0x0017: INVOKE  (r0v1 int A[REMOVE]) = (r10v0 'list2' java.util.List<com.forsale.app.features.categories.home.allverticals.f>) type: INTERFACE call: java.util.List.size():int)
                      (null g00.l<? super java.lang.Integer, ? extends java.lang.Object>)
                      (wrap: g00.l<java.lang.Integer, java.lang.Object> : 0x001d: CONSTRUCTOR  (r12v0 g00.l<java.lang.Integer, java.lang.Object> A[REMOVE]) = (r10v0 'list2' java.util.List<com.forsale.app.features.categories.home.allverticals.f> A[DONT_INLINE]) call: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.SectionsContentStateViewKt$SectionsContentStateView$7$invoke$$inlined$itemsIndexed$default$2.<init>(java.util.List):void type: CONSTRUCTOR)
                      (wrap: r0.a : 0x002b: INVOKE  (r1v2 r0.a A[REMOVE]) = 
                      (-1091073711 int)
                      true
                      (wrap: g00.r<x.a, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x0024: CONSTRUCTOR  (r13v0 g00.r<x.a, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = 
                      (r10v0 'list2' java.util.List<com.forsale.app.features.categories.home.allverticals.f> A[DONT_INLINE])
                      (r3v0 'pVar' g00.p<com.forsale.app.datalayer.database.CategoryEntity, java.lang.String, wz.p> A[DONT_INLINE])
                      (r4v0 'i13' int A[DONT_INLINE])
                      (r5v0 'rVar3' g00.r<com.forsale.app.datalayer.network.responses.ListingItemBrief, com.forsale.app.features.categories.listingdetails.ListingDetailsAnalyticSource, java.lang.Integer, java.util.List<java.lang.Integer>, wz.p> A[DONT_INLINE])
                      (r6v0 'qVar7' g00.q<com.forsale.app.features.categories.listings.ListingsTypes, java.lang.String, java.lang.String, wz.p> A[DONT_INLINE])
                      (r7v0 'qVar8' g00.q<java.lang.String, java.lang.Integer, java.lang.Integer, wz.p> A[DONT_INLINE])
                      (r8v0 'pVar2' g00.p<com.forsale.adserver.view.models.AdsModel, com.forsale.adserver.view.screens.detailsScreen.a, wz.p> A[DONT_INLINE])
                      (r9v0 'lVar' g00.l<com.forsale.app.utils.analytics.PLFSource, wz.p> A[DONT_INLINE])
                      (r10v0 'list2' java.util.List<com.forsale.app.features.categories.home.allverticals.f> A[DONT_INLINE])
                      (r11v0 'homeVisitedSources' com.forsale.app.utils.analytics.HomeVisitedSources A[DONT_INLINE])
                     call: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.SectionsContentStateViewKt$SectionsContentStateView$7$invoke$$inlined$itemsIndexed$default$3.<init>(java.util.List, g00.p, int, g00.r, g00.q, g00.q, g00.p, g00.l, java.util.List, com.forsale.app.utils.analytics.HomeVisitedSources):void type: CONSTRUCTOR)
                     type: STATIC call: r0.b.c(int, boolean, java.lang.Object):r0.a)
                     type: INTERFACE call: androidx.compose.foundation.lazy.LazyListScope.f(int, g00.l, g00.l, g00.r):void in method: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.SectionsContentStateViewKt$SectionsContentStateView$7.b(androidx.compose.foundation.lazy.LazyListScope):void, file: classes2.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.SectionsContentStateViewKt$SectionsContentStateView$7$invoke$$inlined$itemsIndexed$default$2, state: NOT_LOADED
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
                    java.lang.String r0 = "$this$LazyColumn"
                    kotlin.jvm.internal.o.i(r15, r0)
                    java.util.List<com.forsale.app.features.categories.home.allverticals.f> r10 = r1
                    g00.p<com.forsale.app.datalayer.database.CategoryEntity, java.lang.String, wz.p> r3 = r2
                    int r4 = r3
                    g00.r<com.forsale.app.datalayer.network.responses.ListingItemBrief, com.forsale.app.features.categories.listingdetails.ListingDetailsAnalyticSource, java.lang.Integer, java.util.List<java.lang.Integer>, wz.p> r5 = r4
                    g00.q<com.forsale.app.features.categories.listings.ListingsTypes, java.lang.String, java.lang.String, wz.p> r6 = r5
                    g00.q<java.lang.String, java.lang.Integer, java.lang.Integer, wz.p> r7 = r6
                    g00.p<com.forsale.adserver.view.models.AdsModel, com.forsale.adserver.view.screens.detailsScreen.a, wz.p> r8 = r7
                    g00.l<com.forsale.app.utils.analytics.PLFSource, wz.p> r9 = r8
                    com.forsale.app.utils.analytics.HomeVisitedSources r11 = r9
                    int r0 = r10.size()
                    com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.SectionsContentStateViewKt$SectionsContentStateView$7$invoke$$inlined$itemsIndexed$default$2 r12 = new com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.SectionsContentStateViewKt$SectionsContentStateView$7$invoke$$inlined$itemsIndexed$default$2
                    r12.<init>(r10)
                    com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.SectionsContentStateViewKt$SectionsContentStateView$7$invoke$$inlined$itemsIndexed$default$3 r13 = new com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.SectionsContentStateViewKt$SectionsContentStateView$7$invoke$$inlined$itemsIndexed$default$3
                    r1 = r13
                    r2 = r10
                    r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                    r1 = -1091073711(0xffffffffbef78951, float:-0.48346952)
                    r2 = 1
                    r0.a r1 = r0.b.c(r1, r2, r13)
                    r2 = 0
                    r15.f(r0, r2, r12, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.SectionsContentStateViewKt$SectionsContentStateView$7.b(androidx.compose.foundation.lazy.LazyListScope):void");
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(LazyListScope lazyListScope) {
                b(lazyListScope);
                return p.f75480a;
            }
        }, h11, 0, 253);
        if (c.I()) {
            c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            final r<? super ListingItemBrief, ? super ListingDetailsAnalyticSource, ? super Integer, ? super List<Integer>, p> rVar3 = sectionsContentStateViewKt$SectionsContentStateView$1;
            final q<? super ListingsTypes, ? super String, ? super String, p> qVar7 = sectionsContentStateViewKt$SectionsContentStateView$2;
            final q<? super String, ? super Integer, ? super Integer, p> qVar8 = sectionsContentStateViewKt$SectionsContentStateView$4;
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.SectionsContentStateViewKt$SectionsContentStateView$8
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar2, int i13) {
                    SectionsContentStateViewKt.c(allVerticalsSections, onCategoryItemClicked, rVar3, qVar7, qVar6, qVar8, onAdClicked, screenSource, openPLFScreen, aVar2, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    private static final Integer d(n1<Integer> n1Var) {
        return n1Var.getValue();
    }
}
