package com.forsale.designSystem.notificationsystem;

import androidx.compose.ui.layout.a0;
import androidx.compose.ui.layout.b0;
import androidx.compose.ui.layout.c0;
import androidx.compose.ui.layout.o0;
import androidx.compose.ui.layout.z;
import e2.b;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Snackbar.kt */
/* loaded from: classes3.dex */
public final class SnackbarKt$WithoutActionSnackbar$2 implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final SnackbarKt$WithoutActionSnackbar$2 f41987a = new SnackbarKt$WithoutActionSnackbar$2();

    SnackbarKt$WithoutActionSnackbar$2() {
    }

    @Override // androidx.compose.ui.layout.a0
    public final b0 c(c0 Layout, List<? extends z> measurable, long j11) {
        Object k02;
        float f11;
        o.i(Layout, "$this$Layout");
        o.i(measurable, "measurable");
        k02 = CollectionsKt___CollectionsKt.k0(measurable);
        o0 P = ((z) k02).P(j11);
        f11 = SnackbarKt.f41965g;
        int max = Math.max(Layout.s0(f11), P.j0());
        return c0.i1(Layout, b.n(j11), max, null, new SnackbarKt$WithoutActionSnackbar$2$measure$1(max, P), 4, null);
    }
}
