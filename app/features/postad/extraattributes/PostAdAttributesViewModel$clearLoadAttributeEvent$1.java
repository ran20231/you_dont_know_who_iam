package com.forsale.app.features.postad.extraattributes;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdAttributesViewModel.kt */
@d(c = "com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel$clearLoadAttributeEvent$1", f = "PostAdAttributesViewModel.kt", l = {294}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdAttributesViewModel$clearLoadAttributeEvent$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35136a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdAttributesViewModel f35137b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdAttributesViewModel$clearLoadAttributeEvent$1(PostAdAttributesViewModel postAdAttributesViewModel, zz.a<? super PostAdAttributesViewModel$clearLoadAttributeEvent$1> aVar) {
        super(2, aVar);
        this.f35137b = postAdAttributesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdAttributesViewModel$clearLoadAttributeEvent$1(this.f35137b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35136a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableStateFlow = this.f35137b.f35122r0;
            this.f35136a = 1;
            if (mutableStateFlow.emit(null, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdAttributesViewModel$clearLoadAttributeEvent$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
