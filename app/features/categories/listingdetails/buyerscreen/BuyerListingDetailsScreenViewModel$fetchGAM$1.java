package com.forsale.app.features.categories.listingdetails.buyerscreen;

import com.forsale.app.domainlayer.interactors.gamInteractors.GamForListingDetailsInteractor;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyerListingDetailsScreenViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$fetchGAM$1", f = "BuyerListingDetailsScreenViewModel.kt", l = {559}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BuyerListingDetailsScreenViewModel$fetchGAM$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f25688a;

    /* renamed from: b  reason: collision with root package name */
    int f25689b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsScreenViewModel f25690c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f25691d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerListingDetailsScreenViewModel$fetchGAM$1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, int i11, zz.a<? super BuyerListingDetailsScreenViewModel$fetchGAM$1> aVar) {
        super(2, aVar);
        this.f25690c = buyerListingDetailsScreenViewModel;
        this.f25691d = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new BuyerListingDetailsScreenViewModel$fetchGAM$1(this.f25690c, this.f25691d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        GamForListingDetailsInteractor gamForListingDetailsInteractor;
        MutableStateFlow mutableStateFlow2;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f25689b;
        if (i11 != 0) {
            if (i11 == 1) {
                mutableStateFlow2 = (MutableStateFlow) this.f25688a;
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableStateFlow = this.f25690c.W;
            gamForListingDetailsInteractor = this.f25690c.f25640e;
            int i12 = this.f25691d;
            this.f25688a = mutableStateFlow;
            this.f25689b = 1;
            Object c11 = gamForListingDetailsInteractor.c(i12, this);
            if (c11 == f11) {
                return f11;
            }
            mutableStateFlow2 = mutableStateFlow;
            obj = c11;
        }
        mutableStateFlow2.setValue(obj);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((BuyerListingDetailsScreenViewModel$fetchGAM$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
