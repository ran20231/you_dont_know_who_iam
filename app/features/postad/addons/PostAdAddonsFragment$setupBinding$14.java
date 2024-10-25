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
@d(c = "com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$14", f = "PostAdAddonsFragment.kt", l = {278}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdAddonsFragment$setupBinding$14 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34251a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdAddonsFragment f34252b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdAddonsFragment.kt */
    @d(c = "com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$14$1", f = "PostAdAddonsFragment.kt", l = {279}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$14$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f34253a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PostAdAddonsFragment f34254b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PostAdAddonsFragment.kt */
        @d(c = "com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$14$1$1", f = "PostAdAddonsFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$14$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C03741 extends SuspendLambda implements p<String, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f34255a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f34256b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ PostAdAddonsFragment f34257c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03741(PostAdAddonsFragment postAdAddonsFragment, zz.a<? super C03741> aVar) {
                super(2, aVar);
                this.f34257c = postAdAddonsFragment;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(String str, zz.a<? super wz.p> aVar) {
                return ((C03741) create(str, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                C03741 c03741 = new C03741(this.f34257c, aVar);
                c03741.f34256b = obj;
                return c03741;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.f();
                if (this.f34255a == 0) {
                    f.b(obj);
                    this.f34257c.B().H1((String) this.f34256b);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdAddonsFragment postAdAddonsFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f34254b = postAdAddonsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f34254b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            PostAdViewModel i02;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f34253a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                i02 = this.f34254b.i0();
                SharedFlow<String> W = i02.N2().W();
                C03741 c03741 = new C03741(this.f34254b, null);
                this.f34253a = 1;
                if (FlowKt.collectLatest(W, c03741, this) == f11) {
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
    public PostAdAddonsFragment$setupBinding$14(PostAdAddonsFragment postAdAddonsFragment, zz.a<? super PostAdAddonsFragment$setupBinding$14> aVar) {
        super(2, aVar);
        this.f34252b = postAdAddonsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdAddonsFragment$setupBinding$14(this.f34252b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34251a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            s viewLifecycleOwner = this.f34252b.getViewLifecycleOwner();
            o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f34252b, null);
            this.f34251a = 1;
            if (RepeatOnLifecycleKt.b(viewLifecycleOwner, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdAddonsFragment$setupBinding$14) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
