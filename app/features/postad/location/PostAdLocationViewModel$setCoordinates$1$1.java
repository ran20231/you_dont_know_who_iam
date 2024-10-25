package com.forsale.app.features.postad.location;

import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* compiled from: PostAdLocationViewModel.kt */
@d(c = "com.forsale.app.features.postad.location.PostAdLocationViewModel$setCoordinates$1$1", f = "PostAdLocationViewModel.kt", l = {568}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PostAdLocationViewModel$setCoordinates$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35763a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdLocationViewModel f35764b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdLocationViewModel$setCoordinates$1$1(PostAdLocationViewModel postAdLocationViewModel, zz.a<? super PostAdLocationViewModel$setCoordinates$1$1> aVar) {
        super(2, aVar);
        this.f35764b = postAdLocationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdLocationViewModel$setCoordinates$1$1(this.f35764b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f35763a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            MutableSharedFlow<String> j02 = this.f35764b.j0();
            this.f35763a = 1;
            if (j02.emit("Check your internet connection", this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdLocationViewModel$setCoordinates$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
