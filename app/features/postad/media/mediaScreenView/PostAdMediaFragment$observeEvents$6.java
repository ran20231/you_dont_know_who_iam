package com.forsale.app.features.postad.media.mediaScreenView;

import com.forsale.app.features.postad.PostAdViewModel;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdMediaFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment$observeEvents$6", f = "PostAdMediaFragment.kt", l = {215}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdMediaFragment$observeEvents$6 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36220a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdMediaFragment f36221b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdMediaFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment$observeEvents$6$1", f = "PostAdMediaFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment$observeEvents$6$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<Boolean, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f36222a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ boolean f36223b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PostAdMediaFragment f36224c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdMediaFragment postAdMediaFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f36224c = postAdMediaFragment;
        }

        public final Object b(boolean z11, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(Boolean.valueOf(z11), aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f36224c, aVar);
            anonymousClass1.f36223b = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, zz.a<? super p> aVar) {
            return b(bool.booleanValue(), aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            PostAdViewModel M;
            PostAdViewModel M2;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f36222a == 0) {
                kotlin.f.b(obj);
                boolean z11 = this.f36223b;
                M = this.f36224c.M();
                if (o.d(M.c2().getValue(), kotlin.coroutines.jvm.internal.a.a(true))) {
                    this.f36224c.X(z11);
                    M2 = this.f36224c.M();
                    M2.c2().setValue(kotlin.coroutines.jvm.internal.a.a(false));
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdMediaFragment$observeEvents$6(PostAdMediaFragment postAdMediaFragment, zz.a<? super PostAdMediaFragment$observeEvents$6> aVar) {
        super(1, aVar);
        this.f36221b = postAdMediaFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdMediaFragment$observeEvents$6(this.f36221b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        PostAdViewModel M;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36220a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            M = this.f36221b.M();
            SharedFlow<Boolean> T2 = M.T2();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f36221b, null);
            this.f36220a = 1;
            if (FlowKt.collectLatest(T2, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdMediaFragment$observeEvents$6) create(aVar)).invokeSuspend(p.f75480a);
    }
}
