package com.forsale.adserver.view.viewmodel;

import com.forsale.adserver.view.models.AdsModel;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewDetailsViewModel.kt */
@d(c = "com.forsale.adserver.view.viewmodel.NewDetailsViewModel$onDownloadClicked$1$1", f = "NewDetailsViewModel.kt", l = {193}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewDetailsViewModel$onDownloadClicked$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21788a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AdsModel f21789b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NewDetailsViewModel f21790c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewDetailsViewModel$onDownloadClicked$1$1(AdsModel adsModel, NewDetailsViewModel newDetailsViewModel, a<? super NewDetailsViewModel$onDownloadClicked$1$1> aVar) {
        super(2, aVar);
        this.f21789b = adsModel;
        this.f21790c = newDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new NewDetailsViewModel$onDownloadClicked$1$1(this.f21789b, this.f21790c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        DetailsAnalyticsLogger T;
        f11 = b.f();
        int i11 = this.f21788a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            if (this.f21789b.h() != null) {
                mutableSharedFlow = this.f21790c.I;
                String h11 = this.f21789b.h();
                this.f21788a = 1;
                if (mutableSharedFlow.emit(h11, this) == f11) {
                    return f11;
                }
            }
        }
        T = this.f21790c.T();
        T.k(this.f21789b);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((NewDetailsViewModel$onDownloadClicked$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
