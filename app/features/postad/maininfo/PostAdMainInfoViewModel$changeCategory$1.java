package com.forsale.app.features.postad.maininfo;

import com.forsale.app.features.postad.PostAdViewModel;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdMainInfoViewModel.kt */
@d(c = "com.forsale.app.features.postad.maininfo.PostAdMainInfoViewModel$changeCategory$1", f = "PostAdMainInfoViewModel.kt", l = {193, 196}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdMainInfoViewModel$changeCategory$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35878a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdMainInfoViewModel f35879b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdMainInfoViewModel$changeCategory$1(PostAdMainInfoViewModel postAdMainInfoViewModel, zz.a<? super PostAdMainInfoViewModel$changeCategory$1> aVar) {
        super(2, aVar);
        this.f35879b = postAdMainInfoViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdMainInfoViewModel$changeCategory$1(this.f35879b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35878a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            PostAdViewModel O0 = this.f35879b.O0();
            this.f35878a = 1;
            obj = O0.Z1(this);
            if (obj == f11) {
                return f11;
            }
        }
        if (obj != null) {
            this.f35879b.J0();
        } else {
            PostAdMainInfoViewModel postAdMainInfoViewModel = this.f35879b;
            postAdMainInfoViewModel.c1(postAdMainInfoViewModel.O0().S1());
            mutableSharedFlow = this.f35879b.A0;
            wz.p pVar = wz.p.f75480a;
            this.f35878a = 2;
            if (mutableSharedFlow.emit(pVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdMainInfoViewModel$changeCategory$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
