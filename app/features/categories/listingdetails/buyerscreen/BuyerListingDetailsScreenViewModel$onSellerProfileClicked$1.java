package com.forsale.app.features.categories.listingdetails.buyerscreen;

import com.forsale.app.features.categories.user.profile.UserProfileData;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyerListingDetailsScreenViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$onSellerProfileClicked$1", f = "BuyerListingDetailsScreenViewModel.kt", l = {680, 681}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BuyerListingDetailsScreenViewModel$onSellerProfileClicked$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25750a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsScreenViewModel f25751b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ UserProfileData f25752c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerListingDetailsScreenViewModel$onSellerProfileClicked$1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, UserProfileData userProfileData, zz.a<? super BuyerListingDetailsScreenViewModel$onSellerProfileClicked$1> aVar) {
        super(2, aVar);
        this.f25751b = buyerListingDetailsScreenViewModel;
        this.f25752c = userProfileData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new BuyerListingDetailsScreenViewModel$onSellerProfileClicked$1(this.f25751b, this.f25752c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object K0;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f25750a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel = this.f25751b;
            this.f25750a = 1;
            K0 = buyerListingDetailsScreenViewModel.K0(this);
            if (K0 == f11) {
                return f11;
            }
        }
        mutableSharedFlow = this.f25751b.S;
        d dVar = new d(this.f25752c);
        this.f25750a = 2;
        if (mutableSharedFlow.emit(dVar, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((BuyerListingDetailsScreenViewModel$onSellerProfileClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
