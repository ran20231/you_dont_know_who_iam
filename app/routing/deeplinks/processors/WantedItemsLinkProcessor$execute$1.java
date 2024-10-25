package com.forsale.app.routing.deeplinks.processors;

import com.google.android.gms.common.ConnectionResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WantedItemsLinkProcessor.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.routing.deeplinks.processors.WantedItemsLinkProcessor", f = "WantedItemsLinkProcessor.kt", l = {ConnectionResult.API_DISABLED}, m = "execute")
/* loaded from: classes2.dex */
public final class WantedItemsLinkProcessor$execute$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f37769a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f37770b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ WantedItemsLinkProcessor f37771c;

    /* renamed from: d  reason: collision with root package name */
    int f37772d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WantedItemsLinkProcessor$execute$1(WantedItemsLinkProcessor wantedItemsLinkProcessor, zz.a<? super WantedItemsLinkProcessor$execute$1> aVar) {
        super(aVar);
        this.f37771c = wantedItemsLinkProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37770b = obj;
        this.f37772d |= Integer.MIN_VALUE;
        return this.f37771c.a(null, null, null, null, this);
    }
}
