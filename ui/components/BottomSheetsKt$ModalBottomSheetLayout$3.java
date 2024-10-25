package com.forsale.ui.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.designSystem.bottomsheets.ModalBottomSheetState;
import com.forsale.designSystem.dividers.DividersKt;
import e2.h;
import g00.p;
import g00.q;
import j0.d;
import j0.e1;
import j0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import v0.b;
import w.f;
import w.t;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomSheets.kt */
/* loaded from: classes3.dex */
public final class BottomSheetsKt$ModalBottomSheetLayout$3 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f42257a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<a, Integer, wz.p> f42258b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Integer f42259c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f42260d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ q<t, a, Integer, wz.p> f42261e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f42262f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f42263g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f42264h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetsKt$ModalBottomSheetLayout$3(String str, p<? super a, ? super Integer, wz.p> pVar, Integer num, int i11, q<? super t, ? super a, ? super Integer, wz.p> qVar, CoroutineScope coroutineScope, g00.a<wz.p> aVar, ModalBottomSheetState modalBottomSheetState) {
        super(2);
        this.f42257a = str;
        this.f42258b = pVar;
        this.f42259c = num;
        this.f42260d = i11;
        this.f42261e = qVar;
        this.f42262f = coroutineScope;
        this.f42263g = aVar;
        this.f42264h = modalBottomSheetState;
    }

    public final void b(a aVar, int i11) {
        Painter painter;
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(1653814419, i11, -1, "com.forsale.ui.components.ModalBottomSheetLayout.<anonymous> (BottomSheets.kt:98)");
        }
        if (this.f42257a == null && this.f42258b == null) {
            aVar.C(1278793928);
            SpacerKt.a(SizeKt.i(androidx.compose.ui.c.f7566a, h.l(16)), aVar, 6);
            aVar.S();
        } else {
            aVar.C(1278793246);
            androidx.compose.ui.c h11 = SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null);
            Integer num = this.f42259c;
            int i12 = this.f42260d;
            String str = this.f42257a;
            q<t, a, Integer, wz.p> qVar = this.f42261e;
            p<a, Integer, wz.p> pVar = this.f42258b;
            CoroutineScope coroutineScope = this.f42262f;
            g00.a<wz.p> aVar2 = this.f42263g;
            ModalBottomSheetState modalBottomSheetState = this.f42264h;
            aVar.C(-483455358);
            a0 a11 = e.a(Arrangement.f3698a.h(), b.f74009a.k(), aVar, 0);
            aVar.C(-1323940314);
            int a12 = j0.e.a(aVar, 0);
            k s11 = aVar.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, wz.p> c11 = LayoutKt.c(h11);
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
            aVar.C(-292706716);
            if (num != null) {
                painter = p1.e.d(num.intValue(), aVar, (i12 >> 3) & 14);
            } else {
                painter = null;
            }
            aVar.S();
            int i13 = i12 >> 3;
            BottomSheetsKt.a(painter, new BottomSheetsKt$ModalBottomSheetLayout$3$1$1(coroutineScope, aVar2, modalBottomSheetState), str, qVar, aVar, (i13 & 896) | 8 | (i13 & 7168), 0);
            aVar.C(-292706279);
            if (pVar != null) {
                pVar.invoke(aVar, Integer.valueOf((i12 >> 15) & 14));
            }
            aVar.S();
            DividersKt.a(null, 0.0f, 0L, aVar, 0, 7);
            aVar.S();
            aVar.w();
            aVar.S();
            aVar.S();
            aVar.S();
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
