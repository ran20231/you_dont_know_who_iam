package com.forsale.app.features.postad.bundles;

import com.forsale.app.datalayer.network.responses.Bundle;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdBundlesViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.bundles.PostAdBundlesViewModel$onBundleSelection$1", f = "PostAdBundlesViewModel.kt", l = {89}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdBundlesViewModel$onBundleSelection$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35046a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdBundlesViewModel f35047b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Bundle f35048c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdBundlesViewModel$onBundleSelection$1(PostAdBundlesViewModel postAdBundlesViewModel, Bundle bundle, zz.a<? super PostAdBundlesViewModel$onBundleSelection$1> aVar) {
        super(2, aVar);
        this.f35047b = postAdBundlesViewModel;
        this.f35048c = bundle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdBundlesViewModel$onBundleSelection$1(this.f35047b, this.f35048c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35046a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableStateFlow = this.f35047b.f35009f;
            Bundle bundle = this.f35048c;
            this.f35046a = 1;
            if (mutableStateFlow.emit(bundle, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdBundlesViewModel$onBundleSelection$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
