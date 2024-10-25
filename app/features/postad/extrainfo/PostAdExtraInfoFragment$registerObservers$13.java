package com.forsale.app.features.postad.extrainfo;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.forsale.app.features.postad.PostAdViewModel;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdExtraInfoFragment.kt */
@d(c = "com.forsale.app.features.postad.extrainfo.PostAdExtraInfoFragment$registerObservers$13", f = "PostAdExtraInfoFragment.kt", l = {130}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdExtraInfoFragment$registerObservers$13 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35445a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdExtraInfoFragment f35446b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdExtraInfoFragment.kt */
    @d(c = "com.forsale.app.features.postad.extrainfo.PostAdExtraInfoFragment$registerObservers$13$1", f = "PostAdExtraInfoFragment.kt", l = {131}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.extrainfo.PostAdExtraInfoFragment$registerObservers$13$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35447a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PostAdExtraInfoFragment f35448b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PostAdExtraInfoFragment.kt */
        @d(c = "com.forsale.app.features.postad.extrainfo.PostAdExtraInfoFragment$registerObservers$13$1$1", f = "PostAdExtraInfoFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.postad.extrainfo.PostAdExtraInfoFragment$registerObservers$13$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C04091 extends SuspendLambda implements p<wz.p, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f35449a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ PostAdExtraInfoFragment f35450b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C04091(PostAdExtraInfoFragment postAdExtraInfoFragment, zz.a<? super C04091> aVar) {
                super(2, aVar);
                this.f35450b = postAdExtraInfoFragment;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(wz.p pVar, zz.a<? super wz.p> aVar) {
                return ((C04091) create(pVar, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                return new C04091(this.f35450b, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.f();
                if (this.f35449a == 0) {
                    f.b(obj);
                    this.f35450b.B().y1();
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdExtraInfoFragment postAdExtraInfoFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f35448b = postAdExtraInfoFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f35448b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            PostAdViewModel e02;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f35447a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                e02 = this.f35448b.e0();
                SharedFlow<wz.p> G2 = e02.G2();
                C04091 c04091 = new C04091(this.f35448b, null);
                this.f35447a = 1;
                if (FlowKt.collectLatest(G2, c04091, this) == f11) {
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
    public PostAdExtraInfoFragment$registerObservers$13(PostAdExtraInfoFragment postAdExtraInfoFragment, zz.a<? super PostAdExtraInfoFragment$registerObservers$13> aVar) {
        super(2, aVar);
        this.f35446b = postAdExtraInfoFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdExtraInfoFragment$registerObservers$13(this.f35446b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35445a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            PostAdExtraInfoFragment postAdExtraInfoFragment = this.f35446b;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(postAdExtraInfoFragment, null);
            this.f35445a = 1;
            if (RepeatOnLifecycleKt.b(postAdExtraInfoFragment, state, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdExtraInfoFragment$registerObservers$13) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
