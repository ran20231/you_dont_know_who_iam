package com.forsale.designSystem.buttons;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.z;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.iconography.IconKt;
import com.forsale.designSystem.typography.ValuesKt;
import e2.h;
import g00.p;
import g00.q;
import j0.e;
import j0.e1;
import j0.k;
import j0.n1;
import j0.t0;
import kotlin.jvm.internal.Lambda;
import v0.b;
import w.o;
import w.t;
import w.u;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Buttons.kt */
/* loaded from: classes3.dex */
public final class ButtonsKt$Button$2 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ButtonData f41044a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f41045b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f41046c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ o f41047d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ q<t, androidx.compose.runtime.a, Integer, wz.p> f41048e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Buttons.kt */
    /* renamed from: com.forsale.designSystem.buttons.ButtonsKt$Button$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f41049a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o f41050b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f41051c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ButtonData f41052d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q<t, androidx.compose.runtime.a, Integer, wz.p> f41053e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(boolean z11, o oVar, int i11, ButtonData buttonData, q<? super t, ? super androidx.compose.runtime.a, ? super Integer, wz.p> qVar) {
            super(2);
            this.f41049a = z11;
            this.f41050b = oVar;
            this.f41051c = i11;
            this.f41052d = buttonData;
            this.f41053e = qVar;
        }

        private static final float c(n1<h> n1Var) {
            return n1Var.getValue().q();
        }

        private static final float e(n1<h> n1Var) {
            return n1Var.getValue().q();
        }

        private static final o g(n1<? extends o> n1Var) {
            return n1Var.getValue();
        }

        public final void b(androidx.compose.runtime.a aVar, int i11) {
            h hVar;
            boolean p11;
            float g11;
            boolean p12;
            float g12;
            o d11;
            Arrangement.e p13;
            if ((i11 & 11) == 2 && aVar.i()) {
                aVar.L();
                return;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1265610107, i11, -1, "com.forsale.designSystem.buttons.Button.<anonymous>.<anonymous> (Buttons.kt:71)");
            }
            LayoutDirection layoutDirection = (LayoutDirection) aVar.q(CompositionLocalsKt.j());
            boolean z11 = this.f41049a;
            o oVar = this.f41050b;
            h hVar2 = null;
            if (oVar != null) {
                hVar = h.f(oVar.d());
            } else {
                hVar = null;
            }
            p11 = ButtonsKt.p(z11, hVar, aVar, (this.f41051c >> 21) & 14);
            if (p11) {
                g11 = h.l(0);
            } else {
                g11 = this.f41052d.g();
            }
            n1 o11 = z.o(h.f(g11), aVar, 0);
            boolean z12 = this.f41049a;
            o oVar2 = this.f41050b;
            if (oVar2 != null) {
                hVar2 = h.f(PaddingKt.g(oVar2, layoutDirection));
            }
            p12 = ButtonsKt.p(z12, hVar2, aVar, (this.f41051c >> 21) & 14);
            if (p12) {
                g12 = h.l(0);
            } else {
                g12 = this.f41052d.g();
            }
            n1 o12 = z.o(h.f(g12), aVar, 0);
            o oVar3 = this.f41050b;
            if (oVar3 == null) {
                d11 = PaddingKt.e(this.f41052d.j(), 0.0f, this.f41052d.i(), 0.0f, 10, null);
            } else {
                d11 = PaddingKt.d(PaddingKt.g(this.f41050b, layoutDirection), oVar3.d(), PaddingKt.f(this.f41050b, layoutDirection), this.f41050b.a());
            }
            androidx.compose.ui.c h11 = PaddingKt.h(SizeKt.a(androidx.compose.ui.c.f7566a, e(o12), c(o11)), g(z.o(d11, aVar, 0)));
            if (h.n(this.f41052d.l(), h.f54555b.c())) {
                p13 = Arrangement.f3698a.b();
            } else {
                p13 = Arrangement.f3698a.p(this.f41052d.l(), v0.b.f74009a.g());
            }
            b.c i12 = v0.b.f74009a.i();
            q<t, androidx.compose.runtime.a, Integer, wz.p> qVar = this.f41053e;
            int i13 = ((this.f41051c >> 18) & 7168) | 384;
            aVar.C(693286680);
            int i14 = i13 >> 3;
            a0 a11 = androidx.compose.foundation.layout.o.a(p13, i12, aVar, (i14 & 112) | (i14 & 14));
            aVar.C(-1323940314);
            int a12 = e.a(aVar, 0);
            k s11 = aVar.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(h11);
            int i15 = ((((i13 << 3) & 112) << 9) & 7168) | 6;
            if (!(aVar.k() instanceof j0.d)) {
                e.c();
            }
            aVar.I();
            if (aVar.f()) {
                aVar.y(a13);
            } else {
                aVar.t();
            }
            androidx.compose.runtime.a a14 = Updater.a(aVar);
            Updater.c(a14, a11, companion.e());
            Updater.c(a14, s11, companion.g());
            p<ComposeUiNode, Integer, wz.p> b11 = companion.b();
            if (a14.f() || !kotlin.jvm.internal.o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b11);
            }
            c11.invoke(e1.a(e1.b(aVar)), aVar, Integer.valueOf((i15 >> 3) & 112));
            aVar.C(2058660585);
            qVar.invoke(u.f74924a, aVar, Integer.valueOf(((i13 >> 6) & 112) | 6));
            aVar.S();
            aVar.w();
            aVar.S();
            aVar.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
            b(aVar, num.intValue());
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ButtonsKt$Button$2(ButtonData buttonData, int i11, boolean z11, o oVar, q<? super t, ? super androidx.compose.runtime.a, ? super Integer, wz.p> qVar) {
        super(2);
        this.f41044a = buttonData;
        this.f41045b = i11;
        this.f41046c = z11;
        this.f41047d = oVar;
        this.f41048e = qVar;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1160532539, i11, -1, "com.forsale.designSystem.buttons.Button.<anonymous> (Buttons.kt:66)");
        }
        CompositionLocalKt.b(new t0[]{ValuesKt.c().c(this.f41044a.m(aVar, (this.f41045b >> 3) & 14)), IconKt.d().c(h.f(this.f41044a.h())), TextKt.i().c(1)}, r0.b.b(aVar, -1265610107, true, new AnonymousClass1(this.f41046c, this.f41047d, this.f41045b, this.f41044a, this.f41048e)), aVar, 56);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
