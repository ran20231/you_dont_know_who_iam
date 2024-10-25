package com.forsale.app.features.webBrowser.interactors.cookiesInteractors;

import com.google.android.gms.maps.model.PinConfig;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UpdateDeviceWebViewCookieInteractor.kt */
@d(c = "com.forsale.app.features.webBrowser.interactors.cookiesInteractors.UpdateDeviceWebViewCookieInteractor$invoke$2", f = "UpdateDeviceWebViewCookieInteractor.kt", l = {PinConfig.BITMAP_WIDTH_DP}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class UpdateDeviceWebViewCookieInteractor$invoke$2 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37101a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ UpdateDeviceWebViewCookieInteractor f37102b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateDeviceWebViewCookieInteractor$invoke$2(UpdateDeviceWebViewCookieInteractor updateDeviceWebViewCookieInteractor, a<? super UpdateDeviceWebViewCookieInteractor$invoke$2> aVar) {
        super(2, aVar);
        this.f37102b = updateDeviceWebViewCookieInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new UpdateDeviceWebViewCookieInteractor$invoke$2(this.f37102b, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
        r2 = (r0 = r5.f37102b).f37098b;
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
            int r1 = r5.f37101a
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.f.b(r6)
            goto L40
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.f.b(r6)
            com.forsale.app.features.webBrowser.interactors.cookiesInteractors.UpdateDeviceWebViewCookieInteractor r6 = r5.f37102b
            android.webkit.CookieManager r6 = com.forsale.app.features.webBrowser.interactors.cookiesInteractors.UpdateDeviceWebViewCookieInteractor.a(r6)
            if (r6 == 0) goto L2d
            com.forsale.app.features.webBrowser.interactors.cookiesInteractors.UpdateDeviceWebViewCookieInteractor r1 = r5.f37102b
            java.lang.String r1 = com.forsale.app.features.webBrowser.interactors.cookiesInteractors.UpdateDeviceWebViewCookieInteractor.c(r1)
            java.lang.String r3 = "device_type=Android"
            r6.setCookie(r1, r3)
        L2d:
            com.forsale.app.features.webBrowser.interactors.cookiesInteractors.UpdateDeviceWebViewCookieInteractor r6 = r5.f37102b
            jj.b r6 = com.forsale.app.features.webBrowser.interactors.cookiesInteractors.UpdateDeviceWebViewCookieInteractor.b(r6)
            kj.b r6 = r6.c()
            r5.f37101a = r2
            java.lang.Object r6 = r6.a(r5)
            if (r6 != r0) goto L40
            return r0
        L40:
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = kotlin.text.k.v(r0)
            r1 = 0
            if (r0 != 0) goto L4b
            goto L4c
        L4b:
            r6 = r1
        L4c:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L70
            com.forsale.app.features.webBrowser.interactors.cookiesInteractors.UpdateDeviceWebViewCookieInteractor r0 = r5.f37102b
            android.webkit.CookieManager r2 = com.forsale.app.features.webBrowser.interactors.cookiesInteractors.UpdateDeviceWebViewCookieInteractor.a(r0)
            if (r2 == 0) goto L70
            java.lang.String r0 = com.forsale.app.features.webBrowser.interactors.cookiesInteractors.UpdateDeviceWebViewCookieInteractor.c(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "device_id="
            r3.append(r4)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r2.setCookie(r0, r6)
        L70:
            com.forsale.app.features.webBrowser.interactors.cookiesInteractors.UpdateDeviceWebViewCookieInteractor r6 = r5.f37102b
            android.webkit.CookieManager r6 = com.forsale.app.features.webBrowser.interactors.cookiesInteractors.UpdateDeviceWebViewCookieInteractor.a(r6)
            if (r6 == 0) goto L7d
            r6.flush()
            wz.p r1 = wz.p.f75480a
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.webBrowser.interactors.cookiesInteractors.UpdateDeviceWebViewCookieInteractor$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((UpdateDeviceWebViewCookieInteractor$invoke$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
