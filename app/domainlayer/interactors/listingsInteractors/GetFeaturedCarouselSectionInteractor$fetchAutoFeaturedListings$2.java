package com.forsale.app.domainlayer.interactors.listingsInteractors;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingItemBriefKt;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.features.categories.listings.items.listingItems.featuredListingItem.VerticalListingItemViewModel;
import g00.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import wz.p;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetFeaturedCarouselSectionInteractor.kt */
@d(c = "com.forsale.app.domainlayer.interactors.listingsInteractors.GetFeaturedCarouselSectionInteractor$fetchAutoFeaturedListings$2", f = "GetFeaturedCarouselSectionInteractor.kt", l = {35}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class GetFeaturedCarouselSectionInteractor$fetchAutoFeaturedListings$2 extends SuspendLambda implements l<a<? super List<? extends VerticalListingItemViewModel>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22467a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ GetFeaturedCarouselSectionInteractor f22468b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f22469c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFeaturedCarouselSectionInteractor$fetchAutoFeaturedListings$2(GetFeaturedCarouselSectionInteractor getFeaturedCarouselSectionInteractor, int i11, a<? super GetFeaturedCarouselSectionInteractor$fetchAutoFeaturedListings$2> aVar) {
        super(1, aVar);
        this.f22468b = getFeaturedCarouselSectionInteractor;
        this.f22469c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(a<?> aVar) {
        return new GetFeaturedCarouselSectionInteractor$fetchAutoFeaturedListings$2(this.f22468b, this.f22469c, aVar);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ Object invoke(a<? super List<? extends VerticalListingItemViewModel>> aVar) {
        return invoke2((a<? super List<VerticalListingItemViewModel>>) aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ea.a aVar;
        Object a11;
        List n11;
        List i11;
        int y11;
        b0 b0Var;
        b0 b0Var2;
        ApplicationResourcesRepository applicationResourcesRepository;
        nc.a aVar2;
        f11 = b.f();
        int i12 = this.f22467a;
        if (i12 != 0) {
            if (i12 == 1) {
                f.b(obj);
                a11 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            aVar = this.f22468b.f22459a;
            int i13 = this.f22469c;
            this.f22467a = 1;
            a11 = aVar.a(i13, 20, this);
            if (a11 == f11) {
                return f11;
            }
        }
        ListingsResponse listingsResponse = (ListingsResponse) a11;
        if (listingsResponse != null) {
            GetFeaturedCarouselSectionInteractor getFeaturedCarouselSectionInteractor = this.f22468b;
            i11 = getFeaturedCarouselSectionInteractor.i(listingsResponse.getListings());
            List<Integer> itemsIds = ListingItemBriefKt.itemsIds(i11);
            ArrayList arrayList = null;
            if (i11.isEmpty()) {
                i11 = null;
            }
            if (i11 != null) {
                List<ListingItemBrief> list = i11;
                y11 = s.y(list, 10);
                ArrayList arrayList2 = new ArrayList(y11);
                for (ListingItemBrief listingItemBrief : list) {
                    ListingsResponse.UISettings.ListingsSettings listingsSettings = listingsResponse.getUiSettings().getListingsSettings();
                    b0Var = getFeaturedCarouselSectionInteractor.f22463e;
                    b0Var2 = getFeaturedCarouselSectionInteractor.f22464f;
                    applicationResourcesRepository = getFeaturedCarouselSectionInteractor.f22461c;
                    aVar2 = getFeaturedCarouselSectionInteractor.f22460b;
                    arrayList2.add(new VerticalListingItemViewModel(listingItemBrief, listingsSettings, b0Var, b0Var2, applicationResourcesRepository, null, nc.a.b(aVar2, itemsIds, listingItemBrief.getId(), 0, false, 12, null), 32, null));
                }
                arrayList = arrayList2;
            }
            if (arrayList != null) {
                return arrayList;
            }
        }
        n11 = r.n();
        return n11;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(a<? super List<VerticalListingItemViewModel>> aVar) {
        return ((GetFeaturedCarouselSectionInteractor$fetchAutoFeaturedListings$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
