package com.forsale.app.features.categories.home;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.iconography.IconKt;
import g00.q;
import kotlin.jvm.internal.o;
import p1.e;
import p1.g;
import r0.b;
import t9.y0;
import w.t;
import wz.p;
import yj.d;
/* compiled from: ContinueBrowsingUi.kt */
/* loaded from: classes2.dex */
public final class ComposableSingletons$ContinueBrowsingUiKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposableSingletons$ContinueBrowsingUiKt f23313a = new ComposableSingletons$ContinueBrowsingUiKt();

    /* renamed from: b  reason: collision with root package name */
    public static q<t, a, Integer, p> f23314b = b.c(1709941221, false, new q<t, a, Integer, p>() { // from class: com.forsale.app.features.categories.home.ComposableSingletons$ContinueBrowsingUiKt$lambda-1$1
        public final void b(t ListItem, a aVar, int i11) {
            o.i(ListItem, "$this$ListItem");
            if ((i11 & 81) == 16 && aVar.i()) {
                aVar.L();
                return;
            }
            if (c.I()) {
                c.U(1709941221, i11, -1, "com.forsale.app.features.categories.home.ComposableSingletons$ContinueBrowsingUiKt.lambda-1.<anonymous> (ContinueBrowsingUi.kt:54)");
            }
            String b11 = g.b(y0.Z1, aVar, 0);
            dk.a aVar2 = dk.a.f54291a;
            int i12 = dk.a.f54292b;
            TextKt.a(b11, null, 0, 0, false, 0, 0, null, aVar2.c(aVar, i12).c(), aVar2.a(aVar, i12).e().m(aVar, d.f76453b), 0, aVar, 0, 0, 1278);
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

    /* renamed from: c  reason: collision with root package name */
    public static q<w.c, a, Integer, p> f23315c = b.c(-506420583, false, new q<w.c, a, Integer, p>() { // from class: com.forsale.app.features.categories.home.ComposableSingletons$ContinueBrowsingUiKt$lambda-2$1
        public final void b(w.c ListItem, a aVar, int i11) {
            o.i(ListItem, "$this$ListItem");
            if ((i11 & 81) == 16 && aVar.i()) {
                aVar.L();
                return;
            }
            if (c.I()) {
                c.U(-506420583, i11, -1, "com.forsale.app.features.categories.home.ComposableSingletons$ContinueBrowsingUiKt.lambda-2.<anonymous> (ContinueBrowsingUi.kt:72)");
            }
            IconKt.a(e.d(sj.d.f68676m, aVar, 0), null, null, dk.a.f54291a.a(aVar, dk.a.f54292b).f().i(aVar, d.f76453b), false, 0.0f, aVar, 8, 54);
            if (c.I()) {
                c.T();
            }
        }

        @Override // g00.q
        public /* bridge */ /* synthetic */ p invoke(w.c cVar, a aVar, Integer num) {
            b(cVar, aVar, num.intValue());
            return p.f75480a;
        }
    });

    public final q<t, a, Integer, p> a() {
        return f23314b;
    }

    public final q<w.c, a, Integer, p> b() {
        return f23315c;
    }
}
