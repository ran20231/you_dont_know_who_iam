package com.forsale.app.features.more.user.editprofile.changepassword;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChangePasswordViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.editprofile.changepassword.ChangePasswordViewModel$onSaveClicked$1", f = "ChangePasswordViewModel.kt", l = {144, 147, 148, 149}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ChangePasswordViewModel$onSaveClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33205a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ChangePasswordViewModel f33206b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f33207c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f33208d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f33209e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangePasswordViewModel$onSaveClicked$1(ChangePasswordViewModel changePasswordViewModel, String str, String str2, String str3, zz.a<? super ChangePasswordViewModel$onSaveClicked$1> aVar) {
        super(2, aVar);
        this.f33206b = changePasswordViewModel;
        this.f33207c = str;
        this.f33208d = str2;
        this.f33209e = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ChangePasswordViewModel$onSaveClicked$1(this.f33206b, this.f33207c, this.f33208d, this.f33209e, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r7.f33205a
            r2 = 4
            r3 = 2
            r4 = 3
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L2d
            if (r1 == r5) goto L29
            if (r1 == r3) goto L25
            if (r1 == r4) goto L21
            if (r1 != r2) goto L19
            kotlin.f.b(r8)
            goto L7a
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            kotlin.f.b(r8)
            goto L66
        L25:
            kotlin.f.b(r8)
            goto L55
        L29:
            kotlin.f.b(r8)
            goto L44
        L2d:
            kotlin.f.b(r8)
            com.forsale.app.features.more.user.editprofile.changepassword.ChangePasswordViewModel r8 = r7.f33206b
            com.forsale.app.features.more.user.editprofile.b r8 = com.forsale.app.features.more.user.editprofile.changepassword.ChangePasswordViewModel.f(r8)
            com.forsale.app.features.more.user.editprofile.analytics.MyProfileChangePasswordSaveClickedAnalyticsEvent r1 = new com.forsale.app.features.more.user.editprofile.analytics.MyProfileChangePasswordSaveClickedAnalyticsEvent
            r1.<init>(r6, r5, r6)
            r7.f33205a = r5
            java.lang.Object r8 = r8.g(r1, r7)
            if (r8 != r0) goto L44
            return r0
        L44:
            com.forsale.app.features.more.user.editprofile.changepassword.ChangePasswordViewModel r8 = r7.f33206b
            kotlinx.coroutines.flow.MutableStateFlow r8 = com.forsale.app.features.more.user.editprofile.changepassword.ChangePasswordViewModel.l(r8)
            com.forsale.app.features.more.user.editprofile.g$c r1 = com.forsale.app.features.more.user.editprofile.g.c.f33382a
            r7.f33205a = r3
            java.lang.Object r8 = r8.emit(r1, r7)
            if (r8 != r0) goto L55
            return r0
        L55:
            com.forsale.app.features.more.user.editprofile.changepassword.ChangePasswordViewModel r8 = r7.f33206b
            java.lang.String r1 = r7.f33207c
            java.lang.String r3 = r7.f33208d
            java.lang.String r5 = r7.f33209e
            r7.f33205a = r4
            java.lang.Object r8 = com.forsale.app.features.more.user.editprofile.changepassword.ChangePasswordViewModel.e(r8, r1, r3, r5, r7)
            if (r8 != r0) goto L66
            return r0
        L66:
            com.forsale.app.features.more.user.editprofile.changepassword.ChangePasswordViewModel r8 = r7.f33206b
            kotlinx.coroutines.flow.MutableStateFlow r8 = com.forsale.app.features.more.user.editprofile.changepassword.ChangePasswordViewModel.l(r8)
            com.forsale.app.features.more.user.editprofile.g$d r1 = new com.forsale.app.features.more.user.editprofile.g$d
            r1.<init>(r6, r6, r4, r6)
            r7.f33205a = r2
            java.lang.Object r8 = r8.emit(r1, r7)
            if (r8 != r0) goto L7a
            return r0
        L7a:
            wz.p r8 = wz.p.f75480a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.editprofile.changepassword.ChangePasswordViewModel$onSaveClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ChangePasswordViewModel$onSaveClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
