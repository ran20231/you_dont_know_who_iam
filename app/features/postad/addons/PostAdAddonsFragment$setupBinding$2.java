package com.forsale.app.features.postad.addons;

import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdAddonsFragment.kt */
@d(c = "com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$2", f = "PostAdAddonsFragment.kt", l = {174}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdAddonsFragment$setupBinding$2 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34277a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdAddonsFragment f34278b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdAddonsFragment.kt */
    @d(c = "com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$2$1", f = "PostAdAddonsFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.addons.PostAdAddonsFragment$setupBinding$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<p, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f34279a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PostAdAddonsFragment f34280b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdAddonsFragment postAdAddonsFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f34280b = postAdAddonsFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(p pVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f34280b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            lr.a aVar;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f34279a == 0) {
                f.b(obj);
                aVar = this.f34280b.O;
                aVar.A(ji.a.f60530j.a());
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdAddonsFragment$setupBinding$2(PostAdAddonsFragment postAdAddonsFragment, zz.a<? super PostAdAddonsFragment$setupBinding$2> aVar) {
        super(1, aVar);
        this.f34278b = postAdAddonsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdAddonsFragment$setupBinding$2(this.f34278b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34277a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<p> Y0 = this.f34278b.B().Y0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f34278b, null);
            this.f34277a = 1;
            if (FlowKt.collectLatest(Y0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdAddonsFragment$setupBinding$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
