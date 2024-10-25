package com.forsale.app.datalayer.network.services;

import com.forsale.app.datalayer.network.responses.BundlesResponse;
import i10.f;
import i10.t;
import zz.a;
/* compiled from: BundlesAddonsService.kt */
/* loaded from: classes2.dex */
public interface BundlesAddonsService {
    @f("addons/bundles")
    Object getBundles(@t("category") int i11, @t("lang") String str, @t("districts") Integer num, a<? super BundlesResponse> aVar);
}
