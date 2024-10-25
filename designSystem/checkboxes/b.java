package com.forsale.designSystem.checkboxes;

import androidx.compose.foundation.interaction.DragInteractionKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.HoverInteractionKt;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.runtime.c;
import androidx.compose.runtime.z;
import androidx.compose.ui.state.ToggleableState;
import b1.t1;
import b1.v1;
import j0.n1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import v.k;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Checkboxes.kt */
/* loaded from: classes3.dex */
public final class b implements wj.a {

    /* renamed from: a  reason: collision with root package name */
    private final long f41245a;

    /* renamed from: b  reason: collision with root package name */
    private final long f41246b;

    /* renamed from: c  reason: collision with root package name */
    private final long f41247c;

    /* renamed from: d  reason: collision with root package name */
    private final long f41248d;

    /* renamed from: e  reason: collision with root package name */
    private final long f41249e;

    /* renamed from: f  reason: collision with root package name */
    private final long f41250f;

    public /* synthetic */ b(long j11, long j12, long j13, long j14, long j15, long j16, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14, j15, j16);
    }

    private final long d(long j11, ToggleableState toggleableState, k kVar, androidx.compose.runtime.a aVar, int i11, int i12) {
        k kVar2;
        long o11;
        long o12;
        long o13;
        long o14;
        long j12 = j11;
        aVar.C(-1890181594);
        t1 t1Var = null;
        if ((i12 & 2) != 0) {
            kVar2 = null;
        } else {
            kVar2 = kVar;
        }
        if (c.I()) {
            c.U(-1890181594, i11, -1, "com.forsale.designSystem.checkboxes.DefaultCheckboxColors.addOverlayColor (Checkboxes.kt:184)");
        }
        if (kVar2 != null) {
            aVar.C(-736260393);
            int i13 = (i11 >> 6) & 14;
            boolean booleanValue = HoverInteractionKt.a(kVar2, aVar, i13).getValue().booleanValue();
            aVar.S();
            if (booleanValue) {
                aVar.C(-736260384);
                if (toggleableState == ToggleableState.On) {
                    o14 = t1.o(t1.f15974b.a(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    o14 = t1.o(dk.a.f54291a.a(aVar, 6).e().j(aVar, 0), 0.08f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                aVar.S();
                t1Var = t1.g(o14);
            } else {
                aVar.C(-736260131);
                boolean booleanValue2 = PressInteractionKt.a(kVar2, aVar, i13).getValue().booleanValue();
                aVar.S();
                if (booleanValue2) {
                    aVar.C(-736260122);
                    if (toggleableState == ToggleableState.On) {
                        o13 = t1.o(t1.f15974b.a(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        o13 = t1.o(dk.a.f54291a.a(aVar, 6).e().j(aVar, 0), 0.16f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    aVar.S();
                    t1Var = t1.g(o13);
                } else {
                    aVar.C(-736259869);
                    boolean booleanValue3 = FocusInteractionKt.a(kVar2, aVar, i13).getValue().booleanValue();
                    aVar.S();
                    if (booleanValue3) {
                        aVar.C(-736259860);
                        if (toggleableState == ToggleableState.On) {
                            o12 = t1.o(t1.f15974b.a(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            o12 = t1.o(dk.a.f54291a.a(aVar, 6).e().j(aVar, 0), 0.16f, 0.0f, 0.0f, 0.0f, 14, null);
                        }
                        aVar.S();
                        t1Var = t1.g(o12);
                    } else {
                        aVar.C(-736259607);
                        boolean booleanValue4 = DragInteractionKt.a(kVar2, aVar, i13).getValue().booleanValue();
                        aVar.S();
                        if (booleanValue4) {
                            aVar.C(-736259598);
                            if (toggleableState == ToggleableState.On) {
                                o11 = t1.o(t1.f15974b.a(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null);
                            } else {
                                o11 = t1.o(dk.a.f54291a.a(aVar, 6).e().j(aVar, 0), 0.16f, 0.0f, 0.0f, 0.0f, 14, null);
                            }
                            aVar.S();
                            t1Var = t1.g(o11);
                        }
                    }
                }
            }
            if (t1Var != null) {
                j12 = v1.f(t1Var.y(), j12);
            }
            if (c.I()) {
                c.T();
            }
            aVar.S();
            return j12;
        }
        if (c.I()) {
            c.T();
        }
        aVar.S();
        return j12;
    }

    @Override // wj.a
    public n1<t1> a(boolean z11, ToggleableState state, k interactionSource, androidx.compose.runtime.a aVar, int i11) {
        long j11;
        o.i(state, "state");
        o.i(interactionSource, "interactionSource");
        aVar.C(1029112672);
        if (c.I()) {
            c.U(1029112672, i11, -1, "com.forsale.designSystem.checkboxes.DefaultCheckboxColors.backgroundColor (Checkboxes.kt:148)");
        }
        if (!z11) {
            j11 = this.f41248d;
        } else if (state == ToggleableState.On) {
            j11 = this.f41245a;
        } else {
            j11 = this.f41246b;
        }
        n1<t1> o11 = z.o(t1.g(d(j11, state, interactionSource, aVar, (i11 & 112) | (i11 & 896) | (i11 & 7168), 0)), aVar, 0);
        if (c.I()) {
            c.T();
        }
        aVar.S();
        return o11;
    }

    @Override // wj.a
    public n1<t1> b(boolean z11, ToggleableState state, k interactionSource, androidx.compose.runtime.a aVar, int i11) {
        long j11;
        o.i(state, "state");
        o.i(interactionSource, "interactionSource");
        aVar.C(2030215330);
        if (c.I()) {
            c.U(2030215330, i11, -1, "com.forsale.designSystem.checkboxes.DefaultCheckboxColors.borderColor (Checkboxes.kt:164)");
        }
        if (!z11) {
            j11 = this.f41248d;
        } else if (state == ToggleableState.On) {
            j11 = this.f41245a;
        } else {
            j11 = this.f41250f;
        }
        n1<t1> o11 = z.o(t1.g(d(j11, state, interactionSource, aVar, (i11 & 112) | (i11 & 896) | (i11 & 7168), 0)), aVar, 0);
        if (c.I()) {
            c.T();
        }
        aVar.S();
        return o11;
    }

    @Override // wj.a
    public n1<t1> c(boolean z11, androidx.compose.runtime.a aVar, int i11) {
        long j11;
        aVar.C(-856442247);
        if (c.I()) {
            c.U(-856442247, i11, -1, "com.forsale.designSystem.checkboxes.DefaultCheckboxColors.checkmarkColor (Checkboxes.kt:179)");
        }
        if (z11) {
            j11 = this.f41247c;
        } else {
            j11 = this.f41249e;
        }
        n1<t1> o11 = z.o(t1.g(j11), aVar, 0);
        if (c.I()) {
            c.T();
        }
        aVar.S();
        return o11;
    }

    private b(long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f41245a = j11;
        this.f41246b = j12;
        this.f41247c = j13;
        this.f41248d = j14;
        this.f41249e = j15;
        this.f41250f = j16;
    }
}
