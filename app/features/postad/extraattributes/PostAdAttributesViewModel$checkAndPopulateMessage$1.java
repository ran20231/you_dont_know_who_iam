package com.forsale.app.features.postad.extraattributes;

import com.forsale.app.datalayer.network.ResponseWrapper;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import dj.i;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import t9.y0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdAttributesViewModel.kt */
@d(c = "com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel$checkAndPopulateMessage$1", f = "PostAdAttributesViewModel.kt", l = {265, 267, 272}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdAttributesViewModel$checkAndPopulateMessage$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35133a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Throwable f35134b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PostAdAttributesViewModel f35135c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdAttributesViewModel$checkAndPopulateMessage$1(Throwable th2, PostAdAttributesViewModel postAdAttributesViewModel, zz.a<? super PostAdAttributesViewModel$checkAndPopulateMessage$1> aVar) {
        super(2, aVar);
        this.f35134b = th2;
        this.f35135c = postAdAttributesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdAttributesViewModel$checkAndPopulateMessage$1(this.f35134b, this.f35135c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35133a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        f.b(obj);
                        i.f54287a.invoke().f(this.f35134b);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    f.b(obj);
                    i.f54287a.invoke().f(this.f35134b);
                }
            } else {
                f.b(obj);
            }
        } else {
            f.b(obj);
            Throwable th2 = this.f35134b;
            if (th2 instanceof ConnectivityInterceptor.ConnectivityException) {
                MutableSharedFlow<Integer> g02 = this.f35135c.g0();
                Integer d11 = kotlin.coroutines.jvm.internal.a.d(y0.X4);
                this.f35133a = 1;
                if (g02.emit(d11, this) == f11) {
                    return f11;
                }
            } else if (th2 instanceof ResponseWrapper.ResponseErrorException) {
                MutableSharedFlow<String> i02 = this.f35135c.i0();
                String localizedMessage = ((ResponseWrapper.ResponseErrorException) this.f35134b).getLocalizedMessage();
                this.f35133a = 2;
                if (i02.emit(localizedMessage, this) == f11) {
                    return f11;
                }
                i.f54287a.invoke().f(this.f35134b);
            } else {
                MutableSharedFlow<Integer> g03 = this.f35135c.g0();
                Integer d12 = kotlin.coroutines.jvm.internal.a.d(y0.O4);
                this.f35133a = 3;
                if (g03.emit(d12, this) == f11) {
                    return f11;
                }
                i.f54287a.invoke().f(this.f35134b);
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdAttributesViewModel$checkAndPopulateMessage$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
