package com.forsale.app.features.postad.addons;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.s;
import com.forsale.app.features.postad.PostAdScreens;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.utils.b0;
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
@d(c = "com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$9", f = "PostAdAddonsFragment.kt", l = {233}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdAddonsFragment$setupBinding$9 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34312a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdAddonsFragment f34313b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdAddonsFragment.kt */
    @d(c = "com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$9$1", f = "PostAdAddonsFragment.kt", l = {236}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$9$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f34314a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PostAdAddonsFragment f34315b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PostAdAddonsFragment.kt */
        @d(c = "com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$9$1$1", f = "PostAdAddonsFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$9$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C03811 extends SuspendLambda implements p<b0, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f34316a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f34317b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ PostAdAddonsFragment f34318c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03811(PostAdAddonsFragment postAdAddonsFragment, zz.a<? super C03811> aVar) {
                super(2, aVar);
                this.f34318c = postAdAddonsFragment;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(b0 b0Var, zz.a<? super wz.p> aVar) {
                return ((C03811) create(b0Var, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                C03811 c03811 = new C03811(this.f34318c, aVar);
                c03811.f34317b = obj;
                return c03811;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                PostAdViewModel i02;
                kotlin.coroutines.intrinsics.b.f();
                if (this.f34316a == 0) {
                    f.b(obj);
                    i02 = this.f34318c.i0();
                    i02.v4(PostAdScreens.ADDONS_SCREEN, (b0) this.f34317b);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdAddonsFragment postAdAddonsFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f34315b = postAdAddonsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f34315b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            PostAdViewModel i02;
            PostAdViewModel i03;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f34314a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                i02 = this.f34315b.i0();
                i02.v4(PostAdScreens.ADDONS_SCREEN, null);
                i03 = this.f34315b.i0();
                SharedFlow<b0> f12 = i03.b2().f();
                C03811 c03811 = new C03811(this.f34315b, null);
                this.f34314a = 1;
                if (FlowKt.collectLatest(f12, c03811, this) == f11) {
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
    public PostAdAddonsFragment$setupBinding$9(PostAdAddonsFragment postAdAddonsFragment, zz.a<? super PostAdAddonsFragment$setupBinding$9> aVar) {
        super(2, aVar);
        this.f34313b = postAdAddonsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdAddonsFragment$setupBinding$9(this.f34313b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34312a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            s viewLifecycleOwner = this.f34313b.getViewLifecycleOwner();
            o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f34313b, null);
            this.f34312a = 1;
            if (RepeatOnLifecycleKt.b(viewLifecycleOwner, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdAddonsFragment$setupBinding$9) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
