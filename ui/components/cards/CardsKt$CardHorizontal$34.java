package com.forsale.ui.components.cards;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import com.forsale.designSystem.TextKt;
import g00.p;
import kotlin.jvm.internal.Lambda;
/* compiled from: Cards.kt */
/* loaded from: classes3.dex */
final class CardsKt$CardHorizontal$34 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f42508a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42509b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsKt$CardHorizontal$34(String str, int i11) {
        super(2);
        this.f42508a = str;
        this.f42509b = i11;
    }

    public final void b(a aVar, int i11) {
        boolean z11;
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(932477238, i11, -1, "com.forsale.ui.components.cards.CardHorizontal.<anonymous> (Cards.kt:332)");
        }
        String str = this.f42508a;
        if (str != null && str.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            aVar.C(1341509685);
            TextKt.a("", null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar, 6, 0, 2046);
            aVar.S();
        } else {
            aVar.C(1341509722);
            TextKt.a(this.f42508a, null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar, (this.f42509b >> 18) & 14, 0, 2046);
            aVar.S();
        }
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
