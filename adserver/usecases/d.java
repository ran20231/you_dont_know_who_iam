package com.forsale.adserver.usecases;

import com.forsale.adserver.datalayer.bannerdata.REGIONS;
import kotlin.jvm.internal.o;
/* compiled from: SplashUseCase.kt */
/* loaded from: classes2.dex */
public final class d extends b {

    /* renamed from: b  reason: collision with root package name */
    private final e9.b f20765b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(REGIONS region, e9.b splashFactory) {
        super(region);
        o.i(region, "region");
        o.i(splashFactory, "splashFactory");
        this.f20765b = splashFactory;
    }

    @Override // com.forsale.adserver.usecases.b
    public String a() {
        return "Splash_Use_Case";
    }
}
