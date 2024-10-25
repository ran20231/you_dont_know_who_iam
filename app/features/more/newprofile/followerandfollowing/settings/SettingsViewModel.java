package com.forsale.app.features.more.newprofile.followerandfollowing.settings;

import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import bj.c;
import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.datalayer.network.ResponseWrapper;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.datalayer.repositories.MutexIsLockedException;
import com.forsale.app.datalayer.repositories.UserRepository;
import com.forsale.app.features.auth.utils.AuthErrorHandler;
import com.forsale.app.features.auth.utils.AuthServerErrorsState;
import com.forsale.app.utils.facades.user.UpdateUserInteractor;
import com.forsale.app.utils.prefUtils.preferences.UserSharedPref;
import g00.l;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
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
import wd.b;
import wz.p;
import zz.a;
/* compiled from: SettingsViewModel.kt */
/* loaded from: classes2.dex */
public final class SettingsViewModel extends q0 {

    /* renamed from: a  reason: collision with root package name */
    private final b f32348a;

    /* renamed from: b  reason: collision with root package name */
    private final UserRepository f32349b;

    /* renamed from: c  reason: collision with root package name */
    private final UpdateUserInteractor f32350c;

    /* renamed from: d  reason: collision with root package name */
    private final CoroutineDispatcher f32351d;

    /* renamed from: e  reason: collision with root package name */
    private final jj.b f32352e;

    /* renamed from: f  reason: collision with root package name */
    private final AuthErrorHandler f32353f;

    /* renamed from: g  reason: collision with root package name */
    private final MutableSharedFlow<lf.a> f32354g;

    /* renamed from: h  reason: collision with root package name */
    private final SharedFlow<lf.a> f32355h;

    /* renamed from: i  reason: collision with root package name */
    private final MutableStateFlow<fe.a> f32356i;

    /* renamed from: j  reason: collision with root package name */
    private final StateFlow<fe.a> f32357j;

    /* renamed from: x  reason: collision with root package name */
    private final Flow<UserEntity> f32358x;

    /* renamed from: y  reason: collision with root package name */
    private final StateFlow<Boolean> f32359y;

    /* renamed from: z  reason: collision with root package name */
    private final StateFlow<UserEntity> f32360z;

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SettingsViewModel f32371a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.Key key, SettingsViewModel settingsViewModel) {
            super(key);
            this.f32371a = settingsViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            this.f32371a.r(th2);
        }
    }

    public SettingsViewModel(b followersAndFollowingAnalyticsInteractor, UserRepository userRepository, UpdateUserInteractor updateUserInteractor, CoroutineDispatcher ioDispatcher, jj.b prefs, AuthErrorHandler errorHandler) {
        o.i(followersAndFollowingAnalyticsInteractor, "followersAndFollowingAnalyticsInteractor");
        o.i(userRepository, "userRepository");
        o.i(updateUserInteractor, "updateUserInteractor");
        o.i(ioDispatcher, "ioDispatcher");
        o.i(prefs, "prefs");
        o.i(errorHandler, "errorHandler");
        this.f32348a = followersAndFollowingAnalyticsInteractor;
        this.f32349b = userRepository;
        this.f32350c = updateUserInteractor;
        this.f32351d = ioDispatcher;
        this.f32352e = prefs;
        this.f32353f = errorHandler;
        MutableSharedFlow<lf.a> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f32354g = MutableSharedFlow$default;
        this.f32355h = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableStateFlow<fe.a> MutableStateFlow = StateFlowKt.MutableStateFlow(new fe.a(false, 1, null));
        this.f32356i = MutableStateFlow;
        this.f32357j = FlowKt.asStateFlow(MutableStateFlow);
        final Flow<UserEntity> userAsFlow = userRepository.getUserAsFlow();
        this.f32358x = userAsFlow;
        Flow<Boolean> flow = new Flow<Boolean>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f32362a;

                /* compiled from: Emitters.kt */
                @d(c = "com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel$special$$inlined$map$1$2", f = "SettingsViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f32363a;

                    /* renamed from: b  reason: collision with root package name */
                    int f32364b;

                    public AnonymousClass1(a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f32363a = obj;
                        this.f32364b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f32362a = flowCollector;
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
                        boolean r0 = r6 instanceof com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel$special$$inlined$map$1$2$1 r0 = (com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f32364b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f32364b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel$special$$inlined$map$1$2$1 r0 = new com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f32363a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f32364b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L51
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f32362a
                        com.forsale.app.datalayer.database.UserEntity r5 = (com.forsale.app.datalayer.database.UserEntity) r5
                        if (r5 == 0) goto L3f
                        java.lang.Integer r5 = r5.getAllowFollow()
                        goto L40
                    L3f:
                        r5 = 0
                    L40:
                        boolean r5 = com.forsale.app.utils.TypeExtensionsKt.i0(r5)
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
                        r0.f32364b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L51
                        return r1
                    L51:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        };
        CoroutineScope a11 = r0.a(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        this.f32359y = FlowKt.stateIn(flow, a11, companion.getEagerly(), Boolean.FALSE);
        this.f32360z = FlowKt.stateIn(new Flow<UserEntity>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel$special$$inlined$map$2

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel$special$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f32367a;

                /* compiled from: Emitters.kt */
                @d(c = "com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel$special$$inlined$map$2$2", f = "SettingsViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel$special$$inlined$map$2$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f32368a;

                    /* renamed from: b  reason: collision with root package name */
                    int f32369b;

                    public AnonymousClass1(a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f32368a = obj;
                        this.f32369b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f32367a = flowCollector;
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
                        boolean r0 = r6 instanceof com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel$special$$inlined$map$2$2$1 r0 = (com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f32369b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f32369b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel$special$$inlined$map$2$2$1 r0 = new com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel$special$$inlined$map$2$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f32368a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f32369b
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
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f32367a
                        com.forsale.app.datalayer.database.UserEntity r5 = (com.forsale.app.datalayer.database.UserEntity) r5
                        r0.f32369b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L41
                        return r1
                    L41:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super UserEntity> flowCollector, a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        }, r0.a(this), companion.getEagerly(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(Throwable th2) {
        boolean N;
        if (th2 instanceof ConnectivityInterceptor.ConnectivityException) {
            BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new SettingsViewModel$handle$1(this, null), 3, null);
        } else if (th2 instanceof ResponseWrapper.ResponseErrorException) {
            BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new SettingsViewModel$handle$2(this, th2, null), 3, null);
        } else if (th2 instanceof MutexIsLockedException) {
            x10.a.b("Session is called twice", new Object[0]);
        } else {
            String message = th2.getMessage();
            if (message != null) {
                N = StringsKt__StringsKt.N(message, "401", false, 2, null);
                if (!N) {
                    BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new SettingsViewModel$handle$3$2(this, null), 3, null);
                } else {
                    this.f32353f.a(new l<c, p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel$handle$3$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            super(1);
                        }

                        public final void b(final c errorState) {
                            o.i(errorState, "errorState");
                            AuthServerErrorsState.a aVar = AuthServerErrorsState.f22915b;
                            final SettingsViewModel settingsViewModel = SettingsViewModel.this;
                            aVar.a(errorState, new g00.a<p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel$handle$3$1.1

                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* compiled from: SettingsViewModel.kt */
                                @d(c = "com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel$handle$3$1$1$1", f = "SettingsViewModel.kt", l = {121, 122}, m = "invokeSuspend")
                                /* renamed from: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel$handle$3$1$1$1  reason: invalid class name and collision with other inner class name */
                                /* loaded from: classes2.dex */
                                public static final class C03551 extends SuspendLambda implements g00.p<CoroutineScope, a<? super p>, Object> {

                                    /* renamed from: a  reason: collision with root package name */
                                    int f32379a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ SettingsViewModel f32380b;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C03551(SettingsViewModel settingsViewModel, a<? super C03551> aVar) {
                                        super(2, aVar);
                                        this.f32380b = settingsViewModel;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final a<p> create(Object obj, a<?> aVar) {
                                        return new C03551(this.f32380b, aVar);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        Object f11;
                                        jj.b bVar;
                                        UserRepository userRepository;
                                        f11 = kotlin.coroutines.intrinsics.b.f();
                                        int i11 = this.f32379a;
                                        if (i11 != 0) {
                                            if (i11 != 1) {
                                                if (i11 == 2) {
                                                    f.b(obj);
                                                    return p.f75480a;
                                                }
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            f.b(obj);
                                        } else {
                                            f.b(obj);
                                            bVar = this.f32380b.f32352e;
                                            UserSharedPref l11 = bVar.l();
                                            this.f32379a = 1;
                                            if (l11.f(this) == f11) {
                                                return f11;
                                            }
                                        }
                                        userRepository = this.f32380b.f32349b;
                                        UserEntity userEntity = new UserEntity(0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
                                        this.f32379a = 2;
                                        if (userRepository.updateCachedUser(userEntity, this) == f11) {
                                            return f11;
                                        }
                                        return p.f75480a;
                                    }

                                    @Override // g00.p
                                    public final Object invoke(CoroutineScope coroutineScope, a<? super p> aVar) {
                                        return ((C03551) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
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
                                    BuildersKt__Builders_commonKt.launch$default(r0.a(SettingsViewModel.this), null, null, new C03551(SettingsViewModel.this, null), 3, null);
                                }
                            }, new g00.a<p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel$handle$3$1.2
                                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                }

                                @Override // g00.a
                                public /* bridge */ /* synthetic */ p invoke() {
                                    invoke2();
                                    return p.f75480a;
                                }
                            }, new g00.a<p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel$handle$3$1.3
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
                                    c cVar = c.this;
                                    o.g(cVar, "null cannot be cast to non-null type com.forsale.app.features.auth.utils.AuthServerErrorsState");
                                    x10.a.b(((AuthServerErrorsState) cVar).a(), new Object[0]);
                                }
                            });
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ p invoke(c cVar) {
                            b(cVar);
                            return p.f75480a;
                        }
                    }).b(th2);
                }
            }
        }
    }

    public final CoroutineContext getCoroutineContext() {
        return this.f32351d.plus(new a(CoroutineExceptionHandler.Key, this));
    }

    public final StateFlow<Boolean> m() {
        return this.f32359y;
    }

    public final SharedFlow<lf.a> o() {
        return this.f32355h;
    }

    public final StateFlow<fe.a> p() {
        return this.f32357j;
    }

    public final StateFlow<UserEntity> q() {
        return this.f32360z;
    }

    public final void s(boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new SettingsViewModel$showSettingsBottomSheet$1(this, z11, null), 3, null);
    }

    public final void t(boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), getCoroutineContext(), null, new SettingsViewModel$updateUser$1(this, z11, null), 2, null);
    }
}
