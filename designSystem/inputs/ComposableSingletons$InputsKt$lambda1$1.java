package com.forsale.designSystem.inputs;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.c;
import e2.h;
import g00.p;
import kotlin.jvm.internal.Lambda;
/* compiled from: Inputs.kt */
/* renamed from: com.forsale.designSystem.inputs.ComposableSingletons$InputsKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$InputsKt$lambda1$1 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposableSingletons$InputsKt$lambda1$1 f41356a = new ComposableSingletons$InputsKt$lambda1$1();

    ComposableSingletons$InputsKt$lambda1$1() {
        super(2);
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(-963547039, i11, -1, "com.forsale.designSystem.inputs.ComposableSingletons$InputsKt.lambda-1.<anonymous> (Inputs.kt:848)");
        }
        SpacerKt.a(SizeKt.u(androidx.compose.ui.c.f7566a, h.l(34)), aVar, 6);
        if (c.I()) {
            c.T();
        }
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
