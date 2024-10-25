package com.forsale.designSystem.buttons;

import androidx.compose.foundation.interaction.HoverInteractionKt;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.runtime.z;
import b1.t1;
import j0.n1;
import kotlin.jvm.internal.o;
import v.i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ButtonColors.kt */
/* loaded from: classes3.dex */
public final class b implements a {

    /* renamed from: b  reason: collision with root package name */
    private final yj.c f41197b;

    /* renamed from: c  reason: collision with root package name */
    private final yj.c f41198c;

    /* renamed from: d  reason: collision with root package name */
    private final yj.c f41199d;

    /* renamed from: e  reason: collision with root package name */
    private final yj.c f41200e;

    public b(yj.c cVar, yj.c hover, yj.c pressed, yj.c disabled) {
        o.i(cVar, "default");
        o.i(hover, "hover");
        o.i(pressed, "pressed");
        o.i(disabled, "disabled");
        this.f41197b = cVar;
        this.f41198c = hover;
        this.f41199d = pressed;
        this.f41200e = disabled;
    }

    private final yj.c c(boolean z11, i iVar, androidx.compose.runtime.a aVar, int i11) {
        yj.c cVar;
        aVar.C(1251613661);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1251613661, i11, -1, "com.forsale.designSystem.buttons.ButtonColorsImpl.switchDuoColors (ButtonColors.kt:217)");
        }
        if (!z11) {
            cVar = this.f41200e;
        } else {
            aVar.C(801481417);
            int i12 = (i11 >> 3) & 14;
            boolean booleanValue = HoverInteractionKt.a(iVar, aVar, i12).getValue().booleanValue();
            aVar.S();
            if (booleanValue) {
                cVar = this.f41198c;
            } else {
                aVar.C(801481484);
                boolean booleanValue2 = PressInteractionKt.a(iVar, aVar, i12).getValue().booleanValue();
                aVar.S();
                if (booleanValue2) {
                    cVar = this.f41199d;
                } else {
                    cVar = this.f41197b;
                }
            }
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        aVar.S();
        return cVar;
    }

    @Override // com.forsale.designSystem.buttons.a
    public n1<t1> a(boolean z11, i interactionSource, androidx.compose.runtime.a aVar, int i11) {
        o.i(interactionSource, "interactionSource");
        aVar.C(1637027325);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1637027325, i11, -1, "com.forsale.designSystem.buttons.ButtonColorsImpl.contentColor (ButtonColors.kt:206)");
        }
        n1<t1> o11 = z.o(t1.g(c(z11, interactionSource, aVar, (i11 & 896) | (i11 & 14) | (i11 & 112)).b()), aVar, 0);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        aVar.S();
        return o11;
    }

    @Override // com.forsale.designSystem.buttons.a
    public n1<t1> b(boolean z11, i interactionSource, androidx.compose.runtime.a aVar, int i11) {
        o.i(interactionSource, "interactionSource");
        aVar.C(-308734130);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-308734130, i11, -1, "com.forsale.designSystem.buttons.ButtonColorsImpl.backgroundColor (ButtonColors.kt:195)");
        }
        n1<t1> o11 = z.o(t1.g(c(z11, interactionSource, aVar, (i11 & 896) | (i11 & 14) | (i11 & 112)).a()), aVar, 0);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        aVar.S();
        return o11;
    }
}
