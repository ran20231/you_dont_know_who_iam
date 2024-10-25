package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime;

import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LifeTimeStatusViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.LifeTimeStatusViewModel$getDistrict$1", f = "LifeTimeStatusViewModel.kt", l = {90}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LifeTimeStatusViewModel$getDistrict$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27775a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LifeTimeStatusViewModel f27776b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f27777c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f27778d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifeTimeStatusViewModel$getDistrict$1(LifeTimeStatusViewModel lifeTimeStatusViewModel, int i11, String str, a<? super LifeTimeStatusViewModel$getDistrict$1> aVar) {
        super(2, aVar);
        this.f27776b = lifeTimeStatusViewModel;
        this.f27777c = i11;
        this.f27778d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new LifeTimeStatusViewModel$getDistrict$1(this.f27776b, this.f27777c, this.f27778d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ListingLifeTimeItemViewModel listingLifeTimeItemViewModel;
        f11 = b.f();
        int i11 = this.f27775a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            listingLifeTimeItemViewModel = this.f27776b.f27760b;
            DistrictsRepository j11 = listingLifeTimeItemViewModel.j();
            int i12 = this.f27777c;
            this.f27775a = 1;
            obj = j11.getDistrictByDistrictId(i12, this);
            if (obj == f11) {
                return f11;
            }
        }
        DistrictEntity districtEntity = (DistrictEntity) obj;
        if (districtEntity != null) {
            this.f27776b.u(this.f27778d, districtEntity.getName());
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((LifeTimeStatusViewModel$getDistrict$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
