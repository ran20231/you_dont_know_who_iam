package com.forsale.app.features.categories.listingdetails.buyerscreen;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.RecyclerView;
import b1.t1;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel;
import com.forsale.app.features.categories.listingdetails.ListingDetailsActivity;
import com.forsale.app.features.categories.listingdetails.ShareText;
import com.forsale.app.features.categories.listingdetails.buyerscreen.l;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.MediaTypes;
import com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.ListingChatActivity;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource;
import com.forsale.app.features.categories.user.profile.UserProfileActivity;
import com.forsale.app.features.categories.user.profile.UserProfileData;
import com.forsale.app.ui.bottomsheets.listingdetailschat.ChatNowBottomSheet;
import com.forsale.app.ui.bottomsheets.updateapp.UpdateAppAlertBottomSheet;
import com.forsale.app.utils.Languages;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.analytics.AnalyticsListingsSource;
import com.forsale.app.utils.analytics.SearchSource;
import com.forsale.designSystem.SurfaceKt;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.theme.ThemeKt;
import com.forsale.ui.components.InfiniteAnimatedIconKt;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.maps.model.LatLng;
import j0.d1;
import j0.e1;
import j0.k0;
import j0.n1;
import j0.v0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import okhttp3.internal.http2.Http2;
import t9.p0;
import t9.y0;
import v0.b;
import w3.a;
/* compiled from: BuyerListingDetailsFragment.kt */
/* loaded from: classes2.dex */
public final class BuyerListingDetailsFragment extends u {

    /* renamed from: f  reason: collision with root package name */
    private final wz.h f25553f;

    public BuyerListingDetailsFragment() {
        final wz.h b11;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) g00.a.this.invoke();
            }
        });
        this.f25553f = FragmentViewModelLazyKt.b(this, kotlin.jvm.internal.s.b(BuyerListingDetailsViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w0 invoke() {
                x0 c11;
                c11 = FragmentViewModelLazyKt.c(wz.h.this);
                return c11.getViewModelStore();
            }
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w3.a invoke() {
                x0 c11;
                androidx.lifecycle.l lVar;
                w3.a aVar2;
                g00.a aVar3 = g00.a.this;
                if (aVar3 == null || (aVar2 = (w3.a) aVar3.invoke()) == null) {
                    c11 = FragmentViewModelLazyKt.c(b11);
                    if (c11 instanceof androidx.lifecycle.l) {
                        lVar = (androidx.lifecycle.l) c11;
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final t0.b invoke() {
                x0 c11;
                androidx.lifecycle.l lVar;
                t0.b defaultViewModelProviderFactory;
                c11 = FragmentViewModelLazyKt.c(b11);
                if (c11 instanceof androidx.lifecycle.l) {
                    lVar = (androidx.lifecycle.l) c11;
                } else {
                    lVar = null;
                }
                if (lVar == null || (defaultViewModelProviderFactory = lVar.getDefaultViewModelProviderFactory()) == null) {
                    t0.b defaultViewModelProviderFactory2 = Fragment.this.getDefaultViewModelProviderFactory();
                    kotlin.jvm.internal.o.h(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                    return defaultViewModelProviderFactory2;
                }
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutDirection E() {
        if (Languages.Companion.b() == Languages.ARABIC) {
            return LayoutDirection.Rtl;
        }
        return LayoutDirection.Ltr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(cb.a aVar, CategoryListingsAnalyticSource categoryListingsAnalyticSource) {
        CategoryEntity categoryEntity;
        String str;
        CategoryEntity b11;
        NavController a11 = androidx.navigation.fragment.a.a(this);
        l.a aVar2 = l.f26056a;
        GetListingsBody.FiltrationData filtrationData = null;
        if (aVar != null) {
            categoryEntity = aVar.b();
        } else {
            categoryEntity = null;
        }
        if (aVar != null && (b11 = aVar.b()) != null) {
            str = b11.getName();
        } else {
            str = null;
        }
        if (aVar != null) {
            filtrationData = aVar.c();
        }
        a11.d0(l.a.c(aVar2, categoryEntity, str, null, null, null, categoryListingsAnalyticSource, filtrationData, null, null, true, 412, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I() {
        z3.n d11;
        d11 = l.f26056a.d((r32 & 1) != 0 ? ListingsTypes.USER_ITEMS : ListingsTypes.MY_VIEW_HISTORY, (r32 & 2) != 0 ? null : getString(y0.f70722va), (r32 & 4) != 0 ? -1 : 0, (r32 & 8) != 0 ? null : null, (r32 & 16) != 0 ? null : null, (r32 & 32) != 0 ? null : null, (r32 & 64) != 0 ? AnalyticsListingsSource.MORE : AnalyticsListingsSource.ListingDetailsSimilarAdsSeeAll, (r32 & 128) != 0 ? -1 : 0, (r32 & 256) != 0 ? p0.f69709i : 0, (r32 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0, (r32 & 1024) != 0 ? SearchSource.SEARCH_BAR : null, (r32 & RecyclerView.l.FLAG_MOVED) != 0 ? 0 : 0, (r32 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : null, (r32 & 8192) == 0 ? 0 : -1, (r32 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : null);
        androidx.navigation.fragment.a.a(this).d0(d11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(MediaTypes mediaTypes, DetailsModel detailsModel, ShareText shareText) {
        androidx.navigation.fragment.a.a(this).d0(l.f26056a.a(mediaTypes, detailsModel, G().h(), shareText));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(UserProfileData userProfileData) {
        Context context = getContext();
        if (context != null) {
            UserProfileActivity.a.b(UserProfileActivity.C, context, userProfileData, null, 2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.forsale.app.features.categories.user.profile.UserProfileData] */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.forsale.app.features.categories.user.profile.UserProfileData] */
    private final void L(DetailsModel detailsModel, ListingItemBrief listingItemBrief, String str) {
        String str2;
        String str3;
        Integer userId;
        Integer num;
        Context context = getContext();
        if (context != null) {
            ListingChatActivity.a aVar = ListingChatActivity.f27334y;
            String e11 = falcon.chat.utils.a.f56033a.e();
            String w11 = detailsModel.d().w();
            String c11 = detailsModel.d().c();
            String E = detailsModel.d().E();
            String str4 = null;
            if (listingItemBrief != null) {
                str2 = listingItemBrief.getThumb();
            } else {
                str2 = null;
            }
            BuyerListingDetailsResponseModel.Data.Listing.User F = detailsModel.d().F();
            if (F != null) {
                str3 = F.getImage();
            } else {
                str3 = null;
            }
            BuyerListingDetailsResponseModel.Data.Listing.User F2 = detailsModel.d().F();
            if (F2 != null && (userId = F2.getUserId()) != null) {
                long intValue = userId.intValue();
                String firstName = F2.getFirstName();
                String phone = F2.getPhone();
                String image = F2.getImage();
                String c12 = detailsModel.d().c();
                if (c12 != null) {
                    num = Integer.valueOf(Integer.parseInt(c12));
                } else {
                    num = null;
                }
                String phone2 = F2.getPhone();
                if (phone2 != null) {
                    str4 = TypeExtensionsKt.W(phone2);
                }
                str4 = new UserProfileData(intValue, firstName, phone, image, num, null, null, null, str4, 224, null);
            }
            ListingChatActivity.a.b(aVar, context, e11, w11, c11, E, str2, str3, str, str4, listingItemBrief, null, AdRequest.MAX_CONTENT_URL_LENGTH, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void M(BuyerListingDetailsFragment buyerListingDetailsFragment, DetailsModel detailsModel, ListingItemBrief listingItemBrief, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            listingItemBrief = null;
        }
        if ((i11 & 4) != 0) {
            str = null;
        }
        buyerListingDetailsFragment.L(detailsModel, listingItemBrief, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(final com.forsale.app.features.auth.e eVar, final g00.l<? super DetailsModel, wz.p> lVar, final g00.l<? super com.forsale.app.ui.bottomsheets.listingdetailschat.b, wz.p> lVar2, final g00.a<wz.p> aVar, final g00.l<? super Integer, wz.p> lVar3, final PagerState pagerState, androidx.compose.runtime.a aVar2, final int i11) {
        w3.a aVar3;
        androidx.compose.runtime.a h11 = aVar2.h(858308829);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(858308829, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment.BuyerListingDetailsScreen (BuyerListingDetailsFragment.kt:185)");
        }
        String j11 = G().j(pagerState.u());
        h11.C(1890788296);
        x0 a11 = LocalViewModelStoreOwner.f12907a.a(h11, LocalViewModelStoreOwner.f12909c);
        if (a11 != null) {
            t0.b a12 = r3.a.a(a11, h11, 0);
            h11.C(1729797275);
            if (a11 instanceof androidx.lifecycle.l) {
                aVar3 = ((androidx.lifecycle.l) a11).getDefaultViewModelCreationExtras();
            } else {
                aVar3 = a.C0905a.f75031b;
            }
            q0 b11 = x3.a.b(BuyerListingDetailsScreenViewModel.class, a11, j11, a12, aVar3, h11, 36936, 0);
            h11.S();
            h11.S();
            BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel = (BuyerListingDetailsScreenViewModel) b11;
            FragmentManager childFragmentManager = getChildFragmentManager();
            kotlin.jvm.internal.o.f(childFragmentManager);
            g00.a<wz.p> aVar4 = new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$BuyerListingDetailsScreen$1
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
                    androidx.fragment.app.p activity = BuyerListingDetailsFragment.this.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                }
            };
            g00.q<MediaTypes.Images, DetailsModel, ShareText, wz.p> qVar = new g00.q<MediaTypes.Images, DetailsModel, ShareText, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$BuyerListingDetailsScreen$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(3);
                }

                public final void b(MediaTypes.Images media, DetailsModel model, ShareText shareText) {
                    kotlin.jvm.internal.o.i(media, "media");
                    kotlin.jvm.internal.o.i(model, "model");
                    kotlin.jvm.internal.o.i(shareText, "shareText");
                    BuyerListingDetailsFragment.this.J(media, model, shareText);
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ wz.p invoke(MediaTypes.Images images, DetailsModel detailsModel, ShareText shareText) {
                    b(images, detailsModel, shareText);
                    return wz.p.f75480a;
                }
            };
            g00.l<String, wz.p> lVar4 = new g00.l<String, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$BuyerListingDetailsScreen$3
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(String it2) {
                    kotlin.jvm.internal.o.i(it2, "it");
                    Context context = BuyerListingDetailsFragment.this.getContext();
                    if (context != null) {
                        com.forsale.app.utils.r.a(context, it2);
                    }
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(String str) {
                    b(str);
                    return wz.p.f75480a;
                }
            };
            g00.q<MediaTypes.ThreeDTour, DetailsModel, ShareText, wz.p> qVar2 = new g00.q<MediaTypes.ThreeDTour, DetailsModel, ShareText, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$BuyerListingDetailsScreen$4
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(3);
                }

                public final void b(MediaTypes.ThreeDTour media, DetailsModel model, ShareText shareText) {
                    kotlin.jvm.internal.o.i(media, "media");
                    kotlin.jvm.internal.o.i(model, "model");
                    kotlin.jvm.internal.o.i(shareText, "shareText");
                    BuyerListingDetailsFragment.this.J(media, model, shareText);
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ wz.p invoke(MediaTypes.ThreeDTour threeDTour, DetailsModel detailsModel, ShareText shareText) {
                    b(threeDTour, detailsModel, shareText);
                    return wz.p.f75480a;
                }
            };
            g00.l<UserProfileData, wz.p> lVar5 = new g00.l<UserProfileData, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$BuyerListingDetailsScreen$5
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(UserProfileData it2) {
                    kotlin.jvm.internal.o.i(it2, "it");
                    BuyerListingDetailsFragment.this.K(it2);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(UserProfileData userProfileData) {
                    b(userProfileData);
                    return wz.p.f75480a;
                }
            };
            h11.C(1157296644);
            boolean T = h11.T(lVar);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new g00.l<DetailsModel, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$BuyerListingDetailsScreen$6$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void b(DetailsModel it2) {
                        kotlin.jvm.internal.o.i(it2, "it");
                        lVar.invoke(it2);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ wz.p invoke(DetailsModel detailsModel) {
                        b(detailsModel);
                        return wz.p.f75480a;
                    }
                };
                h11.u(D);
            }
            h11.S();
            g00.l lVar6 = (g00.l) D;
            h11.C(1157296644);
            boolean T2 = h11.T(lVar2);
            Object D2 = h11.D();
            if (T2 || D2 == androidx.compose.runtime.a.f7182a.a()) {
                D2 = new g00.l<com.forsale.app.ui.bottomsheets.listingdetailschat.b, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$BuyerListingDetailsScreen$7$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void b(com.forsale.app.ui.bottomsheets.listingdetailschat.b it2) {
                        kotlin.jvm.internal.o.i(it2, "it");
                        lVar2.invoke(it2);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ wz.p invoke(com.forsale.app.ui.bottomsheets.listingdetailschat.b bVar) {
                        b(bVar);
                        return wz.p.f75480a;
                    }
                };
                h11.u(D2);
            }
            h11.S();
            g00.l lVar7 = (g00.l) D2;
            h11.C(1157296644);
            boolean T3 = h11.T(aVar);
            Object D3 = h11.D();
            if (T3 || D3 == androidx.compose.runtime.a.f7182a.a()) {
                D3 = new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$BuyerListingDetailsScreen$8$1
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
                        aVar.invoke();
                    }
                };
                h11.u(D3);
            }
            h11.S();
            int i12 = i11 << 12;
            BuyerScaffoldKt.c(buyerListingDetailsScreenViewModel, childFragmentManager, aVar4, eVar, qVar, lVar4, qVar2, lVar5, lVar6, lVar7, (g00.a) D3, new g00.q<Integer, ListingItemBrief, List<? extends Integer>, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$BuyerListingDetailsScreen$9
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(3);
                }

                public final void b(int i13, ListingItemBrief listingItemBrief, List<Integer> swipingIds) {
                    kotlin.jvm.internal.o.i(listingItemBrief, "listingItemBrief");
                    kotlin.jvm.internal.o.i(swipingIds, "swipingIds");
                    Context context = BuyerListingDetailsFragment.this.getContext();
                    if (context != null) {
                        ListingDetailsActivity.R.a(context, (r33 & 1) != 0 ? null : listingItemBrief, (r33 & 2) != 0 ? null : null, (r33 & 4) != 0 ? -1 : i13, (r33 & 8) != 0 ? null : null, (r33 & 16) != 0 ? ListingsTypes.NORMAL_LISTINGS : null, (r33 & 32) != 0 ? null : null, (r33 & 64) != 0 ? null : null, (r33 & 128) != 0 ? null : null, (r33 & 256) != 0 ? null : null, (r33 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : null, (r33 & 1024) != 0 ? false : false, (r33 & RecyclerView.l.FLAG_MOVED) == 0 ? 0 : -1, (r33 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : null, (r33 & 8192) == 0 ? null : null, (r33 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? kotlin.collections.r.n() : swipingIds);
                    }
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ wz.p invoke(Integer num, ListingItemBrief listingItemBrief, List<? extends Integer> list) {
                    b(num.intValue(), listingItemBrief, list);
                    return wz.p.f75480a;
                }
            }, new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$BuyerListingDetailsScreen$10
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
                    androidx.fragment.app.p activity = BuyerListingDetailsFragment.this.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                }
            }, new g00.l<cb.a, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$BuyerListingDetailsScreen$11
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(cb.a aVar5) {
                    BuyerListingDetailsFragment.this.H(aVar5, new CategoryListingsAnalyticSource.ListingDetailsBreadcrumbs(null, 1, null));
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(cb.a aVar5) {
                    b(aVar5);
                    return wz.p.f75480a;
                }
            }, new g00.q<MediaTypes, DetailsModel, ShareText, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$BuyerListingDetailsScreen$12
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(3);
                }

                public final void b(MediaTypes media, DetailsModel model, ShareText shareText) {
                    kotlin.jvm.internal.o.i(media, "media");
                    kotlin.jvm.internal.o.i(model, "model");
                    kotlin.jvm.internal.o.i(shareText, "shareText");
                    BuyerListingDetailsFragment.this.J(media, model, shareText);
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ wz.p invoke(MediaTypes mediaTypes, DetailsModel detailsModel, ShareText shareText) {
                    b(mediaTypes, detailsModel, shareText);
                    return wz.p.f75480a;
                }
            }, new g00.l<cb.a, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$BuyerListingDetailsScreen$13
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(cb.a aVar5) {
                    BuyerListingDetailsFragment.this.H(aVar5, new CategoryListingsAnalyticSource.ListingDetailsSimilarAdsSeeAll(null, 1, null));
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(cb.a aVar5) {
                    b(aVar5);
                    return wz.p.f75480a;
                }
            }, new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$BuyerListingDetailsScreen$14
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
                    BuyerListingDetailsFragment.this.I();
                }
            }, new g00.r<LatLng, Boolean, DetailsModel, ShareText, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$BuyerListingDetailsScreen$15
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(4);
                }

                public final void b(LatLng latLng, boolean z11, DetailsModel model, ShareText shareText) {
                    kotlin.jvm.internal.o.i(latLng, "latLng");
                    kotlin.jvm.internal.o.i(model, "model");
                    kotlin.jvm.internal.o.i(shareText, "shareText");
                    BuyerListingDetailsFragment.this.J(new MediaTypes.Map(latLng, z11), model, shareText);
                }

                @Override // g00.r
                public /* bridge */ /* synthetic */ wz.p d(LatLng latLng, Boolean bool, DetailsModel detailsModel, ShareText shareText) {
                    b(latLng, bool.booleanValue(), detailsModel, shareText);
                    return wz.p.f75480a;
                }
            }, lVar3, pagerState, h11, ((i11 << 9) & 7168) | 72, (234881024 & i12) | (i12 & 1879048192));
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$BuyerListingDetailsScreen$16
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar5, int i13) {
                        BuyerListingDetailsFragment.this.q(eVar, lVar, lVar2, aVar, lVar3, pagerState, aVar5, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                        b(aVar5, num.intValue());
                        return wz.p.f75480a;
                    }
                });
                return;
            }
            return;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(final BuyerListingDetailsViewModel buyerListingDetailsViewModel, final com.forsale.app.features.auth.e eVar, final g00.l<? super DetailsModel, wz.p> lVar, final g00.l<? super com.forsale.app.ui.bottomsheets.listingdetailschat.b, wz.p> lVar2, final g00.a<wz.p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
        androidx.compose.runtime.a h11 = aVar2.h(-1080088912);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1080088912, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment.BuyerListingDetailsScreenPager (BuyerListingDetailsFragment.kt:148)");
        }
        final PagerState j11 = PagerStateKt.j(buyerListingDetailsViewModel.k(), 0.0f, new g00.a<Integer>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$BuyerListingDetailsScreenPager$pagerState$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Integer invoke() {
                return Integer.valueOf(BuyerListingDetailsViewModel.this.l());
            }
        }, h11, 0, 2);
        h11.C(733328855);
        c.a aVar3 = androidx.compose.ui.c.f7566a;
        a0 g11 = BoxKt.g(v0.b.f74009a.o(), false, h11, 0);
        h11.C(-1323940314);
        int a11 = j0.e.a(h11, 0);
        j0.k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a12 = companion.a();
        g00.q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(aVar3);
        if (!(h11.k() instanceof j0.d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a12);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a13 = Updater.a(h11);
        Updater.c(a13, g11, companion.e());
        Updater.c(a13, s11, companion.g());
        g00.p<ComposeUiNode, Integer, wz.p> b11 = companion.b();
        if (a13.f() || !kotlin.jvm.internal.o.d(a13.D(), Integer.valueOf(a11))) {
            a13.u(Integer.valueOf(a11));
            a13.p(Integer.valueOf(a11), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
        PagerKt.a(j11, null, null, null, 0, 0.0f, null, null, false, false, null, null, r0.b.b(h11, -23997511, true, new g00.r<a0.m, Integer, androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$BuyerListingDetailsScreenPager$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            public final void b(a0.m HorizontalPager, int i12, androidx.compose.runtime.a aVar4, int i13) {
                kotlin.jvm.internal.o.i(HorizontalPager, "$this$HorizontalPager");
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-23997511, i13, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment.BuyerListingDetailsScreenPager.<anonymous>.<anonymous> (BuyerListingDetailsFragment.kt:158)");
                }
                if (i12 == PagerState.this.u()) {
                    final BuyerListingDetailsFragment buyerListingDetailsFragment = this;
                    com.forsale.app.features.auth.e eVar2 = eVar;
                    g00.l<DetailsModel, wz.p> lVar3 = lVar;
                    g00.l<com.forsale.app.ui.bottomsheets.listingdetailschat.b, wz.p> lVar4 = lVar2;
                    g00.a<wz.p> aVar5 = aVar;
                    final PagerState pagerState = PagerState.this;
                    g00.l<Integer, wz.p> lVar5 = new g00.l<Integer, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$BuyerListingDetailsScreenPager$1$1.1

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* compiled from: BuyerListingDetailsFragment.kt */
                        @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$BuyerListingDetailsScreenPager$1$1$1$1", f = "BuyerListingDetailsFragment.kt", l = {168}, m = "invokeSuspend")
                        /* renamed from: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$BuyerListingDetailsScreenPager$1$1$1$1  reason: invalid class name and collision with other inner class name */
                        /* loaded from: classes2.dex */
                        public static final class C02761 extends SuspendLambda implements g00.l<zz.a<? super wz.p>, Object> {

                            /* renamed from: a  reason: collision with root package name */
                            int f25593a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ PagerState f25594b;

                            /* renamed from: c  reason: collision with root package name */
                            final /* synthetic */ int f25595c;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C02761(PagerState pagerState, int i11, zz.a<? super C02761> aVar) {
                                super(1, aVar);
                                this.f25594b = pagerState;
                                this.f25595c = i11;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final zz.a<wz.p> create(zz.a<?> aVar) {
                                return new C02761(this.f25594b, this.f25595c, aVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object f11;
                                f11 = kotlin.coroutines.intrinsics.b.f();
                                int i11 = this.f25593a;
                                if (i11 != 0) {
                                    if (i11 == 1) {
                                        kotlin.f.b(obj);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                } else {
                                    kotlin.f.b(obj);
                                    PagerState pagerState = this.f25594b;
                                    int i12 = this.f25595c;
                                    this.f25593a = 1;
                                    if (PagerState.Z(pagerState, i12, 0.0f, this, 2, null) == f11) {
                                        return f11;
                                    }
                                }
                                return wz.p.f75480a;
                            }

                            @Override // g00.l
                            public final Object invoke(zz.a<? super wz.p> aVar) {
                                return ((C02761) create(aVar)).invokeSuspend(wz.p.f75480a);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void b(int i14) {
                            LifeCycleUtilsKt.b(BuyerListingDetailsFragment.this, new C02761(pagerState, i14, null));
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ wz.p invoke(Integer num) {
                            b(num.intValue());
                            return wz.p.f75480a;
                        }
                    };
                    PagerState pagerState2 = PagerState.this;
                    int i14 = i11;
                    buyerListingDetailsFragment.q(eVar2, lVar3, lVar4, aVar5, lVar5, pagerState2, aVar4, ((i14 >> 3) & 14) | 2097152 | ((i14 >> 3) & 112) | ((i14 >> 3) & 896) | ((i14 >> 3) & 7168));
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.r
            public /* bridge */ /* synthetic */ wz.p d(a0.m mVar, Integer num, androidx.compose.runtime.a aVar4, Integer num2) {
                b(mVar, num.intValue(), aVar4, num2.intValue());
                return wz.p.f75480a;
            }
        }), h11, 0, 384, 4094);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$BuyerListingDetailsScreenPager$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i12) {
                    BuyerListingDetailsFragment.this.r(buyerListingDetailsViewModel, eVar, lVar, lVar2, aVar, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(final LayoutDirection layoutDirection, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a h11 = aVar.h(-1278260230);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1278260230, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment.OnBoardingOverlay (BuyerListingDetailsFragment.kt:242)");
        }
        h11.C(-492369756);
        Object D = h11.D();
        if (D == androidx.compose.runtime.a.f7182a.a()) {
            D = c0.e(Boolean.TRUE, null, 2, null);
            h11.u(D);
        }
        h11.S();
        final k0 k0Var = (k0) D;
        if (((Boolean) k0Var.getValue()).booleanValue()) {
            aVar2 = h11;
            SurfaceKt.c(ClickableKt.e(SizeKt.f(androidx.compose.ui.c.f7566a, 0.0f, 1, null), false, null, null, new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$OnBoardingOverlay$1
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
                    k0Var.setValue(Boolean.FALSE);
                    this.G().g();
                }
            }, 7, null), null, t1.o(t1.f15974b.a(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), 0L, null, 0.0f, r0.b.b(h11, -1536822959, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$OnBoardingOverlay$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i12) {
                    if ((i12 & 11) == 2 && aVar3.i()) {
                        aVar3.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-1536822959, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment.OnBoardingOverlay.<anonymous> (BuyerListingDetailsFragment.kt:256)");
                    }
                    c.a aVar4 = androidx.compose.ui.c.f7566a;
                    androidx.compose.ui.c i13 = PaddingKt.i(SizeKt.f(aVar4, 0.0f, 1, null), e2.h.l(16));
                    LayoutDirection layoutDirection2 = LayoutDirection.this;
                    int i14 = i11;
                    aVar3.C(733328855);
                    b.a aVar5 = v0.b.f74009a;
                    a0 g11 = BoxKt.g(aVar5.o(), false, aVar3, 0);
                    aVar3.C(-1323940314);
                    int a11 = j0.e.a(aVar3, 0);
                    j0.k s11 = aVar3.s();
                    ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                    g00.a<ComposeUiNode> a12 = companion.a();
                    g00.q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(i13);
                    if (!(aVar3.k() instanceof j0.d)) {
                        j0.e.c();
                    }
                    aVar3.I();
                    if (aVar3.f()) {
                        aVar3.y(a12);
                    } else {
                        aVar3.t();
                    }
                    androidx.compose.runtime.a a13 = Updater.a(aVar3);
                    Updater.c(a13, g11, companion.e());
                    Updater.c(a13, s11, companion.g());
                    g00.p<ComposeUiNode, Integer, wz.p> b11 = companion.b();
                    if (a13.f() || !kotlin.jvm.internal.o.d(a13.D(), Integer.valueOf(a11))) {
                        a13.u(Integer.valueOf(a11));
                        a13.p(Integer.valueOf(a11), b11);
                    }
                    c11.invoke(e1.a(e1.b(aVar3)), aVar3, 0);
                    aVar3.C(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
                    androidx.compose.ui.c e11 = boxScopeInstance.e(aVar4, aVar5.e());
                    aVar3.C(-483455358);
                    a0 a14 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), aVar5.k(), aVar3, 0);
                    aVar3.C(-1323940314);
                    int a15 = j0.e.a(aVar3, 0);
                    j0.k s12 = aVar3.s();
                    g00.a<ComposeUiNode> a16 = companion.a();
                    g00.q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c12 = LayoutKt.c(e11);
                    if (!(aVar3.k() instanceof j0.d)) {
                        j0.e.c();
                    }
                    aVar3.I();
                    if (aVar3.f()) {
                        aVar3.y(a16);
                    } else {
                        aVar3.t();
                    }
                    androidx.compose.runtime.a a17 = Updater.a(aVar3);
                    Updater.c(a17, a14, companion.e());
                    Updater.c(a17, s12, companion.g());
                    g00.p<ComposeUiNode, Integer, wz.p> b12 = companion.b();
                    if (a17.f() || !kotlin.jvm.internal.o.d(a17.D(), Integer.valueOf(a15))) {
                        a17.u(Integer.valueOf(a15));
                        a17.p(Integer.valueOf(a15), b12);
                    }
                    c12.invoke(e1.a(e1.b(aVar3)), aVar3, 0);
                    aVar3.C(2058660585);
                    w.f fVar = w.f.f74891a;
                    InfiniteAnimatedIconKt.a(null, t9.x0.f70358d, e2.h.l(343), e2.h.l(80), 0.0f, true, layoutDirection2, aVar3, 200064 | ((i14 << 18) & 3670016), 17);
                    String b13 = p1.g.b(y0.f70543ke, aVar3, 0);
                    dk.a aVar6 = dk.a.f54291a;
                    int i15 = dk.a.f54292b;
                    yj.d g12 = aVar6.a(aVar3, i15).g();
                    int i16 = yj.d.f76453b;
                    long c13 = g12.c(aVar3, i16);
                    androidx.compose.ui.text.a0 l11 = aVar6.c(aVar3, i15).l();
                    TextKt.a(b13, SizeKt.h(aVar4, 0.0f, 1, null), b2.f.f16081b.a(), 0, false, 0, 0, null, l11, c13, 0, aVar3, 48, 0, 1272);
                    aVar3.S();
                    aVar3.w();
                    aVar3.S();
                    aVar3.S();
                    TextKt.a(p1.g.b(y0.f70560le, aVar3, 0), PaddingKt.m(boxScopeInstance.e(aVar4, aVar5.b()), 0.0f, 0.0f, 0.0f, e2.h.l(100), 7, null), 0, 0, false, 0, 0, null, aVar6.c(aVar3, i15).a(), aVar6.a(aVar3, i15).g().c(aVar3, i16), 0, aVar3, 0, 0, 1276);
                    aVar3.S();
                    aVar3.w();
                    aVar3.S();
                    aVar3.S();
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return wz.p.f75480a;
                }
            }), h11, 1573248, 58);
        } else {
            aVar2 = h11;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = aVar2.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$OnBoardingOverlay$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i12) {
                    BuyerListingDetailsFragment.this.s(layoutDirection, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    public final BuyerListingDetailsViewModel G() {
        return (BuyerListingDetailsViewModel) this.f25553f.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.o.i(inflater, "inflater");
        Context requireContext = requireContext();
        kotlin.jvm.internal.o.h(requireContext, "requireContext(...)");
        final ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.b(viewLifecycleOwner));
        composeView.setContent(r0.b.c(360778016, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$onCreateView$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar, int i11) {
                if ((i11 & 11) == 2 && aVar.i()) {
                    aVar.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(360778016, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment.onCreateView.<anonymous>.<anonymous> (BuyerListingDetailsFragment.kt:85)");
                }
                final BuyerListingDetailsFragment buyerListingDetailsFragment = BuyerListingDetailsFragment.this;
                final ComposeView composeView2 = composeView;
                ThemeKt.a(null, null, r0.b.b(aVar, 2048072247, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$onCreateView$1$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        if ((i12 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(2048072247, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (BuyerListingDetailsFragment.kt:86)");
                        }
                        BuyerListingDetailsFragment buyerListingDetailsFragment2 = BuyerListingDetailsFragment.this;
                        androidx.fragment.app.p activity = buyerListingDetailsFragment2.getActivity();
                        kotlin.jvm.internal.o.g(activity, "null cannot be cast to non-null type com.forsale.app.features.categories.listingdetails.ListingDetailsActivity");
                        com.forsale.app.features.auth.e e12 = ((ListingDetailsActivity) activity).e1();
                        final BuyerListingDetailsFragment buyerListingDetailsFragment3 = BuyerListingDetailsFragment.this;
                        g00.l<DetailsModel, wz.p> lVar = new g00.l<DetailsModel, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment.onCreateView.1.1.1.1
                            {
                                super(1);
                            }

                            public final void b(DetailsModel it2) {
                                kotlin.jvm.internal.o.i(it2, "it");
                                BuyerListingDetailsFragment.M(BuyerListingDetailsFragment.this, it2, null, null, 6, null);
                            }

                            @Override // g00.l
                            public /* bridge */ /* synthetic */ wz.p invoke(DetailsModel detailsModel) {
                                b(detailsModel);
                                return wz.p.f75480a;
                            }
                        };
                        final BuyerListingDetailsFragment buyerListingDetailsFragment4 = BuyerListingDetailsFragment.this;
                        g00.l<com.forsale.app.ui.bottomsheets.listingdetailschat.b, wz.p> lVar2 = new g00.l<com.forsale.app.ui.bottomsheets.listingdetailschat.b, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment.onCreateView.1.1.1.2
                            {
                                super(1);
                            }

                            public final void b(com.forsale.app.ui.bottomsheets.listingdetailschat.b it2) {
                                kotlin.jvm.internal.o.i(it2, "it");
                                ChatNowBottomSheet.a aVar3 = ChatNowBottomSheet.B;
                                FragmentManager childFragmentManager = BuyerListingDetailsFragment.this.getChildFragmentManager();
                                kotlin.jvm.internal.o.h(childFragmentManager, "getChildFragmentManager(...)");
                                ChatNowBottomSheet.a.b(aVar3, childFragmentManager, it2, null, 4, null);
                            }

                            @Override // g00.l
                            public /* bridge */ /* synthetic */ wz.p invoke(com.forsale.app.ui.bottomsheets.listingdetailschat.b bVar) {
                                b(bVar);
                                return wz.p.f75480a;
                            }
                        };
                        final ComposeView composeView3 = composeView2;
                        final BuyerListingDetailsFragment buyerListingDetailsFragment5 = BuyerListingDetailsFragment.this;
                        buyerListingDetailsFragment2.t(e12, lVar, lVar2, new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment.onCreateView.1.1.1.3
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
                                Context context = ComposeView.this.getContext();
                                if (context != null) {
                                    BuyerListingDetailsFragment buyerListingDetailsFragment6 = buyerListingDetailsFragment5;
                                    UpdateAppAlertBottomSheet updateAppAlertBottomSheet = new UpdateAppAlertBottomSheet(null, 1, null);
                                    FragmentManager childFragmentManager = buyerListingDetailsFragment6.getChildFragmentManager();
                                    kotlin.jvm.internal.o.h(childFragmentManager, "getChildFragmentManager(...)");
                                    updateAppAlertBottomSheet.a(childFragmentManager, context);
                                }
                            }
                        }, aVar2, 32768);
                        final BuyerListingDetailsFragment buyerListingDetailsFragment6 = BuyerListingDetailsFragment.this;
                        BackHandlerKt.a(true, new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment.onCreateView.1.1.1.4
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
                                androidx.fragment.app.p activity2 = BuyerListingDetailsFragment.this.getActivity();
                                if (activity2 != null) {
                                    activity2.finish();
                                }
                            }
                        }, aVar2, 6, 0);
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

    public final void t(final com.forsale.app.features.auth.e authenticatorDelegator, final g00.l<? super DetailsModel, wz.p> openChatActivity, final g00.l<? super com.forsale.app.ui.bottomsheets.listingdetailschat.b, wz.p> openChatSheet, final g00.a<wz.p> onAppUpdate, androidx.compose.runtime.a aVar, final int i11) {
        kotlin.jvm.internal.o.i(authenticatorDelegator, "authenticatorDelegator");
        kotlin.jvm.internal.o.i(openChatActivity, "openChatActivity");
        kotlin.jvm.internal.o.i(openChatSheet, "openChatSheet");
        kotlin.jvm.internal.o.i(onAppUpdate, "onAppUpdate");
        androidx.compose.runtime.a h11 = aVar.h(842887564);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(842887564, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment.ScreenContent (BuyerListingDetailsFragment.kt:112)");
        }
        CompositionLocalKt.a(CompositionLocalsKt.j().c(E()), r0.b.b(h11, -983853492, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$ScreenContent$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            private static final boolean c(n1<Boolean> n1Var) {
                return n1Var.getValue().booleanValue();
            }

            public final void b(androidx.compose.runtime.a aVar2, int i12) {
                LayoutDirection E;
                if ((i12 & 11) == 2 && aVar2.i()) {
                    aVar2.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-983853492, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment.ScreenContent.<anonymous> (BuyerListingDetailsFragment.kt:118)");
                }
                n1 b11 = z.b(BuyerListingDetailsFragment.this.G().m(), null, aVar2, 8, 1);
                BuyerListingDetailsFragment buyerListingDetailsFragment = BuyerListingDetailsFragment.this;
                BuyerListingDetailsViewModel G = buyerListingDetailsFragment.G();
                com.forsale.app.features.auth.e eVar = authenticatorDelegator;
                g00.l<DetailsModel, wz.p> lVar = openChatActivity;
                g00.l<com.forsale.app.ui.bottomsheets.listingdetailschat.b, wz.p> lVar2 = openChatSheet;
                g00.a<wz.p> aVar3 = onAppUpdate;
                int i13 = i11;
                buyerListingDetailsFragment.r(G, eVar, lVar, lVar2, aVar3, aVar2, ((i13 << 3) & 112) | 262152 | ((i13 << 3) & 896) | ((i13 << 3) & 7168) | ((i13 << 3) & 57344));
                if (c(b11)) {
                    BuyerListingDetailsFragment buyerListingDetailsFragment2 = BuyerListingDetailsFragment.this;
                    E = buyerListingDetailsFragment2.E();
                    buyerListingDetailsFragment2.s(E, aVar2, 64);
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                b(aVar2, num.intValue());
                return wz.p.f75480a;
            }
        }), h11, j0.t0.f59917d | 0 | 48);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsFragment$ScreenContent$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    BuyerListingDetailsFragment.this.t(authenticatorDelegator, openChatActivity, openChatSheet, onAppUpdate, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }
}
