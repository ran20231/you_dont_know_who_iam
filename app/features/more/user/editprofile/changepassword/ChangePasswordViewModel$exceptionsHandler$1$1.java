package com.forsale.app.features.more.user.editprofile.changepassword;

import com.forsale.app.features.auth.utils.AuthErrorHandler;
import com.forsale.app.features.more.user.editprofile.g;
import com.forsale.app.feedback.a;
import g00.l;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import rj.a;
import t9.q0;
import t9.y0;
/* compiled from: ChangePasswordViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.editprofile.changepassword.ChangePasswordViewModel$exceptionsHandler$1$1", f = "ChangePasswordViewModel.kt", l = {76, 78}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ChangePasswordViewModel$exceptionsHandler$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33197a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ChangePasswordViewModel f33198b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Throwable f33199c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePasswordViewModel$exceptionsHandler$1$1(ChangePasswordViewModel changePasswordViewModel, Throwable th2, zz.a<? super ChangePasswordViewModel$exceptionsHandler$1$1> aVar) {
        super(2, aVar);
        this.f33198b = changePasswordViewModel;
        this.f33199c = th2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ChangePasswordViewModel$exceptionsHandler$1$1(this.f33198b, this.f33199c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        boolean C;
        AuthErrorHandler authErrorHandler;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33197a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            mutableStateFlow = this.f33198b.f33191i;
            g.b bVar = g.b.f33381a;
            this.f33197a = 1;
            if (mutableStateFlow.emit(bVar, this) == f11) {
                return f11;
            }
        }
        C = this.f33198b.C(this.f33199c);
        if (C) {
            mutableSharedFlow = this.f33198b.f33193x;
            lf.a aVar = new lf.a(new a.b(q0.C), new a.b(y0.Y, new Object[0]));
            this.f33197a = 2;
            if (mutableSharedFlow.emit(aVar, this) == f11) {
                return f11;
            }
        } else {
            authErrorHandler = this.f33198b.f33189g;
            final ChangePasswordViewModel changePasswordViewModel = this.f33198b;
            authErrorHandler.a(new l<bj.c, wz.p>() { // from class: com.forsale.app.features.more.user.editprofile.changepassword.ChangePasswordViewModel$exceptionsHandler$1$1.1
                {
                    super(1);
                }

                public final void b(bj.c it2) {
                    o.i(it2, "it");
                    ChangePasswordViewModel.this.F(it2);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(bj.c cVar) {
                    b(cVar);
                    return wz.p.f75480a;
                }
            }).b(this.f33199c);
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ChangePasswordViewModel$exceptionsHandler$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
