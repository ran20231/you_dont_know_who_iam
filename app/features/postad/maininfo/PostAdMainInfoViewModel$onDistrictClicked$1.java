package com.forsale.app.features.postad.maininfo;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdMainInfoViewModel.kt */
@d(c = "com.forsale.app.features.postad.maininfo.PostAdMainInfoViewModel$onDistrictClicked$1", f = "PostAdMainInfoViewModel.kt", l = {179}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdMainInfoViewModel$onDistrictClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35887a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdMainInfoViewModel f35888b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdMainInfoViewModel$onDistrictClicked$1(PostAdMainInfoViewModel postAdMainInfoViewModel, zz.a<? super PostAdMainInfoViewModel$onDistrictClicked$1> aVar) {
        super(2, aVar);
        this.f35888b = postAdMainInfoViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdMainInfoViewModel$onDistrictClicked$1(this.f35888b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35887a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f35888b.f35868q0;
            wz.p pVar = wz.p.f75480a;
            this.f35887a = 1;
            if (mutableSharedFlow.emit(pVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdMainInfoViewModel$onDistrictClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
