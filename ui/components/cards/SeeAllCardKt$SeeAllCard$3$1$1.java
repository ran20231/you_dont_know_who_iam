package com.forsale.ui.components.cards;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import b2.f;
import com.forsale.designSystem.TextKt;
import g00.q;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import w.t;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SeeAllCard.kt */
/* loaded from: classes3.dex */
public final class SeeAllCardKt$SeeAllCard$3$1$1 extends Lambda implements q<t, a, Integer, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f42623a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42624b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeeAllCardKt$SeeAllCard$3$1$1(String str, int i11) {
        super(3);
        this.f42623a = str;
        this.f42624b = i11;
    }

    public final void b(t TextButton, a aVar, int i11) {
        o.i(TextButton, "$this$TextButton");
        if ((i11 & 81) == 16 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(2041077482, i11, -1, "com.forsale.ui.components.cards.SeeAllCard.<anonymous>.<anonymous>.<anonymous> (SeeAllCard.kt:40)");
        }
        TextKt.a(this.f42623a, null, f.f16081b.a(), 0, false, 2, 0, null, null, 0L, 0, aVar, ((this.f42624b >> 3) & 14) | 196608, 0, 2010);
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
