package com.forsale.app.features.categories.home.allverticals;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import wz.p;
/* compiled from: AllVerticalsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$fetchBrowseAndExplore$2", f = "AllVerticalsViewModel.kt", l = {267}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AllVerticalsViewModel$fetchBrowseAndExplore$2 extends SuspendLambda implements g00.l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23435a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AllVerticalsViewModel$fetchBrowseAndExplore$2(zz.a<? super AllVerticalsViewModel$fetchBrowseAndExplore$2> aVar) {
        super(1, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new AllVerticalsViewModel$fetchBrowseAndExplore$2(aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f23435a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            this.f23435a = 1;
            if (DelayKt.delay(200L, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((AllVerticalsViewModel$fetchBrowseAndExplore$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
