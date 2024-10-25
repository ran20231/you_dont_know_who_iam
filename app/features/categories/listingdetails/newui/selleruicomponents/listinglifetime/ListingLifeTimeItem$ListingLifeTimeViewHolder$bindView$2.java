package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime;

import androidx.fragment.app.FragmentManager;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType;
import com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import g00.l;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingLifeTimeItem.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.ListingLifeTimeItem$ListingLifeTimeViewHolder$bindView$2", f = "ListingLifeTimeItem.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingLifeTimeItem$ListingLifeTimeViewHolder$bindView$2 extends SuspendLambda implements l<a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27790a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListingLifeTimeItem f27791b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListingLifeTimeItem.kt */
    @d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.ListingLifeTimeItem$ListingLifeTimeViewHolder$bindView$2$1", f = "ListingLifeTimeItem.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.ListingLifeTimeItem$ListingLifeTimeViewHolder$bindView$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<AggregatedAllAnalyticsLogger.AnalyticsPosition, a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f27792a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f27793b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ListingLifeTimeItem f27794c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ListingLifeTimeItem listingLifeTimeItem, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f27794c = listingLifeTimeItem;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, a<? super p> aVar) {
            return ((AnonymousClass1) create(analyticsPosition, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<p> create(Object obj, a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27794c, aVar);
            anonymousClass1.f27793b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f27792a == 0) {
                f.b(obj);
                AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition = (AggregatedAllAnalyticsLogger.AnalyticsPosition) this.f27793b;
                SellerActionBottomSheet.a aVar = SellerActionBottomSheet.K;
                SellerActionType sellerActionType = SellerActionType.AUTO_RE_POST;
                ListingItemDetails l11 = this.f27794c.x().l();
                FragmentManager w11 = this.f27794c.w();
                final ListingLifeTimeItem listingLifeTimeItem = this.f27794c;
                aVar.a(sellerActionType, l11, analyticsPosition, w11, new l<Boolean, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.ListingLifeTimeItem.ListingLifeTimeViewHolder.bindView.2.1.1
                    {
                        super(1);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return p.f75480a;
                    }

                    public final void invoke(boolean z11) {
                        if (z11) {
                            ListingLifeTimeItem.this.y().invoke(Boolean.valueOf(z11));
                        }
                    }
                });
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingLifeTimeItem$ListingLifeTimeViewHolder$bindView$2(ListingLifeTimeItem listingLifeTimeItem, a<? super ListingLifeTimeItem$ListingLifeTimeViewHolder$bindView$2> aVar) {
        super(1, aVar);
        this.f27791b = listingLifeTimeItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(a<?> aVar) {
        return new ListingLifeTimeItem$ListingLifeTimeViewHolder$bindView$2(this.f27791b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f27790a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<AggregatedAllAnalyticsLogger.AnalyticsPosition> f12 = this.f27791b.x().f();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27791b, null);
            this.f27790a = 1;
            if (FlowKt.collectLatest(f12, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(a<? super p> aVar) {
        return ((ListingLifeTimeItem$ListingLifeTimeViewHolder$bindView$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
