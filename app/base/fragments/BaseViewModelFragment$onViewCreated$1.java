package com.forsale.app.base.fragments;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseViewModelFragment.kt */
@d(c = "com.forsale.app.base.fragments.BaseViewModelFragment$onViewCreated$1", f = "BaseViewModelFragment.kt", l = {161}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BaseViewModelFragment$onViewCreated$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22203a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BaseViewModelFragment<B, VM> f22204b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseViewModelFragment$onViewCreated$1(BaseViewModelFragment<B, ? extends VM> baseViewModelFragment, zz.a<? super BaseViewModelFragment$onViewCreated$1> aVar) {
        super(2, aVar);
        this.f22204b = baseViewModelFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new BaseViewModelFragment$onViewCreated$1(this.f22204b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ij.a aVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f22203a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            com.forsale.app.utils.popUpsPrioritizer.a invoke = com.forsale.app.utils.popUpsPrioritizer.a.f40401a.invoke();
            aVar = ((BaseViewModelFragment) this.f22204b).f22132h;
            if (aVar == null) {
                o.w("expireSoonCapsule");
                aVar = null;
            }
            this.f22203a = 1;
            if (invoke.b(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((BaseViewModelFragment$onViewCreated$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}