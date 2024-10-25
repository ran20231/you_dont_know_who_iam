package com.forsale.app.features.postad.extraattributes;

import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* compiled from: PostAdAttributesFragment.kt */
@d(c = "com.forsale.app.features.postad.extraattributes.PostAdAttributesFragment$onViewCreated$3", f = "PostAdAttributesFragment.kt", l = {77}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PostAdAttributesFragment$onViewCreated$3 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35105a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdAttributesFragment f35106b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdAttributesFragment.kt */
    @d(c = "com.forsale.app.features.postad.extraattributes.PostAdAttributesFragment$onViewCreated$3$1", f = "PostAdAttributesFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.extraattributes.PostAdAttributesFragment$onViewCreated$3$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<p, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35107a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PostAdAttributesFragment f35108b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdAttributesFragment postAdAttributesFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f35108b = postAdAttributesFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(p pVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f35108b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f35107a == 0) {
                f.b(obj);
                PostAdAttributesFragment.S(this.f35108b).O.C1(0);
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdAttributesFragment$onViewCreated$3(PostAdAttributesFragment postAdAttributesFragment, zz.a<? super PostAdAttributesFragment$onViewCreated$3> aVar) {
        super(1, aVar);
        this.f35106b = postAdAttributesFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdAttributesFragment$onViewCreated$3(this.f35106b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35105a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<p> Q0 = this.f35106b.B().Q0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35106b, null);
            this.f35105a = 1;
            if (FlowKt.collectLatest(Q0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdAttributesFragment$onViewCreated$3) create(aVar)).invokeSuspend(p.f75480a);
    }
}
