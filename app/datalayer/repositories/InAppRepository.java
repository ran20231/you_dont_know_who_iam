package com.forsale.app.datalayer.repositories;

import androidx.room.RoomDatabaseKt;
import com.forsale.app.datalayer.database.InAppDatabase;
import com.forsale.app.datalayer.database.InAppMessageEntity;
import com.forsale.app.datalayer.database.InAppType;
import com.forsale.app.datalayer.network.requestsbodies.InAppMessagesStatisticsBody;
import com.forsale.app.datalayer.network.services.MessagingService;
import com.forsale.app.utils.TypeExtensionsKt;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import wz.p;
/* compiled from: InAppRepository.kt */
/* loaded from: classes2.dex */
public final class InAppRepository {
    public static final int $stable = 8;

    /* renamed from: cs */
    private final CoroutineScope f22372cs;
    private final CoroutineExceptionHandler handler;
    private final ImagesRepository imagesRepository;
    private final InAppDatabase inAppDatabase;
    private final InAppMessageDao inAppMessageDao;
    private final MessagingService messagingService;
    private final jj.b pref;

    public InAppRepository(MessagingService messagingService, InAppDatabase inAppDatabase, InAppMessageDao inAppMessageDao, jj.b pref, CoroutineScope cs2, ImagesRepository imagesRepository) {
        o.i(messagingService, "messagingService");
        o.i(inAppDatabase, "inAppDatabase");
        o.i(inAppMessageDao, "inAppMessageDao");
        o.i(pref, "pref");
        o.i(cs2, "cs");
        o.i(imagesRepository, "imagesRepository");
        this.messagingService = messagingService;
        this.inAppDatabase = inAppDatabase;
        this.inAppMessageDao = inAppMessageDao;
        this.pref = pref;
        this.f22372cs = cs2;
        this.imagesRepository = imagesRepository;
        this.handler = new InAppRepository$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object consumeInAppMessage$default(InAppRepository inAppRepository, InAppType inAppType, List list, List list2, zz.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list = null;
        }
        if ((i11 & 4) != 0) {
            list2 = null;
        }
        return inAppRepository.consumeInAppMessage(inAppType, list, list2, aVar);
    }

    public final Object deleteExpiredInAppMessages(zz.a<? super Integer> aVar) {
        return this.inAppMessageDao.deleteExpiredInAppMessages(TypeExtensionsKt.u(new Date()), aVar);
    }

    public final Object getInAppMessageByTypeAndCategory(InAppType inAppType, List<Integer> list, zz.a<? super InAppMessageEntity> aVar) {
        if (list == null) {
            return this.inAppMessageDao.getInAppMessageSuspendedByType(inAppType, aVar);
        }
        return this.inAppMessageDao.getInAppMessageSuspendedByTypeAndCategoryId(inAppType, list, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getInAppMessageByTypeAndCategoryDistricts(com.forsale.app.datalayer.database.InAppType r5, java.util.List<java.lang.Integer> r6, java.util.List<java.lang.Integer> r7, zz.a<? super com.forsale.app.datalayer.database.InAppMessageEntity> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.forsale.app.datalayer.repositories.InAppRepository$getInAppMessageByTypeAndCategoryDistricts$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.datalayer.repositories.InAppRepository$getInAppMessageByTypeAndCategoryDistricts$1 r0 = (com.forsale.app.datalayer.repositories.InAppRepository$getInAppMessageByTypeAndCategoryDistricts$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.InAppRepository$getInAppMessageByTypeAndCategoryDistricts$1 r0 = new com.forsale.app.datalayer.repositories.InAppRepository$getInAppMessageByTypeAndCategoryDistricts$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.L$0
            r7 = r5
            java.util.List r7 = (java.util.List) r7
            kotlin.f.b(r8)
            goto L46
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.f.b(r8)
            com.forsale.app.datalayer.repositories.InAppMessageDao r8 = r4.inAppMessageDao
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r8.getAllInAppMessageSuspendedByTypeAndCat(r5, r6, r0)
            if (r8 != r1) goto L46
            return r1
        L46:
            java.util.List r8 = (java.util.List) r8
            r5 = 0
            if (r8 == 0) goto L71
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r6 = r8.iterator()
        L51:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L6f
            java.lang.Object r8 = r6.next()
            r0 = r8
            com.forsale.app.datalayer.database.InAppMessageEntity r0 = (com.forsale.app.datalayer.database.InAppMessageEntity) r0
            java.util.List r0 = r0.getDistrictsIds()
            if (r0 == 0) goto L6b
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r7.containsAll(r0)
            goto L6c
        L6b:
            r0 = 0
        L6c:
            if (r0 == 0) goto L51
            r5 = r8
        L6f:
            com.forsale.app.datalayer.database.InAppMessageEntity r5 = (com.forsale.app.datalayer.database.InAppMessageEntity) r5
        L71:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.InAppRepository.getInAppMessageByTypeAndCategoryDistricts(com.forsale.app.datalayer.database.InAppType, java.util.List, java.util.List, zz.a):java.lang.Object");
    }

    public final Object getInAppMessageReset(zz.a<? super Integer> aVar) {
        return this.pref.f().b(aVar);
    }

    public final void saveInAppMessageReset(int i11) {
        BuildersKt__Builders_commonKt.launch$default(this.f22372cs, null, null, new InAppRepository$saveInAppMessageReset$1(this, i11, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveInAppMessages(java.util.List<com.forsale.app.datalayer.database.InAppMessageEntity> r14, zz.a<? super wz.p> r15) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.InAppRepository.saveInAppMessages(java.util.List, zz.a):java.lang.Object");
    }

    public final Object saveInAppMessagesData(List<InAppMessageEntity> list, zz.a<? super p> aVar) {
        Object f11;
        Object d11 = RoomDatabaseKt.d(this.inAppDatabase, new InAppRepository$saveInAppMessagesData$2(list, this, null), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (d11 == f11) {
            return d11;
        }
        return p.f75480a;
    }

    public final Object consumeInAppMessage(InAppType inAppType, List<Integer> list, List<Integer> list2, zz.a<? super InAppMessageEntity> aVar) {
        boolean z11;
        List<Integer> list3 = list2;
        if (list3 != null && !list3.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11 && list != null) {
            return getInAppMessageByTypeAndCategoryDistricts(inAppType, list, list2, aVar);
        }
        return getInAppMessageByTypeAndCategory(inAppType, list, aVar);
    }

    public final Object deleteInAppMessage(InAppMessageEntity inAppMessageEntity, zz.a<? super p> aVar) {
        Object f11;
        Object deleteInAppMessage = this.inAppMessageDao.deleteInAppMessage(inAppMessageEntity, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (deleteInAppMessage == f11) {
            return deleteInAppMessage;
        }
        return p.f75480a;
    }

    public final Object deviceId(zz.a<? super String> aVar) {
        return this.pref.c().a(aVar);
    }

    public final CoroutineExceptionHandler getHandler() {
        return this.handler;
    }

    public final Object getInAppMessageConsumed(zz.a<? super Integer> aVar) {
        return this.pref.f().a(aVar);
    }

    public final void getInAppMessages() {
        BuildersKt__Builders_commonKt.launch$default(this.f22372cs, this.handler, null, new InAppRepository$getInAppMessages$1(this, null), 2, null);
    }

    public final Object getIsNotFreshInstallation(zz.a<? super Boolean> aVar) {
        return this.pref.c().c(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object incrementInAppMessageImpression(com.forsale.app.datalayer.database.InAppMessageEntity r6, zz.a<? super wz.p> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.forsale.app.datalayer.repositories.InAppRepository$incrementInAppMessageImpression$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.datalayer.repositories.InAppRepository$incrementInAppMessageImpression$1 r0 = (com.forsale.app.datalayer.repositories.InAppRepository$incrementInAppMessageImpression$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.InAppRepository$incrementInAppMessageImpression$1 r0 = new com.forsale.app.datalayer.repositories.InAppRepository$incrementInAppMessageImpression$1
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
            goto L7a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$1
            com.forsale.app.datalayer.database.InAppMessageEntity r6 = (com.forsale.app.datalayer.database.InAppMessageEntity) r6
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.repositories.InAppRepository r2 = (com.forsale.app.datalayer.repositories.InAppRepository) r2
            kotlin.f.b(r7)
            goto L51
        L40:
            kotlin.f.b(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r5.deviceId(r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            r2 = r5
        L51:
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            int r7 = r7.length()
            if (r7 <= 0) goto L5a
            goto L5b
        L5a:
            r4 = 0
        L5b:
            if (r4 == 0) goto L7d
            com.forsale.app.datalayer.network.services.MessagingService r7 = r2.messagingService
            com.forsale.app.datalayer.network.requestsbodies.InAppMessagesStatisticsBody r2 = new com.forsale.app.datalayer.network.requestsbodies.InAppMessagesStatisticsBody
            java.lang.Integer r4 = r6.getItemId()
            com.forsale.app.datalayer.database.InAppType r6 = r6.getType()
            r2.<init>(r4, r6)
            r6 = 0
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r6 = r7.incrementInAppMessageImpression(r2, r0)
            if (r6 != r1) goto L7a
            return r1
        L7a:
            wz.p r6 = wz.p.f75480a
            return r6
        L7d:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.InAppRepository.incrementInAppMessageImpression(com.forsale.app.datalayer.database.InAppMessageEntity, zz.a):java.lang.Object");
    }

    public final Object incrementInAppMessageView(InAppMessageEntity inAppMessageEntity, zz.a<? super p> aVar) {
        Object f11;
        Object incrementInAppMessageView = this.messagingService.incrementInAppMessageView(new InAppMessagesStatisticsBody(inAppMessageEntity.getItemId(), inAppMessageEntity.getType()), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (incrementInAppMessageView == f11) {
            return incrementInAppMessageView;
        }
        return p.f75480a;
    }

    public final void saveInAppMessageConsumed(int i11) {
        BuildersKt__Builders_commonKt.launch$default(this.f22372cs, null, null, new InAppRepository$saveInAppMessageConsumed$1(this, i11, null), 3, null);
    }

    public final Object setIsNotFreshInstallation(zz.a<? super p> aVar) {
        Object f11;
        Object f12 = this.pref.c().f(false, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (f12 == f11) {
            return f12;
        }
        return p.f75480a;
    }
}
