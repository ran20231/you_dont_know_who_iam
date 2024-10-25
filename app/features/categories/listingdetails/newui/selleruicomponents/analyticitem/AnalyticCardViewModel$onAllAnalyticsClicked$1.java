package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem;

import com.forsale.app.features.more.mylistings.AnalyticModel;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnalyticCardViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem.AnalyticCardViewModel$onAllAnalyticsClicked$1", f = "AnalyticCardViewModel.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AnalyticCardViewModel$onAllAnalyticsClicked$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27695a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AnalyticCardViewModel f27696b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticCardViewModel$onAllAnalyticsClicked$1(AnalyticCardViewModel analyticCardViewModel, a<? super AnalyticCardViewModel$onAllAnalyticsClicked$1> aVar) {
        super(2, aVar);
        this.f27696b = analyticCardViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new AnalyticCardViewModel$onAllAnalyticsClicked$1(this.f27696b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        AnalyticModel analyticModel;
        f11 = b.f();
        int i11 = this.f27695a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f27696b.f27688f;
            analyticModel = this.f27696b.f27686d;
            this.f27695a = 1;
            if (mutableSharedFlow.emit(analyticModel, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((AnalyticCardViewModel$onAllAnalyticsClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
