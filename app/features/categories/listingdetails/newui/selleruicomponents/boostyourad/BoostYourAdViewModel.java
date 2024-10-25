package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.boostyourad;

import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.google.android.gms.common.api.CommonStatusCodes;
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
import zz.a;
/* compiled from: BoostYourAdViewModel.kt */
/* loaded from: classes2.dex */
public final class BoostYourAdViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final ListingDetailsViewModel f27743a;

    /* renamed from: b  reason: collision with root package name */
    private final MutableSharedFlow<ListingDetailsEntity> f27744b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedFlow<ListingDetailsEntity> f27745c;

    public BoostYourAdViewModel(ListingDetailsViewModel listingDetailsViewModel) {
        o.i(listingDetailsViewModel, "listingDetailsViewModel");
        this.f27743a = listingDetailsViewModel;
        MutableSharedFlow<ListingDetailsEntity> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f27744b = MutableSharedFlow$default;
        this.f27745c = FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final SharedFlow<ListingDetailsEntity> c() {
        return this.f27745c;
    }

    public final void d() {
        this.f27743a.B0(AggregatedAllAnalyticsLogger.AnalyticsPosition.MID_SCREEN, new l<ListingDetailsEntity, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.boostyourad.BoostYourAdViewModel$onBoostYourAdClicked$1

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: BoostYourAdViewModel.kt */
            @d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.boostyourad.BoostYourAdViewModel$onBoostYourAdClicked$1$1", f = "BoostYourAdViewModel.kt", l = {CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE}, m = "invokeSuspend")
            /* renamed from: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.boostyourad.BoostYourAdViewModel$onBoostYourAdClicked$1$1  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, a<? super p>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f27747a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ BoostYourAdViewModel f27748b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ ListingDetailsEntity f27749c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(BoostYourAdViewModel boostYourAdViewModel, ListingDetailsEntity listingDetailsEntity, a<? super AnonymousClass1> aVar) {
                    super(2, aVar);
                    this.f27748b = boostYourAdViewModel;
                    this.f27749c = listingDetailsEntity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final a<p> create(Object obj, a<?> aVar) {
                    return new AnonymousClass1(this.f27748b, this.f27749c, aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object f11;
                    MutableSharedFlow mutableSharedFlow;
                    f11 = b.f();
                    int i11 = this.f27747a;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            f.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        f.b(obj);
                        mutableSharedFlow = this.f27748b.f27744b;
                        ListingDetailsEntity listingDetailsEntity = this.f27749c;
                        this.f27747a = 1;
                        if (mutableSharedFlow.emit(listingDetailsEntity, this) == f11) {
                            return f11;
                        }
                    }
                    return p.f75480a;
                }

                @Override // g00.p
                public final Object invoke(CoroutineScope coroutineScope, a<? super p> aVar) {
                    return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(ListingDetailsEntity it2) {
                ListingDetailsViewModel listingDetailsViewModel;
                o.i(it2, "it");
                listingDetailsViewModel = BoostYourAdViewModel.this.f27743a;
                BuildersKt__Builders_commonKt.launch$default(listingDetailsViewModel, null, null, new AnonymousClass1(BoostYourAdViewModel.this, it2, null), 3, null);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(ListingDetailsEntity listingDetailsEntity) {
                b(listingDetailsEntity);
                return p.f75480a;
            }
        });
    }
}
