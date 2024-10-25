package com.forsale.app.features.postad.media.mediaScreenView;

import com.forsale.app.features.postad.PostAdViewModel;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdMediaFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment$observeEvents$8", f = "PostAdMediaFragment.kt", l = {236}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdMediaFragment$observeEvents$8 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36229a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdMediaFragment f36230b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdMediaFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment$observeEvents$8$1", f = "PostAdMediaFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.media.mediaScreenView.PostAdMediaFragment$observeEvents$8$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<Integer, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f36231a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ int f36232b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PostAdMediaFragment f36233c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdMediaFragment postAdMediaFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f36233c = postAdMediaFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f36233c, aVar);
            anonymousClass1.f36232b = ((Number) obj).intValue();
            return anonymousClass1;
        }

        public final Object invoke(int i11, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(Integer.valueOf(i11), aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f36231a == 0) {
                kotlin.f.b(obj);
                this.f36233c.V(this.f36232b);
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ Object invoke(Integer num, zz.a<? super p> aVar) {
            return invoke(num.intValue(), aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdMediaFragment$observeEvents$8(PostAdMediaFragment postAdMediaFragment, zz.a<? super PostAdMediaFragment$observeEvents$8> aVar) {
        super(1, aVar);
        this.f36230b = postAdMediaFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdMediaFragment$observeEvents$8(this.f36230b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        PostAdViewModel M;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36229a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            M = this.f36230b.M();
            SharedFlow<Integer> Z2 = M.Z2();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f36230b, null);
            this.f36229a = 1;
            if (FlowKt.collectLatest(Z2, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdMediaFragment$observeEvents$8) create(aVar)).invokeSuspend(p.f75480a);
    }
}
