package com.forsale.app.features.welcome.loading;

import androidx.compose.foundation.layout.SizeKt;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.designSystem.buttons.ButtonsKt;
import g00.q;
import j0.d1;
import j0.v0;
import kotlin.jvm.internal.o;
import okhttp3.internal.http2.Http2;
import wz.p;
/* compiled from: AppStatusUi.kt */
/* loaded from: classes2.dex */
public final class AppStatusUiKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final int r42, final int r43, java.lang.Integer r44, java.lang.Integer r45, final g00.q<? super w.e, ? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r46, androidx.compose.runtime.a r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 1140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.welcome.loading.AppStatusUiKt.a(int, int, java.lang.Integer, java.lang.Integer, g00.q, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final g00.a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar3;
        int i13;
        androidx.compose.runtime.a h11 = aVar2.h(1753572126);
        if ((i11 & 14) == 0) {
            if (h11.F(aVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && h11.i()) {
            h11.L();
            aVar3 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1753572126, i12, -1, "com.forsale.app.features.welcome.loading.ContactUsButton (AppStatusUi.kt:139)");
            }
            aVar3 = h11;
            ButtonsKt.h(aVar, SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), null, false, null, null, null, null, null, null, ComposableSingletons$AppStatusUiKt.f37177a.b(), h11, (i12 & 14) | 48, 6, 1020);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar3.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.welcome.loading.AppStatusUiKt$ContactUsButton$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i14) {
                    AppStatusUiKt.b(aVar, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void c(final int i11, final int i12, final int i13, final g00.a<p> onUpdateClicked, androidx.compose.runtime.a aVar, final int i14) {
        final int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        o.i(onUpdateClicked, "onUpdateClicked");
        androidx.compose.runtime.a h11 = aVar.h(1247065649);
        if ((i14 & 14) == 0) {
            if (h11.d(i11)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i15 = i19 | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 112) == 0) {
            if (h11.d(i12)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i15 |= i18;
        }
        if ((i14 & 896) == 0) {
            if (h11.d(i13)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i15 |= i17;
        }
        if ((i14 & 7168) == 0) {
            if (h11.F(onUpdateClicked)) {
                i16 = RecyclerView.l.FLAG_MOVED;
            } else {
                i16 = 1024;
            }
            i15 |= i16;
        }
        if ((i15 & 5851) == 1170 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1247065649, i15, -1, "com.forsale.app.features.welcome.loading.ForceUpdateStatusUi (AppStatusUi.kt:66)");
            }
            a(i11, i12, Integer.valueOf(i13), null, r0.b.b(h11, -621671591, true, new q<w.e, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.welcome.loading.AppStatusUiKt$ForceUpdateStatusUi$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void b(w.e AppStatusUi, androidx.compose.runtime.a aVar2, int i21) {
                    o.i(AppStatusUi, "$this$AppStatusUi");
                    if ((i21 & 81) == 16 && aVar2.i()) {
                        aVar2.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-621671591, i21, -1, "com.forsale.app.features.welcome.loading.ForceUpdateStatusUi.<anonymous> (AppStatusUi.kt:68)");
                    }
                    ButtonsKt.d(onUpdateClicked, SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), null, null, null, null, null, false, null, null, ComposableSingletons$AppStatusUiKt.f37177a.a(), aVar2, ((i15 >> 9) & 14) | 48, 6, 1020);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(w.e eVar, androidx.compose.runtime.a aVar2, Integer num) {
                    b(eVar, aVar2, num.intValue());
                    return p.f75480a;
                }
            }), h11, (i15 & 14) | 24576 | (i15 & 112) | (i15 & 896), 8);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.welcome.loading.AppStatusUiKt$ForceUpdateStatusUi$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i21) {
                    AppStatusUiKt.c(i11, i12, i13, onUpdateClicked, aVar2, v0.a(i14 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void d(final int i11, final int i12, final int i13, final boolean z11, final g00.a<p> onRefreshClick, final g00.a<p> onContactUsClicked, androidx.compose.runtime.a aVar, final int i14) {
        final int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        o.i(onRefreshClick, "onRefreshClick");
        o.i(onContactUsClicked, "onContactUsClicked");
        androidx.compose.runtime.a h11 = aVar.h(1607406593);
        if ((i14 & 14) == 0) {
            if (h11.d(i11)) {
                i22 = 4;
            } else {
                i22 = 2;
            }
            i15 = i22 | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 112) == 0) {
            if (h11.d(i12)) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            i15 |= i21;
        }
        if ((i14 & 896) == 0) {
            if (h11.d(i13)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i15 |= i19;
        }
        if ((i14 & 7168) == 0) {
            if (h11.a(z11)) {
                i18 = RecyclerView.l.FLAG_MOVED;
            } else {
                i18 = 1024;
            }
            i15 |= i18;
        }
        if ((57344 & i14) == 0) {
            if (h11.F(onRefreshClick)) {
                i17 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i17 = 8192;
            }
            i15 |= i17;
        }
        if ((458752 & i14) == 0) {
            if (h11.F(onContactUsClicked)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i15 |= i16;
        }
        if ((374491 & i15) == 74898 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1607406593, i15, -1, "com.forsale.app.features.welcome.loading.NoInternetConnectionStatusUi (AppStatusUi.kt:38)");
            }
            a(i11, i12, null, Integer.valueOf(i13), r0.b.b(h11, 1563280857, true, new q<w.e, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.welcome.loading.AppStatusUiKt$NoInternetConnectionStatusUi$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void b(w.e AppStatusUi, androidx.compose.runtime.a aVar2, int i23) {
                    o.i(AppStatusUi, "$this$AppStatusUi");
                    if ((i23 & 81) == 16 && aVar2.i()) {
                        aVar2.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(1563280857, i23, -1, "com.forsale.app.features.welcome.loading.NoInternetConnectionStatusUi.<anonymous> (AppStatusUi.kt:40)");
                    }
                    AppStatusUiKt.e(onRefreshClick, aVar2, (i15 >> 12) & 14);
                    if (z11) {
                        AppStatusUiKt.b(onContactUsClicked, aVar2, (i15 >> 15) & 14);
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(w.e eVar, androidx.compose.runtime.a aVar2, Integer num) {
                    b(eVar, aVar2, num.intValue());
                    return p.f75480a;
                }
            }), h11, (i15 & 14) | 24576 | (i15 & 112) | ((i15 << 3) & 7168), 4);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.welcome.loading.AppStatusUiKt$NoInternetConnectionStatusUi$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i23) {
                    AppStatusUiKt.d(i11, i12, i13, z11, onRefreshClick, onContactUsClicked, aVar2, v0.a(i14 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final g00.a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar3;
        int i13;
        androidx.compose.runtime.a h11 = aVar2.h(806803419);
        if ((i11 & 14) == 0) {
            if (h11.F(aVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && h11.i()) {
            h11.L();
            aVar3 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(806803419, i12, -1, "com.forsale.app.features.welcome.loading.RefreshButton (AppStatusUi.kt:151)");
            }
            aVar3 = h11;
            ButtonsKt.d(aVar, SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), null, null, null, null, null, false, null, null, ComposableSingletons$AppStatusUiKt.f37177a.c(), h11, (i12 & 14) | 48, 6, 1020);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar3.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.welcome.loading.AppStatusUiKt$RefreshButton$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i14) {
                    AppStatusUiKt.e(aVar, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void f(final int i11, final int i12, final int i13, final g00.a<p> onRefreshClick, final g00.a<p> onContactUsClicked, androidx.compose.runtime.a aVar, final int i14) {
        final int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        o.i(onRefreshClick, "onRefreshClick");
        o.i(onContactUsClicked, "onContactUsClicked");
        androidx.compose.runtime.a h11 = aVar.h(-1876199968);
        if ((i14 & 14) == 0) {
            if (h11.d(i11)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i15 = i21 | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 112) == 0) {
            if (h11.d(i12)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i15 |= i19;
        }
        if ((i14 & 896) == 0) {
            if (h11.d(i13)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i15 |= i18;
        }
        if ((i14 & 7168) == 0) {
            if (h11.F(onRefreshClick)) {
                i17 = RecyclerView.l.FLAG_MOVED;
            } else {
                i17 = 1024;
            }
            i15 |= i17;
        }
        if ((57344 & i14) == 0) {
            if (h11.F(onContactUsClicked)) {
                i16 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i16 = 8192;
            }
            i15 |= i16;
        }
        if ((46811 & i15) == 9362 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1876199968, i15, -1, "com.forsale.app.features.welcome.loading.UnderMaintenanceStatusUi (AppStatusUi.kt:54)");
            }
            a(i11, i12, null, Integer.valueOf(i13), r0.b.b(h11, -1083954248, true, new q<w.e, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.welcome.loading.AppStatusUiKt$UnderMaintenanceStatusUi$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void b(w.e AppStatusUi, androidx.compose.runtime.a aVar2, int i22) {
                    o.i(AppStatusUi, "$this$AppStatusUi");
                    if ((i22 & 81) == 16 && aVar2.i()) {
                        aVar2.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-1083954248, i22, -1, "com.forsale.app.features.welcome.loading.UnderMaintenanceStatusUi.<anonymous> (AppStatusUi.kt:56)");
                    }
                    AppStatusUiKt.e(onRefreshClick, aVar2, (i15 >> 9) & 14);
                    AppStatusUiKt.b(onContactUsClicked, aVar2, (i15 >> 12) & 14);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(w.e eVar, androidx.compose.runtime.a aVar2, Integer num) {
                    b(eVar, aVar2, num.intValue());
                    return p.f75480a;
                }
            }), h11, (i15 & 14) | 24576 | (i15 & 112) | ((i15 << 3) & 7168), 4);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.welcome.loading.AppStatusUiKt$UnderMaintenanceStatusUi$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i22) {
                    AppStatusUiKt.f(i11, i12, i13, onRefreshClick, onContactUsClicked, aVar2, v0.a(i14 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }
}
