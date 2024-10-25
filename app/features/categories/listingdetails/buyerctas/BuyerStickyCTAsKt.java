package com.forsale.app.features.categories.listingdetails.buyerctas;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.recyclerview.widget.RecyclerView;
import e2.h;
import g00.a;
import g00.q;
import j0.d;
import j0.d1;
import j0.e;
import j0.e1;
import j0.k;
import j0.v0;
import kotlin.jvm.internal.o;
import okhttp3.internal.http2.Http2;
import v0.b;
import w.t;
import w.u;
import wz.p;
/* compiled from: BuyerStickyCTAs.kt */
/* loaded from: classes2.dex */
public final class BuyerStickyCTAsKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final boolean r20, final boolean r21, androidx.compose.ui.c r22, boolean r23, final com.forsale.app.features.categories.listingdetails.buyerctas.CTAsVisibility r24, final g00.l<? super com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel.ActionType, wz.p> r25, final g00.l<? super com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel.ActionType, wz.p> r26, final g00.l<? super com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel.ActionType, wz.p> r27, androidx.compose.runtime.a r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerctas.BuyerStickyCTAsKt.a(boolean, boolean, androidx.compose.ui.c, boolean, com.forsale.app.features.categories.listingdetails.buyerctas.CTAsVisibility, g00.l, g00.l, g00.l, androidx.compose.runtime.a, int, int):void");
    }

    public static final void b(final CTAsVisibility buttonListState, final a<p> onCallClicked, final a<p> onWhatsAppClicked, final a<p> onChatClicked, final boolean z11, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        o.i(buttonListState, "buttonListState");
        o.i(onCallClicked, "onCallClicked");
        o.i(onWhatsAppClicked, "onWhatsAppClicked");
        o.i(onChatClicked, "onChatClicked");
        androidx.compose.runtime.a h11 = aVar.h(1209230816);
        if ((i11 & 14) == 0) {
            if (h11.T(buttonListState)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(onCallClicked)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        if ((i11 & 896) == 0) {
            if (h11.F(onWhatsAppClicked)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i11 & 7168) == 0) {
            if (h11.F(onChatClicked)) {
                i14 = RecyclerView.l.FLAG_MOVED;
            } else {
                i14 = 1024;
            }
            i12 |= i14;
        }
        if ((57344 & i11) == 0) {
            if (h11.a(z11)) {
                i13 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i13 = 8192;
            }
            i12 |= i13;
        }
        if ((46811 & i12) == 9362 && h11.i()) {
            h11.L();
        } else {
            if (c.I()) {
                c.U(1209230816, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerctas.CTAsActionVisibility (BuyerStickyCTAs.kt:78)");
            }
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            androidx.compose.ui.c i18 = PaddingKt.i(SizeKt.h(aVar2, 0.0f, 1, null), h.l(16));
            Arrangement arrangement = Arrangement.f3698a;
            float l11 = h.l(8);
            b.a aVar3 = b.f74009a;
            Arrangement.e p11 = arrangement.p(l11, aVar3.g());
            h11.C(693286680);
            a0 a11 = androidx.compose.foundation.layout.o.a(p11, aVar3.l(), h11, 6);
            h11.C(-1323940314);
            int a12 = e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(i18);
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
            u uVar = u.f74924a;
            h11.C(624041519);
            Boolean a15 = buttonListState.a();
            Boolean bool = Boolean.TRUE;
            if (o.d(a15, bool)) {
                BuyerCTAsComponent buyerCTAsComponent = BuyerCTAsComponent.f25455a;
                androidx.compose.ui.c a16 = TestTagKt.a(t.d(uVar, SizeKt.h(aVar2, 0.0f, 1, null), 1.0f, false, 2, null), "btnCall");
                h11.C(1157296644);
                boolean T = h11.T(onCallClicked);
                Object D = h11.D();
                if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                    D = new a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerctas.BuyerStickyCTAsKt$CTAsActionVisibility$1$1$1
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
                            onCallClicked.invoke();
                        }
                    };
                    h11.u(D);
                }
                h11.S();
                buyerCTAsComponent.a(a16, (a) D, h11, 384);
            }
            h11.S();
            h11.C(624041837);
            if (o.d(buttonListState.c(), bool)) {
                BuyerCTAsComponent buyerCTAsComponent2 = BuyerCTAsComponent.f25455a;
                androidx.compose.ui.c a17 = TestTagKt.a(t.d(uVar, SizeKt.h(aVar2, 0.0f, 1, null), 1.0f, false, 2, null), "btnWhatsApp");
                h11.C(1157296644);
                boolean T2 = h11.T(onWhatsAppClicked);
                Object D2 = h11.D();
                if (T2 || D2 == androidx.compose.runtime.a.f7182a.a()) {
                    D2 = new a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerctas.BuyerStickyCTAsKt$CTAsActionVisibility$1$2$1
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
                            onWhatsAppClicked.invoke();
                        }
                    };
                    h11.u(D2);
                }
                h11.S();
                buyerCTAsComponent2.c(a17, (a) D2, h11, 384);
            }
            h11.S();
            h11.C(-522078336);
            if (o.d(buttonListState.b(), bool) && z11) {
                BuyerCTAsComponent buyerCTAsComponent3 = BuyerCTAsComponent.f25455a;
                BuyerCTAsState buyerCTAsState = BuyerCTAsState.CHAT_ACTION;
                androidx.compose.ui.c a18 = TestTagKt.a(t.d(uVar, SizeKt.h(aVar2, 0.0f, 1, null), 1.0f, false, 2, null), "btnChat");
                h11.C(1157296644);
                boolean T3 = h11.T(onChatClicked);
                Object D3 = h11.D();
                if (T3 || D3 == androidx.compose.runtime.a.f7182a.a()) {
                    D3 = new a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerctas.BuyerStickyCTAsKt$CTAsActionVisibility$1$3$1
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
                            onChatClicked.invoke();
                        }
                    };
                    h11.u(D3);
                }
                h11.S();
                buyerCTAsComponent3.b(buyerCTAsState, a18, (a) D3, h11, 3078);
            }
            h11.S();
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l12 = h11.l();
        if (l12 != null) {
            l12.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerctas.BuyerStickyCTAsKt$CTAsActionVisibility$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i19) {
                    BuyerStickyCTAsKt.b(CTAsVisibility.this, onCallClicked, onWhatsAppClicked, onChatClicked, z11, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void c(final a<p> onCallClicked, final a<p> onWhatsAppClicked, final a<p> onChatClicked, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        o.i(onCallClicked, "onCallClicked");
        o.i(onWhatsAppClicked, "onWhatsAppClicked");
        o.i(onChatClicked, "onChatClicked");
        androidx.compose.runtime.a h11 = aVar.h(-2010650621);
        if ((i11 & 14) == 0) {
            if (h11.F(onCallClicked)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(onWhatsAppClicked)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 896) == 0) {
            if (h11.F(onChatClicked)) {
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
                androidx.compose.runtime.c.U(-2010650621, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerctas.MultipleActions (BuyerStickyCTAs.kt:120)");
            }
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            androidx.compose.ui.c i16 = PaddingKt.i(SizeKt.h(aVar2, 0.0f, 1, null), h.l(16));
            Arrangement arrangement = Arrangement.f3698a;
            float l11 = h.l(8);
            b.a aVar3 = b.f74009a;
            Arrangement.e p11 = arrangement.p(l11, aVar3.g());
            h11.C(693286680);
            a0 a11 = androidx.compose.foundation.layout.o.a(p11, aVar3.l(), h11, 6);
            h11.C(-1323940314);
            int a12 = e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(i16);
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
            u uVar = u.f74924a;
            BuyerCTAsComponent buyerCTAsComponent = BuyerCTAsComponent.f25455a;
            androidx.compose.ui.c a15 = TestTagKt.a(t.d(uVar, aVar2, 3.0f, false, 2, null), "btnCall");
            h11.C(1157296644);
            boolean T = h11.T(onCallClicked);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerctas.BuyerStickyCTAsKt$MultipleActions$1$1$1
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
                        onCallClicked.invoke();
                    }
                };
                h11.u(D);
            }
            h11.S();
            buyerCTAsComponent.a(a15, (a) D, h11, 384);
            androidx.compose.ui.c a16 = TestTagKt.a(t.d(uVar, aVar2, 3.0f, false, 2, null), "btnWhatsApp");
            h11.C(1157296644);
            boolean T2 = h11.T(onWhatsAppClicked);
            Object D2 = h11.D();
            if (T2 || D2 == androidx.compose.runtime.a.f7182a.a()) {
                D2 = new a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerctas.BuyerStickyCTAsKt$MultipleActions$1$2$1
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
                        onWhatsAppClicked.invoke();
                    }
                };
                h11.u(D2);
            }
            h11.S();
            buyerCTAsComponent.c(a16, (a) D2, h11, 384);
            BuyerCTAsState buyerCTAsState = BuyerCTAsState.CHAT_ACTION_STICKY;
            androidx.compose.ui.c a17 = TestTagKt.a(t.d(uVar, aVar2, 1.0f, false, 2, null), "btnChat");
            h11.C(1157296644);
            boolean T3 = h11.T(onChatClicked);
            Object D3 = h11.D();
            if (T3 || D3 == androidx.compose.runtime.a.f7182a.a()) {
                D3 = new a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerctas.BuyerStickyCTAsKt$MultipleActions$1$3$1
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
                        onChatClicked.invoke();
                    }
                };
                h11.u(D3);
            }
            h11.S();
            buyerCTAsComponent.b(buyerCTAsState, a17, (a) D3, h11, 3078);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l12 = h11.l();
        if (l12 != null) {
            l12.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerctas.BuyerStickyCTAsKt$MultipleActions$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i17) {
                    BuyerStickyCTAsKt.c(onCallClicked, onWhatsAppClicked, onChatClicked, aVar4, v0.a(i11 | 1));
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
