package com.forsale.app.ui.bottomsheets.listingdetailsselleraction.hidemynumber;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.services.MyListingsService;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import dj.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.coroutines.CoroutineContext;
import kotlin.d;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.s;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import t9.y0;
import wz.h;
import wz.p;
/* compiled from: SellerActionHideMyNumberItemViewModel.kt */
/* loaded from: classes3.dex */
public final class SellerActionHideMyNumberItemViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineScope f38677a;

    /* renamed from: b  reason: collision with root package name */
    private final ListingItemDetails f38678b;

    /* renamed from: c  reason: collision with root package name */
    private final MyListingsService f38679c;

    /* renamed from: d  reason: collision with root package name */
    private final ApplicationResourcesRepository f38680d;

    /* renamed from: e  reason: collision with root package name */
    private final AggregatedAllAnalyticsLogger f38681e;

    /* renamed from: f  reason: collision with root package name */
    private final String f38682f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f38683g;

    /* renamed from: h  reason: collision with root package name */
    private final String f38684h;

    /* renamed from: i  reason: collision with root package name */
    private final String f38685i;

    /* renamed from: j  reason: collision with root package name */
    private final b0<Boolean> f38686j;

    /* renamed from: k  reason: collision with root package name */
    private final LiveData<Boolean> f38687k;

    /* renamed from: l  reason: collision with root package name */
    private final String f38688l;

    /* renamed from: m  reason: collision with root package name */
    private final OneShotEventHandler<p> f38689m;

    /* renamed from: n  reason: collision with root package name */
    private final OneShotEventHandler<Boolean> f38690n;

    /* renamed from: o  reason: collision with root package name */
    private final OneShotEventHandler<Boolean> f38691o;

    /* renamed from: p  reason: collision with root package name */
    private final h f38692p;

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SellerActionHideMyNumberItemViewModel f38693a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.Key key, SellerActionHideMyNumberItemViewModel sellerActionHideMyNumberItemViewModel) {
            super(key);
            this.f38693a = sellerActionHideMyNumberItemViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            this.f38693a.n().f(th2);
            this.f38693a.w(false);
        }
    }

    public SellerActionHideMyNumberItemViewModel(CoroutineScope coroutineScope, ListingItemDetails listingItemDetails, MyListingsService myListingsService, ApplicationResourcesRepository appRepo, AggregatedAllAnalyticsLogger analyticsLogger, String deviceId) {
        String str;
        boolean v11;
        h a11;
        o.i(coroutineScope, "coroutineScope");
        o.i(listingItemDetails, "listingItemDetails");
        o.i(myListingsService, "myListingsService");
        o.i(appRepo, "appRepo");
        o.i(analyticsLogger, "analyticsLogger");
        o.i(deviceId, "deviceId");
        this.f38677a = coroutineScope;
        this.f38678b = listingItemDetails;
        this.f38679c = myListingsService;
        this.f38680d = appRepo;
        this.f38681e = analyticsLogger;
        this.f38682f = deviceId;
        boolean z11 = true;
        boolean z12 = !TypeExtensionsKt.h0(listingItemDetails.isHideMyNumber());
        this.f38683g = z12;
        String phone = listingItemDetails.getPhone();
        this.f38684h = phone;
        if (!z12) {
            str = listingItemDetails.getPhone();
        } else {
            if (z12) {
                String contacts = listingItemDetails.getContacts();
                if (contacts != null) {
                    v11 = s.v(contacts);
                    if (!v11) {
                        z11 = false;
                    }
                }
                if (!z11) {
                    ArrayList arrayList = new ArrayList(l());
                    if (arrayList.contains(phone)) {
                        arrayList.remove(phone);
                    }
                    str = g(arrayList);
                }
            }
            str = "";
        }
        this.f38685i = str;
        b0<Boolean> b0Var = new b0<>(Boolean.TRUE);
        this.f38686j = b0Var;
        this.f38687k = b0Var;
        this.f38688l = q();
        this.f38689m = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38690n = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38691o = new OneShotEventHandler<>(null, 0, 3, null);
        a11 = d.a(new g00.a<i>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.hidemynumber.SellerActionHideMyNumberItemViewModel$reporter$2
            @Override // g00.a
            /* renamed from: b */
            public final i invoke() {
                return i.f54287a.invoke();
            }
        });
        this.f38692p = a11;
    }

    private final String g(List<String> list) {
        boolean z11;
        String t02;
        List<String> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            return "";
        }
        if (list.size() != 1) {
            t02 = CollectionsKt___CollectionsKt.t0(list, " , ", null, null, 0, null, null, 62, null);
            return t02;
        }
        return list.get(0);
    }

    private final List<String> l() {
        boolean z11;
        List<String> n11;
        String contacts;
        List<String> E0;
        ListingItemDetails listingItemDetails = this.f38678b;
        String contacts2 = listingItemDetails.getContacts();
        if (contacts2 != null && contacts2.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        List<String> list = null;
        if (!z11 && (contacts = listingItemDetails.getContacts()) != null) {
            E0 = StringsKt__StringsKt.E0(contacts, new char[]{','}, false, 0, 6, null);
            list = E0;
        }
        if (list == null) {
            n11 = r.n();
            return n11;
        }
        return list;
    }

    private final String q() {
        int i11;
        boolean v11;
        boolean v12;
        if (this.f38683g) {
            v12 = s.v(this.f38685i);
            if (v12) {
                this.f38686j.postValue(Boolean.FALSE);
                i11 = y0.f70503i7;
                return this.f38680d.getString(i11, new Object[0]);
            }
        }
        if (this.f38683g) {
            v11 = s.v(this.f38685i);
            if (!v11) {
                this.f38686j.postValue(Boolean.TRUE);
                i11 = y0.f70486h7;
                return this.f38680d.getString(i11, new Object[0]);
            }
        }
        this.f38686j.postValue(Boolean.TRUE);
        i11 = y0.f70418d7;
        return this.f38680d.getString(i11, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        AggregatedAllAnalyticsLogger.AnalyticsOnOffStatus analyticsOnOffStatus;
        if (this.f38683g) {
            analyticsOnOffStatus = AggregatedAllAnalyticsLogger.AnalyticsOnOffStatus.ON;
        } else {
            analyticsOnOffStatus = AggregatedAllAnalyticsLogger.AnalyticsOnOffStatus.OFF;
        }
        t(AggregatedAllAnalyticsLogger.MyListingActionEvents.MY_LISTING_DETAILS_HIDE_MY_NUMBER_TOGGLED, true, true, null, analyticsOnOffStatus);
    }

    private final void t(AggregatedAllAnalyticsLogger.MyListingActionEvents myListingActionEvents, boolean z11, boolean z12, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, AggregatedAllAnalyticsLogger.AnalyticsOnOffStatus analyticsOnOffStatus) {
        ListingItemDetails listingItemDetails = this.f38678b;
        if (listingItemDetails != null) {
            BuildersKt__Builders_commonKt.launch$default(this.f38677a, null, null, new SellerActionHideMyNumberItemViewModel$logMyListingAnalytics$1$1(this, myListingActionEvents, listingItemDetails, z11, z12, analyticsPosition, analyticsOnOffStatus, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(boolean z11) {
        this.f38690n.i(Boolean.valueOf(z11));
    }

    private final void x() {
        this.f38691o.i(Boolean.TRUE);
        BuildersKt__Builders_commonKt.launch$default(this.f38677a, new a(CoroutineExceptionHandler.Key, this), null, new SellerActionHideMyNumberItemViewModel$toggleAnonymity$2(this, null), 2, null);
    }

    public final OneShotEventHandler<p> h() {
        return this.f38689m;
    }

    public final String i() {
        return this.f38685i;
    }

    public final boolean j() {
        return this.f38683g;
    }

    public final LiveData<Boolean> k() {
        return this.f38687k;
    }

    public final String m() {
        return this.f38684h;
    }

    public final i n() {
        return (i) this.f38692p.getValue();
    }

    public final OneShotEventHandler<Boolean> o() {
        return this.f38690n;
    }

    public final String p() {
        return this.f38688l;
    }

    public final OneShotEventHandler<Boolean> r() {
        return this.f38691o;
    }

    public final void u() {
        OneShotEventHandler.d(this.f38689m, null, 1, null);
    }

    public final void v() {
        x();
    }
}
