package com.forsale.app.features.more.user.editprofile.changepassword;

import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.datalayer.network.requestsbodies.ChangePasswordBody;
import com.forsale.app.features.auth.interactors.validationinteractors.ChangePasswordFieldType;
import com.forsale.app.features.auth.interactors.validationinteractors.c;
import com.forsale.app.features.auth.interactors.validationinteractors.f;
import com.forsale.app.features.auth.interactors.validationinteractors.h;
import com.forsale.app.features.auth.utils.AuthErrorHandler;
import com.forsale.app.features.auth.utils.AuthServerErrorsState;
import com.forsale.app.features.more.user.editprofile.g;
import g00.l;
import java.net.SocketTimeoutException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import rj.a;
import wz.p;
/* compiled from: ChangePasswordViewModel.kt */
/* loaded from: classes2.dex */
public final class ChangePasswordViewModel extends q0 {
    private final StateFlow<rj.a> A;
    private final MutableStateFlow<rj.a> B;
    private final StateFlow<rj.a> C;
    private final MutableStateFlow<rj.a> D;
    private final StateFlow<rj.a> E;
    private final CoroutineExceptionHandler F;

    /* renamed from: a  reason: collision with root package name */
    private final f f33183a;

    /* renamed from: b  reason: collision with root package name */
    private final com.forsale.app.features.auth.interactors.validationinteractors.a f33184b;

    /* renamed from: c  reason: collision with root package name */
    private final com.forsale.app.features.auth.interactors.validationinteractors.d f33185c;

    /* renamed from: d  reason: collision with root package name */
    private final b f33186d;

    /* renamed from: e  reason: collision with root package name */
    private final com.forsale.app.features.more.user.editprofile.b f33187e;

    /* renamed from: f  reason: collision with root package name */
    private final CoroutineDispatcher f33188f;

    /* renamed from: g  reason: collision with root package name */
    private final AuthErrorHandler f33189g;

    /* renamed from: h  reason: collision with root package name */
    private final MutableStateFlow<ja.a> f33190h;

    /* renamed from: i  reason: collision with root package name */
    private final MutableStateFlow<g> f33191i;

    /* renamed from: j  reason: collision with root package name */
    private final StateFlow<g> f33192j;

    /* renamed from: x  reason: collision with root package name */
    private final MutableSharedFlow<lf.a> f33193x;

    /* renamed from: y  reason: collision with root package name */
    private final SharedFlow<lf.a> f33194y;

    /* renamed from: z  reason: collision with root package name */
    private final MutableStateFlow<rj.a> f33195z;

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChangePasswordViewModel f33196a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.Key key, ChangePasswordViewModel changePasswordViewModel) {
            super(key);
            this.f33196a = changePasswordViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            BuildersKt__Builders_commonKt.launch$default(r0.a(this.f33196a), null, null, new ChangePasswordViewModel$exceptionsHandler$1$1(this.f33196a, th2, null), 3, null);
        }
    }

    public ChangePasswordViewModel(f passwordValidationInteractor, com.forsale.app.features.auth.interactors.validationinteractors.a confirmPasswordValidationInteractor, com.forsale.app.features.auth.interactors.validationinteractors.d fieldsValidatorInteractor, b changePasswordInteractor, com.forsale.app.features.more.user.editprofile.b editProfileAnalyticsInteractor, CoroutineDispatcher ioDispatcher, AuthErrorHandler errorHandler) {
        o.i(passwordValidationInteractor, "passwordValidationInteractor");
        o.i(confirmPasswordValidationInteractor, "confirmPasswordValidationInteractor");
        o.i(fieldsValidatorInteractor, "fieldsValidatorInteractor");
        o.i(changePasswordInteractor, "changePasswordInteractor");
        o.i(editProfileAnalyticsInteractor, "editProfileAnalyticsInteractor");
        o.i(ioDispatcher, "ioDispatcher");
        o.i(errorHandler, "errorHandler");
        this.f33183a = passwordValidationInteractor;
        this.f33184b = confirmPasswordValidationInteractor;
        this.f33185c = fieldsValidatorInteractor;
        this.f33186d = changePasswordInteractor;
        this.f33187e = editProfileAnalyticsInteractor;
        this.f33188f = ioDispatcher;
        this.f33189g = errorHandler;
        this.f33190h = StateFlowKt.MutableStateFlow(new ja.a(null, null, null, null, 15, null));
        MutableStateFlow<g> MutableStateFlow = StateFlowKt.MutableStateFlow(g.b.f33381a);
        this.f33191i = MutableStateFlow;
        this.f33192j = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<lf.a> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f33193x = MutableSharedFlow$default;
        this.f33194y = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableStateFlow<rj.a> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.f33195z = MutableStateFlow2;
        this.A = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<rj.a> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.B = MutableStateFlow3;
        this.C = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<rj.a> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.D = MutableStateFlow4;
        this.E = FlowKt.asStateFlow(MutableStateFlow4);
        this.F = new a(CoroutineExceptionHandler.Key, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean C(Throwable th2) {
        if (!(th2 instanceof ConnectivityInterceptor.ConnectivityException) && !(th2 instanceof SocketTimeoutException)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(bj.c cVar) {
        if (!(cVar instanceof AuthServerErrorsState.ValidationError)) {
            BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new ChangePasswordViewModel$onChangePasswordFailed$3(this, null), 3, null);
            o.g(cVar, "null cannot be cast to non-null type com.forsale.app.features.auth.utils.AuthServerErrorsState");
            x10.a.b(((AuthServerErrorsState) cVar).a(), new Object[0]);
            return;
        }
        AuthServerErrorsState.ValidationError.c((AuthServerErrorsState.ValidationError) cVar, null, new l<String, p>() { // from class: com.forsale.app.features.more.user.editprofile.changepassword.ChangePasswordViewModel$onChangePasswordFailed$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(String it2) {
                MutableStateFlow mutableStateFlow;
                o.i(it2, "it");
                mutableStateFlow = ChangePasswordViewModel.this.f33195z;
                mutableStateFlow.setValue(new a.C0804a(it2));
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(String str) {
                b(str);
                return p.f75480a;
            }
        }, new l<String, p>() { // from class: com.forsale.app.features.more.user.editprofile.changepassword.ChangePasswordViewModel$onChangePasswordFailed$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(String it2) {
                MutableStateFlow mutableStateFlow;
                o.i(it2, "it");
                mutableStateFlow = ChangePasswordViewModel.this.B;
                mutableStateFlow.setValue(new a.C0804a(it2));
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(String str) {
                b(str);
                return p.f75480a;
            }
        }, null, null, null, null, 121, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object p(String str, String str2, String str3, zz.a<? super p> aVar) {
        Object f11;
        Object a11 = this.f33186d.a(new ChangePasswordBody(str2, str, str3), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }

    private final boolean q(String str, String str2, String str3) {
        return this.f33185c.a(D(str), E(str2), B(str2, str3));
    }

    public final MutableStateFlow<ja.a> A() {
        return this.f33190h;
    }

    public final h B(String password, String confirmPassword) {
        o.i(password, "password");
        o.i(confirmPassword, "confirmPassword");
        h a11 = this.f33184b.a(password, confirmPassword, new c.b(ChangePasswordFieldType.CONFIRM_PASSWORD));
        if (a11 instanceof h.a) {
            MutableStateFlow<rj.a> mutableStateFlow = this.D;
            Integer errorMessageRes = ((h.a) a11).a().getErrorMessageRes();
            o.f(errorMessageRes);
            mutableStateFlow.setValue(new a.b(errorMessageRes.intValue(), new Object[0]));
        }
        return a11;
    }

    public final h D(String oldPassword) {
        o.i(oldPassword, "oldPassword");
        h a11 = this.f33183a.a(oldPassword, new c.b(ChangePasswordFieldType.OLD_PASSWORD));
        if (a11 instanceof h.a) {
            MutableStateFlow<rj.a> mutableStateFlow = this.f33195z;
            Integer errorMessageRes = ((h.a) a11).a().getErrorMessageRes();
            o.f(errorMessageRes);
            mutableStateFlow.setValue(new a.b(errorMessageRes.intValue(), new Object[0]));
        }
        return a11;
    }

    public final h E(String newPassword) {
        o.i(newPassword, "newPassword");
        h a11 = this.f33183a.a(newPassword, new c.b(ChangePasswordFieldType.NEW_PASSWORD));
        if (a11 instanceof h.a) {
            MutableStateFlow<rj.a> mutableStateFlow = this.B;
            Integer errorMessageRes = ((h.a) a11).a().getErrorMessageRes();
            o.f(errorMessageRes);
            mutableStateFlow.setValue(new a.b(errorMessageRes.intValue(), new Object[0]));
        }
        return a11;
    }

    public final void G(String oldPassword, String newPassword, String confirmPassword) {
        o.i(oldPassword, "oldPassword");
        o.i(newPassword, "newPassword");
        o.i(confirmPassword, "confirmPassword");
        if (q(oldPassword, newPassword, confirmPassword)) {
            BuildersKt__Builders_commonKt.launch$default(r0.a(this), this.f33188f.plus(this.F), null, new ChangePasswordViewModel$onSaveClicked$1(this, newPassword, oldPassword, confirmPassword, null), 2, null);
        }
    }

    public final void r() {
        this.f33195z.setValue(null);
    }

    public final void s() {
        this.f33195z.setValue(null);
    }

    public final void t() {
        this.B.setValue(null);
    }

    public final StateFlow<rj.a> v() {
        return this.E;
    }

    public final SharedFlow<lf.a> w() {
        return this.f33194y;
    }

    public final StateFlow<rj.a> x() {
        return this.A;
    }

    public final StateFlow<rj.a> y() {
        return this.C;
    }

    public final StateFlow<g> z() {
        return this.f33192j;
    }
}
