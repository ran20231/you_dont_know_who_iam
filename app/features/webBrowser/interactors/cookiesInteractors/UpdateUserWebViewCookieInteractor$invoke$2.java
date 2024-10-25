package com.forsale.app.features.webBrowser.interactors.cookiesInteractors;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UpdateUserWebViewCookieInteractor.kt */
@d(c = "com.forsale.app.features.webBrowser.interactors.cookiesInteractors.UpdateUserWebViewCookieInteractor$invoke$2", f = "UpdateUserWebViewCookieInteractor.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class UpdateUserWebViewCookieInteractor$invoke$2 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37107a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f37108b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ UpdateUserWebViewCookieInteractor f37109c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateUserWebViewCookieInteractor$invoke$2(UpdateUserWebViewCookieInteractor updateUserWebViewCookieInteractor, a<? super UpdateUserWebViewCookieInteractor$invoke$2> aVar) {
        super(2, aVar);
        this.f37109c = updateUserWebViewCookieInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        UpdateUserWebViewCookieInteractor$invoke$2 updateUserWebViewCookieInteractor$invoke$2 = new UpdateUserWebViewCookieInteractor$invoke$2(this.f37109c, aVar);
        updateUserWebViewCookieInteractor$invoke$2.f37108b = obj;
        return updateUserWebViewCookieInteractor$invoke$2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
        if (r6 == null) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r5.f37107a
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r0 = r5.f37108b
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            kotlin.f.b(r6)
            goto L37
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            kotlin.f.b(r6)
            java.lang.Object r6 = r5.f37108b
            kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
            com.forsale.app.features.webBrowser.interactors.cookiesInteractors.UpdateUserWebViewCookieInteractor r1 = r5.f37109c
            jj.b r1 = com.forsale.app.features.webBrowser.interactors.cookiesInteractors.UpdateUserWebViewCookieInteractor.b(r1)
            com.forsale.app.utils.prefUtils.preferences.UserSharedPref r1 = r1.l()
            r5.f37108b = r6
            r5.f37107a = r2
            java.lang.Object r6 = r1.c(r5)
            if (r6 != r0) goto L37
            return r0
        L37:
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = kotlin.text.k.v(r0)
            r1 = 0
            if (r0 != 0) goto L42
            goto L43
        L42:
            r6 = r1
        L43:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L6d
            com.forsale.app.features.webBrowser.interactors.cookiesInteractors.UpdateUserWebViewCookieInteractor r0 = r5.f37109c
            android.webkit.CookieManager r2 = com.forsale.app.features.webBrowser.interactors.cookiesInteractors.UpdateUserWebViewCookieInteractor.a(r0)
            if (r2 == 0) goto L6a
            java.lang.String r0 = com.forsale.app.features.webBrowser.interactors.cookiesInteractors.UpdateUserWebViewCookieInteractor.c(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "_xyzW="
            r3.append(r4)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r2.setCookie(r0, r6)
            wz.p r6 = wz.p.f75480a
            goto L6b
        L6a:
            r6 = r1
        L6b:
            if (r6 != 0) goto L80
        L6d:
            com.forsale.app.features.webBrowser.interactors.cookiesInteractors.UpdateUserWebViewCookieInteractor r6 = r5.f37109c
            android.webkit.CookieManager r0 = com.forsale.app.features.webBrowser.interactors.cookiesInteractors.UpdateUserWebViewCookieInteractor.a(r6)
            if (r0 == 0) goto L80
            java.lang.String r6 = com.forsale.app.features.webBrowser.interactors.cookiesInteractors.UpdateUserWebViewCookieInteractor.c(r6)
            java.lang.String r2 = "_xyzW=; Expires=Thu, 01 Jan 1970 00:00:00 GMT"
            r0.setCookie(r6, r2)
            wz.p r6 = wz.p.f75480a
        L80:
            com.forsale.app.features.webBrowser.interactors.cookiesInteractors.UpdateUserWebViewCookieInteractor r6 = r5.f37109c
            android.webkit.CookieManager r6 = com.forsale.app.features.webBrowser.interactors.cookiesInteractors.UpdateUserWebViewCookieInteractor.a(r6)
            if (r6 == 0) goto L8d
            r6.flush()
            wz.p r1 = wz.p.f75480a
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.webBrowser.interactors.cookiesInteractors.UpdateUserWebViewCookieInteractor$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((UpdateUserWebViewCookieInteractor$invoke$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
