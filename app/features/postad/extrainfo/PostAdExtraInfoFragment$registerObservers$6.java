package com.forsale.app.features.postad.extrainfo;

import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdExtraInfoFragment.kt */
@d(c = "com.forsale.app.features.postad.extrainfo.PostAdExtraInfoFragment$registerObservers$6", f = "PostAdExtraInfoFragment.kt", l = {88}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdExtraInfoFragment$registerObservers$6 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35470a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdExtraInfoFragment f35471b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdExtraInfoFragment.kt */
    @d(c = "com.forsale.app.features.postad.extrainfo.PostAdExtraInfoFragment$registerObservers$6$1", f = "PostAdExtraInfoFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.extrainfo.PostAdExtraInfoFragment$registerObservers$6$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<Boolean, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35472a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PostAdExtraInfoFragment f35473b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdExtraInfoFragment postAdExtraInfoFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f35473b = postAdExtraInfoFragment;
        }

        public final Object b(boolean z11, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(Boolean.valueOf(z11), aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f35473b, aVar);
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, zz.a<? super p> aVar) {
            return b(bool.booleanValue(), aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f35472a == 0) {
                f.b(obj);
                PostAdExtraInfoFragment.V(this.f35473b).Q.P.O.A();
                this.f35473b.B().C1().k(PostAdExtraInfoFragment.V(this.f35473b).Q.P.O.z());
                this.f35473b.B().b2();
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdExtraInfoFragment$registerObservers$6(PostAdExtraInfoFragment postAdExtraInfoFragment, zz.a<? super PostAdExtraInfoFragment$registerObservers$6> aVar) {
        super(1, aVar);
        this.f35471b = postAdExtraInfoFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdExtraInfoFragment$registerObservers$6(this.f35471b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35470a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<Boolean> e12 = this.f35471b.B().e1();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35471b, null);
            this.f35470a = 1;
            if (FlowKt.collectLatest(e12, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdExtraInfoFragment$registerObservers$6) create(aVar)).invokeSuspend(p.f75480a);
    }
}
