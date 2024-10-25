package com.forsale.app.features.categories.listings.filtration.views;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.recyclerview.widget.RecyclerView;
import b1.t1;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.buttons.ButtonData;
import com.forsale.designSystem.buttons.ButtonsKt;
import com.forsale.designSystem.layouts.NavBarsKt;
import e2.h;
import g00.a;
import g00.q;
import j0.d;
import j0.d1;
import j0.e;
import j0.e1;
import j0.k;
import j0.v0;
import kotlin.jvm.internal.o;
import okhttp3.internal.http2.Http2;
import v0.b;
import w.f;
import w.t;
import wz.p;
/* compiled from: SheetsView.kt */
/* loaded from: classes2.dex */
public final class SheetsViewKt {
    public static final void a(final a<p> onApplyClicked, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        int i13;
        o.i(onApplyClicked, "onApplyClicked");
        androidx.compose.runtime.a h11 = aVar.h(-853959794);
        if ((i11 & 14) == 0) {
            if (h11.F(onApplyClicked)) {
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
                c.U(-853959794, i12, -1, "com.forsale.app.features.categories.listings.filtration.views.ApplyBar (SheetsView.kt:194)");
            }
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            androidx.compose.ui.c h12 = SizeKt.h(BackgroundKt.b(aVar2, t1.f15974b.f(), null, 2, null), 0.0f, 1, null);
            h11.C(733328855);
            b.a aVar3 = b.f74009a;
            a0 g11 = BoxKt.g(aVar3.o(), false, h11, 0);
            h11.C(-1323940314);
            int a11 = e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            a<ComposeUiNode> a12 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(h12);
            if (!(h11.k() instanceof d)) {
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
            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
            if (a13.f() || !o.d(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.p(Integer.valueOf(a11), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
            h11.C(-483455358);
            a0 a14 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), aVar3.k(), h11, 0);
            h11.C(-1323940314);
            int a15 = e.a(h11, 0);
            k s12 = h11.s();
            a<ComposeUiNode> a16 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(aVar2);
            if (!(h11.k() instanceof d)) {
                e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a16);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a17 = Updater.a(h11);
            Updater.c(a17, a14, companion.e());
            Updater.c(a17, s12, companion.g());
            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
            if (a17.f() || !o.d(a17.D(), Integer.valueOf(a15))) {
                a17.u(Integer.valueOf(a15));
                a17.p(Integer.valueOf(a15), b12);
            }
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            f fVar = f.f74891a;
            SpacerKt.a(BackgroundKt.b(SizeKt.h(SizeKt.i(aVar2, h.l(1)), 0.0f, 1, null), dk.a.f54291a.a(h11, dk.a.f54292b).e().d(h11, yj.d.f76453b), null, 2, null), h11, 0);
            ButtonData a18 = ButtonData.f40994a.a();
            androidx.compose.ui.c i14 = PaddingKt.i(SizeKt.h(aVar2, 0.0f, 1, null), h.l(16));
            h11.C(1157296644);
            boolean T = h11.T(onApplyClicked);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new a<p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.SheetsViewKt$ApplyBar$1$1$1$1
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
                        onApplyClicked.invoke();
                    }
                };
                h11.u(D);
            }
            h11.S();
            ButtonsKt.j((a) D, i14, a18, null, false, false, null, ComposableSingletons$SheetsViewKt.f30223a.c(), h11, (ButtonData.f40995b << 6) | 12582960, 120);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
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
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.SheetsViewKt$ApplyBar$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i15) {
                    SheetsViewKt.a(onApplyClicked, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r24, final boolean r25, final int r26, final g00.a<wz.p> r27, final g00.a<wz.p> r28, final g00.a<wz.p> r29, g00.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r30, final g00.q<? super androidx.compose.ui.c, ? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r31, androidx.compose.runtime.a r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.views.SheetsViewKt.b(java.lang.String, boolean, int, g00.a, g00.a, g00.a, g00.p, g00.q, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final java.lang.String r23, final boolean r24, final int r25, final g00.a<wz.p> r26, final g00.a<wz.p> r27, final g00.a<wz.p> r28, g00.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r29, final g00.q<? super androidx.compose.ui.c, ? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r30, androidx.compose.runtime.a r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.views.SheetsViewKt.c(java.lang.String, boolean, int, g00.a, g00.a, g00.a, g00.p, g00.q, androidx.compose.runtime.a, int, int):void");
    }

    public static final void d(final String label, final boolean z11, final int i11, final a<p> onResetClicked, final a<p> onBackClicked, final boolean z12, androidx.compose.runtime.a aVar, final int i12) {
        final int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        o.i(label, "label");
        o.i(onResetClicked, "onResetClicked");
        o.i(onBackClicked, "onBackClicked");
        androidx.compose.runtime.a h11 = aVar.h(-1410228487);
        if ((i12 & 14) == 0) {
            if (h11.T(label)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i13 = i19 | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            if (h11.a(z11)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i13 |= i18;
        }
        if ((i12 & 896) == 0) {
            if (h11.d(i11)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i13 |= i17;
        }
        if ((i12 & 7168) == 0) {
            if (h11.F(onResetClicked)) {
                i16 = RecyclerView.l.FLAG_MOVED;
            } else {
                i16 = 1024;
            }
            i13 |= i16;
        }
        if ((i12 & 57344) == 0) {
            if (h11.F(onBackClicked)) {
                i15 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i15 = 8192;
            }
            i13 |= i15;
        }
        if ((458752 & i12) == 0) {
            if (h11.a(z12)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i13 |= i14;
        }
        if ((374491 & i13) == 74898 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1410228487, i13, -1, "com.forsale.app.features.categories.listings.filtration.views.NavBar (SheetsView.kt:108)");
            }
            NavBarsKt.a(PaddingKt.m(BackgroundKt.b(androidx.compose.ui.c.f7566a, t1.f15974b.f(), null, 2, null), 0.0f, h.l(12), 0.0f, h.l(8), 5, null), r0.b.b(h11, -1841628365, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.SheetsViewKt$NavBar$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r14v0, types: [androidx.compose.runtime.a, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r3v9 */
                public final void b(androidx.compose.runtime.a aVar2, int i21) {
                    if ((i21 & 11) == 2 && aVar2.i()) {
                        aVar2.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-1841628365, i21, -1, "com.forsale.app.features.categories.listings.filtration.views.NavBar.<anonymous> (SheetsView.kt:110)");
                    }
                    final a<p> aVar3 = onBackClicked;
                    final int i22 = i13;
                    final int i23 = i11;
                    aVar2.C(-483455358);
                    c.a aVar4 = androidx.compose.ui.c.f7566a;
                    a0 a11 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), b.f74009a.k(), aVar2, 0);
                    aVar2.C(-1323940314);
                    int a12 = e.a(aVar2, 0);
                    k s11 = aVar2.s();
                    ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                    a<ComposeUiNode> a13 = companion.a();
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
                    g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
                    if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                        a14.u(Integer.valueOf(a12));
                        a14.p(Integer.valueOf(a12), b11);
                    }
                    c11.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                    aVar2.C(2058660585);
                    f fVar = f.f74891a;
                    aVar2.C(1157296644);
                    boolean T = aVar2.T(aVar3);
                    Object D = aVar2.D();
                    if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                        D = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00db: CONSTRUCTOR  (r3v8 'D' java.lang.Object) = (r15v1 'aVar3' g00.a<wz.p> A[DONT_INLINE]) call: com.forsale.app.features.categories.listings.filtration.views.SheetsViewKt$NavBar$1$1$1$1.<init>(g00.a):void type: CONSTRUCTOR in method: com.forsale.app.features.categories.listings.filtration.views.SheetsViewKt$NavBar$1.b(androidx.compose.runtime.a, int):void, file: classes2.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.filtration.views.SheetsViewKt$NavBar$1$1$1$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                            	... 25 more
                            */
                        /*
                            Method dump skipped, instructions count: 278
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.views.SheetsViewKt$NavBar$1.b(androidx.compose.runtime.a, int):void");
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                }), r0.b.b(h11, -1587238958, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.SheetsViewKt$NavBar$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i21) {
                        if ((i21 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-1587238958, i21, -1, "com.forsale.app.features.categories.listings.filtration.views.NavBar.<anonymous> (SheetsView.kt:126)");
                        }
                        String str = label;
                        dk.a aVar3 = dk.a.f54291a;
                        int i22 = dk.a.f54292b;
                        TextKt.a(str, null, 0, 0, false, 0, 0, null, aVar3.c(aVar2, i22).r(), aVar3.a(aVar2, i22).e().m(aVar2, yj.d.f76453b), 0, aVar2, i13 & 14, 0, 1278);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                }), r0.b.b(h11, -963624503, true, new q<t, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.SheetsViewKt$NavBar$3
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    public final void b(t NavBarInner, androidx.compose.runtime.a aVar2, int i21) {
                        o.i(NavBarInner, "$this$NavBarInner");
                        if ((i21 & 81) == 16 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-963624503, i21, -1, "com.forsale.app.features.categories.listings.filtration.views.NavBar.<anonymous> (SheetsView.kt:133)");
                        }
                        ButtonData c11 = ButtonData.f40994a.c();
                        final a<p> aVar3 = onResetClicked;
                        aVar2.C(1157296644);
                        boolean T = aVar2.T(aVar3);
                        Object D = aVar2.D();
                        if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                            D = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0047: CONSTRUCTOR  (r0v3 'D' java.lang.Object) = (r11v4 'aVar3' g00.a<wz.p> A[DONT_INLINE]) call: com.forsale.app.features.categories.listings.filtration.views.SheetsViewKt$NavBar$3$1$1.<init>(g00.a):void type: CONSTRUCTOR in method: com.forsale.app.features.categories.listings.filtration.views.SheetsViewKt$NavBar$3.b(w.t, androidx.compose.runtime.a, int):void, file: classes2.dex
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.filtration.views.SheetsViewKt$NavBar$3$1$1, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                                	... 25 more
                                */
                            /*
                                this = this;
                                java.lang.String r0 = "$this$NavBarInner"
                                kotlin.jvm.internal.o.i(r11, r0)
                                r11 = r13 & 81
                                r0 = 16
                                if (r11 != r0) goto L16
                                boolean r11 = r12.i()
                                if (r11 != 0) goto L12
                                goto L16
                            L12:
                                r12.L()
                                goto L7b
                            L16:
                                boolean r11 = androidx.compose.runtime.c.I()
                                if (r11 == 0) goto L25
                                r11 = -1
                                java.lang.String r0 = "com.forsale.app.features.categories.listings.filtration.views.NavBar.<anonymous> (SheetsView.kt:133)"
                                r1 = -963624503(0xffffffffc69041c9, float:-18464.893)
                                androidx.compose.runtime.c.U(r1, r13, r11, r0)
                            L25:
                                com.forsale.designSystem.buttons.ButtonData$a r11 = com.forsale.designSystem.buttons.ButtonData.f40994a
                                com.forsale.designSystem.buttons.ButtonData r2 = r11.c()
                                g00.a<wz.p> r11 = r1
                                r13 = 1157296644(0x44faf204, float:2007.563)
                                r12.C(r13)
                                boolean r13 = r12.T(r11)
                                java.lang.Object r0 = r12.D()
                                if (r13 != 0) goto L45
                                androidx.compose.runtime.a$a r13 = androidx.compose.runtime.a.f7182a
                                java.lang.Object r13 = r13.a()
                                if (r0 != r13) goto L4d
                            L45:
                                com.forsale.app.features.categories.listings.filtration.views.SheetsViewKt$NavBar$3$1$1 r0 = new com.forsale.app.features.categories.listings.filtration.views.SheetsViewKt$NavBar$3$1$1
                                r0.<init>(r11)
                                r12.u(r0)
                            L4d:
                                r12.S()
                                g00.a r0 = (g00.a) r0
                                r1 = 0
                                boolean r3 = r3
                                r4 = 0
                                r5 = 0
                                com.forsale.app.features.categories.listings.filtration.views.ComposableSingletons$SheetsViewKt r11 = com.forsale.app.features.categories.listings.filtration.views.ComposableSingletons$SheetsViewKt.f30223a
                                g00.q r6 = r11.a()
                                int r11 = com.forsale.designSystem.buttons.ButtonData.f40995b
                                int r11 = r11 << 6
                                r13 = 1572864(0x180000, float:2.204052E-39)
                                r11 = r11 | r13
                                int r13 = r2
                                int r13 = r13 << 6
                                r13 = r13 & 7168(0x1c00, float:1.0045E-41)
                                r8 = r11 | r13
                                r9 = 50
                                r7 = r12
                                com.forsale.designSystem.buttons.ButtonsKt.k(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                                boolean r11 = androidx.compose.runtime.c.I()
                                if (r11 == 0) goto L7b
                                androidx.compose.runtime.c.T()
                            L7b:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.views.SheetsViewKt$NavBar$3.b(w.t, androidx.compose.runtime.a, int):void");
                        }

                        @Override // g00.q
                        public /* bridge */ /* synthetic */ p invoke(t tVar, androidx.compose.runtime.a aVar2, Integer num) {
                            b(tVar, aVar2, num.intValue());
                            return p.f75480a;
                        }
                    }), z12, h11, ((i13 >> 3) & 57344) | 3510, 0);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }
                d1 l11 = h11.l();
                if (l11 != null) {
                    l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.views.SheetsViewKt$NavBar$4
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar2, int i21) {
                            SheetsViewKt.d(label, z11, i11, onResetClicked, onBackClicked, z12, aVar2, v0.a(i12 | 1));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return p.f75480a;
                        }
                    });
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:61:0x00bf  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x00c4  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x00cc  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0137  */
            /* JADX WARN: Removed duplicated region for block: B:73:0x0143  */
            /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static final void e(androidx.compose.ui.c r30, final java.lang.String r31, final boolean r32, final int r33, final g00.a<wz.p> r34, final g00.a<wz.p> r35, androidx.compose.runtime.a r36, final int r37, final int r38) {
                /*
                    Method dump skipped, instructions count: 347
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.views.SheetsViewKt.e(androidx.compose.ui.c, java.lang.String, boolean, int, g00.a, g00.a, androidx.compose.runtime.a, int, int):void");
            }
        }
