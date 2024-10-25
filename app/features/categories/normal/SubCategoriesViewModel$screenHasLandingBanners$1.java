package com.forsale.app.features.categories.normal;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: SubCategoriesViewModel.kt */
@d(c = "com.forsale.app.features.categories.normal.SubCategoriesViewModel$screenHasLandingBanners$1", f = "SubCategoriesViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SubCategoriesViewModel$screenHasLandingBanners$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super Boolean>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31071a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SubCategoriesViewModel$screenHasLandingBanners$1(zz.a<? super SubCategoriesViewModel$screenHasLandingBanners$1> aVar) {
        super(2, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SubCategoriesViewModel$screenHasLandingBanners$1(aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.f();
        if (this.f31071a == 0) {
            f.b(obj);
            return kotlin.coroutines.jvm.internal.a.a(false);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super Boolean> aVar) {
        return ((SubCategoriesViewModel$screenHasLandingBanners$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
