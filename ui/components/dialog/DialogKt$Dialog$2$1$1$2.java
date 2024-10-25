package com.forsale.ui.components.dialog;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.o;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
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
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Dialog.kt */
/* loaded from: classes3.dex */
public final class DialogKt$Dialog$2$1$1$2 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DialogCtaType f42646a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f42647b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f42648c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f42649d;

    /* compiled from: Dialog.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f42650a;

        static {
            int[] iArr = new int[DialogCtaType.values().length];
            try {
                iArr[DialogCtaType.Horizontal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DialogCtaType.Vertical.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DialogCtaType.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DialogCtaType.OneAction.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f42650a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DialogKt$Dialog$2$1$1$2(DialogCtaType dialogCtaType, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar2, int i11) {
        super(2);
        this.f42646a = dialogCtaType;
        this.f42647b = pVar;
        this.f42648c = pVar2;
        this.f42649d = i11;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(1681393533, i11, -1, "com.forsale.ui.components.dialog.Dialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Dialog.kt:101)");
        }
        int i12 = a.f42650a[this.f42646a.ordinal()];
        boolean z11 = true;
        boolean z12 = false;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        aVar.C(-1454913327);
                        aVar.S();
                    } else {
                        aVar.C(-1454913994);
                        float f11 = 8;
                        androidx.compose.ui.c m11 = PaddingKt.m(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), 0.0f, 0.0f, h.l(f11), h.l(f11), 3, null);
                        b.c i13 = b.f74009a.i();
                        Arrangement.e c11 = Arrangement.f3698a.c();
                        p<androidx.compose.runtime.a, Integer, wz.p> pVar = this.f42648c;
                        p<androidx.compose.runtime.a, Integer, wz.p> pVar2 = this.f42647b;
                        int i14 = this.f42649d;
                        aVar.C(693286680);
                        a0 a11 = o.a(c11, i13, aVar, 54);
                        aVar.C(-1323940314);
                        int a12 = e.a(aVar, 0);
                        k s11 = aVar.s();
                        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                        g00.a<ComposeUiNode> a13 = companion.a();
                        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c12 = LayoutKt.c(m11);
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
                        c12.invoke(e1.a(e1.b(aVar)), aVar, 0);
                        aVar.C(2058660585);
                        u uVar = u.f74924a;
                        if (pVar != null) {
                            z11 = false;
                        }
                        if (z11) {
                            aVar.C(-1454913414);
                            if (pVar2 != null) {
                                pVar2.invoke(aVar, Integer.valueOf((i14 >> 18) & 14));
                            }
                            aVar.S();
                            aVar.S();
                            aVar.w();
                            aVar.S();
                            aVar.S();
                            aVar.S();
                        } else {
                            throw new IllegalArgumentException("Secondary Cta must be null, use Horizontal or Vertical CTA type instead".toString());
                        }
                    }
                } else {
                    aVar.C(-1454914229);
                    aVar.S();
                    if (this.f42647b != null || this.f42648c != null) {
                        z11 = false;
                    }
                    if (!z11) {
                        throw new IllegalArgumentException("Primary CTA and Secondary Cta must be null, use the correct CTA type".toString());
                    }
                }
            } else {
                aVar.C(-1454914936);
                c.a aVar2 = androidx.compose.ui.c.f7566a;
                float f12 = 8;
                androidx.compose.ui.c m12 = PaddingKt.m(SizeKt.h(aVar2, 0.0f, 1, null), 0.0f, 0.0f, h.l(f12), h.l(f12), 3, null);
                Arrangement.f b12 = Arrangement.f3698a.b();
                b.InterfaceC0889b j11 = b.f74009a.j();
                p<androidx.compose.runtime.a, Integer, wz.p> pVar3 = this.f42647b;
                p<androidx.compose.runtime.a, Integer, wz.p> pVar4 = this.f42648c;
                int i15 = this.f42649d;
                aVar.C(-483455358);
                a0 a15 = androidx.compose.foundation.layout.e.a(b12, j11, aVar, 54);
                aVar.C(-1323940314);
                int a16 = e.a(aVar, 0);
                k s12 = aVar.s();
                ComposeUiNode.Companion companion2 = ComposeUiNode.f8256m;
                g00.a<ComposeUiNode> a17 = companion2.a();
                q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c13 = LayoutKt.c(m12);
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
                p<ComposeUiNode, Integer, wz.p> b13 = companion2.b();
                if (a18.f() || !kotlin.jvm.internal.o.d(a18.D(), Integer.valueOf(a16))) {
                    a18.u(Integer.valueOf(a16));
                    a18.p(Integer.valueOf(a16), b13);
                }
                c13.invoke(e1.a(e1.b(aVar)), aVar, 0);
                aVar.C(2058660585);
                f fVar = f.f74891a;
                if (pVar3 != null && pVar4 != null) {
                    z12 = true;
                }
                if (z12) {
                    pVar3.invoke(aVar, Integer.valueOf((i15 >> 18) & 14));
                    SpacerKt.a(SizeKt.i(aVar2, h.l(f12)), aVar, 6);
                    pVar4.invoke(aVar, Integer.valueOf((i15 >> 21) & 14));
                    aVar.S();
                    aVar.w();
                    aVar.S();
                    aVar.S();
                    aVar.S();
                } else {
                    throw new IllegalArgumentException("Both Primary & Secondary CTAs must be defined".toString());
                }
            }
        } else {
            aVar.C(-1454915653);
            c.a aVar3 = androidx.compose.ui.c.f7566a;
            float f13 = 8;
            androidx.compose.ui.c m13 = PaddingKt.m(SizeKt.h(aVar3, 0.0f, 1, null), 0.0f, 0.0f, h.l(f13), h.l(f13), 3, null);
            b.c i16 = b.f74009a.i();
            Arrangement.e c14 = Arrangement.f3698a.c();
            p<androidx.compose.runtime.a, Integer, wz.p> pVar5 = this.f42647b;
            p<androidx.compose.runtime.a, Integer, wz.p> pVar6 = this.f42648c;
            int i17 = this.f42649d;
            aVar.C(693286680);
            a0 a19 = o.a(c14, i16, aVar, 54);
            aVar.C(-1323940314);
            int a21 = e.a(aVar, 0);
            k s13 = aVar.s();
            ComposeUiNode.Companion companion3 = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a22 = companion3.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c15 = LayoutKt.c(m13);
            if (!(aVar.k() instanceof d)) {
                e.c();
            }
            aVar.I();
            if (aVar.f()) {
                aVar.y(a22);
            } else {
                aVar.t();
            }
            androidx.compose.runtime.a a23 = Updater.a(aVar);
            Updater.c(a23, a19, companion3.e());
            Updater.c(a23, s13, companion3.g());
            p<ComposeUiNode, Integer, wz.p> b14 = companion3.b();
            if (a23.f() || !kotlin.jvm.internal.o.d(a23.D(), Integer.valueOf(a21))) {
                a23.u(Integer.valueOf(a21));
                a23.p(Integer.valueOf(a21), b14);
            }
            c15.invoke(e1.a(e1.b(aVar)), aVar, 0);
            aVar.C(2058660585);
            u uVar2 = u.f74924a;
            if (pVar5 != null && pVar6 != null) {
                z12 = true;
            }
            if (z12) {
                pVar6.invoke(aVar, Integer.valueOf((i17 >> 21) & 14));
                SpacerKt.a(SizeKt.u(aVar3, h.l(f13)), aVar, 6);
                pVar5.invoke(aVar, Integer.valueOf((i17 >> 18) & 14));
                aVar.S();
                aVar.w();
                aVar.S();
                aVar.S();
                aVar.S();
            } else {
                throw new IllegalArgumentException("Both Primary & Secondary CTAs must be defined".toString());
            }
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
