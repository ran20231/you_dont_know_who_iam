package com.forsale.app.features.postad.bundles;

import com.forsale.app.datalayer.repositories.RegionsRepository;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdBundlesViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.bundles.PostAdBundlesViewModel$getCurrency$1", f = "PostAdBundlesViewModel.kt", l = {71, 71}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdBundlesViewModel$getCurrency$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f35028a;

    /* renamed from: b  reason: collision with root package name */
    int f35029b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PostAdBundlesViewModel f35030c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdBundlesViewModel$getCurrency$1(PostAdBundlesViewModel postAdBundlesViewModel, zz.a<? super PostAdBundlesViewModel$getCurrency$1> aVar) {
        super(2, aVar);
        this.f35030c = postAdBundlesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdBundlesViewModel$getCurrency$1(this.f35030c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        RegionsRepository regionsRepository;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35029b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableStateFlow = (MutableStateFlow) this.f35028a;
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            mutableStateFlow = this.f35030c.B;
            regionsRepository = this.f35030c.f35006c;
            this.f35028a = mutableStateFlow;
            this.f35029b = 1;
            obj = regionsRepository.getCurrencyName(this);
            if (obj == f11) {
                return f11;
            }
        }
        this.f35028a = null;
        this.f35029b = 2;
        if (mutableStateFlow.emit(obj, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdBundlesViewModel$getCurrency$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
