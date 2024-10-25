package com.forsale.app.features.postad.bundles;

import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* compiled from: PostAdBundlesFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.bundles.PostAdBundlesFragment$registerObservers$2", f = "PostAdBundlesFragment.kt", l = {158}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PostAdBundlesFragment$registerObservers$2 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34985a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdBundlesFragment f34986b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdBundlesFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.bundles.PostAdBundlesFragment$registerObservers$2$1", f = "PostAdBundlesFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.bundles.PostAdBundlesFragment$registerObservers$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<p, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f34987a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PostAdBundlesFragment f34988b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdBundlesFragment postAdBundlesFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f34988b = postAdBundlesFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(p pVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f34988b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f34987a == 0) {
                kotlin.f.b(obj);
                this.f34988b.I().H();
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdBundlesFragment$registerObservers$2(PostAdBundlesFragment postAdBundlesFragment, zz.a<? super PostAdBundlesFragment$registerObservers$2> aVar) {
        super(1, aVar);
        this.f34986b = postAdBundlesFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdBundlesFragment$registerObservers$2(this.f34986b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34985a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            SharedFlow<p> I2 = this.f34986b.H().I2();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f34986b, null);
            this.f34985a = 1;
            if (FlowKt.collectLatest(I2, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdBundlesFragment$registerObservers$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
