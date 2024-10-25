package com.forsale.adserver.usecases;

import b9.i;
import com.forsale.adserver.datalayer.bannerdata.ClickType;
import com.forsale.adserver.datalayer.bannerdata.REGIONS;
import com.forsale.adserver.utils.LocaleManager;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.Deferred;
/* compiled from: ImpressionsUseCase.kt */
/* loaded from: classes2.dex */
public final class a extends b {

    /* renamed from: b  reason: collision with root package name */
    private final w8.a f20761b;

    /* renamed from: c  reason: collision with root package name */
    private final w8.b f20762c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(REGIONS regions, w8.a bannersImpressionManager, w8.b offersImpressionManager) {
        super(regions);
        o.i(regions, "regions");
        o.i(bannersImpressionManager, "bannersImpressionManager");
        o.i(offersImpressionManager, "offersImpressionManager");
        this.f20761b = bannersImpressionManager;
        this.f20762c = offersImpressionManager;
    }

    @Override // com.forsale.adserver.usecases.b
    public String a() {
        return "Impressions_Use_Case";
    }

    public final Object c(int i11, ClickType clickType, zz.a<? super b9.b> aVar) {
        return this.f20761b.a(i11, clickType.getTypeName(), aVar);
    }

    public final Deferred<b9.b> d(int i11, ClickType clickType) {
        o.i(clickType, "clickType");
        return this.f20761b.b(i11, LocaleManager.f20849a.d(), clickType.getTypeName());
    }

    public final Object e(int i11, ClickType clickType, zz.a<? super i> aVar) {
        return this.f20762c.a(i11, clickType.getTypeName(), aVar);
    }

    public final Deferred<i> f(int i11, ClickType clickType) {
        o.i(clickType, "clickType");
        return this.f20762c.b(i11, LocaleManager.f20849a.d(), clickType.getTypeName());
    }

    public final Deferred<b9.b> g(int i11, ClickType clickType) {
        o.i(clickType, "clickType");
        return this.f20761b.c(i11, clickType.getTypeName());
    }

    public final Deferred<i> h(int i11, ClickType clickType) {
        o.i(clickType, "clickType");
        return this.f20762c.c(i11, clickType.getTypeName());
    }
}
