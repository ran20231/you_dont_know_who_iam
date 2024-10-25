package com.forsale.app.features.postad;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel$isMediaFailedBeforeUpload$1", f = "PostAdViewModel.kt", l = {474}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdViewModel$isMediaFailedBeforeUpload$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34050a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f34051b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdViewModel$isMediaFailedBeforeUpload$1(PostAdViewModel postAdViewModel, zz.a<? super PostAdViewModel$isMediaFailedBeforeUpload$1> aVar) {
        super(2, aVar);
        this.f34051b = postAdViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdViewModel$isMediaFailedBeforeUpload$1(this.f34051b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34050a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            MutableSharedFlow<Boolean> e32 = this.f34051b.e3();
            Boolean a11 = kotlin.coroutines.jvm.internal.a.a(true);
            this.f34050a = 1;
            if (e32.emit(a11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdViewModel$isMediaFailedBeforeUpload$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
