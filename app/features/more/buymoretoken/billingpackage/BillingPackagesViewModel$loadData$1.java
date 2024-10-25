package com.forsale.app.features.more.buymoretoken.billingpackage;

import com.forsale.app.base.ViewStates;
import com.forsale.app.datalayer.network.responses.BillingPackagesResponse;
import com.forsale.app.datalayer.network.services.PaymentService;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingPackagesViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.buymoretoken.billingpackage.BillingPackagesViewModel$loadData$1", f = "BillingPackagesViewModel.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BillingPackagesViewModel$loadData$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31742a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BillingPackagesViewModel f31743b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingPackagesViewModel$loadData$1(BillingPackagesViewModel billingPackagesViewModel, zz.a<? super BillingPackagesViewModel$loadData$1> aVar) {
        super(2, aVar);
        this.f31743b = billingPackagesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new BillingPackagesViewModel$loadData$1(this.f31743b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        PaymentService paymentService;
        int A0;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31742a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            paymentService = this.f31743b.f31735p0;
            A0 = this.f31743b.A0();
            this.f31742a = 1;
            obj = paymentService.getPackages(A0, this);
            if (obj == f11) {
                return f11;
            }
        }
        BillingPackagesViewModel billingPackagesViewModel = this.f31743b;
        BillingPackagesResponse billingPackagesResponse = (BillingPackagesResponse) obj;
        billingPackagesViewModel.z0().postValue(billingPackagesResponse.getPackages());
        if (billingPackagesResponse.getPackages().size() == 0) {
            billingPackagesViewModel.v0().postValue(ViewStates.Empty);
        } else {
            billingPackagesViewModel.v0().postValue(ViewStates.CONTENT);
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((BillingPackagesViewModel$loadData$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
