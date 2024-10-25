package com.forsale.app.features.more.user.editprofile.delete;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.c0;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.bottomsheets.BottomSheetsKt;
import com.forsale.designSystem.bottomsheets.ModalBottomSheetState;
import com.forsale.designSystem.bottomsheets.ModalBottomSheetValue;
import com.forsale.designSystem.dividers.DividersKt;
import com.forsale.ui.components.dialog.DialogCtaType;
import com.forsale.ui.components.dialog.DialogKt;
import e2.h;
import fe.a;
import g00.q;
import ik.a;
import j0.d;
import j0.d1;
import j0.e1;
import j0.k;
import j0.k0;
import j0.u;
import j0.v0;
import kotlin.jvm.internal.o;
import p1.g;
import r0.b;
import t9.y0;
import w.f;
import wz.p;
/* compiled from: DeleteAccountBottomSheet.kt */
/* loaded from: classes2.dex */
public final class DeleteAccountBottomSheetKt {
    public static final void a(final a deleteSheetState, final g00.a<p> onDeleteClicked, final g00.a<p> onCloseBottomSheet, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        o.i(deleteSheetState, "deleteSheetState");
        o.i(onDeleteClicked, "onDeleteClicked");
        o.i(onCloseBottomSheet, "onCloseBottomSheet");
        androidx.compose.runtime.a h11 = aVar.h(-1767845516);
        if ((i11 & 14) == 0) {
            if (h11.T(deleteSheetState)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(onDeleteClicked)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 896) == 0) {
            if (h11.F(onCloseBottomSheet)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && h11.i()) {
            h11.L();
        } else {
            if (c.I()) {
                c.U(-1767845516, i12, -1, "com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheet (DeleteAccountBottomSheet.kt:50)");
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
            ModalBottomSheetState k11 = BottomSheetsKt.k(ModalBottomSheetValue.Hidden, null, true, null, h11, 390, 10);
            h11.C(218683124);
            Boolean valueOf = Boolean.valueOf(deleteSheetState.a());
            h11.C(511388516);
            boolean T = h11.T(deleteSheetState) | h11.T(k11);
            Object D2 = h11.D();
            if (T || D2 == c0064a.a()) {
                D2 = new DeleteAccountBottomSheetKt$DeleteAccountBottomSheet$1$1$1(deleteSheetState, k11, null);
                h11.u(D2);
            }
            h11.S();
            u.d(valueOf, (g00.p) D2, h11, 64);
            h11.C(511388516);
            boolean T2 = h11.T(onCloseBottomSheet) | h11.T(k0Var);
            Object D3 = h11.D();
            if (T2 || D3 == c0064a.a()) {
                D3 = new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$DeleteAccountBottomSheet$1$2$1
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
                        onCloseBottomSheet.invoke();
                        k0Var.setValue(Boolean.TRUE);
                    }
                };
                h11.u(D3);
            }
            h11.S();
            g00.a aVar2 = (g00.a) D3;
            h11.C(1157296644);
            boolean T3 = h11.T(onCloseBottomSheet);
            Object D4 = h11.D();
            if (T3 || D4 == c0064a.a()) {
                D4 = new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$DeleteAccountBottomSheet$1$3$1
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
                        onCloseBottomSheet.invoke();
                    }
                };
                h11.u(D4);
            }
            h11.S();
            c(k11, aVar2, (g00.a) D4, h11, 0);
            p pVar = p.f75480a;
            h11.S();
            if (((Boolean) k0Var.getValue()).booleanValue()) {
                h11.C(511388516);
                boolean T4 = h11.T(onDeleteClicked) | h11.T(k0Var);
                Object D5 = h11.D();
                if (T4 || D5 == c0064a.a()) {
                    D5 = new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$DeleteAccountBottomSheet$2$1
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
                            onDeleteClicked.invoke();
                            k0Var.setValue(Boolean.FALSE);
                        }
                    };
                    h11.u(D5);
                }
                h11.S();
                g00.a aVar3 = (g00.a) D5;
                h11.C(1157296644);
                boolean T5 = h11.T(k0Var);
                Object D6 = h11.D();
                if (T5 || D6 == c0064a.a()) {
                    D6 = new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$DeleteAccountBottomSheet$3$1
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
                            k0Var.setValue(Boolean.FALSE);
                        }
                    };
                    h11.u(D6);
                }
                h11.S();
                d(aVar3, (g00.a) D6, h11, 0);
            }
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$DeleteAccountBottomSheet$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i16) {
                    DeleteAccountBottomSheetKt.a(fe.a.this, onDeleteClicked, onCloseBottomSheet, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(androidx.compose.ui.graphics.painter.Painter r27, g00.a<wz.p> r28, java.lang.String r29, g00.q<? super w.t, ? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r30, androidx.compose.runtime.a r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 1140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt.b(androidx.compose.ui.graphics.painter.Painter, g00.a, java.lang.String, g00.q, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final ModalBottomSheetState modalBottomSheetState, final g00.a<p> aVar, final g00.a<p> aVar2, androidx.compose.runtime.a aVar3, final int i11) {
        final int i12;
        int i13;
        int i14;
        int i15;
        androidx.compose.runtime.a h11 = aVar3.h(697371585);
        if ((i11 & 14) == 0) {
            if (h11.T(modalBottomSheetState)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(aVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 896) == 0) {
            if (h11.F(aVar2)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && h11.i()) {
            h11.L();
        } else {
            if (c.I()) {
                c.U(697371585, i12, -1, "com.forsale.app.features.more.user.editprofile.delete.ShowDeleteBottomSheet (DeleteAccountBottomSheet.kt:88)");
            }
            BottomSheetsKt.a(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), b.b(h11, -1590099360, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$ShowDeleteBottomSheet$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i16) {
                    if ((i16 & 11) == 2 && aVar4.i()) {
                        aVar4.L();
                        return;
                    }
                    if (c.I()) {
                        c.U(-1590099360, i16, -1, "com.forsale.app.features.more.user.editprofile.delete.ShowDeleteBottomSheet.<anonymous> (DeleteAccountBottomSheet.kt:91)");
                    }
                    String b11 = g.b(y0.f70534k5, aVar4, 0);
                    final g00.a<p> aVar5 = aVar2;
                    aVar4.C(1157296644);
                    boolean T = aVar4.T(aVar5);
                    Object D = aVar4.D();
                    if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                        D = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0043: CONSTRUCTOR  (r2v1 'D' java.lang.Object) = (r10v2 'aVar5' g00.a<wz.p> A[DONT_INLINE]) call: com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$ShowDeleteBottomSheet$1$1$1.<init>(g00.a):void type: CONSTRUCTOR in method: com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$ShowDeleteBottomSheet$1.b(androidx.compose.runtime.a, int):void, file: classes2.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$ShowDeleteBottomSheet$1$1$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                            	... 25 more
                            */
                        /*
                            this = this;
                            r0 = r10 & 11
                            r1 = 2
                            if (r0 != r1) goto L10
                            boolean r0 = r9.i()
                            if (r0 != 0) goto Lc
                            goto L10
                        Lc:
                            r9.L()
                            goto L5f
                        L10:
                            boolean r0 = androidx.compose.runtime.c.I()
                            if (r0 == 0) goto L1f
                            r0 = -1
                            java.lang.String r1 = "com.forsale.app.features.more.user.editprofile.delete.ShowDeleteBottomSheet.<anonymous> (DeleteAccountBottomSheet.kt:91)"
                            r2 = -1590099360(0xffffffffa1390260, float:-6.268358E-19)
                            androidx.compose.runtime.c.U(r2, r10, r0, r1)
                        L1f:
                            int r10 = t9.y0.f70534k5
                            r0 = 0
                            java.lang.String r3 = p1.g.b(r10, r9, r0)
                            r1 = 0
                            g00.a<wz.p> r10 = r1
                            r0 = 1157296644(0x44faf204, float:2007.563)
                            r9.C(r0)
                            boolean r0 = r9.T(r10)
                            java.lang.Object r2 = r9.D()
                            if (r0 != 0) goto L41
                            androidx.compose.runtime.a$a r0 = androidx.compose.runtime.a.f7182a
                            java.lang.Object r0 = r0.a()
                            if (r2 != r0) goto L49
                        L41:
                            com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$ShowDeleteBottomSheet$1$1$1 r2 = new com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$ShowDeleteBottomSheet$1$1$1
                            r2.<init>(r10)
                            r9.u(r2)
                        L49:
                            r9.S()
                            g00.a r2 = (g00.a) r2
                            r4 = 0
                            r6 = 0
                            r7 = 9
                            r5 = r9
                            com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt.e(r1, r2, r3, r4, r5, r6, r7)
                            boolean r9 = androidx.compose.runtime.c.I()
                            if (r9 == 0) goto L5f
                            androidx.compose.runtime.c.T()
                        L5f:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$ShowDeleteBottomSheet$1.b(androidx.compose.runtime.a, int):void");
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                        b(aVar4, num.intValue());
                        return p.f75480a;
                    }
                }), b.b(h11, 1664576097, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$ShowDeleteBottomSheet$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r31v0, types: [androidx.compose.runtime.a, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r4v7 */
                    /* JADX WARN: Type inference failed for: r5v12 */
                    public final void b(androidx.compose.runtime.a aVar4, int i16) {
                        if ((i16 & 11) == 2 && aVar4.i()) {
                            aVar4.L();
                            return;
                        }
                        if (c.I()) {
                            c.U(1664576097, i16, -1, "com.forsale.app.features.more.user.editprofile.delete.ShowDeleteBottomSheet.<anonymous> (DeleteAccountBottomSheet.kt:97)");
                        }
                        c.a aVar5 = androidx.compose.ui.c.f7566a;
                        float f11 = 16;
                        androidx.compose.ui.c m11 = PaddingKt.m(aVar5, 0.0f, h.l(f11), 0.0f, h.l(f11), 5, null);
                        Arrangement.f o11 = Arrangement.f3698a.o(h.l(f11));
                        final g00.a<p> aVar6 = aVar;
                        final g00.a<p> aVar7 = aVar2;
                        aVar4.C(-483455358);
                        a0 a11 = e.a(o11, v0.b.f74009a.k(), aVar4, 6);
                        aVar4.C(-1323940314);
                        int a12 = j0.e.a(aVar4, 0);
                        k s11 = aVar4.s();
                        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                        g00.a<ComposeUiNode> a13 = companion.a();
                        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(m11);
                        if (!(aVar4.k() instanceof d)) {
                            j0.e.c();
                        }
                        aVar4.I();
                        if (aVar4.f()) {
                            aVar4.y(a13);
                        } else {
                            aVar4.t();
                        }
                        androidx.compose.runtime.a a14 = Updater.a(aVar4);
                        Updater.c(a14, a11, companion.e());
                        Updater.c(a14, s11, companion.g());
                        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
                        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                            a14.u(Integer.valueOf(a12));
                            a14.p(Integer.valueOf(a12), b11);
                        }
                        c11.invoke(e1.a(e1.b(aVar4)), aVar4, 0);
                        aVar4.C(2058660585);
                        f fVar = f.f74891a;
                        androidx.compose.ui.c m12 = PaddingKt.m(aVar5, h.l(f11), 0.0f, h.l(f11), 0.0f, 10, null);
                        String b12 = g.b(y0.f70699u3, aVar4, 0);
                        dk.a aVar8 = dk.a.f54291a;
                        int i17 = dk.a.f54292b;
                        yj.d e11 = aVar8.a(aVar4, i17).e();
                        int i18 = yj.d.f76453b;
                        TextKt.a(b12, m12, 0, 0, false, 0, 0, null, aVar8.c(aVar4, i17).d(), e11.m(aVar4, i18), 0, aVar4, 48, 0, 1276);
                        DividersKt.a(null, 0.0f, 0L, aVar4, 0, 7);
                        androidx.compose.ui.c m13 = PaddingKt.m(SizeKt.h(aVar5, 0.0f, 1, null), h.l(f11), 0.0f, h.l(f11), 0.0f, 10, null);
                        yj.d d11 = aVar8.a(aVar4, i17).d();
                        aVar4.C(1157296644);
                        boolean T = aVar4.T(aVar6);
                        Object D = aVar4.D();
                        if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                            D = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0193: CONSTRUCTOR  (r5v11 'D' java.lang.Object) = (r12v0 'aVar6' g00.a<wz.p> A[DONT_INLINE]) call: com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$ShowDeleteBottomSheet$2$1$1$1.<init>(g00.a):void type: CONSTRUCTOR in method: com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$ShowDeleteBottomSheet$2.b(androidx.compose.runtime.a, int):void, file: classes2.dex
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$ShowDeleteBottomSheet$2$1$1$1, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                                	... 25 more
                                */
                            /*
                                Method dump skipped, instructions count: 566
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$ShowDeleteBottomSheet$2.b(androidx.compose.runtime.a, int):void");
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                            b(aVar4, num.intValue());
                            return p.f75480a;
                        }
                    }), ComposableSingletons$DeleteAccountBottomSheetKt.f33223a.c(), 0L, modalBottomSheetState, aVar2, h11, ((i12 << 15) & 458752) | 3510 | ((i12 << 12) & 3670016), 16);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }
                d1 l11 = h11.l();
                if (l11 != null) {
                    l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$ShowDeleteBottomSheet$3
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar4, int i16) {
                            DeleteAccountBottomSheetKt.c(ModalBottomSheetState.this, aVar, aVar2, aVar4, v0.a(i11 | 1));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                            b(aVar4, num.intValue());
                            return p.f75480a;
                        }
                    });
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void d(final g00.a<p> aVar, final g00.a<p> aVar2, androidx.compose.runtime.a aVar3, final int i11) {
                final int i12;
                androidx.compose.runtime.a aVar4;
                int i13;
                int i14;
                androidx.compose.runtime.a h11 = aVar3.h(-1793489736);
                if ((i11 & 14) == 0) {
                    if (h11.F(aVar)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i12 = i14 | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 112) == 0) {
                    if (h11.F(aVar2)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i12 |= i13;
                }
                if ((i12 & 91) == 18 && h11.i()) {
                    h11.L();
                    aVar4 = h11;
                } else {
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-1793489736, i12, -1, "com.forsale.app.features.more.user.editprofile.delete.ShowDialog (DeleteAccountBottomSheet.kt:187)");
                    }
                    aVar4 = h11;
                    DialogKt.a(null, new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$ShowDialog$1
                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // g00.a
                        public /* bridge */ /* synthetic */ p invoke() {
                            invoke2();
                            return p.f75480a;
                        }
                    }, a.C0664a.f58239a, DialogCtaType.Horizontal, g.b(y0.f70667s3, h11, 0), g.b(y0.f70651r3, h11, 0), b.b(h11, -1804391427, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$ShowDialog$2
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r13v0, types: [androidx.compose.runtime.a] */
                        /* JADX WARN: Type inference failed for: r1v3 */
                        public final void b(androidx.compose.runtime.a aVar5, int i15) {
                            if ((i15 & 11) == 2 && aVar5.i()) {
                                aVar5.L();
                                return;
                            }
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.U(-1804391427, i15, -1, "com.forsale.app.features.more.user.editprofile.delete.ShowDialog.<anonymous> (DeleteAccountBottomSheet.kt:195)");
                            }
                            final g00.a<p> aVar6 = aVar;
                            aVar5.C(1157296644);
                            boolean T = aVar5.T(aVar6);
                            Object D = aVar5.D();
                            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                                D = 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003b: CONSTRUCTOR  (r1v2 'D' java.lang.Object) = (r14v1 'aVar6' g00.a<wz.p> A[DONT_INLINE]) call: com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$ShowDialog$2$1$1.<init>(g00.a):void type: CONSTRUCTOR in method: com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$ShowDialog$2.b(androidx.compose.runtime.a, int):void, file: classes2.dex
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
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$ShowDialog$2$1$1, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                                    	... 25 more
                                    */
                                /*
                                    this = this;
                                    r0 = r14 & 11
                                    r1 = 2
                                    if (r0 != r1) goto L10
                                    boolean r0 = r13.i()
                                    if (r0 != 0) goto Lc
                                    goto L10
                                Lc:
                                    r13.L()
                                    goto L6e
                                L10:
                                    boolean r0 = androidx.compose.runtime.c.I()
                                    if (r0 == 0) goto L1f
                                    r0 = -1
                                    java.lang.String r1 = "com.forsale.app.features.more.user.editprofile.delete.ShowDialog.<anonymous> (DeleteAccountBottomSheet.kt:195)"
                                    r2 = -1804391427(0xffffffff94732bfd, float:-1.227704E-26)
                                    androidx.compose.runtime.c.U(r2, r14, r0, r1)
                                L1f:
                                    g00.a<wz.p> r14 = r1
                                    r0 = 1157296644(0x44faf204, float:2007.563)
                                    r13.C(r0)
                                    boolean r0 = r13.T(r14)
                                    java.lang.Object r1 = r13.D()
                                    if (r0 != 0) goto L39
                                    androidx.compose.runtime.a$a r0 = androidx.compose.runtime.a.f7182a
                                    java.lang.Object r0 = r0.a()
                                    if (r1 != r0) goto L41
                                L39:
                                    com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$ShowDialog$2$1$1 r1 = new com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$ShowDialog$2$1$1
                                    r1.<init>(r14)
                                    r13.u(r1)
                                L41:
                                    r13.S()
                                    r2 = r1
                                    g00.a r2 = (g00.a) r2
                                    r3 = 0
                                    com.forsale.designSystem.buttons.ButtonData$a r14 = com.forsale.designSystem.buttons.ButtonData.f40994a
                                    com.forsale.designSystem.buttons.ButtonData r4 = r14.c()
                                    r5 = 0
                                    r6 = 0
                                    r7 = 0
                                    com.forsale.app.features.more.user.editprofile.delete.ComposableSingletons$DeleteAccountBottomSheetKt r14 = com.forsale.app.features.more.user.editprofile.delete.ComposableSingletons$DeleteAccountBottomSheetKt.f33223a
                                    g00.q r8 = r14.d()
                                    int r14 = com.forsale.designSystem.buttons.ButtonData.f40995b
                                    int r14 = r14 << 6
                                    r0 = 1572864(0x180000, float:2.204052E-39)
                                    r10 = r14 | r0
                                    r11 = 58
                                    r9 = r13
                                    com.forsale.designSystem.buttons.ButtonsKt.k(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                                    boolean r13 = androidx.compose.runtime.c.I()
                                    if (r13 == 0) goto L6e
                                    androidx.compose.runtime.c.T()
                                L6e:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$ShowDialog$2.b(androidx.compose.runtime.a, int):void");
                            }

                            @Override // g00.p
                            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                                b(aVar5, num.intValue());
                                return p.f75480a;
                            }
                        }), b.b(h11, -1635247652, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$ShowDialog$3
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r13v0, types: [androidx.compose.runtime.a] */
                            /* JADX WARN: Type inference failed for: r1v3 */
                            public final void b(androidx.compose.runtime.a aVar5, int i15) {
                                if ((i15 & 11) == 2 && aVar5.i()) {
                                    aVar5.L();
                                    return;
                                }
                                if (androidx.compose.runtime.c.I()) {
                                    androidx.compose.runtime.c.U(-1635247652, i15, -1, "com.forsale.app.features.more.user.editprofile.delete.ShowDialog.<anonymous> (DeleteAccountBottomSheet.kt:206)");
                                }
                                final g00.a<p> aVar6 = aVar2;
                                aVar5.C(1157296644);
                                boolean T = aVar5.T(aVar6);
                                Object D = aVar5.D();
                                if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                                    D = 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003b: CONSTRUCTOR  (r1v2 'D' java.lang.Object) = (r14v1 'aVar6' g00.a<wz.p> A[DONT_INLINE]) call: com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$ShowDialog$3$1$1.<init>(g00.a):void type: CONSTRUCTOR in method: com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$ShowDialog$3.b(androidx.compose.runtime.a, int):void, file: classes2.dex
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
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$ShowDialog$3$1$1, state: NOT_LOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                                        	... 25 more
                                        */
                                    /*
                                        this = this;
                                        r0 = r14 & 11
                                        r1 = 2
                                        if (r0 != r1) goto L10
                                        boolean r0 = r13.i()
                                        if (r0 != 0) goto Lc
                                        goto L10
                                    Lc:
                                        r13.L()
                                        goto L6e
                                    L10:
                                        boolean r0 = androidx.compose.runtime.c.I()
                                        if (r0 == 0) goto L1f
                                        r0 = -1
                                        java.lang.String r1 = "com.forsale.app.features.more.user.editprofile.delete.ShowDialog.<anonymous> (DeleteAccountBottomSheet.kt:206)"
                                        r2 = -1635247652(0xffffffff9e8819dc, float:-1.4410255E-20)
                                        androidx.compose.runtime.c.U(r2, r14, r0, r1)
                                    L1f:
                                        g00.a<wz.p> r14 = r1
                                        r0 = 1157296644(0x44faf204, float:2007.563)
                                        r13.C(r0)
                                        boolean r0 = r13.T(r14)
                                        java.lang.Object r1 = r13.D()
                                        if (r0 != 0) goto L39
                                        androidx.compose.runtime.a$a r0 = androidx.compose.runtime.a.f7182a
                                        java.lang.Object r0 = r0.a()
                                        if (r1 != r0) goto L41
                                    L39:
                                        com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$ShowDialog$3$1$1 r1 = new com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$ShowDialog$3$1$1
                                        r1.<init>(r14)
                                        r13.u(r1)
                                    L41:
                                        r13.S()
                                        r2 = r1
                                        g00.a r2 = (g00.a) r2
                                        r3 = 0
                                        com.forsale.designSystem.buttons.ButtonData$a r14 = com.forsale.designSystem.buttons.ButtonData.f40994a
                                        com.forsale.designSystem.buttons.ButtonData r4 = r14.c()
                                        r5 = 0
                                        r6 = 0
                                        r7 = 0
                                        com.forsale.app.features.more.user.editprofile.delete.ComposableSingletons$DeleteAccountBottomSheetKt r14 = com.forsale.app.features.more.user.editprofile.delete.ComposableSingletons$DeleteAccountBottomSheetKt.f33223a
                                        g00.q r8 = r14.e()
                                        int r14 = com.forsale.designSystem.buttons.ButtonData.f40995b
                                        int r14 = r14 << 6
                                        r0 = 1572864(0x180000, float:2.204052E-39)
                                        r10 = r14 | r0
                                        r11 = 58
                                        r9 = r13
                                        com.forsale.designSystem.buttons.ButtonsKt.k(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                                        boolean r13 = androidx.compose.runtime.c.I()
                                        if (r13 == 0) goto L6e
                                        androidx.compose.runtime.c.T()
                                    L6e:
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$ShowDialog$3.b(androidx.compose.runtime.a, int):void");
                                }

                                @Override // g00.p
                                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                                    b(aVar5, num.intValue());
                                    return p.f75480a;
                                }
                            }), null, h11, 14159280, 257);
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.T();
                            }
                        }
                        d1 l11 = aVar4.l();
                        if (l11 != null) {
                            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$ShowDialog$4
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                public final void b(androidx.compose.runtime.a aVar5, int i15) {
                                    DeleteAccountBottomSheetKt.d(aVar, aVar2, aVar5, v0.a(i11 | 1));
                                }

                                @Override // g00.p
                                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                                    b(aVar5, num.intValue());
                                    return p.f75480a;
                                }
                            });
                        }
                    }
                }
