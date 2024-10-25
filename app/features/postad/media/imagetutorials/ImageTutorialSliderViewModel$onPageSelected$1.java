package com.forsale.app.features.postad.media.imagetutorials;

import com.forsale.app.datalayer.database.CategoryRuleSet;
import g00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ImageTutorialSliderViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.media.imagetutorials.ImageTutorialSliderViewModel$onPageSelected$1", f = "ImageTutorialSliderViewModel.kt", l = {38}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ImageTutorialSliderViewModel$onPageSelected$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35950a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ImageTutorialSliderViewModel f35951b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f35952c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageTutorialSliderViewModel$onPageSelected$1(ImageTutorialSliderViewModel imageTutorialSliderViewModel, int i11, zz.a<? super ImageTutorialSliderViewModel$onPageSelected$1> aVar) {
        super(2, aVar);
        this.f35951b = imageTutorialSliderViewModel;
        this.f35952c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ImageTutorialSliderViewModel$onPageSelected$1(this.f35951b, this.f35952c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        boolean z11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35950a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            List<CategoryRuleSet.Tutorial> value = this.f35951b.k().getValue();
            if (value != null) {
                int size = value.size();
                ImageTutorialSliderViewModel imageTutorialSliderViewModel = this.f35951b;
                int i12 = this.f35952c;
                mutableStateFlow = imageTutorialSliderViewModel.f35942b;
                if (i12 == size - 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Boolean a11 = kotlin.coroutines.jvm.internal.a.a(z11);
                this.f35950a = 1;
                if (mutableStateFlow.emit(a11, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ImageTutorialSliderViewModel$onPageSelected$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
