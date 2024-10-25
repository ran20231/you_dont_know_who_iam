package com.forsale.app.ui.bottomsheets.listingdetailsselleraction.addadditionalcontacts;

import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.z;
import com.forsale.app.datalayer.network.entities.BusinessType;
import com.forsale.app.datalayer.network.entities.ExtraInfo;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.services.MyListingsService;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.ViewsExtensionsKt;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.v;
import dj.i;
import g00.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import t9.y0;
import wz.e;
import wz.h;
import wz.p;
/* compiled from: SellerActionAddAdditionalContactsItemViewModel.kt */
/* loaded from: classes3.dex */
public final class SellerActionAddAdditionalContactsItemViewModel {
    public static final a A = new a(null);
    public static final int B = 8;

    /* renamed from: a */
    private final CoroutineScope f38559a;

    /* renamed from: b */
    private final ListingItemDetails f38560b;

    /* renamed from: c */
    private final AggregatedAllAnalyticsLogger.AnalyticsPosition f38561c;

    /* renamed from: d */
    private final MyListingsService f38562d;

    /* renamed from: e */
    private final ApplicationResourcesRepository f38563e;

    /* renamed from: f */
    private final AggregatedAllAnalyticsLogger f38564f;

    /* renamed from: g */
    private final RegionsRepository f38565g;

    /* renamed from: h */
    private final String f38566h;

    /* renamed from: i */
    private final v.a f38567i;

    /* renamed from: j */
    private final b0<String> f38568j;

    /* renamed from: k */
    private final b0<String> f38569k;

    /* renamed from: l */
    private final b0<List<String>> f38570l;

    /* renamed from: m */
    private final z<Boolean> f38571m;

    /* renamed from: n */
    private final b0<Boolean> f38572n;

    /* renamed from: o */
    private final OneShotEventHandler<p> f38573o;

    /* renamed from: p */
    private final OneShotEventHandler<Boolean> f38574p;

    /* renamed from: q */
    private final OneShotEventHandler<Boolean> f38575q;

    /* renamed from: r */
    private final b0<String> f38576r;

    /* renamed from: s */
    private final b0<Boolean> f38577s;

    /* renamed from: t */
    private final OneShotEventHandler<String> f38578t;

    /* renamed from: u */
    private b0<String> f38579u;

    /* renamed from: v */
    private final String f38580v;

    /* renamed from: w */
    private final b0<List<String>> f38581w;

    /* renamed from: x */
    private v f38582x;

    /* renamed from: y */
    private final b0<Boolean> f38583y;

    /* renamed from: z */
    private final h f38584z;

    /* compiled from: SellerActionAddAdditionalContactsItemViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SellerActionAddAdditionalContactsItemViewModel.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38586a;

        static {
            int[] iArr = new int[BusinessType.values().length];
            try {
                iArr[BusinessType.PERSONAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BusinessType.BUSINESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f38586a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SellerActionAddAdditionalContactsItemViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class c implements c0, k {

        /* renamed from: a */
        private final /* synthetic */ l f38587a;

        c(l function) {
            o.i(function, "function");
            this.f38587a = function;
        }

        @Override // kotlin.jvm.internal.k
        public final e<?> c() {
            return this.f38587a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c0) || !(obj instanceof k)) {
                return false;
            }
            return o.d(c(), ((k) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // androidx.lifecycle.c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38587a.invoke(obj);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ SellerActionAddAdditionalContactsItemViewModel f38588a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(CoroutineExceptionHandler.Key key, SellerActionAddAdditionalContactsItemViewModel sellerActionAddAdditionalContactsItemViewModel) {
            super(key);
            this.f38588a = sellerActionAddAdditionalContactsItemViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            this.f38588a.v().f(th2);
            this.f38588a.J(false);
        }
    }

    public SellerActionAddAdditionalContactsItemViewModel(CoroutineScope coroutineScope, ListingItemDetails listingItemDetails, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, MyListingsService myListingsService, ApplicationResourcesRepository appRepo, AggregatedAllAnalyticsLogger analyticsLogger, RegionsRepository regionsRepository, String deviceId, v.a phoneParsingFactory) {
        h a11;
        o.i(coroutineScope, "coroutineScope");
        o.i(listingItemDetails, "listingItemDetails");
        o.i(myListingsService, "myListingsService");
        o.i(appRepo, "appRepo");
        o.i(analyticsLogger, "analyticsLogger");
        o.i(regionsRepository, "regionsRepository");
        o.i(deviceId, "deviceId");
        o.i(phoneParsingFactory, "phoneParsingFactory");
        this.f38559a = coroutineScope;
        this.f38560b = listingItemDetails;
        this.f38561c = analyticsPosition;
        this.f38562d = myListingsService;
        this.f38563e = appRepo;
        this.f38564f = analyticsLogger;
        this.f38565g = regionsRepository;
        this.f38566h = deviceId;
        this.f38567i = phoneParsingFactory;
        b0<String> b0Var = new b0<>();
        this.f38568j = b0Var;
        this.f38569k = new b0<>();
        b0<List<String>> b0Var2 = new b0<>();
        this.f38570l = b0Var2;
        z<Boolean> zVar = new z<>();
        this.f38571m = zVar;
        Boolean bool = Boolean.FALSE;
        this.f38572n = new b0<>(bool);
        this.f38573o = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38574p = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38575q = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38576r = new b0<>();
        this.f38577s = new b0<>(Boolean.TRUE);
        this.f38578t = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38579u = new b0<>("*");
        this.f38580v = "+965";
        this.f38581w = new b0<>();
        this.f38583y = new b0<>(bool);
        a11 = kotlin.d.a(new g00.a<i>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.addadditionalcontacts.SellerActionAddAdditionalContactsItemViewModel$reporter$2
            @Override // g00.a
            /* renamed from: b */
            public final i invoke() {
                return i.f54287a.invoke();
            }
        });
        this.f38584z = a11;
        s(listingItemDetails.getRegId());
        b0Var.postValue(I());
        E();
        zVar.b(b0Var2, new c(new l<List<? extends String>, p>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.addadditionalcontacts.SellerActionAddAdditionalContactsItemViewModel.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                SellerActionAddAdditionalContactsItemViewModel.this = this;
            }

            public final void b(List<String> list) {
                boolean z11;
                z<Boolean> n11 = SellerActionAddAdditionalContactsItemViewModel.this.n();
                List<String> list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                n11.setValue(Boolean.valueOf(!z11));
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(List<? extends String> list) {
                b(list);
                return p.f75480a;
            }
        }));
    }

    public final void A() {
        List<String> list;
        List<String> list2;
        List<String> n11;
        b0<List<String>> b0Var = this.f38581w;
        List<String> list3 = null;
        if (b0Var != null) {
            list = b0Var.getValue();
        } else {
            list = null;
        }
        if (list == null) {
            list = r.n();
        }
        List<String> list4 = list;
        b0<List<String>> b0Var2 = this.f38570l;
        if (b0Var2 != null) {
            list3 = b0Var2.getValue();
        }
        if (list3 == null) {
            n11 = r.n();
            list2 = n11;
        } else {
            list2 = list3;
        }
        B(AggregatedAllAnalyticsLogger.MyListingActionEvents.MY_LISTING_DETAILS_ADDITIONAL_NUMBERS_CHANGED, true, true, this.f38561c, list4, list2);
    }

    private final void B(AggregatedAllAnalyticsLogger.MyListingActionEvents myListingActionEvents, boolean z11, boolean z12, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, List<String> list, List<String> list2) {
        ListingItemDetails listingItemDetails = this.f38560b;
        if (listingItemDetails != null) {
            BuildersKt__Builders_commonKt.launch$default(this.f38559a, null, null, new SellerActionAddAdditionalContactsItemViewModel$logMyListingAnalytics$1$1(this, myListingActionEvents, listingItemDetails, z11, z12, analyticsPosition, list, list2, null), 3, null);
        }
    }

    private final void E() {
        List E0;
        int y11;
        String contacts = this.f38560b.getContacts();
        if (contacts != null) {
            E0 = StringsKt__StringsKt.E0(contacts, new char[]{','}, false, 0, 6, null);
            ArrayList<String> arrayList = new ArrayList();
            for (Object obj : E0) {
                if (!o.d((String) obj, this.f38560b.getPhone())) {
                    arrayList.add(obj);
                }
            }
            y11 = s.y(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(y11);
            for (String str : arrayList) {
                arrayList2.add(TypeExtensionsKt.c(str));
            }
            this.f38581w.postValue(arrayList2);
            this.f38570l.postValue(arrayList2);
            j(arrayList2);
            this.f38569k.postValue(H(arrayList2));
        }
    }

    private final void G() {
        boolean z11;
        List<String> value;
        String str;
        boolean v11;
        String value2 = this.f38576r.getValue();
        if (value2 != null) {
            v11 = kotlin.text.s.v(value2);
            if (!v11) {
                z11 = false;
                if (z11 && !L(this.f38576r.getValue(), true)) {
                    return;
                }
                value = this.f38570l.getValue();
                str = (value != null || str == null) ? "" : "";
                this.f38575q.i(Boolean.TRUE);
                BuildersKt__Builders_commonKt.launch$default(this.f38559a, new d(CoroutineExceptionHandler.Key, this), null, new SellerActionAddAdditionalContactsItemViewModel$saveAdditionalContacts$2(this, str, null), 2, null);
            }
        }
        z11 = true;
        if (z11) {
        }
        value = this.f38570l.getValue();
        if (value != null) {
            str = CollectionsKt___CollectionsKt.t0(value, ",", null, null, 0, null, null, 62, null);
        }
        this.f38575q.i(Boolean.TRUE);
        BuildersKt__Builders_commonKt.launch$default(this.f38559a, new d(CoroutineExceptionHandler.Key, this), null, new SellerActionAddAdditionalContactsItemViewModel$saveAdditionalContacts$2(this, str, null), 2, null);
    }

    private final String H(List<String> list) {
        boolean z11;
        int size;
        ExtraInfo extraInfo = this.f38560b.getExtraInfo();
        if (extraInfo != null) {
            z11 = extraInfo.isPersonal();
        } else {
            z11 = false;
        }
        if (z11) {
            size = 1 - list.size();
        } else if (!z11) {
            size = 2 - list.size();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return t(size);
    }

    private final String I() {
        boolean z11;
        int i11;
        ExtraInfo extraInfo = this.f38560b.getExtraInfo();
        if (extraInfo != null) {
            z11 = extraInfo.isPersonal();
        } else {
            z11 = false;
        }
        if (z11) {
            i11 = y0.W6;
        } else if (!z11) {
            i11 = y0.X6;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return this.f38563e.getString(i11, new Object[0]);
    }

    public final void J(boolean z11) {
        this.f38574p.i(Boolean.valueOf(z11));
    }

    public static /* synthetic */ boolean M(SellerActionAddAdditionalContactsItemViewModel sellerActionAddAdditionalContactsItemViewModel, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return sellerActionAddAdditionalContactsItemViewModel.L(str, z11);
    }

    private final void j(List<String> list) {
        BusinessType businessType;
        int i11;
        ExtraInfo extraInfo = this.f38560b.getExtraInfo();
        if (extraInfo != null) {
            businessType = extraInfo.getType();
        } else {
            businessType = null;
        }
        if (businessType == null) {
            i11 = -1;
        } else {
            i11 = b.f38586a[businessType.ordinal()];
        }
        boolean z11 = false;
        if (i11 != 1) {
            if (i11 == 2) {
                b0<Boolean> b0Var = this.f38572n;
                if (list.size() == 2) {
                    z11 = true;
                }
                b0Var.postValue(Boolean.valueOf(z11));
                return;
            }
            return;
        }
        b0<Boolean> b0Var2 = this.f38572n;
        if (list.size() == 1) {
            z11 = true;
        }
        b0Var2.postValue(Boolean.valueOf(z11));
    }

    private final void s(int i11) {
        BuildersKt__Builders_commonKt.launch$default(this.f38559a, null, null, new SellerActionAddAdditionalContactsItemViewModel$getRegion$1(this, i11, null), 3, null);
    }

    private final String t(int i11) {
        int i12;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    i12 = y0.V6;
                } else {
                    i12 = y0.V6;
                }
            } else {
                i12 = y0.U6;
            }
        } else {
            i12 = y0.T6;
        }
        return this.f38563e.getString(i12, new Object[0]);
    }

    public final void C() {
        OneShotEventHandler.d(this.f38573o, null, 1, null);
    }

    public final void D() {
        G();
    }

    public final void F(String contact) {
        o.i(contact, "contact");
        this.f38583y.postValue(Boolean.TRUE);
        this.f38578t.i(contact);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x000f, code lost:
        r0 = kotlin.collections.CollectionsKt___CollectionsKt.a1(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(java.lang.String r2, boolean r3) {
        /*
            r1 = this;
            java.lang.String r0 = "parsedNumber"
            kotlin.jvm.internal.o.i(r2, r0)
            androidx.lifecycle.b0<java.util.List<java.lang.String>> r0 = r1.f38570l
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L17
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.List r0 = kotlin.collections.p.a1(r0)
            if (r0 != 0) goto L1c
        L17:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L1c:
            if (r3 == 0) goto L2a
            java.lang.String r2 = com.forsale.app.utils.validation.PhoneDetectorKt.i(r2)
            java.lang.String r2 = com.forsale.app.utils.TypeExtensionsKt.c(r2)
            r0.add(r2)
            goto L2d
        L2a:
            r0.remove(r2)
        L2d:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r2 = kotlin.collections.p.c0(r0)
            if (r2 == 0) goto L46
            androidx.lifecycle.b0<java.util.List<java.lang.String>> r3 = r1.f38570l
            r3.setValue(r2)
            r1.j(r2)
            androidx.lifecycle.b0<java.lang.String> r3 = r1.f38569k
            java.lang.String r2 = r1.H(r2)
            r3.postValue(r2)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.addadditionalcontacts.SellerActionAddAdditionalContactsItemViewModel.K(java.lang.String, boolean):void");
    }

    public final boolean L(String str, boolean z11) {
        boolean z12 = false;
        if (str != null && ViewsExtensionsKt.w(str)) {
            v vVar = this.f38582x;
            v vVar2 = null;
            if (vVar == null) {
                o.w("phoneNumberParser");
                vVar = null;
            }
            String c11 = vVar.c(str);
            if (c11 != null) {
                v vVar3 = this.f38582x;
                if (vVar3 == null) {
                    o.w("phoneNumberParser");
                } else {
                    vVar2 = vVar3;
                }
                if (vVar2.b(c11)) {
                    z12 = true;
                    if (z11) {
                        K(c11, true);
                    }
                }
            }
        }
        this.f38577s.postValue(Boolean.valueOf(z12));
        return z12;
    }

    public final String k() {
        return this.f38580v;
    }

    public final OneShotEventHandler<p> l() {
        return this.f38573o;
    }

    public final b0<List<String>> m() {
        return this.f38570l;
    }

    public final z<Boolean> n() {
        return this.f38571m;
    }

    public final b0<String> o() {
        return this.f38579u;
    }

    public final b0<String> p() {
        return this.f38569k;
    }

    public final b0<String> q() {
        return this.f38576r;
    }

    public final b0<Boolean> r() {
        return this.f38577s;
    }

    public final OneShotEventHandler<String> u() {
        return this.f38578t;
    }

    public final i v() {
        return (i) this.f38584z.getValue();
    }

    public final OneShotEventHandler<Boolean> w() {
        return this.f38574p;
    }

    public final b0<String> x() {
        return this.f38568j;
    }

    public final OneShotEventHandler<Boolean> y() {
        return this.f38575q;
    }

    public final b0<Boolean> z() {
        return this.f38572n;
    }
}
