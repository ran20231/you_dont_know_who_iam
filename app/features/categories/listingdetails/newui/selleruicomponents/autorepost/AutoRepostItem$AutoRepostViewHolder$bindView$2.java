package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.autorepost;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.s;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.features.categories.listingdetails.newui.SwitchStates;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType;
import com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionBottomSheet;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.google.android.gms.maps.model.PinConfig;
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
/* compiled from: AutoRepostItem.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.autorepost.AutoRepostItem$AutoRepostViewHolder$bindView$2", f = "AutoRepostItem.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AutoRepostItem$AutoRepostViewHolder$bindView$2 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27708a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AutoRepostItem f27709b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoRepostItem.kt */
    @d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.autorepost.AutoRepostItem$AutoRepostViewHolder$bindView$2$1", f = "AutoRepostItem.kt", l = {PinConfig.BITMAP_LENGTH_DP}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.autorepost.AutoRepostItem$AutoRepostViewHolder$bindView$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f27710a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AutoRepostItem f27711b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AutoRepostItem.kt */
        @d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.autorepost.AutoRepostItem$AutoRepostViewHolder$bindView$2$1$1", f = "AutoRepostItem.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.autorepost.AutoRepostItem$AutoRepostViewHolder$bindView$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C02991 extends SuspendLambda implements p<AggregatedAllAnalyticsLogger.AnalyticsPosition, a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f27712a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f27713b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ AutoRepostItem f27714c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02991(AutoRepostItem autoRepostItem, a<? super C02991> aVar) {
                super(2, aVar);
                this.f27714c = autoRepostItem;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, a<? super wz.p> aVar) {
                return ((C02991) create(analyticsPosition, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final a<wz.p> create(Object obj, a<?> aVar) {
                C02991 c02991 = new C02991(this.f27714c, aVar);
                c02991.f27713b = obj;
                return c02991;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                b.f();
                if (this.f27712a == 0) {
                    f.b(obj);
                    AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition = (AggregatedAllAnalyticsLogger.AnalyticsPosition) this.f27713b;
                    SellerActionBottomSheet.a aVar = SellerActionBottomSheet.K;
                    SellerActionType sellerActionType = SellerActionType.AUTO_RE_POST;
                    ListingItemDetails g11 = this.f27714c.f27701f.g();
                    FragmentManager x11 = this.f27714c.x();
                    final AutoRepostItem autoRepostItem = this.f27714c;
                    aVar.a(sellerActionType, g11, analyticsPosition, x11, new l<Boolean, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.autorepost.AutoRepostItem.AutoRepostViewHolder.bindView.2.1.1.1
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
                                AutoRepostItem.this.y().invoke(Boolean.valueOf(z11));
                            } else {
                                AutoRepostItem.this.f27701f.f().setValue(TypeExtensionsKt.h0(AutoRepostItem.this.f27701f.g().isAutoRepost()) ? SwitchStates.ENABLED : SwitchStates.DISABLED);
                            }
                        }
                    });
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AutoRepostItem autoRepostItem, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f27711b = autoRepostItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(Object obj, a<?> aVar) {
            return new AnonymousClass1(this.f27711b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f27710a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                SharedFlow<AggregatedAllAnalyticsLogger.AnalyticsPosition> e11 = this.f27711b.f27701f.e();
                C02991 c02991 = new C02991(this.f27711b, null);
                this.f27710a = 1;
                if (FlowKt.collectLatest(e11, c02991, this) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoRepostItem$AutoRepostViewHolder$bindView$2(AutoRepostItem autoRepostItem, a<? super AutoRepostItem$AutoRepostViewHolder$bindView$2> aVar) {
        super(2, aVar);
        this.f27709b = autoRepostItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new AutoRepostItem$AutoRepostViewHolder$bindView$2(this.f27709b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f27708a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            s sVar = this.f27709b.f27702g;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27709b, null);
            this.f27708a = 1;
            if (RepeatOnLifecycleKt.b(sVar, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((AutoRepostItem$AutoRepostViewHolder$bindView$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
