package com.forsale.app.features.search;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.dividers.DividersKt;
import t9.y0;
/* compiled from: MatchedCategories.kt */
/* loaded from: classes2.dex */
public final class ComposableSingletons$MatchedCategoriesKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposableSingletons$MatchedCategoriesKt f36471a = new ComposableSingletons$MatchedCategoriesKt();

    /* renamed from: b  reason: collision with root package name */
    public static g00.q<q.c, androidx.compose.runtime.a, Integer, wz.p> f36472b = r0.b.c(1325776411, false, new g00.q<q.c, androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.ComposableSingletons$MatchedCategoriesKt$lambda-1$1
        public final void b(q.c SearchComponentAnimatedVisibility, androidx.compose.runtime.a aVar, int i11) {
            kotlin.jvm.internal.o.i(SearchComponentAnimatedVisibility, "$this$SearchComponentAnimatedVisibility");
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1325776411, i11, -1, "com.forsale.app.features.search.ComposableSingletons$MatchedCategoriesKt.lambda-1.<anonymous> (MatchedCategories.kt:41)");
            }
            DividersKt.a(SizeKt.i(PaddingKt.m(androidx.compose.ui.c.f7566a, 0.0f, e2.h.l(16), 0.0f, 0.0f, 13, null), e2.h.l(8)), 0.0f, dk.a.f54291a.a(aVar, dk.a.f54292b).e().h(aVar, yj.d.f76453b), aVar, 6, 2);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }

        @Override // g00.q
        public /* bridge */ /* synthetic */ wz.p invoke(q.c cVar, androidx.compose.runtime.a aVar, Integer num) {
            b(cVar, aVar, num.intValue());
            return wz.p.f75480a;
        }
    });

    /* renamed from: c  reason: collision with root package name */
    public static g00.p<androidx.compose.runtime.a, Integer, wz.p> f36473c = r0.b.c(-1059042352, false, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.ComposableSingletons$MatchedCategoriesKt$lambda-2$1
        public final void b(androidx.compose.runtime.a aVar, int i11) {
            if ((i11 & 11) == 2 && aVar.i()) {
                aVar.L();
                return;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1059042352, i11, -1, "com.forsale.app.features.search.ComposableSingletons$MatchedCategoriesKt.lambda-2.<anonymous> (MatchedCategories.kt:56)");
            }
            String b11 = p1.g.b(y0.f70662re, aVar, 0);
            dk.a aVar2 = dk.a.f54291a;
            int i12 = dk.a.f54292b;
            TextKt.a(b11, null, 0, 0, false, 0, 0, null, aVar2.c(aVar, i12).r(), aVar2.a(aVar, i12).e().j(aVar, yj.d.f76453b), 0, aVar, 0, 0, 1278);
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

    public final g00.q<q.c, androidx.compose.runtime.a, Integer, wz.p> a() {
        return f36472b;
    }

    public final g00.p<androidx.compose.runtime.a, Integer, wz.p> b() {
        return f36473c;
    }
}
