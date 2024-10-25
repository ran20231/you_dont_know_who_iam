package com.forsale.designSystem.notificationsystem;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.layout.b0;
import androidx.compose.ui.layout.c0;
import androidx.compose.ui.layout.n;
import androidx.compose.ui.layout.o0;
import androidx.compose.ui.layout.z;
import e2.b;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Snackbar.kt */
/* loaded from: classes3.dex */
public final class SnackbarKt$OneRowSnackBar$2 implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final SnackbarKt$OneRowSnackBar$2 f41967a = new SnackbarKt$OneRowSnackBar$2();

    SnackbarKt$OneRowSnackBar$2() {
    }

    @Override // androidx.compose.ui.layout.a0
    public final b0 c(c0 Layout, List<? extends z> measurable, long j11) {
        float f11;
        int d11;
        boolean z11;
        boolean z12;
        float f12;
        float f13;
        int i11;
        int j02;
        int i12;
        float f14;
        o.i(Layout, "$this$Layout");
        o.i(measurable, "measurable");
        List<? extends z> list = measurable;
        for (z zVar : list) {
            if (o.d(n.a(zVar), "action")) {
                o0 P = zVar.P(j11);
                int n11 = b.n(j11) - P.y0();
                f11 = SnackbarKt.f41964f;
                d11 = m00.o.d(n11 - Layout.s0(f11), b.p(j11));
                for (z zVar2 : list) {
                    if (o.d(n.a(zVar2), "text")) {
                        o0 P2 = zVar2.P(b.e(j11, 0, d11, 0, 0, 9, null));
                        int R = P2.R(AlignmentLineKt.a());
                        boolean z13 = true;
                        int i13 = 0;
                        if (R != Integer.MIN_VALUE) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            int R2 = P2.R(AlignmentLineKt.b());
                            if (R2 != Integer.MIN_VALUE) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                if (R != R2) {
                                    z13 = false;
                                }
                                int n12 = b.n(j11) - P.y0();
                                if (z13) {
                                    f14 = SnackbarKt.f41965g;
                                    i12 = Math.max(Layout.s0(f14), P.j0());
                                    i11 = (i12 - P2.j0()) / 2;
                                    int R3 = P.R(AlignmentLineKt.a());
                                    if (R3 != Integer.MIN_VALUE) {
                                        i13 = (R + i11) - R3;
                                    }
                                    j02 = i13;
                                } else {
                                    f12 = SnackbarKt.f41959a;
                                    int s02 = Layout.s0(f12) - R;
                                    f13 = SnackbarKt.f41966h;
                                    int max = Math.max(Layout.s0(f13), P2.j0() + s02);
                                    i11 = s02;
                                    j02 = (max - P.j0()) / 2;
                                    i12 = max;
                                }
                                return c0.i1(Layout, b.n(j11), i12, null, new SnackbarKt$OneRowSnackBar$2$measure$4(P2, i11, P, n12, j02), 4, null);
                            }
                            throw new IllegalArgumentException("No baselines for text ; No Content provided".toString());
                        }
                        throw new IllegalArgumentException("No baselines for text ; No Content provided".toString());
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
