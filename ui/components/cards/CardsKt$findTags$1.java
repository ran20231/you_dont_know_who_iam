package com.forsale.ui.components.cards;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import b1.t1;
import g00.q;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import sj.d;
import w.t;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Cards.kt */
/* loaded from: classes3.dex */
public final class CardsKt$findTags$1 extends Lambda implements q<t, a, Integer, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ hk.a f42608a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42609b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ hk.a f42610c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ hk.a f42611d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ hk.a f42612e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ hk.a f42613f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsKt$findTags$1(hk.a aVar, int i11, hk.a aVar2, hk.a aVar3, hk.a aVar4, hk.a aVar5) {
        super(3);
        this.f42608a = aVar;
        this.f42609b = i11;
        this.f42610c = aVar2;
        this.f42611d = aVar3;
        this.f42612e = aVar4;
        this.f42613f = aVar5;
    }

    public final void b(t tVar, a aVar, int i11) {
        long y11;
        long y12;
        long y13;
        long y14;
        long y15;
        o.i(tVar, "$this$null");
        if ((i11 & 81) == 16 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(1354608858, i11, -1, "com.forsale.ui.components.cards.findTags.<anonymous> (Cards.kt:410)");
        }
        aVar.C(463636844);
        hk.a aVar2 = this.f42608a;
        if (aVar2 != null) {
            Integer valueOf = Integer.valueOf(d.E);
            int i12 = gk.c.f56937c;
            t1 b11 = this.f42608a.b();
            aVar.C(463637065);
            if (b11 == null) {
                y15 = dk.a.f54291a.a(aVar, dk.a.f54292b).g().c(aVar, yj.d.f76453b);
            } else {
                y15 = b11.y();
            }
            aVar.S();
            CardsKt.l(aVar2, valueOf, i12, y15, dk.a.f54291a.a(aVar, dk.a.f54292b).e().m(aVar, yj.d.f76453b), t1.f15974b.e(), aVar, (this.f42609b & 14) | 196608, 0);
        }
        aVar.S();
        aVar.C(463637270);
        hk.a aVar3 = this.f42610c;
        if (aVar3 != null) {
            int i13 = gk.c.f56936b;
            t1 b12 = aVar3.b();
            aVar.C(463637449);
            if (b12 == null) {
                y14 = dk.a.f54291a.a(aVar, dk.a.f54292b).i().i(aVar, yj.d.f76453b);
            } else {
                y14 = b12.y();
            }
            aVar.S();
            CardsKt.l(aVar3, null, i13, y14, dk.a.f54291a.a(aVar, dk.a.f54292b).e().m(aVar, yj.d.f76453b), 0L, aVar, ((this.f42609b >> 3) & 14) | 48, 32);
        }
        aVar.S();
        aVar.C(463637618);
        hk.a aVar4 = this.f42611d;
        if (aVar4 != null) {
            Integer valueOf2 = Integer.valueOf(d.f68670g);
            int i14 = gk.c.f56945k;
            t1 b13 = this.f42611d.b();
            aVar.C(463637847);
            if (b13 == null) {
                y13 = t1.o(dk.a.f54291a.a(aVar, dk.a.f54292b).g().d(aVar, yj.d.f76453b), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                y13 = b13.y();
            }
            aVar.S();
            dk.a aVar5 = dk.a.f54291a;
            int i15 = dk.a.f54292b;
            yj.d g11 = aVar5.a(aVar, i15).g();
            int i16 = yj.d.f76453b;
            CardsKt.l(aVar4, valueOf2, i14, y13, g11.c(aVar, i16), aVar5.a(aVar, i15).g().c(aVar, i16), aVar, (this.f42609b >> 6) & 14, 0);
        }
        aVar.S();
        aVar.C(463638097);
        hk.a aVar6 = this.f42612e;
        if (aVar6 != null) {
            Integer valueOf3 = Integer.valueOf(d.M);
            int i17 = gk.c.f56944j;
            t1 b14 = this.f42612e.b();
            aVar.C(463638310);
            if (b14 == null) {
                y12 = t1.o(dk.a.f54291a.a(aVar, dk.a.f54292b).g().d(aVar, yj.d.f76453b), 0.5f, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                y12 = b14.y();
            }
            aVar.S();
            dk.a aVar7 = dk.a.f54291a;
            int i18 = dk.a.f54292b;
            yj.d g12 = aVar7.a(aVar, i18).g();
            int i19 = yj.d.f76453b;
            CardsKt.l(aVar6, valueOf3, i17, y12, g12.c(aVar, i19), aVar7.a(aVar, i18).g().c(aVar, i19), aVar, (this.f42609b >> 9) & 14, 0);
        }
        aVar.S();
        hk.a aVar8 = this.f42613f;
        if (aVar8 != null) {
            Integer valueOf4 = Integer.valueOf(d.G);
            int i21 = gk.c.f56938d;
            t1 b15 = this.f42613f.b();
            aVar.C(463638779);
            if (b15 == null) {
                y11 = dk.a.f54291a.a(aVar, dk.a.f54292b).g().c(aVar, yj.d.f76453b);
            } else {
                y11 = b15.y();
            }
            aVar.S();
            CardsKt.l(aVar8, valueOf4, i21, y11, dk.a.f54291a.a(aVar, dk.a.f54292b).e().m(aVar, yj.d.f76453b), t1.f15974b.e(), aVar, ((this.f42609b >> 12) & 14) | 196608, 0);
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
