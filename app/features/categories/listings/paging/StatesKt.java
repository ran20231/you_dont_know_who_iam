package com.forsale.app.features.categories.listings.paging;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.e;
import androidx.compose.runtime.c;
import b1.t1;
import c0.g;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.ui.components.StateKt;
import e2.h;
import j0.d1;
import j0.v0;
import kotlin.jvm.internal.o;
import t9.y0;
import wz.p;
/* compiled from: States.kt */
/* loaded from: classes2.dex */
public final class StatesKt {
    public static final void a(final ListingsTypes listingsType, final g00.a<p> goBack, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        int i13;
        int i14;
        o.i(listingsType, "listingsType");
        o.i(goBack, "goBack");
        androidx.compose.runtime.a h11 = aVar.h(932803955);
        if ((i11 & 14) == 0) {
            if (h11.T(listingsType)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(goBack)) {
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
                c.U(932803955, i12, -1, "com.forsale.app.features.categories.listings.paging.ListingsEmptyState (States.kt:31)");
            }
            StateKt.b(PaddingKt.i(androidx.compose.ui.c.f7566a, h.l(40)), yb.b.c(listingsType), yb.b.a(listingsType), yb.b.b(listingsType), y0.f70623p9, goBack, h11, ((i12 << 12) & 458752) | 6, 0);
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.paging.StatesKt$ListingsEmptyState$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i15) {
                    StatesKt.a(ListingsTypes.this, goBack, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void b(androidx.compose.ui.c cVar, final boolean z11, final g00.a<p> retry, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        o.i(retry, "retry");
        androidx.compose.runtime.a h11 = aVar.h(-1877942203);
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
            if (h11.a(z11)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 896) == 0) {
            if (h11.F(retry)) {
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
                cVar = androidx.compose.ui.c.f7566a;
            }
            if (c.I()) {
                c.U(-1877942203, i13, -1, "com.forsale.app.features.categories.listings.paging.ListingsErrorState (States.kt:47)");
            }
            if (z11) {
                h11.C(-1082174557);
                h11.C(1157296644);
                boolean T = h11.T(retry);
                Object D = h11.D();
                if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                    D = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.paging.StatesKt$ListingsErrorState$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // g00.a
                        public /* bridge */ /* synthetic */ p invoke() {
                            invoke2();
                            return p.f75480a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            retry.invoke();
                        }
                    };
                    h11.u(D);
                }
                h11.S();
                StateKt.a(null, 0, 0, 0, (g00.a) D, h11, 0, 15);
                h11.S();
            } else if (!z11) {
                h11.C(-1082174470);
                h11.C(1157296644);
                boolean T2 = h11.T(retry);
                Object D2 = h11.D();
                if (T2 || D2 == androidx.compose.runtime.a.f7182a.a()) {
                    D2 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.paging.StatesKt$ListingsErrorState$2$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // g00.a
                        public /* bridge */ /* synthetic */ p invoke() {
                            invoke2();
                            return p.f75480a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            retry.invoke();
                        }
                    };
                    h11.u(D2);
                }
                h11.S();
                StateKt.b(cVar, null, 0, 0, 0, (g00.a) D2, h11, i13 & 14, 30);
                h11.S();
            } else {
                h11.C(-1082174364);
                h11.S();
            }
            if (c.I()) {
                c.T();
            }
        }
        final androidx.compose.ui.c cVar2 = cVar;
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.paging.StatesKt$ListingsErrorState$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i18) {
                    StatesKt.b(androidx.compose.ui.c.this, z11, retry, aVar2, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void c(final androidx.compose.ui.c modifier, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        int i13;
        o.i(modifier, "modifier");
        androidx.compose.runtime.a h11 = aVar.h(1344988751);
        if ((i11 & 14) == 0) {
            if (h11.T(modifier)) {
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
        } else {
            if (c.I()) {
                c.U(1344988751, i12, -1, "com.forsale.app.features.categories.listings.paging.ProgressIndicator (States.kt:61)");
            }
            e.a(modifier, g.f(), t1.f15974b.f(), 0L, null, 0.0f, ComposableSingletons$StatesKt.f30903a.a(), h11, (i12 & 14) | 1573248, 56);
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.paging.StatesKt$ProgressIndicator$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i14) {
                    StatesKt.c(androidx.compose.ui.c.this, aVar2, v0.a(i11 | 1));
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
