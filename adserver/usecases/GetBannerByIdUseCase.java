package com.forsale.adserver.usecases;

import com.forsale.adserver.datalayer.bannerdata.BannerFactory;
import com.forsale.adserver.datalayer.bannerdata.REGIONS;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Deferred;
/* compiled from: GetBannerByIdUseCase.kt */
/* loaded from: classes2.dex */
public final class GetBannerByIdUseCase extends b {

    /* renamed from: b  reason: collision with root package name */
    private final BannerFactory f20757b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBannerByIdUseCase(REGIONS region, BannerFactory bannerFactory) {
        super(region);
        o.i(region, "region");
        o.i(bannerFactory, "bannerFactory");
        this.f20757b = bannerFactory;
    }

    @Override // com.forsale.adserver.usecases.b
    public String a() {
        return "Banner_Use_Case";
    }

    public final BannerFactory c() {
        return this.f20757b;
    }

    public final Deferred<g9.b> d(int i11) {
        Deferred<g9.b> async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(this, null, null, new GetBannerByIdUseCase$loadBannerById$1(this, i11, null), 3, null);
        return async$default;
    }
}
