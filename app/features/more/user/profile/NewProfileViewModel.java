package com.forsale.app.features.more.user.profile;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.datalayer.network.services.QRServices;
import com.forsale.app.datalayer.repositories.SocialMediaRepository;
import com.forsale.app.datalayer.repositories.UserRepository;
import com.forsale.app.features.auth.UserStatus;
import com.forsale.app.features.auth.utils.AuthErrorHandler;
import com.forsale.app.utils.facades.user.UserLanguageInteractor;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import falcon.chat.Chat;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
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
/* compiled from: NewProfileViewModel.kt */
/* loaded from: classes2.dex */
public final class NewProfileViewModel extends q0 {
    private final Flow<String> A;
    private final wz.h B;
    private final MutableSharedFlow<e0> C;
    private final SharedFlow<e0> D;
    private final MutableSharedFlow<lf.a> E;
    private final SharedFlow<lf.a> F;
    private final MutableStateFlow<lf.a> G;
    private final SharedFlow<lf.a> H;
    private final Flow<RegionEntity> I;
    private final String J;
    private final wz.h K;

    /* renamed from: a  reason: collision with root package name */
    private final UserRepository f33540a;

    /* renamed from: b  reason: collision with root package name */
    private final UserProfileInteractor f33541b;

    /* renamed from: c  reason: collision with root package name */
    private final f f33542c;

    /* renamed from: d  reason: collision with root package name */
    private final com.forsale.app.features.more.user.editprofile.b f33543d;

    /* renamed from: e  reason: collision with root package name */
    private final ga.b f33544e;

    /* renamed from: f  reason: collision with root package name */
    private final UserLanguageInteractor f33545f;

    /* renamed from: g  reason: collision with root package name */
    private final QRServices f33546g;

    /* renamed from: h  reason: collision with root package name */
    private final jj.b f33547h;

    /* renamed from: i  reason: collision with root package name */
    private final SocialMediaRepository f33548i;

    /* renamed from: j  reason: collision with root package name */
    private final AuthErrorHandler f33549j;

    /* renamed from: x  reason: collision with root package name */
    private final Flow<UserEntity> f33550x;

    /* renamed from: y  reason: collision with root package name */
    private final StateFlow<UserStatus> f33551y;

    /* renamed from: z  reason: collision with root package name */
    private final StateFlow<Boolean> f33552z;

    public NewProfileViewModel(UserRepository userRepository, UserProfileInteractor currentUserProfileInteractor, f profileAnalyticsInteractor, com.forsale.app.features.more.user.editprofile.b editProfileAnalyticsInteractor, ga.b regionsInteractor, UserLanguageInteractor userLanguageInteractor, QRServices qrServices, jj.b prefs, SocialMediaRepository socialMediaRepository, k0 savedStateHandle, AuthErrorHandler errorHandler) {
        boolean z11;
        wz.h a11;
        wz.h a12;
        kotlin.jvm.internal.o.i(userRepository, "userRepository");
        kotlin.jvm.internal.o.i(currentUserProfileInteractor, "currentUserProfileInteractor");
        kotlin.jvm.internal.o.i(profileAnalyticsInteractor, "profileAnalyticsInteractor");
        kotlin.jvm.internal.o.i(editProfileAnalyticsInteractor, "editProfileAnalyticsInteractor");
        kotlin.jvm.internal.o.i(regionsInteractor, "regionsInteractor");
        kotlin.jvm.internal.o.i(userLanguageInteractor, "userLanguageInteractor");
        kotlin.jvm.internal.o.i(qrServices, "qrServices");
        kotlin.jvm.internal.o.i(prefs, "prefs");
        kotlin.jvm.internal.o.i(socialMediaRepository, "socialMediaRepository");
        kotlin.jvm.internal.o.i(savedStateHandle, "savedStateHandle");
        kotlin.jvm.internal.o.i(errorHandler, "errorHandler");
        this.f33540a = userRepository;
        this.f33541b = currentUserProfileInteractor;
        this.f33542c = profileAnalyticsInteractor;
        this.f33543d = editProfileAnalyticsInteractor;
        this.f33544e = regionsInteractor;
        this.f33545f = userLanguageInteractor;
        this.f33546g = qrServices;
        this.f33547h = prefs;
        this.f33548i = socialMediaRepository;
        this.f33549j = errorHandler;
        final Flow<UserEntity> j11 = currentUserProfileInteractor.j();
        this.f33550x = j11;
        Flow<UserStatus> flow = new Flow<UserStatus>() { // from class: com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f33555a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ NewProfileViewModel f33556b;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$1$2", f = "NewProfileViewModel.kt", l = {224, 223}, m = "emit")
                /* renamed from: com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f33557a;

                    /* renamed from: b  reason: collision with root package name */
                    int f33558b;

                    /* renamed from: c  reason: collision with root package name */
                    Object f33559c;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f33557a = obj;
                        this.f33558b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, NewProfileViewModel newProfileViewModel) {
                    this.f33555a = flowCollector;
                    this.f33556b = newProfileViewModel;
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
                        boolean r0 = r8 instanceof com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$1$2$1 r0 = (com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f33558b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f33558b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$1$2$1 r0 = new com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f33557a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f33558b
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
                        java.lang.Object r7 = r0.f33559c
                        kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                        kotlin.f.b(r8)
                        goto L65
                    L3c:
                        kotlin.f.b(r8)
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.f33555a
                        com.forsale.app.datalayer.database.UserEntity r7 = (com.forsale.app.datalayer.database.UserEntity) r7
                        com.forsale.app.features.more.user.profile.NewProfileViewModel r2 = r6.f33556b
                        com.forsale.app.utils.facades.user.UserProfileInteractor r2 = com.forsale.app.features.more.user.profile.NewProfileViewModel.f(r2)
                        if (r7 == 0) goto L56
                        java.lang.Integer r7 = r7.isBlock()
                        if (r7 == 0) goto L56
                        int r7 = r7.intValue()
                        goto L57
                    L56:
                        r7 = 0
                    L57:
                        r0.f33559c = r8
                        r0.f33558b = r4
                        java.lang.Object r7 = r2.q(r7, r0)
                        if (r7 != r1) goto L62
                        return r1
                    L62:
                        r5 = r8
                        r8 = r7
                        r7 = r5
                    L65:
                        r2 = 0
                        r0.f33559c = r2
                        r0.f33558b = r3
                        java.lang.Object r7 = r7.emit(r8, r0)
                        if (r7 != r1) goto L71
                        return r1
                    L71:
                        wz.p r7 = wz.p.f75480a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super UserStatus> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (collect == f11) {
                    return collect;
                }
                return wz.p.f75480a;
            }
        };
        CoroutineScope a13 = r0.a(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        StateFlow<UserStatus> stateIn = FlowKt.stateIn(flow, a13, companion.getEagerly(), UserStatus.NotLoggedIn);
        this.f33551y = stateIn;
        Flow<Boolean> flow2 = new Flow<Boolean>() { // from class: com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$2

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$2$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f33563a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ NewProfileViewModel f33564b;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$2$2", f = "NewProfileViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$2$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f33565a;

                    /* renamed from: b  reason: collision with root package name */
                    int f33566b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f33565a = obj;
                        this.f33566b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, NewProfileViewModel newProfileViewModel) {
                    this.f33563a = flowCollector;
                    this.f33564b = newProfileViewModel;
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
                        boolean r0 = r6 instanceof com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$2$2$1 r0 = (com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f33566b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f33566b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$2$2$1 r0 = new com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$2$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f33565a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f33566b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L56
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f33563a
                        com.forsale.app.datalayer.database.UserEntity r5 = (com.forsale.app.datalayer.database.UserEntity) r5
                        com.forsale.app.features.more.user.profile.NewProfileViewModel r5 = r4.f33564b
                        kotlinx.coroutines.flow.StateFlow r5 = r5.J()
                        java.lang.Object r5 = r5.getValue()
                        com.forsale.app.features.auth.UserStatus r2 = com.forsale.app.features.auth.UserStatus.LoggedIn
                        if (r5 != r2) goto L48
                        r5 = r3
                        goto L49
                    L48:
                        r5 = 0
                    L49:
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
                        r0.f33566b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L56
                        return r1
                    L56:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Boolean> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (collect == f11) {
                    return collect;
                }
                return wz.p.f75480a;
            }
        };
        CoroutineScope a14 = r0.a(this);
        SharingStarted eagerly = companion.getEagerly();
        if (stateIn.getValue() == UserStatus.LoggedIn) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f33552z = FlowKt.stateIn(flow2, a14, eagerly, Boolean.valueOf(z11));
        final Flow a15 = FlowLiveDataConversions.a(Chat.f55705a.o());
        this.A = new Flow<String>() { // from class: com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$3

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$3$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f33569a;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$3$2", f = "NewProfileViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$3$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f33570a;

                    /* renamed from: b  reason: collision with root package name */
                    int f33571b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f33570a = obj;
                        this.f33571b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f33569a = flowCollector;
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
                        boolean r0 = r6 instanceof com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$3.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$3$2$1 r0 = (com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$3.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f33571b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f33571b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$3$2$1 r0 = new com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$3$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f33570a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f33571b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L4d
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f33569a
                        java.lang.Integer r5 = (java.lang.Integer) r5
                        if (r5 == 0) goto L43
                        int r5 = r5.intValue()
                        java.lang.String r5 = com.forsale.app.utils.TypeExtensionsKt.V(r5)
                        goto L44
                    L43:
                        r5 = 0
                    L44:
                        r0.f33571b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4d
                        return r1
                    L4d:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
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
                return wz.p.f75480a;
            }
        };
        a11 = kotlin.d.a(new g00.a<dj.i>() { // from class: com.forsale.app.features.more.user.profile.NewProfileViewModel$reporter$2
            @Override // g00.a
            /* renamed from: b */
            public final dj.i invoke() {
                return dj.i.f54287a.invoke();
            }
        });
        this.B = a11;
        MutableSharedFlow<e0> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.C = MutableSharedFlow$default;
        this.D = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableSharedFlow<lf.a> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.E = MutableSharedFlow$default2;
        this.F = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        MutableStateFlow<lf.a> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.G = MutableStateFlow;
        this.H = FlowKt.asSharedFlow(MutableStateFlow);
        final Flow<RegionEntity> a16 = regionsInteractor.a();
        this.I = a16;
        this.J = (String) FlowKt.stateIn(new Flow<String>() { // from class: com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$4

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$4$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f33575a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ NewProfileViewModel f33576b;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$4$2", f = "NewProfileViewModel.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$4$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f33577a;

                    /* renamed from: b  reason: collision with root package name */
                    int f33578b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f33577a = obj;
                        this.f33578b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, NewProfileViewModel newProfileViewModel) {
                    this.f33575a = flowCollector;
                    this.f33576b = newProfileViewModel;
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
                        boolean r0 = r6 instanceof com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$4.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$4$2$1 r0 = (com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$4.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f33578b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f33578b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$4$2$1 r0 = new com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$4$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f33577a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f33578b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L62
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f33575a
                        com.forsale.app.datalayer.database.RegionEntity r5 = (com.forsale.app.datalayer.database.RegionEntity) r5
                        if (r5 == 0) goto L40
                        java.lang.String r5 = r5.getPhonePrefix()
                        if (r5 != 0) goto L59
                    L40:
                        com.forsale.app.features.more.user.profile.NewProfileViewModel r5 = r4.f33576b
                        dj.i r5 = r5.F()
                        java.lang.String r2 = "New Profile Region Is Null"
                        r5.c(r2)
                        com.forsale.app.features.more.user.profile.NewProfileViewModel r5 = r4.f33576b
                        ga.b r5 = com.forsale.app.features.more.user.profile.NewProfileViewModel.m(r5)
                        com.forsale.app.datalayer.database.RegionEntity r5 = r5.b()
                        java.lang.String r5 = r5.getPhonePrefix()
                    L59:
                        r0.f33578b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L62
                        return r1
                    L62:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.profile.NewProfileViewModel$special$$inlined$map$4.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
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
                return wz.p.f75480a;
            }
        }, r0.a(this), companion.getEagerly(), regionsInteractor.b().getPhonePrefix()).getValue();
        a12 = kotlin.d.a(new g00.a<AtomicReference<Job>>() { // from class: com.forsale.app.features.more.user.profile.NewProfileViewModel$qrJob$2
            @Override // g00.a
            /* renamed from: b */
            public final AtomicReference<Job> invoke() {
                return new AtomicReference<>();
            }
        });
        this.K = a12;
    }

    private final AtomicReference<Job> E() {
        return (AtomicReference) this.K.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(zz.a<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.features.more.user.profile.NewProfileViewModel$isPmEnabled$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.features.more.user.profile.NewProfileViewModel$isPmEnabled$1 r0 = (com.forsale.app.features.more.user.profile.NewProfileViewModel$isPmEnabled$1) r0
            int r1 = r0.f33582c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33582c = r1
            goto L18
        L13:
            com.forsale.app.features.more.user.profile.NewProfileViewModel$isPmEnabled$1 r0 = new com.forsale.app.features.more.user.profile.NewProfileViewModel$isPmEnabled$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f33580a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f33582c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.f.b(r5)
            jj.b r5 = r4.f33547h
            com.forsale.app.utils.prefUtils.preferences.MasterDataSharedPrefs r5 = r5.h()
            r0.f33582c = r3
            java.lang.Object r5 = r5.j(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            boolean r5 = com.forsale.app.utils.TypeExtensionsKt.h0(r5)
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.profile.NewProfileViewModel.K(zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p0(com.forsale.app.utils.Languages r9, zz.a<? super wz.p> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.forsale.app.features.more.user.profile.NewProfileViewModel$setUserLanguage$1
            if (r0 == 0) goto L13
            r0 = r10
            com.forsale.app.features.more.user.profile.NewProfileViewModel$setUserLanguage$1 r0 = (com.forsale.app.features.more.user.profile.NewProfileViewModel$setUserLanguage$1) r0
            int r1 = r0.f33653f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33653f = r1
            goto L18
        L13:
            com.forsale.app.features.more.user.profile.NewProfileViewModel$setUserLanguage$1 r0 = new com.forsale.app.features.more.user.profile.NewProfileViewModel$setUserLanguage$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f33651d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f33653f
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L58
            if (r2 == r5) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            kotlin.f.b(r10)
            goto La4
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            java.lang.Object r9 = r0.f33649b
            com.forsale.app.utils.facades.user.UserLanguageInteractor r9 = (com.forsale.app.utils.facades.user.UserLanguageInteractor) r9
            java.lang.Object r2 = r0.f33648a
            com.forsale.app.utils.Languages r2 = (com.forsale.app.utils.Languages) r2
            kotlin.f.b(r10)
            goto L95
        L45:
            java.lang.Object r9 = r0.f33650c
            com.forsale.app.utils.facades.user.UserProfileInteractor r9 = (com.forsale.app.utils.facades.user.UserProfileInteractor) r9
            java.lang.Object r2 = r0.f33649b
            com.forsale.app.utils.facades.user.UserLanguageInteractor r2 = (com.forsale.app.utils.facades.user.UserLanguageInteractor) r2
            java.lang.Object r5 = r0.f33648a
            com.forsale.app.utils.Languages r5 = (com.forsale.app.utils.Languages) r5
            kotlin.f.b(r10)
            r7 = r2
            r2 = r10
            r10 = r7
            goto L72
        L58:
            kotlin.f.b(r10)
            com.forsale.app.utils.facades.user.UserLanguageInteractor r10 = r8.f33545f
            com.forsale.app.utils.facades.user.UserProfileInteractor r2 = r8.f33541b
            r0.f33648a = r9
            r0.f33649b = r10
            r0.f33650c = r2
            r0.f33653f = r5
            java.lang.Object r5 = r2.i(r0)
            if (r5 != r1) goto L6e
            return r1
        L6e:
            r7 = r5
            r5 = r9
            r9 = r2
            r2 = r7
        L72:
            com.forsale.app.datalayer.database.UserEntity r2 = (com.forsale.app.datalayer.database.UserEntity) r2
            if (r2 == 0) goto L81
            java.lang.Integer r2 = r2.isBlock()
            if (r2 == 0) goto L81
            int r2 = r2.intValue()
            goto L82
        L81:
            r2 = 0
        L82:
            r0.f33648a = r5
            r0.f33649b = r10
            r0.f33650c = r6
            r0.f33653f = r4
            java.lang.Object r9 = r9.q(r2, r0)
            if (r9 != r1) goto L91
            return r1
        L91:
            r2 = r5
            r7 = r10
            r10 = r9
            r9 = r7
        L95:
            com.forsale.app.features.auth.UserStatus r10 = (com.forsale.app.features.auth.UserStatus) r10
            r0.f33648a = r6
            r0.f33649b = r6
            r0.f33653f = r3
            java.lang.Object r9 = r9.f(r10, r2, r0)
            if (r9 != r1) goto La4
            return r1
        La4:
            wz.p r9 = wz.p.f75480a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.profile.NewProfileViewModel.p0(com.forsale.app.utils.Languages, zz.a):java.lang.Object");
    }

    public static /* synthetic */ void s0(NewProfileViewModel newProfileViewModel, lf.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = null;
        }
        newProfileViewModel.r0(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object x(zz.a<? super String> aVar) {
        return this.f33547h.c().a(aVar);
    }

    public final SharedFlow<e0> A() {
        return this.D;
    }

    public final SharedFlow<lf.a> B() {
        return this.F;
    }

    public final SharedFlow<lf.a> C() {
        return this.H;
    }

    public final String D() {
        return this.J;
    }

    public final dj.i F() {
        return (dj.i) this.B.getValue();
    }

    public final Flow<String> G() {
        return this.A;
    }

    public final Flow<UserEntity> H() {
        return this.f33550x;
    }

    public final StateFlow<Boolean> I() {
        return this.f33552z;
    }

    public final StateFlow<UserStatus> J() {
        return this.f33551y;
    }

    public final void L() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewProfileViewModel$onAboutUsClick$1(this, null), 3, null);
    }

    public final void M() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewProfileViewModel$onAgentsClick$1(this, null), 3, null);
    }

    public final void N() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewProfileViewModel$onBuyTokenClick$1(this, null), 3, null);
    }

    public final void O() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewProfileViewModel$onFacebookClick$1(this, null), 3, null);
    }

    public final void Q() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewProfileViewModel$onFavoritesClick$1(this, null), 3, null);
    }

    public final void S() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewProfileViewModel$onFollowersAndFollowingsClick$1(this, null), 3, null);
    }

    public final void T() {
        Job launch$default;
        Job job = E().get();
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(r0.a(this), new a(CoroutineExceptionHandler.Key), null, new NewProfileViewModel$onForSaleWebClick$activeJob$2(this, null), 2, null);
        E().lazySet(launch$default);
    }

    public final void V() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewProfileViewModel$onFreeAllowanceClick$1(this, null), 3, null);
    }

    public final void X() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewProfileViewModel$onInstagramClick$1(this, null), 3, null);
    }

    public final void Y() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewProfileViewModel$onLanguageClick$1(this, null), 3, null);
    }

    public final void Z() {
        this.f33542c.c();
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewProfileViewModel$onLoginClick$1(this, null), 3, null);
    }

    public final void a0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewProfileViewModel$onMessagesClick$1(this, null), 3, null);
    }

    public final void b0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewProfileViewModel$onMyListingClick$1(this, null), 3, null);
    }

    public final void c0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewProfileViewModel$onNeedHelpClick$1(this, null), 3, null);
    }

    public final void d0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewProfileViewModel$onNotificationsClicked$1(this, null), 3, null);
    }

    public final void e0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewProfileViewModel$onPaymentHistoryClick$1(this, null), 3, null);
    }

    public final void f0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewProfileViewModel$onProfileClick$1(this, null), 3, null);
    }

    public final void g0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewProfileViewModel$onRecentViewClick$1(this, null), 3, null);
    }

    public final void h0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewProfileViewModel$onSignUpClick$1(this, null), 3, null);
        this.f33542c.c();
    }

    public final void i0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewProfileViewModel$onSupportClick$1(this, null), 3, null);
    }

    public final void j0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewProfileViewModel$onTermsAndConditionsClick$1(this, null), 3, null);
    }

    public final void k0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewProfileViewModel$onTwitterClick$1(this, null), 3, null);
    }

    public final void l0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewProfileViewModel$onWantedItemsClick$1(this, null), 3, null);
    }

    public final void m0() {
        this.f33542c.g();
    }

    public final void o0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewProfileViewModel$refreshSession$1(this, null), 3, null);
    }

    public final void q0(lf.a feedbackUiModel) {
        kotlin.jvm.internal.o.i(feedbackUiModel, "feedbackUiModel");
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewProfileViewModel$showFeedBack$1(this, feedbackUiModel, null), 3, null);
    }

    public final void r0(lf.a aVar) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new NewProfileViewModel$showFeedBackState$1(this, aVar, null), 3, null);
    }

    public final void t0(String token) {
        kotlin.jvm.internal.o.i(token, "token");
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), new b(CoroutineExceptionHandler.Key), null, new NewProfileViewModel$verifyQRCode$2(this, token, null), 2, null);
    }

    public final String y() {
        List E0;
        Object m02;
        jj.a aVar = jj.a.f60556a;
        E0 = StringsKt__StringsKt.E0(aVar.a(), new char[]{'-'}, false, 0, 6, null);
        m02 = CollectionsKt___CollectionsKt.m0(E0);
        String str = (String) m02;
        if (str == null) {
            return aVar.a();
        }
        return str;
    }

    public final Flow<RegionEntity> z() {
        return this.I;
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public a(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public b(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
        }
    }
}
