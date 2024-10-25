package com.forsale.app.features.more.user.profile;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.profile.NewProfileViewModel$onLanguageClick$1", f = "NewProfileViewModel.kt", l = {234, 235, 237, 236, 240}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewProfileViewModel$onLanguageClick$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f33605a;

    /* renamed from: b  reason: collision with root package name */
    Object f33606b;

    /* renamed from: c  reason: collision with root package name */
    Object f33607c;

    /* renamed from: d  reason: collision with root package name */
    int f33608d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ NewProfileViewModel f33609e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewProfileViewModel$onLanguageClick$1(NewProfileViewModel newProfileViewModel, zz.a<? super NewProfileViewModel$onLanguageClick$1> aVar) {
        super(2, aVar);
        this.f33609e = newProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewProfileViewModel$onLanguageClick$1(this.f33609e, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r10.f33608d
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L4a
            if (r1 == r6) goto L42
            if (r1 == r5) goto L39
            if (r1 == r4) goto L29
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            kotlin.f.b(r11)
            goto Lca
        L1c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L24:
            kotlin.f.b(r11)
            goto Lb9
        L29:
            java.lang.Object r1 = r10.f33607c
            com.forsale.app.utils.Languages$a r1 = (com.forsale.app.utils.Languages.a) r1
            java.lang.Object r4 = r10.f33606b
            com.forsale.app.features.more.user.profile.f r4 = (com.forsale.app.features.more.user.profile.f) r4
            java.lang.Object r5 = r10.f33605a
            com.forsale.app.utils.Languages r5 = (com.forsale.app.utils.Languages) r5
            kotlin.f.b(r11)
            goto La3
        L39:
            java.lang.Object r1 = r10.f33605a
            com.forsale.app.utils.Languages r1 = (com.forsale.app.utils.Languages) r1
            kotlin.f.b(r11)
        L40:
            r5 = r1
            goto L83
        L42:
            java.lang.Object r1 = r10.f33605a
            com.forsale.app.utils.Languages r1 = (com.forsale.app.utils.Languages) r1
            kotlin.f.b(r11)
            goto L72
        L4a:
            kotlin.f.b(r11)
            com.forsale.app.utils.LocaleManager r11 = com.forsale.app.utils.LocaleManager.f39597a
            com.forsale.app.utils.Languages r1 = r11.o()
            com.forsale.app.features.more.user.profile.NewProfileViewModel r7 = r10.f33609e
            com.forsale.app.features.more.user.profile.f r7 = com.forsale.app.features.more.user.profile.NewProfileViewModel.k(r7)
            yi.a r8 = new yi.a
            com.forsale.app.utils.Languages r11 = r11.g()
            r8.<init>(r11, r1)
            r7.e(r8)
            com.forsale.app.features.more.user.profile.NewProfileViewModel r11 = r10.f33609e
            r10.f33605a = r1
            r10.f33608d = r6
            java.lang.Object r11 = com.forsale.app.features.more.user.profile.NewProfileViewModel.w(r11, r1, r10)
            if (r11 != r0) goto L72
            return r0
        L72:
            com.forsale.app.features.more.user.profile.NewProfileViewModel r11 = r10.f33609e
            com.forsale.app.utils.facades.user.UserLanguageInteractor r11 = com.forsale.app.features.more.user.profile.NewProfileViewModel.p(r11)
            r10.f33605a = r1
            r10.f33608d = r5
            java.lang.Object r11 = r11.e(r1, r10)
            if (r11 != r0) goto L40
            return r0
        L83:
            com.forsale.app.features.more.user.profile.NewProfileViewModel r11 = r10.f33609e
            com.forsale.app.features.more.user.profile.f r11 = com.forsale.app.features.more.user.profile.NewProfileViewModel.k(r11)
            com.forsale.app.utils.Languages$a r1 = com.forsale.app.utils.Languages.Companion
            com.forsale.app.features.more.user.profile.NewProfileViewModel r6 = r10.f33609e
            com.forsale.app.utils.facades.user.UserLanguageInteractor r6 = com.forsale.app.features.more.user.profile.NewProfileViewModel.p(r6)
            r10.f33605a = r5
            r10.f33606b = r11
            r10.f33607c = r1
            r10.f33608d = r4
            java.lang.Object r4 = r6.d(r10)
            if (r4 != r0) goto La0
            return r0
        La0:
            r9 = r4
            r4 = r11
            r11 = r9
        La3:
            java.lang.String r11 = (java.lang.String) r11
            com.forsale.app.utils.Languages r11 = r1.a(r11)
            r1 = 0
            r10.f33605a = r1
            r10.f33606b = r1
            r10.f33607c = r1
            r10.f33608d = r3
            java.lang.Object r11 = r4.l(r11, r5, r10)
            if (r11 != r0) goto Lb9
            return r0
        Lb9:
            com.forsale.app.features.more.user.profile.NewProfileViewModel r11 = r10.f33609e
            kotlinx.coroutines.flow.MutableSharedFlow r11 = com.forsale.app.features.more.user.profile.NewProfileViewModel.r(r11)
            com.forsale.app.features.more.user.profile.r r1 = com.forsale.app.features.more.user.profile.r.f33707a
            r10.f33608d = r2
            java.lang.Object r11 = r11.emit(r1, r10)
            if (r11 != r0) goto Lca
            return r0
        Lca:
            wz.p r11 = wz.p.f75480a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.profile.NewProfileViewModel$onLanguageClick$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewProfileViewModel$onLanguageClick$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
