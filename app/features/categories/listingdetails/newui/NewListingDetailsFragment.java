package com.forsale.app.features.categories.listingdetails.newui;

import aa.g8;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.u;
import androidx.annotation.Keep;
import androidx.appcompat.app.c;
import androidx.compose.runtime.c;
import androidx.compose.runtime.z;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.base.ActionViewsMode;
import com.forsale.app.base.ViewStates;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingUser;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.forsale.app.datalayer.repositories.CategoryDao;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.features.banners.TeadsItem;
import com.forsale.app.features.categories.listingdetails.ListingDetailsActivity;
import com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel;
import com.forsale.app.features.categories.listingdetails.buyerctas.BuyerStickyCTAsKt;
import com.forsale.app.features.categories.listingdetails.buyerctas.CTAsVisibility;
import com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.ListingChatActivity;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.UserActionsItem;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.descriptionitem.DescriptionItem;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesViewModel;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.locationitem.LocationItem;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.maininfo.MainInfoItem;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.maininfo.MainInfoItemViewModel;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.recommendedlistings.RecommendedListItemViewModel;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerStickyBarKt;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem.AnalyticCardItem;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem.AnalyticCardViewModel;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.autorepost.AutoRepostItem;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.autorepost.AutoRepostViewModel;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.boostyourad.BoostYourAdItem;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.boostyourad.BoostYourAdViewModel;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.ListingLifeTimeItem;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.ListingLifeTimeItemViewModel;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItem;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.quarantineitem.QuarantineCardItem;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.quarantineitem.QuarantineCardViewModel;
import com.forsale.app.features.categories.user.profile.UserProfileData;
import com.forsale.app.routing.plfRouting.shared.PLFResult;
import com.forsale.app.ui.bottomsheets.listingDetailsLogin.LoginBottomSheet;
import com.forsale.app.ui.bottomsheets.listingdetailschat.ChatNowBottomSheet;
import com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.MoreActionsBottomSheet;
import com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet;
import com.forsale.app.ui.bottomsheets.listingdetailsselleranalytic.SellerAnalyticsBottomSheet;
import com.forsale.app.ui.bottomsheets.listingdetailssellersettings.SellerSettingsBottomSheet;
import com.forsale.app.ui.bottomsheets.movetootherapp.MoveToOtherAppBottomSheet;
import com.forsale.app.ui.bottomsheets.updateapp.UpdateAppAlertBottomSheet;
import com.forsale.app.ui.bottomsheets.useractions.ReportAbuseBottomSheet;
import com.forsale.app.ui.bottomsheets.useractions.ReportAbuseIntention;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.CrashlyticsUtilsKt;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import com.forsale.app.utils.a0;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.VirtualTourPosition;
import com.forsale.core.util.ContextExtensionKt;
import com.forsale.designSystem.theme.ThemeKt;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import g00.l;
import j0.n1;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Triple;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import t9.p0;
import t9.t0;
import t9.y0;
import v9.c;
import wz.p;
import xb.b;
/* compiled from: NewListingDetailsFragment.kt */
/* loaded from: classes2.dex */
public final class NewListingDetailsFragment extends hb.a<g8, NewListingDetailsViewModel> implements v9.c {
    private final int A = t0.E1;
    private final wz.h B;
    public NewListingDetailsViewModel.a C;
    private final wz.h D;
    public cx.a<ag.a> E;
    private final androidx.activity.result.b<Intent> F;
    private final androidx.activity.result.b<Intent> G;
    private final lr.a<kr.m<?>> H;
    private final kr.b<kr.m<?>> I;
    public CategoryDao J;
    public AggregatedAllAnalyticsLogger K;
    public ApplicationResourcesRepository L;
    public RegionsRepository M;
    public DistrictsRepository N;
    public CategoriesRepositories O;
    public jj.b P;

    /* compiled from: NewListingDetailsFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27009a;

        static {
            int[] iArr = new int[NewListingDetailsViewModel.UserType.values().length];
            try {
                iArr[NewListingDetailsViewModel.UserType.BUYER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f27009a = iArr;
        }
    }

    /* compiled from: NewListingDetailsFragment.kt */
    /* loaded from: classes2.dex */
    static final class b implements androidx.activity.result.a<ActivityResult> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f27044a = new b();

        b() {
        }

        @Override // androidx.activity.result.a
        /* renamed from: b */
        public final void a(ActivityResult activityResult) {
            Intent a11 = activityResult.a();
            if (a11 != null) {
                PLFResult.f37812e.a(a11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NewListingDetailsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c implements FlowCollector<tg.c> {
        c() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(tg.c cVar, zz.a<? super p> aVar) {
            if (cVar != null && NewListingDetailsFragment.this.getActivity() != null) {
                NewListingDetailsFragment newListingDetailsFragment = NewListingDetailsFragment.this;
                MoreActionsBottomSheet moreActionsBottomSheet = new MoreActionsBottomSheet();
                newListingDetailsFragment.v0(moreActionsBottomSheet, cVar);
                moreActionsBottomSheet.show(newListingDetailsFragment.getChildFragmentManager(), "MoreActionsBottomSheet");
            }
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NewListingDetailsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d implements FlowCollector<Boolean> {
        d() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(Boolean bool, zz.a<? super p> aVar) {
            Context context;
            if (kotlin.jvm.internal.o.d(bool, kotlin.coroutines.jvm.internal.a.a(true)) && (context = NewListingDetailsFragment.this.getContext()) != null) {
                NewListingDetailsFragment newListingDetailsFragment = NewListingDetailsFragment.this;
                UpdateAppAlertBottomSheet updateAppAlertBottomSheet = new UpdateAppAlertBottomSheet(null, 1, null);
                FragmentManager childFragmentManager = newListingDetailsFragment.getChildFragmentManager();
                kotlin.jvm.internal.o.h(childFragmentManager, "getChildFragmentManager(...)");
                updateAppAlertBottomSheet.a(childFragmentManager, context);
            }
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NewListingDetailsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class e implements FlowCollector<String> {
        e() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(String str, zz.a<? super p> aVar) {
            if (str != null) {
                NewListingDetailsFragment.this.y0(str);
            }
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NewListingDetailsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class f implements FlowCollector<ListingItemDetails> {
        f() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(ListingItemDetails listingItemDetails, zz.a<? super p> aVar) {
            if (listingItemDetails != null) {
                new ReportAbuseBottomSheet(kotlin.coroutines.jvm.internal.a.d(listingItemDetails.getId()), null, null, NewListingDetailsFragment.this.l0().t1().getValue(), ReportAbuseIntention.LISTING, 6, null).show(NewListingDetailsFragment.this.getChildFragmentManager(), "REPORT_ABUSE_BOTTOM_SHEET");
            }
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NewListingDetailsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class g implements FlowCollector<NewListingDetailsViewModel.ActionType> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f27049a = new g();

        g() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(NewListingDetailsViewModel.ActionType actionType, zz.a<? super p> aVar) {
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NewListingDetailsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class h implements FlowCollector<p> {
        h() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            SellerAnalyticsBottomSheet.a aVar2 = SellerAnalyticsBottomSheet.B;
            FragmentManager childFragmentManager = NewListingDetailsFragment.this.getChildFragmentManager();
            kotlin.jvm.internal.o.h(childFragmentManager, "getChildFragmentManager(...)");
            aVar2.a(childFragmentManager);
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NewListingDetailsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class i implements FlowCollector<ListingItemDetails> {
        i() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(ListingItemDetails listingItemDetails, zz.a<? super p> aVar) {
            SellerSettingsBottomSheet.a aVar2 = SellerSettingsBottomSheet.E;
            FragmentManager childFragmentManager = NewListingDetailsFragment.this.getChildFragmentManager();
            kotlin.jvm.internal.o.h(childFragmentManager, "getChildFragmentManager(...)");
            aVar2.a(childFragmentManager);
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NewListingDetailsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class j implements FlowCollector<Triple<? extends String, ? extends String, ? extends String>> {
        j() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(Triple<String, String, String> triple, zz.a<? super p> aVar) {
            if (triple != null) {
                FragmentManager childFragmentManager = NewListingDetailsFragment.this.getChildFragmentManager();
                kotlin.jvm.internal.o.h(childFragmentManager, "getChildFragmentManager(...)");
                MoveToOtherAppBottomSheet.C.a(triple.d(), triple.e(), triple.f(), childFragmentManager);
            }
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NewListingDetailsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class k implements c0<ViewStates> {

        /* compiled from: NewListingDetailsFragment.kt */
        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f27054a;

            static {
                int[] iArr = new int[ViewStates.values().length];
                try {
                    iArr[ViewStates.CONTENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ViewStates.LOADING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ViewStates.CONNECTION_ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f27054a = iArr;
            }
        }

        k() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(ViewStates viewStates) {
            int i11;
            if (viewStates == null) {
                i11 = -1;
            } else {
                i11 = a.f27054a[viewStates.ordinal()];
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        NewListingDetailsFragment.J(NewListingDetailsFragment.this).R.d();
                        NewListingDetailsFragment.J(NewListingDetailsFragment.this).S.b(t0.S0, NewListingDetailsFragment.this);
                        return;
                    }
                    return;
                }
                NewListingDetailsFragment.J(NewListingDetailsFragment.this).S.d();
                NewListingDetailsFragment.J(NewListingDetailsFragment.this).R.c();
                NewListingDetailsFragment.J(NewListingDetailsFragment.this).T.setVisibility(8);
                return;
            }
            NewListingDetailsFragment.J(NewListingDetailsFragment.this).S.d();
            NewListingDetailsFragment.J(NewListingDetailsFragment.this).R.d();
            NewListingDetailsFragment.J(NewListingDetailsFragment.this).T.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NewListingDetailsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class l implements c0<ListingItemDetails> {
        l() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(ListingItemDetails listingItemDetails) {
            NewListingDetailsViewModel B = NewListingDetailsFragment.this.B();
            kotlin.jvm.internal.o.f(listingItemDetails);
            B.B2(listingItemDetails);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NewListingDetailsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class m implements FlowCollector<tg.c> {
        m() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(tg.c cVar, zz.a<? super p> aVar) {
            if (cVar != null && NewListingDetailsFragment.this.getActivity() != null) {
                NewListingDetailsFragment newListingDetailsFragment = NewListingDetailsFragment.this;
                MoreActionsBottomSheet moreActionsBottomSheet = new MoreActionsBottomSheet();
                newListingDetailsFragment.v0(moreActionsBottomSheet, cVar);
                moreActionsBottomSheet.show(newListingDetailsFragment.getChildFragmentManager(), "MoreActionsBottomSheet");
            }
            return p.f75480a;
        }
    }

    /* compiled from: ViewsExtensions.kt */
    /* loaded from: classes2.dex */
    public static final class n implements DialogInterface.OnClickListener {
        public n() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i11) {
            NewListingDetailsFragment.this.q0(new com.forsale.app.ui.bottomsheets.listingdetailschat.b(0, NewListingDetailsFragment.this.l0().Y0().getValue(), NewListingDetailsFragment.this.B().O1(), null, NewListingDetailsFragment.this.l0().x1(), NewListingDetailsFragment.this.l0().t1().getValue(), null, null, null, null, null, null, null, 8129, null));
        }
    }

    public NewListingDetailsFragment() {
        wz.h a11;
        wz.h b11;
        a11 = kotlin.d.a(new g00.a<ListingDetailsViewModel>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$sharedViewModel$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final ListingDetailsViewModel invoke() {
                androidx.fragment.app.p requireActivity = NewListingDetailsFragment.this.requireActivity();
                o.g(requireActivity, "null cannot be cast to non-null type com.forsale.app.features.categories.listingdetails.ListingDetailsActivity");
                return ((ListingDetailsActivity) requireActivity).m1();
            }
        });
        this.B = a11;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ NewListingDetailsFragment f27008f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, NewListingDetailsFragment newListingDetailsFragment) {
                    super(fragment, bundle);
                    this.f27008f = newListingDetailsFragment;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    NewListingDetailsViewModel a11 = this.f27008f.g0().a(this.f27008f.l0());
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
                return new a(Fragment.this, Fragment.this.getArguments(), this);
            }
        };
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5(new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4(this)));
        this.D = FragmentViewModelLazyKt.b(this, s.b(NewListingDetailsViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new androidx.activity.result.a<ActivityResult>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$launchPLFToRepostAd$1
            @Override // androidx.activity.result.a
            /* renamed from: b */
            public final void a(ActivityResult activityResult) {
                PLFResult a12;
                Intent a13 = activityResult.a();
                if (a13 != null && (a12 = PLFResult.f37812e.a(a13)) != null) {
                    final NewListingDetailsFragment newListingDetailsFragment = NewListingDetailsFragment.this;
                    boolean d11 = a12.d();
                    SellerActionResultBottomSheet.a aVar2 = SellerActionResultBottomSheet.G;
                    SellerActionType sellerActionType = SellerActionType.MANUAL_RE_POST;
                    FragmentManager childFragmentManager = newListingDetailsFragment.getChildFragmentManager();
                    o.h(childFragmentManager, "getChildFragmentManager(...)");
                    SellerActionResultBottomSheet.a.b(aVar2, sellerActionType, true, d11, null, childFragmentManager, false, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002c: INVOKE  
                          (r1v0 'aVar2' com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet$a)
                          (r2v0 'sellerActionType' com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType)
                          true
                          (r4v0 'd11' boolean)
                          (null java.lang.String)
                          (r6v0 'childFragmentManager' androidx.fragment.app.FragmentManager)
                          false
                          (wrap: g00.l<java.lang.Boolean, wz.p> : 0x0026: CONSTRUCTOR  (r8v0 g00.l<java.lang.Boolean, wz.p> A[REMOVE]) = 
                          (r0v1 'newListingDetailsFragment' com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment A[DONT_INLINE])
                         call: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$launchPLFToRepostAd$1$onActivityResult$1$1.<init>(com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment):void type: CONSTRUCTOR)
                          (40 int)
                          (null java.lang.Object)
                         type: STATIC call: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet.a.b(com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet$a, com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType, boolean, boolean, java.lang.String, androidx.fragment.app.FragmentManager, boolean, g00.l, int, java.lang.Object):void in method: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$launchPLFToRepostAd$1.b(androidx.activity.result.ActivityResult):void, file: classes2.dex
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
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$launchPLFToRepostAd$1$onActivityResult$1$1, state: NOT_LOADED
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
                        	... 23 more
                        */
                    /*
                        this = this;
                        android.content.Intent r12 = r12.a()
                        if (r12 == 0) goto L2f
                        com.forsale.app.routing.plfRouting.shared.PLFResult$a r0 = com.forsale.app.routing.plfRouting.shared.PLFResult.f37812e
                        com.forsale.app.routing.plfRouting.shared.PLFResult r12 = r0.a(r12)
                        if (r12 == 0) goto L2f
                        com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment r0 = com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment.this
                        boolean r4 = r12.d()
                        com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet$a r1 = com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet.G
                        com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType r2 = com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType.MANUAL_RE_POST
                        r3 = 1
                        r5 = 0
                        androidx.fragment.app.FragmentManager r6 = r0.getChildFragmentManager()
                        java.lang.String r12 = "getChildFragmentManager(...)"
                        kotlin.jvm.internal.o.h(r6, r12)
                        r7 = 0
                        com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$launchPLFToRepostAd$1$onActivityResult$1$1 r8 = new com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$launchPLFToRepostAd$1$onActivityResult$1$1
                        r8.<init>(r0)
                        r9 = 40
                        r10 = 0
                        com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet.a.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                    L2f:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$launchPLFToRepostAd$1.a(androidx.activity.result.ActivityResult):void");
                }
            });
            kotlin.jvm.internal.o.h(registerForActivityResult, "registerForActivityResult(...)");
            this.F = registerForActivityResult;
            androidx.activity.result.b<Intent> registerForActivityResult2 = registerForActivityResult(new e.d(), b.f27044a);
            kotlin.jvm.internal.o.h(registerForActivityResult2, "registerForActivityResult(...)");
            this.G = registerForActivityResult2;
            lr.a<kr.m<?>> aVar2 = new lr.a<>();
            this.H = aVar2;
            this.I = kr.b.f61943t.i(aVar2);
        }

        public static final /* synthetic */ g8 J(NewListingDetailsFragment newListingDetailsFragment) {
            return (g8) newListingDetailsFragment.m();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void a0(b.a aVar) {
            ListingItemDetails value;
            Object runBlocking$default;
            if (aVar instanceof b.a.g) {
                lr.a<kr.m<?>> aVar2 = this.H;
                b.a.g gVar = (b.a.g) aVar;
                List<pb.a> a11 = gVar.a();
                boolean b11 = gVar.b();
                androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
                kotlin.jvm.internal.o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                aVar2.n(new ob.a(a11, b11, viewLifecycleOwner, new g00.p<VirtualTourPosition, Long, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$addToView$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(2);
                    }

                    public final void b(VirtualTourPosition virtualTourPosition, Long l11) {
                        NewListingDetailsFragment.this.l0().Q1(virtualTourPosition, l11);
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(VirtualTourPosition virtualTourPosition, Long l11) {
                        b(virtualTourPosition, l11);
                        return p.f75480a;
                    }
                }));
            } else if (aVar instanceof b.a.h) {
                lr.a<kr.m<?>> aVar3 = this.H;
                b.a.h hVar = (b.a.h) aVar;
                mb.b bVar = new mb.b(hVar.a(), hVar.b(), hVar.c());
                androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
                kotlin.jvm.internal.o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                aVar3.n(new mb.a(bVar, viewLifecycleOwner2));
            } else if (aVar instanceof b.a.C0928b) {
                lr.a<kr.m<?>> aVar4 = this.H;
                b.a.C0928b c0928b = (b.a.C0928b) aVar;
                jb.a aVar5 = new jb.a(c0928b.a(), c0928b.b(), new g00.p<VirtualTourPosition, Long, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$addToView$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(2);
                    }

                    public final void b(VirtualTourPosition virtualTourPosition, Long l11) {
                        NewListingDetailsFragment.this.l0().Q1(virtualTourPosition, l11);
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(VirtualTourPosition virtualTourPosition, Long l11) {
                        b(virtualTourPosition, l11);
                        return p.f75480a;
                    }
                });
                androidx.lifecycle.s viewLifecycleOwner3 = getViewLifecycleOwner();
                kotlin.jvm.internal.o.h(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
                aVar4.n(new DescriptionItem(aVar5, viewLifecycleOwner3));
            } else if (aVar instanceof b.a.C0927a) {
                lr.a<kr.m<?>> aVar6 = this.H;
                b.a.C0927a c0927a = (b.a.C0927a) aVar;
                AttributesViewModel attributesViewModel = new AttributesViewModel(c0927a.a(), c0927a.b(), c0927a.c(), e0(), l0());
                androidx.lifecycle.s viewLifecycleOwner4 = getViewLifecycleOwner();
                kotlin.jvm.internal.o.h(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
                aVar6.n(new lb.a(attributesViewModel, viewLifecycleOwner4));
            } else if (aVar instanceof b.a.f) {
                lr.a<kr.m<?>> aVar7 = this.H;
                b.a.f fVar = (b.a.f) aVar;
                MainInfoItemViewModel mainInfoItemViewModel = new MainInfoItemViewModel(fVar.a(), fVar.b(), j0(), k0(), l0());
                androidx.lifecycle.s viewLifecycleOwner5 = getViewLifecycleOwner();
                kotlin.jvm.internal.o.h(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
                FragmentManager childFragmentManager = getChildFragmentManager();
                kotlin.jvm.internal.o.h(childFragmentManager, "getChildFragmentManager(...)");
                aVar7.n(new MainInfoItem(mainInfoItemViewModel, viewLifecycleOwner5, childFragmentManager));
            } else if (aVar instanceof b.a.n) {
                LiveData<ListingItemDetails> Y0 = l0().Y0();
                if (Y0 != null && (value = Y0.getValue()) != null) {
                    runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new NewListingDetailsFragment$addToView$3$1(this, value, null), 1, null);
                    lr.c cVar = (lr.c) runBlocking$default;
                }
            } else if (aVar instanceof b.a.e) {
                lr.a<kr.m<?>> aVar8 = this.H;
                b.a.e eVar = (b.a.e) aVar;
                com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.locationitem.a aVar9 = new com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.locationitem.a(l0(), l0().j1().C(), eVar.a(), eVar.b(), eVar.c());
                androidx.lifecycle.s viewLifecycleOwner6 = getViewLifecycleOwner();
                kotlin.jvm.internal.o.h(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
                aVar8.n(new LocationItem(aVar9, viewLifecycleOwner6));
            } else if (aVar instanceof b.a.k) {
                lr.a<kr.m<?>> aVar10 = this.H;
                RecommendedListItemViewModel recommendedListItemViewModel = new RecommendedListItemViewModel(l0(), j0(), k0());
                androidx.lifecycle.s viewLifecycleOwner7 = getViewLifecycleOwner();
                kotlin.jvm.internal.o.h(viewLifecycleOwner7, "getViewLifecycleOwner(...)");
                aVar10.n(new nb.c(recommendedListItemViewModel, viewLifecycleOwner7, new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$addToView$4
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
                        lr.a aVar11;
                        aVar11 = NewListingDetailsFragment.this.H;
                        aVar11.A(3334L);
                        NewListingDetailsFragment.J(NewListingDetailsFragment.this).P.B0();
                    }
                }));
            } else if (aVar instanceof b.a.m) {
                lr.a<kr.m<?>> aVar11 = this.H;
                NewListingDetailsViewModel B = B();
                androidx.lifecycle.s viewLifecycleOwner8 = getViewLifecycleOwner();
                kotlin.jvm.internal.o.h(viewLifecycleOwner8, "getViewLifecycleOwner(...)");
                aVar11.n(new UserActionsItem(B, viewLifecycleOwner8));
            } else if (aVar instanceof b.a.j) {
                lr.a<kr.m<?>> aVar12 = this.H;
                vb.b bVar2 = new vb.b(l0());
                androidx.lifecycle.s viewLifecycleOwner9 = getViewLifecycleOwner();
                kotlin.jvm.internal.o.h(viewLifecycleOwner9, "getViewLifecycleOwner(...)");
                aVar12.n(new vb.a(bVar2, viewLifecycleOwner9));
            } else if (aVar instanceof b.a.d) {
                ListingItemDetails value2 = l0().Y0().getValue();
                if (value2 != null) {
                    lr.a<kr.m<?>> aVar13 = this.H;
                    b.a.d dVar = (b.a.d) aVar;
                    DistrictsItemViewModel districtsItemViewModel = new DistrictsItemViewModel(value2, dVar.a(), dVar.b(), l0(), f0());
                    androidx.lifecycle.s viewLifecycleOwner10 = getViewLifecycleOwner();
                    kotlin.jvm.internal.o.h(viewLifecycleOwner10, "getViewLifecycleOwner(...)");
                    aVar13.n(new kb.a(districtsItemViewModel, viewLifecycleOwner10));
                }
            } else if (aVar instanceof b.a.c) {
                b.a.c cVar2 = (b.a.c) aVar;
                this.H.n(new za.a(this, new ib.a(new g00.l<b0<AdManagerAdRequest>, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$addToView$6

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* compiled from: NewListingDetailsFragment.kt */
                    @d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$addToView$6$1", f = "NewListingDetailsFragment.kt", l = {612}, m = "invokeSuspend")
                    /* renamed from: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$addToView$6$1  reason: invalid class name */
                    /* loaded from: classes2.dex */
                    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

                        /* renamed from: a  reason: collision with root package name */
                        Object f27027a;

                        /* renamed from: b  reason: collision with root package name */
                        int f27028b;

                        /* renamed from: c  reason: collision with root package name */
                        final /* synthetic */ b0<AdManagerAdRequest> f27029c;

                        /* renamed from: d  reason: collision with root package name */
                        final /* synthetic */ NewListingDetailsFragment f27030d;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(b0<AdManagerAdRequest> b0Var, NewListingDetailsFragment newListingDetailsFragment, zz.a<? super AnonymousClass1> aVar) {
                            super(2, aVar);
                            this.f27029c = b0Var;
                            this.f27030d = newListingDetailsFragment;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
                            return new AnonymousClass1(this.f27029c, this.f27030d, aVar);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.b0] */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object f11;
                            b0<AdManagerAdRequest> b0Var;
                            f11 = kotlin.coroutines.intrinsics.b.f();
                            int i11 = this.f27028b;
                            if (i11 != 0) {
                                if (i11 == 1) {
                                    b0Var = (b0) this.f27027a;
                                    f.b(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                f.b(obj);
                                b0<AdManagerAdRequest> b0Var2 = this.f27029c;
                                ListingDetailsViewModel l02 = this.f27030d.l0();
                                this.f27027a = b0Var2;
                                this.f27028b = 1;
                                Object D0 = l02.D0(this);
                                if (D0 == f11) {
                                    return f11;
                                }
                                b0Var = b0Var2;
                                obj = D0;
                            }
                            b0Var.postValue(obj);
                            return p.f75480a;
                        }

                        @Override // g00.p
                        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
                            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(1);
                    }

                    public final void b(b0<AdManagerAdRequest> adManagerLiveData) {
                        o.i(adManagerLiveData, "adManagerLiveData");
                        NewListingDetailsFragment newListingDetailsFragment = NewListingDetailsFragment.this;
                        BuildersKt__Builders_commonKt.launch$default(newListingDetailsFragment, null, null, new AnonymousClass1(adManagerLiveData, newListingDetailsFragment, null), 3, null);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(b0<AdManagerAdRequest> b0Var) {
                        b(b0Var);
                        return p.f75480a;
                    }
                }), cVar2.b(), cVar2.a()));
            } else if (aVar instanceof b.a.l) {
                b.a.l lVar = (b.a.l) aVar;
                this.H.n(new TeadsItem(new na.b(lVar.a(), lVar.b(), B().H1()), this));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b0(b.AbstractC0929b abstractC0929b) {
            if (abstractC0929b instanceof b.AbstractC0929b.j) {
                lr.a<kr.m<?>> aVar = this.H;
                b.AbstractC0929b.j jVar = (b.AbstractC0929b.j) abstractC0929b;
                wb.b bVar = new wb.b(B().y1(), jVar.b(), jVar.a(), jVar.c());
                androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
                kotlin.jvm.internal.o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                aVar.n(new wb.a(bVar, viewLifecycleOwner));
            } else if (abstractC0929b instanceof b.AbstractC0929b.h) {
                lr.a<kr.m<?>> aVar2 = this.H;
                PreviewCardItemViewModel previewCardItemViewModel = new PreviewCardItemViewModel(B(), ((b.AbstractC0929b.h) abstractC0929b).a(), f0());
                androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
                kotlin.jvm.internal.o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                FragmentManager childFragmentManager = getChildFragmentManager();
                kotlin.jvm.internal.o.h(childFragmentManager, "getChildFragmentManager(...)");
                aVar2.n(new PreviewCardItem(previewCardItemViewModel, viewLifecycleOwner2, childFragmentManager));
            } else if (abstractC0929b instanceof b.AbstractC0929b.f) {
                lr.a<kr.m<?>> aVar3 = this.H;
                ListingLifeTimeItemViewModel listingLifeTimeItemViewModel = new ListingLifeTimeItemViewModel(B(), ((b.AbstractC0929b.f) abstractC0929b).a(), k0(), d0(), f0());
                FragmentManager childFragmentManager2 = getChildFragmentManager();
                kotlin.jvm.internal.o.h(childFragmentManager2, "getChildFragmentManager(...)");
                aVar3.n(new ListingLifeTimeItem(listingLifeTimeItemViewModel, this, childFragmentManager2, new g00.l<Boolean, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$addToView$7
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(1);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return p.f75480a;
                    }

                    public final void invoke(boolean z11) {
                        NewListingDetailsFragment.this.s0(z11);
                    }
                }));
            } else if (abstractC0929b instanceof b.AbstractC0929b.a) {
                lr.a<kr.m<?>> aVar4 = this.H;
                AnalyticCardViewModel a11 = ((b.AbstractC0929b.a) abstractC0929b).a();
                androidx.lifecycle.s viewLifecycleOwner3 = getViewLifecycleOwner();
                kotlin.jvm.internal.o.h(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
                aVar4.n(new AnalyticCardItem(a11, viewLifecycleOwner3));
            } else if (abstractC0929b instanceof b.AbstractC0929b.d) {
                this.H.n(new BoostYourAdItem(new BoostYourAdViewModel(l0()), this));
            } else if (abstractC0929b instanceof b.AbstractC0929b.c) {
                lr.a<kr.m<?>> aVar5 = this.H;
                AutoRepostViewModel autoRepostViewModel = new AutoRepostViewModel(l0(), ((b.AbstractC0929b.c) abstractC0929b).a(), AggregatedAllAnalyticsLogger.AnalyticsPosition.MID_SCREEN, j0(), k0());
                androidx.lifecycle.s viewLifecycleOwner4 = getViewLifecycleOwner();
                kotlin.jvm.internal.o.h(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
                FragmentManager childFragmentManager3 = getChildFragmentManager();
                kotlin.jvm.internal.o.h(childFragmentManager3, "getChildFragmentManager(...)");
                aVar5.n(new AutoRepostItem(autoRepostViewModel, viewLifecycleOwner4, childFragmentManager3, new g00.l<Boolean, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$addToView$8
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(1);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return p.f75480a;
                    }

                    public final void invoke(boolean z11) {
                        NewListingDetailsFragment.this.s0(z11);
                    }
                }));
            } else if (abstractC0929b instanceof b.AbstractC0929b.C0930b) {
                lr.a<kr.m<?>> aVar6 = this.H;
                sb.b bVar2 = new sb.b(((b.AbstractC0929b.C0930b) abstractC0929b).a(), k0());
                androidx.lifecycle.s viewLifecycleOwner5 = getViewLifecycleOwner();
                kotlin.jvm.internal.o.h(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
                aVar6.n(new sb.a(bVar2, viewLifecycleOwner5));
            } else if (abstractC0929b instanceof b.AbstractC0929b.i) {
                lr.a<kr.m<?>> aVar7 = this.H;
                QuarantineCardViewModel quarantineCardViewModel = new QuarantineCardViewModel(l0(), B().z2(), k0());
                androidx.lifecycle.s viewLifecycleOwner6 = getViewLifecycleOwner();
                kotlin.jvm.internal.o.h(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
                aVar7.n(new QuarantineCardItem(quarantineCardViewModel, viewLifecycleOwner6));
            } else if (abstractC0929b instanceof b.AbstractC0929b.e) {
                BuildersKt__BuildersKt.runBlocking$default(null, new NewListingDetailsFragment$addToView$9(this, abstractC0929b, null), 1, null);
            }
        }

        private final void o0() {
            ((g8) m()).Q.O.setContent(r0.b.c(895142510, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$loadSellerStickyBar$1
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
                        c.U(895142510, i11, -1, "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment.loadSellerStickyBar.<anonymous> (NewListingDetailsFragment.kt:835)");
                    }
                    final NewListingDetailsFragment newListingDetailsFragment = NewListingDetailsFragment.this;
                    ThemeKt.a(null, null, r0.b.b(aVar, 1509368055, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$loadSellerStickyBar$1.1
                        {
                            super(2);
                        }

                        private static final SellerListingStatus c(n1<? extends SellerListingStatus> n1Var) {
                            return n1Var.getValue();
                        }

                        private static final boolean e(n1<Boolean> n1Var) {
                            return n1Var.getValue().booleanValue();
                        }

                        public final void b(androidx.compose.runtime.a aVar2, int i12) {
                            if ((i12 & 11) == 2 && aVar2.i()) {
                                aVar2.L();
                                return;
                            }
                            if (c.I()) {
                                c.U(1509368055, i12, -1, "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment.loadSellerStickyBar.<anonymous>.<anonymous> (NewListingDetailsFragment.kt:836)");
                            }
                            n1 a11 = z.a(NewListingDetailsFragment.this.B().d2(), SellerListingStatus.NONE, null, aVar2, 56, 2);
                            n1 a12 = z.a(NewListingDetailsFragment.this.B().p2(), Boolean.FALSE, null, aVar2, 56, 2);
                            SellerListingStatus c11 = c(a11);
                            boolean e11 = e(a12);
                            final NewListingDetailsFragment newListingDetailsFragment2 = NewListingDetailsFragment.this;
                            g00.a<p> aVar3 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment.loadSellerStickyBar.1.1.1
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
                                    NewListingDetailsFragment.this.B().O2();
                                }
                            };
                            final NewListingDetailsFragment newListingDetailsFragment3 = NewListingDetailsFragment.this;
                            g00.a<p> aVar4 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment.loadSellerStickyBar.1.1.2
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
                                    NewListingDetailsFragment.this.B().V2();
                                }
                            };
                            final NewListingDetailsFragment newListingDetailsFragment4 = NewListingDetailsFragment.this;
                            g00.a<p> aVar5 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment.loadSellerStickyBar.1.1.3
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
                                    NewListingDetailsFragment.this.B().S2();
                                }
                            };
                            final NewListingDetailsFragment newListingDetailsFragment5 = NewListingDetailsFragment.this;
                            SellerStickyBarKt.d(c11, e11, aVar3, aVar4, aVar5, new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment.loadSellerStickyBar.1.1.4
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
                                    NewListingDetailsFragment.this.B().R2();
                                }
                            }, aVar2, 0);
                            if (c.I()) {
                                c.T();
                            }
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return p.f75480a;
                        }
                    }), aVar, 384, 3);
                    if (c.I()) {
                        c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar, Integer num) {
                    b(aVar, num.intValue());
                    return p.f75480a;
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void p0(String str) {
            Context context = getContext();
            if (context != null) {
                ContextExtensionKt.a(context, TypeExtensionsKt.c(str), new g00.l<Exception, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$openCallIntent$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(1);
                    }

                    public final void b(Exception it2) {
                        o.i(it2, "it");
                        Context context2 = NewListingDetailsFragment.this.getContext();
                        if (context2 != null) {
                            String string = NewListingDetailsFragment.this.getString(y0.Z9);
                            o.h(string, "getString(...)");
                            if (ContextExtensionsKt.f(context2)) {
                                c.a aVar = new c.a(context2);
                                aVar.o(y0.M4);
                                aVar.h(string);
                                aVar.m(context2.getString(y0.Z4), new a());
                                aVar.d(false);
                                aVar.q();
                            }
                        }
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(Exception exc) {
                        b(exc);
                        return p.f75480a;
                    }

                    /* compiled from: ViewsExtensions.kt */
                    /* loaded from: classes2.dex */
                    public static final class a implements DialogInterface.OnClickListener {
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                        }
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void q0(com.forsale.app.ui.bottomsheets.listingdetailschat.b bVar) {
            ChatNowBottomSheet.a aVar = ChatNowBottomSheet.B;
            FragmentManager childFragmentManager = getChildFragmentManager();
            kotlin.jvm.internal.o.h(childFragmentManager, "getChildFragmentManager(...)");
            ChatNowBottomSheet.a.b(aVar, childFragmentManager, bVar, null, 4, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void r0() {
            LoginBottomSheet.a aVar = LoginBottomSheet.f38120z;
            FragmentManager childFragmentManager = getChildFragmentManager();
            kotlin.jvm.internal.o.h(childFragmentManager, "getChildFragmentManager(...)");
            LoginBottomSheet.a.b(aVar, childFragmentManager, null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void s0(boolean z11) {
            if (z11) {
                ListingDetailsViewModel.V1(l0(), false, false, 3, null);
            }
        }

        private final void t0() {
            LifeCycleUtilsKt.b(this, new NewListingDetailsFragment$registerObservers$1(this, null));
            LifeCycleUtilsKt.b(this, new NewListingDetailsFragment$registerObservers$2(this, null));
            LifeCycleUtilsKt.b(this, new NewListingDetailsFragment$registerObservers$3(this, null));
            B().g2().observe(getViewLifecycleOwner(), new k());
            B().Q1().observe(getViewLifecycleOwner(), new l());
            LifeCycleUtilsKt.b(this, new NewListingDetailsFragment$registerObservers$6(this, null));
            LifeCycleUtilsKt.b(this, new NewListingDetailsFragment$registerObservers$7(this, null));
            OneShotEventHandler<tg.c> S1 = B().S1();
            androidx.fragment.app.p requireActivity = requireActivity();
            kotlin.jvm.internal.o.h(requireActivity, "requireActivity(...)");
            S1.h(requireActivity, new m());
            LifeCycleUtilsKt.b(this, new NewListingDetailsFragment$registerObservers$9(this, null));
            LifeCycleUtilsKt.b(this, new NewListingDetailsFragment$registerObservers$10(this, null));
            OneShotEventHandler<tg.c> j22 = B().j2();
            androidx.fragment.app.p requireActivity2 = requireActivity();
            kotlin.jvm.internal.o.h(requireActivity2, "requireActivity(...)");
            j22.h(requireActivity2, new c());
            OneShotEventHandler<String> Y1 = B().Y1();
            androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
            kotlin.jvm.internal.o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            Y1.h(viewLifecycleOwner, new FlowCollector<String>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$registerObservers$12
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a */
                public final Object emit(String str, zz.a<? super p> aVar) {
                    Context context;
                    if (str != null && (context = NewListingDetailsFragment.this.getContext()) != null) {
                        com.forsale.adserver.utils.extensions.ContextExtensionsKt.c(context, str, NewListingDetailsFragment$registerObservers$12$emit$2.f27085a);
                    }
                    return p.f75480a;
                }
            });
            OneShotEventHandler<Boolean> U1 = B().U1();
            androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
            kotlin.jvm.internal.o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
            U1.h(viewLifecycleOwner2, new d());
            OneShotEventHandler<String> r22 = B().r2();
            androidx.lifecycle.s viewLifecycleOwner3 = getViewLifecycleOwner();
            kotlin.jvm.internal.o.h(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
            r22.h(viewLifecycleOwner3, new e());
            LifeCycleUtilsKt.b(this, new NewListingDetailsFragment$registerObservers$15(this, null));
            LifeCycleUtilsKt.b(this, new NewListingDetailsFragment$registerObservers$16(this, null));
            LifeCycleUtilsKt.b(this, new NewListingDetailsFragment$registerObservers$17(this, null));
            OneShotEventHandler<ListingItemDetails> b22 = B().b2();
            androidx.lifecycle.s viewLifecycleOwner4 = getViewLifecycleOwner();
            kotlin.jvm.internal.o.h(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
            b22.h(viewLifecycleOwner4, new f());
            LifeCycleUtilsKt.b(this, new NewListingDetailsFragment$registerObservers$19(this, null));
            LifeCycleUtilsKt.b(this, new NewListingDetailsFragment$registerObservers$20(this, null));
            OneShotEventHandler<NewListingDetailsViewModel.ActionType> a22 = B().a2();
            androidx.lifecycle.s viewLifecycleOwner5 = getViewLifecycleOwner();
            kotlin.jvm.internal.o.h(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
            a22.h(viewLifecycleOwner5, g.f27049a);
            OneShotEventHandler<p> w12 = B().w1();
            androidx.lifecycle.s viewLifecycleOwner6 = getViewLifecycleOwner();
            kotlin.jvm.internal.o.h(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
            w12.h(viewLifecycleOwner6, new h());
            LifeCycleUtilsKt.b(this, new NewListingDetailsFragment$registerObservers$23(this, null));
            OneShotEventHandler<ListingItemDetails> e22 = B().e2();
            androidx.lifecycle.s viewLifecycleOwner7 = getViewLifecycleOwner();
            kotlin.jvm.internal.o.h(viewLifecycleOwner7, "getViewLifecycleOwner(...)");
            e22.h(viewLifecycleOwner7, new i());
            OneShotEventHandler<Triple<String, String, String>> e12 = l0().e1();
            androidx.lifecycle.s viewLifecycleOwner8 = getViewLifecycleOwner();
            kotlin.jvm.internal.o.h(viewLifecycleOwner8, "getViewLifecycleOwner(...)");
            e12.h(viewLifecycleOwner8, new j());
            LifeCycleUtilsKt.b(this, new NewListingDetailsFragment$registerObservers$26(this, null));
            LifeCycleUtilsKt.b(this, new NewListingDetailsFragment$registerObservers$27(this, null));
            LifeCycleUtilsKt.b(this, new NewListingDetailsFragment$registerObservers$28(this, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void u0(boolean z11) {
            if (z11) {
                ListingDetailsViewModel.V1(l0(), false, false, 3, null);
                androidx.fragment.app.p activity = getActivity();
                if (activity != null) {
                    activity.setResult(-1);
                }
                androidx.fragment.app.p activity2 = getActivity();
                if (activity2 != null) {
                    activity2.finish();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void v0(MoreActionsBottomSheet moreActionsBottomSheet, tg.c cVar) {
            moreActionsBottomSheet.p0(cVar);
            moreActionsBottomSheet.q0(l0().k1());
            moreActionsBottomSheet.o0(l0().W0());
            moreActionsBottomSheet.s0(l0().q1());
            moreActionsBottomSheet.m0(l0().R0());
            moreActionsBottomSheet.r0(l0().Z0());
        }

        private final a0 w0() {
            int i11;
            NewListingDetailsViewModel.UserType value = B().i2().getValue();
            if (value == null) {
                i11 = -1;
            } else {
                i11 = a.f27009a[value.ordinal()];
            }
            if (i11 == 1) {
                return new a0(0, (int) getResources().getDimension(p0.f69714n), (int) getResources().getDimension(p0.f69714n), 1, null);
            }
            return new a0(0, (int) getResources().getDimension(p0.f69716p), (int) getResources().getDimension(p0.f69716p), 1, null);
        }

        private final void x0() {
            RecyclerView recyclerView = ((g8) m()).P;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setHasFixedSize(false);
            recyclerView.j(w0());
            recyclerView.setAdapter(this.I);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void y0(String str) {
            Context context = getContext();
            if (context != null) {
                String string = getString(y0.R4);
                kotlin.jvm.internal.o.h(string, "getString(...)");
                int i11 = y0.J6;
                int i12 = y0.f70502i6;
                if (ContextExtensionsKt.f(context)) {
                    c.a aVar = new c.a(context);
                    aVar.p(string);
                    aVar.h(str);
                    aVar.m(context.getString(i11), new n());
                    aVar.j(context.getString(i12), new o());
                    aVar.d(false);
                    aVar.q();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void z0(ListingItemDetails listingItemDetails, ListingItemBrief listingItemBrief, String str) {
            String str2;
            ListingChatActivity.a aVar = ListingChatActivity.f27334y;
            Context context = ((g8) m()).getRoot().getContext();
            kotlin.jvm.internal.o.h(context, "getContext(...)");
            String e11 = falcon.chat.utils.a.f56033a.e();
            String phone = listingItemDetails.getPhone();
            String valueOf = String.valueOf(listingItemDetails.getId());
            String title = listingItemDetails.getTitle();
            if (listingItemBrief != null) {
                str2 = listingItemBrief.getThumb();
            } else {
                str2 = null;
            }
            String image = listingItemDetails.getUser().getImage();
            ListingUser user = listingItemDetails.getUser();
            ListingChatActivity.a.b(aVar, context, e11, phone, valueOf, title, str2, image, str, new UserProfileData(user.getId(), user.getName(), user.getPhone(), user.getImage(), Integer.valueOf(listingItemDetails.getId()), null, null, null, TypeExtensionsKt.W(user.getPhone()), 224, null), listingItemBrief, null, AdRequest.MAX_CONTENT_URL_LENGTH, null);
        }

        public final AggregatedAllAnalyticsLogger c0() {
            AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger = this.K;
            if (aggregatedAllAnalyticsLogger != null) {
                return aggregatedAllAnalyticsLogger;
            }
            kotlin.jvm.internal.o.w("analyticsLogger");
            return null;
        }

        public final CategoriesRepositories d0() {
            CategoriesRepositories categoriesRepositories = this.O;
            if (categoriesRepositories != null) {
                return categoriesRepositories;
            }
            kotlin.jvm.internal.o.w("categoriesRepository");
            return null;
        }

        public final CategoryDao e0() {
            CategoryDao categoryDao = this.J;
            if (categoryDao != null) {
                return categoryDao;
            }
            kotlin.jvm.internal.o.w("categoryDao");
            return null;
        }

        public final DistrictsRepository f0() {
            DistrictsRepository districtsRepository = this.N;
            if (districtsRepository != null) {
                return districtsRepository;
            }
            kotlin.jvm.internal.o.w("districtsRepository");
            return null;
        }

        public final NewListingDetailsViewModel.a g0() {
            NewListingDetailsViewModel.a aVar = this.C;
            if (aVar != null) {
                return aVar;
            }
            kotlin.jvm.internal.o.w("factory");
            return null;
        }

        public final cx.a<ag.a> h0() {
            cx.a<ag.a> aVar = this.E;
            if (aVar != null) {
                return aVar;
            }
            kotlin.jvm.internal.o.w("plfRouterOperator");
            return null;
        }

        public final jj.b i0() {
            jj.b bVar = this.P;
            if (bVar != null) {
                return bVar;
            }
            kotlin.jvm.internal.o.w("prefs");
            return null;
        }

        public final RegionsRepository j0() {
            RegionsRepository regionsRepository = this.M;
            if (regionsRepository != null) {
                return regionsRepository;
            }
            kotlin.jvm.internal.o.w("regionsRepository");
            return null;
        }

        public final ApplicationResourcesRepository k0() {
            ApplicationResourcesRepository applicationResourcesRepository = this.L;
            if (applicationResourcesRepository != null) {
                return applicationResourcesRepository;
            }
            kotlin.jvm.internal.o.w("resourcesRepository");
            return null;
        }

        public final ListingDetailsViewModel l0() {
            return (ListingDetailsViewModel) this.B.getValue();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.forsale.app.base.fragments.BaseViewModelFragment
        /* renamed from: m0 */
        public NewListingDetailsViewModel B() {
            return (NewListingDetailsViewModel) this.D.getValue();
        }

        @Override // com.forsale.app.base.fragments.a
        protected int o() {
            return this.A;
        }

        @Override // androidx.fragment.app.Fragment
        public void onResume() {
            super.onResume();
            CrashlyticsUtilsKt.a("listing details", new g00.l<tn.b, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$onResume$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void b(tn.b logScreenVisited) {
                    int s11;
                    o.i(logScreenVisited, "$this$logScreenVisited");
                    ListingItemBrief z11 = NewListingDetailsFragment.this.l0().j1().z();
                    if (z11 != null) {
                        s11 = z11.getId();
                    } else {
                        s11 = NewListingDetailsFragment.this.l0().j1().s();
                    }
                    logScreenVisited.b("listing_id", String.valueOf(s11));
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(tn.b bVar) {
                    b(bVar);
                    return p.f75480a;
                }
            });
            Context context = getContext();
            if (context != null) {
                B().a3(ContextExtensionsKt.b(context, null, 1, null));
            }
        }

        @Keep
        @v9.a(viewId = {ActionViewsMode.ERROR_RELOAD, ActionViewsMode.ERROR_REFRESH})
        public final void onRetryClicked(View view) {
            kotlin.jvm.internal.o.i(view, "view");
            l0().H1();
        }

        @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
        public void onViewCreated(View view, Bundle bundle) {
            androidx.appcompat.app.d dVar;
            OnBackPressedDispatcher onBackPressedDispatcher;
            kotlin.jvm.internal.o.i(view, "view");
            super.onViewCreated(view, bundle);
            androidx.fragment.app.p activity = getActivity();
            if (activity instanceof androidx.appcompat.app.d) {
                dVar = (androidx.appcompat.app.d) activity;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                dVar.setSupportActionBar(((g8) m()).U.W);
                androidx.appcompat.app.a supportActionBar = dVar.getSupportActionBar();
                if (supportActionBar != null) {
                    supportActionBar.t(false);
                }
                androidx.appcompat.app.a supportActionBar2 = dVar.getSupportActionBar();
                if (supportActionBar2 != null) {
                    supportActionBar2.D("");
                }
            }
            x0();
            t0();
            androidx.fragment.app.p activity2 = getActivity();
            if (activity2 != null && (onBackPressedDispatcher = activity2.getOnBackPressedDispatcher()) != null) {
                u.b(onBackPressedDispatcher, getViewLifecycleOwner(), false, new g00.l<androidx.activity.o, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$onViewCreated$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(1);
                    }

                    public final void b(androidx.activity.o addCallback) {
                        o.i(addCallback, "$this$addCallback");
                        if (NewListingDetailsFragment.this.l0().T0().getValue().booleanValue()) {
                            NewListingDetailsFragment.this.B().v1();
                            return;
                        }
                        androidx.fragment.app.p activity3 = NewListingDetailsFragment.this.getActivity();
                        if (activity3 != null) {
                            activity3.finish();
                        }
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(androidx.activity.o oVar) {
                        b(oVar);
                        return p.f75480a;
                    }
                }, 2, null);
            }
            l0().H1();
            o0();
            ((g8) m()).O.O.setContent(r0.b.c(121815900, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$onViewCreated$3
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
                        androidx.compose.runtime.c.U(121815900, i11, -1, "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment.onViewCreated.<anonymous> (NewListingDetailsFragment.kt:179)");
                    }
                    final NewListingDetailsFragment newListingDetailsFragment = NewListingDetailsFragment.this;
                    ThemeKt.a(null, null, r0.b.b(aVar, 246684275, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$onViewCreated$3.1
                        {
                            super(2);
                        }

                        private static final boolean c(n1<Boolean> n1Var) {
                            return n1Var.getValue().booleanValue();
                        }

                        private static final CTAsVisibility e(n1<CTAsVisibility> n1Var) {
                            return n1Var.getValue();
                        }

                        private static final boolean g(n1<Boolean> n1Var) {
                            return n1Var.getValue().booleanValue();
                        }

                        public final void b(androidx.compose.runtime.a aVar2, int i12) {
                            if ((i12 & 11) == 2 && aVar2.i()) {
                                aVar2.L();
                                return;
                            }
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.U(246684275, i12, -1, "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment.onViewCreated.<anonymous>.<anonymous> (NewListingDetailsFragment.kt:180)");
                            }
                            n1 b11 = z.b(NewListingDetailsFragment.this.B().q2(), null, aVar2, 8, 1);
                            n1 b12 = z.b(NewListingDetailsFragment.this.B().z1(), null, aVar2, 8, 1);
                            n1 b13 = z.b(NewListingDetailsFragment.this.B().D1(), null, aVar2, 8, 1);
                            boolean c11 = c(b11);
                            boolean g11 = g(b13);
                            CTAsVisibility e11 = e(b12);
                            final NewListingDetailsFragment newListingDetailsFragment2 = NewListingDetailsFragment.this;
                            l<NewListingDetailsViewModel.ActionType, p> lVar = new l<NewListingDetailsViewModel.ActionType, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment.onViewCreated.3.1.1
                                {
                                    super(1);
                                }

                                public final void b(NewListingDetailsViewModel.ActionType it2) {
                                    o.i(it2, "it");
                                    NewListingDetailsFragment.this.B().P2(it2);
                                }

                                @Override // g00.l
                                public /* bridge */ /* synthetic */ p invoke(NewListingDetailsViewModel.ActionType actionType) {
                                    b(actionType);
                                    return p.f75480a;
                                }
                            };
                            final NewListingDetailsFragment newListingDetailsFragment3 = NewListingDetailsFragment.this;
                            l<NewListingDetailsViewModel.ActionType, p> lVar2 = new l<NewListingDetailsViewModel.ActionType, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment.onViewCreated.3.1.2
                                {
                                    super(1);
                                }

                                public final void b(NewListingDetailsViewModel.ActionType it2) {
                                    o.i(it2, "it");
                                    NewListingDetailsFragment.this.B().Q2(it2);
                                }

                                @Override // g00.l
                                public /* bridge */ /* synthetic */ p invoke(NewListingDetailsViewModel.ActionType actionType) {
                                    b(actionType);
                                    return p.f75480a;
                                }
                            };
                            final NewListingDetailsFragment newListingDetailsFragment4 = NewListingDetailsFragment.this;
                            BuyerStickyCTAsKt.a(c11, g11, null, false, e11, lVar, lVar2, new l<NewListingDetailsViewModel.ActionType, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment.onViewCreated.3.1.3
                                {
                                    super(1);
                                }

                                public final void b(NewListingDetailsViewModel.ActionType it2) {
                                    o.i(it2, "it");
                                    NewListingDetailsFragment.this.B().Y2(it2);
                                }

                                @Override // g00.l
                                public /* bridge */ /* synthetic */ p invoke(NewListingDetailsViewModel.ActionType actionType) {
                                    b(actionType);
                                    return p.f75480a;
                                }
                            }, aVar2, 0, 12);
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.T();
                            }
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return p.f75480a;
                        }
                    }), aVar, 384, 3);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar, Integer num) {
                    b(aVar, num.intValue());
                    return p.f75480a;
                }
            }));
        }

        @Override // v9.c
        public void setStateViewsActions(View view) {
            c.a.c(this, view);
        }

        /* compiled from: ViewsExtensions.kt */
        /* loaded from: classes2.dex */
        public static final class o implements DialogInterface.OnClickListener {
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
            }
        }
    }
