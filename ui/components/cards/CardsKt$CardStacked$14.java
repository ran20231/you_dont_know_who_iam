package com.forsale.ui.components.cards;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import g00.q;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import r0.b;
import w.t;
import wz.p;
/* compiled from: Cards.kt */
/* loaded from: classes3.dex */
final class CardsKt$CardStacked$14 extends Lambda implements q<t, a, Integer, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<Pair<String, String>> f42565a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsKt$CardStacked$14(List<Pair<String, String>> list) {
        super(3);
        this.f42565a = list;
    }

    public final void b(t CardStacked, a aVar, int i11) {
        int i12;
        o.i(CardStacked, "$this$CardStacked");
        if ((i11 & 14) == 0) {
            if (aVar.T(CardStacked)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 |= i12;
        }
        if ((i11 & 91) == 18 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(-226227767, i11, -1, "com.forsale.ui.components.cards.CardStacked.<anonymous> (Cards.kt:111)");
        }
        aVar.C(-160128562);
        if (this.f42565a.isEmpty()) {
            com.forsale.designSystem.layouts.CardsKt.f(CardStacked, null, ComposableSingletons$CardsKt.f42615a.a(), aVar, (i11 & 14) | 384, 1);
        }
        aVar.S();
        if (!this.f42565a.isEmpty()) {
            Iterator<T> it2 = this.f42565a.iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                com.forsale.designSystem.layouts.CardsKt.f(CardStacked, b.b(aVar, 1211280927, true, new CardsKt$CardStacked$14$1$1(pair)), b.b(aVar, -1532031840, true, new CardsKt$CardStacked$14$1$2(pair)), aVar, (i11 & 14) | 432, 0);
            }
        }
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
