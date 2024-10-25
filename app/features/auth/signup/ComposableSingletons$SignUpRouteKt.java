package com.forsale.app.features.auth.signup;

import androidx.compose.runtime.c;
import com.forsale.designSystem.TextKt;
import g00.q;
import kotlin.jvm.internal.o;
import p1.g;
import t9.y0;
import w.t;
import wz.p;
/* compiled from: SignUpRoute.kt */
/* loaded from: classes2.dex */
public final class ComposableSingletons$SignUpRouteKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposableSingletons$SignUpRouteKt f22815a = new ComposableSingletons$SignUpRouteKt();

    /* renamed from: b  reason: collision with root package name */
    public static q<t, androidx.compose.runtime.a, Integer, p> f22816b = r0.b.c(-1910565771, false, new q<t, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.signup.ComposableSingletons$SignUpRouteKt$lambda-1$1
        public final void b(t PrimaryButton, androidx.compose.runtime.a aVar, int i11) {
            o.i(PrimaryButton, "$this$PrimaryButton");
            if ((i11 & 81) == 16 && aVar.i()) {
                aVar.L();
                return;
            }
            if (c.I()) {
                c.U(-1910565771, i11, -1, "com.forsale.app.features.auth.signup.ComposableSingletons$SignUpRouteKt.lambda-1.<anonymous> (SignUpRoute.kt:157)");
            }
            TextKt.a(g.b(y0.f70529k0, aVar, 0), null, 0, 0, false, 0, 0, null, dk.a.f54291a.c(aVar, dk.a.f54292b).e(), 0L, 0, aVar, 0, 0, 1790);
            if (c.I()) {
                c.T();
            }
        }

        @Override // g00.q
        public /* bridge */ /* synthetic */ p invoke(t tVar, androidx.compose.runtime.a aVar, Integer num) {
            b(tVar, aVar, num.intValue());
            return p.f75480a;
        }
    });

    public final q<t, androidx.compose.runtime.a, Integer, p> a() {
        return f22816b;
    }
}
