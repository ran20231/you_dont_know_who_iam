package com.forsale.app.features.more.support;

import com.forsale.app.datalayer.repositories.TutorialRepository;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SupportViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.support.SupportViewModel$onHelpClick$1", f = "SupportViewModel.kt", l = {112, 112}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SupportViewModel$onHelpClick$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f32848a;

    /* renamed from: b  reason: collision with root package name */
    int f32849b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SupportViewModel f32850c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportViewModel$onHelpClick$1(SupportViewModel supportViewModel, zz.a<? super SupportViewModel$onHelpClick$1> aVar) {
        super(2, aVar);
        this.f32850c = supportViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SupportViewModel$onHelpClick$1(this.f32850c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        TutorialRepository tutorialRepository;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f32849b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableSharedFlow = (MutableSharedFlow) this.f32848a;
            f.b(obj);
        } else {
            f.b(obj);
            mutableSharedFlow = this.f32850c.f32837z0;
            tutorialRepository = this.f32850c.f32822k0;
            this.f32848a = mutableSharedFlow;
            this.f32849b = 1;
            obj = tutorialRepository.getWalkThroughUrl(this);
            if (obj == f11) {
                return f11;
            }
        }
        this.f32848a = null;
        this.f32849b = 2;
        if (mutableSharedFlow.emit(obj, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SupportViewModel$onHelpClick$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
