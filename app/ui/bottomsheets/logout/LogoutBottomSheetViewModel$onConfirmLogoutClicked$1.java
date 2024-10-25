package com.forsale.app.ui.bottomsheets.logout;

import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LogoutBottomSheetViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.logout.LogoutBottomSheetViewModel$onConfirmLogoutClicked$1", f = "LogoutBottomSheetViewModel.kt", l = {64}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class LogoutBottomSheetViewModel$onConfirmLogoutClicked$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38923a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LogoutBottomSheetViewModel f38924b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoutBottomSheetViewModel$onConfirmLogoutClicked$1(LogoutBottomSheetViewModel logoutBottomSheetViewModel, a<? super LogoutBottomSheetViewModel$onConfirmLogoutClicked$1> aVar) {
        super(2, aVar);
        this.f38924b = logoutBottomSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new LogoutBottomSheetViewModel$onConfirmLogoutClicked$1(this.f38924b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = b.f();
        int i11 = this.f38923a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f38924b.f38917x0;
            wz.p pVar = wz.p.f75480a;
            this.f38923a = 1;
            if (mutableSharedFlow.emit(pVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((LogoutBottomSheetViewModel$onConfirmLogoutClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
