package com.forsale.app.ui.bottomsheets.listingdetailsselleranalytic;

import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SellerAnalyticsViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailsselleranalytic.SellerAnalyticsViewModel$onCloseClicked$1", f = "SellerAnalyticsViewModel.kt", l = {64}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SellerAnalyticsViewModel$onCloseClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38812a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SellerAnalyticsViewModel f38813b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerAnalyticsViewModel$onCloseClicked$1(SellerAnalyticsViewModel sellerAnalyticsViewModel, zz.a<? super SellerAnalyticsViewModel$onCloseClicked$1> aVar) {
        super(2, aVar);
        this.f38813b = sellerAnalyticsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SellerAnalyticsViewModel$onCloseClicked$1(this.f38813b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = b.f();
        int i11 = this.f38812a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f38813b.f38803p0;
            wz.p pVar = wz.p.f75480a;
            this.f38812a = 1;
            if (mutableSharedFlow.emit(pVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SellerAnalyticsViewModel$onCloseClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
