package com.forsale.app.features.more.user.editprofile.editpersonalinfo;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import rj.a;
import t9.y0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditPersonalInformationViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditPersonalInformationViewModel$onUpdateUserFailed$3", f = "EditPersonalInformationViewModel.kt", l = {193}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class EditPersonalInformationViewModel$onUpdateUserFailed$3 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33354a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ EditPersonalInformationViewModel f33355b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditPersonalInformationViewModel$onUpdateUserFailed$3(EditPersonalInformationViewModel editPersonalInformationViewModel, zz.a<? super EditPersonalInformationViewModel$onUpdateUserFailed$3> aVar) {
        super(2, aVar);
        this.f33355b = editPersonalInformationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new EditPersonalInformationViewModel$onUpdateUserFailed$3(this.f33355b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33354a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f33355b.f33333y;
            lf.a aVar = new lf.a(null, new a.b(y0.f70515j3, new Object[0]), 1, null);
            this.f33354a = 1;
            if (mutableSharedFlow.emit(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((EditPersonalInformationViewModel$onUpdateUserFailed$3) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
