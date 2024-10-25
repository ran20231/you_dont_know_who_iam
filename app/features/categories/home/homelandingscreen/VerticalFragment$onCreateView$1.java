package com.forsale.app.features.categories.home.homelandingscreen;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: VerticalFragment.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$onCreateView$1", f = "VerticalFragment.kt", l = {207}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class VerticalFragment$onCreateView$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23846a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VerticalFragment f23847b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalFragment$onCreateView$1(VerticalFragment verticalFragment, zz.a<? super VerticalFragment$onCreateView$1> aVar) {
        super(2, aVar);
        this.f23847b = verticalFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new VerticalFragment$onCreateView$1(this.f23847b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ij.a aVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f23846a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            com.forsale.app.utils.popUpsPrioritizer.a invoke = com.forsale.app.utils.popUpsPrioritizer.a.f40401a.invoke();
            aVar = this.f23847b.J;
            if (aVar == null) {
                o.w("isHomeLoadingCapsule");
                aVar = null;
            }
            this.f23846a = 1;
            if (invoke.b(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((VerticalFragment$onCreateView$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
