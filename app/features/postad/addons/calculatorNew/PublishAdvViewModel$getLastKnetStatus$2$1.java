package com.forsale.app.features.postad.addons.calculatorNew;

import com.forsale.app.base.ViewStates;
import com.forsale.app.utils.TypeExtensionsKt;
import g00.p;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* compiled from: PublishAdvViewModel.kt */
@d(c = "com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel$getLastKnetStatus$2$1", f = "PublishAdvViewModel.kt", l = {143, 144}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PublishAdvViewModel$getLastKnetStatus$2$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34628a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PublishAdvViewModel f34629b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Throwable f34630c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublishAdvViewModel$getLastKnetStatus$2$1(PublishAdvViewModel publishAdvViewModel, Throwable th2, zz.a<? super PublishAdvViewModel$getLastKnetStatus$2$1> aVar) {
        super(2, aVar);
        this.f34629b = publishAdvViewModel;
        this.f34630c = th2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PublishAdvViewModel$getLastKnetStatus$2$1(this.f34629b, this.f34630c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        MutableSharedFlow mutableSharedFlow2;
        f11 = b.f();
        int i11 = this.f34628a;
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
            mutableSharedFlow = this.f34629b.f34604j;
            Pair pair = new Pair(ViewStates.CONTENT, null);
            this.f34628a = 1;
            if (mutableSharedFlow.emit(pair, this) == f11) {
                return f11;
            }
        }
        mutableSharedFlow2 = this.f34629b.f34608n;
        String g02 = TypeExtensionsKt.g0(this.f34630c);
        this.f34628a = 2;
        if (mutableSharedFlow2.emit(g02, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PublishAdvViewModel$getLastKnetStatus$2$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
