package com.forsale.app.features.categories.home.homelandingscreen;

import g00.l;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* compiled from: VerticalFragment.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$onCreateView$4", f = "VerticalFragment.kt", l = {219}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class VerticalFragment$onCreateView$4 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23854a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VerticalFragment f23855b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VerticalFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VerticalFragment f23856a;

        a(VerticalFragment verticalFragment) {
            this.f23856a = verticalFragment;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            ij.a aVar2;
            Object f11;
            com.forsale.app.utils.popUpsPrioritizer.a invoke = com.forsale.app.utils.popUpsPrioritizer.a.f40401a.invoke();
            aVar2 = this.f23856a.J;
            if (aVar2 == null) {
                o.w("isHomeLoadingCapsule");
                aVar2 = null;
            }
            Object a11 = invoke.a(aVar2, aVar);
            f11 = kotlin.coroutines.intrinsics.b.f();
            if (a11 == f11) {
                return a11;
            }
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalFragment$onCreateView$4(VerticalFragment verticalFragment, zz.a<? super VerticalFragment$onCreateView$4> aVar) {
        super(1, aVar);
        this.f23855b = verticalFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new VerticalFragment$onCreateView$4(this.f23855b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f23854a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            SharedFlow<p> k12 = this.f23855b.B().k1();
            a aVar = new a(this.f23855b);
            this.f23854a = 1;
            if (k12.collect(aVar, this) == f11) {
                return f11;
            }
        }
        throw new KotlinNothingValueException();
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((VerticalFragment$onCreateView$4) create(aVar)).invokeSuspend(p.f75480a);
    }
}
