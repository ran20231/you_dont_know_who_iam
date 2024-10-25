package com.forsale.adserver.view.screens.ui;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: CommercialOffersSection.kt */
@d(c = "com.forsale.adserver.view.screens.ui.CommercialOffersSectionKt$CommercialOffersSection$2$1", f = "CommercialOffersSection.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CommercialOffersSectionKt$CommercialOffersSection$2$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21554a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LazyGridState f21555b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommercialOffersSectionKt$CommercialOffersSection$2$1(LazyGridState lazyGridState, zz.a<? super CommercialOffersSectionKt$CommercialOffersSection$2$1> aVar) {
        super(2, aVar);
        this.f21555b = lazyGridState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CommercialOffersSectionKt$CommercialOffersSection$2$1(this.f21555b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f21554a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            LazyGridState lazyGridState = this.f21555b;
            this.f21554a = 1;
            if (LazyGridState.I(lazyGridState, 0, 0, this, 2, null) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CommercialOffersSectionKt$CommercialOffersSection$2$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
