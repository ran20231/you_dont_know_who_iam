package com.forsale.app.features.more.user.editprofile;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.editprofile.EditProfileViewModel$accountDeletedSuccessfully$1", f = "EditProfileViewModel.kt", l = {189, 190, 191}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class EditProfileViewModel$accountDeletedSuccessfully$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32986a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ EditProfileViewModel f32987b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfileViewModel$accountDeletedSuccessfully$1(EditProfileViewModel editProfileViewModel, zz.a<? super EditProfileViewModel$accountDeletedSuccessfully$1> aVar) {
        super(2, aVar);
        this.f32987b = editProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new EditProfileViewModel$accountDeletedSuccessfully$1(this.f32987b, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            r27 = this;
            r0 = r27
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f32986a
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L28
            if (r2 == r5) goto L24
            if (r2 == r4) goto L20
            if (r2 != r3) goto L18
            kotlin.f.b(r28)
            goto L8d
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L20:
            kotlin.f.b(r28)
            goto L75
        L24:
            kotlin.f.b(r28)
            goto L3e
        L28:
            kotlin.f.b(r28)
            com.forsale.app.features.more.user.editprofile.EditProfileViewModel r2 = r0.f32987b
            jj.b r2 = com.forsale.app.features.more.user.editprofile.EditProfileViewModel.m(r2)
            com.forsale.app.utils.prefUtils.preferences.UserSharedPref r2 = r2.l()
            r0.f32986a = r5
            java.lang.Object r2 = r2.f(r0)
            if (r2 != r1) goto L3e
            return r1
        L3e:
            com.forsale.app.features.more.user.editprofile.EditProfileViewModel r2 = r0.f32987b
            com.forsale.app.datalayer.repositories.UserRepository r2 = com.forsale.app.features.more.user.editprofile.EditProfileViewModel.q(r2)
            com.forsale.app.datalayer.database.UserEntity r15 = new com.forsale.app.datalayer.database.UserEntity
            r6 = r15
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r3 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 262143(0x3ffff, float:3.6734E-40)
            r26 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r0.f32986a = r4
            java.lang.Object r2 = r2.updateCachedUser(r3, r0)
            if (r2 != r1) goto L75
            return r1
        L75:
            com.forsale.app.features.more.user.editprofile.EditProfileViewModel r2 = r0.f32987b
            kotlinx.coroutines.flow.MutableStateFlow r2 = com.forsale.app.features.more.user.editprofile.EditProfileViewModel.w(r2)
            com.forsale.app.features.more.user.editprofile.g$d r3 = new com.forsale.app.features.more.user.editprofile.g$d
            java.lang.String r4 = "deleteAccount"
            r6 = 0
            r3.<init>(r6, r4, r5, r6)
            r4 = 3
            r0.f32986a = r4
            java.lang.Object r2 = r2.emit(r3, r0)
            if (r2 != r1) goto L8d
            return r1
        L8d:
            wz.p r1 = wz.p.f75480a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.editprofile.EditProfileViewModel$accountDeletedSuccessfully$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((EditProfileViewModel$accountDeletedSuccessfully$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
