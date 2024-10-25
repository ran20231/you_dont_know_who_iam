package com.forsale.app.features.webBrowser.interactors.cookiesInteractors;

import android.webkit.CookieManager;
import jj.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import wz.p;
/* compiled from: UpdateDeviceWebViewCookieInteractor.kt */
/* loaded from: classes2.dex */
public final class UpdateDeviceWebViewCookieInteractor {

    /* renamed from: e  reason: collision with root package name */
    public static final a f37095e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f37096f = 8;

    /* renamed from: a  reason: collision with root package name */
    private final b f37097a;

    /* renamed from: b  reason: collision with root package name */
    private final CookieManager f37098b;

    /* renamed from: c  reason: collision with root package name */
    private final String f37099c;

    /* renamed from: d  reason: collision with root package name */
    private final CoroutineDispatcher f37100d;

    /* compiled from: UpdateDeviceWebViewCookieInteractor.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UpdateDeviceWebViewCookieInteractor(b pref, CookieManager cookieManager, String websiteDomain, CoroutineDispatcher dispatcher) {
        o.i(pref, "pref");
        o.i(websiteDomain, "websiteDomain");
        o.i(dispatcher, "dispatcher");
        this.f37097a = pref;
        this.f37098b = cookieManager;
        this.f37099c = websiteDomain;
        this.f37100d = dispatcher;
    }

    public final Object d(zz.a<? super p> aVar) {
        return BuildersKt.withContext(this.f37100d, new UpdateDeviceWebViewCookieInteractor$invoke$2(this, null), aVar);
    }
}
