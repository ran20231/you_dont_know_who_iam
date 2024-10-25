package com.forsale.ui.components.ads;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.iconography.IconKt;
import g00.q;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import p1.e;
import sj.d;
import w.t;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AdsGeneralDetails.kt */
/* loaded from: classes3.dex */
public final class AdsGeneralDetailsKt$AdsGeneralDetails$1$1$3$2 extends Lambda implements q<t, a, Integer, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f42449a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42450b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsGeneralDetailsKt$AdsGeneralDetails$1$1$3$2(String str, int i11) {
        super(3);
        this.f42449a = str;
        this.f42450b = i11;
    }

    public final void b(t PrimaryButton, a aVar, int i11) {
        o.i(PrimaryButton, "$this$PrimaryButton");
        if ((i11 & 81) == 16 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(-1331353952, i11, -1, "com.forsale.ui.components.ads.AdsGeneralDetails.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdsGeneralDetails.kt:103)");
        }
        IconKt.a(e.d(d.f68678o, aVar, 0), null, null, 0L, false, 0.0f, aVar, 392, 58);
        TextKt.a(this.f42449a, null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar, (this.f42450b >> 3) & 14, 0, 2046);
        if (c.I()) {
            c.T();
        }
    }

    @Override // g00.q
    public /* bridge */ /* synthetic */ p invoke(t tVar, a aVar, Integer num) {
        b(tVar, aVar, num.intValue());
        return p.f75480a;
    }
}
