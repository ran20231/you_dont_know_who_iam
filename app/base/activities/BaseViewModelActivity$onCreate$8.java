package com.forsale.app.base.activities;

import androidx.activity.ComponentActivity;
import com.forsale.app.utils.ViewsExtensionsKt;
import g00.l;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseViewModelActivity.kt */
@d(c = "com.forsale.app.base.activities.BaseViewModelActivity$onCreate$8", f = "BaseViewModelActivity.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BaseViewModelActivity$onCreate$8 extends SuspendLambda implements l<a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22113a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BaseViewModelActivity<B, VM> f22114b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseViewModelActivity.kt */
    @d(c = "com.forsale.app.base.activities.BaseViewModelActivity$onCreate$8$1", f = "BaseViewModelActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.base.activities.BaseViewModelActivity$onCreate$8$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<Pair<? extends Integer, ? extends Pair<? extends g00.a<? extends p>, ? extends g00.a<? extends p>>>, a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f22115a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f22116b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BaseViewModelActivity<B, VM> f22117c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(BaseViewModelActivity<? extends B, ? extends VM> baseViewModelActivity, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f22117c = baseViewModelActivity;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(Pair<Integer, ? extends Pair<? extends g00.a<p>, ? extends g00.a<p>>> pair, a<? super p> aVar) {
            return ((AnonymousClass1) create(pair, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<p> create(Object obj, a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f22117c, aVar);
            anonymousClass1.f22116b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f22115a == 0) {
                f.b(obj);
                Pair pair = (Pair) this.f22116b;
                if (pair != null) {
                    ComponentActivity componentActivity = this.f22117c;
                    String string = componentActivity.getString(((Number) pair.c()).intValue());
                    o.h(string, "getString(...)");
                    ViewsExtensionsKt.K(componentActivity, "", string, (g00.a) ((Pair) pair.d()).c(), (g00.a) ((Pair) pair.d()).d());
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseViewModelActivity$onCreate$8(BaseViewModelActivity<? extends B, ? extends VM> baseViewModelActivity, a<? super BaseViewModelActivity$onCreate$8> aVar) {
        super(1, aVar);
        this.f22114b = baseViewModelActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(a<?> aVar) {
        return new BaseViewModelActivity$onCreate$8(this.f22114b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f22113a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<Pair<Integer, Pair<g00.a<p>, g00.a<p>>>> S = this.f22114b.x0().S();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f22114b, null);
            this.f22113a = 1;
            if (FlowKt.collectLatest(S, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(a<? super p> aVar) {
        return ((BaseViewModelActivity$onCreate$8) create(aVar)).invokeSuspend(p.f75480a);
    }
}
