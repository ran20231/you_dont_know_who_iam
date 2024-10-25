package com.forsale.ui.components.cards;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import com.forsale.designSystem.iconography.IconKt;
import g00.p;
import h5.d;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Cards.kt */
/* loaded from: classes3.dex */
public final class CardsKt$CardStacked$14$1$1 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Pair<String, String> f42566a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsKt$CardStacked$14$1$1(Pair<String, String> pair) {
        super(2);
        this.f42566a = pair;
    }

    public final void b(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(1211280927, i11, -1, "com.forsale.ui.components.cards.CardStacked.<anonymous>.<anonymous>.<anonymous> (Cards.kt:115)");
        }
        IconKt.a(d.a(this.f42566a.c(), null, null, null, 0, aVar, 0, 30), null, null, 0L, false, 0.0f, aVar, 0, 62);
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
