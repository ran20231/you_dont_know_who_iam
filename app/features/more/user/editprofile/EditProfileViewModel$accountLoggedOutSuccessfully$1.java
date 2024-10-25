package com.forsale.app.features.more.user.editprofile;

import com.leanplum.internal.ResourceQualifiers;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.editprofile.EditProfileViewModel$accountLoggedOutSuccessfully$1", f = "EditProfileViewModel.kt", l = {ResourceQualifiers.Qualifier.AnonymousClass14.DENSITY_TV, 214, 216}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class EditProfileViewModel$accountLoggedOutSuccessfully$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32988a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ EditProfileViewModel f32989b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f32990c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfileViewModel$accountLoggedOutSuccessfully$1(EditProfileViewModel editProfileViewModel, String str, zz.a<? super EditProfileViewModel$accountLoggedOutSuccessfully$1> aVar) {
        super(2, aVar);
        this.f32989b = editProfileViewModel;
        this.f32990c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new EditProfileViewModel$accountLoggedOutSuccessfully$1(this.f32989b, this.f32990c, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0091 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            r26 = this;
            r0 = r26
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f32988a
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L28
            if (r2 == r5) goto L24
            if (r2 == r4) goto L20
            if (r2 != r3) goto L18
            kotlin.f.b(r27)
            goto L92
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L20:
            kotlin.f.b(r27)
            goto L74
        L24:
            kotlin.f.b(r27)
            goto L3e
        L28:
            kotlin.f.b(r27)
            com.forsale.app.features.more.user.editprofile.EditProfileViewModel r2 = r0.f32989b
            jj.b r2 = com.forsale.app.features.more.user.editprofile.EditProfileViewModel.m(r2)
            com.forsale.app.utils.prefUtils.preferences.UserSharedPref r2 = r2.l()
            r0.f32988a = r5
            java.lang.Object r2 = r2.f(r0)
            if (r2 != r1) goto L3e
            return r1
        L3e:
            com.forsale.app.features.more.user.editprofile.EditProfileViewModel r2 = r0.f32989b
            com.forsale.app.datalayer.repositories.UserRepository r2 = com.forsale.app.features.more.user.editprofile.EditProfileViewModel.q(r2)
            com.forsale.app.datalayer.database.UserEntity r15 = new com.forsale.app.datalayer.database.UserEntity
            r5 = r15
            r6 = 0
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
            r24 = 262143(0x3ffff, float:3.6734E-40)
            r25 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0.f32988a = r4
            java.lang.Object r2 = r2.updateCachedUser(r3, r0)
            if (r2 != r1) goto L74
            return r1
        L74:
            com.forsale.app.features.more.user.editprofile.EditProfileViewModel r2 = r0.f32989b
            com.forsale.app.features.more.user.editprofile.EditProfileViewModel.D(r2)
            com.forsale.app.features.more.user.editprofile.EditProfileViewModel r2 = r0.f32989b
            kotlinx.coroutines.flow.MutableStateFlow r2 = com.forsale.app.features.more.user.editprofile.EditProfileViewModel.w(r2)
            com.forsale.app.features.more.user.editprofile.g$d r3 = new com.forsale.app.features.more.user.editprofile.g$d
            java.lang.String r4 = r0.f32990c
            java.lang.String r5 = "logoutAccount"
            r3.<init>(r4, r5)
            r4 = 3
            r0.f32988a = r4
            java.lang.Object r2 = r2.emit(r3, r0)
            if (r2 != r1) goto L92
            return r1
        L92:
            wz.p r1 = wz.p.f75480a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.editprofile.EditProfileViewModel$accountLoggedOutSuccessfully$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((EditProfileViewModel$accountLoggedOutSuccessfully$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
