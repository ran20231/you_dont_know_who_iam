package com.forsale.adserver.usecases;

import com.forsale.adserver.datalayer.bannerdata.REGIONS;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: MainUseCase.kt */
/* loaded from: classes2.dex */
public abstract class b implements CoroutineScope {

    /* renamed from: a  reason: collision with root package name */
    private final int f20763a;

    public b(REGIONS region) {
        o.i(region, "region");
        this.f20763a = region.getRegionId();
    }

    public abstract String a();

    public final int b() {
        return this.f20763a;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return new CoroutineName(a());
    }
}
