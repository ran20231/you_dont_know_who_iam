package com.forsale.app.ui.map;

import g00.p;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocationPickerActivity.kt */
/* loaded from: classes3.dex */
public /* synthetic */ class LocationPickerActivity$onAutoDetectLocation$1 extends FunctionReferenceImpl implements p<List<? extends String>, g00.a<? extends wz.p>, wz.p> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationPickerActivity$onAutoDetectLocation$1(Object obj) {
        super(2, obj, LocationPickerActivity.class, "onRequestLocationPermission", "onRequestLocationPermission(Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", 0);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(List<? extends String> list, g00.a<? extends wz.p> aVar) {
        m(list, aVar);
        return wz.p.f75480a;
    }

    public final void m(List<String> p02, g00.a<wz.p> p12) {
        o.i(p02, "p0");
        o.i(p12, "p1");
        ((LocationPickerActivity) this.receiver).b1(p02, p12);
    }
}
