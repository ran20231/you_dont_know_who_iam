package com.forsale.adserver.view.viewmodel;

import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewDetailsViewModel.kt */
@d(c = "com.forsale.adserver.view.viewmodel.NewDetailsViewModel$showFeedback$1", f = "NewDetailsViewModel.kt", l = {292}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewDetailsViewModel$showFeedback$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21809a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewDetailsViewModel f21810b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f21811c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewDetailsViewModel$showFeedback$1(NewDetailsViewModel newDetailsViewModel, boolean z11, a<? super NewDetailsViewModel$showFeedback$1> aVar) {
        super(2, aVar);
        this.f21810b = newDetailsViewModel;
        this.f21811c = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new NewDetailsViewModel$showFeedback$1(this.f21810b, this.f21811c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = b.f();
        int i11 = this.f21809a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f21810b.S;
            Boolean a11 = kotlin.coroutines.jvm.internal.a.a(this.f21811c);
            this.f21809a = 1;
            if (mutableSharedFlow.emit(a11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((NewDetailsViewModel$showFeedback$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
