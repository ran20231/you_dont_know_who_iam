package com.forsale.app.features.more.user.editprofile.logout;

import android.text.Spanned;
import androidx.databinding.ObservableField;
import androidx.lifecycle.r0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.datalayer.network.ResponseWrapper;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.features.auth.UserStatus;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import t9.y0;
import wz.p;
import zz.a;
/* compiled from: LogoutViewModel.kt */
/* loaded from: classes2.dex */
public final class LogoutViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final ie.a f33448k0;

    /* renamed from: l0  reason: collision with root package name */
    private final he.a f33449l0;

    /* renamed from: m0  reason: collision with root package name */
    private final UserProfileInteractor f33450m0;

    /* renamed from: n0  reason: collision with root package name */
    private final ObservableField<Spanned> f33451n0;

    /* renamed from: o0  reason: collision with root package name */
    private final MutableSharedFlow<p> f33452o0;

    /* renamed from: p0  reason: collision with root package name */
    private final SharedFlow<p> f33453p0;

    /* renamed from: q0  reason: collision with root package name */
    private final MutableSharedFlow<p> f33454q0;

    /* renamed from: r0  reason: collision with root package name */
    private final SharedFlow<p> f33455r0;

    /* renamed from: s0  reason: collision with root package name */
    private final Flow<UserEntity> f33456s0;

    /* renamed from: t0  reason: collision with root package name */
    private final StateFlow<UserStatus> f33457t0;

    /* renamed from: u0  reason: collision with root package name */
    private final StateFlow<String> f33458u0;

    /* renamed from: v0  reason: collision with root package name */
    private final StateFlow<Integer> f33459v0;

    /* renamed from: w0  reason: collision with root package name */
    private final CoroutineExceptionHandler f33460w0;

    /* compiled from: LogoutViewModel.kt */
    @d(c = "com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$1", f = "LogoutViewModel.kt", l = {64}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f33479a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LogoutViewModel.kt */
        @d(c = "com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$1$1", f = "LogoutViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C03631 extends SuspendLambda implements g00.p<UserStatus, zz.a<? super p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f33481a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f33482b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ LogoutViewModel f33483c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03631(LogoutViewModel logoutViewModel, zz.a<? super C03631> aVar) {
                super(2, aVar);
                this.f33483c = logoutViewModel;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(UserStatus userStatus, zz.a<? super p> aVar) {
                return ((C03631) create(userStatus, aVar)).invokeSuspend(p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<p> create(Object obj, zz.a<?> aVar) {
                C03631 c03631 = new C03631(this.f33483c, aVar);
                c03631.f33482b = obj;
                return c03631;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                b.f();
                if (this.f33481a == 0) {
                    f.b(obj);
                    LogoutViewModel logoutViewModel = this.f33483c;
                    logoutViewModel.H0((UserStatus) this.f33482b, logoutViewModel.I0().getValue().intValue());
                    return p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        AnonymousClass1(zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f33479a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                StateFlow<UserStatus> J0 = LogoutViewModel.this.J0();
                C03631 c03631 = new C03631(LogoutViewModel.this, null);
                this.f33479a = 1;
                if (FlowKt.collectLatest(J0, c03631, this) == f11) {
                    return f11;
                }
            }
            return p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LogoutViewModel f33484a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.Key key, LogoutViewModel logoutViewModel) {
            super(key);
            this.f33484a = logoutViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            this.f33484a.D0(th2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoutViewModel(ie.a getLogoutTextInteractor, he.a logoutAnalyticsInteractor, UserProfileInteractor userProfileInteractor, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(getLogoutTextInteractor, "getLogoutTextInteractor");
        o.i(logoutAnalyticsInteractor, "logoutAnalyticsInteractor");
        o.i(userProfileInteractor, "userProfileInteractor");
        o.i(baseRepository, "baseRepository");
        this.f33448k0 = getLogoutTextInteractor;
        this.f33449l0 = logoutAnalyticsInteractor;
        this.f33450m0 = userProfileInteractor;
        this.f33451n0 = new ObservableField<>();
        MutableSharedFlow<p> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f33452o0 = MutableSharedFlow$default;
        this.f33453p0 = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableSharedFlow<p> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f33454q0 = MutableSharedFlow$default2;
        this.f33455r0 = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        final Flow<UserEntity> j11 = userProfileInteractor.j();
        this.f33456s0 = j11;
        Flow<UserStatus> flow = new Flow<UserStatus>() { // from class: com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f33463a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ LogoutViewModel f33464b;

                /* compiled from: Emitters.kt */
                @d(c = "com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$special$$inlined$map$1$2", f = "LogoutViewModel.kt", l = {224, 223}, m = "emit")
                /* renamed from: com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f33465a;

                    /* renamed from: b  reason: collision with root package name */
                    int f33466b;

                    /* renamed from: c  reason: collision with root package name */
                    Object f33467c;

                    public AnonymousClass1(a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f33465a = obj;
                        this.f33466b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, LogoutViewModel logoutViewModel) {
                    this.f33463a = flowCollector;
                    this.f33464b = logoutViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[RETURN] */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, zz.a r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$special$$inlined$map$1$2$1 r0 = (com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f33466b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f33466b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$special$$inlined$map$1$2$1 r0 = new com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f33465a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f33466b
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3c
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        kotlin.f.b(r8)
                        goto L71
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        java.lang.Object r7 = r0.f33467c
                        kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                        kotlin.f.b(r8)
                        goto L65
                    L3c:
                        kotlin.f.b(r8)
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.f33463a
                        com.forsale.app.datalayer.database.UserEntity r7 = (com.forsale.app.datalayer.database.UserEntity) r7
                        com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel r2 = r6.f33464b
                        com.forsale.app.utils.facades.user.UserProfileInteractor r2 = com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel.A0(r2)
                        if (r7 == 0) goto L56
                        java.lang.Integer r7 = r7.isBlock()
                        if (r7 == 0) goto L56
                        int r7 = r7.intValue()
                        goto L57
                    L56:
                        r7 = 0
                    L57:
                        r0.f33467c = r8
                        r0.f33466b = r4
                        java.lang.Object r7 = r2.q(r7, r0)
                        if (r7 != r1) goto L62
                        return r1
                    L62:
                        r5 = r8
                        r8 = r7
                        r7 = r5
                    L65:
                        r2 = 0
                        r0.f33467c = r2
                        r0.f33466b = r3
                        java.lang.Object r7 = r7.emit(r8, r0)
                        if (r7 != r1) goto L71
                        return r1
                    L71:
                        wz.p r7 = wz.p.f75480a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super UserStatus> flowCollector, a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), aVar);
                f11 = b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        };
        CoroutineScope a11 = r0.a(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        this.f33457t0 = FlowKt.stateIn(flow, a11, companion.getEagerly(), UserStatus.NotLoggedIn);
        this.f33458u0 = FlowKt.stateIn(new Flow<String>() { // from class: com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$special$$inlined$map$2

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$special$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f33470a;

                /* compiled from: Emitters.kt */
                @d(c = "com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$special$$inlined$map$2$2", f = "LogoutViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$special$$inlined$map$2$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f33471a;

                    /* renamed from: b  reason: collision with root package name */
                    int f33472b;

                    public AnonymousClass1(a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f33471a = obj;
                        this.f33472b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f33470a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, zz.a r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$special$$inlined$map$2$2$1 r0 = (com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f33472b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f33472b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$special$$inlined$map$2$2$1 r0 = new com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$special$$inlined$map$2$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f33471a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f33472b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L4b
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f33470a
                        com.forsale.app.datalayer.database.UserEntity r5 = (com.forsale.app.datalayer.database.UserEntity) r5
                        if (r5 == 0) goto L40
                        java.lang.String r5 = r5.getPhone()
                        if (r5 != 0) goto L42
                    L40:
                        java.lang.String r5 = ""
                    L42:
                        r0.f33472b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4b
                        return r1
                    L4b:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), aVar);
                f11 = b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        }, r0.a(this), companion.getEagerly(), "");
        this.f33459v0 = FlowKt.stateIn(new Flow<Integer>() { // from class: com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$special$$inlined$map$3

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$special$$inlined$map$3$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f33475a;

                /* compiled from: Emitters.kt */
                @d(c = "com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$special$$inlined$map$3$2", f = "LogoutViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$special$$inlined$map$3$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f33476a;

                    /* renamed from: b  reason: collision with root package name */
                    int f33477b;

                    public AnonymousClass1(a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f33476a = obj;
                        this.f33477b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f33475a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, zz.a r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$special$$inlined$map$3.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$special$$inlined$map$3$2$1 r0 = (com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f33477b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f33477b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$special$$inlined$map$3$2$1 r0 = new com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$special$$inlined$map$3$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f33476a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f33477b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L53
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f33475a
                        com.forsale.app.datalayer.database.UserEntity r5 = (com.forsale.app.datalayer.database.UserEntity) r5
                        if (r5 == 0) goto L45
                        java.lang.Integer r5 = r5.getRegionId()
                        if (r5 == 0) goto L45
                        int r5 = r5.intValue()
                        goto L46
                    L45:
                        r5 = r3
                    L46:
                        java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)
                        r0.f33477b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L53
                        return r1
                    L53:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Integer> flowCollector, a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), aVar);
                f11 = b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        }, r0.a(this), companion.getEagerly(), 1);
        this.f33460w0 = new a(CoroutineExceptionHandler.Key, this);
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D0(Throwable th2) {
        if (th2 instanceof ConnectivityInterceptor.ConnectivityException) {
            g0().tryEmit(Integer.valueOf(y0.X4));
        } else if (th2 instanceof ResponseWrapper.ResponseErrorException) {
            i0().tryEmit(((ResponseWrapper.ResponseErrorException) th2).getLocalizedMessage());
        } else {
            g0().tryEmit(Integer.valueOf(y0.O4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E0(zz.a<? super UserEntity> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new LogoutViewModel$getCachedUser$2(this, null), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0(UserStatus userStatus, int i11) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new LogoutViewModel$getLogoutText$1(userStatus, this, i11, null), 3, null);
    }

    private final void K0(boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new LogoutViewModel$logLogoutClicked$1(this, z11, null), 3, null);
    }

    public final ObservableField<Spanned> G0() {
        return this.f33451n0;
    }

    public final StateFlow<Integer> I0() {
        return this.f33459v0;
    }

    public final StateFlow<UserStatus> J0() {
        return this.f33457t0;
    }

    public final void L0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new LogoutViewModel$onLogoutClicked$1(this, null), 3, null);
        K0(false);
    }

    public final void M0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new LogoutViewModel$onLogoutFromAllClicked$1(this, null), 3, null);
        K0(true);
    }

    @Override // com.forsale.app.base.viewmodels.BaseViewModel, kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return super.getCoroutineContext().plus(this.f33460w0);
    }
}
