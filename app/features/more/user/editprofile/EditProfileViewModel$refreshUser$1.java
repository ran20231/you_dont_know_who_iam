package com.forsale.app.features.more.user.editprofile;

import androidx.lifecycle.r0;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.editprofile.EditProfileViewModel$refreshUser$1", f = "EditProfileViewModel.kt", l = {FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class EditProfileViewModel$refreshUser$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33035a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ EditProfileViewModel f33036b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfileViewModel$refreshUser$1(EditProfileViewModel editProfileViewModel, zz.a<? super EditProfileViewModel$refreshUser$1> aVar) {
        super(2, aVar);
        this.f33036b = editProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new EditProfileViewModel$refreshUser$1(this.f33036b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        UserProfileInteractor userProfileInteractor;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33035a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            userProfileInteractor = this.f33036b.f32972e;
            CoroutineScope a11 = r0.a(this.f33036b);
            this.f33035a = 1;
            if (UserProfileInteractor.o(userProfileInteractor, a11, false, this, 2, null) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((EditProfileViewModel$refreshUser$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
