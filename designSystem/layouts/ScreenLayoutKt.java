package com.forsale.designSystem.layouts;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.recyclerview.widget.RecyclerView;
import e2.h;
import g00.p;
import j0.d1;
import j0.s0;
import okhttp3.internal.http2.Http2;
/* compiled from: ScreenLayout.kt */
/* loaded from: classes3.dex */
public final class ScreenLayoutKt {

    /* renamed from: a  reason: collision with root package name */
    private static final s0<d> f41808a = CompositionLocalKt.e(ScreenLayoutKt$LocalFabPlacement$1.f41811a);

    /* renamed from: b  reason: collision with root package name */
    private static final float f41809b;

    /* renamed from: c  reason: collision with root package name */
    private static final float f41810c;

    static {
        float f11 = 16;
        f41809b = h.l(f11);
        f41810c = h.l(f11);
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.c r37, long r38, long r40, g00.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r42, g00.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r43, g00.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r44, g00.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r45, g00.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r46, int r47, boolean r48, androidx.compose.runtime.a r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.designSystem.layouts.ScreenLayoutKt.a(androidx.compose.ui.c, long, long, g00.p, g00.p, g00.p, g00.p, g00.p, int, boolean, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(boolean z11, int i11, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar2, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar3, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar4, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar5, androidx.compose.runtime.a aVar, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        androidx.compose.runtime.a h11 = aVar.h(-480312027);
        if ((i12 & 14) == 0) {
            if (h11.a(z11)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i13 = i23 | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            if (h11.d(i11)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i13 |= i22;
        }
        if ((i12 & 896) == 0) {
            if (h11.F(pVar)) {
                i21 = 256;
            } else {
                i21 = 128;
            }
            i13 |= i21;
        }
        if ((i12 & 7168) == 0) {
            if (h11.F(pVar2)) {
                i19 = RecyclerView.l.FLAG_MOVED;
            } else {
                i19 = 1024;
            }
            i13 |= i19;
        }
        if ((57344 & i12) == 0) {
            if (h11.F(pVar3)) {
                i18 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i18 = 8192;
            }
            i13 |= i18;
        }
        if ((458752 & i12) == 0) {
            if (h11.F(pVar4)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i13 |= i17;
        }
        if ((3670016 & i12) == 0) {
            if (h11.F(pVar5)) {
                i16 = 1048576;
            } else {
                i16 = 524288;
            }
            i13 |= i16;
        }
        int i24 = i13;
        if ((2995931 & i24) == 599186 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-480312027, i24, -1, "com.forsale.designSystem.layouts.ScreenLayout (ScreenLayout.kt:59)");
            }
            Object[] objArr = {pVar, pVar3, pVar4, e.b(i11), Boolean.valueOf(z11), pVar5, pVar2};
            h11.C(-568225417);
            int i25 = 0;
            boolean z12 = false;
            for (int i26 = 7; i25 < i26; i26 = 7) {
                z12 |= h11.T(objArr[i25]);
                i25++;
            }
            Object D = h11.D();
            if (!z12 && D != androidx.compose.runtime.a.f7182a.a()) {
                i14 = 1;
                i15 = 0;
            } else {
                i14 = 1;
                i15 = 0;
                ScreenLayoutKt$ScreenLayout$3$1 screenLayoutKt$ScreenLayout$3$1 = new ScreenLayoutKt$ScreenLayout$3$1(pVar, pVar4, i11, z11, pVar3, i24, pVar5, pVar2);
                h11.u(screenLayoutKt$ScreenLayout$3$1);
                D = screenLayoutKt$ScreenLayout$3$1;
            }
            h11.S();
            SubcomposeLayoutKt.a(null, (p) D, h11, i15, i14);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new ScreenLayoutKt$ScreenLayout$4(z11, i11, pVar, pVar2, pVar3, pVar4, pVar5, i12));
        }
    }

    public static final s0<d> f() {
        return f41808a;
    }
}
