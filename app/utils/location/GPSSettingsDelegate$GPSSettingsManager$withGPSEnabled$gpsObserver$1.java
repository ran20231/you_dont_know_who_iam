package com.forsale.app.utils.location;

import androidx.lifecycle.c0;
import com.forsale.app.utils.location.GPSSettingsDelegate;
import g00.a;
import g00.l;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GPSSettingsDelegate.kt */
/* loaded from: classes3.dex */
public final class GPSSettingsDelegate$GPSSettingsManager$withGPSEnabled$gpsObserver$1 implements c0<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a<p> f40349a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f40350b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ IsGPSEnabledLiveData f40351c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ GPSSettingsDelegate.GPSSettingsManager f40352d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ l<a<p>, p> f40353e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public GPSSettingsDelegate$GPSSettingsManager$withGPSEnabled$gpsObserver$1(a<p> aVar, boolean z11, IsGPSEnabledLiveData isGPSEnabledLiveData, GPSSettingsDelegate.GPSSettingsManager gPSSettingsManager, l<? super a<p>, p> lVar) {
        this.f40349a = aVar;
        this.f40350b = z11;
        this.f40351c = isGPSEnabledLiveData;
        this.f40352d = gPSSettingsManager;
        this.f40353e = lVar;
    }

    public final void a(boolean z11) {
        p pVar;
        if (z11) {
            this.f40349a.invoke();
            if (this.f40350b) {
                this.f40351c.removeObservers(this.f40352d.c());
                return;
            }
            return;
        }
        l<a<p>, p> lVar = this.f40353e;
        if (lVar != null) {
            lVar.invoke(new GPSSettingsDelegate$GPSSettingsManager$withGPSEnabled$gpsObserver$1$onChanged$1(this.f40352d));
            pVar = p.f75480a;
        } else {
            pVar = null;
        }
        if (pVar == null) {
            this.f40352d.b();
        }
    }

    @Override // androidx.lifecycle.c0
    public /* bridge */ /* synthetic */ void onChanged(Boolean bool) {
        a(bool.booleanValue());
    }
}
