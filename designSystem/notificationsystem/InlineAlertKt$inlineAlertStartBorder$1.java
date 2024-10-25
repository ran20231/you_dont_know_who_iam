package com.forsale.designSystem.notificationsystem;

import androidx.compose.ui.c;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import b1.t1;
import e2.d;
import g00.l;
import g00.q;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InlineAlert.kt */
/* loaded from: classes3.dex */
public final class InlineAlertKt$inlineAlertStartBorder$1 extends Lambda implements q<c, androidx.compose.runtime.a, Integer, c> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LayoutDirection f41947a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f41948b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f41949c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineAlertKt$inlineAlertStartBorder$1(LayoutDirection layoutDirection, long j11, float f11) {
        super(3);
        this.f41947a = layoutDirection;
        this.f41948b = j11;
        this.f41949c = f11;
    }

    public final c b(c composed, androidx.compose.runtime.a aVar, int i11) {
        o.i(composed, "$this$composed");
        aVar.C(500419232);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(500419232, i11, -1, "com.forsale.designSystem.notificationsystem.inlineAlertStartBorder.<anonymous> (InlineAlert.kt:159)");
        }
        float m12 = ((d) aVar.q(CompositionLocalsKt.e())).m1(this.f41949c) * 2;
        c.a aVar2 = c.f7566a;
        LayoutDirection layoutDirection = this.f41947a;
        t1 g11 = t1.g(this.f41948b);
        Float valueOf = Float.valueOf(m12);
        LayoutDirection layoutDirection2 = this.f41947a;
        long j11 = this.f41948b;
        aVar.C(1618982084);
        boolean T = aVar.T(layoutDirection) | aVar.T(g11) | aVar.T(valueOf);
        Object D = aVar.D();
        if (T || D == androidx.compose.runtime.a.f7182a.a()) {
            D = new InlineAlertKt$inlineAlertStartBorder$1$1$1(layoutDirection2, j11, m12);
            aVar.u(D);
        }
        aVar.S();
        c b11 = androidx.compose.ui.draw.a.b(aVar2, (l) D);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        aVar.S();
        return b11;
    }

    @Override // g00.q
    public /* bridge */ /* synthetic */ c invoke(c cVar, androidx.compose.runtime.a aVar, Integer num) {
        return b(cVar, aVar, num.intValue());
    }
}
