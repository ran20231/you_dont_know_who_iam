package com.forsale.ui.components;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import com.forsale.designSystem.TextKt;
import g00.q;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import p1.g;
import w.t;
import wz.p;
import yj.d;
/* compiled from: SearchToolbar.kt */
/* renamed from: com.forsale.ui.components.ComposableSingletons$SearchToolbarKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$SearchToolbarKt$lambda1$1 extends Lambda implements q<t, a, Integer, p> {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposableSingletons$SearchToolbarKt$lambda1$1 f42292a = new ComposableSingletons$SearchToolbarKt$lambda1$1();

    ComposableSingletons$SearchToolbarKt$lambda1$1() {
        super(3);
    }

    public final void b(t TextButton, a aVar, int i11) {
        o.i(TextButton, "$this$TextButton");
        if ((i11 & 81) == 16 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(377371196, i11, -1, "com.forsale.ui.components.ComposableSingletons$SearchToolbarKt.lambda-1.<anonymous> (SearchToolbar.kt:74)");
        }
        TextKt.a(g.b(gk.c.f56935a, aVar, 0), null, 0, 0, false, 0, 0, null, null, dk.a.f54291a.a(aVar, dk.a.f54292b).e().m(aVar, d.f76453b), 0, aVar, 0, 0, 1534);
        if (c.I()) {
            c.T();
        }
    }

    @Override // g00.q
    public /* bridge */ /* synthetic */ p invoke(t tVar, a aVar, Integer num) {
        b(tVar, aVar, num.intValue());
        return p.f75480a;
    }
}
