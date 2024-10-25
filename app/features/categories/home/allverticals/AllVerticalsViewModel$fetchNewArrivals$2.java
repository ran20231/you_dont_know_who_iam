package com.forsale.app.features.categories.home.allverticals;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingItemBriefKt;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel;
import com.forsale.app.features.categories.listings.items.listingItems.featuredListingItem.VerticalListingItemViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.s;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AllVerticalsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$fetchNewArrivals$2", f = "AllVerticalsViewModel.kt", l = {283}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AllVerticalsViewModel$fetchNewArrivals$2 extends SuspendLambda implements g00.l<zz.a<? super AllVerticalsViewModel.e>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23447a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AllVerticalsViewModel f23448b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllVerticalsViewModel$fetchNewArrivals$2(AllVerticalsViewModel allVerticalsViewModel, zz.a<? super AllVerticalsViewModel$fetchNewArrivals$2> aVar) {
        super(1, aVar);
        this.f23448b = allVerticalsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new AllVerticalsViewModel$fetchNewArrivals$2(this.f23448b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ea.b bVar;
        Object a11;
        int y11;
        b0 b0Var;
        b0 b0Var2;
        ApplicationResourcesRepository applicationResourcesRepository;
        nc.a aVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f23447a;
        boolean z11 = true;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
                a11 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            bVar = this.f23448b.f23390i;
            int id2 = this.f23448b.Q().getId();
            this.f23447a = 1;
            a11 = bVar.a(id2, this);
            if (a11 == f11) {
                return f11;
            }
        }
        AllVerticalsViewModel allVerticalsViewModel = this.f23448b;
        ListingsResponse listingsResponse = (ListingsResponse) a11;
        List<ListingItemBrief> normalItems = listingsResponse.getListings().getNormalItems();
        if (normalItems != null && !normalItems.isEmpty()) {
            z11 = false;
        }
        if (z11) {
            return AllVerticalsViewModel.e.a.f23426a;
        }
        List<Integer> itemsIds = ListingItemBriefKt.itemsIds(listingsResponse.getListings().getNormalItems());
        ListingsResponse.UISettings.Label title = listingsResponse.getUiSettings().getPinningSettings().getTitle();
        ListingsResponse.UISettings.Label subtitle = listingsResponse.getUiSettings().getPinningSettings().getSubtitle();
        List<ListingItemBrief> normalItems2 = listingsResponse.getListings().getNormalItems();
        y11 = s.y(normalItems2, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (ListingItemBrief listingItemBrief : normalItems2) {
            ListingsResponse.UISettings.ListingsSettings listingsSettings = listingsResponse.getUiSettings().getListingsSettings();
            b0Var = allVerticalsViewModel.F;
            b0Var2 = allVerticalsViewModel.G;
            applicationResourcesRepository = allVerticalsViewModel.f23385d;
            aVar = allVerticalsViewModel.f23392x;
            arrayList.add(new VerticalListingItemViewModel(listingItemBrief, listingsSettings, b0Var, b0Var2, applicationResourcesRepository, null, nc.a.b(aVar, itemsIds, listingItemBrief.getId(), 0, false, 12, null), 32, null));
        }
        return new AllVerticalsViewModel.d(title, subtitle, arrayList);
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super AllVerticalsViewModel.e> aVar) {
        return ((AllVerticalsViewModel$fetchNewArrivals$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
