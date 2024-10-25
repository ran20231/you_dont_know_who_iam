package com.forsale.app.datalayer.database.masterdata;

import com.google.android.gms.maps.model.PinConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetMasterDataInteractor.kt */
@d(c = "com.forsale.app.datalayer.database.masterdata.GetMasterDataInteractor", f = "GetMasterDataInteractor.kt", l = {25, PinConfig.BITMAP_WIDTH_DP, 30, 34, 36, PinConfig.BITMAP_LENGTH_DP}, m = "invoke")
/* loaded from: classes2.dex */
public final class GetMasterDataInteractor$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetMasterDataInteractor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMasterDataInteractor$invoke$1(GetMasterDataInteractor getMasterDataInteractor, a<? super GetMasterDataInteractor$invoke$1> aVar) {
        super(aVar);
        this.this$0 = getMasterDataInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(this);
    }
}
