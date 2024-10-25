package com.forsale.app.utils.analytics;

import com.forsale.app.utils.TypeExtensionsKt;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FirebaseEventsLogger.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.analytics.FirebaseEventsLogger$isGoogleAnalyticsEnabled$1", f = "FirebaseEventsLogger.kt", l = {243}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FirebaseEventsLogger$isGoogleAnalyticsEnabled$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super Boolean>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f39997a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FirebaseEventsLogger f39998b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseEventsLogger$isGoogleAnalyticsEnabled$1(FirebaseEventsLogger firebaseEventsLogger, zz.a<? super FirebaseEventsLogger$isGoogleAnalyticsEnabled$1> aVar) {
        super(2, aVar);
        this.f39998b = firebaseEventsLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new FirebaseEventsLogger$isGoogleAnalyticsEnabled$1(this.f39998b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        jj.b bVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f39997a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            bVar = this.f39998b.f39988a;
            kj.a a11 = bVar.a();
            this.f39997a = 1;
            obj = a11.d(this);
            if (obj == f11) {
                return f11;
            }
        }
        return kotlin.coroutines.jvm.internal.a.a(TypeExtensionsKt.h0(((Number) obj).intValue()));
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super Boolean> aVar) {
        return ((FirebaseEventsLogger$isGoogleAnalyticsEnabled$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
