package com.forsale.app.features.auth.forgotpassword;

import androidx.compose.runtime.c0;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import com.forsale.app.features.auth.interactors.validationinteractors.a;
import com.forsale.app.features.auth.interactors.validationinteractors.d;
import com.forsale.app.features.auth.interactors.validationinteractors.f;
import com.forsale.app.features.auth.interactors.validationinteractors.h;
import com.forsale.app.features.auth.utils.AuthErrorHandler;
import com.forsale.app.features.auth.utils.AuthServerErrorsState;
import com.forsale.app.utils.analytics.auth.AuthenticationSourcePage;
import g00.l;
import ga.c;
import ha.b;
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
/* compiled from: ResetPasswordViewModel.kt */
/* loaded from: classes2.dex */
public final class ResetPasswordViewModel extends q0 {
    private final SharedFlow<String> A;
    private final MutableStateFlow<Boolean> B;
    private final StateFlow<Boolean> C;

    /* renamed from: a  reason: collision with root package name */
    private final f f22701a;

    /* renamed from: b  reason: collision with root package name */
    private final a f22702b;

    /* renamed from: c  reason: collision with root package name */
    private final b f22703c;

    /* renamed from: d  reason: collision with root package name */
    private final c f22704d;

    /* renamed from: e  reason: collision with root package name */
    private final d f22705e;

    /* renamed from: f  reason: collision with root package name */
    private final AuthErrorHandler f22706f;

    /* renamed from: g  reason: collision with root package name */
    private final String f22707g;

    /* renamed from: h  reason: collision with root package name */
    private final k0 f22708h;

    /* renamed from: i  reason: collision with root package name */
    private final MutableStateFlow<rj.a> f22709i;

    /* renamed from: j  reason: collision with root package name */
    private final StateFlow<rj.a> f22710j;

    /* renamed from: x  reason: collision with root package name */
    private final MutableStateFlow<rj.a> f22711x;

    /* renamed from: y  reason: collision with root package name */
    private final StateFlow<rj.a> f22712y;

    /* renamed from: z  reason: collision with root package name */
    private final MutableSharedFlow<String> f22713z;

    public ResetPasswordViewModel(f passwordValidationInteractor, a confirmPasswordValidationInteractor, b forgotPasswordAnalyticsInteractor, c resetPasswordInteractor, d fieldsValidatorIneractor, AuthErrorHandler errorHandler, androidx.lifecycle.k0 savedStateHandle) {
        k0 e11;
        o.i(passwordValidationInteractor, "passwordValidationInteractor");
        o.i(confirmPasswordValidationInteractor, "confirmPasswordValidationInteractor");
        o.i(forgotPasswordAnalyticsInteractor, "forgotPasswordAnalyticsInteractor");
        o.i(resetPasswordInteractor, "resetPasswordInteractor");
        o.i(fieldsValidatorIneractor, "fieldsValidatorIneractor");
        o.i(errorHandler, "errorHandler");
        o.i(savedStateHandle, "savedStateHandle");
        this.f22701a = passwordValidationInteractor;
        this.f22702b = confirmPasswordValidationInteractor;
        this.f22703c = forgotPasswordAnalyticsInteractor;
        this.f22704d = resetPasswordInteractor;
        this.f22705e = fieldsValidatorIneractor;
        this.f22706f = errorHandler;
        Object f11 = savedStateHandle.f("OTP_ARG");
        if (f11 != null) {
            this.f22707g = (String) f11;
            e11 = c0.e(AuthenticationSourcePage.LOGIN, null, 2, null);
            this.f22708h = e11;
            MutableStateFlow<rj.a> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
            this.f22709i = MutableStateFlow;
            this.f22710j = FlowKt.asStateFlow(MutableStateFlow);
            MutableStateFlow<rj.a> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
            this.f22711x = MutableStateFlow2;
            this.f22712y = FlowKt.asStateFlow(MutableStateFlow2);
            MutableSharedFlow<String> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
            this.f22713z = MutableSharedFlow$default;
            this.A = FlowKt.asSharedFlow(MutableSharedFlow$default);
            MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
            this.B = MutableStateFlow3;
            this.C = FlowKt.asStateFlow(MutableStateFlow3);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m(String str, String str2) {
        return this.f22705e.a(t(str), s(str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(bj.c cVar) {
        if (cVar instanceof AuthServerErrorsState.ValidationError) {
            AuthServerErrorsState.ValidationError.c((AuthServerErrorsState.ValidationError) cVar, null, null, null, null, null, null, new l<String, p>() { // from class: com.forsale.app.features.auth.forgotpassword.ResetPasswordViewModel$onResetPasswordFailed$1
                public final void b(String it2) {
                    o.i(it2, "it");
                    x10.a.b(it2, new Object[0]);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(String str) {
                    b(str);
                    return p.f75480a;
                }
            }, 63, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(java.lang.String r5, zz.a<? super wz.p> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.app.features.auth.forgotpassword.ResetPasswordViewModel$onResetPasswordSuccess$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.features.auth.forgotpassword.ResetPasswordViewModel$onResetPasswordSuccess$1 r0 = (com.forsale.app.features.auth.forgotpassword.ResetPasswordViewModel$onResetPasswordSuccess$1) r0
            int r1 = r0.f22718d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22718d = r1
            goto L18
        L13:
            com.forsale.app.features.auth.forgotpassword.ResetPasswordViewModel$onResetPasswordSuccess$1 r0 = new com.forsale.app.features.auth.forgotpassword.ResetPasswordViewModel$onResetPasswordSuccess$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f22716b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f22718d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f22715a
            com.forsale.app.features.auth.forgotpassword.ResetPasswordViewModel r5 = (com.forsale.app.features.auth.forgotpassword.ResetPasswordViewModel) r5
            kotlin.f.b(r6)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r6)
            kotlinx.coroutines.flow.MutableSharedFlow<java.lang.String> r6 = r4.f22713z
            r0.f22715a = r4
            r0.f22718d = r3
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            ha.b r5 = r5.f22703c
            r5.c()
            wz.p r5 = wz.p.f75480a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.auth.forgotpassword.ResetPasswordViewModel.w(java.lang.String, zz.a):java.lang.Object");
    }

    private final void z(AuthenticationSourcePage authenticationSourcePage) {
        this.f22708h.setValue(authenticationSourcePage);
    }

    public final StateFlow<rj.a> o() {
        return this.f22712y;
    }

    public final StateFlow<Boolean> p() {
        return this.C;
    }

    public final SharedFlow<String> q() {
        return this.A;
    }

    public final StateFlow<rj.a> r() {
        return this.f22710j;
    }

    public final h s(String password, String confirmPassword) {
        o.i(password, "password");
        o.i(confirmPassword, "confirmPassword");
        h b11 = a.b(this.f22702b, password, confirmPassword, null, 4, null);
        if (b11 instanceof h.a) {
            MutableStateFlow<rj.a> mutableStateFlow = this.f22711x;
            Integer errorMessageRes = ((h.a) b11).a().getErrorMessageRes();
            o.f(errorMessageRes);
            mutableStateFlow.setValue(new a.b(errorMessageRes.intValue(), new Object[0]));
        }
        return b11;
    }

    public final h t(String password) {
        o.i(password, "password");
        h b11 = f.b(this.f22701a, password, null, 2, null);
        if (b11 instanceof h.a) {
            MutableStateFlow<rj.a> mutableStateFlow = this.f22709i;
            Integer errorMessageRes = ((h.a) b11).a().getErrorMessageRes();
            o.f(errorMessageRes);
            mutableStateFlow.setValue(new a.b(errorMessageRes.intValue(), new Object[0]));
        }
        return b11;
    }

    public final void x(AuthenticationSourcePage authenticationSourcePage) {
        o.i(authenticationSourcePage, "authenticationSourcePage");
        z(authenticationSourcePage);
        this.f22703c.a(new pi.a(null, 1, null));
    }

    public final Job y(String fullPhoneNumber, String password, String passwordConformation) {
        Job launch$default;
        o.i(fullPhoneNumber, "fullPhoneNumber");
        o.i(password, "password");
        o.i(passwordConformation, "passwordConformation");
        launch$default = BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new ResetPasswordViewModel$resetPassword$1(this, password, passwordConformation, fullPhoneNumber, null), 3, null);
        return launch$default;
    }
}
