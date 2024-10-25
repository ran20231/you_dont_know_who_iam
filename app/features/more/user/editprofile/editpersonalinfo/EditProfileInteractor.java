package com.forsale.app.features.more.user.editprofile.editpersonalinfo;

import com.forsale.app.datalayer.repositories.UserRepository;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import kotlin.jvm.internal.o;
/* compiled from: EditProfileInteractor.kt */
/* loaded from: classes2.dex */
public final class EditProfileInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final UserRepository f33369a;

    /* renamed from: b  reason: collision with root package name */
    private final UserProfileInteractor f33370b;

    public EditProfileInteractor(UserRepository userRepository, UserProfileInteractor currentUserProfileInteractor) {
        o.i(userRepository, "userRepository");
        o.i(currentUserProfileInteractor, "currentUserProfileInteractor");
        this.f33369a = userRepository;
        this.f33370b = currentUserProfileInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, java.lang.String r9, int r10, zz.a<? super com.forsale.app.datalayer.database.UserEntity> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditProfileInteractor$updateUser$1
            if (r0 == 0) goto L13
            r0 = r11
            com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditProfileInteractor$updateUser$1 r0 = (com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditProfileInteractor$updateUser$1) r0
            int r1 = r0.f33374d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33374d = r1
            goto L18
        L13:
            com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditProfileInteractor$updateUser$1 r0 = new com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditProfileInteractor$updateUser$1
            r0.<init>(r7, r11)
        L18:
            r4 = r0
            java.lang.Object r11 = r4.f33372b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r4.f33374d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L41
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            java.lang.Object r8 = r4.f33371a
            com.forsale.app.datalayer.database.UserEntity r8 = (com.forsale.app.datalayer.database.UserEntity) r8
            kotlin.f.b(r11)
            goto L73
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.lang.Object r8 = r4.f33371a
            com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditProfileInteractor r8 = (com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditProfileInteractor) r8
            kotlin.f.b(r11)
            goto L57
        L41:
            kotlin.f.b(r11)
            com.forsale.app.datalayer.repositories.UserRepository r11 = r7.f33369a
            com.forsale.app.datalayer.network.requestsbodies.EditUserBody r1 = new com.forsale.app.datalayer.network.requestsbodies.EditUserBody
            r1.<init>(r8, r9, r10)
            r4.f33371a = r7
            r4.f33374d = r3
            java.lang.Object r11 = r11.updateUser(r1, r4)
            if (r11 != r0) goto L56
            return r0
        L56:
            r8 = r7
        L57:
            com.forsale.app.datalayer.network.responses.AuthResponse r11 = (com.forsale.app.datalayer.network.responses.AuthResponse) r11
            com.forsale.app.datalayer.network.responses.AuthResponse$Data r9 = r11.getData()
            com.forsale.app.datalayer.database.UserEntity r9 = r9.getUser()
            com.forsale.app.utils.facades.user.UserProfileInteractor r1 = r8.f33370b
            r3 = 0
            r5 = 2
            r6 = 0
            r4.f33371a = r9
            r4.f33374d = r2
            r2 = r9
            java.lang.Object r8 = com.forsale.app.utils.facades.user.UserProfileInteractor.v(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L72
            return r0
        L72:
            r8 = r9
        L73:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditProfileInteractor.a(java.lang.String, java.lang.String, int, zz.a):java.lang.Object");
    }
}
