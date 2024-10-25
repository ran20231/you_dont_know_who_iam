package com.forsale.app.features.postad.plans;

import com.forsale.app.features.postad.PostAdViewModel;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* compiled from: PostAdPlansFragment.kt */
@d(c = "com.forsale.app.features.postad.plans.PostAdPlansFragment$onViewCreated$3", f = "PostAdPlansFragment.kt", l = {58}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PostAdPlansFragment$onViewCreated$3 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36366a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdPlansFragment f36367b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdPlansFragment.kt */
    @d(c = "com.forsale.app.features.postad.plans.PostAdPlansFragment$onViewCreated$3$1", f = "PostAdPlansFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.plans.PostAdPlansFragment$onViewCreated$3$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<p, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f36368a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PostAdPlansFragment f36369b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdPlansFragment postAdPlansFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f36369b = postAdPlansFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(p pVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f36369b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f36368a == 0) {
                f.b(obj);
                this.f36369b.B().L0();
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdPlansFragment$onViewCreated$3(PostAdPlansFragment postAdPlansFragment, zz.a<? super PostAdPlansFragment$onViewCreated$3> aVar) {
        super(1, aVar);
        this.f36367b = postAdPlansFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdPlansFragment$onViewCreated$3(this.f36367b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        PostAdViewModel Y;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36366a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            Y = this.f36367b.Y();
            SharedFlow<p> G2 = Y.G2();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f36367b, null);
            this.f36366a = 1;
            if (FlowKt.collectLatest(G2, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdPlansFragment$onViewCreated$3) create(aVar)).invokeSuspend(p.f75480a);
    }
}
