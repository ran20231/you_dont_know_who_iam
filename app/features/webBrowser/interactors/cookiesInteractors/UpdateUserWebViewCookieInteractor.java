package com.forsale.app.features.webBrowser.interactors.cookiesInteractors;

import android.webkit.CookieManager;
import jj.b;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import wz.p;
import zz.a;
/* compiled from: UpdateUserWebViewCookieInteractor.kt */
/* loaded from: classes2.dex */
public final class UpdateUserWebViewCookieInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final b f37103a;

    /* renamed from: b  reason: collision with root package name */
    private final CookieManager f37104b;

    /* renamed from: c  reason: collision with root package name */
    private final String f37105c;

    /* renamed from: d  reason: collision with root package name */
    private final CoroutineDispatcher f37106d;

    public UpdateUserWebViewCookieInteractor(b pref, CookieManager cookieManager, String websiteDomain, CoroutineDispatcher dispatcher) {
        o.i(pref, "pref");
        o.i(websiteDomain, "websiteDomain");
        o.i(dispatcher, "dispatcher");
        this.f37103a = pref;
        this.f37104b = cookieManager;
        this.f37105c = websiteDomain;
        this.f37106d = dispatcher;
    }

    public final Object d(a<? super p> aVar) {
        return BuildersKt.withContext(this.f37106d, new UpdateUserWebViewCookieInteractor$invoke$2(this, null), aVar);
    }
}
