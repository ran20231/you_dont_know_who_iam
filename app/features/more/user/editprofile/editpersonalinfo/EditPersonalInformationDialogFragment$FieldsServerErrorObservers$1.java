package com.forsale.app.features.more.user.editprofile.editpersonalinfo;

import com.forsale.app.features.auth.views.textfieldstates.TextFieldState;
import g00.p;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import rj.a;
/* compiled from: EditPersonalInformationDialogFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationDialogFragment$FieldsServerErrorObservers$1", f = "EditPersonalInformationDialogFragment.kt", l = {241}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class EditPersonalInformationDialogFragment$FieldsServerErrorObservers$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33300a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ EditPersonalInformationViewModel f33301b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TextFieldState f33302c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditPersonalInformationDialogFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<rj.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextFieldState f33303a;

        a(TextFieldState textFieldState) {
            this.f33303a = textFieldState;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(rj.a aVar, zz.a<? super wz.p> aVar2) {
            this.f33303a.l(aVar instanceof a.C0804a);
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditPersonalInformationDialogFragment$FieldsServerErrorObservers$1(EditPersonalInformationViewModel editPersonalInformationViewModel, TextFieldState textFieldState, zz.a<? super EditPersonalInformationDialogFragment$FieldsServerErrorObservers$1> aVar) {
        super(2, aVar);
        this.f33301b = editPersonalInformationViewModel;
        this.f33302c = textFieldState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new EditPersonalInformationDialogFragment$FieldsServerErrorObservers$1(this.f33301b, this.f33302c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33300a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            StateFlow<rj.a> w11 = this.f33301b.w();
            a aVar = new a(this.f33302c);
            this.f33300a = 1;
            if (w11.collect(aVar, this) == f11) {
                return f11;
            }
        }
        throw new KotlinNothingValueException();
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((EditPersonalInformationDialogFragment$FieldsServerErrorObservers$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
