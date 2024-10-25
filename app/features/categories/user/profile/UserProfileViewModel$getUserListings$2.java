package com.forsale.app.features.categories.user.profile;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingItemBriefKt;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.ListingsRepository;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.utils.analytics.AnalyticsDetailsSource;
import g00.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.user.profile.UserProfileViewModel$getUserListings$2", f = "UserProfileViewModel.kt", l = {207}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class UserProfileViewModel$getUserListings$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31198a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f31199b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ UserProfileViewModel f31200c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f31201d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Integer f31202e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileViewModel$getUserListings$2(UserProfileViewModel userProfileViewModel, String str, Integer num, zz.a<? super UserProfileViewModel$getUserListings$2> aVar) {
        super(2, aVar);
        this.f31200c = userProfileViewModel;
        this.f31201d = str;
        this.f31202e = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        UserProfileViewModel$getUserListings$2 userProfileViewModel$getUserListings$2 = new UserProfileViewModel$getUserListings$2(this.f31200c, this.f31201d, this.f31202e, aVar);
        userProfileViewModel$getUserListings$2.f31199b = obj;
        return userProfileViewModel$getUserListings$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ListingsRepository listingsRepository;
        Object generalListings$default;
        CoroutineScope coroutineScope;
        List E0;
        int y11;
        b0 b0Var;
        ApplicationResourcesRepository applicationResourcesRepository;
        nc.a aVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31198a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
                coroutineScope = (CoroutineScope) this.f31199b;
                generalListings$default = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.f31199b;
            listingsRepository = this.f31200c.f31180q0;
            ListingsTypes listingsTypes = ListingsTypes.USER_ITEMS;
            String str = this.f31201d;
            Integer num = this.f31202e;
            this.f31199b = coroutineScope2;
            this.f31198a = 1;
            generalListings$default = ListingsRepository.getGeneralListings$default(listingsRepository, 1, listingsTypes, "", str, num, null, null, null, null, null, null, null, null, this, 8160, null);
            if (generalListings$default == f11) {
                return f11;
            }
            coroutineScope = coroutineScope2;
        }
        ListingsResponse listingsResponse = (ListingsResponse) generalListings$default;
        if (listingsResponse != null) {
            UserProfileViewModel userProfileViewModel = this.f31200c;
            E0 = CollectionsKt___CollectionsKt.E0(listingsResponse.getListings().getNormalItems(), listingsResponse.getListings().getPinnedItems());
            List<Integer> itemsIds = ListingItemBriefKt.itemsIds(E0);
            List<ListingItemBrief> list = E0;
            y11 = s.y(list, 10);
            ArrayList arrayList = new ArrayList(y11);
            for (ListingItemBrief listingItemBrief : list) {
                ListingsResponse.UISettings.ListingsSettings listingsSettings = listingsResponse.getUiSettings().getListingsSettings();
                b0 b0Var2 = userProfileViewModel.f31185v0;
                b0 b0Var3 = userProfileViewModel.f31186w0;
                applicationResourcesRepository = userProfileViewModel.f31175l0;
                UserProfileViewModel$getUserListings$2$1$1$1 userProfileViewModel$getUserListings$2$1$1$1 = new p<ListingItemBrief, List<? extends Object>, wz.p>() { // from class: com.forsale.app.features.categories.user.profile.UserProfileViewModel$getUserListings$2$1$1$1
                    public final void b(ListingItemBrief listingItemBrief2, List<? extends Object> list2) {
                        o.i(listingItemBrief2, "<anonymous parameter 0>");
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(ListingItemBrief listingItemBrief2, List<? extends Object> list2) {
                        b(listingItemBrief2, list2);
                        return wz.p.f75480a;
                    }
                };
                String value = AnalyticsDetailsSource.USER_PROFILE_LISTINGS.getValue();
                ArrayList arrayList2 = arrayList;
                UserProfileViewModel userProfileViewModel2 = userProfileViewModel;
                aVar = userProfileViewModel2.f31184u0;
                arrayList2.add(new zc.b(listingItemBrief, listingsSettings, b0Var2, b0Var3, applicationResourcesRepository, userProfileViewModel$getUserListings$2$1$1$1, null, null, value, false, false, null, 0, coroutineScope, nc.a.b(aVar, itemsIds, listingItemBrief.getId(), 0, false, 12, null), 7872, null));
                arrayList = arrayList2;
                userProfileViewModel = userProfileViewModel2;
            }
            b0Var = userProfileViewModel.B0;
            b0Var.postValue(arrayList);
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((UserProfileViewModel$getUserListings$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
