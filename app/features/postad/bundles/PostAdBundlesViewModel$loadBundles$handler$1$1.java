package com.forsale.app.features.postad.bundles;

import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.features.postad.bundles.b;
import falcon.chat.entities.Constants;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* compiled from: PostAdBundlesViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.bundles.PostAdBundlesViewModel$loadBundles$handler$1$1", f = "PostAdBundlesViewModel.kt", l = {Constants.PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PostAdBundlesViewModel$loadBundles$handler$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35039a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Throwable f35040b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PostAdBundlesViewModel f35041c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdBundlesViewModel$loadBundles$handler$1$1(Throwable th2, PostAdBundlesViewModel postAdBundlesViewModel, zz.a<? super PostAdBundlesViewModel$loadBundles$handler$1$1> aVar) {
        super(2, aVar);
        this.f35040b = th2;
        this.f35041c = postAdBundlesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdBundlesViewModel$loadBundles$handler$1$1(this.f35040b, this.f35041c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35039a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            Throwable th2 = this.f35040b;
            x10.a.b("loading:: " + th2, new Object[0]);
            mutableStateFlow = this.f35041c.f35007d;
            b.a aVar = new b.a(this.f35040b instanceof ConnectivityInterceptor.ConnectivityException);
            this.f35039a = 1;
            if (mutableStateFlow.emit(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdBundlesViewModel$loadBundles$handler$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
