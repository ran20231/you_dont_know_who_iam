package com.forsale.app.routing.deeplinks.processors;

import com.google.android.gms.maps.model.PinConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyListingsLinkProcessor.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.routing.deeplinks.processors.MyListingsLinkProcessor", f = "MyListingsLinkProcessor.kt", l = {PinConfig.BITMAP_WIDTH_DP}, m = "execute")
/* loaded from: classes2.dex */
public final class MyListingsLinkProcessor$execute$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f37735a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f37736b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MyListingsLinkProcessor f37737c;

    /* renamed from: d  reason: collision with root package name */
    int f37738d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyListingsLinkProcessor$execute$1(MyListingsLinkProcessor myListingsLinkProcessor, zz.a<? super MyListingsLinkProcessor$execute$1> aVar) {
        super(aVar);
        this.f37737c = myListingsLinkProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37736b = obj;
        this.f37738d |= Integer.MIN_VALUE;
        return this.f37737c.a(null, null, null, null, this);
    }
}
