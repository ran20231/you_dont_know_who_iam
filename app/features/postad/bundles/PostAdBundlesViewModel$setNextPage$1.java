package com.forsale.app.features.postad.bundles;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdBundlesViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.bundles.PostAdBundlesViewModel$setNextPage$1", f = "PostAdBundlesViewModel.kt", l = {142}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdBundlesViewModel$setNextPage$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35053a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdBundlesViewModel f35054b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f35055c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdBundlesViewModel$setNextPage$1(PostAdBundlesViewModel postAdBundlesViewModel, int i11, zz.a<? super PostAdBundlesViewModel$setNextPage$1> aVar) {
        super(2, aVar);
        this.f35054b = postAdBundlesViewModel;
        this.f35055c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdBundlesViewModel$setNextPage$1(this.f35054b, this.f35055c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35053a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableStateFlow = this.f35054b.f35015y;
            Integer d11 = kotlin.coroutines.jvm.internal.a.d(this.f35055c);
            this.f35053a = 1;
            if (mutableStateFlow.emit(d11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdBundlesViewModel$setNextPage$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
