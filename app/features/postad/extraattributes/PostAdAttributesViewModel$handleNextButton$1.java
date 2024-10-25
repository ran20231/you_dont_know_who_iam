package com.forsale.app.features.postad.extraattributes;

import androidx.databinding.ObservableInt;
import com.forsale.app.base.ViewStates;
import com.forsale.app.features.postad.PostAdViewModel;
import g00.l;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdAttributesViewModel.kt */
@d(c = "com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel$handleNextButton$1", f = "PostAdAttributesViewModel.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdAttributesViewModel$handleNextButton$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35144a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdAttributesViewModel f35145b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdAttributesViewModel.kt */
    @d(c = "com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel$handleNextButton$1$1", f = "PostAdAttributesViewModel.kt", l = {72}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel$handleNextButton$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements l<zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35146a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PostAdAttributesViewModel f35147b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdAttributesViewModel postAdAttributesViewModel, zz.a<? super AnonymousClass1> aVar) {
            super(1, aVar);
            this.f35147b = postAdAttributesViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(zz.a<?> aVar) {
            return new AnonymousClass1(this.f35147b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            Object e12;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f35146a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                this.f35147b.v0().postValue(ViewStates.LOADING);
                PostAdAttributesViewModel postAdAttributesViewModel = this.f35147b;
                this.f35146a = 1;
                e12 = postAdAttributesViewModel.e1(this);
                if (e12 == f11) {
                    return f11;
                }
            }
            this.f35147b.v0().postValue(ViewStates.CONTENT);
            this.f35147b.f1();
            return wz.p.f75480a;
        }

        @Override // g00.l
        public final Object invoke(zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdAttributesViewModel$handleNextButton$1(PostAdAttributesViewModel postAdAttributesViewModel, zz.a<? super PostAdAttributesViewModel$handleNextButton$1> aVar) {
        super(2, aVar);
        this.f35145b = postAdAttributesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdAttributesViewModel$handleNextButton$1(this.f35145b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ObservableInt observableInt;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35144a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            observableInt = this.f35145b.f35127w0;
            if (observableInt.j() == -1) {
                this.f35145b.f1();
            } else {
                PostAdViewModel O0 = this.f35145b.O0();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35145b, null);
                this.f35144a = 1;
                if (PostAdViewModel.D1(O0, null, anonymousClass1, this, 1, null) == f11) {
                    return f11;
                }
            }
        }
        this.f35145b.V0();
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdAttributesViewModel$handleNextButton$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
