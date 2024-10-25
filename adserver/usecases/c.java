package com.forsale.adserver.usecases;

import com.forsale.adserver.datalayer.bannerdata.REGIONS;
import kotlin.jvm.internal.o;
/* compiled from: NotificationUseCase.kt */
/* loaded from: classes2.dex */
public final class c extends b {

    /* renamed from: b  reason: collision with root package name */
    private final d9.b f20764b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(REGIONS regions, d9.b notificationFactory) {
        super(regions);
        o.i(regions, "regions");
        o.i(notificationFactory, "notificationFactory");
        this.f20764b = notificationFactory;
    }

    @Override // com.forsale.adserver.usecases.b
    public String a() {
        return "Notification_Use_case";
    }
}
