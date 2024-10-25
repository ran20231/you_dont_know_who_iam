package com.forsale.ui.components.cards;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import com.forsale.designSystem.VendorLabelKt;
import g00.p;
import kotlin.jvm.internal.Lambda;
import p1.e;
/* compiled from: Cards.kt */
/* loaded from: classes3.dex */
final class CardsKt$CardSimple$5 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Integer f42533a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42534b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsKt$CardSimple$5(Integer num, int i11) {
        super(2);
        this.f42533a = num;
        this.f42534b = i11;
    }

    public final void b(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(226700537, i11, -1, "com.forsale.ui.components.cards.CardSimple.<anonymous> (Cards.kt:393)");
        }
        Integer num = this.f42533a;
        if (num != null) {
            int i12 = this.f42534b;
            num.intValue();
            VendorLabelKt.a(null, e.d(num.intValue(), aVar, (i12 >> 3) & 14), 0L, aVar, 64, 5);
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
