package com.forsale.app.features.categories.listingdetails.buyerscreen;

import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.UserContactMode;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyerListingDetailsScreenViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$openCTAsBottomSheet$1", f = "BuyerListingDetailsScreenViewModel.kt", l = {983}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BuyerListingDetailsScreenViewModel$openCTAsBottomSheet$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25766a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsScreenViewModel f25767b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DetailsModel f25768c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ UserContactMode f25769d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerListingDetailsScreenViewModel$openCTAsBottomSheet$1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, DetailsModel detailsModel, UserContactMode userContactMode, zz.a<? super BuyerListingDetailsScreenViewModel$openCTAsBottomSheet$1> aVar) {
        super(2, aVar);
        this.f25767b = buyerListingDetailsScreenViewModel;
        this.f25768c = detailsModel;
        this.f25769d = userContactMode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new BuyerListingDetailsScreenViewModel$openCTAsBottomSheet$1(this.f25767b, this.f25768c, this.f25769d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f25766a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableStateFlow = this.f25767b.f25657p0;
            ab.a aVar = new ab.a(this.f25769d, true, this.f25768c.d().l());
            this.f25766a = 1;
            if (mutableStateFlow.emit(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((BuyerListingDetailsScreenViewModel$openCTAsBottomSheet$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
