package com.forsale.app.features.postad.addons.calculatorNew;

import com.forsale.app.base.ViewStates;
import g00.p;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import t9.y0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PublishAdvViewModel.kt */
@d(c = "com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel$getLastKnetStatus$1", f = "PublishAdvViewModel.kt", l = {138}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PublishAdvViewModel$getLastKnetStatus$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34626a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PublishAdvViewModel f34627b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublishAdvViewModel$getLastKnetStatus$1(PublishAdvViewModel publishAdvViewModel, zz.a<? super PublishAdvViewModel$getLastKnetStatus$1> aVar) {
        super(2, aVar);
        this.f34627b = publishAdvViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PublishAdvViewModel$getLastKnetStatus$1(this.f34627b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = b.f();
        int i11 = this.f34626a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f34627b.f34604j;
            Pair pair = new Pair(ViewStates.LOADING, kotlin.coroutines.jvm.internal.a.d(y0.Q3));
            this.f34626a = 1;
            if (mutableSharedFlow.emit(pair, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PublishAdvViewModel$getLastKnetStatus$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
