package com.forsale.ui.components.cards;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.iconography.IconKt;
import g00.q;
import hk.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import p1.e;
import p1.g;
import w.t;
import wz.p;
/* compiled from: Cards.kt */
/* loaded from: classes3.dex */
final class CardsKt$Tag$1 extends Lambda implements q<t, a, Integer, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ hk.a f42595a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Integer f42596b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f42597c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ long f42598d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f42599e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsKt$Tag$1(hk.a aVar, Integer num, int i11, long j11, int i12) {
        super(3);
        this.f42595a = aVar;
        this.f42596b = num;
        this.f42597c = i11;
        this.f42598d = j11;
        this.f42599e = i12;
    }

    public final void b(t Tag, a aVar, int i11) {
        Integer num;
        o.i(Tag, "$this$Tag");
        if ((i11 & 81) == 16 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(-382560206, i11, -1, "com.forsale.ui.components.cards.Tag.<anonymous> (Cards.kt:485)");
        }
        aVar.C(2106991242);
        hk.a aVar2 = this.f42595a;
        if (((aVar2 instanceof a.C0648a) || (aVar2 instanceof a.b)) && (num = this.f42596b) != null) {
            IconKt.a(e.d(num.intValue(), aVar, (this.f42597c >> 3) & 14), null, "", this.f42598d, false, 0.0f, aVar, ((this.f42597c >> 6) & 7168) | 392, 50);
        }
        aVar.S();
        hk.a aVar3 = this.f42595a;
        if ((aVar3 instanceof a.c) || (aVar3 instanceof a.b)) {
            TextKt.a(g.b(this.f42599e, aVar, (this.f42597c >> 6) & 14), null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar, 0, 0, 2046);
        }
        if (c.I()) {
            c.T();
        }
    }

    @Override // g00.q
    public /* bridge */ /* synthetic */ p invoke(t tVar, androidx.compose.runtime.a aVar, Integer num) {
        b(tVar, aVar, num.intValue());
        return p.f75480a;
    }
}
