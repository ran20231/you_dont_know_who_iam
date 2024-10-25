package com.forsale.app.ui.bottomsheets.listingdetailsselleraction.addadditionalcontacts;

import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.utils.v;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SellerActionAddAdditionalContactsItemViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailsselleraction.addadditionalcontacts.SellerActionAddAdditionalContactsItemViewModel$getRegion$1", f = "SellerActionAddAdditionalContactsItemViewModel.kt", l = {121}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SellerActionAddAdditionalContactsItemViewModel$getRegion$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38589a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SellerActionAddAdditionalContactsItemViewModel f38590b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f38591c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerActionAddAdditionalContactsItemViewModel$getRegion$1(SellerActionAddAdditionalContactsItemViewModel sellerActionAddAdditionalContactsItemViewModel, int i11, a<? super SellerActionAddAdditionalContactsItemViewModel$getRegion$1> aVar) {
        super(2, aVar);
        this.f38590b = sellerActionAddAdditionalContactsItemViewModel;
        this.f38591c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new SellerActionAddAdditionalContactsItemViewModel$getRegion$1(this.f38590b, this.f38591c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        RegionsRepository regionsRepository;
        v.a aVar;
        f11 = b.f();
        int i11 = this.f38589a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            regionsRepository = this.f38590b.f38565g;
            Integer d11 = kotlin.coroutines.jvm.internal.a.d(this.f38591c);
            this.f38589a = 1;
            obj = regionsRepository.getRegion(d11, this);
            if (obj == f11) {
                return f11;
            }
        }
        RegionEntity regionEntity = (RegionEntity) obj;
        if (regionEntity != null) {
            SellerActionAddAdditionalContactsItemViewModel sellerActionAddAdditionalContactsItemViewModel = this.f38590b;
            aVar = sellerActionAddAdditionalContactsItemViewModel.f38567i;
            sellerActionAddAdditionalContactsItemViewModel.f38582x = aVar.a(regionEntity.getPhonePrefix(), regionEntity.getRegionCodeEn());
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((SellerActionAddAdditionalContactsItemViewModel$getRegion$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
