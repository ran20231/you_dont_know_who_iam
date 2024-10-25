package com.forsale.app.ui.bottomsheets.alertbottomsheet;

import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.features.postad.PostAdDialogs;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models.AlertActionTypes;
import com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models.AlertModel;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.ErrorReason;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: AlertViewModel.kt */
/* loaded from: classes3.dex */
public final class b extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final AlertModel f37986k0;

    /* renamed from: l0  reason: collision with root package name */
    private final g00.a<p> f37987l0;

    /* renamed from: m0  reason: collision with root package name */
    private final OneShotEventHandler<p> f37988m0;

    /* renamed from: n0  reason: collision with root package name */
    private boolean f37989n0;

    /* compiled from: AlertViewModel.kt */
    /* loaded from: classes3.dex */
    public interface a {
        b a(AlertModel alertModel, g00.a<p> aVar);
    }

    /* compiled from: AlertViewModel.kt */
    /* renamed from: com.forsale.app.ui.bottomsheets.alertbottomsheet.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0435b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f37990a;

        static {
            int[] iArr = new int[PostAdDialogs.values().length];
            try {
                iArr[PostAdDialogs.UploadSuccess.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostAdDialogs.UploadMediaFailed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostAdDialogs.NotEnoughCreditForAddons.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PostAdDialogs.NotEnoughCreditForAddonsEdit.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PostAdDialogs.UploadWaitingApproval.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PostAdDialogs.NotEnoughCreditNew.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f37990a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AlertModel alertModel, g00.a<p> aVar, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(baseRepository, "baseRepository");
        this.f37986k0 = alertModel;
        this.f37987l0 = aVar;
        B0();
        this.f37988m0 = new OneShotEventHandler<>(null, 0, 3, null);
    }

    static /* synthetic */ void A0(b bVar, AggregatedAllAnalyticsLogger.AdvActionEvents advActionEvents, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        if ((i11 & 8) != 0) {
            str3 = null;
        }
        bVar.z0(advActionEvents, str, str2, str3);
    }

    private final void B0() {
        AlertModel alertModel = this.f37986k0;
        if (alertModel != null) {
            switch (C0435b.f37990a[alertModel.e().ordinal()]) {
                case 1:
                    D0(this, ErrorReason.SUCCESS.getValue(), null, 2, null);
                    return;
                case 2:
                    D0(this, ErrorReason.MEDIA_ERROR.getValue(), null, 2, null);
                    return;
                case 3:
                case 4:
                    D0(this, ErrorReason.SUCCESS_WITH_CONDITIONS.getValue(), null, 2, null);
                    return;
                case 5:
                    D0(this, ErrorReason.AWAITING_APPROVE.getValue(), null, 2, null);
                    return;
                case 6:
                    D0(this, ErrorReason.NO_ENOUGH_CREDIT.getValue(), null, 2, null);
                    return;
                default:
                    return;
            }
        }
    }

    private final void C0(String str, String str2) {
        A0(this, AggregatedAllAnalyticsLogger.AdvActionEvents.ALERT_VIEWED, str, null, str2, 4, null);
    }

    static /* synthetic */ void D0(b bVar, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        bVar.C0(str, str2);
    }

    private final void z0(AggregatedAllAnalyticsLogger.AdvActionEvents advActionEvents, String str, String str2, String str3) {
        AggregatedAllAnalyticsLoggerKt.w(r(), advActionEvents, true, true, str, str2, str3);
    }

    public final void E0() {
        v0();
    }

    public final void v0() {
        if (!this.f37989n0) {
            g00.a<p> aVar = this.f37987l0;
            if (aVar != null) {
                aVar.invoke();
            }
            OneShotEventHandler.d(this.f37988m0, null, 1, null);
            this.f37989n0 = true;
        }
    }

    public final AlertActionTypes w0() {
        AlertModel alertModel = this.f37986k0;
        if (alertModel != null) {
            if (alertModel.a() != null && alertModel.b() != null) {
                return AlertActionTypes.TWO_ACTIONS;
            }
            if (alertModel.a() != null && alertModel.b() == null) {
                return AlertActionTypes.ONE_ACTION;
            }
            return AlertActionTypes.NO_ACTIONS;
        }
        return null;
    }

    public final AlertModel x0() {
        return this.f37986k0;
    }

    public final OneShotEventHandler<p> y0() {
        return this.f37988m0;
    }
}
