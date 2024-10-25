package com.forsale.app.utils.location;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IsGPSEnabledLiveData.kt */
/* loaded from: classes3.dex */
public final class IsGPSEnabledLiveData$gpsChangeReceiver$2 extends Lambda implements g00.a<a> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IsGPSEnabledLiveData f40357a;

    /* compiled from: IsGPSEnabledLiveData.kt */
    /* loaded from: classes3.dex */
    public static final class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IsGPSEnabledLiveData f40358a;

        a(IsGPSEnabledLiveData isGPSEnabledLiveData) {
            this.f40358a = isGPSEnabledLiveData;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            this.f40358a.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IsGPSEnabledLiveData$gpsChangeReceiver$2(IsGPSEnabledLiveData isGPSEnabledLiveData) {
        super(0);
        this.f40357a = isGPSEnabledLiveData;
    }

    @Override // g00.a
    /* renamed from: b */
    public final a invoke() {
        return new a(this.f40357a);
    }
}
