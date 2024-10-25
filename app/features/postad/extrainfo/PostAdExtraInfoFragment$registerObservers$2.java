package com.forsale.app.features.postad.extrainfo;

import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.extrainfo.a;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdExtraInfoFragment.kt */
@d(c = "com.forsale.app.features.postad.extrainfo.PostAdExtraInfoFragment$registerObservers$2", f = "PostAdExtraInfoFragment.kt", l = {57}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdExtraInfoFragment$registerObservers$2 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35451a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdExtraInfoFragment f35452b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdExtraInfoFragment.kt */
    @d(c = "com.forsale.app.features.postad.extrainfo.PostAdExtraInfoFragment$registerObservers$2$1", f = "PostAdExtraInfoFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.extrainfo.PostAdExtraInfoFragment$registerObservers$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<p, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35453a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PostAdExtraInfoFragment f35454b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdExtraInfoFragment postAdExtraInfoFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f35454b = postAdExtraInfoFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(p pVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f35454b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f35453a == 0) {
                f.b(obj);
                androidx.navigation.fragment.a.a(this.f35454b).d0(a.d.f(a.f35571a, null, 1, null));
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdExtraInfoFragment$registerObservers$2(PostAdExtraInfoFragment postAdExtraInfoFragment, zz.a<? super PostAdExtraInfoFragment$registerObservers$2> aVar) {
        super(1, aVar);
        this.f35452b = postAdExtraInfoFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdExtraInfoFragment$registerObservers$2(this.f35452b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        PostAdViewModel e02;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35451a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            e02 = this.f35452b.e0();
            SharedFlow<p> B2 = e02.B2();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35452b, null);
            this.f35451a = 1;
            if (FlowKt.collectLatest(B2, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdExtraInfoFragment$registerObservers$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
