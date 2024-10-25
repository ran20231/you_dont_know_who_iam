package com.forsale.app.datalayer.repositories;

import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.network.requestsbodies.AdvancedSearchBody;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange;
import com.forsale.app.datalayer.network.requestsbodies.MyListingsType;
import com.forsale.app.datalayer.network.requestsbodies.UserType;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.network.responses.RecommendedSectionsResponse;
import com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus;
import com.forsale.app.datalayer.network.services.AdvancedSearchService;
import com.forsale.app.datalayer.network.services.FavoritesService;
import com.forsale.app.datalayer.network.services.ItemSubscriptionsService;
import com.forsale.app.datalayer.network.services.ListingsService;
import com.forsale.app.datalayer.network.services.MyListingsService;
import com.forsale.app.features.categories.listings.ListingsIntention;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.categories.listings.SortingStates;
import com.forsale.app.features.powerpins.ListingsScreenType;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
/* compiled from: ListingsRepository.kt */
/* loaded from: classes2.dex */
public final class ListingsRepository {
    public static final int PAGE_SIZE = 30;
    public static final int THUMB_SIZE = 300;
    private final AdvancedSearchService advancedSearchService;
    private final CategoriesRepositories categoriesRepositories;
    private final ExtraAttributeRawRepository extraAttributeRawRepository;
    private final ExtraAttributesRepository extraAttributesRepository;
    private final FavoritesService favoritesService;
    private final ItemSubscriptionsService itemSubscriptionsService;
    private final ListingsService listingsService;
    private final MyListingsService myListingsService;
    private final jj.b prefs;
    private final RegionsRepository regionRepository;
    private final TranslationRepository translationRepository;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ListingsRepository.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ListingsRepository.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ListingsTypes.values().length];
            try {
                iArr[ListingsTypes.MY_FAVORITES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ListingsTypes.MY_LISTINGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ListingsTypes.WANTED_ITEMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ListingsTypes.OTHER_USER_ITEMS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ListingsTypes.USER_ITEMS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ListingsTypes.FOR_SALE_REALTY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ListingsTypes.MY_VIEW_HISTORY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ListingsTypes.SEARCH_SCREEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ListingsTypes.SPOTLIGHT_ALL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ListingsTypes.HOT_ZONES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ListingsTypes.FEATURED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ListingsTypes.BUSINESS_COMMERCIAL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ListingsRepository(ListingsService listingsService, FavoritesService favoritesService, MyListingsService myListingsService, AdvancedSearchService advancedSearchService, ItemSubscriptionsService itemSubscriptionsService, RegionsRepository regionRepository, TranslationRepository translationRepository, CategoriesRepositories categoriesRepositories, jj.b prefs, ExtraAttributesRepository extraAttributesRepository, ExtraAttributeRawRepository extraAttributeRawRepository) {
        o.i(listingsService, "listingsService");
        o.i(favoritesService, "favoritesService");
        o.i(myListingsService, "myListingsService");
        o.i(advancedSearchService, "advancedSearchService");
        o.i(itemSubscriptionsService, "itemSubscriptionsService");
        o.i(regionRepository, "regionRepository");
        o.i(translationRepository, "translationRepository");
        o.i(categoriesRepositories, "categoriesRepositories");
        o.i(prefs, "prefs");
        o.i(extraAttributesRepository, "extraAttributesRepository");
        o.i(extraAttributeRawRepository, "extraAttributeRawRepository");
        this.listingsService = listingsService;
        this.favoritesService = favoritesService;
        this.myListingsService = myListingsService;
        this.advancedSearchService = advancedSearchService;
        this.itemSubscriptionsService = itemSubscriptionsService;
        this.regionRepository = regionRepository;
        this.translationRepository = translationRepository;
        this.categoriesRepositories = categoriesRepositories;
        this.prefs = prefs;
        this.extraAttributesRepository = extraAttributesRepository;
        this.extraAttributeRawRepository = extraAttributeRawRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ListingsResponse changePinnedShuffleItemStatus(ListingsResponse listingsResponse, ItemStatus itemStatus) {
        ArrayList arrayList;
        int y11;
        ListingItemBrief copy;
        ListingsResponse.Listings listings = listingsResponse.getListings();
        List<ListingItemBrief> pinnedShuffleItems = listingsResponse.getListings().getPinnedShuffleItems();
        if (pinnedShuffleItems != null) {
            List<ListingItemBrief> list = pinnedShuffleItems;
            y11 = s.y(list, 10);
            arrayList = new ArrayList(y11);
            for (ListingItemBrief listingItemBrief : list) {
                copy = listingItemBrief.copy((r47 & 1) != 0 ? listingItemBrief.image : null, (r47 & 2) != 0 ? listingItemBrief._thumb : null, (r47 & 4) != 0 ? listingItemBrief.catId : 0, (r47 & 8) != 0 ? listingItemBrief.contact : null, (r47 & 16) != 0 ? listingItemBrief.datePublished : null, (r47 & 32) != 0 ? listingItemBrief.dateSort : null, (r47 & 64) != 0 ? listingItemBrief.doNotDisturb : null, (r47 & 128) != 0 ? listingItemBrief.f22351id : 0, (r47 & 256) != 0 ? listingItemBrief.imagesCount : 0, (r47 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? listingItemBrief.isHideMyNumber : 0, (r47 & 1024) != 0 ? listingItemBrief.isAnon : 0, (r47 & RecyclerView.l.FLAG_MOVED) != 0 ? listingItemBrief.isPrem : 0, (r47 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? listingItemBrief.isVideoPaid : 0, (r47 & 8192) != 0 ? listingItemBrief.isVoip : 0, (r47 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? listingItemBrief.price : Utils.DOUBLE_EPSILON, (r47 & 32768) != 0 ? listingItemBrief.regId : 0, (65536 & r47) != 0 ? listingItemBrief.status : itemStatus, (r47 & 131072) != 0 ? listingItemBrief.title : null, (r47 & 262144) != 0 ? listingItemBrief.url : null, (r47 & 524288) != 0 ? listingItemBrief.wasPromoted : 0, (r47 & 1048576) != 0 ? listingItemBrief.phone : null, (r47 & 2097152) != 0 ? listingItemBrief.districtNameDefault : null, (r47 & 4194304) != 0 ? listingItemBrief.districtNameLocalize : null, (r47 & 8388608) != 0 ? listingItemBrief.description : null, (r47 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? listingItemBrief.expireSoon : null, (r47 & 33554432) != 0 ? listingItemBrief.virtualTourThumb : null, (r47 & 67108864) != 0 ? listingItemBrief.extraAttrs : null, (r47 & 134217728) != 0 ? listingItemBrief.userType : null);
                copy.setCatName(listingItemBrief.getCatName());
                arrayList.add(copy);
            }
        } else {
            arrayList = null;
        }
        return ListingsResponse.copy$default(listingsResponse, 0, 0, 0, ListingsResponse.Listings.copy$default(listings, null, null, arrayList, null, null, null, 59, null), 0, null, null, null, 247, null);
    }

    public static /* synthetic */ Object getAdvancedSearch$default(ListingsRepository listingsRepository, int i11, String str, Integer num, GetListingsBody.FiltrationData filtrationData, SortingStates sortingStates, zz.a aVar, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            sortingStates = SortingStates.DEFAULT;
        }
        return listingsRepository.getAdvancedSearch(i11, str, num, filtrationData, sortingStates, aVar);
    }

    public static /* synthetic */ Object getAdvancedSearchListings$default(ListingsRepository listingsRepository, int i11, AdvancedSearchBody advancedSearchBody, List list, GetListingsBody.FiltrationData filtrationData, zz.a aVar, int i12, Object obj) {
        List list2;
        GetListingsBody.FiltrationData filtrationData2;
        if ((i12 & 4) != 0) {
            list2 = null;
        } else {
            list2 = list;
        }
        if ((i12 & 8) != 0) {
            filtrationData2 = null;
        } else {
            filtrationData2 = filtrationData;
        }
        return listingsRepository.getAdvancedSearchListings(i11, advancedSearchBody, list2, filtrationData2, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getAttributeOptions(java.util.List<com.forsale.app.datalayer.network.responses.ListingItemBrief.AttrInfo> r6, zz.a<? super java.util.List<com.forsale.app.datalayer.database.ExtraAttributeOptionEntity>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.forsale.app.datalayer.repositories.ListingsRepository$getAttributeOptions$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.datalayer.repositories.ListingsRepository$getAttributeOptions$1 r0 = (com.forsale.app.datalayer.repositories.ListingsRepository$getAttributeOptions$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.ListingsRepository$getAttributeOptions$1 r0 = new com.forsale.app.datalayer.repositories.ListingsRepository$getAttributeOptions$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r7)
            goto L73
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.f.b(r7)
            r7 = 0
            if (r6 == 0) goto L7c
            com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository r2 = r5.extraAttributeRawRepository
            com.forsale.app.features.postad.extraattributes.enums.AttributeType r4 = com.forsale.app.features.postad.extraattributes.enums.AttributeType.DROP_DOWN
            java.util.List r6 = com.forsale.app.utils.TypeExtensionsKt.k(r6, r4)
            if (r6 == 0) goto L6a
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.p.y(r6, r4)
            r7.<init>(r4)
            java.util.Iterator r6 = r6.iterator()
        L52:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L6a
            java.lang.Object r4 = r6.next()
            com.forsale.app.datalayer.network.responses.ListingItemBrief$AttrInfo r4 = (com.forsale.app.datalayer.network.responses.ListingItemBrief.AttrInfo) r4
            int r4 = r4.getId()
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.a.d(r4)
            r7.add(r4)
            goto L52
        L6a:
            r0.label = r3
            java.lang.Object r7 = r2.getExtraAttributeOptionsListByAttributeIds(r7, r0)
            if (r7 != r1) goto L73
            return r1
        L73:
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L7c
            java.util.List r6 = kotlin.collections.p.n()
            r7 = r6
        L7c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.ListingsRepository.getAttributeOptions(java.util.List, zz.a):java.lang.Object");
    }

    public static /* synthetic */ Object getGeneralListings$default(ListingsRepository listingsRepository, int i11, ListingsTypes listingsTypes, String str, String str2, Integer num, Integer num2, String str3, AdvancedSearchBody advancedSearchBody, MyListingsDateRange myListingsDateRange, List list, MyListingsType myListingsType, Integer num3, Integer num4, zz.a aVar, int i12, Object obj) {
        ListingsTypes listingsTypes2;
        String str4;
        String str5;
        Integer num5;
        Integer num6;
        String str6;
        AdvancedSearchBody advancedSearchBody2;
        MyListingsDateRange myListingsDateRange2;
        List list2;
        MyListingsType myListingsType2;
        Integer num7;
        Integer num8;
        List n11;
        if ((i12 & 2) != 0) {
            listingsTypes2 = null;
        } else {
            listingsTypes2 = listingsTypes;
        }
        if ((i12 & 4) != 0) {
            str4 = "";
        } else {
            str4 = str;
        }
        if ((i12 & 8) != 0) {
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i12 & 16) != 0) {
            num5 = null;
        } else {
            num5 = num;
        }
        if ((i12 & 32) != 0) {
            num6 = null;
        } else {
            num6 = num2;
        }
        if ((i12 & 64) != 0) {
            str6 = null;
        } else {
            str6 = str3;
        }
        if ((i12 & 128) != 0) {
            advancedSearchBody2 = null;
        } else {
            advancedSearchBody2 = advancedSearchBody;
        }
        if ((i12 & 256) != 0) {
            myListingsDateRange2 = null;
        } else {
            myListingsDateRange2 = myListingsDateRange;
        }
        if ((i12 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            n11 = r.n();
            list2 = n11;
        } else {
            list2 = list;
        }
        if ((i12 & 1024) != 0) {
            myListingsType2 = null;
        } else {
            myListingsType2 = myListingsType;
        }
        if ((i12 & RecyclerView.l.FLAG_MOVED) != 0) {
            num7 = null;
        } else {
            num7 = num3;
        }
        if ((i12 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            num8 = 30;
        } else {
            num8 = num4;
        }
        return listingsRepository.getGeneralListings(i11, listingsTypes2, str4, str5, num5, num6, str6, advancedSearchBody2, myListingsDateRange2, list2, myListingsType2, num7, num8, aVar);
    }

    public static /* synthetic */ Object getLatestListings$default(ListingsRepository listingsRepository, int i11, ListingsScreenType listingsScreenType, Integer num, String str, Integer num2, GetListingsBody.FiltrationData filtrationData, zz.a aVar, int i12, Object obj) {
        Integer num3;
        String str2;
        Integer num4;
        GetListingsBody.FiltrationData filtrationData2;
        if ((i12 & 4) != 0) {
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i12 & 8) != 0) {
            str2 = "";
        } else {
            str2 = str;
        }
        if ((i12 & 16) != 0) {
            num4 = null;
        } else {
            num4 = num2;
        }
        if ((i12 & 32) != 0) {
            filtrationData2 = null;
        } else {
            filtrationData2 = filtrationData;
        }
        return listingsRepository.getLatestListings(i11, listingsScreenType, num3, str2, num4, filtrationData2, aVar);
    }

    public static /* synthetic */ Object getNormalListings$default(ListingsRepository listingsRepository, int i11, ListingsScreenType listingsScreenType, Integer num, String str, Integer num2, GetListingsBody.FiltrationData filtrationData, UserType userType, Integer num3, String str2, ListingsIntention listingsIntention, SortingStates sortingStates, zz.a aVar, int i12, Object obj) {
        ListingsScreenType listingsScreenType2;
        Integer num4;
        String str3;
        Integer num5;
        GetListingsBody.FiltrationData filtrationData2;
        UserType userType2;
        Integer num6;
        String str4;
        ListingsIntention listingsIntention2;
        SortingStates sortingStates2;
        if ((i12 & 2) != 0) {
            listingsScreenType2 = null;
        } else {
            listingsScreenType2 = listingsScreenType;
        }
        if ((i12 & 4) != 0) {
            num4 = null;
        } else {
            num4 = num;
        }
        if ((i12 & 8) != 0) {
            str3 = "";
        } else {
            str3 = str;
        }
        if ((i12 & 16) != 0) {
            num5 = null;
        } else {
            num5 = num2;
        }
        if ((i12 & 32) != 0) {
            filtrationData2 = null;
        } else {
            filtrationData2 = filtrationData;
        }
        if ((i12 & 64) != 0) {
            userType2 = null;
        } else {
            userType2 = userType;
        }
        if ((i12 & 128) != 0) {
            num6 = 30;
        } else {
            num6 = num3;
        }
        if ((i12 & 256) != 0) {
            str4 = null;
        } else {
            str4 = str2;
        }
        if ((i12 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            listingsIntention2 = ListingsIntention.LISTINGS;
        } else {
            listingsIntention2 = listingsIntention;
        }
        if ((i12 & 1024) != 0) {
            sortingStates2 = SortingStates.DEFAULT;
        } else {
            sortingStates2 = sortingStates;
        }
        return listingsRepository.getNormalListings(i11, listingsScreenType2, num4, str3, num5, filtrationData2, userType2, num6, str4, listingsIntention2, sortingStates2, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[LOOP:0: B:18:0x0050->B:20:0x0056, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mapExtraAttributesToAttrInfo(java.util.List<com.forsale.app.datalayer.network.responses.ListingItemBrief> r12, zz.a<? super java.util.List<com.forsale.app.datalayer.network.responses.ListingItemBrief.AttrInfo>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.forsale.app.datalayer.repositories.ListingsRepository$mapExtraAttributesToAttrInfo$1
            if (r0 == 0) goto L13
            r0 = r13
            com.forsale.app.datalayer.repositories.ListingsRepository$mapExtraAttributesToAttrInfo$1 r0 = (com.forsale.app.datalayer.repositories.ListingsRepository$mapExtraAttributesToAttrInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.ListingsRepository$mapExtraAttributesToAttrInfo$1 r0 = new com.forsale.app.datalayer.repositories.ListingsRepository$mapExtraAttributesToAttrInfo$1
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r13)
            goto L3f
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            kotlin.f.b(r13)
            com.forsale.app.datalayer.repositories.ExtraAttributesRepository r13 = r11.extraAttributesRepository
            r0.label = r3
            java.lang.Object r13 = r13.getAttributesFormItemList(r12, r0)
            if (r13 != r1) goto L3f
            return r1
        L3f:
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r12 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.p.y(r13, r0)
            r12.<init>(r0)
            java.util.Iterator r13 = r13.iterator()
        L50:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r0 = r13.next()
            com.forsale.app.datalayer.database.ExtraAttributeEntity r0 = (com.forsale.app.datalayer.database.ExtraAttributeEntity) r0
            com.forsale.app.datalayer.network.responses.ListingItemBrief$AttrInfo r10 = new com.forsale.app.datalayer.network.responses.ListingItemBrief$AttrInfo
            int r2 = r0.getId()
            java.lang.String r3 = r0.getNameEn()
            java.lang.String r4 = r0.getNameAr()
            com.forsale.app.features.postad.extraattributes.enums.AttributeType$a r1 = com.forsale.app.features.postad.extraattributes.enums.AttributeType.Companion
            java.lang.String r5 = r0.getType()
            com.forsale.app.features.postad.extraattributes.enums.AttributeType r5 = r1.a(r5)
            java.lang.String r6 = r0.getImage()
            java.lang.String r7 = ""
            com.forsale.app.datalayer.database.ExtraAttributeEntity$AttrUnit r8 = r0.getUnit()
            r9 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r12.add(r10)
            goto L50
        L87:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.ListingsRepository.mapExtraAttributesToAttrInfo(java.util.List, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0089 -> B:21:0x008a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setListingCatName(java.util.List<com.forsale.app.datalayer.network.responses.ListingItemBrief> r24, zz.a<? super wz.p> r25) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.ListingsRepository.setListingCatName(java.util.List, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a8 -> B:27:0x00aa). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setListingsAttrsInfo(java.util.List<com.forsale.app.datalayer.network.responses.ListingItemBrief> r10, zz.a<? super wz.p> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.forsale.app.datalayer.repositories.ListingsRepository$setListingsAttrsInfo$1
            if (r0 == 0) goto L13
            r0 = r11
            com.forsale.app.datalayer.repositories.ListingsRepository$setListingsAttrsInfo$1 r0 = (com.forsale.app.datalayer.repositories.ListingsRepository$setListingsAttrsInfo$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.ListingsRepository$setListingsAttrsInfo$1 r0 = new com.forsale.app.datalayer.repositories.ListingsRepository$setListingsAttrsInfo$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L5c
            if (r2 == r4) goto L50
            if (r2 != r3) goto L48
            java.lang.Object r10 = r0.L$6
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.Object r2 = r0.L$5
            com.forsale.app.datalayer.network.responses.ListingItemBrief r2 = (com.forsale.app.datalayer.network.responses.ListingItemBrief) r2
            java.lang.Object r4 = r0.L$4
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r0.L$3
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.L$2
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r7 = r0.L$1
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r8 = r0.L$0
            com.forsale.app.datalayer.repositories.ListingsRepository r8 = (com.forsale.app.datalayer.repositories.ListingsRepository) r8
            kotlin.f.b(r11)
            goto Laa
        L48:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L50:
            java.lang.Object r10 = r0.L$1
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.repositories.ListingsRepository r2 = (com.forsale.app.datalayer.repositories.ListingsRepository) r2
            kotlin.f.b(r11)
            goto L6d
        L5c:
            kotlin.f.b(r11)
            r0.L$0 = r9
            r0.L$1 = r10
            r0.label = r4
            java.lang.Object r11 = r9.mapExtraAttributesToAttrInfo(r10, r0)
            if (r11 != r1) goto L6c
            return r1
        L6c:
            r2 = r9
        L6d:
            java.util.List r11 = (java.util.List) r11
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.p.y(r10, r5)
            r4.<init>(r5)
            java.util.Iterator r10 = r10.iterator()
            r5 = r10
            r8 = r2
            r10 = r4
            r4 = r11
        L84:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto Lb7
            java.lang.Object r11 = r5.next()
            r2 = r11
            com.forsale.app.datalayer.network.responses.ListingItemBrief r2 = (com.forsale.app.datalayer.network.responses.ListingItemBrief) r2
            r0.L$0 = r8
            r0.L$1 = r4
            r0.L$2 = r10
            r0.L$3 = r5
            r0.L$4 = r4
            r0.L$5 = r2
            r0.L$6 = r10
            r0.label = r3
            java.lang.Object r11 = r8.getAttributeOptions(r4, r0)
            if (r11 != r1) goto La8
            return r1
        La8:
            r6 = r10
            r7 = r4
        Laa:
            java.util.List r11 = (java.util.List) r11
            r2.updateAttrsInfo(r4, r11)
            wz.p r11 = wz.p.f75480a
            r10.add(r11)
            r10 = r6
            r4 = r7
            goto L84
        Lb7:
            java.util.List r10 = (java.util.List) r10
            wz.p r10 = wz.p.f75480a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.ListingsRepository.setListingsAttrsInfo(java.util.List, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0115  */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v18, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00b6 -> B:25:0x00b9). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x010f -> B:39:0x0110). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateAttrsInfo(com.forsale.app.datalayer.network.responses.RecommendedSectionsResponse r13, zz.a<? super com.forsale.app.datalayer.network.responses.RecommendedSectionsResponse> r14) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.ListingsRepository.updateAttrsInfo(com.forsale.app.datalayer.network.responses.RecommendedSectionsResponse, zz.a):java.lang.Object");
    }

    public final Object deviceId(zz.a<? super String> aVar) {
        return this.prefs.c().a(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0140 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x018e A[PHI: r1 
      PHI: (r1v18 java.lang.Object) = (r1v17 java.lang.Object), (r1v1 java.lang.Object) binds: [B:36:0x018b, B:14:0x0032] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getAdvancedSearch(int r31, java.lang.String r32, java.lang.Integer r33, com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData r34, com.forsale.app.features.categories.listings.SortingStates r35, zz.a<? super com.forsale.app.datalayer.network.responses.ListingsResponse> r36) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.ListingsRepository.getAdvancedSearch(int, java.lang.String, java.lang.Integer, com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData, com.forsale.app.features.categories.listings.SortingStates, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getAdvancedSearchListings(int r31, com.forsale.app.datalayer.network.requestsbodies.AdvancedSearchBody r32, java.util.List<java.lang.Integer> r33, com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData r34, zz.a<? super com.forsale.app.datalayer.network.responses.ListingsResponse> r35) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.ListingsRepository.getAdvancedSearchListings(int, com.forsale.app.datalayer.network.requestsbodies.AdvancedSearchBody, java.util.List, com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d A[PHI: r8 
      PHI: (r8v8 java.lang.Object) = (r8v7 java.lang.Object), (r8v1 java.lang.Object) binds: [B:21:0x006a, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getAutoCompleteSearch(java.lang.String r7, zz.a<? super java.util.List<com.forsale.app.datalayer.network.responses.autocompletesearch.AutoCompleteSearchResponse>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.forsale.app.datalayer.repositories.ListingsRepository$getAutoCompleteSearch$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.datalayer.repositories.ListingsRepository$getAutoCompleteSearch$1 r0 = (com.forsale.app.datalayer.repositories.ListingsRepository$getAutoCompleteSearch$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.ListingsRepository$getAutoCompleteSearch$1 r0 = new com.forsale.app.datalayer.repositories.ListingsRepository$getAutoCompleteSearch$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r8)
            goto L6d
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.L$1
            com.forsale.app.datalayer.network.services.ListingsService r7 = (com.forsale.app.datalayer.network.services.ListingsService) r7
            java.lang.Object r2 = r0.L$0
            java.lang.String r2 = (java.lang.String) r2
            kotlin.f.b(r8)
            goto L58
        L40:
            kotlin.f.b(r8)
            com.forsale.app.datalayer.network.services.ListingsService r8 = r6.listingsService
            com.forsale.app.utils.LocaleManager r2 = com.forsale.app.utils.LocaleManager.f39597a
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r2 = r2.h(r0)
            if (r2 != r1) goto L54
            return r1
        L54:
            r5 = r2
            r2 = r7
            r7 = r8
            r8 = r5
        L58:
            java.lang.String r8 = (java.lang.String) r8
            com.forsale.app.datalayer.network.requestsbodies.AutoCompleteSearchBody r4 = new com.forsale.app.datalayer.network.requestsbodies.AutoCompleteSearchBody
            r4.<init>(r8, r2)
            r8 = 0
            r0.L$0 = r8
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r8 = r7.getAutoCompleteSearch(r4, r0)
            if (r8 != r1) goto L6d
            return r1
        L6d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.ListingsRepository.getAutoCompleteSearch(java.lang.String, zz.a):java.lang.Object");
    }

    public final Object getForSaleRealty(int i11, zz.a<? super ListingsResponse> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ListingsRepository$getForSaleRealty$2(this, i11, null), aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x063e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0669 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x06a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x074a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x078a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x07f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0830 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0895 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x08cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x092c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x095d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x095e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x09a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x09a9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x09f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x09fa  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0a26 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0a27  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0a5d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0a64  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0a89  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x059b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x05e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x05ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getGeneralListings(int r40, com.forsale.app.features.categories.listings.ListingsTypes r41, java.lang.String r42, java.lang.String r43, java.lang.Integer r44, java.lang.Integer r45, java.lang.String r46, com.forsale.app.datalayer.network.requestsbodies.AdvancedSearchBody r47, com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange r48, java.util.List<java.lang.Integer> r49, com.forsale.app.datalayer.network.requestsbodies.MyListingsType r50, java.lang.Integer r51, java.lang.Integer r52, zz.a<? super com.forsale.app.datalayer.network.responses.ListingsResponse> r53) {
        /*
            Method dump skipped, instructions count: 2796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.ListingsRepository.getGeneralListings(int, com.forsale.app.features.categories.listings.ListingsTypes, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, com.forsale.app.datalayer.network.requestsbodies.AdvancedSearchBody, com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange, java.util.List, com.forsale.app.datalayer.network.requestsbodies.MyListingsType, java.lang.Integer, java.lang.Integer, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getHomeSections(zz.a<? super kotlin.Pair<? extends java.util.List<com.forsale.app.datalayer.network.responses.HomeSectionsResponse.VerticalSection>, java.lang.String>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.forsale.app.datalayer.repositories.ListingsRepository$getHomeSections$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.datalayer.repositories.ListingsRepository$getHomeSections$1 r0 = (com.forsale.app.datalayer.repositories.ListingsRepository$getHomeSections$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.ListingsRepository$getHomeSections$1 r0 = new com.forsale.app.datalayer.repositories.ListingsRepository$getHomeSections$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r2 = r0.L$3
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.L$2
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r0.L$1
            com.forsale.app.datalayer.network.responses.HomeSectionsResponse r5 = (com.forsale.app.datalayer.network.responses.HomeSectionsResponse) r5
            java.lang.Object r6 = r0.L$0
            com.forsale.app.datalayer.repositories.ListingsRepository r6 = (com.forsale.app.datalayer.repositories.ListingsRepository) r6
            kotlin.f.b(r8)
            goto L6f
        L3c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L44:
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.repositories.ListingsRepository r2 = (com.forsale.app.datalayer.repositories.ListingsRepository) r2
            kotlin.f.b(r8)
            goto L5f
        L4c:
            kotlin.f.b(r8)
            com.forsale.app.datalayer.network.services.ListingsService r8 = r7.listingsService
            wz.p r2 = wz.p.f75480a
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r8.getHomeSections(r2, r0)
            if (r8 != r1) goto L5e
            return r1
        L5e:
            r2 = r7
        L5f:
            com.forsale.app.datalayer.network.responses.HomeSectionsResponse r8 = (com.forsale.app.datalayer.network.responses.HomeSectionsResponse) r8
            java.util.List r4 = r8.getVerticalSections()
            r5 = r4
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            r6 = r2
            r2 = r5
            r5 = r8
        L6f:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L90
            java.lang.Object r8 = r2.next()
            com.forsale.app.datalayer.network.responses.HomeSectionsResponse$VerticalSection r8 = (com.forsale.app.datalayer.network.responses.HomeSectionsResponse.VerticalSection) r8
            java.util.List r8 = r8.getUserAds()
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r4
            r0.L$3 = r2
            r0.label = r3
            java.lang.Object r8 = r6.setListingCatName(r8, r0)
            if (r8 != r1) goto L6f
            return r1
        L90:
            kotlin.Pair r8 = new kotlin.Pair
            java.lang.String r0 = r5.getRecommendationCriteria()
            r8.<init>(r4, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.ListingsRepository.getHomeSections(zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0155 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x019d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0211 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0223 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0235 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getLatestListings(int r24, com.forsale.app.features.powerpins.ListingsScreenType r25, java.lang.Integer r26, java.lang.String r27, java.lang.Integer r28, com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData r29, zz.a<? super com.forsale.app.datalayer.network.responses.ListingsResponse> r30) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.ListingsRepository.getLatestListings(int, com.forsale.app.features.powerpins.ListingsScreenType, java.lang.Integer, java.lang.String, java.lang.Integer, com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x030c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x031d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x031e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getNormalListings(int r25, com.forsale.app.features.powerpins.ListingsScreenType r26, java.lang.Integer r27, java.lang.String r28, java.lang.Integer r29, com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData r30, com.forsale.app.datalayer.network.requestsbodies.UserType r31, java.lang.Integer r32, java.lang.String r33, com.forsale.app.features.categories.listings.ListingsIntention r34, com.forsale.app.features.categories.listings.SortingStates r35, zz.a<? super com.forsale.app.datalayer.network.responses.ListingsResponse> r36) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.ListingsRepository.getNormalListings(int, com.forsale.app.features.powerpins.ListingsScreenType, java.lang.Integer, java.lang.String, java.lang.Integer, com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData, com.forsale.app.datalayer.network.requestsbodies.UserType, java.lang.Integer, java.lang.String, com.forsale.app.features.categories.listings.ListingsIntention, com.forsale.app.features.categories.listings.SortingStates, zz.a):java.lang.Object");
    }

    public final Object getRecommendedSections(int i11, zz.a<? super RecommendedSectionsResponse> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ListingsRepository$getRecommendedSections$2(this, i11, null), aVar);
    }

    public final RegionsRepository getRegionRepository() {
        return this.regionRepository;
    }

    public final Object getSpotlightListings(zz.a<? super ListingsResponse> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new ListingsRepository$getSpotlightListings$2(this, null), aVar);
    }

    public final TranslationRepository getTranslationRepository() {
        return this.translationRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mapAttributesInfo(com.forsale.app.datalayer.network.responses.ListingsResponse r10, zz.a<? super com.forsale.app.datalayer.network.responses.ListingsResponse> r11) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.ListingsRepository.mapAttributesInfo(com.forsale.app.datalayer.network.responses.ListingsResponse, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mapCategoryName(com.forsale.app.datalayer.network.responses.ListingsResponse r10, zz.a<? super com.forsale.app.datalayer.network.responses.ListingsResponse> r11) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.ListingsRepository.mapCategoryName(com.forsale.app.datalayer.network.responses.ListingsResponse, zz.a):java.lang.Object");
    }
}
