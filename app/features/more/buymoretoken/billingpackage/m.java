package com.forsale.app.features.more.buymoretoken.billingpackage;

import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.network.entities.PostListingIntention;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import kotlin.jvm.internal.o;
import t9.y0;
import wz.p;
/* compiled from: PaymentViewModel.kt */
/* loaded from: classes2.dex */
public final class m extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final boolean f31802k0;

    /* renamed from: l0  reason: collision with root package name */
    private final String f31803l0;

    /* renamed from: m0  reason: collision with root package name */
    private final ApplicationResourcesRepository f31804m0;

    /* renamed from: n0  reason: collision with root package name */
    private final OneShotEventHandler<p> f31805n0;

    /* renamed from: o0  reason: collision with root package name */
    private final OneShotEventHandler<p> f31806o0;

    /* renamed from: p0  reason: collision with root package name */
    private final OneShotEventHandler<p> f31807p0;

    /* renamed from: q0  reason: collision with root package name */
    private final OneShotEventHandler<p> f31808q0;

    /* renamed from: r0  reason: collision with root package name */
    private final String f31809r0;

    /* compiled from: PaymentViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {
        m a(boolean z11, String str);
    }

    /* compiled from: PaymentViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f31810a;

        static {
            int[] iArr = new int[PostListingIntention.values().length];
            try {
                iArr[PostListingIntention.NON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostListingIntention.NEW_LISTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f31810a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(boolean z11, String str, ApplicationResourcesRepository appRepo, BaseRepository baseRepository) {
        super(baseRepository);
        String string;
        o.i(appRepo, "appRepo");
        o.i(baseRepository, "baseRepository");
        this.f31802k0 = z11;
        this.f31803l0 = str;
        this.f31804m0 = appRepo;
        this.f31805n0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f31806o0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f31807p0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f31808q0 = new OneShotEventHandler<>(null, 0, 3, null);
        if (o.d(str, PostListingIntention.NEW_LISTING.toString())) {
            string = appRepo.getString(y0.Ua, new Object[0]);
        } else {
            string = appRepo.getString(y0.Ta, new Object[0]);
        }
        this.f31809r0 = string;
    }

    private final void C0(AggregatedAllAnalyticsLogger.CustomEvents customEvents, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition) {
        AggregatedAllAnalyticsLoggerKt.D(r(), customEvents, true, true, false, analyticsPosition, null, 40, null);
    }

    private final AggregatedAllAnalyticsLogger.AnalyticsPosition v0(String str) {
        int i11 = b.f31810a[PostListingIntention.Companion.from(str).ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                return AggregatedAllAnalyticsLogger.AnalyticsPosition.EDIT_LISTING_PAYMENT_BOTTOM_SHEET;
            }
            return AggregatedAllAnalyticsLogger.AnalyticsPosition.ADD_LISTING_PAYMENT_BOTTOM_SHEET;
        }
        return null;
    }

    public final OneShotEventHandler<p> A0() {
        return this.f31807p0;
    }

    public final String B0() {
        return this.f31809r0;
    }

    public final void D0() {
        AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition;
        AggregatedAllAnalyticsLogger.CustomEvents customEvents = AggregatedAllAnalyticsLogger.CustomEvents.ALERT_CONTINUE_UPLOADING_CLICKED;
        String str = this.f31803l0;
        if (str != null) {
            analyticsPosition = v0(str);
        } else {
            analyticsPosition = null;
        }
        C0(customEvents, analyticsPosition);
        this.f31808q0.i(p.f75480a);
    }

    public final void E0() {
        this.f31806o0.i(p.f75480a);
    }

    public final void G0() {
        this.f31805n0.i(p.f75480a);
    }

    public final void H0() {
        this.f31807p0.i(p.f75480a);
    }

    public final OneShotEventHandler<p> w0() {
        return this.f31808q0;
    }

    public final boolean x0() {
        return this.f31802k0;
    }

    public final OneShotEventHandler<p> y0() {
        return this.f31806o0;
    }

    public final OneShotEventHandler<p> z0() {
        return this.f31805n0;
    }
}
