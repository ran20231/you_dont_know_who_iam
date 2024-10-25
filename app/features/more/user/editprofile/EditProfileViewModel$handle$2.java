package com.forsale.app.features.more.user.editprofile;

import com.forsale.app.datalayer.network.ResponseWrapper;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import rj.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.editprofile.EditProfileViewModel$handle$2", f = "EditProfileViewModel.kt", l = {297}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class EditProfileViewModel$handle$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33000a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ EditProfileViewModel f33001b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Throwable f33002c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfileViewModel$handle$2(EditProfileViewModel editProfileViewModel, Throwable th2, zz.a<? super EditProfileViewModel$handle$2> aVar) {
        super(2, aVar);
        this.f33001b = editProfileViewModel;
        this.f33002c = th2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new EditProfileViewModel$handle$2(this.f33001b, this.f33002c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33000a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableSharedFlow = this.f33001b.E;
            lf.a aVar = new lf.a(null, new a.C0804a(((ResponseWrapper.ResponseErrorException) this.f33002c).getMessage()), 1, null);
            this.f33000a = 1;
            if (mutableSharedFlow.emit(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((EditProfileViewModel$handle$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
