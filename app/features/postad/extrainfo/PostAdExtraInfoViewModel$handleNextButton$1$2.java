package com.forsale.app.features.postad.extrainfo;

import com.forsale.app.features.postad.PostAdViewModel;
import g00.l;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdExtraInfoViewModel.kt */
@d(c = "com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$handleNextButton$1$2", f = "PostAdExtraInfoViewModel.kt", l = {125}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdExtraInfoViewModel$handleNextButton$1$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35528a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdExtraInfoViewModel f35529b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdExtraInfoViewModel.kt */
    @d(c = "com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$handleNextButton$1$2$1", f = "PostAdExtraInfoViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel$handleNextButton$1$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements l<zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35530a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PostAdExtraInfoViewModel f35531b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdExtraInfoViewModel postAdExtraInfoViewModel, zz.a<? super AnonymousClass1> aVar) {
            super(1, aVar);
            this.f35531b = postAdExtraInfoViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(zz.a<?> aVar) {
            return new AnonymousClass1(this.f35531b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f35530a == 0) {
                f.b(obj);
                this.f35531b.K1();
                return wz.p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // g00.l
        public final Object invoke(zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdExtraInfoViewModel$handleNextButton$1$2(PostAdExtraInfoViewModel postAdExtraInfoViewModel, zz.a<? super PostAdExtraInfoViewModel$handleNextButton$1$2> aVar) {
        super(2, aVar);
        this.f35529b = postAdExtraInfoViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdExtraInfoViewModel$handleNextButton$1$2(this.f35529b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35528a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            PostAdViewModel o12 = this.f35529b.o1();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35529b, null);
            this.f35528a = 1;
            if (PostAdViewModel.D1(o12, null, anonymousClass1, this, 1, null) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdExtraInfoViewModel$handleNextButton$1$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
