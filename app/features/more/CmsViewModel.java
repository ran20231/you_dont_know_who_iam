package com.forsale.app.features.more;

import androidx.databinding.ObservableField;
import androidx.databinding.i;
import com.forsale.app.base.ViewStates;
import com.forsale.app.base.viewmodels.BaseStatefulViewModel;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.datalayer.network.services.CmsService;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.features.more.WebType;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import java.util.List;
import kotlin.collections.r;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import wz.h;
import wz.p;
/* compiled from: CmsViewModel.kt */
/* loaded from: classes2.dex */
public final class CmsViewModel extends BaseStatefulViewModel {
    private final CoroutineContext A0;
    private final i.a B0;

    /* renamed from: l0  reason: collision with root package name */
    private final String f31565l0;

    /* renamed from: m0  reason: collision with root package name */
    private final CmsService f31566m0;

    /* renamed from: n0  reason: collision with root package name */
    private final jj.b f31567n0;

    /* renamed from: o0  reason: collision with root package name */
    private final ObservableField<String> f31568o0;

    /* renamed from: p0  reason: collision with root package name */
    private final MutableStateFlow<WebModel> f31569p0;

    /* renamed from: q0  reason: collision with root package name */
    private final StateFlow<WebModel> f31570q0;

    /* renamed from: r0  reason: collision with root package name */
    private final OneShotEventHandler<p> f31571r0;

    /* renamed from: s0  reason: collision with root package name */
    private final OneShotEventHandler<p> f31572s0;

    /* renamed from: t0  reason: collision with root package name */
    private final ObservableField<Boolean> f31573t0;

    /* renamed from: u0  reason: collision with root package name */
    private final ObservableField<Boolean> f31574u0;

    /* renamed from: v0  reason: collision with root package name */
    private final OneShotEventHandler<Boolean> f31575v0;

    /* renamed from: w0  reason: collision with root package name */
    private final h f31576w0;

    /* renamed from: x0  reason: collision with root package name */
    private final ObservableField<Boolean> f31577x0;

    /* renamed from: y0  reason: collision with root package name */
    private final ObservableField<Boolean> f31578y0;

    /* renamed from: z0  reason: collision with root package name */
    private final CoroutineExceptionHandler f31579z0;

    /* compiled from: CmsViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {
        CmsViewModel a(String str);
    }

    /* compiled from: CmsViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f31581a;

        static {
            int[] iArr = new int[WebType.values().length];
            try {
                iArr[WebType.TERMS_CONDITIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WebType.ABOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WebType.PRIVACY_POLICY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WebType.GET_FREE_ADS_ALLOWANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WebType.USER_SERVICE_TERMS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WebType.TWITTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[WebType.INSTAGRAM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[WebType.YOUTUBE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[WebType.ADDON_HELP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[WebType.PAYMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[WebType.PLANS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[WebType.ITEM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[WebType.WALKTHROUGHT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[WebType.PDF.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[WebType.GAM.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[WebType.DEEP_LINK.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[WebType.URL.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            f31581a = iArr;
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CmsViewModel f31582a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CoroutineExceptionHandler.Key key, CmsViewModel cmsViewModel) {
            super(key);
            this.f31582a = cmsViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            x10.a.b(th2.getMessage(), new Object[0]);
            if (th2 instanceof ConnectivityInterceptor.ConnectivityException) {
                this.f31582a.v0().postValue(ViewStates.CONNECTION_ERROR);
            } else {
                this.f31582a.v0().postValue(ViewStates.ERROR);
            }
        }
    }

    /* compiled from: ObservableExtensions.kt */
    /* loaded from: classes2.dex */
    public static final class d extends i.a {
        public d() {
        }

        @Override // androidx.databinding.i.a
        public void d(i observable, int i11) {
            o.i(observable, "observable");
            Boolean bool = (Boolean) ((ObservableField) observable).j();
            if (bool != null) {
                CmsViewModel.this.H0().i(Boolean.valueOf(!bool.booleanValue()));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CmsViewModel(String type, CmsService cmsService, jj.b prefs, BaseRepository baseRepository) {
        super(baseRepository);
        h a11;
        o.i(type, "type");
        o.i(cmsService, "cmsService");
        o.i(prefs, "prefs");
        o.i(baseRepository, "baseRepository");
        this.f31565l0 = type;
        this.f31566m0 = cmsService;
        this.f31567n0 = prefs;
        this.f31568o0 = new ObservableField<>("");
        MutableStateFlow<WebModel> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.f31569p0 = MutableStateFlow;
        this.f31570q0 = FlowKt.asStateFlow(MutableStateFlow);
        this.f31571r0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f31572s0 = new OneShotEventHandler<>(null, 0, 3, null);
        Boolean bool = Boolean.FALSE;
        this.f31573t0 = new ObservableField<>(bool);
        ObservableField<Boolean> observableField = new ObservableField<>(bool);
        this.f31574u0 = observableField;
        this.f31575v0 = new OneShotEventHandler<>(null, 0, 3, null);
        a11 = kotlin.d.a(new g00.a<String>() { // from class: com.forsale.app.features.more.CmsViewModel$appVersionValue$2
            @Override // g00.a
            public final String invoke() {
                return jj.a.f60556a.a();
            }
        });
        this.f31576w0 = a11;
        this.f31577x0 = new ObservableField<>(Boolean.valueOf(Q0()));
        this.f31578y0 = new ObservableField<>(Boolean.valueOf(P0()));
        c cVar = new c(CoroutineExceptionHandler.Key, this);
        this.f31579z0 = cVar;
        this.A0 = Dispatchers.getIO().plus(cVar);
        M0();
        d dVar = new d();
        observableField.a(dVar);
        this.B0 = dVar;
    }

    private final String C0() {
        return (String) this.f31576w0.getValue();
    }

    private final void E0(String str, int i11, String str2) {
        v0().postValue(ViewStates.LOADING);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new CmsViewModel$getCms$1(this, i11, str, str2, null), 3, null);
    }

    private final void M0() {
        this.f31568o0.k(String.valueOf(C0()));
    }

    private final boolean P0() {
        List q11;
        q11 = r.q(WebType.PDF, WebType.TERMS_CONDITIONS, WebType.ABOUT, WebType.PRIVACY_POLICY, WebType.GET_FREE_ADS_ALLOWANCE, WebType.USER_SERVICE_TERMS);
        return q11.contains(WebType.Companion.a(this.f31565l0));
    }

    private final boolean Q0() {
        List q11;
        q11 = r.q(WebType.PDF, WebType.TWITTER, WebType.INSTAGRAM, WebType.ADDON_HELP, WebType.PAYMENT, WebType.PLANS, WebType.GAM, WebType.DEEP_LINK, WebType.URL);
        return q11.contains(WebType.Companion.a(this.f31565l0));
    }

    private final void R0(String str, String str2) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new CmsViewModel$loadLinks$1(str2, this, str, null), 3, null);
    }

    private final void S0() {
        if (WebType.Companion.a(this.f31565l0) == WebType.WALKTHROUGHT) {
            AggregatedAllAnalyticsLoggerKt.N0(r(), AggregatedAllAnalyticsLogger.WalkThroughActionEvents.HELP_WALK_THROUGH_STOPPED);
        }
    }

    private final void T0(String str) {
        int i11 = b.f31581a[WebType.Companion.a(this.f31565l0).ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 9) {
                    if (i11 == 13) {
                        AggregatedAllAnalyticsLoggerKt.N0(r(), AggregatedAllAnalyticsLogger.WalkThroughActionEvents.HELP_WALK_THROUGH_STARTED);
                        return;
                    }
                    return;
                } else if (str != null) {
                    AggregatedAllAnalyticsLoggerKt.s(r(), str);
                    return;
                } else {
                    return;
                }
            }
            AggregatedAllAnalyticsLoggerKt.w0(r(), AggregatedAllAnalyticsLogger.CustomEvents.ABOUT_US_VISITED, true, true);
            return;
        }
        AggregatedAllAnalyticsLoggerKt.w0(r(), AggregatedAllAnalyticsLogger.CustomEvents.TERMS_VISITED, true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object W0(zz.a<? super Integer> aVar) {
        return this.f31567n0.i().b(aVar);
    }

    private final void z0(String str) {
        if (WebType.Companion.a(str) == WebType.PAYMENT) {
            this.f31572s0.i(p.f75480a);
        }
    }

    public final void A0() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new CmsViewModel$clearContent$1(this, null), 3, null);
    }

    public final ObservableField<String> B0() {
        return this.f31568o0;
    }

    public final OneShotEventHandler<p> D0() {
        return this.f31571r0;
    }

    public final void G0(int i11, String title, String str) {
        o.i(title, "title");
        z0(this.f31565l0);
        WebType.a aVar = WebType.Companion;
        switch (b.f31581a[aVar.a(this.f31565l0).ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                E0(this.f31565l0, i11, title);
                return;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                R0(title, str);
                return;
            case 12:
            case 13:
                if (aVar.a(this.f31565l0) == WebType.WALKTHROUGHT || aVar.a(this.f31565l0) == WebType.ITEM) {
                    this.f31574u0.k(Boolean.TRUE);
                }
                R0(title, str);
                return;
            case 14:
                R0(title, "https://docs.google.com/gview?embedded=true&url=" + str);
                return;
            case 15:
            case 16:
            case 17:
                this.f31574u0.k(Boolean.TRUE);
                R0(title, str);
                return;
            default:
                return;
        }
    }

    public final OneShotEventHandler<Boolean> H0() {
        return this.f31575v0;
    }

    public final ObservableField<Boolean> I0() {
        return this.f31577x0;
    }

    public final ObservableField<Boolean> J0() {
        return this.f31578y0;
    }

    public final StateFlow<WebModel> K0() {
        return this.f31570q0;
    }

    public final OneShotEventHandler<p> L0() {
        return this.f31572s0;
    }

    public final ObservableField<Boolean> N0() {
        return this.f31574u0;
    }

    public final ObservableField<Boolean> O0() {
        return this.f31573t0;
    }

    public final void U0() {
        S0();
        this.f31571r0.i(p.f75480a);
    }

    public final void V0(String str) {
        T0(str);
    }

    @Override // com.forsale.app.base.viewmodels.BaseViewModel, kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.A0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.viewmodels.BaseViewModel, androidx.lifecycle.q0
    public void onCleared() {
        super.onCleared();
        this.f31574u0.g(this.B0);
    }
}
