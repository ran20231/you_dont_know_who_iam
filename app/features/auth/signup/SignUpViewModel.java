package com.forsale.app.features.auth.signup;

import androidx.compose.runtime.c0;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import bj.c;
import com.forsale.app.features.auth.interactors.validationinteractors.f;
import com.forsale.app.features.auth.interactors.validationinteractors.g;
import com.forsale.app.features.auth.interactors.validationinteractors.h;
import com.forsale.app.features.auth.utils.AuthErrorHandler;
import com.forsale.app.features.auth.utils.AuthServerErrorsState;
import com.forsale.app.utils.analytics.auth.AuthenticationSourcePage;
import g00.l;
import ga.d;
import ha.e;
import j0.k0;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import rj.a;
import wz.p;
/* compiled from: SignUpViewModel.kt */
/* loaded from: classes2.dex */
public final class SignUpViewModel extends q0 {
    private final MutableStateFlow<rj.a> A;
    private final StateFlow<rj.a> B;
    private final MutableStateFlow<rj.a> C;
    private final StateFlow<rj.a> D;
    private final MutableStateFlow<Boolean> E;
    private final StateFlow<Boolean> F;
    private final MutableSharedFlow<Boolean> G;
    private final SharedFlow<Boolean> H;
    private final k0 I;

    /* renamed from: a  reason: collision with root package name */
    private final d f22880a;

    /* renamed from: b  reason: collision with root package name */
    private final e f22881b;

    /* renamed from: c  reason: collision with root package name */
    private final com.forsale.app.features.auth.interactors.validationinteractors.d f22882c;

    /* renamed from: d  reason: collision with root package name */
    private final g f22883d;

    /* renamed from: e  reason: collision with root package name */
    private final com.forsale.app.features.auth.interactors.validationinteractors.e f22884e;

    /* renamed from: f  reason: collision with root package name */
    private final f f22885f;

    /* renamed from: g  reason: collision with root package name */
    private final com.forsale.app.features.auth.interactors.validationinteractors.b f22886g;

    /* renamed from: h  reason: collision with root package name */
    private final AuthErrorHandler f22887h;

    /* renamed from: i  reason: collision with root package name */
    private final String f22888i;

    /* renamed from: j  reason: collision with root package name */
    private final MutableStateFlow<rj.a> f22889j;

    /* renamed from: x  reason: collision with root package name */
    private final StateFlow<rj.a> f22890x;

    /* renamed from: y  reason: collision with root package name */
    private final MutableStateFlow<rj.a> f22891y;

    /* renamed from: z  reason: collision with root package name */
    private final StateFlow<rj.a> f22892z;

    public SignUpViewModel(d signUpInteractor, e signUpAnalyticsInteractor, com.forsale.app.features.auth.interactors.validationinteractors.d fieldsValidatorInteractor, g phoneNumberValidatorInteractor, com.forsale.app.features.auth.interactors.validationinteractors.e nameValidatorInteractor, f passwordValidationInteractor, com.forsale.app.features.auth.interactors.validationinteractors.b emailValidatorInteractor, AuthErrorHandler errorHandler, androidx.lifecycle.k0 savedStateHandle) {
        k0 e11;
        o.i(signUpInteractor, "signUpInteractor");
        o.i(signUpAnalyticsInteractor, "signUpAnalyticsInteractor");
        o.i(fieldsValidatorInteractor, "fieldsValidatorInteractor");
        o.i(phoneNumberValidatorInteractor, "phoneNumberValidatorInteractor");
        o.i(nameValidatorInteractor, "nameValidatorInteractor");
        o.i(passwordValidationInteractor, "passwordValidationInteractor");
        o.i(emailValidatorInteractor, "emailValidatorInteractor");
        o.i(errorHandler, "errorHandler");
        o.i(savedStateHandle, "savedStateHandle");
        this.f22880a = signUpInteractor;
        this.f22881b = signUpAnalyticsInteractor;
        this.f22882c = fieldsValidatorInteractor;
        this.f22883d = phoneNumberValidatorInteractor;
        this.f22884e = nameValidatorInteractor;
        this.f22885f = passwordValidationInteractor;
        this.f22886g = emailValidatorInteractor;
        this.f22887h = errorHandler;
        String str = (String) savedStateHandle.f("PHONE_PREFIX_ARG");
        this.f22888i = str == null ? "" : str;
        MutableStateFlow<rj.a> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.f22889j = MutableStateFlow;
        this.f22890x = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<rj.a> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.f22891y = MutableStateFlow2;
        this.f22892z = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<rj.a> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.A = MutableStateFlow3;
        this.B = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<rj.a> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.C = MutableStateFlow4;
        this.D = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<Boolean> MutableStateFlow5 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.E = MutableStateFlow5;
        this.F = FlowKt.asStateFlow(MutableStateFlow5);
        MutableSharedFlow<Boolean> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.G = MutableSharedFlow$default;
        this.H = FlowKt.asSharedFlow(MutableSharedFlow$default);
        e11 = c0.e(AuthenticationSourcePage.PROFILE, null, 2, null);
        this.I = e11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(String str) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new SignUpViewModel$onScreenFailed$1(this, str, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(c cVar) {
        if (cVar instanceof AuthServerErrorsState.ValidationError) {
            AuthServerErrorsState.ValidationError.c((AuthServerErrorsState.ValidationError) cVar, new l<String, p>() { // from class: com.forsale.app.features.auth.signup.SignUpViewModel$onSignUpFailed$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(String it2) {
                    MutableStateFlow mutableStateFlow;
                    o.i(it2, "it");
                    mutableStateFlow = SignUpViewModel.this.f22891y;
                    mutableStateFlow.setValue(new a.C0804a(it2));
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(String str) {
                    b(str);
                    return p.f75480a;
                }
            }, new l<String, p>() { // from class: com.forsale.app.features.auth.signup.SignUpViewModel$onSignUpFailed$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(String it2) {
                    MutableStateFlow mutableStateFlow;
                    o.i(it2, "it");
                    mutableStateFlow = SignUpViewModel.this.f22889j;
                    mutableStateFlow.setValue(new a.C0804a(it2));
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(String str) {
                    b(str);
                    return p.f75480a;
                }
            }, null, null, new l<String, p>() { // from class: com.forsale.app.features.auth.signup.SignUpViewModel$onSignUpFailed$3
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(String it2) {
                    MutableStateFlow mutableStateFlow;
                    o.i(it2, "it");
                    mutableStateFlow = SignUpViewModel.this.C;
                    mutableStateFlow.setValue(new a.C0804a(it2));
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(String str) {
                    b(str);
                    return p.f75480a;
                }
            }, new l<String, p>() { // from class: com.forsale.app.features.auth.signup.SignUpViewModel$onSignUpFailed$4
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(String it2) {
                    MutableStateFlow mutableStateFlow;
                    o.i(it2, "it");
                    mutableStateFlow = SignUpViewModel.this.A;
                    mutableStateFlow.setValue(new a.C0804a(it2));
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(String str) {
                    b(str);
                    return p.f75480a;
                }
            }, new l<String, p>() { // from class: com.forsale.app.features.auth.signup.SignUpViewModel$onSignUpFailed$5
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(String it2) {
                    o.i(it2, "it");
                    SignUpViewModel.this.L(it2);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(String str) {
                    b(str);
                    return p.f75480a;
                }
            }, 12, null);
            return;
        }
        o.g(cVar, "null cannot be cast to non-null type com.forsale.app.features.auth.utils.AuthServerErrorsState");
        x10.a.b(((AuthServerErrorsState) cVar).a(), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(zz.a<? super wz.p> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.features.auth.signup.SignUpViewModel$onSignUpSuccess$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.features.auth.signup.SignUpViewModel$onSignUpSuccess$1 r0 = (com.forsale.app.features.auth.signup.SignUpViewModel$onSignUpSuccess$1) r0
            int r1 = r0.f22904d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22904d = r1
            goto L18
        L13:
            com.forsale.app.features.auth.signup.SignUpViewModel$onSignUpSuccess$1 r0 = new com.forsale.app.features.auth.signup.SignUpViewModel$onSignUpSuccess$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f22902b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f22904d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r6)
            goto L64
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f22901a
            com.forsale.app.features.auth.signup.SignUpViewModel r2 = (com.forsale.app.features.auth.signup.SignUpViewModel) r2
            kotlin.f.b(r6)
            goto L52
        L3c:
            kotlin.f.b(r6)
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r6 = r5.E
            r2 = 0
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.a.a(r2)
            r0.f22901a = r5
            r0.f22904d = r4
            java.lang.Object r6 = r6.emit(r2, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r2 = r5
        L52:
            kotlinx.coroutines.flow.MutableSharedFlow<java.lang.Boolean> r6 = r2.G
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.a.a(r4)
            r4 = 0
            r0.f22901a = r4
            r0.f22904d = r3
            java.lang.Object r6 = r6.emit(r2, r0)
            if (r6 != r1) goto L64
            return r1
        L64:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.auth.signup.SignUpViewModel.O(zz.a):java.lang.Object");
    }

    private final void Q(AuthenticationSourcePage authenticationSourcePage) {
        this.I.setValue(authenticationSourcePage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean t(ja.a aVar) {
        return this.f22882c.a(I(aVar.f()), K(aVar.d()), J(aVar.c()), H(aVar.e()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AuthenticationSourcePage z() {
        return (AuthenticationSourcePage) this.I.getValue();
    }

    public final StateFlow<rj.a> A() {
        return this.D;
    }

    public final StateFlow<Boolean> B() {
        return this.F;
    }

    public final StateFlow<rj.a> C() {
        return this.B;
    }

    public final StateFlow<rj.a> D() {
        return this.f22890x;
    }

    public final StateFlow<rj.a> E() {
        return this.f22892z;
    }

    public final String F() {
        return this.f22888i;
    }

    public final SharedFlow<Boolean> G() {
        return this.H;
    }

    public final h H(String password) {
        o.i(password, "password");
        h b11 = f.b(this.f22885f, password, null, 2, null);
        if (b11 instanceof h.a) {
            MutableStateFlow<rj.a> mutableStateFlow = this.f22889j;
            Integer errorMessageRes = ((h.a) b11).a().getErrorMessageRes();
            o.f(errorMessageRes);
            mutableStateFlow.setValue(new a.b(errorMessageRes.intValue(), new Object[0]));
        }
        return b11;
    }

    public final h I(String phoneNumber) {
        o.i(phoneNumber, "phoneNumber");
        g gVar = this.f22883d;
        String str = this.f22888i;
        h a11 = gVar.a(str + phoneNumber, this.f22888i);
        if (a11 instanceof h.a) {
            MutableStateFlow<rj.a> mutableStateFlow = this.f22891y;
            Integer errorMessageRes = ((h.a) a11).a().getErrorMessageRes();
            o.f(errorMessageRes);
            mutableStateFlow.setValue(new a.b(errorMessageRes.intValue(), new Object[0]));
        }
        return a11;
    }

    public final h J(String email) {
        o.i(email, "email");
        h b11 = this.f22886g.b(email);
        if (b11 instanceof h.a) {
            MutableStateFlow<rj.a> mutableStateFlow = this.C;
            Integer errorMessageRes = ((h.a) b11).a().getErrorMessageRes();
            o.f(errorMessageRes);
            mutableStateFlow.setValue(new a.b(errorMessageRes.intValue(), new Object[0]));
        }
        return b11;
    }

    public final h K(String name) {
        o.i(name, "name");
        h b11 = this.f22884e.b(name);
        if (b11 instanceof h.a) {
            MutableStateFlow<rj.a> mutableStateFlow = this.A;
            Integer errorMessageRes = ((h.a) b11).a().getErrorMessageRes();
            o.f(errorMessageRes);
            mutableStateFlow.setValue(new a.b(errorMessageRes.intValue(), new Object[0]));
        }
        return b11;
    }

    public final void M(AuthenticationSourcePage authenticationSourcePage) {
        o.i(authenticationSourcePage, "authenticationSourcePage");
        Q(authenticationSourcePage);
        this.f22881b.a(new si.a(authenticationSourcePage, null, 2, null));
    }

    public final Job S(ja.a userModel, boolean z11) {
        Job launch$default;
        o.i(userModel, "userModel");
        launch$default = BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new SignUpViewModel$signUp$1(this, userModel, z11, null), 3, null);
        return launch$default;
    }

    public final void v() {
        this.C.setValue(null);
    }

    public final void w() {
        this.A.setValue(null);
    }

    public final void x() {
        this.f22889j.setValue(null);
    }

    public final void y() {
        this.f22891y.setValue(null);
    }
}
