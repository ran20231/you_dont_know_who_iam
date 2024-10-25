package com.forsale.app.features.categories.home.homelandingscreen;

import com.forsale.app.utils.OneShotEventHandler;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;
import wz.p;
/* compiled from: VerticalFragment.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$onViewCreated$12", f = "VerticalFragment.kt", l = {176}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class VerticalFragment$onViewCreated$12 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23873a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VerticalFragment f23874b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VerticalFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ VerticalFragment f23875a;

        a(VerticalFragment verticalFragment) {
            this.f23875a = verticalFragment;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            VerticalFragment.Q(this.f23875a).R.t1(0);
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalFragment$onViewCreated$12(VerticalFragment verticalFragment, zz.a<? super VerticalFragment$onViewCreated$12> aVar) {
        super(1, aVar);
        this.f23874b = verticalFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new VerticalFragment$onViewCreated$12(this.f23874b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f23873a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            OneShotEventHandler<p> t12 = this.f23874b.B().t1();
            a aVar = new a(this.f23874b);
            this.f23873a = 1;
            if (t12.e(aVar, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((VerticalFragment$onViewCreated$12) create(aVar)).invokeSuspend(p.f75480a);
    }
}
