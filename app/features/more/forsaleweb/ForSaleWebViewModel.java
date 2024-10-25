package com.forsale.app.features.more.forsaleweb;

import androidx.lifecycle.b0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.network.entities.qrsessions.ForSaleWebSession;
import com.forsale.app.datalayer.network.services.QRServices;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.WebLoginActionType;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import wz.p;
/* compiled from: ForSaleWebViewModel.kt */
/* loaded from: classes2.dex */
public final class ForSaleWebViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final QRServices f31879k0;

    /* renamed from: l0  reason: collision with root package name */
    private final jj.b f31880l0;

    /* renamed from: m0  reason: collision with root package name */
    private final b0<List<ForSaleWebSession>> f31881m0;

    /* renamed from: n0  reason: collision with root package name */
    private final OneShotEventHandler<p> f31882n0;

    /* renamed from: o0  reason: collision with root package name */
    private final OneShotEventHandler<p> f31883o0;

    /* compiled from: ForSaleWebViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {
        ForSaleWebViewModel a(List<ForSaleWebSession> list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForSaleWebViewModel(List<ForSaleWebSession> list, QRServices qrServices, jj.b prefs, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(qrServices, "qrServices");
        o.i(prefs, "prefs");
        o.i(baseRepository, "baseRepository");
        this.f31879k0 = qrServices;
        this.f31880l0 = prefs;
        this.f31881m0 = new b0<>(list);
        this.f31882n0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f31883o0 = new OneShotEventHandler<>(null, 0, 3, null);
    }

    private final void D0(WebLoginActionType webLoginActionType) {
        AggregatedAllAnalyticsLoggerKt.P0(r(), webLoginActionType);
    }

    private final void E0() {
        D0(WebLoginActionType.LOGOUT_ALL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0() {
        BuildersKt__Builders_commonKt.launch$default(this, new b(CoroutineExceptionHandler.Key), null, new ForSaleWebViewModel$getAllSessions$2(this, null), 2, null);
    }

    public final b0<List<ForSaleWebSession>> A0() {
        return this.f31881m0;
    }

    public final OneShotEventHandler<p> B0() {
        return this.f31883o0;
    }

    public final void C0() {
        E0();
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new ForSaleWebViewModel$logOutFromAllSessions$1(this, null), 3, null);
    }

    public final void G0() {
        D0(WebLoginActionType.STARTED);
    }

    public final void H0() {
        OneShotEventHandler.d(this.f31882n0, null, 1, null);
    }

    public final void I0(String token) {
        o.i(token, "token");
        BuildersKt__Builders_commonKt.launch$default(this, new c(CoroutineExceptionHandler.Key), null, new ForSaleWebViewModel$verifyQRCode$2(this, token, null), 2, null);
    }

    public final OneShotEventHandler<p> z0() {
        return this.f31882n0;
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public b(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public c(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
        }
    }
}
