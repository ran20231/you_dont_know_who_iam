package com.forsale.app.features.categories.home.propertyhome;

import androidx.compose.foundation.lazy.LazyListState;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ForSaleRealty.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.propertyhome.ForSaleRealtyKt$ForSaleRealtyList$4$observer$1$onStateChanged$1", f = "ForSaleRealty.kt", l = {163}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ForSaleRealtyKt$ForSaleRealtyList$4$observer$1$onStateChanged$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f24583a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LazyListState f24584b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForSaleRealtyKt$ForSaleRealtyList$4$observer$1$onStateChanged$1(LazyListState lazyListState, zz.a<? super ForSaleRealtyKt$ForSaleRealtyList$4$observer$1$onStateChanged$1> aVar) {
        super(2, aVar);
        this.f24584b = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ForSaleRealtyKt$ForSaleRealtyList$4$observer$1$onStateChanged$1(this.f24584b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f24583a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            LazyListState lazyListState = this.f24584b;
            this.f24583a = 1;
            if (LazyListState.L(lazyListState, 0, 0, this, 2, null) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ForSaleRealtyKt$ForSaleRealtyList$4$observer$1$onStateChanged$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
