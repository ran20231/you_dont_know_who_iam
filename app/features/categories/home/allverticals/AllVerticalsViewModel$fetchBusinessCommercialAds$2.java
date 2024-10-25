package com.forsale.app.features.categories.home.allverticals;

import com.forsale.adserver.view.models.AdsModel;
import com.forsale.app.domainlayer.interactors.categoriesinteractors.GetBusinessCommercialAdsInteractor;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AllVerticalsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$fetchBusinessCommercialAds$2", f = "AllVerticalsViewModel.kt", l = {235}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AllVerticalsViewModel$fetchBusinessCommercialAds$2 extends SuspendLambda implements g00.l<zz.a<? super List<? extends AdsModel>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23436a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AllVerticalsViewModel f23437b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllVerticalsViewModel$fetchBusinessCommercialAds$2(AllVerticalsViewModel allVerticalsViewModel, zz.a<? super AllVerticalsViewModel$fetchBusinessCommercialAds$2> aVar) {
        super(1, aVar);
        this.f23437b = allVerticalsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new AllVerticalsViewModel$fetchBusinessCommercialAds$2(this.f23437b, aVar);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ Object invoke(zz.a<? super List<? extends AdsModel>> aVar) {
        return invoke2((zz.a<? super List<AdsModel>>) aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        GetBusinessCommercialAdsInteractor getBusinessCommercialAdsInteractor;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f23436a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            getBusinessCommercialAdsInteractor = this.f23437b.f23387f;
            int id2 = this.f23437b.Q().getId();
            this.f23436a = 1;
            obj = getBusinessCommercialAdsInteractor.a(id2, this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(zz.a<? super List<AdsModel>> aVar) {
        return ((AllVerticalsViewModel$fetchBusinessCommercialAds$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
