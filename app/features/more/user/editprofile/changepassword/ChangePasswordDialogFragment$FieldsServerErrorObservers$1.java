package com.forsale.app.features.more.user.editprofile.changepassword;

import com.forsale.app.features.auth.views.textfieldstates.TextFieldState;
import g00.p;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import rj.a;
/* compiled from: ChangePasswordDialogFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.editprofile.changepassword.ChangePasswordDialogFragment$FieldsServerErrorObservers$1", f = "ChangePasswordDialogFragment.kt", l = {277}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ChangePasswordDialogFragment$FieldsServerErrorObservers$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33156a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ChangePasswordViewModel f33157b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TextFieldState f33158c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChangePasswordDialogFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<rj.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextFieldState f33159a;

        a(TextFieldState textFieldState) {
            this.f33159a = textFieldState;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(rj.a aVar, zz.a<? super wz.p> aVar2) {
            this.f33159a.l(aVar instanceof a.C0804a);
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePasswordDialogFragment$FieldsServerErrorObservers$1(ChangePasswordViewModel changePasswordViewModel, TextFieldState textFieldState, zz.a<? super ChangePasswordDialogFragment$FieldsServerErrorObservers$1> aVar) {
        super(2, aVar);
        this.f33157b = changePasswordViewModel;
        this.f33158c = textFieldState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ChangePasswordDialogFragment$FieldsServerErrorObservers$1(this.f33157b, this.f33158c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33156a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            StateFlow<rj.a> x11 = this.f33157b.x();
            a aVar = new a(this.f33158c);
            this.f33156a = 1;
            if (x11.collect(aVar, this) == f11) {
                return f11;
            }
        }
        throw new KotlinNothingValueException();
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ChangePasswordDialogFragment$FieldsServerErrorObservers$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
