package com.forsale.app.features.postad.media.mediaScreenViewModel;

import bf.j;
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
@d(c = "com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel$onViewVideo$1", f = "PostAdMediaViewModel.kt", l = {240}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdMediaViewModel$onViewVideo$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36325a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdMediaViewModel f36326b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ VideoItemViewModel f36327c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdMediaViewModel$onViewVideo$1(PostAdMediaViewModel postAdMediaViewModel, VideoItemViewModel videoItemViewModel, a<? super PostAdMediaViewModel$onViewVideo$1> aVar) {
        super(2, aVar);
        this.f36326b = postAdMediaViewModel;
        this.f36327c = videoItemViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new PostAdMediaViewModel$onViewVideo$1(this.f36326b, this.f36327c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = b.f();
        int i11 = this.f36325a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f36326b.f36290s0;
            j jVar = new j(this.f36327c);
            this.f36325a = 1;
            if (mutableSharedFlow.emit(jVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((PostAdMediaViewModel$onViewVideo$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
