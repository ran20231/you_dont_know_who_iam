package com.forsale.app.features.categories.listingdetails.buyerctas;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.bottomsheets.BottomSheetsKt;
import com.forsale.designSystem.bottomsheets.ModalBottomSheetState;
import com.forsale.designSystem.dividers.DividersKt;
import com.forsale.designSystem.layouts.ListItemsKt;
import e2.h;
import g00.l;
import g00.q;
import j0.d;
import j0.d1;
import j0.e1;
import j0.t0;
import j0.v0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.s;
import kotlin.jvm.internal.o;
import v.j;
import v.k;
import v0.b;
import w.f;
import w.t;
import wz.p;
/* compiled from: ShowCTAsBottomSheet.kt */
/* loaded from: classes2.dex */
public final class ShowCTAsBottomSheetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final k kVar, final l<? super String, p> lVar, final String str, final g00.p<? super a, ? super Integer, p> pVar, a aVar, final int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        a h11 = aVar.h(2102966576);
        if ((i11 & 14) == 0) {
            if (h11.T(kVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(lVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i11 & 896) == 0) {
            if (h11.T(str)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 7168) == 0) {
            if (h11.F(pVar)) {
                i13 = RecyclerView.l.FLAG_MOVED;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        int i17 = i12;
        if ((i17 & 5851) == 1170 && h11.i()) {
            h11.L();
        } else {
            if (c.I()) {
                c.U(2102966576, i17, -1, "com.forsale.app.features.categories.listingdetails.buyerctas.PhoneNumberItem (ShowCTAsBottomSheet.kt:104)");
            }
            Arrangement.f o11 = Arrangement.f3698a.o(h.l(12));
            h11.C(-483455358);
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            a0 a11 = e.a(o11, b.f74009a.k(), h11, 6);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            j0.k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(aVar2);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a13);
            } else {
                h11.t();
            }
            a a14 = Updater.a(h11);
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
            h11.C(511388516);
            boolean T = h11.T(lVar) | h11.T(str);
            Object D = h11.D();
            if (T || D == a.f7182a.a()) {
                D = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerctas.ShowCTAsBottomSheetKt$PhoneNumberItem$1$1$1
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
                        lVar.invoke(str);
                    }
                };
                h11.u(D);
            }
            h11.S();
            ListItemsKt.b(ClickableKt.c(aVar2, kVar, null, false, null, null, (g00.a) D, 28, null), pVar, r0.b.b(h11, 80493354, true, new q<t, a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerctas.ShowCTAsBottomSheetKt$PhoneNumberItem$1$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void b(t SingleLineListItem, a aVar3, int i18) {
                    o.i(SingleLineListItem, "$this$SingleLineListItem");
                    if ((i18 & 81) == 16 && aVar3.i()) {
                        aVar3.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(80493354, i18, -1, "com.forsale.app.features.categories.listingdetails.buyerctas.PhoneNumberItem.<anonymous>.<anonymous> (ShowCTAsBottomSheet.kt:117)");
                    }
                    t0<LayoutDirection> c12 = CompositionLocalsKt.j().c(LayoutDirection.Ltr);
                    final String str2 = str;
                    CompositionLocalKt.a(c12, r0.b.b(aVar3, -286728598, true, new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerctas.ShowCTAsBottomSheetKt$PhoneNumberItem$1$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void b(a aVar4, int i19) {
                            if ((i19 & 11) == 2 && aVar4.i()) {
                                aVar4.L();
                                return;
                            }
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.U(-286728598, i19, -1, "com.forsale.app.features.categories.listingdetails.buyerctas.PhoneNumberItem.<anonymous>.<anonymous>.<anonymous> (ShowCTAsBottomSheet.kt:118)");
                            }
                            dk.a aVar5 = dk.a.f54291a;
                            int i21 = dk.a.f54292b;
                            TextKt.a("+" + str2, null, 0, 0, false, 0, 0, null, aVar5.c(aVar4, i21).a(), aVar5.a(aVar4, i21).e().m(aVar4, yj.d.f76453b), 0, aVar4, 0, 0, 1278);
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.T();
                            }
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                            b(aVar4, num.intValue());
                            return p.f75480a;
                        }
                    }), aVar3, t0.f59917d | 0 | 48);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(t tVar, a aVar3, Integer num) {
                    b(tVar, aVar3, num.intValue());
                    return p.f75480a;
                }
            }), null, h11, ((i17 >> 6) & 112) | 384, 8);
            DividersKt.a(null, 0.0f, 0L, h11, 0, 7);
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
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerctas.ShowCTAsBottomSheetKt$PhoneNumberItem$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar3, int i18) {
                    ShowCTAsBottomSheetKt.a(k.this, lVar, str, pVar, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void b(final ModalBottomSheetState modalBottomSheetState, final ab.a bottomSheetDataModel, final g00.p<? super a, ? super Integer, p> setIcon, final l<? super String, p> onNumberClicked, final g00.a<p> onCloseBottomSheet, a aVar, final int i11) {
        o.i(modalBottomSheetState, "modalBottomSheetState");
        o.i(bottomSheetDataModel, "bottomSheetDataModel");
        o.i(setIcon, "setIcon");
        o.i(onNumberClicked, "onNumberClicked");
        o.i(onCloseBottomSheet, "onCloseBottomSheet");
        a h11 = aVar.h(468499486);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(468499486, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerctas.ShowCTAsBottomSheet (ShowCTAsBottomSheet.kt:43)");
        }
        h11.C(-492369756);
        Object D = h11.D();
        if (D == a.f7182a.a()) {
            D = j.a();
            h11.u(D);
        }
        h11.S();
        final k kVar = (k) D;
        BottomSheetsKt.a(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), ComposableSingletons$ShowCTAsBottomSheetKt.f25522a.a(), r0.b.b(h11, -1363355266, true, new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerctas.ShowCTAsBottomSheetKt$ShowCTAsBottomSheet$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void b(a aVar2, int i12) {
                int y11;
                if ((i12 & 11) == 2 && aVar2.i()) {
                    aVar2.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-1363355266, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerctas.ShowCTAsBottomSheet.<anonymous> (ShowCTAsBottomSheet.kt:48)");
                }
                androidx.compose.ui.c i13 = PaddingKt.i(androidx.compose.ui.c.f7566a, h.l(16));
                Arrangement.f o11 = Arrangement.f3698a.o(h.l(12));
                ab.a aVar3 = ab.a.this;
                k kVar2 = kVar;
                l<String, p> lVar = onNumberClicked;
                g00.p<a, Integer, p> pVar = setIcon;
                int i14 = i11;
                aVar2.C(-483455358);
                a0 a11 = e.a(o11, b.f74009a.k(), aVar2, 6);
                aVar2.C(-1323940314);
                int a12 = j0.e.a(aVar2, 0);
                j0.k s11 = aVar2.s();
                ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                g00.a<ComposeUiNode> a13 = companion.a();
                q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(i13);
                if (!(aVar2.k() instanceof d)) {
                    j0.e.c();
                }
                aVar2.I();
                if (aVar2.f()) {
                    aVar2.y(a13);
                } else {
                    aVar2.t();
                }
                a a14 = Updater.a(aVar2);
                Updater.c(a14, a11, companion.e());
                Updater.c(a14, s11, companion.g());
                g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
                if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                    a14.u(Integer.valueOf(a12));
                    a14.p(Integer.valueOf(a12), b11);
                }
                c11.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                aVar2.C(2058660585);
                f fVar = f.f74891a;
                List<String> b12 = aVar3.b();
                aVar2.C(-928403834);
                if (b12 != null) {
                    List<String> list = b12;
                    y11 = s.y(list, 10);
                    ArrayList arrayList = new ArrayList(y11);
                    for (String str : list) {
                        ShowCTAsBottomSheetKt.a(kVar2, lVar, str, pVar, aVar2, ((i14 >> 6) & 112) | 6 | ((i14 << 3) & 7168));
                        arrayList.add(p.f75480a);
                    }
                }
                aVar2.S();
                aVar2.S();
                aVar2.w();
                aVar2.S();
                aVar2.S();
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                b(aVar2, num.intValue());
                return p.f75480a;
            }
        }), r0.b.b(h11, 1596238301, true, new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerctas.ShowCTAsBottomSheetKt$ShowCTAsBottomSheet$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r20v0, types: [androidx.compose.runtime.a] */
            /* JADX WARN: Type inference failed for: r9v2 */
            public final void b(a aVar2, int i12) {
                if ((i12 & 11) == 2 && aVar2.i()) {
                    aVar2.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(1596238301, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerctas.ShowCTAsBottomSheet.<anonymous> (ShowCTAsBottomSheet.kt:58)");
                }
                float f11 = 16;
                androidx.compose.ui.c m11 = PaddingKt.m(androidx.compose.ui.c.f7566a, h.l(f11), 0.0f, h.l(f11), h.l(f11), 2, null);
                k kVar2 = k.this;
                final g00.a<p> aVar3 = onCloseBottomSheet;
                aVar2.C(1157296644);
                boolean T = aVar2.T(aVar3);
                Object D2 = aVar2.D();
                if (T || D2 == a.f7182a.a()) {
                    D2 = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0062: CONSTRUCTOR  (r9v1 'D2' java.lang.Object) = (r7v0 'aVar3' g00.a<wz.p> A[DONT_INLINE]) call: com.forsale.app.features.categories.listingdetails.buyerctas.ShowCTAsBottomSheetKt$ShowCTAsBottomSheet$2$1$1.<init>(g00.a):void type: CONSTRUCTOR in method: com.forsale.app.features.categories.listingdetails.buyerctas.ShowCTAsBottomSheetKt$ShowCTAsBottomSheet$2.b(androidx.compose.runtime.a, int):void, file: classes2.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listingdetails.buyerctas.ShowCTAsBottomSheetKt$ShowCTAsBottomSheet$2$1$1, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                        	... 25 more
                        */
                    /*
                        this = this;
                        r0 = r19
                        r11 = r20
                        r1 = r21
                        r2 = r1 & 11
                        r3 = 2
                        if (r2 != r3) goto L17
                        boolean r2 = r20.i()
                        if (r2 != 0) goto L12
                        goto L17
                    L12:
                        r20.L()
                        goto L98
                    L17:
                        boolean r2 = androidx.compose.runtime.c.I()
                        if (r2 == 0) goto L26
                        r2 = -1
                        java.lang.String r3 = "com.forsale.app.features.categories.listingdetails.buyerctas.ShowCTAsBottomSheet.<anonymous> (ShowCTAsBottomSheet.kt:58)"
                        r4 = 1596238301(0x5f24a9dd, float:1.1865258E19)
                        androidx.compose.runtime.c.U(r4, r1, r2, r3)
                    L26:
                        androidx.compose.ui.c$a r12 = androidx.compose.ui.c.f7566a
                        r1 = 16
                        float r1 = (float) r1
                        float r13 = e2.h.l(r1)
                        r14 = 0
                        float r15 = e2.h.l(r1)
                        float r16 = e2.h.l(r1)
                        r17 = 2
                        r18 = 0
                        androidx.compose.ui.c r1 = androidx.compose.foundation.layout.PaddingKt.m(r12, r13, r14, r15, r16, r17, r18)
                        r2 = 0
                        r3 = 0
                        r4 = 0
                        r5 = 0
                        v.k r6 = v.k.this
                        g00.a<wz.p> r7 = r2
                        r8 = 1157296644(0x44faf204, float:2007.563)
                        r11.C(r8)
                        boolean r8 = r11.T(r7)
                        java.lang.Object r9 = r20.D()
                        if (r8 != 0) goto L60
                        androidx.compose.runtime.a$a r8 = androidx.compose.runtime.a.f7182a
                        java.lang.Object r8 = r8.a()
                        if (r9 != r8) goto L68
                    L60:
                        com.forsale.app.features.categories.listingdetails.buyerctas.ShowCTAsBottomSheetKt$ShowCTAsBottomSheet$2$1$1 r9 = new com.forsale.app.features.categories.listingdetails.buyerctas.ShowCTAsBottomSheetKt$ShowCTAsBottomSheet$2$1$1
                        r9.<init>(r7)
                        r11.u(r9)
                    L68:
                        r20.S()
                        r7 = r9
                        g00.a r7 = (g00.a) r7
                        r9 = 221190(0x36006, float:3.09953E-40)
                        r10 = 7
                        r8 = r20
                        androidx.compose.ui.c r1 = com.forsale.designSystem.ClickableSingleKt.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                        com.forsale.app.features.categories.listingdetails.buyerctas.ComposableSingletons$ShowCTAsBottomSheetKt r2 = com.forsale.app.features.categories.listingdetails.buyerctas.ComposableSingletons$ShowCTAsBottomSheetKt.f25522a
                        g00.p r3 = r2.b()
                        g00.q r4 = r2.c()
                        r5 = 0
                        r6 = 432(0x1b0, float:6.05E-43)
                        r7 = 8
                        r2 = r3
                        r3 = r4
                        r4 = r5
                        r5 = r20
                        com.forsale.designSystem.layouts.ListItemsKt.b(r1, r2, r3, r4, r5, r6, r7)
                        boolean r1 = androidx.compose.runtime.c.I()
                        if (r1 == 0) goto L98
                        androidx.compose.runtime.c.T()
                    L98:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerctas.ShowCTAsBottomSheetKt$ShowCTAsBottomSheet$2.b(androidx.compose.runtime.a, int):void");
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            }), 0L, modalBottomSheetState, onCloseBottomSheet, h11, ((i11 << 15) & 458752) | 3510 | ((i11 << 6) & 3670016), 16);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerctas.ShowCTAsBottomSheetKt$ShowCTAsBottomSheet$3
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(a aVar2, int i12) {
                        ShowCTAsBottomSheetKt.b(ModalBottomSheetState.this, bottomSheetDataModel, setIcon, onNumberClicked, onCloseBottomSheet, aVar2, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }
    }
