package com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import e2.h;
import g00.l;
import j0.d1;
import j0.n1;
import j0.v0;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: CommonViews.kt */
/* loaded from: classes2.dex */
public final class CommonViewsKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final g00.l<? super androidx.compose.foundation.lazy.LazyListScope, wz.p> r19, int r20, final g00.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r21, final g00.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r22, g00.q<? super w.t, ? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r23, final g00.l<? super java.lang.Integer, wz.p> r24, androidx.compose.runtime.a r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CommonViewsKt.a(g00.l, int, g00.p, g00.p, g00.q, g00.l, androidx.compose.runtime.a, int, int):void");
    }

    private static final Integer b(n1<Integer> n1Var) {
        return n1Var.getValue();
    }

    public static final void c(final l<? super LazyListScope, p> listings, final LazyListState scrollState, a aVar, final int i11) {
        int i12;
        int i13;
        int i14;
        o.i(listings, "listings");
        o.i(scrollState, "scrollState");
        a h11 = aVar.h(-1726889828);
        if ((i11 & 14) == 0) {
            if (h11.F(listings)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.T(scrollState)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && h11.i()) {
            h11.L();
        } else {
            if (c.I()) {
                c.U(-1726889828, i12, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.ListingsList (CommonViews.kt:61)");
            }
            androidx.compose.ui.c m11 = PaddingKt.m(androidx.compose.ui.c.f7566a, 0.0f, h.l(8), 0.0f, 0.0f, 13, null);
            Arrangement.f o11 = Arrangement.f3698a.o(h.l(12));
            w.o c11 = PaddingKt.c(h.l(16), 0.0f, 2, null);
            h11.C(1157296644);
            boolean T = h11.T(listings);
            Object D = h11.D();
            if (T || D == a.f7182a.a()) {
                D = new l<LazyListScope, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CommonViewsKt$ListingsList$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void b(LazyListScope LazyRow) {
                        o.i(LazyRow, "$this$LazyRow");
                        listings.invoke(LazyRow);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(LazyListScope lazyListScope) {
                        b(lazyListScope);
                        return p.f75480a;
                    }
                };
                h11.u(D);
            }
            h11.S();
            LazyDslKt.b(m11, scrollState, c11, false, o11, null, null, false, (l) D, h11, (i12 & 112) | 24966, 232);
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CommonViewsKt$ListingsList$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar2, int i15) {
                    CommonViewsKt.c(listings, scrollState, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }
}
