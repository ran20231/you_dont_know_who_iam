package com.forsale.app.features.more.user.editprofile;

import com.forsale.app.features.more.user.editprofile.analytics.MyProfileChangePasswordClickedAnalyticsEvent;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.editprofile.EditProfileViewModel$logChangePasswordClicked$1", f = "EditProfileViewModel.kt", l = {267}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class EditProfileViewModel$logChangePasswordClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33015a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ EditProfileViewModel f33016b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfileViewModel$logChangePasswordClicked$1(EditProfileViewModel editProfileViewModel, zz.a<? super EditProfileViewModel$logChangePasswordClicked$1> aVar) {
        super(2, aVar);
        this.f33016b = editProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new EditProfileViewModel$logChangePasswordClicked$1(this.f33016b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        b bVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33015a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            bVar = this.f33016b.f32973f;
            MyProfileChangePasswordClickedAnalyticsEvent myProfileChangePasswordClickedAnalyticsEvent = new MyProfileChangePasswordClickedAnalyticsEvent(null, 1, null);
            this.f33015a = 1;
            if (bVar.f(myProfileChangePasswordClickedAnalyticsEvent, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((EditProfileViewModel$logChangePasswordClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
