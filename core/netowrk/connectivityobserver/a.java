package com.forsale.core.netowrk.connectivityobserver;

import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.jvm.internal.o;
/* compiled from: ConnectivityManagerModule.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f40617a = new a();

    private a() {
    }

    public final ConnectivityManager a(Context context) {
        o.i(context, "context");
        Object systemService = context.getSystemService("connectivity");
        o.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        return (ConnectivityManager) systemService;
    }
}
