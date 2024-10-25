package com.forsale.app.features.more.user.editprofile.editpersonalinfo;

import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.features.auth.interactors.validationinteractors.e;
import com.forsale.app.features.auth.interactors.validationinteractors.h;
import com.forsale.app.features.auth.utils.AuthErrorHandler;
import com.forsale.app.features.auth.utils.AuthServerErrorsState;
import com.forsale.app.features.more.user.editprofile.g;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import g00.l;
import g00.p;
import java.net.SocketTimeoutException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import rj.a;
/* compiled from: EditPersonalInformationViewModel.kt */
/* loaded from: classes2.dex */
public final class EditPersonalInformationViewModel extends q0 {
    private final MutableStateFlow<rj.a> A;
    private final StateFlow<rj.a> B;
    private final MutableStateFlow<rj.a> C;
    private final StateFlow<rj.a> D;
    private final CoroutineExceptionHandler E;

    /* renamed from: a  reason: collision with root package name */
    private final UserProfileInteractor f33322a;

    /* renamed from: b  reason: collision with root package name */
    private final e f33323b;

    /* renamed from: c  reason: collision with root package name */
    private final com.forsale.app.features.auth.interactors.validationinteractors.b f33324c;

    /* renamed from: d  reason: collision with root package name */
    private final com.forsale.app.features.auth.interactors.validationinteractors.d f33325d;

    /* renamed from: e  reason: collision with root package name */
    private final EditProfileInteractor f33326e;

    /* renamed from: f  reason: collision with root package name */
    private final com.forsale.app.features.more.user.editprofile.b f33327f;

    /* renamed from: g  reason: collision with root package name */
    private final CoroutineDispatcher f33328g;

    /* renamed from: h  reason: collision with root package name */
    private final AuthErrorHandler f33329h;

    /* renamed from: i  reason: collision with root package name */
    private final MutableStateFlow<ja.a> f33330i;

    /* renamed from: j  reason: collision with root package name */
    private final MutableStateFlow<g> f33331j;

    /* renamed from: x  reason: collision with root package name */
    private final StateFlow<g> f33332x;

    /* renamed from: y  reason: collision with root package name */
    private final MutableSharedFlow<lf.a> f33333y;

    /* renamed from: z  reason: collision with root package name */
    private final SharedFlow<lf.a> f33334z;

    /* compiled from: EditPersonalInformationViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationViewModel$1", f = "EditPersonalInformationViewModel.kt", l = {l8.a.f62268e, 94}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationViewModel$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f33335a;

        /* renamed from: b  reason: collision with root package name */
        int f33336b;

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
            String str;
            String email;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f33336b;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        f.b(obj);
                        return wz.p.f75480a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            } else {
                f.b(obj);
                UserProfileInteractor userProfileInteractor = EditPersonalInformationViewModel.this.f33322a;
                this.f33336b = 1;
                obj = userProfileInteractor.i(this);
                if (obj == f11) {
                    return f11;
                }
            }
            UserEntity userEntity = (UserEntity) obj;
            MutableStateFlow<ja.a> A = EditPersonalInformationViewModel.this.A();
            String str2 = (userEntity == null || (str2 = userEntity.getFirstName()) == null) ? "" : "";
            if (userEntity == null || (email = userEntity.getEmail()) == null) {
                str = "";
            } else {
                str = email;
            }
            ja.a aVar = new ja.a(str2, null, str, null, 10, null);
            this.f33335a = obj;
            this.f33336b = 2;
            if (A.emit(aVar, this) == f11) {
                return f11;
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditPersonalInformationViewModel f33338a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.Key key, EditPersonalInformationViewModel editPersonalInformationViewModel) {
            super(key);
            this.f33338a = editPersonalInformationViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            BuildersKt__Builders_commonKt.launch$default(r0.a(this.f33338a), null, null, new EditPersonalInformationViewModel$exceptionsHandler$1$1(this.f33338a, th2, null), 3, null);
        }
    }

    public EditPersonalInformationViewModel(UserProfileInteractor currentUserProfileInteractor, e nameValidatorInteractor, com.forsale.app.features.auth.interactors.validationinteractors.b emailValidatorInteractor, com.forsale.app.features.auth.interactors.validationinteractors.d fieldsValidatorInteractor, EditProfileInteractor editProfileInteractor, com.forsale.app.features.more.user.editprofile.b editProfileAnalyticsInteractor, CoroutineDispatcher ioDispatcher, AuthErrorHandler errorHandler) {
        o.i(currentUserProfileInteractor, "currentUserProfileInteractor");
        o.i(nameValidatorInteractor, "nameValidatorInteractor");
        o.i(emailValidatorInteractor, "emailValidatorInteractor");
        o.i(fieldsValidatorInteractor, "fieldsValidatorInteractor");
        o.i(editProfileInteractor, "editProfileInteractor");
        o.i(editProfileAnalyticsInteractor, "editProfileAnalyticsInteractor");
        o.i(ioDispatcher, "ioDispatcher");
        o.i(errorHandler, "errorHandler");
        this.f33322a = currentUserProfileInteractor;
        this.f33323b = nameValidatorInteractor;
        this.f33324c = emailValidatorInteractor;
        this.f33325d = fieldsValidatorInteractor;
        this.f33326e = editProfileInteractor;
        this.f33327f = editProfileAnalyticsInteractor;
        this.f33328g = ioDispatcher;
        this.f33329h = errorHandler;
        this.f33330i = StateFlowKt.MutableStateFlow(new ja.a(null, null, null, null, 15, null));
        MutableStateFlow<g> MutableStateFlow = StateFlowKt.MutableStateFlow(g.b.f33381a);
        this.f33331j = MutableStateFlow;
        this.f33332x = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<lf.a> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f33333y = MutableSharedFlow$default;
        this.f33334z = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableStateFlow<rj.a> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.A = MutableStateFlow2;
        this.B = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<rj.a> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.C = MutableStateFlow3;
        this.D = FlowKt.asStateFlow(MutableStateFlow3);
        this.E = new a(CoroutineExceptionHandler.Key, this);
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), ioDispatcher, null, new AnonymousClass1(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean B(Throwable th2) {
        if (!(th2 instanceof ConnectivityInterceptor.ConnectivityException) && !(th2 instanceof SocketTimeoutException)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(bj.c cVar) {
        if (!(cVar instanceof AuthServerErrorsState.ValidationError)) {
            BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new EditPersonalInformationViewModel$onUpdateUserFailed$3(this, null), 3, null);
            o.g(cVar, "null cannot be cast to non-null type com.forsale.app.features.auth.utils.AuthServerErrorsState");
            x10.a.b(((AuthServerErrorsState) cVar).a(), new Object[0]);
            return;
        }
        AuthServerErrorsState.ValidationError.c((AuthServerErrorsState.ValidationError) cVar, null, null, null, null, new l<String, wz.p>() { // from class: com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationViewModel$onUpdateUserFailed$1

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: EditPersonalInformationViewModel.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationViewModel$onUpdateUserFailed$1$1", f = "EditPersonalInformationViewModel.kt", l = {185}, m = "invokeSuspend")
            /* renamed from: com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationViewModel$onUpdateUserFailed$1$1  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f33350a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f33351b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ EditPersonalInformationViewModel f33352c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(String str, EditPersonalInformationViewModel editPersonalInformationViewModel, zz.a<? super AnonymousClass1> aVar) {
                    super(2, aVar);
                    this.f33351b = str;
                    this.f33352c = editPersonalInformationViewModel;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                    return new AnonymousClass1(this.f33351b, this.f33352c, aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object f11;
                    MutableStateFlow mutableStateFlow;
                    f11 = kotlin.coroutines.intrinsics.b.f();
                    int i11 = this.f33350a;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            f.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        f.b(obj);
                        String str = this.f33351b;
                        x10.a.b("onUpdateUserFailed:: message:: " + str, new Object[0]);
                        mutableStateFlow = this.f33352c.C;
                        a.C0804a c0804a = new a.C0804a(this.f33351b);
                        this.f33350a = 1;
                        if (mutableStateFlow.emit(c0804a, this) == f11) {
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

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(String it2) {
                o.i(it2, "it");
                BuildersKt__Builders_commonKt.launch$default(r0.a(EditPersonalInformationViewModel.this), null, null, new AnonymousClass1(it2, EditPersonalInformationViewModel.this, null), 3, null);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(String str) {
                b(str);
                return wz.p.f75480a;
            }
        }, new l<String, wz.p>() { // from class: com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationViewModel$onUpdateUserFailed$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(String it2) {
                MutableStateFlow mutableStateFlow;
                o.i(it2, "it");
                mutableStateFlow = EditPersonalInformationViewModel.this.A;
                mutableStateFlow.setValue(new a.C0804a(it2));
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(String str) {
                b(str);
                return wz.p.f75480a;
            }
        }, null, 79, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(ja.a r12, zz.a<? super wz.p> r13) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationViewModel.G(ja.a, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(ja.a r8, zz.a<? super wz.p> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationViewModel$updateUser$1
            if (r0 == 0) goto L13
            r0 = r9
            com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationViewModel$updateUser$1 r0 = (com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationViewModel$updateUser$1) r0
            int r1 = r0.f33368f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33368f = r1
            goto L18
        L13:
            com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationViewModel$updateUser$1 r0 = new com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationViewModel$updateUser$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f33366d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f33368f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r9)
            goto L85
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.Object r8 = r0.f33365c
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r0.f33364b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.f33363a
            com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditProfileInteractor r4 = (com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditProfileInteractor) r4
            kotlin.f.b(r9)
            goto L65
        L44:
            kotlin.f.b(r9)
            com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditProfileInteractor r9 = r7.f33326e
            java.lang.String r2 = r8.d()
            java.lang.String r8 = r8.c()
            com.forsale.app.utils.facades.user.UserProfileInteractor r5 = r7.f33322a
            r0.f33363a = r9
            r0.f33364b = r2
            r0.f33365c = r8
            r0.f33368f = r4
            java.lang.Object r4 = r5.i(r0)
            if (r4 != r1) goto L62
            return r1
        L62:
            r6 = r4
            r4 = r9
            r9 = r6
        L65:
            com.forsale.app.datalayer.database.UserEntity r9 = (com.forsale.app.datalayer.database.UserEntity) r9
            if (r9 == 0) goto L74
            java.lang.Integer r9 = r9.getAllowFollow()
            if (r9 == 0) goto L74
            int r9 = r9.intValue()
            goto L75
        L74:
            r9 = 0
        L75:
            r5 = 0
            r0.f33363a = r5
            r0.f33364b = r5
            r0.f33365c = r5
            r0.f33368f = r3
            java.lang.Object r8 = r4.a(r2, r8, r9, r0)
            if (r8 != r1) goto L85
            return r1
        L85:
            wz.p r8 = wz.p.f75480a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationViewModel.H(ja.a, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean s(ja.a aVar) {
        return this.f33325d.a(D(aVar.d()), C(aVar.c()));
    }

    public final MutableStateFlow<ja.a> A() {
        return this.f33330i;
    }

    public final h C(String email) {
        o.i(email, "email");
        h b11 = this.f33324c.b(email);
        if (b11 instanceof h.a) {
            MutableStateFlow<rj.a> mutableStateFlow = this.C;
            Integer errorMessageRes = ((h.a) b11).a().getErrorMessageRes();
            o.f(errorMessageRes);
            mutableStateFlow.setValue(new a.b(errorMessageRes.intValue(), new Object[0]));
        }
        return b11;
    }

    public final h D(String name) {
        o.i(name, "name");
        h b11 = this.f33323b.b(name);
        if (b11 instanceof h.a) {
            MutableStateFlow<rj.a> mutableStateFlow = this.A;
            Integer errorMessageRes = ((h.a) b11).a().getErrorMessageRes();
            o.f(errorMessageRes);
            mutableStateFlow.setValue(new a.b(errorMessageRes.intValue(), new Object[0]));
        }
        return b11;
    }

    public final void E(ja.a userModel) {
        o.i(userModel, "userModel");
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), this.f33328g.plus(this.E), null, new EditPersonalInformationViewModel$onSaveClicked$1(this, userModel, null), 2, null);
    }

    public final void t() {
        this.C.setValue(null);
    }

    public final void v() {
        this.A.setValue(null);
    }

    public final StateFlow<rj.a> w() {
        return this.D;
    }

    public final SharedFlow<lf.a> x() {
        return this.f33334z;
    }

    public final StateFlow<rj.a> y() {
        return this.B;
    }

    public final StateFlow<g> z() {
        return this.f33332x;
    }
}
