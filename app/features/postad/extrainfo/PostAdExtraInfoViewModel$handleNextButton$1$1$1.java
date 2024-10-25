package com.forsale.app.features.postad.extrainfo;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* compiled from: PostAdExtraInfoViewModel.kt */
@d(c = "com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$handleNextButton$1$1$1", f = "PostAdExtraInfoViewModel.kt", l = {122}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PostAdExtraInfoViewModel$handleNextButton$1$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35525a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdExtraInfoViewModel f35526b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Throwable f35527c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdExtraInfoViewModel$handleNextButton$1$1$1(PostAdExtraInfoViewModel postAdExtraInfoViewModel, Throwable th2, zz.a<? super PostAdExtraInfoViewModel$handleNextButton$1$1$1> aVar) {
        super(2, aVar);
        this.f35526b = postAdExtraInfoViewModel;
        this.f35527c = th2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdExtraInfoViewModel$handleNextButton$1$1$1(this.f35526b, this.f35527c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35525a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            MutableSharedFlow<String> j02 = this.f35526b.j0();
            String V0 = this.f35526b.V0(this.f35527c);
            this.f35525a = 1;
            if (j02.emit(V0, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdExtraInfoViewModel$handleNextButton$1$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
