package com.forsale.app.features.categories.listingdetails.buyerscreen.media;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.accompanist.pager.Pager;
import com.google.accompanist.pager.PagerState;
import com.google.accompanist.pager.PagerStateKt;
import g00.l;
import g00.q;
import g00.r;
import j0.d1;
import j0.e1;
import j0.k;
import j0.u;
import j0.v0;
import java.util.List;
import kotlin.jvm.internal.o;
import r5.g;
import t9.q0;
import v0.b;
import wz.p;
/* compiled from: VerticalImagePagerSlider.kt */
/* loaded from: classes2.dex */
public final class VerticalImagePagerSliderKt {
    public static final void a(final int i11, final List<String> images, final androidx.compose.ui.c modifier, final l<? super Integer, p> onImageChanged, androidx.compose.runtime.a aVar, final int i12) {
        o.i(images, "images");
        o.i(modifier, "modifier");
        o.i(onImageChanged, "onImageChanged");
        androidx.compose.runtime.a h11 = aVar.h(1924817659);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1924817659, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.media.VerticalImagePagerSlider (VerticalImagePagerSlider.kt:28)");
        }
        int size = images.size();
        PagerState a11 = PagerStateKt.a(i11, h11, i12 & 14, 0);
        h11.C(511388516);
        boolean T = h11.T(a11) | h11.T(onImageChanged);
        Object D = h11.D();
        if (T || D == androidx.compose.runtime.a.f7182a.a()) {
            D = new VerticalImagePagerSliderKt$VerticalImagePagerSlider$1$1(a11, onImageChanged, null);
            h11.u(D);
        }
        h11.S();
        u.d(a11, (g00.p) D, h11, 64);
        androidx.compose.ui.c d11 = SizeKt.d(modifier, 0.0f, 1, null);
        h11.C(693286680);
        Arrangement.e g11 = Arrangement.f3698a.g();
        b.a aVar2 = v0.b.f74009a;
        a0 a12 = androidx.compose.foundation.layout.o.a(g11, aVar2.l(), h11, 0);
        h11.C(-1323940314);
        int a13 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a14 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(d11);
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
        Pager.a(size, w.u.f74924a.c(androidx.compose.ui.c.f7566a, aVar2.i()), a11, false, 0.0f, null, null, null, null, false, r0.b.b(h11, 347306468, true, new r<lk.a, Integer, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.VerticalImagePagerSliderKt$VerticalImagePagerSlider$2$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public final void b(lk.a HorizontalPager, int i13, androidx.compose.runtime.a aVar3, int i14) {
                int i15;
                int i16;
                o.i(HorizontalPager, "$this$HorizontalPager");
                if ((i14 & 112) == 0) {
                    if (aVar3.d(i13)) {
                        i16 = 32;
                    } else {
                        i16 = 16;
                    }
                    i15 = i16 | i14;
                } else {
                    i15 = i14;
                }
                if ((i15 & 721) == 144 && aVar3.i()) {
                    aVar3.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(347306468, i14, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.media.VerticalImagePagerSlider.<anonymous>.<anonymous> (VerticalImagePagerSlider.kt:45)");
                }
                ZoomableImageKt.a(h5.d.a(new g.a((Context) aVar3.q(AndroidCompositionLocals_androidKt.g())).b(images.get(i13)).d(q0.f69731b1).h(q0.f69731b1).e(q0.f69731b1).a(), null, null, null, 0, aVar3, 8, 30), 0.0f, aVar3, 0, 2);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.r
            public /* bridge */ /* synthetic */ p d(lk.a aVar3, Integer num, androidx.compose.runtime.a aVar4, Integer num2) {
                b(aVar3, num.intValue(), aVar4, num2.intValue());
                return p.f75480a;
            }
        }), h11, 3072, 6, 1008);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.VerticalImagePagerSliderKt$VerticalImagePagerSlider$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i13) {
                    VerticalImagePagerSliderKt.a(i11, images, modifier, onImageChanged, aVar3, v0.a(i12 | 1));
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
