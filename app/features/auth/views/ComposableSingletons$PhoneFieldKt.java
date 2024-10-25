package com.forsale.app.features.auth.views;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import com.forsale.designSystem.TextKt;
import e2.h;
import g00.p;
import r0.b;
/* compiled from: PhoneField.kt */
/* loaded from: classes2.dex */
public final class ComposableSingletons$PhoneFieldKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposableSingletons$PhoneFieldKt f23138a = new ComposableSingletons$PhoneFieldKt();

    /* renamed from: b  reason: collision with root package name */
    public static p<a, Integer, wz.p> f23139b = b.c(1212263864, false, new p<a, Integer, wz.p>() { // from class: com.forsale.app.features.auth.views.ComposableSingletons$PhoneFieldKt$lambda-1$1
        public final void b(a aVar, int i11) {
            if ((i11 & 11) == 2 && aVar.i()) {
                aVar.L();
                return;
            }
            if (c.I()) {
                c.U(1212263864, i11, -1, "com.forsale.app.features.auth.views.ComposableSingletons$PhoneFieldKt.lambda-1.<anonymous> (PhoneField.kt:72)");
            }
            TextKt.a("xxxxxxx", PaddingKt.m(androidx.compose.ui.c.f7566a, h.l(2), 0.0f, 0.0f, 0.0f, 14, null), 0, 0, false, 0, 0, null, null, 0L, 0, aVar, 54, 0, 2044);
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

    public final p<a, Integer, wz.p> a() {
        return f23139b;
    }
}
