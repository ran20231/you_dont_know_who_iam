package com.forsale.app.features.postad.media.mediaScreenViewModel;

import bf.i;
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
@d(c = "com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel$updateOriginalList$4", f = "PostAdMediaViewModel.kt", l = {330}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdMediaViewModel$updateOriginalList$4 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36330a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdMediaViewModel f36331b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdMediaViewModel$updateOriginalList$4(PostAdMediaViewModel postAdMediaViewModel, a<? super PostAdMediaViewModel$updateOriginalList$4> aVar) {
        super(2, aVar);
        this.f36331b = postAdMediaViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new PostAdMediaViewModel$updateOriginalList$4(this.f36331b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = b.f();
        int i11 = this.f36330a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f36331b.f36290s0;
            i iVar = i.f16349a;
            this.f36330a = 1;
            if (mutableSharedFlow.emit(iVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((PostAdMediaViewModel$updateOriginalList$4) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
