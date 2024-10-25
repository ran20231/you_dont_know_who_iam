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
@d(c = "com.forsale.app.features.expiresoon.ExpireSoonOptionsViewModel$onRepostClick$1", f = "ExpireSoonOptionsViewModel.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ExpireSoonOptionsViewModel$onRepostClick$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f31290a;

    /* renamed from: b  reason: collision with root package name */
    int f31291b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ExpireSoonOptionsViewModel f31292c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpireSoonOptionsViewModel$onRepostClick$1(ExpireSoonOptionsViewModel expireSoonOptionsViewModel, zz.a<? super ExpireSoonOptionsViewModel$onRepostClick$1> aVar) {
        super(2, aVar);
        this.f31292c = expireSoonOptionsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ExpireSoonOptionsViewModel$onRepostClick$1(this.f31292c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object K0;
        OneShotEventHandler oneShotEventHandler;
        f11 = b.f();
        int i11 = this.f31291b;
        if (i11 != 0) {
            if (i11 == 1) {
                oneShotEventHandler = (OneShotEventHandler) this.f31290a;
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            OneShotEventHandler L0 = this.f31292c.L0();
            ExpireSoonOptionsViewModel expireSoonOptionsViewModel = this.f31292c;
            this.f31290a = L0;
            this.f31291b = 1;
            K0 = expireSoonOptionsViewModel.K0(this);
            if (K0 == f11) {
                return f11;
            }
            oneShotEventHandler = L0;
            obj = K0;
        }
        oneShotEventHandler.i(obj);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ExpireSoonOptionsViewModel$onRepostClick$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
