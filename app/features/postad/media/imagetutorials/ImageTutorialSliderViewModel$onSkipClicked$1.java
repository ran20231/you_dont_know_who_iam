package com.forsale.app.features.postad.media.imagetutorials;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ImageTutorialSliderViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.media.imagetutorials.ImageTutorialSliderViewModel$onSkipClicked$1", f = "ImageTutorialSliderViewModel.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ImageTutorialSliderViewModel$onSkipClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35953a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ImageTutorialSliderViewModel f35954b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageTutorialSliderViewModel$onSkipClicked$1(ImageTutorialSliderViewModel imageTutorialSliderViewModel, zz.a<? super ImageTutorialSliderViewModel$onSkipClicked$1> aVar) {
        super(2, aVar);
        this.f35954b = imageTutorialSliderViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ImageTutorialSliderViewModel$onSkipClicked$1(this.f35954b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35953a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableSharedFlow = this.f35954b.f35944d;
            wz.p pVar = wz.p.f75480a;
            this.f35953a = 1;
            if (mutableSharedFlow.emit(pVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ImageTutorialSliderViewModel$onSkipClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}