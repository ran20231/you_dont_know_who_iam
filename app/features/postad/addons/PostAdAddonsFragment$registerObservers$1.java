package com.forsale.app.features.postad.addons;

import com.forsale.app.features.postad.PostAdViewModel;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdAddonsFragment.kt */
@d(c = "com.forsale.app.features.postad.addons.PostAdAddonsFragment$registerObservers$1", f = "PostAdAddonsFragment.kt", l = {118}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdAddonsFragment$registerObservers$1 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34211a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdAddonsFragment f34212b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdAddonsFragment.kt */
    @d(c = "com.forsale.app.features.postad.addons.PostAdAddonsFragment$registerObservers$1$1", f = "PostAdAddonsFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.addons.PostAdAddonsFragment$registerObservers$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<Boolean, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f34213a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PostAdAddonsFragment f34214b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdAddonsFragment postAdAddonsFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f34214b = postAdAddonsFragment;
        }

        public final Object b(boolean z11, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(Boolean.valueOf(z11), aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f34214b, aVar);
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, zz.a<? super p> aVar) {
            return b(bool.booleanValue(), aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            PostAdViewModel i02;
            PostAdViewModel i03;
            PostAdViewModel i04;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f34213a == 0) {
                f.b(obj);
                i02 = this.f34214b.i0();
                if (o.d(i02.c2().getValue(), kotlin.coroutines.jvm.internal.a.a(true))) {
                    PostAdAddonsFragment postAdAddonsFragment = this.f34214b;
                    i03 = postAdAddonsFragment.i0();
                    PostAdDialoguesUtilsKt.l(postAdAddonsFragment, i03);
                    i04 = this.f34214b.i0();
                    i04.c2().setValue(kotlin.coroutines.jvm.internal.a.a(false));
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdAddonsFragment$registerObservers$1(PostAdAddonsFragment postAdAddonsFragment, zz.a<? super PostAdAddonsFragment$registerObservers$1> aVar) {
        super(1, aVar);
        this.f34212b = postAdAddonsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdAddonsFragment$registerObservers$1(this.f34212b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        PostAdViewModel i02;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34211a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            i02 = this.f34212b.i0();
            SharedFlow<Boolean> T2 = i02.T2();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f34212b, null);
            this.f34211a = 1;
            if (FlowKt.collectLatest(T2, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdAddonsFragment$registerObservers$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
