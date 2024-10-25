package com.forsale.app.features.categories.home.propertyhome;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.recyclerview.widget.RecyclerView;
import c0.g;
import com.forsale.app.datalayer.network.responses.RecommendedSectionsResponse;
import com.forsale.app.features.categories.home.propertyhome.models.SectionState;
import com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItemViewModel;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.layouts.SectionTitleKt;
import e2.h;
import g00.q;
import g00.r;
import j0.d1;
import j0.e1;
import j0.k;
import j0.n1;
import j0.v0;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: RecommendedSections.kt */
/* loaded from: classes2.dex */
public final class RecommendedSectionsKt {
    public static final void a(final xa.c recommendedSectionModel, final boolean z11, final int i11, boolean z12, r<? super Integer, ? super Integer, ? super Integer, ? super Pair<? extends List<String>, ? extends List<String>>, p> rVar, final g00.a<p> discoverCallBack, androidx.compose.runtime.a aVar, final int i12, final int i13) {
        boolean z13;
        RecommendedSectionsKt$RecommendedSection$1 recommendedSectionsKt$RecommendedSection$1;
        o.i(recommendedSectionModel, "recommendedSectionModel");
        o.i(discoverCallBack, "discoverCallBack");
        androidx.compose.runtime.a h11 = aVar.h(1294828785);
        if ((i13 & 8) != 0) {
            z13 = false;
        } else {
            z13 = z12;
        }
        if ((i13 & 16) != 0) {
            recommendedSectionsKt$RecommendedSection$1 = new r<Integer, Integer, Integer, Pair<? extends List<? extends String>, ? extends List<? extends String>>, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSection$1
                public final void b(int i14, int i15, int i16, Pair<? extends List<String>, ? extends List<String>> pair) {
                    o.i(pair, "<anonymous parameter 3>");
                }

                @Override // g00.r
                public /* bridge */ /* synthetic */ p d(Integer num, Integer num2, Integer num3, Pair<? extends List<? extends String>, ? extends List<? extends String>> pair) {
                    b(num.intValue(), num2.intValue(), num3.intValue(), pair);
                    return p.f75480a;
                }
            };
        } else {
            recommendedSectionsKt$RecommendedSection$1 = rVar;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1294828785, i12, -1, "com.forsale.app.features.categories.home.propertyhome.RecommendedSection (RecommendedSections.kt:83)");
        }
        List<ForPropertyListingItemViewModel> b11 = recommendedSectionModel.b();
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        androidx.compose.ui.c b12 = BackgroundKt.b(aVar2, dk.a.f54291a.a(h11, dk.a.f54292b).e().h(h11, yj.d.f76453b), null, 2, null);
        h11.C(-483455358);
        a0 a11 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), h11, 0);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(b12);
        if (!(h11.k() instanceof j0.d)) {
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
        g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b13);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        w.f fVar = w.f.f74891a;
        float f11 = 16;
        float f12 = 8;
        int i14 = i12 & 112;
        int i15 = i14 | 6;
        SpacerKt.a(com.forsale.ui.components.skeleton.a.a(SizeKt.i(aVar2, h.l(f11)), z11, g.c(h.l(f12)), 0L, 0L, h11, i15, 12), h11, 0);
        b(recommendedSectionModel.c(), z11, discoverCallBack, h11, i14 | 8 | ((i12 >> 9) & 896));
        SpacerKt.a(com.forsale.ui.components.skeleton.a.a(SizeKt.i(aVar2, h.l(f12)), z11, g.c(h.l(f12)), 0L, 0L, h11, i15, 12), h11, 0);
        int i16 = i12 << 3;
        c(b11, recommendedSectionModel.a(), z11, i11, recommendedSectionsKt$RecommendedSection$1, h11, (i16 & 7168) | (i16 & 896) | 72 | (57344 & i12), 0);
        SpacerKt.a(com.forsale.ui.components.skeleton.a.a(SizeKt.i(aVar2, h.l(f11)), z11, g.c(h.l(f12)), 0L, 0L, h11, i15, 12), h11, 0);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            final boolean z14 = z13;
            final r<? super Integer, ? super Integer, ? super Integer, ? super Pair<? extends List<String>, ? extends List<String>>, p> rVar2 = recommendedSectionsKt$RecommendedSection$1;
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSection$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i17) {
                    RecommendedSectionsKt.a(xa.c.this, z11, i11, z14, rVar2, discoverCallBack, aVar3, v0.a(i12 | 1), i13);
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
    public static final void b(final RecommendedSectionsResponse.Section section, final boolean z11, final g00.a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
        androidx.compose.runtime.a h11 = aVar2.h(-548072403);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-548072403, i11, -1, "com.forsale.app.features.categories.home.propertyhome.RecommendedSectionHeader (RecommendedSections.kt:116)");
        }
        float f11 = 16;
        SectionTitleKt.a(PaddingKt.m(androidx.compose.ui.c.f7566a, h.l(f11), 0.0f, h.l(f11), 0.0f, 10, null), null, r0.b.b(h11, 1423483695, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSectionHeader$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar3, int i12) {
                if ((i12 & 11) == 2 && aVar3.i()) {
                    aVar3.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(1423483695, i12, -1, "com.forsale.app.features.categories.home.propertyhome.RecommendedSectionHeader.<anonymous> (RecommendedSections.kt:119)");
                }
                TextKt.a(RecommendedSectionsResponse.Section.this.getTitle(), com.forsale.ui.components.skeleton.a.a(androidx.compose.ui.c.f7566a, z11, g.c(h.l(8)), 0L, 0L, aVar3, (i11 & 112) | 6, 12), 0, 0, false, 0, 0, null, null, 0L, 0, aVar3, 0, 0, 2044);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                b(aVar3, num.intValue());
                return p.f75480a;
            }
        }), null, r0.b.b(h11, -499766735, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSectionHeader$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar3, int i12) {
                if ((i12 & 11) == 2 && aVar3.i()) {
                    aVar3.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-499766735, i12, -1, "com.forsale.app.features.categories.home.propertyhome.RecommendedSectionHeader.<anonymous> (RecommendedSections.kt:120)");
                }
                aVar.invoke();
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                b(aVar3, num.intValue());
                return p.f75480a;
            }
        }), null, h11, 24966, 42);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSectionHeader$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i12) {
                    RecommendedSectionsKt.b(RecommendedSectionsResponse.Section.this, z11, aVar, aVar3, v0.a(i11 | 1));
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
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final java.util.List<com.forsale.app.features.categories.listings.items.forProperty.ForPropertyListingItemViewModel> r19, final kotlin.Pair<? extends java.util.List<java.lang.String>, ? extends java.util.List<java.lang.String>> r20, final boolean r21, final int r22, g00.r<? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super kotlin.Pair<? extends java.util.List<java.lang.String>, ? extends java.util.List<java.lang.String>>, wz.p> r23, androidx.compose.runtime.a r24, final int r25, final int r26) {
        /*
            r1 = r19
            r6 = r25
            r0 = 1310405874(0x4e1b34f2, float:6.5098458E8)
            r2 = r24
            androidx.compose.runtime.a r2 = r2.h(r0)
            r3 = r26 & 16
            if (r3 == 0) goto L15
            com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSectionList$1 r3 = new g00.r<java.lang.Integer, java.lang.Integer, java.lang.Integer, kotlin.Pair<? extends java.util.List<? extends java.lang.String>, ? extends java.util.List<? extends java.lang.String>>, wz.p>() { // from class: com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSectionList$1
                static {
                    /*
                        com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSectionList$1 r0 = new com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSectionList$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSectionList$1) com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSectionList$1.a com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSectionList$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSectionList$1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 4
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSectionList$1.<init>():void");
                }

                public final void b(int r1, int r2, int r3, kotlin.Pair<? extends java.util.List<java.lang.String>, ? extends java.util.List<java.lang.String>> r4) {
                    /*
                        r0 = this;
                        java.lang.String r1 = "<anonymous parameter 3>"
                        kotlin.jvm.internal.o.i(r4, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSectionList$1.b(int, int, int, kotlin.Pair):void");
                }

                @Override // g00.r
                public /* bridge */ /* synthetic */ wz.p d(java.lang.Integer r1, java.lang.Integer r2, java.lang.Integer r3, kotlin.Pair<? extends java.util.List<? extends java.lang.String>, ? extends java.util.List<? extends java.lang.String>> r4) {
                    /*
                        r0 = this;
                        java.lang.Number r1 = (java.lang.Number) r1
                        int r1 = r1.intValue()
                        java.lang.Number r2 = (java.lang.Number) r2
                        int r2 = r2.intValue()
                        java.lang.Number r3 = (java.lang.Number) r3
                        int r3 = r3.intValue()
                        kotlin.Pair r4 = (kotlin.Pair) r4
                        r0.b(r1, r2, r3, r4)
                        wz.p r1 = wz.p.f75480a
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSectionList$1.d(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }
            r5 = r3
            goto L17
        L15:
            r5 = r23
        L17:
            boolean r3 = androidx.compose.runtime.c.I()
            if (r3 == 0) goto L23
            r3 = -1
            java.lang.String r4 = "com.forsale.app.features.categories.home.propertyhome.RecommendedSectionList (RecommendedSections.kt:145)"
            androidx.compose.runtime.c.U(r0, r6, r3, r4)
        L23:
            r0 = 3
            r3 = 0
            androidx.compose.foundation.lazy.LazyListState r8 = androidx.compose.foundation.lazy.LazyListStateKt.c(r3, r3, r2, r3, r0)
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            r4 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2.C(r4)
            java.lang.Object r4 = r2.D()
            androidx.compose.runtime.a$a r7 = androidx.compose.runtime.a.f7182a
            java.lang.Object r7 = r7.a()
            if (r4 != r7) goto L4e
            com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSectionList$maxItemReachedAds$2$1 r4 = new com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSectionList$maxItemReachedAds$2$1
            r4.<init>()
            j0.n1 r4 = androidx.compose.runtime.z.d(r4)
            r2.u(r4)
        L4e:
            r2.S()
            j0.n1 r4 = (j0.n1) r4
            boolean r7 = r8.e()
            if (r7 == 0) goto L82
            java.lang.Integer r4 = d(r4)
            if (r4 == 0) goto L82
            int r7 = r4.intValue()
            if (r7 <= r0) goto L66
            r3 = 1
        L66:
            if (r3 != 0) goto L69
            goto L6a
        L69:
            r4 = 0
        L6a:
            if (r4 == 0) goto L82
            int r3 = r4.intValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r22)
            r15 = r20
            r5.d(r3, r4, r7, r15)
            goto L84
        L82:
            r15 = r20
        L84:
            r3 = 16
            float r3 = (float) r3
            float r9 = e2.h.l(r3)
            r10 = 0
            float r11 = e2.h.l(r3)
            r12 = 0
            r13 = 10
            r14 = 0
            w.o r9 = androidx.compose.foundation.layout.PaddingKt.e(r9, r10, r11, r12, r13, r14)
            androidx.compose.foundation.layout.Arrangement r3 = androidx.compose.foundation.layout.Arrangement.f3698a
            r4 = 12
            float r4 = (float) r4
            float r4 = e2.h.l(r4)
            androidx.compose.foundation.layout.Arrangement$f r11 = r3.o(r4)
            r7 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSectionList$4 r3 = new com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSectionList$4
            r4 = r21
            r3.<init>()
            r17 = 24960(0x6180, float:3.4976E-41)
            r18 = 233(0xe9, float:3.27E-43)
            r15 = r3
            r16 = r2
            androidx.compose.foundation.lazy.LazyDslKt.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.c.I()
            if (r0 == 0) goto Lc4
            androidx.compose.runtime.c.T()
        Lc4:
            j0.d1 r8 = r2.l()
            if (r8 != 0) goto Lcb
            goto Le0
        Lcb:
            com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSectionList$5 r9 = new com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSectionList$5
            r0 = r9
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r6 = r25
            r7 = r26
            r0.<init>()
            r8.a(r9)
        Le0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt.c(java.util.List, kotlin.Pair, boolean, int, g00.r, androidx.compose.runtime.a, int, int):void");
    }

    private static final Integer d(n1<Integer> n1Var) {
        return n1Var.getValue();
    }

    public static final void e(final boolean z11, final SectionState recommendedSectionsResponse, final r<? super Integer, ? super Integer, ? super Integer, ? super Pair<? extends List<String>, ? extends List<String>>, p> rVar, final g00.a<p> discoverCallBack, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        final int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        o.i(recommendedSectionsResponse, "recommendedSectionsResponse");
        o.i(discoverCallBack, "discoverCallBack");
        androidx.compose.runtime.a h11 = aVar.h(-1475481762);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (h11.a(z11)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (h11.T(recommendedSectionsResponse)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        int i18 = i12 & 4;
        if (i18 != 0) {
            i13 |= 384;
        } else if ((i11 & 896) == 0) {
            if (h11.F(rVar)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i13 |= i16;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            if (h11.F(discoverCallBack)) {
                i17 = RecyclerView.l.FLAG_MOVED;
            } else {
                i17 = 1024;
            }
            i13 |= i17;
        }
        if ((i13 & 5851) == 1170 && h11.i()) {
            h11.L();
        } else {
            if (i18 != 0) {
                rVar = new r<Integer, Integer, Integer, Pair<? extends List<? extends String>, ? extends List<? extends String>>, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSections$1
                    public final void b(int i19, int i21, int i22, Pair<? extends List<String>, ? extends List<String>> pair) {
                        o.i(pair, "<anonymous parameter 3>");
                    }

                    @Override // g00.r
                    public /* bridge */ /* synthetic */ p d(Integer num, Integer num2, Integer num3, Pair<? extends List<? extends String>, ? extends List<? extends String>> pair) {
                        b(num.intValue(), num2.intValue(), num3.intValue(), pair);
                        return p.f75480a;
                    }
                };
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1475481762, i13, -1, "com.forsale.app.features.categories.home.propertyhome.RecommendedSections (RecommendedSections.kt:47)");
            }
            recommendedSectionsResponse.a(r0.b.b(h11, 266371688, true, new q<SectionState.e, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSections$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v4 */
                /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.runtime.a] */
                public final void b(SectionState.e result, androidx.compose.runtime.a aVar2, int i19) {
                    List<?> d11;
                    o.i(result, "result");
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(266371688, i19, -1, "com.forsale.app.features.categories.home.propertyhome.RecommendedSections.<anonymous> (RecommendedSections.kt:49)");
                    }
                    if (z11) {
                        d11 = kotlin.collections.r.n();
                    } else {
                        d11 = result.d();
                        o.g(d11, "null cannot be cast to non-null type kotlin.collections.List<com.forsale.app.features.categories.home.propertyhome.models.RecommendedSectionModel>");
                    }
                    List<?> list = d11;
                    boolean z12 = z11;
                    r<Integer, Integer, Integer, Pair<? extends List<String>, ? extends List<String>>, p> rVar2 = rVar;
                    Boolean valueOf = Boolean.valueOf(z12);
                    final g00.a<p> aVar3 = discoverCallBack;
                    final boolean z13 = z11;
                    aVar2.C(511388516);
                    boolean T = aVar2.T(valueOf) | aVar2.T(aVar3);
                    Object D = aVar2.D();
                    if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                        D = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0052: CONSTRUCTOR  (r4v3 'D' java.lang.Object) = (r3v0 'z13' boolean A[DONT_INLINE]), (r10v3 'aVar3' g00.a<wz.p> A[DONT_INLINE]) call: com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSections$2$1$1.<init>(boolean, g00.a):void type: CONSTRUCTOR in method: com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSections$2.b(com.forsale.app.features.categories.home.propertyhome.models.SectionState$e, androidx.compose.runtime.a, int):void, file: classes2.dex
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
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSections$2$1$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                            	... 21 more
                            */
                        /*
                            this = this;
                            java.lang.String r0 = "result"
                            kotlin.jvm.internal.o.i(r8, r0)
                            boolean r0 = androidx.compose.runtime.c.I()
                            if (r0 == 0) goto L14
                            r0 = -1
                            java.lang.String r1 = "com.forsale.app.features.categories.home.propertyhome.RecommendedSections.<anonymous> (RecommendedSections.kt:49)"
                            r2 = 266371688(0xfe08268, float:2.2138336E-29)
                            androidx.compose.runtime.c.U(r2, r10, r0, r1)
                        L14:
                            boolean r10 = r1
                            if (r10 == 0) goto L1d
                            java.util.List r8 = kotlin.collections.p.n()
                            goto L26
                        L1d:
                            java.util.List r8 = r8.d()
                            java.lang.String r10 = "null cannot be cast to non-null type kotlin.collections.List<com.forsale.app.features.categories.home.propertyhome.models.RecommendedSectionModel>"
                            kotlin.jvm.internal.o.g(r8, r10)
                        L26:
                            r0 = r8
                            boolean r1 = r1
                            g00.r<java.lang.Integer, java.lang.Integer, java.lang.Integer, kotlin.Pair<? extends java.util.List<java.lang.String>, ? extends java.util.List<java.lang.String>>, wz.p> r2 = r2
                            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
                            g00.a<wz.p> r10 = r3
                            boolean r3 = r1
                            r4 = 511388516(0x1e7b2b64, float:1.3296802E-20)
                            r9.C(r4)
                            boolean r8 = r9.T(r8)
                            boolean r4 = r9.T(r10)
                            r8 = r8 | r4
                            java.lang.Object r4 = r9.D()
                            if (r8 != 0) goto L50
                            androidx.compose.runtime.a$a r8 = androidx.compose.runtime.a.f7182a
                            java.lang.Object r8 = r8.a()
                            if (r4 != r8) goto L58
                        L50:
                            com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSections$2$1$1 r4 = new com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSections$2$1$1
                            r4.<init>(r3, r10)
                            r9.u(r4)
                        L58:
                            r9.S()
                            r3 = r4
                            g00.a r3 = (g00.a) r3
                            int r8 = r4
                            int r10 = r8 << 3
                            r10 = r10 & 112(0x70, float:1.57E-43)
                            r10 = r10 | 8
                            r8 = r8 & 896(0x380, float:1.256E-42)
                            r5 = r10 | r8
                            r6 = 0
                            r4 = r9
                            com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt.f(r0, r1, r2, r3, r4, r5, r6)
                            boolean r8 = androidx.compose.runtime.c.I()
                            if (r8 == 0) goto L78
                            androidx.compose.runtime.c.T()
                        L78:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSections$2.b(com.forsale.app.features.categories.home.propertyhome.models.SectionState$e, androidx.compose.runtime.a, int):void");
                    }

                    @Override // g00.q
                    public /* bridge */ /* synthetic */ p invoke(SectionState.e eVar, androidx.compose.runtime.a aVar2, Integer num) {
                        b(eVar, aVar2, num.intValue());
                        return p.f75480a;
                    }
                }), h11, (i13 & 112) | 6);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }
            final r<? super Integer, ? super Integer, ? super Integer, ? super Pair<? extends List<String>, ? extends List<String>>, p> rVar2 = rVar;
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$RecommendedSections$3
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i19) {
                        RecommendedSectionsKt.e(z11, recommendedSectionsResponse, rVar2, discoverCallBack, aVar2, v0.a(i11 | 1), i12);
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        public static final void f(final List<xa.c> list, final boolean z11, r<? super Integer, ? super Integer, ? super Integer, ? super Pair<? extends List<String>, ? extends List<String>>, p> rVar, final g00.a<p> callBack, androidx.compose.runtime.a aVar, final int i11, final int i12) {
            final r<? super Integer, ? super Integer, ? super Integer, ? super Pair<? extends List<String>, ? extends List<String>>, p> rVar2;
            List<xa.c> list2;
            int p11;
            boolean z12;
            o.i(list, "list");
            o.i(callBack, "callBack");
            androidx.compose.runtime.a h11 = aVar.h(1674469943);
            if ((i12 & 4) != 0) {
                rVar2 = new r<Integer, Integer, Integer, Pair<? extends List<? extends String>, ? extends List<? extends String>>, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$ShowRecommendedSections$1
                    public final void b(int i13, int i14, int i15, Pair<? extends List<String>, ? extends List<String>> pair) {
                        o.i(pair, "<anonymous parameter 3>");
                    }

                    @Override // g00.r
                    public /* bridge */ /* synthetic */ p d(Integer num, Integer num2, Integer num3, Pair<? extends List<? extends String>, ? extends List<? extends String>> pair) {
                        b(num.intValue(), num2.intValue(), num3.intValue(), pair);
                        return p.f75480a;
                    }
                };
            } else {
                rVar2 = rVar;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1674469943, i11, -1, "com.forsale.app.features.categories.home.propertyhome.ShowRecommendedSections (RecommendedSections.kt:61)");
            }
            if (z11) {
                list2 = xa.c.f75786d.b(3);
            } else {
                list2 = list;
            }
            int i13 = 0;
            for (Object obj : list2) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    kotlin.collections.r.x();
                }
                xa.c cVar = (xa.c) obj;
                p11 = kotlin.collections.r.p(list);
                if (i13 == p11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                h11.C(1157296644);
                boolean T = h11.T(callBack);
                Object D = h11.D();
                if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                    D = new g00.a<p>() { // from class: com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$ShowRecommendedSections$2$1$1
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
                            callBack.invoke();
                        }
                    };
                    h11.u(D);
                }
                h11.S();
                a(cVar, z11, i13, z12, rVar2, (g00.a) D, h11, (i11 & 112) | 8 | ((i11 << 6) & 57344), 0);
                i13 = i14;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.RecommendedSectionsKt$ShowRecommendedSections$3
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i15) {
                        RecommendedSectionsKt.f(list, z11, rVar2, callBack, aVar2, v0.a(i11 | 1), i12);
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
