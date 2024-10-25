package com.forsale.app.features.categories.listingdetails.buyerscreen.views;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.ui.graphics.painter.Painter;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.iconography.IconKt;
import e2.h;
import g00.q;
import kotlin.jvm.internal.o;
import p1.e;
import p1.g;
import r0.b;
import t9.q0;
import t9.y0;
import w.t;
import wz.p;
import yj.d;
/* compiled from: MediaSection.kt */
/* loaded from: classes2.dex */
public final class ComposableSingletons$MediaSectionKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposableSingletons$MediaSectionKt f26881a = new ComposableSingletons$MediaSectionKt();

    /* renamed from: b  reason: collision with root package name */
    public static q<t, a, Integer, p> f26882b = b.c(1682857578, false, new q<t, a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.ComposableSingletons$MediaSectionKt$lambda-1$1
        public final void b(t FilledButton, a aVar, int i11) {
            o.i(FilledButton, "$this$FilledButton");
            if ((i11 & 81) == 16 && aVar.i()) {
                aVar.L();
                return;
            }
            if (c.I()) {
                c.U(1682857578, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.ComposableSingletons$MediaSectionKt.lambda-1.<anonymous> (MediaSection.kt:220)");
            }
            Painter d11 = e.d(q0.f69727a1, aVar, 0);
            dk.a aVar2 = dk.a.f54291a;
            int i12 = dk.a.f54292b;
            d e11 = aVar2.a(aVar, i12).e();
            int i13 = d.f76453b;
            float f11 = 16;
            IconKt.a(d11, SizeKt.u(SizeKt.i(androidx.compose.ui.c.f7566a, h.l(f11)), h.l(f11)), null, e11.m(aVar, i13), false, 0.0f, aVar, 56, 52);
            TextKt.a(g.b(y0.f70547l1, aVar, 0), null, 0, 0, false, 0, 0, null, null, aVar2.a(aVar, i12).g().d(aVar, i13), 0, aVar, 0, 0, 1534);
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
    public static q<t, a, Integer, p> f26883c = b.c(-871473310, false, new q<t, a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.ComposableSingletons$MediaSectionKt$lambda-2$1
        public final void b(t FilledButton, a aVar, int i11) {
            o.i(FilledButton, "$this$FilledButton");
            if ((i11 & 81) == 16 && aVar.i()) {
                aVar.L();
                return;
            }
            if (c.I()) {
                c.U(-871473310, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.ComposableSingletons$MediaSectionKt.lambda-2.<anonymous> (MediaSection.kt:244)");
            }
            Painter d11 = e.d(q0.N, aVar, 0);
            dk.a aVar2 = dk.a.f54291a;
            int i12 = dk.a.f54292b;
            d e11 = aVar2.a(aVar, i12).e();
            int i13 = d.f76453b;
            float f11 = 16;
            IconKt.a(d11, SizeKt.u(SizeKt.i(androidx.compose.ui.c.f7566a, h.l(f11)), h.l(f11)), null, e11.m(aVar, i13), false, 0.0f, aVar, 56, 52);
            TextKt.a(g.b(y0.f70361a1, aVar, 0), null, 0, 0, false, 0, 0, null, null, aVar2.a(aVar, i12).e().m(aVar, i13), 0, aVar, 0, 0, 1534);
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
        return f26882b;
    }

    public final q<t, a, Integer, p> b() {
        return f26883c;
    }
}
