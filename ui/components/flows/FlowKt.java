package com.forsale.ui.components.flows;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.o0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.recyclerview.widget.RecyclerView;
import g00.p;
import g00.q;
import j0.d;
import j0.d1;
import j0.e;
import j0.e1;
import j0.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o;
import okhttp3.internal.http2.Http2;
/* compiled from: Flow.kt */
/* loaded from: classes3.dex */
public final class FlowKt {

    /* compiled from: Flow.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f42703a;

        static {
            int[] iArr = new int[MainAxisAlignment.values().length];
            try {
                iArr[MainAxisAlignment.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MainAxisAlignment.Start.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MainAxisAlignment.End.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MainAxisAlignment.SpaceEvenly.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MainAxisAlignment.SpaceBetween.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MainAxisAlignment.SpaceAround.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f42703a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(c cVar, LayoutOrientation layoutOrientation, SizeMode sizeMode, MainAxisAlignment mainAxisAlignment, float f11, FlowCrossAxisAlignment flowCrossAxisAlignment, float f12, MainAxisAlignment mainAxisAlignment2, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        androidx.compose.runtime.a h11 = aVar.h(-1086419045);
        if ((i11 & 14) == 0) {
            if (h11.T(cVar)) {
                i22 = 4;
            } else {
                i22 = 2;
            }
            i12 = i22 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.T(layoutOrientation)) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            i12 |= i21;
        }
        if ((i11 & 896) == 0) {
            if (h11.T(sizeMode)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i12 |= i19;
        }
        if ((i11 & 7168) == 0) {
            if (h11.T(mainAxisAlignment)) {
                i18 = RecyclerView.l.FLAG_MOVED;
            } else {
                i18 = 1024;
            }
            i12 |= i18;
        }
        if ((57344 & i11) == 0) {
            if (h11.b(f11)) {
                i17 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i17 = 8192;
            }
            i12 |= i17;
        }
        if ((458752 & i11) == 0) {
            if (h11.T(flowCrossAxisAlignment)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i12 |= i16;
        }
        if ((3670016 & i11) == 0) {
            if (h11.b(f12)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i12 |= i15;
        }
        if ((29360128 & i11) == 0) {
            if (h11.T(mainAxisAlignment2)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i12 |= i14;
        }
        if ((234881024 & i11) == 0) {
            if (h11.F(pVar)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i12 |= i13;
        }
        if ((191739611 & i12) == 38347922 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1086419045, i12, -1, "com.forsale.ui.components.flows.Flow (Flow.kt:127)");
            }
            FlowKt$Flow$1 flowKt$Flow$1 = new FlowKt$Flow$1(layoutOrientation, f11, sizeMode, f12, mainAxisAlignment, mainAxisAlignment2, flowCrossAxisAlignment);
            h11.C(-1323940314);
            int a11 = e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a12 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(cVar);
            int i23 = (((((i12 << 3) & 112) | ((i12 >> 24) & 14)) << 9) & 7168) | 6;
            if (!(h11.k() instanceof d)) {
                e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a12);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a13 = Updater.a(h11);
            Updater.c(a13, flowKt$Flow$1, companion.e());
            Updater.c(a13, s11, companion.g());
            p<ComposeUiNode, Integer, wz.p> b11 = companion.b();
            if (a13.f() || !o.d(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.p(Integer.valueOf(a11), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, Integer.valueOf((i23 >> 3) & 112));
            h11.C(2058660585);
            pVar.invoke(h11, Integer.valueOf((i23 >> 9) & 14));
            h11.S();
            h11.w();
            h11.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new FlowKt$Flow$2(cVar, layoutOrientation, sizeMode, mainAxisAlignment, f11, flowCrossAxisAlignment, f12, mainAxisAlignment2, pVar, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(androidx.compose.ui.c r26, com.forsale.ui.components.flows.SizeMode r27, com.forsale.ui.components.flows.MainAxisAlignment r28, float r29, com.forsale.ui.components.flows.FlowCrossAxisAlignment r30, float r31, com.forsale.ui.components.flows.MainAxisAlignment r32, g00.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r33, androidx.compose.runtime.a r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.ui.components.flows.FlowKt.b(androidx.compose.ui.c, com.forsale.ui.components.flows.SizeMode, com.forsale.ui.components.flows.MainAxisAlignment, float, com.forsale.ui.components.flows.FlowCrossAxisAlignment, float, com.forsale.ui.components.flows.MainAxisAlignment, g00.p, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(o0 o0Var, LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return o0Var.j0();
        }
        return o0Var.y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(o0 o0Var, LayoutOrientation layoutOrientation) {
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return o0Var.y0();
        }
        return o0Var.j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Arrangement.e j(MainAxisAlignment mainAxisAlignment) {
        switch (a.f42703a[mainAxisAlignment.ordinal()]) {
            case 1:
                return Arrangement.f3698a.b();
            case 2:
                return Arrangement.f3698a.g();
            case 3:
                return Arrangement.f3698a.c();
            case 4:
                return Arrangement.f3698a.f();
            case 5:
                return Arrangement.f3698a.e();
            case 6:
                return Arrangement.f3698a.d();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Arrangement.m k(MainAxisAlignment mainAxisAlignment) {
        switch (a.f42703a[mainAxisAlignment.ordinal()]) {
            case 1:
                return Arrangement.f3698a.b();
            case 2:
                return Arrangement.f3698a.h();
            case 3:
                return Arrangement.f3698a.a();
            case 4:
                return Arrangement.f3698a.f();
            case 5:
                return Arrangement.f3698a.e();
            case 6:
                return Arrangement.f3698a.d();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
