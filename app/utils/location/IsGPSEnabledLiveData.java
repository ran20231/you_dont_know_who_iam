package com.forsale.app.utils.location;

import android.content.Context;
import android.content.IntentFilter;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.location.IsGPSEnabledLiveData$gpsChangeReceiver$2;
import kotlin.d;
import kotlin.jvm.internal.o;
import wz.h;
/* compiled from: IsGPSEnabledLiveData.kt */
/* loaded from: classes3.dex */
public final class IsGPSEnabledLiveData extends LiveData<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f40355a;

    /* renamed from: b  reason: collision with root package name */
    private final h f40356b;

    public IsGPSEnabledLiveData(Context ctx) {
        h a11;
        o.i(ctx, "ctx");
        this.f40355a = ctx;
        c();
        a11 = d.a(new IsGPSEnabledLiveData$gpsChangeReceiver$2(this));
        this.f40356b = a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        boolean w11 = ContextExtensionsKt.w(this.f40355a);
        if (o.d(Boolean.valueOf(w11), super.getValue())) {
            return;
        }
        setValue(Boolean.valueOf(w11));
    }

    private final IsGPSEnabledLiveData$gpsChangeReceiver$2.a d() {
        return (IsGPSEnabledLiveData$gpsChangeReceiver$2.a) this.f40356b.getValue();
    }

    @Override // androidx.lifecycle.LiveData
    /* renamed from: e */
    public Boolean getValue() {
        c();
        Object value = super.getValue();
        o.f(value);
        return (Boolean) value;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        c();
        this.f40355a.registerReceiver(d(), new IntentFilter("android.location.PROVIDERS_CHANGED"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        this.f40355a.unregisterReceiver(d());
    }

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(c0<? super Boolean> observer) {
        o.i(observer, "observer");
        setValue(Boolean.FALSE);
        super.removeObserver(observer);
    }
}
