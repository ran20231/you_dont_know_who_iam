package com.forsale.app.features.categories.listings.items.horizontalListing.controllers;

import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import zz.a;
/* compiled from: CommercialController.kt */
@d(c = "com.forsale.app.features.categories.listings.items.horizontalListing.controllers.CommercialController$touchListener$1$onInterceptTouchEvent$2", f = "CommercialController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CommercialController$touchListener$1$onInterceptTouchEvent$2 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f30799a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CommercialController f30800b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommercialController$touchListener$1$onInterceptTouchEvent$2(CommercialController commercialController, a<? super CommercialController$touchListener$1$onInterceptTouchEvent$2> aVar) {
        super(2, aVar);
        this.f30800b = commercialController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new CommercialController$touchListener$1$onInterceptTouchEvent$2(this.f30800b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        Mutex mutex2;
        b.f();
        if (this.f30799a == 0) {
            f.b(obj);
            mutex = this.f30800b.f30790b;
            if (mutex.isLocked()) {
                mutex2 = this.f30800b.f30790b;
                mutex2.unlock(this.f30800b);
            }
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((CommercialController$touchListener$1$onInterceptTouchEvent$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
