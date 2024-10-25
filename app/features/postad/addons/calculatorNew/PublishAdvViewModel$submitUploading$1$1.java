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
/* compiled from: PublishAdvViewModel.kt */
@d(c = "com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel$submitUploading$1$1", f = "PublishAdvViewModel.kt", l = {91, 92}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PublishAdvViewModel$submitUploading$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34667a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PublishAdvViewModel f34668b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Throwable f34669c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublishAdvViewModel$submitUploading$1$1(PublishAdvViewModel publishAdvViewModel, Throwable th2, zz.a<? super PublishAdvViewModel$submitUploading$1$1> aVar) {
        super(2, aVar);
        this.f34668b = publishAdvViewModel;
        this.f34669c = th2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PublishAdvViewModel$submitUploading$1$1(this.f34668b, this.f34669c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        MutableSharedFlow mutableSharedFlow2;
        f11 = b.f();
        int i11 = this.f34667a;
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
            mutableSharedFlow = this.f34668b.f34604j;
            Pair pair = new Pair(ViewStates.CONTENT, null);
            this.f34667a = 1;
            if (mutableSharedFlow.emit(pair, this) == f11) {
                return f11;
            }
        }
        mutableSharedFlow2 = this.f34668b.f34606l;
        Throwable th2 = this.f34669c;
        this.f34667a = 2;
        if (mutableSharedFlow2.emit(th2, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PublishAdvViewModel$submitUploading$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
