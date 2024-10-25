package com.forsale.app.features.postad;

import com.forsale.app.utils.b0;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel$setActionButtonText$1", f = "PostAdViewModel.kt", l = {591}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdViewModel$setActionButtonText$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34158a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f34159b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PostAdScreens f34160c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ b0 f34161d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdViewModel$setActionButtonText$1(PostAdViewModel postAdViewModel, PostAdScreens postAdScreens, b0 b0Var, zz.a<? super PostAdViewModel$setActionButtonText$1> aVar) {
        super(2, aVar);
        this.f34159b = postAdViewModel;
        this.f34160c = postAdScreens;
        this.f34161d = b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdViewModel$setActionButtonText$1(this.f34159b, this.f34160c, this.f34161d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        b0 F2;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34158a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableStateFlow = this.f34159b.Z1;
            F2 = this.f34159b.F2(this.f34160c, this.f34161d);
            this.f34158a = 1;
            if (mutableStateFlow.emit(F2, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdViewModel$setActionButtonText$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
