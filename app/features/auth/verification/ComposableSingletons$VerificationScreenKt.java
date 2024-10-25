package com.forsale.app.features.auth.verification;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import com.forsale.designSystem.TextKt;
import e2.h;
import g00.p;
import g00.q;
import kotlin.jvm.internal.o;
import p1.g;
import r0.b;
import t9.y0;
import w.t;
/* compiled from: VerificationScreen.kt */
/* loaded from: classes2.dex */
public final class ComposableSingletons$VerificationScreenKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposableSingletons$VerificationScreenKt f22928a = new ComposableSingletons$VerificationScreenKt();

    /* renamed from: b  reason: collision with root package name */
    public static p<a, Integer, wz.p> f22929b = b.c(-844622079, false, new p<a, Integer, wz.p>() { // from class: com.forsale.app.features.auth.verification.ComposableSingletons$VerificationScreenKt$lambda-1$1
        public final void b(a aVar, int i11) {
            if ((i11 & 11) == 2 && aVar.i()) {
                aVar.L();
                return;
            }
            if (c.I()) {
                c.U(-844622079, i11, -1, "com.forsale.app.features.auth.verification.ComposableSingletons$VerificationScreenKt.lambda-1.<anonymous> (VerificationScreen.kt:235)");
            }
            TextKt.a("xxxxx", PaddingKt.m(androidx.compose.ui.c.f7566a, h.l(2), 0.0f, 0.0f, 0.0f, 14, null), 0, 0, false, 0, 0, null, null, 0L, 0, aVar, 54, 0, 2044);
            if (c.I()) {
                c.T();
            }
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
            b(aVar, num.intValue());
            return wz.p.f75480a;
        }
    });

    /* renamed from: c  reason: collision with root package name */
    public static q<t, a, Integer, wz.p> f22930c = b.c(2009110256, false, new q<t, a, Integer, wz.p>() { // from class: com.forsale.app.features.auth.verification.ComposableSingletons$VerificationScreenKt$lambda-2$1
        public final void b(t PrimaryButton, a aVar, int i11) {
            o.i(PrimaryButton, "$this$PrimaryButton");
            if ((i11 & 81) == 16 && aVar.i()) {
                aVar.L();
                return;
            }
            if (c.I()) {
                c.U(2009110256, i11, -1, "com.forsale.app.features.auth.verification.ComposableSingletons$VerificationScreenKt.lambda-2.<anonymous> (VerificationScreen.kt:253)");
            }
            TextKt.a(g.b(y0.Te, aVar, 0), null, 0, 0, false, 0, 0, null, dk.a.f54291a.c(aVar, dk.a.f54292b).e(), 0L, 0, aVar, 0, 0, 1790);
            if (c.I()) {
                c.T();
            }
        }

        @Override // g00.q
        public /* bridge */ /* synthetic */ wz.p invoke(t tVar, a aVar, Integer num) {
            b(tVar, aVar, num.intValue());
            return wz.p.f75480a;
        }
    });

    public final p<a, Integer, wz.p> a() {
        return f22929b;
    }

    public final q<t, a, Integer, wz.p> b() {
        return f22930c;
    }
}
