package com.forsale.app.features.more.newprofile.followerandfollowing;

import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import androidx.paging.PagingData;
import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.datalayer.network.ResponseWrapper;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.datalayer.repositories.MutexIsLockedException;
import com.forsale.app.datalayer.repositories.UserRepository;
import com.forsale.app.features.auth.utils.AuthErrorHandler;
import com.forsale.app.features.auth.utils.AuthServerErrorsState;
import com.forsale.app.features.more.newprofile.followerandfollowing.itemui.CTAsState;
import com.forsale.app.utils.facades.user.UpdateUserInteractor;
import g00.l;
import j0.k0;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
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
import xd.c;
/* compiled from: FollowersAndFollowingsViewModel.kt */
/* loaded from: classes2.dex */
public final class FollowersAndFollowingsViewModel extends q0 {
    private final MutableStateFlow<PagingData<yd.a>> A;
    private final StateFlow<PagingData<yd.a>> B;
    private final MutableStateFlow<Boolean> C;
    private final MutableStateFlow<Boolean> D;
    private final Flow<UserEntity> E;
    private final StateFlow<String> F;
    private final MutableSharedFlow<lf.a> G;
    private final SharedFlow<lf.a> H;
    private final CoroutineContext I;

    /* renamed from: a  reason: collision with root package name */
    private final b f32191a;

    /* renamed from: b  reason: collision with root package name */
    private final xd.b f32192b;

    /* renamed from: c  reason: collision with root package name */
    private final UserRepository f32193c;

    /* renamed from: d  reason: collision with root package name */
    private final UpdateUserInteractor f32194d;

    /* renamed from: e  reason: collision with root package name */
    private final xd.a f32195e;

    /* renamed from: f  reason: collision with root package name */
    private final c f32196f;

    /* renamed from: g  reason: collision with root package name */
    private final AuthErrorHandler f32197g;

    /* renamed from: h  reason: collision with root package name */
    private final jj.b f32198h;

    /* renamed from: i  reason: collision with root package name */
    private final CoroutineDispatcher f32199i;

    /* renamed from: j  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f32200j;

    /* renamed from: x  reason: collision with root package name */
    private final StateFlow<Boolean> f32201x;

    /* renamed from: y  reason: collision with root package name */
    private final MutableStateFlow<PagingData<yd.a>> f32202y;

    /* renamed from: z  reason: collision with root package name */
    private final StateFlow<PagingData<yd.a>> f32203z;

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FollowersAndFollowingsViewModel f32212a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.Key key, FollowersAndFollowingsViewModel followersAndFollowingsViewModel) {
            super(key);
            this.f32212a = followersAndFollowingsViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            this.f32212a.H(th2);
        }
    }

    public FollowersAndFollowingsViewModel(b followersAndFollowingAnalyticsInteractor, xd.b getFollowAndFollowingListInteractor, UserRepository userRepository, UpdateUserInteractor updateUserInteractor, xd.a followInteractor, c unFollowInteractor, AuthErrorHandler errorHandler, jj.b pref, CoroutineDispatcher ioDispatcher) {
        o.i(followersAndFollowingAnalyticsInteractor, "followersAndFollowingAnalyticsInteractor");
        o.i(getFollowAndFollowingListInteractor, "getFollowAndFollowingListInteractor");
        o.i(userRepository, "userRepository");
        o.i(updateUserInteractor, "updateUserInteractor");
        o.i(followInteractor, "followInteractor");
        o.i(unFollowInteractor, "unFollowInteractor");
        o.i(errorHandler, "errorHandler");
        o.i(pref, "pref");
        o.i(ioDispatcher, "ioDispatcher");
        this.f32191a = followersAndFollowingAnalyticsInteractor;
        this.f32192b = getFollowAndFollowingListInteractor;
        this.f32193c = userRepository;
        this.f32194d = updateUserInteractor;
        this.f32195e = followInteractor;
        this.f32196f = unFollowInteractor;
        this.f32197g = errorHandler;
        this.f32198h = pref;
        this.f32199i = ioDispatcher;
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.f32200j = MutableStateFlow;
        this.f32201x = FlowKt.asStateFlow(MutableStateFlow);
        PagingData.c cVar = PagingData.f13918e;
        MutableStateFlow<PagingData<yd.a>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(cVar.a());
        this.f32202y = MutableStateFlow2;
        this.f32203z = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<PagingData<yd.a>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(cVar.a());
        this.A = MutableStateFlow3;
        this.B = FlowKt.asStateFlow(MutableStateFlow3);
        this.C = StateFlowKt.MutableStateFlow(bool);
        this.D = StateFlowKt.MutableStateFlow(bool);
        final Flow<UserEntity> userAsFlow = userRepository.getUserAsFlow();
        this.E = userAsFlow;
        this.F = FlowKt.stateIn(new Flow<String>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f32206a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ FollowersAndFollowingsViewModel f32207b;

                /* compiled from: Emitters.kt */
                @d(c = "com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$special$$inlined$map$1$2", f = "FollowersAndFollowingsViewModel.kt", l = {224, 223}, m = "emit")
                /* renamed from: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f32208a;

                    /* renamed from: b  reason: collision with root package name */
                    int f32209b;

                    /* renamed from: c  reason: collision with root package name */
                    Object f32210c;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f32208a = obj;
                        this.f32209b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, FollowersAndFollowingsViewModel followersAndFollowingsViewModel) {
                    this.f32206a = flowCollector;
                    this.f32207b = followersAndFollowingsViewModel;
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
                    if (r7 == null) goto L25;
                 */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[RETURN] */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, zz.a r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$special$$inlined$map$1$2$1 r0 = (com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f32209b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f32209b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$special$$inlined$map$1$2$1 r0 = new com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f32208a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f32209b
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3c
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        kotlin.f.b(r8)
                        goto L72
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        java.lang.Object r7 = r0.f32210c
                        kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                        kotlin.f.b(r8)
                        goto L63
                    L3c:
                        kotlin.f.b(r8)
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.f32206a
                        com.forsale.app.datalayer.database.UserEntity r7 = (com.forsale.app.datalayer.database.UserEntity) r7
                        if (r7 == 0) goto L4b
                        java.lang.String r7 = r7.getPhone()
                        if (r7 != 0) goto L66
                    L4b:
                        com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel r7 = r6.f32207b
                        jj.b r7 = com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel.k(r7)
                        com.forsale.app.utils.prefUtils.preferences.UserSharedPref r7 = r7.l()
                        r0.f32210c = r8
                        r0.f32209b = r4
                        java.lang.Object r7 = r7.d(r0)
                        if (r7 != r1) goto L60
                        return r1
                    L60:
                        r5 = r8
                        r8 = r7
                        r7 = r5
                    L63:
                        r5 = r8
                        r8 = r7
                        r7 = r5
                    L66:
                        r2 = 0
                        r0.f32210c = r2
                        r0.f32209b = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L72
                        return r1
                    L72:
                        wz.p r7 = wz.p.f75480a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        }, r0.a(this), SharingStarted.Companion.getEagerly(), null);
        MutableSharedFlow<lf.a> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.G = MutableSharedFlow$default;
        this.H = FlowKt.asSharedFlow(MutableSharedFlow$default);
        this.I = ioDispatcher.plus(new a(CoroutineExceptionHandler.Key, this));
        F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean A(boolean z11) {
        if (z11) {
            return this.D.getValue().booleanValue();
        }
        return this.C.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B(String str, zz.a<? super p> aVar) {
        Object f11;
        Object a11 = this.f32195e.a(String.valueOf(this.F.getValue()), str, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), this.I, null, new FollowersAndFollowingsViewModel$getFollowingList$1(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(Throwable th2) {
        boolean N;
        if (th2 instanceof ConnectivityInterceptor.ConnectivityException) {
            BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new FollowersAndFollowingsViewModel$handle$1(this, null), 3, null);
        } else if (th2 instanceof ResponseWrapper.ResponseErrorException) {
            BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new FollowersAndFollowingsViewModel$handle$2(this, null), 3, null);
        } else if (th2 instanceof MutexIsLockedException) {
            x10.a.b("Session is called twice", new Object[0]);
        } else {
            String message = th2.getMessage();
            if (message != null) {
                N = StringsKt__StringsKt.N(message, "401", false, 2, null);
                if (!N) {
                    BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new FollowersAndFollowingsViewModel$handle$3$2(this, null), 3, null);
                } else {
                    this.f32197g.a(new l<bj.c, p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$handle$3$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            super(1);
                        }

                        public final void b(final bj.c errorState) {
                            o.i(errorState, "errorState");
                            AuthServerErrorsState.a aVar = AuthServerErrorsState.f22915b;
                            final FollowersAndFollowingsViewModel followersAndFollowingsViewModel = FollowersAndFollowingsViewModel.this;
                            aVar.a(errorState, new g00.a<p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$handle$3$1.1

                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* compiled from: FollowersAndFollowingsViewModel.kt */
                                @d(c = "com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$handle$3$1$1$1", f = "FollowersAndFollowingsViewModel.kt", l = {184, 185, 186}, m = "invokeSuspend")
                                /* renamed from: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$handle$3$1$1$1  reason: invalid class name and collision with other inner class name */
                                /* loaded from: classes2.dex */
                                public static final class C03531 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

                                    /* renamed from: a  reason: collision with root package name */
                                    int f32226a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ FollowersAndFollowingsViewModel f32227b;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C03531(FollowersAndFollowingsViewModel followersAndFollowingsViewModel, zz.a<? super C03531> aVar) {
                                        super(2, aVar);
                                        this.f32227b = followersAndFollowingsViewModel;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final zz.a<p> create(Object obj, zz.a<?> aVar) {
                                        return new C03531(this.f32227b, aVar);
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:20:0x0088 A[RETURN] */
                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
                                        /*
                                            r26 = this;
                                            r0 = r26
                                            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                                            int r2 = r0.f32226a
                                            r3 = 3
                                            r4 = 2
                                            r5 = 1
                                            if (r2 == 0) goto L28
                                            if (r2 == r5) goto L24
                                            if (r2 == r4) goto L20
                                            if (r2 != r3) goto L18
                                            kotlin.f.b(r27)
                                            goto L89
                                        L18:
                                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                                            r1.<init>(r2)
                                            throw r1
                                        L20:
                                            kotlin.f.b(r27)
                                            goto L51
                                        L24:
                                            kotlin.f.b(r27)
                                            goto L3e
                                        L28:
                                            kotlin.f.b(r27)
                                            com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel r2 = r0.f32227b
                                            jj.b r2 = com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel.k(r2)
                                            com.forsale.app.utils.prefUtils.preferences.UserPostsSharedPrefs r2 = r2.k()
                                            r0.f32226a = r5
                                            java.lang.Object r2 = r2.a(r0)
                                            if (r2 != r1) goto L3e
                                            return r1
                                        L3e:
                                            com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel r2 = r0.f32227b
                                            jj.b r2 = com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel.k(r2)
                                            com.forsale.app.utils.prefUtils.preferences.UserSharedPref r2 = r2.l()
                                            r0.f32226a = r4
                                            java.lang.Object r2 = r2.f(r0)
                                            if (r2 != r1) goto L51
                                            return r1
                                        L51:
                                            com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel r2 = r0.f32227b
                                            com.forsale.app.utils.facades.user.UpdateUserInteractor r2 = com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel.l(r2)
                                            com.forsale.app.datalayer.database.UserEntity r15 = new com.forsale.app.datalayer.database.UserEntity
                                            r4 = r15
                                            r5 = 0
                                            r6 = 0
                                            r7 = 0
                                            r8 = 0
                                            r9 = 0
                                            r10 = 0
                                            r11 = 0
                                            r12 = 0
                                            r13 = 0
                                            r14 = 0
                                            r16 = 0
                                            r25 = r15
                                            r15 = r16
                                            r17 = 0
                                            r18 = 0
                                            r19 = 0
                                            r20 = 0
                                            r21 = 0
                                            r22 = 0
                                            r23 = 262143(0x3ffff, float:3.6734E-40)
                                            r24 = 0
                                            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                                            r0.f32226a = r3
                                            r3 = r25
                                            java.lang.Object r2 = r2.h(r3, r0)
                                            if (r2 != r1) goto L89
                                            return r1
                                        L89:
                                            wz.p r1 = wz.p.f75480a
                                            return r1
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$handle$3$1.AnonymousClass1.C03531.invokeSuspend(java.lang.Object):java.lang.Object");
                                    }

                                    @Override // g00.p
                                    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
                                        return ((C03531) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
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
                                    BuildersKt__Builders_commonKt.launch$default(r0.a(FollowersAndFollowingsViewModel.this), null, null, new C03531(FollowersAndFollowingsViewModel.this, null), 3, null);
                                }
                            }, new g00.a<p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$handle$3$1.2
                                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                }

                                @Override // g00.a
                                public /* bridge */ /* synthetic */ p invoke() {
                                    invoke2();
                                    return p.f75480a;
                                }
                            }, new g00.a<p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$handle$3$1.3
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
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(java.lang.Exception r5, j0.k0<com.forsale.app.features.more.newprofile.followerandfollowing.itemui.CTAsState> r6, com.forsale.app.features.more.newprofile.followerandfollowing.itemui.CTAsState r7, zz.a<? super wz.p> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$handleFollowAndFollowingException$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$handleFollowAndFollowingException$1 r0 = (com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$handleFollowAndFollowingException$1) r0
            int r1 = r0.f32237f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32237f = r1
            goto L18
        L13:
            com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$handleFollowAndFollowingException$1 r0 = new com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel$handleFollowAndFollowingException$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f32235d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f32237f
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r5 = r0.f32234c
            wz.p r5 = (wz.p) r5
            java.lang.Object r5 = r0.f32233b
            r7 = r5
            com.forsale.app.features.more.newprofile.followerandfollowing.itemui.CTAsState r7 = (com.forsale.app.features.more.newprofile.followerandfollowing.itemui.CTAsState) r7
            java.lang.Object r5 = r0.f32232a
            r6 = r5
            j0.k0 r6 = (j0.k0) r6
            kotlin.f.b(r8)
            goto L58
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            kotlin.f.b(r8)
            r4.H(r5)
            wz.p r5 = wz.p.f75480a
            r0.f32232a = r6
            r0.f32233b = r7
            r0.f32234c = r5
            r0.f32237f = r3
            r2 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r5 = kotlinx.coroutines.DelayKt.delay(r2, r0)
            if (r5 != r1) goto L58
            return r1
        L58:
            r6.setValue(r7)
            wz.p r5 = wz.p.f75480a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel.I(java.lang.Exception, j0.k0, com.forsale.app.features.more.newprofile.followerandfollowing.itemui.CTAsState, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new FollowersAndFollowingsViewModel$recordFollowersVisitedAnalytics$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new FollowersAndFollowingsViewModel$recordFollowingVisitedAnalytics$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object O(String str, zz.a<? super p> aVar) {
        Object f11;
        Object a11 = this.f32196f.a(String.valueOf(this.F.getValue()), str, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new FollowersAndFollowingsViewModel$updateLoadedList$1(z11, this, null), 3, null);
    }

    public final SharedFlow<lf.a> C() {
        return this.H;
    }

    public final StateFlow<PagingData<yd.a>> D() {
        return this.B;
    }

    public final StateFlow<PagingData<yd.a>> E() {
        return this.f32203z;
    }

    public final StateFlow<String> G() {
        return this.F;
    }

    public final StateFlow<Boolean> J() {
        return this.f32201x;
    }

    public final void K(String phoneToFollow, k0<CTAsState> ctasState) {
        o.i(phoneToFollow, "phoneToFollow");
        o.i(ctasState, "ctasState");
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new FollowersAndFollowingsViewModel$onItemCTAClicked$1(ctasState, this, phoneToFollow, null), 3, null);
    }

    public final void N(boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new FollowersAndFollowingsViewModel$refreshFollowingTab$1(this, z11, null), 3, null);
    }

    public final void Q(boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new FollowersAndFollowingsViewModel$updateFollowing$1(this, z11, null), 3, null);
    }
}
