package com.forsale.app.features.categories.listingdetails.buyerscreen;

import com.forsale.app.features.categories.listingdetails.ShareText;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyerListingDetailsScreenViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$onShareClicked$1$1$1", f = "BuyerListingDetailsScreenViewModel.kt", l = {417, 418}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BuyerListingDetailsScreenViewModel$onShareClicked$1$1$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25753a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsScreenViewModel f25754b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DetailsModel f25755c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ShareText f25756d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerListingDetailsScreenViewModel$onShareClicked$1$1$1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, DetailsModel detailsModel, ShareText shareText, zz.a<? super BuyerListingDetailsScreenViewModel$onShareClicked$1$1$1> aVar) {
        super(2, aVar);
        this.f25754b = buyerListingDetailsScreenViewModel;
        this.f25755c = detailsModel;
        this.f25756d = shareText;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new BuyerListingDetailsScreenViewModel$onShareClicked$1$1$1(this.f25754b, this.f25755c, this.f25756d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object m12;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f25753a;
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
            BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel = this.f25754b;
            DetailsModel detailsModel = this.f25755c;
            this.f25753a = 1;
            m12 = buyerListingDetailsScreenViewModel.m1(detailsModel, this);
            if (m12 == f11) {
                return f11;
            }
        }
        mutableSharedFlow = this.f25754b.S;
        b bVar = new b(this.f25756d);
        this.f25753a = 2;
        if (mutableSharedFlow.emit(bVar, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((BuyerListingDetailsScreenViewModel$onShareClicked$1$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
