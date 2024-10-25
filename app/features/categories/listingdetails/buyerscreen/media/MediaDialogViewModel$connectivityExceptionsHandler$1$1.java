package com.forsale.app.features.categories.listingdetails.buyerscreen.media;

import com.forsale.app.feedback.a;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import rj.a;
import t9.q0;
import t9.y0;
/* compiled from: MediaDialogViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialogViewModel$connectivityExceptionsHandler$1$1", f = "MediaDialogViewModel.kt", l = {87}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class MediaDialogViewModel$connectivityExceptionsHandler$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f26203a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MediaDialogViewModel f26204b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaDialogViewModel$connectivityExceptionsHandler$1$1(MediaDialogViewModel mediaDialogViewModel, zz.a<? super MediaDialogViewModel$connectivityExceptionsHandler$1$1> aVar) {
        super(2, aVar);
        this.f26204b = mediaDialogViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MediaDialogViewModel$connectivityExceptionsHandler$1$1(this.f26204b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f26203a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            x10.a.b("isConnectivityException:: ", new Object[0]);
            mutableSharedFlow = this.f26204b.I;
            lf.a aVar = new lf.a(new a.b(q0.C), new a.b(y0.Y, new Object[0]));
            this.f26203a = 1;
            if (mutableSharedFlow.emit(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MediaDialogViewModel$connectivityExceptionsHandler$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
