package com.forsale.app.features.categories.listingdetails.buyerscreen;

import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import com.forsale.app.features.categories.listingdetails.ListingDetailsAnalyticSource;
import com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData;
import com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: BuyerListingDetailsViewModel.kt */
/* loaded from: classes2.dex */
public final class BuyerListingDetailsViewModel extends q0 {
    private final MutableStateFlow<Boolean> A;
    private final StateFlow<Boolean> B;

    /* renamed from: a  reason: collision with root package name */
    private final SwipingOverlayInteractor f25839a;

    /* renamed from: b  reason: collision with root package name */
    private final k f25840b;

    /* renamed from: c  reason: collision with root package name */
    private final int f25841c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f25842d;

    /* renamed from: e  reason: collision with root package name */
    private final String f25843e;

    /* renamed from: f  reason: collision with root package name */
    private final int f25844f;

    /* renamed from: g  reason: collision with root package name */
    private final String f25845g;

    /* renamed from: h  reason: collision with root package name */
    private final String f25846h;

    /* renamed from: i  reason: collision with root package name */
    private final ListingDetailsAnalyticSource f25847i;

    /* renamed from: j  reason: collision with root package name */
    private final String f25848j;

    /* renamed from: x  reason: collision with root package name */
    private final String f25849x;

    /* renamed from: y  reason: collision with root package name */
    private final ListingDetailsSearchAnalyticsData f25850y;

    /* renamed from: z  reason: collision with root package name */
    private final boolean f25851z;

    public BuyerListingDetailsViewModel(SwipingOverlayInteractor swipingOverlayInteractor, k0 savedStateHandle) {
        kotlin.jvm.internal.o.i(swipingOverlayInteractor, "swipingOverlayInteractor");
        kotlin.jvm.internal.o.i(savedStateHandle, "savedStateHandle");
        this.f25839a = swipingOverlayInteractor;
        k b11 = k.f26043l.b(savedStateHandle);
        this.f25840b = b11;
        this.f25841c = b11.c();
        this.f25842d = b11.a();
        this.f25843e = b11.j();
        this.f25844f = b11.f();
        this.f25845g = b11.g();
        this.f25846h = b11.h();
        this.f25847i = b11.b();
        this.f25848j = b11.k();
        this.f25849x = b11.d();
        this.f25850y = b11.i();
        this.f25851z = b11.e();
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.A = MutableStateFlow;
        this.B = FlowKt.asStateFlow(MutableStateFlow);
        o();
    }

    private final void o() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new BuyerListingDetailsViewModel$showSwipingOverlay$1(this, null), 3, null);
    }

    public final void g() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new BuyerListingDetailsViewModel$closeOverlay$1(this, null), 3, null);
    }

    public final ItemArgs h() {
        return new ItemArgs(this.f25844f, this.f25845g, this.f25846h, this.f25847i, this.f25848j, this.f25849x, this.f25850y, this.f25851z);
    }

    public final String j(int i11) {
        return String.valueOf(this.f25842d[i11]);
    }

    public final int k() {
        int i11 = this.f25841c;
        if (i11 == -1 && this.f25843e != null) {
            return 0;
        }
        return i11;
    }

    public final int l() {
        boolean z11;
        int[] iArr = this.f25842d;
        if (iArr.length == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && this.f25843e != null) {
            return 1;
        }
        return iArr.length;
    }

    public final StateFlow<Boolean> m() {
        return this.B;
    }
}
