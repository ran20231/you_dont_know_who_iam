package com.forsale.app.datalayer.repositories;

import androidx.lifecycle.FlowLiveDataConversions;
import com.forsale.app.datalayer.database.RegionEntity;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.Flow;
/* compiled from: RegionsRepository.kt */
/* loaded from: classes2.dex */
public final class RegionsRepository {
    public static final int DEFAULT_REGION_ID = 1;
    public static final String DEFAULT_REGION_NAME = "KUWAIT-الكويت";
    private final jj.b preferences;
    private final RegionDao regionDao;
    private final UserDao userDao;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RegionsRepository.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public RegionsRepository(UserDao userDao, RegionDao regionDao, jj.b preferences) {
        o.i(userDao, "userDao");
        o.i(regionDao, "regionDao");
        o.i(preferences, "preferences");
        this.userDao = userDao;
        this.regionDao = regionDao;
        this.preferences = preferences;
    }

    public static /* synthetic */ Object getRegion$default(RegionsRepository regionsRepository, Integer num, zz.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        return regionsRepository.getRegion(num, aVar);
    }

    public static /* synthetic */ Object getRegionCode$default(RegionsRepository regionsRepository, Integer num, zz.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        return regionsRepository.getRegionCode(num, aVar);
    }

    public static /* synthetic */ Object getRegionEntity$default(RegionsRepository regionsRepository, Integer num, zz.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        return regionsRepository.getRegionEntity(num, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getRegionId(zz.a<? super java.lang.Integer> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.datalayer.repositories.RegionsRepository$getRegionId$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.datalayer.repositories.RegionsRepository$getRegionId$1 r0 = (com.forsale.app.datalayer.repositories.RegionsRepository$getRegionId$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.RegionsRepository$getRegionId$1 r0 = new com.forsale.app.datalayer.repositories.RegionsRepository$getRegionId$1
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
            goto L64
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.repositories.RegionsRepository r2 = (com.forsale.app.datalayer.repositories.RegionsRepository) r2
            kotlin.f.b(r6)
            goto L4b
        L3c:
            kotlin.f.b(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.getUserRegionId(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r2 = r5
        L4b:
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L58
            int r6 = r6.intValue()
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.a.d(r6)
            return r6
        L58:
            r6 = 0
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r6 = r2.getCurrentRegionId(r0)
            if (r6 != r1) goto L64
            return r1
        L64:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.RegionsRepository.getRegionId(zz.a):java.lang.Object");
    }

    public static /* synthetic */ Object getRegionPrefix$default(RegionsRepository regionsRepository, Integer num, zz.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        return regionsRepository.getRegionPrefix(num, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getUserRegionId(zz.a<? super java.lang.Integer> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.datalayer.repositories.RegionsRepository$getUserRegionId$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.datalayer.repositories.RegionsRepository$getUserRegionId$1 r0 = (com.forsale.app.datalayer.repositories.RegionsRepository$getUserRegionId$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.RegionsRepository$getUserRegionId$1 r0 = new com.forsale.app.datalayer.repositories.RegionsRepository$getUserRegionId$1
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
            com.forsale.app.datalayer.repositories.UserDao r5 = r4.userDao
            r0.label = r3
            java.lang.Object r5 = r5.getUser(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.forsale.app.datalayer.database.UserEntity r5 = (com.forsale.app.datalayer.database.UserEntity) r5
            if (r5 == 0) goto L48
            java.lang.Integer r5 = r5.getRegionId()
            return r5
        L48:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.RegionsRepository.getUserRegionId(zz.a):java.lang.Object");
    }

    public final Object getAllRegion(zz.a<? super List<RegionEntity>> aVar) {
        return this.regionDao.getAllRegionsSuspend(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getCurrencyName(zz.a<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.datalayer.repositories.RegionsRepository$getCurrencyName$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.datalayer.repositories.RegionsRepository$getCurrencyName$1 r0 = (com.forsale.app.datalayer.repositories.RegionsRepository$getCurrencyName$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.RegionsRepository$getCurrencyName$1 r0 = new com.forsale.app.datalayer.repositories.RegionsRepository$getCurrencyName$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.f.b(r5)
            r0.label = r3
            java.lang.Object r5 = r4.getCurrentRegion(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.forsale.app.datalayer.database.RegionEntity r5 = (com.forsale.app.datalayer.database.RegionEntity) r5
            java.lang.String r5 = r5.getCurrency()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.RegionsRepository.getCurrencyName(zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getCurrencyNameEn(zz.a<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.datalayer.repositories.RegionsRepository$getCurrencyNameEn$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.datalayer.repositories.RegionsRepository$getCurrencyNameEn$1 r0 = (com.forsale.app.datalayer.repositories.RegionsRepository$getCurrencyNameEn$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.RegionsRepository$getCurrencyNameEn$1 r0 = new com.forsale.app.datalayer.repositories.RegionsRepository$getCurrencyNameEn$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.f.b(r5)
            r0.label = r3
            java.lang.Object r5 = r4.getCurrentRegion(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.forsale.app.datalayer.database.RegionEntity r5 = (com.forsale.app.datalayer.database.RegionEntity) r5
            java.lang.String r5 = r5.getRegionCodeEn()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.RegionsRepository.getCurrencyNameEn(zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[PHI: r6 
      PHI: (r6v7 java.lang.Object) = (r6v6 java.lang.Object), (r6v1 java.lang.Object) binds: [B:20:0x005b, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getCurrentRegion(zz.a<? super com.forsale.app.datalayer.database.RegionEntity> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.datalayer.repositories.RegionsRepository$getCurrentRegion$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.datalayer.repositories.RegionsRepository$getCurrentRegion$1 r0 = (com.forsale.app.datalayer.repositories.RegionsRepository$getCurrentRegion$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.RegionsRepository$getCurrentRegion$1 r0 = new com.forsale.app.datalayer.repositories.RegionsRepository$getCurrentRegion$1
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
            goto L5e
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.repositories.RegionDao r2 = (com.forsale.app.datalayer.repositories.RegionDao) r2
            kotlin.f.b(r6)
            goto L4c
        L3c:
            kotlin.f.b(r6)
            com.forsale.app.datalayer.repositories.RegionDao r2 = r5.regionDao
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r6 = r5.getCurrentRegionId(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r4 = 0
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r2.getRegionObjectById(r6, r0)
            if (r6 != r1) goto L5e
            return r1
        L5e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.RegionsRepository.getCurrentRegion(zz.a):java.lang.Object");
    }

    public final Flow<RegionEntity> getCurrentRegionAsFlow() {
        return this.regionDao.getRegionFlowById(getCurrentRegionIdValue());
    }

    public final Object getCurrentRegionCurrency(zz.a<? super String> aVar) {
        return this.preferences.i().a(aVar);
    }

    public final Object getCurrentRegionId(zz.a<? super Integer> aVar) {
        return this.preferences.i().b(aVar);
    }

    public final int getCurrentRegionIdValue() {
        Integer num = (Integer) FlowLiveDataConversions.c(this.preferences.i().c(), null, 0L, 3, null).getValue();
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public final Object getCurrentRegionName(zz.a<? super String> aVar) {
        return this.preferences.i().d(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b A[PHI: r8 
      PHI: (r8v10 java.lang.Object) = (r8v5 java.lang.Object), (r8v1 java.lang.Object) binds: [B:25:0x0068, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getRegion(java.lang.Integer r7, zz.a<? super com.forsale.app.datalayer.database.RegionEntity> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.forsale.app.datalayer.repositories.RegionsRepository$getRegion$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.datalayer.repositories.RegionsRepository$getRegion$1 r0 = (com.forsale.app.datalayer.repositories.RegionsRepository$getRegion$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.RegionsRepository$getRegion$1 r0 = new com.forsale.app.datalayer.repositories.RegionsRepository$getRegion$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r8)
            goto L6b
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.L$0
            com.forsale.app.datalayer.repositories.RegionDao r7 = (com.forsale.app.datalayer.repositories.RegionDao) r7
            kotlin.f.b(r8)
            goto L56
        L3c:
            kotlin.f.b(r8)
            com.forsale.app.datalayer.repositories.RegionDao r8 = r6.regionDao
            if (r7 == 0) goto L48
            int r7 = r7.intValue()
            goto L5f
        L48:
            r0.L$0 = r8
            r0.label = r4
            java.lang.Object r7 = r6.getRegionId(r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            r5 = r8
            r8 = r7
            r7 = r5
        L56:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r5 = r8
            r8 = r7
            r7 = r5
        L5f:
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r8 = r8.getRegionObjectById(r7, r0)
            if (r8 != r1) goto L6b
            return r1
        L6b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.RegionsRepository.getRegion(java.lang.Integer, zz.a):java.lang.Object");
    }

    public final Object getRegionById(int i11, zz.a<? super RegionEntity> aVar) {
        return this.regionDao.getRegionObjectById(i11, aVar);
    }

    public final Object getRegionByIdNullable(int i11, zz.a<? super RegionEntity> aVar) {
        return this.regionDao.getRegionByIdNullable(i11, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getRegionCode(java.lang.Integer r5, zz.a<? super java.lang.String> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.app.datalayer.repositories.RegionsRepository$getRegionCode$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.datalayer.repositories.RegionsRepository$getRegionCode$1 r0 = (com.forsale.app.datalayer.repositories.RegionsRepository$getRegionCode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.RegionsRepository$getRegionCode$1 r0 = new com.forsale.app.datalayer.repositories.RegionsRepository$getRegionCode$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.f.b(r6)
            r0.label = r3
            java.lang.Object r6 = r4.getRegion(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            com.forsale.app.datalayer.database.RegionEntity r6 = (com.forsale.app.datalayer.database.RegionEntity) r6
            java.lang.String r5 = r6.getCurrency()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.RegionsRepository.getRegionCode(java.lang.Integer, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b A[PHI: r8 
      PHI: (r8v10 java.lang.Object) = (r8v5 java.lang.Object), (r8v1 java.lang.Object) binds: [B:25:0x0068, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getRegionEntity(java.lang.Integer r7, zz.a<? super com.forsale.app.datalayer.database.RegionEntity> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.forsale.app.datalayer.repositories.RegionsRepository$getRegionEntity$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.datalayer.repositories.RegionsRepository$getRegionEntity$1 r0 = (com.forsale.app.datalayer.repositories.RegionsRepository$getRegionEntity$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.RegionsRepository$getRegionEntity$1 r0 = new com.forsale.app.datalayer.repositories.RegionsRepository$getRegionEntity$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r8)
            goto L6b
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.L$0
            com.forsale.app.datalayer.repositories.RegionDao r7 = (com.forsale.app.datalayer.repositories.RegionDao) r7
            kotlin.f.b(r8)
            goto L56
        L3c:
            kotlin.f.b(r8)
            com.forsale.app.datalayer.repositories.RegionDao r8 = r6.regionDao
            if (r7 == 0) goto L48
            int r7 = r7.intValue()
            goto L5f
        L48:
            r0.L$0 = r8
            r0.label = r4
            java.lang.Object r7 = r6.getRegionId(r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            r5 = r8
            r8 = r7
            r7 = r5
        L56:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r5 = r8
            r8 = r7
            r7 = r5
        L5f:
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r8 = r8.getRegionObjectById(r7, r0)
            if (r8 != r1) goto L6b
            return r1
        L6b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.RegionsRepository.getRegionEntity(java.lang.Integer, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getRegionFullName(zz.a<? super java.lang.String> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.datalayer.repositories.RegionsRepository$getRegionFullName$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.datalayer.repositories.RegionsRepository$getRegionFullName$1 r0 = (com.forsale.app.datalayer.repositories.RegionsRepository$getRegionFullName$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.RegionsRepository$getRegionFullName$1 r0 = new com.forsale.app.datalayer.repositories.RegionsRepository$getRegionFullName$1
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
            goto L59
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.repositories.RegionsRepository r2 = (com.forsale.app.datalayer.repositories.RegionsRepository) r2
            kotlin.f.b(r6)
            goto L4b
        L3c:
            kotlin.f.b(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.getCurrentRegionId(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r2 = r5
        L4b:
            java.lang.Integer r6 = (java.lang.Integer) r6
            r4 = 0
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r2.getRegion(r6, r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            com.forsale.app.datalayer.database.RegionEntity r6 = (com.forsale.app.datalayer.database.RegionEntity) r6
            if (r6 == 0) goto L63
            java.lang.String r6 = r6.getFullName()
            if (r6 != 0) goto L65
        L63:
            java.lang.String r6 = "KUWAIT-الكويت"
        L65:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.RegionsRepository.getRegionFullName(zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getRegionPrefix(java.lang.Integer r5, zz.a<? super java.lang.String> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.app.datalayer.repositories.RegionsRepository$getRegionPrefix$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.datalayer.repositories.RegionsRepository$getRegionPrefix$1 r0 = (com.forsale.app.datalayer.repositories.RegionsRepository$getRegionPrefix$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.RegionsRepository$getRegionPrefix$1 r0 = new com.forsale.app.datalayer.repositories.RegionsRepository$getRegionPrefix$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.f.b(r6)
            r0.label = r3
            java.lang.Object r6 = r4.getRegion(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            com.forsale.app.datalayer.database.RegionEntity r6 = (com.forsale.app.datalayer.database.RegionEntity) r6
            java.lang.String r5 = r6.getPhonePrefix()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.RegionsRepository.getRegionPrefix(java.lang.Integer, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getRegionUtcDiff(zz.a<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.datalayer.repositories.RegionsRepository$getRegionUtcDiff$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.datalayer.repositories.RegionsRepository$getRegionUtcDiff$1 r0 = (com.forsale.app.datalayer.repositories.RegionsRepository$getRegionUtcDiff$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.RegionsRepository$getRegionUtcDiff$1 r0 = new com.forsale.app.datalayer.repositories.RegionsRepository$getRegionUtcDiff$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L3e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.f.b(r5)
            r0.label = r3
            r5 = 0
            java.lang.Object r5 = getRegion$default(r4, r5, r0, r3, r5)
            if (r5 != r1) goto L3e
            return r1
        L3e:
            com.forsale.app.datalayer.database.RegionEntity r5 = (com.forsale.app.datalayer.database.RegionEntity) r5
            java.lang.String r5 = r5.getUtcDiff()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.RegionsRepository.getRegionUtcDiff(zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getUserRegion(zz.a<? super com.forsale.app.datalayer.database.RegionEntity> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.datalayer.repositories.RegionsRepository$getUserRegion$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.datalayer.repositories.RegionsRepository$getUserRegion$1 r0 = (com.forsale.app.datalayer.repositories.RegionsRepository$getUserRegion$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.RegionsRepository$getUserRegion$1 r0 = new com.forsale.app.datalayer.repositories.RegionsRepository$getUserRegion$1
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
            goto L61
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.repositories.RegionsRepository r2 = (com.forsale.app.datalayer.repositories.RegionsRepository) r2
            kotlin.f.b(r6)
            goto L4b
        L3c:
            kotlin.f.b(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.getUserRegionId(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r2 = r5
        L4b:
            java.lang.Integer r6 = (java.lang.Integer) r6
            r4 = 0
            if (r6 == 0) goto L64
            int r6 = r6.intValue()
            com.forsale.app.datalayer.repositories.RegionDao r2 = r2.regionDao
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r2.getRegionObjectById(r6, r0)
            if (r6 != r1) goto L61
            return r1
        L61:
            r4 = r6
            com.forsale.app.datalayer.database.RegionEntity r4 = (com.forsale.app.datalayer.database.RegionEntity) r4
        L64:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.RegionsRepository.getUserRegion(zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object isMultipleRegionsExists(zz.a<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.datalayer.repositories.RegionsRepository$isMultipleRegionsExists$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.datalayer.repositories.RegionsRepository$isMultipleRegionsExists$1 r0 = (com.forsale.app.datalayer.repositories.RegionsRepository$isMultipleRegionsExists$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.RegionsRepository$isMultipleRegionsExists$1 r0 = new com.forsale.app.datalayer.repositories.RegionsRepository$isMultipleRegionsExists$1
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
            com.forsale.app.datalayer.repositories.RegionDao r5 = r4.regionDao
            r0.label = r3
            java.lang.Object r5 = r5.getAllRegionsSuspend(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            java.util.List r5 = (java.util.List) r5
            int r5 = r5.size()
            if (r5 <= r3) goto L48
            goto L49
        L48:
            r3 = 0
        L49:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.RegionsRepository.isMultipleRegionsExists(zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e4 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setCurrentRegion(int r9, zz.a<? super wz.p> r10) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.RegionsRepository.setCurrentRegion(int, zz.a):java.lang.Object");
    }
}
