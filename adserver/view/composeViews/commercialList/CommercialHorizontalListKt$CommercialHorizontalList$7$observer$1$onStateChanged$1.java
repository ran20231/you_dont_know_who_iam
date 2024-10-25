package com.forsale.adserver.view.composeViews.commercialList;

import androidx.compose.foundation.lazy.LazyListState;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: CommercialHorizontalList.kt */
@d(c = "com.forsale.adserver.view.composeViews.commercialList.CommercialHorizontalListKt$CommercialHorizontalList$7$observer$1$onStateChanged$1", f = "CommercialHorizontalList.kt", l = {157}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CommercialHorizontalListKt$CommercialHorizontalList$7$observer$1$onStateChanged$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f20945a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LazyListState f20946b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommercialHorizontalListKt$CommercialHorizontalList$7$observer$1$onStateChanged$1(LazyListState lazyListState, zz.a<? super CommercialHorizontalListKt$CommercialHorizontalList$7$observer$1$onStateChanged$1> aVar) {
        super(2, aVar);
        this.f20946b = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CommercialHorizontalListKt$CommercialHorizontalList$7$observer$1$onStateChanged$1(this.f20946b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f20945a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            LazyListState lazyListState = this.f20946b;
            this.f20945a = 1;
            if (LazyListState.L(lazyListState, 0, 0, this, 2, null) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CommercialHorizontalListKt$CommercialHorizontalList$7$observer$1$onStateChanged$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
