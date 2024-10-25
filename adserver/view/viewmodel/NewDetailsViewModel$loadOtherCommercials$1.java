package com.forsale.adserver.view.viewmodel;

import com.forsale.adserver.view.models.AdsModel;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewDetailsViewModel.kt */
@d(c = "com.forsale.adserver.view.viewmodel.NewDetailsViewModel$loadOtherCommercials$1", f = "NewDetailsViewModel.kt", l = {224, 222, 230, 228, 235}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewDetailsViewModel$loadOtherCommercials$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f21777a;

    /* renamed from: b  reason: collision with root package name */
    Object f21778b;

    /* renamed from: c  reason: collision with root package name */
    int f21779c;

    /* renamed from: d  reason: collision with root package name */
    int f21780d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ NewDetailsViewModel f21781e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ AdsModel f21782f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewDetailsViewModel$loadOtherCommercials$1(NewDetailsViewModel newDetailsViewModel, AdsModel adsModel, a<? super NewDetailsViewModel$loadOtherCommercials$1> aVar) {
        super(2, aVar);
        this.f21781e = newDetailsViewModel;
        this.f21782f = adsModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new NewDetailsViewModel$loadOtherCommercials$1(this.f21781e, this.f21782f, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.view.viewmodel.NewDetailsViewModel$loadOtherCommercials$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((NewDetailsViewModel$loadOtherCommercials$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
