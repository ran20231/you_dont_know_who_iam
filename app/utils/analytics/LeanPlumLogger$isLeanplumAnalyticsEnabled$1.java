package com.forsale.app.utils.analytics;

import com.forsale.app.utils.TypeExtensionsKt;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LeanPlumLogger.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.analytics.LeanPlumLogger$isLeanplumAnalyticsEnabled$1", f = "LeanPlumLogger.kt", l = {130}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class LeanPlumLogger$isLeanplumAnalyticsEnabled$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super Boolean>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f40007a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LeanPlumLogger f40008b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeanPlumLogger$isLeanplumAnalyticsEnabled$1(LeanPlumLogger leanPlumLogger, zz.a<? super LeanPlumLogger$isLeanplumAnalyticsEnabled$1> aVar) {
        super(2, aVar);
        this.f40008b = leanPlumLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new LeanPlumLogger$isLeanplumAnalyticsEnabled$1(this.f40008b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        jj.b bVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f40007a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            bVar = this.f40008b.f40001b;
            kj.a a11 = bVar.a();
            this.f40007a = 1;
            obj = a11.e(this);
            if (obj == f11) {
                return f11;
            }
        }
        return kotlin.coroutines.jvm.internal.a.a(TypeExtensionsKt.h0(((Number) obj).intValue()));
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super Boolean> aVar) {
        return ((LeanPlumLogger$isLeanplumAnalyticsEnabled$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
