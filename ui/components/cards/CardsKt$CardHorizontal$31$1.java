package com.forsale.ui.components.cards;

import androidx.compose.runtime.a;
import com.forsale.designSystem.TextKt;
import g00.q;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import v0.b;
import w.c;
import wz.p;
/* compiled from: Cards.kt */
/* loaded from: classes3.dex */
final class CardsKt$CardHorizontal$31$1 extends Lambda implements q<c, a, Integer, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f42502a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42503b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsKt$CardHorizontal$31$1(String str, int i11) {
        super(3);
        this.f42502a = str;
        this.f42503b = i11;
    }

    public final void b(c cVar, a aVar, int i11) {
        int i12;
        int i13;
        o.i(cVar, "$this$null");
        if ((i11 & 14) == 0) {
            if (aVar.T(cVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 91) == 18 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(640053600, i11, -1, "com.forsale.ui.components.cards.CardHorizontal.<anonymous>.<anonymous> (Cards.kt:351)");
        }
        TextKt.a(this.f42502a, cVar.e(androidx.compose.ui.c.f7566a, b.f74009a.e()), 0, 0, false, 0, 0, null, null, 0L, 0, aVar, (this.f42503b >> 9) & 14, 0, 2044);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
    }

    @Override // g00.q
    public /* bridge */ /* synthetic */ p invoke(c cVar, a aVar, Integer num) {
        b(cVar, aVar, num.intValue());
        return p.f75480a;
    }
}
