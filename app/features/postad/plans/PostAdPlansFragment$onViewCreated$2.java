package com.forsale.app.features.postad.plans;

import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.plans.a;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* compiled from: PostAdPlansFragment.kt */
@d(c = "com.forsale.app.features.postad.plans.PostAdPlansFragment$onViewCreated$2", f = "PostAdPlansFragment.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PostAdPlansFragment$onViewCreated$2 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36362a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdPlansFragment f36363b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdPlansFragment.kt */
    @d(c = "com.forsale.app.features.postad.plans.PostAdPlansFragment$onViewCreated$2$1", f = "PostAdPlansFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.plans.PostAdPlansFragment$onViewCreated$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<p, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f36364a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PostAdPlansFragment f36365b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdPlansFragment postAdPlansFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f36365b = postAdPlansFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(p pVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f36365b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f36364a == 0) {
                f.b(obj);
                androidx.navigation.fragment.a.a(this.f36365b).d0(a.b.b(a.f36389a, null, null, 3, null));
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdPlansFragment$onViewCreated$2(PostAdPlansFragment postAdPlansFragment, zz.a<? super PostAdPlansFragment$onViewCreated$2> aVar) {
        super(1, aVar);
        this.f36363b = postAdPlansFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdPlansFragment$onViewCreated$2(this.f36363b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        PostAdViewModel Y;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36362a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            Y = this.f36363b.Y();
            SharedFlow<p> u22 = Y.u2();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f36363b, null);
            this.f36362a = 1;
            if (FlowKt.collectLatest(u22, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdPlansFragment$onViewCreated$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
