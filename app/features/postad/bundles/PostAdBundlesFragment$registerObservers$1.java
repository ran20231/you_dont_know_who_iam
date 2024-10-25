package com.forsale.app.features.postad.bundles;

import com.forsale.app.features.postad.addons.PostAdDialoguesUtilsKt;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* compiled from: PostAdBundlesFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.bundles.PostAdBundlesFragment$registerObservers$1", f = "PostAdBundlesFragment.kt", l = {151}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PostAdBundlesFragment$registerObservers$1 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34980a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdBundlesFragment f34981b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdBundlesFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.bundles.PostAdBundlesFragment$registerObservers$1$1", f = "PostAdBundlesFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.bundles.PostAdBundlesFragment$registerObservers$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<String, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f34982a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f34983b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PostAdBundlesFragment f34984c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdBundlesFragment postAdBundlesFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f34984c = postAdBundlesFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(String str, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(str, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f34984c, aVar);
            anonymousClass1.f34983b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f34982a == 0) {
                kotlin.f.b(obj);
                String str = (String) this.f34983b;
                if (str != null) {
                    PostAdDialoguesUtilsKt.k(this.f34984c, str);
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdBundlesFragment$registerObservers$1(PostAdBundlesFragment postAdBundlesFragment, zz.a<? super PostAdBundlesFragment$registerObservers$1> aVar) {
        super(1, aVar);
        this.f34981b = postAdBundlesFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdBundlesFragment$registerObservers$1(this.f34981b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34980a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            SharedFlow<String> V = this.f34981b.H().N2().V();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f34981b, null);
            this.f34980a = 1;
            if (FlowKt.collectLatest(V, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdBundlesFragment$registerObservers$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
