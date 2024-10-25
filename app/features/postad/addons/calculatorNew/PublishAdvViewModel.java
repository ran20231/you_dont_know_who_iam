package com.forsale.app.features.postad.addons.calculatorNew;

import com.forsale.app.base.ViewStates;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.datalayer.network.entities.AddonsRequested;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.entities.PostListingIntention;
import com.forsale.app.datalayer.network.responses.Addon;
import com.forsale.app.datalayer.network.responses.NewListingResponse;
import com.forsale.app.datalayer.repositories.InAppRepository;
import com.forsale.app.datalayer.repositories.MutexIsLockedException;
import com.forsale.app.datalayer.repositories.PostAdAnonymousRepository;
import com.forsale.app.features.postad.PostAdDialogs;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.e;
import com.forsale.app.features.postad.f;
import com.forsale.app.features.postad.i;
import com.forsale.app.models.CalculatorEntity;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.CreateEditAdvActionType;
import com.forsale.app.utils.analytics.KnetPaymentType;
import com.forsale.app.utils.analytics.PaymentMethod;
import com.forsale.app.utils.analytics.g;
import com.forsale.app.utils.analytics.logger.AnalyticsParamBuilder;
import com.forsale.app.utils.analytics.logger.YesNo;
import com.forsale.app.utils.analytics.logger.events.CustomParameterValue;
import com.forsale.app.utils.analytics.logger.events.PLFParameterName;
import com.github.mikephil.charting.utils.Utils;
import g00.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.collections.w;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import wz.p;
/* compiled from: PublishAdvViewModel.kt */
/* loaded from: classes2.dex */
public final class PublishAdvViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final PostAdViewModel f34595a;

    /* renamed from: b  reason: collision with root package name */
    private final g f34596b;

    /* renamed from: c  reason: collision with root package name */
    private final InAppRepository f34597c;

    /* renamed from: d  reason: collision with root package name */
    private final PostAdAnonymousRepository f34598d;

    /* renamed from: e  reason: collision with root package name */
    private final AggregatedAllAnalyticsLogger f34599e;

    /* renamed from: f  reason: collision with root package name */
    private final i f34600f;

    /* renamed from: g  reason: collision with root package name */
    private final e f34601g;

    /* renamed from: h  reason: collision with root package name */
    private final wi.a f34602h;

    /* renamed from: i  reason: collision with root package name */
    private final CoroutineScope f34603i;

    /* renamed from: j  reason: collision with root package name */
    private final MutableSharedFlow<Pair<ViewStates, Integer>> f34604j;

    /* renamed from: k  reason: collision with root package name */
    private final SharedFlow<Pair<ViewStates, Integer>> f34605k;

    /* renamed from: l  reason: collision with root package name */
    private final MutableSharedFlow<Throwable> f34606l;

    /* renamed from: m  reason: collision with root package name */
    private final SharedFlow<Throwable> f34607m;

    /* renamed from: n  reason: collision with root package name */
    private final MutableSharedFlow<String> f34608n;

    /* renamed from: o  reason: collision with root package name */
    private final SharedFlow<String> f34609o;

    /* renamed from: p  reason: collision with root package name */
    private final MutableSharedFlow<String> f34610p;

    /* renamed from: q  reason: collision with root package name */
    private final SharedFlow<String> f34611q;

    /* renamed from: r  reason: collision with root package name */
    private final MutableSharedFlow<a> f34612r;

    /* renamed from: s  reason: collision with root package name */
    private final SharedFlow<a> f34613s;

    /* renamed from: t  reason: collision with root package name */
    private final MutableSharedFlow<f> f34614t;

    /* renamed from: u  reason: collision with root package name */
    private final SharedFlow<f> f34615u;

    /* renamed from: v  reason: collision with root package name */
    private final MutableStateFlow<List<AddonsRequested>> f34616v;

    /* renamed from: w  reason: collision with root package name */
    private final MutableStateFlow<PaymentMethod> f34617w;

    /* renamed from: x  reason: collision with root package name */
    private final MutableStateFlow<PaymentMethod> f34618x;

    /* compiled from: PublishAdvViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f34619a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f34620b;

        public a(boolean z11, boolean z12) {
            this.f34619a = z11;
            this.f34620b = z12;
        }

        public final boolean a() {
            return this.f34619a;
        }

        public final boolean b() {
            return this.f34620b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f34619a == aVar.f34619a && this.f34620b == aVar.f34620b) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z11 = this.f34619a;
            int i11 = 1;
            ?? r02 = z11;
            if (z11) {
                r02 = 1;
            }
            int i12 = r02 * 31;
            boolean z12 = this.f34620b;
            if (!z12) {
                i11 = z12 ? 1 : 0;
            }
            return i12 + i11;
        }

        public String toString() {
            boolean z11 = this.f34619a;
            boolean z12 = this.f34620b;
            return "EditStatus(attemptAbuse=" + z11 + ", isSuccess=" + z12 + ")";
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PublishAdvViewModel f34621a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.Key key, PublishAdvViewModel publishAdvViewModel) {
            super(key);
            this.f34621a = publishAdvViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            BuildersKt__Builders_commonKt.launch$default(this.f34621a.f34603i, null, null, new PublishAdvViewModel$getLastKnetStatus$2$1(this.f34621a, th2, null), 3, null);
            this.f34621a.L(true);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PublishAdvViewModel f34622a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CoroutineExceptionHandler.Key key, PublishAdvViewModel publishAdvViewModel) {
            super(key);
            this.f34622a = publishAdvViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            if (th2 instanceof MutexIsLockedException) {
                x10.a.c(th2);
                return;
            }
            PublishAdvViewModel.n0(this.f34622a, PostAdDialogs.GeneralError, null, 2, null);
            this.f34622a.h0();
            BuildersKt__Builders_commonKt.launch$default(this.f34622a.f34603i, null, null, new PublishAdvViewModel$submitUploading$1$1(this.f34622a, th2, null), 3, null);
            this.f34622a.L(true);
        }
    }

    public PublishAdvViewModel(PostAdViewModel postAdViewModel, g aggregatedAnalyticsLogger, InAppRepository inAppRepository, PostAdAnonymousRepository postAdAnonymousRepository, AggregatedAllAnalyticsLogger analyticsLogger, i publishAdvInteractors, e paymentMethodInteractors, wi.a analyticsCustomLogger, CoroutineScope coroutineScope) {
        List n11;
        o.i(postAdViewModel, "postAdViewModel");
        o.i(aggregatedAnalyticsLogger, "aggregatedAnalyticsLogger");
        o.i(inAppRepository, "inAppRepository");
        o.i(postAdAnonymousRepository, "postAdAnonymousRepository");
        o.i(analyticsLogger, "analyticsLogger");
        o.i(publishAdvInteractors, "publishAdvInteractors");
        o.i(paymentMethodInteractors, "paymentMethodInteractors");
        o.i(analyticsCustomLogger, "analyticsCustomLogger");
        o.i(coroutineScope, "coroutineScope");
        this.f34595a = postAdViewModel;
        this.f34596b = aggregatedAnalyticsLogger;
        this.f34597c = inAppRepository;
        this.f34598d = postAdAnonymousRepository;
        this.f34599e = analyticsLogger;
        this.f34600f = publishAdvInteractors;
        this.f34601g = paymentMethodInteractors;
        this.f34602h = analyticsCustomLogger;
        this.f34603i = coroutineScope;
        MutableSharedFlow<Pair<ViewStates, Integer>> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f34604j = MutableSharedFlow$default;
        this.f34605k = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableSharedFlow<Throwable> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f34606l = MutableSharedFlow$default2;
        this.f34607m = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        MutableSharedFlow<String> MutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f34608n = MutableSharedFlow$default3;
        this.f34609o = FlowKt.asSharedFlow(MutableSharedFlow$default3);
        MutableSharedFlow<String> MutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f34610p = MutableSharedFlow$default4;
        this.f34611q = FlowKt.asSharedFlow(MutableSharedFlow$default4);
        MutableSharedFlow<a> MutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f34612r = MutableSharedFlow$default5;
        this.f34613s = FlowKt.asSharedFlow(MutableSharedFlow$default5);
        MutableSharedFlow<f> MutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f34614t = MutableSharedFlow$default6;
        this.f34615u = FlowKt.asSharedFlow(MutableSharedFlow$default6);
        n11 = r.n();
        this.f34616v = StateFlowKt.MutableStateFlow(n11);
        this.f34617w = StateFlowKt.MutableStateFlow(null);
        this.f34618x = StateFlowKt.MutableStateFlow(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r8 == true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(com.forsale.app.datalayer.network.responses.NewListingResponse r8) {
        /*
            r7 = this;
            java.util.List r0 = r8.getAddonsApproved()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L47
            java.util.List r8 = r8.getAddonsApproved()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L18:
            boolean r0 = r8.hasNext()
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L31
            java.lang.Object r0 = r8.next()
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "promoted_posts"
            r6 = 2
            boolean r2 = kotlin.text.k.N(r4, r5, r3, r6, r2)
            if (r2 == 0) goto L18
            r2 = r0
        L31:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L41
            int r8 = r2.length()
            if (r8 <= 0) goto L3d
            r8 = r1
            goto L3e
        L3d:
            r8 = r3
        L3e:
            if (r8 != r1) goto L41
            goto L42
        L41:
            r1 = r3
        L42:
            if (r1 == 0) goto L47
            r7.Q()
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel.I(com.forsale.app.datalayer.network.responses.NewListingResponse):void");
    }

    private final void J(ListingDetailsEntity listingDetailsEntity) {
        if (listingDetailsEntity != null) {
            listingDetailsEntity.setVideoUrl(null);
            listingDetailsEntity.setVideoFileName(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K() {
        if (this.f34595a.y3()) {
            J(this.f34595a.n2());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(boolean z11) {
        this.f34595a.I1(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(boolean z11) {
        this.f34595a.K1(z11);
    }

    private final void Q() {
        this.f34597c.getInAppMessages();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double S() {
        return this.f34595a.q2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X() {
        x10.a.b("AAA: listingUploadedOrEditedSuccessfully", new Object[0]);
        if (this.f34595a.k2() == PostListingIntention.NEW_LISTING) {
            boolean y32 = this.f34595a.y3();
            x10.a.b("AAA: isVideoFailed() " + y32, new Object[0]);
            if (this.f34595a.H4()) {
                n0(this, PostAdDialogs.UploadWaitingApproval, null, 2, null);
                return;
            } else if (this.f34595a.y3()) {
                n0(this, PostAdDialogs.UploadMediaFailed, null, 2, null);
                return;
            } else {
                n0(this, PostAdDialogs.UploadSuccess, null, 2, null);
                return;
            }
        }
        N(true);
    }

    private final void Y() {
        BuildersKt__Builders_commonKt.launch$default(this.f34603i, null, null, new PublishAdvViewModel$logAddListingSucceededEvent$1(this, null), 3, null);
    }

    private final void Z(CreateEditAdvActionType createEditAdvActionType, String str, boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(this.f34603i, null, null, new PublishAdvViewModel$logAnalytics$1(this, createEditAdvActionType, str, z11, null), 3, null);
    }

    static /* synthetic */ void a0(PublishAdvViewModel publishAdvViewModel, CreateEditAdvActionType createEditAdvActionType, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        publishAdvViewModel.Z(createEditAdvActionType, str, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b0(zz.a<? super wz.p> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel$logPostAdAnonymousAnalytics$1
            if (r0 == 0) goto L13
            r0 = r11
            com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel$logPostAdAnonymousAnalytics$1 r0 = (com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel$logPostAdAnonymousAnalytics$1) r0
            int r1 = r0.f34658d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34658d = r1
            goto L18
        L13:
            com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel$logPostAdAnonymousAnalytics$1 r0 = new com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel$logPostAdAnonymousAnalytics$1
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f34656b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f34658d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r11)
            goto L6e
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L34:
            java.lang.Object r2 = r0.f34655a
            com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel r2 = (com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel) r2
            kotlin.f.b(r11)
            goto L4d
        L3c:
            kotlin.f.b(r11)
            com.forsale.app.datalayer.repositories.PostAdAnonymousRepository r11 = r10.f34598d
            r0.f34655a = r10
            r0.f34658d = r4
            java.lang.Object r11 = r11.getPostAddAnonymous(r0)
            if (r11 != r1) goto L4c
            return r1
        L4c:
            r2 = r10
        L4d:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L71
            com.forsale.app.utils.analytics.CreateEditAdvActionType r5 = com.forsale.app.utils.analytics.CreateEditAdvActionType.CREATE_ADV_REGISTRATION_CONVERTED
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r2
            a0(r4, r5, r6, r7, r8, r9)
            com.forsale.app.datalayer.repositories.PostAdAnonymousRepository r11 = r2.f34598d
            r2 = 0
            r0.f34655a = r2
            r0.f34658d = r3
            r2 = 0
            java.lang.Object r11 = r11.setPostAddAnonymous(r2, r0)
            if (r11 != r1) goto L6e
            return r1
        L6e:
            wz.p r11 = wz.p.f75480a
            return r11
        L71:
            wz.p r11 = wz.p.f75480a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel.b0(zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(wi.c cVar, final UserEntity userEntity, final ListingDetailsEntity listingDetailsEntity) {
        Integer userId;
        this.f34602h.a(new wi.c[]{cVar}, new l<AnalyticsParamBuilder, p>() { // from class: com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel$logUploadNewAndEditListingStarted$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(AnalyticsParamBuilder log) {
                PostAdViewModel postAdViewModel;
                double d11;
                double S;
                AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger;
                PostAdViewModel postAdViewModel2;
                String fullPathReversed;
                String phone;
                int y11;
                int y12;
                o.i(log, "$this$log");
                postAdViewModel = PublishAdvViewModel.this.f34595a;
                CalculatorEntity value = postAdViewModel.a2().getValue();
                if (value != null) {
                    List<Addon> c11 = value.c();
                    y11 = s.y(c11, 10);
                    ArrayList arrayList = new ArrayList(y11);
                    for (Addon addon : c11) {
                        arrayList.add(addon.getId());
                    }
                    log.f(PLFParameterName.ADD_ONS_IDS, arrayList);
                    List<Addon> c12 = value.c();
                    y12 = s.y(c12, 10);
                    ArrayList arrayList2 = new ArrayList(y12);
                    for (Addon addon2 : c12) {
                        arrayList2.add(addon2.getName());
                    }
                    log.f(PLFParameterName.ADD_ONS_NAMES, arrayList2);
                }
                CategoryEntity category = listingDetailsEntity.getCategory();
                if (category != null) {
                    log.e(PLFParameterName.CATEGORY_NAME, category.getSystemName());
                    log.d(PLFParameterName.CATEGORY_ID, category.getId());
                }
                log.e(PLFParameterName.HIDE_MY_NUMBER, YesNo.Companion.a(listingDetailsEntity.getHideMyNumber()));
                log.e(PLFParameterName.DEVICE_ID, listingDetailsEntity.getDeviceId());
                PLFParameterName pLFParameterName = PLFParameterName.LISTING_PRICE;
                Double price = listingDetailsEntity.getPrice();
                if (price != null) {
                    d11 = price.doubleValue();
                } else {
                    d11 = Utils.DOUBLE_EPSILON;
                }
                log.c(pLFParameterName, d11);
                log.e(PLFParameterName.PLATFORM, CustomParameterValue.ANDROID.getValue());
                UserEntity userEntity2 = userEntity;
                if (userEntity2 != null && (phone = userEntity2.getPhone()) != null) {
                    log.e(PLFParameterName.PHONE_NUMBER, phone);
                }
                PLFParameterName pLFParameterName2 = PLFParameterName.TOTAL_LISTING_PRICE;
                S = PublishAdvViewModel.this.S();
                log.c(pLFParameterName2, S);
                aggregatedAllAnalyticsLogger = PublishAdvViewModel.this.f34599e;
                String l11 = aggregatedAllAnalyticsLogger.o().l();
                if (l11 != null) {
                    log.e(PLFParameterName.AMPLITUDE_USER_ID, l11);
                }
                postAdViewModel2 = PublishAdvViewModel.this.f34595a;
                DistrictEntity value2 = postAdViewModel2.m2().getValue();
                if (value2 != null && (fullPathReversed = value2.getFullPathReversed()) != null) {
                    log.e(PLFParameterName.LOCATION_NAME, fullPathReversed);
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(AnalyticsParamBuilder analyticsParamBuilder) {
                b(analyticsParamBuilder);
                return p.f75480a;
            }
        });
        if (userEntity != null && (userId = userEntity.getUserId()) != null) {
            this.f34602h.b(String.valueOf(userId.intValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Addon> d0() {
        List<Addon> list;
        boolean z11;
        Collection n11;
        boolean z12;
        CalculatorEntity value;
        List<AddonsRequested> value2 = this.f34616v.getValue();
        if (value2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (AddonsRequested addonsRequested : value2) {
            StateFlow<CalculatorEntity> a22 = this.f34595a.a2();
            if (a22 != null && (value = a22.getValue()) != null) {
                list = value.c();
            } else {
                list = null;
            }
            List<Addon> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!(!z11)) {
                list = null;
            }
            if (list == null) {
                n11 = r.n();
            } else {
                n11 = new ArrayList();
                for (Object obj : list) {
                    Addon addon = (Addon) obj;
                    if (o.d(addonsRequested.getAddon(), addon.getId()) && addonsRequested.getCatId() == addon.getCatId() && addonsRequested.getDistrictId() == addon.getDistrictId()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        n11.add(obj);
                    }
                }
            }
            w.D(arrayList, n11);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0() {
        this.f34595a.E1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0() {
        if (this.f34595a.q3()) {
            a0(this, CreateEditAdvActionType.EDIT_LISTING_PAYMENT_VISITED, null, false, 6, null);
        } else {
            a0(this, CreateEditAdvActionType.ADD_LISTING_PAYMENT_VISITED, null, false, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0(List<AddonsRequested> list) {
        boolean z11;
        CalculatorEntity value = this.f34595a.a2().getValue();
        boolean z12 = false;
        if (value != null && value.i()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            this.f34596b.g(S(), KnetPaymentType.LISTING);
        } else if (!z11) {
            this.f34596b.d(S(), KnetPaymentType.LISTING);
        }
        g gVar = this.f34596b;
        KnetPaymentType knetPaymentType = KnetPaymentType.LISTING;
        double S = S();
        List<AddonsRequested> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z12 = true;
        }
        gVar.a(knetPaymentType, S, !z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0() {
        if (this.f34595a.q3()) {
            a0(this, CreateEditAdvActionType.EDIT_LISTING_FAILED, null, false, 6, null);
        } else {
            a0(this, CreateEditAdvActionType.UPLOAD_NEW_LISTING_FAILED, null, false, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0() {
        CalculatorEntity value = this.f34595a.a2().getValue();
        if (value != null) {
            if (value.j()) {
                if (this.f34595a.q3()) {
                    a0(this, CreateEditAdvActionType.EDIT_FREE_LISTING_STARTED, null, false, 6, null);
                } else {
                    a0(this, CreateEditAdvActionType.UPLOAD_NEW_FREE_LISTING_STARTED, null, true, 2, null);
                }
            } else if (value.s()) {
                if (this.f34595a.q3()) {
                    a0(this, CreateEditAdvActionType.EDIT_PAID_LISTING_STARTED, null, false, 6, null);
                } else {
                    a0(this, CreateEditAdvActionType.UPLOAD_NEW_PAID_LISTING_STARTED, null, true, 2, null);
                }
            } else if (this.f34595a.q3()) {
                a0(this, CreateEditAdvActionType.EDIT_LISTING_PENDING_PAY, null, false, 6, null);
            } else {
                a0(this, CreateEditAdvActionType.UPLOAD_NEW_LISTING_PENDING_PAY, null, false, 6, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0() {
        CalculatorEntity value = this.f34595a.a2().getValue();
        if (value != null) {
            if (value.j()) {
                if (this.f34595a.q3()) {
                    a0(this, CreateEditAdvActionType.EDIT_FREE_LISTING_SUCCEEDED, null, false, 6, null);
                } else {
                    Y();
                }
            } else if (this.f34595a.q3()) {
                a0(this, CreateEditAdvActionType.EDIT_PAID_LISTING_SUCCEEDED, null, false, 6, null);
            } else {
                Y();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0() {
        BuildersKt__Builders_commonKt.launch$default(this.f34603i, null, null, new PublishAdvViewModel$savePaymentMethod$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0() {
        ListingDetailsEntity n22 = this.f34595a.n2();
        if (n22 != null) {
            Integer draft = n22.getDraft();
            if (draft != null && draft.intValue() == 0) {
                if (this.f34595a.q3()) {
                    n0(this, PostAdDialogs.NotEnoughCreditForAddonsEdit, null, 2, null);
                    return;
                } else {
                    n0(this, PostAdDialogs.NotEnoughCreditForAddons, null, 2, null);
                    return;
                }
            }
            n0(this, PostAdDialogs.NotEnoughCreditNew, null, 2, null);
        }
    }

    private final void m0(PostAdDialogs postAdDialogs, String str) {
        BuildersKt__Builders_commonKt.launch$default(this.f34603i, null, null, new PublishAdvViewModel$showPostDialogue$1(this, postAdDialogs, null), 3, null);
    }

    static /* synthetic */ void n0(PublishAdvViewModel publishAdvViewModel, PostAdDialogs postAdDialogs, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        publishAdvViewModel.m0(postAdDialogs, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0(NewListingResponse newListingResponse) {
        q0(newListingResponse);
        this.f34595a.M4(new PublishAdvViewModel$updateListingAfterUpload$1(newListingResponse, null));
    }

    private final void q0(NewListingResponse newListingResponse) {
        ListingDetailsEntity n22 = this.f34595a.n2();
        if (n22 != null) {
            n22.setApprovedAddons(newListingResponse.getAddonsApproved());
            List<String> addonsApproved = newListingResponse.getAddonsApproved();
            List<String> approvedAddons = n22.getApprovedAddons();
            x10.a.b("UPLOAD_MEDIA: ApprovedAddons:: " + addonsApproved + " " + approvedAddons, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r0(zz.a<? super p> aVar) {
        Object f11;
        M(false);
        Object D1 = PostAdViewModel.D1(this.f34595a, null, new PublishAdvViewModel$uploadListing$2(this, null), aVar, 1, null);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (D1 == f11) {
            return D1;
        }
        return p.f75480a;
    }

    public final void N(boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(this.f34603i, null, null, new PublishAdvViewModel$finishEditing$1(this, z11, null), 3, null);
    }

    public final SharedFlow<a> O() {
        return this.f34613s;
    }

    public final SharedFlow<Pair<ViewStates, Integer>> P() {
        return this.f34605k;
    }

    public final void R() {
        double S = S();
        BuildersKt__Builders_commonKt.launch$default(this.f34603i, null, null, new PublishAdvViewModel$getLastKnetStatus$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(this.f34603i, new b(CoroutineExceptionHandler.Key, this), null, new PublishAdvViewModel$getLastKnetStatus$3(this, S, null), 2, null);
    }

    public final SharedFlow<Throwable> T() {
        return this.f34607m;
    }

    public final SharedFlow<f> U() {
        return this.f34615u;
    }

    public final SharedFlow<String> V() {
        return this.f34611q;
    }

    public final SharedFlow<String> W() {
        return this.f34609o;
    }

    public final void o0(boolean z11) {
        if (z11) {
            this.f34595a.Q3();
        }
        if (!this.f34595a.v3()) {
            BuildersKt__Builders_commonKt.launch$default(this.f34603i, new c(CoroutineExceptionHandler.Key, this), null, new PublishAdvViewModel$submitUploading$2(this, null), 2, null);
        }
    }
}
