package com.forsale.app.features.more.user.editprofile;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.editprofile.EditProfileViewModel$showDeleteBottomSheet$1", f = "EditProfileViewModel.kt", l = {175}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class EditProfileViewModel$showDeleteBottomSheet$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33037a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ EditProfileViewModel f33038b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f33039c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfileViewModel$showDeleteBottomSheet$1(EditProfileViewModel editProfileViewModel, boolean z11, zz.a<? super EditProfileViewModel$showDeleteBottomSheet$1> aVar) {
        super(2, aVar);
        this.f33038b = editProfileViewModel;
        this.f33039c = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new EditProfileViewModel$showDeleteBottomSheet$1(this.f33038b, this.f33039c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33037a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableStateFlow = this.f33038b.G;
            fe.a aVar = new fe.a(this.f33039c);
            this.f33037a = 1;
            if (mutableStateFlow.emit(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((EditProfileViewModel$showDeleteBottomSheet$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
