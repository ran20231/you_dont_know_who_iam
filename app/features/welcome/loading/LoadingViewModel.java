package com.forsale.app.features.welcome.loading;

import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import com.forsale.app.analytics.base.ForSaleDataTracker;
import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.datalayer.database.masterdata.GetMasterDataInteractor;
import com.forsale.app.datalayer.network.entities.SessionEntity;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.InAppRepository;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.features.welcome.loading.interactors.SessionInterActor;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import com.google.logging.type.LogSeverity;
import g00.p;
import java.util.List;
import kotlin.collections.r;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import t9.y0;
/* compiled from: LoadingViewModel.kt */
/* loaded from: classes2.dex */
public final class LoadingViewModel extends q0 {
    private final CoroutineDispatcher A;
    private final CoroutineScope B;
    private final boolean C;
    private final int D;
    private final float E;
    private final List<Integer> F;
    private final MutableSharedFlow<Boolean> G;
    private final MutableStateFlow<SessionEntity.AppStatus> H;
    private final MutableStateFlow<SessionEntity> I;
    private final MutableStateFlow<c> J;
    private final MutableStateFlow<c> K;
    private final MutableStateFlow<b> L;
    private final MutableStateFlow<b> M;
    private final MutableStateFlow<b> N;
    private final MutableStateFlow<a> O;
    private final StateFlow<a> P;
    private final MutableStateFlow<com.forsale.app.features.welcome.loading.f> Q;
    private final StateFlow<com.forsale.app.features.welcome.loading.f> R;
    private final MutableStateFlow<ab.a> S;
    private final StateFlow<ab.a> T;
    private final StateFlow<Boolean> U;

    /* renamed from: a  reason: collision with root package name */
    private final ApplicationResourcesRepository f37205a;

    /* renamed from: b  reason: collision with root package name */
    private final jf.a f37206b;

    /* renamed from: c  reason: collision with root package name */
    private final SessionInterActor f37207c;

    /* renamed from: d  reason: collision with root package name */
    private final jf.b f37208d;

    /* renamed from: e  reason: collision with root package name */
    private final jf.e f37209e;

    /* renamed from: f  reason: collision with root package name */
    private final jf.d f37210f;

    /* renamed from: g  reason: collision with root package name */
    private final InAppRepository f37211g;

    /* renamed from: h  reason: collision with root package name */
    private final AggregatedAllAnalyticsLogger f37212h;

    /* renamed from: i  reason: collision with root package name */
    private final GetMasterDataInteractor f37213i;

    /* renamed from: j  reason: collision with root package name */
    private final jf.c f37214j;

    /* renamed from: x  reason: collision with root package name */
    private final UserProfileInteractor f37215x;

    /* renamed from: y  reason: collision with root package name */
    private final RegionsRepository f37216y;

    /* renamed from: z  reason: collision with root package name */
    private final ForSaleDataTracker f37217z;

    /* compiled from: LoadingViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.welcome.loading.LoadingViewModel$1", f = "LoadingViewModel.kt", l = {197, LogSeverity.INFO_VALUE}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.welcome.loading.LoadingViewModel$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f37218a;

        /* renamed from: b  reason: collision with root package name */
        Object f37219b;

        /* renamed from: c  reason: collision with root package name */
        Object f37220c;

        /* renamed from: d  reason: collision with root package name */
        int f37221d;

        AnonymousClass1(zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0056 -> B:15:0x005d). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
                int r1 = r8.f37221d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2e
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.f.b(r9)
                goto L8d
            L13:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1b:
                java.lang.Object r1 = r8.f37220c
                java.lang.Object r4 = r8.f37219b
                com.forsale.app.features.welcome.loading.LoadingViewModel r4 = (com.forsale.app.features.welcome.loading.LoadingViewModel) r4
                java.lang.Object r5 = r8.f37218a
                kotlinx.coroutines.flow.MutableStateFlow r5 = (kotlinx.coroutines.flow.MutableStateFlow) r5
                kotlin.f.b(r9)
                r6 = r5
                r5 = r4
                r4 = r1
                r1 = r0
                r0 = r8
                goto L5d
            L2e:
                kotlin.f.b(r9)
                com.forsale.app.features.welcome.loading.LoadingViewModel r9 = com.forsale.app.features.welcome.loading.LoadingViewModel.this
                kotlinx.coroutines.flow.MutableStateFlow r9 = com.forsale.app.features.welcome.loading.LoadingViewModel.t(r9)
                com.forsale.app.features.welcome.loading.LoadingViewModel r1 = com.forsale.app.features.welcome.loading.LoadingViewModel.this
                r5 = r9
                r4 = r1
                r9 = r8
            L3c:
                java.lang.Object r1 = r5.getValue()
                r6 = r1
                com.forsale.app.features.welcome.loading.LoadingViewModel$a r6 = (com.forsale.app.features.welcome.loading.LoadingViewModel.a) r6
                jf.b r6 = com.forsale.app.features.welcome.loading.LoadingViewModel.g(r4)
                r9.f37218a = r5
                r9.f37219b = r4
                r9.f37220c = r1
                r9.f37221d = r3
                java.lang.Object r6 = r6.a(r9)
                if (r6 != r0) goto L56
                return r0
            L56:
                r7 = r0
                r0 = r9
                r9 = r6
                r6 = r5
                r5 = r4
                r4 = r1
                r1 = r7
            L5d:
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                int r9 = r9.length()
                if (r9 != 0) goto L67
                r9 = r3
                goto L68
            L67:
                r9 = 0
            L68:
                if (r9 == 0) goto L6d
                com.forsale.app.features.welcome.loading.LoadingViewModel$a$c r9 = com.forsale.app.features.welcome.loading.LoadingViewModel.a.c.f37225a
                goto L6f
            L6d:
                com.forsale.app.features.welcome.loading.LoadingViewModel$a$a r9 = com.forsale.app.features.welcome.loading.LoadingViewModel.a.C0424a.f37223a
            L6f:
                boolean r9 = r6.compareAndSet(r4, r9)
                if (r9 == 0) goto L90
                com.forsale.app.features.welcome.loading.LoadingViewModel r9 = com.forsale.app.features.welcome.loading.LoadingViewModel.this
                kotlinx.coroutines.flow.MutableStateFlow r9 = com.forsale.app.features.welcome.loading.LoadingViewModel.w(r9)
                com.forsale.app.features.welcome.loading.f r3 = com.forsale.app.features.welcome.loading.f.f37384a
                r4 = 0
                r0.f37218a = r4
                r0.f37219b = r4
                r0.f37220c = r4
                r0.f37221d = r2
                java.lang.Object r9 = r9.emit(r3, r0)
                if (r9 != r1) goto L8d
                return r1
            L8d:
                wz.p r9 = wz.p.f75480a
                return r9
            L90:
                r9 = r0
                r0 = r1
                r4 = r5
                r5 = r6
                goto L3c
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.welcome.loading.LoadingViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* compiled from: LoadingViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {

        /* compiled from: LoadingViewModel.kt */
        /* renamed from: com.forsale.app.features.welcome.loading.LoadingViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0424a implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final C0424a f37223a = new C0424a();

            private C0424a() {
            }
        }

        /* compiled from: LoadingViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class b implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f37224a = new b();

            private b() {
            }
        }

        /* compiled from: LoadingViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class c implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f37225a = new c();

            private c() {
            }
        }
    }

    /* compiled from: LoadingViewModel.kt */
    /* loaded from: classes2.dex */
    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f37231a = a.f37232a;

        /* compiled from: LoadingViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            static final /* synthetic */ a f37232a = new a();

            private a() {
            }

            public final boolean a(b bVar) {
                o.i(bVar, "<this>");
                if (!(bVar instanceof c) && !(bVar instanceof C0425b)) {
                    return false;
                }
                return true;
            }
        }

        /* compiled from: LoadingViewModel.kt */
        /* renamed from: com.forsale.app.features.welcome.loading.LoadingViewModel$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0425b implements b {

            /* renamed from: b  reason: collision with root package name */
            private final Throwable f37233b;

            public C0425b(Throwable exception) {
                o.i(exception, "exception");
                this.f37233b = exception;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0425b) && o.d(this.f37233b, ((C0425b) obj).f37233b)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f37233b.hashCode();
            }

            public String toString() {
                Throwable th2 = this.f37233b;
                return "Failed(exception=" + th2 + ")";
            }
        }

        /* compiled from: LoadingViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class c implements b {

            /* renamed from: b  reason: collision with root package name */
            public static final c f37234b = new c();

            private c() {
            }
        }

        /* compiled from: LoadingViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class d implements b {

            /* renamed from: b  reason: collision with root package name */
            public static final d f37235b = new d();

            private d() {
            }
        }

        /* compiled from: LoadingViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class e implements b {

            /* renamed from: b  reason: collision with root package name */
            public static final e f37236b = new e();

            private e() {
            }
        }
    }

    /* compiled from: LoadingViewModel.kt */
    /* loaded from: classes2.dex */
    public interface c {

        /* compiled from: LoadingViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class a implements c {

            /* renamed from: a  reason: collision with root package name */
            private final List<Integer> f37237a;

            /* renamed from: b  reason: collision with root package name */
            private final boolean f37238b;

            /* renamed from: c  reason: collision with root package name */
            private final int f37239c;

            /* renamed from: d  reason: collision with root package name */
            private final float f37240d;

            public /* synthetic */ a(List list, boolean z11, int i11, float f11, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, z11, i11, f11);
            }

            public final int a() {
                return this.f37239c;
            }

            public final float b() {
                return this.f37240d;
            }

            public final List<Integer> c() {
                return this.f37237a;
            }

            public final boolean d() {
                return this.f37238b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                if (o.d(this.f37237a, aVar.f37237a) && this.f37238b == aVar.f37238b && this.f37239c == aVar.f37239c && e2.h.n(this.f37240d, aVar.f37240d)) {
                    return true;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = this.f37237a.hashCode() * 31;
                boolean z11 = this.f37238b;
                int i11 = z11;
                if (z11 != 0) {
                    i11 = 1;
                }
                return ((((hashCode + i11) * 31) + Integer.hashCode(this.f37239c)) * 31) + e2.h.o(this.f37240d);
            }

            public String toString() {
                List<Integer> list = this.f37237a;
                boolean z11 = this.f37238b;
                int i11 = this.f37239c;
                String p11 = e2.h.p(this.f37240d);
                return "Loading(loadingAnimationsListIcons=" + list + ", showAnimatedIcon=" + z11 + ", animatedIconResId=" + i11 + ", animatedIconSize=" + p11 + ")";
            }

            private a(List<Integer> loadingAnimationsListIcons, boolean z11, int i11, float f11) {
                o.i(loadingAnimationsListIcons, "loadingAnimationsListIcons");
                this.f37237a = loadingAnimationsListIcons;
                this.f37238b = z11;
                this.f37239c = i11;
                this.f37240d = f11;
            }
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LoadingViewModel f37243a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f37244b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CoroutineExceptionHandler.Key key, LoadingViewModel loadingViewModel, boolean z11) {
            super(key);
            this.f37243a = loadingViewModel;
            this.f37244b = z11;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            Object value;
            MutableStateFlow mutableStateFlow = this.f37243a.N;
            do {
                value = mutableStateFlow.getValue();
                b bVar = (b) value;
            } while (!mutableStateFlow.compareAndSet(value, new b.C0425b(th2)));
            LoadingViewModel.a0(this.f37243a, th2, false, this.f37244b, 2, null);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LoadingViewModel f37245a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f37246b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(CoroutineExceptionHandler.Key key, LoadingViewModel loadingViewModel, boolean z11) {
            super(key);
            this.f37245a = loadingViewModel;
            this.f37246b = z11;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            Object value;
            MutableStateFlow mutableStateFlow = this.f37245a.L;
            do {
                value = mutableStateFlow.getValue();
                b bVar = (b) value;
            } while (!mutableStateFlow.compareAndSet(value, new b.C0425b(th2)));
            this.f37245a.Z(th2, true, this.f37246b);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LoadingViewModel f37247a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f37248b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(CoroutineExceptionHandler.Key key, LoadingViewModel loadingViewModel, boolean z11) {
            super(key);
            this.f37247a = loadingViewModel;
            this.f37248b = z11;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            Object value;
            MutableStateFlow mutableStateFlow = this.f37247a.M;
            do {
                value = mutableStateFlow.getValue();
                b bVar = (b) value;
            } while (!mutableStateFlow.compareAndSet(value, new b.C0425b(th2)));
            LoadingViewModel.a0(this.f37247a, th2, false, this.f37248b, 2, null);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class g extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LoadingViewModel f37255a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(CoroutineExceptionHandler.Key key, LoadingViewModel loadingViewModel) {
            super(key);
            this.f37255a = loadingViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            LoadingViewModel.a0(this.f37255a, th2, false, true, 2, null);
        }
    }

    public LoadingViewModel(ApplicationResourcesRepository resourcesRepository, jf.a clearMasterDataTimeStamp, SessionInterActor sessionInterActor, jf.b deviceInterActor, jf.e showNotificationPermissionDialogInteractor, jf.d hideNotificationPermissionDialogInteractor, InAppRepository inAppRepository, AggregatedAllAnalyticsLogger analyticsLogger, GetMasterDataInteractor getMasterDataInteractor, jf.c getAdServerInteractor, UserProfileInteractor currentUserProfileInteractor, RegionsRepository regionsRepository, ForSaleDataTracker tracker, CoroutineDispatcher ioDispatcher, CoroutineScope coroutineScope) {
        List<Integer> q11;
        o.i(resourcesRepository, "resourcesRepository");
        o.i(clearMasterDataTimeStamp, "clearMasterDataTimeStamp");
        o.i(sessionInterActor, "sessionInterActor");
        o.i(deviceInterActor, "deviceInterActor");
        o.i(showNotificationPermissionDialogInteractor, "showNotificationPermissionDialogInteractor");
        o.i(hideNotificationPermissionDialogInteractor, "hideNotificationPermissionDialogInteractor");
        o.i(inAppRepository, "inAppRepository");
        o.i(analyticsLogger, "analyticsLogger");
        o.i(getMasterDataInteractor, "getMasterDataInteractor");
        o.i(getAdServerInteractor, "getAdServerInteractor");
        o.i(currentUserProfileInteractor, "currentUserProfileInteractor");
        o.i(regionsRepository, "regionsRepository");
        o.i(tracker, "tracker");
        o.i(ioDispatcher, "ioDispatcher");
        o.i(coroutineScope, "coroutineScope");
        this.f37205a = resourcesRepository;
        this.f37206b = clearMasterDataTimeStamp;
        this.f37207c = sessionInterActor;
        this.f37208d = deviceInterActor;
        this.f37209e = showNotificationPermissionDialogInteractor;
        this.f37210f = hideNotificationPermissionDialogInteractor;
        this.f37211g = inAppRepository;
        this.f37212h = analyticsLogger;
        this.f37213i = getMasterDataInteractor;
        this.f37214j = getAdServerInteractor;
        this.f37215x = currentUserProfileInteractor;
        this.f37216y = regionsRepository;
        this.f37217z = tracker;
        this.A = ioDispatcher;
        this.B = coroutineScope;
        this.C = true;
        int i11 = t9.q0.W;
        this.D = i11;
        float l11 = e2.h.l(240);
        this.E = l11;
        q11 = r.q(Integer.valueOf(t9.q0.W1), Integer.valueOf(t9.q0.f69732b2), Integer.valueOf(t9.q0.f69736c2), Integer.valueOf(t9.q0.Z1), Integer.valueOf(t9.q0.X1), Integer.valueOf(t9.q0.f69748f2), Integer.valueOf(t9.q0.Y1), Integer.valueOf(t9.q0.f69728a2), Integer.valueOf(t9.q0.f69740d2), Integer.valueOf(t9.q0.f69744e2));
        this.F = q11;
        this.G = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.H = StateFlowKt.MutableStateFlow(null);
        this.I = StateFlowKt.MutableStateFlow(null);
        MutableStateFlow<c> MutableStateFlow = StateFlowKt.MutableStateFlow(new c.a(q11, !true, i11, l11, null));
        this.J = MutableStateFlow;
        this.K = MutableStateFlow;
        b.c cVar = b.c.f37234b;
        MutableStateFlow<b> MutableStateFlow2 = StateFlowKt.MutableStateFlow(cVar);
        this.L = MutableStateFlow2;
        MutableStateFlow<b> MutableStateFlow3 = StateFlowKt.MutableStateFlow(cVar);
        this.M = MutableStateFlow3;
        MutableStateFlow<b> MutableStateFlow4 = StateFlowKt.MutableStateFlow(cVar);
        this.N = MutableStateFlow4;
        MutableStateFlow<a> MutableStateFlow5 = StateFlowKt.MutableStateFlow(a.b.f37224a);
        this.O = MutableStateFlow5;
        this.P = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<com.forsale.app.features.welcome.loading.f> MutableStateFlow6 = StateFlowKt.MutableStateFlow(null);
        this.Q = MutableStateFlow6;
        this.R = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<ab.a> MutableStateFlow7 = StateFlowKt.MutableStateFlow(new ab.a(null, false, null, 7, null));
        this.S = MutableStateFlow7;
        this.T = FlowKt.asStateFlow(MutableStateFlow7);
        this.U = FlowKt.stateIn(FlowKt.combine(MutableStateFlow2, MutableStateFlow3, MutableStateFlow4, new LoadingViewModel$allDataSuccessed$1(this, null)), r0.a(this), SharingStarted.Companion.getEagerly(), Boolean.FALSE);
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public static /* synthetic */ void I(LoadingViewModel loadingViewModel, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        loadingViewModel.H(z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(zz.a<? super wz.p> r10) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.welcome.loading.LoadingViewModel.N(zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Q(zz.a<? super UserEntity> aVar) {
        return this.f37215x.n(this.B, true, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(g00.l<? super zz.a<? super wz.p>, ? extends Object> lVar, p<? super SessionEntity.AppStatus, ? super zz.a<? super wz.p>, ? extends Object> pVar) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new LoadingViewModel$goNextScreen$1(this, lVar, pVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(Throwable th2) {
        dj.i invoke = dj.i.f54287a.invoke();
        String string = this.f37205a.getString(y0.f70493he, new Object[0]);
        invoke.c(" " + string);
        invoke.f(th2);
    }

    private final void X(AggregatedAllAnalyticsLogger.CustomEvents customEvents) {
        AggregatedAllAnalyticsLoggerKt.x0(this.f37212h, customEvents, false, false, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), this.A.plus(new g(CoroutineExceptionHandler.Key, this)), null, new LoadingViewModel$onAllDataFetched$2(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(Throwable th2, boolean z11, boolean z12) {
        x10.a.c(th2);
        X(AggregatedAllAnalyticsLogger.CustomEvents.ERROR_SCREEN_SHOWN);
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), this.A, null, new LoadingViewModel$onError$1(z12, z11, this, th2, null), 2, null);
    }

    static /* synthetic */ void a0(LoadingViewModel loadingViewModel, Throwable th2, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        loadingViewModel.Z(th2, z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(SessionEntity.AppStatus appStatus) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new LoadingViewModel$recordAppStatusScreenVisited$1(this, appStatus, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e0(java.lang.String r5, zz.a<? super wz.p> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.app.features.welcome.loading.LoadingViewModel$requireAppRestart$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.features.welcome.loading.LoadingViewModel$requireAppRestart$1 r0 = (com.forsale.app.features.welcome.loading.LoadingViewModel$requireAppRestart$1) r0
            int r1 = r0.f37295d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37295d = r1
            goto L18
        L13:
            com.forsale.app.features.welcome.loading.LoadingViewModel$requireAppRestart$1 r0 = new com.forsale.app.features.welcome.loading.LoadingViewModel$requireAppRestart$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f37293b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f37295d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f37292a
            java.lang.String r5 = (java.lang.String) r5
            kotlin.f.b(r6)
            goto L47
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r6)
            kotlinx.coroutines.flow.MutableStateFlow<com.forsale.app.features.welcome.loading.LoadingViewModel$c> r6 = r4.J
            com.forsale.app.features.welcome.loading.b r2 = com.forsale.app.features.welcome.loading.b.f37380a
            r0.f37292a = r5
            r0.f37295d = r3
            java.lang.Object r6 = r6.emit(r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            wz.p r6 = wz.p.f75480a
            dj.i$a r6 = dj.i.f54287a
            dj.i r6 = r6.invoke()
            java.lang.String r0 = "App Restart"
            r6.c(r0)
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>(r5)
            x10.a.c(r0)
            r6.f(r0)
            wz.p r5 = wz.p.f75480a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.welcome.loading.LoadingViewModel.e0(java.lang.String, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job g0() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(r0.a(this), this.A, null, new LoadingViewModel$setIsNotFreshInstallation$1(this, null), 2, null);
        return launch$default;
    }

    public final void G() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new LoadingViewModel$closeContactUsBottomSheet$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(boolean r10, boolean r11) {
        /*
            r9 = this;
            kotlinx.coroutines.flow.MutableStateFlow<com.forsale.app.features.welcome.loading.LoadingViewModel$c> r0 = r9.J
        L2:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            com.forsale.app.features.welcome.loading.LoadingViewModel$c r2 = (com.forsale.app.features.welcome.loading.LoadingViewModel.c) r2
            com.forsale.app.features.welcome.loading.LoadingViewModel$c$a r2 = new com.forsale.app.features.welcome.loading.LoadingViewModel$c$a
            java.util.List<java.lang.Integer> r4 = r9.F
            boolean r3 = r9.C
            r5 = r3 ^ 1
            int r6 = r9.D
            float r7 = r9.E
            r8 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            boolean r1 = r0.compareAndSet(r1, r2)
            if (r1 == 0) goto L2
            if (r10 == 0) goto L55
            kotlinx.coroutines.flow.MutableStateFlow<com.forsale.app.features.welcome.loading.LoadingViewModel$b> r10 = r9.M
        L24:
            java.lang.Object r0 = r10.getValue()
            r1 = r0
            com.forsale.app.features.welcome.loading.LoadingViewModel$b r1 = (com.forsale.app.features.welcome.loading.LoadingViewModel.b) r1
            com.forsale.app.features.welcome.loading.LoadingViewModel$b$c r1 = com.forsale.app.features.welcome.loading.LoadingViewModel.b.c.f37234b
            boolean r0 = r10.compareAndSet(r0, r1)
            if (r0 == 0) goto L24
            kotlinx.coroutines.flow.MutableStateFlow<com.forsale.app.features.welcome.loading.LoadingViewModel$b> r0 = r9.L
        L35:
            java.lang.Object r10 = r0.getValue()
            r1 = r10
            com.forsale.app.features.welcome.loading.LoadingViewModel$b r1 = (com.forsale.app.features.welcome.loading.LoadingViewModel.b) r1
            com.forsale.app.features.welcome.loading.LoadingViewModel$b$c r1 = com.forsale.app.features.welcome.loading.LoadingViewModel.b.c.f37234b
            boolean r10 = r0.compareAndSet(r10, r1)
            if (r10 == 0) goto L35
            kotlinx.coroutines.flow.MutableStateFlow<com.forsale.app.features.welcome.loading.LoadingViewModel$b> r10 = r9.N
        L46:
            java.lang.Object r0 = r10.getValue()
            r1 = r0
            com.forsale.app.features.welcome.loading.LoadingViewModel$b r1 = (com.forsale.app.features.welcome.loading.LoadingViewModel.b) r1
            com.forsale.app.features.welcome.loading.LoadingViewModel$b$c r1 = com.forsale.app.features.welcome.loading.LoadingViewModel.b.c.f37234b
            boolean r0 = r10.compareAndSet(r0, r1)
            if (r0 == 0) goto L46
        L55:
            kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> r10 = r9.U
            java.lang.Object r10 = r10.getValue()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L67
            r9.Y()
            return
        L67:
            com.forsale.app.features.welcome.loading.LoadingViewModel$b$a r10 = com.forsale.app.features.welcome.loading.LoadingViewModel.b.f37231a
            kotlinx.coroutines.flow.MutableStateFlow<com.forsale.app.features.welcome.loading.LoadingViewModel$b> r0 = r9.N
            java.lang.Object r0 = r0.getValue()
            com.forsale.app.features.welcome.loading.LoadingViewModel$b r0 = (com.forsale.app.features.welcome.loading.LoadingViewModel.b) r0
            boolean r0 = r10.a(r0)
            r1 = 0
            if (r0 == 0) goto L94
            kotlinx.coroutines.CoroutineScope r2 = androidx.lifecycle.r0.a(r9)
            kotlinx.coroutines.CoroutineDispatcher r0 = r9.A
            kotlinx.coroutines.CoroutineExceptionHandler$Key r3 = kotlinx.coroutines.CoroutineExceptionHandler.Key
            com.forsale.app.features.welcome.loading.LoadingViewModel$d r4 = new com.forsale.app.features.welcome.loading.LoadingViewModel$d
            r4.<init>(r3, r9, r11)
            kotlin.coroutines.CoroutineContext r3 = r0.plus(r4)
            r4 = 0
            com.forsale.app.features.welcome.loading.LoadingViewModel$fetchData$6 r5 = new com.forsale.app.features.welcome.loading.LoadingViewModel$fetchData$6
            r5.<init>(r9, r1)
            r6 = 2
            r7 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r2, r3, r4, r5, r6, r7)
        L94:
            kotlinx.coroutines.flow.MutableStateFlow<com.forsale.app.features.welcome.loading.LoadingViewModel$b> r0 = r9.L
            java.lang.Object r0 = r0.getValue()
            com.forsale.app.features.welcome.loading.LoadingViewModel$b r0 = (com.forsale.app.features.welcome.loading.LoadingViewModel.b) r0
            boolean r0 = r10.a(r0)
            if (r0 == 0) goto Lbe
            kotlinx.coroutines.CoroutineScope r2 = androidx.lifecycle.r0.a(r9)
            kotlinx.coroutines.CoroutineDispatcher r0 = r9.A
            kotlinx.coroutines.CoroutineExceptionHandler$Key r3 = kotlinx.coroutines.CoroutineExceptionHandler.Key
            com.forsale.app.features.welcome.loading.LoadingViewModel$e r4 = new com.forsale.app.features.welcome.loading.LoadingViewModel$e
            r4.<init>(r3, r9, r11)
            kotlin.coroutines.CoroutineContext r3 = r0.plus(r4)
            r4 = 0
            com.forsale.app.features.welcome.loading.LoadingViewModel$fetchData$8 r5 = new com.forsale.app.features.welcome.loading.LoadingViewModel$fetchData$8
            r5.<init>(r9, r1)
            r6 = 2
            r7 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r2, r3, r4, r5, r6, r7)
        Lbe:
            kotlinx.coroutines.flow.MutableStateFlow<com.forsale.app.features.welcome.loading.LoadingViewModel$b> r0 = r9.M
            java.lang.Object r0 = r0.getValue()
            com.forsale.app.features.welcome.loading.LoadingViewModel$b r0 = (com.forsale.app.features.welcome.loading.LoadingViewModel.b) r0
            boolean r10 = r10.a(r0)
            if (r10 == 0) goto Le8
            kotlinx.coroutines.CoroutineScope r2 = androidx.lifecycle.r0.a(r9)
            kotlinx.coroutines.CoroutineDispatcher r10 = r9.A
            kotlinx.coroutines.CoroutineExceptionHandler$Key r0 = kotlinx.coroutines.CoroutineExceptionHandler.Key
            com.forsale.app.features.welcome.loading.LoadingViewModel$f r3 = new com.forsale.app.features.welcome.loading.LoadingViewModel$f
            r3.<init>(r0, r9, r11)
            kotlin.coroutines.CoroutineContext r3 = r10.plus(r3)
            r4 = 0
            com.forsale.app.features.welcome.loading.LoadingViewModel$fetchData$10 r5 = new com.forsale.app.features.welcome.loading.LoadingViewModel$fetchData$10
            r5.<init>(r9, r1)
            r6 = 2
            r7 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r2, r3, r4, r5, r6, r7)
        Le8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.welcome.loading.LoadingViewModel.H(boolean, boolean):void");
    }

    public final MutableStateFlow<SessionEntity.AppStatus> J() {
        return this.H;
    }

    public final StateFlow<ab.a> K() {
        return this.T;
    }

    public final StateFlow<a> L() {
        return this.P;
    }

    public final StateFlow<com.forsale.app.features.welcome.loading.f> M() {
        return this.R;
    }

    public final MutableStateFlow<c> O() {
        return this.K;
    }

    public final MutableSharedFlow<Boolean> S() {
        return this.G;
    }

    public final void b0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), this.A, null, new LoadingViewModel$openContactUsBottomSheet$1(this, null), 2, null);
    }

    public final void d0(String phoneNumber) {
        o.i(phoneNumber, "phoneNumber");
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new LoadingViewModel$recordContactUsPhoneNumberClicked$1(this, phoneNumber, null), 3, null);
    }

    public final void f0(String id2) {
        o.i(id2, "id");
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), this.A, null, new LoadingViewModel$saveDeviceId$1(this, id2, null), 2, null);
    }
}
