package com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.sold;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.services.MyListingsService;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlin.text.s;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import t9.y0;
import wz.p;
/* compiled from: DeleteListingSoldViewModel.kt */
/* loaded from: classes3.dex */
public final class DeleteListingSoldViewModel extends BaseViewModel {
    private final OneShotEventHandler<Boolean> A0;
    private final boolean B0;
    private final String C0;

    /* renamed from: k0  reason: collision with root package name */
    private final int f38238k0;

    /* renamed from: l0  reason: collision with root package name */
    private final ListingItemDetails f38239l0;

    /* renamed from: m0  reason: collision with root package name */
    private final jj.b f38240m0;

    /* renamed from: n0  reason: collision with root package name */
    private final MyListingsService f38241n0;

    /* renamed from: o0  reason: collision with root package name */
    private final boolean f38242o0;

    /* renamed from: p0  reason: collision with root package name */
    private final b0<Boolean> f38243p0;

    /* renamed from: q0  reason: collision with root package name */
    private final LiveData<Boolean> f38244q0;

    /* renamed from: r0  reason: collision with root package name */
    private final b0<Boolean> f38245r0;

    /* renamed from: s0  reason: collision with root package name */
    private final LiveData<Boolean> f38246s0;

    /* renamed from: t0  reason: collision with root package name */
    private final b0<Boolean> f38247t0;

    /* renamed from: u0  reason: collision with root package name */
    private final LiveData<Boolean> f38248u0;

    /* renamed from: v0  reason: collision with root package name */
    private final b0<Boolean> f38249v0;

    /* renamed from: w0  reason: collision with root package name */
    private final LiveData<Boolean> f38250w0;

    /* renamed from: x0  reason: collision with root package name */
    private final b0<String> f38251x0;

    /* renamed from: y0  reason: collision with root package name */
    private final b0<String> f38252y0;

    /* renamed from: z0  reason: collision with root package name */
    private final OneShotEventHandler<p> f38253z0;

    /* compiled from: DeleteListingSoldViewModel.kt */
    /* loaded from: classes3.dex */
    public interface a {
        DeleteListingSoldViewModel a(int i11, ListingItemDetails listingItemDetails, boolean z11);
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DeleteListingSoldViewModel f38254a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.Key key, DeleteListingSoldViewModel deleteListingSoldViewModel) {
            super(key);
            this.f38254a = deleteListingSoldViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            this.f38254a.A0().i(Boolean.FALSE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteListingSoldViewModel(int i11, ListingItemDetails listingItemDetails, jj.b prefs, MyListingsService myListingsService, ApplicationResourcesRepository resourcesRepository, boolean z11, BaseRepository baseRepository) {
        super(baseRepository);
        String string;
        o.i(prefs, "prefs");
        o.i(myListingsService, "myListingsService");
        o.i(resourcesRepository, "resourcesRepository");
        o.i(baseRepository, "baseRepository");
        this.f38238k0 = i11;
        this.f38239l0 = listingItemDetails;
        this.f38240m0 = prefs;
        this.f38241n0 = myListingsService;
        this.f38242o0 = z11;
        Boolean bool = Boolean.FALSE;
        b0<Boolean> b0Var = new b0<>(bool);
        this.f38243p0 = b0Var;
        this.f38244q0 = b0Var;
        b0<Boolean> b0Var2 = new b0<>();
        this.f38245r0 = b0Var2;
        this.f38246s0 = b0Var2;
        b0<Boolean> b0Var3 = new b0<>();
        this.f38247t0 = b0Var3;
        this.f38248u0 = b0Var3;
        b0<Boolean> b0Var4 = new b0<>(bool);
        this.f38249v0 = b0Var4;
        this.f38250w0 = b0Var4;
        this.f38251x0 = new b0<>();
        this.f38252y0 = new b0<>();
        this.f38253z0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.A0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.B0 = !z11;
        if (z11) {
            string = resourcesRepository.getString(y0.f70586n6, new Object[0]);
        } else {
            string = resourcesRepository.getString(y0.K4, new Object[0]);
        }
        this.C0 = string;
    }

    private final void z0(String str) {
        BuildersKt__Builders_commonKt.launch$default(this, new b(CoroutineExceptionHandler.Key, this), null, new DeleteListingSoldViewModel$deleteListing$2(this, str, null), 2, null);
    }

    public final OneShotEventHandler<Boolean> A0() {
        return this.A0;
    }

    public final OneShotEventHandler<p> B0() {
        return this.f38253z0;
    }

    public final LiveData<Boolean> C0() {
        return this.f38250w0;
    }

    public final b0<String> D0() {
        return this.f38252y0;
    }

    public final LiveData<Boolean> E0() {
        return this.f38246s0;
    }

    public final LiveData<Boolean> G0() {
        return this.f38248u0;
    }

    public final b0<String> H0() {
        return this.f38251x0;
    }

    public final LiveData<Boolean> I0() {
        return this.f38244q0;
    }

    public final String J0() {
        return this.C0;
    }

    public final boolean K0() {
        return this.B0;
    }

    public final boolean L0() {
        return this.f38242o0;
    }

    public final void M0(AggregatedAllAnalyticsLogger.MyListingActionEvents action, boolean z11, boolean z12, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, Pair<String, String>... extraOption) {
        o.i(action, "action");
        o.i(extraOption, "extraOption");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new DeleteListingSoldViewModel$logMyListingAnalytics$1(this, extraOption, action, z11, z12, analyticsPosition, null), 3, null);
    }

    public final void N0() {
        boolean v11;
        boolean z11 = true;
        if (o.d(this.f38243p0.getValue(), Boolean.TRUE)) {
            String value = this.f38251x0.getValue();
            if (value != null) {
                v11 = s.v(value);
                if (!v11) {
                    z11 = false;
                }
            }
            if (!z11) {
                this.f38251x0.postValue("");
            }
            this.f38243p0.postValue(Boolean.FALSE);
            return;
        }
        OneShotEventHandler.d(this.f38253z0, null, 1, null);
    }

    public final void O0() {
        Boolean bool;
        boolean z11;
        b0<Boolean> b0Var = this.f38247t0;
        Boolean bool2 = Boolean.TRUE;
        b0Var.postValue(bool2);
        this.f38245r0.postValue(Boolean.FALSE);
        this.f38243p0.postValue(bool2);
        b0<Boolean> b0Var2 = this.f38249v0;
        String value = this.f38251x0.getValue();
        if (value != null) {
            if (value.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            bool = Boolean.valueOf(z11);
        } else {
            bool = null;
        }
        b0Var2.postValue(bool);
    }

    public final void P0() {
        b0<Boolean> b0Var = this.f38245r0;
        Boolean bool = Boolean.TRUE;
        b0Var.postValue(bool);
        this.f38247t0.postValue(Boolean.FALSE);
        this.f38249v0.postValue(bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q0() {
        /*
            r3 = this;
            androidx.lifecycle.b0<java.lang.Boolean> r0 = r3.f38245r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.d(r0, r1)
            if (r0 == 0) goto L14
            java.lang.String r0 = "sold:4sale"
            r3.z0(r0)
            goto L58
        L14:
            androidx.lifecycle.b0<java.lang.Boolean> r0 = r3.f38247t0
            java.lang.Object r0 = r0.getValue()
            boolean r0 = kotlin.jvm.internal.o.d(r0, r1)
            if (r0 == 0) goto L58
            androidx.lifecycle.b0<java.lang.String> r0 = r3.f38251x0
            java.lang.Object r0 = r0.getValue()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L33
            boolean r0 = kotlin.text.k.v(r0)
            if (r0 == 0) goto L31
            goto L33
        L31:
            r0 = 0
            goto L34
        L33:
            r0 = 1
        L34:
            if (r0 == 0) goto L3e
            androidx.lifecycle.b0<java.lang.String> r0 = r3.f38252y0
            java.lang.String r1 = "You should fill that field"
            r0.postValue(r1)
            goto L58
        L3e:
            androidx.lifecycle.b0<java.lang.String> r0 = r3.f38251x0
            java.lang.Object r0 = r0.getValue()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "sold:other:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.z0(r0)
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.sold.DeleteListingSoldViewModel.Q0():void");
    }

    public final void R0(CharSequence s11, int i11, int i12, int i13) {
        boolean z11;
        o.i(s11, "s");
        b0<Boolean> b0Var = this.f38249v0;
        if (i13 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        b0Var.postValue(Boolean.valueOf(z11));
    }
}
