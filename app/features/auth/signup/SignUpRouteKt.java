package com.forsale.app.features.auth.signup;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q0;
import androidx.lifecycle.s;
import androidx.lifecycle.t0;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.x0;
import com.forsale.app.features.auth.AuthActivity;
import com.forsale.app.features.auth.AuthViewModel;
import com.forsale.app.features.auth.utils.ComponentsTags;
import com.forsale.app.features.auth.views.ClickableTextKt;
import com.forsale.app.features.auth.views.EmailTextFieldKt;
import com.forsale.app.features.auth.views.NameTextFieldKt;
import com.forsale.app.features.auth.views.PasswordTextFieldKt;
import com.forsale.app.features.auth.views.PhoneFieldKt;
import com.forsale.app.features.auth.views.textfieldstates.TextFieldState;
import com.forsale.app.features.more.WebActivity;
import com.forsale.app.features.more.WebType;
import com.forsale.app.ui.dialogs.LoadingDialogKt;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.analytics.auth.AuthenticationType;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.buttons.ButtonsKt;
import e2.h;
import g00.l;
import g00.q;
import j0.d;
import j0.d1;
import j0.e1;
import j0.k;
import j0.n1;
import j0.r;
import j0.u;
import j0.v0;
import kotlin.jvm.internal.o;
import p1.g;
import t9.y0;
import v0.b;
import w.f;
import w3.a;
import wz.p;
/* compiled from: SignUpRoute.kt */
/* loaded from: classes2.dex */
public final class SignUpRouteKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final SignUpViewModel signUpViewModel, final TextFieldState textFieldState, final TextFieldState textFieldState2, final TextFieldState textFieldState3, final TextFieldState textFieldState4, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(-1773728781);
        if (c.I()) {
            c.U(-1773728781, i11, -1, "com.forsale.app.features.auth.signup.FieldsServerErrorObservers (SignUpRoute.kt:222)");
        }
        p pVar = p.f75480a;
        u.d(pVar, new SignUpRouteKt$FieldsServerErrorObservers$1(signUpViewModel, textFieldState, null), h11, 70);
        u.d(pVar, new SignUpRouteKt$FieldsServerErrorObservers$2(signUpViewModel, textFieldState2, null), h11, 70);
        u.d(pVar, new SignUpRouteKt$FieldsServerErrorObservers$3(signUpViewModel, textFieldState3, null), h11, 70);
        u.d(pVar, new SignUpRouteKt$FieldsServerErrorObservers$4(signUpViewModel, textFieldState4, null), h11, 70);
        if (c.I()) {
            c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.signup.SignUpRouteKt$FieldsServerErrorObservers$5
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    SignUpRouteKt.a(SignUpViewModel.this, textFieldState, textFieldState2, textFieldState3, textFieldState4, aVar2, v0.a(i11 | 1));
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
    public static final void b(final Context context, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(-1699814496);
        if (c.I()) {
            c.U(-1699814496, i11, -1, "com.forsale.app.features.auth.signup.Footer (SignUpRoute.kt:187)");
        }
        h11.C(-483455358);
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        Arrangement arrangement = Arrangement.f3698a;
        Arrangement.m h12 = arrangement.h();
        b.a aVar3 = v0.b.f74009a;
        a0 a11 = e.a(h12, aVar3.k(), h11, 0);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar2);
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
        final String b12 = g.b(y0.f70455fa, h11, 0);
        String b13 = g.b(y0.f70597o0, h11, 0);
        dk.a aVar4 = dk.a.f54291a;
        int i12 = dk.a.f54292b;
        TextKt.a(b13, null, 0, 0, false, 0, 0, null, aVar4.c(h11, i12).h(), 0L, 0, h11, 0, 0, 1790);
        SpacerKt.a(SizeKt.i(aVar2, h.l(2)), h11, 6);
        androidx.compose.ui.c b14 = fVar.b(aVar2, aVar3.g());
        h11.C(693286680);
        a0 a15 = androidx.compose.foundation.layout.o.a(arrangement.g(), aVar3.l(), h11, 0);
        h11.C(-1323940314);
        int a16 = j0.e.a(h11, 0);
        k s12 = h11.s();
        g00.a<ComposeUiNode> a17 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(b14);
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
        g00.p<ComposeUiNode, Integer, p> b15 = companion.b();
        if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
            a18.u(Integer.valueOf(a16));
            a18.p(Integer.valueOf(a16), b15);
        }
        c12.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        w.u uVar = w.u.f74924a;
        TextKt.a(g.b(y0.f70580n0, h11, 0), TestTagKt.a(ClickableKt.e(aVar2, false, null, null, new g00.a<p>() { // from class: com.forsale.app.features.auth.signup.SignUpRouteKt$Footer$1$1$1
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
                WebActivity.a.d(WebActivity.I, context, WebType.TERMS_CONDITIONS, b12, null, 0, null, 28, null);
            }
        }, 7, null), ComponentsTags.TERMS_AND_CONDITIONS_BUTTON.getTag()), 0, 0, false, 0, 0, null, aVar4.c(h11, i12).m(), aVar4.a(h11, i12).f().i(h11, yj.d.f76453b), 0, h11, 0, 0, 1276);
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
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.signup.SignUpRouteKt$Footer$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar5, int i13) {
                    SignUpRouteKt.b(context, aVar5, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void c(final g00.p<? super s, ? super Lifecycle.Event, p> onEvent, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        int i13;
        o.i(onEvent, "onEvent");
        androidx.compose.runtime.a h11 = aVar.h(-301915585);
        if ((i11 & 14) == 0) {
            if (h11.F(onEvent)) {
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
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-301915585, i12, -1, "com.forsale.app.features.auth.signup.OnLifecycleEvent (SignUpRoute.kt:257)");
            }
            final n1 o11 = z.o(onEvent, h11, i12 & 14);
            final n1 o12 = z.o(h11.q(AndroidCompositionLocals_androidKt.i()), h11, 8);
            Object value = o12.getValue();
            h11.C(511388516);
            boolean T = h11.T(o12) | h11.T(o11);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new l<j0.s, r>() { // from class: com.forsale.app.features.auth.signup.SignUpRouteKt$OnLifecycleEvent$1$1

                    /* compiled from: Effects.kt */
                    /* loaded from: classes2.dex */
                    public static final class a implements r {

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ Lifecycle f22846a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ androidx.lifecycle.p f22847b;

                        public a(Lifecycle lifecycle, androidx.lifecycle.p pVar) {
                            this.f22846a = lifecycle;
                            this.f22847b = pVar;
                        }

                        @Override // j0.r
                        public void dispose() {
                            this.f22846a.d(this.f22847b);
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // g00.l
                    /* renamed from: b */
                    public final r invoke(j0.s DisposableEffect) {
                        o.i(DisposableEffect, "$this$DisposableEffect");
                        Lifecycle lifecycle = o12.getValue().getLifecycle();
                        final n1<g00.p<s, Lifecycle.Event, p>> n1Var = o11;
                        androidx.lifecycle.p pVar = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0015: CONSTRUCTOR  (r0v1 'pVar' androidx.lifecycle.p) = (r1v0 'n1Var' j0.n1<g00.p<androidx.lifecycle.s, androidx.lifecycle.Lifecycle$Event, wz.p>> A[DONT_INLINE]) call: com.forsale.app.features.auth.signup.SignUpRouteKt$OnLifecycleEvent$1$1$observer$1.<init>(j0.n1):void type: CONSTRUCTOR in method: com.forsale.app.features.auth.signup.SignUpRouteKt$OnLifecycleEvent$1$1.b(j0.s):j0.r, file: classes2.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.auth.signup.SignUpRouteKt$OnLifecycleEvent$1$1$observer$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                            	... 15 more
                            */
                        /*
                            this = this;
                            java.lang.String r0 = "$this$DisposableEffect"
                            kotlin.jvm.internal.o.i(r3, r0)
                            j0.n1<androidx.lifecycle.s> r3 = r1
                            java.lang.Object r3 = r3.getValue()
                            androidx.lifecycle.s r3 = (androidx.lifecycle.s) r3
                            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
                            com.forsale.app.features.auth.signup.SignUpRouteKt$OnLifecycleEvent$1$1$observer$1 r0 = new com.forsale.app.features.auth.signup.SignUpRouteKt$OnLifecycleEvent$1$1$observer$1
                            j0.n1<g00.p<androidx.lifecycle.s, androidx.lifecycle.Lifecycle$Event, wz.p>> r1 = r2
                            r0.<init>(r1)
                            r3.a(r0)
                            com.forsale.app.features.auth.signup.SignUpRouteKt$OnLifecycleEvent$1$1$a r1 = new com.forsale.app.features.auth.signup.SignUpRouteKt$OnLifecycleEvent$1$1$a
                            r1.<init>(r3, r0)
                            return r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.auth.signup.SignUpRouteKt$OnLifecycleEvent$1$1.invoke(j0.s):j0.r");
                    }
                };
                h11.u(D);
            }
            h11.S();
            u.a(value, (l) D, h11, 8);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.signup.SignUpRouteKt$OnLifecycleEvent$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i14) {
                    SignUpRouteKt.c(onEvent, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void d(final AuthViewModel sharedViewModel, SignUpViewModel signUpViewModel, final AuthActivity context, final g00.a<p> onNavigateToVerify, final g00.a<p> onNavigateToSignIn, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        SignUpViewModel signUpViewModel2;
        int i13;
        w3.a aVar2;
        o.i(sharedViewModel, "sharedViewModel");
        o.i(context, "context");
        o.i(onNavigateToVerify, "onNavigateToVerify");
        o.i(onNavigateToSignIn, "onNavigateToSignIn");
        androidx.compose.runtime.a h11 = aVar.h(-2056665371);
        if ((i12 & 2) != 0) {
            h11.C(1890788296);
            x0 a11 = LocalViewModelStoreOwner.f12907a.a(h11, LocalViewModelStoreOwner.f12909c);
            if (a11 != null) {
                t0.b a12 = r3.a.a(a11, h11, 0);
                h11.C(1729797275);
                if (a11 instanceof androidx.lifecycle.l) {
                    aVar2 = ((androidx.lifecycle.l) a11).getDefaultViewModelCreationExtras();
                } else {
                    aVar2 = a.C0905a.f75031b;
                }
                q0 b11 = x3.a.b(SignUpViewModel.class, a11, null, a12, aVar2, h11, 36936, 0);
                h11.S();
                h11.S();
                signUpViewModel2 = (SignUpViewModel) b11;
                i13 = i11 & (-113);
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        } else {
            signUpViewModel2 = signUpViewModel;
            i13 = i11;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-2056665371, i13, -1, "com.forsale.app.features.auth.signup.SignUpScreen (SignUpRoute.kt:60)");
        }
        n1 b12 = z.b(signUpViewModel2.B(), null, h11, 8, 1);
        h11.C(-492369756);
        Object D = h11.D();
        a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
        if (D == c0064a.a()) {
            D = new TextFieldState(new SignUpRouteKt$SignUpScreen$phoneNumberState$1$1(signUpViewModel2), signUpViewModel2.E());
            h11.u(D);
        }
        h11.S();
        final TextFieldState textFieldState = (TextFieldState) D;
        h11.C(-492369756);
        Object D2 = h11.D();
        if (D2 == c0064a.a()) {
            D2 = new TextFieldState(new SignUpRouteKt$SignUpScreen$nameState$1$1(signUpViewModel2), signUpViewModel2.C());
            h11.u(D2);
        }
        h11.S();
        final TextFieldState textFieldState2 = (TextFieldState) D2;
        h11.C(-492369756);
        Object D3 = h11.D();
        if (D3 == c0064a.a()) {
            D3 = new TextFieldState(new SignUpRouteKt$SignUpScreen$emailState$1$1(signUpViewModel2), signUpViewModel2.A());
            h11.u(D3);
        }
        h11.S();
        final TextFieldState textFieldState3 = (TextFieldState) D3;
        h11.C(-492369756);
        Object D4 = h11.D();
        if (D4 == c0064a.a()) {
            D4 = new TextFieldState(new SignUpRouteKt$SignUpScreen$passwordState$1$1(signUpViewModel2), signUpViewModel2.D());
            h11.u(D4);
        }
        h11.S();
        final TextFieldState textFieldState4 = (TextFieldState) D4;
        c(new g00.p<s, Lifecycle.Event, p>() { // from class: com.forsale.app.features.auth.signup.SignUpRouteKt$SignUpScreen$1

            /* compiled from: SignUpRoute.kt */
            /* loaded from: classes2.dex */
            public /* synthetic */ class a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f22853a;

                static {
                    int[] iArr = new int[Lifecycle.Event.values().length];
                    try {
                        iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f22853a = iArr;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(s owner, Lifecycle.Event event) {
                o.i(owner, "owner");
                o.i(event, "event");
                if (a.f22853a[event.ordinal()] == 1) {
                    AuthViewModel.this.f();
                    textFieldState4.m("");
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(s sVar, Lifecycle.Event event) {
                b(sVar, event);
                return p.f75480a;
            }
        }, h11, 0);
        u.d(p.f75480a, new SignUpRouteKt$SignUpScreen$2(signUpViewModel2, sharedViewModel, null), h11, 70);
        a(signUpViewModel2, textFieldState4, textFieldState, textFieldState3, textFieldState2, h11, 37448);
        int i14 = i13 >> 6;
        f(signUpViewModel2, onNavigateToVerify, h11, (i14 & 112) | 8);
        h11.C(-772117044);
        if (e(b12)) {
            LoadingDialogKt.a(h11, 0);
        }
        h11.S();
        c.a aVar3 = androidx.compose.ui.c.f7566a;
        float f11 = 16;
        androidx.compose.ui.c d11 = SizeKt.d(PaddingKt.m(aVar3, h.l(f11), h.l(f11), h.l(f11), 0.0f, 8, null), 0.0f, 1, null);
        h11.C(-483455358);
        Arrangement arrangement = Arrangement.f3698a;
        Arrangement.m h12 = arrangement.h();
        b.a aVar4 = v0.b.f74009a;
        a0 a13 = e.a(h12, aVar4.k(), h11, 0);
        h11.C(-1323940314);
        int a14 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a15 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(d11);
        if (!(h11.k() instanceof d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a15);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a16 = Updater.a(h11);
        Updater.c(a16, a13, companion.e());
        Updater.c(a16, s11, companion.g());
        g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
        if (a16.f() || !o.d(a16.D(), Integer.valueOf(a14))) {
            a16.u(Integer.valueOf(a14));
            a16.p(Integer.valueOf(a14), b13);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        String b14 = g.b(y0.f70614p0, h11, 0);
        dk.a aVar5 = dk.a.f54291a;
        int i15 = dk.a.f54292b;
        final SignUpViewModel signUpViewModel3 = signUpViewModel2;
        TextKt.a(b14, null, 0, 0, false, 0, 0, null, aVar5.c(h11, i15).k(), 0L, 0, h11, 0, 0, 1790);
        TextKt.a(g.b(y0.f70563m0, h11, 0), null, 0, 0, false, 0, 0, null, aVar5.c(h11, i15).b(), 0L, 0, h11, 0, 0, 1790);
        float f12 = 8;
        SpacerKt.a(SizeKt.i(aVar3, h.l(f12)), h11, 6);
        PhoneFieldKt.a(sharedViewModel, textFieldState, new SignUpRouteKt$SignUpScreen$3$1(signUpViewModel3), h11, 72, 0);
        SpacerKt.a(SizeKt.i(aVar3, h.l(f12)), h11, 6);
        NameTextFieldKt.a(sharedViewModel.m(), textFieldState2, new SignUpRouteKt$SignUpScreen$3$2(signUpViewModel3), h11, 72);
        float f13 = 4;
        SpacerKt.a(SizeKt.i(aVar3, h.l(f13)), h11, 6);
        EmailTextFieldKt.a(sharedViewModel.m(), textFieldState3, new SignUpRouteKt$SignUpScreen$3$3(signUpViewModel3), h11, 72);
        SpacerKt.a(SizeKt.i(aVar3, h.l(f13)), h11, 6);
        PasswordTextFieldKt.a(sharedViewModel.m(), aVar3, textFieldState4, new l<Boolean, p>() { // from class: com.forsale.app.features.auth.signup.SignUpRouteKt$SignUpScreen$3$5
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return p.f75480a;
            }

            public final void invoke(boolean z11) {
                AuthViewModel.this.r(z11, AuthenticationType.SIGNUP);
            }
        }, 0, false, false, new SignUpRouteKt$SignUpScreen$3$4(signUpViewModel3), h11, 568, 112);
        SpacerKt.a(SizeKt.i(aVar3, h.l(f11)), h11, 6);
        ButtonsKt.j(new g00.a<p>() { // from class: com.forsale.app.features.auth.signup.SignUpRouteKt$SignUpScreen$3$6
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
                ma.a.a(TextFieldState.this, textFieldState2, textFieldState3, textFieldState4);
                signUpViewModel3.S(sharedViewModel.m(), ContextExtensionsKt.x(context));
            }
        }, TestTagKt.a(SizeKt.i(SizeKt.h(aVar3, 0.0f, 1, null), h.l(48)), ComponentsTags.SIGN_UP_BUTTON.getTag()), null, null, false, false, null, ComposableSingletons$SignUpRouteKt.f22815a.a(), h11, 12582960, 124);
        androidx.compose.ui.c a17 = TestTagKt.a(PaddingKt.m(fVar.b(aVar3, aVar4.g()), 0.0f, h.l(26), 0.0f, 0.0f, 13, null), ComponentsTags.LOGIN_BUTTON.getTag());
        String b15 = g.b(y0.f70512j0, h11, 0);
        int i16 = y0.f70546l0;
        h11.C(1157296644);
        boolean T = h11.T(onNavigateToSignIn);
        Object D5 = h11.D();
        if (T || D5 == c0064a.a()) {
            D5 = new g00.a<p>() { // from class: com.forsale.app.features.auth.signup.SignUpRouteKt$SignUpScreen$3$7$1
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
                    onNavigateToSignIn.invoke();
                }
            };
            h11.u(D5);
        }
        h11.S();
        ClickableTextKt.b(a17, b15, i16, (g00.a) D5, h11, 0, 0);
        SpacerKt.a(w.e.c(fVar, aVar3, 1.0f, false, 2, null), h11, 0);
        androidx.compose.ui.c b16 = fVar.b(PaddingKt.m(aVar3, 0.0f, 0.0f, 0.0f, h.l(12), 7, null), aVar4.g());
        h11.C(-483455358);
        a0 a18 = e.a(arrangement.h(), aVar4.k(), h11, 0);
        h11.C(-1323940314);
        int a19 = j0.e.a(h11, 0);
        k s12 = h11.s();
        g00.a<ComposeUiNode> a21 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(b16);
        if (!(h11.k() instanceof d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a21);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a22 = Updater.a(h11);
        Updater.c(a22, a18, companion.e());
        Updater.c(a22, s12, companion.g());
        g00.p<ComposeUiNode, Integer, p> b17 = companion.b();
        if (a22.f() || !o.d(a22.D(), Integer.valueOf(a19))) {
            a22.u(Integer.valueOf(a19));
            a22.p(Integer.valueOf(a19), b17);
        }
        c12.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        b(context, h11, i14 & 14);
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
        if (l11 == null) {
            return;
        }
        l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.signup.SignUpRouteKt$SignUpScreen$4
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar6, int i17) {
                SignUpRouteKt.d(AuthViewModel.this, signUpViewModel3, context, onNavigateToVerify, onNavigateToSignIn, aVar6, v0.a(i11 | 1), i12);
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar6, Integer num) {
                b(aVar6, num.intValue());
                return p.f75480a;
            }
        });
    }

    private static final boolean e(n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final SignUpViewModel signUpViewModel, final g00.a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
        androidx.compose.runtime.a h11 = aVar2.h(1837997407);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1837997407, i11, -1, "com.forsale.app.features.auth.signup.ViewStateObservers (SignUpRoute.kt:248)");
        }
        u.d(p.f75480a, new SignUpRouteKt$ViewStateObservers$1(signUpViewModel, aVar, null), h11, 70);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.signup.SignUpRouteKt$ViewStateObservers$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i12) {
                    SignUpRouteKt.f(SignUpViewModel.this, aVar, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }
}
