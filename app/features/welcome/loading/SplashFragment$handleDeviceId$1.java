package com.forsale.app.features.welcome.loading;

import g00.p;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SplashFragment.kt */
/* loaded from: classes2.dex */
public /* synthetic */ class SplashFragment$handleDeviceId$1 extends FunctionReferenceImpl implements p<List<? extends String>, g00.a<? extends wz.p>, wz.p> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public SplashFragment$handleDeviceId$1(Object obj) {
        super(2, obj, SplashFragment.class, "onRequestPhonePermission", "onRequestPhonePermission(Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", 0);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(List<? extends String> list, g00.a<? extends wz.p> aVar) {
        m(list, aVar);
        return wz.p.f75480a;
    }

    public final void m(List<String> p02, g00.a<wz.p> p12) {
        o.i(p02, "p0");
        o.i(p12, "p1");
        ((SplashFragment) this.receiver).b0(p02, p12);
    }
}
