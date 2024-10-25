package com.forsale.app.features.more.user.editprofile;

import com.forsale.app.features.more.user.editprofile.analytics.EditProfileImageClickedEvent;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.editprofile.EditProfileViewModel$logChangeImageClicked$1", f = "EditProfileViewModel.kt", l = {259}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class EditProfileViewModel$logChangeImageClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33013a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ EditProfileViewModel f33014b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfileViewModel$logChangeImageClicked$1(EditProfileViewModel editProfileViewModel, zz.a<? super EditProfileViewModel$logChangeImageClicked$1> aVar) {
        super(2, aVar);
        this.f33014b = editProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new EditProfileViewModel$logChangeImageClicked$1(this.f33014b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        b bVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33013a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            bVar = this.f33014b.f32973f;
            EditProfileImageClickedEvent editProfileImageClickedEvent = new EditProfileImageClickedEvent();
            this.f33013a = 1;
            if (bVar.d(editProfileImageClickedEvent, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((EditProfileViewModel$logChangeImageClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
