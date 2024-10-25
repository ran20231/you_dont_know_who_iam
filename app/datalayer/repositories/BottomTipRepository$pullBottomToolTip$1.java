package com.forsale.app.datalayer.repositories;

import com.google.android.gms.common.api.CommonStatusCodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomTipRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.BottomTipRepository", f = "BottomTipRepository.kt", l = {CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE}, m = "pullBottomToolTip")
/* loaded from: classes2.dex */
public final class BottomTipRepository$pullBottomToolTip$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BottomTipRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomTipRepository$pullBottomToolTip$1(BottomTipRepository bottomTipRepository, zz.a<? super BottomTipRepository$pullBottomToolTip$1> aVar) {
        super(aVar);
        this.this$0 = bottomTipRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.pullBottomToolTip(this);
    }
}
