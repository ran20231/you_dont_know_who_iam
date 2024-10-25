package com.forsale.adserver.view.viewmodel;

import com.forsale.adserver.view.models.AdsModel;
import com.forsale.analytics.commercial.CommercialItemDetailsSource;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewDetailsViewModel.kt */
@d(c = "com.forsale.adserver.view.viewmodel.NewDetailsViewModel$initialize$1", f = "NewDetailsViewModel.kt", l = {102, 104, FacebookMediationAdapter.ERROR_NULL_CONTEXT, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD, 112, 116}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewDetailsViewModel$initialize$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f21772a;

    /* renamed from: b  reason: collision with root package name */
    int f21773b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AdsModel f21774c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ NewDetailsViewModel f21775d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ CommercialItemDetailsSource f21776e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewDetailsViewModel$initialize$1(AdsModel adsModel, NewDetailsViewModel newDetailsViewModel, CommercialItemDetailsSource commercialItemDetailsSource, a<? super NewDetailsViewModel$initialize$1> aVar) {
        super(2, aVar);
        this.f21774c = adsModel;
        this.f21775d = newDetailsViewModel;
        this.f21776e = commercialItemDetailsSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new NewDetailsViewModel$initialize$1(this.f21774c, this.f21775d, this.f21776e, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.view.viewmodel.NewDetailsViewModel$initialize$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((NewDetailsViewModel$initialize$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
