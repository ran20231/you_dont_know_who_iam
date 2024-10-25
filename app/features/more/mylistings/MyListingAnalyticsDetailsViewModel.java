package com.forsale.app.features.more.mylistings;

import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableInt;
import com.forsale.analytics.AnalyticsType;
import com.forsale.app.base.ViewStates;
import com.forsale.app.base.viewmodels.BaseStatefulViewModel;
import com.forsale.app.datalayer.database.InAppType;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.datalayer.network.requestsbodies.InAppAnalyticsBody;
import com.forsale.app.datalayer.network.requestsbodies.ListingAnalyticsBody;
import com.forsale.app.datalayer.network.responses.ListingAnalyticsResponse;
import com.forsale.app.datalayer.network.services.AnalyticsService;
import com.forsale.app.datalayer.network.services.MessagingService;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.MyListingAnalyticsType;
import com.leanplum.core.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.i0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
/* compiled from: MyListingAnalyticsDetailsViewModel.kt */
/* loaded from: classes2.dex */
public final class MyListingAnalyticsDetailsViewModel extends BaseStatefulViewModel {

    /* renamed from: l0  reason: collision with root package name */
    private final int f31924l0;

    /* renamed from: m0  reason: collision with root package name */
    private final AnalyticsType f31925m0;

    /* renamed from: n0  reason: collision with root package name */
    private final AnalyticsService f31926n0;

    /* renamed from: o0  reason: collision with root package name */
    private final MessagingService f31927o0;

    /* renamed from: p0  reason: collision with root package name */
    private final OneShotEventHandler<ListingAnalyticsResponse> f31928p0;

    /* renamed from: q0  reason: collision with root package name */
    private final ObservableInt f31929q0;

    /* renamed from: r0  reason: collision with root package name */
    private final ObservableBoolean f31930r0;

    /* renamed from: s0  reason: collision with root package name */
    private final ObservableBoolean f31931s0;

    /* renamed from: t0  reason: collision with root package name */
    private final ObservableBoolean f31932t0;

    /* renamed from: u0  reason: collision with root package name */
    private final ObservableBoolean f31933u0;

    /* compiled from: MyListingAnalyticsDetailsViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {
        MyListingAnalyticsDetailsViewModel a(int i11, AnalyticsType analyticsType);
    }

    /* compiled from: MyListingAnalyticsDetailsViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f31934a;

        static {
            int[] iArr = new int[AnalyticsType.values().length];
            try {
                iArr[AnalyticsType.VIEWS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnalyticsType.CALL_ATTEMPTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnalyticsType.PHONE_CALLS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AnalyticsType.VOIP_CALLS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AnalyticsType.VIDEO_CALLS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AnalyticsType.PROMOTION_VIEWS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AnalyticsType.PROMOTION_CLICKS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AnalyticsType.WHATSAPP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AnalyticsType.WHATSAPP_APP_ICON.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AnalyticsType.CHAT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f31934a = iArr;
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MyListingAnalyticsDetailsViewModel f31935a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CoroutineExceptionHandler.Key key, MyListingAnalyticsDetailsViewModel myListingAnalyticsDetailsViewModel) {
            super(key);
            this.f31935a = myListingAnalyticsDetailsViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            if (th2 instanceof ConnectivityInterceptor.ConnectivityException) {
                this.f31935a.v0().postValue(ViewStates.CONNECTION_ERROR);
            } else {
                this.f31935a.v0().postValue(ViewStates.ERROR);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyListingAnalyticsDetailsViewModel(int i11, AnalyticsType analyticsType, AnalyticsService analyticsService, MessagingService messagingService, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(analyticsType, "analyticsType");
        o.i(analyticsService, "analyticsService");
        o.i(messagingService, "messagingService");
        o.i(baseRepository, "baseRepository");
        this.f31924l0 = i11;
        this.f31925m0 = analyticsType;
        this.f31926n0 = analyticsService;
        this.f31927o0 = messagingService;
        this.f31928p0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f31929q0 = new ObservableInt(0);
        this.f31930r0 = new ObservableBoolean(true);
        this.f31931s0 = new ObservableBoolean(true);
        this.f31932t0 = new ObservableBoolean(true);
        this.f31933u0 = new ObservableBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B0(zz.a<? super ListingAnalyticsResponse> aVar) {
        switch (b.f31934a[this.f31925m0.ordinal()]) {
            case 1:
                M0(MyListingAnalyticsType.ADV_VIEWS);
                return this.f31926n0.getListingViewCounts(new ListingAnalyticsBody(this.f31924l0, null, 2, null), aVar);
            case 2:
                M0(MyListingAnalyticsType.CALL_ATTEMPTS);
                return this.f31926n0.getCallClicks(new ListingAnalyticsBody(this.f31924l0, this.f31925m0), aVar);
            case 3:
                M0(MyListingAnalyticsType.PHONE_CALLS);
                return this.f31926n0.getCallClicks(new ListingAnalyticsBody(this.f31924l0, this.f31925m0), aVar);
            case 4:
                M0(MyListingAnalyticsType.VOIP_CALLS);
                return this.f31926n0.getCallClicks(new ListingAnalyticsBody(this.f31924l0, this.f31925m0), aVar);
            case 5:
                M0(MyListingAnalyticsType.VIDEO_CALLS);
                return this.f31926n0.getCallClicks(new ListingAnalyticsBody(this.f31924l0, this.f31925m0), aVar);
            case 6:
                M0(MyListingAnalyticsType.PROMOTION_VIEWS);
                return this.f31927o0.getInAppSpecificAnalytics(new InAppAnalyticsBody(this.f31924l0, this.f31925m0.getValue(), InAppType.PROMOTED_POST), aVar);
            case 7:
                M0(MyListingAnalyticsType.PROMOTION_CLICKS);
                return this.f31927o0.getInAppSpecificAnalytics(new InAppAnalyticsBody(this.f31924l0, this.f31925m0.getValue(), InAppType.PROMOTED_POST), aVar);
            case 8:
                throw new Exception("WhatsApp Analytics not implemented yet");
            case 9:
                M0(MyListingAnalyticsType.WHATS_APP_ICON);
                return this.f31926n0.getCallClicks(new ListingAnalyticsBody(this.f31924l0, this.f31925m0), aVar);
            case 10:
                M0(MyListingAnalyticsType.CHAT);
                return this.f31926n0.getCallClicks(new ListingAnalyticsBody(this.f31924l0, this.f31925m0), aVar);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final void M0(MyListingAnalyticsType myListingAnalyticsType) {
        AggregatedAllAnalyticsLoggerKt.n0(r(), myListingAnalyticsType, this.f31924l0);
    }

    public final OneShotEventHandler<ListingAnalyticsResponse> A0() {
        return this.f31928p0;
    }

    public final List<Map<String, String>> C0() {
        String valueOf;
        String str;
        Map f11;
        ArrayList arrayList = new ArrayList();
        String str2 = "am";
        int i11 = 12;
        for (int i12 = 0; i12 < 24; i12++) {
            if (i12 < 10) {
                valueOf = BuildConfig.BUILD_NUMBER + i12;
            } else {
                valueOf = String.valueOf(i12);
            }
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 12) {
                        if (i12 != 13) {
                            i11++;
                            str = i11 + " " + str2;
                        }
                    } else {
                        i11++;
                        str = i11 + " pm";
                        str2 = "pm";
                    }
                }
                str = "1 " + str2;
                i11 = 1;
            } else {
                str = i11 + " " + str2;
            }
            f11 = i0.f(wz.i.a(valueOf, str));
            arrayList.add(f11);
        }
        return arrayList;
    }

    public final ObservableInt D0() {
        return this.f31929q0;
    }

    public final ObservableBoolean E0() {
        return this.f31932t0;
    }

    public final ObservableBoolean G0() {
        return this.f31931s0;
    }

    public final ObservableBoolean H0() {
        return this.f31930r0;
    }

    public final boolean I0(int i11) {
        if (this.f31929q0.j() < i11 - 1) {
            return true;
        }
        return false;
    }

    public final boolean J0() {
        if (this.f31929q0.j() > 0) {
            return true;
        }
        return false;
    }

    public final void K0() {
        ObservableInt observableInt = this.f31929q0;
        observableInt.k(observableInt.j() + 1);
    }

    public final void L0() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new MyListingAnalyticsDetailsViewModel$loadAnalytics$1(this, null), 3, null);
    }

    @Override // com.forsale.app.base.viewmodels.BaseViewModel, kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return super.getCoroutineContext().plus(new c(CoroutineExceptionHandler.Key, this));
    }

    public final void y0() {
        ObservableInt observableInt = this.f31929q0;
        observableInt.k(observableInt.j() - 1);
    }

    public final ObservableBoolean z0() {
        return this.f31933u0;
    }
}
