package com.forsale.ui.components.cards;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import com.forsale.designSystem.VendorLabelKt;
import g00.p;
import kotlin.jvm.internal.Lambda;
import p1.e;
import yj.d;
/* compiled from: Cards.kt */
/* loaded from: classes3.dex */
final class CardsKt$CardHorizontal$20$1 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Integer f42474a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42475b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsKt$CardHorizontal$20$1(Integer num, int i11) {
        super(2);
        this.f42474a = num;
        this.f42475b = i11;
    }

    public final void b(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(1112758340, i11, -1, "com.forsale.ui.components.cards.CardHorizontal.<anonymous>.<anonymous> (Cards.kt:287)");
        }
        VendorLabelKt.a(null, e.d(this.f42474a.intValue(), aVar, (this.f42475b >> 15) & 14), dk.a.f54291a.a(aVar, dk.a.f54292b).f().i(aVar, d.f76453b), aVar, 64, 1);
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