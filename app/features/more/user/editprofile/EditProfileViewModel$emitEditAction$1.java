package com.forsale.app.features.more.user.editprofile;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.editprofile.EditProfileViewModel$emitEditAction$1", f = "EditProfileViewModel.kt", l = {124}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class EditProfileViewModel$emitEditAction$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32992a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ EditProfileViewModel f32993b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a f32994c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f32995d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfileViewModel$emitEditAction$1(EditProfileViewModel editProfileViewModel, a aVar, g00.a<wz.p> aVar2, zz.a<? super EditProfileViewModel$emitEditAction$1> aVar3) {
        super(2, aVar3);
        this.f32993b = editProfileViewModel;
        this.f32994c = aVar;
        this.f32995d = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new EditProfileViewModel$emitEditAction$1(this.f32993b, this.f32994c, this.f32995d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f32992a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableSharedFlow = this.f32993b.f32979y;
            a aVar = this.f32994c;
            this.f32992a = 1;
            if (mutableSharedFlow.emit(aVar, this) == f11) {
                return f11;
            }
        }
        this.f32995d.invoke();
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((EditProfileViewModel$emitEditAction$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
