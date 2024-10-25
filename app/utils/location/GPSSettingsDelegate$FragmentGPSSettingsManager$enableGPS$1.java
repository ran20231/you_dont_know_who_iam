package com.forsale.app.utils.location;

import androidx.fragment.app.Fragment;
import com.forsale.app.utils.location.GPSSettingsDelegate;
import com.google.android.gms.common.api.ResolvableApiException;
import g00.l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: GPSSettingsDelegate.kt */
/* loaded from: classes3.dex */
final class GPSSettingsDelegate$FragmentGPSSettingsManager$enableGPS$1 extends Lambda implements l<ResolvableApiException, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ GPSSettingsDelegate.FragmentGPSSettingsManager f40347a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GPSSettingsDelegate$FragmentGPSSettingsManager$enableGPS$1(GPSSettingsDelegate.FragmentGPSSettingsManager fragmentGPSSettingsManager) {
        super(1);
        this.f40347a = fragmentGPSSettingsManager;
    }

    public final void b(ResolvableApiException it2) {
        Fragment fragment;
        o.i(it2, "it");
        fragment = this.f40347a.f40345b;
        fragment.startIntentSenderForResult(it2.getResolution().getIntentSender(), 99, null, 0, 0, 0, null);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(ResolvableApiException resolvableApiException) {
        b(resolvableApiException);
        return p.f75480a;
    }
}
