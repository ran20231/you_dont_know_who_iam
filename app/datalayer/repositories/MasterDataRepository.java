package com.forsale.app.datalayer.repositories;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.room.RoomDatabaseKt;
import com.forsale.app.datalayer.database.AppCacheDatabase;
import com.forsale.app.datalayer.database.BottomTipEntity;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.MasterDataBottomTooltipSettings;
import com.forsale.app.datalayer.database.MasterDataDatabase;
import com.forsale.app.datalayer.database.MasterDataMiscModel;
import com.forsale.app.datalayer.database.MasterDataModel;
import com.forsale.app.datalayer.database.repositories.AgentLocationDao;
import com.forsale.app.datalayer.database.repositories.CategoryExtraAttributeDao;
import com.forsale.app.datalayer.network.services.MasterDataService;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.s;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import wz.p;
/* compiled from: MasterDataRepository.kt */
/* loaded from: classes2.dex */
public final class MasterDataRepository {
    public static final int $stable = 8;
    private final AgentDao agentDao;
    private final AgentLocationDao agentLocationDao;
    private final AppCacheDatabase appCacheDatabase;
    private final BottomTipDao bottomTipDao;
    private final CategoryDao categoryDao;
    private final CategoryDistrictDao categoryDistrictsDao;
    private final CategoryExtraAttributeDao categoryExtraAttributeDao;
    private final DirectoryCategoryDao directoryCategoryDao;
    private final DistrictDao districtDao;
    private final ExtraAttributeDao extraAttributeDao;
    private final ExtraAttributeGroupDao extraAttributeGroupDao;
    private final ExtraAttributeOptionDao extraAttributeOptionDao;
    private final ImagesRepository imagesRepository;
    private final CoroutineDispatcher ioDispatcher;
    private final ListingDetailsEntityRepository listingDetailsEntityRepository;
    private final LocationDao locationDao;
    private final MasterDataDatabase masterDataDatabase;
    private final MasterDataService masterDataService;
    private final jj.b prefs;
    private final ProhibitedKeywordDao prohibitedKeywordDao;
    private final RegionDao regionDao;

    public MasterDataRepository(jj.b prefs, MasterDataDatabase masterDataDatabase, AppCacheDatabase appCacheDatabase, MasterDataService masterDataService, CategoryDao categoryDao, ExtraAttributeDao extraAttributeDao, ExtraAttributeGroupDao extraAttributeGroupDao, ExtraAttributeOptionDao extraAttributeOptionDao, CategoryExtraAttributeDao categoryExtraAttributeDao, AgentDao agentDao, LocationDao locationDao, AgentLocationDao agentLocationDao, RegionDao regionDao, DistrictDao districtDao, ProhibitedKeywordDao prohibitedKeywordDao, DirectoryCategoryDao directoryCategoryDao, CategoryDistrictDao categoryDistrictsDao, BottomTipDao bottomTipDao, ImagesRepository imagesRepository, ListingDetailsEntityRepository listingDetailsEntityRepository, CoroutineDispatcher ioDispatcher) {
        o.i(prefs, "prefs");
        o.i(masterDataDatabase, "masterDataDatabase");
        o.i(appCacheDatabase, "appCacheDatabase");
        o.i(masterDataService, "masterDataService");
        o.i(categoryDao, "categoryDao");
        o.i(extraAttributeDao, "extraAttributeDao");
        o.i(extraAttributeGroupDao, "extraAttributeGroupDao");
        o.i(extraAttributeOptionDao, "extraAttributeOptionDao");
        o.i(categoryExtraAttributeDao, "categoryExtraAttributeDao");
        o.i(agentDao, "agentDao");
        o.i(locationDao, "locationDao");
        o.i(agentLocationDao, "agentLocationDao");
        o.i(regionDao, "regionDao");
        o.i(districtDao, "districtDao");
        o.i(prohibitedKeywordDao, "prohibitedKeywordDao");
        o.i(directoryCategoryDao, "directoryCategoryDao");
        o.i(categoryDistrictsDao, "categoryDistrictsDao");
        o.i(bottomTipDao, "bottomTipDao");
        o.i(imagesRepository, "imagesRepository");
        o.i(listingDetailsEntityRepository, "listingDetailsEntityRepository");
        o.i(ioDispatcher, "ioDispatcher");
        this.prefs = prefs;
        this.masterDataDatabase = masterDataDatabase;
        this.appCacheDatabase = appCacheDatabase;
        this.masterDataService = masterDataService;
        this.categoryDao = categoryDao;
        this.extraAttributeDao = extraAttributeDao;
        this.extraAttributeGroupDao = extraAttributeGroupDao;
        this.extraAttributeOptionDao = extraAttributeOptionDao;
        this.categoryExtraAttributeDao = categoryExtraAttributeDao;
        this.agentDao = agentDao;
        this.locationDao = locationDao;
        this.agentLocationDao = agentLocationDao;
        this.regionDao = regionDao;
        this.districtDao = districtDao;
        this.prohibitedKeywordDao = prohibitedKeywordDao;
        this.directoryCategoryDao = directoryCategoryDao;
        this.categoryDistrictsDao = categoryDistrictsDao;
        this.bottomTipDao = bottomTipDao;
        this.imagesRepository = imagesRepository;
        this.listingDetailsEntityRepository = listingDetailsEntityRepository;
        this.ioDispatcher = ioDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object clearCachedListing(java.util.List<com.forsale.app.datalayer.database.CategoryEntity> r6, zz.a<? super wz.p> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.forsale.app.datalayer.repositories.MasterDataRepository$clearCachedListing$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.datalayer.repositories.MasterDataRepository$clearCachedListing$1 r0 = (com.forsale.app.datalayer.repositories.MasterDataRepository$clearCachedListing$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.MasterDataRepository$clearCachedListing$1 r0 = new com.forsale.app.datalayer.repositories.MasterDataRepository$clearCachedListing$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r7)
            goto L73
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$1
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.repositories.MasterDataRepository r2 = (com.forsale.app.datalayer.repositories.MasterDataRepository) r2
            kotlin.f.b(r7)
            goto L53
        L40:
            kotlin.f.b(r7)
            com.forsale.app.datalayer.repositories.ListingDetailsEntityRepository r7 = r5.listingDetailsEntityRepository
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r7.getSingle(r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r2 = r5
        L53:
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity r7 = (com.forsale.app.datalayer.network.entities.ListingDetailsEntity) r7
            if (r7 == 0) goto L73
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            com.forsale.app.datalayer.database.CategoryEntity r7 = r7.getCategory()
            boolean r6 = kotlin.collections.p.b0(r6, r7)
            if (r6 == 0) goto L73
            com.forsale.app.datalayer.repositories.ListingDetailsEntityRepository r6 = r2.listingDetailsEntityRepository
            r7 = 0
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r6 = r6.deleteSuspended(r0)
            if (r6 != r1) goto L73
            return r1
        L73:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.MasterDataRepository.clearCachedListing(java.util.List, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object findBottomToolTip(String str, List<BottomTipEntity> list, zz.a<? super BottomTipEntity> aVar) {
        for (Object obj : list) {
            if (o.d(((BottomTipEntity) obj).getTabId(), str)) {
                return obj;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object mapMasterBottomTipsToBottomTips(List<MasterDataBottomTooltipSettings> list, zz.a<? super List<BottomTipEntity>> aVar) {
        int y11;
        List<MasterDataBottomTooltipSettings> list2 = list;
        y11 = s.y(list2, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (MasterDataBottomTooltipSettings masterDataBottomTooltipSettings : list2) {
            arrayList.add(new BottomTipEntity(0, masterDataBottomTooltipSettings.getTabId().name(), masterDataBottomTooltipSettings.getResetCount(), masterDataBottomTooltipSettings.getOrder(), masterDataBottomTooltipSettings.getMaxViewsSessions(), masterDataBottomTooltipSettings.getDurationMilliseconds(), 0, false, 193, null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object preLoadImages(List<String> list, zz.a<? super List<p>> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new MasterDataRepository$preLoadImages$2(list, this, null), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object preloadMasterDataImages(com.forsale.app.datalayer.database.MasterDataModel r6, zz.a<? super wz.p> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.forsale.app.datalayer.repositories.MasterDataRepository$preloadMasterDataImages$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.datalayer.repositories.MasterDataRepository$preloadMasterDataImages$1 r0 = (com.forsale.app.datalayer.repositories.MasterDataRepository$preloadMasterDataImages$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.MasterDataRepository$preloadMasterDataImages$1 r0 = new com.forsale.app.datalayer.repositories.MasterDataRepository$preloadMasterDataImages$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.L$0
            java.util.List r6 = (java.util.List) r6
            kotlin.f.b(r7)
            goto L72
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.f.b(r7)
            com.forsale.app.datalayer.database.MasterDataMiscModel r6 = r6.getMisc()
            if (r6 == 0) goto L72
            r7 = 5
            java.lang.String[] r7 = new java.lang.String[r7]
            r2 = 0
            java.lang.String r4 = r6.getPinImage()
            r7[r2] = r4
            java.lang.String r2 = r6.getPinWaitingImage()
            r7[r3] = r2
            r2 = 2
            java.lang.String r4 = r6.getDraftImage()
            r7[r2] = r4
            r2 = 3
            java.lang.String r4 = r6.getQuarantineImage()
            r7[r2] = r4
            r2 = 4
            java.lang.String r6 = r6.getFeaturedImage()
            r7[r2] = r6
            java.util.List r6 = kotlin.collections.p.q(r7)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r6 = r5.preLoadImages(r6, r0)
            if (r6 != r1) goto L72
            return r1
        L72:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.MasterDataRepository.preloadMasterDataImages(com.forsale.app.datalayer.database.MasterDataModel, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateAgentLocations(java.util.List<com.forsale.app.datalayer.database.AgentLocationEntity> r9, zz.a<? super wz.p> r10) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.MasterDataRepository.updateAgentLocations(java.util.List, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateAgents(java.util.List<com.forsale.app.datalayer.database.AgentEntity> r9, zz.a<? super wz.p> r10) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.MasterDataRepository.updateAgents(java.util.List, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateAppCacheTables(MasterDataModel masterDataModel, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = RoomDatabaseKt.d(this.appCacheDatabase, new MasterDataRepository$updateAppCacheTables$2(masterDataModel, this, null), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateBottomTipSettings(java.util.List<com.forsale.app.datalayer.database.MasterDataBottomTooltipSettings> r9, zz.a<? super wz.p> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.forsale.app.datalayer.repositories.MasterDataRepository$updateBottomTipSettings$1
            if (r0 == 0) goto L13
            r0 = r10
            com.forsale.app.datalayer.repositories.MasterDataRepository$updateBottomTipSettings$1 r0 = (com.forsale.app.datalayer.repositories.MasterDataRepository$updateBottomTipSettings$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.MasterDataRepository$updateBottomTipSettings$1 r0 = new com.forsale.app.datalayer.repositories.MasterDataRepository$updateBottomTipSettings$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L54
            if (r2 == r6) goto L48
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            goto L37
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            kotlin.f.b(r10)
            goto La9
        L3c:
            java.lang.Object r9 = r0.L$1
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.repositories.MasterDataRepository r2 = (com.forsale.app.datalayer.repositories.MasterDataRepository) r2
            kotlin.f.b(r10)
            goto L7b
        L48:
            java.lang.Object r9 = r0.L$1
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.repositories.MasterDataRepository r2 = (com.forsale.app.datalayer.repositories.MasterDataRepository) r2
            kotlin.f.b(r10)
            goto L69
        L54:
            kotlin.f.b(r10)
            if (r9 == 0) goto La9
            com.forsale.app.datalayer.repositories.BottomTipDao r10 = r8.bottomTipDao
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r6
            java.lang.Object r10 = r10.getAllBottomTips(r0)
            if (r10 != r1) goto L68
            return r1
        L68:
            r2 = r8
        L69:
            java.util.List r10 = (java.util.List) r10
            r0.L$0 = r2
            r0.L$1 = r10
            r0.label = r5
            java.lang.Object r9 = r2.mapMasterBottomTipsToBottomTips(r9, r0)
            if (r9 != r1) goto L78
            return r1
        L78:
            r7 = r10
            r10 = r9
            r9 = r7
        L7b:
            java.util.List r10 = (java.util.List) r10
            r5 = r9
            java.util.Collection r5 = (java.util.Collection) r5
            if (r5 == 0) goto L8a
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L89
            goto L8a
        L89:
            r6 = 0
        L8a:
            r5 = 0
            if (r6 == 0) goto L9c
            com.forsale.app.datalayer.repositories.BottomTipDao r9 = r2.bottomTipDao
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r4
            java.lang.Object r9 = r9.onInsertAll(r10, r0)
            if (r9 != r1) goto La9
            return r1
        L9c:
            r0.L$0 = r5
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r9 = r2.updateBottomTips(r10, r9, r0)
            if (r9 != r1) goto La9
            return r1
        La9:
            wz.p r9 = wz.p.f75480a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.MasterDataRepository.updateBottomTipSettings(java.util.List, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00d3 -> B:40:0x00d5). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d7 -> B:21:0x0079). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateBottomTips(java.util.List<com.forsale.app.datalayer.database.BottomTipEntity> r11, java.util.List<com.forsale.app.datalayer.database.BottomTipEntity> r12, zz.a<? super wz.p> r13) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.MasterDataRepository.updateBottomTips(java.util.List, java.util.List, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateBottomToolTip(BottomTipEntity bottomTipEntity, BottomTipEntity bottomTipEntity2, zz.a<? super p> aVar) {
        Object f11;
        Object f12;
        if (bottomTipEntity.getResetCount() > bottomTipEntity2.getResetCount()) {
            Object updateTipAndResetCount = this.bottomTipDao.updateTipAndResetCount(bottomTipEntity.getId(), bottomTipEntity.getTabId(), bottomTipEntity.getResetCount(), bottomTipEntity.getTabOrder(), bottomTipEntity.getMaxViewsSessions(), bottomTipEntity.getDurationMilliseconds(), 0, aVar);
            f12 = kotlin.coroutines.intrinsics.b.f();
            if (updateTipAndResetCount == f12) {
                return updateTipAndResetCount;
            }
            return p.f75480a;
        }
        Object updateTip = this.bottomTipDao.updateTip(bottomTipEntity.getId(), bottomTipEntity.getTabId(), bottomTipEntity.getResetCount(), bottomTipEntity.getTabOrder(), bottomTipEntity.getMaxViewsSessions(), bottomTipEntity.getDurationMilliseconds(), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (updateTip == f11) {
            return updateTip;
        }
        return p.f75480a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0104 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateCategories(java.util.List<com.forsale.app.datalayer.database.CategoryEntity> r10, zz.a<? super wz.p> r11) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.MasterDataRepository.updateCategories(java.util.List, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateCategoryDistricts(java.util.List<com.forsale.app.datalayer.database.CategoryDistrict> r9, zz.a<? super wz.p> r10) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.MasterDataRepository.updateCategoryDistricts(java.util.List, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateCategoryExtraAttributes(java.util.List<com.forsale.app.datalayer.database.CategoryExtraAttributeEntity> r9, zz.a<? super wz.p> r10) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.MasterDataRepository.updateCategoryExtraAttributes(java.util.List, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateDirectoryCategories(java.util.List<com.forsale.app.datalayer.database.DirectoryCategoryEntity> r9, zz.a<? super wz.p> r10) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.MasterDataRepository.updateDirectoryCategories(java.util.List, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateDistricts(java.util.List<com.forsale.app.datalayer.database.DistrictEntity> r9, zz.a<? super wz.p> r10) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.MasterDataRepository.updateDistricts(java.util.List, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateExtraAttributeGroups(java.util.List<com.forsale.app.datalayer.database.ExtraAttributeGroupEntity> r9, zz.a<? super wz.p> r10) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.MasterDataRepository.updateExtraAttributeGroups(java.util.List, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateExtraAttributeOptions(java.util.List<com.forsale.app.datalayer.database.ExtraAttributeOptionEntity> r9, zz.a<? super wz.p> r10) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.MasterDataRepository.updateExtraAttributeOptions(java.util.List, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateExtraAttributes(java.util.List<com.forsale.app.datalayer.database.ExtraAttributeEntity> r9, zz.a<? super wz.p> r10) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.MasterDataRepository.updateExtraAttributes(java.util.List, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateLocations(java.util.List<com.forsale.app.datalayer.database.LocationEntity> r9, zz.a<? super wz.p> r10) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.MasterDataRepository.updateLocations(java.util.List, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateProhibitedkeywords(java.util.List<com.forsale.app.datalayer.database.ProhibitedKeywordEntity> r9, zz.a<? super wz.p> r10) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.MasterDataRepository.updateProhibitedkeywords(java.util.List, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateRegions(java.util.List<com.forsale.app.datalayer.database.RegionEntity> r9, zz.a<? super wz.p> r10) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.MasterDataRepository.updateRegions(java.util.List, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0478 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0491 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0510 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0555 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x056e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0587 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x05a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0354 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0372 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x038b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0407 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0420 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0439 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateSharedPreferences(com.forsale.app.datalayer.database.MasterDataModel r10, zz.a<? super wz.p> r11) {
        /*
            Method dump skipped, instructions count: 1566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.MasterDataRepository.updateSharedPreferences(com.forsale.app.datalayer.database.MasterDataModel, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateTables(MasterDataModel masterDataModel, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = RoomDatabaseKt.d(this.masterDataDatabase, new MasterDataRepository$updateTables$2(masterDataModel, this, null), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }

    public final Object clearMasterDataTimeStamp(zz.a<? super p> aVar) {
        Object f11;
        Object a11 = this.prefs.h().a(aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }

    public final Object getCategoryById(int i11, zz.a<? super CategoryEntity> aVar) {
        return this.categoryDao.getCategoryById(i11, aVar);
    }

    public final Object getLastUpdateTimeStamp(zz.a<? super String> aVar) {
        return this.prefs.h().k(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[PHI: r6 
      PHI: (r6v7 java.lang.Object) = (r6v6 java.lang.Object), (r6v1 java.lang.Object) binds: [B:20:0x005c, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getMasterData(zz.a<? super com.forsale.app.datalayer.database.MasterDataModel> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.datalayer.repositories.MasterDataRepository$getMasterData$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.datalayer.repositories.MasterDataRepository$getMasterData$1 r0 = (com.forsale.app.datalayer.repositories.MasterDataRepository$getMasterData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.MasterDataRepository$getMasterData$1 r0 = new com.forsale.app.datalayer.repositories.MasterDataRepository$getMasterData$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r6)
            goto L5f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.network.services.MasterDataService r2 = (com.forsale.app.datalayer.network.services.MasterDataService) r2
            kotlin.f.b(r6)
            goto L4c
        L3c:
            kotlin.f.b(r6)
            com.forsale.app.datalayer.network.services.MasterDataService r2 = r5.masterDataService
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r6 = r5.getLastUpdateTimeStamp(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            java.lang.String r6 = (java.lang.String) r6
            com.forsale.app.datalayer.network.requestsbodies.MasterDataBody r4 = new com.forsale.app.datalayer.network.requestsbodies.MasterDataBody
            r4.<init>(r6)
            r6 = 0
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r6 = r2.getMasterData(r4, r0)
            if (r6 != r1) goto L5f
            return r1
        L5f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.MasterDataRepository.getMasterData(zz.a):java.lang.Object");
    }

    public final Object getMasterDataMiscModel(zz.a<? super MasterDataMiscModel> aVar) {
        return this.prefs.h().l(aVar);
    }

    public final Object homeTooltipDurationMilliseconds(zz.a<? super Integer> aVar) {
        return this.prefs.h().b(aVar);
    }

    public final Object homeTooltipMaxViewsSessions(zz.a<? super Integer> aVar) {
        return this.prefs.h().c(aVar);
    }

    public final Object homeTooltipWaitingMilliseconds(zz.a<? super Integer> aVar) {
        return this.prefs.h().d(aVar);
    }

    public final Object imageBaseUrlHomeVerticalBig(zz.a<? super String> aVar) {
        return this.prefs.h().e(aVar);
    }

    public final Object imageBaseUrlHomeVerticalSmall(zz.a<? super String> aVar) {
        return this.prefs.h().f(aVar);
    }

    public final Object imageBaseUrlMediaBig(zz.a<? super String> aVar) {
        return this.prefs.h().g(aVar);
    }

    public final Object imageBaseUrlMediaThumbnail(zz.a<? super String> aVar) {
        return this.prefs.h().h(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object isAWSAnalyticsEnabled(zz.a<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.datalayer.repositories.MasterDataRepository$isAWSAnalyticsEnabled$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.datalayer.repositories.MasterDataRepository$isAWSAnalyticsEnabled$1 r0 = (com.forsale.app.datalayer.repositories.MasterDataRepository$isAWSAnalyticsEnabled$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.MasterDataRepository$isAWSAnalyticsEnabled$1 r0 = new com.forsale.app.datalayer.repositories.MasterDataRepository$isAWSAnalyticsEnabled$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.f.b(r5)
            jj.b r5 = r4.prefs
            kj.a r5 = r5.a()
            r0.label = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            boolean r5 = com.forsale.app.utils.TypeExtensionsKt.h0(r5)
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.MasterDataRepository.isAWSAnalyticsEnabled(zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object isAmplitudeAnalyticsEnabled(zz.a<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.datalayer.repositories.MasterDataRepository$isAmplitudeAnalyticsEnabled$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.datalayer.repositories.MasterDataRepository$isAmplitudeAnalyticsEnabled$1 r0 = (com.forsale.app.datalayer.repositories.MasterDataRepository$isAmplitudeAnalyticsEnabled$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.MasterDataRepository$isAmplitudeAnalyticsEnabled$1 r0 = new com.forsale.app.datalayer.repositories.MasterDataRepository$isAmplitudeAnalyticsEnabled$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.f.b(r5)
            jj.b r5 = r4.prefs
            kj.a r5 = r5.a()
            r0.label = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            boolean r5 = com.forsale.app.utils.TypeExtensionsKt.h0(r5)
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.MasterDataRepository.isAmplitudeAnalyticsEnabled(zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object isFacebookAnalyticsEnabled(zz.a<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.datalayer.repositories.MasterDataRepository$isFacebookAnalyticsEnabled$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.datalayer.repositories.MasterDataRepository$isFacebookAnalyticsEnabled$1 r0 = (com.forsale.app.datalayer.repositories.MasterDataRepository$isFacebookAnalyticsEnabled$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.MasterDataRepository$isFacebookAnalyticsEnabled$1 r0 = new com.forsale.app.datalayer.repositories.MasterDataRepository$isFacebookAnalyticsEnabled$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.f.b(r5)
            jj.b r5 = r4.prefs
            kj.a r5 = r5.a()
            r0.label = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            boolean r5 = com.forsale.app.utils.TypeExtensionsKt.h0(r5)
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.MasterDataRepository.isFacebookAnalyticsEnabled(zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object isGoogleAnalyticsEnabled(zz.a<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.datalayer.repositories.MasterDataRepository$isGoogleAnalyticsEnabled$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.datalayer.repositories.MasterDataRepository$isGoogleAnalyticsEnabled$1 r0 = (com.forsale.app.datalayer.repositories.MasterDataRepository$isGoogleAnalyticsEnabled$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.MasterDataRepository$isGoogleAnalyticsEnabled$1 r0 = new com.forsale.app.datalayer.repositories.MasterDataRepository$isGoogleAnalyticsEnabled$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.f.b(r5)
            jj.b r5 = r4.prefs
            kj.a r5 = r5.a()
            r0.label = r3
            java.lang.Object r5 = r5.d(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            boolean r5 = com.forsale.app.utils.TypeExtensionsKt.h0(r5)
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.MasterDataRepository.isGoogleAnalyticsEnabled(zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object isHomeRecommendedCollapsed(zz.a<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.datalayer.repositories.MasterDataRepository$isHomeRecommendedCollapsed$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.datalayer.repositories.MasterDataRepository$isHomeRecommendedCollapsed$1 r0 = (com.forsale.app.datalayer.repositories.MasterDataRepository$isHomeRecommendedCollapsed$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.MasterDataRepository$isHomeRecommendedCollapsed$1 r0 = new com.forsale.app.datalayer.repositories.MasterDataRepository$isHomeRecommendedCollapsed$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.f.b(r5)
            jj.b r5 = r4.prefs
            com.forsale.app.utils.prefUtils.preferences.MasterDataSharedPrefs r5 = r5.h()
            r0.label = r3
            java.lang.Object r5 = r5.i(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            boolean r5 = com.forsale.app.utils.TypeExtensionsKt.h0(r5)
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.MasterDataRepository.isHomeRecommendedCollapsed(zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object isLeanplumAnalyticsEnabled(zz.a<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.datalayer.repositories.MasterDataRepository$isLeanplumAnalyticsEnabled$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.datalayer.repositories.MasterDataRepository$isLeanplumAnalyticsEnabled$1 r0 = (com.forsale.app.datalayer.repositories.MasterDataRepository$isLeanplumAnalyticsEnabled$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.MasterDataRepository$isLeanplumAnalyticsEnabled$1 r0 = new com.forsale.app.datalayer.repositories.MasterDataRepository$isLeanplumAnalyticsEnabled$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.f.b(r5)
            jj.b r5 = r4.prefs
            kj.a r5 = r5.a()
            r0.label = r3
            java.lang.Object r5 = r5.e(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            boolean r5 = com.forsale.app.utils.TypeExtensionsKt.h0(r5)
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.MasterDataRepository.isLeanplumAnalyticsEnabled(zz.a):java.lang.Object");
    }

    public final Object powerPinAddEnabledLocations(zz.a<? super Set<String>> aVar) {
        return this.prefs.h().m(aVar);
    }

    public final int powerPinContentDuration() {
        Integer num = (Integer) FlowLiveDataConversions.c(this.prefs.h().n(), null, 0L, 3, null).getValue();
        if (num == null) {
            return 3000;
        }
        return num.intValue();
    }

    public final Object powerPinTutorialAr(zz.a<? super String> aVar) {
        return this.prefs.h().o(aVar);
    }

    public final Object powerPinTutorialEn(zz.a<? super String> aVar) {
        return this.prefs.h().p(aVar);
    }

    public final Object powerPinViewEnabledLocations(zz.a<? super Set<String>> aVar) {
        return this.prefs.h().q(aVar);
    }

    public final Object updateMasterData(MasterDataModel masterDataModel, zz.a<? super p> aVar) {
        Object f11;
        Object withContext = BuildersKt.withContext(this.ioDispatcher, new MasterDataRepository$updateMasterData$2(this, masterDataModel, null), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (withContext == f11) {
            return withContext;
        }
        return p.f75480a;
    }
}
