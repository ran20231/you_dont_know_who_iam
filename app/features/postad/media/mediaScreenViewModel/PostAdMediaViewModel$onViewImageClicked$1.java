package com.forsale.app.features.postad.media.mediaScreenViewModel;

import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdMediaViewModel.kt */
@d(c = "com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel$onViewImageClicked$1", f = "PostAdMediaViewModel.kt", l = {145}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdMediaViewModel$onViewImageClicked$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36322a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdMediaViewModel f36323b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ bf.a f36324c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdMediaViewModel$onViewImageClicked$1(PostAdMediaViewModel postAdMediaViewModel, bf.a aVar, a<? super PostAdMediaViewModel$onViewImageClicked$1> aVar2) {
        super(2, aVar2);
        this.f36323b = postAdMediaViewModel;
        this.f36324c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new PostAdMediaViewModel$onViewImageClicked$1(this.f36323b, this.f36324c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = b.f();
        int i11 = this.f36322a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f36323b.f36290s0;
            bf.f fVar = new bf.f(this.f36324c);
            this.f36322a = 1;
            if (mutableSharedFlow.emit(fVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((PostAdMediaViewModel$onViewImageClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
