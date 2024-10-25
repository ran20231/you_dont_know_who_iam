package com.forsale.app.features.postad.maininfo;

import android.view.View;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* compiled from: PostAdMainInfoFragment.kt */
@d(c = "com.forsale.app.features.postad.maininfo.PostAdMainInfoFragment$onViewCreated$14", f = "PostAdMainInfoFragment.kt", l = {145}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PostAdMainInfoFragment$onViewCreated$14 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35830a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdMainInfoFragment f35831b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ View f35832c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdMainInfoFragment.kt */
    @d(c = "com.forsale.app.features.postad.maininfo.PostAdMainInfoFragment$onViewCreated$14$1", f = "PostAdMainInfoFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.maininfo.PostAdMainInfoFragment$onViewCreated$14$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<p, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35833a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PostAdMainInfoFragment f35834b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f35835c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdMainInfoFragment postAdMainInfoFragment, View view, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f35834b = postAdMainInfoFragment;
            this.f35835c = view;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(p pVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f35834b, this.f35835c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f35833a == 0) {
                f.b(obj);
                this.f35834b.B().j1(mj.f.f(this.f35835c));
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdMainInfoFragment$onViewCreated$14(PostAdMainInfoFragment postAdMainInfoFragment, View view, zz.a<? super PostAdMainInfoFragment$onViewCreated$14> aVar) {
        super(1, aVar);
        this.f35831b = postAdMainInfoFragment;
        this.f35832c = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdMainInfoFragment$onViewCreated$14(this.f35831b, this.f35832c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35830a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<p> G2 = this.f35831b.T().G2();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35831b, this.f35832c, null);
            this.f35830a = 1;
            if (FlowKt.collectLatest(G2, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdMainInfoFragment$onViewCreated$14) create(aVar)).invokeSuspend(p.f75480a);
    }
}
