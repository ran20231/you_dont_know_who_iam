package com.forsale.app.features.postad.extrainfo;

import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.r0;
import androidx.lifecycle.z;
import com.forsale.app.base.ViewStates;
import com.forsale.app.base.viewmodels.BaseStatefulViewModel;
import com.forsale.app.datalayer.database.CategoryRuleSet;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.network.ResponseWrapper;
import com.forsale.app.datalayer.network.entities.BusinessType;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.MutexIsLockedException;
import com.forsale.app.datalayer.repositories.ProhibitedKeywordsRepository;
import com.forsale.app.features.postad.PostAdRepository;
import com.forsale.app.features.postad.PostAdScreens;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.utils.ViewsExtensionsKt;
import com.forsale.app.utils.analytics.CreateEditAdvActionType;
import com.forsale.app.utils.v;
import com.forsale.app.utils.validation.PhoneDetectorKt;
import dj.i;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import t9.y0;
import wz.h;
import wz.p;
/* compiled from: PostAdExtraInfoViewModel.kt */
/* loaded from: classes2.dex */
public final class PostAdExtraInfoViewModel extends BaseStatefulViewModel {
    public static final a Z0 = new a(null);

    /* renamed from: a1  reason: collision with root package name */
    public static final int f35483a1 = 8;
    private final MutableSharedFlow<Pair<String, Boolean>> A0;
    private final SharedFlow<Pair<String, Boolean>> B0;
    private final b0<String> C0;
    private final b0<Set<String>> D0;
    private final ObservableField<String> E0;
    private final ObservableBoolean F0;
    private final z<String> G0;
    private final z<Boolean> H0;
    private final b0<String> I0;
    public v.a J0;
    private final h K0;
    private int L0;
    private final z<Boolean> M0;
    private final h N0;
    private Set<String> O0;
    private final Set<String> P0;
    private final MutableSharedFlow<p> Q0;
    private final SharedFlow<p> R0;
    private final String S0;
    private final LiveData<CategoryRuleSet.RuleSet> T0;
    private final b0<Integer> U0;
    private final LiveData<BusinessType> V0;
    private Integer W0;
    private final CoroutineExceptionHandler X0;
    private final c0<BusinessType> Y0;

    /* renamed from: l0  reason: collision with root package name */
    private final PostAdViewModel f35484l0;

    /* renamed from: m0  reason: collision with root package name */
    private final ProhibitedKeywordsRepository f35485m0;

    /* renamed from: n0  reason: collision with root package name */
    private final we.a f35486n0;

    /* renamed from: o0  reason: collision with root package name */
    private final ApplicationResourcesRepository f35487o0;

    /* renamed from: p0  reason: collision with root package name */
    private final PostAdRepository f35488p0;

    /* renamed from: q0  reason: collision with root package name */
    private final MutableSharedFlow<Pair<String, Boolean>> f35489q0;

    /* renamed from: r0  reason: collision with root package name */
    private final SharedFlow<Pair<String, Boolean>> f35490r0;

    /* renamed from: s0  reason: collision with root package name */
    private final LiveData<List<String>> f35491s0;

    /* renamed from: t0  reason: collision with root package name */
    private final ObservableBoolean f35492t0;

    /* renamed from: u0  reason: collision with root package name */
    private final ObservableBoolean f35493u0;

    /* renamed from: v0  reason: collision with root package name */
    private final MutableSharedFlow<Boolean> f35494v0;

    /* renamed from: w0  reason: collision with root package name */
    private final SharedFlow<Boolean> f35495w0;

    /* renamed from: x0  reason: collision with root package name */
    private final MutableStateFlow<Long> f35496x0;

    /* renamed from: y0  reason: collision with root package name */
    private final StateFlow<Long> f35497y0;

    /* renamed from: z0  reason: collision with root package name */
    private final Set<String> f35498z0;

    /* compiled from: PostAdExtraInfoViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$2", f = "PostAdExtraInfoViewModel.kt", l = {154, 155, 158}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass2 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35499a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f35500b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PostAdExtraInfoViewModel.kt */
        @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$2$1", f = "PostAdExtraInfoViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$2$1  reason: invalid class name */
        /* loaded from: classes2.dex */
        public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f35502a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ PostAdExtraInfoViewModel f35503b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PostAdExtraInfoViewModel postAdExtraInfoViewModel, zz.a<? super AnonymousClass1> aVar) {
                super(2, aVar);
                this.f35503b = postAdExtraInfoViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<p> create(Object obj, zz.a<?> aVar) {
                return new AnonymousClass1(this.f35503b, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.f();
                if (this.f35502a == 0) {
                    f.b(obj);
                    this.f35503b.V0.observeForever(this.f35503b.Y0);
                    return p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // g00.p
            public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
                return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
            }
        }

        AnonymousClass2(zz.a<? super AnonymousClass2> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(aVar);
            anonymousClass2.f35500b = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
                int r1 = r6.f35499a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L29
                if (r1 == r4) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.f.b(r7)
                goto L5c
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                kotlin.f.b(r7)
                goto L51
            L21:
                java.lang.Object r1 = r6.f35500b
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.f.b(r7)
                goto L3e
            L29:
                kotlin.f.b(r7)
                java.lang.Object r7 = r6.f35500b
                r1 = r7
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel r7 = com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel.this
                r6.f35500b = r1
                r6.f35499a = r4
                java.lang.Object r7 = com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel.w0(r7, r6)
                if (r7 != r0) goto L3e
                return r0
            L3e:
                com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$2$1 r7 = new com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$2$1
                com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel r4 = com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel.this
                r5 = 0
                r7.<init>(r4, r5)
                r6.f35500b = r5
                r6.f35499a = r3
                java.lang.Object r7 = com.forsale.app.utils.CoroutinesExtensionsKt.a(r1, r7, r6)
                if (r7 != r0) goto L51
                return r0
            L51:
                com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel r7 = com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel.this
                r6.f35499a = r2
                java.lang.Object r7 = com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel.K0(r7, r6)
                if (r7 != r0) goto L5c
                return r0
            L5c:
                wz.p r7 = wz.p.f75480a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
            return ((AnonymousClass2) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
        }
    }

    /* compiled from: PostAdExtraInfoViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: PostAdExtraInfoViewModel.kt */
    /* loaded from: classes2.dex */
    public interface b {
        PostAdExtraInfoViewModel a(PostAdViewModel postAdViewModel);
    }

    /* compiled from: PostAdExtraInfoViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f35515a;

        static {
            int[] iArr = new int[BusinessType.values().length];
            try {
                iArr[BusinessType.PERSONAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BusinessType.BUSINESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f35515a = iArr;
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PostAdExtraInfoViewModel f35519a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CoroutineExceptionHandler.Key key, PostAdExtraInfoViewModel postAdExtraInfoViewModel) {
            super(key);
            this.f35519a = postAdExtraInfoViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            if (!(th2 instanceof MutexIsLockedException)) {
                BuildersKt__Builders_commonKt.launch$default(r0.a(this.f35519a), null, null, new PostAdExtraInfoViewModel$handleNextButton$1$1$1(this.f35519a, th2, null), 3, null);
            } else {
                x10.a.c(th2);
            }
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PostAdExtraInfoViewModel f35520a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(CoroutineExceptionHandler.Key key, PostAdExtraInfoViewModel postAdExtraInfoViewModel) {
            super(key);
            this.f35520a = postAdExtraInfoViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            if (!(th2 instanceof MutexIsLockedException)) {
                BuildersKt__Builders_commonKt.launch$default(r0.a(this.f35520a), null, null, new PostAdExtraInfoViewModel$coroutineExceptionHandler$1$1(this.f35520a, th2, null), 3, null);
            } else {
                x10.a.c(th2);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdExtraInfoViewModel(PostAdViewModel postAdViewModel, ProhibitedKeywordsRepository prohibitedWordsRepo, we.a businessTypeInteractor, ApplicationResourcesRepository resourcesRepository, PostAdRepository postAdRepository, BaseRepository baseRepository) {
        super(baseRepository);
        h a11;
        h a12;
        BusinessType businessType;
        CategoryRuleSet.StringConfiguration description;
        o.i(postAdViewModel, "postAdViewModel");
        o.i(prohibitedWordsRepo, "prohibitedWordsRepo");
        o.i(businessTypeInteractor, "businessTypeInteractor");
        o.i(resourcesRepository, "resourcesRepository");
        o.i(postAdRepository, "postAdRepository");
        o.i(baseRepository, "baseRepository");
        this.f35484l0 = postAdViewModel;
        this.f35485m0 = prohibitedWordsRepo;
        this.f35486n0 = businessTypeInteractor;
        this.f35487o0 = resourcesRepository;
        this.f35488p0 = postAdRepository;
        boolean z11 = false;
        MutableSharedFlow<Pair<String, Boolean>> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f35489q0 = MutableSharedFlow$default;
        this.f35490r0 = FlowKt.asSharedFlow(MutableSharedFlow$default);
        this.f35491s0 = new b0(prohibitedWordsRepo.getProhibtedKeyWordsLiveData());
        ObservableBoolean observableBoolean = new ObservableBoolean(true);
        this.f35492t0 = observableBoolean;
        this.f35493u0 = new ObservableBoolean(false);
        MutableSharedFlow<Boolean> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f35494v0 = MutableSharedFlow$default2;
        this.f35495w0 = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        MutableStateFlow<Long> MutableStateFlow = StateFlowKt.MutableStateFlow(0L);
        this.f35496x0 = MutableStateFlow;
        this.f35497y0 = FlowKt.asStateFlow(MutableStateFlow);
        this.f35498z0 = new LinkedHashSet();
        MutableSharedFlow<Pair<String, Boolean>> MutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.A0 = MutableSharedFlow$default3;
        this.B0 = FlowKt.asSharedFlow(MutableSharedFlow$default3);
        this.C0 = new b0<>();
        this.D0 = new b0<>();
        this.E0 = new ObservableField<>();
        this.F0 = new ObservableBoolean(false);
        this.G0 = new z<>();
        this.H0 = new z<>();
        this.I0 = new b0<>();
        a11 = kotlin.d.a(new g00.a<v>() { // from class: com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$phoneNumberParser$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final v invoke() {
                String str;
                RegionEntity value;
                RegionEntity value2;
                v.a n12 = PostAdExtraInfoViewModel.this.n1();
                b0<RegionEntity> P2 = PostAdExtraInfoViewModel.this.o1().P2();
                String str2 = null;
                if (P2 != null && (value2 = P2.getValue()) != null) {
                    str = value2.getPhonePrefix();
                } else {
                    str = null;
                }
                b0<RegionEntity> P22 = PostAdExtraInfoViewModel.this.o1().P2();
                if (P22 != null && (value = P22.getValue()) != null) {
                    str2 = value.getRegionCodeEn();
                }
                return n12.a(str, str2);
            }
        });
        this.K0 = a11;
        this.L0 = 1;
        this.M0 = new z<>();
        a12 = kotlin.d.a(new g00.a<String>() { // from class: com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$userPhoneNumber$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                return PostAdExtraInfoViewModel.this.o1().b3().getValue();
            }
        });
        this.N0 = a12;
        this.P0 = new LinkedHashSet();
        MutableSharedFlow<p> MutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.Q0 = MutableSharedFlow$default4;
        this.R0 = FlowKt.asSharedFlow(MutableSharedFlow$default4);
        this.S0 = "*";
        LiveData<CategoryRuleSet.RuleSet> d22 = postAdViewModel.d2();
        this.T0 = d22;
        b0<Integer> b0Var = new b0<>();
        this.U0 = b0Var;
        Integer value = b0Var.getValue();
        if (value != null) {
            businessType = J1(value.intValue());
        } else {
            businessType = null;
        }
        this.V0 = new b0(businessType);
        this.X0 = new e(CoroutineExceptionHandler.Key, this);
        this.Y0 = new c0<BusinessType>() { // from class: com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$businessTypeObserver$1
            @Override // androidx.lifecycle.c0
            /* renamed from: a */
            public final void onChanged(BusinessType businessType2) {
                PostAdExtraInfoViewModel postAdExtraInfoViewModel = PostAdExtraInfoViewModel.this;
                BuildersKt__Builders_commonKt.launch$default(postAdExtraInfoViewModel, null, null, new PostAdExtraInfoViewModel$businessTypeObserver$1$onChanged$1(businessType2, postAdExtraInfoViewModel, null), 3, null);
            }
        };
        observableBoolean.k(true);
        if (d22 != null) {
            CategoryRuleSet.RuleSet value2 = d22.getValue();
            if (value2 != null && (description = value2.getDescription()) != null) {
                z11 = description.getEnabled();
            }
            observableBoolean.k(z11);
        }
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new AnonymousClass2(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A1(zz.a<? super wz.p> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$initHideMyNumber$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$initHideMyNumber$1 r0 = (com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$initHideMyNumber$1) r0
            int r1 = r0.f35540d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35540d = r1
            goto L18
        L13:
            com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$initHideMyNumber$1 r0 = new com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$initHideMyNumber$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f35538b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f35540d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f35537a
            com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel r0 = (com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel) r0
            kotlin.f.b(r5)
            goto L68
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.f.b(r5)
            com.forsale.app.features.postad.PostAdViewModel r5 = r4.f35484l0
            boolean r5 = r5.q3()
            if (r5 == 0) goto L5a
            com.forsale.app.features.postad.PostAdViewModel r5 = r4.f35484l0
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity r5 = r5.n2()
            if (r5 == 0) goto L57
            java.lang.Integer r5 = r5.getHideMyNumber()
            if (r5 == 0) goto L57
            int r5 = r5.intValue()
            boolean r5 = com.forsale.app.utils.TypeExtensionsKt.h0(r5)
            goto L58
        L57:
            r5 = 0
        L58:
            r0 = r4
            goto L6e
        L5a:
            com.forsale.app.features.postad.PostAdViewModel r5 = r4.f35484l0
            r0.f35537a = r4
            r0.f35540d = r3
            java.lang.Object r5 = r5.i2(r0)
            if (r5 != r1) goto L67
            return r1
        L67:
            r0 = r4
        L68:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
        L6e:
            androidx.databinding.ObservableBoolean r0 = r0.f35493u0
            r0.k(r5)
            wz.p r5 = wz.p.f75480a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel.A1(zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean D1(String str) {
        String str2;
        String value;
        StateFlow<String> b32 = this.f35484l0.b3();
        if (b32 != null && (value = b32.getValue()) != null) {
            str2 = StringsKt__StringsKt.r0(value, "965");
        } else {
            str2 = null;
        }
        return o.d(PhoneDetectorKt.i(str), str2);
    }

    private final Boolean F1() {
        CategoryRuleSet.StringConfiguration description;
        if (this.f35492t0.j()) {
            CategoryRuleSet.RuleSet value = this.T0.getValue();
            boolean z11 = false;
            if (value != null && (description = value.getDescription()) != null && description.getRequired()) {
                z11 = true;
            }
            if (z11) {
                ListingDetailsEntity n22 = this.f35484l0.n2();
                if (E1((n22 == null || (r0 = n22.getDescription()) == null) ? "" : "") != null) {
                    BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new PostAdExtraInfoViewModel$isValidRequiredFields$1(this, null), 3, null);
                    return Boolean.FALSE;
                }
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G1(Set<String> set) {
        for (String str : set) {
            W0(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H1(boolean z11) {
        boolean z12;
        S1();
        if (this.f35498z0.size() > this.L0) {
            z12 = true;
        } else {
            z12 = false;
        }
        V1(z12);
        if (z11) {
            T1(this.O0);
            return;
        }
        Set<String> set = this.O0;
        if (set != null) {
            for (String str : set) {
                W0(str);
            }
        }
    }

    private final int I1(BusinessType businessType) {
        int i11 = c.f35515a[businessType.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return t9.r0.N6;
            }
            throw new NoWhenBranchMatchedException();
        }
        return t9.r0.O6;
    }

    private final BusinessType J1(int i11) {
        if (i11 == t9.r0.O6) {
            return BusinessType.PERSONAL;
        }
        if (i11 == t9.r0.N6) {
            return BusinessType.BUSINESS;
        }
        String h11 = s.b(BusinessType.class).h();
        throw new IllegalArgumentException("Can find a corresponding value of " + i11 + " in " + h11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K1() {
        this.f35484l0.I4();
        this.f35484l0.N1(PostAdScreens.EXTRA_INFO_SCREEN);
    }

    private final void P1() {
        if (this.f35484l0.q3()) {
            PostAdViewModel.J3(this.f35484l0, CreateEditAdvActionType.EDIT_SETTINGS_NEXT_CLICKED, null, null, null, null, 30, null);
        } else {
            PostAdViewModel.J3(this.f35484l0, CreateEditAdvActionType.ADD_SETTINGS_NEXT_CLICKED, null, null, null, null, 30, null);
        }
    }

    private final void S1() {
        Set<String> set;
        Iterator<String> it2;
        String r02;
        boolean N;
        RegionEntity value;
        String t12 = t1();
        if (t12 != null && (set = this.O0) != null && (it2 = set.iterator()) != null) {
            while (it2.hasNext()) {
                String next = it2.next();
                b0<RegionEntity> P2 = this.f35484l0.P2();
                r02 = StringsKt__StringsKt.r0(t12, (P2 == null || (value = P2.getValue()) == null || (r3 = value.getPhonePrefix()) == null) ? "965" : "965");
                N = StringsKt__StringsKt.N(next, r02, false, 2, null);
                if (N) {
                    it2.remove();
                }
            }
        }
    }

    private final void T1(Set<String> set) {
        X0();
        if (set != null) {
            for (String str : set) {
                T0(str, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U1() {
        String str;
        boolean z11;
        ListingDetailsEntity n22;
        String contactNo;
        List E0;
        boolean v11;
        ListingDetailsEntity n23 = this.f35484l0.n2();
        Set<String> set = null;
        if (n23 != null) {
            str = n23.getContactNo();
        } else {
            str = null;
        }
        if (str != null) {
            v11 = kotlin.text.s.v(str);
            if (!v11) {
                z11 = false;
                if (!z11 && (n22 = this.f35484l0.n2()) != null && (contactNo = n22.getContactNo()) != null && E0 != null) {
                    set = CollectionsKt___CollectionsKt.b1(E0);
                }
                this.O0 = set;
            }
        }
        z11 = true;
        if (!z11) {
            E0 = StringsKt__StringsKt.E0(contactNo, new char[]{','}, false, 0, 6, null);
            set = CollectionsKt___CollectionsKt.b1(E0);
        }
        this.O0 = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V1(boolean z11) {
        this.F0.k(z11);
        this.M0.postValue(Boolean.valueOf(z11));
    }

    private final void W0(String str) {
        if (!this.F0.j()) {
            T0(str, false);
        } else {
            R1(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W1() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new PostAdExtraInfoViewModel$setMaxNumbersAllowed$1(this, null), 3, null);
    }

    private final void X0() {
        this.P0.clear();
        this.P0.addAll(this.f35498z0);
        this.D0.postValue(this.P0);
        this.f35498z0.clear();
        Y1(this.f35498z0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y0(zz.a<? super wz.p> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$findInitialBusinessType$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$findInitialBusinessType$1 r0 = (com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$findInitialBusinessType$1) r0
            int r1 = r0.f35524d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35524d = r1
            goto L18
        L13:
            com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$findInitialBusinessType$1 r0 = new com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$findInitialBusinessType$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f35522b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f35524d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f35521a
            com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel r0 = (com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel) r0
            kotlin.f.b(r5)
            goto L73
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.f.b(r5)
            com.forsale.app.features.postad.PostAdViewModel r5 = r4.f35484l0
            androidx.lifecycle.b0 r5 = r5.p2()
            java.lang.Object r5 = r5.getValue()
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity r5 = (com.forsale.app.datalayer.network.entities.ListingDetailsEntity) r5
            if (r5 == 0) goto L65
            com.forsale.app.datalayer.network.entities.ExtraInfo r5 = r5.getExtraInfo()
            if (r5 == 0) goto L65
            com.forsale.app.datalayer.network.entities.BusinessType r5 = r5.getType()
            if (r5 == 0) goto L65
            int r5 = r4.I1(r5)
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)
            androidx.lifecycle.b0<java.lang.Integer> r0 = r4.U0
            r0.postValue(r5)
            r5.intValue()
            wz.p r5 = wz.p.f75480a
            return r5
        L65:
            we.a r5 = r4.f35486n0
            r0.f35521a = r4
            r0.f35524d = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L72
            return r1
        L72:
            r0 = r4
        L73:
            com.forsale.app.datalayer.network.entities.BusinessType r5 = (com.forsale.app.datalayer.network.entities.BusinessType) r5
            int r5 = r0.I1(r5)
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)
            androidx.lifecycle.b0<java.lang.Integer> r0 = r0.U0
            r0.postValue(r5)
            r5.intValue()
            wz.p r5 = wz.p.f75480a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel.Y0(zz.a):java.lang.Object");
    }

    private final void Y1(Set<String> set) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new PostAdExtraInfoViewModel$updateCacheWith$1(this, set, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z1() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new PostAdExtraInfoViewModel$updateListingContactNumbers$1(this, null), 3, null);
    }

    private final void a2() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new PostAdExtraInfoViewModel$updateListingExtraInfo$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c1(zz.a<? super Set<String>> aVar) {
        return this.f35488p0.c(aVar);
    }

    private final String k1(String str) {
        String c11 = m1().c(str);
        if (c11 != null) {
            return c11;
        }
        return str;
    }

    private final v m1() {
        return (v) this.K0.getValue();
    }

    private final String t1() {
        return (String) this.N0.getValue();
    }

    private final void w1(ViewStates viewStates, Integer num) {
        this.W0 = num;
        v0().postValue(viewStates);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void x1(PostAdExtraInfoViewModel postAdExtraInfoViewModel, ViewStates viewStates, Integer num, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        postAdExtraInfoViewModel.w1(viewStates, num);
    }

    public final ObservableBoolean B1() {
        return this.f35492t0;
    }

    public final ObservableBoolean C1() {
        return this.f35493u0;
    }

    public final String E1(String descriptionField) {
        CategoryRuleSet.StringConfiguration stringConfiguration;
        boolean z11;
        boolean z12;
        String t02;
        o.i(descriptionField, "descriptionField");
        Set<String> prohibitedKeywordsIn = this.f35485m0.prohibitedKeywordsIn(descriptionField);
        CategoryRuleSet.RuleSet value = this.f35484l0.d2().getValue();
        if (value != null) {
            stringConfiguration = value.getDescription();
        } else {
            stringConfiguration = null;
        }
        if (stringConfiguration == null) {
            return J().getString(y0.f70433e5, new Object[0]);
        }
        if (descriptionField.length() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return J().getString(y0.f70433e5, new Object[0]);
        }
        Set<String> set = prohibitedKeywordsIn;
        if (set != null && !set.isEmpty()) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z12) {
            String string = J().getString(y0.f70416d5, new Object[0]);
            t02 = CollectionsKt___CollectionsKt.t0(prohibitedKeywordsIn, " ", null, null, 0, null, null, 62, null);
            String format = String.format(string, Arrays.copyOf(new Object[]{t02}, 1));
            o.h(format, "format(...)");
            return format;
        } else if (descriptionField.length() < value.getDescription().getMinChars()) {
            String format2 = String.format(J().getString(y0.U4, new Object[0]), Arrays.copyOf(new Object[]{Integer.valueOf(value.getDescription().getMinChars())}, 1));
            o.h(format2, "format(...)");
            return format2;
        } else if (descriptionField.length() <= value.getDescription().getMaxChars()) {
            return null;
        } else {
            String format3 = String.format(J().getString(y0.T4, new Object[0]), Arrays.copyOf(new Object[]{Integer.valueOf(value.getDescription().getMaxChars())}, 1));
            o.h(format3, "format(...)");
            return format3;
        }
    }

    public final void N1(List<String> phonesList) {
        Object m02;
        o.i(phonesList, "phonesList");
        m02 = CollectionsKt___CollectionsKt.m0(phonesList);
        String str = (String) m02;
        if (str != null) {
            BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new PostAdExtraInfoViewModel$onPhoneDetected$1$1(this, str, null), 3, null);
        }
    }

    public final void O1(String newProhWord) {
        o.i(newProhWord, "newProhWord");
        this.f35484l0.y1(newProhWord);
    }

    public final void Q1() {
        if (this.f35484l0.q3()) {
            PostAdViewModel.J3(this.f35484l0, CreateEditAdvActionType.EDIT_SETTINGS_VISITED, null, null, null, null, 30, null);
        } else {
            PostAdViewModel.J3(this.f35484l0, CreateEditAdvActionType.ADD_SETTINGS_VISITED, null, null, null, null, 30, null);
        }
    }

    public final void R1(String number) {
        boolean z11;
        o.i(number, "number");
        String k12 = k1(number);
        this.f35498z0.remove(k12);
        if (this.f35498z0.size() > this.L0) {
            z11 = true;
        } else {
            z11 = false;
        }
        V1(z11);
        p pVar = p.f75480a;
        this.C0.postValue(k12);
        Y1(this.f35498z0);
    }

    public final void T0(String number, boolean z11) {
        boolean z12;
        o.i(number, "number");
        boolean z13 = true;
        if (number.length() > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            String k12 = k1(number);
            Boolean valueOf = Boolean.valueOf(this.f35498z0.add(k12));
            if (!valueOf.booleanValue()) {
                valueOf = null;
            }
            if (valueOf != null) {
                valueOf.booleanValue();
                BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new PostAdExtraInfoViewModel$addNewNumber$1$2$1(this, k12, z11, null), 3, null);
            }
            if (this.f35498z0.size() < this.L0) {
                z13 = false;
            }
            V1(z13);
            this.G0.postValue("");
            Y1(this.f35498z0);
        }
    }

    public final void U0(boolean z11) {
        BuildersKt__BuildersKt.runBlocking$default(null, new PostAdExtraInfoViewModel$bindContactNumbers$1(this, z11, null), 1, null);
    }

    public final String V0(Throwable th2) {
        o.i(th2, "<this>");
        if (th2 instanceof ConnectivityInterceptor.ConnectivityException) {
            return J().getString(y0.X4, new Object[0]);
        }
        if (th2 instanceof ResponseWrapper.ResponseErrorException) {
            i.f54287a.invoke().f(th2);
            return ((ResponseWrapper.ResponseErrorException) th2).getLocalizedMessage();
        }
        i.f54287a.invoke().f(th2);
        return J().getString(y0.O4, new Object[0]);
    }

    public final void X1(int i11) {
        this.L0 = i11;
    }

    public final ObservableField<String> Z0() {
        return this.E0;
    }

    public final b0<Integer> b1() {
        return this.U0;
    }

    public final void b2() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new PostAdExtraInfoViewModel$updateListingHideMyNumber$1(this, null), 3, null);
    }

    public final void c2(String str) {
        p pVar;
        if (str != null) {
            if (ViewsExtensionsKt.w(str)) {
                String c11 = m1().c(str);
                if (c11 != null) {
                    if (m1().b(c11)) {
                        this.H0.postValue(Boolean.TRUE);
                        this.I0.postValue(c11);
                    } else {
                        this.H0.postValue(Boolean.FALSE);
                    }
                    pVar = p.f75480a;
                } else {
                    pVar = null;
                }
                if (pVar == null) {
                    this.H0.postValue(Boolean.FALSE);
                    return;
                }
                return;
            }
            this.H0.postValue(Boolean.FALSE);
        }
    }

    public final SharedFlow<Pair<String, Boolean>> d1() {
        return this.B0;
    }

    public final SharedFlow<Boolean> e1() {
        return this.f35495w0;
    }

    public final z<Boolean> f1() {
        return this.M0;
    }

    public final int g1() {
        return this.L0;
    }

    public final ObservableBoolean h1() {
        return this.F0;
    }

    public final z<String> i1() {
        return this.G0;
    }

    public final z<Boolean> j1() {
        return this.H0;
    }

    public final SharedFlow<Pair<String, Boolean>> l1() {
        return this.f35490r0;
    }

    public final v.a n1() {
        v.a aVar = this.J0;
        if (aVar != null) {
            return aVar;
        }
        o.w("phoneParsingFactory");
        return null;
    }

    public final PostAdViewModel o1() {
        return this.f35484l0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.viewmodels.BaseViewModel, androidx.lifecycle.q0
    public void onCleared() {
        super.onCleared();
        this.V0.removeObserver(this.Y0);
    }

    public final LiveData<List<String>> p1() {
        return this.f35491s0;
    }

    public final b0<String> q1() {
        return this.C0;
    }

    public final b0<Set<String>> r1() {
        return this.D0;
    }

    public final SharedFlow<p> s1() {
        return this.R0;
    }

    public final StateFlow<Long> u1() {
        return this.f35497y0;
    }

    public final b0<String> v1() {
        return this.I0;
    }

    public final void y1() {
        a2();
        P1();
        Boolean F1 = F1();
        if (F1 != null) {
            if (F1.booleanValue()) {
                BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getDefault().plus(new d(CoroutineExceptionHandler.Key, this)), null, new PostAdExtraInfoViewModel$handleNextButton$1$2(this, null), 2, null);
            } else {
                BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new PostAdExtraInfoViewModel$handleNextButton$1$3(this, null), 3, null);
            }
        }
    }

    public final void z1() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new PostAdExtraInfoViewModel$hideNumberClicked$1$1(this, this.f35493u0.j(), null), 3, null);
    }
}
