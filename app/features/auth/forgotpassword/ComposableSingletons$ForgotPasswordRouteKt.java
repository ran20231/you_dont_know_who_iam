package com.forsale.app.features.auth.forgotpassword;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import com.forsale.designSystem.TextKt;
import g00.q;
import kotlin.jvm.internal.o;
import p1.g;
import r0.b;
import t9.y0;
import w.t;
import wz.p;
/* compiled from: ForgotPasswordRoute.kt */
/* loaded from: classes2.dex */
public final class ComposableSingletons$ForgotPasswordRouteKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposableSingletons$ForgotPasswordRouteKt f22625a = new ComposableSingletons$ForgotPasswordRouteKt();

    /* renamed from: b  reason: collision with root package name */
    public static q<t, a, Integer, p> f22626b = b.c(1439416768, false, new q<t, a, Integer, p>() { // from class: com.forsale.app.features.auth.forgotpassword.ComposableSingletons$ForgotPasswordRouteKt$lambda-1$1
        public final void b(t PrimaryButton, a aVar, int i11) {
            o.i(PrimaryButton, "$this$PrimaryButton");
            if ((i11 & 81) == 16 && aVar.i()) {
                aVar.L();
                return;
            }
            if (c.I()) {
                c.U(1439416768, i11, -1, "com.forsale.app.features.auth.forgotpassword.ComposableSingletons$ForgotPasswordRouteKt.lambda-1.<anonymous> (ForgotPasswordRoute.kt:98)");
            }
            TextKt.a(g.b(y0.f70786za, aVar, 0), null, 0, 0, false, 0, 0, null, dk.a.f54291a.c(aVar, dk.a.f54292b).e(), 0L, 0, aVar, 0, 0, 1790);
            if (c.I()) {
                c.T();
            }
        }

        @Override // g00.q
        public /* bridge */ /* synthetic */ p invoke(t tVar, a aVar, Integer num) {
            b(tVar, aVar, num.intValue());
            return p.f75480a;
        }
    });

    public final q<t, a, Integer, p> a() {
        return f22626b;
    }
}
