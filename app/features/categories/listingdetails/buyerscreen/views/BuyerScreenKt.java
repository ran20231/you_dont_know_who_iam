package com.forsale.app.features.categories.listingdetails.buyerscreen.views;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.features.categories.home.propertyhome.models.SectionState;
import com.forsale.app.features.categories.listingdetails.ShareText;
import com.forsale.app.features.categories.listingdetails.buyerctas.BuyerStickyCTAsKt;
import com.forsale.app.features.categories.listingdetails.buyerctas.CTAsVisibility;
import com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.MediaTypes;
import com.forsale.app.features.categories.listingdetails.buyerscreen.q;
import com.forsale.app.features.categories.listingdetails.buyerscreen.report.ShowReportAbuseBottomSheetKt;
import com.forsale.app.features.categories.listingdetails.buyerscreen.t;
import com.forsale.app.features.categories.listingdetails.models.CommonData;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper;
import com.forsale.app.features.categories.listingdetails.shimmer.AdsShimmerKt;
import com.forsale.app.features.categories.listingdetails.shimmer.ListingDetailsShimmerKt;
import com.forsale.app.features.categories.listings.items.dfp.GamStates;
import com.forsale.app.features.categories.user.profile.UserProfileData;
import com.forsale.app.features.postad.extraattributes.enums.AttributeType;
import com.forsale.app.feedback.FeedbackSnackBarComponentKt;
import com.forsale.designSystem.bottomsheets.BottomSheetsKt;
import com.forsale.designSystem.bottomsheets.ModalBottomSheetState;
import com.forsale.designSystem.bottomsheets.ModalBottomSheetValue;
import com.forsale.designSystem.dividers.DividersKt;
import com.forsale.ui.components.StateKt;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.maps.model.LatLng;
import e2.h;
import eb.s;
import g00.a;
import g00.l;
import g00.r;
import j0.d;
import j0.d1;
import j0.e;
import j0.e1;
import j0.k;
import j0.k0;
import j0.n1;
import j0.u;
import j0.v0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import t9.y0;
import v0.b;
import w.f;
import wz.p;
/* compiled from: BuyerScreen.kt */
/* loaded from: classes2.dex */
public final class BuyerScreenKt {
    public static final boolean A(q qVar) {
        ArrayList arrayList;
        boolean z11;
        List<AttributesMapper.AttributesDataModel> d11 = qVar.c().d().d();
        boolean z12 = false;
        if (d11 != null) {
            arrayList = new ArrayList();
            for (Object obj : d11) {
                if (((AttributesMapper.AttributesDataModel) obj).j() == AttributeType.BOOL) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        return !((arrayList == null || arrayList.isEmpty()) ? true : true);
    }

    public static final boolean B(q qVar) {
        boolean z11;
        String o11 = qVar.c().d().o();
        if (o11 != null && o11.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        return !z11;
    }

    public static final boolean C(q qVar) {
        if (qVar.c().d().F() != null) {
            return true;
        }
        return false;
    }

    public static final boolean D(q qVar) {
        ArrayList arrayList;
        boolean z11;
        List<AttributesMapper.AttributesDataModel> d11 = qVar.c().d().d();
        boolean z12 = false;
        if (d11 != null) {
            arrayList = new ArrayList();
            for (Object obj : d11) {
                if (((AttributesMapper.AttributesDataModel) obj).j() != AttributeType.BOOL) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        return !((arrayList == null || arrayList.isEmpty()) ? true : true);
    }

    public static final void a(final BuyerListingDetailsScreenViewModel viewModel, final t buyerUIState, final g00.q<? super MediaTypes.Images, ? super DetailsModel, ? super ShareText, p> onImageClicked, final l<? super String, p> onVideoClicked, final g00.q<? super MediaTypes.ThreeDTour, ? super DetailsModel, ? super ShareText, p> onVirtualTourClicked, final a<p> onRefreshGeneralError, final l<? super cb.a, p> onBreadCrumbsClicked, final l<? super cb.a, p> onSimilarAdsSeeAllClicked, final a<p> onRecentlyViewedSeeAllClicked, final l<? super gb.a, p> onMainInfoVisible, final g00.q<? super MediaTypes, ? super DetailsModel, ? super ShareText, p> onAttributeFileClicked, final r<? super LatLng, ? super Boolean, ? super DetailsModel, ? super ShareText, p> onMapClicked, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        androidx.compose.runtime.a aVar2;
        o.i(viewModel, "viewModel");
        o.i(buyerUIState, "buyerUIState");
        o.i(onImageClicked, "onImageClicked");
        o.i(onVideoClicked, "onVideoClicked");
        o.i(onVirtualTourClicked, "onVirtualTourClicked");
        o.i(onRefreshGeneralError, "onRefreshGeneralError");
        o.i(onBreadCrumbsClicked, "onBreadCrumbsClicked");
        o.i(onSimilarAdsSeeAllClicked, "onSimilarAdsSeeAllClicked");
        o.i(onRecentlyViewedSeeAllClicked, "onRecentlyViewedSeeAllClicked");
        o.i(onMainInfoVisible, "onMainInfoVisible");
        o.i(onAttributeFileClicked, "onAttributeFileClicked");
        o.i(onMapClicked, "onMapClicked");
        androidx.compose.runtime.a h11 = aVar.h(1813725414);
        if (c.I()) {
            c.U(1813725414, i11, i12, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreen (BuyerScreen.kt:82)");
        }
        n1 b11 = z.b(viewModel.s0(), null, h11, 8, 1);
        n1 b12 = z.b(viewModel.u0(), null, h11, 8, 1);
        n1 b13 = z.b(viewModel.z0(), null, h11, 8, 1);
        n1 b14 = z.b(viewModel.t0(), null, h11, 8, 1);
        final n1 b15 = z.b(viewModel.r0(), null, h11, 8, 1);
        if (o.d(buyerUIState, t.d.f26515a)) {
            h11.C(217636706);
            k(h11, 0);
            h11.S();
            aVar2 = h11;
        } else if (buyerUIState instanceof t.a) {
            h11.C(217636757);
            q a11 = ((t.a) buyerUIState).a();
            SectionState c11 = c(b12);
            SectionState d11 = d(b13);
            SectionState e11 = e(b14);
            AdManagerAdRequest b16 = b(b11);
            g00.q<MediaTypes.Images, DetailsModel, ShareText, p> qVar = new g00.q<MediaTypes.Images, DetailsModel, ShareText, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$BuyerScreen$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                public final void b(MediaTypes.Images media, DetailsModel model, ShareText shareText) {
                    o.i(media, "media");
                    o.i(model, "model");
                    o.i(shareText, "shareText");
                    BuyerListingDetailsScreenViewModel.this.q1(media);
                    onImageClicked.invoke(media, model, shareText);
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(MediaTypes.Images images, DetailsModel detailsModel, ShareText shareText) {
                    b(images, detailsModel, shareText);
                    return p.f75480a;
                }
            };
            l<String, p> lVar = new l<String, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$BuyerScreen$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void b(String it2) {
                    o.i(it2, "it");
                    BuyerListingDetailsScreenViewModel.this.q1(MediaTypes.Video.f26313a);
                    onVideoClicked.invoke(it2);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(String str) {
                    b(str);
                    return p.f75480a;
                }
            };
            g00.q<MediaTypes.ThreeDTour, DetailsModel, ShareText, p> qVar2 = new g00.q<MediaTypes.ThreeDTour, DetailsModel, ShareText, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$BuyerScreen$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                public final void b(MediaTypes.ThreeDTour media, DetailsModel model, ShareText shareText) {
                    o.i(media, "media");
                    o.i(model, "model");
                    o.i(shareText, "shareText");
                    BuyerListingDetailsScreenViewModel.this.q1(media);
                    onVirtualTourClicked.invoke(media, model, shareText);
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(MediaTypes.ThreeDTour threeDTour, DetailsModel detailsModel, ShareText shareText) {
                    b(threeDTour, detailsModel, shareText);
                    return p.f75480a;
                }
            };
            l<NewListingDetailsViewModel.ActionType, p> lVar2 = new l<NewListingDetailsViewModel.ActionType, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$BuyerScreen$4
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(NewListingDetailsViewModel.ActionType it2) {
                    o.i(it2, "it");
                    BuyerListingDetailsScreenViewModel.N0(BuyerListingDetailsScreenViewModel.this, null, 1, null);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(NewListingDetailsViewModel.ActionType actionType) {
                    b(actionType);
                    return p.f75480a;
                }
            };
            l<NewListingDetailsViewModel.ActionType, p> lVar3 = new l<NewListingDetailsViewModel.ActionType, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$BuyerScreen$5
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(NewListingDetailsViewModel.ActionType it2) {
                    o.i(it2, "it");
                    BuyerListingDetailsScreenViewModel.this.O0();
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(NewListingDetailsViewModel.ActionType actionType) {
                    b(actionType);
                    return p.f75480a;
                }
            };
            l<NewListingDetailsViewModel.ActionType, p> lVar4 = new l<NewListingDetailsViewModel.ActionType, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$BuyerScreen$6
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(NewListingDetailsViewModel.ActionType it2) {
                    o.i(it2, "it");
                    BuyerListingDetailsScreenViewModel.W0(BuyerListingDetailsScreenViewModel.this, null, 1, null);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(NewListingDetailsViewModel.ActionType actionType) {
                    b(actionType);
                    return p.f75480a;
                }
            };
            l<UserProfileData, p> lVar5 = new l<UserProfileData, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$BuyerScreen$7
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(UserProfileData it2) {
                    o.i(it2, "it");
                    BuyerListingDetailsScreenViewModel.this.S0(it2);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(UserProfileData userProfileData) {
                    b(userProfileData);
                    return p.f75480a;
                }
            };
            l<Integer, p> lVar6 = new l<Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$BuyerScreen$8
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(int i13) {
                    BuyerListingDetailsScreenViewModel.this.R0(i13, true);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(Integer num) {
                    b(num.intValue());
                    return p.f75480a;
                }
            };
            l<lf.a, p> lVar7 = new l<lf.a, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$BuyerScreen$9
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(lf.a it2) {
                    o.i(it2, "it");
                    BuyerListingDetailsScreenViewModel.this.t1(it2);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(lf.a aVar3) {
                    b(aVar3);
                    return p.f75480a;
                }
            };
            a<p> aVar3 = new a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$BuyerScreen$10
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
                    BuyerListingDetailsScreenViewModel.this.d1();
                }
            };
            a<p> aVar4 = new a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$BuyerScreen$11
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
                    BuyerListingDetailsScreenViewModel.this.c1();
                }
            };
            h11.C(1157296644);
            boolean T = h11.T(onMainInfoVisible);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new l<gb.a, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$BuyerScreen$12$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void b(gb.a it2) {
                        o.i(it2, "it");
                        onMainInfoVisible.invoke(it2);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(gb.a aVar5) {
                        b(aVar5);
                        return p.f75480a;
                    }
                };
                h11.u(D);
            }
            h11.S();
            g(a11, c11, d11, e11, b16, qVar, lVar, qVar2, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, aVar3, aVar4, onBreadCrumbsClicked, onSimilarAdsSeeAllClicked, onRecentlyViewedSeeAllClicked, (l) D, new l<s, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$BuyerScreen$13
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(s it2) {
                    o.i(it2, "it");
                    BuyerListingDetailsScreenViewModel.this.s1(it2);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(s sVar) {
                    b(sVar);
                    return p.f75480a;
                }
            }, new g00.q<MediaTypes, DetailsModel, ShareText, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$BuyerScreen$14
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                public final void b(MediaTypes media, DetailsModel model, ShareText shareText) {
                    o.i(media, "media");
                    o.i(model, "model");
                    o.i(shareText, "shareText");
                    BuyerListingDetailsScreenViewModel.this.q1(media);
                    onAttributeFileClicked.invoke(media, model, shareText);
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(MediaTypes mediaTypes, DetailsModel detailsModel, ShareText shareText) {
                    b(mediaTypes, detailsModel, shareText);
                    return p.f75480a;
                }
            }, new a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$BuyerScreen$15
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
                    BuyerListingDetailsScreenViewModel.this.e0();
                }
            }, new r<LatLng, Boolean, DetailsModel, ShareText, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$BuyerScreen$16
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(4);
                }

                public final void b(LatLng latLng, boolean z11, DetailsModel model, ShareText shareText) {
                    o.i(latLng, "latLng");
                    o.i(model, "model");
                    o.i(shareText, "shareText");
                    BuyerListingDetailsScreenViewModel.this.i1();
                    onMapClicked.d(latLng, Boolean.valueOf(z11), model, shareText);
                }

                @Override // g00.r
                public /* bridge */ /* synthetic */ p d(LatLng latLng, Boolean bool, DetailsModel detailsModel, ShareText shareText) {
                    b(latLng, bool.booleanValue(), detailsModel, shareText);
                    return p.f75480a;
                }
            }, new a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$BuyerScreen$17
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
                    ab.a f11;
                    BuyerListingDetailsScreenViewModel.this.Q0();
                    f11 = BuyerScreenKt.f(b15);
                    if (f11 != null) {
                        BuyerListingDetailsScreenViewModel.this.Y0(f11);
                    }
                }
            }, viewModel, h11, 32776, (i11 & 3670016) | (i11 & 29360128) | (i11 & 234881024), 262144);
            h11.S();
            aVar2 = h11;
        } else if (buyerUIState instanceof t.c) {
            aVar2 = h11;
            aVar2.C(217639476);
            h(((t.c) buyerUIState).a(), null, null, y0.X0, y0.W0, new a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$BuyerScreen$18
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
                    BuyerListingDetailsScreenViewModel.this.o1();
                }
            }, onRefreshGeneralError, aVar2, ((i11 << 3) & 3670016) | 392, 2);
            aVar2.S();
        } else {
            aVar2 = h11;
            if (buyerUIState instanceof t.b) {
                aVar2.C(217639856);
                h(((t.b) buyerUIState).a().b(), PaddingKt.i(androidx.compose.ui.c.f7566a, h.l(40)), Integer.valueOf(y0.Y4), y0.Q0, y0.P0, new a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$BuyerScreen$19
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
                        BuyerListingDetailsScreenViewModel.this.o1();
                    }
                }, new a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$BuyerScreen$20
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
                        BuyerListingDetailsScreenViewModel.this.o1();
                    }
                }, aVar2, 56, 0);
                aVar2.S();
            } else {
                aVar2.C(217640403);
                aVar2.S();
            }
        }
        if (c.I()) {
            c.T();
        }
        d1 l11 = aVar2.l();
        if (l11 == null) {
            return;
        }
        l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$BuyerScreen$21
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar5, int i13) {
                BuyerScreenKt.a(BuyerListingDetailsScreenViewModel.this, buyerUIState, onImageClicked, onVideoClicked, onVirtualTourClicked, onRefreshGeneralError, onBreadCrumbsClicked, onSimilarAdsSeeAllClicked, onRecentlyViewedSeeAllClicked, onMainInfoVisible, onAttributeFileClicked, onMapClicked, aVar5, v0.a(i11 | 1), v0.a(i12));
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                b(aVar5, num.intValue());
                return p.f75480a;
            }
        });
    }

    private static final AdManagerAdRequest b(n1<AdManagerAdRequest> n1Var) {
        return n1Var.getValue();
    }

    private static final SectionState c(n1<? extends SectionState> n1Var) {
        return n1Var.getValue();
    }

    private static final SectionState d(n1<? extends SectionState> n1Var) {
        return n1Var.getValue();
    }

    private static final SectionState e(n1<? extends SectionState> n1Var) {
        return n1Var.getValue();
    }

    public static final ab.a f(n1<ab.a> n1Var) {
        return n1Var.getValue();
    }

    public static final void g(final q qVar, final SectionState sectionState, final SectionState sectionState2, final SectionState sectionState3, final AdManagerAdRequest adManagerAdRequest, final g00.q<? super MediaTypes.Images, ? super DetailsModel, ? super ShareText, p> qVar2, final l<? super String, p> lVar, final g00.q<? super MediaTypes.ThreeDTour, ? super DetailsModel, ? super ShareText, p> qVar3, final l<? super NewListingDetailsViewModel.ActionType, p> lVar2, final l<? super NewListingDetailsViewModel.ActionType, p> lVar3, final l<? super NewListingDetailsViewModel.ActionType, p> lVar4, final l<? super UserProfileData, p> lVar5, final l<? super Integer, p> lVar6, final l<? super lf.a, p> lVar7, final a<p> aVar, final a<p> aVar2, final l<? super cb.a, p> lVar8, final l<? super cb.a, p> lVar9, final a<p> aVar3, final l<? super gb.a, p> lVar10, final l<? super s, p> lVar11, final g00.q<? super MediaTypes, ? super DetailsModel, ? super ShareText, p> qVar4, final a<p> aVar4, final r<? super LatLng, ? super Boolean, ? super DetailsModel, ? super ShareText, p> rVar, final a<p> aVar5, final BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, androidx.compose.runtime.a aVar6, final int i11, final int i12, final int i13) {
        androidx.compose.runtime.a h11 = aVar6.h(-1199327367);
        if (c.I()) {
            c.U(-1199327367, i11, i12, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.Content (BuyerScreen.kt:207)");
        }
        h11.C(733328855);
        c.a aVar7 = androidx.compose.ui.c.f7566a;
        b.a aVar8 = b.f74009a;
        a0 g11 = BoxKt.g(aVar8.o(), false, h11, 0);
        h11.C(-1323940314);
        int a11 = e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        a<ComposeUiNode> a12 = companion.a();
        g00.q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar7);
        if (!(h11.k() instanceof d)) {
            e.c();
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
        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
        if (a13.f() || !o.d(a13.D(), Integer.valueOf(a11))) {
            a13.u(Integer.valueOf(a11));
            a13.p(Integer.valueOf(a11), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
        h11.C(-483455358);
        Arrangement arrangement = Arrangement.f3698a;
        a0 a14 = androidx.compose.foundation.layout.e.a(arrangement.h(), aVar8.k(), h11, 0);
        h11.C(-1323940314);
        int a15 = e.a(h11, 0);
        k s12 = h11.s();
        a<ComposeUiNode> a16 = companion.a();
        g00.q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(aVar7);
        if (!(h11.k() instanceof d)) {
            e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a16);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a17 = Updater.a(h11);
        Updater.c(a17, a14, companion.e());
        Updater.c(a17, s12, companion.g());
        g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
        if (a17.f() || !o.d(a17.D(), Integer.valueOf(a15))) {
            a17.u(Integer.valueOf(a15));
            a17.p(Integer.valueOf(a15), b12);
        }
        c12.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        h11.C(-492369756);
        Object D = h11.D();
        a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
        if (D == c0064a.a()) {
            D = c0.e(GamStates.IS_LOADING, null, 2, null);
            h11.u(D);
        }
        h11.S();
        final k0 k0Var = (k0) D;
        LazyListState c13 = LazyListStateKt.c(0, 0, h11, 6, 2);
        n(c13, lVar11, lVar10, qVar, h11, ((i13 << 3) & 112) | RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT | ((i12 >> 21) & 896));
        LazyDslKt.a(w.e.c(fVar, aVar7, 1.0f, false, 2, null), c13, null, false, null, null, null, false, new l<LazyListScope, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$Content$1$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x0119  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x0182  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x01a8  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x01d0  */
            /* JADX WARN: Removed duplicated region for block: B:58:0x01e5  */
            /* JADX WARN: Removed duplicated region for block: B:68:0x024f  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x0264  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x02cd  */
            /* JADX WARN: Removed duplicated region for block: B:80:0x02e2  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void b(androidx.compose.foundation.lazy.LazyListScope r18) {
                /*
                    Method dump skipped, instructions count: 828
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$Content$1$1$1.b(androidx.compose.foundation.lazy.LazyListScope):void");
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(LazyListScope lazyListScope) {
                b(lazyListScope);
                return p.f75480a;
            }
        }, h11, 0, 252);
        h11.C(-1210429627);
        CommonData d11 = qVar.c().d();
        androidx.compose.ui.c i14 = SizeKt.i(SizeKt.h(aVar7, 0.0f, 1, null), h.l(1));
        dk.a aVar9 = dk.a.f54291a;
        int i15 = dk.a.f54292b;
        yj.d e11 = aVar9.a(h11, i15).e();
        int i16 = yj.d.f76453b;
        DividersKt.a(i14, 0.0f, e11.h(h11, i16), h11, 6, 2);
        boolean K = d11.K();
        boolean f11 = d11.f();
        CTAsVisibility m11 = d11.m();
        androidx.compose.ui.c b13 = BackgroundKt.b(aVar7, aVar9.a(h11, i15).g().c(h11, i16), null, 2, null);
        h11.C(1157296644);
        boolean T = h11.T(lVar2);
        Object D2 = h11.D();
        if (T || D2 == c0064a.a()) {
            D2 = new l<NewListingDetailsViewModel.ActionType, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$Content$1$1$2$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void b(NewListingDetailsViewModel.ActionType it2) {
                    o.i(it2, "it");
                    lVar2.invoke(it2);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(NewListingDetailsViewModel.ActionType actionType) {
                    b(actionType);
                    return p.f75480a;
                }
            };
            h11.u(D2);
        }
        h11.S();
        l lVar12 = (l) D2;
        h11.C(1157296644);
        boolean T2 = h11.T(lVar3);
        Object D3 = h11.D();
        if (T2 || D3 == c0064a.a()) {
            D3 = new l<NewListingDetailsViewModel.ActionType, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$Content$1$1$2$2$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void b(NewListingDetailsViewModel.ActionType it2) {
                    o.i(it2, "it");
                    lVar3.invoke(it2);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(NewListingDetailsViewModel.ActionType actionType) {
                    b(actionType);
                    return p.f75480a;
                }
            };
            h11.u(D3);
        }
        h11.S();
        l lVar13 = (l) D3;
        h11.C(1157296644);
        boolean T3 = h11.T(lVar4);
        Object D4 = h11.D();
        if (T3 || D4 == c0064a.a()) {
            D4 = new l<NewListingDetailsViewModel.ActionType, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$Content$1$1$2$3$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void b(NewListingDetailsViewModel.ActionType it2) {
                    o.i(it2, "it");
                    lVar4.invoke(it2);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(NewListingDetailsViewModel.ActionType actionType) {
                    b(actionType);
                    return p.f75480a;
                }
            };
            h11.u(D4);
        }
        h11.S();
        BuyerStickyCTAsKt.a(K, f11, b13, false, m11, lVar12, lVar13, (l) D4, h11, 3072, 0);
        h11.S();
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        BuyerScaffoldKt.d(buyerListingDetailsScreenViewModel, h11, 8);
        l(buyerListingDetailsScreenViewModel, new l<fb.a, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$Content$1$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(fb.a reportAbuseModel) {
                o.i(reportAbuseModel, "reportAbuseModel");
                BuyerListingDetailsScreenViewModel.this.u1(reportAbuseModel.a(), reportAbuseModel.b());
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(fb.a aVar10) {
                b(aVar10);
                return p.f75480a;
            }
        }, new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$Content$1$3
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
                BuyerListingDetailsScreenViewModel.this.r1(false);
            }
        }, h11, 8);
        androidx.compose.ui.c e12 = boxScopeInstance.e(aVar7, aVar8.b());
        h11.C(-483455358);
        a0 a18 = androidx.compose.foundation.layout.e.a(arrangement.h(), aVar8.k(), h11, 0);
        h11.C(-1323940314);
        int a19 = e.a(h11, 0);
        k s13 = h11.s();
        g00.a<ComposeUiNode> a21 = companion.a();
        g00.q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c14 = LayoutKt.c(e12);
        if (!(h11.k() instanceof d)) {
            e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a21);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a22 = Updater.a(h11);
        Updater.c(a22, a18, companion.e());
        Updater.c(a22, s13, companion.g());
        g00.p<ComposeUiNode, Integer, p> b14 = companion.b();
        if (a22.f() || !o.d(a22.D(), Integer.valueOf(a19))) {
            a22.u(Integer.valueOf(a19));
            a22.p(Integer.valueOf(a19), b14);
        }
        c14.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        float f12 = 16;
        FeedbackSnackBarComponentKt.a(PaddingKt.l(aVar7, h.l(f12), h.l(f12), h.l(f12), h.l(80)), buyerListingDetailsScreenViewModel.q0(), h11, 70, 0);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$Content$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar10, int i17) {
                BuyerScreenKt.g(q.this, sectionState, sectionState2, sectionState3, adManagerAdRequest, qVar2, lVar, qVar3, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, aVar, aVar2, lVar8, lVar9, aVar3, lVar10, lVar11, qVar4, aVar4, rVar, aVar5, buyerListingDetailsScreenViewModel, aVar10, v0.a(i11 | 1), v0.a(i12), v0.a(i13));
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar10, Integer num) {
                b(aVar10, num.intValue());
                return p.f75480a;
            }
        });
    }

    public static final void h(final Throwable th2, androidx.compose.ui.c cVar, Integer num, int i11, int i12, final g00.a<p> aVar, final g00.a<p> aVar2, androidx.compose.runtime.a aVar3, final int i13, final int i14) {
        final androidx.compose.ui.c cVar2;
        final Integer num2;
        int i15;
        int i16;
        int i17;
        androidx.compose.runtime.a h11 = aVar3.h(-359570147);
        if ((i14 & 2) != 0) {
            cVar2 = androidx.compose.ui.c.f7566a;
        } else {
            cVar2 = cVar;
        }
        if ((i14 & 4) != 0) {
            num2 = Integer.valueOf(gk.c.f56940f);
            i15 = i13 & (-897);
        } else {
            num2 = num;
            i15 = i13;
        }
        if ((i14 & 8) != 0) {
            i15 &= -7169;
            i16 = gk.c.f56939e;
        } else {
            i16 = i11;
        }
        if ((i14 & 16) != 0) {
            i15 &= -57345;
            i17 = gk.c.f56943i;
        } else {
            i17 = i12;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-359570147, i15, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.DetailsError (BuyerScreen.kt:557)");
        }
        if (th2 instanceof ConnectivityInterceptor.ConnectivityException) {
            h11.C(727422400);
            h11.C(1157296644);
            boolean T = h11.T(aVar);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$DetailsError$1$1
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
                        aVar.invoke();
                    }
                };
                h11.u(D);
            }
            h11.S();
            StateKt.a(null, 0, 0, 0, (g00.a) D, h11, 0, 15);
            h11.S();
        } else {
            h11.C(727422575);
            h11.C(1157296644);
            boolean T2 = h11.T(aVar2);
            Object D2 = h11.D();
            if (T2 || D2 == androidx.compose.runtime.a.f7182a.a()) {
                D2 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$DetailsError$2$1
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
                        aVar2.invoke();
                    }
                };
                h11.u(D2);
            }
            h11.S();
            int i18 = i15 >> 3;
            int i19 = (i18 & 896) | (i18 & 14) | (i18 & 112) | (i15 & 57344);
            StateKt.b(cVar2, num2, i16, 0, i17, (g00.a) D2, h11, i19, 8);
            h11.S();
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            final int i21 = i16;
            final int i22 = i17;
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$DetailsError$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i23) {
                    BuyerScreenKt.h(th2, cVar2, num2, i21, i22, aVar, aVar2, aVar4, v0.a(i13 | 1), i14);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num3) {
                    b(aVar4, num3.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void i(androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(355215394);
        if (i11 == 0 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(355215394, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.Divider (BuyerScreen.kt:526)");
            }
            DividersKt.a(SizeKt.i(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), h.l(8)), 0.0f, dk.a.f54291a.a(h11, dk.a.f54292b).e().h(h11, yj.d.f76453b), h11, 6, 2);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$Divider$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    BuyerScreenKt.i(aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void j(androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(1907318403);
        if (i11 == 0 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1907318403, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.LoadingRecommendedListingShimmer (BuyerScreen.kt:175)");
            }
            AdsShimmerKt.a(true, h11, 6, 0);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$LoadingRecommendedListingShimmer$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    BuyerScreenKt.j(aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void k(androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(-258144902);
        if (i11 == 0 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-258144902, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.LoadingShimmer (BuyerScreen.kt:171)");
            }
            ListingDetailsShimmerKt.e(true, h11, 6, 0);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$LoadingShimmer$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    BuyerScreenKt.k(aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void l(final BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, final l<? super fb.a, p> lVar, final g00.a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
        androidx.compose.runtime.a h11 = aVar2.h(2055661277);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(2055661277, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.ReportAbuseBottomSheet (BuyerScreen.kt:463)");
        }
        n1 b11 = z.b(buyerListingDetailsScreenViewModel.v0(), null, h11, 8, 1);
        ModalBottomSheetState k11 = BottomSheetsKt.k(ModalBottomSheetValue.Hidden, null, true, null, h11, 390, 10);
        h11.C(-483455358);
        c.a aVar3 = androidx.compose.ui.c.f7566a;
        a0 a11 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), b.f74009a.k(), h11, 0);
        h11.C(-1323940314);
        int a12 = e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        g00.q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar3);
        if (!(h11.k() instanceof d)) {
            e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a13);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a14 = Updater.a(h11);
        Updater.c(a14, a11, companion.e());
        Updater.c(a14, s11, companion.g());
        g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b12);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        boolean m11 = m(b11);
        h11.C(-1619459424);
        Boolean valueOf = Boolean.valueOf(m11);
        Boolean valueOf2 = Boolean.valueOf(m11);
        h11.C(511388516);
        boolean T = h11.T(valueOf2) | h11.T(k11);
        Object D = h11.D();
        if (T || D == androidx.compose.runtime.a.f7182a.a()) {
            D = new BuyerScreenKt$ReportAbuseBottomSheet$1$1$1$1(m11, k11, null);
            h11.u(D);
        }
        h11.S();
        u.d(valueOf, (g00.p) D, h11, 64);
        if (m11) {
            ShowReportAbuseBottomSheetKt.a(k11, lVar, aVar, h11, (i11 & 112) | (i11 & 896));
        }
        h11.S();
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$ReportAbuseBottomSheet$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i12) {
                    BuyerScreenKt.l(BuyerListingDetailsScreenViewModel.this, lVar, aVar, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    private static final boolean m(n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }

    public static final void n(final LazyListState lazyListState, final l<? super s, p> lVar, final l<? super gb.a, p> lVar2, final q qVar, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(721110705);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(721110705, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.SetScrollingBehavior (BuyerScreen.kt:492)");
        }
        int i12 = (i11 & 14) | 64;
        u.d(lazyListState, new BuyerScreenKt$SetScrollingBehavior$1(lazyListState, lVar, qVar, null), h11, i12);
        u.d(lazyListState, new BuyerScreenKt$SetScrollingBehavior$2(lazyListState, lVar2, qVar, null), h11, i12);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$SetScrollingBehavior$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i13) {
                    BuyerScreenKt.n(LazyListState.this, lVar, lVar2, qVar, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final /* synthetic */ void s(androidx.compose.runtime.a aVar, int i11) {
        j(aVar, i11);
    }
}
