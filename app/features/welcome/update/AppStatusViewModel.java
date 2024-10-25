package com.forsale.app.features.welcome.update;

import androidx.lifecycle.k0;
import com.forsale.app.base.viewmodels.BaseStatefulViewModel;
import com.forsale.app.datalayer.network.entities.SessionEntity;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: AppStatusViewModel.kt */
/* loaded from: classes2.dex */
public final class AppStatusViewModel extends BaseStatefulViewModel {

    /* renamed from: l0  reason: collision with root package name */
    private final com.forsale.app.features.welcome.update.a f37409l0;

    /* renamed from: m0  reason: collision with root package name */
    private final SessionEntity.AppStatus f37410m0;

    /* renamed from: n0  reason: collision with root package name */
    private final boolean f37411n0;

    /* renamed from: o0  reason: collision with root package name */
    private final boolean f37412o0;

    /* renamed from: p0  reason: collision with root package name */
    private final OneShotEventHandler<p> f37413p0;

    /* renamed from: q0  reason: collision with root package name */
    private final OneShotEventHandler<p> f37414q0;

    /* renamed from: r0  reason: collision with root package name */
    private final OneShotEventHandler<p> f37415r0;

    /* compiled from: AppStatusViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f37416a;

        static {
            int[] iArr = new int[SessionEntity.AppStatus.values().length];
            try {
                iArr[SessionEntity.AppStatus.IN_MAINTENANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SessionEntity.AppStatus.OPTIONAL_UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SessionEntity.AppStatus.FORCE_UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37416a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppStatusViewModel(k0 savedStateHandle, BaseRepository baseRepository) {
        super(baseRepository);
        boolean z11;
        o.i(savedStateHandle, "savedStateHandle");
        o.i(baseRepository, "baseRepository");
        com.forsale.app.features.welcome.update.a b11 = com.forsale.app.features.welcome.update.a.f37417b.b(savedStateHandle);
        this.f37409l0 = b11;
        SessionEntity.AppStatus a11 = b11.a();
        this.f37410m0 = a11;
        SessionEntity.AppStatus appStatus = SessionEntity.AppStatus.FORCE_UPDATE;
        if (a11 != appStatus && a11 != SessionEntity.AppStatus.OPTIONAL_UPDATE) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f37411n0 = z11;
        this.f37412o0 = a11 == appStatus;
        this.f37413p0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f37414q0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f37415r0 = new OneShotEventHandler<>(null, 0, 3, null);
    }

    private final void C0() {
        AggregatedAllAnalyticsLogger.CustomEvents customEvents;
        int i11 = a.f37416a[this.f37410m0.ordinal()];
        if (i11 != 1) {
            if (i11 != 2 && i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            customEvents = AggregatedAllAnalyticsLogger.CustomEvents.NEED_UPDATE_SCREEN_SHOWN;
        } else {
            customEvents = AggregatedAllAnalyticsLogger.CustomEvents.MAINTENANCE_SCREEN_SHOWN;
        }
        AggregatedAllAnalyticsLoggerKt.x0(r(), customEvents, false, false, 6, null);
    }

    public final OneShotEventHandler<p> A0() {
        return this.f37415r0;
    }

    public final boolean B0() {
        return this.f37412o0;
    }

    public final void D0() {
        C0();
    }

    public final void E0() {
        this.f37414q0.i(p.f75480a);
    }

    public final void G0() {
        this.f37415r0.i(p.f75480a);
    }

    public final void w0() {
        if (this.f37410m0 == SessionEntity.AppStatus.IN_MAINTENANCE) {
            this.f37413p0.i(p.f75480a);
        }
    }

    public final OneShotEventHandler<p> x0() {
        return this.f37413p0;
    }

    public final boolean y0() {
        return this.f37411n0;
    }

    public final OneShotEventHandler<p> z0() {
        return this.f37414q0;
    }
}
