package com.forsale.app.features.postad;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.forsale.app.features.auth.AuthActivity;
import com.forsale.app.features.auth.models.AuthIntention;
import com.forsale.app.utils.analytics.auth.AuthenticationSourcePage;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdUtils.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdUtilsKt$registerAuthenticationObservers$1", f = "PostAdUtils.kt", l = {18}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdUtilsKt$registerAuthenticationObservers$1 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33910a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f33911b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Fragment f33912c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdUtils.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdUtilsKt$registerAuthenticationObservers$1$1", f = "PostAdUtils.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.PostAdUtilsKt$registerAuthenticationObservers$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<p, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f33913a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f33914b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Fragment fragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f33914b = fragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(p pVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f33914b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f33913a == 0) {
                kotlin.f.b(obj);
                Context context = this.f33914b.getContext();
                if (context != null) {
                    AuthActivity.f22470e.a(context, AuthIntention.SignIn, AuthenticationSourcePage.ADD_LISTING);
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdUtilsKt$registerAuthenticationObservers$1(PostAdViewModel postAdViewModel, Fragment fragment, zz.a<? super PostAdUtilsKt$registerAuthenticationObservers$1> aVar) {
        super(1, aVar);
        this.f33911b = postAdViewModel;
        this.f33912c = fragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdUtilsKt$registerAuthenticationObservers$1(this.f33911b, this.f33912c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33910a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            SharedFlow<p> w22 = this.f33911b.w2();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f33912c, null);
            this.f33910a = 1;
            if (FlowKt.collectLatest(w22, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdUtilsKt$registerAuthenticationObservers$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}