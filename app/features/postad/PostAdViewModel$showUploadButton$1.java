package com.forsale.app.features.postad;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel$showUploadButton$1", f = "PostAdViewModel.kt", l = {645}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdViewModel$showUploadButton$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34168a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f34169b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f34170c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdViewModel$showUploadButton$1(PostAdViewModel postAdViewModel, boolean z11, zz.a<? super PostAdViewModel$showUploadButton$1> aVar) {
        super(2, aVar);
        this.f34169b = postAdViewModel;
        this.f34170c = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdViewModel$showUploadButton$1(this.f34169b, this.f34170c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34168a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableSharedFlow = this.f34169b.f33927d2;
            Boolean a11 = kotlin.coroutines.jvm.internal.a.a(this.f34170c);
            this.f34168a = 1;
            if (mutableSharedFlow.emit(a11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdViewModel$showUploadButton$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
