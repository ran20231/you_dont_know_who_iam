package com.forsale.app.features.more.newprofile.followerandfollowing.settings;

import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.c0;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.designSystem.bottomsheets.BottomSheetsKt;
import com.forsale.designSystem.bottomsheets.ModalBottomSheetState;
import com.forsale.designSystem.bottomsheets.ModalBottomSheetValue;
import com.forsale.designSystem.layouts.ListItemKt;
import e2.h;
import g00.l;
import g00.q;
import j0.d1;
import j0.k0;
import j0.u;
import j0.v0;
import kotlin.jvm.internal.o;
import r0.b;
import wz.p;
/* compiled from: SettingsBottomSheet.kt */
/* loaded from: classes2.dex */
public final class SettingsBottomSheetKt {
    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"UnrememberedMutableState"})
    public static final void a(final boolean z11, final l<? super Boolean, p> lVar, a aVar, final int i11) {
        int i12;
        final k0 e11;
        a aVar2;
        int i13;
        int i14;
        a h11 = aVar.h(-137063621);
        if ((i11 & 14) == 0) {
            if (h11.a(z11)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(lVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        final int i15 = i12;
        if ((i15 & 91) == 18 && h11.i()) {
            h11.L();
            aVar2 = h11;
        } else {
            if (c.I()) {
                c.U(-137063621, i15, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.settings.AllowFollowSettings (SettingsBottomSheet.kt:102)");
            }
            e11 = c0.e(Boolean.valueOf(z11), null, 2, null);
            aVar2 = h11;
            ListItemKt.a(null, false, null, ComposableSingletons$SettingsBottomSheetKt.f32308a.b(), null, null, null, null, b.b(h11, -925431048, true, new q<w.c, a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheetKt$AllowFollowSettings$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r11v0, types: [androidx.compose.runtime.a] */
                /* JADX WARN: Type inference failed for: r1v3 */
                public final void b(w.c ListItem, a aVar3, int i16) {
                    o.i(ListItem, "$this$ListItem");
                    if ((i16 & 81) == 16 && aVar3.i()) {
                        aVar3.L();
                        return;
                    }
                    if (c.I()) {
                        c.U(-925431048, i16, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.settings.AllowFollowSettings.<anonymous> (SettingsBottomSheet.kt:113)");
                    }
                    boolean booleanValue = e11.getValue().booleanValue();
                    final k0<Boolean> k0Var = e11;
                    final l<Boolean, p> lVar2 = lVar;
                    aVar3.C(511388516);
                    boolean T = aVar3.T(k0Var) | aVar3.T(lVar2);
                    Object D = aVar3.D();
                    if (T || D == a.f7182a.a()) {
                        D = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0055: CONSTRUCTOR  (r1v2 'D' java.lang.Object) = (r10v6 'k0Var' j0.k0<java.lang.Boolean> A[DONT_INLINE]), (r12v1 'lVar2' g00.l<java.lang.Boolean, wz.p> A[DONT_INLINE]) call: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheetKt$AllowFollowSettings$1$1$1.<init>(j0.k0, g00.l):void type: CONSTRUCTOR in method: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheetKt$AllowFollowSettings$1.b(w.c, androidx.compose.runtime.a, int):void, file: classes2.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheetKt$AllowFollowSettings$1$1$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                            	... 25 more
                            */
                        /*
                            this = this;
                            java.lang.String r0 = "$this$ListItem"
                            kotlin.jvm.internal.o.i(r10, r0)
                            r10 = r12 & 81
                            r0 = 16
                            if (r10 != r0) goto L16
                            boolean r10 = r11.i()
                            if (r10 != 0) goto L12
                            goto L16
                        L12:
                            r11.L()
                            goto L72
                        L16:
                            boolean r10 = androidx.compose.runtime.c.I()
                            if (r10 == 0) goto L25
                            r10 = -1
                            java.lang.String r0 = "com.forsale.app.features.more.newprofile.followerandfollowing.settings.AllowFollowSettings.<anonymous> (SettingsBottomSheet.kt:113)"
                            r1 = -925431048(0xffffffffc8d70af8, float:-440407.75)
                            androidx.compose.runtime.c.U(r1, r12, r10, r0)
                        L25:
                            r2 = 0
                            j0.k0<java.lang.Boolean> r10 = r1
                            java.lang.Object r10 = r10.getValue()
                            java.lang.Boolean r10 = (java.lang.Boolean) r10
                            boolean r3 = r10.booleanValue()
                            j0.k0<java.lang.Boolean> r10 = r1
                            g00.l<java.lang.Boolean, wz.p> r12 = r2
                            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
                            r11.C(r0)
                            boolean r0 = r11.T(r10)
                            boolean r1 = r11.T(r12)
                            r0 = r0 | r1
                            java.lang.Object r1 = r11.D()
                            if (r0 != 0) goto L53
                            androidx.compose.runtime.a$a r0 = androidx.compose.runtime.a.f7182a
                            java.lang.Object r0 = r0.a()
                            if (r1 != r0) goto L5b
                        L53:
                            com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheetKt$AllowFollowSettings$1$1$1 r1 = new com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheetKt$AllowFollowSettings$1$1$1
                            r1.<init>(r10, r12)
                            r11.u(r1)
                        L5b:
                            r11.S()
                            r4 = r1
                            g00.l r4 = (g00.l) r4
                            r5 = 0
                            r7 = 0
                            r8 = 9
                            r6 = r11
                            com.forsale.ui.components.material3.SwitchKt.a(r2, r3, r4, r5, r6, r7, r8)
                            boolean r10 = androidx.compose.runtime.c.I()
                            if (r10 == 0) goto L72
                            androidx.compose.runtime.c.T()
                        L72:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheetKt$AllowFollowSettings$1.b(w.c, androidx.compose.runtime.a, int):void");
                    }

                    @Override // g00.q
                    public /* bridge */ /* synthetic */ p invoke(w.c cVar, a aVar3, Integer num) {
                        b(cVar, aVar3, num.intValue());
                        return p.f75480a;
                    }
                }), false, 0.0f, 0.0f, h.l(8), null, aVar2, 905972736, 384, 11511);
                if (c.I()) {
                    c.T();
                }
            }
            d1 l11 = aVar2.l();
            if (l11 != null) {
                l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheetKt$AllowFollowSettings$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(a aVar3, int i16) {
                        SettingsBottomSheetKt.a(z11, lVar, aVar3, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(a aVar3, Integer num) {
                        b(aVar3, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x017e  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x018a  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x018e  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01ad  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0209  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0215  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0219  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0238  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0270  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x02c1  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x02fa  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0306  */
        /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final void b(androidx.compose.ui.graphics.painter.Painter r17, g00.a<wz.p> r18, androidx.compose.runtime.a r19, final int r20, final int r21) {
            /*
                Method dump skipped, instructions count: 783
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheetKt.b(androidx.compose.ui.graphics.painter.Painter, g00.a, androidx.compose.runtime.a, int, int):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v13 */
        public static final void c(final fe.a sheetState, final boolean z11, final l<? super Boolean, p> onAllowFlowClicked, final l<? super Boolean, p> onCloseBottomSheet, a aVar, final int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            o.i(sheetState, "sheetState");
            o.i(onAllowFlowClicked, "onAllowFlowClicked");
            o.i(onCloseBottomSheet, "onCloseBottomSheet");
            a h11 = aVar.h(953921637);
            if ((i11 & 14) == 0) {
                if (h11.T(sheetState)) {
                    i16 = 4;
                } else {
                    i16 = 2;
                }
                i12 = i16 | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 112) == 0) {
                if (h11.a(z11)) {
                    i15 = 32;
                } else {
                    i15 = 16;
                }
                i12 |= i15;
            }
            if ((i11 & 896) == 0) {
                if (h11.F(onAllowFlowClicked)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i11 & 7168) == 0) {
                if (h11.F(onCloseBottomSheet)) {
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
                    c.U(953921637, i17, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheet (SettingsBottomSheet.kt:44)");
                }
                ModalBottomSheetState k11 = BottomSheetsKt.k(ModalBottomSheetValue.Hidden, null, true, null, h11, 390, 10);
                Boolean valueOf = Boolean.valueOf(sheetState.a());
                h11.C(511388516);
                boolean T = h11.T(sheetState) | h11.T(k11);
                Object D = h11.D();
                if (T || D == a.f7182a.a()) {
                    D = new SettingsBottomSheetKt$SettingsBottomSheet$1$1$1(sheetState, k11, null);
                    h11.u(D);
                }
                h11.S();
                u.d(valueOf, (g00.p) D, h11, 64);
                h11.C(1157296644);
                boolean T2 = h11.T(onAllowFlowClicked);
                Object D2 = h11.D();
                if (T2 || D2 == a.f7182a.a()) {
                    D2 = new l<Boolean, p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheetKt$SettingsBottomSheet$1$2$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ p invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return p.f75480a;
                        }

                        public final void invoke(boolean z12) {
                            onAllowFlowClicked.invoke(Boolean.valueOf(z12));
                        }
                    };
                    h11.u(D2);
                }
                h11.S();
                l lVar = (l) D2;
                h11.C(1157296644);
                boolean T3 = h11.T(onCloseBottomSheet);
                Object D3 = h11.D();
                if (T3 || D3 == a.f7182a.a()) {
                    D3 = new g00.a<p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheetKt$SettingsBottomSheet$1$3$1
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
                            onCloseBottomSheet.invoke(Boolean.FALSE);
                        }
                    };
                    h11.u(D3);
                }
                h11.S();
                d(k11, z11, lVar, D3, h11, i17 & 112);
                if (c.I()) {
                    c.T();
                }
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheetKt$SettingsBottomSheet$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(a aVar2, int i18) {
                        SettingsBottomSheetKt.c(fe.a.this, z11, onAllowFlowClicked, onCloseBottomSheet, aVar2, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(final ModalBottomSheetState modalBottomSheetState, final boolean z11, final l<? super Boolean, p> lVar, final g00.a<p> aVar, a aVar2, final int i11) {
            final int i12;
            a aVar3;
            int i13;
            int i14;
            int i15;
            int i16;
            a h11 = aVar2.h(222051103);
            if ((i11 & 14) == 0) {
                if (h11.T(modalBottomSheetState)) {
                    i16 = 4;
                } else {
                    i16 = 2;
                }
                i12 = i16 | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 112) == 0) {
                if (h11.a(z11)) {
                    i15 = 32;
                } else {
                    i15 = 16;
                }
                i12 |= i15;
            }
            if ((i11 & 896) == 0) {
                if (h11.F(lVar)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i11 & 7168) == 0) {
                if (h11.F(aVar)) {
                    i13 = RecyclerView.l.FLAG_MOVED;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            if ((i12 & 5851) == 1170 && h11.i()) {
                h11.L();
                aVar3 = h11;
            } else {
                if (c.I()) {
                    c.U(222051103, i12, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.settings.ShowBottomSheet (SettingsBottomSheet.kt:74)");
                }
                aVar3 = h11;
                BottomSheetsKt.a(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), b.b(h11, 1006940030, true, new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheetKt$ShowBottomSheet$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(a aVar4, int i17) {
                        if ((i17 & 11) == 2 && aVar4.i()) {
                            aVar4.L();
                            return;
                        }
                        if (c.I()) {
                            c.U(1006940030, i17, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.settings.ShowBottomSheet.<anonymous> (SettingsBottomSheet.kt:78)");
                        }
                        final g00.a<p> aVar5 = aVar;
                        aVar4.C(1157296644);
                        boolean T = aVar4.T(aVar5);
                        Object D = aVar4.D();
                        if (T || D == a.f7182a.a()) {
                            D = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003b: CONSTRUCTOR  (r1v2 'D' java.lang.Object) = (r5v1 'aVar5' g00.a<wz.p> A[DONT_INLINE]) call: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheetKt$ShowBottomSheet$1$1$1.<init>(g00.a):void type: CONSTRUCTOR in method: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheetKt$ShowBottomSheet$1.b(androidx.compose.runtime.a, int):void, file: classes2.dex
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheetKt$ShowBottomSheet$1$1$1, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                                	... 25 more
                                */
                            /*
                                this = this;
                                r0 = r5 & 11
                                r1 = 2
                                if (r0 != r1) goto L10
                                boolean r0 = r4.i()
                                if (r0 != 0) goto Lc
                                goto L10
                            Lc:
                                r4.L()
                                goto L55
                            L10:
                                boolean r0 = androidx.compose.runtime.c.I()
                                if (r0 == 0) goto L1f
                                r0 = -1
                                java.lang.String r1 = "com.forsale.app.features.more.newprofile.followerandfollowing.settings.ShowBottomSheet.<anonymous> (SettingsBottomSheet.kt:78)"
                                r2 = 1006940030(0x3c04af7e, float:0.008098481)
                                androidx.compose.runtime.c.U(r2, r5, r0, r1)
                            L1f:
                                g00.a<wz.p> r5 = r1
                                r0 = 1157296644(0x44faf204, float:2007.563)
                                r4.C(r0)
                                boolean r0 = r4.T(r5)
                                java.lang.Object r1 = r4.D()
                                if (r0 != 0) goto L39
                                androidx.compose.runtime.a$a r0 = androidx.compose.runtime.a.f7182a
                                java.lang.Object r0 = r0.a()
                                if (r1 != r0) goto L41
                            L39:
                                com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheetKt$ShowBottomSheet$1$1$1 r1 = new com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheetKt$ShowBottomSheet$1$1$1
                                r1.<init>(r5)
                                r4.u(r1)
                            L41:
                                r4.S()
                                g00.a r1 = (g00.a) r1
                                r5 = 0
                                r0 = 1
                                r2 = 0
                                com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheetKt.f(r2, r1, r4, r5, r0)
                                boolean r4 = androidx.compose.runtime.c.I()
                                if (r4 == 0) goto L55
                                androidx.compose.runtime.c.T()
                            L55:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheetKt$ShowBottomSheet$1.b(androidx.compose.runtime.a, int):void");
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                            b(aVar4, num.intValue());
                            return p.f75480a;
                        }
                    }), b.b(h11, 646480319, true, new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheetKt$ShowBottomSheet$2
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void b(a aVar4, int i17) {
                            if ((i17 & 11) == 2 && aVar4.i()) {
                                aVar4.L();
                                return;
                            }
                            if (c.I()) {
                                c.U(646480319, i17, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.settings.ShowBottomSheet.<anonymous> (SettingsBottomSheet.kt:83)");
                            }
                            boolean z12 = z11;
                            final l<Boolean, p> lVar2 = lVar;
                            aVar4.C(1157296644);
                            boolean T = aVar4.T(lVar2);
                            Object D = aVar4.D();
                            if (T || D == a.f7182a.a()) {
                                D = 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003d: CONSTRUCTOR  (r2v1 'D' java.lang.Object) = (r0v2 'lVar2' g00.l<java.lang.Boolean, wz.p> A[DONT_INLINE]) call: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheetKt$ShowBottomSheet$2$1$1.<init>(g00.l):void type: CONSTRUCTOR in method: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheetKt$ShowBottomSheet$2.b(androidx.compose.runtime.a, int):void, file: classes2.dex
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
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheetKt$ShowBottomSheet$2$1$1, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                                    	... 25 more
                                    */
                                /*
                                    this = this;
                                    r0 = r5 & 11
                                    r1 = 2
                                    if (r0 != r1) goto L10
                                    boolean r0 = r4.i()
                                    if (r0 != 0) goto Lc
                                    goto L10
                                Lc:
                                    r4.L()
                                    goto L5a
                                L10:
                                    boolean r0 = androidx.compose.runtime.c.I()
                                    if (r0 == 0) goto L1f
                                    r0 = -1
                                    java.lang.String r1 = "com.forsale.app.features.more.newprofile.followerandfollowing.settings.ShowBottomSheet.<anonymous> (SettingsBottomSheet.kt:83)"
                                    r2 = 646480319(0x268881bf, float:9.472063E-16)
                                    androidx.compose.runtime.c.U(r2, r5, r0, r1)
                                L1f:
                                    boolean r5 = r1
                                    g00.l<java.lang.Boolean, wz.p> r0 = r2
                                    r1 = 1157296644(0x44faf204, float:2007.563)
                                    r4.C(r1)
                                    boolean r1 = r4.T(r0)
                                    java.lang.Object r2 = r4.D()
                                    if (r1 != 0) goto L3b
                                    androidx.compose.runtime.a$a r1 = androidx.compose.runtime.a.f7182a
                                    java.lang.Object r1 = r1.a()
                                    if (r2 != r1) goto L43
                                L3b:
                                    com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheetKt$ShowBottomSheet$2$1$1 r2 = new com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheetKt$ShowBottomSheet$2$1$1
                                    r2.<init>(r0)
                                    r4.u(r2)
                                L43:
                                    r4.S()
                                    g00.l r2 = (g00.l) r2
                                    int r0 = r3
                                    int r0 = r0 >> 3
                                    r0 = r0 & 14
                                    com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheetKt.e(r5, r2, r4, r0)
                                    boolean r4 = androidx.compose.runtime.c.I()
                                    if (r4 == 0) goto L5a
                                    androidx.compose.runtime.c.T()
                                L5a:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheetKt$ShowBottomSheet$2.b(androidx.compose.runtime.a, int):void");
                            }

                            @Override // g00.p
                            public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                                b(aVar4, num.intValue());
                                return p.f75480a;
                            }
                        }), ComposableSingletons$SettingsBottomSheetKt.f32308a.a(), 0L, modalBottomSheetState, aVar, h11, ((i12 << 15) & 458752) | 3510 | ((i12 << 9) & 3670016), 16);
                        if (c.I()) {
                            c.T();
                        }
                    }
                    d1 l11 = aVar3.l();
                    if (l11 != null) {
                        l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheetKt$ShowBottomSheet$3
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void b(a aVar4, int i17) {
                                SettingsBottomSheetKt.d(ModalBottomSheetState.this, z11, lVar, aVar, aVar4, v0.a(i11 | 1));
                            }

                            @Override // g00.p
                            public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                                b(aVar4, num.intValue());
                                return p.f75480a;
                            }
                        });
                    }
                }
            }
