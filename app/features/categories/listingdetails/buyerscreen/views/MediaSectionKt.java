package com.forsale.app.features.categories.listingdetails.buyerscreen.views;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.recyclerview.widget.RecyclerView;
import b1.t1;
import coil.compose.AsyncImagePainter;
import com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.MediaTypes;
import com.forsale.app.utils.Languages;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.buttons.ButtonData;
import com.forsale.designSystem.buttons.ButtonsKt;
import com.forsale.designSystem.dividers.DividersKt;
import com.forsale.designSystem.iconography.IconKt;
import com.forsale.designSystem.tags.TagData;
import com.forsale.designSystem.tags.TagsKt;
import com.google.accompanist.pager.Pager;
import com.google.accompanist.pager.PagerState;
import com.google.accompanist.pager.PagerStateKt;
import e2.h;
import g00.l;
import g00.q;
import g00.r;
import j0.d;
import j0.d1;
import j0.e1;
import j0.k;
import j0.v0;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.o;
import okhttp3.internal.http2.Http2;
import r5.g;
import t9.q0;
import v0.b;
import w.f;
import w.t;
import w.u;
import wz.p;
/* compiled from: MediaSection.kt */
/* loaded from: classes2.dex */
public final class MediaSectionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final int i11, final int i12, final t tVar, a aVar, final int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        a h11 = aVar.h(-432799057);
        if ((i13 & 14) == 0) {
            if (h11.d(i11)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i14 = i17 | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 112) == 0) {
            if (h11.d(i12)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i14 |= i16;
        }
        if ((i13 & 896) == 0) {
            if (h11.T(tVar)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i14 |= i15;
        }
        if ((i14 & 731) == 146 && h11.i()) {
            h11.L();
        } else {
            if (c.I()) {
                c.U(-432799057, i13, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.ImageIndicator (MediaSection.kt:176)");
            }
            androidx.compose.ui.c h12 = SizeKt.h(PaddingKt.m(androidx.compose.ui.c.f7566a, 0.0f, 0.0f, h.l(16), 0.0f, 11, null), 0.0f, 1, null);
            b.InterfaceC0889b j11 = b.f74009a.j();
            h11.C(-483455358);
            a0 a11 = e.a(Arrangement.f3698a.h(), j11, h11, 48);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(h12);
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
            TagData a15 = TagData.f42177a.a();
            dk.a aVar2 = dk.a.f54291a;
            int i18 = dk.a.f54292b;
            yj.d g11 = aVar2.a(h11, i18).g();
            int i19 = yj.d.f76453b;
            TagsKt.a(null, a15, t1.o(g11.d(h11, i19), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), aVar2.a(h11, i18).g().d(h11, i19), r0.b.b(h11, -373964869, true, new q<t, a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.MediaSectionKt$ImageIndicator$1$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void b(t Tag, a aVar3, int i21) {
                    String m11;
                    o.i(Tag, "$this$Tag");
                    if ((i21 & 81) == 16 && aVar3.i()) {
                        aVar3.L();
                        return;
                    }
                    if (c.I()) {
                        c.U(-373964869, i21, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.ImageIndicator.<anonymous>.<anonymous>.<anonymous> (MediaSection.kt:189)");
                    }
                    Painter d11 = p1.e.d(q0.G0, aVar3, 0);
                    dk.a aVar4 = dk.a.f54291a;
                    int i22 = dk.a.f54292b;
                    yj.d g12 = aVar4.a(aVar3, i22).g();
                    int i23 = yj.d.f76453b;
                    float f11 = 16;
                    IconKt.a(d11, SizeKt.u(SizeKt.i(androidx.compose.ui.c.f7566a, h.l(f11)), h.l(f11)), null, g12.c(aVar3, i23), false, 0.0f, aVar3, 56, 52);
                    m11 = MediaSectionKt.m(i11, i12);
                    TextKt.a(m11, null, 0, 0, false, 0, 0, null, null, aVar4.a(aVar3, i22).g().c(aVar3, i23), 0, aVar3, 0, 0, 1534);
                    if (c.I()) {
                        c.T();
                    }
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(t tVar2, a aVar3, Integer num) {
                    b(tVar2, aVar3, num.intValue());
                    return p.f75480a;
                }
            }), h11, (TagData.f42178b << 3) | 24576, 1);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.MediaSectionKt$ImageIndicator$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar3, int i21) {
                    MediaSectionKt.a(i11, i12, tVar, aVar3, v0.a(i13 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void b(final List<String> list, final String str, final BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.VirtualTour virtualTour, final l<? super MediaTypes.Images, p> onImageClicked, final l<? super String, p> onVideoClicked, final l<? super MediaTypes.ThreeDTour, p> onVirtualTourClicked, a aVar, final int i11) {
        boolean z11;
        o.i(onImageClicked, "onImageClicked");
        o.i(onVideoClicked, "onVideoClicked");
        o.i(onVirtualTourClicked, "onVirtualTourClicked");
        a h11 = aVar.h(-1739771451);
        if (c.I()) {
            c.U(-1739771451, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.MediaSection (MediaSection.kt:61)");
        }
        List<String> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            int size = list2.size();
            PagerState a11 = PagerStateKt.a(0, h11, 6, 0);
            h11.C(-483455358);
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            Arrangement.m h12 = Arrangement.f3698a.h();
            b.a aVar3 = b.f74009a;
            a0 a12 = e.a(h12, aVar3.k(), h11, 0);
            h11.C(-1323940314);
            int a13 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a14 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(aVar2);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a14);
            } else {
                h11.t();
            }
            a a15 = Updater.a(h11);
            Updater.c(a15, a12, companion.e());
            Updater.c(a15, s11, companion.g());
            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
            if (a15.f() || !o.d(a15.D(), Integer.valueOf(a13))) {
                a15.u(Integer.valueOf(a13));
                a15.p(Integer.valueOf(a13), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            f fVar = f.f74891a;
            androidx.compose.ui.c a16 = ni.a.a(aVar2);
            h11.C(733328855);
            a0 g11 = BoxKt.g(aVar3.o(), false, h11, 0);
            h11.C(-1323940314);
            int a17 = j0.e.a(h11, 0);
            k s12 = h11.s();
            g00.a<ComposeUiNode> a18 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c12 = LayoutKt.c(a16);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a18);
            } else {
                h11.t();
            }
            a a19 = Updater.a(h11);
            Updater.c(a19, g11, companion.e());
            Updater.c(a19, s12, companion.g());
            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
            if (a19.f() || !o.d(a19.D(), Integer.valueOf(a17))) {
                a19.u(Integer.valueOf(a17));
                a19.p(Integer.valueOf(a17), b12);
            }
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
            float f11 = 0;
            Pager.a(size, null, a11, false, h.l(f11), PaddingKt.d(h.l(f11), h.l(f11), h.l(f11), h.l(f11)), null, null, null, true, r0.b.b(h11, 90840225, true, new r<lk.a, Integer, a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.MediaSectionKt$MediaSection$1$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(4);
                }

                public final void b(lk.a HorizontalPager, final int i12, a aVar4, int i13) {
                    int i14;
                    o.i(HorizontalPager, "$this$HorizontalPager");
                    if ((i13 & 112) == 0) {
                        if (aVar4.d(i12)) {
                            i14 = 32;
                        } else {
                            i14 = 16;
                        }
                        i13 |= i14;
                    }
                    if ((i13 & 721) == 144 && aVar4.i()) {
                        aVar4.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(90840225, i13, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.MediaSection.<anonymous>.<anonymous>.<anonymous> (MediaSection.kt:81)");
                    }
                    final l<MediaTypes.Images, p> lVar = onImageClicked;
                    final List<String> list3 = list;
                    MediaSectionKt.d(i12, list.get(i12), new l<Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.MediaSectionKt$MediaSection$1$1$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void b(int i15) {
                            String t02;
                            l<MediaTypes.Images, p> lVar2 = lVar;
                            int i16 = i12;
                            t02 = CollectionsKt___CollectionsKt.t0(list3, ",", null, null, 0, null, null, 62, null);
                            lVar2.invoke(new MediaTypes.Images(i16, t02));
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ p invoke(Integer num) {
                            b(num.intValue());
                            return p.f75480a;
                        }
                    }, aVar4, (i13 >> 3) & 14);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.r
                public /* bridge */ /* synthetic */ p d(lk.a aVar4, Integer num, a aVar5, Integer num2) {
                    b(aVar4, num.intValue(), aVar5, num2.intValue());
                    return p.f75480a;
                }
            }), h11, 805334016, 6, 450);
            int i12 = i11 << 6;
            int i13 = i11 << 3;
            c(boxScopeInstance, size, a11.k(), str, virtualTour, onVideoClicked, onVirtualTourClicked, h11, (i12 & 57344) | 6 | (i12 & 7168) | (458752 & i13) | (i13 & 3670016));
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            DividersKt.a(SizeKt.i(SizeKt.h(aVar2, 0.0f, 1, null), h.l(8)), 0.0f, dk.a.f54291a.a(h11, dk.a.f54292b).e().h(h11, yj.d.f76453b), h11, 6, 2);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.MediaSectionKt$MediaSection$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar4, int i14) {
                    MediaSectionKt.b(list, str, virtualTour, onImageClicked, onVideoClicked, onVirtualTourClicked, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final w.c cVar, final int i11, final int i12, final String str, final BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.VirtualTour virtualTour, final l<? super String, p> lVar, final l<? super MediaTypes.ThreeDTour, p> lVar2, a aVar, final int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        a h11 = aVar.h(-634211199);
        if ((i13 & 14) == 0) {
            if (h11.T(cVar)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i14 = i23 | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 112) == 0) {
            if (h11.d(i11)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i14 |= i22;
        }
        if ((i13 & 896) == 0) {
            if (h11.d(i12)) {
                i21 = 256;
            } else {
                i21 = 128;
            }
            i14 |= i21;
        }
        if ((i13 & 7168) == 0) {
            if (h11.T(str)) {
                i19 = RecyclerView.l.FLAG_MOVED;
            } else {
                i19 = 1024;
            }
            i14 |= i19;
        }
        if ((57344 & i13) == 0) {
            if (h11.T(virtualTour)) {
                i18 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i18 = 8192;
            }
            i14 |= i18;
        }
        if ((458752 & i13) == 0) {
            if (h11.F(lVar)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i14 |= i17;
        }
        if ((3670016 & i13) == 0) {
            if (h11.F(lVar2)) {
                i16 = 1048576;
            } else {
                i16 = 524288;
            }
            i14 |= i16;
        }
        if ((2995931 & i14) == 599186 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-634211199, i14, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.MediaSectionIndicators (MediaSection.kt:145)");
            }
            androidx.compose.ui.c m11 = PaddingKt.m(androidx.compose.ui.c.f7566a, 0.0f, 0.0f, 0.0f, h.l(8), 7, null);
            b.a aVar2 = b.f74009a;
            androidx.compose.ui.c h12 = SizeKt.h(cVar.e(m11, aVar2.d()), 0.0f, 1, null);
            b.c i24 = aVar2.i();
            h11.C(693286680);
            a0 a11 = androidx.compose.foundation.layout.o.a(Arrangement.f3698a.g(), i24, h11, 48);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(h12);
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
            u uVar = u.f74924a;
            h11.C(-635062801);
            if (str == null) {
                i15 = 0;
            } else {
                h11.C(511388516);
                boolean T = h11.T(lVar) | h11.T(str);
                Object D = h11.D();
                if (T || D == a.f7182a.a()) {
                    D = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.MediaSectionKt$MediaSectionIndicators$1$1$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
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
                            lVar.invoke(str);
                        }
                    };
                    h11.u(D);
                }
                h11.S();
                i15 = 0;
                e((g00.a) D, h11, 0);
            }
            h11.S();
            h11.C(-635062653);
            if (virtualTour != null) {
                f(new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.MediaSectionKt$MediaSectionIndicators$1$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
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
                        lVar2.invoke(new MediaTypes.ThreeDTour(virtualTour));
                    }
                }, h11, i15);
            }
            h11.S();
            h11.C(1499217092);
            if (i11 > 1) {
                a(i12, i11, uVar, h11, (i14 & 112) | ((i14 >> 6) & 14) | 384);
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
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.MediaSectionKt$MediaSectionIndicators$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar3, int i25) {
                    MediaSectionKt.c(w.c.this, i11, i12, str, virtualTour, lVar, lVar2, aVar3, v0.a(i13 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final int i11, final String str, final l<? super Integer, p> lVar, a aVar, final int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        a h11 = aVar.h(1520140462);
        if ((i12 & 14) == 0) {
            if (h11.d(i11)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i13 = i16 | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            if (h11.T(str)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i12 & 896) == 0) {
            if (h11.F(lVar)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i13 |= i14;
        }
        if ((i13 & 731) == 146 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1520140462, i13, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.PagerItem (MediaSection.kt:118)");
            }
            AsyncImagePainter a11 = h5.d.a(new g.a((Context) h11.q(AndroidCompositionLocals_androidKt.g())).b(str).d(q0.f69731b1).h(q0.f69731b1).e(q0.f69731b1).a(), null, null, null, 0, h11, 8, 30);
            androidx.compose.ui.layout.c c11 = androidx.compose.ui.layout.c.f8188a.c();
            androidx.compose.ui.c b11 = AspectRatioKt.b(androidx.compose.ui.c.f7566a, 1.7777778f, false, 2, null);
            Integer valueOf = Integer.valueOf(i11);
            h11.C(511388516);
            boolean T = h11.T(valueOf) | h11.T(lVar);
            Object D = h11.D();
            if (T || D == a.f7182a.a()) {
                D = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.MediaSectionKt$PagerItem$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
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
                        lVar.invoke(Integer.valueOf(i11));
                    }
                };
                h11.u(D);
            }
            h11.S();
            ImageKt.a(a11, "", TestTagKt.a(ClickableKt.e(b11, false, null, null, (g00.a) D, 7, null), "img"), null, c11, 0.0f, null, h11, 24624, 104);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.MediaSectionKt$PagerItem$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar2, int i17) {
                    MediaSectionKt.d(i11, str, lVar, aVar2, v0.a(i12 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final g00.a<p> aVar, a aVar2, final int i11) {
        int i12;
        a aVar3;
        int i13;
        a h11 = aVar2.h(1353345306);
        if ((i11 & 14) == 0) {
            if (h11.F(aVar)) {
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
            aVar3 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1353345306, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.VideoButton (MediaSection.kt:214)");
            }
            ButtonData e11 = ButtonData.f40994a.e();
            long c11 = dk.a.f54291a.a(h11, dk.a.f54292b).g().c(h11, yj.d.f76453b);
            androidx.compose.ui.c a11 = TestTagKt.a(PaddingKt.m(androidx.compose.ui.c.f7566a, h.l(16), 0.0f, 0.0f, 0.0f, 14, null), "btnVideo");
            h11.C(1157296644);
            boolean T = h11.T(aVar);
            Object D = h11.D();
            if (T || D == a.f7182a.a()) {
                D = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.MediaSectionKt$VideoButton$1$1
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
            ButtonsKt.d((g00.a) D, a11, e11, null, t1.g(c11), null, null, false, null, null, ComposableSingletons$MediaSectionKt.f26881a.a(), h11, (ButtonData.f40995b << 6) | 48, 6, 1000);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar3.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.MediaSectionKt$VideoButton$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar4, int i14) {
                    MediaSectionKt.e(aVar, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final g00.a<p> aVar, a aVar2, final int i11) {
        int i12;
        a aVar3;
        int i13;
        a h11 = aVar2.h(1610851858);
        if ((i11 & 14) == 0) {
            if (h11.F(aVar)) {
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
            aVar3 = h11;
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1610851858, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.VirtualTourButton (MediaSection.kt:237)");
            }
            ButtonData e11 = ButtonData.f40994a.e();
            long c11 = dk.a.f54291a.a(h11, dk.a.f54292b).g().c(h11, yj.d.f76453b);
            androidx.compose.ui.c a11 = TestTagKt.a(PaddingKt.m(androidx.compose.ui.c.f7566a, h.l(16), 0.0f, 0.0f, 0.0f, 14, null), "btnVirtualTour");
            h11.C(1157296644);
            boolean T = h11.T(aVar);
            Object D = h11.D();
            if (T || D == a.f7182a.a()) {
                D = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.MediaSectionKt$VirtualTourButton$1$1
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
            ButtonsKt.d((g00.a) D, a11, e11, null, t1.g(c11), null, null, false, null, null, ComposableSingletons$MediaSectionKt.f26881a.b(), h11, (ButtonData.f40995b << 6) | 48, 6, 1000);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar3.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.MediaSectionKt$VirtualTourButton$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar4, int i14) {
                    MediaSectionKt.f(aVar, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String m(int i11, int i12) {
        if (Languages.Companion.b() == Languages.ENGLISH) {
            return (i11 + 1) + "/" + i12;
        }
        String T = TypeExtensionsKt.T(i12);
        String T2 = TypeExtensionsKt.T(i11 + 1);
        return T + "/" + T2;
    }
}
