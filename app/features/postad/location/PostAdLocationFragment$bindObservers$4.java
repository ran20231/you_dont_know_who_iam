package com.forsale.app.features.postad.location;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import g00.l;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdLocationFragment.kt */
@d(c = "com.forsale.app.features.postad.location.PostAdLocationFragment$bindObservers$4", f = "PostAdLocationFragment.kt", l = {FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdLocationFragment$bindObservers$4 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35642a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdLocationFragment f35643b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdLocationFragment.kt */
    @d(c = "com.forsale.app.features.postad.location.PostAdLocationFragment$bindObservers$4$1", f = "PostAdLocationFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.location.PostAdLocationFragment$bindObservers$4$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<p, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35644a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PostAdLocationFragment f35645b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdLocationFragment postAdLocationFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f35645b = postAdLocationFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(p pVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f35645b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f35644a == 0) {
                f.b(obj);
                this.f35645b.d0();
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdLocationFragment$bindObservers$4(PostAdLocationFragment postAdLocationFragment, zz.a<? super PostAdLocationFragment$bindObservers$4> aVar) {
        super(1, aVar);
        this.f35643b = postAdLocationFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdLocationFragment$bindObservers$4(this.f35643b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f35642a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<p> K1 = this.f35643b.B().K1();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35643b, null);
            this.f35642a = 1;
            if (FlowKt.collectLatest(K1, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdLocationFragment$bindObservers$4) create(aVar)).invokeSuspend(p.f75480a);
    }
}
