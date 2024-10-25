package com.forsale.app.features.more.mytransactions;

import androidx.lifecycle.b0;
import androidx.paging.PagedList;
import com.forsale.app.base.ViewStates;
import com.forsale.app.base.viewmodels.BaseStatefulViewModel;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.features.more.mytransactions.MyTransactionDataSource;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import com.forsale.app.utils.prefUtils.preferences.FeatureFlagPrefs;
import g00.p;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import wz.h;
/* compiled from: MyTransactionsViewModel.kt */
/* loaded from: classes2.dex */
public final class MyTransactionsViewModel extends BaseStatefulViewModel {

    /* renamed from: w0  reason: collision with root package name */
    public static final a f32029w0 = new a(null);

    /* renamed from: x0  reason: collision with root package name */
    public static final int f32030x0 = 8;

    /* renamed from: l0  reason: collision with root package name */
    private final UserProfileInteractor f32031l0;

    /* renamed from: m0  reason: collision with root package name */
    private final ApplicationResourcesRepository f32032m0;

    /* renamed from: n0  reason: collision with root package name */
    private final DistrictsRepository f32033n0;

    /* renamed from: o0  reason: collision with root package name */
    private final jj.b f32034o0;

    /* renamed from: p0  reason: collision with root package name */
    private final h f32035p0;

    /* renamed from: q0  reason: collision with root package name */
    public MyTransactionDataSource f32036q0;

    /* renamed from: r0  reason: collision with root package name */
    private final CoroutineExceptionHandler f32037r0;

    /* renamed from: s0  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f32038s0;

    /* renamed from: t0  reason: collision with root package name */
    private final StateFlow<Boolean> f32039t0;

    /* renamed from: u0  reason: collision with root package name */
    public vz.a<MyTransactionDataSource.a> f32040u0;

    /* renamed from: v0  reason: collision with root package name */
    private final CoroutineContext f32041v0;

    /* compiled from: MyTransactionsViewModel.kt */
    @d(c = "com.forsale.app.features.more.mytransactions.MyTransactionsViewModel$1", f = "MyTransactionsViewModel.kt", l = {52}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.more.mytransactions.MyTransactionsViewModel$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f32042a;

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
            Object value;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f32042a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                FeatureFlagPrefs d11 = MyTransactionsViewModel.this.B0().d();
                this.f32042a = 1;
                obj = d11.b(this);
                if (obj == f11) {
                    return f11;
                }
            }
            MyTransactionsViewModel myTransactionsViewModel = MyTransactionsViewModel.this;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            MutableStateFlow mutableStateFlow = myTransactionsViewModel.f32038s0;
            do {
                value = mutableStateFlow.getValue();
                ((Boolean) value).booleanValue();
            } while (!mutableStateFlow.compareAndSet(value, kotlin.coroutines.jvm.internal.a.a(booleanValue)));
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* compiled from: MyTransactionsViewModel.kt */
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
        final /* synthetic */ MyTransactionsViewModel f32044a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.Key key, MyTransactionsViewModel myTransactionsViewModel) {
            super(key);
            this.f32044a = myTransactionsViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            String message = th2.getMessage();
            x10.a.b("4SALE_ERROR:: " + message, new Object[0]);
            this.f32044a.v0().postValue(ViewStates.ERROR);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTransactionsViewModel(UserProfileInteractor userProfileInteractor, ApplicationResourcesRepository resourcesRepository, DistrictsRepository districtsRepository, jj.b prefs, BaseRepository baseRepository) {
        super(baseRepository);
        h a11;
        o.i(userProfileInteractor, "userProfileInteractor");
        o.i(resourcesRepository, "resourcesRepository");
        o.i(districtsRepository, "districtsRepository");
        o.i(prefs, "prefs");
        o.i(baseRepository, "baseRepository");
        this.f32031l0 = userProfileInteractor;
        this.f32032m0 = resourcesRepository;
        this.f32033n0 = districtsRepository;
        this.f32034o0 = prefs;
        a11 = kotlin.d.a(new g00.a<b0<String>>() { // from class: com.forsale.app.features.more.mytransactions.MyTransactionsViewModel$regionPrefix$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final b0<String> invoke() {
                return new b0<>();
            }
        });
        this.f32035p0 = a11;
        b bVar = new b(CoroutineExceptionHandler.Key, this);
        this.f32037r0 = bVar;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f32038s0 = MutableStateFlow;
        this.f32039t0 = FlowKt.asStateFlow(MutableStateFlow);
        this.f32041v0 = Dispatchers.getIO().plus(bVar);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new AnonymousClass1(null), 3, null);
    }

    private final PagedList.c I0() {
        return new PagedList.c.a().c(30).d(15).b(false).a();
    }

    public final MyTransactionDataSource A0() {
        MyTransactionDataSource myTransactionDataSource = this.f32036q0;
        if (myTransactionDataSource != null) {
            return myTransactionDataSource;
        }
        o.w("myTransactionDataSource");
        return null;
    }

    public final jj.b B0() {
        return this.f32034o0;
    }

    public final void C0() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new MyTransactionsViewModel$getRegion$1(this, null), 3, null);
    }

    public final b0<String> D0() {
        return (b0) this.f32035p0.getValue();
    }

    public final ApplicationResourcesRepository E0() {
        return this.f32032m0;
    }

    public final StateFlow<Boolean> G0() {
        return this.f32039t0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H0(zz.a<? super androidx.lifecycle.LiveData<androidx.paging.PagedList<com.forsale.app.datalayer.network.entities.MyTransactionEntity.Record>>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.features.more.mytransactions.MyTransactionsViewModel$getTransactions$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.features.more.mytransactions.MyTransactionsViewModel$getTransactions$1 r0 = (com.forsale.app.features.more.mytransactions.MyTransactionsViewModel$getTransactions$1) r0
            int r1 = r0.f32054d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32054d = r1
            goto L18
        L13:
            com.forsale.app.features.more.mytransactions.MyTransactionsViewModel$getTransactions$1 r0 = new com.forsale.app.features.more.mytransactions.MyTransactionsViewModel$getTransactions$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f32052b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f32054d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f32051a
            com.forsale.app.features.more.mytransactions.MyTransactionsViewModel r0 = (com.forsale.app.features.more.mytransactions.MyTransactionsViewModel) r0
            kotlin.f.b(r5)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.f.b(r5)
            com.forsale.app.utils.facades.user.UserProfileInteractor r5 = r4.f32031l0
            r0.f32051a = r4
            r0.f32054d = r3
            java.lang.Object r5 = r5.i(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r0 = r4
        L46:
            com.forsale.app.datalayer.database.UserEntity r5 = (com.forsale.app.datalayer.database.UserEntity) r5
            if (r5 == 0) goto L81
            vz.a r1 = r0.z0()
            java.lang.Object r1 = r1.get()
            com.forsale.app.features.more.mytransactions.MyTransactionDataSource$a r1 = (com.forsale.app.features.more.mytransactions.MyTransactionDataSource.a) r1
            androidx.lifecycle.b0 r2 = r0.v0()
            java.lang.String r5 = r5.getPhone()
            kotlin.jvm.internal.o.f(r5)
            kotlinx.coroutines.flow.MutableSharedFlow r3 = r0.g0()
            com.forsale.app.features.more.mytransactions.MyTransactionDataSource r5 = r1.a(r2, r5, r3)
            r0.J0(r5)
            androidx.paging.e r5 = new androidx.paging.e
            ud.c r1 = new ud.c
            com.forsale.app.features.more.mytransactions.MyTransactionDataSource r2 = r0.A0()
            r1.<init>(r2)
            androidx.paging.PagedList$c r0 = r0.I0()
            r5.<init>(r1, r0)
            androidx.lifecycle.LiveData r5 = r5.a()
            goto L82
        L81:
            r5 = 0
        L82:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.mytransactions.MyTransactionsViewModel.H0(zz.a):java.lang.Object");
    }

    public final void J0(MyTransactionDataSource myTransactionDataSource) {
        o.i(myTransactionDataSource, "<set-?>");
        this.f32036q0 = myTransactionDataSource;
    }

    @Override // com.forsale.app.base.viewmodels.BaseViewModel, kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f32041v0;
    }

    public final DistrictsRepository y0() {
        return this.f32033n0;
    }

    public final vz.a<MyTransactionDataSource.a> z0() {
        vz.a<MyTransactionDataSource.a> aVar = this.f32040u0;
        if (aVar != null) {
            return aVar;
        }
        o.w("myTransactionDSFactoryProvider");
        return null;
    }
}
