package com.forsale.app.features.more.newprofile.followerandfollowing.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FollowersAndFollowingPagingSource.kt */
@d(c = "com.forsale.app.features.more.newprofile.followerandfollowing.paging.FollowersAndFollowingPagingSource", f = "FollowersAndFollowingPagingSource.kt", l = {28}, m = "load")
/* loaded from: classes2.dex */
public final class FollowersAndFollowingPagingSource$load$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    int f32304a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f32305b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ FollowersAndFollowingPagingSource f32306c;

    /* renamed from: d  reason: collision with root package name */
    int f32307d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowersAndFollowingPagingSource$load$1(FollowersAndFollowingPagingSource followersAndFollowingPagingSource, a<? super FollowersAndFollowingPagingSource$load$1> aVar) {
        super(aVar);
        this.f32306c = followersAndFollowingPagingSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32305b = obj;
        this.f32307d |= Integer.MIN_VALUE;
        return this.f32306c.f(null, this);
    }
}
