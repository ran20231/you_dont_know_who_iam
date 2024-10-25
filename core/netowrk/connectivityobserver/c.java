package com.forsale.core.netowrk.connectivityobserver;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import com.forsale.core.netowrk.connectivityobserver.ConnectivityObserver;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineDispatcher;
/* compiled from: NetworkConnectivityObserver.kt */
/* loaded from: classes3.dex */
public final class c implements ConnectivityObserver {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineDispatcher f40618a;

    /* renamed from: b  reason: collision with root package name */
    private final ConnectivityManager f40619b;

    public c(CoroutineDispatcher ioDispatcher, ConnectivityManager connectivityManager) {
        o.i(ioDispatcher, "ioDispatcher");
        o.i(connectivityManager, "connectivityManager");
        this.f40618a = ioDispatcher;
        this.f40619b = connectivityManager;
    }

    @Override // com.forsale.core.netowrk.connectivityobserver.ConnectivityObserver
    public ConnectivityObserver.NetworkStatus a() {
        NetworkCapabilities networkCapabilities = this.f40619b.getNetworkCapabilities(this.f40619b.getActiveNetwork());
        boolean z11 = false;
        if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
            z11 = true;
        }
        if (z11) {
            return ConnectivityObserver.NetworkStatus.Connected;
        }
        return ConnectivityObserver.NetworkStatus.Lost;
    }
}
