package com.forsale.app.features.more.newprofile.followerandfollowing.settings;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SettingsViewModel.kt */
@d(c = "com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel$updateUser$1", f = "SettingsViewModel.kt", l = {82, 85}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SettingsViewModel$updateUser$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f32388a;

    /* renamed from: b  reason: collision with root package name */
    boolean f32389b;

    /* renamed from: c  reason: collision with root package name */
    int f32390c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f32391d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f32392e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$updateUser$1(SettingsViewModel settingsViewModel, boolean z11, a<? super SettingsViewModel$updateUser$1> aVar) {
        super(2, aVar);
        this.f32391d = settingsViewModel;
        this.f32392e = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new SettingsViewModel$updateUser$1(this.f32391d, this.f32392e, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0096 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            r29 = this;
            r0 = r29
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f32390c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L27
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L15
            kotlin.f.b(r30)
            goto L97
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1d:
            boolean r2 = r0.f32389b
            java.lang.Object r4 = r0.f32388a
            com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel r4 = (com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel) r4
            kotlin.f.b(r30)
            goto L86
        L27:
            kotlin.f.b(r30)
            com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel r2 = r0.f32391d
            kotlinx.coroutines.flow.StateFlow r2 = r2.q()
            java.lang.Object r2 = r2.getValue()
            r5 = r2
            com.forsale.app.datalayer.database.UserEntity r5 = (com.forsale.app.datalayer.database.UserEntity) r5
            if (r5 == 0) goto L97
            com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel r2 = r0.f32391d
            boolean r7 = r0.f32392e
            com.forsale.app.utils.facades.user.UpdateUserInteractor r6 = com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel.g(r2)
            r26 = 0
            r27 = 0
            int r8 = com.forsale.app.utils.TypeExtensionsKt.H0(r7)
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.a.d(r8)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 262139(0x3fffb, float:3.67335E-40)
            r25 = 0
            r3 = r6
            r6 = r26
            r4 = r7
            r7 = r27
            com.forsale.app.datalayer.database.UserEntity r5 = com.forsale.app.datalayer.database.UserEntity.copy$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r0.f32388a = r2
            r0.f32389b = r4
            r6 = 1
            r0.f32390c = r6
            java.lang.Object r3 = r3.h(r5, r0)
            if (r3 != r1) goto L81
            return r1
        L81:
            r28 = r4
            r4 = r2
            r2 = r28
        L86:
            wd.b r3 = com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel.e(r4)
            r4 = 0
            r0.f32388a = r4
            r4 = 2
            r0.f32390c = r4
            java.lang.Object r2 = r3.a(r2, r0)
            if (r2 != r1) goto L97
            return r1
        L97:
            wz.p r1 = wz.p.f75480a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel$updateUser$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((SettingsViewModel$updateUser$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
