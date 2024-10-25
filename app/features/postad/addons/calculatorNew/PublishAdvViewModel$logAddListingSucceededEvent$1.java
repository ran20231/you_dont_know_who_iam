package com.forsale.app.features.postad.addons.calculatorNew;

import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.PLFSource;
import com.forsale.app.utils.analytics.PaymentMethod;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PublishAdvViewModel.kt */
@d(c = "com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel$logAddListingSucceededEvent$1", f = "PublishAdvViewModel.kt", l = {265}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PublishAdvViewModel$logAddListingSucceededEvent$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34639a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PublishAdvViewModel f34640b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublishAdvViewModel$logAddListingSucceededEvent$1(PublishAdvViewModel publishAdvViewModel, zz.a<? super PublishAdvViewModel$logAddListingSucceededEvent$1> aVar) {
        super(2, aVar);
        this.f34640b = publishAdvViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PublishAdvViewModel$logAddListingSucceededEvent$1(this.f34640b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        PostAdViewModel postAdViewModel;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger;
        PostAdViewModel postAdViewModel2;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        PostAdViewModel postAdViewModel3;
        f11 = b.f();
        int i11 = this.f34639a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            postAdViewModel = this.f34640b.f34595a;
            ListingDetailsEntity n22 = postAdViewModel.n2();
            if (n22 != null) {
                PublishAdvViewModel publishAdvViewModel = this.f34640b;
                aggregatedAllAnalyticsLogger = publishAdvViewModel.f34599e;
                postAdViewModel2 = publishAdvViewModel.f34595a;
                PLFSource W2 = postAdViewModel2.W2();
                mutableStateFlow = publishAdvViewModel.f34617w;
                PaymentMethod paymentMethod = (PaymentMethod) mutableStateFlow.getValue();
                mutableStateFlow2 = publishAdvViewModel.f34618x;
                postAdViewModel3 = publishAdvViewModel.f34595a;
                this.f34639a = 1;
                if (AggregatedAllAnalyticsLoggerKt.r(aggregatedAllAnalyticsLogger, n22, W2, paymentMethod, (PaymentMethod) mutableStateFlow2.getValue(), true, postAdViewModel3.J2().getValue(), this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PublishAdvViewModel$logAddListingSucceededEvent$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
