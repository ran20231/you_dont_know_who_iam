package com.forsale.app.features.categories.listingdetails.buyerscreen.mainattributes;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper;
import com.forsale.app.features.postad.extraattributes.enums.AttributeType;
import com.forsale.app.utils.composeUtils.FixedGridViewKt;
import com.forsale.designSystem.TextKt;
import e2.h;
import g00.q;
import j0.d;
import j0.d1;
import j0.e;
import j0.e1;
import j0.k;
import j0.v0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import p1.g;
import t9.q0;
import t9.y0;
import v0.b;
import w.f;
import w.u;
import wz.p;
/* compiled from: AdditionalSection.kt */
/* loaded from: classes2.dex */
public final class AdditionalSectionKt {
    public static final void a(final AttributesMapper.AttributesDataModel extraAttribute, a aVar, final int i11) {
        o.i(extraAttribute, "extraAttribute");
        a h11 = aVar.h(1426161190);
        if (c.I()) {
            c.U(1426161190, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.mainattributes.AdditionalItem (AdditionalSection.kt:57)");
        }
        Arrangement.f o11 = Arrangement.f3698a.o(h.l(4));
        androidx.compose.ui.c a11 = TestTagKt.a(androidx.compose.ui.c.f7566a, "additionalDetailsItem");
        h11.C(693286680);
        a0 a12 = androidx.compose.foundation.layout.o.a(o11, b.f74009a.l(), h11, 6);
        h11.C(-1323940314);
        int a13 = e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a14 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(a11);
        if (!(h11.k() instanceof d)) {
            e.c();
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
        u uVar = u.f74924a;
        ImageKt.a(p1.e.d(q0.f69750g0, h11, 0), extraAttribute.b(), null, null, null, 0.0f, null, h11, 8, 124);
        String b12 = extraAttribute.b();
        dk.a aVar2 = dk.a.f54291a;
        int i12 = dk.a.f54292b;
        TextKt.a(b12, null, 0, 0, false, 0, 0, null, aVar2.c(h11, i12).c(), aVar2.a(h11, i12).e().m(h11, yj.d.f76453b), 0, h11, 0, 0, 1278);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (c.I()) {
            c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.mainattributes.AdditionalSectionKt$AdditionalItem$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar3, int i13) {
                    AdditionalSectionKt.a(AttributesMapper.AttributesDataModel.this, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void b(final DetailsModel details, a aVar, final int i11) {
        boolean z11;
        o.i(details, "details");
        a h11 = aVar.h(668124495);
        if (c.I()) {
            c.U(668124495, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.mainattributes.AdditionalSection (AdditionalSection.kt:28)");
        }
        Arrangement arrangement = Arrangement.f3698a;
        float l11 = h.l(8);
        b.a aVar2 = b.f74009a;
        Arrangement.m q11 = arrangement.q(l11, aVar2.i());
        c.a aVar3 = androidx.compose.ui.c.f7566a;
        androidx.compose.ui.c y11 = SizeKt.y(PaddingKt.i(aVar3, h.l(16)), null, false, 3, null);
        h11.C(-483455358);
        a0 a11 = androidx.compose.foundation.layout.e.a(q11, aVar2.k(), h11, 6);
        h11.C(-1323940314);
        int a12 = e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(y11);
        if (!(h11.k() instanceof d)) {
            e.c();
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
        String b12 = g.b(y0.f70395c1, h11, 0);
        dk.a aVar4 = dk.a.f54291a;
        int i12 = dk.a.f54292b;
        TextKt.a(b12, TestTagKt.a(aVar3, "txtAdditionalDetails"), 0, 0, false, 0, 0, null, aVar4.c(h11, i12).l(), aVar4.a(h11, i12).e().m(h11, yj.d.f76453b), 0, h11, 48, 0, 1276);
        h11.C(-749324895);
        List<AttributesMapper.AttributesDataModel> d11 = details.d().d();
        if (d11 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : d11) {
                if (((AttributesMapper.AttributesDataModel) obj).j() == AttributeType.BOOL) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    arrayList.add(obj);
                }
            }
            FixedGridViewKt.a(arrayList, 2, SizeKt.y(androidx.compose.ui.c.f7566a, null, false, 3, null), 0.0f, h.l(12), ComposableSingletons$AdditionalSectionKt.f26074a.a(), h11, 221624, 8);
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
            l12.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.mainattributes.AdditionalSectionKt$AdditionalSection$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar5, int i13) {
                    AdditionalSectionKt.b(DetailsModel.this, aVar5, v0.a(i11 | 1));
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
