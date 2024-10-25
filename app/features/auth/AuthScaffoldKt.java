package com.forsale.app.features.auth;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material.IconButtonKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import androidx.navigation.j;
import com.forsale.app.features.auth.forgotpassword.ForgotPasswordRouteKt;
import com.forsale.app.features.auth.forgotpassword.ResetPasswordRouteKt;
import com.forsale.app.features.auth.login.SignInIntention;
import com.forsale.app.features.auth.login.SignInRouteKt;
import com.forsale.app.features.auth.models.AuthScreen;
import com.forsale.app.features.auth.signup.SignUpRouteKt;
import com.forsale.app.features.auth.verification.VerificationScreenIntention;
import com.forsale.app.features.auth.verification.VerificationScreenKt;
import com.forsale.app.features.more.support.SupportActivity;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.analytics.auth.AuthenticationSourcePage;
import com.forsale.app.utils.analytics.auth.AuthenticationType;
import com.forsale.designSystem.buttons.ButtonData;
import com.forsale.designSystem.buttons.ButtonsKt;
import com.forsale.designSystem.iconography.IconKt;
import com.forsale.designSystem.layouts.NavBarsKt;
import com.google.android.gms.ads.AdRequest;
import g00.l;
import g00.q;
import j0.d1;
import j0.e1;
import j0.n1;
import j0.v0;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.o;
import q1.n;
import q1.r;
import q1.s;
import t9.l0;
import tv.teads.sdk.engine.bridges.network.NetworkResponse;
import v0.b;
import w.t;
import w.x;
import w.y;
import wz.p;
/* compiled from: AuthScaffold.kt */
/* loaded from: classes2.dex */
public final class AuthScaffoldKt {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AuthScaffold.kt */
    /* loaded from: classes2.dex */
    public static final class a implements NavController.b, k {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ q f22530a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(q function) {
            o.i(function, "function");
            this.f22530a = function;
        }

        @Override // androidx.navigation.NavController.b
        public final /* synthetic */ void a(NavController navController, NavDestination navDestination, Bundle bundle) {
            this.f22530a.invoke(navController, navDestination, bundle);
        }

        @Override // kotlin.jvm.internal.k
        public final wz.e<?> c() {
            return this.f22530a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof NavController.b) || !(obj instanceof k)) {
                return false;
            }
            return o.d(c(), ((k) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(Context context, AuthViewModel authViewModel) {
        authViewModel.p(authViewModel.o());
        ContextExtensionsKt.A(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(z3.o oVar, AuthViewModel authViewModel, z3.q qVar, AuthActivity authActivity) {
        s(oVar, authViewModel, qVar, authActivity);
        r(oVar, authViewModel, qVar, authActivity);
        u(oVar, authViewModel, qVar, authActivity);
        t(oVar, authViewModel, qVar, authActivity);
        p(oVar, authViewModel, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final z3.q qVar, final String str, final AuthViewModel authViewModel, final AuthActivity authActivity, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(-1187505932);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1187505932, i11, -1, "com.forsale.app.features.auth.AuthNavBar (AuthScaffold.kt:119)");
        }
        final n1<NavBackStackEntry> d11 = NavHostControllerKt.d(qVar, h11, 8);
        final AuthScreen x11 = x(qVar, h11, 8);
        androidx.compose.ui.c h12 = SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null);
        h11.C(-483455358);
        a0 a11 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), h11, 0);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        j0.k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(h12);
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
        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        w.f fVar = w.f.f74891a;
        NavBarsKt.a(null, r0.b.b(h11, 113900996, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$AuthNavBar$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar2, int i12) {
                NavBackStackEntry b12;
                String str2;
                NavDestination e11;
                if ((i12 & 11) == 2 && aVar2.i()) {
                    aVar2.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(113900996, i12, -1, "com.forsale.app.features.auth.AuthNavBar.<anonymous>.<anonymous> (AuthScaffold.kt:126)");
                }
                b12 = AuthScaffoldKt.b(d11);
                if (b12 != null && (e11 = b12.e()) != null) {
                    str2 = e11.v();
                } else {
                    str2 = null;
                }
                if (o.d(str2, str) && authViewModel.k() != SignInIntention.DEFAULT && qVar.L() == null) {
                    aVar2.C(-643964122);
                    final AuthActivity authActivity2 = authActivity;
                    aVar2.C(1157296644);
                    boolean T = aVar2.T(authActivity2);
                    Object D = aVar2.D();
                    if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                        D = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0071: CONSTRUCTOR  (r2v2 'D' java.lang.Object) = (r7v13 'authActivity2' com.forsale.app.features.auth.AuthActivity A[DONT_INLINE]) call: com.forsale.app.features.auth.AuthScaffoldKt$AuthNavBar$1$1$1$1.<init>(com.forsale.app.features.auth.AuthActivity):void type: CONSTRUCTOR in method: com.forsale.app.features.auth.AuthScaffoldKt$AuthNavBar$1$1.b(androidx.compose.runtime.a, int):void, file: classes2.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.auth.AuthScaffoldKt$AuthNavBar$1$1$1$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                            	... 31 more
                            */
                        /*
                            this = this;
                            r0 = r7 & 11
                            r1 = 2
                            if (r0 != r1) goto L11
                            boolean r0 = r6.i()
                            if (r0 != 0) goto Lc
                            goto L11
                        Lc:
                            r6.L()
                            goto La7
                        L11:
                            boolean r0 = androidx.compose.runtime.c.I()
                            if (r0 == 0) goto L20
                            r0 = -1
                            java.lang.String r1 = "com.forsale.app.features.auth.AuthNavBar.<anonymous>.<anonymous> (AuthScaffold.kt:126)"
                            r2 = 113900996(0x6c9fdc4, float:7.598067E-35)
                            androidx.compose.runtime.c.U(r2, r7, r0, r1)
                        L20:
                            j0.n1<androidx.navigation.NavBackStackEntry> r7 = r6
                            androidx.navigation.NavBackStackEntry r7 = com.forsale.app.features.auth.AuthScaffoldKt.g(r7)
                            if (r7 == 0) goto L33
                            androidx.navigation.NavDestination r7 = r7.e()
                            if (r7 == 0) goto L33
                            java.lang.String r7 = r7.v()
                            goto L34
                        L33:
                            r7 = 0
                        L34:
                            java.lang.String r0 = r1
                            boolean r7 = kotlin.jvm.internal.o.d(r7, r0)
                            r0 = 6
                            if (r7 == 0) goto L84
                            com.forsale.app.features.auth.AuthViewModel r7 = r2
                            com.forsale.app.features.auth.login.SignInIntention r7 = r7.k()
                            com.forsale.app.features.auth.login.SignInIntention r1 = com.forsale.app.features.auth.login.SignInIntention.DEFAULT
                            if (r7 == r1) goto L84
                            z3.q r7 = r3
                            androidx.navigation.NavBackStackEntry r7 = r7.L()
                            if (r7 != 0) goto L84
                            r7 = -643964122(0xffffffffd99de326, float:-5.5551655E15)
                            r6.C(r7)
                            com.forsale.app.features.auth.AuthActivity r7 = r4
                            r1 = 1157296644(0x44faf204, float:2007.563)
                            r6.C(r1)
                            boolean r1 = r6.T(r7)
                            java.lang.Object r2 = r6.D()
                            if (r1 != 0) goto L6f
                            androidx.compose.runtime.a$a r1 = androidx.compose.runtime.a.f7182a
                            java.lang.Object r1 = r1.a()
                            if (r2 != r1) goto L77
                        L6f:
                            com.forsale.app.features.auth.AuthScaffoldKt$AuthNavBar$1$1$1$1 r2 = new com.forsale.app.features.auth.AuthScaffoldKt$AuthNavBar$1$1$1$1
                            r2.<init>(r7)
                            r6.u(r2)
                        L77:
                            r6.S()
                            g00.a r2 = (g00.a) r2
                            r7 = 1
                            com.forsale.app.features.auth.AuthScaffoldKt.h(r7, r2, r6, r0)
                            r6.S()
                            goto L9e
                        L84:
                            r7 = -643963894(0xffffffffd99de40a, float:-5.5552879E15)
                            r6.C(r7)
                            com.forsale.app.features.auth.AuthScaffoldKt$AuthNavBar$1$1$2 r7 = new com.forsale.app.features.auth.AuthScaffoldKt$AuthNavBar$1$1$2
                            java.lang.String r1 = r1
                            z3.q r2 = r3
                            com.forsale.app.features.auth.AuthActivity r3 = r4
                            j0.n1<androidx.navigation.NavBackStackEntry> r4 = r6
                            r7.<init>()
                            r1 = 0
                            com.forsale.app.features.auth.AuthScaffoldKt.h(r1, r7, r6, r0)
                            r6.S()
                        L9e:
                            boolean r6 = androidx.compose.runtime.c.I()
                            if (r6 == 0) goto La7
                            androidx.compose.runtime.c.T()
                        La7:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.auth.AuthScaffoldKt$AuthNavBar$1$1.b(androidx.compose.runtime.a, int):void");
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                }), ComposableSingletons$AuthScaffoldKt.f22600a.a(), r0.b.b(h11, -2054069138, true, new q<t, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$AuthNavBar$1$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    public final void b(t NavBarInner, androidx.compose.runtime.a aVar2, int i12) {
                        o.i(NavBarInner, "$this$NavBarInner");
                        if ((i12 & 81) == 16 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-2054069138, i12, -1, "com.forsale.app.features.auth.AuthNavBar.<anonymous>.<anonymous> (AuthScaffold.kt:139)");
                        }
                        AuthScaffoldKt.o(AuthScreen.this, authActivity, authViewModel, aVar2, ((i11 >> 6) & 112) | AdRequest.MAX_CONTENT_URL_LENGTH);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.q
                    public /* bridge */ /* synthetic */ p invoke(t tVar, androidx.compose.runtime.a aVar2, Integer num) {
                        b(tVar, aVar2, num.intValue());
                        return p.f75480a;
                    }
                }), false, h11, 3504, 17);
                BackHandlerKt.a(false, new g00.a<p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$AuthNavBar$1$3
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
                        NavBackStackEntry b12;
                        if (AuthViewModel.this.k() == SignInIntention.DEFAULT) {
                            b12 = AuthScaffoldKt.b(d11);
                            AuthScaffoldKt.w(b12, str, qVar, authActivity);
                            return;
                        }
                        authActivity.finishAfterTransition();
                        authActivity.overridePendingTransition(l0.f69319c, l0.f69318b);
                    }
                }, h11, 0, 1);
                h11.S();
                h11.w();
                h11.S();
                h11.S();
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
                d1 l11 = h11.l();
                if (l11 != null) {
                    l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$AuthNavBar$2
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar2, int i12) {
                            AuthScaffoldKt.a(z3.q.this, str, authViewModel, authActivity, aVar2, v0.a(i11 | 1));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return p.f75480a;
                        }
                    });
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final NavBackStackEntry b(n1<NavBackStackEntry> n1Var) {
                return n1Var.getValue();
            }

            public static final void c(final AuthViewModel sharedViewModel, final AuthActivity context, androidx.compose.runtime.a aVar, final int i11) {
                o.i(sharedViewModel, "sharedViewModel");
                o.i(context, "context");
                androidx.compose.runtime.a h11 = aVar.h(616738364);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(616738364, i11, -1, "com.forsale.app.features.auth.AuthScaffold (AuthScaffold.kt:72)");
                }
                final String l11 = sharedViewModel.l();
                final z3.q e11 = NavHostControllerKt.e(new Navigator[0], h11, 8);
                ScaffoldKt.b(SizeKt.f(n.c(androidx.compose.ui.c.f7566a, false, new l<s, p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$AuthScaffold$1
                    public final void b(s semantics) {
                        o.i(semantics, "$this$semantics");
                        r.a(semantics, true);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(s sVar) {
                        b(sVar);
                        return p.f75480a;
                    }
                }, 1, null), 0.0f, 1, null), ScaffoldKt.l(null, null, h11, 0, 3), r0.b.b(h11, 1678064961, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$AuthScaffold$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        if ((i12 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(1678064961, i12, -1, "com.forsale.app.features.auth.AuthScaffold.<anonymous> (AuthScaffold.kt:80)");
                        }
                        AuthScaffoldKt.a(z3.q.this, l11, sharedViewModel, context, aVar2, ((i11 << 6) & 7168) | NetworkResponse.UNKNOWN_ERROR_CODE);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                }), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, r0.b.b(h11, -1353993094, true, new q<w.o, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$AuthScaffold$3
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    public final void b(w.o padding, androidx.compose.runtime.a aVar2, int i12) {
                        int i13;
                        int i14;
                        o.i(padding, "padding");
                        if ((i12 & 14) == 0) {
                            if (aVar2.T(padding)) {
                                i14 = 4;
                            } else {
                                i14 = 2;
                            }
                            i13 = i14 | i12;
                        } else {
                            i13 = i12;
                        }
                        if ((i13 & 91) == 18 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-1353993094, i12, -1, "com.forsale.app.features.auth.AuthScaffold.<anonymous> (AuthScaffold.kt:82)");
                        }
                        c.a aVar3 = androidx.compose.ui.c.f7566a;
                        androidx.compose.ui.c d11 = WindowInsetsPaddingKt.d(WindowInsetsPaddingKt.a(PaddingKt.h(SizeKt.f(aVar3, 0.0f, 1, null), padding), padding), x.h(androidx.compose.foundation.layout.s.b(androidx.compose.foundation.layout.r.f3992a, aVar2, 8), y.f74929a.f()));
                        final z3.q qVar = z3.q.this;
                        String str = l11;
                        final AuthViewModel authViewModel = sharedViewModel;
                        final AuthActivity authActivity = context;
                        aVar2.C(733328855);
                        b.a aVar4 = v0.b.f74009a;
                        a0 g11 = BoxKt.g(aVar4.o(), false, aVar2, 0);
                        aVar2.C(-1323940314);
                        int a11 = j0.e.a(aVar2, 0);
                        j0.k s11 = aVar2.s();
                        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                        g00.a<ComposeUiNode> a12 = companion.a();
                        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(d11);
                        if (!(aVar2.k() instanceof j0.d)) {
                            j0.e.c();
                        }
                        aVar2.I();
                        if (aVar2.f()) {
                            aVar2.y(a12);
                        } else {
                            aVar2.t();
                        }
                        androidx.compose.runtime.a a13 = Updater.a(aVar2);
                        Updater.c(a13, g11, companion.e());
                        Updater.c(a13, s11, companion.g());
                        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
                        if (a13.f() || !o.d(a13.D(), Integer.valueOf(a11))) {
                            a13.u(Integer.valueOf(a11));
                            a13.p(Integer.valueOf(a11), b11);
                        }
                        c11.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                        aVar2.C(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
                        NavHostKt.b(qVar, str, null, null, null, null, null, null, null, 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x012d: INVOKE  
                              (r2v7 'qVar' z3.q)
                              (r3v10 'str' java.lang.String)
                              (null androidx.compose.ui.c)
                              (null v0.b)
                              (null java.lang.String)
                              (null g00.l)
                              (null g00.l)
                              (null g00.l)
                              (null g00.l)
                              (wrap: g00.l<z3.o, wz.p> : 0x010c: CONSTRUCTOR  (r1v4 g00.l<z3.o, wz.p> A[REMOVE]) = 
                              (r13v0 'authViewModel' com.forsale.app.features.auth.AuthViewModel A[DONT_INLINE])
                              (r2v7 'qVar' z3.q A[DONT_INLINE])
                              (r4v2 'authActivity' com.forsale.app.features.auth.AuthActivity A[DONT_INLINE])
                             call: com.forsale.app.features.auth.AuthScaffoldKt$AuthScaffold$3$1$1.<init>(com.forsale.app.features.auth.AuthViewModel, z3.q, com.forsale.app.features.auth.AuthActivity):void type: CONSTRUCTOR)
                              (r27v0 'aVar2' androidx.compose.runtime.a)
                              (8 int)
                              (508 int)
                             type: STATIC call: androidx.navigation.compose.NavHostKt.b(z3.q, java.lang.String, androidx.compose.ui.c, v0.b, java.lang.String, g00.l, g00.l, g00.l, g00.l, g00.l, androidx.compose.runtime.a, int, int):void in method: com.forsale.app.features.auth.AuthScaffoldKt$AuthScaffold$3.b(w.o, androidx.compose.runtime.a, int):void, file: classes2.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.auth.AuthScaffoldKt$AuthScaffold$3$1$1, state: NOT_LOADED
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
                            	... 19 more
                            */
                        /*
                            Method dump skipped, instructions count: 517
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.auth.AuthScaffoldKt$AuthScaffold$3.b(w.o, androidx.compose.runtime.a, int):void");
                    }

                    @Override // g00.q
                    public /* bridge */ /* synthetic */ p invoke(w.o oVar, androidx.compose.runtime.a aVar2, Integer num) {
                        b(oVar, aVar2, num.intValue());
                        return p.f75480a;
                    }
                }), h11, 384, 12582912, 131064);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
                d1 l12 = h11.l();
                if (l12 != null) {
                    l12.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$AuthScaffold$4
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar2, int i12) {
                            AuthScaffoldKt.c(AuthViewModel.this, context, aVar2, v0.a(i11 | 1));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return p.f75480a;
                        }
                    });
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void d(final boolean z11, final g00.a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
                int i12;
                int i13;
                int i14;
                androidx.compose.runtime.a h11 = aVar2.h(393487923);
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
                    if (h11.F(aVar)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i12 |= i13;
                }
                if ((i12 & 91) == 18 && h11.i()) {
                    h11.L();
                } else {
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(393487923, i12, -1, "com.forsale.app.features.auth.NavIcon (AuthScaffold.kt:187)");
                    }
                    h11.C(1157296644);
                    boolean T = h11.T(aVar);
                    Object D = h11.D();
                    if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                        D = new g00.a<p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$NavIcon$1$1
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
                    IconButtonKt.a((g00.a) D, null, false, null, r0.b.b(h11, 459213007, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$NavIcon$2
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar3, int i15) {
                            int i16;
                            if ((i15 & 11) == 2 && aVar3.i()) {
                                aVar3.L();
                                return;
                            }
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.U(459213007, i15, -1, "com.forsale.app.features.auth.NavIcon.<anonymous> (AuthScaffold.kt:191)");
                            }
                            if (z11) {
                                aVar3.C(-513988266);
                                i16 = sj.d.f68681r;
                            } else {
                                aVar3.C(-513988191);
                                i16 = sj.d.R;
                            }
                            Painter d11 = p1.e.d(i16, aVar3, 0);
                            aVar3.S();
                            IconKt.a(d11, null, null, 0L, false, 0.0f, aVar3, 392, 58);
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.T();
                            }
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                            b(aVar3, num.intValue());
                            return p.f75480a;
                        }
                    }), h11, 24576, 14);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }
                d1 l11 = h11.l();
                if (l11 != null) {
                    l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$NavIcon$3
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar3, int i15) {
                            AuthScaffoldKt.d(z11, aVar, aVar3, v0.a(i11 | 1));
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
            public static final void e(final Context context, final AuthViewModel authViewModel, androidx.compose.runtime.a aVar, final int i11) {
                androidx.compose.runtime.a h11 = aVar.h(1511123430);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(1511123430, i11, -1, "com.forsale.app.features.auth.VerifyActions (AuthScaffold.kt:355)");
                }
                ButtonsKt.k(new g00.a<p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$VerifyActions$1
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
                        AuthScaffoldKt.A(context, authViewModel);
                    }
                }, null, ButtonData.f40994a.c(), false, false, null, ComposableSingletons$AuthScaffoldKt.f22600a.b(), h11, (ButtonData.f40995b << 6) | 1572864, 58);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
                d1 l11 = h11.l();
                if (l11 != null) {
                    l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$VerifyActions$2
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar2, int i12) {
                            AuthScaffoldKt.e(context, authViewModel, aVar2, v0.a(i11 | 1));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return p.f75480a;
                        }
                    });
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void o(final AuthScreen authScreen, final Context context, final AuthViewModel authViewModel, androidx.compose.runtime.a aVar, final int i11) {
                androidx.compose.runtime.a h11 = aVar.h(-1106417479);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-1106417479, i11, -1, "com.forsale.app.features.auth.actions (AuthScaffold.kt:347)");
                }
                if (o.d(authScreen, AuthScreen.e.f22813c)) {
                    e(context, authViewModel, h11, 72);
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
                d1 l11 = h11.l();
                if (l11 != null) {
                    l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$actions$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar2, int i12) {
                            AuthScaffoldKt.o(AuthScreen.this, context, authViewModel, aVar2, v0.a(i11 | 1));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return p.f75480a;
                        }
                    });
                }
            }

            private static final void p(z3.o oVar, final AuthViewModel authViewModel, final z3.q qVar) {
                List e11;
                String a11 = AuthScreen.b.f22810c.a();
                e11 = kotlin.collections.q.e(z3.f.a("OTP_ARG", new l<androidx.navigation.b, p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$addResetPasswordRoute$1
                    public final void b(androidx.navigation.b navArgument) {
                        o.i(navArgument, "$this$navArgument");
                        navArgument.c(j.f13390m);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(androidx.navigation.b bVar) {
                        b(bVar);
                        return p.f75480a;
                    }
                }));
                q(oVar, a11, e11, r0.b.c(608185491, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$addResetPasswordRoute$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar, int i11) {
                        if ((i11 & 11) == 2 && aVar.i()) {
                            aVar.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(608185491, i11, -1, "com.forsale.app.features.auth.addResetPasswordRoute.<anonymous> (AuthScaffold.kt:260)");
                        }
                        final AuthViewModel authViewModel2 = AuthViewModel.this;
                        final z3.q qVar2 = qVar;
                        ResetPasswordRouteKt.a(authViewModel2, null, new g00.a<p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$addResetPasswordRoute$2.1
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
                                NavController.f0(z3.q.this, AuthScreen.f22808b.b(authViewModel2.j(), SignInIntention.DEFAULT), null, null, 6, null);
                            }
                        }, aVar, 8, 2);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar, Integer num) {
                        b(aVar, num.intValue());
                        return p.f75480a;
                    }
                }));
            }

            private static final void q(z3.o oVar, String str, List<z3.e> list, final g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar) {
                androidx.navigation.compose.e.b(oVar, str, list, null, null, null, null, null, r0.b.c(1597169907, true, new g00.r<q.b, NavBackStackEntry, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$addRoute$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(4);
                    }

                    public final void b(q.b composable, NavBackStackEntry it2, androidx.compose.runtime.a aVar, int i11) {
                        o.i(composable, "$this$composable");
                        o.i(it2, "it");
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(1597169907, i11, -1, "com.forsale.app.features.auth.addRoute.<anonymous> (AuthScaffold.kt:182)");
                        }
                        pVar.invoke(aVar, 0);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.r
                    public /* bridge */ /* synthetic */ p d(q.b bVar, NavBackStackEntry navBackStackEntry, androidx.compose.runtime.a aVar, Integer num) {
                        b(bVar, navBackStackEntry, aVar, num.intValue());
                        return p.f75480a;
                    }
                }), 124, null);
            }

            private static final void r(z3.o oVar, final AuthViewModel authViewModel, final z3.q qVar, final AuthActivity authActivity) {
                List q11;
                String a11 = AuthScreen.c.f22811c.a();
                q11 = kotlin.collections.r.q(v(authViewModel.j()), z3.f.a("SIGN_IN_INTENTION", new l<androidx.navigation.b, p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$addSignInRoute$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(1);
                    }

                    public final void b(androidx.navigation.b navArgument) {
                        o.i(navArgument, "$this$navArgument");
                        navArgument.b(AuthViewModel.this.k());
                        navArgument.c(new j.m(SignInIntention.class));
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(androidx.navigation.b bVar) {
                        b(bVar);
                        return p.f75480a;
                    }
                }));
                q(oVar, a11, q11, r0.b.c(1213866194, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$addSignInRoute$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar, int i11) {
                        if ((i11 & 11) == 2 && aVar.i()) {
                            aVar.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(1213866194, i11, -1, "com.forsale.app.features.auth.addSignInRoute.<anonymous> (AuthScaffold.kt:280)");
                        }
                        final AuthViewModel authViewModel2 = AuthViewModel.this;
                        final z3.q qVar2 = qVar;
                        g00.a<p> aVar2 = new g00.a<p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$addSignInRoute$2.1
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
                                NavController.f0(z3.q.this, AuthScreen.f22808b.c(authViewModel2.j()), null, null, 6, null);
                                authViewModel2.s(AuthenticationSourcePage.LOGIN);
                            }
                        };
                        final z3.q qVar3 = qVar;
                        final AuthViewModel authViewModel3 = AuthViewModel.this;
                        g00.a<p> aVar3 = new g00.a<p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$addSignInRoute$2.2
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
                                NavController.f0(z3.q.this, AuthScreen.f22808b.e(authViewModel3.j()), null, null, 6, null);
                            }
                        };
                        final AuthActivity authActivity2 = authActivity;
                        final AuthViewModel authViewModel4 = AuthViewModel.this;
                        SignInRouteKt.a(authViewModel2, null, aVar2, aVar3, new g00.a<p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$addSignInRoute$2.3
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
                                AuthScaffoldKt.z(AuthActivity.this, authViewModel4, AuthenticationType.LOGIN);
                            }
                        }, aVar, 8, 2);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar, Integer num) {
                        b(aVar, num.intValue());
                        return p.f75480a;
                    }
                }));
            }

            private static final void s(z3.o oVar, final AuthViewModel authViewModel, final z3.q qVar, final AuthActivity authActivity) {
                List e11;
                String a11 = AuthScreen.d.f22812c.a();
                e11 = kotlin.collections.q.e(v(authViewModel.j()));
                q(oVar, a11, e11, r0.b.c(-1900325944, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$addSignUpRoute$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar, int i11) {
                        if ((i11 & 11) == 2 && aVar.i()) {
                            aVar.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-1900325944, i11, -1, "com.forsale.app.features.auth.addSignUpRoute.<anonymous> (AuthScaffold.kt:208)");
                        }
                        AuthViewModel authViewModel2 = AuthViewModel.this;
                        AuthActivity authActivity2 = authActivity;
                        final z3.q qVar2 = qVar;
                        g00.a<p> aVar2 = new g00.a<p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$addSignUpRoute$1.1
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
                                NavController.f0(z3.q.this, AuthScreen.f22808b.d(VerificationScreenIntention.SIGNUP), null, null, 6, null);
                            }
                        };
                        final z3.q qVar3 = qVar;
                        final AuthViewModel authViewModel3 = AuthViewModel.this;
                        SignUpRouteKt.d(authViewModel2, null, authActivity2, aVar2, new g00.a<p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$addSignUpRoute$1.2
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
                                NavController.f0(z3.q.this, AuthScreen.f22808b.b(authViewModel3.j(), SignInIntention.DEFAULT), null, null, 6, null);
                                authViewModel3.s(AuthenticationSourcePage.SIGNUP);
                            }
                        }, aVar, 8, 2);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar, Integer num) {
                        b(aVar, num.intValue());
                        return p.f75480a;
                    }
                }));
            }

            private static final void t(z3.o oVar, final AuthViewModel authViewModel, final z3.q qVar, final AuthActivity authActivity) {
                List e11;
                String a11 = AuthScreen.f.f22814c.a();
                e11 = kotlin.collections.q.e(v(authViewModel.j()));
                q(oVar, a11, e11, r0.b.c(-594955667, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$addVerifyPhoneRoute$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar, int i11) {
                        if ((i11 & 11) == 2 && aVar.i()) {
                            aVar.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-594955667, i11, -1, "com.forsale.app.features.auth.addVerifyPhoneRoute.<anonymous> (AuthScaffold.kt:235)");
                        }
                        AuthViewModel authViewModel2 = AuthViewModel.this;
                        AuthActivity authActivity2 = authActivity;
                        final z3.q qVar2 = qVar;
                        g00.a<p> aVar2 = new g00.a<p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$addVerifyPhoneRoute$1.1
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
                                NavController.f0(z3.q.this, AuthScreen.f22808b.d(VerificationScreenIntention.FORGET_PASSWORD), null, null, 6, null);
                            }
                        };
                        final AuthActivity authActivity3 = authActivity;
                        final AuthViewModel authViewModel3 = AuthViewModel.this;
                        ForgotPasswordRouteKt.a(authViewModel2, null, authActivity2, aVar2, new g00.a<p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$addVerifyPhoneRoute$1.2
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
                                AuthScaffoldKt.z(AuthActivity.this, authViewModel3, AuthenticationType.FORGET_PASSWORD);
                            }
                        }, aVar, 8, 2);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar, Integer num) {
                        b(aVar, num.intValue());
                        return p.f75480a;
                    }
                }));
            }

            private static final void u(z3.o oVar, final AuthViewModel authViewModel, final z3.q qVar, final AuthActivity authActivity) {
                List e11;
                String a11 = AuthScreen.e.f22813c.a();
                e11 = kotlin.collections.q.e(z3.f.a("VERIFY_INTENTION", new l<androidx.navigation.b, p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$addVerifyRoute$1
                    public final void b(androidx.navigation.b navArgument) {
                        o.i(navArgument, "$this$navArgument");
                        navArgument.c(j.f13390m);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(androidx.navigation.b bVar) {
                        b(bVar);
                        return p.f75480a;
                    }
                }));
                q(oVar, a11, e11, r0.b.c(-823763639, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$addVerifyRoute$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar, int i11) {
                        if ((i11 & 11) == 2 && aVar.i()) {
                            aVar.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-823763639, i11, -1, "com.forsale.app.features.auth.addVerifyRoute.<anonymous> (AuthScaffold.kt:306)");
                        }
                        AuthViewModel authViewModel2 = AuthViewModel.this;
                        AuthActivity authActivity2 = authActivity;
                        final z3.q qVar2 = qVar;
                        l<String, p> lVar = new l<String, p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$addVerifyRoute$2.1
                            {
                                super(1);
                            }

                            public final void b(String otp) {
                                o.i(otp, "otp");
                                x10.a.b("RegisterObserver: onNavigateCreateNewPassword: otp: " + otp, new Object[0]);
                                NavController.f0(z3.q.this, AuthScreen.f22808b.a(otp), null, null, 6, null);
                            }

                            @Override // g00.l
                            public /* bridge */ /* synthetic */ p invoke(String str) {
                                b(str);
                                return p.f75480a;
                            }
                        };
                        final z3.q qVar3 = qVar;
                        g00.a<p> aVar2 = new g00.a<p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$addVerifyRoute$2.2
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
                                z3.q.this.h0();
                            }
                        };
                        final AuthViewModel authViewModel3 = AuthViewModel.this;
                        VerificationScreenKt.l(authViewModel2, authActivity2, null, lVar, aVar2, new l<String, p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$addVerifyRoute$2.3
                            {
                                super(1);
                            }

                            public final void b(String it2) {
                                o.i(it2, "it");
                                AuthViewModel.this.v(it2);
                            }

                            @Override // g00.l
                            public /* bridge */ /* synthetic */ p invoke(String str) {
                                b(str);
                                return p.f75480a;
                            }
                        }, aVar, 8, 4);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar, Integer num) {
                        b(aVar, num.intValue());
                        return p.f75480a;
                    }
                }));
            }

            private static final z3.e v(final String str) {
                return z3.f.a("PHONE_PREFIX_ARG", new l<androidx.navigation.b, p>() { // from class: com.forsale.app.features.auth.AuthScaffoldKt$definePhonePrefixArg$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(androidx.navigation.b navArgument) {
                        o.i(navArgument, "$this$navArgument");
                        navArgument.c(j.f13390m);
                        navArgument.b(str);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(androidx.navigation.b bVar) {
                        b(bVar);
                        return p.f75480a;
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void w(NavBackStackEntry navBackStackEntry, String str, z3.q qVar, AuthActivity authActivity) {
                String str2;
                NavDestination e11;
                if (navBackStackEntry != null && (e11 = navBackStackEntry.e()) != null) {
                    str2 = e11.v();
                } else {
                    str2 = null;
                }
                if (o.d(str2, str) && qVar.L() == null) {
                    authActivity.finish();
                } else {
                    qVar.j0();
                }
            }

            public static final AuthScreen x(NavController navController, androidx.compose.runtime.a aVar, int i11) {
                AuthScreen authScreen;
                String v11;
                o.i(navController, "<this>");
                aVar.C(-315660618);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-315660618, i11, -1, "com.forsale.app.features.auth.observerDestination (AuthScaffold.kt:327)");
                }
                NavDestination F = navController.F();
                if (F != null && (v11 = F.v()) != null) {
                    authScreen = AuthScreen.b.f22810c.b(v11);
                } else {
                    authScreen = null;
                }
                AuthScreen y11 = y(z.l(authScreen, new AuthScaffoldKt$observerDestination$destination$2(navController, null), aVar, 64));
                if (y11 == null) {
                    y11 = AuthScreen.d.f22812c;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
                aVar.S();
                return y11;
            }

            private static final AuthScreen y(n1<? extends AuthScreen> n1Var) {
                return n1Var.getValue();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void z(Context context, AuthViewModel authViewModel, AuthenticationType authenticationType) {
                authViewModel.p(authenticationType);
                SupportActivity.f32788x.a(context);
            }
        }
