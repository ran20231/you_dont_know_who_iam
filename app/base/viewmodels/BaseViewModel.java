package com.forsale.app.base.viewmodels;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.b0;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import com.forsale.app.datalayer.database.InAppMessageEntity;
import com.forsale.app.datalayer.database.InAppType;
import com.forsale.app.datalayer.network.responses.AboutToExpireListing;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.forsale.app.datalayer.repositories.ExpireSoonRepository;
import com.forsale.app.datalayer.repositories.ImagesRepository;
import com.forsale.app.datalayer.repositories.InAppRepository;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.utils.GenericDialogParameters;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.d;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import lj.a;
import wi.a;
import wz.h;
import wz.p;
/* compiled from: BaseViewModel.kt */
/* loaded from: classes2.dex */
public class BaseViewModel extends q0 implements CoroutineScope, lj.a {
    private final SharedFlow<Integer> A;
    private final MutableSharedFlow<String> B;
    private final SharedFlow<String> C;
    private final MutableSharedFlow<Pair<Integer, Pair<g00.a<p>, g00.a<p>>>> D;
    private final SharedFlow<Pair<Integer, Pair<g00.a<p>, g00.a<p>>>> E;
    private final b0<Pair<Integer, Pair<g00.a<p>, g00.a<p>>>> F;
    private final MutableSharedFlow<GenericDialogParameters> G;
    private final SharedFlow<GenericDialogParameters> H;
    private final MutableSharedFlow<com.forsale.app.utils.b> I;
    private final SharedFlow<com.forsale.app.utils.b> J;
    private final MutableSharedFlow<InAppMessageEntity> K;
    private final SharedFlow<InAppMessageEntity> L;
    private final MutableSharedFlow<String> M;
    private final SharedFlow<String> N;
    private final MutableSharedFlow<g00.a<p>> O;
    private final SharedFlow<g00.a<p>> P;
    private final MutableSharedFlow<Pair<AboutToExpireListing, g00.a<p>>> Q;
    private final SharedFlow<Pair<AboutToExpireListing, g00.a<p>>> R;
    private final h S;
    private final h T;
    private final h U;
    private final h V;
    private final h W;
    private final h X;
    private final h Y;
    private final h Z;

    /* renamed from: a  reason: collision with root package name */
    private final BaseRepository f22220a;

    /* renamed from: a0  reason: collision with root package name */
    private final MutableSharedFlow<p> f22221a0;

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineContext f22222b;

    /* renamed from: b0  reason: collision with root package name */
    private final SharedFlow<p> f22223b0;

    /* renamed from: c  reason: collision with root package name */
    private final h f22224c;

    /* renamed from: c0  reason: collision with root package name */
    private final MutableSharedFlow<p> f22225c0;

    /* renamed from: d  reason: collision with root package name */
    private final CoroutineContext f22226d;

    /* renamed from: d0  reason: collision with root package name */
    private final SharedFlow<p> f22227d0;

    /* renamed from: e  reason: collision with root package name */
    private final MutableSharedFlow<Integer> f22228e;

    /* renamed from: e0  reason: collision with root package name */
    private final MutableSharedFlow<p> f22229e0;

    /* renamed from: f  reason: collision with root package name */
    private final SharedFlow<Integer> f22230f;

    /* renamed from: f0  reason: collision with root package name */
    private final SharedFlow<p> f22231f0;

    /* renamed from: g  reason: collision with root package name */
    private final MutableSharedFlow<String> f22232g;

    /* renamed from: g0  reason: collision with root package name */
    private final MutableSharedFlow<p> f22233g0;

    /* renamed from: h  reason: collision with root package name */
    private final SharedFlow<String> f22234h;

    /* renamed from: h0  reason: collision with root package name */
    private final SharedFlow<p> f22235h0;

    /* renamed from: i  reason: collision with root package name */
    private final MutableSharedFlow<Integer> f22236i;

    /* renamed from: i0  reason: collision with root package name */
    private final MutableSharedFlow<p> f22237i0;

    /* renamed from: j  reason: collision with root package name */
    private final SharedFlow<Integer> f22238j;

    /* renamed from: j0  reason: collision with root package name */
    private final SharedFlow<p> f22239j0;

    /* renamed from: x  reason: collision with root package name */
    private final MutableSharedFlow<String> f22240x;

    /* renamed from: y  reason: collision with root package name */
    private final SharedFlow<String> f22241y;

    /* renamed from: z  reason: collision with root package name */
    private final MutableSharedFlow<Integer> f22242z;

    /* compiled from: BaseViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22243a;

        static {
            int[] iArr = new int[InAppType.values().length];
            try {
                iArr[InAppType.IN_APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f22243a = iArr;
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
            String message = th2.getMessage();
            x10.a.b("inAppHandler:" + message, new Object[0]);
        }
    }

    public BaseViewModel(BaseRepository baseRepository) {
        h a11;
        h a12;
        h a13;
        h a14;
        h a15;
        h a16;
        h a17;
        h a18;
        h a19;
        o.i(baseRepository, "baseRepository");
        this.f22220a = baseRepository;
        this.f22222b = SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getIO());
        a11 = d.a(new g00.a<b0<Bundle>>() { // from class: com.forsale.app.base.viewmodels.BaseViewModel$layoutManagerState$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final b0<Bundle> invoke() {
                return new b0<>();
            }
        });
        this.f22224c = a11;
        this.f22226d = Dispatchers.getIO().plus(new b(CoroutineExceptionHandler.Key));
        MutableSharedFlow<Integer> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f22228e = MutableSharedFlow$default;
        this.f22230f = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableSharedFlow<String> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f22232g = MutableSharedFlow$default2;
        this.f22234h = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        MutableSharedFlow<Integer> MutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f22236i = MutableSharedFlow$default3;
        this.f22238j = FlowKt.asSharedFlow(MutableSharedFlow$default3);
        MutableSharedFlow<String> MutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f22240x = MutableSharedFlow$default4;
        this.f22241y = FlowKt.asSharedFlow(MutableSharedFlow$default4);
        MutableSharedFlow<Integer> MutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f22242z = MutableSharedFlow$default5;
        this.A = FlowKt.asSharedFlow(MutableSharedFlow$default5);
        MutableSharedFlow<String> MutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.B = MutableSharedFlow$default6;
        this.C = FlowKt.asSharedFlow(MutableSharedFlow$default6);
        MutableSharedFlow<Pair<Integer, Pair<g00.a<p>, g00.a<p>>>> MutableSharedFlow$default7 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.D = MutableSharedFlow$default7;
        this.E = FlowKt.asSharedFlow(MutableSharedFlow$default7);
        this.F = new b0<>();
        MutableSharedFlow<GenericDialogParameters> MutableSharedFlow$default8 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.G = MutableSharedFlow$default8;
        this.H = FlowKt.asSharedFlow(MutableSharedFlow$default8);
        MutableSharedFlow<com.forsale.app.utils.b> MutableSharedFlow$default9 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.I = MutableSharedFlow$default9;
        this.J = FlowKt.asSharedFlow(MutableSharedFlow$default9);
        MutableSharedFlow<InAppMessageEntity> MutableSharedFlow$default10 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.K = MutableSharedFlow$default10;
        this.L = FlowKt.asSharedFlow(MutableSharedFlow$default10);
        MutableSharedFlow<String> MutableSharedFlow$default11 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.M = MutableSharedFlow$default11;
        this.N = FlowKt.asSharedFlow(MutableSharedFlow$default11);
        MutableSharedFlow<g00.a<p>> MutableSharedFlow$default12 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.O = MutableSharedFlow$default12;
        this.P = FlowKt.asSharedFlow(MutableSharedFlow$default12);
        MutableSharedFlow<Pair<AboutToExpireListing, g00.a<p>>> MutableSharedFlow$default13 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.Q = MutableSharedFlow$default13;
        this.R = FlowKt.asSharedFlow(MutableSharedFlow$default13);
        a12 = d.a(new g00.a<InAppRepository>() { // from class: com.forsale.app.base.viewmodels.BaseViewModel$inAppRepository$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final InAppRepository invoke() {
                BaseRepository baseRepository2;
                baseRepository2 = BaseViewModel.this.f22220a;
                return baseRepository2.getInAppRepository();
            }
        });
        this.S = a12;
        a13 = d.a(new g00.a<ImagesRepository>() { // from class: com.forsale.app.base.viewmodels.BaseViewModel$imagesRepository$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final ImagesRepository invoke() {
                BaseRepository baseRepository2;
                baseRepository2 = BaseViewModel.this.f22220a;
                return baseRepository2.getImagesRepository();
            }
        });
        this.T = a13;
        a14 = d.a(new g00.a<RegionsRepository>() { // from class: com.forsale.app.base.viewmodels.BaseViewModel$regionsRepository$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final RegionsRepository invoke() {
                BaseRepository baseRepository2;
                baseRepository2 = BaseViewModel.this.f22220a;
                return baseRepository2.getRegionsRepository();
            }
        });
        this.U = a14;
        a15 = d.a(new g00.a<AggregatedAllAnalyticsLogger>() { // from class: com.forsale.app.base.viewmodels.BaseViewModel$analyticsLogger$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final AggregatedAllAnalyticsLogger invoke() {
                BaseRepository baseRepository2;
                baseRepository2 = BaseViewModel.this.f22220a;
                return baseRepository2.getAnalyticsLogger();
            }
        });
        this.V = a15;
        a16 = d.a(new g00.a<wi.a>() { // from class: com.forsale.app.base.viewmodels.BaseViewModel$analyticsCustomLogger$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final a invoke() {
                BaseRepository baseRepository2;
                baseRepository2 = BaseViewModel.this.f22220a;
                return baseRepository2.getAnalyticsCustomLogger();
            }
        });
        this.W = a16;
        a17 = d.a(new g00.a<ExpireSoonRepository>() { // from class: com.forsale.app.base.viewmodels.BaseViewModel$expireSoonRepository$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final ExpireSoonRepository invoke() {
                BaseRepository baseRepository2;
                baseRepository2 = BaseViewModel.this.f22220a;
                return baseRepository2.getExpireSoonRepository();
            }
        });
        this.X = a17;
        a18 = d.a(new g00.a<CategoriesRepositories>() { // from class: com.forsale.app.base.viewmodels.BaseViewModel$categoriesRepositories$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final CategoriesRepositories invoke() {
                BaseRepository baseRepository2;
                baseRepository2 = BaseViewModel.this.f22220a;
                return baseRepository2.getCategoriesRepositories();
            }
        });
        this.Y = a18;
        a19 = d.a(new g00.a<ApplicationResourcesRepository>() { // from class: com.forsale.app.base.viewmodels.BaseViewModel$resourcesRepo$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final ApplicationResourcesRepository invoke() {
                BaseRepository baseRepository2;
                baseRepository2 = BaseViewModel.this.f22220a;
                return baseRepository2.getResourcesRepository();
            }
        });
        this.Z = a19;
        MutableSharedFlow<p> MutableSharedFlow$default14 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f22221a0 = MutableSharedFlow$default14;
        this.f22223b0 = FlowKt.asSharedFlow(MutableSharedFlow$default14);
        MutableSharedFlow<p> MutableSharedFlow$default15 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f22225c0 = MutableSharedFlow$default15;
        this.f22227d0 = FlowKt.asSharedFlow(MutableSharedFlow$default15);
        MutableSharedFlow<p> MutableSharedFlow$default16 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f22229e0 = MutableSharedFlow$default16;
        this.f22231f0 = FlowKt.asSharedFlow(MutableSharedFlow$default16);
        MutableSharedFlow<p> MutableSharedFlow$default17 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f22233g0 = MutableSharedFlow$default17;
        this.f22235h0 = FlowKt.asSharedFlow(MutableSharedFlow$default17);
        MutableSharedFlow<p> MutableSharedFlow$default18 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f22237i0 = MutableSharedFlow$default18;
        this.f22239j0 = FlowKt.asSharedFlow(MutableSharedFlow$default18);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object o0(InAppMessageEntity inAppMessageEntity, zz.a<? super p> aVar) {
        int i11;
        Object f11;
        InAppType type = inAppMessageEntity.getType();
        if (type == null) {
            i11 = -1;
        } else {
            i11 = a.f22243a[type.ordinal()];
        }
        if (i11 == 1) {
            Object X = AggregatedAllAnalyticsLoggerKt.X(r(), AggregatedAllAnalyticsLogger.InAppActionEvents.IN_APP_MESSAGE_OPENED, null, inAppMessageEntity.getItemId(), null, null, aVar, 24, null);
            f11 = kotlin.coroutines.intrinsics.b.f();
            if (X == f11) {
                return X;
            }
            return p.f75480a;
        }
        return p.f75480a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object p0(InAppMessageEntity inAppMessageEntity, zz.a<? super p> aVar) {
        int i11;
        Object f11;
        InAppType type = inAppMessageEntity.getType();
        if (type == null) {
            i11 = -1;
        } else {
            i11 = a.f22243a[type.ordinal()];
        }
        if (i11 == 1) {
            Object X = AggregatedAllAnalyticsLoggerKt.X(r(), AggregatedAllAnalyticsLogger.InAppActionEvents.IN_APP_MESSAGE_VIEWED, null, inAppMessageEntity.getItemId(), null, null, aVar, 24, null);
            f11 = kotlin.coroutines.intrinsics.b.f();
            if (X == f11) {
                return X;
            }
            return p.f75480a;
        }
        return p.f75480a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0() {
        A().saveInAppMessageConsumed(1);
    }

    public final InAppRepository A() {
        return (InAppRepository) this.S.getValue();
    }

    public final SharedFlow<g00.a<p>> B() {
        return this.P;
    }

    public final b0<Pair<Integer, Pair<g00.a<p>, g00.a<p>>>> C() {
        return this.F;
    }

    public final SharedFlow<p> D() {
        return this.f22235h0;
    }

    public final SharedFlow<p> E() {
        return this.f22227d0;
    }

    public final SharedFlow<p> F() {
        return this.f22231f0;
    }

    public final SharedFlow<p> G() {
        return this.f22223b0;
    }

    public final SharedFlow<Pair<AboutToExpireListing, g00.a<p>>> H() {
        return this.R;
    }

    public final RegionsRepository I() {
        return (RegionsRepository) this.U.getValue();
    }

    public final ApplicationResourcesRepository J() {
        return (ApplicationResourcesRepository) this.Z.getValue();
    }

    public final SharedFlow<Integer> K() {
        return this.A;
    }

    public final SharedFlow<String> L() {
        return this.C;
    }

    public final SharedFlow<Integer> M() {
        return this.f22238j;
    }

    public final SharedFlow<String> N() {
        return this.f22234h;
    }

    public final SharedFlow<String> O() {
        return this.f22241y;
    }

    public final SharedFlow<String> Q() {
        return this.N;
    }

    public final SharedFlow<Pair<Integer, Pair<g00.a<p>, g00.a<p>>>> S() {
        return this.E;
    }

    public final MutableSharedFlow<Integer> T() {
        return this.f22228e;
    }

    public final MutableSharedFlow<com.forsale.app.utils.b> V() {
        return this.I;
    }

    public final MutableSharedFlow<GenericDialogParameters> X() {
        return this.G;
    }

    public final MutableSharedFlow<InAppMessageEntity> Y() {
        return this.K;
    }

    public final MutableSharedFlow<g00.a<p>> Z() {
        return this.O;
    }

    public final MutableSharedFlow<p> a0() {
        return this.f22233g0;
    }

    @Override // lj.a
    public Parcelable b(String str) {
        return a.C0733a.a(this, str);
    }

    public final MutableSharedFlow<p> b0() {
        return this.f22237i0;
    }

    @Override // lj.a
    public b0<Bundle> c() {
        return (b0) this.f22224c.getValue();
    }

    public final MutableSharedFlow<p> c0() {
        return this.f22229e0;
    }

    @Override // lj.a
    public void d(Parcelable parcelable, String str) {
        a.C0733a.c(this, parcelable, str);
    }

    public final MutableSharedFlow<p> d0() {
        return this.f22221a0;
    }

    public final MutableSharedFlow<Integer> e0() {
        return this.f22242z;
    }

    public final MutableSharedFlow<String> f0() {
        return this.B;
    }

    public final MutableSharedFlow<Integer> g0() {
        return this.f22236i;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f22222b;
    }

    public final MutableSharedFlow<String> h0() {
        return this.f22232g;
    }

    public final MutableSharedFlow<String> i0() {
        return this.f22240x;
    }

    public final MutableSharedFlow<String> j0() {
        return this.M;
    }

    public final MutableSharedFlow<Pair<Integer, Pair<g00.a<p>, g00.a<p>>>> k0() {
        return this.D;
    }

    public final void l() {
        x10.a.b("consume IN app", new Object[0]);
        BuildersKt__Builders_commonKt.launch$default(this, this.f22226d, null, new BaseViewModel$consumeInAppMessage$1(this, null), 2, null);
    }

    public final void l0(InAppMessageEntity inAppMessage) {
        o.i(inAppMessage, "inAppMessage");
        BuildersKt__Builders_commonKt.launch$default(this, this.f22226d, null, new BaseViewModel$incrementInAppImpression$1(this, inAppMessage, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.util.List<java.lang.Integer> r13, java.util.List<java.lang.Integer> r14, zz.a<? super wz.p> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.forsale.app.base.viewmodels.BaseViewModel$consumePromotedPost$1
            if (r0 == 0) goto L13
            r0 = r15
            com.forsale.app.base.viewmodels.BaseViewModel$consumePromotedPost$1 r0 = (com.forsale.app.base.viewmodels.BaseViewModel$consumePromotedPost$1) r0
            int r1 = r0.f22265e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22265e = r1
            goto L18
        L13:
            com.forsale.app.base.viewmodels.BaseViewModel$consumePromotedPost$1 r0 = new com.forsale.app.base.viewmodels.BaseViewModel$consumePromotedPost$1
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.f22263c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f22265e
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r13 = r0.f22261a
            com.forsale.app.base.viewmodels.BaseViewModel r13 = (com.forsale.app.base.viewmodels.BaseViewModel) r13
            kotlin.f.b(r15)
            goto L9e
        L32:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3a:
            java.lang.Object r13 = r0.f22262b
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r14 = r0.f22261a
            com.forsale.app.base.viewmodels.BaseViewModel r14 = (com.forsale.app.base.viewmodels.BaseViewModel) r14
            kotlin.f.b(r15)
            goto L6e
        L46:
            kotlin.f.b(r15)
            if (r13 == 0) goto Lb2
            r15 = r14
            java.util.Collection r15 = (java.util.Collection) r15
            if (r15 == 0) goto L59
            boolean r15 = r15.isEmpty()
            if (r15 == 0) goto L57
            goto L59
        L57:
            r15 = 0
            goto L5a
        L59:
            r15 = r5
        L5a:
            if (r15 == 0) goto L88
            com.forsale.app.datalayer.repositories.RegionsRepository r14 = r12.I()
            r0.f22261a = r12
            r0.f22262b = r13
            r0.f22265e = r5
            java.lang.Object r15 = r14.getCurrentRegion(r0)
            if (r15 != r1) goto L6d
            return r1
        L6d:
            r14 = r12
        L6e:
            com.forsale.app.datalayer.database.RegionEntity r15 = (com.forsale.app.datalayer.database.RegionEntity) r15
            java.lang.Integer r15 = r15.getMainDistrictId()
            if (r15 == 0) goto L83
            int r15 = r15.intValue()
            java.lang.Integer r15 = kotlin.coroutines.jvm.internal.a.d(r15)
            java.util.List r15 = kotlin.collections.p.e(r15)
            goto L84
        L83:
            r15 = r4
        L84:
            r11 = r14
            r14 = r13
            r13 = r11
            goto L8b
        L88:
            r15 = r14
            r14 = r13
            r13 = r12
        L8b:
            com.forsale.app.datalayer.repositories.InAppRepository r2 = r13.A()
            com.forsale.app.datalayer.database.InAppType r5 = com.forsale.app.datalayer.database.InAppType.PROMOTED_POST
            r0.f22261a = r13
            r0.f22262b = r4
            r0.f22265e = r3
            java.lang.Object r15 = r2.consumeInAppMessage(r5, r14, r15, r0)
            if (r15 != r1) goto L9e
            return r1
        L9e:
            com.forsale.app.datalayer.database.InAppMessageEntity r15 = (com.forsale.app.datalayer.database.InAppMessageEntity) r15
            if (r15 == 0) goto Lb2
            kotlinx.coroutines.CoroutineScope r5 = androidx.lifecycle.r0.a(r13)
            r6 = 0
            r7 = 0
            com.forsale.app.base.viewmodels.BaseViewModel$consumePromotedPost$2$1$1 r8 = new com.forsale.app.base.viewmodels.BaseViewModel$consumePromotedPost$2$1$1
            r8.<init>(r13, r15, r4)
            r9 = 3
            r10 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r5, r6, r7, r8, r9, r10)
        Lb2:
            wz.p r13 = wz.p.f75480a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.base.viewmodels.BaseViewModel.m(java.util.List, java.util.List, zz.a):java.lang.Object");
    }

    public final void m0(InAppMessageEntity inAppMessage) {
        o.i(inAppMessage, "inAppMessage");
        BuildersKt__Builders_commonKt.launch$default(this, this.f22226d, null, new BaseViewModel$incrementInAppView$1(this, inAppMessage, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.util.List<java.lang.Integer> r9, zz.a<? super wz.p> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.forsale.app.base.viewmodels.BaseViewModel$consumePromotedPostAsync$1
            if (r0 == 0) goto L13
            r0 = r10
            com.forsale.app.base.viewmodels.BaseViewModel$consumePromotedPostAsync$1 r0 = (com.forsale.app.base.viewmodels.BaseViewModel$consumePromotedPostAsync$1) r0
            int r1 = r0.f22272d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22272d = r1
            goto L18
        L13:
            com.forsale.app.base.viewmodels.BaseViewModel$consumePromotedPostAsync$1 r0 = new com.forsale.app.base.viewmodels.BaseViewModel$consumePromotedPostAsync$1
            r0.<init>(r8, r10)
        L18:
            r5 = r0
            java.lang.Object r10 = r5.f22270b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r5.f22272d
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r9 = r5.f22269a
            com.forsale.app.base.viewmodels.BaseViewModel r9 = (com.forsale.app.base.viewmodels.BaseViewModel) r9
            kotlin.f.b(r10)
            goto L52
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            kotlin.f.b(r10)
            if (r9 == 0) goto L67
            com.forsale.app.datalayer.repositories.InAppRepository r1 = r8.A()
            com.forsale.app.datalayer.database.InAppType r10 = com.forsale.app.datalayer.database.InAppType.PROMOTED_POST
            r4 = 0
            r6 = 4
            r7 = 0
            r5.f22269a = r8
            r5.f22272d = r2
            r2 = r10
            r3 = r9
            java.lang.Object r10 = com.forsale.app.datalayer.repositories.InAppRepository.consumeInAppMessage$default(r1, r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L51
            return r0
        L51:
            r9 = r8
        L52:
            com.forsale.app.datalayer.database.InAppMessageEntity r10 = (com.forsale.app.datalayer.database.InAppMessageEntity) r10
            if (r10 == 0) goto L67
            kotlinx.coroutines.CoroutineScope r0 = androidx.lifecycle.r0.a(r9)
            r1 = 0
            r2 = 0
            com.forsale.app.base.viewmodels.BaseViewModel$consumePromotedPostAsync$2$1$1 r3 = new com.forsale.app.base.viewmodels.BaseViewModel$consumePromotedPostAsync$2$1$1
            r4 = 0
            r3.<init>(r9, r10, r4)
            r4 = 3
            r5 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r0, r1, r2, r3, r4, r5)
        L67:
            wz.p r9 = wz.p.f75480a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.base.viewmodels.BaseViewModel.o(java.util.List, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.q0
    public void onCleared() {
        super.onCleared();
        JobKt__JobKt.cancelChildren$default(getCoroutineContext(), null, 1, null);
    }

    public final void p(InAppMessageEntity inAppMessage) {
        o.i(inAppMessage, "inAppMessage");
        BuildersKt__Builders_commonKt.launch$default(this, this.f22226d, null, new BaseViewModel$deleteInApp$1(this, inAppMessage, null), 2, null);
    }

    public final wi.a q() {
        return (wi.a) this.W.getValue();
    }

    public final AggregatedAllAnalyticsLogger r() {
        return (AggregatedAllAnalyticsLogger) this.V.getValue();
    }

    public final void r0(g00.a<p> actionAfter) {
        o.i(actionAfter, "actionAfter");
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new BaseViewModel$pullExpireSoonItem$1(this, actionAfter, null), 3, null);
    }

    public final CategoriesRepositories s() {
        return (CategoriesRepositories) this.Y.getValue();
    }

    public void s0(Bundle state) {
        o.i(state, "state");
    }

    public final SharedFlow<Integer> t() {
        return this.f22230f;
    }

    public Bundle u0() {
        return null;
    }

    public final ExpireSoonRepository v() {
        return (ExpireSoonRepository) this.X.getValue();
    }

    public final SharedFlow<com.forsale.app.utils.b> w() {
        return this.J;
    }

    public final SharedFlow<GenericDialogParameters> x() {
        return this.H;
    }

    public final ImagesRepository y() {
        return (ImagesRepository) this.T.getValue();
    }

    public final SharedFlow<InAppMessageEntity> z() {
        return this.L;
    }

    public void q0() {
    }
}
