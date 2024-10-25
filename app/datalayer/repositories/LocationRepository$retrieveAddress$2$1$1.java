package com.forsale.app.datalayer.repositories;

import android.location.Address;
import g00.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
/* compiled from: LocationRepository.kt */
/* loaded from: classes2.dex */
/* synthetic */ class LocationRepository$retrieveAddress$2$1$1 extends FunctionReferenceImpl implements l<Integer, String> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationRepository$retrieveAddress$2$1$1(Object obj) {
        super(1, obj, Address.class, "getAddressLine", "getAddressLine(I)Ljava/lang/String;", 0);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ String invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final String invoke(int i11) {
        return ((Address) this.receiver).getAddressLine(i11);
    }
}
