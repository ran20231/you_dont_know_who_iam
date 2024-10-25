package com.forsale.adserver.view.viewmodel;

import com.forsale.adserver.usecases.GetBannerByIdUseCase;
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
@d(c = "com.forsale.adserver.view.viewmodel.BeforeDetailsViewModel$getBannerById$1", f = "BeforeDetailsViewModel.kt", l = {57}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BeforeDetailsViewModel$getBannerById$1 extends SuspendLambda implements l<a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21657a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BeforeDetailsViewModel f21658b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f21659c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeforeDetailsViewModel$getBannerById$1(BeforeDetailsViewModel beforeDetailsViewModel, int i11, a<? super BeforeDetailsViewModel$getBannerById$1> aVar) {
        super(1, aVar);
        this.f21658b = beforeDetailsViewModel;
        this.f21659c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<p> create(a<?> aVar) {
        return new BeforeDetailsViewModel$getBannerById$1(this.f21658b, this.f21659c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        GetBannerByIdUseCase getBannerByIdUseCase;
        f11 = b.f();
        int i11 = this.f21657a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                getBannerByIdUseCase = this.f21658b.f21655c;
                Deferred<g9.b> d11 = getBannerByIdUseCase.d(this.f21659c);
                this.f21657a = 1;
                obj = d11.await(this);
                if (obj == f11) {
                    return f11;
                }
            }
            g9.b bVar = (g9.b) obj;
            if (bVar != null) {
                this.f21658b.l().postValue(new f.d(new a9.b().a(bVar)));
            } else {
                this.f21658b.l().postValue(new f.b(new Exception(" No offer with that id")));
            }
        } catch (Exception e11) {
            this.f21658b.l().postValue(new f.b(e11));
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(a<? super p> aVar) {
        return ((BeforeDetailsViewModel$getBannerById$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
