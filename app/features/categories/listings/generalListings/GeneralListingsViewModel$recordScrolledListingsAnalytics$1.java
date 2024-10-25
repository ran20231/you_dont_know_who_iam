package com.forsale.app.features.categories.listings.generalListings;

import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GeneralListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel$recordScrolledListingsAnalytics$1", f = "GeneralListingsViewModel.kt", l = {201, 206, 211, 219}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class GeneralListingsViewModel$recordScrolledListingsAnalytics$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f30501a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ GeneralListingsViewModel f30502b;

    /* compiled from: GeneralListingsViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f30503a;

        static {
            int[] iArr = new int[ListingsTypes.values().length];
            try {
                iArr[ListingsTypes.MY_FAVORITES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ListingsTypes.SEARCH_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ListingsTypes.HOT_ZONES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ListingsTypes.FOR_SALE_REALTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f30503a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralListingsViewModel$recordScrolledListingsAnalytics$1(GeneralListingsViewModel generalListingsViewModel, zz.a<? super GeneralListingsViewModel$recordScrolledListingsAnalytics$1> aVar) {
        super(2, aVar);
        this.f30502b = generalListingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new GeneralListingsViewModel$recordScrolledListingsAnalytics$1(this.f30502b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        boolean z11;
        GeneralListingsDecorator J;
        GeneralListingsDecorator J2;
        GeneralListingsDecorator J3;
        GeneralListingsDecorator J4;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f30501a;
        if (i11 != 0) {
            if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            Integer value = this.f30502b.L().getValue();
            if (value.intValue() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                value = null;
            }
            Integer num = value;
            if (num != null) {
                GeneralListingsViewModel generalListingsViewModel = this.f30502b;
                int intValue = num.intValue();
                x10.a.b("***************** max listing count " + intValue, new Object[0]);
                int i12 = intValue + 1;
                int i13 = a.f30503a[generalListingsViewModel.E().f().ordinal()];
                if (i13 == 1) {
                    J = generalListingsViewModel.J();
                    AggregatedAllAnalyticsLogger.CustomEvents customEvents = AggregatedAllAnalyticsLogger.CustomEvents.MY_FAVORITE_VIEW_MORE_CLICKED;
                    Integer d11 = kotlin.coroutines.jvm.internal.a.d(i12);
                    this.f30501a = 1;
                    if (J.S(customEvents, d11, this) == f11) {
                        return f11;
                    }
                } else if (i13 == 2) {
                    J2 = generalListingsViewModel.J();
                    this.f30501a = 2;
                    if (J2.T(i12, this) == f11) {
                        return f11;
                    }
                } else if (i13 != 3) {
                    if (i13 == 4) {
                        int c11 = generalListingsViewModel.E().c();
                        J4 = generalListingsViewModel.J();
                        AggregatedAllAnalyticsLogger.CarouselName carouselName = AggregatedAllAnalyticsLogger.CarouselName.FOR_SALE_REALTY;
                        this.f30501a = 4;
                        if (J4.N(c11, carouselName, i12, this) == f11) {
                            return f11;
                        }
                    }
                } else {
                    int c12 = generalListingsViewModel.E().c();
                    J3 = generalListingsViewModel.J();
                    AggregatedAllAnalyticsLogger.CarouselName carouselName2 = AggregatedAllAnalyticsLogger.CarouselName.HOT_ZONE;
                    this.f30501a = 3;
                    if (J3.N(c12, carouselName2, i12, this) == f11) {
                        return f11;
                    }
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((GeneralListingsViewModel$recordScrolledListingsAnalytics$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
