package com.forsale.ui.components;

import androidx.compose.runtime.a;
import androidx.compose.ui.text.c;
import androidx.compose.ui.text.u;
import androidx.recyclerview.widget.RecyclerView;
import j0.d1;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.http2.Http2;
import wz.p;
/* compiled from: SpanText.kt */
/* loaded from: classes3.dex */
public final class SpanTextKt {
    public static final void a(c.a BuildSpanText, String title, String query, long j11, long j12, a aVar, int i11) {
        int i12;
        boolean L;
        int l11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        o.i(BuildSpanText, "$this$BuildSpanText");
        o.i(title, "title");
        o.i(query, "query");
        a h11 = aVar.h(-1248792238);
        if ((i11 & 14) == 0) {
            if (h11.T(BuildSpanText)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.T(title)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        if ((i11 & 896) == 0) {
            if (h11.T(query)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i11 & 7168) == 0) {
            if (h11.e(j11)) {
                i14 = RecyclerView.l.FLAG_MOVED;
            } else {
                i14 = 1024;
            }
            i12 |= i14;
        }
        if ((57344 & i11) == 0) {
            if (h11.e(j12)) {
                i13 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i13 = 8192;
            }
            i12 |= i13;
        }
        if ((i12 & 46811) == 9362 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1248792238, i11, -1, "com.forsale.ui.components.BuildSpanText (SpanText.kt:20)");
            }
            L = StringsKt__StringsKt.L(title, query, true);
            if (!L) {
                l11 = BuildSpanText.l(new u(j11, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                try {
                    BuildSpanText.h(title);
                    p pVar = p.f75480a;
                } finally {
                }
            } else {
                l11 = BuildSpanText.l(new u(j11, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                try {
                    BuildSpanText.h(c(title, query));
                    p pVar2 = p.f75480a;
                    BuildSpanText.j(l11);
                    l11 = BuildSpanText.l(new u(j12, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                    try {
                        BuildSpanText.h(b(title, query));
                        BuildSpanText.j(l11);
                        l11 = BuildSpanText.l(new u(j11, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                        try {
                            BuildSpanText.h(d(title, query));
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l12 = h11.l();
        if (l12 != null) {
            l12.a(new SpanTextKt$BuildSpanText$5(BuildSpanText, title, query, j11, j12, i11));
        }
    }

    private static final String b(String str, String str2) {
        String v02;
        v02 = StringsKt__StringsKt.v0(str, c(str, str2), d(str, str2));
        return v02;
    }

    private static final String c(String str, String str2) {
        int a02;
        a02 = StringsKt__StringsKt.a0(str, str2, 0, true, 2, null);
        if (a02 != -1) {
            String substring = str.substring(0, a02);
            o.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    private static final String d(String str, String str2) {
        int a02;
        a02 = StringsKt__StringsKt.a0(str, str2, 0, true, 2, null);
        if (a02 != -1) {
            String substring = str.substring(a02 + str2.length(), str.length());
            o.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }
}
