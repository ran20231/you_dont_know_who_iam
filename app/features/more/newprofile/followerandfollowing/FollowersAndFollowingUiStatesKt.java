package com.forsale.app.features.more.newprofile.followerandfollowing;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.c;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.features.categories.user.profile.UserProfileData;
import com.forsale.app.features.more.newprofile.followerandfollowing.a;
import com.forsale.app.features.more.newprofile.followerandfollowing.itemui.CTAsState;
import com.forsale.app.features.more.newprofile.followerandfollowing.itemui.FollowerAndFollowingItemUiKt;
import com.forsale.ui.components.StateKt;
import e2.h;
import g00.l;
import g00.p;
import j0.d1;
import j0.k0;
import j0.v0;
import kotlin.jvm.internal.o;
import p1.e;
import p1.g;
import t9.q0;
import t9.y0;
/* compiled from: FollowersAndFollowingUiStates.kt */
/* loaded from: classes2.dex */
public final class FollowersAndFollowingUiStatesKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final int i11, androidx.compose.runtime.a aVar, final int i12) {
        int i13;
        int i14;
        androidx.compose.runtime.a h11 = aVar.h(2074421717);
        if ((i12 & 14) == 0) {
            if (h11.d(i11)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && h11.i()) {
            h11.L();
        } else {
            if (c.I()) {
                c.U(2074421717, i13, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.EmptyState (FollowersAndFollowingUiStates.kt:54)");
            }
            StateKt.c(PaddingKt.i(androidx.compose.ui.c.f7566a, h.l(40)), e.d(q0.A, h11, 0), g.b(i11, h11, i13 & 14), "", null, null, h11, 3142, 48);
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingUiStatesKt$EmptyState$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i15) {
                    FollowersAndFollowingUiStatesKt.a(i11, aVar2, v0.a(i12 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    public static final void b(final a intention, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        int i13;
        o.i(intention, "intention");
        androidx.compose.runtime.a h11 = aVar.h(778517339);
        if ((i11 & 14) == 0) {
            if (h11.T(intention)) {
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
                c.U(778517339, i11, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.FollowingEmptyState (FollowersAndFollowingUiStates.kt:42)");
            }
            if (intention instanceof a.b) {
                h11.C(-590229644);
                a(y0.A3, h11, 0);
                h11.S();
            } else if (intention instanceof a.C0354a) {
                h11.C(-590229508);
                a(y0.f70763y3, h11, 0);
                h11.S();
            } else {
                h11.C(-590229433);
                h11.S();
            }
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingUiStatesKt$FollowingEmptyState$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i14) {
                    FollowersAndFollowingUiStatesKt.b(a.this, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    public static final void c(androidx.compose.ui.c cVar, final boolean z11, final g00.a<wz.p> retry, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        o.i(retry, "retry");
        androidx.compose.runtime.a h11 = aVar.h(-435486509);
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
                c.U(-435486509, i13, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.FollowingErrorState (FollowersAndFollowingUiStates.kt:28)");
            }
            if (z11) {
                h11.C(1360552579);
                h11.C(1157296644);
                boolean T = h11.T(retry);
                Object D = h11.D();
                if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                    D = new g00.a<wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingUiStatesKt$FollowingErrorState$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // g00.a
                        public /* bridge */ /* synthetic */ wz.p invoke() {
                            invoke2();
                            return wz.p.f75480a;
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
                h11.C(1360552666);
                h11.C(1157296644);
                boolean T2 = h11.T(retry);
                Object D2 = h11.D();
                if (T2 || D2 == androidx.compose.runtime.a.f7182a.a()) {
                    D2 = new g00.a<wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingUiStatesKt$FollowingErrorState$2$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // g00.a
                        public /* bridge */ /* synthetic */ wz.p invoke() {
                            invoke2();
                            return wz.p.f75480a;
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
                h11.C(1360552772);
                h11.S();
            }
            if (c.I()) {
                c.T();
            }
        }
        final androidx.compose.ui.c cVar2 = cVar;
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingUiStatesKt$FollowingErrorState$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i18) {
                    FollowersAndFollowingUiStatesKt.c(androidx.compose.ui.c.this, z11, retry, aVar2, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    public static final void d(final yd.a user, final p<? super String, ? super k0<CTAsState>, wz.p> onFollowCTAClick, final l<? super UserProfileData, wz.p> onUserItemClick, final boolean z11, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        o.i(user, "user");
        o.i(onFollowCTAClick, "onFollowCTAClick");
        o.i(onUserItemClick, "onUserItemClick");
        androidx.compose.runtime.a h11 = aVar.h(-14112334);
        if ((i11 & 14) == 0) {
            if (h11.T(user)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(onFollowCTAClick)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i11 & 896) == 0) {
            if (h11.F(onUserItemClick)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 7168) == 0) {
            if (h11.a(z11)) {
                i13 = RecyclerView.l.FLAG_MOVED;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 5851) == 1170 && h11.i()) {
            h11.L();
        } else {
            if (c.I()) {
                c.U(-14112334, i12, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.FollowingItem (FollowersAndFollowingUiStates.kt:74)");
            }
            FollowerAndFollowingItemUiKt.a(user, onFollowCTAClick, onUserItemClick, z11, h11, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168));
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingUiStatesKt$FollowingItem$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i17) {
                    FollowersAndFollowingUiStatesKt.d(yd.a.this, onFollowCTAClick, onUserItemClick, z11, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    public static final void e(androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(1306753839);
        if (i11 == 0 && h11.i()) {
            h11.L();
        } else {
            if (c.I()) {
                c.U(1306753839, i11, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.FollowingLoadingShimmerState (FollowersAndFollowingUiStates.kt:64)");
            }
            FollowerAndFollowingItemShimmerKt.b(true, h11, 6, 0);
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingUiStatesKt$FollowingLoadingShimmerState$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    FollowersAndFollowingUiStatesKt.e(aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }
}
