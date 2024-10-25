package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.features.categories.listingdetails.newui.SellerListingStatus;
import com.forsale.designSystem.buttons.ButtonData;
import com.forsale.designSystem.buttons.ButtonsKt;
import e2.h;
import g00.l;
import g00.q;
import j0.d;
import j0.d1;
import j0.e1;
import j0.k;
import j0.v0;
import kotlin.jvm.internal.o;
import okhttp3.internal.http2.Http2;
import q1.n;
import q1.r;
import q1.s;
import v0.b;
import w.f;
import w.t;
import w.u;
import wz.p;
/* compiled from: SellerStickyBar.kt */
/* loaded from: classes2.dex */
public final class SellerStickyBarKt {

    /* compiled from: SellerStickyBar.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27651a;

        static {
            int[] iArr = new int[SellerListingStatus.values().length];
            try {
                iArr[SellerListingStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SellerListingStatus.ARCHIVED_BY_USER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SellerListingStatus.QUARANTINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f27651a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final boolean z11, final g00.a<p> aVar, final g00.a<p> aVar2, final g00.a<p> aVar3, final g00.a<p> aVar4, androidx.compose.runtime.a aVar5, final int i11) {
        int i12;
        Arrangement arrangement;
        float f11;
        int i13;
        androidx.compose.runtime.a aVar6;
        androidx.compose.runtime.a h11 = aVar5.h(-2139080565);
        if ((i11 & 14) == 0) {
            i12 = (h11.a(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.F(aVar) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= h11.F(aVar2) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= h11.F(aVar3) ? RecyclerView.l.FLAG_MOVED : 1024;
        }
        if ((57344 & i11) == 0) {
            i12 |= h11.F(aVar4) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((46811 & i12) == 9362 && h11.i()) {
            h11.L();
            aVar6 = h11;
        } else {
            if (c.I()) {
                c.U(-2139080565, i12, -1, "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.ActiveSellerActions (SellerStickyBar.kt:71)");
            }
            c.a aVar7 = androidx.compose.ui.c.f7566a;
            float f12 = 16;
            androidx.compose.ui.c c11 = n.c(PaddingKt.m(SizeKt.h(aVar7, 0.0f, 1, null), h.l(f12), 0.0f, h.l(f12), 0.0f, 10, null), false, new l<s, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerStickyBarKt$ActiveSellerActions$1
                public final void b(s semantics) {
                    o.i(semantics, "$this$semantics");
                    r.a(semantics, true);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(s sVar) {
                    b(sVar);
                    return p.f75480a;
                }
            }, 1, null);
            h11.C(-483455358);
            Arrangement arrangement2 = Arrangement.f3698a;
            Arrangement.m h12 = arrangement2.h();
            b.a aVar8 = b.f74009a;
            a0 a11 = e.a(h12, aVar8.k(), h11, 0);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(c11);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
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
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            f fVar = f.f74891a;
            SpacerKt.a(SizeKt.i(aVar7, h.l(f12)), h11, 6);
            h11.C(682562930);
            if (z11) {
                arrangement = arrangement2;
                f11 = f12;
                i13 = 6;
            } else {
                ButtonData b12 = ButtonData.f40994a.b();
                androidx.compose.ui.c a15 = TestTagKt.a(SizeKt.i(SizeKt.h(aVar7, 0.0f, 1, null), h.l(48)), "btnGetMoreViews");
                h11.C(1157296644);
                boolean T = h11.T(aVar);
                Object D = h11.D();
                if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                    D = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerStickyBarKt$ActiveSellerActions$2$1$1
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
                arrangement = arrangement2;
                f11 = f12;
                ButtonsKt.d((g00.a) D, a15, b12, null, null, null, null, false, null, null, ComposableSingletons$SellerStickyBarKt.f27605a.a(), h11, (ButtonData.f40995b << 6) | 48, 6, 1016);
                h11 = h11;
                i13 = 6;
                SpacerKt.a(SizeKt.i(aVar7, h.l(f11)), h11, 6);
            }
            h11.S();
            Arrangement.f o11 = arrangement.o(h.l(8));
            androidx.compose.ui.c h13 = SizeKt.h(aVar7, 0.0f, 1, null);
            h11.C(693286680);
            a0 a16 = androidx.compose.foundation.layout.o.a(o11, aVar8.l(), h11, i13);
            h11.C(-1323940314);
            int a17 = j0.e.a(h11, 0);
            k s12 = h11.s();
            g00.a<ComposeUiNode> a18 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c13 = LayoutKt.c(h13);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a18);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a19 = Updater.a(h11);
            Updater.c(a19, a16, companion.e());
            Updater.c(a19, s12, companion.g());
            g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
            if (a19.f() || !o.d(a19.D(), Integer.valueOf(a17))) {
                a19.u(Integer.valueOf(a17));
                a19.p(Integer.valueOf(a17), b13);
            }
            c13.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            androidx.compose.ui.c a21 = TestTagKt.a(t.d(uVar, aVar7, 1.0f, false, 2, null), "btnRepost");
            ButtonData.a aVar9 = ButtonData.f40994a;
            ButtonData d11 = aVar9.d();
            h11.C(1157296644);
            boolean T2 = h11.T(aVar2);
            Object D2 = h11.D();
            if (T2 || D2 == androidx.compose.runtime.a.f7182a.a()) {
                D2 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerStickyBarKt$ActiveSellerActions$2$2$1$1
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
                        aVar2.invoke();
                    }
                };
                h11.u(D2);
            }
            h11.S();
            ComposableSingletons$SellerStickyBarKt composableSingletons$SellerStickyBarKt = ComposableSingletons$SellerStickyBarKt.f27605a;
            q<t, androidx.compose.runtime.a, Integer, p> b14 = composableSingletons$SellerStickyBarKt.b();
            int i14 = ButtonData.f40995b;
            androidx.compose.runtime.a aVar10 = h11;
            ButtonsKt.h((g00.a) D2, a21, d11, false, null, null, null, null, null, null, b14, aVar10, i14 << 6, 6, 1016);
            androidx.compose.ui.c a22 = TestTagKt.a(t.d(uVar, aVar7, 1.0f, false, 2, null), "btnEdit");
            ButtonData d12 = aVar9.d();
            aVar10.C(1157296644);
            boolean T3 = aVar10.T(aVar3);
            Object D3 = aVar10.D();
            if (T3 || D3 == androidx.compose.runtime.a.f7182a.a()) {
                D3 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerStickyBarKt$ActiveSellerActions$2$2$2$1
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
                        aVar3.invoke();
                    }
                };
                aVar10.u(D3);
            }
            aVar10.S();
            ButtonsKt.h((g00.a) D3, a22, d12, false, null, null, null, null, null, null, composableSingletons$SellerStickyBarKt.c(), aVar10, i14 << 6, 6, 1016);
            androidx.compose.ui.c a23 = TestTagKt.a(t.d(uVar, aVar7, 1.0f, false, 2, null), "btnDelete");
            ButtonData d13 = aVar9.d();
            aVar10.C(1157296644);
            boolean T4 = aVar10.T(aVar4);
            Object D4 = aVar10.D();
            if (T4 || D4 == androidx.compose.runtime.a.f7182a.a()) {
                D4 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerStickyBarKt$ActiveSellerActions$2$2$3$1
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
                        aVar4.invoke();
                    }
                };
                aVar10.u(D4);
            }
            aVar10.S();
            ButtonsKt.h((g00.a) D4, a23, d13, false, null, null, null, null, null, null, composableSingletons$SellerStickyBarKt.d(), aVar10, i14 << 6, 6, 1016);
            aVar10.S();
            aVar10.w();
            aVar10.S();
            aVar10.S();
            aVar6 = aVar10;
            SpacerKt.a(SizeKt.i(aVar7, h.l(f11)), aVar6, 6);
            aVar6.S();
            aVar6.w();
            aVar6.S();
            aVar6.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar6.l();
        if (l11 == null) {
            return;
        }
        l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerStickyBarKt$ActiveSellerActions$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(a aVar11, int i15) {
                SellerStickyBarKt.a(z11, aVar, aVar2, aVar3, aVar4, aVar11, v0.a(i11 | 1));
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(a aVar11, Integer num) {
                b(aVar11, num.intValue());
                return p.f75480a;
            }
        });
    }

    public static final void b(final g00.a<p> onRepostClick, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar2;
        int i13;
        o.i(onRepostClick, "onRepostClick");
        androidx.compose.runtime.a h11 = aVar.h(212380519);
        if ((i11 & 14) == 0) {
            if (h11.F(onRepostClick)) {
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
            aVar2 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(212380519, i12, -1, "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.ArchivedSellerActions (SellerStickyBar.kt:150)");
            }
            c.a aVar3 = androidx.compose.ui.c.f7566a;
            float f11 = 16;
            androidx.compose.ui.c c11 = n.c(PaddingKt.m(SizeKt.h(aVar3, 0.0f, 1, null), h.l(f11), 0.0f, h.l(f11), 0.0f, 10, null), false, new l<s, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerStickyBarKt$ArchivedSellerActions$1
                public final void b(s semantics) {
                    o.i(semantics, "$this$semantics");
                    r.a(semantics, true);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(s sVar) {
                    b(sVar);
                    return p.f75480a;
                }
            }, 1, null);
            h11.C(-483455358);
            a0 a11 = e.a(Arrangement.f3698a.h(), b.f74009a.k(), h11, 0);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(c11);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
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
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            f fVar = f.f74891a;
            SpacerKt.a(SizeKt.i(aVar3, h.l(f11)), h11, 6);
            ButtonData b12 = ButtonData.f40994a.b();
            androidx.compose.ui.c a15 = TestTagKt.a(SizeKt.i(SizeKt.h(aVar3, 0.0f, 1, null), h.l(48)), "btnRepost");
            h11.C(1157296644);
            boolean T = h11.T(onRepostClick);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerStickyBarKt$ArchivedSellerActions$2$1$1
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
                        onRepostClick.invoke();
                    }
                };
                h11.u(D);
            }
            h11.S();
            ButtonsKt.d((g00.a) D, a15, b12, null, null, null, null, false, null, null, ComposableSingletons$SellerStickyBarKt.f27605a.e(), h11, (ButtonData.f40995b << 6) | 48, 6, 1016);
            aVar2 = h11;
            SpacerKt.a(SizeKt.i(aVar3, h.l(f11)), aVar2, 6);
            aVar2.S();
            aVar2.w();
            aVar2.S();
            aVar2.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar2.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerStickyBarKt$ArchivedSellerActions$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar4, int i14) {
                    SellerStickyBarKt.b(onRepostClick, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void c(final g00.a<p> onDeleteClick, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar2;
        int i13;
        o.i(onDeleteClick, "onDeleteClick");
        androidx.compose.runtime.a h11 = aVar.h(1334711764);
        if ((i11 & 14) == 0) {
            if (h11.F(onDeleteClick)) {
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
            aVar2 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1334711764, i12, -1, "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.QuarantineActions (SellerStickyBar.kt:178)");
            }
            c.a aVar3 = androidx.compose.ui.c.f7566a;
            float f11 = 16;
            androidx.compose.ui.c c11 = n.c(PaddingKt.m(SizeKt.h(aVar3, 0.0f, 1, null), h.l(f11), 0.0f, h.l(f11), 0.0f, 10, null), false, new l<s, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerStickyBarKt$QuarantineActions$1
                public final void b(s semantics) {
                    o.i(semantics, "$this$semantics");
                    r.a(semantics, true);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(s sVar) {
                    b(sVar);
                    return p.f75480a;
                }
            }, 1, null);
            h11.C(-483455358);
            a0 a11 = e.a(Arrangement.f3698a.h(), b.f74009a.k(), h11, 0);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(c11);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
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
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            f fVar = f.f74891a;
            SpacerKt.a(SizeKt.i(aVar3, h.l(f11)), h11, 6);
            ButtonData d11 = ButtonData.f40994a.d();
            androidx.compose.ui.c a15 = TestTagKt.a(SizeKt.i(SizeKt.h(aVar3, 0.0f, 1, null), h.l(48)), "btnDelete");
            h11.C(1157296644);
            boolean T = h11.T(onDeleteClick);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerStickyBarKt$QuarantineActions$2$1$1
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
                        onDeleteClick.invoke();
                    }
                };
                h11.u(D);
            }
            h11.S();
            ButtonsKt.h((g00.a) D, a15, d11, false, null, null, null, null, null, null, ComposableSingletons$SellerStickyBarKt.f27605a.f(), h11, (ButtonData.f40995b << 6) | 48, 6, 1016);
            aVar2 = h11;
            SpacerKt.a(SizeKt.i(aVar3, h.l(f11)), aVar2, 6);
            aVar2.S();
            aVar2.w();
            aVar2.S();
            aVar2.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar2.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerStickyBarKt$QuarantineActions$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar4, int i14) {
                    SellerStickyBarKt.c(onDeleteClick, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void d(final SellerListingStatus listingStatus, final boolean z11, final g00.a<p> onGetAddonsClick, final g00.a<p> onRePostClick, final g00.a<p> onEditClick, final g00.a<p> onDeleteClick, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        o.i(listingStatus, "listingStatus");
        o.i(onGetAddonsClick, "onGetAddonsClick");
        o.i(onRePostClick, "onRePostClick");
        o.i(onEditClick, "onEditClick");
        o.i(onDeleteClick, "onDeleteClick");
        androidx.compose.runtime.a h11 = aVar.h(585498285);
        if ((i11 & 14) == 0) {
            if (h11.T(listingStatus)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.a(z11)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        if ((i11 & 896) == 0) {
            if (h11.F(onGetAddonsClick)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i12 |= i16;
        }
        if ((i11 & 7168) == 0) {
            if (h11.F(onRePostClick)) {
                i15 = RecyclerView.l.FLAG_MOVED;
            } else {
                i15 = 1024;
            }
            i12 |= i15;
        }
        if ((57344 & i11) == 0) {
            if (h11.F(onEditClick)) {
                i14 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i14 = 8192;
            }
            i12 |= i14;
        }
        if ((458752 & i11) == 0) {
            if (h11.F(onDeleteClick)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i12 |= i13;
        }
        if ((374491 & i12) == 74898 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(585498285, i12, -1, "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerStickyBar (SellerStickyBar.kt:39)");
            }
            int i19 = a.f27651a[listingStatus.ordinal()];
            if (i19 != 1) {
                if (i19 != 2) {
                    if (i19 != 3) {
                        h11.C(1799772718);
                        h11.S();
                    } else {
                        h11.C(1799772612);
                        h11.C(1157296644);
                        boolean T = h11.T(onDeleteClick);
                        Object D = h11.D();
                        if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                            D = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerStickyBarKt$SellerStickyBar$6$1
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
                                    onDeleteClick.invoke();
                                }
                            };
                            h11.u(D);
                        }
                        h11.S();
                        c((g00.a) D, h11, 0);
                        h11.S();
                    }
                } else {
                    h11.C(1799772500);
                    h11.C(1157296644);
                    boolean T2 = h11.T(onRePostClick);
                    Object D2 = h11.D();
                    if (T2 || D2 == androidx.compose.runtime.a.f7182a.a()) {
                        D2 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerStickyBarKt$SellerStickyBar$5$1
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
                                onRePostClick.invoke();
                            }
                        };
                        h11.u(D2);
                    }
                    h11.S();
                    b((g00.a) D2, h11, 0);
                    h11.S();
                }
            } else {
                h11.C(1799772127);
                h11.C(1157296644);
                boolean T3 = h11.T(onGetAddonsClick);
                Object D3 = h11.D();
                if (T3 || D3 == androidx.compose.runtime.a.f7182a.a()) {
                    D3 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerStickyBarKt$SellerStickyBar$1$1
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
                            onGetAddonsClick.invoke();
                        }
                    };
                    h11.u(D3);
                }
                h11.S();
                g00.a aVar2 = (g00.a) D3;
                h11.C(1157296644);
                boolean T4 = h11.T(onRePostClick);
                Object D4 = h11.D();
                if (T4 || D4 == androidx.compose.runtime.a.f7182a.a()) {
                    D4 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerStickyBarKt$SellerStickyBar$2$1
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
                            onRePostClick.invoke();
                        }
                    };
                    h11.u(D4);
                }
                h11.S();
                g00.a aVar3 = (g00.a) D4;
                h11.C(1157296644);
                boolean T5 = h11.T(onEditClick);
                Object D5 = h11.D();
                if (T5 || D5 == androidx.compose.runtime.a.f7182a.a()) {
                    D5 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerStickyBarKt$SellerStickyBar$3$1
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
                            onEditClick.invoke();
                        }
                    };
                    h11.u(D5);
                }
                h11.S();
                g00.a aVar4 = (g00.a) D5;
                h11.C(1157296644);
                boolean T6 = h11.T(onDeleteClick);
                Object D6 = h11.D();
                if (T6 || D6 == androidx.compose.runtime.a.f7182a.a()) {
                    D6 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerStickyBarKt$SellerStickyBar$4$1
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
                            onDeleteClick.invoke();
                        }
                    };
                    h11.u(D6);
                }
                h11.S();
                a(z11, aVar2, aVar3, aVar4, (g00.a) D6, h11, (i12 >> 3) & 14);
                h11.S();
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerStickyBarKt$SellerStickyBar$7
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar5, int i21) {
                    SellerStickyBarKt.d(SellerListingStatus.this, z11, onGetAddonsClick, onRePostClick, onEditClick, onDeleteClick, aVar5, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }
}
