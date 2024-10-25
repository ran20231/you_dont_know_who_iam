package com.forsale.app.features.postad.media.imagetutorials;

import com.forsale.app.datalayer.database.CategoryRuleSet;
import g00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ImageTutorialListViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.media.imagetutorials.ImageTutorialListViewModel$getTutorials$1$1", f = "ImageTutorialListViewModel.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ImageTutorialListViewModel$getTutorials$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35936a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ImageTutorialListViewModel f35937b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<CategoryRuleSet.Tutorial> f35938c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageTutorialListViewModel$getTutorials$1$1(ImageTutorialListViewModel imageTutorialListViewModel, List<CategoryRuleSet.Tutorial> list, zz.a<? super ImageTutorialListViewModel$getTutorials$1$1> aVar) {
        super(2, aVar);
        this.f35937b = imageTutorialListViewModel;
        this.f35938c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ImageTutorialListViewModel$getTutorials$1$1(this.f35937b, this.f35938c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35936a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableSharedFlow = this.f35937b.f35932l0;
            List<CategoryRuleSet.Tutorial> list = this.f35938c;
            this.f35936a = 1;
            if (mutableSharedFlow.emit(list, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ImageTutorialListViewModel$getTutorials$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
