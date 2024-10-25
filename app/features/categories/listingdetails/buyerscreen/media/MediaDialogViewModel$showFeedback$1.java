package com.forsale.app.features.categories.listingdetails.buyerscreen.media;

import com.forsale.app.feedback.a;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import rj.a;
import t9.y0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MediaDialogViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialogViewModel$showFeedback$1", f = "MediaDialogViewModel.kt", l = {229}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MediaDialogViewModel$showFeedback$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f26230a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MediaDialogViewModel f26231b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaDialogViewModel$showFeedback$1(MediaDialogViewModel mediaDialogViewModel, zz.a<? super MediaDialogViewModel$showFeedback$1> aVar) {
        super(2, aVar);
        this.f26231b = mediaDialogViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MediaDialogViewModel$showFeedback$1(this.f26231b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f26230a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableSharedFlow = this.f26231b.I;
            lf.a aVar = new lf.a(new a.C0430a(gk.b.f56934a), new a.b(y0.V0, new Object[0]));
            this.f26230a = 1;
            if (mutableSharedFlow.emit(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MediaDialogViewModel$showFeedback$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
