package com.forsale.ui.components.notificationsystem.snackbar;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.runtime.c0;
import androidx.compose.ui.c;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.h;
import com.forsale.designSystem.notificationsystem.SnackbarDuration;
import j0.d1;
import j0.k0;
import j0.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o;
import r.g;
import r.h0;
import r0.b;
/* compiled from: SnackbarHost.kt */
/* loaded from: classes3.dex */
public final class SnackbarHostKt {

    /* compiled from: SnackbarHost.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f42726a;

        static {
            int[] iArr = new int[SnackbarDuration.values().length];
            try {
                iArr[SnackbarDuration.Four.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SnackbarDuration.Five.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SnackbarDuration.Six.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SnackbarDuration.Seven.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SnackbarDuration.Eight.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SnackbarDuration.Nine.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SnackbarDuration.Ten.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f42726a = iArr;
        }
    }

    public static final void a(SnackbarHostState hostState, c cVar, androidx.compose.runtime.a aVar, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        o.i(hostState, "hostState");
        androidx.compose.runtime.a h11 = aVar.h(49469703);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (h11.T(hostState)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            i13 = i11;
        }
        int i16 = i12 & 2;
        if (i16 != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (h11.T(cVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i13 & 91) == 18 && h11.i()) {
            h11.L();
        } else {
            if (i16 != 0) {
                cVar = c.f7566a;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(49469703, i13, -1, "com.forsale.ui.components.notificationsystem.snackbar.SnackbarHost (SnackbarHost.kt:105)");
            }
            ak.a b11 = hostState.b();
            h hVar = (h) h11.q(CompositionLocalsKt.c());
            h11.C(-492369756);
            Object D = h11.D();
            if (D == androidx.compose.runtime.a.f7182a.a()) {
                D = c0.e(Boolean.FALSE, null, 2, null);
                h11.u(D);
            }
            h11.S();
            k0 k0Var = (k0) D;
            u.d(b11, new SnackbarHostKt$SnackbarHost$1(b11, hVar, k0Var, null), h11, 72);
            if (b11 != null) {
                AnimatedVisibilityKt.d(b(k0Var), cVar, EnterExitTransitionKt.A(g.k(b11.e().getValue(), 0, h0.d(), 2, null), SnackbarHostKt$SnackbarHost$2.f42719a), EnterExitTransitionKt.D(g.k(b11.e().getValue(), 0, h0.d(), 2, null), SnackbarHostKt$SnackbarHost$3.f42720a), null, b.b(h11, -1463168902, true, new SnackbarHostKt$SnackbarHost$4(b11)), h11, (i13 & 112) | 196608, 16);
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new SnackbarHostKt$SnackbarHost$5(hostState, cVar, i11, i12));
        }
    }

    private static final boolean b(k0<Boolean> k0Var) {
        return k0Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(k0<Boolean> k0Var, boolean z11) {
        k0Var.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long f(SnackbarDuration snackbarDuration, h hVar) {
        long j11;
        switch (a.f42726a[snackbarDuration.ordinal()]) {
            case 1:
                j11 = 4000;
                break;
            case 2:
                j11 = 5000;
                break;
            case 3:
                j11 = 6000;
                break;
            case 4:
                j11 = 7000;
                break;
            case 5:
                j11 = 8000;
                break;
            case 6:
                j11 = 9000;
                break;
            case 7:
                j11 = 10000;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        long j12 = j11;
        if (hVar == null) {
            return j12;
        }
        return h.a(hVar, j12, true, true, false, 8, null);
    }
}
