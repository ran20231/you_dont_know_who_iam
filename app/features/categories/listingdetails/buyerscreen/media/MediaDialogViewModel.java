package com.forsale.app.features.categories.listingdetails.buyerscreen.media;

import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel;
import com.forsale.app.features.categories.listingdetails.ShareText;
import com.forsale.app.features.categories.listingdetails.buyerctas.CTAsVisibility;
import com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ContactUserInteractor;
import com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.DetailsAnalyticsInteractor;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.MediaTypes;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsShareClickedEvent;
import com.forsale.app.features.categories.listingdetails.buyerscreen.views.FileMetaData;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.UserContactMode;
import java.net.SocketTimeoutException;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import wz.p;
/* compiled from: MediaDialogViewModel.kt */
/* loaded from: classes2.dex */
public final class MediaDialogViewModel extends q0 {
    private final MutableStateFlow<Integer> A;
    private final boolean B;
    private final boolean C;
    private final CTAsVisibility D;
    private final MutableSharedFlow<cb.b> E;
    private final SharedFlow<cb.b> F;
    private final MutableSharedFlow<cb.c> G;
    private final SharedFlow<cb.c> H;
    private final MutableSharedFlow<lf.a> I;
    private final SharedFlow<lf.a> J;
    private final MutableStateFlow<ab.a> K;
    private final StateFlow<ab.a> L;
    private final CoroutineExceptionHandler M;

    /* renamed from: a  reason: collision with root package name */
    private final ContactUserInteractor f26187a;

    /* renamed from: b  reason: collision with root package name */
    private final DetailsAnalyticsInteractor f26188b;

    /* renamed from: c  reason: collision with root package name */
    private final b f26189c;

    /* renamed from: d  reason: collision with root package name */
    private final MediaTypes f26190d;

    /* renamed from: e  reason: collision with root package name */
    private final DetailsModel f26191e;

    /* renamed from: f  reason: collision with root package name */
    private final ItemArgs f26192f;

    /* renamed from: g  reason: collision with root package name */
    private final ShareText f26193g;

    /* renamed from: h  reason: collision with root package name */
    private final MediaTypes.Images f26194h;

    /* renamed from: i  reason: collision with root package name */
    private final MediaTypes.ThreeDTour f26195i;

    /* renamed from: j  reason: collision with root package name */
    private final MediaTypes.PDF f26196j;

    /* renamed from: x  reason: collision with root package name */
    private final BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.VirtualTour f26197x;

    /* renamed from: y  reason: collision with root package name */
    private final List<String> f26198y;

    /* renamed from: z  reason: collision with root package name */
    private final String f26199z;

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MediaDialogViewModel f26200a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.Key key, MediaDialogViewModel mediaDialogViewModel) {
            super(key);
            this.f26200a = mediaDialogViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            if (this.f26200a.G(th2)) {
                BuildersKt__Builders_commonKt.launch$default(r0.a(this.f26200a), null, null, new MediaDialogViewModel$connectivityExceptionsHandler$1$1(this.f26200a, null), 3, null);
            }
        }
    }

    public MediaDialogViewModel(ContactUserInteractor contactUserInteractor, DetailsAnalyticsInteractor detailsAnalyticsInteractor, k0 savedStateHandle) {
        MediaTypes.Images images;
        MediaTypes.ThreeDTour threeDTour;
        MediaTypes.PDF pdf;
        BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.VirtualTour virtualTour;
        List<String> list;
        String str;
        int i11;
        boolean z11;
        CTAsVisibility cTAsVisibility;
        FileMetaData a11;
        String b11;
        o.i(contactUserInteractor, "contactUserInteractor");
        o.i(detailsAnalyticsInteractor, "detailsAnalyticsInteractor");
        o.i(savedStateHandle, "savedStateHandle");
        this.f26187a = contactUserInteractor;
        this.f26188b = detailsAnalyticsInteractor;
        b b12 = b.f26298e.b(savedStateHandle);
        this.f26189c = b12;
        MediaTypes c11 = b12.c();
        this.f26190d = c11;
        DetailsModel a12 = b12.a();
        this.f26191e = a12;
        this.f26192f = b12.b();
        this.f26193g = b12.d();
        if (c11 instanceof MediaTypes.Images) {
            images = (MediaTypes.Images) c11;
        } else {
            images = null;
        }
        this.f26194h = images;
        if (c11 instanceof MediaTypes.ThreeDTour) {
            threeDTour = (MediaTypes.ThreeDTour) c11;
        } else {
            threeDTour = null;
        }
        this.f26195i = threeDTour;
        if (c11 instanceof MediaTypes.PDF) {
            pdf = (MediaTypes.PDF) c11;
        } else {
            pdf = null;
        }
        this.f26196j = pdf;
        if (threeDTour != null) {
            virtualTour = threeDTour.a();
        } else {
            virtualTour = null;
        }
        this.f26197x = virtualTour;
        if (images != null && (b11 = images.b()) != null) {
            list = StringsKt__StringsKt.E0(b11, new char[]{','}, false, 0, 6, null);
        } else {
            list = null;
        }
        this.f26198y = list;
        if (pdf != null && (a11 = pdf.a()) != null) {
            str = a11.a();
        } else {
            str = null;
        }
        this.f26199z = str;
        if (images != null) {
            i11 = images.a();
        } else {
            i11 = 0;
        }
        this.A = StateFlowKt.MutableStateFlow(Integer.valueOf(i11));
        if (a12 != null) {
            z11 = contactUserInteractor.q(a12.d().M(), a12.d().l(), a12.d().w());
        } else {
            z11 = false;
        }
        this.B = z11;
        this.C = a12 != null ? contactUserInteractor.h(a12) : true;
        this.D = (a12 == null || (cTAsVisibility = contactUserInteractor.d(a12.d().M(), a12.d().l(), a12.d().w())) == null) ? new CTAsVisibility(null, null, null, 7, null) : cTAsVisibility;
        MutableSharedFlow<cb.b> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.E = MutableSharedFlow$default;
        this.F = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableSharedFlow<cb.c> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.G = MutableSharedFlow$default2;
        this.H = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        MutableSharedFlow<lf.a> MutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.I = MutableSharedFlow$default3;
        this.J = FlowKt.asSharedFlow(MutableSharedFlow$default3);
        MutableStateFlow<ab.a> MutableStateFlow = StateFlowKt.MutableStateFlow(new ab.a(null, false, null, 7, null));
        this.K = MutableStateFlow;
        this.L = FlowKt.asStateFlow(MutableStateFlow);
        this.M = new a(CoroutineExceptionHandler.Key, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean G(Throwable th2) {
        if (!(th2 instanceof ConnectivityInterceptor.ConnectivityException) && !(th2 instanceof SocketTimeoutException)) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ void I(MediaDialogViewModel mediaDialogViewModel, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        mediaDialogViewModel.H(str);
    }

    public static /* synthetic */ void M(MediaDialogViewModel mediaDialogViewModel, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        mediaDialogViewModel.L(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object O(DetailsModel detailsModel, zz.a<? super p> aVar) {
        Object f11;
        ItemArgs itemArgs = this.f26192f;
        if (itemArgs != null) {
            Object n11 = this.f26188b.n(new ListingDetailsShareClickedEvent(detailsModel, itemArgs), aVar);
            f11 = kotlin.coroutines.intrinsics.b.f();
            if (n11 == f11) {
                return n11;
            }
        }
        return p.f75480a;
    }

    public final DetailsModel A() {
        return this.f26191e;
    }

    public final SharedFlow<cb.c> B() {
        return this.H;
    }

    public final MediaTypes C() {
        return this.f26190d;
    }

    public final ShareText D() {
        return this.f26193g;
    }

    public final BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.VirtualTour E() {
        return this.f26197x;
    }

    public final boolean F() {
        return this.B;
    }

    public final void H(String str) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), this.M, null, new MediaDialogViewModel$onCallClicked$1(this, str, null), 2, null);
    }

    public final void J() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), Dispatchers.getIO().plus(this.M), null, new MediaDialogViewModel$onChatClicked$1(this, null), 2, null);
    }

    public final void K() {
        ShareText shareText;
        if (this.f26191e != null && (shareText = this.f26193g) != null) {
            BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new MediaDialogViewModel$onShareClicked$1$1(this, shareText, null), 3, null);
        }
    }

    public final void L(String str) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), this.M, null, new MediaDialogViewModel$onWhatsAppClicked$1(this, str, null), 2, null);
    }

    public final void N(UserContactMode contactMode, DetailsModel detailsModel) {
        o.i(contactMode, "contactMode");
        o.i(detailsModel, "detailsModel");
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new MediaDialogViewModel$openCTAsBottomSheet$1(this, detailsModel, contactMode, null), 3, null);
    }

    public final Job Q() {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new MediaDialogViewModel$showFeedback$1(this, null), 3, null);
        return launch$default;
    }

    public final void o() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new MediaDialogViewModel$closeCTAsBottomSheet$1(this, null), 3, null);
    }

    public final CTAsVisibility p() {
        return this.D;
    }

    public final boolean q() {
        return this.C;
    }

    public final SharedFlow<cb.b> r() {
        return this.F;
    }

    public final StateFlow<ab.a> s() {
        return this.L;
    }

    public final MutableStateFlow<Integer> t() {
        return this.A;
    }

    public final SharedFlow<lf.a> v() {
        return this.J;
    }

    public final String w() {
        return this.f26199z;
    }

    public final MediaTypes.PDF x() {
        return this.f26196j;
    }

    public final List<String> y() {
        return this.f26198y;
    }

    public final ItemArgs z() {
        return this.f26192f;
    }
}
