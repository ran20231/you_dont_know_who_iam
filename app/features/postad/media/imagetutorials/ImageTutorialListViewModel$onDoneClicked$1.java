package com.forsale.app.features.postad.media.imagetutorials;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ImageTutorialListViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.media.imagetutorials.ImageTutorialListViewModel$onDoneClicked$1", f = "ImageTutorialListViewModel.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ImageTutorialListViewModel$onDoneClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35939a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ImageTutorialListViewModel f35940b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageTutorialListViewModel$onDoneClicked$1(ImageTutorialListViewModel imageTutorialListViewModel, zz.a<? super ImageTutorialListViewModel$onDoneClicked$1> aVar) {
        super(2, aVar);
        this.f35940b = imageTutorialListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ImageTutorialListViewModel$onDoneClicked$1(this.f35940b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35939a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableSharedFlow = this.f35940b.f35934n0;
            wz.p pVar = wz.p.f75480a;
            this.f35939a = 1;
            if (mutableSharedFlow.emit(pVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ImageTutorialListViewModel$onDoneClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
