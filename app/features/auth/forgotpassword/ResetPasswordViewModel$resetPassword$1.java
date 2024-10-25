package com.forsale.app.features.auth.forgotpassword;

import com.forsale.app.datalayer.network.responses.RequestCompleted;
import com.forsale.app.features.auth.utils.AuthErrorHandler;
import g00.l;
import g00.p;
import ga.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ResetPasswordViewModel.kt */
@d(c = "com.forsale.app.features.auth.forgotpassword.ResetPasswordViewModel$resetPassword$1", f = "ResetPasswordViewModel.kt", l = {70, 76}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ResetPasswordViewModel$resetPassword$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f22719a;

    /* renamed from: b  reason: collision with root package name */
    int f22720b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ResetPasswordViewModel f22721c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f22722d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f22723e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f22724f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetPasswordViewModel$resetPassword$1(ResetPasswordViewModel resetPasswordViewModel, String str, String str2, String str3, a<? super ResetPasswordViewModel$resetPassword$1> aVar) {
        super(2, aVar);
        this.f22721c = resetPasswordViewModel;
        this.f22722d = str;
        this.f22723e = str2;
        this.f22724f = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new ResetPasswordViewModel$resetPassword$1(this.f22721c, this.f22722d, this.f22723e, this.f22724f, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        AuthErrorHandler authErrorHandler;
        boolean m11;
        MutableStateFlow mutableStateFlow2;
        c cVar;
        String str;
        Object w11;
        f11 = b.f();
        int i11 = this.f22720b;
        try {
            try {
            } catch (Exception e11) {
                authErrorHandler = this.f22721c.f22706f;
                final ResetPasswordViewModel resetPasswordViewModel = this.f22721c;
                authErrorHandler.a(new l<bj.c, wz.p>() { // from class: com.forsale.app.features.auth.forgotpassword.ResetPasswordViewModel$resetPassword$1.2
                    {
                        super(1);
                    }

                    public final void b(bj.c it2) {
                        o.i(it2, "it");
                        ResetPasswordViewModel.this.v(it2);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ wz.p invoke(bj.c cVar2) {
                        b(cVar2);
                        return wz.p.f75480a;
                    }
                }).b(e11);
            }
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
                m11 = this.f22721c.m(this.f22722d, this.f22723e);
                if (m11) {
                    mutableStateFlow2 = this.f22721c.B;
                    mutableStateFlow2.setValue(kotlin.coroutines.jvm.internal.a.a(true));
                    cVar = this.f22721c.f22704d;
                    String str2 = this.f22724f;
                    str = this.f22721c.f22707g;
                    int parseInt = Integer.parseInt(str);
                    String str3 = this.f22722d;
                    String str4 = this.f22723e;
                    this.f22720b = 1;
                    obj = cVar.a(str2, parseInt, str3, str4, this);
                    if (obj == f11) {
                        return f11;
                    }
                }
                return wz.p.f75480a;
            }
            ResetPasswordViewModel resetPasswordViewModel2 = this.f22721c;
            String message = ((RequestCompleted) obj).getMessage();
            if (message == null) {
                message = "Changed Successfully";
            }
            this.f22719a = obj;
            this.f22720b = 2;
            w11 = resetPasswordViewModel2.w(message, this);
            if (w11 == f11) {
                return f11;
            }
            return wz.p.f75480a;
        } finally {
            mutableStateFlow = this.f22721c.B;
            mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.a.a(false));
        }
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((ResetPasswordViewModel$resetPassword$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
