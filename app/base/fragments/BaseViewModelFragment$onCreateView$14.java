package com.forsale.app.base.fragments;

import android.content.Context;
import com.forsale.app.utils.ViewsExtensionsKt;
import g00.l;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseViewModelFragment.kt */
@d(c = "com.forsale.app.base.fragments.BaseViewModelFragment$onCreateView$14", f = "BaseViewModelFragment.kt", l = {139}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BaseViewModelFragment$onCreateView$14 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22155a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BaseViewModelFragment<B, VM> f22156b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseViewModelFragment.kt */
    @d(c = "com.forsale.app.base.fragments.BaseViewModelFragment$onCreateView$14$1", f = "BaseViewModelFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.base.fragments.BaseViewModelFragment$onCreateView$14$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<Pair<? extends Integer, ? extends Pair<? extends g00.a<? extends p>, ? extends g00.a<? extends p>>>, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f22157a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f22158b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BaseViewModelFragment<B, VM> f22159c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(BaseViewModelFragment<B, ? extends VM> baseViewModelFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f22159c = baseViewModelFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(Pair<Integer, ? extends Pair<? extends g00.a<p>, ? extends g00.a<p>>> pair, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pair, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f22159c, aVar);
            anonymousClass1.f22158b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Context context;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f22157a == 0) {
                f.b(obj);
                Pair pair = (Pair) this.f22158b;
                if (pair != null && (context = this.f22159c.getContext()) != null) {
                    String string = this.f22159c.getString(((Number) pair.c()).intValue());
                    o.h(string, "getString(...)");
                    ViewsExtensionsKt.K(context, "", string, (g00.a) ((Pair) pair.d()).c(), (g00.a) ((Pair) pair.d()).d());
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BaseViewModelFragment$onCreateView$14(BaseViewModelFragment<B, ? extends VM> baseViewModelFragment, zz.a<? super BaseViewModelFragment$onCreateView$14> aVar) {
        super(1, aVar);
        this.f22156b = baseViewModelFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new BaseViewModelFragment$onCreateView$14(this.f22156b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f22155a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<Pair<Integer, Pair<g00.a<p>, g00.a<p>>>> S = this.f22156b.B().S();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f22156b, null);
            this.f22155a = 1;
            if (FlowKt.collectLatest(S, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((BaseViewModelFragment$onCreateView$14) create(aVar)).invokeSuspend(p.f75480a);
    }
}
