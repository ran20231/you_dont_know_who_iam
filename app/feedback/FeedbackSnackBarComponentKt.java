package com.forsale.app.feedback;

import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.ui.c;
import com.forsale.ui.components.notificationsystem.snackbar.SnackbarHostKt;
import com.forsale.ui.components.notificationsystem.snackbar.SnackbarHostState;
import j0.d1;
import j0.u;
import j0.v0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* compiled from: FeedbackSnackBarComponent.kt */
/* loaded from: classes2.dex */
public final class FeedbackSnackBarComponentKt {
    public static final void a(final c cVar, final SharedFlow<lf.a> feedBackState, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        o.i(feedBackState, "feedBackState");
        androidx.compose.runtime.a h11 = aVar.h(-1071564341);
        if ((i12 & 1) != 0) {
            cVar = c.f7566a;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1071564341, i11, -1, "com.forsale.app.feedback.FeedbackSnackBarComponent (FeedbackSnackBarComponent.kt:38)");
        }
        h11.C(-492369756);
        Object D = h11.D();
        a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
        if (D == c0064a.a()) {
            D = new SnackbarHostState();
            h11.u(D);
        }
        h11.S();
        SnackbarHostState snackbarHostState = (SnackbarHostState) D;
        h11.C(773894976);
        h11.C(-492369756);
        Object D2 = h11.D();
        if (D2 == c0064a.a()) {
            f fVar = new f(u.j(EmptyCoroutineContext.f61739a, h11));
            h11.u(fVar);
            D2 = fVar;
        }
        h11.S();
        CoroutineScope a11 = ((f) D2).a();
        h11.S();
        u.d(p.f75480a, new FeedbackSnackBarComponentKt$FeedbackSnackBarComponent$1(a11, feedBackState, snackbarHostState, null), h11, 70);
        SnackbarHostKt.a(snackbarHostState, c.f7566a.k(cVar), h11, 6, 0);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.feedback.FeedbackSnackBarComponentKt$FeedbackSnackBarComponent$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i13) {
                    FeedbackSnackBarComponentKt.a(c.this, feedBackState, aVar2, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void b(c cVar, final lf.a feedBackState, final g00.a<p> onClearFeedBack, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        o.i(feedBackState, "feedBackState");
        o.i(onClearFeedBack, "onClearFeedBack");
        androidx.compose.runtime.a h11 = aVar.h(2043290672);
        int i17 = i12 & 1;
        if (i17 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (h11.T(cVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (h11.T(feedBackState)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 896) == 0) {
            if (h11.F(onClearFeedBack)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i13 |= i16;
        }
        if ((i13 & 731) == 146 && h11.i()) {
            h11.L();
        } else {
            if (i17 != 0) {
                cVar = c.f7566a;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(2043290672, i11, -1, "com.forsale.app.feedback.FeedbackSnackBarComponent (FeedbackSnackBarComponent.kt:84)");
            }
            h11.C(-492369756);
            Object D = h11.D();
            a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
            if (D == c0064a.a()) {
                D = new SnackbarHostState();
                h11.u(D);
            }
            h11.S();
            SnackbarHostState snackbarHostState = (SnackbarHostState) D;
            h11.C(773894976);
            h11.C(-492369756);
            Object D2 = h11.D();
            if (D2 == c0064a.a()) {
                f fVar = new f(u.j(EmptyCoroutineContext.f61739a, h11));
                h11.u(fVar);
                D2 = fVar;
            }
            h11.S();
            CoroutineScope a11 = ((f) D2).a();
            h11.S();
            u.d(p.f75480a, new FeedbackSnackBarComponentKt$FeedbackSnackBarComponent$3(a11, feedBackState, snackbarHostState, onClearFeedBack, null), h11, 70);
            SnackbarHostKt.a(snackbarHostState, c.f7566a.k(cVar), h11, 6, 0);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        final c cVar2 = cVar;
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.feedback.FeedbackSnackBarComponentKt$FeedbackSnackBarComponent$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i18) {
                    FeedbackSnackBarComponentKt.b(c.this, feedBackState, onClearFeedBack, aVar2, v0.a(i11 | 1), i12);
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
