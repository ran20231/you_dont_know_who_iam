package com.forsale.app.features.auth.login;

import androidx.compose.runtime.c0;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import bj.c;
import com.forsale.app.features.auth.interactors.SignInInteractor;
import com.forsale.app.features.auth.interactors.validationinteractors.f;
import com.forsale.app.features.auth.interactors.validationinteractors.g;
import com.forsale.app.features.auth.interactors.validationinteractors.h;
import com.forsale.app.features.auth.utils.AuthErrorHandler;
import com.forsale.app.features.auth.utils.AuthServerErrorsState;
import com.forsale.app.utils.analytics.auth.AuthenticationSourcePage;
import g00.l;
import g00.p;
import ha.d;
import j0.k0;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import rj.a;
/* compiled from: SignInViewModel.kt */
/* loaded from: classes2.dex */
public final class SignInViewModel extends q0 {
    private final MutableStateFlow<a> A;
    private final StateFlow<a> B;
    private final MutableStateFlow<Boolean> C;
    private final StateFlow<Boolean> D;
    private final MutableStateFlow<String> E;
    private final StateFlow<String> F;
    private final MutableSharedFlow<String> G;
    private final SharedFlow<String> H;

    /* renamed from: a  reason: collision with root package name */
    private final d f22777a;

    /* renamed from: b  reason: collision with root package name */
    private final SignInInteractor f22778b;

    /* renamed from: c  reason: collision with root package name */
    private final com.forsale.app.features.auth.interactors.validationinteractors.d f22779c;

    /* renamed from: d  reason: collision with root package name */
    private final g f22780d;

    /* renamed from: e  reason: collision with root package name */
    private final f f22781e;

    /* renamed from: f  reason: collision with root package name */
    private final AuthErrorHandler f22782f;

    /* renamed from: g  reason: collision with root package name */
    private final String f22783g;

    /* renamed from: h  reason: collision with root package name */
    private final SignInIntention f22784h;

    /* renamed from: i  reason: collision with root package name */
    private final k0 f22785i;

    /* renamed from: j  reason: collision with root package name */
    private final MutableStateFlow<Pair<a, a>> f22786j;

    /* renamed from: x  reason: collision with root package name */
    private final StateFlow<Pair<a, a>> f22787x;

    /* renamed from: y  reason: collision with root package name */
    private final MutableStateFlow<a> f22788y;

    /* renamed from: z  reason: collision with root package name */
    private final StateFlow<a> f22789z;

    /* compiled from: SignInViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.auth.login.SignInViewModel$1", f = "SignInViewModel.kt", l = {61}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.auth.login.SignInViewModel$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f22790a;

        AnonymousClass1(zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f22790a;
            if (i11 != 0) {
                if (i11 == 1) {
                    kotlin.f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.f.b(obj);
                MutableStateFlow mutableStateFlow = SignInViewModel.this.f22786j;
                Pair pair = new Pair(new a.b(SignInViewModel.this.z().getTitle(), new Object[0]), new a.b(SignInViewModel.this.z().getDescription(), new Object[0]));
                this.f22790a = 1;
                if (mutableStateFlow.emit(pair, this) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    public SignInViewModel(d analyticsInteractor, SignInInteractor signInInteractor, com.forsale.app.features.auth.interactors.validationinteractors.d fieldsValidatorInteractor, g phoneNumberValidatorInteractor, f passwordValidationInteractor, AuthErrorHandler errorHandler, androidx.lifecycle.k0 savedStateHandle) {
        k0 e11;
        o.i(analyticsInteractor, "analyticsInteractor");
        o.i(signInInteractor, "signInInteractor");
        o.i(fieldsValidatorInteractor, "fieldsValidatorInteractor");
        o.i(phoneNumberValidatorInteractor, "phoneNumberValidatorInteractor");
        o.i(passwordValidationInteractor, "passwordValidationInteractor");
        o.i(errorHandler, "errorHandler");
        o.i(savedStateHandle, "savedStateHandle");
        this.f22777a = analyticsInteractor;
        this.f22778b = signInInteractor;
        this.f22779c = fieldsValidatorInteractor;
        this.f22780d = phoneNumberValidatorInteractor;
        this.f22781e = passwordValidationInteractor;
        this.f22782f = errorHandler;
        String str = (String) savedStateHandle.f("PHONE_PREFIX_ARG");
        this.f22783g = str == null ? "" : str;
        Object f11 = savedStateHandle.f("SIGN_IN_INTENTION");
        if (f11 != null) {
            this.f22784h = (SignInIntention) f11;
            e11 = c0.e(AuthenticationSourcePage.PROFILE, null, 2, null);
            this.f22785i = e11;
            SignInIntention signInIntention = SignInIntention.DEFAULT;
            MutableStateFlow<Pair<a, a>> MutableStateFlow = StateFlowKt.MutableStateFlow(new Pair(new a.b(signInIntention.getTitle(), new Object[0]), new a.b(signInIntention.getDescription(), new Object[0])));
            this.f22786j = MutableStateFlow;
            this.f22787x = FlowKt.asStateFlow(MutableStateFlow);
            BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new AnonymousClass1(null), 3, null);
            MutableStateFlow<a> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
            this.f22788y = MutableStateFlow2;
            this.f22789z = FlowKt.asStateFlow(MutableStateFlow2);
            MutableStateFlow<a> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
            this.A = MutableStateFlow3;
            this.B = FlowKt.asStateFlow(MutableStateFlow3);
            MutableStateFlow<Boolean> MutableStateFlow4 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
            this.C = MutableStateFlow4;
            this.D = FlowKt.asStateFlow(MutableStateFlow4);
            MutableStateFlow<String> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
            this.E = MutableStateFlow5;
            this.F = FlowKt.asStateFlow(MutableStateFlow5);
            MutableSharedFlow<String> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
            this.G = MutableSharedFlow$default;
            this.H = FlowKt.asSharedFlow(MutableSharedFlow$default);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(String str) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new SignInViewModel$onScreenFailed$1(this, str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(java.lang.String r6, java.lang.String r7, zz.a<? super wz.p> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.forsale.app.features.auth.login.SignInViewModel$onScreenSuccess$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.features.auth.login.SignInViewModel$onScreenSuccess$1 r0 = (com.forsale.app.features.auth.login.SignInViewModel$onScreenSuccess$1) r0
            int r1 = r0.f22804d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22804d = r1
            goto L18
        L13:
            com.forsale.app.features.auth.login.SignInViewModel$onScreenSuccess$1 r0 = new com.forsale.app.features.auth.login.SignInViewModel$onScreenSuccess$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f22802b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f22804d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r8)
            goto L6a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f22801a
            com.forsale.app.features.auth.login.SignInViewModel r6 = (com.forsale.app.features.auth.login.SignInViewModel) r6
            kotlin.f.b(r8)
            goto L57
        L3c:
            kotlin.f.b(r8)
            ha.d r8 = r5.f22777a
            ri.b r2 = new ri.b
            r2.<init>(r6)
            r8.a(r2)
            kotlinx.coroutines.flow.MutableSharedFlow<java.lang.String> r6 = r5.G
            r0.f22801a = r5
            r0.f22804d = r4
            java.lang.Object r6 = r6.emit(r7, r0)
            if (r6 != r1) goto L56
            return r1
        L56:
            r6 = r5
        L57:
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r6 = r6.C
            r7 = 0
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.a.a(r7)
            r8 = 0
            r0.f22801a = r8
            r0.f22804d = r3
            java.lang.Object r6 = r6.emit(r7, r0)
            if (r6 != r1) goto L6a
            return r1
        L6a:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.auth.login.SignInViewModel.M(java.lang.String, java.lang.String, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(c cVar) {
        if (cVar instanceof AuthServerErrorsState.ValidationError) {
            AuthServerErrorsState.ValidationError.c((AuthServerErrorsState.ValidationError) cVar, new l<String, wz.p>() { // from class: com.forsale.app.features.auth.login.SignInViewModel$onSignInFailed$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(String it2) {
                    MutableStateFlow mutableStateFlow;
                    o.i(it2, "it");
                    mutableStateFlow = SignInViewModel.this.A;
                    mutableStateFlow.setValue(new a.C0804a(it2));
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(String str) {
                    b(str);
                    return wz.p.f75480a;
                }
            }, new l<String, wz.p>() { // from class: com.forsale.app.features.auth.login.SignInViewModel$onSignInFailed$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(String it2) {
                    MutableStateFlow mutableStateFlow;
                    o.i(it2, "it");
                    mutableStateFlow = SignInViewModel.this.f22788y;
                    mutableStateFlow.setValue(new a.C0804a(it2));
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(String str) {
                    b(str);
                    return wz.p.f75480a;
                }
            }, null, null, null, null, new l<String, wz.p>() { // from class: com.forsale.app.features.auth.login.SignInViewModel$onSignInFailed$3
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(String it2) {
                    o.i(it2, "it");
                    SignInViewModel.this.K(it2);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(String str) {
                    b(str);
                    return wz.p.f75480a;
                }
            }, 60, null);
        } else if (cVar instanceof AuthServerErrorsState.b) {
            this.E.setValue(((AuthServerErrorsState.b) cVar).b());
        }
    }

    private final void O(AuthenticationSourcePage authenticationSourcePage) {
        this.f22785i.setValue(authenticationSourcePage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean t(String str, String str2) {
        return this.f22779c.a(H(str), I(str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        if (this.E.getValue() != null) {
            this.E.setValue(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AuthenticationSourcePage y() {
        return (AuthenticationSourcePage) this.f22785i.getValue();
    }

    public final StateFlow<Boolean> A() {
        return this.D;
    }

    public final SharedFlow<String> B() {
        return this.H;
    }

    public final StateFlow<a> C() {
        return this.f22789z;
    }

    public final StateFlow<a> D() {
        return this.B;
    }

    public final String E() {
        return this.f22783g;
    }

    public final StateFlow<Pair<a, a>> F() {
        return this.f22787x;
    }

    public final StateFlow<String> G() {
        return this.F;
    }

    public final h H(String password) {
        o.i(password, "password");
        h b11 = f.b(this.f22781e, password, null, 2, null);
        if (b11 instanceof h.a) {
            MutableStateFlow<a> mutableStateFlow = this.f22788y;
            Integer errorMessageRes = ((h.a) b11).a().getErrorMessageRes();
            o.f(errorMessageRes);
            mutableStateFlow.setValue(new a.b(errorMessageRes.intValue(), new Object[0]));
        }
        return b11;
    }

    public final h I(String phoneNumber) {
        o.i(phoneNumber, "phoneNumber");
        g gVar = this.f22780d;
        String str = this.f22783g;
        h a11 = gVar.a(str + phoneNumber, this.f22783g);
        if (a11 instanceof h.a) {
            MutableStateFlow<a> mutableStateFlow = this.A;
            Integer errorMessageRes = ((h.a) a11).a().getErrorMessageRes();
            o.f(errorMessageRes);
            mutableStateFlow.setValue(new a.b(errorMessageRes.intValue(), new Object[0]));
        }
        return a11;
    }

    public final Job J(String phoneNumber, String password) {
        Job launch$default;
        o.i(phoneNumber, "phoneNumber");
        o.i(password, "password");
        launch$default = BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new SignInViewModel$login$1(this, phoneNumber, password, null), 3, null);
        return launch$default;
    }

    public final void L(AuthenticationSourcePage authenticationSourcePage) {
        o.i(authenticationSourcePage, "authenticationSourcePage");
        O(authenticationSourcePage);
        this.f22777a.b(new ri.a(authenticationSourcePage, null, 2, null));
    }

    public final void w() {
        this.f22788y.setValue(null);
    }

    public final void x() {
        this.A.setValue(null);
    }

    public final SignInIntention z() {
        return this.f22784h;
    }
}
