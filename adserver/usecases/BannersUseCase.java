package com.forsale.adserver.usecases;

import com.forsale.adserver.datalayer.bannerdata.BannerFactory;
import com.forsale.adserver.datalayer.bannerdata.REGIONS;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Deferred;
/* compiled from: BannersUseCase.kt */
/* loaded from: classes2.dex */
public final class BannersUseCase extends b {

    /* renamed from: b  reason: collision with root package name */
    private final BannerFactory f20753b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannersUseCase(REGIONS region, BannerFactory bannersFactory) {
        super(region);
        o.i(region, "region");
        o.i(bannersFactory, "bannersFactory");
        this.f20753b = bannersFactory;
    }

    @Override // com.forsale.adserver.usecases.b
    public String a() {
        return "Banner_Use_Case";
    }

    public final Deferred<List<g9.b>> d(i9.a parameters) {
        Deferred<List<g9.b>> async$default;
        o.i(parameters, "parameters");
        async$default = BuildersKt__Builders_commonKt.async$default(this, null, null, new BannersUseCase$loadListAsync$1(this, parameters, null), 3, null);
        return async$default;
    }
}
