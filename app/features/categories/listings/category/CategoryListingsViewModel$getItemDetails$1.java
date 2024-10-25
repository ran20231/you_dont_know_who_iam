package com.forsale.app.features.categories.listings.category;

import com.forsale.app.datalayer.network.requestsbodies.GetListingDetailsBody;
import com.forsale.app.datalayer.network.requestsbodies.ListingDetailsType;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.services.ListingsService;
import com.forsale.app.utils.LocaleManager;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$getItemDetails$1", f = "CategoryListingsViewModel.kt", l = {523}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$getItemDetails$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super ListingItemDetails>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28497a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28498b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f28499c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$getItemDetails$1(CategoryListingsViewModel categoryListingsViewModel, int i11, zz.a<? super CategoryListingsViewModel$getItemDetails$1> aVar) {
        super(2, aVar);
        this.f28498b = categoryListingsViewModel;
        this.f28499c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsViewModel$getItemDetails$1(this.f28498b, this.f28499c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ListingsService listingsService;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28497a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    kotlin.f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.f.b(obj);
                listingsService = this.f28498b.f28383t0;
                GetListingDetailsBody createListingDetails$default = GetListingDetailsBody.Companion.createListingDetails$default(GetListingDetailsBody.Companion, new ListingDetailsType.AdvId(this.f28499c), LocaleManager.f39597a.g(), null, 4, null);
                this.f28497a = 1;
                obj = listingsService.getListingDetails(createListingDetails$default, this);
                if (obj == f11) {
                    return f11;
                }
            }
            return (ListingItemDetails) obj;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super ListingItemDetails> aVar) {
        return ((CategoryListingsViewModel$getItemDetails$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
