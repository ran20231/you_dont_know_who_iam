package com.forsale.app.features.auth.forgotpassword;

import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import bj.c;
import com.forsale.app.features.auth.interactors.validationinteractors.g;
import com.forsale.app.features.auth.interactors.validationinteractors.h;
import com.forsale.app.features.auth.utils.AuthErrorHandler;
import com.forsale.app.features.auth.utils.AuthServerErrorsState;
import g00.l;
import ga.a;
import ha.b;
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
/* compiled from: ForgotPasswordViewModel.kt */
/* loaded from: classes2.dex */
public final class ForgotPasswordViewModel extends q0 {

    /* renamed from: a  reason: collision with root package name */
    private final g f22656a;

    /* renamed from: b  reason: collision with root package name */
    private final a f22657b;

    /* renamed from: c  reason: collision with root package name */
    private final b f22658c;

    /* renamed from: d  reason: collision with root package name */
    private final AuthErrorHandler f22659d;

    /* renamed from: e  reason: collision with root package name */
    private final String f22660e;

    /* renamed from: f  reason: collision with root package name */
    private final MutableStateFlow<rj.a> f22661f;

    /* renamed from: g  reason: collision with root package name */
    private final StateFlow<rj.a> f22662g;

    /* renamed from: h  reason: collision with root package name */
    private final MutableSharedFlow<Boolean> f22663h;

    /* renamed from: i  reason: collision with root package name */
    private final SharedFlow<Boolean> f22664i;

    /* renamed from: j  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f22665j;

    /* renamed from: x  reason: collision with root package name */
    private final StateFlow<Boolean> f22666x;

    /* renamed from: y  reason: collision with root package name */
    private final MutableStateFlow<String> f22667y;

    /* renamed from: z  reason: collision with root package name */
    private final StateFlow<String> f22668z;

    public ForgotPasswordViewModel(g phoneNumberValidatorInteractor, a forgotPasswordInteractor, b forgotPasswordAnalyticsInteractor, AuthErrorHandler errorHandler, k0 savedStateHandle) {
        o.i(phoneNumberValidatorInteractor, "phoneNumberValidatorInteractor");
        o.i(forgotPasswordInteractor, "forgotPasswordInteractor");
        o.i(forgotPasswordAnalyticsInteractor, "forgotPasswordAnalyticsInteractor");
        o.i(errorHandler, "errorHandler");
        o.i(savedStateHandle, "savedStateHandle");
        this.f22656a = phoneNumberValidatorInteractor;
        this.f22657b = forgotPasswordInteractor;
        this.f22658c = forgotPasswordAnalyticsInteractor;
        this.f22659d = errorHandler;
        String str = (String) savedStateHandle.f("PHONE_PREFIX_ARG");
        this.f22660e = str == null ? "" : str;
        MutableStateFlow<rj.a> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.f22661f = MutableStateFlow;
        this.f22662g = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<Boolean> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f22663h = MutableSharedFlow$default;
        this.f22664i = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f22665j = MutableStateFlow2;
        this.f22666x = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<String> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.f22667y = MutableStateFlow3;
        this.f22668z = FlowKt.asStateFlow(MutableStateFlow3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        if (this.f22667y.getValue() != null) {
            this.f22667y.setValue(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(c cVar) {
        if (cVar instanceof AuthServerErrorsState.ValidationError) {
            AuthServerErrorsState.ValidationError.c((AuthServerErrorsState.ValidationError) cVar, new l<String, p>() { // from class: com.forsale.app.features.auth.forgotpassword.ForgotPasswordViewModel$onForgotPasswordFailed$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(String it2) {
                    MutableStateFlow mutableStateFlow;
                    o.i(it2, "it");
                    mutableStateFlow = ForgotPasswordViewModel.this.f22661f;
                    mutableStateFlow.setValue(new a.C0804a(it2));
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(String str) {
                    b(str);
                    return p.f75480a;
                }
            }, null, null, null, null, null, new l<String, p>() { // from class: com.forsale.app.features.auth.forgotpassword.ForgotPasswordViewModel$onForgotPasswordFailed$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(String it2) {
                    b bVar;
                    o.i(it2, "it");
                    bVar = ForgotPasswordViewModel.this.f22658c;
                    bVar.b(new pi.b(it2));
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(String str) {
                    b(str);
                    return p.f75480a;
                }
            }, 62, null);
        } else if (cVar instanceof AuthServerErrorsState.b) {
            this.f22667y.setValue(((AuthServerErrorsState.b) cVar).b());
        }
    }

    public final void p() {
        this.f22661f.setValue(null);
    }

    public final Job q(String phoneNumber, boolean z11) {
        Job launch$default;
        o.i(phoneNumber, "phoneNumber");
        launch$default = BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new ForgotPasswordViewModel$forgotPassword$1(this, phoneNumber, z11, null), 3, null);
        return launch$default;
    }

    public final StateFlow<Boolean> r() {
        return this.f22666x;
    }

    public final StateFlow<rj.a> s() {
        return this.f22662g;
    }

    public final String t() {
        return this.f22660e;
    }

    public final SharedFlow<Boolean> v() {
        return this.f22664i;
    }

    public final StateFlow<String> w() {
        return this.f22668z;
    }

    public final h x(String phoneNumber) {
        o.i(phoneNumber, "phoneNumber");
        g gVar = this.f22656a;
        String str = this.f22660e;
        h a11 = gVar.a(str + phoneNumber, this.f22660e);
        if (a11 instanceof h.a) {
            MutableStateFlow<rj.a> mutableStateFlow = this.f22661f;
            Integer errorMessageRes = ((h.a) a11).a().getErrorMessageRes();
            o.f(errorMessageRes);
            mutableStateFlow.setValue(new a.b(errorMessageRes.intValue(), new Object[0]));
        }
        return a11;
    }

    public final void z() {
        this.f22658c.b(new pi.b(null, 1, null));
    }
}
