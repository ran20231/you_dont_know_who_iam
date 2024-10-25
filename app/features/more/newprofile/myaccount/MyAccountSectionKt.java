package com.forsale.app.features.more.newprofile.myaccount;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.app.features.auth.UserStatus;
import com.forsale.app.features.more.user.profile.NewProfileViewModel;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.badges.BadgesKt;
import com.forsale.designSystem.dividers.DividersKt;
import com.forsale.designSystem.layouts.ListItemKt;
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
import p1.g;
import r0.b;
import t9.y0;
import v0.b;
import w.f;
import w.t;
import w.u;
import wz.p;
/* compiled from: MyAccountSection.kt */
/* loaded from: classes2.dex */
public final class MyAccountSectionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final String str, final a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar3;
        int i13;
        int i14;
        androidx.compose.runtime.a h11 = aVar2.h(337901505);
        if ((i11 & 14) == 0) {
            if (h11.T(str)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(aVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && h11.i()) {
            h11.L();
            aVar3 = h11;
        } else {
            if (c.I()) {
                c.U(337901505, i12, -1, "com.forsale.app.features.more.newprofile.myaccount.ChatRow (MyAccountSection.kt:116)");
            }
            c.a aVar4 = androidx.compose.ui.c.f7566a;
            androidx.compose.ui.c h12 = SizeKt.h(aVar4, 0.0f, 1, null);
            h11.C(1157296644);
            boolean T = h11.T(aVar);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new a<p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$ChatRow$1$1
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
                h11.u(D);
            }
            h11.S();
            androidx.compose.ui.c e11 = ClickableKt.e(h12, false, null, null, (a) D, 7, null);
            ComposableSingletons$MyAccountSectionKt composableSingletons$MyAccountSectionKt = ComposableSingletons$MyAccountSectionKt.f32466a;
            q<t, androidx.compose.runtime.a, Integer, p> u11 = composableSingletons$MyAccountSectionKt.u();
            q<t, androidx.compose.runtime.a, Integer, p> v11 = composableSingletons$MyAccountSectionKt.v();
            r0.a b11 = b.b(h11, 71961086, true, new q<w.c, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$ChatRow$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void b(w.c ListItem, androidx.compose.runtime.a aVar5, int i15) {
                    o.i(ListItem, "$this$ListItem");
                    if ((i15 & 81) == 16 && aVar5.i()) {
                        aVar5.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(71961086, i15, -1, "com.forsale.app.features.more.newprofile.myaccount.ChatRow.<anonymous> (MyAccountSection.kt:135)");
                    }
                    b.c i16 = v0.b.f74009a.i();
                    Arrangement.f o11 = Arrangement.f3698a.o(h.l(12));
                    final String str2 = str;
                    aVar5.C(693286680);
                    c.a aVar6 = androidx.compose.ui.c.f7566a;
                    a0 a11 = androidx.compose.foundation.layout.o.a(o11, i16, aVar5, 54);
                    aVar5.C(-1323940314);
                    int a12 = e.a(aVar5, 0);
                    k s11 = aVar5.s();
                    ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                    a<ComposeUiNode> a13 = companion.a();
                    q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar6);
                    if (!(aVar5.k() instanceof d)) {
                        e.c();
                    }
                    aVar5.I();
                    if (aVar5.f()) {
                        aVar5.y(a13);
                    } else {
                        aVar5.t();
                    }
                    androidx.compose.runtime.a a14 = Updater.a(aVar5);
                    Updater.c(a14, a11, companion.e());
                    Updater.c(a14, s11, companion.g());
                    g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
                    if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                        a14.u(Integer.valueOf(a12));
                        a14.p(Integer.valueOf(a12), b12);
                    }
                    c11.invoke(e1.a(e1.b(aVar5)), aVar5, 0);
                    aVar5.C(2058660585);
                    u uVar = u.f74924a;
                    aVar5.C(-1284334328);
                    if (str2 != null) {
                        BadgesKt.b(null, dk.a.f54291a.a(aVar5, dk.a.f54292b).d().i(aVar5, yj.d.f76453b), r0.b.b(aVar5, -2017036115, true, 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00f8: INVOKE  
                              (null androidx.compose.ui.c)
                              (wrap: long : 0x00e3: INVOKE  (r2v7 long A[REMOVE]) = 
                              (wrap: yj.d : 0x00dd: INVOKE  (r11v20 yj.d A[REMOVE]) = 
                              (wrap: yj.b : 0x00d9: INVOKE  (r11v19 yj.b A[REMOVE]) = 
                              (wrap: dk.a : 0x00d5: SGET  (r11v18 dk.a A[REMOVE]) =  dk.a.a dk.a)
                              (r12v0 'aVar5' androidx.compose.runtime.a)
                              (wrap: int : 0x00d7: SGET  (r2v5 int A[REMOVE]) =  dk.a.b int)
                             type: VIRTUAL call: dk.a.a(androidx.compose.runtime.a, int):yj.b)
                             type: VIRTUAL call: yj.b.d():yj.d)
                              (r12v0 'aVar5' androidx.compose.runtime.a)
                              (wrap: int : 0x00e1: SGET  (r2v6 int A[REMOVE]) =  yj.d.b int)
                             type: VIRTUAL call: yj.d.i(androidx.compose.runtime.a, int):long)
                              (wrap: r0.a : 0x00f0: INVOKE  (r4v2 r0.a A[REMOVE]) = 
                              (r12v0 'aVar5' androidx.compose.runtime.a)
                              (-2017036115 int)
                              true
                              (wrap: g00.p<androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x00e9: CONSTRUCTOR  (r11v21 g00.p<androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = (r0v5 'str2' java.lang.String A[DONT_INLINE]) call: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$ChatRow$2$1$1.<init>(java.lang.String):void type: CONSTRUCTOR)
                             type: STATIC call: r0.b.b(androidx.compose.runtime.a, int, boolean, java.lang.Object):r0.a)
                              (r12v0 'aVar5' androidx.compose.runtime.a)
                              (384 int)
                              (1 int)
                             type: STATIC call: com.forsale.designSystem.badges.BadgesKt.b(androidx.compose.ui.c, long, g00.p, androidx.compose.runtime.a, int, int):void in method: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$ChatRow$2.b(w.c, androidx.compose.runtime.a, int):void, file: classes2.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$ChatRow$2$1$1, state: NOT_LOADED
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
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1097)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:872)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                            	... 25 more
                            */
                        /*
                            Method dump skipped, instructions count: 312
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$ChatRow$2.b(w.c, androidx.compose.runtime.a, int):void");
                    }

                    @Override // g00.q
                    public /* bridge */ /* synthetic */ p invoke(w.c cVar, androidx.compose.runtime.a aVar5, Integer num) {
                        b(cVar, aVar5, num.intValue());
                        return p.f75480a;
                    }
                });
                h11.C(1157296644);
                boolean T2 = h11.T(aVar);
                Object D2 = h11.D();
                if (T2 || D2 == androidx.compose.runtime.a.f7182a.a()) {
                    D2 = new a<p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$ChatRow$3$1
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
                    h11.u(D2);
                }
                h11.S();
                aVar3 = h11;
                ListItemKt.a(e11, false, u11, v11, null, null, null, null, b11, false, 0.0f, 0.0f, 0.0f, (a) D2, aVar3, 100666752, 0, 7922);
                DividersKt.a(PaddingKt.k(aVar4, h.l(16), 0.0f, 2, null), 0.0f, 0L, aVar3, 6, 6);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }
            d1 l11 = aVar3.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$ChatRow$4
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar5, int i15) {
                        MyAccountSectionKt.a(str, aVar, aVar5, v0.a(i11 | 1));
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
        public static final void b(final a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
            int i12;
            androidx.compose.runtime.a aVar3;
            int i13;
            androidx.compose.runtime.a h11 = aVar2.h(-1473976871);
            if ((i11 & 14) == 0) {
                if (h11.F(aVar)) {
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
                aVar3 = h11;
            } else {
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-1473976871, i12, -1, "com.forsale.app.features.more.newprofile.myaccount.EditProfileRow (MyAccountSection.kt:63)");
                }
                c.a aVar4 = androidx.compose.ui.c.f7566a;
                ComposableSingletons$MyAccountSectionKt composableSingletons$MyAccountSectionKt = ComposableSingletons$MyAccountSectionKt.f32466a;
                q<t, androidx.compose.runtime.a, Integer, p> a11 = composableSingletons$MyAccountSectionKt.a();
                q<t, androidx.compose.runtime.a, Integer, p> l11 = composableSingletons$MyAccountSectionKt.l();
                q<w.c, androidx.compose.runtime.a, Integer, p> q11 = composableSingletons$MyAccountSectionKt.q();
                h11.C(1157296644);
                boolean T = h11.T(aVar);
                Object D = h11.D();
                if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                    D = new a<p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$EditProfileRow$1$1
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
                    h11.u(D);
                }
                h11.S();
                aVar3 = h11;
                ListItemKt.a(aVar4, false, a11, l11, null, null, null, null, q11, false, 0.0f, 0.0f, 0.0f, (a) D, aVar3, 100666758, 0, 7922);
                DividersKt.a(PaddingKt.k(aVar4, h.l(16), 0.0f, 2, null), 0.0f, 0L, aVar3, 6, 6);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }
            d1 l12 = aVar3.l();
            if (l12 != null) {
                l12.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$EditProfileRow$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar5, int i14) {
                        MyAccountSectionKt.b(aVar, aVar5, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                        b(aVar5, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        public static final void c(final NewProfileViewModel viewModel, final UserStatus userState, androidx.compose.runtime.a aVar, final int i11) {
            int i12;
            androidx.compose.runtime.a aVar2;
            o.i(viewModel, "viewModel");
            o.i(userState, "userState");
            androidx.compose.runtime.a h11 = aVar.h(-919354930);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-919354930, i11, -1, "com.forsale.app.features.more.newprofile.myaccount.MyAccountSection (MyAccountSection.kt:33)");
            }
            c.a aVar3 = androidx.compose.ui.c.f7566a;
            androidx.compose.ui.c a11 = IntrinsicKt.a(SizeKt.h(aVar3, 0.0f, 1, null), IntrinsicSize.Min);
            Arrangement.f o11 = Arrangement.f3698a.o(h.l(4));
            h11.C(-483455358);
            a0 a12 = androidx.compose.foundation.layout.e.a(o11, v0.b.f74009a.k(), h11, 6);
            h11.C(-1323940314);
            int a13 = e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            a<ComposeUiNode> a14 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(a11);
            if (!(h11.k() instanceof d)) {
                e.c();
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
            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
            if (a15.f() || !o.d(a15.D(), Integer.valueOf(a13))) {
                a15.u(Integer.valueOf(a13));
                a15.p(Integer.valueOf(a13), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            f fVar = f.f74891a;
            h11.C(1376800566);
            if (userState == UserStatus.LoggedIn) {
                String b12 = g.b(y0.Wc, h11, 0);
                dk.a aVar4 = dk.a.f54291a;
                int i13 = dk.a.f54292b;
                long i14 = aVar4.a(h11, i13).f().i(h11, yj.d.f76453b);
                androidx.compose.ui.text.a0 h12 = aVar4.c(h11, i13).h();
                i12 = 0;
                TextKt.a(b12, PaddingKt.m(aVar3, h.l(16), h.l(12), 0.0f, 0.0f, 12, null), 0, 0, false, 0, 0, null, h12, i14, 0, h11, 48, 0, 1276);
                aVar2 = h11;
                b(new a<p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$MyAccountSection$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
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
                        NewProfileViewModel.this.f0();
                    }
                }, aVar2, 0);
                f(new a<p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$MyAccountSection$1$2
                    /* JADX INFO: Access modifiers changed from: package-private */
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
                        NewProfileViewModel.this.b0();
                    }
                }, aVar2, 0);
                a((String) z.a(viewModel.G(), null, null, aVar2, 56, 2).getValue(), new a<p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$MyAccountSection$1$3
                    /* JADX INFO: Access modifiers changed from: package-private */
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
                        NewProfileViewModel.this.a0();
                    }
                }, aVar2, 0);
                g(new a<p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$MyAccountSection$1$4
                    /* JADX INFO: Access modifiers changed from: package-private */
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
                        NewProfileViewModel.this.e0();
                    }
                }, aVar2, 0);
                d(new a<p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$MyAccountSection$1$5
                    /* JADX INFO: Access modifiers changed from: package-private */
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
                        NewProfileViewModel.this.Q();
                    }
                }, aVar2, 0);
                e(new a<p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$MyAccountSection$1$6
                    /* JADX INFO: Access modifiers changed from: package-private */
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
                        NewProfileViewModel.this.S();
                    }
                }, aVar2, 0);
            } else {
                i12 = 0;
                aVar2 = h11;
            }
            aVar2.S();
            h(new a<p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$MyAccountSection$1$7
                /* JADX INFO: Access modifiers changed from: package-private */
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
                    NewProfileViewModel.this.g0();
                }
            }, aVar2, i12);
            i(new a<p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$MyAccountSection$1$8
                /* JADX INFO: Access modifiers changed from: package-private */
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
                    NewProfileViewModel.this.l0();
                }
            }, aVar2, i12);
            aVar2.S();
            aVar2.w();
            aVar2.S();
            aVar2.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = aVar2.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$MyAccountSection$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar5, int i15) {
                        MyAccountSectionKt.c(NewProfileViewModel.this, userState, aVar5, v0.a(i11 | 1));
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
        public static final void d(final a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
            int i12;
            androidx.compose.runtime.a aVar3;
            int i13;
            androidx.compose.runtime.a h11 = aVar2.h(-1682211675);
            if ((i11 & 14) == 0) {
                if (h11.F(aVar)) {
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
                aVar3 = h11;
            } else {
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-1682211675, i12, -1, "com.forsale.app.features.more.newprofile.myaccount.MyFavoritesRow (MyAccountSection.kt:209)");
                }
                c.a aVar4 = androidx.compose.ui.c.f7566a;
                androidx.compose.ui.c h12 = SizeKt.h(aVar4, 0.0f, 1, null);
                h11.C(1157296644);
                boolean T = h11.T(aVar);
                Object D = h11.D();
                if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                    D = new a<p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$MyFavoritesRow$1$1
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
                    h11.u(D);
                }
                h11.S();
                androidx.compose.ui.c e11 = ClickableKt.e(h12, false, null, null, (a) D, 7, null);
                ComposableSingletons$MyAccountSectionKt composableSingletons$MyAccountSectionKt = ComposableSingletons$MyAccountSectionKt.f32466a;
                q<t, androidx.compose.runtime.a, Integer, p> g11 = composableSingletons$MyAccountSectionKt.g();
                q<t, androidx.compose.runtime.a, Integer, p> h13 = composableSingletons$MyAccountSectionKt.h();
                q<w.c, androidx.compose.runtime.a, Integer, p> i14 = composableSingletons$MyAccountSectionKt.i();
                h11.C(1157296644);
                boolean T2 = h11.T(aVar);
                Object D2 = h11.D();
                if (T2 || D2 == androidx.compose.runtime.a.f7182a.a()) {
                    D2 = new a<p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$MyFavoritesRow$2$1
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
                    h11.u(D2);
                }
                h11.S();
                aVar3 = h11;
                ListItemKt.a(e11, false, g11, h13, null, null, null, null, i14, false, 0.0f, 0.0f, 0.0f, (a) D2, aVar3, 100666752, 0, 7922);
                DividersKt.a(PaddingKt.k(aVar4, h.l(16), 0.0f, 2, null), 0.0f, 0L, aVar3, 6, 6);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }
            d1 l11 = aVar3.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$MyFavoritesRow$3
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar5, int i15) {
                        MyAccountSectionKt.d(aVar, aVar5, v0.a(i11 | 1));
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
        public static final void e(final a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
            int i12;
            androidx.compose.runtime.a aVar3;
            int i13;
            androidx.compose.runtime.a h11 = aVar2.h(1910107750);
            if ((i11 & 14) == 0) {
                if (h11.F(aVar)) {
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
                aVar3 = h11;
            } else {
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(1910107750, i12, -1, "com.forsale.app.features.more.newprofile.myaccount.MyFollowersAndFollowingsRow (MyAccountSection.kt:239)");
                }
                c.a aVar4 = androidx.compose.ui.c.f7566a;
                androidx.compose.ui.c h12 = SizeKt.h(aVar4, 0.0f, 1, null);
                h11.C(1157296644);
                boolean T = h11.T(aVar);
                Object D = h11.D();
                if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                    D = new a<p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$MyFollowersAndFollowingsRow$1$1
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
                    h11.u(D);
                }
                h11.S();
                androidx.compose.ui.c e11 = ClickableKt.e(h12, false, null, null, (a) D, 7, null);
                ComposableSingletons$MyAccountSectionKt composableSingletons$MyAccountSectionKt = ComposableSingletons$MyAccountSectionKt.f32466a;
                q<t, androidx.compose.runtime.a, Integer, p> j11 = composableSingletons$MyAccountSectionKt.j();
                q<t, androidx.compose.runtime.a, Integer, p> k11 = composableSingletons$MyAccountSectionKt.k();
                q<w.c, androidx.compose.runtime.a, Integer, p> m11 = composableSingletons$MyAccountSectionKt.m();
                h11.C(1157296644);
                boolean T2 = h11.T(aVar);
                Object D2 = h11.D();
                if (T2 || D2 == androidx.compose.runtime.a.f7182a.a()) {
                    D2 = new a<p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$MyFollowersAndFollowingsRow$2$1
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
                    h11.u(D2);
                }
                h11.S();
                aVar3 = h11;
                ListItemKt.a(e11, false, j11, k11, null, null, null, null, m11, false, 0.0f, 0.0f, 0.0f, (a) D2, aVar3, 100666752, 0, 7922);
                DividersKt.a(PaddingKt.k(aVar4, h.l(16), 0.0f, 2, null), 0.0f, 0L, aVar3, 6, 6);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }
            d1 l11 = aVar3.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$MyFollowersAndFollowingsRow$3
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar5, int i14) {
                        MyAccountSectionKt.e(aVar, aVar5, v0.a(i11 | 1));
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
        public static final void f(final a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
            int i12;
            androidx.compose.runtime.a aVar3;
            int i13;
            androidx.compose.runtime.a h11 = aVar2.h(1609470738);
            if ((i11 & 14) == 0) {
                if (h11.F(aVar)) {
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
                aVar3 = h11;
            } else {
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(1609470738, i12, -1, "com.forsale.app.features.more.newprofile.myaccount.MyListingRow (MyAccountSection.kt:90)");
                }
                c.a aVar4 = androidx.compose.ui.c.f7566a;
                ComposableSingletons$MyAccountSectionKt composableSingletons$MyAccountSectionKt = ComposableSingletons$MyAccountSectionKt.f32466a;
                q<t, androidx.compose.runtime.a, Integer, p> r11 = composableSingletons$MyAccountSectionKt.r();
                q<t, androidx.compose.runtime.a, Integer, p> s11 = composableSingletons$MyAccountSectionKt.s();
                q<w.c, androidx.compose.runtime.a, Integer, p> t11 = composableSingletons$MyAccountSectionKt.t();
                h11.C(1157296644);
                boolean T = h11.T(aVar);
                Object D = h11.D();
                if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                    D = new a<p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$MyListingRow$1$1
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
                    h11.u(D);
                }
                h11.S();
                aVar3 = h11;
                ListItemKt.a(aVar4, false, r11, s11, null, null, null, null, t11, false, 0.0f, 0.0f, 0.0f, (a) D, aVar3, 100666758, 0, 7922);
                DividersKt.a(PaddingKt.k(aVar4, h.l(16), 0.0f, 2, null), 0.0f, 0L, aVar3, 6, 6);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }
            d1 l11 = aVar3.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$MyListingRow$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar5, int i14) {
                        MyAccountSectionKt.f(aVar, aVar5, v0.a(i11 | 1));
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
        public static final void g(final a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
            int i12;
            androidx.compose.runtime.a aVar3;
            int i13;
            androidx.compose.runtime.a h11 = aVar2.h(1743559188);
            if ((i11 & 14) == 0) {
                if (h11.F(aVar)) {
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
                aVar3 = h11;
            } else {
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(1743559188, i12, -1, "com.forsale.app.features.more.newprofile.myaccount.MyPaymentRow (MyAccountSection.kt:154)");
                }
                c.a aVar4 = androidx.compose.ui.c.f7566a;
                ComposableSingletons$MyAccountSectionKt composableSingletons$MyAccountSectionKt = ComposableSingletons$MyAccountSectionKt.f32466a;
                q<t, androidx.compose.runtime.a, Integer, p> w11 = composableSingletons$MyAccountSectionKt.w();
                q<t, androidx.compose.runtime.a, Integer, p> b11 = composableSingletons$MyAccountSectionKt.b();
                q<w.c, androidx.compose.runtime.a, Integer, p> c11 = composableSingletons$MyAccountSectionKt.c();
                h11.C(1157296644);
                boolean T = h11.T(aVar);
                Object D = h11.D();
                if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                    D = new a<p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$MyPaymentRow$1$1
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
                    h11.u(D);
                }
                h11.S();
                aVar3 = h11;
                ListItemKt.a(aVar4, false, w11, b11, null, null, null, null, c11, false, 0.0f, 0.0f, 0.0f, (a) D, aVar3, 100666758, 0, 7922);
                DividersKt.a(PaddingKt.k(aVar4, h.l(16), 0.0f, 2, null), 0.0f, 0L, aVar3, 6, 6);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }
            d1 l11 = aVar3.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$MyPaymentRow$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar5, int i14) {
                        MyAccountSectionKt.g(aVar, aVar5, v0.a(i11 | 1));
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
        public static final void h(final a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
            int i12;
            androidx.compose.runtime.a aVar3;
            int i13;
            androidx.compose.runtime.a h11 = aVar2.h(476489282);
            if ((i11 & 14) == 0) {
                if (h11.F(aVar)) {
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
                aVar3 = h11;
            } else {
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(476489282, i12, -1, "com.forsale.app.features.more.newprofile.myaccount.RecentlyViewedRow (MyAccountSection.kt:180)");
                }
                c.a aVar4 = androidx.compose.ui.c.f7566a;
                androidx.compose.ui.c h12 = SizeKt.h(aVar4, 0.0f, 1, null);
                h11.C(1157296644);
                boolean T = h11.T(aVar);
                Object D = h11.D();
                if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                    D = new a<p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$RecentlyViewedRow$1$1
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
                    h11.u(D);
                }
                h11.S();
                androidx.compose.ui.c e11 = ClickableKt.e(h12, false, null, null, (a) D, 7, null);
                ComposableSingletons$MyAccountSectionKt composableSingletons$MyAccountSectionKt = ComposableSingletons$MyAccountSectionKt.f32466a;
                q<t, androidx.compose.runtime.a, Integer, p> d11 = composableSingletons$MyAccountSectionKt.d();
                q<t, androidx.compose.runtime.a, Integer, p> e12 = composableSingletons$MyAccountSectionKt.e();
                q<w.c, androidx.compose.runtime.a, Integer, p> f11 = composableSingletons$MyAccountSectionKt.f();
                h11.C(1157296644);
                boolean T2 = h11.T(aVar);
                Object D2 = h11.D();
                if (T2 || D2 == androidx.compose.runtime.a.f7182a.a()) {
                    D2 = new a<p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$RecentlyViewedRow$2$1
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
                    h11.u(D2);
                }
                h11.S();
                aVar3 = h11;
                ListItemKt.a(e11, false, d11, e12, null, null, null, null, f11, false, 0.0f, 0.0f, 0.0f, (a) D2, aVar3, 100666752, 0, 7922);
                DividersKt.a(PaddingKt.k(aVar4, h.l(16), 0.0f, 2, null), 0.0f, 0L, aVar3, 6, 6);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }
            d1 l11 = aVar3.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$RecentlyViewedRow$3
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar5, int i14) {
                        MyAccountSectionKt.h(aVar, aVar5, v0.a(i11 | 1));
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
        public static final void i(final a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
            int i12;
            androidx.compose.runtime.a aVar3;
            int i13;
            androidx.compose.runtime.a h11 = aVar2.h(1765379947);
            if ((i11 & 14) == 0) {
                if (h11.F(aVar)) {
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
                aVar3 = h11;
            } else {
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(1765379947, i12, -1, "com.forsale.app.features.more.newprofile.myaccount.WantedItemsRow (MyAccountSection.kt:268)");
                }
                androidx.compose.ui.c h12 = SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null);
                h11.C(1157296644);
                boolean T = h11.T(aVar);
                Object D = h11.D();
                if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                    D = new a<p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$WantedItemsRow$1$1
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
                    h11.u(D);
                }
                h11.S();
                androidx.compose.ui.c e11 = ClickableKt.e(h12, false, null, null, (a) D, 7, null);
                ComposableSingletons$MyAccountSectionKt composableSingletons$MyAccountSectionKt = ComposableSingletons$MyAccountSectionKt.f32466a;
                q<t, androidx.compose.runtime.a, Integer, p> n11 = composableSingletons$MyAccountSectionKt.n();
                q<t, androidx.compose.runtime.a, Integer, p> o11 = composableSingletons$MyAccountSectionKt.o();
                q<w.c, androidx.compose.runtime.a, Integer, p> p11 = composableSingletons$MyAccountSectionKt.p();
                h11.C(1157296644);
                boolean T2 = h11.T(aVar);
                Object D2 = h11.D();
                if (T2 || D2 == androidx.compose.runtime.a.f7182a.a()) {
                    D2 = new a<p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$WantedItemsRow$2$1
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
                    h11.u(D2);
                }
                h11.S();
                aVar3 = h11;
                ListItemKt.a(e11, false, n11, o11, null, null, null, null, p11, false, 0.0f, 0.0f, 0.0f, (a) D2, aVar3, 100666752, 0, 7922);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }
            d1 l11 = aVar3.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.myaccount.MyAccountSectionKt$WantedItemsRow$3
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar4, int i14) {
                        MyAccountSectionKt.i(aVar, aVar4, v0.a(i11 | 1));
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
