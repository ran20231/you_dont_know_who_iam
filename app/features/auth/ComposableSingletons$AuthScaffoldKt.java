package com.forsale.app.features.auth;

import com.forsale.designSystem.TextKt;
import g00.p;
import g00.q;
import kotlin.jvm.internal.o;
import t9.y0;
import w.t;
/* compiled from: AuthScaffold.kt */
/* loaded from: classes2.dex */
public final class ComposableSingletons$AuthScaffoldKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposableSingletons$AuthScaffoldKt f22600a = new ComposableSingletons$AuthScaffoldKt();

    /* renamed from: b  reason: collision with root package name */
    public static p<androidx.compose.runtime.a, Integer, wz.p> f22601b = r0.b.c(1398963525, false, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.auth.ComposableSingletons$AuthScaffoldKt$lambda-1$1
        public final void b(androidx.compose.runtime.a aVar, int i11) {
            if ((i11 & 11) == 2 && aVar.i()) {
                aVar.L();
                return;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1398963525, i11, -1, "com.forsale.app.features.auth.ComposableSingletons$AuthScaffoldKt.lambda-1.<anonymous> (AuthScaffold.kt:137)");
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
            b(aVar, num.intValue());
            return wz.p.f75480a;
        }
    });

    /* renamed from: c  reason: collision with root package name */
    public static q<t, androidx.compose.runtime.a, Integer, wz.p> f22602c = r0.b.c(1696910304, false, new q<t, androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.auth.ComposableSingletons$AuthScaffoldKt$lambda-2$1
        public final void b(t TextButton, androidx.compose.runtime.a aVar, int i11) {
            o.i(TextButton, "$this$TextButton");
            if ((i11 & 81) == 16 && aVar.i()) {
                aVar.L();
                return;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1696910304, i11, -1, "com.forsale.app.features.auth.ComposableSingletons$AuthScaffoldKt.lambda-2.<anonymous> (AuthScaffold.kt:359)");
            }
            TextKt.a(p1.g.b(y0.f70496i0, aVar, 0), null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar, 0, 0, 2046);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }

        @Override // g00.q
        public /* bridge */ /* synthetic */ wz.p invoke(t tVar, androidx.compose.runtime.a aVar, Integer num) {
            b(tVar, aVar, num.intValue());
            return wz.p.f75480a;
        }
    });

    public final p<androidx.compose.runtime.a, Integer, wz.p> a() {
        return f22601b;
    }

    public final q<t, androidx.compose.runtime.a, Integer, wz.p> b() {
        return f22602c;
    }
}
