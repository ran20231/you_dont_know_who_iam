package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.Flow;
import wz.p;
/* compiled from: ListingDetailsEntityRepository.kt */
/* loaded from: classes2.dex */
public final class ListingDetailsEntityRepository {
    public static final int $stable = 8;
    private final ListingDetailsEntityDao listingDetailsEntityDao;

    public ListingDetailsEntityRepository(ListingDetailsEntityDao listingDetailsEntityDao) {
        o.i(listingDetailsEntityDao, "listingDetailsEntityDao");
        this.listingDetailsEntityDao = listingDetailsEntityDao;
    }

    public final Object deleteSuspended(zz.a<? super Integer> aVar) {
        return this.listingDetailsEntityDao.delete(aVar);
    }

    public final Object getSingle(zz.a<? super ListingDetailsEntity> aVar) {
        return this.listingDetailsEntityDao.getSingle(aVar);
    }

    public final Flow<ListingDetailsEntity> getUserListingFlow() {
        return this.listingDetailsEntityDao.getUserListingFlow();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object insertOrUpdate(com.forsale.app.datalayer.network.entities.ListingDetailsEntity r8, zz.a<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.forsale.app.datalayer.repositories.ListingDetailsEntityRepository$insertOrUpdate$1
            if (r0 == 0) goto L13
            r0 = r9
            com.forsale.app.datalayer.repositories.ListingDetailsEntityRepository$insertOrUpdate$1 r0 = (com.forsale.app.datalayer.repositories.ListingDetailsEntityRepository$insertOrUpdate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.ListingDetailsEntityRepository$insertOrUpdate$1 r0 = new com.forsale.app.datalayer.repositories.ListingDetailsEntityRepository$insertOrUpdate$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.f.b(r9)
            goto L79
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            kotlin.f.b(r9)
            goto L7a
        L3b:
            java.lang.Object r8 = r0.L$1
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity r8 = (com.forsale.app.datalayer.network.entities.ListingDetailsEntity) r8
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.repositories.ListingDetailsEntityRepository r2 = (com.forsale.app.datalayer.repositories.ListingDetailsEntityRepository) r2
            kotlin.f.b(r9)
            goto L58
        L47:
            kotlin.f.b(r9)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r9 = r7.getSingle(r0)
            if (r9 != r1) goto L57
            return r1
        L57:
            r2 = r7
        L58:
            r6 = 0
            if (r9 != 0) goto L6a
            com.forsale.app.datalayer.repositories.ListingDetailsEntityDao r9 = r2.listingDetailsEntityDao
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r8 = r9.insert(r8, r0)
            if (r8 != r1) goto L7a
            return r1
        L6a:
            com.forsale.app.datalayer.repositories.ListingDetailsEntityDao r9 = r2.listingDetailsEntityDao
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r8 = r9.update(r8, r0)
            if (r8 != r1) goto L79
            return r1
        L79:
            r5 = 0
        L7a:
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.a.a(r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.ListingDetailsEntityRepository.insertOrUpdate(com.forsale.app.datalayer.network.entities.ListingDetailsEntity, zz.a):java.lang.Object");
    }

    public final Object updateListing(ListingDetailsEntity listingDetailsEntity, zz.a<? super p> aVar) {
        Object f11;
        Object update = this.listingDetailsEntityDao.update(listingDetailsEntity, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (update == f11) {
            return update;
        }
        return p.f75480a;
    }

    public final Object updateListingId(int i11, zz.a<? super p> aVar) {
        Object f11;
        Object updateId = this.listingDetailsEntityDao.updateId(i11, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (updateId == f11) {
            return updateId;
        }
        return p.f75480a;
    }

    public final Object updatePostUpload(int i11, int i12, List<String> list, zz.a<? super p> aVar) {
        Object f11;
        Object updatePostUpload = this.listingDetailsEntityDao.updatePostUpload(i11, i12, list, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (updatePostUpload == f11) {
            return updatePostUpload;
        }
        return p.f75480a;
    }
}
