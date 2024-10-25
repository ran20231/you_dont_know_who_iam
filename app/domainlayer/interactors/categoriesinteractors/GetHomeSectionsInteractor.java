package com.forsale.app.domainlayer.interactors.categoriesinteractors;

import com.forsale.adserver.datalayer.offersdata.OffersFactory;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.forsale.app.datalayer.repositories.ListingsRepository;
import com.forsale.app.datalayer.repositories.MasterDataRepository;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.features.categories.home.maincategories.VerticalSectionsTabs;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import t9.y0;
/* compiled from: GetHomeSectionsInteractor.kt */
/* loaded from: classes2.dex */
public final class GetHomeSectionsInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final ListingsRepository f22400a;

    /* renamed from: b  reason: collision with root package name */
    private final CategoriesRepositories f22401b;

    /* renamed from: c  reason: collision with root package name */
    private final RegionsRepository f22402c;

    /* renamed from: d  reason: collision with root package name */
    private final MasterDataRepository f22403d;

    /* renamed from: e  reason: collision with root package name */
    private final ApplicationResourcesRepository f22404e;

    /* renamed from: f  reason: collision with root package name */
    private final OffersFactory f22405f;

    /* renamed from: g  reason: collision with root package name */
    private final nc.a f22406g;

    /* compiled from: GetHomeSectionsInteractor.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22407a;

        static {
            int[] iArr = new int[VerticalSectionsTabs.values().length];
            try {
                iArr[VerticalSectionsTabs.TOP_USER_ADS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerticalSectionsTabs.TOP_COMMERCIAL_ADS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f22407a = iArr;
        }
    }

    public GetHomeSectionsInteractor(ListingsRepository listingRepo, CategoriesRepositories categoriesRepositories, RegionsRepository regionsRepository, MasterDataRepository masterDataRepository, ApplicationResourcesRepository resourcesRepository, OffersFactory offersFactory, nc.a getSwipeableListInteractor) {
        o.i(listingRepo, "listingRepo");
        o.i(categoriesRepositories, "categoriesRepositories");
        o.i(regionsRepository, "regionsRepository");
        o.i(masterDataRepository, "masterDataRepository");
        o.i(resourcesRepository, "resourcesRepository");
        o.i(offersFactory, "offersFactory");
        o.i(getSwipeableListInteractor, "getSwipeableListInteractor");
        this.f22400a = listingRepo;
        this.f22401b = categoriesRepositories;
        this.f22402c = regionsRepository;
        this.f22403d = masterDataRepository;
        this.f22404e = resourcesRepository;
        this.f22405f = offersFactory;
        this.f22406g = getSwipeableListInteractor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VerticalSectionsTabs j(boolean z11, VerticalSectionsTabs verticalSectionsTabs) {
        if (verticalSectionsTabs == null) {
            verticalSectionsTabs = VerticalSectionsTabs.TOP_USER_ADS;
        }
        if (!z11 && verticalSectionsTabs == VerticalSectionsTabs.TOP_USER_ADS) {
            return VerticalSectionsTabs.TOP_COMMERCIAL_ADS;
        }
        return verticalSectionsTabs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0115  */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0078 -> B:36:0x010d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00bd -> B:26:0x00d1). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x010a -> B:36:0x010d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(int r24, boolean r25, com.forsale.app.features.categories.home.maincategories.VerticalSectionsTabs r26, zz.a<? super java.util.List<com.forsale.app.domainlayer.interactors.categoriesinteractors.a.C0252a>> r27) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.domainlayer.interactors.categoriesinteractors.GetHomeSectionsInteractor.k(int, boolean, com.forsale.app.features.categories.home.maincategories.VerticalSectionsTabs, zz.a):java.lang.Object");
    }

    private final int m(VerticalSectionsTabs verticalSectionsTabs) {
        int i11 = a.f22407a[verticalSectionsTabs.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return y0.N9;
            }
            throw new NoWhenBranchMatchedException();
        }
        return y0.O9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0072 -> B:20:0x0075). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.util.List<com.forsale.app.datalayer.network.responses.ListingItemBrief> r14, zz.a<? super java.util.List<com.forsale.app.datalayer.network.responses.ListingItemBrief>> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.forsale.app.domainlayer.interactors.categoriesinteractors.GetHomeSectionsInteractor$updateCategoryData$1
            if (r0 == 0) goto L13
            r0 = r15
            com.forsale.app.domainlayer.interactors.categoriesinteractors.GetHomeSectionsInteractor$updateCategoryData$1 r0 = (com.forsale.app.domainlayer.interactors.categoriesinteractors.GetHomeSectionsInteractor$updateCategoryData$1) r0
            int r1 = r0.f22440g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22440g = r1
            goto L18
        L13:
            com.forsale.app.domainlayer.interactors.categoriesinteractors.GetHomeSectionsInteractor$updateCategoryData$1 r0 = new com.forsale.app.domainlayer.interactors.categoriesinteractors.GetHomeSectionsInteractor$updateCategoryData$1
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f22438e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f22440g
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r14 = r0.f22437d
            com.forsale.app.datalayer.network.responses.ListingItemBrief r14 = (com.forsale.app.datalayer.network.responses.ListingItemBrief) r14
            java.lang.Object r2 = r0.f22436c
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.f22435b
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r5 = r0.f22434a
            com.forsale.app.domainlayer.interactors.categoriesinteractors.GetHomeSectionsInteractor r5 = (com.forsale.app.domainlayer.interactors.categoriesinteractors.GetHomeSectionsInteractor) r5
            kotlin.f.b(r15)
            goto L75
        L39:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L41:
            kotlin.f.b(r15)
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r14 = r14.iterator()
            r5 = r13
            r2 = r14
            r4 = r15
        L52:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto L9b
            java.lang.Object r14 = r2.next()
            com.forsale.app.datalayer.network.responses.ListingItemBrief r14 = (com.forsale.app.datalayer.network.responses.ListingItemBrief) r14
            com.forsale.app.datalayer.repositories.CategoriesRepositories r15 = r5.f22401b
            int r6 = r14.getCatId()
            r0.f22434a = r5
            r0.f22435b = r4
            r0.f22436c = r2
            r0.f22437d = r14
            r0.f22440g = r3
            java.lang.Object r15 = r15.getCategory(r6, r0)
            if (r15 != r1) goto L75
            return r1
        L75:
            com.forsale.app.datalayer.database.CategoryEntity r15 = (com.forsale.app.datalayer.database.CategoryEntity) r15
            if (r15 == 0) goto L94
            com.forsale.app.utils.itemutils.TextHolder r12 = new com.forsale.app.utils.itemutils.TextHolder
            r7 = 0
            com.forsale.app.utils.itemutils.TextHolder$LocalizedText r8 = new com.forsale.app.utils.itemutils.TextHolder$LocalizedText
            java.lang.String r6 = r15.getNameAr()
            java.lang.String r15 = r15.getNameEn()
            r8.<init>(r6, r15)
            r9 = 0
            r10 = 5
            r11 = 0
            r6 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            r14.setCatName(r12)
            goto L95
        L94:
            r14 = 0
        L95:
            if (r14 == 0) goto L52
            r4.add(r14)
            goto L52
        L9b:
            java.util.List r4 = (java.util.List) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.domainlayer.interactors.categoriesinteractors.GetHomeSectionsInteractor.n(java.util.List, zz.a):java.lang.Object");
    }

    public final Object l(zz.a<? super Pair<? extends List<com.forsale.app.domainlayer.interactors.categoriesinteractors.a>, String>> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new GetHomeSectionsInteractor$invoke$2(this, null), aVar);
    }
}
