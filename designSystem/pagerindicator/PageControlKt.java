package com.forsale.designSystem.pagerindicator;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.ui.c;
import androidx.recyclerview.widget.RecyclerView;
import g00.l;
import j0.d1;
import j0.k0;
import kotlin.jvm.internal.o;
/* compiled from: PageControl.kt */
/* loaded from: classes3.dex */
public final class PageControlKt {
    public static final void a(c cVar, k0<Integer> currentPageState, int i11, b bVar, a aVar, Orientation orientation, l<? super Integer, Integer> lVar, boolean z11, androidx.compose.runtime.a aVar2, int i12, int i13) {
        Object obj;
        int i14;
        int i15;
        int i16;
        int i17;
        b bVar2;
        Object obj2;
        int i18;
        Object obj3;
        int i19;
        int i21;
        Object obj4;
        int i22;
        b bVar3;
        a aVar3;
        Orientation orientation2;
        l<? super Integer, Integer> lVar2;
        boolean z12;
        Object obj5;
        b bVar4;
        a aVar4;
        int i23;
        Object obj6;
        l<? super Integer, Integer> lVar3;
        c cVar2;
        a aVar5;
        Orientation orientation3;
        boolean z13;
        int i24;
        o.i(currentPageState, "currentPageState");
        androidx.compose.runtime.a h11 = aVar2.h(-1719256081);
        int i25 = i13 & 1;
        if (i25 != 0) {
            i14 = i12 | 6;
            obj = cVar;
        } else if ((i12 & 14) == 0) {
            obj = cVar;
            if (h11.T(obj)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i14 = i15 | i12;
        } else {
            obj = cVar;
            i14 = i12;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i12 & 112) == 0) {
            if (h11.T(currentPageState)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i14 |= i16;
        }
        if ((i13 & 4) != 0) {
            i14 |= 384;
        } else if ((i12 & 896) == 0) {
            if (h11.d(i11)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i14 |= i17;
        }
        if ((i12 & 7168) == 0) {
            if ((i13 & 8) == 0) {
                bVar2 = bVar;
                if (h11.T(bVar2)) {
                    i24 = RecyclerView.l.FLAG_MOVED;
                    i14 |= i24;
                }
            } else {
                bVar2 = bVar;
            }
            i24 = 1024;
            i14 |= i24;
        } else {
            bVar2 = bVar;
        }
        int i26 = i13 & 16;
        if (i26 != 0) {
            i14 |= 8192;
        }
        int i27 = i13 & 32;
        if (i27 != 0) {
            i14 |= 196608;
            obj2 = orientation;
        } else {
            obj2 = orientation;
            if ((458752 & i12) == 0) {
                if (h11.T(obj2)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i14 |= i18;
            }
        }
        int i28 = i13 & 64;
        if (i28 != 0) {
            i14 |= 1572864;
            obj3 = lVar;
        } else {
            obj3 = lVar;
            if ((3670016 & i12) == 0) {
                if (h11.F(obj3)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i14 |= i19;
            }
        }
        int i29 = i13 & 128;
        if (i29 != 0) {
            i14 |= 12582912;
        } else if ((i12 & 29360128) == 0) {
            if (h11.a(z11)) {
                i21 = 8388608;
            } else {
                i21 = 4194304;
            }
            i14 |= i21;
        }
        if (i26 == 16 && (23967451 & i14) == 4793490 && h11.i()) {
            h11.L();
            aVar5 = aVar;
            cVar2 = obj;
            orientation3 = obj2;
            z13 = z11;
        } else {
            h11.G();
            if ((i12 & 1) != 0 && !h11.N()) {
                h11.L();
                if ((i13 & 8) != 0) {
                    i14 &= -7169;
                }
                if (i26 != 0) {
                    i14 &= -57345;
                }
                aVar4 = aVar;
                z12 = z11;
                obj5 = obj;
                i23 = i14;
                bVar4 = bVar2;
                lVar3 = obj3;
                obj6 = obj2;
            } else {
                if (i25 != 0) {
                    obj4 = c.f7566a;
                } else {
                    obj4 = obj;
                }
                if ((i13 & 8) != 0) {
                    i22 = i29;
                    bVar3 = b.f42063j.a(0L, 0L, h11, 384, 3);
                    i14 &= -7169;
                } else {
                    i22 = i29;
                    bVar3 = bVar2;
                }
                if (i26 != 0) {
                    aVar3 = a.f42057d.a();
                    i14 &= -57345;
                } else {
                    aVar3 = aVar;
                }
                if (i27 != 0) {
                    orientation2 = Orientation.Horizontal;
                } else {
                    orientation2 = orientation;
                }
                if (i28 != 0) {
                    lVar2 = PageControlKt$PageControl$1.f41996a;
                } else {
                    lVar2 = lVar;
                }
                if (i22 != 0) {
                    obj5 = obj4;
                    bVar4 = bVar3;
                    aVar4 = aVar3;
                    i23 = i14;
                    obj6 = orientation2;
                    lVar3 = lVar2;
                    z12 = true;
                } else {
                    z12 = z11;
                    obj5 = obj4;
                    bVar4 = bVar3;
                    aVar4 = aVar3;
                    i23 = i14;
                    obj6 = orientation2;
                    lVar3 = lVar2;
                }
            }
            h11.x();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1719256081, i23, -1, "com.forsale.designSystem.pagerindicator.PageControl (PageControl.kt:146)");
            }
            if (i11 <= 1) {
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
                d1 l11 = h11.l();
                if (l11 != null) {
                    l11.a(new PageControlKt$PageControl$2(obj5, currentPageState, i11, bVar4, aVar4, obj6, lVar3, z12, i12, i13));
                    return;
                }
                return;
            }
            BoxWithConstraintsKt.a(obj5, null, false, r0.b.b(h11, 541097305, true, new PageControlKt$PageControl$3(i11, currentPageState, bVar4, aVar4, obj6, lVar3, z12, i23)), h11, (i23 & 14) | 3072, 6);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            cVar2 = obj5;
            bVar2 = bVar4;
            aVar5 = aVar4;
            orientation3 = obj6;
            obj3 = lVar3;
            z13 = z12;
        }
        d1 l12 = h11.l();
        if (l12 != null) {
            l12.a(new PageControlKt$PageControl$4(cVar2, currentPageState, i11, bVar2, aVar5, orientation3, obj3, z13, i12, i13));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0244 A[LOOP:0: B:121:0x0242->B:122:0x0244, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(int r27, j0.k0<java.lang.Integer> r28, long r29, com.forsale.designSystem.pagerindicator.b r31, com.forsale.designSystem.pagerindicator.a r32, androidx.compose.foundation.gestures.Orientation r33, g00.l<? super java.lang.Integer, java.lang.Integer> r34, boolean r35, androidx.compose.runtime.a r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 1310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.designSystem.pagerindicator.PageControlKt.b(int, j0.k0, long, com.forsale.designSystem.pagerindicator.b, com.forsale.designSystem.pagerindicator.a, androidx.compose.foundation.gestures.Orientation, g00.l, boolean, androidx.compose.runtime.a, int, int):void");
    }

    private static final int c(k0<Integer> k0Var) {
        return k0Var.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(k0<Integer> k0Var, int i11) {
        k0Var.setValue(Integer.valueOf(i11));
    }

    private static final RangeChanged e(k0<RangeChanged> k0Var) {
        return k0Var.getValue();
    }

    private static final void f(k0<RangeChanged> k0Var, RangeChanged rangeChanged) {
        k0Var.setValue(rangeChanged);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(int i11, k0<RangeChanged> k0Var, int i12) {
        if (i12 == e(k0Var).a() && i12 != i11 - 1) {
            f(k0Var, new RangeChanged(e(k0Var).b() + 1, e(k0Var).a() + 1));
        } else if (i12 == e(k0Var).b() && i12 != 0) {
            f(k0Var, new RangeChanged(e(k0Var).b() - 1, e(k0Var).a() - 1));
        }
    }
}
