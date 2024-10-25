package com.forsale.app.routing.deeplinks.processors;

import com.google.android.gms.maps.model.PinConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FollowersLinkProcessor.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.routing.deeplinks.processors.FollowersLinkProcessor", f = "FollowersLinkProcessor.kt", l = {25, PinConfig.BITMAP_WIDTH_DP}, m = "execute")
/* loaded from: classes2.dex */
public final class FollowersLinkProcessor$execute$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f37698a;

    /* renamed from: b  reason: collision with root package name */
    Object f37699b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f37700c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ FollowersLinkProcessor f37701d;

    /* renamed from: e  reason: collision with root package name */
    int f37702e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowersLinkProcessor$execute$1(FollowersLinkProcessor followersLinkProcessor, zz.a<? super FollowersLinkProcessor$execute$1> aVar) {
        super(aVar);
        this.f37701d = followersLinkProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37700c = obj;
        this.f37702e |= Integer.MIN_VALUE;
        return this.f37701d.a(null, null, null, null, this);
    }
}
