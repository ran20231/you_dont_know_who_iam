package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.AppCacheDatabase;
import com.forsale.app.datalayer.database.TrendEntity;
import com.forsale.app.datalayer.network.responses.TrendsResponseBody;
import com.forsale.app.datalayer.network.services.TrendsServices;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.Flow;
/* compiled from: TrendsRepository.kt */
/* loaded from: classes2.dex */
public final class TrendsRepository implements ITrendsRepository {
    public static final int $stable = 0;
    private final AppCacheDatabase appCacheDatabase;
    private final TrendDao trendDao;
    private final TrendsServices trendsServices;

    /* compiled from: TrendsRepository.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrendStatus.values().length];
            try {
                iArr[TrendStatus.ALL_DATA_EMPTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TrendStatus.API_HAS_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TrendsRepository(TrendsServices trendsServices, TrendDao trendDao, AppCacheDatabase appCacheDatabase) {
        o.i(trendsServices, "trendsServices");
        o.i(trendDao, "trendDao");
        o.i(appCacheDatabase, "appCacheDatabase");
        this.trendsServices = trendsServices;
        this.trendDao = trendDao;
        this.appCacheDatabase = appCacheDatabase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getDBStatus(zz.a<? super com.forsale.app.datalayer.repositories.TrendStatus> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.datalayer.repositories.TrendsRepository$getDBStatus$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.datalayer.repositories.TrendsRepository$getDBStatus$1 r0 = (com.forsale.app.datalayer.repositories.TrendsRepository$getDBStatus$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.TrendsRepository$getDBStatus$1 r0 = new com.forsale.app.datalayer.repositories.TrendsRepository$getDBStatus$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.f.b(r5)
            com.forsale.app.datalayer.repositories.TrendDao r5 = r4.trendDao
            r0.label = r3
            java.lang.Object r5 = r5.getAllTrends(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            java.util.Collection r5 = (java.util.Collection) r5
            if (r5 == 0) goto L4b
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L4a
            goto L4b
        L4a:
            r3 = 0
        L4b:
            if (r3 == 0) goto L50
            com.forsale.app.datalayer.repositories.TrendStatus r5 = com.forsale.app.datalayer.repositories.TrendStatus.DB_EMPTY
            goto L52
        L50:
            com.forsale.app.datalayer.repositories.TrendStatus r5 = com.forsale.app.datalayer.repositories.TrendStatus.DB_HAS_DATA
        L52:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.TrendsRepository.getDBStatus(zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(4:(2:3|(8:5|6|7|(1:(1:10)(2:21|22))(3:23|24|(1:26))|11|13|14|16))|13|14|16)|28|6|7|(0)(0)|11|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getTrendsApi(zz.a<? super com.forsale.app.datalayer.repositories.TrendData> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.datalayer.repositories.TrendsRepository$getTrendsApi$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.datalayer.repositories.TrendsRepository$getTrendsApi$1 r0 = (com.forsale.app.datalayer.repositories.TrendsRepository$getTrendsApi$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.TrendsRepository$getTrendsApi$1 r0 = new com.forsale.app.datalayer.repositories.TrendsRepository$getTrendsApi$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.f.b(r6)     // Catch: java.lang.Exception -> L4d
            goto L42
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            kotlin.f.b(r6)
            com.forsale.app.datalayer.network.services.TrendsServices r6 = r5.trendsServices     // Catch: java.lang.Exception -> L4d
            wz.p r2 = wz.p.f75480a     // Catch: java.lang.Exception -> L4d
            r0.label = r3     // Catch: java.lang.Exception -> L4d
            java.lang.Object r6 = r6.getTrends(r2, r0)     // Catch: java.lang.Exception -> L4d
            if (r6 != r1) goto L42
            return r1
        L42:
            com.forsale.app.datalayer.network.responses.TrendsResponseBody r6 = (com.forsale.app.datalayer.network.responses.TrendsResponseBody) r6     // Catch: java.lang.Exception -> L4d
            com.forsale.app.datalayer.repositories.TrendData r0 = new com.forsale.app.datalayer.repositories.TrendData     // Catch: java.lang.Exception -> L4c
            com.forsale.app.datalayer.repositories.TrendStatus r1 = com.forsale.app.datalayer.repositories.TrendStatus.API_HAS_DATA     // Catch: java.lang.Exception -> L4c
            r0.<init>(r6, r1)     // Catch: java.lang.Exception -> L4c
            goto L54
        L4c:
            r4 = r6
        L4d:
            com.forsale.app.datalayer.repositories.TrendData r0 = new com.forsale.app.datalayer.repositories.TrendData
            com.forsale.app.datalayer.repositories.TrendStatus r6 = com.forsale.app.datalayer.repositories.TrendStatus.API_EMPTY
            r0.<init>(r4, r6)
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.TrendsRepository.getTrendsApi(zz.a):java.lang.Object");
    }

    private final TrendEntity mapTrend(TrendsResponseBody.Label label, boolean z11) {
        return new TrendEntity(0, label.getAr(), label.getEn(), z11, 1, null);
    }

    static /* synthetic */ TrendEntity mapTrend$default(TrendsRepository trendsRepository, TrendsResponseBody.Label label, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return trendsRepository.mapTrend(label, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<TrendEntity> mapTrendsResponse(TrendsResponseBody trendsResponseBody) {
        int y11;
        List<TrendEntity> X0;
        ArrayList arrayList = new ArrayList();
        List<TrendsResponseBody.Label> trends = trendsResponseBody.getTrends();
        y11 = s.y(trends, 10);
        ArrayList arrayList2 = new ArrayList(y11);
        for (TrendsResponseBody.Label label : trends) {
            arrayList2.add(mapTrend$default(this, label, false, 2, null));
        }
        arrayList.addAll(arrayList2);
        arrayList.add(mapTrend(trendsResponseBody.getTitle(), true));
        X0 = CollectionsKt___CollectionsKt.X0(arrayList);
        return X0;
    }

    public final Flow<TrendEntity> getTitleAsFlow() {
        return this.trendDao.getTitleAsFlow();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    @Override // com.forsale.app.datalayer.repositories.ITrendsRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getTrends(zz.a<? super wz.p> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.forsale.app.datalayer.repositories.TrendsRepository$getTrends$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.datalayer.repositories.TrendsRepository$getTrends$1 r0 = (com.forsale.app.datalayer.repositories.TrendsRepository$getTrends$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.TrendsRepository$getTrends$1 r0 = new com.forsale.app.datalayer.repositories.TrendsRepository$getTrends$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.L$0
            com.forsale.app.datalayer.network.responses.TrendsResponseBody r0 = (com.forsale.app.datalayer.network.responses.TrendsResponseBody) r0
            kotlin.f.b(r8)
            goto L94
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L38:
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.repositories.TrendsRepository r2 = (com.forsale.app.datalayer.repositories.TrendsRepository) r2
            kotlin.f.b(r8)
            goto L4f
        L40:
            kotlin.f.b(r8)
            r0.L$0 = r7
            r0.label = r4
            java.lang.Object r8 = r7.getTrendsData(r0)
            if (r8 != r1) goto L4e
            return r1
        L4e:
            r2 = r7
        L4f:
            com.forsale.app.datalayer.repositories.TrendData r8 = (com.forsale.app.datalayer.repositories.TrendData) r8
            com.forsale.app.datalayer.repositories.TrendStatus r5 = r8.getStatus()
            if (r5 != 0) goto L59
            r5 = -1
            goto L61
        L59:
            int[] r6 = com.forsale.app.datalayer.repositories.TrendsRepository.WhenMappings.$EnumSwitchMapping$0
            int r5 = r5.ordinal()
            r5 = r6[r5]
        L61:
            if (r5 == r4) goto L84
            if (r5 == r3) goto L6b
            com.forsale.app.datalayer.repositories.TrendDao r8 = r2.trendDao
            r8.getAllTrendsLive()
            goto L94
        L6b:
            com.forsale.app.datalayer.network.responses.TrendsResponseBody r8 = r8.getTrendsResponseBody()
            if (r8 == 0) goto L94
            com.forsale.app.datalayer.database.AppCacheDatabase r4 = r2.appCacheDatabase
            com.forsale.app.datalayer.repositories.TrendsRepository$getTrends$2$1 r5 = new com.forsale.app.datalayer.repositories.TrendsRepository$getTrends$2$1
            r6 = 0
            r5.<init>(r2, r8, r6)
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r8 = androidx.room.RoomDatabaseKt.d(r4, r5, r0)
            if (r8 != r1) goto L94
            return r1
        L84:
            dj.i$a r8 = dj.i.f54287a
            dj.i r8 = r8.invoke()
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "Empty Trends Data"
            r0.<init>(r1)
            r8.f(r0)
        L94:
            wz.p r8 = wz.p.f75480a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.TrendsRepository.getTrends(zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getTrendsData(zz.a<? super com.forsale.app.datalayer.repositories.TrendData> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.forsale.app.datalayer.repositories.TrendsRepository$getTrendsData$1
            if (r0 == 0) goto L13
            r0 = r10
            com.forsale.app.datalayer.repositories.TrendsRepository$getTrendsData$1 r0 = (com.forsale.app.datalayer.repositories.TrendsRepository$getTrendsData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.TrendsRepository$getTrendsData$1 r0 = new com.forsale.app.datalayer.repositories.TrendsRepository$getTrendsData$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r1 = r0.L$2
            com.forsale.app.datalayer.repositories.TrendStatus r1 = (com.forsale.app.datalayer.repositories.TrendStatus) r1
            java.lang.Object r2 = r0.L$1
            com.forsale.app.datalayer.repositories.TrendData r2 = (com.forsale.app.datalayer.repositories.TrendData) r2
            java.lang.Object r0 = r0.L$0
            kotlin.f.b(r10)
            goto L70
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3e:
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.repositories.TrendsRepository r2 = (com.forsale.app.datalayer.repositories.TrendsRepository) r2
            kotlin.f.b(r10)
            goto L55
        L46:
            kotlin.f.b(r10)
            r0.L$0 = r9
            r0.label = r4
            java.lang.Object r10 = r9.getTrendsApi(r0)
            if (r10 != r1) goto L54
            return r1
        L54:
            r2 = r9
        L55:
            r4 = r10
            com.forsale.app.datalayer.repositories.TrendData r4 = (com.forsale.app.datalayer.repositories.TrendData) r4
            com.forsale.app.datalayer.repositories.TrendStatus r5 = r4.getStatus()
            r0.L$0 = r10
            r0.L$1 = r4
            r0.L$2 = r5
            r0.label = r3
            java.lang.Object r0 = r2.getDBStatus(r0)
            if (r0 != r1) goto L6b
            return r1
        L6b:
            r2 = r4
            r1 = r5
            r8 = r0
            r0 = r10
            r10 = r8
        L70:
            com.forsale.app.datalayer.repositories.TrendStatus r10 = (com.forsale.app.datalayer.repositories.TrendStatus) r10
            r3 = 0
            if (r1 == 0) goto L7a
            java.lang.String r4 = r1.name()
            goto L7b
        L7a:
            r4 = r3
        L7b:
            java.lang.String r5 = r10.name()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Trends: Status: "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = " "
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]
            x10.a.b(r4, r6)
            com.forsale.app.datalayer.repositories.TrendStatus r4 = com.forsale.app.datalayer.repositories.TrendStatus.API_EMPTY
            if (r1 != r4) goto La8
            com.forsale.app.datalayer.repositories.TrendStatus r4 = com.forsale.app.datalayer.repositories.TrendStatus.DB_EMPTY
            if (r10 != r4) goto La8
            com.forsale.app.datalayer.repositories.TrendStatus r1 = com.forsale.app.datalayer.repositories.TrendStatus.ALL_DATA_EMPTY
        La8:
            if (r1 == 0) goto Lae
            java.lang.String r3 = r1.name()
        Lae:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r4 = "Trends: Status Final "
            r10.append(r4)
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            java.lang.Object[] r3 = new java.lang.Object[r5]
            x10.a.b(r10, r3)
            r2.setStatus(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.TrendsRepository.getTrendsData(zz.a):java.lang.Object");
    }

    public final Flow<List<TrendEntity>> getTrendsFlow() {
        return this.trendDao.getAllTrendsLive();
    }

    public final Flow<List<TrendEntity>> getTrendsSectionWithTitle() {
        return this.trendDao.getAllTrendsWithTitleFlow();
    }
}
