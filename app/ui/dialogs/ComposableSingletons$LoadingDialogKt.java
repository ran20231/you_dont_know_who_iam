package com.forsale.app.ui.dialogs;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import e2.h;
import g00.p;
import g00.q;
import j0.d;
import j0.e1;
import j0.k;
import kotlin.jvm.internal.o;
import p1.g;
import r0.b;
import t9.y0;
import v0.b;
import w.f;
/* compiled from: LoadingDialog.kt */
/* loaded from: classes3.dex */
public final class ComposableSingletons$LoadingDialogKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposableSingletons$LoadingDialogKt f39318a = new ComposableSingletons$LoadingDialogKt();

    /* renamed from: b  reason: collision with root package name */
    public static p<a, Integer, wz.p> f39319b = b.c(1129348668, false, new p<a, Integer, wz.p>() { // from class: com.forsale.app.ui.dialogs.ComposableSingletons$LoadingDialogKt$lambda-1$1
        public final void b(a aVar, int i11) {
            if ((i11 & 11) == 2 && aVar.i()) {
                aVar.L();
                return;
            }
            if (c.I()) {
                c.U(1129348668, i11, -1, "com.forsale.app.ui.dialogs.ComposableSingletons$LoadingDialogKt.lambda-1.<anonymous> (LoadingDialog.kt:32)");
            }
            LoadingDialogKt.c(aVar, 0);
            if (c.I()) {
                c.T();
            }
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
            b(aVar, num.intValue());
            return wz.p.f75480a;
        }
    });

    /* renamed from: c  reason: collision with root package name */
    public static p<a, Integer, wz.p> f39320c = b.c(568464498, false, new p<a, Integer, wz.p>() { // from class: com.forsale.app.ui.dialogs.ComposableSingletons$LoadingDialogKt$lambda-2$1
        public final void b(a aVar, int i11) {
            if ((i11 & 11) == 2 && aVar.i()) {
                aVar.L();
                return;
            }
            if (c.I()) {
                c.U(568464498, i11, -1, "com.forsale.app.ui.dialogs.ComposableSingletons$LoadingDialogKt.lambda-2.<anonymous> (LoadingDialog.kt:40)");
            }
            b.InterfaceC0889b g11 = v0.b.f74009a.g();
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            float f11 = 25;
            float f12 = 16;
            androidx.compose.ui.c l11 = PaddingKt.l(aVar2, h.l(f11), h.l(20), h.l(f11), h.l(f12));
            aVar.C(-483455358);
            a0 a11 = e.a(Arrangement.f3698a.h(), g11, aVar, 48);
            aVar.C(-1323940314);
            int a12 = j0.e.a(aVar, 0);
            k s11 = aVar.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, wz.p> c11 = LayoutKt.c(l11);
            if (!(aVar.k() instanceof d)) {
                j0.e.c();
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
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b11);
            }
            c11.invoke(e1.a(e1.b(aVar)), aVar, 0);
            aVar.C(2058660585);
            f fVar = f.f74891a;
            androidx.compose.ui.c p11 = SizeKt.p(aVar2, h.l(34));
            float l12 = h.l(2);
            dk.a aVar3 = dk.a.f54291a;
            int i12 = dk.a.f54292b;
            yj.d e11 = aVar3.a(aVar, i12).e();
            int i13 = yj.d.f76453b;
            ProgressIndicatorKt.a(p11, e11.m(aVar, i13), l12, 0L, 0, aVar, 390, 24);
            SpacerKt.a(SizeKt.i(aVar2, h.l(f12)), aVar, 6);
            TextKt.b(g.b(y0.f70737w9, aVar, 0), null, aVar3.a(aVar, i12).e().m(aVar, i13), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.c(aVar, i12).r(), aVar, 0, 0, 65530);
            aVar.S();
            aVar.w();
            aVar.S();
            aVar.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
            b(aVar, num.intValue());
            return wz.p.f75480a;
        }
    });

    public final p<a, Integer, wz.p> a() {
        return f39319b;
    }

    public final p<a, Integer, wz.p> b() {
        return f39320c;
    }
}
