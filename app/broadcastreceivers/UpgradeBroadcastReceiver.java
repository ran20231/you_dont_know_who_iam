package com.forsale.app.broadcastreceivers;

import android.content.Context;
import android.content.Intent;
import jj.b;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import z9.a;
/* compiled from: UpgradeBroadcastReceiver.kt */
/* loaded from: classes2.dex */
public final class UpgradeBroadcastReceiver extends a {

    /* renamed from: c  reason: collision with root package name */
    public b f22294c;

    /* renamed from: d  reason: collision with root package name */
    public CoroutineScope f22295d;

    private final void b() {
        BuildersKt__Builders_commonKt.launch$default(d(), null, null, new UpgradeBroadcastReceiver$clearTimeStamp$1(this, null), 3, null);
        x10.a.b("UpgradeBroadcastReceiver clearTimeStamp", new Object[0]);
    }

    public final b c() {
        b bVar = this.f22294c;
        if (bVar != null) {
            return bVar;
        }
        o.w("prefs");
        return null;
    }

    public final CoroutineScope d() {
        CoroutineScope coroutineScope = this.f22295d;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        o.w("scope");
        return null;
    }

    @Override // z9.a, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action;
        super.onReceive(context, intent);
        if (intent != null && context != null && (action = intent.getAction()) != null && o.d(action, "android.intent.action.MY_PACKAGE_REPLACED")) {
            b();
        }
    }
}
