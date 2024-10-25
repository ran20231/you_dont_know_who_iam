package com.forsale.ui.components.ads;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import b1.v1;
import com.forsale.designSystem.TextKt;
import g00.p;
import kotlin.jvm.internal.Lambda;
/* compiled from: AdsGeneralDetails.kt */
/* loaded from: classes3.dex */
final class AdsGeneralDetailsKt$AdNavBarHeader$1$2 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f42426a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42427b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsGeneralDetailsKt$AdNavBarHeader$1$2(String str, int i11) {
        super(2);
        this.f42426a = str;
        this.f42427b = i11;
    }

    public final void b(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(-1406275513, i11, -1, "com.forsale.ui.components.ads.AdNavBarHeader.<anonymous>.<anonymous> (AdsGeneralDetails.kt:157)");
        }
        TextKt.a(this.f42426a, null, 0, 0, false, 0, 0, null, null, v1.d(4294967295L), 0, aVar, (this.f42427b & 14) | 805306368, 0, 1534);
        if (c.I()) {
            c.T();
        }
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
