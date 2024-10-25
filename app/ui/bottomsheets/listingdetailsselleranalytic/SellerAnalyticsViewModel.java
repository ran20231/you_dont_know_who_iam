package com.forsale.app.ui.bottomsheets.listingdetailsselleranalytic;

import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel;
import com.forsale.app.features.more.mylistings.AnalyticModel;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import g00.l;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import wz.p;
/* compiled from: SellerAnalyticsViewModel.kt */
/* loaded from: classes3.dex */
public final class SellerAnalyticsViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final ListingDetailsViewModel f38798k0;

    /* renamed from: l0  reason: collision with root package name */
    private final MutableSharedFlow<AnalyticModel> f38799l0;

    /* renamed from: m0  reason: collision with root package name */
    private final SharedFlow<AnalyticModel> f38800m0;

    /* renamed from: n0  reason: collision with root package name */
    private final MutableSharedFlow<ListingDetailsEntity> f38801n0;

    /* renamed from: o0  reason: collision with root package name */
    private final SharedFlow<ListingDetailsEntity> f38802o0;

    /* renamed from: p0  reason: collision with root package name */
    private final MutableSharedFlow<p> f38803p0;

    /* renamed from: q0  reason: collision with root package name */
    private final SharedFlow<p> f38804q0;

    /* compiled from: SellerAnalyticsViewModel.kt */
    /* loaded from: classes3.dex */
    public interface a {
        SellerAnalyticsViewModel a(ListingDetailsViewModel listingDetailsViewModel);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerAnalyticsViewModel(ListingDetailsViewModel listingDetailsViewModel, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(listingDetailsViewModel, "listingDetailsViewModel");
        o.i(baseRepository, "baseRepository");
        this.f38798k0 = listingDetailsViewModel;
        MutableSharedFlow<AnalyticModel> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f38799l0 = MutableSharedFlow$default;
        this.f38800m0 = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableSharedFlow<ListingDetailsEntity> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f38801n0 = MutableSharedFlow$default2;
        this.f38802o0 = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        MutableSharedFlow<p> MutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f38803p0 = MutableSharedFlow$default3;
        this.f38804q0 = FlowKt.asSharedFlow(MutableSharedFlow$default3);
    }

    public final SharedFlow<p> A0() {
        return this.f38804q0;
    }

    public final ListingDetailsViewModel B0() {
        return this.f38798k0;
    }

    public final void C0() {
        ListingItemDetails value = this.f38798k0.Y0().getValue();
        if (value != null) {
            ListingDetailsViewModel.P1(this.f38798k0, AggregatedAllAnalyticsLogger.MyListingActionEvents.MY_LISTING_DETAILS_ALL_ANALYTICS_CLICKED, true, true, AggregatedAllAnalyticsLogger.AnalyticsPosition.ANALYTICS, null, 16, null);
            BuildersKt__Builders_commonKt.launch$default(this.f38798k0, null, null, new SellerAnalyticsViewModel$onAllAnalyticsClicked$1$1(this, value, null), 3, null);
        }
    }

    public final void D0() {
        this.f38798k0.B0(AggregatedAllAnalyticsLogger.AnalyticsPosition.ANALYTICS, new l<ListingDetailsEntity, p>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsselleranalytic.SellerAnalyticsViewModel$onBoostYourAdClicked$1

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SellerAnalyticsViewModel.kt */
            @d(c = "com.forsale.app.ui.bottomsheets.listingdetailsselleranalytic.SellerAnalyticsViewModel$onBoostYourAdClicked$1$1", f = "SellerAnalyticsViewModel.kt", l = {57}, m = "invokeSuspend")
            /* renamed from: com.forsale.app.ui.bottomsheets.listingdetailsselleranalytic.SellerAnalyticsViewModel$onBoostYourAdClicked$1$1  reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f38809a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ SellerAnalyticsViewModel f38810b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ ListingDetailsEntity f38811c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SellerAnalyticsViewModel sellerAnalyticsViewModel, ListingDetailsEntity listingDetailsEntity, zz.a<? super AnonymousClass1> aVar) {
                    super(2, aVar);
                    this.f38810b = sellerAnalyticsViewModel;
                    this.f38811c = listingDetailsEntity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final zz.a<p> create(Object obj, zz.a<?> aVar) {
                    return new AnonymousClass1(this.f38810b, this.f38811c, aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object f11;
                    MutableSharedFlow mutableSharedFlow;
                    f11 = b.f();
                    int i11 = this.f38809a;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            f.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        f.b(obj);
                        mutableSharedFlow = this.f38810b.f38801n0;
                        ListingDetailsEntity listingDetailsEntity = this.f38811c;
                        this.f38809a = 1;
                        if (mutableSharedFlow.emit(listingDetailsEntity, this) == f11) {
                            return f11;
                        }
                    }
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

            public final void b(ListingDetailsEntity it2) {
                o.i(it2, "it");
                BuildersKt__Builders_commonKt.launch$default(SellerAnalyticsViewModel.this.B0(), null, null, new AnonymousClass1(SellerAnalyticsViewModel.this, it2, null), 3, null);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(ListingDetailsEntity listingDetailsEntity) {
                b(listingDetailsEntity);
                return p.f75480a;
            }
        });
    }

    public final void E0() {
        BuildersKt__Builders_commonKt.launch$default(this.f38798k0, null, null, new SellerAnalyticsViewModel$onCloseClicked$1(this, null), 3, null);
    }

    public final SharedFlow<AnalyticModel> y0() {
        return this.f38800m0;
    }

    public final SharedFlow<ListingDetailsEntity> z0() {
        return this.f38802o0;
    }
}
