package com.forsale.app.ui.dialogs;

import androidx.compose.material.e;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import b1.t1;
import c0.g;
import e2.h;
import j0.d1;
import j0.v0;
import wz.p;
/* compiled from: LoadingDialog.kt */
/* loaded from: classes3.dex */
public final class LoadingDialogKt {
    public static final void a(a aVar, final int i11) {
        a h11 = aVar.h(-1257230925);
        if (i11 == 0 && h11.i()) {
            h11.L();
        } else {
            if (c.I()) {
                c.U(-1257230925, i11, -1, "com.forsale.app.ui.dialogs.LoadingDialog (LoadingDialog.kt:28)");
            }
            AndroidDialog_androidKt.a(new g00.a<p>() { // from class: com.forsale.app.ui.dialogs.LoadingDialogKt$LoadingDialog$1
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ p invoke() {
                    invoke2();
                    return p.f75480a;
                }
            }, null, ComposableSingletons$LoadingDialogKt.f39318a.a(), h11, 390, 2);
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.ui.dialogs.LoadingDialogKt$LoadingDialog$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar2, int i12) {
                    LoadingDialogKt.a(aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void b(a aVar, final int i11) {
        a h11 = aVar.h(802670389);
        if (i11 == 0 && h11.i()) {
            h11.L();
        } else {
            if (c.I()) {
                c.U(802670389, i11, -1, "com.forsale.app.ui.dialogs.ProgressIndicator (LoadingDialog.kt:38)");
            }
            e.a(null, g.c(h.l(8)), t1.f15974b.f(), 0L, null, 0.0f, ComposableSingletons$LoadingDialogKt.f39318a.b(), h11, 1573248, 57);
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.ui.dialogs.LoadingDialogKt$ProgressIndicator$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar2, int i12) {
                    LoadingDialogKt.b(aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final /* synthetic */ void c(a aVar, int i11) {
        b(aVar, i11);
    }
}
