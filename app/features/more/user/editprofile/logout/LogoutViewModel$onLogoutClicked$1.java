package com.forsale.app.features.more.user.editprofile.logout;

import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LogoutViewModel.kt */
@d(c = "com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$onLogoutClicked$1", f = "LogoutViewModel.kt", l = {84}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LogoutViewModel$onLogoutClicked$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33498a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LogoutViewModel f33499b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoutViewModel$onLogoutClicked$1(LogoutViewModel logoutViewModel, a<? super LogoutViewModel$onLogoutClicked$1> aVar) {
        super(2, aVar);
        this.f33499b = logoutViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new LogoutViewModel$onLogoutClicked$1(this.f33499b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = b.f();
        int i11 = this.f33498a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f33499b.f33452o0;
            wz.p pVar = wz.p.f75480a;
            this.f33498a = 1;
            if (mutableSharedFlow.emit(pVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((LogoutViewModel$onLogoutClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}