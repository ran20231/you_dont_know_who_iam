package com.forsale.adserver.view.composeViews.commercialList;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.c0;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import c0.g;
import coil.compose.AsyncImagePainter;
import com.forsale.adserver.view.models.AdGeneralModel;
import com.forsale.designSystem.SurfaceKt;
import com.forsale.designSystem.layouts.PosterKt;
import e2.h;
import g00.l;
import g00.q;
import j0.d1;
import j0.e;
import j0.e1;
import j0.k;
import j0.k0;
import j0.n1;
import j0.v0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.collections.w;
import kotlin.jvm.internal.o;
import sj.d;
import wz.p;
import x.j;
/* compiled from: CommercialHorizontalList.kt */
/* loaded from: classes2.dex */
public final class CommercialHorizontalListKt {
    /* JADX WARN: Removed duplicated region for block: B:129:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.util.List<java.lang.Integer> r26, kotlinx.coroutines.flow.SharedFlow<wz.p> r27, java.lang.String r28, boolean r29, g00.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r30, final g00.p<? super com.forsale.adserver.view.models.AdGeneralModel, ? super com.forsale.adserver.view.screens.detailsScreen.a, wz.p> r31, final g00.a<wz.p> r32, androidx.compose.runtime.a r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.view.composeViews.commercialList.CommercialHorizontalListKt.a(java.util.List, kotlinx.coroutines.flow.SharedFlow, java.lang.String, boolean, g00.p, g00.p, g00.a, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:260:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:467:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(androidx.compose.ui.c r33, java.lang.String r34, com.forsale.adserver.view.composeViews.commercialList.CommercialListViewModel r35, boolean r36, java.util.List<java.lang.Integer> r37, g00.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r38, g00.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r39, g00.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r40, kotlinx.coroutines.flow.SharedFlow<wz.p> r41, g00.l<? super java.lang.Boolean, wz.p> r42, g00.q<? super com.forsale.adserver.view.models.AdGeneralModel, ? super java.lang.Integer, ? super java.lang.Integer, wz.p> r43, g00.p<? super java.lang.Integer, ? super java.lang.Integer, wz.p> r44, androidx.compose.runtime.a r45, final int r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 1306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.view.composeViews.commercialList.CommercialHorizontalListKt.b(androidx.compose.ui.c, java.lang.String, com.forsale.adserver.view.composeViews.commercialList.CommercialListViewModel, boolean, java.util.List, g00.p, g00.p, g00.p, kotlinx.coroutines.flow.SharedFlow, g00.l, g00.q, g00.p, androidx.compose.runtime.a, int, int, int):void");
    }

    private static final Integer c(n1<Integer> n1Var) {
        return n1Var.getValue();
    }

    public static final void d(final AdGeneralModel adGeneralModel, final l<? super AdGeneralModel, p> lVar, androidx.compose.runtime.a aVar, final int i11) {
        Object valueOf;
        boolean z11;
        androidx.compose.runtime.a h11 = aVar.h(1317563180);
        if (c.I()) {
            c.U(1317563180, i11, -1, "com.forsale.adserver.view.composeViews.commercialList.CommercialItem (CommercialHorizontalList.kt:236)");
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
        if (adGeneralModel == null || (valueOf = adGeneralModel.c()) == null) {
            valueOf = Integer.valueOf(d.A);
        }
        h11.C(1157296644);
        boolean T = h11.T(k0Var);
        Object D2 = h11.D();
        if (T || D2 == c0064a.a()) {
            D2 = new l<AsyncImagePainter.b.c, p>() { // from class: com.forsale.adserver.view.composeViews.commercialList.CommercialHorizontalListKt$CommercialItem$painter$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(AsyncImagePainter.b.c it2) {
                    o.i(it2, "it");
                    CommercialHorizontalListKt.f(k0Var, true);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(AsyncImagePainter.b.c cVar) {
                    b(cVar);
                    return p.f75480a;
                }
            };
            h11.u(D2);
        }
        h11.S();
        l lVar2 = (l) D2;
        h11.C(1157296644);
        boolean T2 = h11.T(k0Var);
        Object D3 = h11.D();
        if (T2 || D3 == c0064a.a()) {
            D3 = new l<AsyncImagePainter.b.d, p>() { // from class: com.forsale.adserver.view.composeViews.commercialList.CommercialHorizontalListKt$CommercialItem$painter$2$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(AsyncImagePainter.b.d it2) {
                    o.i(it2, "it");
                    CommercialHorizontalListKt.f(k0Var, false);
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
        AsyncImagePainter b11 = h5.d.b(valueOf, null, null, null, lVar2, (l) D3, null, null, 0, h11, 8, 462);
        h11.C(733328855);
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        a0 g11 = BoxKt.g(v0.b.f74009a.o(), false, h11, 0);
        h11.C(-1323940314);
        int a11 = e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a12 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar2);
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
        h11.C(25045641);
        if (e(k0Var)) {
            z11 = false;
            SurfaceKt.c(null, g.c(h.l(8)), 0L, 0L, null, 0.0f, ComposableSingletons$CommercialHorizontalListKt.f21026a.d(), h11, 1572864, 61);
        } else {
            z11 = false;
        }
        h11.S();
        if (adGeneralModel == null) {
            z11 = true;
        }
        PosterKt.b(b11, true, com.forsale.ui.components.skeleton.a.a(aVar2, z11, g.c(h.l(8)), 0L, 0L, h11, 6, 12), false, 0.0f, new g00.a<p>() { // from class: com.forsale.adserver.view.composeViews.commercialList.CommercialHorizontalListKt$CommercialItem$1$1
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
                AdGeneralModel adGeneralModel2 = AdGeneralModel.this;
                if (adGeneralModel2 != null) {
                    lVar.invoke(adGeneralModel2);
                }
            }
        }, h11, 48, 24);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.adserver.view.composeViews.commercialList.CommercialHorizontalListKt$CommercialItem$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i12) {
                    CommercialHorizontalListKt.d(AdGeneralModel.this, lVar, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    private static final boolean e(k0<Boolean> k0Var) {
        return k0Var.getValue().booleanValue();
    }

    public static final void f(k0<Boolean> k0Var, boolean z11) {
        k0Var.setValue(Boolean.valueOf(z11));
    }

    public static final void g(final List<AdGeneralModel> list, final g00.a<p> aVar, final g00.p<? super AdGeneralModel, ? super Integer, p> pVar, final boolean z11, final LazyListState lazyListState, final boolean z12, g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar2, final boolean z13, androidx.compose.runtime.a aVar2, final int i11, final int i12) {
        g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar3;
        androidx.compose.runtime.a h11 = aVar2.h(1605201455);
        if ((i12 & 64) != 0) {
            pVar3 = null;
        } else {
            pVar3 = pVar2;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1605201455, i11, -1, "com.forsale.adserver.view.composeViews.commercialList.PagingCommercialList (CommercialHorizontalList.kt:202)");
        }
        final g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar4 = pVar3;
        LazyDslKt.b(SizeKt.i(androidx.compose.ui.c.f7566a, h.l(212)), lazyListState, PaddingKt.c(h.l(16), 0.0f, 2, null), false, Arrangement.f3698a.o(h.l(12)), null, null, false, new l<LazyListScope, p>() { // from class: com.forsale.adserver.view.composeViews.commercialList.CommercialHorizontalListKt$PagingCommercialList$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void b(LazyListScope LazyRow) {
                o.i(LazyRow, "$this$LazyRow");
                if (z13) {
                    LazyListScope.e(LazyRow, 5, null, null, ComposableSingletons$CommercialHorizontalListKt.f21026a.c(), 6, null);
                } else {
                    final List<AdGeneralModel> list2 = list;
                    final boolean z14 = z11;
                    final g00.a<p> aVar3 = aVar;
                    final int i13 = i11;
                    final g00.p<AdGeneralModel, Integer, p> pVar5 = pVar;
                    LazyRow.f(list2.size(), null, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0043: INVOKE  
                          (r18v0 'LazyRow' androidx.compose.foundation.lazy.LazyListScope)
                          (wrap: int : 0x0029: INVOKE  (r2v0 int A[REMOVE]) = (r12v0 'list2' java.util.List<com.forsale.adserver.view.models.AdGeneralModel>) type: INTERFACE call: java.util.List.size():int)
                          (null g00.l<? super java.lang.Integer, ? extends java.lang.Object>)
                          (wrap: g00.l<java.lang.Integer, java.lang.Object> : 0x002f: CONSTRUCTOR  (r3v0 g00.l<java.lang.Integer, java.lang.Object> A[REMOVE]) = (r12v0 'list2' java.util.List<com.forsale.adserver.view.models.AdGeneralModel> A[DONT_INLINE]) call: com.forsale.adserver.view.composeViews.commercialList.CommercialHorizontalListKt$PagingCommercialList$1$invoke$$inlined$itemsIndexed$default$2.<init>(java.util.List):void type: CONSTRUCTOR)
                          (wrap: r0.a : 0x003e: INVOKE  (r1v4 r0.a A[REMOVE]) = 
                          (-1091073711 int)
                          true
                          (wrap: g00.r<x.a, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x0038: CONSTRUCTOR  (r4v0 g00.r<x.a, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = 
                          (r12v0 'list2' java.util.List<com.forsale.adserver.view.models.AdGeneralModel> A[DONT_INLINE])
                          (r12v0 'list2' java.util.List<com.forsale.adserver.view.models.AdGeneralModel> A[DONT_INLINE])
                          (r13v0 'z14' boolean A[DONT_INLINE])
                          (r14v0 'aVar3' g00.a<wz.p> A[DONT_INLINE])
                          (r15v0 'i13' int A[DONT_INLINE])
                          (r1v2 'pVar5' g00.p<com.forsale.adserver.view.models.AdGeneralModel, java.lang.Integer, wz.p> A[DONT_INLINE])
                         call: com.forsale.adserver.view.composeViews.commercialList.CommercialHorizontalListKt$PagingCommercialList$1$invoke$$inlined$itemsIndexed$default$3.<init>(java.util.List, java.util.List, boolean, g00.a, int, g00.p):void type: CONSTRUCTOR)
                         type: STATIC call: r0.b.c(int, boolean, java.lang.Object):r0.a)
                         type: INTERFACE call: androidx.compose.foundation.lazy.LazyListScope.f(int, g00.l, g00.l, g00.r):void in method: com.forsale.adserver.view.composeViews.commercialList.CommercialHorizontalListKt$PagingCommercialList$1.b(androidx.compose.foundation.lazy.LazyListScope):void, file: classes2.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:137)
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.adserver.view.composeViews.commercialList.CommercialHorizontalListKt$PagingCommercialList$1$invoke$$inlined$itemsIndexed$default$2, state: NOT_LOADED
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
                        	... 21 more
                        */
                    /*
                        this = this;
                        r0 = r17
                        r8 = r18
                        java.lang.String r1 = "$this$LazyRow"
                        kotlin.jvm.internal.o.i(r8, r1)
                        boolean r1 = r1
                        r9 = 1
                        if (r1 == 0) goto L1f
                        r2 = 5
                        r3 = 0
                        r4 = 0
                        com.forsale.adserver.view.composeViews.commercialList.ComposableSingletons$CommercialHorizontalListKt r1 = com.forsale.adserver.view.composeViews.commercialList.ComposableSingletons$CommercialHorizontalListKt.f21026a
                        g00.r r5 = r1.c()
                        r6 = 6
                        r7 = 0
                        r1 = r18
                        androidx.compose.foundation.lazy.LazyListScope.e(r1, r2, r3, r4, r5, r6, r7)
                        goto L46
                    L1f:
                        java.util.List<com.forsale.adserver.view.models.AdGeneralModel> r12 = r2
                        boolean r13 = r4
                        g00.a<wz.p> r14 = r5
                        int r15 = r6
                        g00.p<com.forsale.adserver.view.models.AdGeneralModel, java.lang.Integer, wz.p> r1 = r7
                        int r2 = r12.size()
                        com.forsale.adserver.view.composeViews.commercialList.CommercialHorizontalListKt$PagingCommercialList$1$invoke$$inlined$itemsIndexed$default$2 r3 = new com.forsale.adserver.view.composeViews.commercialList.CommercialHorizontalListKt$PagingCommercialList$1$invoke$$inlined$itemsIndexed$default$2
                        r3.<init>(r12)
                        com.forsale.adserver.view.composeViews.commercialList.CommercialHorizontalListKt$PagingCommercialList$1$invoke$$inlined$itemsIndexed$default$3 r4 = new com.forsale.adserver.view.composeViews.commercialList.CommercialHorizontalListKt$PagingCommercialList$1$invoke$$inlined$itemsIndexed$default$3
                        r10 = r4
                        r11 = r12
                        r16 = r1
                        r10.<init>(r11, r12, r13, r14, r15, r16)
                        r1 = -1091073711(0xffffffffbef78951, float:-0.48346952)
                        r0.a r1 = r0.b.c(r1, r9, r4)
                        r4 = 0
                        r8.f(r2, r4, r3, r1)
                    L46:
                        g00.p<androidx.compose.runtime.a, java.lang.Integer, wz.p> r1 = r3
                        if (r1 == 0) goto L67
                        boolean r2 = r1
                        if (r2 != 0) goto L67
                        r2 = 0
                        r3 = 0
                        com.forsale.adserver.view.composeViews.commercialList.CommercialHorizontalListKt$PagingCommercialList$1$2 r4 = new com.forsale.adserver.view.composeViews.commercialList.CommercialHorizontalListKt$PagingCommercialList$1$2
                        boolean r5 = r8
                        int r6 = r6
                        r4.<init>()
                        r1 = 897792955(0x35833bbb, float:9.777644E-7)
                        r0.a r4 = r0.b.c(r1, r9, r4)
                        r5 = 3
                        r6 = 0
                        r1 = r18
                        androidx.compose.foundation.lazy.LazyListScope.l(r1, r2, r3, r4, r5, r6)
                    L67:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.view.composeViews.commercialList.CommercialHorizontalListKt$PagingCommercialList$1.b(androidx.compose.foundation.lazy.LazyListScope):void");
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(LazyListScope lazyListScope) {
                    b(lazyListScope);
                    return p.f75480a;
                }
            }, h11, ((i11 >> 9) & 112) | 24966, 232);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                final g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar5 = pVar3;
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.adserver.view.composeViews.commercialList.CommercialHorizontalListKt$PagingCommercialList$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar3, int i13) {
                        CommercialHorizontalListKt.g(list, aVar, pVar, z11, lazyListState, z12, pVar5, z13, aVar3, v0.a(i11 | 1), i12);
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                        b(aVar3, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        public static final /* synthetic */ void h(AdGeneralModel adGeneralModel, l lVar, androidx.compose.runtime.a aVar, int i11) {
            d(adGeneralModel, lVar, aVar, i11);
        }

        public static final List<Integer> l(x.l lVar) {
            List a12;
            List list;
            List<Integer> n11;
            Object v02;
            Object m02;
            int y11;
            a12 = CollectionsKt___CollectionsKt.a1(lVar.c());
            if (!a12.isEmpty()) {
                list = a12;
            } else {
                list = null;
            }
            if (list != null) {
                v02 = CollectionsKt___CollectionsKt.v0(list);
                j jVar = (j) v02;
                if (jVar != null) {
                    if (jVar.getOffset() + jVar.d() > lVar.e() + lVar.f()) {
                        w.N(a12);
                    }
                    m02 = CollectionsKt___CollectionsKt.m0(a12);
                    j jVar2 = (j) m02;
                    if (jVar2 != null && jVar2.getOffset() < lVar.f()) {
                        w.L(a12);
                    }
                    List<j> list2 = a12;
                    y11 = s.y(list2, 10);
                    ArrayList arrayList = new ArrayList(y11);
                    for (j jVar3 : list2) {
                        arrayList.add(Integer.valueOf(jVar3.getIndex()));
                    }
                    return arrayList;
                }
            }
            n11 = r.n();
            return n11;
        }
    }
