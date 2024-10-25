package com.forsale.app.ui.bottomsheets.listingdetailssellersettings.autorepost;

import androidx.fragment.app.FragmentManager;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.features.categories.listingdetails.newui.SwitchStates;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType;
import com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import g00.l;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SellerSettingAutoRepostItem.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailssellersettings.autorepost.SellerSettingAutoRepostItem$AutoRepostViewHolder$bindView$1$1", f = "SellerSettingAutoRepostItem.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SellerSettingAutoRepostItem$AutoRepostViewHolder$bindView$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38889a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SellerSettingAutoRepostItem f38890b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SellerSettingAutoRepostItem.kt */
    @d(c = "com.forsale.app.ui.bottomsheets.listingdetailssellersettings.autorepost.SellerSettingAutoRepostItem$AutoRepostViewHolder$bindView$1$1$1", f = "SellerSettingAutoRepostItem.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.autorepost.SellerSettingAutoRepostItem$AutoRepostViewHolder$bindView$1$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<AggregatedAllAnalyticsLogger.AnalyticsPosition, a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f38891a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f38892b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SellerSettingAutoRepostItem f38893c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SellerSettingAutoRepostItem sellerSettingAutoRepostItem, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f38893c = sellerSettingAutoRepostItem;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(analyticsPosition, aVar)).invokeSuspend(wz.p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(Object obj, a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f38893c, aVar);
            anonymousClass1.f38892b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f38891a == 0) {
                f.b(obj);
                AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition = (AggregatedAllAnalyticsLogger.AnalyticsPosition) this.f38892b;
                SellerActionBottomSheet.a aVar = SellerActionBottomSheet.K;
                SellerActionType sellerActionType = SellerActionType.AUTO_RE_POST;
                ListingItemDetails g11 = this.f38893c.z().g();
                FragmentManager v11 = this.f38893c.v();
                final SellerSettingAutoRepostItem sellerSettingAutoRepostItem = this.f38893c;
                aVar.a(sellerActionType, g11, analyticsPosition, v11, new l<Boolean, wz.p>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.autorepost.SellerSettingAutoRepostItem.AutoRepostViewHolder.bindView.1.1.1.1
                    {
                        super(1);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ wz.p invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return wz.p.f75480a;
                    }

                    public final void invoke(boolean z11) {
                        if (z11) {
                            SellerSettingAutoRepostItem.this.x().invoke(Boolean.valueOf(z11));
                        } else {
                            SellerSettingAutoRepostItem.this.z().f().setValue(TypeExtensionsKt.h0(SellerSettingAutoRepostItem.this.z().g().isAutoRepost()) ? SwitchStates.ENABLED : SwitchStates.DISABLED);
                        }
                    }
                });
                return wz.p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerSettingAutoRepostItem$AutoRepostViewHolder$bindView$1$1(SellerSettingAutoRepostItem sellerSettingAutoRepostItem, a<? super SellerSettingAutoRepostItem$AutoRepostViewHolder$bindView$1$1> aVar) {
        super(2, aVar);
        this.f38890b = sellerSettingAutoRepostItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new SellerSettingAutoRepostItem$AutoRepostViewHolder$bindView$1$1(this.f38890b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f38889a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<AggregatedAllAnalyticsLogger.AnalyticsPosition> e11 = this.f38890b.z().e();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f38890b, null);
            this.f38889a = 1;
            if (FlowKt.collectLatest(e11, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((SellerSettingAutoRepostItem$AutoRepostViewHolder$bindView$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
