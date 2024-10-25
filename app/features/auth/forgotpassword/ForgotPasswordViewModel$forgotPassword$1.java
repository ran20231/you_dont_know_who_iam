package com.forsale.app.features.auth.forgotpassword;

import bj.c;
import com.forsale.app.datalayer.network.responses.RequestCompleted;
import com.forsale.app.features.auth.interactors.validationinteractors.h;
import com.forsale.app.features.auth.utils.AuthErrorHandler;
import g00.l;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ForgotPasswordViewModel.kt */
@d(c = "com.forsale.app.features.auth.forgotpassword.ForgotPasswordViewModel$forgotPassword$1", f = "ForgotPasswordViewModel.kt", l = {60, 61}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ForgotPasswordViewModel$forgotPassword$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f22669a;

    /* renamed from: b  reason: collision with root package name */
    int f22670b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ForgotPasswordViewModel f22671c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f22672d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f22673e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForgotPasswordViewModel$forgotPassword$1(ForgotPasswordViewModel forgotPasswordViewModel, String str, boolean z11, a<? super ForgotPasswordViewModel$forgotPassword$1> aVar) {
        super(2, aVar);
        this.f22671c = forgotPasswordViewModel;
        this.f22672d = str;
        this.f22673e = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new ForgotPasswordViewModel$forgotPassword$1(this.f22671c, this.f22672d, this.f22673e, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        AuthErrorHandler authErrorHandler;
        MutableStateFlow mutableStateFlow2;
        ga.a aVar;
        MutableSharedFlow mutableSharedFlow;
        f11 = b.f();
        int i11 = this.f22670b;
        try {
            try {
            } catch (Exception e11) {
                authErrorHandler = this.f22671c.f22659d;
                final ForgotPasswordViewModel forgotPasswordViewModel = this.f22671c;
                authErrorHandler.a(new l<c, wz.p>() { // from class: com.forsale.app.features.auth.forgotpassword.ForgotPasswordViewModel$forgotPassword$1.2
                    {
                        super(1);
                    }

                    public final void b(c it2) {
                        o.i(it2, "it");
                        ForgotPasswordViewModel.this.y(it2);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ wz.p invoke(c cVar) {
                        b(cVar);
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
                this.f22671c.o();
                String a11 = ka.b.a(this.f22672d, this.f22671c.t());
                if (this.f22671c.x(this.f22672d) instanceof h.b) {
                    mutableStateFlow2 = this.f22671c.f22665j;
                    mutableStateFlow2.setValue(kotlin.coroutines.jvm.internal.a.a(true));
                    aVar = this.f22671c.f22657b;
                    boolean z11 = this.f22673e;
                    this.f22670b = 1;
                    obj = aVar.a(a11, z11, this);
                    if (obj == f11) {
                        return f11;
                    }
                }
                return wz.p.f75480a;
            }
            RequestCompleted requestCompleted = (RequestCompleted) obj;
            mutableSharedFlow = this.f22671c.f22663h;
            Boolean a12 = kotlin.coroutines.jvm.internal.a.a(true);
            this.f22669a = obj;
            this.f22670b = 2;
            if (mutableSharedFlow.emit(a12, this) == f11) {
                return f11;
            }
            return wz.p.f75480a;
        } finally {
            mutableStateFlow = this.f22671c.f22665j;
            mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.a.a(false));
        }
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((ForgotPasswordViewModel$forgotPassword$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
