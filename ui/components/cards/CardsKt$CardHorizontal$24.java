package com.forsale.ui.components.cards;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import com.forsale.designSystem.TextKt;
import g00.p;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Lambda;
/* compiled from: Cards.kt */
/* loaded from: classes3.dex */
final class CardsKt$CardHorizontal$24 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<String> f42482a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsKt$CardHorizontal$24(List<String> list) {
        super(2);
        this.f42482a = list;
    }

    public final void b(a aVar, int i11) {
        String t02;
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(198835080, i11, -1, "com.forsale.ui.components.cards.CardHorizontal.<anonymous> (Cards.kt:267)");
        }
        if (this.f42482a.isEmpty()) {
            aVar.C(1341507505);
            TextKt.a("", null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar, 6, 0, 2046);
            aVar.S();
        } else {
            aVar.C(1341507558);
            t02 = CollectionsKt___CollectionsKt.t0(this.f42482a, null, null, null, 0, null, null, 63, null);
            TextKt.a(t02, null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar, 0, 0, 2046);
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
