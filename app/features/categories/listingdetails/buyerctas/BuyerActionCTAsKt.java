package com.forsale.app.features.categories.listingdetails.buyerctas;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel;
import e2.h;
import g00.q;
import j0.d;
import j0.d1;
import j0.e1;
import j0.k;
import j0.n1;
import j0.v0;
import kotlin.jvm.internal.o;
import v0.b;
import w.f;
import w.t;
import w.u;
import wz.p;
/* compiled from: BuyerActionCTAs.kt */
/* loaded from: classes2.dex */
public final class BuyerActionCTAsKt {
    public static final void a(final NewListingDetailsViewModel viewModel, a aVar, final int i11) {
        o.i(viewModel, "viewModel");
        a h11 = aVar.h(374702463);
        if (c.I()) {
            c.U(374702463, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerctas.BuyerActionCTAs (BuyerActionCTAs.kt:20)");
        }
        h11.C(-483455358);
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        Arrangement arrangement = Arrangement.f3698a;
        Arrangement.m h12 = arrangement.h();
        b.a aVar3 = b.f74009a;
        a0 a11 = e.a(h12, aVar3.k(), h11, 0);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(aVar2);
        if (!(h11.k() instanceof d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a13);
        } else {
            h11.t();
        }
        a a14 = Updater.a(h11);
        Updater.c(a14, a11, companion.e());
        Updater.c(a14, s11, companion.g());
        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        n1 b12 = z.b(viewModel.q2(), null, h11, 8, 1);
        n1 b13 = z.b(viewModel.D1(), null, h11, 8, 1);
        Arrangement.e p11 = arrangement.p(h.l(8), aVar3.g());
        h11.C(693286680);
        a0 a15 = androidx.compose.foundation.layout.o.a(p11, aVar3.l(), h11, 6);
        h11.C(-1323940314);
        int a16 = j0.e.a(h11, 0);
        k s12 = h11.s();
        g00.a<ComposeUiNode> a17 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, p> c12 = LayoutKt.c(aVar2);
        if (!(h11.k() instanceof d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a17);
        } else {
            h11.t();
        }
        a a18 = Updater.a(h11);
        Updater.c(a18, a15, companion.e());
        Updater.c(a18, s12, companion.g());
        g00.p<ComposeUiNode, Integer, p> b14 = companion.b();
        if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
            a18.u(Integer.valueOf(a16));
            a18.p(Integer.valueOf(a16), b14);
        }
        c12.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        u uVar = u.f74924a;
        if (!b(b12)) {
            h11.C(645764024);
            BuyerCTAsComponent.f25455a.a(t.d(uVar, aVar2, 1.0f, false, 2, null), new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerctas.BuyerActionCTAsKt$BuyerActionCTAs$1$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
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
                    NewListingDetailsViewModel.this.P2(NewListingDetailsViewModel.ActionType.CALL);
                }
            }, h11, 384);
            h11.S();
        } else {
            h11.C(645764215);
            if (c(b13)) {
                BuyerCTAsComponent.f25455a.b(BuyerCTAsState.CHAT_ACTION, t.d(uVar, aVar2, 1.0f, false, 2, null), new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerctas.BuyerActionCTAsKt$BuyerActionCTAs$1$1$2
                    /* JADX INFO: Access modifiers changed from: package-private */
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
                        NewListingDetailsViewModel.this.Q2(NewListingDetailsViewModel.ActionType.CHAT);
                    }
                }, h11, 3078);
            }
            h11.S();
        }
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerctas.BuyerActionCTAsKt$BuyerActionCTAs$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar4, int i12) {
                    BuyerActionCTAsKt.a(NewListingDetailsViewModel.this, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    private static final boolean b(n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }

    private static final boolean c(n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }
}
