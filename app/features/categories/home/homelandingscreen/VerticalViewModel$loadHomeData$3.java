package com.forsale.app.features.categories.home.homelandingscreen;

import com.forsale.app.base.ViewStates;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerticalViewModel.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadHomeData$3", f = "VerticalViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class VerticalViewModel$loadHomeData$3 extends SuspendLambda implements p<VerticalViewModel, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23996a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Throwable f23997b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ VerticalViewModel f23998c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalViewModel$loadHomeData$3(Throwable th2, VerticalViewModel verticalViewModel, zz.a<? super VerticalViewModel$loadHomeData$3> aVar) {
        super(2, aVar);
        this.f23997b = th2;
        this.f23998c = verticalViewModel;
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(VerticalViewModel verticalViewModel, zz.a<? super wz.p> aVar) {
        return ((VerticalViewModel$loadHomeData$3) create(verticalViewModel, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new VerticalViewModel$loadHomeData$3(this.f23997b, this.f23998c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.f();
        if (this.f23996a == 0) {
            f.b(obj);
            if (this.f23997b instanceof ConnectivityInterceptor.ConnectivityException) {
                this.f23998c.v0().setValue(ViewStates.CONNECTION_ERROR);
            } else {
                this.f23998c.v0().setValue(ViewStates.ERROR);
            }
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
