package com.forsale.app.features.postad.media.mediaScreenViewModel;

import bf.c;
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
@d(c = "com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel$onEditImageClicked$1", f = "PostAdMediaViewModel.kt", l = {166}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdMediaViewModel$onEditImageClicked$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36319a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdMediaViewModel f36320b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ bf.a f36321c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdMediaViewModel$onEditImageClicked$1(PostAdMediaViewModel postAdMediaViewModel, bf.a aVar, a<? super PostAdMediaViewModel$onEditImageClicked$1> aVar2) {
        super(2, aVar2);
        this.f36320b = postAdMediaViewModel;
        this.f36321c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new PostAdMediaViewModel$onEditImageClicked$1(this.f36320b, this.f36321c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = b.f();
        int i11 = this.f36319a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            this.f36320b.e1(this.f36321c);
            mutableSharedFlow = this.f36320b.f36290s0;
            c cVar = new c(this.f36321c);
            this.f36319a = 1;
            if (mutableSharedFlow.emit(cVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((PostAdMediaViewModel$onEditImageClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
