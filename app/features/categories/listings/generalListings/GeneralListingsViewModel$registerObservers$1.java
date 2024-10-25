package com.forsale.app.features.categories.listings.generalListings;

import com.forsale.app.utils.OneShotEventHandler;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GeneralListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel$registerObservers$1", f = "GeneralListingsViewModel.kt", l = {277}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class GeneralListingsViewModel$registerObservers$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f30510a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ GeneralListingsViewModel f30511b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralListingsViewModel$registerObservers$1(GeneralListingsViewModel generalListingsViewModel, zz.a<? super GeneralListingsViewModel$registerObservers$1> aVar) {
        super(2, aVar);
        this.f30511b = generalListingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new GeneralListingsViewModel$registerObservers$1(this.f30511b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        OneShotEventHandler oneShotEventHandler;
        FlowCollector flowCollector;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f30510a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            oneShotEventHandler = this.f30511b.E;
            flowCollector = this.f30511b.R;
            this.f30510a = 1;
            if (oneShotEventHandler.e(flowCollector, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((GeneralListingsViewModel$registerObservers$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
