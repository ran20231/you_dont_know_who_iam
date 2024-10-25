package com.forsale.app.features.categories.listingdetails.newui;

import com.forsale.app.datalayer.network.requestsbodies.IncrementCallClicksBody;
import com.forsale.app.datalayer.network.services.AnalyticsService;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewListingDetailsViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$incrementCallClicks$1", f = "NewListingDetailsViewModel.kt", l = {701}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewListingDetailsViewModel$incrementCallClicks$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27269a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewListingDetailsViewModel f27270b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ IncrementCallClicksBody f27271c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewListingDetailsViewModel$incrementCallClicks$1(NewListingDetailsViewModel newListingDetailsViewModel, IncrementCallClicksBody incrementCallClicksBody, zz.a<? super NewListingDetailsViewModel$incrementCallClicks$1> aVar) {
        super(2, aVar);
        this.f27270b = newListingDetailsViewModel;
        this.f27271c = incrementCallClicksBody;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewListingDetailsViewModel$incrementCallClicks$1(this.f27270b, this.f27271c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        AnalyticsService analyticsService;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f27269a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            analyticsService = this.f27270b.f27175m0;
            IncrementCallClicksBody incrementCallClicksBody = new IncrementCallClicksBody(this.f27271c.getUser_adv_id(), this.f27271c.getTarget());
            this.f27269a = 1;
            if (analyticsService.incrementCallClicks(incrementCallClicksBody, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewListingDetailsViewModel$incrementCallClicks$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
