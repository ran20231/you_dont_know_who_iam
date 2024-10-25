package com.forsale.adserver.view.viewmodel;

import com.forsale.adserver.usecases.c;
import j9.e;
import j9.f;
import kotlin.jvm.internal.o;
/* compiled from: NotificationViewModel.kt */
/* loaded from: classes2.dex */
public final class NotificationViewModel extends BaseViewModel {

    /* renamed from: b  reason: collision with root package name */
    private final c f21812b;

    /* renamed from: c  reason: collision with root package name */
    private final e<f> f21813c;

    public NotificationViewModel(c notificationUseCase) {
        o.i(notificationUseCase, "notificationUseCase");
        this.f21812b = notificationUseCase;
        this.f21813c = new e<>();
    }

    @Override // com.forsale.adserver.view.viewmodel.BaseViewModel
    public String e() {
        return "FEATURES_VIEWMODEL";
    }
}
