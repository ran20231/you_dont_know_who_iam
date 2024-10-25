package com.forsale.app.features.more.payment;

import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import kotlin.jvm.internal.o;
/* compiled from: PaymentsViewModel.kt */
/* loaded from: classes2.dex */
public final class PaymentsViewModel extends BaseViewModel {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentsViewModel(BaseRepository baseRepository) {
        super(baseRepository);
        o.i(baseRepository, "baseRepository");
    }

    private final void v0(int i11) {
        if (i11 != 0) {
            if (i11 == 1) {
                AggregatedAllAnalyticsLoggerKt.x0(r(), AggregatedAllAnalyticsLogger.CustomEvents.MY_TRANSACTIONS_VISITED, false, false, 6, null);
                return;
            }
            return;
        }
        AggregatedAllAnalyticsLoggerKt.x0(r(), AggregatedAllAnalyticsLogger.CustomEvents.PAYMENT_HISTORY_VISITED, false, false, 6, null);
    }

    public final void w0(int i11) {
        v0(i11);
    }
}
