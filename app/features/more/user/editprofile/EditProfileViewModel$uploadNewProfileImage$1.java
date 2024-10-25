package com.forsale.app.features.more.user.editprofile;

import g00.p;
import java.io.File;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.editprofile.EditProfileViewModel$uploadNewProfileImage$1", f = "EditProfileViewModel.kt", l = {133, 133, 135, 138}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class EditProfileViewModel$uploadNewProfileImage$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f33043a;

    /* renamed from: b  reason: collision with root package name */
    Object f33044b;

    /* renamed from: c  reason: collision with root package name */
    int f33045c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ File f33046d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ EditProfileViewModel f33047e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfileViewModel$uploadNewProfileImage$1(File file, EditProfileViewModel editProfileViewModel, zz.a<? super EditProfileViewModel$uploadNewProfileImage$1> aVar) {
        super(2, aVar);
        this.f33046d = file;
        this.f33047e = editProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new EditProfileViewModel$uploadNewProfileImage$1(this.f33046d, this.f33047e, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r11.f33045c
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L35
            if (r1 == r5) goto L29
            if (r1 == r4) goto L25
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            kotlin.f.b(r12)
            goto Lbb
        L19:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L21:
            kotlin.f.b(r12)
            goto L8d
        L25:
            kotlin.f.b(r12)
            goto L6d
        L29:
            java.lang.Object r1 = r11.f33044b
            com.forsale.app.datalayer.network.services.UploaderServices r1 = (com.forsale.app.datalayer.network.services.UploaderServices) r1
            java.lang.Object r5 = r11.f33043a
            okhttp3.MultipartBody$Part r5 = (okhttp3.MultipartBody.Part) r5
            kotlin.f.b(r12)
            goto L5d
        L35:
            kotlin.f.b(r12)
            java.lang.String r12 = "image"
            java.io.File r1 = r11.f33046d
            okhttp3.MultipartBody$Part r12 = com.forsale.app.utils.TopLevelUtilityFunctionsKt.d(r12, r1)
            com.forsale.app.features.more.user.editprofile.EditProfileViewModel r1 = r11.f33047e
            com.forsale.app.features.more.user.editprofile.EditProfileViewModel.A(r1)
            com.forsale.app.features.more.user.editprofile.EditProfileViewModel r1 = r11.f33047e
            com.forsale.app.datalayer.network.services.UploaderServices r1 = com.forsale.app.features.more.user.editprofile.EditProfileViewModel.o(r1)
            com.forsale.app.features.more.user.editprofile.EditProfileViewModel r6 = r11.f33047e
            r11.f33043a = r12
            r11.f33044b = r1
            r11.f33045c = r5
            java.lang.Object r5 = com.forsale.app.features.more.user.editprofile.EditProfileViewModel.g(r6, r11)
            if (r5 != r0) goto L5a
            return r0
        L5a:
            r10 = r5
            r5 = r12
            r12 = r10
        L5d:
            java.lang.String r12 = (java.lang.String) r12
            r6 = 0
            r11.f33043a = r6
            r11.f33044b = r6
            r11.f33045c = r4
            java.lang.Object r12 = r1.uploadProfileImageAsync(r12, r5, r11)
            if (r12 != r0) goto L6d
            return r0
        L6d:
            com.forsale.app.features.more.user.editprofile.EditProfileViewModel r12 = r11.f33047e
            com.forsale.app.utils.analytics.ProfileActionType r1 = com.forsale.app.utils.analytics.ProfileActionType.IMAGE_EDITED
            com.forsale.app.features.more.user.editprofile.EditProfileViewModel.E(r12, r1)
            com.forsale.app.features.more.user.editprofile.EditProfileViewModel r12 = r11.f33047e
            com.forsale.app.utils.facades.user.UserProfileInteractor r4 = com.forsale.app.features.more.user.editprofile.EditProfileViewModel.p(r12)
            com.forsale.app.features.more.user.editprofile.EditProfileViewModel r12 = r11.f33047e
            kotlinx.coroutines.CoroutineScope r5 = androidx.lifecycle.r0.a(r12)
            r6 = 0
            r8 = 2
            r9 = 0
            r11.f33045c = r3
            r7 = r11
            java.lang.Object r12 = com.forsale.app.utils.facades.user.UserProfileInteractor.o(r4, r5, r6, r7, r8, r9)
            if (r12 != r0) goto L8d
            return r0
        L8d:
            com.forsale.app.datalayer.database.UserEntity r12 = (com.forsale.app.datalayer.database.UserEntity) r12
            if (r12 == 0) goto L96
            com.forsale.app.features.more.user.editprofile.EditProfileViewModel r1 = r11.f33047e
            com.forsale.app.features.more.user.editprofile.EditProfileViewModel.F(r1, r12)
        L96:
            com.forsale.app.features.more.user.editprofile.EditProfileViewModel r12 = r11.f33047e
            kotlinx.coroutines.flow.MutableSharedFlow r12 = com.forsale.app.features.more.user.editprofile.EditProfileViewModel.t(r12)
            lf.a r1 = new lf.a
            com.forsale.app.feedback.a$a r3 = new com.forsale.app.feedback.a$a
            int r4 = gk.b.f56934a
            r3.<init>(r4)
            rj.a$b r4 = new rj.a$b
            int r5 = t9.y0.O3
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r4.<init>(r5, r6)
            r1.<init>(r3, r4)
            r11.f33045c = r2
            java.lang.Object r12 = r12.emit(r1, r11)
            if (r12 != r0) goto Lbb
            return r0
        Lbb:
            wz.p r12 = wz.p.f75480a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.editprofile.EditProfileViewModel$uploadNewProfileImage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((EditProfileViewModel$uploadNewProfileImage$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
