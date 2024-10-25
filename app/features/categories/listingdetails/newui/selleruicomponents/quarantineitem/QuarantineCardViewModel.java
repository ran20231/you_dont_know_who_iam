package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.quarantineitem;

import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import wz.p;
/* compiled from: QuarantineCardViewModel.kt */
/* loaded from: classes2.dex */
public final class QuarantineCardViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineScope f27926a;

    /* renamed from: b  reason: collision with root package name */
    private final StateFlow<Boolean> f27927b;

    /* renamed from: c  reason: collision with root package name */
    private final ApplicationResourcesRepository f27928c;

    /* renamed from: d  reason: collision with root package name */
    private final MutableSharedFlow<String> f27929d;

    /* renamed from: e  reason: collision with root package name */
    private final SharedFlow<String> f27930e;

    /* renamed from: f  reason: collision with root package name */
    private final MutableSharedFlow<p> f27931f;

    /* renamed from: g  reason: collision with root package name */
    private final SharedFlow<p> f27932g;

    /* renamed from: h  reason: collision with root package name */
    private final MutableStateFlow<String> f27933h;

    /* renamed from: i  reason: collision with root package name */
    private final StateFlow<String> f27934i;

    public QuarantineCardViewModel(CoroutineScope coroutineScope, StateFlow<Boolean> notificationIsEnabled, ApplicationResourcesRepository appRepo) {
        o.i(coroutineScope, "coroutineScope");
        o.i(notificationIsEnabled, "notificationIsEnabled");
        o.i(appRepo, "appRepo");
        this.f27926a = coroutineScope;
        this.f27927b = notificationIsEnabled;
        this.f27928c = appRepo;
        MutableSharedFlow<String> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f27929d = MutableSharedFlow$default;
        this.f27930e = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableSharedFlow<p> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f27931f = MutableSharedFlow$default2;
        this.f27932g = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this.f27933h = MutableStateFlow;
        this.f27934i = FlowKt.asStateFlow(MutableStateFlow);
        k();
    }

    private final void k() {
        BuildersKt__Builders_commonKt.launch$default(this.f27926a, null, null, new QuarantineCardViewModel$updateMessage$1(this, null), 3, null);
    }

    public final SharedFlow<p> e() {
        return this.f27932g;
    }

    public final SharedFlow<String> f() {
        return this.f27930e;
    }

    public final StateFlow<Boolean> g() {
        return this.f27927b;
    }

    public final StateFlow<String> h() {
        return this.f27934i;
    }

    public final void i() {
        BuildersKt__Builders_commonKt.launch$default(this.f27926a, null, null, new QuarantineCardViewModel$onEnableNotificationClicked$1(this, null), 3, null);
    }

    public final void j() {
        BuildersKt__Builders_commonKt.launch$default(this.f27926a, null, null, new QuarantineCardViewModel$onGoToTermsAndConditionClicked$1(this, null), 3, null);
    }
}
