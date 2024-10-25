package com.forsale.app.features.categories.listings.category;

import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.features.categories.listings.filtration.district.DistrictsMediator;
import com.forsale.app.utils.OneShotEventHandler;
import g00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$districtsMediator$1", f = "CategoryListingsViewModel.kt", l = {514}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$districtsMediator$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super DistrictsMediator>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28470a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28471b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$districtsMediator$1(CategoryListingsViewModel categoryListingsViewModel, zz.a<? super CategoryListingsViewModel$districtsMediator$1> aVar) {
        super(2, aVar);
        this.f28471b = categoryListingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsViewModel$districtsMediator$1(this.f28471b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        DistrictsRepository districtsRepository;
        OneShotEventHandler u22;
        DistrictEntity districtEntity;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28470a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            districtsRepository = this.f28471b.f28377q0;
            this.f28470a = 1;
            obj = districtsRepository.getMainDistricts(this);
            if (obj == f11) {
                return f11;
            }
        }
        u22 = this.f28471b.u2();
        districtEntity = this.f28471b.H0;
        return new DistrictsMediator((List) obj, u22, districtEntity);
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super DistrictsMediator> aVar) {
        return ((CategoryListingsViewModel$districtsMediator$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
