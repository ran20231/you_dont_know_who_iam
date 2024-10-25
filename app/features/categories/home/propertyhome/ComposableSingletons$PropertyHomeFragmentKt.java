package com.forsale.app.features.categories.home.propertyhome;

import com.forsale.designSystem.TextKt;
import g00.q;
import kotlin.jvm.internal.o;
import p1.g;
import t9.y0;
import w.t;
import wz.p;
/* compiled from: PropertyHomeFragment.kt */
/* loaded from: classes2.dex */
public final class ComposableSingletons$PropertyHomeFragmentKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposableSingletons$PropertyHomeFragmentKt f24531a = new ComposableSingletons$PropertyHomeFragmentKt();

    /* renamed from: b  reason: collision with root package name */
    public static q<x.a, androidx.compose.runtime.a, Integer, p> f24532b = r0.b.c(908896129, false, new q<x.a, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.ComposableSingletons$PropertyHomeFragmentKt$lambda-1$1
        public final void b(x.a item, androidx.compose.runtime.a aVar, int i11) {
            o.i(item, "$this$item");
            if ((i11 & 81) == 16 && aVar.i()) {
                aVar.L();
                return;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(908896129, i11, -1, "com.forsale.app.features.categories.home.propertyhome.ComposableSingletons$PropertyHomeFragmentKt.lambda-1.<anonymous> (PropertyHomeFragment.kt:131)");
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }

        @Override // g00.q
        public /* bridge */ /* synthetic */ p invoke(x.a aVar, androidx.compose.runtime.a aVar2, Integer num) {
            b(aVar, aVar2, num.intValue());
            return p.f75480a;
        }
    });

    /* renamed from: c  reason: collision with root package name */
    public static q<t, androidx.compose.runtime.a, Integer, p> f24533c = r0.b.c(76730807, false, new q<t, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.ComposableSingletons$PropertyHomeFragmentKt$lambda-2$1
        public final void b(t GhostButton, androidx.compose.runtime.a aVar, int i11) {
            o.i(GhostButton, "$this$GhostButton");
            if ((i11 & 81) == 16 && aVar.i()) {
                aVar.L();
                return;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(76730807, i11, -1, "com.forsale.app.features.categories.home.propertyhome.ComposableSingletons$PropertyHomeFragmentKt.lambda-2.<anonymous> (PropertyHomeFragment.kt:149)");
            }
            TextKt.a(g.b(y0.f70678se, aVar, 0), null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar, 0, 0, 2046);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }

        @Override // g00.q
        public /* bridge */ /* synthetic */ p invoke(t tVar, androidx.compose.runtime.a aVar, Integer num) {
            b(tVar, aVar, num.intValue());
            return p.f75480a;
        }
    });

    public final q<x.a, androidx.compose.runtime.a, Integer, p> a() {
        return f24532b;
    }

    public final q<t, androidx.compose.runtime.a, Integer, p> b() {
        return f24533c;
    }
}
