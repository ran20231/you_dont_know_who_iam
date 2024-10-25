package com.forsale.app.features.more.user.editprofile;

import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.datalayer.network.ResponseWrapper;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.datalayer.network.services.UploaderServices;
import com.forsale.app.datalayer.repositories.MutexIsLockedException;
import com.forsale.app.datalayer.repositories.UserRepository;
import com.forsale.app.features.auth.utils.AuthErrorHandler;
import com.forsale.app.features.auth.utils.AuthServerErrorsState;
import com.forsale.app.features.more.user.editprofile.a;
import com.forsale.app.features.more.user.editprofile.g;
import com.forsale.app.ui.bottomsheets.logout.interactors.LogoutInteractor;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.ProfileActionType;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import com.forsale.app.utils.prefUtils.preferences.UserSharedPref;
import g00.l;
import java.io.File;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import wz.p;
/* compiled from: EditProfileViewModel.kt */
/* loaded from: classes2.dex */
public final class EditProfileViewModel extends q0 {
    public static final a K = new a(null);
    public static final int L = 8;
    private final MutableStateFlow<g> A;
    private final StateFlow<g> B;
    private final Flow<UserEntity> C;
    private final StateFlow<UserEntity> D;
    private final MutableSharedFlow<lf.a> E;
    private final SharedFlow<lf.a> F;
    private final MutableStateFlow<fe.a> G;
    private final StateFlow<fe.a> H;
    private final MutableStateFlow<fe.a> I;
    private final StateFlow<fe.a> J;

    /* renamed from: a  reason: collision with root package name */
    private final UploaderServices f32968a;

    /* renamed from: b  reason: collision with root package name */
    private final he.a f32969b;

    /* renamed from: c  reason: collision with root package name */
    private final jj.b f32970c;

    /* renamed from: d  reason: collision with root package name */
    private final UserRepository f32971d;

    /* renamed from: e  reason: collision with root package name */
    private final UserProfileInteractor f32972e;

    /* renamed from: f  reason: collision with root package name */
    private final com.forsale.app.features.more.user.editprofile.b f32973f;

    /* renamed from: g  reason: collision with root package name */
    private final ge.a f32974g;

    /* renamed from: h  reason: collision with root package name */
    private final LogoutInteractor f32975h;

    /* renamed from: i  reason: collision with root package name */
    private final AuthErrorHandler f32976i;

    /* renamed from: j  reason: collision with root package name */
    private final AggregatedAllAnalyticsLogger f32977j;

    /* renamed from: x  reason: collision with root package name */
    private final CoroutineDispatcher f32978x;

    /* renamed from: y  reason: collision with root package name */
    private final MutableSharedFlow<com.forsale.app.features.more.user.editprofile.a> f32979y;

    /* renamed from: z  reason: collision with root package name */
    private final SharedFlow<com.forsale.app.features.more.user.editprofile.a> f32980z;

    /* compiled from: EditProfileViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditProfileViewModel f32991a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.Key key, EditProfileViewModel editProfileViewModel) {
            super(key);
            this.f32991a = editProfileViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            this.f32991a.T(th2);
        }
    }

    public EditProfileViewModel(UploaderServices profileImageUploaderService, he.a logoutAnalyticsInteractor, jj.b prefs, UserRepository userRepository, UserProfileInteractor userProfileInteractor, com.forsale.app.features.more.user.editprofile.b editProfileAnalyticsInteractor, ge.a deleteUserInteractor, LogoutInteractor logoutInteractor, AuthErrorHandler errorHandler, AggregatedAllAnalyticsLogger analyticsLogger, CoroutineDispatcher ioDispatcher) {
        o.i(profileImageUploaderService, "profileImageUploaderService");
        o.i(logoutAnalyticsInteractor, "logoutAnalyticsInteractor");
        o.i(prefs, "prefs");
        o.i(userRepository, "userRepository");
        o.i(userProfileInteractor, "userProfileInteractor");
        o.i(editProfileAnalyticsInteractor, "editProfileAnalyticsInteractor");
        o.i(deleteUserInteractor, "deleteUserInteractor");
        o.i(logoutInteractor, "logoutInteractor");
        o.i(errorHandler, "errorHandler");
        o.i(analyticsLogger, "analyticsLogger");
        o.i(ioDispatcher, "ioDispatcher");
        this.f32968a = profileImageUploaderService;
        this.f32969b = logoutAnalyticsInteractor;
        this.f32970c = prefs;
        this.f32971d = userRepository;
        this.f32972e = userProfileInteractor;
        this.f32973f = editProfileAnalyticsInteractor;
        this.f32974g = deleteUserInteractor;
        this.f32975h = logoutInteractor;
        this.f32976i = errorHandler;
        this.f32977j = analyticsLogger;
        this.f32978x = ioDispatcher;
        MutableSharedFlow<com.forsale.app.features.more.user.editprofile.a> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f32979y = MutableSharedFlow$default;
        this.f32980z = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableStateFlow<g> MutableStateFlow = StateFlowKt.MutableStateFlow(g.b.f33381a);
        this.A = MutableStateFlow;
        this.B = FlowKt.asStateFlow(MutableStateFlow);
        final Flow<UserEntity> j11 = userProfileInteractor.j();
        this.C = j11;
        this.D = FlowKt.stateIn(new Flow<UserEntity>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.more.user.editprofile.EditProfileViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f32982a;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.editprofile.EditProfileViewModel$special$$inlined$map$1$2", f = "EditProfileViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.more.user.editprofile.EditProfileViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f32983a;

                    /* renamed from: b  reason: collision with root package name */
                    int f32984b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f32983a = obj;
                        this.f32984b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f32982a = flowCollector;
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
                        boolean r0 = r6 instanceof com.forsale.app.features.more.user.editprofile.EditProfileViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.app.features.more.user.editprofile.EditProfileViewModel$special$$inlined$map$1$2$1 r0 = (com.forsale.app.features.more.user.editprofile.EditProfileViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f32984b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f32984b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.more.user.editprofile.EditProfileViewModel$special$$inlined$map$1$2$1 r0 = new com.forsale.app.features.more.user.editprofile.EditProfileViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f32983a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f32984b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L41
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f32982a
                        com.forsale.app.datalayer.database.UserEntity r5 = (com.forsale.app.datalayer.database.UserEntity) r5
                        r0.f32984b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L41
                        return r1
                    L41:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.editprofile.EditProfileViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super UserEntity> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        }, r0.a(this), SharingStarted.Companion.getEagerly(), null);
        MutableSharedFlow<lf.a> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.E = MutableSharedFlow$default2;
        this.F = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        MutableStateFlow<fe.a> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new fe.a(false, 1, null));
        this.G = MutableStateFlow2;
        this.H = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<fe.a> MutableStateFlow3 = StateFlowKt.MutableStateFlow(new fe.a(false, 1, null));
        this.I = MutableStateFlow3;
        this.J = FlowKt.asStateFlow(MutableStateFlow3);
        i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), this.f32978x, null, new EditProfileViewModel$accountDeletedSuccessfully$1(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(String str) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), this.f32978x, null, new EditProfileViewModel$accountLoggedOutSuccessfully$1(this, str, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object I(zz.a<? super String> aVar) {
        return this.f32970c.c().a(aVar);
    }

    private final void J(com.forsale.app.features.more.user.editprofile.a aVar, g00.a<p> aVar2) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new EditProfileViewModel$emitEditAction$1(this, aVar, aVar2, null), 3, null);
    }

    private final void K() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new EditProfileViewModel$failedState$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(Throwable th2) {
        boolean N;
        K();
        if (th2 instanceof ConnectivityInterceptor.ConnectivityException) {
            BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new EditProfileViewModel$handle$1(this, null), 3, null);
        } else if (th2 instanceof ResponseWrapper.ResponseErrorException) {
            BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new EditProfileViewModel$handle$2(this, th2, null), 3, null);
        } else if (th2 instanceof MutexIsLockedException) {
            x10.a.b("Session is called twice", new Object[0]);
        } else {
            String message = th2.getMessage();
            if (message != null) {
                N = StringsKt__StringsKt.N(message, "401", false, 2, null);
                if (!N) {
                    BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new EditProfileViewModel$handle$3$2(this, null), 3, null);
                } else {
                    this.f32976i.a(new l<bj.c, p>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileViewModel$handle$3$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            super(1);
                        }

                        public final void b(final bj.c errorState) {
                            o.i(errorState, "errorState");
                            AuthServerErrorsState.a aVar = AuthServerErrorsState.f22915b;
                            final EditProfileViewModel editProfileViewModel = EditProfileViewModel.this;
                            aVar.a(errorState, new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileViewModel$handle$3$1.1

                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* compiled from: EditProfileViewModel.kt */
                                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.editprofile.EditProfileViewModel$handle$3$1$1$1", f = "EditProfileViewModel.kt", l = {313, 314}, m = "invokeSuspend")
                                /* renamed from: com.forsale.app.features.more.user.editprofile.EditProfileViewModel$handle$3$1$1$1  reason: invalid class name and collision with other inner class name */
                                /* loaded from: classes2.dex */
                                public static final class C03591 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

                                    /* renamed from: a  reason: collision with root package name */
                                    int f33005a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ EditProfileViewModel f33006b;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C03591(EditProfileViewModel editProfileViewModel, zz.a<? super C03591> aVar) {
                                        super(2, aVar);
                                        this.f33006b = editProfileViewModel;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final zz.a<p> create(Object obj, zz.a<?> aVar) {
                                        return new C03591(this.f33006b, aVar);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        Object f11;
                                        jj.b bVar;
                                        UserRepository userRepository;
                                        f11 = kotlin.coroutines.intrinsics.b.f();
                                        int i11 = this.f33005a;
                                        if (i11 != 0) {
                                            if (i11 != 1) {
                                                if (i11 == 2) {
                                                    kotlin.f.b(obj);
                                                    return p.f75480a;
                                                }
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            kotlin.f.b(obj);
                                        } else {
                                            kotlin.f.b(obj);
                                            bVar = this.f33006b.f32970c;
                                            UserSharedPref l11 = bVar.l();
                                            this.f33005a = 1;
                                            if (l11.f(this) == f11) {
                                                return f11;
                                            }
                                        }
                                        userRepository = this.f33006b.f32971d;
                                        UserEntity userEntity = new UserEntity(0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
                                        this.f33005a = 2;
                                        if (userRepository.updateCachedUser(userEntity, this) == f11) {
                                            return f11;
                                        }
                                        return p.f75480a;
                                    }

                                    @Override // g00.p
                                    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
                                        return ((C03591) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
                                    }
                                }

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
                                    BuildersKt__Builders_commonKt.launch$default(r0.a(EditProfileViewModel.this), null, null, new C03591(EditProfileViewModel.this, null), 3, null);
                                }
                            }, new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileViewModel$handle$3$1.2
                                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                }

                                @Override // g00.a
                                public /* bridge */ /* synthetic */ p invoke() {
                                    invoke2();
                                    return p.f75480a;
                                }
                            }, new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileViewModel$handle$3$1.3
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
                                    bj.c cVar = bj.c.this;
                                    o.g(cVar, "null cannot be cast to non-null type com.forsale.app.features.auth.utils.AuthServerErrorsState");
                                    x10.a.b(((AuthServerErrorsState) cVar).a(), new Object[0]);
                                }
                            });
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ p invoke(bj.c cVar) {
                            b(cVar);
                            return p.f75480a;
                        }
                    }).b(th2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new EditProfileViewModel$logAccountDetailsLogoutClicked$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new EditProfileViewModel$logChangeImageClicked$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y() {
        this.f32973f.b(new xi.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new EditProfileViewModel$logChangePasswordClicked$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new EditProfileViewModel$logDeleteAccountClicked$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new EditProfileViewModel$logLogoutClicked$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(ProfileActionType profileActionType) {
        AggregatedAllAnalyticsLoggerKt.t0(this.f32977j, profileActionType);
    }

    private final void i0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), getCoroutineContext(), null, new EditProfileViewModel$refreshUser$1(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0025, code lost:
        if (r0 != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l0(com.forsale.app.datalayer.database.UserEntity r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L41
            java.lang.String r0 = r5.getFirstName()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L13
            boolean r0 = kotlin.text.k.v(r0)
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = r1
            goto L14
        L13:
            r0 = r2
        L14:
            r3 = 0
            if (r0 != 0) goto L18
            goto L19
        L18:
            r5 = r3
        L19:
            if (r5 == 0) goto L41
            java.lang.String r0 = r5.getImage()
            if (r0 == 0) goto L27
            boolean r0 = kotlin.text.k.v(r0)
            if (r0 == 0) goto L28
        L27:
            r1 = r2
        L28:
            if (r1 != 0) goto L2b
            r3 = r5
        L2b:
            if (r3 == 0) goto L41
            falcon.chat.Chat$Companion r5 = falcon.chat.Chat.f55705a
            java.lang.String r0 = r3.getFirstName()
            if (r0 != 0) goto L37
            java.lang.String r0 = ""
        L37:
            java.lang.String r1 = r3.getImage()
            kotlin.jvm.internal.o.f(r1)
            r5.x(r0, r1)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.editprofile.EditProfileViewModel.l0(com.forsale.app.datalayer.database.UserEntity):void");
    }

    public final StateFlow<fe.a> L() {
        return this.H;
    }

    public final SharedFlow<com.forsale.app.features.more.user.editprofile.a> M() {
        return this.f32980z;
    }

    public final SharedFlow<lf.a> N() {
        return this.F;
    }

    public final StateFlow<fe.a> O() {
        return this.J;
    }

    public final StateFlow<g> Q() {
        return this.B;
    }

    public final Flow<UserEntity> S() {
        return this.C;
    }

    public final void d0(com.forsale.app.features.more.user.editprofile.a action) {
        o.i(action, "action");
        if (o.d(action, a.d.f33111a)) {
            J(action, new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileViewModel$onActionClicked$1
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ p invoke() {
                    invoke2();
                    return p.f75480a;
                }
            });
        } else if (o.d(action, a.c.f33110a)) {
            J(action, new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileViewModel$onActionClicked$2
                /* JADX INFO: Access modifiers changed from: package-private */
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
                    EditProfileViewModel.this.X();
                }
            });
        } else if (o.d(action, a.C0360a.f33108a)) {
            J(action, new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileViewModel$onActionClicked$3
                /* JADX INFO: Access modifiers changed from: package-private */
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
                    EditProfileViewModel.this.Z();
                }
            });
        } else if (o.d(action, a.e.f33112a)) {
            J(action, new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileViewModel$onActionClicked$4
                /* JADX INFO: Access modifiers changed from: package-private */
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
                    EditProfileViewModel.this.V();
                }
            });
        } else if (o.d(action, a.b.f33109a)) {
            J(action, new g00.a<p>() { // from class: com.forsale.app.features.more.user.editprofile.EditProfileViewModel$onActionClicked$5
                /* JADX INFO: Access modifiers changed from: package-private */
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
                    EditProfileViewModel.this.a0();
                }
            });
        }
    }

    public final void e0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new EditProfileViewModel$onChangePasswordSuccessfully$1(this, null), 3, null);
    }

    public final void f0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), getCoroutineContext(), null, new EditProfileViewModel$onDeleteProfileClicked$1(this, null), 2, null);
    }

    public final void g0(boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), getCoroutineContext(), null, new EditProfileViewModel$onLogoutProfileClicked$1(this, z11, null), 2, null);
    }

    public final CoroutineContext getCoroutineContext() {
        return this.f32978x.plus(new b(CoroutineExceptionHandler.Key, this));
    }

    public final void h0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new EditProfileViewModel$onPersonalInformationSavedSuccessfully$1(this, null), 3, null);
    }

    public final void j0(boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new EditProfileViewModel$showDeleteBottomSheet$1(this, z11, null), 3, null);
    }

    public final void k0(boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new EditProfileViewModel$showLogoutBottomSheet$1(this, z11, null), 3, null);
    }

    public final void m0(File imageFile) {
        o.i(imageFile, "imageFile");
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), getCoroutineContext(), null, new EditProfileViewModel$uploadNewProfileImage$1(imageFile, this, null), 2, null);
    }
}
