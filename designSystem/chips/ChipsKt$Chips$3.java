package com.forsale.designSystem.chips;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.o;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.iconography.IconKt;
import com.forsale.designSystem.typography.ValuesKt;
import e2.h;
import g00.p;
import g00.q;
import j0.d;
import j0.e;
import j0.e1;
import j0.k;
import j0.t0;
import kotlin.jvm.internal.Lambda;
import v0.b;
import w.u;
/* compiled from: Chips.kt */
/* loaded from: classes3.dex */
final class ChipsKt$Chips$3 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChipsData f41258a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f41259b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<a, Integer, wz.p> f41260c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ p<a, Integer, wz.p> f41261d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ p<a, Integer, wz.p> f41262e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Chips.kt */
    /* renamed from: com.forsale.designSystem.chips.ChipsKt$Chips$3$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements p<a, Integer, wz.p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChipsData f41263a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p<a, Integer, wz.p> f41264b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f41265c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<a, Integer, wz.p> f41266d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<a, Integer, wz.p> f41267e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(ChipsData chipsData, p<? super a, ? super Integer, wz.p> pVar, int i11, p<? super a, ? super Integer, wz.p> pVar2, p<? super a, ? super Integer, wz.p> pVar3) {
            super(2);
            this.f41263a = chipsData;
            this.f41264b = pVar;
            this.f41265c = i11;
            this.f41266d = pVar2;
            this.f41267e = pVar3;
        }

        public final void b(a aVar, int i11) {
            if ((i11 & 11) == 2 && aVar.i()) {
                aVar.L();
                return;
            }
            if (c.I()) {
                c.U(-1962282077, i11, -1, "com.forsale.designSystem.chips.Chips.<anonymous>.<anonymous> (Chips.kt:53)");
            }
            b.c i12 = b.f74009a.i();
            Arrangement.f o11 = Arrangement.f3698a.o(this.f41263a.f());
            float f11 = 12;
            androidx.compose.ui.c d11 = SizeKt.d(PaddingKt.m(androidx.compose.ui.c.f7566a, h.l(f11), 0.0f, h.l(f11), 0.0f, 10, null), 0.0f, 1, null);
            p<a, Integer, wz.p> pVar = this.f41264b;
            int i13 = this.f41265c;
            p<a, Integer, wz.p> pVar2 = this.f41266d;
            p<a, Integer, wz.p> pVar3 = this.f41267e;
            aVar.C(693286680);
            a0 a11 = o.a(o11, i12, aVar, 48);
            aVar.C(-1323940314);
            int a12 = e.a(aVar, 0);
            k s11 = aVar.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, wz.p> c11 = LayoutKt.c(d11);
            if (!(aVar.k() instanceof d)) {
                e.c();
            }
            aVar.I();
            if (aVar.f()) {
                aVar.y(a13);
            } else {
                aVar.t();
            }
            a a14 = Updater.a(aVar);
            Updater.c(a14, a11, companion.e());
            Updater.c(a14, s11, companion.g());
            p<ComposeUiNode, Integer, wz.p> b11 = companion.b();
            if (a14.f() || !kotlin.jvm.internal.o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b11);
            }
            c11.invoke(e1.a(e1.b(aVar)), aVar, 0);
            aVar.C(2058660585);
            u uVar = u.f74924a;
            aVar.C(-188961827);
            if (pVar != null) {
                pVar.invoke(aVar, Integer.valueOf((i13 >> 15) & 14));
            }
            aVar.S();
            aVar.C(-188961759);
            if (pVar2 != null) {
                pVar2.invoke(aVar, Integer.valueOf((i13 >> 18) & 14));
            }
            aVar.S();
            aVar.C(-822354370);
            if (pVar3 != null) {
                pVar3.invoke(aVar, Integer.valueOf((i13 >> 21) & 14));
            }
            aVar.S();
            aVar.S();
            aVar.w();
            aVar.S();
            aVar.S();
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChipsKt$Chips$3(ChipsData chipsData, int i11, p<? super a, ? super Integer, wz.p> pVar, p<? super a, ? super Integer, wz.p> pVar2, p<? super a, ? super Integer, wz.p> pVar3) {
        super(2);
        this.f41258a = chipsData;
        this.f41259b = i11;
        this.f41260c = pVar;
        this.f41261d = pVar2;
        this.f41262e = pVar3;
    }

    public final void b(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(1189215971, i11, -1, "com.forsale.designSystem.chips.Chips.<anonymous> (Chips.kt:48)");
        }
        CompositionLocalKt.b(new t0[]{ValuesKt.c().c(this.f41258a.c(aVar, (this.f41259b >> 3) & 14)), IconKt.d().c(h.f(this.f41258a.d())), TextKt.i().c(1)}, r0.b.b(aVar, -1962282077, true, new AnonymousClass1(this.f41258a, this.f41260c, this.f41259b, this.f41261d, this.f41262e)), aVar, 56);
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
