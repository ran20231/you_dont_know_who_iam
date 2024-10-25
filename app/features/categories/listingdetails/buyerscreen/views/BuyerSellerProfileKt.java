package com.forsale.app.features.categories.listingdetails.buyerscreen.views;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import b1.t1;
import com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel;
import com.forsale.app.features.categories.listingdetails.buyerscreen.FollowState;
import com.forsale.app.features.categories.listingdetails.buyerscreen.q;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.avatars.AvatarSize;
import com.forsale.designSystem.buttons.ButtonData;
import com.forsale.designSystem.buttons.ButtonsKt;
import com.forsale.designSystem.buttons.IconButtonKt;
import com.forsale.designSystem.buttons.IconButtonShape;
import com.forsale.designSystem.buttons.IconButtonSize;
import com.forsale.designSystem.dividers.DividersKt;
import com.forsale.designSystem.iconography.IconKt;
import com.forsale.ui.components.AvatarsKt;
import e2.h;
import g00.a;
import j0.d;
import j0.d1;
import j0.e;
import j0.e1;
import j0.k;
import j0.v0;
import java.text.NumberFormat;
import kotlin.jvm.internal.o;
import p1.g;
import t9.y0;
import v0.b;
import w.f;
import w.t;
import w.u;
import wz.p;
/* compiled from: BuyerSellerProfile.kt */
/* loaded from: classes2.dex */
public final class BuyerSellerProfileKt {
    public static final void a(final q state, final BuyerListingDetailsResponseModel.Data.Listing.User user, final String str, final boolean z11, final a<p> onOpenSellerProfileClicked, final a<p> onFollowChanged, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        u uVar;
        Arrangement arrangement;
        float f11;
        int i13;
        String str2;
        o.i(state, "state");
        o.i(user, "user");
        o.i(onOpenSellerProfileClicked, "onOpenSellerProfileClicked");
        o.i(onFollowChanged, "onFollowChanged");
        androidx.compose.runtime.a h11 = aVar.h(1716647570);
        if (c.I()) {
            c.U(1716647570, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerSellerProfile (BuyerSellerProfile.kt:44)");
        }
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        float f12 = 16;
        float f13 = 4;
        androidx.compose.ui.c l11 = PaddingKt.l(SizeKt.h(aVar2, 0.0f, 1, null), h.l(f12), h.l(f12), h.l(f13), h.l(f12));
        Arrangement arrangement2 = Arrangement.f3698a;
        Arrangement.f o11 = arrangement2.o(h.l(12));
        b.a aVar3 = b.f74009a;
        b.c i14 = aVar3.i();
        h11.C(693286680);
        a0 a11 = androidx.compose.foundation.layout.o.a(o11, i14, h11, 54);
        h11.C(-1323940314);
        int a12 = e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        a<ComposeUiNode> a13 = companion.a();
        g00.q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(l11);
        if (!(h11.k() instanceof d)) {
            e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a13);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a14 = Updater.a(h11);
        Updater.c(a14, a11, companion.e());
        Updater.c(a14, s11, companion.g());
        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        u uVar2 = u.f74924a;
        if (user.getImage() != null) {
            h11.C(880472776);
            i12 = 0;
            uVar = uVar2;
            arrangement = arrangement2;
            f11 = f13;
            AvatarsKt.a(TestTagKt.a(aVar2, "userImg"), h5.d.a(user.getImage(), null, null, null, 0, h11, 0, 30), new a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerSellerProfileKt$BuyerSellerProfile$1$1
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ p invoke() {
                    invoke2();
                    return p.f75480a;
                }
            }, false, null, AvatarSize.SIZE_48, h11, 196998, 24);
            h11.S();
        } else {
            i12 = 0;
            uVar = uVar2;
            arrangement = arrangement2;
            f11 = f13;
            if (user.getFirstName() != null) {
                h11.C(880472997);
                AvatarsKt.c(TestTagKt.a(aVar2, "userNameImg"), user.getFirstName(), new a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerSellerProfileKt$BuyerSellerProfile$1$2
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ p invoke() {
                        invoke2();
                        return p.f75480a;
                    }
                }, false, null, AvatarSize.SIZE_48, h11, 196998, 24);
                h11.S();
            } else {
                h11.C(880473153);
                h11.S();
            }
        }
        androidx.compose.ui.c d11 = t.d(uVar, aVar2, 1.0f, false, 2, null);
        h11.C(-483455358);
        a0 a15 = androidx.compose.foundation.layout.e.a(arrangement.h(), aVar3.k(), h11, i12);
        h11.C(-1323940314);
        int a16 = e.a(h11, i12);
        k s12 = h11.s();
        a<ComposeUiNode> a17 = companion.a();
        g00.q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(d11);
        if (!(h11.k() instanceof d)) {
            e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a17);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a18 = Updater.a(h11);
        Updater.c(a18, a15, companion.e());
        Updater.c(a18, s12, companion.g());
        g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
        if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
            a18.u(Integer.valueOf(a16));
            a18.p(Integer.valueOf(a16), b12);
        }
        c12.invoke(e1.a(e1.b(h11)), h11, Integer.valueOf(i12));
        h11.C(2058660585);
        f fVar = f.f74891a;
        h11.C(323788961);
        if (user.getFirstName() != null) {
            String firstName = user.getFirstName();
            dk.a aVar4 = dk.a.f54291a;
            int i15 = dk.a.f54292b;
            i13 = -1323940314;
            TextKt.a(firstName, TestTagKt.a(aVar2, "txtUserName"), 0, 0, false, 0, 0, null, aVar4.c(h11, i15).q(), aVar4.a(h11, i15).e().m(h11, yj.d.f76453b), 0, h11, 48, 0, 1276);
        } else {
            i13 = -1323940314;
        }
        h11.S();
        Arrangement.f o12 = arrangement.o(h.l(f11));
        b.c i16 = aVar3.i();
        h11.C(693286680);
        a0 a19 = androidx.compose.foundation.layout.o.a(o12, i16, h11, 54);
        h11.C(i13);
        int a21 = e.a(h11, 0);
        k s13 = h11.s();
        a<ComposeUiNode> a22 = companion.a();
        g00.q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c13 = LayoutKt.c(aVar2);
        if (!(h11.k() instanceof d)) {
            e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a22);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a23 = Updater.a(h11);
        Updater.c(a23, a19, companion.e());
        Updater.c(a23, s13, companion.g());
        g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
        if (a23.f() || !o.d(a23.D(), Integer.valueOf(a21))) {
            a23.u(Integer.valueOf(a21));
            a23.p(Integer.valueOf(a21), b13);
        }
        c13.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        h11.C(132130083);
        if (user.getListingsCount() == null) {
            str2 = " ";
        } else {
            String str3 = NumberFormat.getNumberInstance().format(user.getListingsCount()) + " " + g.b(y0.f70598o1, h11, 0);
            dk.a aVar5 = dk.a.f54291a;
            int i17 = dk.a.f54292b;
            str2 = " ";
            TextKt.a(str3, TestTagKt.a(aVar2, "txtListingCount"), 0, 0, false, 0, 0, null, aVar5.c(h11, i17).h(), aVar5.a(h11, i17).e().j(h11, yj.d.f76453b), 0, h11, 48, 0, 1276);
            DividersKt.b(null, h.l(20), 0.0f, 0L, h11, 48, 13);
        }
        h11.S();
        h11.C(323789988);
        if (user.getMemberSince() != null) {
            dk.a aVar6 = dk.a.f54291a;
            int i18 = dk.a.f54292b;
            TextKt.a(g.b(y0.f70665s1, h11, 0) + str2 + str, TestTagKt.a(aVar2, "txtMemberSince"), 0, 0, false, 0, 0, null, aVar6.c(h11, i18).h(), aVar6.a(h11, i18).e().j(h11, yj.d.f76453b), 0, h11, 48, 0, 1276);
        }
        h11.S();
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        h11.C(880474703);
        if (z11) {
            SpacerKt.a(SizeKt.i(aVar2, h.l(8)), h11, 6);
            b(state.e(), onFollowChanged, h11, (i11 >> 12) & 112);
        }
        h11.S();
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        h11.C(1385751998);
        if (z11) {
            IconButtonKt.c(onOpenSellerProfileClicked, p1.e.d(sj.d.f68673j, h11, 0), IconButtonShape.Square, IconButtonSize.Large, TestTagKt.a(uVar.c(aVar2, aVar3.i()), "btnOpenProfile"), false, null, t1.g(dk.a.f54291a.a(h11, dk.a.f54292b).e().j(h11, yj.d.f76453b)), h11, ((i11 >> 12) & 14) | 3520, 96);
        }
        h11.S();
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l12 = h11.l();
        if (l12 != null) {
            l12.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerSellerProfileKt$BuyerSellerProfile$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar7, int i19) {
                    BuyerSellerProfileKt.a(q.this, user, str, z11, onOpenSellerProfileClicked, onFollowChanged, aVar7, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar7, Integer num) {
                    b(aVar7, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final FollowState followState, final a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar3;
        int i13;
        int i14;
        androidx.compose.runtime.a h11 = aVar2.h(1276083422);
        if ((i11 & 14) == 0) {
            if (h11.T(followState)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(aVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && h11.i()) {
            h11.L();
            aVar3 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1276083422, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.FollowButton (BuyerSellerProfile.kt:113)");
            }
            yj.d f11 = dk.a.f54291a.a(h11, dk.a.f54292b).f();
            w.o a11 = PaddingKt.a(h.l(0));
            ButtonData d11 = ButtonData.f40994a.d();
            androidx.compose.ui.c a12 = TestTagKt.a(androidx.compose.ui.c.f7566a, "btnFollow");
            h11.C(1157296644);
            boolean T = h11.T(aVar);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerSellerProfileKt$FollowButton$1$1
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
                        aVar.invoke();
                    }
                };
                h11.u(D);
            }
            h11.S();
            aVar3 = h11;
            ButtonsKt.l((a) D, a12, d11, false, a11, f11, null, null, null, null, r0.b.b(h11, 1921087961, true, new g00.q<t, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerSellerProfileKt$FollowButton$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(3);
                }

                public final void b(t TextButton, androidx.compose.runtime.a aVar4, int i15) {
                    int i16;
                    int i17;
                    o.i(TextButton, "$this$TextButton");
                    if ((i15 & 81) == 16 && aVar4.i()) {
                        aVar4.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(1921087961, i15, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.FollowButton.<anonymous> (BuyerSellerProfile.kt:121)");
                    }
                    float f12 = 20;
                    androidx.compose.ui.c i18 = SizeKt.i(SizeKt.u(androidx.compose.ui.c.f7566a, h.l(f12)), h.l(f12));
                    FollowState followState2 = FollowState.this;
                    FollowState followState3 = FollowState.IS_NOT_FOLLOWING;
                    if (followState2 == followState3) {
                        i16 = sj.d.F;
                    } else {
                        i16 = sj.d.f68679p;
                    }
                    IconKt.a(p1.e.d(i16, aVar4, 0), i18, null, dk.a.f54291a.a(aVar4, dk.a.f54292b).f().i(aVar4, yj.d.f76453b), false, 0.0f, aVar4, 56, 52);
                    if (FollowState.this == followState3) {
                        i17 = y0.f70564m1;
                    } else {
                        i17 = y0.Z0;
                    }
                    TextKt.a(g.b(i17, aVar4, 0), null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar4, 0, 0, 2046);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(t tVar, androidx.compose.runtime.a aVar4, Integer num) {
                    b(tVar, aVar4, num.intValue());
                    return p.f75480a;
                }
            }), h11, (ButtonData.f40995b << 6) | 24624 | (yj.d.f76453b << 15), 6, 968);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar3.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerSellerProfileKt$FollowButton$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i15) {
                    BuyerSellerProfileKt.b(FollowState.this, aVar, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }
}
