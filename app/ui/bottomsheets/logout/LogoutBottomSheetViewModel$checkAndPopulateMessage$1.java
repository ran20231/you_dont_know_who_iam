package com.forsale.app.ui.bottomsheets.logout;

import com.forsale.app.datalayer.network.ResponseWrapper;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import t9.y0;
import zz.a;
/* compiled from: LogoutBottomSheetViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.logout.LogoutBottomSheetViewModel$checkAndPopulateMessage$1", f = "LogoutBottomSheetViewModel.kt", l = {129, 142}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class LogoutBottomSheetViewModel$checkAndPopulateMessage$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38920a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Throwable f38921b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LogoutBottomSheetViewModel f38922c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoutBottomSheetViewModel$checkAndPopulateMessage$1(Throwable th2, LogoutBottomSheetViewModel logoutBottomSheetViewModel, a<? super LogoutBottomSheetViewModel$checkAndPopulateMessage$1> aVar) {
        super(2, aVar);
        this.f38921b = th2;
        this.f38922c = logoutBottomSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new LogoutBottomSheetViewModel$checkAndPopulateMessage$1(this.f38921b, this.f38922c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f38920a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            Throwable th2 = this.f38921b;
            if (th2 instanceof ConnectivityInterceptor.ConnectivityException) {
                MutableSharedFlow<Integer> e02 = this.f38922c.e0();
                Integer d11 = kotlin.coroutines.jvm.internal.a.d(y0.X4);
                this.f38920a = 1;
                if (e02.emit(d11, this) == f11) {
                    return f11;
                }
            } else if (th2 instanceof ResponseWrapper.ResponseErrorException) {
                int code = ((ResponseWrapper.ResponseErrorException) th2).getCode();
                x10.a.b("ResponseErrorException: code: " + code, new Object[0]);
                String message = ((ResponseWrapper.ResponseErrorException) this.f38921b).getMessage();
                x10.a.b("ResponseErrorException: code: " + message, new Object[0]);
                ((ResponseWrapper.ResponseErrorException) this.f38921b).getCode();
            } else {
                String message2 = th2.getMessage();
                x10.a.b("checkAndPopulateMessage:: this: " + message2, new Object[0]);
                Throwable cause = this.f38921b.getCause();
                x10.a.b("checkAndPopulateMessage:: this: " + cause, new Object[0]);
                MutableSharedFlow<Integer> e03 = this.f38922c.e0();
                Integer d12 = kotlin.coroutines.jvm.internal.a.d(y0.O4);
                this.f38920a = 2;
                if (e03.emit(d12, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((LogoutBottomSheetViewModel$checkAndPopulateMessage$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
