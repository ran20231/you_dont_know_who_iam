package com.forsale.app.datalayer.database.masterdata;

import jj.b;
import kotlin.jvm.internal.o;
import wz.p;
import zz.a;
/* compiled from: MasterDBRepo.kt */
/* loaded from: classes2.dex */
public final class MasterDataNewRepository {
    public static final int $stable = 8;
    private final MasterDataFileManager masterDataFileManager;
    private final MasterDataRemoteSource masterDataRemoteSource;
    private final b prefs;

    public MasterDataNewRepository(MasterDataRemoteSource masterDataRemoteSource, MasterDataFileManager masterDataFileManager, b prefs) {
        o.i(masterDataRemoteSource, "masterDataRemoteSource");
        o.i(masterDataFileManager, "masterDataFileManager");
        o.i(prefs, "prefs");
        this.masterDataRemoteSource = masterDataRemoteSource;
        this.masterDataFileManager = masterDataFileManager;
        this.prefs = prefs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object clearTimeStamp(a<? super p> aVar) {
        Object f11;
        Object a11 = this.prefs.h().a(aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0 A[PHI: r8 
      PHI: (r8v15 java.lang.Object) = (r8v14 java.lang.Object), (r8v1 java.lang.Object) binds: [B:42:0x00dd, B:17:0x006e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0124 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0133 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getMasterData(zz.a<? super com.forsale.app.datalayer.database.MasterDataModel> r8) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.database.masterdata.MasterDataNewRepository.getMasterData(zz.a):java.lang.Object");
    }
}
