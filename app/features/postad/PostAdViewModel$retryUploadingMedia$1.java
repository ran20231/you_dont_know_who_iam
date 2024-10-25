package com.forsale.app.features.postad;

import com.forsale.app.features.postad.media.MediaTypes;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PostAdViewModel$retryUploadingMedia$1", f = "PostAdViewModel.kt", l = {1165, 1166}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdViewModel$retryUploadingMedia$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34131a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdViewModel f34132b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f34133c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ MediaTypes f34134d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f34135e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ boolean f34136f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdViewModel$retryUploadingMedia$1(PostAdViewModel postAdViewModel, boolean z11, MediaTypes mediaTypes, boolean z12, boolean z13, zz.a<? super PostAdViewModel$retryUploadingMedia$1> aVar) {
        super(2, aVar);
        this.f34132b = postAdViewModel;
        this.f34133c = z11;
        this.f34134d = mediaTypes;
        this.f34135e = z12;
        this.f34136f = z13;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdViewModel$retryUploadingMedia$1(this.f34132b, this.f34133c, this.f34134d, this.f34135e, this.f34136f, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34131a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            this.f34132b.N3();
            if (!this.f34133c) {
                mutableSharedFlow = this.f34132b.F0;
                wz.p pVar = wz.p.f75480a;
                this.f34131a = 1;
                if (mutableSharedFlow.emit(pVar, this) == f11) {
                    return f11;
                }
            }
        }
        PostAdViewModel postAdViewModel = this.f34132b;
        MediaTypes mediaTypes = this.f34134d;
        boolean z11 = this.f34135e;
        boolean z12 = this.f34136f;
        this.f34131a = 2;
        if (postAdViewModel.k4(mediaTypes, z11, z12, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdViewModel$retryUploadingMedia$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
