package com.forsale.app.intializers;

import android.content.Context;
import com.forsale.app.App;
import com.google.android.gms.ads.MobileAds;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: MobileAdsInitializer.kt */
@d(c = "com.forsale.app.intializers.MobileAdsInitializer$create$1", f = "MobileAdsInitializer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class MobileAdsInitializer$create$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37562a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f37563b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileAdsInitializer$create$1(Context context, zz.a<? super MobileAdsInitializer$create$1> aVar) {
        super(2, aVar);
        this.f37563b = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MobileAdsInitializer$create$1(this.f37563b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.f();
        if (this.f37562a == 0) {
            f.b(obj);
            Context context = this.f37563b;
            o.g(context, "null cannot be cast to non-null type com.forsale.app.App");
            MobileAds.initialize((App) context);
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MobileAdsInitializer$create$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
