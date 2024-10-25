package com.forsale.app.features.auth.verification;

import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import com.forsale.app.features.auth.b;
import com.forsale.app.features.auth.interactors.validationinteractors.ValidationMessages;
import com.forsale.app.features.auth.interactors.validationinteractors.d;
import com.forsale.app.features.auth.interactors.validationinteractors.h;
import com.forsale.app.features.auth.utils.AuthErrorHandler;
import com.forsale.app.features.auth.utils.AuthServerErrorsState;
import com.forsale.app.utils.analytics.auth.verification.ResendOTPChannel;
import g00.l;
import g00.p;
import ha.f;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import lf.a;
import rj.a;
import ti.c;
import ti.e;
/* compiled from: VerificationScreenViewModel.kt */
/* loaded from: classes2.dex */
public final class VerificationScreenViewModel extends q0 {
    private final MutableSharedFlow<String> A;
    private final SharedFlow<String> B;
    private final MutableSharedFlow<Boolean> C;
    private final SharedFlow<Boolean> D;
    private final MutableSharedFlow<a> E;
    private final SharedFlow<a> F;
    private final MutableStateFlow<Boolean> G;
    private final StateFlow<Boolean> H;

    /* renamed from: a  reason: collision with root package name */
    private final f f23035a;

    /* renamed from: b  reason: collision with root package name */
    private final VerificationInteractor f23036b;

    /* renamed from: c  reason: collision with root package name */
    private final d f23037c;

    /* renamed from: d  reason: collision with root package name */
    private final ka.a f23038d;

    /* renamed from: e  reason: collision with root package name */
    private final AuthErrorHandler f23039e;

    /* renamed from: f  reason: collision with root package name */
    private final String f23040f;

    /* renamed from: g  reason: collision with root package name */
    private final MutableStateFlow<rj.a> f23041g;

    /* renamed from: h  reason: collision with root package name */
    private final StateFlow<rj.a> f23042h;

    /* renamed from: i  reason: collision with root package name */
    private final MutableStateFlow<b> f23043i;

    /* renamed from: j  reason: collision with root package name */
    private final StateFlow<b> f23044j;

    /* renamed from: x  reason: collision with root package name */
    private final MutableSharedFlow<Boolean> f23045x;

    /* renamed from: y  reason: collision with root package name */
    private final SharedFlow<Boolean> f23046y;

    /* renamed from: z  reason: collision with root package name */
    private final SharedFlow<rj.a> f23047z;

    /* compiled from: VerificationScreenViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.auth.verification.VerificationScreenViewModel$1", f = "VerificationScreenViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.auth.verification.VerificationScreenViewModel$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f23048a;

        AnonymousClass1(zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f23048a == 0) {
                kotlin.f.b(obj);
                VerificationScreenViewModel.this.Y();
                return wz.p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    public VerificationScreenViewModel(f verificationAnalyticsInteractor, VerificationInteractor verificationInteractor, d fieldsValidatorIneractor, ka.a handleOTPMethodState, AuthErrorHandler errorHandler, k0 savedStateHandle) {
        o.i(verificationAnalyticsInteractor, "verificationAnalyticsInteractor");
        o.i(verificationInteractor, "verificationInteractor");
        o.i(fieldsValidatorIneractor, "fieldsValidatorIneractor");
        o.i(handleOTPMethodState, "handleOTPMethodState");
        o.i(errorHandler, "errorHandler");
        o.i(savedStateHandle, "savedStateHandle");
        this.f23035a = verificationAnalyticsInteractor;
        this.f23036b = verificationInteractor;
        this.f23037c = fieldsValidatorIneractor;
        this.f23038d = handleOTPMethodState;
        this.f23039e = errorHandler;
        Object f11 = savedStateHandle.f("VERIFY_INTENTION");
        if (f11 != null) {
            this.f23040f = (String) f11;
            MutableStateFlow<rj.a> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
            this.f23041g = MutableStateFlow;
            this.f23042h = FlowKt.asStateFlow(MutableStateFlow);
            MutableStateFlow<b> MutableStateFlow2 = StateFlowKt.MutableStateFlow(b.C0253b.f22616a);
            this.f23043i = MutableStateFlow2;
            this.f23044j = FlowKt.asStateFlow(MutableStateFlow2);
            MutableSharedFlow<Boolean> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
            this.f23045x = MutableSharedFlow$default;
            this.f23046y = FlowKt.asSharedFlow(MutableSharedFlow$default);
            this.f23047z = handleOTPMethodState.b();
            MutableSharedFlow<String> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
            this.A = MutableSharedFlow$default2;
            this.B = FlowKt.asSharedFlow(MutableSharedFlow$default2);
            MutableSharedFlow<Boolean> MutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
            this.C = MutableSharedFlow$default3;
            this.D = FlowKt.asSharedFlow(MutableSharedFlow$default3);
            MutableSharedFlow<a> MutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
            this.E = MutableSharedFlow$default4;
            this.F = FlowKt.asSharedFlow(MutableSharedFlow$default4);
            BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new AnonymousClass1(null), 3, null);
            MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
            this.G = MutableStateFlow3;
            this.H = FlowKt.asStateFlow(MutableStateFlow3);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public static /* synthetic */ void I(VerificationScreenViewModel verificationScreenViewModel, String str, ja.a aVar, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            aVar = null;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        verificationScreenViewModel.H(str, aVar, str2);
    }

    private final void J(String str) {
        ResendOTPChannel resendOTPChannel = ResendOTPChannel.SMS;
        if (o.d(str, resendOTPChannel.getMethod())) {
            this.f23035a.b(new c(resendOTPChannel, la.a.a(this.f23040f)));
            return;
        }
        ResendOTPChannel resendOTPChannel2 = ResendOTPChannel.AutomatedCall;
        if (o.d(str, resendOTPChannel2.getMethod())) {
            this.f23035a.b(new c(resendOTPChannel2, la.a.a(this.f23040f)));
            return;
        }
        ResendOTPChannel resendOTPChannel3 = ResendOTPChannel.WhatsApp;
        if (o.d(str, resendOTPChannel3.getMethod())) {
            this.f23035a.b(new c(resendOTPChannel3, la.a.a(this.f23040f)));
        }
    }

    private final void K(String str, ja.a aVar) {
        f fVar = this.f23035a;
        String d11 = aVar.d();
        String f11 = aVar.f();
        fVar.c(new ti.d(new oi.a(d11, str + f11, aVar.c())));
    }

    public static /* synthetic */ void M(VerificationScreenViewModel verificationScreenViewModel, String str, ja.a aVar, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            aVar = null;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        verificationScreenViewModel.L(str, aVar, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object S(String str, ja.a aVar, ResendOTPMethods resendOTPMethods, zz.a<? super wz.p> aVar2) {
        Object f11;
        Object f12;
        J(resendOTPMethods.getMethod());
        String str2 = this.f23040f;
        if (o.d(str2, VerificationScreenIntention.SIGNUP.getValue())) {
            Object V = V(str, aVar, resendOTPMethods, aVar2);
            f12 = kotlin.coroutines.intrinsics.b.f();
            if (V == f12) {
                return V;
            }
            return wz.p.f75480a;
        } else if (o.d(str2, VerificationScreenIntention.FORGET_PASSWORD.getValue())) {
            Object T = T(str, aVar, resendOTPMethods, aVar2);
            f11 = kotlin.coroutines.intrinsics.b.f();
            if (T == f11) {
                return T;
            }
            return wz.p.f75480a;
        } else {
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(10:5|6|7|(1:(1:(1:(1:(4:13|14|15|16)(2:18|19))(4:20|21|15|16))(6:22|23|24|(2:26|(1:28))|15|16))(4:29|30|31|32))(4:44|45|46|(1:48)(1:49))|33|(1:35)|24|(0)|15|16))|55|6|7|(0)(0)|33|(0)|24|(0)|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
        r11 = r10;
        r10 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3 A[Catch: Exception -> 0x0055, TRY_LEAVE, TryCatch #2 {Exception -> 0x0055, blocks: (B:18:0x0048, B:21:0x0051, B:38:0x00ab, B:40:0x00b3, B:35:0x0094), top: B:57:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T(java.lang.String r10, ja.a r11, com.forsale.app.features.auth.verification.ResendOTPMethods r12, zz.a<? super wz.p> r13) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.auth.verification.VerificationScreenViewModel.T(java.lang.String, ja.a, com.forsale.app.features.auth.verification.ResendOTPMethods, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(10:5|6|7|(1:(1:(1:(1:(4:13|14|15|16)(2:18|19))(4:20|21|15|16))(6:22|23|24|(1:26)|15|16))(4:27|28|29|30))(4:42|43|44|(1:46)(1:47))|31|(1:33)|24|(0)|15|16))|53|6|7|(0)(0)|31|(0)|24|(0)|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
        r11 = r10;
        r10 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(java.lang.String r10, ja.a r11, com.forsale.app.features.auth.verification.ResendOTPMethods r12, zz.a<? super wz.p> r13) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.auth.verification.VerificationScreenViewModel.V(java.lang.String, ja.a, com.forsale.app.features.auth.verification.ResendOTPMethods, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(bj.c cVar) {
        if (cVar instanceof AuthServerErrorsState.ValidationError) {
            AuthServerErrorsState.ValidationError.c((AuthServerErrorsState.ValidationError) cVar, null, null, null, new l<String, wz.p>() { // from class: com.forsale.app.features.auth.verification.VerificationScreenViewModel$showErrorOTPField$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(String it2) {
                    MutableStateFlow mutableStateFlow;
                    o.i(it2, "it");
                    mutableStateFlow = VerificationScreenViewModel.this.f23041g;
                    mutableStateFlow.setValue(new a.C0804a(it2));
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(String str) {
                    b(str);
                    return wz.p.f75480a;
                }
            }, null, null, new l<String, wz.p>() { // from class: com.forsale.app.features.auth.verification.VerificationScreenViewModel$showErrorOTPField$2

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: VerificationScreenViewModel.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.auth.verification.VerificationScreenViewModel$showErrorOTPField$2$1", f = "VerificationScreenViewModel.kt", l = {234}, m = "invokeSuspend")
                /* renamed from: com.forsale.app.features.auth.verification.VerificationScreenViewModel$showErrorOTPField$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

                    /* renamed from: a  reason: collision with root package name */
                    int f23104a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ VerificationScreenViewModel f23105b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ String f23106c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(VerificationScreenViewModel verificationScreenViewModel, String str, zz.a<? super AnonymousClass1> aVar) {
                        super(2, aVar);
                        this.f23105b = verificationScreenViewModel;
                        this.f23106c = str;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                        return new AnonymousClass1(this.f23105b, this.f23106c, aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object f11;
                        MutableStateFlow mutableStateFlow;
                        f11 = kotlin.coroutines.intrinsics.b.f();
                        int i11 = this.f23104a;
                        if (i11 != 0) {
                            if (i11 == 1) {
                                kotlin.f.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            kotlin.f.b(obj);
                            mutableStateFlow = this.f23105b.f23043i;
                            b.a aVar = new b.a(this.f23106c);
                            this.f23104a = 1;
                            if (mutableStateFlow.emit(aVar, this) == f11) {
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

                public final void b(String errorMessage) {
                    o.i(errorMessage, "errorMessage");
                    BuildersKt__Builders_commonKt.launch$default(r0.a(VerificationScreenViewModel.this), null, null, new AnonymousClass1(VerificationScreenViewModel.this, errorMessage, null), 3, null);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(String str) {
                    b(str);
                    return wz.p.f75480a;
                }
            }, 55, null);
            return;
        }
        o.g(cVar, "null cannot be cast to non-null type com.forsale.app.features.auth.utils.AuthServerErrorsState");
        x10.a.b(((AuthServerErrorsState) cVar).a(), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|8))|76|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
        r9 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
        r10 = r9;
        r9 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac A[Catch: Exception -> 0x006a, TRY_ENTER, TryCatch #3 {Exception -> 0x006a, blocks: (B:14:0x0040, B:25:0x0066, B:43:0x00c7, B:45:0x00cb, B:47:0x00d1, B:50:0x00d8, B:40:0x00ac), top: B:76:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1 A[Catch: Exception -> 0x006a, TryCatch #3 {Exception -> 0x006a, blocks: (B:14:0x0040, B:25:0x0066, B:43:0x00c7, B:45:0x00cb, B:47:0x00d1, B:50:0x00d8, B:40:0x00ac), top: B:76:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0110 A[Catch: Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:17:0x004d, B:57:0x0108, B:59:0x0110, B:63:0x0118, B:20:0x005a, B:54:0x00f4), top: B:76:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0134  */
    /* JADX WARN: Type inference failed for: r10v20, types: [com.forsale.app.features.auth.verification.VerificationScreenViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.String r9, final java.lang.String r10, java.lang.Integer r11, zz.a<? super wz.p> r12) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.auth.verification.VerificationScreenViewModel.q(java.lang.String, java.lang.String, java.lang.Integer, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|8))|82|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
        r12 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
        r11 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
        r12 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1 A[Catch: Exception -> 0x00a2, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00a2, blocks: (B:17:0x005e, B:62:0x0125, B:64:0x012d, B:68:0x0135, B:20:0x0073, B:54:0x0107, B:56:0x010b, B:59:0x0113, B:45:0x00e4, B:47:0x00ea, B:50:0x00f1, B:28:0x009e, B:38:0x00c1), top: B:84:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea A[Catch: Exception -> 0x00a2, TryCatch #2 {Exception -> 0x00a2, blocks: (B:17:0x005e, B:62:0x0125, B:64:0x012d, B:68:0x0135, B:20:0x0073, B:54:0x0107, B:56:0x010b, B:59:0x0113, B:45:0x00e4, B:47:0x00ea, B:50:0x00f1, B:28:0x009e, B:38:0x00c1), top: B:84:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0124 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012d A[Catch: Exception -> 0x00a2, TryCatch #2 {Exception -> 0x00a2, blocks: (B:17:0x005e, B:62:0x0125, B:64:0x012d, B:68:0x0135, B:20:0x0073, B:54:0x0107, B:56:0x010b, B:59:0x0113, B:45:0x00e4, B:47:0x00ea, B:50:0x00f1, B:28:0x009e, B:38:0x00c1), top: B:84:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014d  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v24, types: [com.forsale.app.features.auth.verification.VerificationScreenViewModel] */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.forsale.app.features.auth.verification.VerificationScreenViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.String r11, ja.a r12, java.lang.Integer r13, zz.a<? super wz.p> r14) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.auth.verification.VerificationScreenViewModel.r(java.lang.String, ja.a, java.lang.Integer, zz.a):java.lang.Object");
    }

    private final boolean s(String str) {
        return this.f23037c.a(G(str));
    }

    private final h t(String str) {
        boolean z11;
        if (str.length() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && str.length() == 5) {
            return h.b.f22741a;
        }
        return new h.a(ValidationMessages.EmptyVerificationField);
    }

    public final StateFlow<rj.a> A() {
        return this.f23042h;
    }

    public final SharedFlow<String> B() {
        return this.B;
    }

    public final SharedFlow<rj.a> C() {
        return this.f23047z;
    }

    public final SharedFlow<lf.a> D() {
        return this.F;
    }

    public final SharedFlow<Boolean> E() {
        return this.f23046y;
    }

    public final StateFlow<b> F() {
        return this.f23044j;
    }

    public final h G(String otp) {
        a.b bVar;
        o.i(otp, "otp");
        h t11 = t(otp);
        if (t11 instanceof h.a) {
            MutableStateFlow<rj.a> mutableStateFlow = this.f23041g;
            Integer errorMessageRes = ((h.a) t11).a().getErrorMessageRes();
            if (errorMessageRes != null) {
                bVar = new a.b(errorMessageRes.intValue(), new Object[0]);
            } else {
                bVar = null;
            }
            mutableStateFlow.setValue(bVar);
        }
        return t11;
    }

    public final void H(String str, ja.a aVar, String str2) {
        String str3;
        f fVar = this.f23035a;
        if (aVar != null) {
            str3 = aVar.f();
        } else {
            str3 = null;
        }
        fVar.a(new ti.a(str2, new oi.a(null, str + str3, null, 5, null)));
    }

    public final void L(String str, ja.a aVar, String str2) {
        String str3;
        String str4;
        f fVar = this.f23035a;
        String str5 = null;
        if (aVar != null) {
            str3 = aVar.d();
        } else {
            str3 = null;
        }
        if (aVar != null) {
            str4 = aVar.f();
        } else {
            str4 = null;
        }
        String str6 = str + str4;
        if (aVar != null) {
            str5 = aVar.c();
        }
        fVar.d(new e(str2, new oi.a(str3, str6, str5)));
    }

    public final void N(String phonePrefix, ja.a userData, String str) {
        o.i(phonePrefix, "phonePrefix");
        o.i(userData, "userData");
        if (s(String.valueOf(str))) {
            String str2 = this.f23040f;
            if (o.d(str2, VerificationScreenIntention.SIGNUP.getValue())) {
                BuildersKt__Builders_commonKt.launch$default(r0.a(this), Dispatchers.getIO(), null, new VerificationScreenViewModel$onClickVerifyBtn$1(str, this, phonePrefix, userData, null), 2, null);
            } else if (o.d(str2, VerificationScreenIntention.FORGET_PASSWORD.getValue())) {
                BuildersKt__Builders_commonKt.launch$default(r0.a(this), Dispatchers.getIO(), null, new VerificationScreenViewModel$onClickVerifyBtn$2(str, this, phonePrefix, userData, null), 2, null);
            }
        }
    }

    public final void O(String phonePrefix, ja.a userData) {
        o.i(phonePrefix, "phonePrefix");
        o.i(userData, "userData");
        String str = this.f23040f;
        x10.a.b("onStartScreenVisited:: intention: " + str, new Object[0]);
        String str2 = this.f23040f;
        if (o.d(str2, VerificationScreenIntention.SIGNUP.getValue())) {
            M(this, phonePrefix, userData, null, 4, null);
        } else if (o.d(str2, VerificationScreenIntention.FORGET_PASSWORD.getValue())) {
            I(this, phonePrefix, userData, null, 4, null);
        }
    }

    public final void Q(ResendOTPMethods method, ja.a userData, String phonePrefix) {
        o.i(method, "method");
        o.i(userData, "userData");
        o.i(phonePrefix, "phonePrefix");
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), Dispatchers.getIO(), null, new VerificationScreenViewModel$resendOTP$1(this, method, phonePrefix, userData, null), 2, null);
    }

    public final void X(boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new VerificationScreenViewModel$setOTPMethodToDefault$1(this, z11, null), 3, null);
    }

    public final void Y() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new VerificationScreenViewModel$setTimerStateFalse$1(this, null), 3, null);
    }

    public final void v() {
        this.f23041g.setValue(null);
    }

    public final void w(boolean z11) {
        this.G.setValue(Boolean.valueOf(z11));
    }

    public final SharedFlow<Boolean> x() {
        return this.D;
    }

    public final String y() {
        return this.f23040f;
    }

    public final StateFlow<Boolean> z() {
        return this.H;
    }
}
