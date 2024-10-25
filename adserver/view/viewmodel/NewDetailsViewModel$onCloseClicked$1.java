package com.forsale.adserver.view.viewmodel;

import com.forsale.adserver.view.models.AdsModel;
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
@d(c = "com.forsale.adserver.view.viewmodel.NewDetailsViewModel$onCloseClicked$1", f = "NewDetailsViewModel.kt", l = {182}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewDetailsViewModel$onCloseClicked$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21786a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewDetailsViewModel f21787b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewDetailsViewModel$onCloseClicked$1(NewDetailsViewModel newDetailsViewModel, a<? super NewDetailsViewModel$onCloseClicked$1> aVar) {
        super(2, aVar);
        this.f21787b = newDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new NewDetailsViewModel$onCloseClicked$1(this.f21787b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        DetailsAnalyticsLogger T;
        f11 = b.f();
        int i11 = this.f21786a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f21787b.G;
            wz.p pVar = wz.p.f75480a;
            this.f21786a = 1;
            if (mutableSharedFlow.emit(pVar, this) == f11) {
                return f11;
            }
        }
        AdsModel value = this.f21787b.L().getValue();
        if (value != null) {
            T = this.f21787b.T();
            T.j(value);
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((NewDetailsViewModel$onCloseClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
