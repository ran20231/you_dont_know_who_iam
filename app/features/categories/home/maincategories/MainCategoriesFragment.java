package com.forsale.app.features.categories.home.maincategories;

import aa.y7;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.k0;
import androidx.lifecycle.l;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.adserver.view.composeViews.commercialList.CommercialHorizontalListKt;
import com.forsale.adserver.view.models.AdGeneralModel;
import com.forsale.adserver.view.models.AdType;
import com.forsale.adserver.view.models.AdsModel;
import com.forsale.adserver.view.models.CommercialModel;
import com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheetKt;
import com.forsale.analytics.commercial.CommercialItemDetailsSource;
import com.forsale.analytics.commercial.CommercialPageSource;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.features.categories.home.CategoriesNavGraphViewModel;
import com.forsale.app.features.categories.home.ContinueBrowsingUiKt;
import com.forsale.app.features.categories.home.allverticals.f;
import com.forsale.app.features.categories.home.maincategories.MainCategoriesViewModel;
import com.forsale.app.features.categories.home.maincategories.a;
import com.forsale.app.features.categories.home.maincategories.ui.EnterpriseBannerKt;
import com.forsale.app.features.categories.home.maincategories.ui.HomeVerticalSectionsKt;
import com.forsale.app.features.categories.home.maincategories.ui.VerticalListViewKt;
import com.forsale.app.features.categories.listingdetails.ListingDetailsActivity;
import com.forsale.app.features.categories.listingdetails.ListingDetailsAnalyticSource;
import com.forsale.app.features.categories.listingdetails.ListingDetailsOwnerActions;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.maincontainer.MainContainerActivity;
import com.forsale.app.features.search.SearchAnalyticsData;
import com.forsale.app.utils.CrashlyticsUtilsKt;
import com.forsale.app.utils.FragmentsExtensionsKt;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.NavigationUtilsKt;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedNavGraphViewModel$$inlined$navGraphViewModels$default$1;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedNavGraphViewModel$$inlined$navGraphViewModels$default$2;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedNavGraphViewModel$$inlined$navGraphViewModels$default$3;
import com.forsale.app.utils.analytics.AnalyticsDetailsSource;
import com.forsale.app.utils.analytics.SearchSource;
import com.forsale.app.utils.analytics.SourceSectionName;
import com.forsale.app.utils.analytics.SubCategoriesPosition;
import com.forsale.designSystem.theme.ThemeKt;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import g00.p;
import j0.d1;
import j0.e1;
import j0.k;
import j0.n1;
import j0.v0;
import java.util.Arrays;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.d;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import oa.g;
import okhttp3.internal.http2.Http2;
import r0.b;
import t9.r0;
import t9.t0;
import t9.y0;
import tv.teads.sdk.engine.bridges.network.NetworkResponse;
import w3.a;
import wz.h;
import z3.n;
/* compiled from: MainCategoriesFragment.kt */
/* loaded from: classes2.dex */
public final class MainCategoriesFragment extends va.a<y7, MainCategoriesViewModel> {
    private final int A = t0.A1;
    private final h B;
    public CategoriesNavGraphViewModel.b C;
    private final h D;

    public MainCategoriesFragment() {
        final h b11;
        h a11;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) g00.a.this.invoke();
            }
        });
        this.B = FragmentViewModelLazyKt.b(this, s.b(MainCategoriesViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w0 invoke() {
                x0 c11;
                c11 = FragmentViewModelLazyKt.c(h.this);
                return c11.getViewModelStore();
            }
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w3.a invoke() {
                x0 c11;
                l lVar;
                w3.a aVar2;
                g00.a aVar3 = g00.a.this;
                if (aVar3 == null || (aVar2 = (w3.a) aVar3.invoke()) == null) {
                    c11 = FragmentViewModelLazyKt.c(b11);
                    if (c11 instanceof l) {
                        lVar = (l) c11;
                    } else {
                        lVar = null;
                    }
                    if (lVar != null) {
                        return lVar.getDefaultViewModelCreationExtras();
                    }
                    return a.C0905a.f75031b;
                }
                return aVar2;
            }
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final t0.b invoke() {
                x0 c11;
                l lVar;
                t0.b defaultViewModelProviderFactory;
                c11 = FragmentViewModelLazyKt.c(b11);
                if (c11 instanceof l) {
                    lVar = (l) c11;
                } else {
                    lVar = null;
                }
                if (lVar == null || (defaultViewModelProviderFactory = lVar.getDefaultViewModelProviderFactory()) == null) {
                    t0.b defaultViewModelProviderFactory2 = Fragment.this.getDefaultViewModelProviderFactory();
                    o.h(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                    return defaultViewModelProviderFactory2;
                }
                return defaultViewModelProviderFactory;
            }
        });
        int i11 = r0.f69875d6;
        g00.a<t0.b> aVar2 = new g00.a<t0.b>() { // from class: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$special$$inlined$assistedNavGraphViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ MainCategoriesFragment f24267f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, MainCategoriesFragment mainCategoriesFragment) {
                    super(fragment, bundle);
                    this.f24267f = mainCategoriesFragment;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    CategoriesNavGraphViewModel a11 = this.f24267f.c0().a(handle);
                    o.g(a11, "null cannot be cast to non-null type T of com.forsale.app.utils.ViewModelHiltExtensionKt.assistedNavGraphViewModel.<no name provided>.invoke.<no name provided>.create");
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
                return new a(Fragment.this, Fragment.this.getArguments(), this);
            }
        };
        a11 = d.a(new ViewModelHiltExtensionKt$assistedNavGraphViewModel$$inlined$navGraphViewModels$default$1(this, i11));
        this.D = FragmentViewModelLazyKt.b(this, s.b(CategoriesNavGraphViewModel.class), new ViewModelHiltExtensionKt$assistedNavGraphViewModel$$inlined$navGraphViewModels$default$2(a11), new ViewModelHiltExtensionKt$assistedNavGraphViewModel$$inlined$navGraphViewModels$default$3(null, a11), aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(final f fVar, final f fVar2, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(-1400013458);
        if (c.I()) {
            c.U(-1400013458, i11, -1, "com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment.Q8CarSections (MainCategoriesFragment.kt:190)");
        }
        if (c.I()) {
            c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$Q8CarSections$5
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    MainCategoriesFragment.this.K(fVar, fVar2, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    private final void a0() {
        LifeCycleUtilsKt.b(this, new MainCategoriesFragment$bindObservers$1(this, null));
        LifeCycleUtilsKt.b(this, new MainCategoriesFragment$bindObservers$2(this, null));
        LifeCycleUtilsKt.b(this, new MainCategoriesFragment$bindObservers$3(this, null));
        LifeCycleUtilsKt.b(this, new MainCategoriesFragment$bindObservers$4(this, null));
        LifeCycleUtilsKt.b(this, new MainCategoriesFragment$bindObservers$5(this, null));
        LifeCycleUtilsKt.b(this, new MainCategoriesFragment$bindObservers$6(this, null));
        LifeCycleUtilsKt.b(this, new MainCategoriesFragment$bindObservers$7(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CategoriesNavGraphViewModel b0() {
        return (CategoriesNavGraphViewModel) this.D.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0(CommercialModel commercialModel) {
        NavController a11 = androidx.navigation.fragment.a.a(this);
        w wVar = w.f61809a;
        String string = getString(y0.I2);
        o.h(string, "getString(...)");
        String format = String.format(string, Arrays.copyOf(new Object[]{new com.google.gson.d().t(commercialModel)}, 1));
        o.h(format, "format(...)");
        NavigationUtilsKt.a(a11, format);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(int i11, AnalyticsDetailsSource analyticsDetailsSource, ListingDetailsOwnerActions listingDetailsOwnerActions) {
        if (getActivity() instanceof MainContainerActivity) {
            androidx.fragment.app.p activity = getActivity();
            o.g(activity, "null cannot be cast to non-null type com.forsale.app.features.maincontainer.MainContainerActivity");
            ((MainContainerActivity) activity).R1(i11, analyticsDetailsSource.getValue(), listingDetailsOwnerActions);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void g0(MainCategoriesFragment mainCategoriesFragment, int i11, AnalyticsDetailsSource analyticsDetailsSource, ListingDetailsOwnerActions listingDetailsOwnerActions, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            listingDetailsOwnerActions = null;
        }
        mainCategoriesFragment.f0(i11, analyticsDetailsSource, listingDetailsOwnerActions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n h0(CategoryEntity categoryEntity, GetListingsBody.FiltrationData filtrationData, SearchAnalyticsData searchAnalyticsData) {
        n f11 = a.c.f(a.f24404a, categoryEntity, categoryEntity.getName(), null, null, null, filtrationData, SearchSource.SEARCH_BREADCRUMBS, searchAnalyticsData, false, 284, null);
        FragmentsExtensionsKt.a(this, f11);
        return f11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ n i0(MainCategoriesFragment mainCategoriesFragment, CategoryEntity categoryEntity, GetListingsBody.FiltrationData filtrationData, SearchAnalyticsData searchAnalyticsData, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            filtrationData = null;
        }
        if ((i11 & 4) != 0) {
            searchAnalyticsData = null;
        }
        return mainCategoriesFragment.h0(categoryEntity, filtrationData, searchAnalyticsData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n j0(CategoryEntity categoryEntity, SubCategoriesPosition subCategoriesPosition) {
        n d11 = a.c.d(a.f24404a, categoryEntity, null, null, 6, null);
        FragmentsExtensionsKt.a(this, d11);
        return d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0(CategoryEntity categoryEntity) {
        FragmentsExtensionsKt.a(this, a.c.d(a.f24404a, categoryEntity, null, null, 6, null));
    }

    public final void H(final boolean z11, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(961704131);
        if (c.I()) {
            c.U(961704131, i11, -1, "com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment.CommercialList (MainCategoriesFragment.kt:276)");
        }
        CommercialHorizontalListKt.a(null, null, null, z11, null, new p<AdGeneralModel, com.forsale.adserver.view.screens.detailsScreen.a, wz.p>() { // from class: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$CommercialList$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(AdGeneralModel ad2, com.forsale.adserver.view.screens.detailsScreen.a commercialAnalyticPayload) {
                o.i(ad2, "ad");
                o.i(commercialAnalyticPayload, "commercialAnalyticPayload");
                Context requireContext = MainCategoriesFragment.this.requireContext();
                CommercialItemDetailsSource commercialItemDetailsSource = CommercialItemDetailsSource.HOME_SCREEN_COMMERCIAL;
                AdsModel s11 = AdGeneralModel.s(ad2, null, AdType.OFFER, null, null, 12, null);
                FragmentManager childFragmentManager = MainCategoriesFragment.this.getChildFragmentManager();
                o.f(requireContext);
                final MainCategoriesFragment mainCategoriesFragment = MainCategoriesFragment.this;
                g00.l<CommercialPageSource, wz.p> lVar = new g00.l<CommercialPageSource, wz.p>() { // from class: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$CommercialList$1.1
                    {
                        super(1);
                    }

                    public final void b(CommercialPageSource commercialPageSource) {
                        MainCategoriesFragment.this.e0(new CommercialModel(commercialPageSource, null, null, 6, null));
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ wz.p invoke(CommercialPageSource commercialPageSource) {
                        b(commercialPageSource);
                        return wz.p.f75480a;
                    }
                };
                o.f(childFragmentManager);
                NewDetailsBottomSheetKt.f(requireContext, s11, lVar, null, childFragmentManager, null, commercialItemDetailsSource, commercialAnalyticPayload, null, 148, null);
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(AdGeneralModel adGeneralModel, com.forsale.adserver.view.screens.detailsScreen.a aVar2) {
                b(adGeneralModel, aVar2);
                return wz.p.f75480a;
            }
        }, new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$CommercialList$2
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
                MainCategoriesFragment.this.e0(new CommercialModel(CommercialPageSource.HOME_PAGE, null, null, 6, null));
            }
        }, h11, (i11 << 9) & 7168, 23);
        if (c.I()) {
            c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$CommercialList$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    MainCategoriesFragment.this.H(z11, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    public final void I(final boolean z11, final List<com.forsale.app.domainlayer.interactors.categoriesinteractors.a> verticalSections, final AdManagerAdRequest enterpriseBannerRequest, final g gVar, final f autoFeaturedSection, final f businessSection, androidx.compose.runtime.a aVar, final int i11) {
        o.i(verticalSections, "verticalSections");
        o.i(enterpriseBannerRequest, "enterpriseBannerRequest");
        o.i(autoFeaturedSection, "autoFeaturedSection");
        o.i(businessSection, "businessSection");
        androidx.compose.runtime.a h11 = aVar.h(1578774433);
        if (c.I()) {
            c.U(1578774433, i11, -1, "com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment.Content (MainCategoriesFragment.kt:171)");
        }
        int i12 = (i11 & 14) | 64;
        M(z11, h11, i12);
        ContinueBrowsingUiKt.a(z11, gVar, new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$Content$1
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
                g gVar2 = g.this;
                if (gVar2 != null) {
                    this.h0(gVar2.a(), gVar2.b(), gVar2.c());
                }
            }
        }, h11, i12);
        int i13 = (i11 << 3) & 112;
        EnterpriseBannerKt.a(enterpriseBannerRequest, z11, h11, i13 | 8);
        int i14 = i11 >> 12;
        K(autoFeaturedSection, businessSection, h11, (i14 & 112) | (i14 & 14) | AdRequest.MAX_CONTENT_URL_LENGTH);
        H(z11, h11, i12);
        L(0.0f, 0L, z11, h11, ((i11 << 6) & 896) | RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT, 3);
        J(verticalSections, z11, h11, i13 | NetworkResponse.UNKNOWN_ERROR_CODE);
        if (c.I()) {
            c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$Content$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i15) {
                    MainCategoriesFragment.this.I(z11, verticalSections, enterpriseBannerRequest, gVar, autoFeaturedSection, businessSection, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    public final void J(final List<com.forsale.app.domainlayer.interactors.categoriesinteractors.a> verticalSections, final boolean z11, androidx.compose.runtime.a aVar, final int i11) {
        boolean z12;
        boolean z13;
        o.i(verticalSections, "verticalSections");
        androidx.compose.runtime.a h11 = aVar.h(-627766990);
        if (c.I()) {
            c.U(-627766990, i11, -1, "com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment.HomeSections (MainCategoriesFragment.kt:293)");
        }
        h11.C(-897249631);
        int i12 = 16;
        int i13 = 8;
        if (z11) {
            int i14 = 0;
            while (i14 < 3) {
                HomeVerticalSectionsKt.a(i14, null, null, null, null, null, null, null, null, h11, 48, 508);
                int i15 = i14 + 1;
                if (i15 == 3) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                L(e2.h.l(z13 ? i12 : i13), 0L, false, h11, RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT, 6);
                i14 = i15;
                i13 = i13;
                h11 = h11;
                i12 = 16;
            }
        }
        int i16 = i13;
        androidx.compose.runtime.a aVar2 = h11;
        aVar2.S();
        if (!z11) {
            List<com.forsale.app.domainlayer.interactors.categoriesinteractors.a> list = verticalSections;
            if (!list.isEmpty()) {
                final int i17 = 0;
                for (Object obj : verticalSections) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        r.x();
                    }
                    final com.forsale.app.domainlayer.interactors.categoriesinteractors.a aVar3 = (com.forsale.app.domainlayer.interactors.categoriesinteractors.a) obj;
                    int i19 = i16;
                    HomeVerticalSectionsKt.a(i17, aVar3, new g00.l<VerticalSectionsTabs, wz.p>() { // from class: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$HomeSections$2$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void b(VerticalSectionsTabs it2) {
                            o.i(it2, "it");
                            MainCategoriesFragment.this.B().S0(i17, it2);
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ wz.p invoke(VerticalSectionsTabs verticalSectionsTabs) {
                            b(verticalSectionsTabs);
                            return wz.p.f75480a;
                        }
                    }, new p<AdGeneralModel, com.forsale.adserver.view.screens.detailsScreen.a, wz.p>() { // from class: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$HomeSections$2$2
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void b(AdGeneralModel ad2, final com.forsale.adserver.view.screens.detailsScreen.a commercialAnalyticPayload) {
                            List e11;
                            o.i(ad2, "ad");
                            o.i(commercialAnalyticPayload, "commercialAnalyticPayload");
                            Context requireContext = MainCategoriesFragment.this.requireContext();
                            AdsModel s11 = AdGeneralModel.s(ad2, null, AdType.OFFER, null, null, 12, null);
                            CommercialItemDetailsSource commercialItemDetailsSource = CommercialItemDetailsSource.HOME_SCREEN_RECOMMENDATION;
                            e11 = q.e(Integer.valueOf(aVar3.c().getId()));
                            FragmentManager childFragmentManager = MainCategoriesFragment.this.getChildFragmentManager();
                            o.f(requireContext);
                            final MainCategoriesFragment mainCategoriesFragment = MainCategoriesFragment.this;
                            final com.forsale.app.domainlayer.interactors.categoriesinteractors.a aVar4 = aVar3;
                            g00.l<CommercialPageSource, wz.p> lVar = new g00.l<CommercialPageSource, wz.p>() { // from class: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$HomeSections$2$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                public final void b(CommercialPageSource commercialPageSource) {
                                    MainCategoriesFragment.this.e0(new CommercialModel(commercialPageSource, commercialAnalyticPayload.h(), aVar4.c().getNameEn()));
                                }

                                @Override // g00.l
                                public /* bridge */ /* synthetic */ wz.p invoke(CommercialPageSource commercialPageSource) {
                                    b(commercialPageSource);
                                    return wz.p.f75480a;
                                }
                            };
                            o.f(childFragmentManager);
                            NewDetailsBottomSheetKt.f(requireContext, s11, lVar, e11, childFragmentManager, null, commercialItemDetailsSource, commercialAnalyticPayload, null, 144, null);
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ wz.p invoke(AdGeneralModel adGeneralModel, com.forsale.adserver.view.screens.detailsScreen.a aVar4) {
                            b(adGeneralModel, aVar4);
                            return wz.p.f75480a;
                        }
                    }, new g00.l<Boolean, wz.p>() { // from class: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$HomeSections$2$3
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void b(Boolean bool) {
                            MainCategoriesFragment.this.e0(new CommercialModel(CommercialPageSource.COMMERCIAL_ADS_CAROUSEL, bool, aVar3.c().getNameEn()));
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ wz.p invoke(Boolean bool) {
                            b(bool);
                            return wz.p.f75480a;
                        }
                    }, new g00.l<CategoryEntity, wz.p>() { // from class: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$HomeSections$2$4
                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            super(1);
                        }

                        public final void b(CategoryEntity it2) {
                            CategoriesNavGraphViewModel b02;
                            o.i(it2, "it");
                            b02 = MainCategoriesFragment.this.b0();
                            b02.O0(it2);
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ wz.p invoke(CategoryEntity categoryEntity) {
                            b(categoryEntity);
                            return wz.p.f75480a;
                        }
                    }, new g00.r<ListingItemBrief, Integer, Integer, List<? extends Integer>, wz.p>() { // from class: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$HomeSections$2$5
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(4);
                        }

                        public final void b(ListingItemBrief listing, int i21, int i22, List<Integer> swipingIds) {
                            o.i(listing, "listing");
                            o.i(swipingIds, "swipingIds");
                            ListingDetailsActivity.a aVar4 = ListingDetailsActivity.R;
                            Context requireContext = MainCategoriesFragment.this.requireContext();
                            o.h(requireContext, "requireContext(...)");
                            int i23 = i17 + 1;
                            aVar4.a(requireContext, (r33 & 1) != 0 ? null : listing, (r33 & 2) != 0 ? null : null, (r33 & 4) != 0 ? -1 : 0, (r33 & 8) != 0 ? null : null, (r33 & 16) != 0 ? ListingsTypes.NORMAL_LISTINGS : null, (r33 & 32) != 0 ? null : null, (r33 & 64) != 0 ? null : null, (r33 & 128) != 0 ? null : null, (r33 & 256) != 0 ? null : new ListingDetailsAnalyticSource.HomePageRecommendedVertical(Integer.valueOf(i23), Integer.valueOf(i21), MainCategoriesFragment.this.B().K0(), Integer.valueOf(i22), SourceSectionName.HOME_RECOMMENDED_VERTICAL), (r33 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : null, (r33 & 1024) != 0 ? false : false, (r33 & RecyclerView.l.FLAG_MOVED) == 0 ? i21 : -1, (r33 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : null, (r33 & 8192) == 0 ? null : null, (r33 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r.n() : swipingIds);
                        }

                        @Override // g00.r
                        public /* bridge */ /* synthetic */ wz.p d(ListingItemBrief listingItemBrief, Integer num, Integer num2, List<? extends Integer> list2) {
                            b(listingItemBrief, num.intValue(), num2.intValue(), list2);
                            return wz.p.f75480a;
                        }
                    }, new g00.l<ui.a, wz.p>() { // from class: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$HomeSections$2$6
                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            super(1);
                        }

                        public final void b(ui.a it2) {
                            o.i(it2, "it");
                            MainCategoriesFragment.this.B().R0(it2);
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ wz.p invoke(ui.a aVar4) {
                            b(aVar4);
                            return wz.p.f75480a;
                        }
                    }, new g00.q<Integer, VerticalSectionsTabs, Integer, wz.p>() { // from class: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$HomeSections$2$7
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        public final void b(int i21, VerticalSectionsTabs tab, int i22) {
                            o.i(tab, "tab");
                            MainCategoriesFragment.this.B().T0(aVar3.g(), i21, tab, i22);
                        }

                        @Override // g00.q
                        public /* bridge */ /* synthetic */ wz.p invoke(Integer num, VerticalSectionsTabs verticalSectionsTabs, Integer num2) {
                            b(num.intValue(), verticalSectionsTabs, num2.intValue());
                            return wz.p.f75480a;
                        }
                    }, aVar2, 64, 0);
                    if (i18 == list.size()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    i16 = i19;
                    L(e2.h.l(z12 ? 16 : i19), 0L, false, aVar2, RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT, 6);
                    i17 = i18;
                }
            }
        }
        if (c.I()) {
            c.T();
        }
        d1 l11 = aVar2.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$HomeSections$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i21) {
                    MainCategoriesFragment.this.J(verticalSections, z11, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(float r20, long r21, boolean r23, androidx.compose.runtime.a r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment.L(float, long, boolean, androidx.compose.runtime.a, int, int):void");
    }

    public final void M(final boolean z11, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(-1256039222);
        if (c.I()) {
            c.U(-1256039222, i11, -1, "com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment.Verticals (MainCategoriesFragment.kt:265)");
        }
        VerticalListViewKt.a(B().M0(), z11, new g00.l<CategoryEntity, wz.p>() { // from class: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$Verticals$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(CategoryEntity it2) {
                CategoriesNavGraphViewModel b02;
                o.i(it2, "it");
                b02 = MainCategoriesFragment.this.b0();
                b02.O0(it2);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(CategoryEntity categoryEntity) {
                b(categoryEntity);
                return wz.p.f75480a;
            }
        }, h11, (i11 << 3) & 112, 0);
        if (c.I()) {
            c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$Verticals$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    MainCategoriesFragment.this.M(z11, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    public final CategoriesNavGraphViewModel.b c0() {
        CategoriesNavGraphViewModel.b bVar = this.C;
        if (bVar != null) {
            return bVar;
        }
        o.w("sharedFactory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: d0 */
    public MainCategoriesViewModel B() {
        return (MainCategoriesViewModel) this.B.getValue();
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return this.A;
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        super.onCreateView(inflater, viewGroup, bundle);
        Context requireContext = requireContext();
        o.h(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(b.c(2717919, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$onCreateView$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar, int i11) {
                if ((i11 & 11) == 2 && aVar.i()) {
                    aVar.L();
                    return;
                }
                if (c.I()) {
                    c.U(2717919, i11, -1, "com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment.onCreateView.<anonymous>.<anonymous> (MainCategoriesFragment.kt:101)");
                }
                final MainCategoriesFragment mainCategoriesFragment = MainCategoriesFragment.this;
                ThemeKt.a(null, null, b.b(aVar, 564173544, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$onCreateView$1$1.1

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* compiled from: MainCategoriesFragment.kt */
                    /* renamed from: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$onCreateView$1$1$1$1  reason: invalid class name and collision with other inner class name */
                    /* loaded from: classes2.dex */
                    public static final class C02671 extends Lambda implements g00.q<w.d, androidx.compose.runtime.a, Integer, wz.p> {

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ MainCategoriesFragment f24360a;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* compiled from: MainCategoriesFragment.kt */
                        @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$onCreateView$1$1$1$1$2", f = "MainCategoriesFragment.kt", l = {}, m = "invokeSuspend")
                        /* renamed from: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$onCreateView$1$1$1$1$2  reason: invalid class name */
                        /* loaded from: classes2.dex */
                        public static final class AnonymousClass2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

                            /* renamed from: a  reason: collision with root package name */
                            int f24361a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ CoroutineScope f24362b;

                            /* renamed from: c  reason: collision with root package name */
                            final /* synthetic */ ScrollState f24363c;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* compiled from: MainCategoriesFragment.kt */
                            @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$onCreateView$1$1$1$1$2$1", f = "MainCategoriesFragment.kt", l = {140}, m = "invokeSuspend")
                            /* renamed from: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$onCreateView$1$1$1$1$2$1  reason: invalid class name and collision with other inner class name */
                            /* loaded from: classes2.dex */
                            public static final class C02681 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

                                /* renamed from: a  reason: collision with root package name */
                                int f24364a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ ScrollState f24365b;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C02681(ScrollState scrollState, zz.a<? super C02681> aVar) {
                                    super(2, aVar);
                                    this.f24365b = scrollState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                                    return new C02681(this.f24365b, aVar);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    Object f11;
                                    f11 = kotlin.coroutines.intrinsics.b.f();
                                    int i11 = this.f24364a;
                                    if (i11 != 0) {
                                        if (i11 == 1) {
                                            kotlin.f.b(obj);
                                        } else {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                    } else {
                                        kotlin.f.b(obj);
                                        ScrollState scrollState = this.f24365b;
                                        this.f24364a = 1;
                                        if (scrollState.n(0, this) == f11) {
                                            return f11;
                                        }
                                    }
                                    return wz.p.f75480a;
                                }

                                @Override // g00.p
                                public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
                                    return ((C02681) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass2(CoroutineScope coroutineScope, ScrollState scrollState, zz.a<? super AnonymousClass2> aVar) {
                                super(2, aVar);
                                this.f24362b = coroutineScope;
                                this.f24363c = scrollState;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                                return new AnonymousClass2(this.f24362b, this.f24363c, aVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                kotlin.coroutines.intrinsics.b.f();
                                if (this.f24361a == 0) {
                                    kotlin.f.b(obj);
                                    BuildersKt__Builders_commonKt.launch$default(this.f24362b, null, null, new C02681(this.f24363c, null), 3, null);
                                    return wz.p.f75480a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }

                            @Override // g00.p
                            public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
                                return ((AnonymousClass2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C02671(MainCategoriesFragment mainCategoriesFragment) {
                            super(3);
                            this.f24360a = mainCategoriesFragment;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final MainCategoriesViewModel.a e(n1<? extends MainCategoriesViewModel.a> n1Var) {
                            return n1Var.getValue();
                        }

                        private static final boolean g(n1<Boolean> n1Var) {
                            return n1Var.getValue().booleanValue();
                        }

                        public final void c(w.d BoxWithConstraints, androidx.compose.runtime.a aVar, int i11) {
                            int i12;
                            int i13;
                            o.i(BoxWithConstraints, "$this$BoxWithConstraints");
                            if ((i11 & 14) == 0) {
                                if (aVar.T(BoxWithConstraints)) {
                                    i13 = 4;
                                } else {
                                    i13 = 2;
                                }
                                i12 = i13 | i11;
                            } else {
                                i12 = i11;
                            }
                            if ((i12 & 91) == 18 && aVar.i()) {
                                aVar.L();
                                return;
                            }
                            if (c.I()) {
                                c.U(1179058750, i11, -1, "com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainCategoriesFragment.kt:107)");
                            }
                            final ScrollState c11 = ScrollKt.c(0, aVar, 0, 1);
                            MainCategoriesFragment mainCategoriesFragment = this.f24360a;
                            aVar.C(-492369756);
                            Object D = aVar.D();
                            a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
                            if (D == c0064a.a()) {
                                D = mainCategoriesFragment.B().J0();
                                aVar.u(D);
                            }
                            aVar.S();
                            final n1 n1Var = (n1) D;
                            g gVar = (g) z.b(this.f24360a.B().H0(), null, aVar, 8, 1).getValue();
                            c.a aVar2 = androidx.compose.ui.c.f7566a;
                            androidx.compose.ui.c f11 = ScrollKt.f(SizeKt.k(SizeKt.h(aVar2, 0.0f, 1, null), BoxWithConstraints.c(), 0.0f, 2, null), c11, false, null, false, 14, null);
                            MainCategoriesFragment mainCategoriesFragment2 = this.f24360a;
                            aVar.C(-483455358);
                            a0 a11 = e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), aVar, 0);
                            aVar.C(-1323940314);
                            int a12 = j0.e.a(aVar, 0);
                            k s11 = aVar.s();
                            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                            g00.a<ComposeUiNode> a13 = companion.a();
                            g00.q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c12 = LayoutKt.c(f11);
                            if (!(aVar.k() instanceof j0.d)) {
                                j0.e.c();
                            }
                            aVar.I();
                            if (aVar.f()) {
                                aVar.y(a13);
                            } else {
                                aVar.t();
                            }
                            androidx.compose.runtime.a a14 = Updater.a(aVar);
                            Updater.c(a14, a11, companion.e());
                            Updater.c(a14, s11, companion.g());
                            p<ComposeUiNode, Integer, wz.p> b11 = companion.b();
                            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                                a14.u(Integer.valueOf(a12));
                                a14.p(Integer.valueOf(a12), b11);
                            }
                            c12.invoke(e1.a(e1.b(aVar)), aVar, 0);
                            aVar.C(2058660585);
                            w.f fVar = w.f.f74891a;
                            SpacerKt.a(SizeKt.i(aVar2, e2.h.l(12)), aVar, 6);
                            mainCategoriesFragment2.I(o.d(e(n1Var), MainCategoriesViewModel.a.b.f24394a), mainCategoriesFragment2.B().L0(), mainCategoriesFragment2.B().I0(), gVar, (f) z.b(mainCategoriesFragment2.B().E0(), null, aVar, 8, 1).getValue(), (f) z.b(mainCategoriesFragment2.B().G0(), null, aVar, 8, 1).getValue(), aVar, 2101760);
                            aVar.S();
                            aVar.w();
                            aVar.S();
                            aVar.S();
                            final MainCategoriesFragment mainCategoriesFragment3 = this.f24360a;
                            aVar.C(-492369756);
                            Object D2 = aVar.D();
                            if (D2 == c0064a.a()) {
                                D2 = z.d(
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01be: INVOKE  (r2v10 'D2' java.lang.Object) = 
                                      (wrap: g00.a<java.lang.Boolean> : 0x01bb: CONSTRUCTOR  (r2v9 g00.a<java.lang.Boolean> A[REMOVE]) = 
                                      (r1v26 'mainCategoriesFragment3' com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment A[DONT_INLINE])
                                      (r9v0 'c11' androidx.compose.foundation.ScrollState A[DONT_INLINE])
                                      (r7v2 'n1Var' j0.n1 A[DONT_INLINE])
                                     call: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$onCreateView$1$1$1$1$endReached$2$1.<init>(com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment, androidx.compose.foundation.ScrollState, j0.n1):void type: CONSTRUCTOR)
                                     type: STATIC call: androidx.compose.runtime.z.d(g00.a):j0.n1 in method: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment.onCreateView.1.1.1.1.c(w.d, androidx.compose.runtime.a, int):void, file: classes2.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$onCreateView$1$1$1$1$endReached$2$1, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1097)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:872)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                                    	... 25 more
                                    */
                                /*
                                    Method dump skipped, instructions count: 541
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment$onCreateView$1$1.AnonymousClass1.C02671.c(w.d, androidx.compose.runtime.a, int):void");
                            }

                            @Override // g00.q
                            public /* bridge */ /* synthetic */ wz.p invoke(w.d dVar, androidx.compose.runtime.a aVar, Integer num) {
                                c(dVar, aVar, num.intValue());
                                return wz.p.f75480a;
                            }
                        }

                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar2, int i12) {
                            if ((i12 & 11) == 2 && aVar2.i()) {
                                aVar2.L();
                                return;
                            }
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.U(564173544, i12, -1, "com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (MainCategoriesFragment.kt:102)");
                            }
                            BoxWithConstraintsKt.a(BackgroundKt.b(androidx.compose.ui.c.f7566a, dk.a.f54291a.a(aVar2, dk.a.f54292b).g().c(aVar2, yj.d.f76453b), null, 2, null), null, false, b.b(aVar2, 1179058750, true, new C02671(MainCategoriesFragment.this)), aVar2, 3072, 6);
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
            return composeView;
        }

        @Override // androidx.fragment.app.Fragment
        public void onPause() {
            super.onPause();
            B().P0();
        }

        @Override // androidx.fragment.app.Fragment
        public void onResume() {
            super.onResume();
            B().O0();
            B().N0();
        }

        @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
        public void onViewCreated(View view, Bundle bundle) {
            o.i(view, "view");
            super.onViewCreated(view, bundle);
            B().Q0();
            CrashlyticsUtilsKt.b("Main Categories", null, 2, null);
            a0();
        }
    }
