package com.forsale.app.features.postad.media.mediaScreenView;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import b2.f;
import com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel;
import com.forsale.designSystem.SurfaceKt;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.buttons.ButtonData;
import com.forsale.designSystem.buttons.ButtonsKt;
import g00.l;
import g00.q;
import j0.d1;
import j0.e1;
import j0.k;
import j0.k0;
import j0.n1;
import j0.v0;
import java.util.List;
import kotlin.jvm.internal.o;
import okhttp3.internal.http2.Http2;
import t9.q0;
import t9.y0;
import v0.b;
import w.t;
import w.u;
import wz.p;
/* compiled from: ImagesView.kt */
/* loaded from: classes2.dex */
public final class ImagesViewKt {
    public static final void a(final PostAdMediaViewModel viewModel, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        boolean z11;
        o.i(viewModel, "viewModel");
        androidx.compose.runtime.a h11 = aVar.h(437362812);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(437362812, i11, -1, "com.forsale.app.features.postad.media.mediaScreenView.AddPhotosSection (ImagesView.kt:44)");
        }
        final n1 a11 = LiveDataAdapterKt.a(viewModel.E0(), h11, 8);
        h11.C(-492369756);
        Object D = h11.D();
        a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
        if (D == c0064a.a()) {
            D = viewModel.D0();
            h11.u(D);
        }
        h11.S();
        final SnapshotStateList snapshotStateList = (SnapshotStateList) D;
        h11.C(-492369756);
        Object D2 = h11.D();
        if (D2 == c0064a.a()) {
            D2 = viewModel.I0();
            h11.u(D2);
        }
        h11.S();
        k0 k0Var = (k0) D2;
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        boolean z12 = true;
        androidx.compose.ui.c k11 = PaddingKt.k(SizeKt.h(aVar2, 0.0f, 1, null), e2.h.l(16), 0.0f, 2, null);
        h11.C(-483455358);
        int i13 = 0;
        a0 a12 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), h11, 0);
        h11.C(-1323940314);
        int a13 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a14 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(k11);
        if (!(h11.k() instanceof j0.d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a14);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a15 = Updater.a(h11);
        Updater.c(a15, a12, companion.e());
        Updater.c(a15, s11, companion.g());
        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
        if (a15.f() || !o.d(a15.D(), Integer.valueOf(a13))) {
            a15.u(Integer.valueOf(a13));
            a15.p(Integer.valueOf(a13), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        w.f fVar = w.f.f74891a;
        boolean z13 = !snapshotStateList.isEmpty();
        bf.b b12 = b(a11);
        if (b12 != null) {
            i12 = b12.a();
        } else {
            i12 = 10;
        }
        if (i12 <= snapshotStateList.size()) {
            z11 = true;
        } else {
            z11 = false;
        }
        bf.b b13 = b(a11);
        if (b13 == null || !b13.b()) {
            z12 = false;
        }
        d(z13, z12, z11, new g00.a<p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$AddPhotosSection$1$1
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
                bf.b b14;
                PostAdMediaViewModel postAdMediaViewModel = PostAdMediaViewModel.this;
                b14 = ImagesViewKt.b(a11);
                postAdMediaViewModel.N0((b14 != null ? b14.a() : 0) - snapshotStateList.size());
            }
        }, h11, 0);
        SpacerKt.a(SizeKt.i(aVar2, e2.h.l(12)), h11, 6);
        bf.b b14 = b(a11);
        if (b14 != null) {
            i13 = b14.a();
        }
        h(new g00.a<p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$AddPhotosSection$1$2
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
                bf.b b15;
                PostAdMediaViewModel postAdMediaViewModel = PostAdMediaViewModel.this;
                b15 = ImagesViewKt.b(a11);
                postAdMediaViewModel.N0((b15 != null ? b15.a() : 0) - snapshotStateList.size());
            }
        }, new g00.p<b10.a, b10.a, p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$AddPhotosSection$1$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(b10.a fromPos, b10.a toPos) {
                o.i(fromPos, "fromPos");
                o.i(toPos, "toPos");
                PostAdMediaViewModel.this.d1(fromPos, toPos);
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(b10.a aVar3, b10.a aVar4) {
                b(aVar3, aVar4);
                return p.f75480a;
            }
        }, new l<bf.a, p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$AddPhotosSection$1$4
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(bf.a it2) {
                o.i(it2, "it");
                PostAdMediaViewModel.this.Y0(it2);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(bf.a aVar3) {
                b(aVar3);
                return p.f75480a;
            }
        }, new l<bf.a, p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$AddPhotosSection$1$5
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(bf.a it2) {
                o.i(it2, "it");
                PostAdMediaViewModel.this.S0(it2);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(bf.a aVar3) {
                b(aVar3);
                return p.f75480a;
            }
        }, new l<bf.a, p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$AddPhotosSection$1$6
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(bf.a it2) {
                o.i(it2, "it");
                PostAdMediaViewModel.this.U0(it2);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(bf.a aVar3) {
                b(aVar3);
                return p.f75480a;
            }
        }, new g00.a<p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$AddPhotosSection$1$7
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
                PostAdMediaViewModel.this.W0();
            }
        }, snapshotStateList, i13, c(k0Var), new g00.a<p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$AddPhotosSection$1$8
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
                PostAdMediaViewModel.R0(PostAdMediaViewModel.this, false, 1, null);
            }
        }, h11, 1572864);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$AddPhotosSection$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i14) {
                    ImagesViewKt.a(PostAdMediaViewModel.this, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bf.b b(n1<bf.b> n1Var) {
        return n1Var.getValue();
    }

    private static final Integer c(k0<Integer> k0Var) {
        return k0Var.getValue();
    }

    public static final void d(final boolean z11, final boolean z12, final boolean z13, final g00.a<p> onUploadClicked, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        androidx.compose.runtime.a aVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        o.i(onUploadClicked, "onUploadClicked");
        androidx.compose.runtime.a h11 = aVar.h(-1557786294);
        if ((i11 & 14) == 0) {
            if (h11.a(z11)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.a(z12)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i11 & 896) == 0) {
            if (h11.a(z13)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 7168) == 0) {
            if (h11.F(onUploadClicked)) {
                i13 = RecyclerView.l.FLAG_MOVED;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 5851) == 1170 && h11.i()) {
            h11.L();
            aVar2 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1557786294, i12, -1, "com.forsale.app.features.postad.media.mediaScreenView.AddPhotosTitle (ImagesView.kt:105)");
            }
            c.a aVar3 = androidx.compose.ui.c.f7566a;
            androidx.compose.ui.c h12 = SizeKt.h(aVar3, 0.0f, 1, null);
            b.c i17 = v0.b.f74009a.i();
            h11.C(693286680);
            a0 a11 = androidx.compose.foundation.layout.o.a(Arrangement.f3698a.g(), i17, h11, 48);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(h12);
            if (!(h11.k() instanceof j0.d)) {
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
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            String b12 = p1.g.b(y0.f70389bc, h11, 0);
            dk.a aVar4 = dk.a.f54291a;
            int i18 = dk.a.f54292b;
            TextKt.a(b12, null, 0, 0, false, 0, 0, null, aVar4.c(h11, i18).l(), 0L, 0, h11, 0, 0, 1790);
            h11.C(2040908173);
            if (z12) {
                SpacerKt.a(SizeKt.u(aVar3, e2.h.l(4)), h11, 6);
                TextKt.a(p1.g.b(y0.f70474gc, h11, 0), null, 0, 0, false, 0, 0, null, aVar4.c(h11, i18).h(), aVar4.a(h11, i18).d().i(h11, yj.d.f76453b), 0, h11, 0, 0, 1278);
            }
            h11.S();
            h11.C(-371388356);
            if (z11) {
                SpacerKt.a(t.d(uVar, aVar3, 1.0f, false, 2, null), h11, 0);
                aVar2 = h11;
                ButtonsKt.e(onUploadClicked, null, ButtonData.f40994a.e(), !z13, false, null, ComposableSingletons$ImagesViewKt.f36014a.a(), h11, ((i12 >> 9) & 14) | 1572864 | (ButtonData.f40995b << 6), 50);
            } else {
                aVar2 = h11;
            }
            aVar2.S();
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
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$AddPhotosTitle$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar5, int i19) {
                    ImagesViewKt.d(z11, z12, z13, onUploadClicked, aVar5, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a h11 = aVar.h(1465735807);
        if (i11 == 0 && h11.i()) {
            h11.L();
            aVar2 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1465735807, i11, -1, "com.forsale.app.features.postad.media.mediaScreenView.DragAndDropHint (ImagesView.kt:252)");
            }
            androidx.compose.ui.c k11 = PaddingKt.k(androidx.compose.ui.c.f7566a, e2.h.l(8), 0.0f, 2, null);
            Arrangement.f o11 = Arrangement.f3698a.o(e2.h.l(4));
            h11.C(693286680);
            a0 a11 = androidx.compose.foundation.layout.o.a(o11, v0.b.f74009a.l(), h11, 6);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(k11);
            if (!(h11.k() instanceof j0.d)) {
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
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            ImageKt.a(p1.e.d(q0.f69802t0, h11, 0), null, null, null, null, 0.0f, null, h11, 56, 124);
            String b12 = p1.g.b(y0.Mb, h11, 0);
            dk.a aVar3 = dk.a.f54291a;
            int i12 = dk.a.f54292b;
            androidx.compose.ui.text.a0 h12 = aVar3.c(h11, i12).h();
            long k12 = aVar3.a(h11, i12).e().k(h11, yj.d.f76453b);
            aVar2 = h11;
            TextKt.a(b12, null, 0, 0, false, 0, 0, null, h12, k12, 0, h11, 0, 0, 1278);
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
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$DragAndDropHint$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i13) {
                    ImagesViewKt.e(aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void f(final g00.p<? super b10.a, ? super b10.a, p> onMoveImages, final l<? super bf.a, p> onViewImage, final l<? super bf.a, p> onDeleteImage, final l<? super bf.a, p> onEditImage, final g00.a<p> onOptionsClicked, final g00.a<p> onCancelClicked, final List<bf.a> images, final Integer num, androidx.compose.runtime.a aVar, final int i11) {
        boolean z11;
        o.i(onMoveImages, "onMoveImages");
        o.i(onViewImage, "onViewImage");
        o.i(onDeleteImage, "onDeleteImage");
        o.i(onEditImage, "onEditImage");
        o.i(onOptionsClicked, "onOptionsClicked");
        o.i(onCancelClicked, "onCancelClicked");
        o.i(images, "images");
        androidx.compose.runtime.a h11 = aVar.h(-1761367339);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1761367339, i11, -1, "com.forsale.app.features.postad.media.mediaScreenView.ImagesListView (ImagesView.kt:281)");
        }
        LazyListState c11 = LazyListStateKt.c(0, 0, h11, 0, 3);
        if (h11.q(CompositionLocalsKt.j()) == LayoutDirection.Rtl) {
            z11 = true;
        } else {
            z11 = false;
        }
        h11.C(1157296644);
        boolean T = h11.T(onMoveImages);
        Object D = h11.D();
        if (T || D == androidx.compose.runtime.a.f7182a.a()) {
            D = new g00.p<Integer, Integer, p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$ImagesListView$dragDropState$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(int i12, int i13) {
                    onMoveImages.invoke(new b10.a(i12, ""), new b10.a(i13, ""));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(Integer num2, Integer num3) {
                    b(num2.intValue(), num3.intValue());
                    return p.f75480a;
                }
            };
            h11.u(D);
        }
        h11.S();
        final DragDropState c12 = DragAndDropKt.c(c11, z11, (g00.p) D, h11, 0);
        float f11 = 12;
        LazyDslKt.b(DragAndDropKt.b(androidx.compose.ui.c.f7566a, c12), c11, PaddingKt.e(e2.h.l(f11), 0.0f, e2.h.l(f11), 0.0f, 10, null), false, Arrangement.f3698a.o(e2.h.l(8)), null, null, false, new l<LazyListScope, p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$ImagesListView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void b(LazyListScope LazyRow) {
                l<Integer, Object> lVar;
                o.i(LazyRow, "$this$LazyRow");
                final List<bf.a> list = images;
                final AnonymousClass1 anonymousClass1 = new g00.p<Integer, bf.a, Object>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$ImagesListView$1.1
                    public final Object b(int i12, bf.a image) {
                        o.i(image, "image");
                        return image.c();
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ Object invoke(Integer num2, bf.a aVar2) {
                        return b(num2.intValue(), aVar2);
                    }
                };
                final DragDropState dragDropState = c12;
                final l<bf.a, p> lVar2 = onViewImage;
                final l<bf.a, p> lVar3 = onEditImage;
                final g00.a<p> aVar2 = onOptionsClicked;
                final l<bf.a, p> lVar4 = onDeleteImage;
                final g00.a<p> aVar3 = onCancelClicked;
                int size = list.size();
                if (anonymousClass1 != null) {
                    lVar = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001d: CONSTRUCTOR  (r1v5 'lVar' g00.l<java.lang.Integer, java.lang.Object>) = 
                          (r0v1 'anonymousClass1' com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$ImagesListView$1$1 A[DONT_INLINE])
                          (r2v0 'list' java.util.List<bf.a> A[DONT_INLINE])
                         call: com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$ImagesListView$1$invoke$$inlined$itemsIndexed$default$1.<init>(g00.p, java.util.List):void type: CONSTRUCTOR in method: com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$ImagesListView$1.b(androidx.compose.foundation.lazy.LazyListScope):void, file: classes2.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$ImagesListView$1$invoke$$inlined$itemsIndexed$default$1, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                        	... 21 more
                        */
                    /*
                        this = this;
                        java.lang.String r0 = "$this$LazyRow"
                        kotlin.jvm.internal.o.i(r13, r0)
                        java.util.List<bf.a> r2 = r1
                        com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$ImagesListView$1$1 r0 = new g00.p<java.lang.Integer, bf.a, java.lang.Object>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$ImagesListView$1.1
                            static {
                                /*
                                    com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$ImagesListView$1$1 r0 = new com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$ImagesListView$1$1
                                    r0.<init>()
                                    
                                    // error: 0x0005: SPUT  (r0 I:com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$ImagesListView$1$1) com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$ImagesListView$1.1.a com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$ImagesListView$1$1
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$ImagesListView$1.AnonymousClass1.<clinit>():void");
                            }

                            {
                                /*
                                    r1 = this;
                                    r0 = 2
                                    r1.<init>(r0)
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$ImagesListView$1.AnonymousClass1.<init>():void");
                            }

                            public final java.lang.Object b(int r1, bf.a r2) {
                                /*
                                    r0 = this;
                                    java.lang.String r1 = "image"
                                    kotlin.jvm.internal.o.i(r2, r1)
                                    java.lang.String r1 = r2.c()
                                    return r1
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$ImagesListView$1.AnonymousClass1.b(int, bf.a):java.lang.Object");
                            }

                            @Override // g00.p
                            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Integer r1, bf.a r2) {
                                /*
                                    r0 = this;
                                    java.lang.Number r1 = (java.lang.Number) r1
                                    int r1 = r1.intValue()
                                    bf.a r2 = (bf.a) r2
                                    java.lang.Object r1 = r0.b(r1, r2)
                                    return r1
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$ImagesListView$1.AnonymousClass1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                            }
                        }
                        com.forsale.app.features.postad.media.mediaScreenView.DragDropState r3 = r2
                        g00.l<bf.a, wz.p> r4 = r3
                        g00.l<bf.a, wz.p> r5 = r4
                        g00.a<wz.p> r6 = r5
                        g00.l<bf.a, wz.p> r7 = r6
                        g00.a<wz.p> r8 = r7
                        int r9 = r2.size()
                        if (r0 == 0) goto L21
                        com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$ImagesListView$1$invoke$$inlined$itemsIndexed$default$1 r1 = new com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$ImagesListView$1$invoke$$inlined$itemsIndexed$default$1
                        r1.<init>(r0, r2)
                        goto L22
                    L21:
                        r1 = 0
                    L22:
                        r0 = r1
                        com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$ImagesListView$1$invoke$$inlined$itemsIndexed$default$2 r10 = new com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$ImagesListView$1$invoke$$inlined$itemsIndexed$default$2
                        r10.<init>(r2)
                        com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$ImagesListView$1$invoke$$inlined$itemsIndexed$default$3 r11 = new com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$ImagesListView$1$invoke$$inlined$itemsIndexed$default$3
                        r1 = r11
                        r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                        r1 = -1091073711(0xffffffffbef78951, float:-0.48346952)
                        r2 = 1
                        r0.a r1 = r0.b.c(r1, r2, r11)
                        r13.f(r9, r0, r10, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$ImagesListView$1.b(androidx.compose.foundation.lazy.LazyListScope):void");
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(LazyListScope lazyListScope) {
                    b(lazyListScope);
                    return p.f75480a;
                }
            }, h11, 24960, 232);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$ImagesListView$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        ImagesViewKt.f(onMoveImages, onViewImage, onDeleteImage, onEditImage, onOptionsClicked, onCancelClicked, images, num, aVar2, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num2) {
                        b(aVar2, num2.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        public static final void g(final g00.p<? super b10.a, ? super b10.a, p> onMoveImages, final l<? super bf.a, p> onViewImage, final l<? super bf.a, p> onDeleteImage, final l<? super bf.a, p> onEditImage, final g00.a<p> onOptionsClicked, final SnapshotStateList<bf.a> images, final int i11, final Integer num, final g00.a<p> onCancelClicked, androidx.compose.runtime.a aVar, final int i12) {
            int i13;
            androidx.compose.runtime.a aVar2;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i21;
            int i22;
            int i23;
            o.i(onMoveImages, "onMoveImages");
            o.i(onViewImage, "onViewImage");
            o.i(onDeleteImage, "onDeleteImage");
            o.i(onEditImage, "onEditImage");
            o.i(onOptionsClicked, "onOptionsClicked");
            o.i(images, "images");
            o.i(onCancelClicked, "onCancelClicked");
            androidx.compose.runtime.a h11 = aVar.h(647523821);
            if ((i12 & 14) == 0) {
                if (h11.F(onMoveImages)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i13 = i23 | i12;
            } else {
                i13 = i12;
            }
            if ((i12 & 112) == 0) {
                if (h11.F(onViewImage)) {
                    i22 = 32;
                } else {
                    i22 = 16;
                }
                i13 |= i22;
            }
            if ((i12 & 896) == 0) {
                if (h11.F(onDeleteImage)) {
                    i21 = 256;
                } else {
                    i21 = 128;
                }
                i13 |= i21;
            }
            if ((i12 & 7168) == 0) {
                if (h11.F(onEditImage)) {
                    i19 = RecyclerView.l.FLAG_MOVED;
                } else {
                    i19 = 1024;
                }
                i13 |= i19;
            }
            if ((i12 & 57344) == 0) {
                if (h11.F(onOptionsClicked)) {
                    i18 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i18 = 8192;
                }
                i13 |= i18;
            }
            if ((i12 & 458752) == 0) {
                if (h11.T(images)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i13 |= i17;
            }
            if ((i12 & 3670016) == 0) {
                if (h11.d(i11)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i13 |= i16;
            }
            if ((i12 & 29360128) == 0) {
                if (h11.T(num)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i13 |= i15;
            }
            if ((i12 & 234881024) == 0) {
                if (h11.F(onCancelClicked)) {
                    i14 = 67108864;
                } else {
                    i14 = 33554432;
                }
                i13 |= i14;
            }
            if ((i13 & 191739611) == 38347922 && h11.i()) {
                h11.L();
                aVar2 = h11;
            } else {
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(647523821, i13, -1, "com.forsale.app.features.postad.media.mediaScreenView.ImagesSelectedStateView (ImagesView.kt:239)");
                }
                androidx.compose.ui.c k11 = PaddingKt.k(androidx.compose.ui.c.f7566a, 0.0f, e2.h.l(12), 1, null);
                Arrangement.f o11 = Arrangement.f3698a.o(e2.h.l(8));
                h11.C(-483455358);
                a0 a11 = androidx.compose.foundation.layout.e.a(o11, v0.b.f74009a.k(), h11, 6);
                h11.C(-1323940314);
                int a12 = j0.e.a(h11, 0);
                k s11 = h11.s();
                ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                g00.a<ComposeUiNode> a13 = companion.a();
                q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(k11);
                if (!(h11.k() instanceof j0.d)) {
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
                c11.invoke(e1.a(e1.b(h11)), h11, 0);
                h11.C(2058660585);
                w.f fVar = w.f.f74891a;
                f(onMoveImages, onViewImage, onDeleteImage, onEditImage, onOptionsClicked, onCancelClicked, images, num, h11, (i13 & 14) | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | ((i13 >> 9) & 458752) | ((i13 << 3) & 3670016) | (29360128 & i13));
                aVar2 = h11;
                j(images.size(), i11, aVar2, (i13 >> 15) & 112);
                e(aVar2, 0);
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
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$ImagesSelectedStateView$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar3, int i24) {
                        ImagesViewKt.g(onMoveImages, onViewImage, onDeleteImage, onEditImage, onOptionsClicked, images, i11, num, onCancelClicked, aVar3, v0.a(i12 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num2) {
                        b(aVar3, num2.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        public static final void h(final g00.a<p> onUploadClicked, final g00.p<? super b10.a, ? super b10.a, p> onMoveImages, final l<? super bf.a, p> onViewImage, final l<? super bf.a, p> onDeleteImage, final l<? super bf.a, p> onEditImage, final g00.a<p> onOptionsClicked, final SnapshotStateList<bf.a> images, final int i11, final Integer num, final g00.a<p> onCancelClicked, androidx.compose.runtime.a aVar, final int i12) {
            int i13;
            androidx.compose.runtime.a aVar2;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i21;
            int i22;
            int i23;
            int i24;
            o.i(onUploadClicked, "onUploadClicked");
            o.i(onMoveImages, "onMoveImages");
            o.i(onViewImage, "onViewImage");
            o.i(onDeleteImage, "onDeleteImage");
            o.i(onEditImage, "onEditImage");
            o.i(onOptionsClicked, "onOptionsClicked");
            o.i(images, "images");
            o.i(onCancelClicked, "onCancelClicked");
            androidx.compose.runtime.a h11 = aVar.h(-2114562129);
            if ((i12 & 14) == 0) {
                if (h11.F(onUploadClicked)) {
                    i24 = 4;
                } else {
                    i24 = 2;
                }
                i13 = i24 | i12;
            } else {
                i13 = i12;
            }
            if ((i12 & 112) == 0) {
                if (h11.F(onMoveImages)) {
                    i23 = 32;
                } else {
                    i23 = 16;
                }
                i13 |= i23;
            }
            if ((i12 & 896) == 0) {
                if (h11.F(onViewImage)) {
                    i22 = 256;
                } else {
                    i22 = 128;
                }
                i13 |= i22;
            }
            if ((i12 & 7168) == 0) {
                if (h11.F(onDeleteImage)) {
                    i21 = RecyclerView.l.FLAG_MOVED;
                } else {
                    i21 = 1024;
                }
                i13 |= i21;
            }
            if ((57344 & i12) == 0) {
                if (h11.F(onEditImage)) {
                    i19 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i19 = 8192;
                }
                i13 |= i19;
            }
            if ((458752 & i12) == 0) {
                if (h11.F(onOptionsClicked)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i13 |= i18;
            }
            if ((3670016 & i12) == 0) {
                if (h11.T(images)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i13 |= i17;
            }
            if ((29360128 & i12) == 0) {
                if (h11.d(i11)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i13 |= i16;
            }
            if ((234881024 & i12) == 0) {
                if (h11.T(num)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i13 |= i15;
            }
            if ((1879048192 & i12) == 0) {
                if (h11.F(onCancelClicked)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i13 |= i14;
            }
            final int i25 = i13;
            if ((1533916891 & i25) == 306783378 && h11.i()) {
                h11.L();
                aVar2 = h11;
            } else {
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-2114562129, i25, -1, "com.forsale.app.features.postad.media.mediaScreenView.ImagesView (ImagesView.kt:147)");
                }
                aVar2 = h11;
                androidx.compose.material.e.a(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), c0.g.c(e2.h.l(8)), dk.a.f54291a.a(h11, dk.a.f54292b).g().c(h11, yj.d.f76453b), 0L, null, 0.0f, r0.b.b(aVar2, 1447292652, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$ImagesView$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar3, int i26) {
                        if ((i26 & 11) == 2 && aVar3.i()) {
                            aVar3.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(1447292652, i26, -1, "com.forsale.app.features.postad.media.mediaScreenView.ImagesView.<anonymous> (ImagesView.kt:153)");
                        }
                        if (images.isEmpty()) {
                            aVar3.C(-1516546640);
                            ImagesViewKt.i(onUploadClicked, i11 - images.size(), aVar3, i25 & 14);
                            aVar3.S();
                        } else {
                            aVar3.C(-1516546455);
                            g00.p<b10.a, b10.a, p> pVar = onMoveImages;
                            l<bf.a, p> lVar = onViewImage;
                            l<bf.a, p> lVar2 = onDeleteImage;
                            l<bf.a, p> lVar3 = onEditImage;
                            g00.a<p> aVar4 = onOptionsClicked;
                            SnapshotStateList<bf.a> snapshotStateList = images;
                            int i27 = i11;
                            Integer num2 = num;
                            g00.a<p> aVar5 = onCancelClicked;
                            int i28 = i25;
                            ImagesViewKt.g(pVar, lVar, lVar2, lVar3, aVar4, snapshotStateList, i27, num2, aVar5, aVar3, ((i28 >> 3) & 14) | ((i28 >> 3) & 112) | ((i28 >> 3) & 896) | ((i28 >> 3) & 7168) | ((i28 >> 3) & 57344) | ((i28 >> 3) & 458752) | ((i28 >> 3) & 3670016) | ((i28 >> 3) & 29360128) | ((i28 >> 3) & 234881024));
                            aVar3.S();
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num2) {
                        b(aVar3, num2.intValue());
                        return p.f75480a;
                    }
                }), aVar2, 1572870, 56);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }
            d1 l11 = aVar2.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$ImagesView$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar3, int i26) {
                        ImagesViewKt.h(onUploadClicked, onMoveImages, onViewImage, onDeleteImage, onEditImage, onOptionsClicked, images, i11, num, onCancelClicked, aVar3, v0.a(i12 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num2) {
                        b(aVar3, num2.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        public static final void i(final g00.a<p> onUploadClicked, final int i11, androidx.compose.runtime.a aVar, final int i12) {
            int i13;
            androidx.compose.runtime.a aVar2;
            int i14;
            int i15;
            o.i(onUploadClicked, "onUploadClicked");
            androidx.compose.runtime.a h11 = aVar.h(-1170784092);
            if ((i12 & 14) == 0) {
                if (h11.F(onUploadClicked)) {
                    i15 = 4;
                } else {
                    i15 = 2;
                }
                i13 = i15 | i12;
            } else {
                i13 = i12;
            }
            if ((i12 & 112) == 0) {
                if (h11.d(i11)) {
                    i14 = 32;
                } else {
                    i14 = 16;
                }
                i13 |= i14;
            }
            if ((i13 & 91) == 18 && h11.i()) {
                h11.L();
                aVar2 = h11;
            } else {
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-1170784092, i13, -1, "com.forsale.app.features.postad.media.mediaScreenView.NoImageSelectedStateView (ImagesView.kt:174)");
                }
                c.a aVar3 = androidx.compose.ui.c.f7566a;
                float f11 = 16;
                androidx.compose.ui.c j11 = PaddingKt.j(aVar3, e2.h.l(f11), e2.h.l(12));
                b.InterfaceC0889b g11 = v0.b.f74009a.g();
                h11.C(-483455358);
                a0 a11 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), g11, h11, 48);
                h11.C(-1323940314);
                int a12 = j0.e.a(h11, 0);
                k s11 = h11.s();
                ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                g00.a<ComposeUiNode> a13 = companion.a();
                q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(j11);
                if (!(h11.k() instanceof j0.d)) {
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
                c11.invoke(e1.a(e1.b(h11)), h11, 0);
                h11.C(2058660585);
                w.f fVar = w.f.f74891a;
                c0.f f12 = c0.g.f();
                dk.a aVar4 = dk.a.f54291a;
                int i16 = dk.a.f54292b;
                yj.d e11 = aVar4.a(h11, i16).e();
                int i17 = yj.d.f76453b;
                long h12 = e11.h(h11, i17);
                androidx.compose.ui.c p11 = SizeKt.p(aVar3, e2.h.l(56));
                ComposableSingletons$ImagesViewKt composableSingletons$ImagesViewKt = ComposableSingletons$ImagesViewKt.f36014a;
                SurfaceKt.c(p11, f12, h12, 0L, null, 0.0f, composableSingletons$ImagesViewKt.b(), h11, 1572870, 56);
                SpacerKt.a(SizeKt.i(aVar3, e2.h.l(8)), h11, 6);
                String b12 = p1.g.b(y0.f70508ic, h11, 0);
                androidx.compose.ui.text.a0 a15 = aVar4.c(h11, i16).a();
                f.a aVar5 = b2.f.f16081b;
                TextKt.a(b12, null, aVar5.a(), 0, false, 0, 0, null, a15, 0L, 0, h11, 0, 0, 1786);
                SpacerKt.a(SizeKt.i(aVar3, e2.h.l(4)), h11, 6);
                TextKt.a(p1.g.c(y0.f70491hc, new Object[]{Integer.valueOf(i11)}, h11, 64), SizeKt.h(aVar3, 0.0f, 1, null), aVar5.a(), 0, false, 0, 0, null, aVar4.c(h11, i16).d(), aVar4.a(h11, i16).e().j(h11, i17), 0, h11, 48, 0, 1272);
                SpacerKt.a(SizeKt.i(aVar3, e2.h.l(f11)), h11, 6);
                aVar2 = h11;
                ButtonsKt.e(onUploadClicked, SizeKt.h(aVar3, 0.0f, 1, null), ButtonData.f40994a.c(), false, false, null, composableSingletons$ImagesViewKt.c(), h11, 1572912 | (i13 & 14) | (ButtonData.f40995b << 6), 56);
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
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$NoImageSelectedStateView$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar6, int i18) {
                        ImagesViewKt.i(onUploadClicked, i11, aVar6, v0.a(i12 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar6, Integer num) {
                        b(aVar6, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        public static final void j(final int i11, final int i12, androidx.compose.runtime.a aVar, final int i13) {
            int i14;
            boolean z11;
            long m11;
            String str;
            androidx.compose.runtime.a aVar2;
            int i15;
            int i16;
            androidx.compose.runtime.a h11 = aVar.h(-1643253419);
            if ((i13 & 14) == 0) {
                if (h11.d(i11)) {
                    i16 = 4;
                } else {
                    i16 = 2;
                }
                i14 = i16 | i13;
            } else {
                i14 = i13;
            }
            if ((i13 & 112) == 0) {
                if (h11.d(i12)) {
                    i15 = 32;
                } else {
                    i15 = 16;
                }
                i14 |= i15;
            }
            if ((i14 & 91) == 18 && h11.i()) {
                h11.L();
                aVar2 = h11;
            } else {
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-1643253419, i13, -1, "com.forsale.app.features.postad.media.mediaScreenView.PickingCounter (ImagesView.kt:409)");
                }
                if (i11 >= i12) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    h11.C(464655830);
                    m11 = dk.a.f54291a.a(h11, dk.a.f54292b).d().i(h11, yj.d.f76453b);
                } else {
                    h11.C(464655878);
                    m11 = dk.a.f54291a.a(h11, dk.a.f54292b).e().m(h11, yj.d.f76453b);
                }
                h11.S();
                long j11 = m11;
                h11.C(464655920);
                if (z11) {
                    str = p1.g.b(y0.f70372ac, h11, 0);
                } else {
                    str = "";
                }
                h11.S();
                aVar2 = h11;
                TextKt.a(p1.g.c(y0.Nb, new Object[]{Integer.valueOf(i11), Integer.valueOf(i12), str}, h11, 64), PaddingKt.k(androidx.compose.ui.c.f7566a, e2.h.l(12), 0.0f, 2, null), 0, 0, false, 0, 0, null, dk.a.f54291a.c(h11, dk.a.f54292b).c(), j11, 0, aVar2, 48, 0, 1276);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }
            d1 l11 = aVar2.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.ImagesViewKt$PickingCounter$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar3, int i17) {
                        ImagesViewKt.j(i11, i12, aVar3, v0.a(i13 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                        b(aVar3, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }
    }
