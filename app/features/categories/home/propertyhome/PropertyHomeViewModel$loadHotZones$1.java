package com.forsale.app.features.categories.home.propertyhome;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okhttp3.internal.ws.WebSocketProtocol;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PropertyHomeViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel", f = "PropertyHomeViewModel.kt", l = {WebSocketProtocol.PAYLOAD_SHORT, 129, 132, 136}, m = "loadHotZones")
/* loaded from: classes2.dex */
public final class PropertyHomeViewModel$loadHotZones$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f24813a;

    /* renamed from: b  reason: collision with root package name */
    Object f24814b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f24815c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PropertyHomeViewModel f24816d;

    /* renamed from: e  reason: collision with root package name */
    int f24817e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyHomeViewModel$loadHotZones$1(PropertyHomeViewModel propertyHomeViewModel, zz.a<? super PropertyHomeViewModel$loadHotZones$1> aVar) {
        super(aVar);
        this.f24816d = propertyHomeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object I;
        this.f24815c = obj;
        this.f24817e |= Integer.MIN_VALUE;
        I = this.f24816d.I(this);
        return I;
    }
}
