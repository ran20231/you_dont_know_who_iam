package com.forsale.app.features.postad.addons;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.s;
import com.forsale.app.features.postad.PostAdViewModel;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdAddonsFragment.kt */
@d(c = "com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$13", f = "PostAdAddonsFragment.kt", l = {268}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdAddonsFragment$setupBinding$13 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34244a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdAddonsFragment f34245b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdAddonsFragment.kt */
    @d(c = "com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$13$1", f = "PostAdAddonsFragment.kt", l = {269}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$13$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f34246a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PostAdAddonsFragment f34247b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PostAdAddonsFragment.kt */
        @d(c = "com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$13$1$1", f = "PostAdAddonsFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$13$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C03731 extends SuspendLambda implements p<Throwable, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f34248a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f34249b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ PostAdAddonsFragment f34250c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03731(PostAdAddonsFragment postAdAddonsFragment, zz.a<? super C03731> aVar) {
                super(2, aVar);
                this.f34250c = postAdAddonsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                C03731 c03731 = new C03731(this.f34250c, aVar);
                c03731.f34249b = obj;
                return c03731;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.f();
                if (this.f34248a == 0) {
                    f.b(obj);
                    Throwable th2 = (Throwable) this.f34249b;
                    if (th2 != null) {
                        this.f34250c.B().G1(th2);
                    }
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // g00.p
            public final Object invoke(Throwable th2, zz.a<? super wz.p> aVar) {
                return ((C03731) create(th2, aVar)).invokeSuspend(wz.p.f75480a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdAddonsFragment postAdAddonsFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f34247b = postAdAddonsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f34247b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            PostAdViewModel i02;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f34246a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                i02 = this.f34247b.i0();
                SharedFlow<Throwable> T = i02.N2().T();
                C03731 c03731 = new C03731(this.f34247b, null);
                this.f34246a = 1;
                if (FlowKt.collectLatest(T, c03731, this) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdAddonsFragment$setupBinding$13(PostAdAddonsFragment postAdAddonsFragment, zz.a<? super PostAdAddonsFragment$setupBinding$13> aVar) {
        super(2, aVar);
        this.f34245b = postAdAddonsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdAddonsFragment$setupBinding$13(this.f34245b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34244a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            s viewLifecycleOwner = this.f34245b.getViewLifecycleOwner();
            o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f34245b, null);
            this.f34244a = 1;
            if (RepeatOnLifecycleKt.b(viewLifecycleOwner, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdAddonsFragment$setupBinding$13) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
