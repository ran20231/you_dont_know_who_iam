package com.forsale.app.features.categories.home.propertyhome;

import com.forsale.designSystem.TextKt;
import g00.q;
import kotlin.jvm.internal.o;
import p1.g;
import t9.y0;
import w.t;
import wz.p;
/* compiled from: ForSaleRealty.kt */
/* loaded from: classes2.dex */
public final class ComposableSingletons$ForSaleRealtyKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposableSingletons$ForSaleRealtyKt f24528a = new ComposableSingletons$ForSaleRealtyKt();

    /* renamed from: b  reason: collision with root package name */
    public static q<t, androidx.compose.runtime.a, Integer, p> f24529b = r0.b.c(145980833, false, new q<t, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.propertyhome.ComposableSingletons$ForSaleRealtyKt$lambda-1$1
        public final void b(t Tag, androidx.compose.runtime.a aVar, int i11) {
            o.i(Tag, "$this$Tag");
            if ((i11 & 81) == 16 && aVar.i()) {
                aVar.L();
                return;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(145980833, i11, -1, "com.forsale.app.features.categories.home.propertyhome.ComposableSingletons$ForSaleRealtyKt.lambda-1.<anonymous> (ForSaleRealty.kt:110)");
            }
            TextKt.a(g.b(y0.f70635q4, aVar, 0), null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar, 0, 0, 2046);
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

    public final q<t, androidx.compose.runtime.a, Integer, p> a() {
        return f24529b;
    }
}