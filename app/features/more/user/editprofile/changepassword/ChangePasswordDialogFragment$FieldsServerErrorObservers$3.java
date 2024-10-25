package com.forsale.app.features.more.user.editprofile.changepassword;

import g00.p;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import rj.a;
/* compiled from: ChangePasswordDialogFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.editprofile.changepassword.ChangePasswordDialogFragment$FieldsServerErrorObservers$3", f = "ChangePasswordDialogFragment.kt", l = {289}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ChangePasswordDialogFragment$FieldsServerErrorObservers$3 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33164a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ChangePasswordViewModel f33165b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ com.forsale.app.features.auth.views.textfieldstates.a f33166c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChangePasswordDialogFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<rj.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.forsale.app.features.auth.views.textfieldstates.a f33167a;

        a(com.forsale.app.features.auth.views.textfieldstates.a aVar) {
            this.f33167a = aVar;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(rj.a aVar, zz.a<? super wz.p> aVar2) {
            this.f33167a.l(aVar instanceof a.C0804a);
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePasswordDialogFragment$FieldsServerErrorObservers$3(ChangePasswordViewModel changePasswordViewModel, com.forsale.app.features.auth.views.textfieldstates.a aVar, zz.a<? super ChangePasswordDialogFragment$FieldsServerErrorObservers$3> aVar2) {
        super(2, aVar2);
        this.f33165b = changePasswordViewModel;
        this.f33166c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ChangePasswordDialogFragment$FieldsServerErrorObservers$3(this.f33165b, this.f33166c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33164a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            StateFlow<rj.a> v11 = this.f33165b.v();
            a aVar = new a(this.f33166c);
            this.f33164a = 1;
            if (v11.collect(aVar, this) == f11) {
                return f11;
            }
        }
        throw new KotlinNothingValueException();
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ChangePasswordDialogFragment$FieldsServerErrorObservers$3) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
