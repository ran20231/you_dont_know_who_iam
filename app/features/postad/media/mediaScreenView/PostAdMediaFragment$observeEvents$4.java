package com.forsale.app.features.postad.media.mediaScreenView;

import com.forsale.app.features.postad.PostAdViewModel;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdMediaFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment$observeEvents$4", f = "PostAdMediaFragment.kt", l = {205}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdMediaFragment$observeEvents$4 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36212a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdMediaFragment f36213b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdMediaFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment$observeEvents$4$1", f = "PostAdMediaFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment$observeEvents$4$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<p, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f36214a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PostAdMediaFragment f36215b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdMediaFragment postAdMediaFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f36215b = postAdMediaFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(p pVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f36215b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f36214a == 0) {
                kotlin.f.b(obj);
                androidx.navigation.fragment.a.a(this.f36215b).d0(c.f36278a.a());
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdMediaFragment$observeEvents$4(PostAdMediaFragment postAdMediaFragment, zz.a<? super PostAdMediaFragment$observeEvents$4> aVar) {
        super(1, aVar);
        this.f36213b = postAdMediaFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdMediaFragment$observeEvents$4(this.f36213b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        PostAdViewModel M;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36212a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            M = this.f36213b.M();
            SharedFlow<p> v22 = M.v2();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f36213b, null);
            this.f36212a = 1;
            if (FlowKt.collectLatest(v22, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdMediaFragment$observeEvents$4) create(aVar)).invokeSuspend(p.f75480a);
    }
}
