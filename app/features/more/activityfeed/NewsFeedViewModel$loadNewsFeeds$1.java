package com.forsale.app.features.more.activityfeed;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewsFeedViewModel.kt */
@d(c = "com.forsale.app.features.more.activityfeed.NewsFeedViewModel$loadNewsFeeds$1", f = "NewsFeedViewModel.kt", l = {44, 43}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewsFeedViewModel$loadNewsFeeds$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f31635a;

    /* renamed from: b  reason: collision with root package name */
    int f31636b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NewsFeedViewModel f31637c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewsFeedViewModel$loadNewsFeeds$1(NewsFeedViewModel newsFeedViewModel, a<? super NewsFeedViewModel$loadNewsFeeds$1> aVar) {
        super(2, aVar);
        this.f31637c = newsFeedViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new NewsFeedViewModel$loadNewsFeeds$1(this.f31637c, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r7.f31636b
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            kotlin.f.b(r8)
            goto L53
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            java.lang.Object r1 = r7.f31635a
            com.forsale.app.datalayer.network.services.MessagingService r1 = (com.forsale.app.datalayer.network.services.MessagingService) r1
            kotlin.f.b(r8)
            goto L39
        L23:
            kotlin.f.b(r8)
            com.forsale.app.features.more.activityfeed.NewsFeedViewModel r8 = r7.f31637c
            com.forsale.app.datalayer.network.services.MessagingService r1 = com.forsale.app.features.more.activityfeed.NewsFeedViewModel.w0(r8)
            com.forsale.app.features.more.activityfeed.NewsFeedViewModel r8 = r7.f31637c
            r7.f31635a = r1
            r7.f31636b = r4
            java.lang.Object r8 = r8.x0(r7)
            if (r8 != r0) goto L39
            return r0
        L39:
            java.lang.String r8 = (java.lang.String) r8
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            com.forsale.app.datalayer.network.requestsbodies.NewsFeedsMessagesBody r6 = new com.forsale.app.datalayer.network.requestsbodies.NewsFeedsMessagesBody
            r6.<init>(r8, r5)
            r7.f31635a = r2
            r7.f31636b = r3
            java.lang.Object r8 = r1.getActivityFeedsMessagesAsync(r6, r7)
            if (r8 != r0) goto L53
            return r0
        L53:
            com.forsale.app.datalayer.network.responses.NewsFeedMessagesResponse r8 = (com.forsale.app.datalayer.network.responses.NewsFeedMessagesResponse) r8
            java.util.List r8 = r8.getResults()
            if (r8 == 0) goto L7d
            r0 = r8
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r4
            if (r0 == 0) goto L66
            r2 = r8
        L66:
            if (r2 == 0) goto L7d
            com.forsale.app.features.more.activityfeed.NewsFeedViewModel r8 = r7.f31637c
            androidx.lifecycle.b0 r8 = r8.y0()
            r8.postValue(r2)
            com.forsale.app.features.more.activityfeed.NewsFeedViewModel r8 = r7.f31637c
            androidx.lifecycle.b0 r8 = r8.v0()
            com.forsale.app.base.ViewStates r0 = com.forsale.app.base.ViewStates.CONTENT
            r8.postValue(r0)
            goto L88
        L7d:
            com.forsale.app.features.more.activityfeed.NewsFeedViewModel r8 = r7.f31637c
            androidx.lifecycle.b0 r8 = r8.v0()
            com.forsale.app.base.ViewStates r0 = com.forsale.app.base.ViewStates.Empty
            r8.postValue(r0)
        L88:
            wz.p r8 = wz.p.f75480a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.activityfeed.NewsFeedViewModel$loadNewsFeeds$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((NewsFeedViewModel$loadNewsFeeds$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
