package com.forsale.app.features.postad;

import androidx.fragment.app.Fragment;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import t9.k0;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdUtils.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdUtilsKt$registerShowingListingSavedDialog$1", f = "PostAdUtils.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdUtilsKt$registerShowingListingSavedDialog$1 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33915a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f33916b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Fragment f33917c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdUtils.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdUtilsKt$registerShowingListingSavedDialog$1$1", f = "PostAdUtils.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.PostAdUtilsKt$registerShowingListingSavedDialog$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<p, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f33918a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f33919b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Fragment fragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f33919b = fragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(p pVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f33919b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f33918a == 0) {
                kotlin.f.b(obj);
                androidx.navigation.fragment.a.a(this.f33919b).d0(k0.f.f(k0.f69302a, false, 1, null));
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdUtilsKt$registerShowingListingSavedDialog$1(PostAdViewModel postAdViewModel, Fragment fragment, zz.a<? super PostAdUtilsKt$registerShowingListingSavedDialog$1> aVar) {
        super(1, aVar);
        this.f33916b = postAdViewModel;
        this.f33917c = fragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdUtilsKt$registerShowingListingSavedDialog$1(this.f33916b, this.f33917c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33915a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            SharedFlow<p> V2 = this.f33916b.V2();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f33917c, null);
            this.f33915a = 1;
            if (FlowKt.collectLatest(V2, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdUtilsKt$registerShowingListingSavedDialog$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
