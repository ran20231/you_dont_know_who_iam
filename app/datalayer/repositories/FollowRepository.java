package com.forsale.app.datalayer.repositories;

import androidx.paging.DataSource;
import com.forsale.app.datalayer.network.responses.FollowResponse;
import com.forsale.app.datalayer.network.services.FollowService;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.FollowActionType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import wz.p;
/* compiled from: FollowRepository.kt */
/* loaded from: classes2.dex */
public final class FollowRepository {
    public static final int PAGE_SIZE = 30;
    private final AggregatedAllAnalyticsLogger analyticsLogger;
    private final FollowService followService;
    private final FollowUserDao followUserDao;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: FollowRepository.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FollowRepository(FollowService followService, FollowUserDao followUserDao, AggregatedAllAnalyticsLogger analyticsLogger) {
        o.i(followService, "followService");
        o.i(followUserDao, "followUserDao");
        o.i(analyticsLogger, "analyticsLogger");
        this.followService = followService;
        this.followUserDao = followUserDao;
        this.analyticsLogger = analyticsLogger;
    }

    private final void logProfileActionAnalytics(FollowActionType followActionType) {
        AggregatedAllAnalyticsLoggerKt.P(this.analyticsLogger, followActionType);
    }

    public final Object clearCashedUsers(zz.a<? super p> aVar) {
        Object f11;
        Object clearAllUsers = this.followUserDao.clearAllUsers(aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (clearAllUsers == f11) {
            return clearAllUsers;
        }
        return p.f75480a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object follow(java.lang.String r7, java.lang.String r8, zz.a<? super java.lang.Boolean> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.forsale.app.datalayer.repositories.FollowRepository$follow$1
            if (r0 == 0) goto L13
            r0 = r9
            com.forsale.app.datalayer.repositories.FollowRepository$follow$1 r0 = (com.forsale.app.datalayer.repositories.FollowRepository$follow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.FollowRepository$follow$1 r0 = new com.forsale.app.datalayer.repositories.FollowRepository$follow$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$1
            java.lang.Object r0 = r0.L$0
            com.forsale.app.datalayer.repositories.FollowRepository r0 = (com.forsale.app.datalayer.repositories.FollowRepository) r0
            kotlin.f.b(r9)
            goto L7c
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            java.lang.Object r7 = r0.L$1
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.L$0
            com.forsale.app.datalayer.repositories.FollowRepository r7 = (com.forsale.app.datalayer.repositories.FollowRepository) r7
            kotlin.f.b(r9)
            goto L61
        L49:
            kotlin.f.b(r9)
            com.forsale.app.datalayer.network.services.FollowService r9 = r6.followService
            com.forsale.app.datalayer.network.requestsbodies.FollowToggleBody r2 = new com.forsale.app.datalayer.network.requestsbodies.FollowToggleBody
            r2.<init>(r7, r8, r4)
            r0.L$0 = r6
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = r9.userFollowToggle(r2, r0)
            if (r9 != r1) goto L60
            return r1
        L60:
            r7 = r6
        L61:
            r2 = r9
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            com.forsale.app.datalayer.repositories.FollowUserDao r5 = r7.followUserDao
            r0.L$0 = r7
            r0.L$1 = r9
            r0.Z$0 = r2
            r0.label = r3
            java.lang.Object r8 = r5.updateFollow(r8, r4, r0)
            if (r8 != r1) goto L79
            return r1
        L79:
            r0 = r7
            r8 = r9
            r7 = r2
        L7c:
            if (r7 == 0) goto L83
            com.forsale.app.utils.analytics.FollowActionType r7 = com.forsale.app.utils.analytics.FollowActionType.USER_FOLLOWED
            r0.logProfileActionAnalytics(r7)
        L83:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.FollowRepository.follow(java.lang.String, java.lang.String, zz.a):java.lang.Object");
    }

    public final Object followAllUsers(zz.a<? super DataSource.Factory<Integer, FollowResponse.User>> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new FollowRepository$followAllUsers$2(this, null), aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c A[LOOP:0: B:27:0x0076->B:29:0x007c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object followerFollowingRetriever(boolean r6, java.lang.String r7, int r8, zz.a<? super java.util.List<com.forsale.app.datalayer.network.responses.FollowResponse.User>> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.forsale.app.datalayer.repositories.FollowRepository$followerFollowingRetriever$1
            if (r0 == 0) goto L13
            r0 = r9
            com.forsale.app.datalayer.repositories.FollowRepository$followerFollowingRetriever$1 r0 = (com.forsale.app.datalayer.repositories.FollowRepository$followerFollowingRetriever$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.FollowRepository$followerFollowingRetriever$1 r0 = new com.forsale.app.datalayer.repositories.FollowRepository$followerFollowingRetriever$1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            int r8 = r0.I$0
            kotlin.f.b(r9)
            goto L6a
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            int r8 = r0.I$0
            kotlin.f.b(r9)
            goto L55
        L3c:
            kotlin.f.b(r9)
            r9 = 30
            if (r6 == 0) goto L58
            com.forsale.app.datalayer.network.services.FollowService r6 = r5.followService
            com.forsale.app.datalayer.network.requestsbodies.FollowBody r2 = new com.forsale.app.datalayer.network.requestsbodies.FollowBody
            r2.<init>(r8, r9, r7)
            r0.I$0 = r8
            r0.label = r4
            java.lang.Object r9 = r6.getMyFollowing(r2, r0)
            if (r9 != r1) goto L55
            return r1
        L55:
            com.forsale.app.datalayer.network.responses.FollowResponse r9 = (com.forsale.app.datalayer.network.responses.FollowResponse) r9
            goto L6c
        L58:
            com.forsale.app.datalayer.network.services.FollowService r6 = r5.followService
            com.forsale.app.datalayer.network.requestsbodies.FollowBody r2 = new com.forsale.app.datalayer.network.requestsbodies.FollowBody
            r2.<init>(r8, r9, r7)
            r0.I$0 = r8
            r0.label = r3
            java.lang.Object r9 = r6.getMyFollowers(r2, r0)
            if (r9 != r1) goto L6a
            return r1
        L6a:
            com.forsale.app.datalayer.network.responses.FollowResponse r9 = (com.forsale.app.datalayer.network.responses.FollowResponse) r9
        L6c:
            java.util.List r6 = r9.getUsers()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L76:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L86
            java.lang.Object r7 = r6.next()
            com.forsale.app.datalayer.network.responses.FollowResponse$User r7 = (com.forsale.app.datalayer.network.responses.FollowResponse.User) r7
            r7.setPageNumber(r8)
            goto L76
        L86:
            java.util.List r6 = r9.getUsers()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.FollowRepository.followerFollowingRetriever(boolean, java.lang.String, int, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadInitialPage(boolean r6, java.lang.String r7, zz.a<? super java.lang.Integer> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.forsale.app.datalayer.repositories.FollowRepository$loadInitialPage$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.datalayer.repositories.FollowRepository$loadInitialPage$1 r0 = (com.forsale.app.datalayer.repositories.FollowRepository$loadInitialPage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.FollowRepository$loadInitialPage$1 r0 = new com.forsale.app.datalayer.repositories.FollowRepository$loadInitialPage$1
            r0.<init>(r5, r8)
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
            goto L7f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$0
            com.forsale.app.datalayer.repositories.FollowRepository r6 = (com.forsale.app.datalayer.repositories.FollowRepository) r6
            kotlin.f.b(r8)
            goto L4b
        L3c:
            kotlin.f.b(r8)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r8 = r5.followerFollowingRetriever(r6, r7, r4, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            r6 = r5
        L4b:
            r7 = r8
            java.util.List r7 = (java.util.List) r7
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            r7 = r7 ^ r4
            r2 = 0
            if (r7 == 0) goto L59
            goto L5a
        L59:
            r8 = r2
        L5a:
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L89
            java.util.Collection r8 = (java.util.Collection) r8
            r7 = 0
            com.forsale.app.datalayer.network.responses.FollowResponse$User[] r7 = new com.forsale.app.datalayer.network.responses.FollowResponse.User[r7]
            java.lang.Object[] r7 = r8.toArray(r7)
            com.forsale.app.datalayer.network.responses.FollowResponse$User[] r7 = (com.forsale.app.datalayer.network.responses.FollowResponse.User[]) r7
            if (r7 == 0) goto L89
            com.forsale.app.datalayer.repositories.FollowUserDao r6 = r6.followUserDao
            int r8 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r8)
            com.forsale.app.datalayer.network.responses.FollowResponse$User[] r7 = (com.forsale.app.datalayer.network.responses.FollowResponse.User[]) r7
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r8 = r6.insertUsers(r7, r0)
            if (r8 != r1) goto L7f
            return r1
        L7f:
            java.util.List r8 = (java.util.List) r8
            int r6 = r8.size()
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.a.d(r6)
        L89:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.FollowRepository.loadInitialPage(boolean, java.lang.String, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadPage(boolean r6, java.lang.String r7, int r8, zz.a<? super java.lang.Integer> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.forsale.app.datalayer.repositories.FollowRepository$loadPage$1
            if (r0 == 0) goto L13
            r0 = r9
            com.forsale.app.datalayer.repositories.FollowRepository$loadPage$1 r0 = (com.forsale.app.datalayer.repositories.FollowRepository$loadPage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.FollowRepository$loadPage$1 r0 = new com.forsale.app.datalayer.repositories.FollowRepository$loadPage$1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r9)
            goto L6d
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.L$0
            com.forsale.app.datalayer.repositories.FollowRepository r6 = (com.forsale.app.datalayer.repositories.FollowRepository) r6
            kotlin.f.b(r9)
            goto L4d
        L3c:
            kotlin.f.b(r9)
            if (r8 <= r4) goto L78
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r9 = r5.followerFollowingRetriever(r6, r7, r8, r0)
            if (r9 != r1) goto L4c
            return r1
        L4c:
            r6 = r5
        L4d:
            java.util.Collection r9 = (java.util.Collection) r9
            r7 = 0
            com.forsale.app.datalayer.network.responses.FollowResponse$User[] r7 = new com.forsale.app.datalayer.network.responses.FollowResponse.User[r7]
            java.lang.Object[] r7 = r9.toArray(r7)
            com.forsale.app.datalayer.network.responses.FollowResponse$User[] r7 = (com.forsale.app.datalayer.network.responses.FollowResponse.User[]) r7
            com.forsale.app.datalayer.repositories.FollowUserDao r6 = r6.followUserDao
            int r8 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r8)
            com.forsale.app.datalayer.network.responses.FollowResponse$User[] r7 = (com.forsale.app.datalayer.network.responses.FollowResponse.User[]) r7
            r8 = 0
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r9 = r6.insertUsers(r7, r0)
            if (r9 != r1) goto L6d
            return r1
        L6d:
            java.util.List r9 = (java.util.List) r9
            int r6 = r9.size()
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.a.d(r6)
            return r6
        L78:
            java.lang.IndexOutOfBoundsException r6 = new java.lang.IndexOutOfBoundsException
            java.lang.String r7 = "You mast call loadInitialPage for initial load"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.FollowRepository.loadPage(boolean, java.lang.String, int, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object unfollow(java.lang.String r7, java.lang.String r8, zz.a<? super java.lang.Boolean> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.forsale.app.datalayer.repositories.FollowRepository$unfollow$1
            if (r0 == 0) goto L13
            r0 = r9
            com.forsale.app.datalayer.repositories.FollowRepository$unfollow$1 r0 = (com.forsale.app.datalayer.repositories.FollowRepository$unfollow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.FollowRepository$unfollow$1 r0 = new com.forsale.app.datalayer.repositories.FollowRepository$unfollow$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4a
            if (r2 == r5) goto L3d
            if (r2 != r4) goto L35
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$1
            java.lang.Object r0 = r0.L$0
            com.forsale.app.datalayer.repositories.FollowRepository r0 = (com.forsale.app.datalayer.repositories.FollowRepository) r0
            kotlin.f.b(r9)
            goto L7d
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            java.lang.Object r7 = r0.L$1
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.L$0
            com.forsale.app.datalayer.repositories.FollowRepository r7 = (com.forsale.app.datalayer.repositories.FollowRepository) r7
            kotlin.f.b(r9)
            goto L62
        L4a:
            kotlin.f.b(r9)
            com.forsale.app.datalayer.network.services.FollowService r9 = r6.followService
            com.forsale.app.datalayer.network.requestsbodies.FollowToggleBody r2 = new com.forsale.app.datalayer.network.requestsbodies.FollowToggleBody
            r2.<init>(r7, r8, r3)
            r0.L$0 = r6
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r9 = r9.userFollowToggle(r2, r0)
            if (r9 != r1) goto L61
            return r1
        L61:
            r7 = r6
        L62:
            r2 = r9
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            com.forsale.app.datalayer.repositories.FollowUserDao r5 = r7.followUserDao
            r0.L$0 = r7
            r0.L$1 = r9
            r0.Z$0 = r2
            r0.label = r4
            java.lang.Object r8 = r5.updateFollow(r8, r3, r0)
            if (r8 != r1) goto L7a
            return r1
        L7a:
            r0 = r7
            r8 = r9
            r7 = r2
        L7d:
            if (r7 == 0) goto L84
            com.forsale.app.utils.analytics.FollowActionType r7 = com.forsale.app.utils.analytics.FollowActionType.USER_UNFOLLOWED
            r0.logProfileActionAnalytics(r7)
        L84:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.FollowRepository.unfollow(java.lang.String, java.lang.String, zz.a):java.lang.Object");
    }
}
