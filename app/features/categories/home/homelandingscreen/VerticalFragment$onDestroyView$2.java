package com.forsale.app.features.categories.home.homelandingscreen;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: VerticalFragment.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$onDestroyView$2", f = "VerticalFragment.kt", l = {285, 286}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class VerticalFragment$onDestroyView$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23857a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VerticalFragment f23858b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalFragment$onDestroyView$2(VerticalFragment verticalFragment, zz.a<? super VerticalFragment$onDestroyView$2> aVar) {
        super(2, aVar);
        this.f23858b = verticalFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new VerticalFragment$onDestroyView$2(this.f23858b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ij.a aVar;
        ij.a aVar2;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f23857a;
        ij.a aVar3 = null;
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
            com.forsale.app.utils.popUpsPrioritizer.a invoke = com.forsale.app.utils.popUpsPrioritizer.a.f40401a.invoke();
            aVar = this.f23858b.I;
            if (aVar == null) {
                o.w("interstitialsCapsule");
                aVar = null;
            }
            this.f23857a = 1;
            if (invoke.a(aVar, this) == f11) {
                return f11;
            }
        }
        com.forsale.app.utils.popUpsPrioritizer.a invoke2 = com.forsale.app.utils.popUpsPrioritizer.a.f40401a.invoke();
        aVar2 = this.f23858b.J;
        if (aVar2 == null) {
            o.w("isHomeLoadingCapsule");
        } else {
            aVar3 = aVar2;
        }
        this.f23857a = 2;
        if (invoke2.a(aVar3, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((VerticalFragment$onDestroyView$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
