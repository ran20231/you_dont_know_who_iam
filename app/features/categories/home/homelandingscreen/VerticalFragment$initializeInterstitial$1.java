package com.forsale.app.features.categories.home.homelandingscreen;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerticalFragment.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$initializeInterstitial$1", f = "VerticalFragment.kt", l = {228}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class VerticalFragment$initializeInterstitial$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23844a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VerticalFragment f23845b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalFragment$initializeInterstitial$1(VerticalFragment verticalFragment, zz.a<? super VerticalFragment$initializeInterstitial$1> aVar) {
        super(2, aVar);
        this.f23845b = verticalFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new VerticalFragment$initializeInterstitial$1(this.f23845b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ij.a aVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f23844a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            com.forsale.app.utils.popUpsPrioritizer.a invoke = com.forsale.app.utils.popUpsPrioritizer.a.f40401a.invoke();
            aVar = this.f23845b.I;
            if (aVar == null) {
                o.w("interstitialsCapsule");
                aVar = null;
            }
            this.f23844a = 1;
            if (invoke.b(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((VerticalFragment$initializeInterstitial$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
