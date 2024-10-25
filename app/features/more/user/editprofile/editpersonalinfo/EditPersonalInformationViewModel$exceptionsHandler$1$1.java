package com.forsale.app.features.more.user.editprofile.editpersonalinfo;

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
/* compiled from: EditPersonalInformationViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationViewModel$exceptionsHandler$1$1", f = "EditPersonalInformationViewModel.kt", l = {73, 75}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class EditPersonalInformationViewModel$exceptionsHandler$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33339a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ EditPersonalInformationViewModel f33340b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Throwable f33341c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditPersonalInformationViewModel$exceptionsHandler$1$1(EditPersonalInformationViewModel editPersonalInformationViewModel, Throwable th2, zz.a<? super EditPersonalInformationViewModel$exceptionsHandler$1$1> aVar) {
        super(2, aVar);
        this.f33340b = editPersonalInformationViewModel;
        this.f33341c = th2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new EditPersonalInformationViewModel$exceptionsHandler$1$1(this.f33340b, this.f33341c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        boolean B;
        AuthErrorHandler authErrorHandler;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33339a;
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
            mutableStateFlow = this.f33340b.f33331j;
            g.b bVar = g.b.f33381a;
            this.f33339a = 1;
            if (mutableStateFlow.emit(bVar, this) == f11) {
                return f11;
            }
        }
        B = this.f33340b.B(this.f33341c);
        if (B) {
            mutableSharedFlow = this.f33340b.f33333y;
            lf.a aVar = new lf.a(new a.b(q0.C), new a.b(y0.Y, new Object[0]));
            this.f33339a = 2;
            if (mutableSharedFlow.emit(aVar, this) == f11) {
                return f11;
            }
        } else {
            authErrorHandler = this.f33340b.f33329h;
            final EditPersonalInformationViewModel editPersonalInformationViewModel = this.f33340b;
            authErrorHandler.a(new l<bj.c, wz.p>() { // from class: com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationViewModel$exceptionsHandler$1$1.1
                {
                    super(1);
                }

                public final void b(bj.c it2) {
                    o.i(it2, "it");
                    EditPersonalInformationViewModel.this.F(it2);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(bj.c cVar) {
                    b(cVar);
                    return wz.p.f75480a;
                }
            }).b(this.f33341c);
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((EditPersonalInformationViewModel$exceptionsHandler$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
