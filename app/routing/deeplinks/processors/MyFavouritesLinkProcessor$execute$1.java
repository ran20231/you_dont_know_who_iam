package com.forsale.app.routing.deeplinks.processors;

import com.google.android.gms.common.ConnectionResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyFavouritesLinkProcessor.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.routing.deeplinks.processors.MyFavouritesLinkProcessor", f = "MyFavouritesLinkProcessor.kt", l = {ConnectionResult.API_DISABLED}, m = "execute")
/* loaded from: classes2.dex */
public final class MyFavouritesLinkProcessor$execute$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f37727a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f37728b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MyFavouritesLinkProcessor f37729c;

    /* renamed from: d  reason: collision with root package name */
    int f37730d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyFavouritesLinkProcessor$execute$1(MyFavouritesLinkProcessor myFavouritesLinkProcessor, zz.a<? super MyFavouritesLinkProcessor$execute$1> aVar) {
        super(aVar);
        this.f37729c = myFavouritesLinkProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37728b = obj;
        this.f37730d |= Integer.MIN_VALUE;
        return this.f37729c.a(null, null, null, null, this);
    }
}
