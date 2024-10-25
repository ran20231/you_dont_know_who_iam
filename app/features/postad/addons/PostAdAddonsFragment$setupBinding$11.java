package com.forsale.app.features.postad.addons;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.s;
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
@d(c = "com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$11", f = "PostAdAddonsFragment.kt", l = {251}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdAddonsFragment$setupBinding$11 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34231a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdAddonsFragment f34232b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdAddonsFragment.kt */
    @d(c = "com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$11$1", f = "PostAdAddonsFragment.kt", l = {252}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$11$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f34233a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PostAdAddonsFragment f34234b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PostAdAddonsFragment.kt */
        @d(c = "com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$11$1$1", f = "PostAdAddonsFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$11$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C03711 extends SuspendLambda implements p<wz.p, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f34235a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ PostAdAddonsFragment f34236b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03711(PostAdAddonsFragment postAdAddonsFragment, zz.a<? super C03711> aVar) {
                super(2, aVar);
                this.f34236b = postAdAddonsFragment;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(wz.p pVar, zz.a<? super wz.p> aVar) {
                return ((C03711) create(pVar, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                return new C03711(this.f34236b, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int e02;
                kotlin.coroutines.intrinsics.b.f();
                if (this.f34235a == 0) {
                    f.b(obj);
                    PostAdAddonsViewModel B = this.f34236b.B();
                    e02 = this.f34236b.e0();
                    if (B.v1(e02)) {
                        androidx.navigation.fragment.a.a(this.f34236b).d0(a.f34409a.b());
                    }
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdAddonsFragment postAdAddonsFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f34234b = postAdAddonsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f34234b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f34233a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                SharedFlow<wz.p> d12 = this.f34234b.B().d1();
                C03711 c03711 = new C03711(this.f34234b, null);
                this.f34233a = 1;
                if (FlowKt.collectLatest(d12, c03711, this) == f11) {
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
    public PostAdAddonsFragment$setupBinding$11(PostAdAddonsFragment postAdAddonsFragment, zz.a<? super PostAdAddonsFragment$setupBinding$11> aVar) {
        super(2, aVar);
        this.f34232b = postAdAddonsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdAddonsFragment$setupBinding$11(this.f34232b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34231a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            s viewLifecycleOwner = this.f34232b.getViewLifecycleOwner();
            o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f34232b, null);
            this.f34231a = 1;
            if (RepeatOnLifecycleKt.b(viewLifecycleOwner, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdAddonsFragment$setupBinding$11) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
