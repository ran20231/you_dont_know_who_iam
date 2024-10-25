package com.forsale.app.datalayer.network.services;

import com.forsale.app.datalayer.network.requestsbodies.GetPlansBody;
import com.forsale.app.datalayer.network.responses.PlansResponse;
import i10.a;
import i10.o;
/* compiled from: PlansServices.kt */
/* loaded from: classes2.dex */
public interface PlansServices {
    @o("Plans/getPlans")
    Object getPlansService(@a GetPlansBody getPlansBody, zz.a<? super PlansResponse> aVar);
}
