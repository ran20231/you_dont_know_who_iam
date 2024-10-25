package com.forsale.app.features.categories.listings.category;

import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.features.categories.listings.ListingsIntention;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$onModifyPredefinedFilter$1", f = "CategoryListingsViewModel.kt", l = {893}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$onModifyPredefinedFilter$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28548a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28549b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ GetListingsBody.FiltrationData f28550c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$onModifyPredefinedFilter$1(CategoryListingsViewModel categoryListingsViewModel, GetListingsBody.FiltrationData filtrationData, zz.a<? super CategoryListingsViewModel$onModifyPredefinedFilter$1> aVar) {
        super(2, aVar);
        this.f28549b = categoryListingsViewModel;
        this.f28550c = filtrationData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsViewModel$onModifyPredefinedFilter$1(this.f28549b, this.f28550c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ListingsIntention S2;
        GetListingsBody.FiltrationData A2;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28548a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            S2 = this.f28549b.S2();
            if (S2 == ListingsIntention.SEARCH) {
                GetListingsBody.FiltrationData.Companion companion = GetListingsBody.FiltrationData.Companion;
                A2 = this.f28549b.A2();
                if (!companion.compare(A2, this.f28550c)) {
                    MutableStateFlow<ListingsIntention> q22 = this.f28549b.q2();
                    ListingsIntention listingsIntention = ListingsIntention.RESET_SEARCH;
                    this.f28548a = 1;
                    if (q22.emit(listingsIntention, this) == f11) {
                        return f11;
                    }
                }
            }
            return wz.p.f75480a;
        }
        this.f28549b.J3();
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryListingsViewModel$onModifyPredefinedFilter$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
