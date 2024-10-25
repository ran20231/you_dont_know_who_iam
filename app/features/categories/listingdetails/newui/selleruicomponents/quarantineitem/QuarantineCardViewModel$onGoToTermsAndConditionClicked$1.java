package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.quarantineitem;

import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import t9.y0;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: QuarantineCardViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.quarantineitem.QuarantineCardViewModel$onGoToTermsAndConditionClicked$1", f = "QuarantineCardViewModel.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class QuarantineCardViewModel$onGoToTermsAndConditionClicked$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27937a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ QuarantineCardViewModel f27938b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuarantineCardViewModel$onGoToTermsAndConditionClicked$1(QuarantineCardViewModel quarantineCardViewModel, a<? super QuarantineCardViewModel$onGoToTermsAndConditionClicked$1> aVar) {
        super(2, aVar);
        this.f27938b = quarantineCardViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new QuarantineCardViewModel$onGoToTermsAndConditionClicked$1(this.f27938b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        ApplicationResourcesRepository applicationResourcesRepository;
        f11 = b.f();
        int i11 = this.f27937a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f27938b.f27929d;
            applicationResourcesRepository = this.f27938b.f27928c;
            String string = applicationResourcesRepository.getString(y0.f70455fa, new Object[0]);
            this.f27937a = 1;
            if (mutableSharedFlow.emit(string, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((QuarantineCardViewModel$onGoToTermsAndConditionClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
