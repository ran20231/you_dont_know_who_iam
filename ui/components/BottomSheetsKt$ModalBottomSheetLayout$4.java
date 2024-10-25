package com.forsale.ui.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.designSystem.dividers.DividersKt;
import e2.h;
import g00.p;
import g00.q;
import j0.d;
import j0.e1;
import j0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import v0.b;
import w.f;
/* compiled from: BottomSheets.kt */
/* loaded from: classes3.dex */
final class BottomSheetsKt$ModalBottomSheetLayout$4 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<a, Integer, wz.p> f42270a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42271b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetsKt$ModalBottomSheetLayout$4(p<? super a, ? super Integer, wz.p> pVar, int i11) {
        super(2);
        this.f42270a = pVar;
        this.f42271b = i11;
    }

    public final void b(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(537846293, i11, -1, "com.forsale.ui.components.ModalBottomSheetLayout.<anonymous> (BottomSheets.kt:120)");
        }
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        float f11 = 16;
        androidx.compose.ui.c m11 = PaddingKt.m(SizeKt.h(aVar2, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, h.l(f11), 7, null);
        Arrangement.f o11 = Arrangement.f3698a.o(h.l(f11));
        p<a, Integer, wz.p> pVar = this.f42270a;
        int i12 = this.f42271b;
        aVar.C(-483455358);
        b.a aVar3 = b.f74009a;
        a0 a11 = e.a(o11, aVar3.k(), aVar, 6);
        aVar.C(-1323940314);
        int a12 = j0.e.a(aVar, 0);
        k s11 = aVar.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, wz.p> c11 = LayoutKt.c(m11);
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
        aVar.C(1278794268);
        if (pVar != null) {
            DividersKt.a(null, 0.0f, 0L, aVar, 0, 7);
            androidx.compose.ui.c k11 = PaddingKt.k(aVar2, h.l(f11), 0.0f, 2, null);
            aVar.C(733328855);
            a0 g11 = BoxKt.g(aVar3.o(), false, aVar, 0);
            aVar.C(-1323940314);
            int a15 = j0.e.a(aVar, 0);
            k s12 = aVar.s();
            g00.a<ComposeUiNode> a16 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, wz.p> c12 = LayoutKt.c(k11);
            if (!(aVar.k() instanceof d)) {
                j0.e.c();
            }
            aVar.I();
            if (aVar.f()) {
                aVar.y(a16);
            } else {
                aVar.t();
            }
            a a17 = Updater.a(aVar);
            Updater.c(a17, g11, companion.e());
            Updater.c(a17, s12, companion.g());
            p<ComposeUiNode, Integer, wz.p> b12 = companion.b();
            if (a17.f() || !o.d(a17.D(), Integer.valueOf(a15))) {
                a17.u(Integer.valueOf(a15));
                a17.p(Integer.valueOf(a15), b12);
            }
            c12.invoke(e1.a(e1.b(aVar)), aVar, 0);
            aVar.C(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
            pVar.invoke(aVar, Integer.valueOf((i12 >> 21) & 14));
            aVar.S();
            aVar.w();
            aVar.S();
            aVar.S();
        }
        aVar.S();
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
}
