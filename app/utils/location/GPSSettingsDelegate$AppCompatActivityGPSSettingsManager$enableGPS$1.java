package com.forsale.app.utils.location;

import androidx.appcompat.app.d;
import com.forsale.app.utils.location.GPSSettingsDelegate;
import com.google.android.gms.common.api.ResolvableApiException;
import g00.l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: GPSSettingsDelegate.kt */
/* loaded from: classes3.dex */
final class GPSSettingsDelegate$AppCompatActivityGPSSettingsManager$enableGPS$1 extends Lambda implements l<ResolvableApiException, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ GPSSettingsDelegate.AppCompatActivityGPSSettingsManager f40344a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GPSSettingsDelegate$AppCompatActivityGPSSettingsManager$enableGPS$1(GPSSettingsDelegate.AppCompatActivityGPSSettingsManager appCompatActivityGPSSettingsManager) {
        super(1);
        this.f40344a = appCompatActivityGPSSettingsManager;
    }

    public final void b(ResolvableApiException it2) {
        d dVar;
        o.i(it2, "it");
        dVar = this.f40344a.f40342b;
        it2.startResolutionForResult(dVar, 99);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(ResolvableApiException resolvableApiException) {
        b(resolvableApiException);
        return p.f75480a;
    }
}
