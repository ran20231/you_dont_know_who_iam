package com.forsale.app.features.more.newprofile.followerandfollowing;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FollowersAndFollowingsViewModel.kt */
@d(c = "com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel", f = "FollowersAndFollowingsViewModel.kt", l = {242}, m = "handleFollowAndFollowingException")
/* loaded from: classes2.dex */
public final class FollowersAndFollowingsViewModel$handleFollowAndFollowingException$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f32232a;

    /* renamed from: b  reason: collision with root package name */
    Object f32233b;

    /* renamed from: c  reason: collision with root package name */
    Object f32234c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f32235d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ FollowersAndFollowingsViewModel f32236e;

    /* renamed from: f  reason: collision with root package name */
    int f32237f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowersAndFollowingsViewModel$handleFollowAndFollowingException$1(FollowersAndFollowingsViewModel followersAndFollowingsViewModel, zz.a<? super FollowersAndFollowingsViewModel$handleFollowAndFollowingException$1> aVar) {
        super(aVar);
        this.f32236e = followersAndFollowingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object I;
        this.f32235d = obj;
        this.f32237f |= Integer.MIN_VALUE;
        I = this.f32236e.I(null, null, null, this);
        return I;
    }
}
