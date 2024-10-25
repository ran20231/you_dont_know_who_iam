package com.forsale.adserver.view.viewmodel;

import com.forsale.adserver.view.models.AdsModel;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewDetailsViewModel.kt */
@d(c = "com.forsale.adserver.view.viewmodel.NewDetailsViewModel$recordPhoneClicked$1$1", f = "NewDetailsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewDetailsViewModel$recordPhoneClicked$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21797a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewDetailsViewModel f21798b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AdsModel f21799c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f21800d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewDetailsViewModel$recordPhoneClicked$1$1(NewDetailsViewModel newDetailsViewModel, AdsModel adsModel, String str, a<? super NewDetailsViewModel$recordPhoneClicked$1$1> aVar) {
        super(2, aVar);
        this.f21798b = newDetailsViewModel;
        this.f21799c = adsModel;
        this.f21800d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new NewDetailsViewModel$recordPhoneClicked$1$1(this.f21798b, this.f21799c, this.f21800d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DetailsAnalyticsLogger T;
        b.f();
        if (this.f21797a == 0) {
            f.b(obj);
            T = this.f21798b.T();
            T.l(this.f21799c, this.f21800d);
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((NewDetailsViewModel$recordPhoneClicked$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
