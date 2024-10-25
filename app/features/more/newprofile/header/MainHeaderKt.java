package com.forsale.app.features.more.newprofile.header;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.c;
import androidx.compose.ui.unit.LayoutDirection;
import b1.t1;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.features.auth.UserStatus;
import com.forsale.app.features.auth.views.ClickableTextKt;
import com.forsale.app.features.more.user.profile.NewProfileViewModel;
import com.forsale.app.utils.Languages;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.avatars.AvatarSize;
import com.forsale.designSystem.buttons.ButtonData;
import com.forsale.designSystem.buttons.ButtonsKt;
import com.forsale.designSystem.buttons.IconButtonKt;
import com.forsale.designSystem.buttons.IconButtonShape;
import com.forsale.designSystem.buttons.IconButtonSize;
import com.forsale.designSystem.notificationsystem.InlineAlertKt;
import com.forsale.designSystem.notificationsystem.InlineAlertState;
import com.forsale.ui.components.AvatarsKt;
import com.github.mikephil.charting.utils.Utils;
import e2.h;
import falcon.chat.entities.ExtensionsKt;
import g00.q;
import j0.d;
import j0.d1;
import j0.e1;
import j0.k;
import j0.n1;
import j0.t0;
import j0.v0;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.w;
import kotlin.text.s;
import p1.g;
import t9.q0;
import t9.y0;
import v0.b;
import w.f;
import w.t;
import w.u;
import wz.p;
/* compiled from: MainHeader.kt */
/* loaded from: classes2.dex */
public final class MainHeaderKt {

    /* compiled from: MainHeader.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32465a;

        static {
            int[] iArr = new int[UserStatus.values().length];
            try {
                iArr[UserStatus.LoggedIn.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserStatus.NotLoggedIn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f32465a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final UserEntity userEntity, final String str, final g00.a<p> aVar, final UserStatus userStatus, androidx.compose.runtime.a aVar2, final int i11) {
        androidx.compose.runtime.a h11 = aVar2.h(-1307054566);
        if (c.I()) {
            c.U(-1307054566, i11, -1, "com.forsale.app.features.more.newprofile.header.BlockedUserSection (MainHeader.kt:110)");
        }
        c.a aVar3 = androidx.compose.ui.c.f7566a;
        androidx.compose.ui.c h12 = SizeKt.h(aVar3, 0.0f, 1, null);
        h11.C(-483455358);
        a0 a11 = e.a(Arrangement.f3698a.h(), b.f74009a.k(), h11, 0);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(h12);
        if (!(h11.k() instanceof d)) {
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
        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        k(userEntity, userStatus, str, h11, ((i11 >> 6) & 112) | 8 | ((i11 << 3) & 896));
        float f11 = 16;
        SpacerKt.a(SizeKt.i(aVar3, h.l(f11)), h11, 6);
        InlineAlertKt.a(null, new InlineAlertState.a(null, 1, null), ComposableSingletons$MainHeaderKt.f32393a.a(), null, r0.b.b(h11, -2041157084, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.header.MainHeaderKt$BlockedUserSection$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(a aVar4, int i12) {
                if ((i12 & 11) == 2 && aVar4.i()) {
                    aVar4.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-2041157084, i12, -1, "com.forsale.app.features.more.newprofile.header.BlockedUserSection.<anonymous>.<anonymous> (MainHeader.kt:120)");
                }
                final UserEntity userEntity2 = UserEntity.this;
                aVar4.C(-483455358);
                c.a aVar5 = androidx.compose.ui.c.f7566a;
                a0 a15 = e.a(Arrangement.f3698a.h(), b.f74009a.k(), aVar4, 0);
                aVar4.C(-1323940314);
                int a16 = j0.e.a(aVar4, 0);
                k s12 = aVar4.s();
                ComposeUiNode.Companion companion2 = ComposeUiNode.f8256m;
                g00.a<ComposeUiNode> a17 = companion2.a();
                q<e1<ComposeUiNode>, a, Integer, p> c12 = LayoutKt.c(aVar5);
                if (!(aVar4.k() instanceof d)) {
                    j0.e.c();
                }
                aVar4.I();
                if (aVar4.f()) {
                    aVar4.y(a17);
                } else {
                    aVar4.t();
                }
                a a18 = Updater.a(aVar4);
                Updater.c(a18, a15, companion2.e());
                Updater.c(a18, s12, companion2.g());
                g00.p<ComposeUiNode, Integer, p> b12 = companion2.b();
                if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
                    a18.u(Integer.valueOf(a16));
                    a18.p(Integer.valueOf(a16), b12);
                }
                c12.invoke(e1.a(e1.b(aVar4)), aVar4, 0);
                aVar4.C(2058660585);
                f fVar2 = f.f74891a;
                String b13 = g.b(y0.Yc, aVar4, 0);
                dk.a aVar6 = dk.a.f54291a;
                int i13 = dk.a.f54292b;
                TextKt.a(b13, null, 0, 0, false, 0, 0, null, aVar6.c(aVar4, i13).d(), aVar6.a(aVar4, i13).e().m(aVar4, yj.d.f76453b), 0, aVar4, 0, 0, 1278);
                CompositionLocalKt.a(CompositionLocalsKt.j().c(LayoutDirection.Ltr), r0.b.b(aVar4, 67411630, true, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0124: INVOKE  
                      (wrap: j0.t0<androidx.compose.ui.unit.LayoutDirection> : 0x0109: INVOKE  (r0v9 j0.t0<androidx.compose.ui.unit.LayoutDirection> A[REMOVE]) = 
                      (wrap: j0.s0<androidx.compose.ui.unit.LayoutDirection> : 0x0103: INVOKE  (r0v8 j0.s0<androidx.compose.ui.unit.LayoutDirection> A[REMOVE]) =  type: STATIC call: androidx.compose.ui.platform.CompositionLocalsKt.j():j0.s0)
                      (wrap: androidx.compose.ui.unit.LayoutDirection : 0x0107: SGET  (r1v10 androidx.compose.ui.unit.LayoutDirection A[REMOVE]) =  androidx.compose.ui.unit.LayoutDirection.Ltr androidx.compose.ui.unit.LayoutDirection)
                     type: VIRTUAL call: j0.s0.c(java.lang.Object):j0.t0)
                      (wrap: r0.a : 0x011a: INVOKE  (r1v12 r0.a A[REMOVE]) = 
                      (r23v0 'aVar4' androidx.compose.runtime.a)
                      (67411630 int)
                      true
                      (wrap: g00.p<androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x0111: CONSTRUCTOR  (r1v11 g00.p<androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = (r13v0 'userEntity2' com.forsale.app.datalayer.database.UserEntity A[DONT_INLINE]) call: com.forsale.app.features.more.newprofile.header.MainHeaderKt$BlockedUserSection$1$1$1$1.<init>(com.forsale.app.datalayer.database.UserEntity):void type: CONSTRUCTOR)
                     type: STATIC call: r0.b.b(androidx.compose.runtime.a, int, boolean, java.lang.Object):r0.a)
                      (r23v0 'aVar4' androidx.compose.runtime.a)
                      (wrap: int : 0x0122: ARITH  (r2v12 int A[REMOVE]) = (wrap: int : 0x0120: ARITH  (r2v11 int A[REMOVE]) = (wrap: int : 0x011e: SGET  (r2v10 int A[REMOVE]) =  j0.t0.d int) | (0 int)) | (48 int))
                     type: STATIC call: androidx.compose.runtime.CompositionLocalKt.a(j0.t0, g00.p, androidx.compose.runtime.a, int):void in method: com.forsale.app.features.more.newprofile.header.MainHeaderKt$BlockedUserSection$1$1.b(androidx.compose.runtime.a, int):void, file: classes2.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.more.newprofile.header.MainHeaderKt$BlockedUserSection$1$1$1$1, state: NOT_LOADED
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
                    	... 19 more
                    */
                /*
                    Method dump skipped, instructions count: 317
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.newprofile.header.MainHeaderKt$BlockedUserSection$1$1.b(androidx.compose.runtime.a, int):void");
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                b(aVar4, num.intValue());
                return p.f75480a;
            }
        }), r0.b.b(h11, -330506237, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.header.MainHeaderKt$BlockedUserSection$1$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v0, types: [androidx.compose.runtime.a] */
            /* JADX WARN: Type inference failed for: r1v3 */
            public final void b(a aVar4, int i12) {
                if ((i12 & 11) == 2 && aVar4.i()) {
                    aVar4.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-330506237, i12, -1, "com.forsale.app.features.more.newprofile.header.BlockedUserSection.<anonymous>.<anonymous> (MainHeader.kt:134)");
                }
                ButtonData c12 = ButtonData.f40994a.c();
                final g00.a<p> aVar5 = aVar;
                aVar4.C(1157296644);
                boolean T = aVar4.T(aVar5);
                Object D = aVar4.D();
                if (T || D == a.f7182a.a()) {
                    D = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0041: CONSTRUCTOR  (r1v2 'D' java.lang.Object) = (r12v2 'aVar5' g00.a<wz.p> A[DONT_INLINE]) call: com.forsale.app.features.more.newprofile.header.MainHeaderKt$BlockedUserSection$1$2$1$1.<init>(g00.a):void type: CONSTRUCTOR in method: com.forsale.app.features.more.newprofile.header.MainHeaderKt$BlockedUserSection$1$2.b(androidx.compose.runtime.a, int):void, file: classes2.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.more.newprofile.header.MainHeaderKt$BlockedUserSection$1$2$1$1, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                        	... 25 more
                        */
                    /*
                        this = this;
                        r0 = r12 & 11
                        r1 = 2
                        if (r0 != r1) goto L10
                        boolean r0 = r11.i()
                        if (r0 != 0) goto Lc
                        goto L10
                    Lc:
                        r11.L()
                        goto L6f
                    L10:
                        boolean r0 = androidx.compose.runtime.c.I()
                        if (r0 == 0) goto L1f
                        r0 = -1
                        java.lang.String r1 = "com.forsale.app.features.more.newprofile.header.BlockedUserSection.<anonymous>.<anonymous> (MainHeader.kt:134)"
                        r2 = -330506237(0xffffffffec4ce003, float:-9.907149E26)
                        androidx.compose.runtime.c.U(r2, r12, r0, r1)
                    L1f:
                        com.forsale.designSystem.buttons.ButtonData$a r12 = com.forsale.designSystem.buttons.ButtonData.f40994a
                        com.forsale.designSystem.buttons.ButtonData r2 = r12.c()
                        g00.a<wz.p> r12 = r1
                        r0 = 1157296644(0x44faf204, float:2007.563)
                        r11.C(r0)
                        boolean r0 = r11.T(r12)
                        java.lang.Object r1 = r11.D()
                        if (r0 != 0) goto L3f
                        androidx.compose.runtime.a$a r0 = androidx.compose.runtime.a.f7182a
                        java.lang.Object r0 = r0.a()
                        if (r1 != r0) goto L47
                    L3f:
                        com.forsale.app.features.more.newprofile.header.MainHeaderKt$BlockedUserSection$1$2$1$1 r1 = new com.forsale.app.features.more.newprofile.header.MainHeaderKt$BlockedUserSection$1$2$1$1
                        r1.<init>(r12)
                        r11.u(r1)
                    L47:
                        r11.S()
                        r0 = r1
                        g00.a r0 = (g00.a) r0
                        r1 = 0
                        r3 = 0
                        r4 = 1
                        r5 = 0
                        com.forsale.app.features.more.newprofile.header.ComposableSingletons$MainHeaderKt r12 = com.forsale.app.features.more.newprofile.header.ComposableSingletons$MainHeaderKt.f32393a
                        g00.q r6 = r12.b()
                        int r12 = com.forsale.designSystem.buttons.ButtonData.f40995b
                        int r12 = r12 << 6
                        r7 = 1597440(0x186000, float:2.23849E-39)
                        r8 = r12 | r7
                        r9 = 42
                        r7 = r11
                        com.forsale.designSystem.buttons.ButtonsKt.k(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                        boolean r11 = androidx.compose.runtime.c.I()
                        if (r11 == 0) goto L6f
                        androidx.compose.runtime.c.T()
                    L6f:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.newprofile.header.MainHeaderKt$BlockedUserSection$1$2.b(androidx.compose.runtime.a, int):void");
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            }), null, null, h11, (InlineAlertState.a.f41955c << 3) | 221568, 201);
            SpacerKt.a(SizeKt.i(aVar3, h.l(f11)), h11, 6);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.header.MainHeaderKt$BlockedUserSection$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(a aVar4, int i12) {
                        MainHeaderKt.a(UserEntity.this, str, aVar, userStatus, aVar4, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                        b(aVar4, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(final UserEntity userEntity, androidx.compose.runtime.a aVar, final int i11) {
            androidx.compose.runtime.a h11 = aVar.h(-607254328);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-607254328, i11, -1, "com.forsale.app.features.more.newprofile.header.LoggedInAvatar (MainHeader.kt:362)");
            }
            if (ExtensionsKt.isNullOrEmpty(userEntity.getImage())) {
                h11.C(-1843771817);
                AvatarSize avatarSize = AvatarSize.SIZE_48;
                String firstName = userEntity.getFirstName();
                if (firstName == null) {
                    firstName = "";
                }
                AvatarsKt.c(null, firstName, new g00.a<p>() { // from class: com.forsale.app.features.more.newprofile.header.MainHeaderKt$LoggedInAvatar$1
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ p invoke() {
                        invoke2();
                        return p.f75480a;
                    }
                }, false, null, avatarSize, h11, 196992, 25);
                h11.S();
            } else {
                h11.C(-1843771678);
                AvatarsKt.a(null, h5.d.a(userEntity.getImage(), null, null, null, 0, h11, 0, 30), new g00.a<p>() { // from class: com.forsale.app.features.more.newprofile.header.MainHeaderKt$LoggedInAvatar$2
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ p invoke() {
                        invoke2();
                        return p.f75480a;
                    }
                }, false, null, AvatarSize.SIZE_48, h11, 196992, 25);
                h11.S();
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.header.MainHeaderKt$LoggedInAvatar$3
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(a aVar2, int i12) {
                        MainHeaderKt.b(UserEntity.this, aVar2, v0.a(i11 | 1));
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
        public static final void c(final UserEntity userEntity, final UserStatus userStatus, final String str, final String str2, final g00.a<p> aVar, final g00.a<p> aVar2, androidx.compose.runtime.a aVar3, final int i11) {
            androidx.compose.runtime.a h11 = aVar3.h(177778203);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(177778203, i11, -1, "com.forsale.app.features.more.newprofile.header.LoggedInSection (MainHeader.kt:155)");
            }
            c.a aVar4 = androidx.compose.ui.c.f7566a;
            androidx.compose.ui.c h12 = SizeKt.h(aVar4, 0.0f, 1, null);
            h11.C(-483455358);
            a0 a11 = e.a(Arrangement.f3698a.h(), b.f74009a.k(), h11, 0);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(h12);
            if (!(h11.k() instanceof d)) {
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
            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            f fVar = f.f74891a;
            int i12 = i11 >> 3;
            k(userEntity, userStatus, str2, h11, (i11 & 112) | 8 | (i12 & 896));
            float f11 = 16;
            SpacerKt.a(SizeKt.i(aVar4, h.l(f11)), h11, 6);
            h11.C(1157296644);
            boolean T = h11.T(aVar);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new g00.a<p>() { // from class: com.forsale.app.features.more.newprofile.header.MainHeaderKt$LoggedInSection$1$1$1
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
            g00.a aVar5 = (g00.a) D;
            h11.C(1157296644);
            boolean T2 = h11.T(aVar2);
            Object D2 = h11.D();
            if (T2 || D2 == androidx.compose.runtime.a.f7182a.a()) {
                D2 = new g00.a<p>() { // from class: com.forsale.app.features.more.newprofile.header.MainHeaderKt$LoggedInSection$1$2$1
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
                        aVar2.invoke();
                    }
                };
                h11.u(D2);
            }
            h11.S();
            e(userEntity, str, aVar5, (g00.a) D2, h11, (i12 & 112) | 8);
            SpacerKt.a(SizeKt.i(aVar4, h.l(f11)), h11, 6);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.header.MainHeaderKt$LoggedInSection$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(a aVar6, int i13) {
                        MainHeaderKt.c(UserEntity.this, userStatus, str, str2, aVar, aVar2, aVar6, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(a aVar6, Integer num) {
                        b(aVar6, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        public static final void d(final NewProfileViewModel viewModel, final UserStatus userState, androidx.compose.runtime.a aVar, final int i11) {
            o.i(viewModel, "viewModel");
            o.i(userState, "userState");
            androidx.compose.runtime.a h11 = aVar.h(834155202);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(834155202, i11, -1, "com.forsale.app.features.more.newprofile.header.MainHeader (MainHeader.kt:56)");
            }
            androidx.compose.ui.c a11 = IntrinsicKt.a(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), IntrinsicSize.Min);
            h11.C(-483455358);
            a0 a12 = e.a(Arrangement.f3698a.h(), b.f74009a.k(), h11, 0);
            h11.C(-1323940314);
            int a13 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a14 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(a11);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
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
            g(viewModel, userState, h11, (i11 & 112) | 8);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.header.MainHeaderKt$MainHeader$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(a aVar2, int i12) {
                        MainHeaderKt.d(NewProfileViewModel.this, userState, aVar2, v0.a(i11 | 1));
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
        public static final void e(final UserEntity userEntity, final String str, final g00.a<p> aVar, final g00.a<p> aVar2, androidx.compose.runtime.a aVar3, final int i11) {
            final float f11;
            Object valueOf;
            String C;
            boolean z11;
            int i12;
            int i13;
            Float freeAds;
            androidx.compose.runtime.a h11 = aVar3.h(216081936);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(216081936, i11, -1, "com.forsale.app.features.more.newprofile.header.MyWalletDesign (MainHeader.kt:165)");
            }
            if (userEntity != null && (freeAds = userEntity.getFreeAds()) != null) {
                f11 = freeAds.floatValue();
            } else {
                f11 = 0.0f;
            }
            c.a aVar4 = androidx.compose.ui.c.f7566a;
            androidx.compose.ui.c w11 = SizeKt.w(SizeKt.h(aVar4, 0.0f, 1, null), null, false, 3, null);
            dk.a aVar5 = dk.a.f54291a;
            int i14 = dk.a.f54292b;
            yj.d e11 = aVar5.a(h11, i14).e();
            int i15 = yj.d.f76453b;
            float f12 = 8;
            androidx.compose.ui.c a11 = BackgroundKt.a(w11, e11.m(h11, i15), c0.g.c(h.l(f12)));
            h11.C(-483455358);
            Arrangement arrangement = Arrangement.f3698a;
            Arrangement.m h12 = arrangement.h();
            b.a aVar6 = b.f74009a;
            a0 a12 = e.a(h12, aVar6.k(), h11, 0);
            h11.C(-1323940314);
            int a13 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a14 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(a11);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
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
            androidx.compose.ui.c h13 = SizeKt.h(aVar4, 0.0f, 1, null);
            h11.C(693286680);
            a0 a16 = androidx.compose.foundation.layout.o.a(arrangement.g(), aVar6.l(), h11, 0);
            h11.C(-1323940314);
            int a17 = j0.e.a(h11, 0);
            k s12 = h11.s();
            g00.a<ComposeUiNode> a18 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(h13);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a18);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a19 = Updater.a(h11);
            Updater.c(a19, a16, companion.e());
            Updater.c(a19, s12, companion.g());
            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
            if (a19.f() || !o.d(a19.D(), Integer.valueOf(a17))) {
                a19.u(Integer.valueOf(a17));
                a19.p(Integer.valueOf(a17), b12);
            }
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            float f13 = 16;
            androidx.compose.ui.c d11 = t.d(uVar, PaddingKt.m(aVar4, h.l(f13), 0.0f, h.l(f12), 0.0f, 10, null), 3.0f, false, 2, null);
            h11.C(-483455358);
            a0 a21 = e.a(arrangement.h(), aVar6.k(), h11, 0);
            h11.C(-1323940314);
            int a22 = j0.e.a(h11, 0);
            k s13 = h11.s();
            g00.a<ComposeUiNode> a23 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c13 = LayoutKt.c(d11);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a23);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a24 = Updater.a(h11);
            Updater.c(a24, a21, companion.e());
            Updater.c(a24, s13, companion.g());
            g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
            if (a24.f() || !o.d(a24.D(), Integer.valueOf(a22))) {
                a24.u(Integer.valueOf(a22));
                a24.p(Integer.valueOf(a22), b13);
            }
            c13.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            float f14 = 12;
            float f15 = 4;
            androidx.compose.ui.c m11 = PaddingKt.m(aVar4, 0.0f, h.l(f14), h.l(f15), 0.0f, 9, null);
            String b14 = g.b(y0.f70542kd, h11, 0);
            t1.a aVar7 = t1.f15974b;
            TextKt.a(b14, m11, 0, 0, false, 0, 0, null, aVar5.c(h11, i14).h(), aVar7.f(), 0, h11, 805306416, 0, 1276);
            androidx.compose.ui.text.a0 j11 = aVar5.c(h11, i14).j();
            h11.C(219383449);
            c.a aVar8 = new c.a(0, 1, null);
            h11.C(219383496);
            int l11 = aVar8.l(androidx.compose.ui.text.u.b(aVar5.c(h11, i14).j().M(), aVar7.f(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
            try {
                w wVar = w.f61809a;
                Locale locale = new Locale(Languages.Companion.b().getValue());
                String b15 = g.b(y0.f70559ld, h11, 0);
                Object[] objArr = new Object[2];
                if (userEntity == null || (valueOf = userEntity.getPremiumAds()) == null) {
                    valueOf = Double.valueOf((double) Utils.DOUBLE_EPSILON);
                }
                objArr[0] = valueOf;
                objArr[1] = 0;
                String format = String.format(locale, b15, Arrays.copyOf(objArr, 2));
                o.h(format, "format(...)");
                C = s.C(format, "٫", ".", false, 4, null);
                aVar8.h(C);
                p pVar = p.f75480a;
                aVar8.j(l11);
                h11.S();
                aVar8.h(" ");
                l11 = aVar8.l(androidx.compose.ui.text.u.b(aVar5.c(h11, i14).h().M(), aVar7.f(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                try {
                    aVar8.h(str);
                    aVar8.j(l11);
                    androidx.compose.ui.text.c m12 = aVar8.m();
                    h11.S();
                    TextKt.b(m12, null, 0L, 0, 0, false, 0, 0, null, null, j11, h11, 0, 0, 1022);
                    h11.C(-1576901333);
                    if (f11 == 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        i13 = 1;
                        i12 = 0;
                        CompositionLocalKt.a(CompositionLocalsKt.j().c(LayoutDirection.Ltr), r0.b.b(h11, 1711165445, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.header.MainHeaderKt$MyWalletDesign$1$1$1$2
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void b(a aVar9, int i16) {
                                String C2;
                                if ((i16 & 11) == 2 && aVar9.i()) {
                                    aVar9.L();
                                    return;
                                }
                                if (androidx.compose.runtime.c.I()) {
                                    androidx.compose.runtime.c.U(1711165445, i16, -1, "com.forsale.app.features.more.newprofile.header.MyWalletDesign.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainHeader.kt:218)");
                                }
                                w wVar2 = w.f61809a;
                                String format2 = String.format(new Locale(Languages.Companion.b().getValue()), g.b(y0.f70525jd, aVar9, 0), Arrays.copyOf(new Object[]{Float.valueOf(f11), str}, 2));
                                o.h(format2, "format(...)");
                                C2 = s.C(format2, "٫", ".", false, 4, null);
                                dk.a aVar10 = dk.a.f54291a;
                                int i17 = dk.a.f54292b;
                                TextKt.a(C2, null, 0, 0, false, 0, 0, null, aVar10.c(aVar9, i17).r(), aVar10.a(aVar9, i17).h().f(aVar9, yj.d.f76453b), 0, aVar9, 0, 0, 1278);
                                if (androidx.compose.runtime.c.I()) {
                                    androidx.compose.runtime.c.T();
                                }
                            }

                            @Override // g00.p
                            public /* bridge */ /* synthetic */ p invoke(a aVar9, Integer num) {
                                b(aVar9, num.intValue());
                                return p.f75480a;
                            }
                        }), h11, t0.f59917d | 0 | 48);
                    } else {
                        i12 = 0;
                        i13 = 1;
                    }
                    h11.S();
                    h11.S();
                    h11.w();
                    h11.S();
                    h11.S();
                    androidx.compose.ui.c c14 = uVar.c(PaddingKt.i(aVar4, h.l(f15)), aVar6.l());
                    h11.C(-483455358);
                    a0 a25 = e.a(arrangement.h(), aVar6.k(), h11, i12);
                    h11.C(-1323940314);
                    int a26 = j0.e.a(h11, i12);
                    k s14 = h11.s();
                    g00.a<ComposeUiNode> a27 = companion.a();
                    q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c15 = LayoutKt.c(c14);
                    if (!(h11.k() instanceof d)) {
                        j0.e.c();
                    }
                    h11.I();
                    if (h11.f()) {
                        h11.y(a27);
                    } else {
                        h11.t();
                    }
                    androidx.compose.runtime.a a28 = Updater.a(h11);
                    Updater.c(a28, a25, companion.e());
                    Updater.c(a28, s14, companion.g());
                    g00.p<ComposeUiNode, Integer, p> b16 = companion.b();
                    if (a28.f() || !o.d(a28.D(), Integer.valueOf(a26))) {
                        a28.u(Integer.valueOf(a26));
                        a28.p(Integer.valueOf(a26), b16);
                    }
                    c15.invoke(e1.a(e1.b(h11)), h11, Integer.valueOf(i12));
                    h11.C(2058660585);
                    IconButtonKt.c(aVar2, p1.e.d(q0.B2, h11, i12), IconButtonShape.Circle, IconButtonSize.Large, null, false, null, t1.g(aVar5.a(h11, i14).g().c(h11, i15)), h11, ((i11 >> 9) & 14) | 3520, 112);
                    h11.S();
                    h11.w();
                    h11.S();
                    h11.S();
                    h11.S();
                    h11.w();
                    h11.S();
                    h11.S();
                    ButtonData c16 = ButtonData.f40994a.c();
                    float f16 = 10;
                    androidx.compose.ui.c l12 = PaddingKt.l(SizeKt.h(aVar4, 0.0f, i13, null), h.l(f14), h.l(f16), h.l(f13), h.l(f16));
                    h11.C(1157296644);
                    boolean T = h11.T(aVar);
                    Object D = h11.D();
                    if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                        D = new g00.a<p>() { // from class: com.forsale.app.features.more.newprofile.header.MainHeaderKt$MyWalletDesign$1$2$1
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
                    ButtonsKt.d((g00.a) D, l12, c16, null, null, null, null, false, null, null, ComposableSingletons$MainHeaderKt.f32393a.c(), h11, (ButtonData.f40995b << 6) | 48, 6, 1016);
                    h11.S();
                    h11.w();
                    h11.S();
                    h11.S();
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                    d1 l13 = h11.l();
                    if (l13 != null) {
                        l13.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.header.MainHeaderKt$MyWalletDesign$2
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void b(a aVar9, int i16) {
                                MainHeaderKt.e(UserEntity.this, str, aVar, aVar2, aVar9, v0.a(i11 | 1));
                            }

                            @Override // g00.p
                            public /* bridge */ /* synthetic */ p invoke(a aVar9, Integer num) {
                                b(aVar9, num.intValue());
                                return p.f75480a;
                            }
                        });
                    }
                } finally {
                }
            } finally {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(final UserEntity userEntity, final String str, final UserStatus userStatus, final g00.a<p> aVar, final g00.a<p> aVar2, androidx.compose.runtime.a aVar3, final int i11) {
            androidx.compose.runtime.a h11 = aVar3.h(-1606246303);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1606246303, i11, -1, "com.forsale.app.features.more.newprofile.header.NotLoggedInSection (MainHeader.kt:268)");
            }
            h11.C(-483455358);
            c.a aVar4 = androidx.compose.ui.c.f7566a;
            Arrangement arrangement = Arrangement.f3698a;
            Arrangement.m h12 = arrangement.h();
            b.a aVar5 = b.f74009a;
            a0 a11 = e.a(h12, aVar5.k(), h11, 0);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar4);
            if (!(h11.k() instanceof d)) {
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
            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            f fVar = f.f74891a;
            k(userEntity, userStatus, str, h11, ((i11 >> 3) & 112) | 8 | ((i11 << 3) & 896));
            androidx.compose.ui.c m11 = PaddingKt.m(SizeKt.h(aVar4, 0.0f, 1, null), 0.0f, h.l(16), 0.0f, 0.0f, 13, null);
            h11.C(-483455358);
            a0 a15 = e.a(arrangement.h(), aVar5.k(), h11, 0);
            h11.C(-1323940314);
            int a16 = j0.e.a(h11, 0);
            k s12 = h11.s();
            g00.a<ComposeUiNode> a17 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(m11);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a17);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a18 = Updater.a(h11);
            Updater.c(a18, a15, companion.e());
            Updater.c(a18, s12, companion.g());
            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
            if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
                a18.u(Integer.valueOf(a16));
                a18.p(Integer.valueOf(a16), b12);
            }
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            androidx.compose.ui.c i12 = SizeKt.i(SizeKt.h(aVar4, 0.0f, 1, null), h.l(48));
            h11.C(1157296644);
            boolean T = h11.T(aVar);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new g00.a<p>() { // from class: com.forsale.app.features.more.newprofile.header.MainHeaderKt$NotLoggedInSection$1$1$1$1
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
            ButtonsKt.j((g00.a) D, i12, null, null, false, false, null, ComposableSingletons$MainHeaderKt.f32393a.d(), h11, 12582960, 124);
            SpacerKt.a(PaddingKt.i(aVar4, h.l(8)), h11, 6);
            androidx.compose.ui.c i13 = SizeKt.i(fVar.b(aVar4, aVar5.g()), h.l(40));
            h11.C(693286680);
            a0 a19 = androidx.compose.foundation.layout.o.a(arrangement.g(), aVar5.l(), h11, 0);
            h11.C(-1323940314);
            int a21 = j0.e.a(h11, 0);
            k s13 = h11.s();
            g00.a<ComposeUiNode> a22 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c13 = LayoutKt.c(i13);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a22);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a23 = Updater.a(h11);
            Updater.c(a23, a19, companion.e());
            Updater.c(a23, s13, companion.g());
            g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
            if (a23.f() || !o.d(a23.D(), Integer.valueOf(a21))) {
                a23.u(Integer.valueOf(a21));
                a23.p(Integer.valueOf(a21), b13);
            }
            c13.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            TextKt.a(g.b(y0.f70631q0, h11, 0), PaddingKt.m(aVar4, 0.0f, 0.0f, h.l(4), 0.0f, 11, null), 0, 0, false, 0, 0, null, dk.a.f54291a.c(h11, dk.a.f54292b).c(), 0L, 0, h11, 48, 0, 1788);
            int i14 = y0.A0;
            h11.C(1157296644);
            boolean T2 = h11.T(aVar2);
            Object D2 = h11.D();
            if (T2 || D2 == androidx.compose.runtime.a.f7182a.a()) {
                D2 = new g00.a<p>() { // from class: com.forsale.app.features.more.newprofile.header.MainHeaderKt$NotLoggedInSection$1$1$2$1$1
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
                        aVar2.invoke();
                    }
                };
                h11.u(D2);
            }
            h11.S();
            ClickableTextKt.a(null, i14, (g00.a) D2, h11, 0, 1);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
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
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.header.MainHeaderKt$NotLoggedInSection$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(a aVar6, int i15) {
                        MainHeaderKt.f(UserEntity.this, str, userStatus, aVar, aVar2, aVar6, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(a aVar6, Integer num) {
                        b(aVar6, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        public static final void g(final NewProfileViewModel viewModel, final UserStatus userState, androidx.compose.runtime.a aVar, final int i11) {
            o.i(viewModel, "viewModel");
            o.i(userState, "userState");
            androidx.compose.runtime.a h11 = aVar.h(-1944056851);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1944056851, i11, -1, "com.forsale.app.features.more.newprofile.header.ProfileSections (MainHeader.kt:65)");
            }
            androidx.compose.ui.c f11 = SizeKt.f(androidx.compose.ui.c.f7566a, 0.0f, 1, null);
            h11.C(-483455358);
            a0 a11 = e.a(Arrangement.f3698a.h(), b.f74009a.k(), h11, 0);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(f11);
            if (!(h11.k() instanceof d)) {
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
            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            f fVar = f.f74891a;
            i(viewModel, userState, h11, (i11 & 112) | 8);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.header.MainHeaderKt$ProfileSections$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(a aVar2, int i12) {
                        MainHeaderKt.g(NewProfileViewModel.this, userState, aVar2, v0.a(i11 | 1));
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
        public static final void h(final UserEntity userEntity, final UserStatus userStatus, androidx.compose.runtime.a aVar, final int i11) {
            androidx.compose.runtime.a h11 = aVar.h(-1219634693);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1219634693, i11, -1, "com.forsale.app.features.more.newprofile.header.SetupAvatar (MainHeader.kt:347)");
            }
            if (a.f32465a[userStatus.ordinal()] == 2) {
                h11.C(100777967);
                AvatarsKt.b(null, new g00.a<p>() { // from class: com.forsale.app.features.more.newprofile.header.MainHeaderKt$SetupAvatar$1
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ p invoke() {
                        invoke2();
                        return p.f75480a;
                    }
                }, false, null, AvatarSize.SIZE_48, h11, 24624, 13);
                h11.S();
            } else {
                h11.C(100778108);
                b(userEntity, h11, 8);
                h11.S();
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.header.MainHeaderKt$SetupAvatar$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(a aVar2, int i12) {
                        MainHeaderKt.h(UserEntity.this, userStatus, aVar2, v0.a(i11 | 1));
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
        public static final void i(final NewProfileViewModel newProfileViewModel, final UserStatus userStatus, androidx.compose.runtime.a aVar, final int i11) {
            androidx.compose.runtime.a h11 = aVar.h(1710574431);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1710574431, i11, -1, "com.forsale.app.features.more.newprofile.header.SetupUIByUserStatus (MainHeader.kt:72)");
            }
            UserEntity j11 = j(z.a(newProfileViewModel.H(), null, null, h11, 56, 2));
            if (j11 != null) {
                float f11 = 16;
                androidx.compose.ui.c m11 = PaddingKt.m(androidx.compose.ui.c.f7566a, h.l(f11), 0.0f, h.l(f11), 0.0f, 10, null);
                h11.C(733328855);
                a0 g11 = BoxKt.g(b.f74009a.o(), false, h11, 0);
                h11.C(-1323940314);
                int a11 = j0.e.a(h11, 0);
                k s11 = h11.s();
                ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                g00.a<ComposeUiNode> a12 = companion.a();
                q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(m11);
                if (!(h11.k() instanceof d)) {
                    j0.e.c();
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
                int i12 = a.f32465a[userStatus.ordinal()];
                if (i12 != 1) {
                    if (i12 != 2) {
                        h11.C(1632150488);
                        a(j11, newProfileViewModel.D(), new g00.a<p>() { // from class: com.forsale.app.features.more.newprofile.header.MainHeaderKt$SetupUIByUserStatus$1$1$5
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
                                NewProfileViewModel.this.c0();
                            }
                        }, userStatus, h11, ((i11 << 6) & 7168) | 8);
                        h11.S();
                    } else {
                        h11.C(1632150157);
                        f(j11, newProfileViewModel.D(), userStatus, new g00.a<p>() { // from class: com.forsale.app.features.more.newprofile.header.MainHeaderKt$SetupUIByUserStatus$1$1$3
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
                                NewProfileViewModel.this.Z();
                            }
                        }, new g00.a<p>() { // from class: com.forsale.app.features.more.newprofile.header.MainHeaderKt$SetupUIByUserStatus$1$1$4
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
                                NewProfileViewModel.this.h0();
                            }
                        }, h11, ((i11 << 3) & 896) | 8);
                        h11.S();
                    }
                } else {
                    h11.C(1632149633);
                    RegionEntity regionEntity = (RegionEntity) z.a(newProfileViewModel.z(), null, null, h11, 56, 2).getValue();
                    c(j11, userStatus, (regionEntity == null || (r1 = regionEntity.getCurrency()) == null) ? "" : "", newProfileViewModel.D(), new g00.a<p>() { // from class: com.forsale.app.features.more.newprofile.header.MainHeaderKt$SetupUIByUserStatus$1$1$1
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
                            NewProfileViewModel.this.N();
                        }
                    }, new g00.a<p>() { // from class: com.forsale.app.features.more.newprofile.header.MainHeaderKt$SetupUIByUserStatus$1$1$2
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
                            NewProfileViewModel.this.V();
                        }
                    }, h11, (i11 & 112) | 8);
                    h11.S();
                }
                h11.S();
                h11.w();
                h11.S();
                h11.S();
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.header.MainHeaderKt$SetupUIByUserStatus$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(a aVar2, int i13) {
                        MainHeaderKt.i(NewProfileViewModel.this, userStatus, aVar2, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        private static final UserEntity j(n1<UserEntity> n1Var) {
            return n1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(final UserEntity userEntity, final UserStatus userStatus, final String str, androidx.compose.runtime.a aVar, final int i11) {
            String str2;
            boolean z11;
            String str3;
            androidx.compose.runtime.a aVar2;
            androidx.compose.runtime.a h11 = aVar.h(-765299545);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-765299545, i11, -1, "com.forsale.app.features.more.newprofile.header.UserData (MainHeader.kt:315)");
            }
            c.a aVar3 = androidx.compose.ui.c.f7566a;
            androidx.compose.ui.c h12 = SizeKt.h(aVar3, 0.0f, 1, null);
            b.a aVar4 = b.f74009a;
            b.c i12 = aVar4.i();
            h11.C(693286680);
            Arrangement arrangement = Arrangement.f3698a;
            a0 a11 = androidx.compose.foundation.layout.o.a(arrangement.g(), i12, h11, 48);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(h12);
            if (!(h11.k() instanceof d)) {
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
            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            h(userEntity, userStatus, h11, (i11 & 112) | 8);
            float f11 = 8;
            androidx.compose.ui.c m11 = PaddingKt.m(aVar3, h.l(f11), 0.0f, h.l(f11), 0.0f, 10, null);
            h11.C(-483455358);
            a0 a15 = e.a(arrangement.h(), aVar4.k(), h11, 0);
            h11.C(-1323940314);
            int a16 = j0.e.a(h11, 0);
            k s12 = h11.s();
            g00.a<ComposeUiNode> a17 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(m11);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a17);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a18 = Updater.a(h11);
            Updater.c(a18, a15, companion.e());
            Updater.c(a18, s12, companion.g());
            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
            if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
                a18.u(Integer.valueOf(a16));
                a18.p(Integer.valueOf(a16), b12);
            }
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            f fVar = f.f74891a;
            if (userEntity != null) {
                str2 = userEntity.getFirstName();
            } else {
                str2 = null;
            }
            if (ExtensionsKt.isNullOrEmpty(str2)) {
                h11.C(275815455);
                String b13 = g.b(y0.f70424dd, h11, 0);
                h11.S();
                str3 = b13;
                z11 = true;
            } else {
                h11.C(275815563);
                int i13 = y0.f70407cd;
                z11 = true;
                Object[] objArr = new Object[1];
                String firstName = userEntity.getFirstName();
                if (firstName == null) {
                    firstName = "";
                }
                objArr[0] = firstName;
                String c13 = g.c(i13, objArr, h11, 64);
                h11.S();
                str3 = c13;
            }
            dk.a aVar5 = dk.a.f54291a;
            int i14 = dk.a.f54292b;
            yj.d e11 = aVar5.a(h11, i14).e();
            int i15 = yj.d.f76453b;
            TextKt.a(str3, null, 0, 0, false, 1, 0, null, aVar5.c(h11, i14).l(), e11.m(h11, i15), 0, h11, 196608, 0, 1246);
            if (ExtensionsKt.isNullOrEmpty(userEntity.getPhone())) {
                h11.C(275815851);
                TextKt.a(g.b(y0.f70458fd, h11, 0), null, 0, 0, false, 0, 0, null, aVar5.c(h11, i14).d(), aVar5.a(h11, i14).e().j(h11, i15), 0, h11, 0, 0, 1278);
                h11.S();
                aVar2 = h11;
            } else {
                aVar2 = h11;
                aVar2.C(275816146);
                CompositionLocalKt.a(CompositionLocalsKt.j().c(LayoutDirection.Ltr), r0.b.b(aVar2, -637285019, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.header.MainHeaderKt$UserData$1$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(a aVar6, int i16) {
                        if ((i16 & 11) == 2 && aVar6.i()) {
                            aVar6.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-637285019, i16, -1, "com.forsale.app.features.more.newprofile.header.UserData.<anonymous>.<anonymous>.<anonymous> (MainHeader.kt:336)");
                        }
                        String phoneInternational = UserEntity.this.getPhoneInternational(str);
                        dk.a aVar7 = dk.a.f54291a;
                        int i17 = dk.a.f54292b;
                        TextKt.a(phoneInternational, null, 0, 0, false, 0, 0, null, aVar7.c(aVar6, i17).d(), aVar7.a(aVar6, i17).e().j(aVar6, yj.d.f76453b), 0, aVar6, 0, 0, 1278);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(a aVar6, Integer num) {
                        b(aVar6, num.intValue());
                        return p.f75480a;
                    }
                }), aVar2, 0 | t0.f59917d | 48);
                aVar2.S();
            }
            aVar2.S();
            aVar2.w();
            aVar2.S();
            aVar2.S();
            aVar2.S();
            aVar2.w();
            aVar2.S();
            aVar2.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = aVar2.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.header.MainHeaderKt$UserData$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(a aVar6, int i16) {
                        MainHeaderKt.k(UserEntity.this, userStatus, str, aVar6, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(a aVar6, Integer num) {
                        b(aVar6, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }
    }
