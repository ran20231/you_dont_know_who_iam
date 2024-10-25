package com.forsale.app.ui.bottomsheets.listingdetailsmoreactions;

import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import tg.c;
import wz.p;
/* compiled from: MoreActionsViewModel.kt */
/* loaded from: classes3.dex */
public final class b extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final c f38457k0;

    /* renamed from: l0  reason: collision with root package name */
    private final ListingDetailsSearchAnalyticsData f38458l0;

    /* renamed from: m0  reason: collision with root package name */
    private final List<String> f38459m0;

    /* renamed from: n0  reason: collision with root package name */
    private final ListingsAnalytics$FiltersPlace f38460n0;

    /* renamed from: o0  reason: collision with root package name */
    private final String f38461o0;

    /* renamed from: p0  reason: collision with root package name */
    private final int f38462p0;

    /* renamed from: q0  reason: collision with root package name */
    private final jj.b f38463q0;

    /* renamed from: r0  reason: collision with root package name */
    private final OneShotEventHandler<p> f38464r0;

    /* renamed from: s0  reason: collision with root package name */
    private final OneShotEventHandler<List<String>> f38465s0;

    /* renamed from: t0  reason: collision with root package name */
    private final OneShotEventHandler<p> f38466t0;

    /* renamed from: u0  reason: collision with root package name */
    private final OneShotEventHandler<String> f38467u0;

    /* renamed from: v0  reason: collision with root package name */
    private final OneShotEventHandler<p> f38468v0;

    /* renamed from: w0  reason: collision with root package name */
    private final OneShotEventHandler<List<String>> f38469w0;

    /* renamed from: x0  reason: collision with root package name */
    private final OneShotEventHandler<p> f38470x0;

    /* renamed from: y0  reason: collision with root package name */
    private final boolean f38471y0;

    /* compiled from: MoreActionsViewModel.kt */
    /* loaded from: classes3.dex */
    public interface a {
        b a(c cVar, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData, List<String> list, ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace, String str, int i11);
    }

    /* compiled from: MoreActionsViewModel.kt */
    /* renamed from: com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0436b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f38472a;

        static {
            int[] iArr = new int[UserContactMode.values().length];
            try {
                iArr[UserContactMode.CALL_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserContactMode.WHATSAPP_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserContactMode.MORE_ACTIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f38472a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c moreActionsModel, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData, List<String> list, ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace, String str, int i11, jj.b prefs, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(moreActionsModel, "moreActionsModel");
        o.i(prefs, "prefs");
        o.i(baseRepository, "baseRepository");
        this.f38457k0 = moreActionsModel;
        this.f38458l0 = listingDetailsSearchAnalyticsData;
        this.f38459m0 = list;
        this.f38460n0 = listingsAnalytics$FiltersPlace;
        this.f38461o0 = str;
        this.f38462p0 = i11;
        this.f38463q0 = prefs;
        this.f38464r0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38465s0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38466t0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38467u0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38468v0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38469w0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38470x0 = new OneShotEventHandler<>(null, 0, 3, null);
        J0();
    }

    private final void J0() {
        boolean z11;
        List<String> E0;
        String c11 = this.f38457k0.c();
        if (c11 != null && c11.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            E0 = StringsKt__StringsKt.E0(this.f38457k0.c(), new char[]{','}, false, 0, 6, null);
            int i11 = C0436b.f38472a[this.f38457k0.h().ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        v0(E0);
                        return;
                    }
                    return;
                }
                this.f38469w0.i(E0);
                return;
            }
            this.f38465s0.i(E0);
        }
    }

    private final void v0(List<String> list) {
        if (TypeExtensionsKt.h0(this.f38457k0.m())) {
            this.f38466t0.i(p.f75480a);
            if (list.size() == 1) {
                this.f38467u0.i(list.get(0));
            } else {
                OneShotEventHandler.d(this.f38468v0, null, 1, null);
            }
        }
        if (this.f38471y0 && !TypeExtensionsKt.h0(this.f38457k0.k())) {
            OneShotEventHandler.d(this.f38470x0, null, 1, null);
        }
    }

    public final OneShotEventHandler<List<String>> A0() {
        return this.f38465s0;
    }

    public final OneShotEventHandler<p> B0() {
        return this.f38466t0;
    }

    public final OneShotEventHandler<p> C0() {
        return this.f38468v0;
    }

    public final OneShotEventHandler<List<String>> D0() {
        return this.f38469w0;
    }

    public final OneShotEventHandler<String> E0() {
        return this.f38467u0;
    }

    public final ListingDetailsSearchAnalyticsData G0() {
        return this.f38458l0;
    }

    public final String H0() {
        return this.f38461o0;
    }

    public final List<String> I0() {
        return this.f38459m0;
    }

    public final void K0() {
        OneShotEventHandler.d(this.f38464r0, null, 1, null);
    }

    public final Object w0(zz.a<? super String> aVar) {
        return this.f38463q0.c().a(aVar);
    }

    public final OneShotEventHandler<p> x0() {
        return this.f38464r0;
    }

    public final ListingsAnalytics$FiltersPlace y0() {
        return this.f38460n0;
    }

    public final int z0() {
        return this.f38462p0;
    }
}
