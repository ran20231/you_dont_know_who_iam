package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingPinOption;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LifeTimeStatusViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.LifeTimeStatusViewModel$getCategoryName$2$1", f = "LifeTimeStatusViewModel.kt", l = {73}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LifeTimeStatusViewModel$getCategoryName$2$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27772a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LifeTimeStatusViewModel f27773b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ListingPinOption f27774c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifeTimeStatusViewModel$getCategoryName$2$1(LifeTimeStatusViewModel lifeTimeStatusViewModel, ListingPinOption listingPinOption, a<? super LifeTimeStatusViewModel$getCategoryName$2$1> aVar) {
        super(2, aVar);
        this.f27773b = lifeTimeStatusViewModel;
        this.f27774c = listingPinOption;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new LifeTimeStatusViewModel$getCategoryName$2$1(this.f27773b, this.f27774c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ListingLifeTimeItemViewModel listingLifeTimeItemViewModel;
        f11 = b.f();
        int i11 = this.f27772a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            listingLifeTimeItemViewModel = this.f27773b.f27760b;
            CategoriesRepositories h11 = listingLifeTimeItemViewModel.h();
            int catId = this.f27774c.getCatId();
            this.f27772a = 1;
            obj = h11.getCategory(catId, this);
            if (obj == f11) {
                return f11;
            }
        }
        CategoryEntity categoryEntity = (CategoryEntity) obj;
        this.f27773b.q((categoryEntity == null || (r4 = categoryEntity.getName()) == null) ? "" : "", this.f27774c.getDistrictId());
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((LifeTimeStatusViewModel$getCategoryName$2$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
