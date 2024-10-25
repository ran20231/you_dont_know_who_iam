package com.forsale.app.features.postad.location;

import androidx.lifecycle.b0;
import g00.p;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdLocationViewModel.kt */
@d(c = "com.forsale.app.features.postad.location.PostAdLocationViewModel$removeLandMark$3$1", f = "PostAdLocationViewModel.kt", l = {694}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdLocationViewModel$removeLandMark$3$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35749a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdLocationViewModel f35750b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<String> f35751c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdLocationViewModel$removeLandMark$3$1(PostAdLocationViewModel postAdLocationViewModel, List<String> list, zz.a<? super PostAdLocationViewModel$removeLandMark$3$1> aVar) {
        super(2, aVar);
        this.f35750b = postAdLocationViewModel;
        this.f35751c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdLocationViewModel$removeLandMark$3$1(this.f35750b, this.f35751c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        b0 b0Var;
        b0 b0Var2;
        f11 = b.f();
        int i11 = this.f35749a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f35750b.f35689q1;
            List<String> list = this.f35751c;
            this.f35749a = 1;
            if (mutableSharedFlow.emit(list, this) == f11) {
                return f11;
            }
        }
        b0Var = this.f35750b.f35674i1;
        b0Var2 = this.f35750b.f35674i1;
        b0Var.postValue(b0Var2.getValue());
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdLocationViewModel$removeLandMark$3$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
