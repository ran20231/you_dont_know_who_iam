package com.forsale.ui.components.cards;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import com.forsale.designSystem.TextKt;
import g00.p;
import kotlin.jvm.internal.Lambda;
/* compiled from: Cards.kt */
/* loaded from: classes3.dex */
final class CardsKt$CardHorizontal$25 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f42483a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42484b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsKt$CardHorizontal$25(String str, int i11) {
        super(2);
        this.f42483a = str;
        this.f42484b = i11;
    }

    public final void b(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(-1563990646, i11, -1, "com.forsale.ui.components.cards.CardHorizontal.<anonymous> (Cards.kt:274)");
        }
        TextKt.a(this.f42483a, null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar, (this.f42484b >> 27) & 14, 0, 2046);
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
