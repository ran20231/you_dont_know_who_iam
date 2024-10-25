package com.forsale.app.ui.bottomsheets.logout;

import androidx.databinding.ObservableField;
import androidx.lifecycle.r0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.features.auth.utils.AuthErrorHandler;
import com.forsale.app.ui.bottomsheets.logout.interactors.LogoutInteractor;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import jj.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import wz.p;
/* compiled from: LogoutBottomSheetViewModel.kt */
/* loaded from: classes3.dex */
public final class LogoutBottomSheetViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final b f38904k0;

    /* renamed from: l0  reason: collision with root package name */
    private final UserProfileInteractor f38905l0;

    /* renamed from: m0  reason: collision with root package name */
    private final eh.b f38906m0;

    /* renamed from: n0  reason: collision with root package name */
    private final eh.a f38907n0;

    /* renamed from: o0  reason: collision with root package name */
    private final LogoutInteractor f38908o0;

    /* renamed from: p0  reason: collision with root package name */
    private final he.a f38909p0;

    /* renamed from: q0  reason: collision with root package name */
    private final AuthErrorHandler f38910q0;

    /* renamed from: r0  reason: collision with root package name */
    private final ObservableField<Boolean> f38911r0;

    /* renamed from: s0  reason: collision with root package name */
    private final ObservableField<Integer> f38912s0;

    /* renamed from: t0  reason: collision with root package name */
    private final MutableSharedFlow<String> f38913t0;

    /* renamed from: u0  reason: collision with root package name */
    private final SharedFlow<String> f38914u0;

    /* renamed from: v0  reason: collision with root package name */
    private final ObservableField<Boolean> f38915v0;

    /* renamed from: w0  reason: collision with root package name */
    private final CoroutineExceptionHandler f38916w0;

    /* renamed from: x0  reason: collision with root package name */
    private final MutableSharedFlow<p> f38917x0;

    /* renamed from: y0  reason: collision with root package name */
    private final SharedFlow<p> f38918y0;

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LogoutBottomSheetViewModel f38919a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineExceptionHandler.Key key, LogoutBottomSheetViewModel logoutBottomSheetViewModel) {
            super(key);
            this.f38919a = logoutBottomSheetViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            this.f38919a.x0(th2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoutBottomSheetViewModel(b prefs, UserProfileInteractor userProfileInteractor, eh.b getUserAutoRepostsInteractor, eh.a cancelUserAutoRepostsInteractor, LogoutInteractor logoutInteractor, he.a logoutAnalyticsInteractor, AuthErrorHandler errorHandler, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(prefs, "prefs");
        o.i(userProfileInteractor, "userProfileInteractor");
        o.i(getUserAutoRepostsInteractor, "getUserAutoRepostsInteractor");
        o.i(cancelUserAutoRepostsInteractor, "cancelUserAutoRepostsInteractor");
        o.i(logoutInteractor, "logoutInteractor");
        o.i(logoutAnalyticsInteractor, "logoutAnalyticsInteractor");
        o.i(errorHandler, "errorHandler");
        o.i(baseRepository, "baseRepository");
        this.f38904k0 = prefs;
        this.f38905l0 = userProfileInteractor;
        this.f38906m0 = getUserAutoRepostsInteractor;
        this.f38907n0 = cancelUserAutoRepostsInteractor;
        this.f38908o0 = logoutInteractor;
        this.f38909p0 = logoutAnalyticsInteractor;
        this.f38910q0 = errorHandler;
        this.f38911r0 = new ObservableField<>(Boolean.TRUE);
        this.f38912s0 = new ObservableField<>(0);
        MutableSharedFlow<String> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f38913t0 = MutableSharedFlow$default;
        this.f38914u0 = FlowKt.asSharedFlow(MutableSharedFlow$default);
        this.f38915v0 = new ObservableField<>(Boolean.FALSE);
        this.f38916w0 = new a(CoroutineExceptionHandler.Key, this);
        MutableSharedFlow<p> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f38917x0 = MutableSharedFlow$default2;
        this.f38918y0 = FlowKt.asSharedFlow(MutableSharedFlow$default2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x0(Throwable th2) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new LogoutBottomSheetViewModel$checkAndPopulateMessage$1(th2, this, null), 3, null);
    }

    public final void A0() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new LogoutBottomSheetViewModel$onConfirmLogoutClicked$1(this, null), 3, null);
    }

    @Override // com.forsale.app.base.viewmodels.BaseViewModel, kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return super.getCoroutineContext().plus(this.f38916w0);
    }

    public final ObservableField<Integer> y0() {
        return this.f38912s0;
    }

    public final ObservableField<Boolean> z0() {
        return this.f38911r0;
    }
}
