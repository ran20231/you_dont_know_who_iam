package com.forsale.app.utils.analytics;

import com.forsale.app.utils.TypeExtensionsKt;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FacebookEventsLogger.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.analytics.FacebookEventsLogger$isFaceBookAnalyticsEnabled$1", f = "FacebookEventsLogger.kt", l = {243}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FacebookEventsLogger$isFaceBookAnalyticsEnabled$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super Boolean>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f39985a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FacebookEventsLogger f39986b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FacebookEventsLogger$isFaceBookAnalyticsEnabled$1(FacebookEventsLogger facebookEventsLogger, zz.a<? super FacebookEventsLogger$isFaceBookAnalyticsEnabled$1> aVar) {
        super(2, aVar);
        this.f39986b = facebookEventsLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new FacebookEventsLogger$isFaceBookAnalyticsEnabled$1(this.f39986b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        jj.b bVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f39985a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            bVar = this.f39986b.f39976a;
            kj.a a11 = bVar.a();
            this.f39985a = 1;
            obj = a11.c(this);
            if (obj == f11) {
                return f11;
            }
        }
        return kotlin.coroutines.jvm.internal.a.a(TypeExtensionsKt.h0(((Number) obj).intValue()));
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super Boolean> aVar) {
        return ((FacebookEventsLogger$isFaceBookAnalyticsEnabled$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
