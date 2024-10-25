package com.forsale.app.features.maincontainer;

import aa.q;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.h0;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.p;
import androidx.lifecycle.s0;
import androidx.lifecycle.t;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.e;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;
import c4.d;
import com.adjust.sdk.Constants;
import com.forsale.adserver.utils.InitAnalytics;
import com.forsale.adserver.view.models.AdsModel;
import com.forsale.adserver.view.models.CommercialModel;
import com.forsale.adserver.view.models.DetailsIntention;
import com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheetKt;
import com.forsale.analytics.commercial.CommercialItemDetailsSource;
import com.forsale.analytics.commercial.CommercialPageSource;
import com.forsale.app.datalayer.network.entities.PostListingIntention;
import com.forsale.app.datalayer.network.entities.SessionEntity;
import com.forsale.app.features.auth.AuthActivity;
import com.forsale.app.features.auth.e;
import com.forsale.app.features.auth.login.SignInIntention;
import com.forsale.app.features.auth.models.AuthIntention;
import com.forsale.app.features.categories.home.maincategories.a;
import com.forsale.app.features.categories.listingdetails.ListingDetailsActivity;
import com.forsale.app.features.categories.listingdetails.ListingDetailsOwnerActions;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource;
import com.forsale.app.features.more.WebActivity;
import com.forsale.app.features.more.WebModel;
import com.forsale.app.features.more.WebType;
import com.forsale.app.features.welcome.loading.SplashFragment;
import com.forsale.app.notifications.fcm.FCMTopLevelFunctionsKt;
import com.forsale.app.routing.deeplinks.processors.b;
import com.forsale.app.routing.plfRouting.shared.PLFResult;
import com.forsale.app.ui.WebDialogFragment;
import com.forsale.app.ui.customtooltip.BottomToolTipMapper;
import com.forsale.app.ui.customtooltip.CustomToolTips;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.CrashlyticsUtilsKt;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.NavigationUtilsKt;
import com.forsale.app.utils.analytics.AnalyticsDetailsSource;
import com.forsale.app.utils.analytics.AnalyticsListingsSource;
import com.forsale.app.utils.analytics.PLFSource;
import com.forsale.app.utils.analytics.SearchSource;
import com.forsale.app.utils.analytics.auth.AuthenticationSourcePage;
import com.forsale.app.utils.popUpsPrioritizer.PopUpType;
import com.forsale.designSystem.theme.ThemeKt;
import com.forsale.ui.components.SearchToolbarKt;
import com.google.android.gms.ads.AdRequest;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.firebase.perf.metrics.Trace;
import g00.l;
import j0.d1;
import j0.e1;
import j0.n1;
import j0.v0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.w;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import n00.k;
import okhttp3.internal.http2.Http2;
import t9.j0;
import t9.q0;
import t9.r0;
import t9.t0;
import t9.y0;
import uf.b;
import z3.u;
/* compiled from: MainContainerActivity.kt */
/* loaded from: classes2.dex */
public final class MainContainerActivity extends com.forsale.app.features.maincontainer.a<q, MainContainerViewModel> implements uf.b, uf.d {
    private final wz.h A;
    private final wz.h B;
    private final wz.h C;
    private final wz.h D;
    private final wz.h E;
    private final wz.h F;
    private final com.forsale.app.features.auth.f G;
    public cx.a<vf.c> H;
    private final NavController.b I;
    private final NavigationBarView.b J;
    private final NavigationBarView.c K;
    public cx.a<ag.a> L;
    private final androidx.activity.result.b<Intent> M;
    private final List<Integer> N;

    /* renamed from: i */
    private final int f31314i = t0.f70224i;

    /* renamed from: j */
    private final wz.h f31315j = new s0(s.b(MainContainerViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // g00.a
        /* renamed from: b */
        public final w0 invoke() {
            return ComponentActivity.this.getViewModelStore();
        }
    }, new g00.a<t0.b>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // g00.a
        /* renamed from: b */
        public final t0.b invoke() {
            return ComponentActivity.this.getDefaultViewModelProviderFactory();
        }
    }, new g00.a<w3.a>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$special$$inlined$viewModels$default$3
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
        }

        @Override // g00.a
        /* renamed from: b */
        public final w3.a invoke() {
            w3.a aVar;
            g00.a aVar2 = g00.a.this;
            if (aVar2 == null || (aVar = (w3.a) aVar2.invoke()) == null) {
                return this.getDefaultViewModelCreationExtras();
            }
            return aVar;
        }
    });

    /* renamed from: x */
    private final wz.h f31316x;

    /* renamed from: y */
    private final wz.h f31317y;

    /* renamed from: z */
    private final int f31318z;
    static final /* synthetic */ k<Object>[] P = {s.g(new PropertyReference1Impl(MainContainerActivity.class, "authenticatorDelegator", "getAuthenticatorDelegator()Lcom/forsale/app/features/auth/AuthenticationDelegationI;", 0))};
    public static final a O = new a(null);
    public static final int Q = 8;

    /* compiled from: MainContainerActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void c(a aVar, Context context, AnalyticsListingsSource analyticsListingsSource, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                analyticsListingsSource = null;
            }
            aVar.b(context, analyticsListingsSource);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void e(a aVar, Context context, String str, String str2, g00.a aVar2, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                aVar2 = null;
            }
            aVar.d(context, str, str2, aVar2);
        }

        public static /* synthetic */ void g(a aVar, Context context, HomeTabs homeTabs, boolean z11, ListingsTypes listingsTypes, AnalyticsListingsSource analyticsListingsSource, Integer num, int i11, Object obj) {
            ListingsTypes listingsTypes2;
            AnalyticsListingsSource analyticsListingsSource2;
            Integer num2;
            if ((i11 & 1) != 0) {
                homeTabs = HomeTabs.INDEX_OFFERS;
            }
            HomeTabs homeTabs2 = homeTabs;
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            boolean z12 = z11;
            if ((i11 & 4) != 0) {
                listingsTypes2 = null;
            } else {
                listingsTypes2 = listingsTypes;
            }
            if ((i11 & 8) != 0) {
                analyticsListingsSource2 = null;
            } else {
                analyticsListingsSource2 = analyticsListingsSource;
            }
            if ((i11 & 16) != 0) {
                num2 = null;
            } else {
                num2 = num;
            }
            aVar.f(context, homeTabs2, z12, listingsTypes2, analyticsListingsSource2, num2);
        }

        public final void a(Context context, ListingsTypes listingsTypes, AnalyticsListingsSource analyticsListingsSource) {
            o.i(context, "<this>");
            o.i(listingsTypes, "listingsTypes");
            if (context instanceof Fragment) {
                Fragment fragment = (Fragment) context;
                if (fragment.getActivity() instanceof MainContainerActivity) {
                    p activity = fragment.getActivity();
                    o.g(activity, "null cannot be cast to non-null type com.forsale.app.features.maincontainer.MainContainerActivity");
                    ((MainContainerActivity) activity).x1(listingsTypes, analyticsListingsSource);
                    return;
                }
                p activity2 = fragment.getActivity();
                if (activity2 != null) {
                    activity2.finish();
                }
                Context context2 = fragment.getContext();
                if (context2 != null) {
                    g(this, context2, HomeTabs.INDEX_PROFILE, false, listingsTypes, analyticsListingsSource, null, 18, null);
                }
            } else if (context instanceof Activity) {
                if (context instanceof MainContainerActivity) {
                    ((MainContainerActivity) context).x1(listingsTypes, analyticsListingsSource);
                    return;
                }
                ((Activity) context).finish();
                g(this, context, HomeTabs.INDEX_PROFILE, false, listingsTypes, analyticsListingsSource, null, 18, null);
            }
        }

        public final void b(Context context, AnalyticsListingsSource analyticsListingsSource) {
            o.i(context, "<this>");
            a(context, ListingsTypes.MY_LISTINGS, analyticsListingsSource);
        }

        public final void d(Context context, String title, String url, g00.a<wz.p> aVar) {
            o.i(context, "<this>");
            o.i(title, "title");
            o.i(url, "url");
            WebActivity.a.d(WebActivity.I, context, WebType.URL, title, url, 0, null, 24, null);
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final void f(Context context, HomeTabs preSelectedTabIndex, boolean z11, ListingsTypes listingsTypes, AnalyticsListingsSource analyticsListingsSource, Integer num) {
            o.i(context, "<this>");
            o.i(preSelectedTabIndex, "preSelectedTabIndex");
            Intent intent = new Intent(context, MainContainerActivity.class);
            intent.putExtra("ACTIVITY_SELECT_TAB_ID", preSelectedTabIndex);
            intent.putExtra("IS_DEVICE_BLOCKED", z11);
            intent.putExtra("NAVIGATE_TO_LISTINGS", listingsTypes);
            intent.putExtra("LISTING_SOURCE", analyticsListingsSource);
            if (num != null) {
                num.intValue();
                intent.addFlags(num.intValue());
            }
            context.startActivity(intent);
        }
    }

    /* compiled from: MainContainerActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31338a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f31339b;

        static {
            int[] iArr = new int[HomeTabs.values().length];
            try {
                iArr[HomeTabs.INDEX_HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomeTabs.INDEX_OFFERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomeTabs.INDEX_SEARCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HomeTabs.INDEX_PROFILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f31338a = iArr;
            int[] iArr2 = new int[HomeToolbars.values().length];
            try {
                iArr2[HomeToolbars.MAIN_TOOLBAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[HomeToolbars.SUB_CATEGORY_TOOLBAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[HomeToolbars.SEARCH_TOOLBAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[HomeToolbars.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f31339b = iArr2;
        }
    }

    /* compiled from: ViewsExtensions.kt */
    /* loaded from: classes2.dex */
    public static final class c implements DialogInterface.OnClickListener {
        public c() {
            MainContainerActivity.this = r1;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i11) {
            MainContainerActivity.this.finishAndRemoveTask();
        }
    }

    /* compiled from: MainContainerActivity.kt */
    /* loaded from: classes2.dex */
    public static final class e implements FlowCollector<wz.p> {
        e() {
            MainContainerActivity.this = r1;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(wz.p pVar, zz.a<? super wz.p> aVar) {
            if (pVar != null) {
                MainContainerActivity.this.recreate();
            }
            return wz.p.f75480a;
        }
    }

    /* compiled from: MainContainerActivity.kt */
    /* loaded from: classes2.dex */
    public static final class f implements FlowCollector<Pair<? extends CustomToolTips, ? extends Integer>> {
        f() {
            MainContainerActivity.this = r1;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(Pair<? extends CustomToolTips, Integer> pair, zz.a<? super wz.p> aVar) {
            if (pair != null) {
                MainContainerActivity.this.g2(pair.c(), pair.d().intValue());
            }
            return wz.p.f75480a;
        }
    }

    /* compiled from: MainContainerActivity.kt */
    /* loaded from: classes2.dex */
    public static final class g implements FlowCollector<HomeToolbars> {
        g() {
            MainContainerActivity.this = r1;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(HomeToolbars homeToolbars, zz.a<? super wz.p> aVar) {
            if (homeToolbars != null) {
                MainContainerActivity mainContainerActivity = MainContainerActivity.this;
                mainContainerActivity.h2(mainContainerActivity.q1(), homeToolbars);
            }
            return wz.p.f75480a;
        }
    }

    /* compiled from: MainContainerActivity.kt */
    /* loaded from: classes2.dex */
    static final class h implements NavController.b {
        h() {
            MainContainerActivity.this = r1;
        }

        @Override // androidx.navigation.NavController.b
        public final void a(NavController controller, NavDestination destination, Bundle bundle) {
            o.i(controller, "controller");
            o.i(destination, "destination");
            if (destination.q() == r0.N5) {
                com.forsale.app.utils.a.a(MainContainerActivity.this);
            } else {
                com.forsale.app.utils.a.b(MainContainerActivity.this);
            }
            MainContainerActivity.this.x0().F1(destination.q(), bundle);
        }
    }

    /* compiled from: MainContainerActivity.kt */
    /* loaded from: classes2.dex */
    static final class i implements androidx.activity.result.a<ActivityResult> {
        i() {
            MainContainerActivity.this = r1;
        }

        @Override // androidx.activity.result.a
        /* renamed from: b */
        public final void a(ActivityResult activityResult) {
            PLFResult a11;
            String b11;
            Intent a12 = activityResult.a();
            if (a12 != null && (a11 = PLFResult.f37812e.a(a12)) != null && (b11 = a11.b()) != null) {
                MainContainerActivity.this.q1().Y(e.a.f13304d.a(Uri.parse(b11)).a());
            }
        }
    }

    /* compiled from: MainContainerActivity.kt */
    /* loaded from: classes2.dex */
    public static final class j extends androidx.activity.o {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j() {
            super(true);
            MainContainerActivity.this = r1;
        }

        @Override // androidx.activity.o
        public void d() {
            boolean z11;
            if (!MainContainerActivity.this.E1() && !MainContainerActivity.this.D1()) {
                MainContainerActivity mainContainerActivity = MainContainerActivity.this;
                boolean z12 = false;
                if (mainContainerActivity.o1(MainContainerActivity.O0(mainContainerActivity).O.getSelectedItemId()) == MainContainerActivity.this.x0().f1().get()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                NavDestination F = MainContainerActivity.this.q1().F();
                if (F != null) {
                    z12 = MainContainerActivity.this.N.contains(Integer.valueOf(F.q()));
                }
                if (!z11 && z12) {
                    MainContainerActivity mainContainerActivity2 = MainContainerActivity.this;
                    HomeTabs homeTabs = mainContainerActivity2.x0().f1().get();
                    o.h(homeTabs, "get(...)");
                    mainContainerActivity2.i2(homeTabs);
                    return;
                } else if (z11 && z12) {
                    MainContainerActivity.this.i1();
                    return;
                } else {
                    MainContainerActivity.this.q1().h0();
                    return;
                }
            }
            MainContainerActivity.this.finishAndRemoveTask();
        }
    }

    public MainContainerActivity() {
        wz.h a11;
        wz.h a12;
        wz.h a13;
        wz.h a14;
        wz.h a15;
        wz.h a16;
        wz.h a17;
        wz.h a18;
        List<Integer> q11;
        a11 = kotlin.d.a(new g00.a<NavHostFragment>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$navHostFragment$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final NavHostFragment invoke() {
                Fragment k02 = MainContainerActivity.this.getSupportFragmentManager().k0(r0.f69849b6);
                o.g(k02, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
                return (NavHostFragment) k02;
            }
        });
        this.f31316x = a11;
        a12 = kotlin.d.a(new g00.a<NavController>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$navController$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final NavController invoke() {
                NavHostFragment r12;
                r12 = MainContainerActivity.this.r1();
                return r12.q();
            }
        });
        this.f31317y = a12;
        int i11 = r0.P5;
        this.f31318z = i11;
        a13 = kotlin.d.a(new g00.a<c4.d>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$appBarConfiguration$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final c4.d invoke() {
                Set c12;
                c12 = CollectionsKt___CollectionsKt.c1(MainContainerActivity.this.N);
                return new d.a(c12).c(null).b(new d(MainContainerActivity$appBarConfiguration$2$invoke$$inlined$AppBarConfiguration$default$1.f31319a)).a();
            }
        });
        this.A = a13;
        a14 = kotlin.d.a(new g00.a<Boolean>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$isDeviceBlocked$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Boolean invoke() {
                return Boolean.valueOf(MainContainerActivity.this.getIntent().getBooleanExtra("IS_DEVICE_BLOCKED", false));
            }
        });
        this.B = a14;
        a15 = kotlin.d.a(new g00.a<ListingsTypes>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$navigateToListings$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final ListingsTypes invoke() {
                Serializable serializableExtra = MainContainerActivity.this.getIntent().getSerializableExtra("NAVIGATE_TO_LISTINGS");
                if (serializableExtra == null || !(serializableExtra instanceof ListingsTypes)) {
                    return null;
                }
                return (ListingsTypes) serializableExtra;
            }
        });
        this.C = a15;
        a16 = kotlin.d.a(new g00.a<AnalyticsListingsSource>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$listingSource$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final AnalyticsListingsSource invoke() {
                Serializable serializableExtra = MainContainerActivity.this.getIntent().getSerializableExtra("LISTING_SOURCE");
                if (serializableExtra == null || !(serializableExtra instanceof AnalyticsListingsSource)) {
                    return null;
                }
                return (AnalyticsListingsSource) serializableExtra;
            }
        });
        this.D = a16;
        a17 = kotlin.d.a(new g00.a<HomeTabs>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$initialStackIndex$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final HomeTabs invoke() {
                HomeTabs j12;
                MainContainerActivity mainContainerActivity = MainContainerActivity.this;
                Intent intent = mainContainerActivity.getIntent();
                o.h(intent, "getIntent(...)");
                j12 = mainContainerActivity.j1(intent);
                return j12;
            }
        });
        this.E = a17;
        a18 = kotlin.d.a(new g00.a<ij.a>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$bottomToolTipCapsule$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final ij.a invoke() {
                return new ij.a(PopUpType.BOTTOM_BAR_TOOL_TIP, MainContainerActivity.this.x0().t1(), MainContainerActivity.this.x0().g1());
            }
        });
        this.F = a18;
        this.G = new com.forsale.app.features.auth.f(this);
        getLifecycle().a(MainContainerObserver.f31445a);
        this.I = new h();
        this.J = new NavigationBarView.b() { // from class: com.forsale.app.features.maincontainer.b
            @Override // com.google.android.material.navigation.NavigationBarView.b
            public final void a(MenuItem menuItem) {
                MainContainerActivity.S1(MainContainerActivity.this, menuItem);
            }
        };
        this.K = new NavigationBarView.c() { // from class: com.forsale.app.features.maincontainer.c
            @Override // com.google.android.material.navigation.NavigationBarView.c
            public final boolean a(MenuItem menuItem) {
                boolean T1;
                T1 = MainContainerActivity.T1(MainContainerActivity.this, menuItem);
                return T1;
            }
        };
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new i());
        o.h(registerForActivityResult, "registerForActivityResult(...)");
        this.M = registerForActivityResult;
        q11 = r.q(Integer.valueOf(i11), Integer.valueOf(r0.f70057r6), Integer.valueOf(r0.F6), Integer.valueOf(r0.W5), Integer.valueOf(r0.G8));
        this.N = q11;
    }

    private final void B1() {
        V1();
        x0().h1().h(this, new e());
        x0().m1().h(this, new f());
        LifeCycleUtilsKt.a(this, new MainContainerActivity$initializeObserver$3(this, null));
        LifeCycleUtilsKt.a(this, new MainContainerActivity$initializeObserver$4(this, null));
        LifeCycleUtilsKt.a(this, new MainContainerActivity$initializeObserver$5(this, null));
    }

    private final boolean C1() {
        return ((Boolean) this.B.getValue()).booleanValue();
    }

    public final boolean D1() {
        NavDestination F = q1().F();
        if (F == null || F.q() != r0.N0) {
            return false;
        }
        return true;
    }

    public final boolean E1() {
        NavDestination F = q1().F();
        if (F == null || F.q() != r0.N5) {
            return false;
        }
        return true;
    }

    private final boolean F1() {
        Integer num;
        NavGraph t11;
        NavDestination F = q1().F();
        Integer num2 = null;
        if (F != null) {
            num = Integer.valueOf(F.q());
        } else {
            num = null;
        }
        NavDestination F2 = q1().F();
        if (F2 != null && (t11 = F2.t()) != null) {
            num2 = Integer.valueOf(t11.S());
        }
        return o.d(num, num2);
    }

    private final boolean G1(CustomToolTips customToolTips) {
        if ((o.d(x0().f1().get().getTabId(), HomeTabs.INDEX_HOME.getTabId()) && customToolTips == CustomToolTips.HOME) || (o.d(x0().f1().get().getTabId(), HomeTabs.INDEX_OFFERS.getTabId()) && customToolTips == CustomToolTips.OFFERS)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [T, com.forsale.app.features.maincontainer.MainContainerActivity$SearchBarCompose$1] */
    public final void H0(final boolean z11, androidx.compose.runtime.a aVar, final int i11) {
        final String str;
        androidx.compose.runtime.a h11 = aVar.h(-575693258);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-575693258, i11, -1, "com.forsale.app.features.maincontainer.MainContainerActivity.SearchBarCompose (MainContainerActivity.kt:397)");
        }
        String str2 = (String) z.a(x0().l1(), p1.g.b(y0.f70773yd, h11, 0), null, h11, 8, 2).getValue();
        h11.C(680978804);
        if (str2 == null) {
            str2 = p1.g.b(y0.f70773yd, h11, 0);
        }
        h11.S();
        StateFlow<Boolean> k12 = x0().k1();
        Boolean bool = Boolean.FALSE;
        final boolean booleanValue = ((Boolean) z.a(k12, bool, null, h11, 56, 2).getValue()).booleanValue();
        final SearchSource searchSource = (SearchSource) z.a(x0().j1(), SearchSource.NONE, null, h11, 56, 2).getValue();
        if (!booleanValue) {
            str = "";
        } else {
            str = str2;
        }
        if (booleanValue) {
            str2 = "";
        }
        boolean booleanValue2 = ((Boolean) z.a(x0().d1(), bool, null, h11, 56, 2).getValue()).booleanValue();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (booleanValue2) {
            ref$ObjectRef.f61778a = new g00.a<wz.p>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$SearchBarCompose$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ wz.p invoke() {
                    invoke2();
                    return wz.p.f75480a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    MainContainerActivity.this.getOnBackPressedDispatcher().l();
                }
            };
        }
        if (ref$ObjectRef.f61778a != 0) {
            h11.C(680979515);
            SearchToolbarKt.a(null, str, new g00.a<wz.p>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$SearchBarCompose$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ wz.p invoke() {
                    invoke2();
                    return wz.p.f75480a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ref$ObjectRef.f61778a.invoke();
                }
            }, new g00.a<wz.p>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$SearchBarCompose$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ wz.p invoke() {
                    invoke2();
                    return wz.p.f75480a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    MainContainerActivity.this.U1(booleanValue, searchSource, str);
                }
            }, str2, 50, z11, h11, ((i11 << 18) & 3670016) | 196608, 1);
            h11.S();
        } else {
            h11.C(680979892);
            SearchToolbarKt.a(null, str, null, new g00.a<wz.p>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$SearchBarCompose$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ wz.p invoke() {
                    invoke2();
                    return wz.p.f75480a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    MainContainerActivity.this.U1(booleanValue, searchSource, str);
                }
            }, str2, 50, z11, h11, ((i11 << 18) & 3670016) | 196608, 5);
            h11.S();
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$SearchBarCompose$5
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    MainContainerActivity.this.H0(z11, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    public final void H1(AdsModel adsModel, boolean z11) {
        CommercialItemDetailsSource commercialItemDetailsSource;
        Context context = ((q) o0()).getRoot().getContext();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (z11) {
            commercialItemDetailsSource = CommercialItemDetailsSource.DIRECT_LINK;
        } else {
            commercialItemDetailsSource = CommercialItemDetailsSource.DEEP_LINK;
        }
        DetailsIntention detailsIntention = DetailsIntention.DETAILS_ONLY;
        o.f(context);
        l<CommercialPageSource, wz.p> lVar = new l<CommercialPageSource, wz.p>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$launchAdminDetails$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(CommercialPageSource commercialPageSource) {
                MainContainerActivity mainContainerActivity = MainContainerActivity.this;
                w wVar = w.f61809a;
                String string = MainContainerActivity.O0(mainContainerActivity).getRoot().getContext().getString(y0.I2);
                o.h(string, "getString(...)");
                String format = String.format(string, Arrays.copyOf(new Object[]{new com.google.gson.d().t(new CommercialModel(commercialPageSource, null, null, 6, null))}, 1));
                o.h(format, "format(...)");
                FCMTopLevelFunctionsKt.b(mainContainerActivity, Uri.parse(format).toString());
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(CommercialPageSource commercialPageSource) {
                b(commercialPageSource);
                return wz.p.f75480a;
            }
        };
        o.f(supportFragmentManager);
        NewDetailsBottomSheetKt.f(context, adsModel, lVar, null, supportFragmentManager, detailsIntention, commercialItemDetailsSource, null, null, 196, null);
    }

    public static /* synthetic */ void I1(MainContainerActivity mainContainerActivity, AdsModel adsModel, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        mainContainerActivity.H1(adsModel, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void K1(MainContainerActivity mainContainerActivity, HomeTabs homeTabs, l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        mainContainerActivity.J1(homeTabs, lVar);
    }

    public static final /* synthetic */ q O0(MainContainerActivity mainContainerActivity) {
        return (q) mainContainerActivity.o0();
    }

    public static /* synthetic */ void O1(MainContainerActivity mainContainerActivity, Integer num, AdsModel adsModel, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        if ((i11 & 2) != 0) {
            adsModel = null;
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        mainContainerActivity.N1(num, adsModel, z11);
    }

    private final void Q1(SplashFragment splashFragment) {
        int i11;
        HomeTabs homeTabs = x0().f1().get();
        if (homeTabs == null) {
            i11 = -1;
        } else {
            i11 = b.f31338a[homeTabs.ordinal()];
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        androidx.navigation.fragment.a.a(splashFragment).d0(com.forsale.app.features.welcome.loading.l.f37396a.d());
                        return;
                    }
                    return;
                }
                androidx.navigation.fragment.a.a(splashFragment).d0(com.forsale.app.features.welcome.loading.l.f37396a.e());
                return;
            }
            androidx.navigation.fragment.a.a(splashFragment).d0(com.forsale.app.features.welcome.loading.l.f37396a.c());
            return;
        }
        androidx.navigation.fragment.a.a(splashFragment).d0(com.forsale.app.features.welcome.loading.l.f37396a.b());
    }

    public static final void S1(MainContainerActivity this$0, MenuItem item) {
        NavDestination F;
        NavGraph t11;
        o.i(this$0, "this$0");
        o.i(item, "item");
        if (!this$0.F1() && (F = this$0.q1().F()) != null && (t11 = F.t()) != null) {
            int S = t11.S();
            if (this$0.e1()) {
                this$0.y1(item, S);
            } else {
                this$0.q1().S(S);
            }
        }
    }

    public static final boolean T1(MainContainerActivity this$0, MenuItem item) {
        o.i(this$0, "this$0");
        o.i(item, "item");
        if (item.getItemId() == r0.f69914g6) {
            b.a.a(this$0, null, 1, null);
            return false;
        }
        boolean e11 = c4.i.e(item, this$0.q1());
        if (!e11) {
            item.setChecked(true);
            return e11;
        }
        return e11;
    }

    public final void U1(boolean z11, SearchSource searchSource, String str) {
        NavDestination F = q1().F();
        if (F != null) {
            x0().C1(F.q(), z11);
        }
        if (searchSource == SearchSource.TRENDING_NO_SEARCH_RESULT) {
            b0(str);
        } else if (!z11 && searchSource != SearchSource.MATCHING_CATEGORIES) {
            w wVar = w.f61809a;
            String string = ((q) o0()).getRoot().getContext().getString(y0.R2);
            o.h(string, "getString(...)");
            String format = String.format(string, Arrays.copyOf(new Object[0], 0));
            o.h(format, "format(...)");
            FCMTopLevelFunctionsKt.b(this, Uri.parse(format).toString());
        } else {
            getOnBackPressedDispatcher().l();
        }
    }

    private final void V1() {
        LifeCycleUtilsKt.a(this, new MainContainerActivity$registerBadgeStates$1(this, null));
        LifeCycleUtilsKt.a(this, new MainContainerActivity$registerBadgeStates$2(this, null));
    }

    private final void W1() {
        getOnBackPressedDispatcher().i(this, new j());
    }

    private final void X1() {
        com.google.android.material.badge.a t12 = t1();
        if (t12 != null) {
            t12.Q(x0().o1().getValue().intValue());
            t12.P(2);
        }
    }

    private final void Y1() {
        ((q) o0()).R.setContent(r0.b.c(-115123733, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$renderTopBar$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar, int i11) {
                if ((i11 & 11) == 2 && aVar.i()) {
                    aVar.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-115123733, i11, -1, "com.forsale.app.features.maincontainer.MainContainerActivity.renderTopBar.<anonymous> (MainContainerActivity.kt:387)");
                }
                final MainContainerActivity mainContainerActivity = MainContainerActivity.this;
                ThemeKt.a(null, null, r0.b.b(aVar, 1589422658, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$renderTopBar$1.1
                    {
                        super(2);
                    }

                    private static final boolean c(n1<Boolean> n1Var) {
                        return n1Var.getValue().booleanValue();
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        if ((i12 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(1589422658, i12, -1, "com.forsale.app.features.maincontainer.MainContainerActivity.renderTopBar.<anonymous>.<anonymous> (MainContainerActivity.kt:388)");
                        }
                        n1 b11 = z.b(MainContainerActivity.this.x0().e1(), null, aVar2, 8, 1);
                        MainContainerActivity mainContainerActivity2 = MainContainerActivity.this;
                        aVar2.C(-483455358);
                        c.a aVar3 = androidx.compose.ui.c.f7566a;
                        a0 a11 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), aVar2, 0);
                        aVar2.C(-1323940314);
                        int a12 = j0.e.a(aVar2, 0);
                        j0.k s11 = aVar2.s();
                        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                        g00.a<ComposeUiNode> a13 = companion.a();
                        g00.q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(aVar3);
                        if (!(aVar2.k() instanceof j0.d)) {
                            j0.e.c();
                        }
                        aVar2.I();
                        if (aVar2.f()) {
                            aVar2.y(a13);
                        } else {
                            aVar2.t();
                        }
                        androidx.compose.runtime.a a14 = Updater.a(aVar2);
                        Updater.c(a14, a11, companion.e());
                        Updater.c(a14, s11, companion.g());
                        g00.p<ComposeUiNode, Integer, wz.p> b12 = companion.b();
                        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                            a14.u(Integer.valueOf(a12));
                            a14.p(Integer.valueOf(a12), b12);
                        }
                        c11.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                        aVar2.C(2058660585);
                        w.f fVar = w.f.f74891a;
                        mainContainerActivity2.H0(c(b11), aVar2, 64);
                        aVar2.S();
                        aVar2.w();
                        aVar2.S();
                        aVar2.S();
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return wz.p.f75480a;
                    }
                }), aVar, 384, 3);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
                b(aVar, num.intValue());
                return wz.p.f75480a;
            }
        }));
    }

    private final void a2(String str) {
        NavController q12 = q1();
        int i11 = t9.v0.f70353a;
        Bundle bundle = null;
        if (str != null) {
            bundle = new com.forsale.app.features.welcome.loading.k(str, false, 2, null).b();
        }
        q12.y0(i11, bundle);
    }

    private final void c2() {
        o00.f c11;
        NavGraph navGraph;
        Object obj;
        boolean z11;
        c11 = SequencesKt__SequencesKt.c(h0.a(q1().H().P()));
        Iterator it2 = c11.iterator();
        while (true) {
            navGraph = null;
            if (it2.hasNext()) {
                obj = it2.next();
                if (((NavDestination) obj).q() == r0.f69875d6) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NavDestination navDestination = (NavDestination) obj;
        if (navDestination != null) {
            if (navDestination instanceof NavGraph) {
                navGraph = (NavGraph) navDestination;
            }
            if (navGraph != null) {
                navGraph.V(this.f31318z);
            }
        }
    }

    private final void d2() {
        c4.c.a(this, q1(), k1());
    }

    private final boolean e1() {
        NavDestination F = q1().F();
        if (F == null || F.q() != r0.Y1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f1(com.forsale.app.features.auth.login.SignInIntention r10, final g00.a<wz.p> r11, zz.a<? super wz.p> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.forsale.app.features.maincontainer.MainContainerActivity$checkUserLoggedInThen$2
            if (r0 == 0) goto L13
            r0 = r12
            com.forsale.app.features.maincontainer.MainContainerActivity$checkUserLoggedInThen$2 r0 = (com.forsale.app.features.maincontainer.MainContainerActivity$checkUserLoggedInThen$2) r0
            int r1 = r0.f31347f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31347f = r1
            goto L18
        L13:
            com.forsale.app.features.maincontainer.MainContainerActivity$checkUserLoggedInThen$2 r0 = new com.forsale.app.features.maincontainer.MainContainerActivity$checkUserLoggedInThen$2
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f31345d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f31347f
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r10 = r0.f31344c
            r11 = r10
            g00.a r11 = (g00.a) r11
            java.lang.Object r10 = r0.f31343b
            com.forsale.app.features.auth.login.SignInIntention r10 = (com.forsale.app.features.auth.login.SignInIntention) r10
            java.lang.Object r0 = r0.f31342a
            com.forsale.app.features.maincontainer.MainContainerActivity r0 = (com.forsale.app.features.maincontainer.MainContainerActivity) r0
            kotlin.f.b(r12)
            goto L55
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            kotlin.f.b(r12)
            com.forsale.app.features.maincontainer.MainContainerViewModel r12 = r9.x0()
            r0.f31342a = r9
            r0.f31343b = r10
            r0.f31344c = r11
            r0.f31347f = r3
            java.lang.Object r12 = r12.z1(r0)
            if (r12 != r1) goto L54
            return r1
        L54:
            r0 = r9
        L55:
            r4 = r10
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r10 = r12.booleanValue()
            if (r10 == 0) goto L62
            r11.invoke()
            goto L73
        L62:
            com.forsale.app.features.auth.e r2 = r0.l1()
            com.forsale.app.utils.analytics.auth.AuthenticationSourcePage r3 = com.forsale.app.utils.analytics.auth.AuthenticationSourcePage.DEEP_LINK
            r5 = 0
            com.forsale.app.features.maincontainer.MainContainerActivity$checkUserLoggedInThen$3 r6 = new com.forsale.app.features.maincontainer.MainContainerActivity$checkUserLoggedInThen$3
            r6.<init>()
            r7 = 4
            r8 = 0
            com.forsale.app.features.auth.e.a.a(r2, r3, r4, r5, r6, r7, r8)
        L73:
            wz.p r10 = wz.p.f75480a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.maincontainer.MainContainerActivity.f1(com.forsale.app.features.auth.login.SignInIntention, g00.a, zz.a):java.lang.Object");
    }

    private final void f2() {
        SessionEntity.Greeting greeting = x0().c1().get();
        if (greeting != null) {
            q1().d0(j0.f69294a.a(greeting));
        }
    }

    public final void g1(HomeTabs homeTabs) {
        Menu menu = ((q) o0()).O.getMenu();
        o.h(menu, "getMenu(...)");
        int i11 = 0;
        for (MenuItem menuItem : androidx.core.view.v0.a(menu)) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                r.x();
            }
            MenuItem menuItem2 = menuItem;
            if (i11 != homeTabs.getIndex()) {
                menuItem2.setEnabled(false);
            }
            i11 = i12;
        }
    }

    public final void g2(CustomToolTips customToolTips, int i11) {
        boolean z11;
        BottomToolTipMapper bottomToolTipMapper = new BottomToolTipMapper(customToolTips, i11, this, x0().r());
        if (bottomToolTipMapper.i() && !G1(customToolTips)) {
            NavDestination F = q1().F();
            if (F != null && F.q() == r0.f70057r6) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                InitAnalytics.f20835a.q(Boolean.TRUE);
            }
            ((q) o0()).Q.setVisibility(0);
            bottomToolTipMapper.p(new g00.a<wz.p>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$showToolTips$1$1

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: MainContainerActivity.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerActivity$showToolTips$1$1$1", f = "MainContainerActivity.kt", l = {1098}, m = "invokeSuspend")
                /* renamed from: com.forsale.app.features.maincontainer.MainContainerActivity$showToolTips$1$1$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends SuspendLambda implements l<zz.a<? super wz.p>, Object> {

                    /* renamed from: a  reason: collision with root package name */
                    int f31443a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ MainContainerActivity f31444b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(MainContainerActivity mainContainerActivity, zz.a<? super AnonymousClass1> aVar) {
                        super(1, aVar);
                        this.f31444b = mainContainerActivity;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final zz.a<wz.p> create(zz.a<?> aVar) {
                        return new AnonymousClass1(this.f31444b, aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object f11;
                        f11 = kotlin.coroutines.intrinsics.b.f();
                        int i11 = this.f31443a;
                        if (i11 != 0) {
                            if (i11 == 1) {
                                kotlin.f.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            kotlin.f.b(obj);
                            MutableSharedFlow<wz.p> s12 = this.f31444b.x0().s1();
                            wz.p pVar = wz.p.f75480a;
                            this.f31443a = 1;
                            if (s12.emit(pVar, this) == f11) {
                                return f11;
                            }
                        }
                        return wz.p.f75480a;
                    }

                    @Override // g00.l
                    public final Object invoke(zz.a<? super wz.p> aVar) {
                        return ((AnonymousClass1) create(aVar)).invokeSuspend(wz.p.f75480a);
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ wz.p invoke() {
                    invoke2();
                    return wz.p.f75480a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    MainContainerActivity.O0(MainContainerActivity.this).Q.setVisibility(8);
                    MainContainerActivity mainContainerActivity = MainContainerActivity.this;
                    LifeCycleUtilsKt.a(mainContainerActivity, new AnonymousClass1(mainContainerActivity, null));
                }
            });
        }
    }

    public final void h1() {
        Menu menu = ((q) o0()).O.getMenu();
        o.h(menu, "getMenu(...)");
        int i11 = 0;
        for (MenuItem menuItem : androidx.core.view.v0.a(menu)) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                r.x();
            }
            menuItem.setEnabled(true);
            i11 = i12;
        }
    }

    public final void h2(NavController navController, HomeToolbars homeToolbars) {
        Toolbar toolbar;
        int i11 = b.f31339b[homeToolbars.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                toolbar = null;
                if (i11 != 3) {
                    if (i11 == 4) {
                        x0().u1(false);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    l2(homeToolbars);
                }
            } else {
                l2(homeToolbars);
                toolbar = ((q) o0()).T;
                toolbar.setNavigationIcon(q0.f69764j2);
            }
        } else {
            l2(homeToolbars);
            toolbar = ((q) o0()).U;
        }
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            d2();
        }
    }

    public final void i1() {
        String string = getString(y0.U3);
        o.h(string, "getString(...)");
        if (ContextExtensionsKt.f(this)) {
            c.a aVar = new c.a(this);
            aVar.p("");
            aVar.h(string);
            aVar.m(getString(y0.Z4), new c());
            aVar.j(getString(y0.I4), new d());
            aVar.d(false);
            aVar.q();
        }
    }

    public final HomeTabs j1(Intent intent) {
        HomeTabs homeTabs;
        Serializable serializableExtra = intent.getSerializableExtra("ACTIVITY_SELECT_TAB_ID");
        if (serializableExtra instanceof HomeTabs) {
            homeTabs = (HomeTabs) serializableExtra;
        } else {
            homeTabs = null;
        }
        if (homeTabs == null) {
            HomeTabs homeTabs2 = x0().f1().get();
            o.h(homeTabs2, "get(...)");
            return homeTabs2;
        }
        return homeTabs;
    }

    private final void j2(com.google.android.material.badge.a aVar, Integer num, Boolean bool) {
        if (num != null) {
            aVar.Q(num.intValue());
        }
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (num != null && num.intValue() == 0) {
                booleanValue = false;
            }
            aVar.R(booleanValue);
        }
    }

    private final c4.d k1() {
        return (c4.d) this.A.getValue();
    }

    public final void k2(Integer num, Boolean bool) {
        com.google.android.material.badge.a t12 = t1();
        if (t12 != null) {
            j2(t12, num, bool);
        }
    }

    private final void l2(HomeToolbars homeToolbars) {
        x0().u1(true);
        int i11 = b.f31339b[homeToolbars.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    ((q) o0()).U.setVisibility(8);
                    ((q) o0()).T.setVisibility(8);
                    ((q) o0()).R.setVisibility(0);
                    return;
                }
                return;
            }
            ((q) o0()).U.setVisibility(8);
            ((q) o0()).R.setVisibility(8);
            ((q) o0()).T.setVisibility(0);
            return;
        }
        ((q) o0()).T.setVisibility(8);
        ((q) o0()).R.setVisibility(8);
        ((q) o0()).U.setVisibility(0);
    }

    public final ij.a m1() {
        return (ij.a) this.F.getValue();
    }

    public final HomeTabs o1(int i11) {
        if (i11 == r0.f69875d6) {
            return HomeTabs.INDEX_HOME;
        }
        if (i11 == r0.f69888e6) {
            return HomeTabs.INDEX_OFFERS;
        }
        if (i11 == r0.f69927h6) {
            return HomeTabs.INDEX_SEARCH;
        }
        if (i11 == r0.f69901f6) {
            return HomeTabs.INDEX_PROFILE;
        }
        if (i11 == r0.f69914g6) {
            return HomeTabs.INDEX_POST_AD;
        }
        throw new IllegalStateException("Not supported tab index");
    }

    private final HomeTabs p1() {
        return (HomeTabs) this.E.getValue();
    }

    public final NavHostFragment r1() {
        return (NavHostFragment) this.f31316x.getValue();
    }

    private final com.google.android.material.badge.a t1() {
        com.google.android.material.badge.a e11 = ((q) o0()).O.e(r0.f69901f6);
        o.h(e11, "getOrCreateBadge(...)");
        return e11;
    }

    private final void w1(Intent intent, boolean z11) {
        Job launch$default;
        if (intent != null && intent.getData() != null) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(this, null, null, new MainContainerActivity$handleIntent$1$1(this, intent, z11, null), 3, null);
            if (launch$default != null) {
                return;
            }
        }
        d(null);
        wz.p pVar = wz.p.f75480a;
    }

    public final void x1(ListingsTypes listingsTypes, AnalyticsListingsSource analyticsListingsSource) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new MainContainerActivity$handleListingsNavigation$1(listingsTypes, this, null), 3, null);
    }

    private final void y1(MenuItem menuItem, final int i11) {
        int itemId = menuItem.getItemId();
        if (itemId == r0.f69875d6) {
            NavController q12 = q1();
            String string = getString(y0.f70765y5);
            o.h(string, "getString(...)");
            NavigationUtilsKt.b(q12, string, new l<androidx.navigation.i, wz.p>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$handleMenItemClickedFromListingsScreen$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(androidx.navigation.i navigateToDeepLink) {
                    o.i(navigateToDeepLink, "$this$navigateToDeepLink");
                    navigateToDeepLink.c(i11, new l<u, wz.p>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$handleMenItemClickedFromListingsScreen$1.1
                        public final void b(u popUpTo) {
                            o.i(popUpTo, "$this$popUpTo");
                            popUpTo.c(true);
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ wz.p invoke(u uVar) {
                            b(uVar);
                            return wz.p.f75480a;
                        }
                    });
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.navigation.i iVar) {
                    b(iVar);
                    return wz.p.f75480a;
                }
            });
            x0().J1(false);
        } else if (itemId == r0.f69927h6) {
            NavigationUtilsKt.d(q1(), com.forsale.app.features.categories.listings.category.b.f28671a.a(), null, 2, null);
            x0().J1(false);
        } else if (itemId == r0.f69888e6) {
            q1().S(r0.f69888e6);
            x0().J1(false);
        }
    }

    public final boolean z1() {
        NavDestination F = q1().F();
        if (F == null || F.q() != r0.N5) {
            return false;
        }
        return true;
    }

    @Override // uf.d
    public void A() {
        getIntent().setData(null);
    }

    public final void A1() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new MainContainerActivity$initMainContainerPrioritizer$1(this, null), 3, null);
    }

    @Override // uf.b
    public void B(String phoneNumber) {
        o.i(phoneNumber, "phoneNumber");
        Intent intent = getIntent();
        if (intent != null) {
            String string = getString(y0.f70749x5);
            o.h(string, "getString(...)");
            intent.setData(Uri.parse(string));
        }
        q1().N(getIntent());
    }

    @Override // uf.b
    public void D(String url) {
        o.i(url, "url");
        if (z1()) {
            i2(HomeTabs.INDEX_PROFILE);
        }
        WebActivity.a.d(WebActivity.I, this, WebType.DEEP_LINK, url, url, 0, null, 24, null);
    }

    @Override // uf.b
    public void E(Intent intent) {
        o.i(intent, "intent");
        HomeTabs homeTabs = x0().f1().get();
        o.h(homeTabs, "get(...)");
        i2(homeTabs);
        q1().N(intent);
    }

    @Override // uf.b
    public void H(AuthIntention intention) {
        o.i(intention, "intention");
        AuthActivity.f22470e.a(this, intention, AuthenticationSourcePage.DEEP_LINK);
    }

    @Override // uf.b
    public void J(String slug) {
        o.i(slug, "slug");
        if (z1()) {
            HomeTabs homeTabs = x0().f1().get();
            o.h(homeTabs, "get(...)");
            i2(homeTabs);
        }
        ListingDetailsActivity.R.a(this, (r33 & 1) != 0 ? null : null, (r33 & 2) != 0 ? null : null, (r33 & 4) != 0 ? -1 : 0, (r33 & 8) != 0 ? null : slug, (r33 & 16) != 0 ? ListingsTypes.NORMAL_LISTINGS : null, (r33 & 32) != 0 ? null : AnalyticsDetailsSource.DEEP_LINK.getValue(), (r33 & 64) != 0 ? null : null, (r33 & 128) != 0 ? null : null, (r33 & 256) != 0 ? null : null, (r33 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : null, (r33 & 1024) != 0 ? false : false, (r33 & RecyclerView.l.FLAG_MOVED) == 0 ? 0 : -1, (r33 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : null, (r33 & 8192) == 0 ? null : null, (r33 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r.n() : null);
    }

    public final void J1(HomeTabs tab, l<? super NavController, wz.p> lVar) {
        o.i(tab, "tab");
        i2(tab);
        if (lVar != null) {
            lVar.invoke(q1());
        }
    }

    @Override // uf.b
    public void K(String adUnit) {
        o.i(adUnit, "adUnit");
        x0().P1(adUnit);
    }

    @Override // uf.b
    public void L() {
        Intent intent = getIntent();
        if (intent != null) {
            String string = getString(y0.B5);
            o.h(string, "getString(...)");
            intent.setData(Uri.parse(string));
        }
        q1().N(getIntent());
    }

    public final void N1(Integer num, AdsModel adsModel, boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new MainContainerActivity$navigateToAdminListingDetails$1(this, num, adsModel, z11, null), 3, null);
    }

    public final void P1(SplashFragment splashFragment, boolean z11, SessionEntity sessionEntity) {
        o.i(splashFragment, "<this>");
        x0().I1(sessionEntity, z11);
        Q1(splashFragment);
        f2();
    }

    @Override // uf.b
    public void Q(String id2, CommercialItemDetailsSource commercialSource) {
        o.i(id2, "id");
        o.i(commercialSource, "commercialSource");
        i2(HomeTabs.INDEX_OFFERS);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        l<CommercialPageSource, wz.p> lVar = new l<CommercialPageSource, wz.p>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$openAdDialogueById$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(CommercialPageSource commercialPageSource) {
                MainContainerActivity mainContainerActivity = MainContainerActivity.this;
                FCMTopLevelFunctionsKt.b(mainContainerActivity, mainContainerActivity.getString(y0.H2));
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(CommercialPageSource commercialPageSource) {
                b(commercialPageSource);
                return wz.p.f75480a;
            }
        };
        o.f(supportFragmentManager);
        NewDetailsBottomSheetKt.h(this, id2, true, lVar, null, supportFragmentManager, null, commercialSource, null, null, 424, null);
    }

    public final void R1(int i11, String listingSource, ListingDetailsOwnerActions listingDetailsOwnerActions) {
        o.i(listingSource, "listingSource");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new MainContainerActivity$navigateToListingDetails$1(this, i11, listingSource, listingDetailsOwnerActions, null), 3, null);
    }

    @Override // uf.b
    public void S(String args) {
        o.i(args, "args");
        NavController q12 = q1();
        w wVar = w.f61809a;
        String string = getString(y0.I2);
        o.h(string, "getString(...)");
        String format = String.format(string, Arrays.copyOf(new Object[]{args}, 1));
        o.h(format, "format(...)");
        NavigationUtilsKt.a(q12, format);
    }

    @Override // uf.b
    public void V() {
        Intent intent = getIntent();
        if (intent != null) {
            String string = getString(y0.H5);
            o.h(string, "getString(...)");
            intent.setData(Uri.parse(string));
        }
        q1().N(getIntent());
    }

    @Override // uf.b
    public void Y() {
        Intent intent = getIntent();
        if (intent != null) {
            String string = getString(y0.A5);
            o.h(string, "getString(...)");
            intent.setData(Uri.parse(string));
        }
        q1().N(getIntent());
    }

    public final void Z1(Toolbar toolbar) {
        o.i(toolbar, "toolbar");
        setSupportActionBar(toolbar);
        d2();
    }

    @Override // uf.b
    public void a0() {
        HomeTabs homeTabs = x0().f1().get();
        o.h(homeTabs, "get(...)");
        i2(homeTabs);
    }

    @Override // uf.b
    public void b0(String str) {
        q1().d0(j0.c.c(j0.f69294a, str, false, null, 0, 14, null));
    }

    public final void b2(String str) {
        x0().K1(str);
    }

    @Override // uf.b
    public void c0(String url) {
        o.i(url, "url");
        if (z1()) {
            HomeTabs homeTabs = x0().f1().get();
            o.h(homeTabs, "get(...)");
            i2(homeTabs);
        }
        WebDialogFragment.a aVar = WebDialogFragment.C;
        WebModel webModel = new WebModel("", null, url, false, 10, null);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        o.h(supportFragmentManager, "getSupportFragmentManager(...)");
        aVar.a(webModel, true, supportFragmentManager, new g00.a<wz.p>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$navigateToVirtualTour$1
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ wz.p invoke() {
                invoke2();
                return wz.p.f75480a;
            }
        });
    }

    @Override // uf.d
    public void d(String str) {
        if (str != null) {
            A();
        }
        a2(str);
        c2();
        setSupportActionBar(((q) o0()).U);
        X1();
        q1().r(this.I);
        B1();
        if (C1()) {
            g1(p1());
        }
        BottomNavigationView bottomNavigationView = ((q) o0()).O;
        o.h(bottomNavigationView, "bottomNavigationView");
        c4.f.a(bottomNavigationView, q1());
        bottomNavigationView.setOnItemReselectedListener(this.J);
        bottomNavigationView.setOnItemSelectedListener(this.K);
        x0().n1().h(this, new g());
    }

    public final void e2(boolean z11) {
        x0().S0(z11);
    }

    @Override // uf.b
    public void f(AdsModel adsModel, boolean z11) {
        o.i(adsModel, "adsModel");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new MainContainerActivity$navigateToAdminListingDetails$2(this, adsModel, z11, null), 3, null);
    }

    @Override // uf.b
    public void g() {
        i2(HomeTabs.INDEX_PROFILE);
    }

    @Override // uf.b
    public void h(final com.forsale.app.routing.deeplinks.processors.b categoryDeepLinkNavigation) {
        o.i(categoryDeepLinkNavigation, "categoryDeepLinkNavigation");
        if (categoryDeepLinkNavigation instanceof b.C0433b) {
            J1(HomeTabs.INDEX_HOME, new l<NavController, wz.p>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$navigateToCategoryScreen$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(NavController navC) {
                    o.i(navC, "navC");
                    NavigationUtilsKt.d(navC, a.c.b(com.forsale.app.features.categories.home.maincategories.a.f24404a, ((b.C0433b) com.forsale.app.routing.deeplinks.processors.b.this).a(), null, new CategoryListingsAnalyticSource.DirectLink(null, 1, null), null, null, ((b.C0433b) com.forsale.app.routing.deeplinks.processors.b.this).b(), null, null, false, 474, null), null, 2, null);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(NavController navController) {
                    b(navController);
                    return wz.p.f75480a;
                }
            });
        } else if (categoryDeepLinkNavigation instanceof b.a) {
            J1(HomeTabs.INDEX_HOME, new l<NavController, wz.p>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$navigateToCategoryScreen$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(NavController navC) {
                    o.i(navC, "navC");
                    w wVar = w.f61809a;
                    Locale locale = Locale.ENGLISH;
                    String string = MainContainerActivity.this.getResources().getString(y0.f70733w5);
                    o.h(string, "getString(...)");
                    String format = String.format(locale, string, Arrays.copyOf(new Object[]{Integer.valueOf(((b.a) categoryDeepLinkNavigation).a())}, 1));
                    o.h(format, "format(...)");
                    NavigationUtilsKt.a(navC, format);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(NavController navController) {
                    b(navController);
                    return wz.p.f75480a;
                }
            });
        }
    }

    public final void i2(HomeTabs tab) {
        o.i(tab, "tab");
        View childAt = ((q) o0()).O.getChildAt(0);
        o.g(childAt, "null cannot be cast to non-null type com.google.android.material.bottomnavigation.BottomNavigationMenuView");
        int id2 = ((com.google.android.material.bottomnavigation.b) childAt).getChildAt(tab.getIndex()).getId();
        if (((q) o0()).O.getSelectedItemId() != id2) {
            ((q) o0()).O.setSelectedItemId(id2);
        }
    }

    public final com.forsale.app.features.auth.e l1() {
        return this.G.d(this, P[0]);
    }

    public final cx.a<vf.c> n1() {
        cx.a<vf.c> aVar = this.H;
        if (aVar != null) {
            return aVar;
        }
        o.w("deepLinksDelegator");
        return null;
    }

    @Override // uf.b
    public void o(AuthenticationSourcePage page, SignInIntention signInIntention, g00.a<wz.p> action) {
        o.i(page, "page");
        o.i(action, "action");
        e.a.a(l1(), page, signInIntention, null, action, 4, null);
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        Serializable serializable;
        Bundle extras;
        super.onActivityResult(i11, i12, intent);
        if (i12 == -1 && i11 == 1000) {
            if (intent != null && (extras = intent.getExtras()) != null) {
                serializable = extras.getSerializable("LISTING_SOURCE");
            } else {
                serializable = null;
            }
            if (serializable instanceof AnalyticsListingsSource) {
                AnalyticsListingsSource analyticsListingsSource = (AnalyticsListingsSource) serializable;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.features.maincontainer.a, com.forsale.app.base.activities.BaseViewModelActivity, com.forsale.app.base.activities.BasePlainActivity, androidx.fragment.app.p, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        Trace e11 = cp.e.e("appStart_onCreate_activity_mainContainer");
        u2.c.f73502b.a(this);
        super.onCreate(bundle);
        W1();
        Y1();
        w1(getIntent(), false);
        e11.stop();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.features.maincontainer.a, com.forsale.app.base.activities.BaseViewModelActivity, com.forsale.app.base.activities.BasePlainActivity, androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        q1().t0(this.I);
        BuildersKt__Builders_commonKt.launch$default(t.a(this), null, null, new MainContainerActivity$onDestroy$1(this, null), 3, null);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        wz.p pVar;
        final Uri data;
        if (intent != null && (data = intent.getData()) != null) {
            CrashlyticsUtilsKt.a("MainContainerActivity-onNewIntent", new l<tn.b, wz.p>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$onNewIntent$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(tn.b logScreenVisited) {
                    o.i(logScreenVisited, "$this$logScreenVisited");
                    String uri = data.toString();
                    o.h(uri, "toString(...)");
                    logScreenVisited.b(Constants.DEEPLINK, uri);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(tn.b bVar) {
                    b(bVar);
                    return wz.p.f75480a;
                }
            });
            intent.addFlags(268468224);
            super.onNewIntent(intent);
            w1(intent, true);
            pVar = wz.p.f75480a;
        } else {
            pVar = null;
        }
        if (pVar == null) {
            super.onNewIntent(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BaseViewModelActivity, androidx.fragment.app.p, android.app.Activity
    public void onResume() {
        NavDestination F = q1().F();
        if (F != null) {
            x0().F1(F.q(), null);
        }
        x0().S1();
        super.onResume();
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    public void onStart() {
        super.onStart();
        if (u0()) {
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new MainContainerActivity$onStart$1(this, null), 3, null);
        }
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    public void onStop() {
        super.onStop();
        BuildersKt__Builders_commonKt.launch$default(t.a(this), null, null, new MainContainerActivity$onStop$1(this, null), 3, null);
    }

    @Override // androidx.appcompat.app.d
    public boolean onSupportNavigateUp() {
        if (!super.onSupportNavigateUp() && !q1().h0()) {
            return false;
        }
        return true;
    }

    @Override // com.forsale.app.base.activities.BasePlainActivity
    public int p0() {
        return this.f31314i;
    }

    public final NavController q1() {
        return (NavController) this.f31317y.getValue();
    }

    @Override // uf.b
    public void s(PLFSource pLFSource) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new MainContainerActivity$navigateToPostListing$1(this, pLFSource, null), 3, null);
    }

    public final cx.a<ag.a> s1() {
        cx.a<ag.a> aVar = this.L;
        if (aVar != null) {
            return aVar;
        }
        o.w("plfOperator");
        return null;
    }

    public final Toolbar u1() {
        Toolbar subCategoriesToolbar = ((q) o0()).T;
        o.h(subCategoriesToolbar, "subCategoriesToolbar");
        return subCategoriesToolbar;
    }

    @Override // com.forsale.app.base.activities.BaseViewModelActivity
    /* renamed from: v1 */
    public MainContainerViewModel x0() {
        return (MainContainerViewModel) this.f31315j.getValue();
    }

    @Override // uf.b
    public void w() {
        J1(HomeTabs.INDEX_PROFILE, new l<NavController, wz.p>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$navigateToPayment$1
            public final void b(NavController it2) {
                o.i(it2, "it");
                NavigationUtilsKt.d(it2, com.forsale.app.features.more.user.profile.b.f33670a.j(false, PostListingIntention.NON.getValue()), null, 2, null);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(NavController navController) {
                b(navController);
                return wz.p.f75480a;
            }
        });
    }

    @Override // uf.b
    public void x() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new MainContainerActivity$navigateToListingsRealty$1(this, null), 3, null);
    }

    @Override // uf.b
    public void y(Intent intent) {
        boolean z11;
        String uri;
        Object obj;
        SplashFragment splashFragment;
        AtomicBoolean V;
        o.i(intent, "intent");
        NavDestination F = q1().F();
        boolean z12 = true;
        if (F != null && F.q() == r0.N5) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            List<Fragment> A0 = r1().getChildFragmentManager().A0();
            o.h(A0, "getFragments(...)");
            Iterator<T> it2 = A0.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    if (((Fragment) obj).isVisible()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (!(((Fragment) obj) instanceof SplashFragment)) {
                obj = null;
            }
            Fragment fragment = (Fragment) obj;
            if (fragment instanceof SplashFragment) {
                splashFragment = (SplashFragment) fragment;
            } else {
                splashFragment = null;
            }
            if (splashFragment == null || (V = splashFragment.V()) == null || !(!V.get())) {
                z12 = false;
            }
            if (z12) {
                d(String.valueOf(intent.getData()));
                return;
            }
        }
        Uri data = intent.getData();
        if (data != null && (uri = data.toString()) != null) {
            BuildersKt__Builders_commonKt.launch$default(t.a(this), null, null, new MainContainerActivity$navigateToIntent$4$1(this, uri, intent, null), 3, null);
        }
    }

    /* compiled from: ViewsExtensions.kt */
    /* loaded from: classes2.dex */
    public static final class d implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i11) {
        }
    }
}
