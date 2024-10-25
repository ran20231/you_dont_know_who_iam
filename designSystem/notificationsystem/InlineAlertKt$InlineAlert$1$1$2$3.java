package com.forsale.designSystem.notificationsystem;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.o;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.designSystem.notificationsystem.InlineAlertState;
import e2.h;
import g00.p;
import g00.q;
import j0.d;
import j0.e;
import j0.e1;
import j0.k;
import kotlin.jvm.internal.Lambda;
import v0.b;
import w.f;
import w.u;
/* compiled from: InlineAlert.kt */
/* loaded from: classes3.dex */
final class InlineAlertKt$InlineAlert$1$1$2$3 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InlineAlertState f41928a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41929b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f41930c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41931d;

    /* compiled from: InlineAlert.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f41932a;

        static {
            int[] iArr = new int[InlineAlertState.CTAType.values().length];
            try {
                iArr[InlineAlertState.CTAType.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InlineAlertState.CTAType.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f41932a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InlineAlertKt$InlineAlert$1$1$2$3(InlineAlertState inlineAlertState, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, int i11, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar2) {
        super(2);
        this.f41928a = inlineAlertState;
        this.f41929b = pVar;
        this.f41930c = i11;
        this.f41931d = pVar2;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(-1516689157, i11, -1, "com.forsale.designSystem.notificationsystem.InlineAlert.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InlineAlert.kt:115)");
        }
        int i12 = a.f41932a[this.f41928a.b().ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                aVar.C(836017994);
                aVar.S();
            } else {
                aVar.C(836017657);
                p<androidx.compose.runtime.a, Integer, wz.p> pVar = this.f41929b;
                int i13 = this.f41930c;
                p<androidx.compose.runtime.a, Integer, wz.p> pVar2 = this.f41931d;
                aVar.C(693286680);
                c.a aVar2 = androidx.compose.ui.c.f7566a;
                a0 a11 = o.a(Arrangement.f3698a.g(), b.f74009a.l(), aVar, 0);
                aVar.C(-1323940314);
                int a12 = e.a(aVar, 0);
                k s11 = aVar.s();
                ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                g00.a<ComposeUiNode> a13 = companion.a();
                q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(aVar2);
                if (!(aVar.k() instanceof d)) {
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
                c11.invoke(e1.a(e1.b(aVar)), aVar, 0);
                aVar.C(2058660585);
                u uVar = u.f74924a;
                pVar.invoke(aVar, Integer.valueOf((i13 >> 15) & 14));
                aVar.C(836017743);
                if (pVar2 != null) {
                    SpacerKt.a(SizeKt.u(aVar2, h.l(20)), aVar, 6);
                    pVar2.invoke(aVar, Integer.valueOf((i13 >> 18) & 14));
                }
                aVar.S();
                aVar.S();
                aVar.w();
                aVar.S();
                aVar.S();
                aVar.S();
            }
        } else {
            aVar.C(836017271);
            p<androidx.compose.runtime.a, Integer, wz.p> pVar3 = this.f41929b;
            int i14 = this.f41930c;
            p<androidx.compose.runtime.a, Integer, wz.p> pVar4 = this.f41931d;
            aVar.C(-483455358);
            c.a aVar3 = androidx.compose.ui.c.f7566a;
            a0 a15 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), b.f74009a.k(), aVar, 0);
            aVar.C(-1323940314);
            int a16 = e.a(aVar, 0);
            k s12 = aVar.s();
            ComposeUiNode.Companion companion2 = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a17 = companion2.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c12 = LayoutKt.c(aVar3);
            if (!(aVar.k() instanceof d)) {
                e.c();
            }
            aVar.I();
            if (aVar.f()) {
                aVar.y(a17);
            } else {
                aVar.t();
            }
            androidx.compose.runtime.a a18 = Updater.a(aVar);
            Updater.c(a18, a15, companion2.e());
            Updater.c(a18, s12, companion2.g());
            p<ComposeUiNode, Integer, wz.p> b12 = companion2.b();
            if (a18.f() || !kotlin.jvm.internal.o.d(a18.D(), Integer.valueOf(a16))) {
                a18.u(Integer.valueOf(a16));
                a18.p(Integer.valueOf(a16), b12);
            }
            c12.invoke(e1.a(e1.b(aVar)), aVar, 0);
            aVar.C(2058660585);
            f fVar = f.f74891a;
            pVar3.invoke(aVar, Integer.valueOf((i14 >> 15) & 14));
            aVar.C(836017362);
            if (pVar4 != null) {
                SpacerKt.a(SizeKt.i(aVar3, h.l(16)), aVar, 6);
                pVar4.invoke(aVar, Integer.valueOf((i14 >> 18) & 14));
            }
            aVar.S();
            aVar.S();
            aVar.w();
            aVar.S();
            aVar.S();
            aVar.S();
        }
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
