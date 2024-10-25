package com.forsale.app.features.postad;

import androidx.lifecycle.b0;
import com.forsale.app.utils.CoroutinesExtensionsKt;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel$enableBackAndCloseButton$1", f = "PostAdViewModel.kt", l = {1299}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdViewModel$enableBackAndCloseButton$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34021a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f34022b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f34023c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f34024d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel$enableBackAndCloseButton$1$1", f = "PostAdViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.PostAdViewModel$enableBackAndCloseButton$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f34025a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PostAdViewModel f34026b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f34027c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdViewModel postAdViewModel, boolean z11, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f34026b = postAdViewModel;
            this.f34027c = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f34026b, this.f34027c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b0 b0Var;
            b0 b0Var2;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f34025a == 0) {
                kotlin.f.b(obj);
                b0Var = this.f34026b.T1;
                b0Var.setValue(kotlin.coroutines.jvm.internal.a.a(this.f34027c));
                b0Var2 = this.f34026b.V1;
                b0Var2.setValue(kotlin.coroutines.jvm.internal.a.a(this.f34027c));
                return wz.p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdViewModel$enableBackAndCloseButton$1(PostAdViewModel postAdViewModel, boolean z11, zz.a<? super PostAdViewModel$enableBackAndCloseButton$1> aVar) {
        super(2, aVar);
        this.f34023c = postAdViewModel;
        this.f34024d = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        PostAdViewModel$enableBackAndCloseButton$1 postAdViewModel$enableBackAndCloseButton$1 = new PostAdViewModel$enableBackAndCloseButton$1(this.f34023c, this.f34024d, aVar);
        postAdViewModel$enableBackAndCloseButton$1.f34022b = obj;
        return postAdViewModel$enableBackAndCloseButton$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34021a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f34023c, this.f34024d, null);
            this.f34021a = 1;
            if (CoroutinesExtensionsKt.a((CoroutineScope) this.f34022b, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdViewModel$enableBackAndCloseButton$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
