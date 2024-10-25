package com.forsale.app.utils.location;

import com.forsale.app.utils.location.GPSSettingsDelegate;
import g00.a;
import kotlin.jvm.internal.Lambda;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GPSSettingsDelegate.kt */
/* loaded from: classes3.dex */
public final class GPSSettingsDelegate$GPSSettingsManager$withGPSEnabled$gpsObserver$1$onChanged$1 extends Lambda implements a<p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ GPSSettingsDelegate.GPSSettingsManager f40354a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GPSSettingsDelegate$GPSSettingsManager$withGPSEnabled$gpsObserver$1$onChanged$1(GPSSettingsDelegate.GPSSettingsManager gPSSettingsManager) {
        super(0);
        this.f40354a = gPSSettingsManager;
    }

    @Override // g00.a
    public /* bridge */ /* synthetic */ p invoke() {
        invoke2();
        return p.f75480a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.f40354a.b();
    }
}
