package com.forsale.app.features.auth;

import androidx.compose.runtime.c0;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.features.auth.login.SignInIntention;
import com.forsale.app.features.auth.models.AuthIntention;
import com.forsale.app.features.auth.models.AuthScreen;
import com.forsale.app.utils.analytics.auth.AuthenticationSourcePage;
import com.forsale.app.utils.analytics.auth.AuthenticationType;
import j0.k0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import wz.h;
import wz.p;
/* compiled from: AuthViewModel.kt */
/* loaded from: classes2.dex */
public final class AuthViewModel extends q0 {

    /* renamed from: y  reason: collision with root package name */
    public static final a f22577y = new a(null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f22578z = 8;

    /* renamed from: a  reason: collision with root package name */
    private final ha.a f22579a;

    /* renamed from: b  reason: collision with root package name */
    private final ha.c f22580b;

    /* renamed from: c  reason: collision with root package name */
    private final ga.b f22581c;

    /* renamed from: d  reason: collision with root package name */
    private final AuthIntention f22582d;

    /* renamed from: e  reason: collision with root package name */
    private final SignInIntention f22583e;

    /* renamed from: f  reason: collision with root package name */
    private final k0 f22584f;

    /* renamed from: g  reason: collision with root package name */
    private AuthenticationSourcePage f22585g;

    /* renamed from: h  reason: collision with root package name */
    private final String f22586h;

    /* renamed from: i  reason: collision with root package name */
    private final h f22587i;

    /* renamed from: j  reason: collision with root package name */
    private final MutableSharedFlow<lf.a> f22588j;

    /* renamed from: x  reason: collision with root package name */
    private final SharedFlow<lf.a> f22589x;

    /* compiled from: AuthViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AuthViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22595a;

        static {
            int[] iArr = new int[AuthIntention.values().length];
            try {
                iArr[AuthIntention.SignUp.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AuthIntention.SignIn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f22595a = iArr;
        }
    }

    public AuthViewModel(ha.a authAnalyticsInteractor, ha.c helpAnalyticsInteractor, ga.b regionsInteractor, androidx.lifecycle.k0 savedStateHandle) {
        k0 e11;
        h a11;
        o.i(authAnalyticsInteractor, "authAnalyticsInteractor");
        o.i(helpAnalyticsInteractor, "helpAnalyticsInteractor");
        o.i(regionsInteractor, "regionsInteractor");
        o.i(savedStateHandle, "savedStateHandle");
        this.f22579a = authAnalyticsInteractor;
        this.f22580b = helpAnalyticsInteractor;
        this.f22581c = regionsInteractor;
        AuthIntention authIntention = (AuthIntention) savedStateHandle.f("INTENTION");
        this.f22582d = authIntention == null ? AuthIntention.SignUp : authIntention;
        SignInIntention signInIntention = (SignInIntention) savedStateHandle.f("SIGN_IN_INTENTION");
        this.f22583e = signInIntention == null ? SignInIntention.DEFAULT : signInIntention;
        e11 = c0.e(AuthenticationType.SIGNUP, null, 2, null);
        this.f22584f = e11;
        AuthenticationSourcePage authenticationSourcePage = (AuthenticationSourcePage) savedStateHandle.f("authenticationSourcePage");
        this.f22585g = authenticationSourcePage == null ? AuthenticationSourcePage.PROFILE : authenticationSourcePage;
        final Flow<RegionEntity> a12 = regionsInteractor.a();
        Flow<String> flow = new Flow<String>() { // from class: com.forsale.app.features.auth.AuthViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.auth.AuthViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f22591a;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.auth.AuthViewModel$special$$inlined$map$1$2", f = "AuthViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.auth.AuthViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f22592a;

                    /* renamed from: b  reason: collision with root package name */
                    int f22593b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f22592a = obj;
                        this.f22593b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f22591a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, zz.a r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.forsale.app.features.auth.AuthViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.forsale.app.features.auth.AuthViewModel$special$$inlined$map$1$2$1 r0 = (com.forsale.app.features.auth.AuthViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f22593b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f22593b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.auth.AuthViewModel$special$$inlined$map$1$2$1 r0 = new com.forsale.app.features.auth.AuthViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f22592a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f22593b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r7)
                        goto L5a
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.f.b(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.f22591a
                        com.forsale.app.datalayer.database.RegionEntity r6 = (com.forsale.app.datalayer.database.RegionEntity) r6
                        if (r6 == 0) goto L3f
                        java.lang.String r6 = r6.getPhonePrefix()
                        goto L40
                    L3f:
                        r6 = 0
                    L40:
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>()
                        java.lang.String r4 = "+"
                        r2.append(r4)
                        r2.append(r6)
                        java.lang.String r6 = r2.toString()
                        r0.f22593b = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L5a
                        return r1
                    L5a:
                        wz.p r6 = wz.p.f75480a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.auth.AuthViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        };
        CoroutineScope a13 = r0.a(this);
        SharingStarted eagerly = SharingStarted.Companion.getEagerly();
        String phonePrefix = regionsInteractor.b().getPhonePrefix();
        this.f22586h = (String) FlowKt.stateIn(flow, a13, eagerly, "+" + phonePrefix).getValue();
        a11 = kotlin.d.a(new g00.a<ja.a>() { // from class: com.forsale.app.features.auth.AuthViewModel$userModel$2
            @Override // g00.a
            /* renamed from: b */
            public final ja.a invoke() {
                return new ja.a(null, null, null, null, 15, null);
            }
        });
        this.f22587i = a11;
        MutableSharedFlow<lf.a> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f22588j = MutableSharedFlow$default;
        this.f22589x = FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    private final void t(AuthenticationType authenticationType) {
        this.f22584f.setValue(authenticationType);
    }

    public final void f() {
        m().i("");
    }

    public final AuthenticationSourcePage g() {
        return this.f22585g;
    }

    public final SharedFlow<lf.a> h() {
        return this.f22589x;
    }

    public final String j() {
        return this.f22586h;
    }

    public final SignInIntention k() {
        return this.f22583e;
    }

    public final String l() {
        int i11 = b.f22595a[this.f22582d.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return AuthScreen.c.f22811c.a();
            }
            throw new NoWhenBranchMatchedException();
        }
        return AuthScreen.d.f22812c.a();
    }

    public final ja.a m() {
        return (ja.a) this.f22587i.getValue();
    }

    public final AuthenticationType o() {
        return (AuthenticationType) this.f22584f.getValue();
    }

    public final void p(AuthenticationType authenticationType) {
        o.i(authenticationType, "authenticationType");
        this.f22580b.a(new ti.b(authenticationType));
    }

    public final Job q(String message) {
        Job launch$default;
        o.i(message, "message");
        launch$default = BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new AuthViewModel$onPasswordChangedSuccessfully$1(this, message, null), 3, null);
        return launch$default;
    }

    public final void r(boolean z11, AuthenticationType authenticationType) {
        o.i(authenticationType, "authenticationType");
        this.f22579a.a(z11, authenticationType);
    }

    public final void s(AuthenticationSourcePage sourcePage) {
        o.i(sourcePage, "sourcePage");
        this.f22585g = sourcePage;
    }

    public final void v(String verifyIntention) {
        o.i(verifyIntention, "verifyIntention");
        t(la.a.a(verifyIntention));
    }
}
