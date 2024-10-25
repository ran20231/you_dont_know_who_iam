package com.forsale.adserver.view.viewmodel;

import a9.e;
import com.forsale.adserver.usecases.offersInteractors.OffersInteractor;
import g00.l;
import j9.f;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.Deferred;
import wz.p;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BeforeDetailsViewModel.kt */
@d(c = "com.forsale.adserver.view.viewmodel.BeforeDetailsViewModel$getOfferById$1", f = "BeforeDetailsViewModel.kt", l = {39}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BeforeDetailsViewModel$getOfferById$1 extends SuspendLambda implements l<a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21660a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BeforeDetailsViewModel f21661b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f21662c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeforeDetailsViewModel$getOfferById$1(BeforeDetailsViewModel beforeDetailsViewModel, int i11, a<? super BeforeDetailsViewModel$getOfferById$1> aVar) {
        super(1, aVar);
        this.f21661b = beforeDetailsViewModel;
        this.f21662c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(a<?> aVar) {
        return new BeforeDetailsViewModel$getOfferById$1(this.f21661b, this.f21662c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        OffersInteractor offersInteractor;
        f11 = b.f();
        int i11 = this.f21660a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                offersInteractor = this.f21661b.f21654b;
                Deferred<g9.d> m11 = offersInteractor.m(this.f21662c);
                this.f21660a = 1;
                obj = m11.await(this);
                if (obj == f11) {
                    return f11;
                }
            }
            g9.d dVar = (g9.d) obj;
            if (dVar != null) {
                this.f21661b.l().postValue(new f.d(new e().a(dVar)));
            } else {
                this.f21661b.l().postValue(new f.b(new Exception(" No offer with that id")));
            }
        } catch (Exception e11) {
            this.f21661b.l().postValue(new f.b(e11));
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(a<? super p> aVar) {
        return ((BeforeDetailsViewModel$getOfferById$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
