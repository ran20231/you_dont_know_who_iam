package com.forsale.app.features.more.user.editprofile.logout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.c0;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.designSystem.bottomsheets.BottomSheetsKt;
import com.forsale.designSystem.bottomsheets.ModalBottomSheetState;
import com.forsale.designSystem.bottomsheets.ModalBottomSheetValue;
import com.forsale.ui.components.dialog.DialogCtaType;
import com.forsale.ui.components.dialog.DialogKt;
import e2.h;
import fe.a;
import g00.l;
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
import t9.q0;
import t9.y0;
import w.f;
import wz.p;
/* compiled from: LogoutBottomSheet.kt */
/* loaded from: classes2.dex */
public final class LogoutBottomSheetKt {
    public static final void a(final a sheetState, final l<? super Boolean, p> onLogoutClicked, final g00.a<p> onCloseBottomSheet, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        o.i(sheetState, "sheetState");
        o.i(onLogoutClicked, "onLogoutClicked");
        o.i(onCloseBottomSheet, "onCloseBottomSheet");
        androidx.compose.runtime.a h11 = aVar.h(-583860776);
        if ((i11 & 14) == 0) {
            if (h11.T(sheetState)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(onLogoutClicked)) {
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
                c.U(-583860776, i12, -1, "com.forsale.app.features.more.user.editprofile.logout.LogoutBottomSheet (LogoutBottomSheet.kt:43)");
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
            h11.C(-492369756);
            Object D2 = h11.D();
            if (D2 == c0064a.a()) {
                D2 = c0.e(Boolean.FALSE, null, 2, null);
                h11.u(D2);
            }
            h11.S();
            final k0 k0Var2 = (k0) D2;
            ModalBottomSheetState k11 = BottomSheetsKt.k(ModalBottomSheetValue.Hidden, null, true, null, h11, 390, 10);
            h11.C(-776744291);
            Boolean valueOf = Boolean.valueOf(sheetState.a());
            h11.C(511388516);
            boolean T = h11.T(sheetState) | h11.T(k11);
            Object D3 = h11.D();
            if (T || D3 == c0064a.a()) {
                D3 = new LogoutBottomSheetKt$LogoutBottomSheet$1$1$1(sheetState, k11, null);
                h11.u(D3);
            }
            h11.S();
            u.d(valueOf, (g00.p) D3, h11, 64);
            h11.C(1618982084);
            boolean T2 = h11.T(onCloseBottomSheet) | h11.T(k0Var) | h11.T(k0Var2);
            Object D4 = h11.D();
            if (T2 || D4 == c0064a.a()) {
                D4 = new l<Boolean, p>() { // from class: com.forsale.app.features.more.user.editprofile.logout.LogoutBottomSheetKt$LogoutBottomSheet$1$2$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return p.f75480a;
                    }

                    public final void invoke(boolean z11) {
                        onCloseBottomSheet.invoke();
                        k0Var.setValue(Boolean.TRUE);
                        k0Var2.setValue(Boolean.valueOf(z11));
                    }
                };
                h11.u(D4);
            }
            h11.S();
            l lVar = (l) D4;
            h11.C(1157296644);
            boolean T3 = h11.T(onCloseBottomSheet);
            Object D5 = h11.D();
            if (T3 || D5 == c0064a.a()) {
                D5 = new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.logout.LogoutBottomSheetKt$LogoutBottomSheet$1$3$1
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
                h11.u(D5);
            }
            h11.S();
            c(k11, lVar, (g00.a) D5, h11, 0);
            p pVar = p.f75480a;
            h11.S();
            if (((Boolean) k0Var.getValue()).booleanValue()) {
                boolean booleanValue = ((Boolean) k0Var2.getValue()).booleanValue();
                h11.C(1618982084);
                boolean T4 = h11.T(onLogoutClicked) | h11.T(k0Var2) | h11.T(k0Var);
                Object D6 = h11.D();
                if (T4 || D6 == c0064a.a()) {
                    D6 = new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.logout.LogoutBottomSheetKt$LogoutBottomSheet$2$1
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
                            onLogoutClicked.invoke(k0Var2.getValue());
                            k0Var.setValue(Boolean.FALSE);
                        }
                    };
                    h11.u(D6);
                }
                h11.S();
                g00.a aVar2 = (g00.a) D6;
                h11.C(1157296644);
                boolean T5 = h11.T(k0Var);
                Object D7 = h11.D();
                if (T5 || D7 == c0064a.a()) {
                    D7 = new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.logout.LogoutBottomSheetKt$LogoutBottomSheet$3$1
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
                    h11.u(D7);
                }
                h11.S();
                b(booleanValue, aVar2, (g00.a) D7, h11, 0);
            }
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.logout.LogoutBottomSheetKt$LogoutBottomSheet$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i16) {
                    LogoutBottomSheetKt.a(fe.a.this, onLogoutClicked, onCloseBottomSheet, aVar3, v0.a(i11 | 1));
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
    public static final void b(final boolean z11, final g00.a<p> aVar, final g00.a<p> aVar2, androidx.compose.runtime.a aVar3, final int i11) {
        final int i12;
        int i13;
        int i14;
        androidx.compose.runtime.a aVar4;
        int i15;
        int i16;
        int i17;
        androidx.compose.runtime.a h11 = aVar3.h(-341393923);
        if ((i11 & 14) == 0) {
            if (h11.a(z11)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(aVar)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        if ((i11 & 896) == 0) {
            if (h11.F(aVar2)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 731) == 146 && h11.i()) {
            h11.L();
            aVar4 = h11;
        } else {
            if (c.I()) {
                c.U(-341393923, i12, -1, "com.forsale.app.features.more.user.editprofile.logout.ShowDialog (LogoutBottomSheet.kt:128)");
            }
            LogoutBottomSheetKt$ShowDialog$1 logoutBottomSheetKt$ShowDialog$1 = new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.logout.LogoutBottomSheetKt$ShowDialog$1
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ p invoke() {
                    invoke2();
                    return p.f75480a;
                }
            };
            a.C0664a c0664a = a.C0664a.f58239a;
            DialogCtaType dialogCtaType = DialogCtaType.Horizontal;
            if (z11) {
                i13 = y0.G3;
            } else {
                i13 = y0.J3;
            }
            String b11 = g.b(i13, h11, 0);
            if (z11) {
                i14 = y0.F3;
            } else {
                i14 = y0.I3;
            }
            aVar4 = h11;
            DialogKt.a(null, logoutBottomSheetKt$ShowDialog$1, c0664a, dialogCtaType, b11, g.b(i14, h11, 0), b.b(h11, -679346344, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.logout.LogoutBottomSheetKt$ShowDialog$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r13v0, types: [androidx.compose.runtime.a] */
                /* JADX WARN: Type inference failed for: r1v3 */
                public final void b(androidx.compose.runtime.a aVar5, int i18) {
                    if ((i18 & 11) == 2 && aVar5.i()) {
                        aVar5.L();
                        return;
                    }
                    if (c.I()) {
                        c.U(-679346344, i18, -1, "com.forsale.app.features.more.user.editprofile.logout.ShowDialog.<anonymous> (LogoutBottomSheet.kt:136)");
                    }
                    final g00.a<p> aVar6 = aVar;
                    aVar5.C(1157296644);
                    boolean T = aVar5.T(aVar6);
                    Object D = aVar5.D();
                    if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                        D = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003b: CONSTRUCTOR  (r1v2 'D' java.lang.Object) = (r14v1 'aVar6' g00.a<wz.p> A[DONT_INLINE]) call: com.forsale.app.features.more.user.editprofile.logout.LogoutBottomSheetKt$ShowDialog$2$1$1.<init>(g00.a):void type: CONSTRUCTOR in method: com.forsale.app.features.more.user.editprofile.logout.LogoutBottomSheetKt$ShowDialog$2.b(androidx.compose.runtime.a, int):void, file: classes2.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.more.user.editprofile.logout.LogoutBottomSheetKt$ShowDialog$2$1$1, state: NOT_LOADED
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
                            java.lang.String r1 = "com.forsale.app.features.more.user.editprofile.logout.ShowDialog.<anonymous> (LogoutBottomSheet.kt:136)"
                            r2 = -679346344(0xffffffffd781ff58, float:-2.85867386E14)
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
                            com.forsale.app.features.more.user.editprofile.logout.LogoutBottomSheetKt$ShowDialog$2$1$1 r1 = new com.forsale.app.features.more.user.editprofile.logout.LogoutBottomSheetKt$ShowDialog$2$1$1
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
                            com.forsale.app.features.more.user.editprofile.logout.ComposableSingletons$LogoutBottomSheetKt r14 = com.forsale.app.features.more.user.editprofile.logout.ComposableSingletons$LogoutBottomSheetKt.f33391a
                            g00.q r8 = r14.c()
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
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.editprofile.logout.LogoutBottomSheetKt$ShowDialog$2.b(androidx.compose.runtime.a, int):void");
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                        b(aVar5, num.intValue());
                        return p.f75480a;
                    }
                }), b.b(h11, 269143385, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.logout.LogoutBottomSheetKt$ShowDialog$3
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r13v0, types: [androidx.compose.runtime.a] */
                    /* JADX WARN: Type inference failed for: r1v3 */
                    public final void b(androidx.compose.runtime.a aVar5, int i18) {
                        if ((i18 & 11) == 2 && aVar5.i()) {
                            aVar5.L();
                            return;
                        }
                        if (c.I()) {
                            c.U(269143385, i18, -1, "com.forsale.app.features.more.user.editprofile.logout.ShowDialog.<anonymous> (LogoutBottomSheet.kt:147)");
                        }
                        final g00.a<p> aVar6 = aVar2;
                        aVar5.C(1157296644);
                        boolean T = aVar5.T(aVar6);
                        Object D = aVar5.D();
                        if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                            D = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003b: CONSTRUCTOR  (r1v2 'D' java.lang.Object) = (r14v1 'aVar6' g00.a<wz.p> A[DONT_INLINE]) call: com.forsale.app.features.more.user.editprofile.logout.LogoutBottomSheetKt$ShowDialog$3$1$1.<init>(g00.a):void type: CONSTRUCTOR in method: com.forsale.app.features.more.user.editprofile.logout.LogoutBottomSheetKt$ShowDialog$3.b(androidx.compose.runtime.a, int):void, file: classes2.dex
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.more.user.editprofile.logout.LogoutBottomSheetKt$ShowDialog$3$1$1, state: NOT_LOADED
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
                                java.lang.String r1 = "com.forsale.app.features.more.user.editprofile.logout.ShowDialog.<anonymous> (LogoutBottomSheet.kt:147)"
                                r2 = 269143385(0x100acd59, float:2.7373895E-29)
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
                                com.forsale.app.features.more.user.editprofile.logout.LogoutBottomSheetKt$ShowDialog$3$1$1 r1 = new com.forsale.app.features.more.user.editprofile.logout.LogoutBottomSheetKt$ShowDialog$3$1$1
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
                                com.forsale.app.features.more.user.editprofile.logout.ComposableSingletons$LogoutBottomSheetKt r14 = com.forsale.app.features.more.user.editprofile.logout.ComposableSingletons$LogoutBottomSheetKt.f33391a
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
                            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.editprofile.logout.LogoutBottomSheetKt$ShowDialog$3.b(androidx.compose.runtime.a, int):void");
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                            b(aVar5, num.intValue());
                            return p.f75480a;
                        }
                    }), null, h11, 14159280, 257);
                    if (c.I()) {
                        c.T();
                    }
                }
                d1 l11 = aVar4.l();
                if (l11 != null) {
                    l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.logout.LogoutBottomSheetKt$ShowDialog$4
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar5, int i18) {
                            LogoutBottomSheetKt.b(z11, aVar, aVar2, aVar5, v0.a(i11 | 1));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                            b(aVar5, num.intValue());
                            return p.f75480a;
                        }
                    });
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void c(final ModalBottomSheetState modalBottomSheetState, final l<? super Boolean, p> lVar, final g00.a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
                final int i12;
                int i13;
                int i14;
                int i15;
                androidx.compose.runtime.a h11 = aVar2.h(731552494);
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
                    if (h11.F(lVar)) {
                        i14 = 32;
                    } else {
                        i14 = 16;
                    }
                    i12 |= i14;
                }
                if ((i11 & 896) == 0) {
                    if (h11.F(aVar)) {
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
                        c.U(731552494, i12, -1, "com.forsale.app.features.more.user.editprofile.logout.ShowLogoutBottomSheet (LogoutBottomSheet.kt:84)");
                    }
                    androidx.compose.ui.c h12 = SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null);
                    ComposableSingletons$LogoutBottomSheetKt composableSingletons$LogoutBottomSheetKt = ComposableSingletons$LogoutBottomSheetKt.f33391a;
                    BottomSheetsKt.a(h12, composableSingletons$LogoutBottomSheetKt.a(), b.b(h11, -1128566706, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.logout.LogoutBottomSheetKt$ShowLogoutBottomSheet$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r12v0, types: [androidx.compose.runtime.a, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r3v4 */
                        /* JADX WARN: Type inference failed for: r3v8 */
                        public final void b(androidx.compose.runtime.a aVar3, int i16) {
                            if ((i16 & 11) == 2 && aVar3.i()) {
                                aVar3.L();
                                return;
                            }
                            if (c.I()) {
                                c.U(-1128566706, i16, -1, "com.forsale.app.features.more.user.editprofile.logout.ShowLogoutBottomSheet.<anonymous> (LogoutBottomSheet.kt:89)");
                            }
                            androidx.compose.ui.c k11 = PaddingKt.k(androidx.compose.ui.c.f7566a, 0.0f, h.l(8), 1, null);
                            final l<Boolean, p> lVar2 = lVar;
                            int i17 = i12;
                            g00.a<p> aVar4 = aVar;
                            aVar3.C(-483455358);
                            a0 a11 = e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), aVar3, 0);
                            aVar3.C(-1323940314);
                            int a12 = j0.e.a(aVar3, 0);
                            k s11 = aVar3.s();
                            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                            g00.a<ComposeUiNode> a13 = companion.a();
                            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(k11);
                            if (!(aVar3.k() instanceof d)) {
                                j0.e.c();
                            }
                            aVar3.I();
                            if (aVar3.f()) {
                                aVar3.y(a13);
                            } else {
                                aVar3.t();
                            }
                            androidx.compose.runtime.a a14 = Updater.a(aVar3);
                            Updater.c(a14, a11, companion.e());
                            Updater.c(a14, s11, companion.g());
                            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
                            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                                a14.u(Integer.valueOf(a12));
                                a14.p(Integer.valueOf(a12), b11);
                            }
                            c11.invoke(e1.a(e1.b(aVar3)), aVar3, 0);
                            aVar3.C(2058660585);
                            f fVar = f.f74891a;
                            int i18 = q0.U1;
                            int i19 = y0.D3;
                            aVar3.C(1157296644);
                            boolean T = aVar3.T(lVar2);
                            Object D = aVar3.D();
                            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                                D = 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00ed: CONSTRUCTOR  (r3v3 'D' java.lang.Object) = (r7v0 'lVar2' g00.l<java.lang.Boolean, wz.p> A[DONT_INLINE]) call: com.forsale.app.features.more.user.editprofile.logout.LogoutBottomSheetKt$ShowLogoutBottomSheet$1$1$1$1.<init>(g00.l):void type: CONSTRUCTOR in method: com.forsale.app.features.more.user.editprofile.logout.LogoutBottomSheetKt$ShowLogoutBottomSheet$1.b(androidx.compose.runtime.a, int):void, file: classes2.dex
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
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.more.user.editprofile.logout.LogoutBottomSheetKt$ShowLogoutBottomSheet$1$1$1$1, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                                    	... 25 more
                                    */
                                /*
                                    Method dump skipped, instructions count: 339
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.editprofile.logout.LogoutBottomSheetKt$ShowLogoutBottomSheet$1.b(androidx.compose.runtime.a, int):void");
                            }

                            @Override // g00.p
                            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                                b(aVar3, num.intValue());
                                return p.f75480a;
                            }
                        }), composableSingletons$LogoutBottomSheetKt.b(), 0L, modalBottomSheetState, aVar, h11, ((i12 << 15) & 458752) | 3510 | ((i12 << 12) & 3670016), 16);
                        if (c.I()) {
                            c.T();
                        }
                    }
                    d1 l11 = h11.l();
                    if (l11 != null) {
                        l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.user.editprofile.logout.LogoutBottomSheetKt$ShowLogoutBottomSheet$2
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void b(androidx.compose.runtime.a aVar3, int i16) {
                                LogoutBottomSheetKt.c(ModalBottomSheetState.this, lVar, aVar, aVar3, v0.a(i11 | 1));
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
                /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
                /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x0131  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x013d  */
                /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public static final void g(final int r25, final int r26, final g00.a<wz.p> r27, boolean r28, androidx.compose.runtime.a r29, final int r30, final int r31) {
                    /*
                        Method dump skipped, instructions count: 338
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.editprofile.logout.LogoutBottomSheetKt.g(int, int, g00.a, boolean, androidx.compose.runtime.a, int, int):void");
                }
            }
