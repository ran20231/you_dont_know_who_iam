package com.forsale.app.datalayer.repositories;

import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: PostAdAnonymousRepository.kt */
/* loaded from: classes2.dex */
public final class PostAdAnonymousRepository {
    public static final int $stable = 8;
    private final jj.b spUtils;

    public PostAdAnonymousRepository(jj.b spUtils) {
        o.i(spUtils, "spUtils");
        this.spUtils = spUtils;
    }

    public final Object getPostAddAnonymous(zz.a<? super Boolean> aVar) {
        return this.spUtils.k().f(aVar);
    }

    public final Object setPostAddAnonymous(boolean z11, zz.a<? super p> aVar) {
        Object f11;
        Object k11 = this.spUtils.k().k(z11, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (k11 == f11) {
            return k11;
        }
        return p.f75480a;
    }
}
