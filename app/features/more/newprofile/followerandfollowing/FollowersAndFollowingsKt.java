package com.forsale.app.features.more.newprofile.followerandfollowing;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.c0;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.paging.compose.LazyPagingItems;
import androidx.recyclerview.widget.RecyclerView;
import b1.t1;
import com.forsale.app.features.categories.listings.paging.b;
import com.forsale.app.features.categories.user.profile.UserProfileData;
import com.forsale.app.features.more.newprofile.followerandfollowing.a;
import com.forsale.app.features.more.newprofile.followerandfollowing.itemui.CTAsState;
import e2.h;
import g00.l;
import g00.p;
import g00.q;
import g00.r;
import j0.d;
import j0.d1;
import j0.e;
import j0.e1;
import j0.k;
import j0.k0;
import j0.v0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o;
import r0.b;
import v0.b;
/* compiled from: FollowersAndFollowings.kt */
/* loaded from: classes2.dex */
public final class FollowersAndFollowingsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final LazyPagingItems<yd.a> lazyPagingItems, final k0<Boolean> k0Var, final p<? super String, ? super k0<CTAsState>, wz.p> pVar, final l<? super UserProfileData, wz.p> lVar, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        androidx.compose.runtime.a h11 = aVar.h(2125592907);
        if ((i11 & 14) == 0) {
            if (h11.T(lazyPagingItems)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.T(k0Var)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i11 & 896) == 0) {
            if (h11.F(pVar)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 7168) == 0) {
            if (h11.F(lVar)) {
                i13 = RecyclerView.l.FLAG_MOVED;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        final int i17 = i12;
        if ((i17 & 5851) == 1170 && h11.i()) {
            h11.L();
        } else {
            if (c.I()) {
                c.U(2125592907, i17, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.ContentState (FollowersAndFollowings.kt:178)");
            }
            LazyDslKt.a(null, LazyListStateKt.c(0, 0, h11, 0, 3), null, false, null, null, null, false, new l<LazyListScope, wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsKt$ContentState$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void b(LazyListScope LazyColumn) {
                    o.i(LazyColumn, "$this$LazyColumn");
                    int g11 = lazyPagingItems.g();
                    final LazyPagingItems<yd.a> lazyPagingItems2 = lazyPagingItems;
                    final k0<Boolean> k0Var2 = k0Var;
                    final p<String, k0<CTAsState>, wz.p> pVar2 = pVar;
                    final l<UserProfileData, wz.p> lVar2 = lVar;
                    final int i18 = i17;
                    LazyListScope.e(LazyColumn, g11, null, null, b.c(1239378152, true, new r<x.a, Integer, androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsKt$ContentState$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(4);
                        }

                        public final void b(x.a items, int i19, androidx.compose.runtime.a aVar2, int i21) {
                            int i22;
                            boolean z11;
                            boolean z12;
                            int i23;
                            o.i(items, "$this$items");
                            if ((i21 & 112) == 0) {
                                if (aVar2.d(i19)) {
                                    i23 = 32;
                                } else {
                                    i23 = 16;
                                }
                                i22 = i23 | i21;
                            } else {
                                i22 = i21;
                            }
                            if ((i22 & 721) == 144 && aVar2.i()) {
                                aVar2.L();
                                return;
                            }
                            if (c.I()) {
                                c.U(1239378152, i21, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.ContentState.<anonymous>.<anonymous> (FollowersAndFollowings.kt:183)");
                            }
                            yd.a f11 = lazyPagingItems2.f(i19);
                            k0<Boolean> k0Var3 = k0Var2;
                            if (i19 == lazyPagingItems2.g() - 1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            k0Var3.setValue(Boolean.valueOf(z11));
                            if (f11 != null) {
                                p<String, k0<CTAsState>, wz.p> pVar3 = pVar2;
                                l<UserProfileData, wz.p> lVar3 = lVar2;
                                LazyPagingItems<yd.a> lazyPagingItems3 = lazyPagingItems2;
                                int i24 = i18;
                                if (i19 != lazyPagingItems3.g() - 1) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                int i25 = i24 >> 3;
                                FollowersAndFollowingUiStatesKt.d(f11, pVar3, lVar3, z12, aVar2, (i25 & 112) | (i25 & 896));
                            }
                            if (c.I()) {
                                c.T();
                            }
                        }

                        @Override // g00.r
                        public /* bridge */ /* synthetic */ wz.p d(x.a aVar2, Integer num, androidx.compose.runtime.a aVar3, Integer num2) {
                            b(aVar2, num.intValue(), aVar3, num2.intValue());
                            return wz.p.f75480a;
                        }
                    }), 6, null);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(LazyListScope lazyListScope) {
                    b(lazyListScope);
                    return wz.p.f75480a;
                }
            }, h11, 0, 253);
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsKt$ContentState$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i18) {
                    FollowersAndFollowingsKt.a(lazyPagingItems, k0Var, pVar, lVar, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0356  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel r22, androidx.compose.runtime.a r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsKt.b(com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsViewModel, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final a aVar, final g00.a<wz.p> aVar2, final l<? super UserProfileData, wz.p> lVar, final p<? super String, ? super k0<CTAsState>, wz.p> pVar, androidx.compose.runtime.a aVar3, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar4;
        int i13;
        int i14;
        int i15;
        int i16;
        androidx.compose.runtime.a h11 = aVar3.h(1956453628);
        if ((i11 & 14) == 0) {
            if (h11.T(aVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(aVar2)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i11 & 896) == 0) {
            if (h11.F(lVar)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 7168) == 0) {
            if (h11.F(pVar)) {
                i13 = RecyclerView.l.FLAG_MOVED;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 5851) == 1170 && h11.i()) {
            h11.L();
            aVar4 = h11;
        } else {
            if (c.I()) {
                c.U(1956453628, i12, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.FollowingTab (FollowersAndFollowings.kt:96)");
            }
            h11.C(-492369756);
            Object D = h11.D();
            a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
            if (D == c0064a.a()) {
                D = c0.e(Boolean.FALSE, null, 2, null);
                h11.u(D);
            }
            h11.S();
            k0 k0Var = (k0) D;
            h11.C(-492369756);
            Object D2 = h11.D();
            if (D2 == c0064a.a()) {
                D2 = c0.e(Boolean.FALSE, null, 2, null);
                h11.u(D2);
            }
            h11.S();
            k0 k0Var2 = (k0) D2;
            int i17 = (i12 & 14) | 48;
            int i18 = i12 << 3;
            e(aVar, k0Var2, aVar2, h11, (i18 & 896) | i17);
            d(aVar, k0Var, pVar, lVar, h11, i17 | ((i12 >> 3) & 896) | (i18 & 7168));
            h11.C(733328855);
            c.a aVar5 = androidx.compose.ui.c.f7566a;
            b.a aVar6 = v0.b.f74009a;
            a0 g11 = BoxKt.g(aVar6.o(), false, h11, 0);
            h11.C(-1323940314);
            int a11 = e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a12 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(aVar5);
            if (!(h11.k() instanceof d)) {
                e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a12);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a13 = Updater.a(h11);
            Updater.c(a13, g11, companion.e());
            Updater.c(a13, s11, companion.g());
            p<ComposeUiNode, Integer, wz.p> b11 = companion.b();
            if (a13.f() || !o.d(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.p(Integer.valueOf(a11), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
            h11.C(-388197434);
            if (((Boolean) k0Var2.getValue()).booleanValue() && !((Boolean) k0Var.getValue()).booleanValue()) {
                long a14 = t1.f15974b.a();
                androidx.compose.ui.c i19 = PaddingKt.i(boxScopeInstance.e(aVar5, aVar6.b()), h.l(16));
                aVar4 = h11;
                ProgressIndicatorKt.a(i19, a14, 0.0f, 0L, 0, aVar4, 48, 28);
            } else {
                aVar4 = h11;
            }
            aVar4.S();
            aVar4.S();
            aVar4.w();
            aVar4.S();
            aVar4.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar4.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsKt$FollowingTab$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar7, int i21) {
                    FollowersAndFollowingsKt.c(a.this, aVar2, lVar, pVar, aVar7, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar7, Integer num) {
                    b(aVar7, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final a aVar, final k0<Boolean> k0Var, final p<? super String, ? super k0<CTAsState>, wz.p> pVar, final l<? super UserProfileData, wz.p> lVar, androidx.compose.runtime.a aVar2, final int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        androidx.compose.runtime.a h11 = aVar2.h(-1495357410);
        if ((i11 & 14) == 0) {
            if (h11.T(aVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.T(k0Var)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i11 & 896) == 0) {
            if (h11.F(pVar)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 7168) == 0) {
            if (h11.F(lVar)) {
                i13 = RecyclerView.l.FLAG_MOVED;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 5851) == 1170 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1495357410, i12, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.ScreenContent (FollowersAndFollowings.kt:160)");
            }
            if (aVar instanceof a.C0354a) {
                h11.C(-1364852003);
                a(((a.C0354a) aVar).a(), k0Var, pVar, lVar, h11, LazyPagingItems.f14078h | (i12 & 112) | (i12 & 896) | (i12 & 7168));
                h11.S();
            } else if (aVar instanceof a.b) {
                h11.C(-1364851842);
                a(((a.b) aVar).a(), k0Var, pVar, lVar, h11, LazyPagingItems.f14078h | (i12 & 112) | (i12 & 896) | (i12 & 7168));
                h11.S();
            } else {
                h11.C(-1364851730);
                h11.S();
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsKt$ScreenContent$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i17) {
                    FollowersAndFollowingsKt.d(a.this, k0Var, pVar, lVar, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final a aVar, final k0<Boolean> k0Var, final g00.a<wz.p> aVar2, androidx.compose.runtime.a aVar3, final int i11) {
        int i12;
        LazyPagingItems<yd.a> a11;
        int i13;
        int i14;
        int i15;
        androidx.compose.runtime.a h11 = aVar3.h(1678774967);
        if ((i11 & 14) == 0) {
            if (h11.T(aVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.T(k0Var)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 896) == 0) {
            if (h11.F(aVar2)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1678774967, i12, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.ScreenState (FollowersAndFollowings.kt:121)");
            }
            if (aVar instanceof a.b) {
                a11 = ((a.b) aVar).a();
            } else if (aVar instanceof a.C0354a) {
                a11 = ((a.C0354a) aVar).a();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            com.forsale.app.features.categories.listings.paging.b b11 = com.forsale.app.features.categories.listings.paging.a.b(a11);
            if (b11 instanceof b.d) {
                h11.C(-897776263);
                FollowersAndFollowingUiStatesKt.e(h11, 0);
                h11.S();
            } else if (b11 instanceof b.C0337b) {
                h11.C(-897776175);
                androidx.compose.ui.c i16 = PaddingKt.i(androidx.compose.ui.c.f7566a, h.l(40));
                boolean a12 = ((b.C0337b) b11).a();
                h11.C(1157296644);
                boolean T = h11.T(aVar2);
                Object D = h11.D();
                if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                    D = new g00.a<wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsKt$ScreenState$1$1
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
                            aVar2.invoke();
                        }
                    };
                    h11.u(D);
                }
                h11.S();
                FollowersAndFollowingUiStatesKt.c(i16, a12, (g00.a) D, h11, 6, 0);
                h11.S();
            } else if (b11 instanceof b.a) {
                h11.C(-897775884);
                FollowersAndFollowingUiStatesKt.b(aVar, h11, i12 & 14);
                h11.S();
            } else if (b11 instanceof hd.a) {
                h11.C(-897775767);
                h11.S();
                k0Var.setValue(Boolean.TRUE);
            } else {
                h11.C(-897775703);
                h11.S();
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.FollowersAndFollowingsKt$ScreenState$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i17) {
                    FollowersAndFollowingsKt.e(a.this, k0Var, aVar2, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }
}
