package com.forsale.app.features.expiresoon;

import com.forsale.app.utils.OneShotEventHandler;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExpireSoonOptionsViewModel.kt */
@d(c = "com.forsale.app.features.expiresoon.ExpireSoonOptionsViewModel$onBoostClick$1", f = "ExpireSoonOptionsViewModel.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ExpireSoonOptionsViewModel$onBoostClick$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f31287a;

    /* renamed from: b  reason: collision with root package name */
    int f31288b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ExpireSoonOptionsViewModel f31289c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpireSoonOptionsViewModel$onBoostClick$1(ExpireSoonOptionsViewModel expireSoonOptionsViewModel, zz.a<? super ExpireSoonOptionsViewModel$onBoostClick$1> aVar) {
        super(2, aVar);
        this.f31289c = expireSoonOptionsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ExpireSoonOptionsViewModel$onBoostClick$1(this.f31289c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object K0;
        OneShotEventHandler oneShotEventHandler;
        f11 = b.f();
        int i11 = this.f31288b;
        if (i11 != 0) {
            if (i11 == 1) {
                oneShotEventHandler = (OneShotEventHandler) this.f31287a;
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            OneShotEventHandler D0 = this.f31289c.D0();
            ExpireSoonOptionsViewModel expireSoonOptionsViewModel = this.f31289c;
            this.f31287a = D0;
            this.f31288b = 1;
            K0 = expireSoonOptionsViewModel.K0(this);
            if (K0 == f11) {
                return f11;
            }
            oneShotEventHandler = D0;
            obj = K0;
        }
        oneShotEventHandler.i(obj);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ExpireSoonOptionsViewModel$onBoostClick$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
