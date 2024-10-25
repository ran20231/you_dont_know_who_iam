package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FollowInteractor.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.FollowInteractor", f = "FollowInteractor.kt", l = {20, 19, 25, 24}, m = "followUser")
/* loaded from: classes2.dex */
public final class FollowInteractor$followUser$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25938a;

    /* renamed from: b  reason: collision with root package name */
    Object f25939b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f25940c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ FollowInteractor f25941d;

    /* renamed from: e  reason: collision with root package name */
    int f25942e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowInteractor$followUser$1(FollowInteractor followInteractor, zz.a<? super FollowInteractor$followUser$1> aVar) {
        super(aVar);
        this.f25941d = followInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25940c = obj;
        this.f25942e |= Integer.MIN_VALUE;
        return this.f25941d.a(false, null, this);
    }
}
