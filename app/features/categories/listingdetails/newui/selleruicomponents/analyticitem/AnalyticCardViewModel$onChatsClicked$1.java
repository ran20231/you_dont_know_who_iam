package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem;

import com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel;
import com.forsale.app.features.more.mylistings.AnalyticModel;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.prefUtils.preferences.MasterDataSharedPrefs;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnalyticCardViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem.AnalyticCardViewModel$onChatsClicked$1", f = "AnalyticCardViewModel.kt", l = {47, 49}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AnalyticCardViewModel$onChatsClicked$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27697a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AnalyticCardViewModel f27698b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnalyticCardViewModel.kt */
    @d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem.AnalyticCardViewModel$onChatsClicked$1$1", f = "AnalyticCardViewModel.kt", l = {57}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem.AnalyticCardViewModel$onChatsClicked$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f27699a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AnalyticCardViewModel f27700b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AnalyticCardViewModel analyticCardViewModel, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f27700b = analyticCardViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(Object obj, a<?> aVar) {
            return new AnonymousClass1(this.f27700b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            MutableSharedFlow mutableSharedFlow;
            AnalyticModel analyticModel;
            f11 = b.f();
            int i11 = this.f27699a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                mutableSharedFlow = this.f27700b.f27690h;
                analyticModel = this.f27700b.f27686d;
                Integer d11 = kotlin.coroutines.jvm.internal.a.d(analyticModel.a());
                this.f27699a = 1;
                if (mutableSharedFlow.emit(d11, this) == f11) {
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
    public AnalyticCardViewModel$onChatsClicked$1(AnalyticCardViewModel analyticCardViewModel, a<? super AnalyticCardViewModel$onChatsClicked$1> aVar) {
        super(2, aVar);
        this.f27698b = analyticCardViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new AnalyticCardViewModel$onChatsClicked$1(this.f27698b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ListingDetailsViewModel listingDetailsViewModel;
        ListingDetailsViewModel listingDetailsViewModel2;
        ListingDetailsViewModel listingDetailsViewModel3;
        MutableSharedFlow mutableSharedFlow;
        f11 = b.f();
        int i11 = this.f27697a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            listingDetailsViewModel = this.f27698b.f27687e;
            MasterDataSharedPrefs h11 = listingDetailsViewModel.h1().h();
            this.f27697a = 1;
            obj = h11.j(this);
            if (obj == f11) {
                return f11;
            }
        }
        if (!TypeExtensionsKt.h0(((Number) obj).intValue())) {
            mutableSharedFlow = this.f27698b.f27693k;
            wz.p pVar = wz.p.f75480a;
            this.f27697a = 2;
            if (mutableSharedFlow.emit(pVar, this) == f11) {
                return f11;
            }
        } else {
            listingDetailsViewModel2 = this.f27698b.f27687e;
            ListingDetailsViewModel.P1(listingDetailsViewModel2, AggregatedAllAnalyticsLogger.MyListingActionEvents.MY_LISTING_ACTION_CHATS_CLICKED, true, true, null, null, 24, null);
            listingDetailsViewModel3 = this.f27698b.f27687e;
            BuildersKt__Builders_commonKt.launch$default(listingDetailsViewModel3, null, null, new AnonymousClass1(this.f27698b, null), 3, null);
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((AnalyticCardViewModel$onChatsClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
