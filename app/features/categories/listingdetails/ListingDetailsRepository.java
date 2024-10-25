package com.forsale.app.features.categories.listingdetails;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus;
import com.forsale.app.datalayer.network.services.ListingsService;
import com.forsale.app.datalayer.network.services.RecommendService;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.datalayer.repositories.GAMRepository;
import com.forsale.app.datalayer.repositories.LocationRepository;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.datalayer.repositories.TranslationRepository;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper;
import com.forsale.app.utils.DynamicLinksUtils;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import g00.l;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import t9.y0;
import wz.p;
/* compiled from: ListingDetailsRepository.kt */
/* loaded from: classes2.dex */
public final class ListingDetailsRepository {
    private final Flow<Boolean> A;
    private final b0<ListingItemDetails> B;
    private final LiveData<ListingItemDetails> C;
    private final b0<xb.a> D;
    private final LiveData<xb.a> E;
    private final b0<List<AttributesMapper.AttributesDataModel>> F;
    private final LiveData<List<AttributesMapper.AttributesDataModel>> G;
    private final b0<TranslationRepository.Translation> H;
    private final LiveData<TranslationRepository.Translation> I;
    private final b0<String> J;
    private final LiveData<String> K;
    private final b0<String> L;
    private final LiveData<String> M;
    private final b0<List<ListingItemBrief>> N;
    private final LiveData<List<ListingItemBrief>> O;

    /* renamed from: a  reason: collision with root package name */
    private final int f25173a;

    /* renamed from: b  reason: collision with root package name */
    private final String f25174b;

    /* renamed from: c  reason: collision with root package name */
    private final ListingItemBrief f25175c;

    /* renamed from: d  reason: collision with root package name */
    private final LifecycleCoroutineScope f25176d;

    /* renamed from: e  reason: collision with root package name */
    private final jj.b f25177e;

    /* renamed from: f  reason: collision with root package name */
    private final ListingsService f25178f;

    /* renamed from: g  reason: collision with root package name */
    private final RecommendService f25179g;

    /* renamed from: h  reason: collision with root package name */
    private final RegionsRepository f25180h;

    /* renamed from: i  reason: collision with root package name */
    private final TranslationRepository f25181i;

    /* renamed from: j  reason: collision with root package name */
    private final CategoriesRepositories f25182j;

    /* renamed from: k  reason: collision with root package name */
    private final DistrictsRepository f25183k;

    /* renamed from: l  reason: collision with root package name */
    private final LocationRepository f25184l;

    /* renamed from: m  reason: collision with root package name */
    private final AggregatedAllAnalyticsLogger f25185m;

    /* renamed from: n  reason: collision with root package name */
    private final com.forsale.app.utils.analytics.g f25186n;

    /* renamed from: o  reason: collision with root package name */
    private final GAMRepository f25187o;

    /* renamed from: p  reason: collision with root package name */
    private final ApplicationResourcesRepository f25188p;

    /* renamed from: q  reason: collision with root package name */
    private final UserProfileInteractor f25189q;

    /* renamed from: r  reason: collision with root package name */
    private final DynamicLinksUtils f25190r;

    /* renamed from: s  reason: collision with root package name */
    private final fj.b f25191s;

    /* renamed from: t  reason: collision with root package name */
    public AttributesMapper.a f25192t;

    /* renamed from: u  reason: collision with root package name */
    private final b0<List<DistrictEntity>> f25193u;

    /* renamed from: v  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f25194v;

    /* renamed from: w  reason: collision with root package name */
    private final StateFlow<Boolean> f25195w;

    /* renamed from: x  reason: collision with root package name */
    private final Flow<UserEntity> f25196x;

    /* renamed from: y  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f25197y;

    /* renamed from: z  reason: collision with root package name */
    private final StateFlow<Boolean> f25198z;

    /* compiled from: ListingDetailsRepository.kt */
    /* loaded from: classes2.dex */
    public interface a {
        ListingDetailsRepository a(int i11, String str, ListingItemBrief listingItemBrief, LifecycleCoroutineScope lifecycleCoroutineScope);
    }

    /* compiled from: ListingDetailsRepository.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25206a;

        static {
            int[] iArr = new int[AggregatedAllAnalyticsLogger.AdvActionEvents.values().length];
            try {
                iArr[AggregatedAllAnalyticsLogger.AdvActionEvents.LISTING_DETAILS_VISITED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AggregatedAllAnalyticsLogger.AdvActionEvents.MY_LISTING_DETAILS_VISITED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f25206a = iArr;
        }
    }

    /* compiled from: ListingDetailsRepository.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.google.gson.reflect.a<List<? extends xb.a>> {
        c() {
        }
    }

    public ListingDetailsRepository(int i11, String str, ListingItemBrief listingItemBrief, LifecycleCoroutineScope coroutineScope, jj.b prefs, ListingsService listingsService, RecommendService recommendService, RegionsRepository regionsRepository, TranslationRepository translationRepository, CategoriesRepositories categoriesRepositories, DistrictsRepository districtsRepositories, LocationRepository locationRepository, AggregatedAllAnalyticsLogger analyticsLogger, com.forsale.app.utils.analytics.g aggregatedAnalyticsLogger, GAMRepository gamRepository, ApplicationResourcesRepository appRepo, UserProfileInteractor userProfileInteractor, DynamicLinksUtils dynamicLinksUtils, fj.b gamUtils) {
        o.i(coroutineScope, "coroutineScope");
        o.i(prefs, "prefs");
        o.i(listingsService, "listingsService");
        o.i(recommendService, "recommendService");
        o.i(regionsRepository, "regionsRepository");
        o.i(translationRepository, "translationRepository");
        o.i(categoriesRepositories, "categoriesRepositories");
        o.i(districtsRepositories, "districtsRepositories");
        o.i(locationRepository, "locationRepository");
        o.i(analyticsLogger, "analyticsLogger");
        o.i(aggregatedAnalyticsLogger, "aggregatedAnalyticsLogger");
        o.i(gamRepository, "gamRepository");
        o.i(appRepo, "appRepo");
        o.i(userProfileInteractor, "userProfileInteractor");
        o.i(dynamicLinksUtils, "dynamicLinksUtils");
        o.i(gamUtils, "gamUtils");
        this.f25173a = i11;
        this.f25174b = str;
        this.f25175c = listingItemBrief;
        this.f25176d = coroutineScope;
        this.f25177e = prefs;
        this.f25178f = listingsService;
        this.f25179g = recommendService;
        this.f25180h = regionsRepository;
        this.f25181i = translationRepository;
        this.f25182j = categoriesRepositories;
        this.f25183k = districtsRepositories;
        this.f25184l = locationRepository;
        this.f25185m = analyticsLogger;
        this.f25186n = aggregatedAnalyticsLogger;
        this.f25187o = gamRepository;
        this.f25188p = appRepo;
        this.f25189q = userProfileInteractor;
        this.f25190r = dynamicLinksUtils;
        this.f25191s = gamUtils;
        this.f25193u = new b0<>();
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f25194v = MutableStateFlow;
        this.f25195w = FlowKt.asStateFlow(MutableStateFlow);
        this.f25196x = userProfileInteractor.j();
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.f25197y = MutableStateFlow2;
        final StateFlow<Boolean> asStateFlow = FlowKt.asStateFlow(MutableStateFlow2);
        this.f25198z = asStateFlow;
        this.A = new Flow<Boolean>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ FlowCollector f25201a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ ListingDetailsRepository f25202b;

                /* compiled from: Emitters.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$special$$inlined$map$1$2", f = "ListingDetailsRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a  reason: collision with root package name */
                    /* synthetic */ Object f25203a;

                    /* renamed from: b  reason: collision with root package name */
                    int f25204b;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f25203a = obj;
                        this.f25204b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, ListingDetailsRepository listingDetailsRepository) {
                    this.f25201a = flowCollector;
                    this.f25202b = listingDetailsRepository;
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
                        boolean r0 = r6 instanceof com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$special$$inlined$map$1$2$1 r0 = (com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f25204b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f25204b = r1
                        goto L18
                    L13:
                        com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$special$$inlined$map$1$2$1 r0 = new com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f25203a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.f25204b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L5b
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f25201a
                        java.lang.Boolean r5 = (java.lang.Boolean) r5
                        java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.a.a(r3)
                        boolean r5 = kotlin.jvm.internal.o.d(r5, r2)
                        if (r5 != 0) goto L4d
                        com.forsale.app.features.categories.listingdetails.ListingDetailsRepository r5 = r4.f25202b
                        com.forsale.app.datalayer.network.responses.ListingItemBrief r5 = r5.z()
                        if (r5 != 0) goto L4b
                        goto L4d
                    L4b:
                        r5 = 0
                        goto L4e
                    L4d:
                        r5 = r3
                    L4e:
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
                        r0.f25204b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L5b
                        return r1
                    L5b:
                        wz.p r5 = wz.p.f75480a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
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
                return p.f75480a;
            }
        };
        N();
        b0<ListingItemDetails> b0Var = new b0<>();
        this.B = b0Var;
        this.C = b0Var;
        b0<xb.a> b0Var2 = new b0<>();
        this.D = b0Var2;
        this.E = b0Var2;
        b0<List<AttributesMapper.AttributesDataModel>> b0Var3 = new b0<>();
        this.F = b0Var3;
        this.G = b0Var3;
        b0<TranslationRepository.Translation> b0Var4 = new b0<>();
        b0Var4.setValue(TranslationRepository.Translation.ORIGINAL);
        this.H = b0Var4;
        this.I = b0Var4;
        b0<String> b0Var5 = new b0<>();
        this.J = b0Var5;
        this.K = b0Var5;
        b0<String> b0Var6 = new b0<>();
        this.L = b0Var6;
        this.M = b0Var6;
        b0<List<ListingItemBrief>> b0Var7 = new b0<>();
        this.N = b0Var7;
        this.O = b0Var7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShareText F(ListingItemDetails listingItemDetails, String str) {
        StringBuilder sb2 = new StringBuilder();
        String string = this.f25188p.getString(y0.f70386b9, new Object[0]);
        String string2 = this.f25188p.getString(y0.T, new Object[0]);
        sb2.append(string + " " + string2);
        o.h(sb2, "append(...)");
        sb2.append('\n');
        o.h(sb2, "append(...)");
        String string3 = this.f25188p.getString(y0.f70403c9, new Object[0]);
        String title = listingItemDetails.getTitle();
        sb2.append(string3 + " " + title);
        o.h(sb2, "append(...)");
        sb2.append('\n');
        o.h(sb2, "append(...)");
        String string4 = this.f25188p.getString(y0.f70369a9, new Object[0]);
        String desc = listingItemDetails.getDesc();
        sb2.append(string4 + " " + desc);
        o.h(sb2, "append(...)");
        sb2.append('\n');
        o.h(sb2, "append(...)");
        String string5 = this.f25188p.getString(y0.f70420d9, new Object[0]);
        sb2.append(string5 + " " + str);
        o.h(sb2, "append(...)");
        sb2.append('\n');
        o.h(sb2, "append(...)");
        String title2 = listingItemDetails.getTitle();
        String sb3 = sb2.toString();
        o.h(sb3, "toString(...)");
        return new ShareText(str, title2, sb3, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(java.util.List<com.forsale.app.datalayer.network.entities.ExtraAttr> r7, zz.a<? super wz.p> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$initAttributes$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$initAttributes$1 r0 = (com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$initAttributes$1) r0
            int r1 = r0.f25234d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25234d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$initAttributes$1 r0 = new com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$initAttributes$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f25232b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25234d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            kotlin.f.b(r8)
            goto L92
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            java.lang.Object r7 = r0.f25231a
            com.forsale.app.features.categories.listingdetails.ListingDetailsRepository r7 = (com.forsale.app.features.categories.listingdetails.ListingDetailsRepository) r7
            kotlin.f.b(r8)
            goto L69
        L3e:
            kotlin.f.b(r8)
            r8 = r7
            java.util.Collection r8 = (java.util.Collection) r8
            if (r8 == 0) goto L4f
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L4d
            goto L4f
        L4d:
            r8 = r3
            goto L50
        L4f:
            r8 = r5
        L50:
            if (r8 == 0) goto L55
            wz.p r7 = wz.p.f75480a
            return r7
        L55:
            com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper$a r8 = r6.t()
            com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper r7 = r8.a(r7)
            r0.f25231a = r6
            r0.f25234d = r5
            java.lang.Object r8 = r7.b(r0)
            if (r8 != r1) goto L68
            return r1
        L68:
            r7 = r6
        L69:
            r2 = r8
            java.util.List r2 = (java.util.List) r2
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L76
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L77
        L76:
            r3 = r5
        L77:
            r2 = r3 ^ 1
            r3 = 0
            if (r2 == 0) goto L7d
            goto L7e
        L7d:
            r8 = r3
        L7e:
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L95
            com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$initAttributes$3 r2 = new com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$initAttributes$3
            r2.<init>(r7, r3)
            r0.f25231a = r3
            r0.f25234d = r4
            java.lang.Object r7 = com.forsale.app.utils.CoroutinesExtensionsKt.a(r8, r2, r0)
            if (r7 != r1) goto L92
            return r1
        L92:
            wz.p r7 = wz.p.f75480a
            return r7
        L95:
            wz.p r7 = wz.p.f75480a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.ListingDetailsRepository.J(java.util.List, zz.a):java.lang.Object");
    }

    private final void K(TranslationRepository.Translation translation) {
        String desc;
        String str;
        String title;
        String str2;
        ListingItemDetails value = this.C.getValue();
        if (value != null && (title = value.getTitle()) != null) {
            b0<String> b0Var = this.J;
            ListingItemDetails value2 = this.C.getValue();
            if (value2 == null || (str2 = value2.getTranslationTitle()) == null) {
                str2 = title;
            }
            b0Var.setValue(c0(translation, title, str2));
        }
        ListingItemDetails value3 = this.C.getValue();
        if (value3 != null && (desc = value3.getDesc()) != null) {
            b0<String> b0Var2 = this.L;
            ListingItemDetails value4 = this.C.getValue();
            if (value4 == null || (str = value4.getTranslationDesc()) == null) {
                str = desc;
            }
            b0Var2.setValue(c0(translation, desc, str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(java.lang.String r5, zz.a<? super wz.p> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$initTranslation$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$initTranslation$1 r0 = (com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$initTranslation$1) r0
            int r1 = r0.f25242e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25242e = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$initTranslation$1 r0 = new com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$initTranslation$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f25240c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25242e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.f25239b
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r0.f25238a
            com.forsale.app.features.categories.listingdetails.ListingDetailsRepository r0 = (com.forsale.app.features.categories.listingdetails.ListingDetailsRepository) r0
            kotlin.f.b(r6)
            goto L4c
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.f.b(r6)
            com.forsale.app.datalayer.repositories.TranslationRepository r6 = r4.f25181i
            r0.f25238a = r4
            r0.f25239b = r5
            r0.f25242e = r3
            java.lang.Object r6 = r6.getCurrentTranslation(r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r0 = r4
        L4c:
            com.forsale.app.datalayer.repositories.TranslationRepository$Translation r6 = (com.forsale.app.datalayer.repositories.TranslationRepository.Translation) r6
            com.forsale.app.datalayer.repositories.TranslationRepository$Translation r1 = com.forsale.app.datalayer.repositories.TranslationRepository.Translation.ORIGINAL
            if (r6 != r1) goto L7c
            com.forsale.app.datalayer.repositories.TranslationRepository$Translation r6 = com.forsale.app.datalayer.repositories.TranslationRepository.Translation.ENGLISH
            java.lang.String r2 = r6.getValue()
            boolean r2 = kotlin.jvm.internal.o.d(r5, r2)
            if (r2 == 0) goto L64
            androidx.lifecycle.b0<com.forsale.app.datalayer.repositories.TranslationRepository$Translation> r5 = r0.H
            r5.setValue(r6)
            goto Lbd
        L64:
            com.forsale.app.datalayer.repositories.TranslationRepository$Translation r6 = com.forsale.app.datalayer.repositories.TranslationRepository.Translation.ARABIC
            java.lang.String r2 = r6.getValue()
            boolean r5 = kotlin.jvm.internal.o.d(r5, r2)
            if (r5 == 0) goto L76
            androidx.lifecycle.b0<com.forsale.app.datalayer.repositories.TranslationRepository$Translation> r5 = r0.H
            r5.setValue(r6)
            goto Lbd
        L76:
            androidx.lifecycle.b0<com.forsale.app.datalayer.repositories.TranslationRepository$Translation> r5 = r0.H
            r5.setValue(r1)
            goto Lbd
        L7c:
            com.forsale.app.datalayer.repositories.TranslationRepository$Translation r1 = com.forsale.app.datalayer.repositories.TranslationRepository.Translation.ENGLISH
            if (r6 != r1) goto L90
            java.lang.String r2 = r1.getValue()
            boolean r2 = kotlin.jvm.internal.o.d(r5, r2)
            if (r2 == 0) goto L90
            androidx.lifecycle.b0<com.forsale.app.datalayer.repositories.TranslationRepository$Translation> r5 = r0.H
            r5.setValue(r1)
            goto Lbd
        L90:
            if (r6 != r1) goto La4
            com.forsale.app.datalayer.repositories.TranslationRepository$Translation r2 = com.forsale.app.datalayer.repositories.TranslationRepository.Translation.ARABIC
            java.lang.String r3 = r2.getValue()
            boolean r3 = kotlin.jvm.internal.o.d(r5, r3)
            if (r3 == 0) goto La4
            androidx.lifecycle.b0<com.forsale.app.datalayer.repositories.TranslationRepository$Translation> r5 = r0.H
            r5.setValue(r2)
            goto Lbd
        La4:
            com.forsale.app.datalayer.repositories.TranslationRepository$Translation r2 = com.forsale.app.datalayer.repositories.TranslationRepository.Translation.ARABIC
            if (r6 != r2) goto Lb8
            java.lang.String r6 = r2.getValue()
            boolean r5 = kotlin.jvm.internal.o.d(r5, r6)
            if (r5 == 0) goto Lb8
            androidx.lifecycle.b0<com.forsale.app.datalayer.repositories.TranslationRepository$Translation> r5 = r0.H
            r5.setValue(r1)
            goto Lbd
        Lb8:
            androidx.lifecycle.b0<com.forsale.app.datalayer.repositories.TranslationRepository$Translation> r5 = r0.H
            r5.setValue(r2)
        Lbd:
            androidx.lifecycle.b0<com.forsale.app.datalayer.repositories.TranslationRepository$Translation> r5 = r0.H
            java.lang.Object r5 = r5.getValue()
            com.forsale.app.datalayer.repositories.TranslationRepository$Translation r5 = (com.forsale.app.datalayer.repositories.TranslationRepository.Translation) r5
            if (r5 == 0) goto Lca
            r0.K(r5)
        Lca:
            wz.p r5 = wz.p.f75480a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.ListingDetailsRepository.L(java.lang.String, zz.a):java.lang.Object");
    }

    private final void M(String str) {
        BuildersKt__Builders_commonKt.launch$default(this.f25176d, null, null, new ListingDetailsRepository$initUserType$1(this, str, null), 3, null);
    }

    private final void N() {
        String str;
        ListingItemBrief listingItemBrief = this.f25175c;
        if (listingItemBrief != null) {
            str = listingItemBrief.getPhone();
        } else {
            str = null;
        }
        M(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(String str) {
        M(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
        if (r14 == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x009d -> B:24:0x00a0). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(int r13, zz.a<? super wz.p> r14) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.ListingDetailsRepository.P(int, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006d -> B:22:0x0070). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U(java.util.List<java.lang.Integer> r7, zz.a<? super wz.p> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$loadDistricts$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$loadDistricts$1 r0 = (com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$loadDistricts$1) r0
            int r1 = r0.f25277f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25277f = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$loadDistricts$1 r0 = new com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$loadDistricts$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f25275d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25277f
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r7 = r0.f25274c
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r2 = r0.f25273b
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r0.f25272a
            com.forsale.app.features.categories.listingdetails.ListingDetailsRepository r4 = (com.forsale.app.features.categories.listingdetails.ListingDetailsRepository) r4
            kotlin.f.b(r8)
            goto L70
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            kotlin.f.b(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            if (r7 == 0) goto L7a
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r4 = r6
            r2 = r8
        L4f:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L78
            java.lang.Object r8 = r7.next()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            com.forsale.app.datalayer.repositories.DistrictsRepository r5 = r4.f25183k
            r0.f25272a = r4
            r0.f25273b = r2
            r0.f25274c = r7
            r0.f25277f = r3
            java.lang.Object r8 = r5.getDistrictByDistrictId(r8, r0)
            if (r8 != r1) goto L70
            return r1
        L70:
            com.forsale.app.datalayer.database.DistrictEntity r8 = (com.forsale.app.datalayer.database.DistrictEntity) r8
            if (r8 == 0) goto L4f
            r2.add(r8)
            goto L4f
        L78:
            r8 = r2
            goto L7b
        L7a:
            r4 = r6
        L7b:
            androidx.lifecycle.b0<java.util.List<com.forsale.app.datalayer.database.DistrictEntity>> r7 = r4.f25193u
            r7.postValue(r8)
            wz.p r7 = wz.p.f75480a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.ListingDetailsRepository.U(java.util.List, zz.a):java.lang.Object");
    }

    private final String c0(TranslationRepository.Translation translation, String str, String str2) {
        String str3;
        ListingItemDetails value = this.C.getValue();
        if (value != null) {
            str3 = value.getTranslationOriginalLang();
        } else {
            str3 = null;
        }
        TranslationRepository.Translation translation2 = TranslationRepository.Translation.ARABIC;
        if (translation != translation2 || !o.d(str3, translation2.getValue())) {
            TranslationRepository.Translation translation3 = TranslationRepository.Translation.ENGLISH;
            if (translation != translation3 || !o.d(str3, translation3.getValue())) {
                if ((translation == translation3 && o.d(str3, translation2.getValue())) || (translation == translation2 && o.d(str3, translation3.getValue()))) {
                    return str2;
                }
                return str;
            }
            return str;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(ListingItemDetails listingItemDetails) {
        listingItemDetails.setDistricts(this.f25193u.getValue());
        h0(listingItemDetails);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0(ListingItemDetails listingItemDetails, Integer num) {
        listingItemDetails.setExpireSoon(num);
        h0(listingItemDetails);
    }

    private final p h0(ListingItemDetails listingItemDetails) {
        if (listingItemDetails != null) {
            this.B.postValue(listingItemDetails);
            return p.f75480a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(zz.a<? super fj.a> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$getContentMapping$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$getContentMapping$1 r0 = (com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$getContentMapping$1) r0
            int r1 = r0.f25222f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25222f = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$getContentMapping$1 r0 = new com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$getContentMapping$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f25220d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25222f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r1 = r0.f25219c
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r2 = r0.f25218b
            com.forsale.app.utils.gam.ContentUrlType r2 = (com.forsale.app.utils.gam.ContentUrlType) r2
            java.lang.Object r0 = r0.f25217a
            com.forsale.app.features.categories.listingdetails.ListingDetailsRepository r0 = (com.forsale.app.features.categories.listingdetails.ListingDetailsRepository) r0
            kotlin.f.b(r6)
            goto L69
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3e:
            kotlin.f.b(r6)
            com.forsale.app.utils.gam.ContentUrlType r2 = com.forsale.app.utils.gam.ContentUrlType.LISTING_DETAILS
            androidx.lifecycle.LiveData<com.forsale.app.datalayer.network.responses.ListingItemDetails> r6 = r5.C
            java.lang.Object r6 = r6.getValue()
            com.forsale.app.datalayer.network.responses.ListingItemDetails r6 = (com.forsale.app.datalayer.network.responses.ListingItemDetails) r6
            if (r6 == 0) goto L56
            int r6 = r6.getId()
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.a.d(r6)
            goto L57
        L56:
            r6 = r4
        L57:
            r0.f25217a = r5
            r0.f25218b = r2
            r0.f25219c = r6
            r0.f25222f = r3
            java.lang.Object r0 = r5.V(r0)
            if (r0 != r1) goto L66
            return r1
        L66:
            r1 = r6
            r6 = r0
            r0 = r5
        L69:
            com.forsale.app.datalayer.database.CategoryEntity r6 = (com.forsale.app.datalayer.database.CategoryEntity) r6
            if (r6 == 0) goto L72
            java.util.List r6 = r6.getCategoryTreeNames()
            goto L73
        L72:
            r6 = r4
        L73:
            androidx.lifecycle.LiveData<com.forsale.app.datalayer.network.responses.ListingItemDetails> r0 = r0.C
            java.lang.Object r0 = r0.getValue()
            com.forsale.app.datalayer.network.responses.ListingItemDetails r0 = (com.forsale.app.datalayer.network.responses.ListingItemDetails) r0
            if (r0 == 0) goto L81
            java.lang.String r4 = r0.getTitle()
        L81:
            fj.a r0 = new fj.a
            r0.<init>(r2, r1, r6, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.ListingDetailsRepository.w(zz.a):java.lang.Object");
    }

    private final List<xb.a> x(String str) {
        Object l11 = new com.google.gson.d().l(str, new c().getType());
        o.h(l11, "fromJson(...)");
        return (List) l11;
    }

    public final LiveData<ListingItemDetails> A() {
        return this.C;
    }

    public final LiveData<xb.a> B() {
        return this.E;
    }

    public final LocationRepository C() {
        return this.f25184l;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(zz.a<? super com.google.android.gms.ads.admanager.AdManagerAdRequest> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$getMidBannerRequest$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$getMidBannerRequest$1 r0 = (com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$getMidBannerRequest$1) r0
            int r1 = r0.f25227e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25227e = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$getMidBannerRequest$1 r0 = new com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$getMidBannerRequest$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f25225c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25227e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.f25224b
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r0 = r0.f25223a
            com.forsale.app.datalayer.repositories.GAMRepository r0 = (com.forsale.app.datalayer.repositories.GAMRepository) r0
            kotlin.f.b(r6)
            goto L63
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L39:
            kotlin.f.b(r6)
            com.forsale.app.datalayer.repositories.GAMRepository r6 = r5.f25187o
            androidx.lifecycle.LiveData<com.forsale.app.datalayer.network.responses.ListingItemDetails> r2 = r5.C
            java.lang.Object r2 = r2.getValue()
            com.forsale.app.datalayer.network.responses.ListingItemDetails r2 = (com.forsale.app.datalayer.network.responses.ListingItemDetails) r2
            if (r2 == 0) goto L51
            int r2 = r2.getCatId()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.a.d(r2)
            goto L52
        L51:
            r2 = 0
        L52:
            r0.f25223a = r6
            r0.f25224b = r2
            r0.f25227e = r3
            java.lang.Object r0 = r5.w(r0)
            if (r0 != r1) goto L5f
            return r1
        L5f:
            r1 = r2
            r4 = r0
            r0 = r6
            r6 = r4
        L63:
            fj.a r6 = (fj.a) r6
            com.google.android.gms.ads.admanager.AdManagerAdRequest r6 = r0.buildForCategory(r1, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.ListingDetailsRepository.D(zz.a):java.lang.Object");
    }

    public final LiveData<List<ListingItemBrief>> E() {
        return this.O;
    }

    public final void G(final l<? super ShareText, p> result) {
        o.i(result, "result");
        final ListingItemDetails value = this.C.getValue();
        if (value != null) {
            this.f25190r.e(this.f25190r.d(value.getSlug(), ItemStatus.NORMAL), value.getTitle(), value.getDesc(), new l<String, p>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$getShareText$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void b(String it2) {
                    ShareText F;
                    o.i(it2, "it");
                    l<ShareText, p> lVar = result;
                    ListingDetailsRepository listingDetailsRepository = this;
                    ListingItemDetails details = value;
                    o.h(details, "$details");
                    F = listingDetailsRepository.F(details, it2);
                    lVar.invoke(F);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(String str) {
                    b(str);
                    return p.f75480a;
                }
            });
        }
    }

    public final LiveData<String> H() {
        return this.K;
    }

    public final LiveData<TranslationRepository.Translation> I() {
        return this.I;
    }

    public final StateFlow<Boolean> Q() {
        return this.f25198z;
    }

    public final StateFlow<Boolean> R() {
        return this.f25195w;
    }

    public final Object S(int i11, zz.a<? super CategoryEntity> aVar) {
        return this.f25182j.getCategory(i11, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T(zz.a<? super wz.p> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$loadCategoryNameThenLogAddedToWich$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$loadCategoryNameThenLogAddedToWich$1 r0 = (com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$loadCategoryNameThenLogAddedToWich$1) r0
            int r1 = r0.f25271d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25271d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$loadCategoryNameThenLogAddedToWich$1 r0 = new com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$loadCategoryNameThenLogAddedToWich$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f25269b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25271d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f25268a
            com.forsale.app.features.categories.listingdetails.ListingDetailsRepository r0 = (com.forsale.app.features.categories.listingdetails.ListingDetailsRepository) r0
            kotlin.f.b(r5)
            goto L54
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.f.b(r5)
            androidx.lifecycle.LiveData<com.forsale.app.datalayer.network.responses.ListingItemDetails> r5 = r4.C
            java.lang.Object r5 = r5.getValue()
            com.forsale.app.datalayer.network.responses.ListingItemDetails r5 = (com.forsale.app.datalayer.network.responses.ListingItemDetails) r5
            if (r5 == 0) goto L5b
            int r5 = r5.getCatId()
            com.forsale.app.datalayer.repositories.CategoriesRepositories r2 = r4.f25182j
            r0.f25268a = r4
            r0.f25271d = r3
            java.lang.Object r5 = r2.getCategorySystemName(r5, r0)
            if (r5 != r1) goto L53
            return r1
        L53:
            r0 = r4
        L54:
            java.lang.String r5 = (java.lang.String) r5
            com.forsale.app.utils.analytics.g r0 = r0.f25186n
            r0.b(r5)
        L5b:
            wz.p r5 = wz.p.f75480a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.ListingDetailsRepository.T(zz.a):java.lang.Object");
    }

    public final Object V(zz.a<? super CategoryEntity> aVar) {
        Object f11;
        ListingItemDetails value = this.C.getValue();
        if (value != null) {
            Object category = this.f25182j.getCategory(value.getCatId(), aVar);
            f11 = kotlin.coroutines.intrinsics.b.f();
            if (category == f11) {
                return category;
            }
            return (CategoryEntity) category;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0158 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0196 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W(zz.a<? super wz.p> r31) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.ListingDetailsRepository.W(zz.a):java.lang.Object");
    }

    public final Object X(zz.a<? super RegionEntity> aVar) {
        Object f11;
        ListingItemDetails value = this.C.getValue();
        if (value != null) {
            Object region = this.f25180h.getRegion(kotlin.coroutines.jvm.internal.a.d(value.getRegId()), aVar);
            f11 = kotlin.coroutines.intrinsics.b.f();
            if (region == f11) {
                return region;
            }
            return (RegionEntity) region;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x027c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.AdvActionEvents r39, int r40, java.lang.String r41, java.lang.String r42, boolean r43, boolean r44, boolean r45, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.AnalyticsPosition r46, java.lang.String r47, com.forsale.app.features.categories.listingdetails.ListingDetailsAnalyticSource r48, java.lang.Boolean r49, com.forsale.app.datalayer.network.requestsbodies.UserType r50, java.util.List<java.lang.String> r51, com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace r52, com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData r53, zz.a<? super wz.p> r54) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.ListingDetailsRepository.Y(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$AdvActionEvents, int, java.lang.String, java.lang.String, boolean, boolean, boolean, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$AnalyticsPosition, java.lang.String, com.forsale.app.features.categories.listingdetails.ListingDetailsAnalyticSource, java.lang.Boolean, com.forsale.app.datalayer.network.requestsbodies.UserType, java.util.List, com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace, com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.AdvActionEvents r27, int r28, java.lang.String r29, com.forsale.app.features.categories.listingdetails.ListingDetailsAnalyticSource r30, kotlin.Pair<java.lang.String, java.lang.String>[] r31, zz.a<? super wz.p> r32) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.ListingDetailsRepository.a0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$AdvActionEvents, int, java.lang.String, com.forsale.app.features.categories.listingdetails.ListingDetailsAnalyticSource, kotlin.Pair[], zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dd A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.MyListingActionEvents r23, boolean r24, boolean r25, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.AnalyticsPosition r26, java.lang.String r27, kotlin.Pair<java.lang.String, java.lang.String>[] r28, zz.a<? super wz.p> r29) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.ListingDetailsRepository.b0(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$MyListingActionEvents, boolean, boolean, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$AnalyticsPosition, java.lang.String, kotlin.Pair[], zz.a):java.lang.Object");
    }

    public final Object d0(boolean z11, zz.a<? super p> aVar) {
        Object f11;
        Object h11 = this.f25177e.e().h(z11, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (h11 == f11) {
            return h11;
        }
        return p.f75480a;
    }

    public final void e0() {
        TranslationRepository.Translation value = this.H.getValue();
        TranslationRepository.Translation translation = TranslationRepository.Translation.ARABIC;
        if (value == translation) {
            this.H.setValue(TranslationRepository.Translation.ENGLISH);
        } else {
            this.H.setValue(translation);
        }
        TranslationRepository.Translation value2 = this.H.getValue();
        if (value2 != null) {
            K(value2);
        }
    }

    public final Object q(zz.a<? super String> aVar) {
        return this.f25177e.c().a(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0108 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(g00.a<wz.p> r17, g00.l<? super java.lang.Boolean, wz.p> r18, g00.a<wz.p> r19, zz.a<? super wz.p> r20) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.ListingDetailsRepository.r(g00.a, g00.l, g00.a, zz.a):java.lang.Object");
    }

    public final int s() {
        return this.f25173a;
    }

    public final AttributesMapper.a t() {
        AttributesMapper.a aVar = this.f25192t;
        if (aVar != null) {
            return aVar;
        }
        o.w("attributeMapperFactory");
        return null;
    }

    public final LiveData<List<AttributesMapper.AttributesDataModel>> u() {
        return this.G;
    }

    public final Flow<Boolean> v() {
        return this.A;
    }

    public final LiveData<String> y() {
        return this.M;
    }

    public final ListingItemBrief z() {
        return this.f25175c;
    }
}
