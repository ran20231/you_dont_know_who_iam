package com.forsale.app.features.categories.listingdetails;

import aa.m;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.j;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.network.requestsbodies.UserType;
import com.forsale.app.datalayer.network.responses.Addon;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.features.categories.listingdetails.ListingDetailsRepository;
import com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.postad.PostAdDialogs;
import com.forsale.app.routing.plfRouting.shared.PLFResult;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.AlertBottomSheet;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models.AlertModel;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$2;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$3;
import com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace;
import com.google.android.gms.ads.AdRequest;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import n00.k;
import okhttp3.internal.http2.Http2;
import t9.t0;
import v9.c;
import wz.p;
import zf.a;
/* compiled from: ListingDetailsActivity.kt */
/* loaded from: classes2.dex */
public final class ListingDetailsActivity extends com.forsale.app.features.categories.listingdetails.b<m, ListingDetailsViewModel> implements v9.c {
    private final wz.h A;
    private final wz.h B;
    private final wz.h C;
    private final wz.h D;
    private final wz.h E;
    private final wz.h F;
    private final wz.h G;
    private final wz.h H;
    private final wz.h I;
    private final wz.h J;
    private final com.forsale.app.features.auth.f K;
    public ListingDetailsRepository.a L;
    private final wz.h M;
    public cx.a<ag.a> N;
    public ListingDetailsViewModel.b O;
    private final wz.h P;
    private final androidx.activity.result.b<Intent> Q;

    /* renamed from: i */
    private final wz.h f25097i;

    /* renamed from: j */
    private final wz.h f25098j;

    /* renamed from: x */
    private final int f25099x;

    /* renamed from: y */
    private final wz.h f25100y;

    /* renamed from: z */
    private final wz.h f25101z;
    static final /* synthetic */ k<Object>[] S = {s.g(new PropertyReference1Impl(ListingDetailsActivity.class, "authenticatorDelegator", "getAuthenticatorDelegator()Lcom/forsale/app/features/auth/AuthenticationDelegationI;", 0))};
    public static final a R = new a(null);
    public static final int T = 8;

    /* compiled from: ListingDetailsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void b(a aVar, Context context, ListingItemBrief listingItemBrief, Integer num, int i11, String str, ListingsTypes listingsTypes, String str2, String str3, ListingDetailsOwnerActions listingDetailsOwnerActions, ListingDetailsAnalyticSource listingDetailsAnalyticSource, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData, boolean z11, int i12, List list, ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace, List list2, int i13, Object obj) {
            aVar.a(context, (i13 & 1) != 0 ? null : listingItemBrief, (i13 & 2) != 0 ? null : num, (i13 & 4) != 0 ? -1 : i11, (i13 & 8) != 0 ? null : str, (i13 & 16) != 0 ? ListingsTypes.NORMAL_LISTINGS : listingsTypes, (i13 & 32) != 0 ? null : str2, (i13 & 64) != 0 ? null : str3, (i13 & 128) != 0 ? null : listingDetailsOwnerActions, (i13 & 256) != 0 ? null : listingDetailsAnalyticSource, (i13 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : listingDetailsSearchAnalyticsData, (i13 & 1024) != 0 ? false : z11, (i13 & RecyclerView.l.FLAG_MOVED) == 0 ? i12 : -1, (i13 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : list, (i13 & 8192) == 0 ? listingsAnalytics$FiltersPlace : null, (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r.n() : list2);
        }

        public final void a(Context context, ListingItemBrief listingItemBrief, Integer num, int i11, String str, ListingsTypes listingsTypes, String str2, String str3, ListingDetailsOwnerActions listingDetailsOwnerActions, ListingDetailsAnalyticSource listingDetailsAnalyticSource, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData, boolean z11, int i12, List<String> list, ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace, List<Integer> swipingIds) {
            p pVar;
            o.i(context, "<this>");
            o.i(listingsTypes, "listingsTypes");
            o.i(swipingIds, "swipingIds");
            Intent intent = new Intent(context, ListingDetailsActivity.class);
            intent.putExtra("ADV_OBJECT", listingItemBrief);
            intent.putExtra("ADV_ID", i11);
            if (str != null) {
                intent.putExtra("SLUG", str);
            }
            intent.putExtra("LISTING_TYPE", listingsTypes);
            intent.putExtra("OWNER_LISTING_ACTION", listingDetailsOwnerActions);
            intent.putExtra("LISTING_SOURCE", listingDetailsAnalyticSource);
            intent.putExtra("isProperty", z11);
            if (str2 != null) {
                intent.putExtra("LISTING_SOURCE", str2);
            }
            if (str3 != null) {
                intent.putExtra("LISTING_STATUS", str3);
            }
            if (list != null) {
                List<String> list2 = list;
                if (!list2.isEmpty()) {
                    intent.putStringArrayListExtra("SOURCE_FILTER_NAME", new ArrayList<>(list2));
                }
            }
            if (listingsAnalytics$FiltersPlace != null) {
                intent.putExtra("FILTERS_PLACE", listingsAnalytics$FiltersPlace);
            }
            if (listingDetailsSearchAnalyticsData != null) {
                intent.putExtra("SEARCH_ANALYTICS_DATA", listingDetailsSearchAnalyticsData);
            }
            intent.putExtra("ITEM_POSITION", i12);
            intent.putIntegerArrayListExtra("SWIPING_IDS", new ArrayList<>(swipingIds));
            if (num != null) {
                int intValue = num.intValue();
                if (context instanceof ViewComponentManager.FragmentContextWrapper) {
                    androidx.appcompat.app.d l11 = ContextExtensionsKt.l(context);
                    if (l11 != null) {
                        l11.startActivityForResult(intent, intValue);
                        pVar = p.f75480a;
                    } else {
                        pVar = null;
                    }
                } else if (context instanceof Fragment) {
                    ((Fragment) context).startActivityForResult(intent, intValue);
                    pVar = p.f75480a;
                } else {
                    if (context instanceof Activity) {
                        ((Activity) context).startActivityForResult(intent, intValue);
                    }
                    pVar = p.f75480a;
                }
                if (pVar != null) {
                    return;
                }
            }
            if (context instanceof ViewComponentManager.FragmentContextWrapper) {
                androidx.appcompat.app.d l12 = ContextExtensionsKt.l(context);
                if (l12 != null) {
                    l12.startActivity(intent);
                    p pVar2 = p.f75480a;
                }
            } else if (context instanceof Fragment) {
                context.startActivity(intent);
                p pVar3 = p.f75480a;
            } else {
                if (context instanceof Activity) {
                    context.startActivity(intent);
                }
                p pVar4 = p.f75480a;
            }
        }
    }

    /* compiled from: ListingDetailsActivity.kt */
    /* loaded from: classes2.dex */
    static final class b implements androidx.activity.result.a<ActivityResult> {
        b() {
            ListingDetailsActivity.this = r1;
        }

        @Override // androidx.activity.result.a
        /* renamed from: b */
        public final void a(ActivityResult activityResult) {
            PLFResult a11;
            Intent a12 = activityResult.a();
            if (a12 != null && (a11 = PLFResult.f37812e.a(a12)) != null) {
                ListingDetailsActivity.this.x0().U1(a11.c(), a11.a());
            }
        }
    }

    public ListingDetailsActivity() {
        wz.h a11;
        wz.h a12;
        wz.h a13;
        wz.h a14;
        wz.h a15;
        wz.h a16;
        wz.h a17;
        wz.h a18;
        wz.h a19;
        wz.h a21;
        wz.h a22;
        wz.h a23;
        wz.h a24;
        wz.h a25;
        wz.h a26;
        a11 = kotlin.d.a(new g00.a<ListingItemBrief>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsActivity$itemBrief$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final ListingItemBrief invoke() {
                Parcelable parcelableExtra = ListingDetailsActivity.this.getIntent().getParcelableExtra("ADV_OBJECT");
                if (parcelableExtra instanceof ListingItemBrief) {
                    return (ListingItemBrief) parcelableExtra;
                }
                return null;
            }
        });
        this.f25097i = a11;
        a12 = kotlin.d.a(new g00.a<ListingsTypes>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsActivity$listingType$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final ListingsTypes invoke() {
                ListingsTypes listingsTypes;
                Serializable serializableExtra = ListingDetailsActivity.this.getIntent().getSerializableExtra("LISTING_TYPE");
                if (serializableExtra instanceof ListingsTypes) {
                    listingsTypes = (ListingsTypes) serializableExtra;
                } else {
                    listingsTypes = null;
                }
                if (listingsTypes == null) {
                    return ListingsTypes.NORMAL_LISTINGS;
                }
                return listingsTypes;
            }
        });
        this.f25098j = a12;
        this.f25099x = t0.f70210g;
        a13 = kotlin.d.a(new g00.a<Integer>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsActivity$advId$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Integer invoke() {
                return Integer.valueOf(ListingDetailsActivity.this.getIntent().getIntExtra("ADV_ID", -1));
            }
        });
        this.f25100y = a13;
        a14 = kotlin.d.a(new g00.a<String>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsActivity$slug$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                return ListingDetailsActivity.this.getIntent().getStringExtra("SLUG");
            }
        });
        this.f25101z = a14;
        a15 = kotlin.d.a(new g00.a<String>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsActivity$listingSource$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                return ListingDetailsActivity.this.getIntent().getStringExtra("LISTING_SOURCE");
            }
        });
        this.A = a15;
        a16 = kotlin.d.a(new g00.a<String>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsActivity$listingStatus$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                return ListingDetailsActivity.this.getIntent().getStringExtra("LISTING_STATUS");
            }
        });
        this.B = a16;
        a17 = kotlin.d.a(new g00.a<ListingDetailsAnalyticSource>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsActivity$listingAnalyticsSource$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final ListingDetailsAnalyticSource invoke() {
                Parcelable parcelableExtra = ListingDetailsActivity.this.getIntent().getParcelableExtra("LISTING_SOURCE");
                if (parcelableExtra instanceof ListingDetailsAnalyticSource) {
                    return (ListingDetailsAnalyticSource) parcelableExtra;
                }
                return null;
            }
        });
        this.C = a17;
        a18 = kotlin.d.a(new g00.a<ListingDetailsSearchAnalyticsData>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsActivity$searchAnalyticsData$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final ListingDetailsSearchAnalyticsData invoke() {
                Parcelable parcelableExtra = ListingDetailsActivity.this.getIntent().getParcelableExtra("SEARCH_ANALYTICS_DATA");
                if (parcelableExtra instanceof ListingDetailsSearchAnalyticsData) {
                    return (ListingDetailsSearchAnalyticsData) parcelableExtra;
                }
                return null;
            }
        });
        this.D = a18;
        a19 = kotlin.d.a(new g00.a<Integer>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsActivity$itemPosition$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Integer invoke() {
                return Integer.valueOf(ListingDetailsActivity.this.getIntent().getIntExtra("ITEM_POSITION", -1));
            }
        });
        this.E = a19;
        a21 = kotlin.d.a(new g00.a<ArrayList<String>>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsActivity$sourceFilterName$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final ArrayList<String> invoke() {
                return ListingDetailsActivity.this.getIntent().getStringArrayListExtra("SOURCE_FILTER_NAME");
            }
        });
        this.F = a21;
        a22 = kotlin.d.a(new g00.a<ListingDetailsOwnerActions>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsActivity$ownerAction$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final ListingDetailsOwnerActions invoke() {
                Serializable serializableExtra = ListingDetailsActivity.this.getIntent().getSerializableExtra("OWNER_LISTING_ACTION");
                if (serializableExtra instanceof ListingDetailsOwnerActions) {
                    return (ListingDetailsOwnerActions) serializableExtra;
                }
                return null;
            }
        });
        this.G = a22;
        a23 = kotlin.d.a(new g00.a<ListingsAnalytics$FiltersPlace>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsActivity$filtersPlace$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final ListingsAnalytics$FiltersPlace invoke() {
                Serializable serializableExtra = ListingDetailsActivity.this.getIntent().getSerializableExtra("FILTERS_PLACE");
                if (serializableExtra instanceof ListingsAnalytics$FiltersPlace) {
                    return (ListingsAnalytics$FiltersPlace) serializableExtra;
                }
                return null;
            }
        });
        this.H = a23;
        a24 = kotlin.d.a(new g00.a<Boolean>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsActivity$isProperty$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Boolean invoke() {
                return Boolean.valueOf(ListingDetailsActivity.this.getIntent().getBooleanExtra("isProperty", false));
            }
        });
        this.I = a24;
        a25 = kotlin.d.a(new g00.a<ArrayList<Integer>>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsActivity$swipingIds$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final ArrayList<Integer> invoke() {
                return ListingDetailsActivity.this.getIntent().getIntegerArrayListExtra("SWIPING_IDS");
            }
        });
        this.J = a25;
        this.K = new com.forsale.app.features.auth.f(this);
        a26 = kotlin.d.a(new g00.a<ListingDetailsRepository>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsActivity$repo$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final ListingDetailsRepository invoke() {
                ListingItemBrief h12;
                int c12;
                String u12;
                ListingItemBrief h13;
                ListingDetailsRepository.a k12 = ListingDetailsActivity.this.k1();
                h12 = ListingDetailsActivity.this.h1();
                if (h12 == null) {
                    c12 = ListingDetailsActivity.this.c1();
                } else {
                    c12 = h12.getId();
                }
                u12 = ListingDetailsActivity.this.u1();
                h13 = ListingDetailsActivity.this.h1();
                return k12.a(c12, u12, h13, t.a(ListingDetailsActivity.this));
            }
        });
        this.M = a26;
        this.P = new s0(s.b(ListingDetailsViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$2(this), new g00.a<t0.b>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsActivity$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ ListingDetailsActivity f25104f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(androidx.fragment.app.p pVar, Bundle bundle, ListingDetailsActivity listingDetailsActivity) {
                    super(pVar, bundle);
                    this.f25104f = listingDetailsActivity;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    int i12;
                    ListingDetailsRepository s12;
                    String n12;
                    String o12;
                    ListingDetailsOwnerActions p12;
                    ListingDetailsAnalyticSource j12;
                    Boolean y12;
                    ListingItemBrief h12;
                    UserType userType;
                    ArrayList v12;
                    ListingsAnalytics$FiltersPlace g12;
                    ListingDetailsSearchAnalyticsData t12;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    ListingDetailsViewModel.b l12 = this.f25104f.l1();
                    i12 = this.f25104f.i1();
                    s12 = this.f25104f.s1();
                    n12 = this.f25104f.n1();
                    o12 = this.f25104f.o1();
                    p12 = this.f25104f.p1();
                    j12 = this.f25104f.j1();
                    y12 = this.f25104f.y1();
                    h12 = this.f25104f.h1();
                    if (h12 != null) {
                        userType = h12.getUserType();
                    } else {
                        userType = null;
                    }
                    v12 = this.f25104f.v1();
                    g12 = this.f25104f.g1();
                    t12 = this.f25104f.t1();
                    ListingDetailsViewModel a11 = l12.a(s12, i12, n12, o12, p12, j12, y12, userType, v12, g12, t12);
                    o.g(a11, "null cannot be cast to non-null type T of com.forsale.app.utils.ViewModelHiltExtensionKt.assistedViewModel.<no name provided>.invoke.<no name provided>.create");
                    return a11;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final t0.b invoke() {
                return new a(androidx.fragment.app.p.this, androidx.fragment.app.p.this.getIntent().getExtras(), this);
            }
        }, new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$3(null, this));
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new b());
        o.h(registerForActivityResult, "registerForActivityResult(...)");
        this.Q = registerForActivityResult;
    }

    private final void A1() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new ListingDetailsActivity$loadIntentForModifiedListing$1(this, null), 3, null);
    }

    public static final void B1(ListingDetailsActivity this$0, View view) {
        o.i(this$0, "this$0");
        z3.b.a(this$0, ((m) this$0.o0()).O.getId()).h0();
    }

    public final void C1() {
        finish();
        ContextExtensionsKt.E(this);
    }

    private final void D1() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new ListingDetailsActivity$registerObservers$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(t.a(this), null, null, new ListingDetailsActivity$registerObservers$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(t.a(this), null, null, new ListingDetailsActivity$registerObservers$3(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(t.a(this), null, null, new ListingDetailsActivity$registerObservers$4(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(t.a(this), null, null, new ListingDetailsActivity$registerObservers$5(this, null), 3, null);
    }

    public final void E1() {
        List<Addon> n11;
        AlertBottomSheet.a aVar = AlertBottomSheet.D;
        ListingDetailsViewModel x02 = x0();
        n11 = r.n();
        AlertModel a11 = com.forsale.app.utils.c.a(this, x02.Q0(false, true, n11), true, true, false, false, PostAdDialogs.UploadMediaFailed);
        g00.a<p> aVar2 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsActivity$showAlertMediaError$1
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
                ListingDetailsActivity.this.x0().N0().c(p.f75480a);
            }
        };
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        o.h(supportFragmentManager, "getSupportFragmentManager(...)");
        AlertBottomSheet.a.c(aVar, a11, null, null, aVar2, supportFragmentManager, 6, null);
    }

    public final void F1() {
        final boolean b11 = ContextExtensionsKt.b(this, null, 1, null);
        AlertBottomSheet.a aVar = AlertBottomSheet.D;
        AlertModel J0 = x0().J0(false, b11);
        g00.a<p> aVar2 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsActivity$showAlertWaitingApproval$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                if (b11) {
                    this.finish();
                } else {
                    this.C1();
                }
            }
        };
        g00.a<p> aVar3 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsActivity$showAlertWaitingApproval$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                if (b11) {
                    return;
                }
                this.finish();
            }
        };
        g00.a<p> aVar4 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsActivity$showAlertWaitingApproval$3
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
                ListingDetailsActivity.this.x0().N0().c(p.f75480a);
            }
        };
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        o.h(supportFragmentManager, "getSupportFragmentManager(...)");
        aVar.b(J0, aVar2, aVar3, aVar4, supportFragmentManager);
    }

    public static final /* synthetic */ m J0(ListingDetailsActivity listingDetailsActivity) {
        return (m) listingDetailsActivity.o0();
    }

    public final void b1(FragmentManager fragmentManager) {
        List<Fragment> A0 = fragmentManager.A0();
        if (A0 == null) {
            return;
        }
        for (Fragment fragment : A0) {
            if (fragment instanceof j) {
                ((j) fragment).dismissAllowingStateLoss();
            }
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            o.h(childFragmentManager, "getChildFragmentManager(...)");
            b1(childFragmentManager);
        }
    }

    public final int c1() {
        return ((Number) this.f25100y.getValue()).intValue();
    }

    public final int[] d1() {
        boolean z11;
        ArrayList<Integer> w12;
        int[] W0;
        int c12;
        ArrayList<Integer> w13 = w1();
        if (w13 != null && !w13.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            Integer[] numArr = new Integer[1];
            ListingItemBrief h12 = h1();
            if (h12 != null) {
                c12 = h12.getId();
            } else {
                c12 = c1();
            }
            numArr[0] = Integer.valueOf(c12);
            w12 = r.h(numArr);
        } else {
            w12 = w1();
            o.f(w12);
        }
        W0 = CollectionsKt___CollectionsKt.W0(w12);
        return W0;
    }

    public final int f1() {
        boolean z11;
        int c12;
        ArrayList<Integer> w12 = w1();
        if (w12 != null && !w12.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            return 0;
        }
        ArrayList<Integer> w13 = w1();
        o.f(w13);
        ListingItemBrief h12 = h1();
        if (h12 != null) {
            c12 = h12.getId();
        } else {
            c12 = c1();
        }
        return w13.indexOf(Integer.valueOf(c12));
    }

    public final ListingsAnalytics$FiltersPlace g1() {
        return (ListingsAnalytics$FiltersPlace) this.H.getValue();
    }

    public final ListingItemBrief h1() {
        return (ListingItemBrief) this.f25097i.getValue();
    }

    public final int i1() {
        return ((Number) this.E.getValue()).intValue();
    }

    public final ListingDetailsAnalyticSource j1() {
        return (ListingDetailsAnalyticSource) this.C.getValue();
    }

    public final String n1() {
        return (String) this.A.getValue();
    }

    public final String o1() {
        return (String) this.B.getValue();
    }

    public final ListingDetailsOwnerActions p1() {
        return (ListingDetailsOwnerActions) this.G.getValue();
    }

    public final ListingDetailsRepository s1() {
        return (ListingDetailsRepository) this.M.getValue();
    }

    public final ListingDetailsSearchAnalyticsData t1() {
        return (ListingDetailsSearchAnalyticsData) this.D.getValue();
    }

    public final String u1() {
        return (String) this.f25101z.getValue();
    }

    public final ArrayList<String> v1() {
        return (ArrayList) this.F.getValue();
    }

    private final ArrayList<Integer> w1() {
        return (ArrayList) this.J.getValue();
    }

    public final Boolean y1() {
        return (Boolean) this.I.getValue();
    }

    public final com.forsale.app.features.auth.e e1() {
        return this.K.d(this, S[0]);
    }

    @Override // android.app.Activity
    public void finish() {
        A1();
        super.finish();
    }

    public final ListingDetailsRepository.a k1() {
        ListingDetailsRepository.a aVar = this.L;
        if (aVar != null) {
            return aVar;
        }
        o.w("listingDetailsRepositoryFactory");
        return null;
    }

    public final ListingDetailsViewModel.b l1() {
        ListingDetailsViewModel.b bVar = this.O;
        if (bVar != null) {
            return bVar;
        }
        o.w("listingDetailsVMFactory");
        return null;
    }

    public final ListingDetailsViewModel m1() {
        return x0();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 55 && i12 == -1 && intent != null) {
            if (intent.getIntExtra("following_new_state", -1) != -1) {
                recreate();
                return;
            }
            return;
        }
        super.onActivityResult(i11, i12, intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.features.categories.listingdetails.b, com.forsale.app.base.activities.BaseViewModelActivity, com.forsale.app.base.activities.BasePlainActivity, androidx.fragment.app.p, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        D1();
        setSupportActionBar(((m) o0()).P);
        ((m) o0()).P.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.forsale.app.features.categories.listingdetails.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ListingDetailsActivity.B1(ListingDetailsActivity.this, view);
            }
        });
    }

    @Override // androidx.appcompat.app.d
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }

    @Override // com.forsale.app.base.activities.BasePlainActivity
    public int p0() {
        return this.f25099x;
    }

    public final androidx.activity.result.b<Intent> q1() {
        return this.Q;
    }

    public final cx.a<ag.a> r1() {
        cx.a<ag.a> aVar = this.N;
        if (aVar != null) {
            return aVar;
        }
        o.w("plfRouterOperator");
        return null;
    }

    @Override // v9.c
    public void setStateViewsActions(View view) {
        c.a.c(this, view);
    }

    @Override // com.forsale.app.base.activities.BaseViewModelActivity
    /* renamed from: x1 */
    public ListingDetailsViewModel x0() {
        return (ListingDetailsViewModel) this.P.getValue();
    }

    public final void z1(a.C0991a plfArgs) {
        o.i(plfArgs, "plfArgs");
        BuildersKt__Builders_commonKt.launch$default(x0(), null, null, new ListingDetailsActivity$launchPLFToEdit$1(this, plfArgs, null), 3, null);
    }
}
