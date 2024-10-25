package com.forsale.app.features.categories.listingdetails.buyerscreen.location;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import c0.g;
import com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import com.forsale.app.ui.mapcompose.MapPreviewKt;
import com.forsale.designSystem.TextKt;
import com.forsale.ui.components.flows.FlowKt;
import com.google.android.gms.maps.model.LatLng;
import e2.h;
import falcon.chat.entities.Constants;
import g00.q;
import j0.d1;
import j0.e1;
import j0.k;
import j0.v0;
import java.util.List;
import kotlin.jvm.internal.o;
import t9.y0;
import v0.b;
import w.f;
import w.t;
import w.u;
import wz.p;
import y0.e;
import yj.d;
/* compiled from: LocationSection.kt */
/* loaded from: classes2.dex */
public final class LocationSectionKt {
    public static final void a(final String mark, a aVar, final int i11) {
        int i12;
        a aVar2;
        int i13;
        o.i(mark, "mark");
        a h11 = aVar.h(-430410175);
        if ((i11 & 14) == 0) {
            if (h11.T(mark)) {
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
            if (c.I()) {
                c.U(-430410175, i12, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.location.LandmarkItem (LocationSection.kt:103)");
            }
            c.a aVar3 = androidx.compose.ui.c.f7566a;
            androidx.compose.ui.c a11 = e.a(aVar3, g.c(h.l(8)));
            dk.a aVar4 = dk.a.f54291a;
            int i14 = dk.a.f54292b;
            d e11 = aVar4.a(h11, i14).e();
            int i15 = d.f76453b;
            androidx.compose.ui.c y11 = SizeKt.y(BackgroundKt.b(a11, e11.h(h11, i15), null, 2, null), null, false, 3, null);
            h11.C(733328855);
            b.a aVar5 = b.f74009a;
            a0 g11 = BoxKt.g(aVar5.o(), false, h11, 0);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(y11);
            if (!(h11.k() instanceof j0.d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a13);
            } else {
                h11.t();
            }
            a a14 = Updater.a(h11);
            Updater.c(a14, g11, companion.e());
            Updater.c(a14, s11, companion.g());
            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            aVar2 = h11;
            TextKt.a(mark, BoxScopeInstance.f3756a.e(PaddingKt.j(aVar3, h.l(12), h.l(10)), aVar5.e()), 0, 0, false, 0, 0, null, aVar4.c(h11, i14).c(), aVar4.a(h11, i14).e().m(h11, i15), 0, h11, i12 & 14, 0, 1276);
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
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.location.LocationSectionKt$LandmarkItem$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar6, int i16) {
                    LocationSectionKt.a(mark, aVar6, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar6, Integer num) {
                    b(aVar6, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void b(final DetailsModel details, final g00.p<? super LatLng, ? super Boolean, p> onMapClicked, a aVar, final int i11) {
        String str;
        final List<String> list;
        boolean z11;
        c.a aVar2;
        BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.LocationInfo locationInfo;
        boolean z12;
        BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.LocationInfo locationInfo2;
        BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.LocationInfo locationInfo3;
        o.i(details, "details");
        o.i(onMapClicked, "onMapClicked");
        a h11 = aVar.h(626011110);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(626011110, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.location.LocationSection (LocationSection.kt:41)");
        }
        Arrangement arrangement = Arrangement.f3698a;
        float f11 = 8;
        Arrangement.f o11 = arrangement.o(h.l(f11));
        c.a aVar3 = androidx.compose.ui.c.f7566a;
        androidx.compose.ui.c i12 = PaddingKt.i(aVar3, h.l(16));
        h11.C(-483455358);
        b.a aVar4 = b.f74009a;
        a0 a11 = androidx.compose.foundation.layout.e.a(o11, aVar4.k(), h11, 6);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(i12);
        if (!(h11.k() instanceof j0.d)) {
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
        String b12 = p1.g.b(y0.f70412d1, h11, 0);
        dk.a aVar5 = dk.a.f54291a;
        int i13 = dk.a.f54292b;
        androidx.compose.ui.text.a0 l11 = aVar5.c(h11, i13).l();
        d e11 = aVar5.a(h11, i13).e();
        int i14 = d.f76453b;
        TextKt.a(b12, null, 0, 0, false, 0, 0, null, l11, e11.m(h11, i14), 0, h11, 0, 0, 1278);
        androidx.compose.ui.c h12 = SizeKt.h(aVar3, 0.0f, 1, null);
        h11.C(693286680);
        a0 a15 = androidx.compose.foundation.layout.o.a(arrangement.g(), aVar4.l(), h11, 0);
        h11.C(-1323940314);
        int a16 = j0.e.a(h11, 0);
        k s12 = h11.s();
        g00.a<ComposeUiNode> a17 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, p> c12 = LayoutKt.c(h12);
        if (!(h11.k() instanceof j0.d)) {
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
        g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
        if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
            a18.u(Integer.valueOf(a16));
            a18.p(Integer.valueOf(a16), b13);
        }
        c12.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        u uVar = u.f74924a;
        androidx.compose.ui.c d11 = t.d(uVar, aVar3, 1.0f, false, 2, null);
        h11.C(-483455358);
        a0 a19 = androidx.compose.foundation.layout.e.a(arrangement.h(), aVar4.k(), h11, 0);
        h11.C(-1323940314);
        int a21 = j0.e.a(h11, 0);
        k s13 = h11.s();
        g00.a<ComposeUiNode> a22 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, p> c13 = LayoutKt.c(d11);
        if (!(h11.k() instanceof j0.d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a22);
        } else {
            h11.t();
        }
        a a23 = Updater.a(h11);
        Updater.c(a23, a19, companion.e());
        Updater.c(a23, s13, companion.g());
        g00.p<ComposeUiNode, Integer, p> b14 = companion.b();
        if (a23.f() || !o.d(a23.D(), Integer.valueOf(a21))) {
            a23.u(Integer.valueOf(a21));
            a23.p(Integer.valueOf(a21), b14);
        }
        c13.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        String q11 = details.d().q();
        BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo s14 = details.d().s();
        if (s14 != null && (locationInfo3 = s14.getLocationInfo()) != null) {
            str = locationInfo3.getStreetName();
        } else {
            str = null;
        }
        TextKt.a(q11 + e(str), TestTagKt.a(aVar3, "txtLocation"), 0, 0, false, 0, 0, null, aVar5.c(h11, i13).c(), aVar5.a(h11, i13).e().j(h11, i14), 0, h11, 48, 0, 1276);
        BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo s15 = details.d().s();
        if (s15 != null && (locationInfo2 = s15.getLocationInfo()) != null) {
            list = locationInfo2.getLandmarks();
        } else {
            list = null;
        }
        h11.C(1189337348);
        if (list == null) {
            aVar2 = aVar3;
            z11 = true;
        } else {
            z11 = true;
            aVar2 = aVar3;
            FlowKt.b(TestTagKt.a(aVar3, "txtLandMarks"), null, null, h.l(f11), null, h.l(f11), null, r0.b.b(h11, -13056693, true, new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.location.LocationSectionKt$LocationSection$1$1$1$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar6, int i15) {
                    if ((i15 & 11) == 2 && aVar6.i()) {
                        aVar6.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-13056693, i15, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.location.LocationSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LocationSection.kt:73)");
                    }
                    for (String str2 : list) {
                        LocationSectionKt.a(str2, aVar6, 0);
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar6, Integer num) {
                    b(aVar6, num.intValue());
                    return p.f75480a;
                }
            }), h11, 12782598, 86);
            p pVar = p.f75480a;
        }
        h11.S();
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        h11.C(-326021484);
        if (details.d().C()) {
            b.InterfaceC0889b j11 = aVar4.j();
            androidx.compose.ui.c a24 = TestTagKt.a(t.d(uVar, aVar2, 1.0f, false, 2, null), "map");
            h11.C(-483455358);
            a0 a25 = androidx.compose.foundation.layout.e.a(arrangement.h(), j11, h11, 48);
            h11.C(-1323940314);
            int a26 = j0.e.a(h11, 0);
            k s16 = h11.s();
            g00.a<ComposeUiNode> a27 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c14 = LayoutKt.c(a24);
            if (!(h11.k() instanceof j0.d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a27);
            } else {
                h11.t();
            }
            a a28 = Updater.a(h11);
            Updater.c(a28, a25, companion.e());
            Updater.c(a28, s16, companion.g());
            g00.p<ComposeUiNode, Integer, p> b15 = companion.b();
            if (a28.f() || !o.d(a28.D(), Integer.valueOf(a26))) {
                a28.u(Integer.valueOf(a26));
                a28.p(Integer.valueOf(a26), b15);
            }
            c14.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo s17 = details.d().s();
            if (s17 != null) {
                locationInfo = s17.getLocationInfo();
            } else {
                locationInfo = null;
            }
            h11.C(1189338046);
            if (locationInfo != null) {
                if (locationInfo.getLat() != null && locationInfo.getLon() != null) {
                    LatLng latLng = new LatLng(locationInfo.getLat().doubleValue(), locationInfo.getLon().doubleValue());
                    if (locationInfo.getLocation() == BuyerListingDetailsResponseModel.Location.EXACT) {
                        z12 = z11;
                    } else {
                        z12 = false;
                    }
                    c(latLng, z12, onMapClicked, h11, ((i11 << 3) & 896) | 8);
                }
                p pVar2 = p.f75480a;
            }
            h11.S();
            h11.S();
            h11.w();
            h11.S();
            h11.S();
        }
        h11.S();
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
        d1 l12 = h11.l();
        if (l12 != null) {
            l12.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.location.LocationSectionKt$LocationSection$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar6, int i15) {
                    LocationSectionKt.b(DetailsModel.this, onMapClicked, aVar6, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar6, Integer num) {
                    b(aVar6, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final LatLng latLng, final boolean z11, final g00.p<? super LatLng, ? super Boolean, p> pVar, a aVar, final int i11) {
        a h11 = aVar.h(-2090745566);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-2090745566, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.location.MapSmall (LocationSection.kt:126)");
        }
        MapPreviewKt.e(new wh.a(latLng, com.forsale.app.ui.mapcompose.b.b(z11, null, 2, null), null, 11.0f, 4, null), e.a(SizeKt.i(SizeKt.u(androidx.compose.ui.c.f7566a, h.l((float) Constants.PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION)), h.l(105)), g.c(h.l(8))), new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.location.LocationSectionKt$MapSmall$1
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
                pVar.invoke(latLng, Boolean.valueOf(z11));
            }
        }, h11, 8, 0);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.location.LocationSectionKt$MapSmall$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar2, int i12) {
                    LocationSectionKt.c(LatLng.this, z11, pVar, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final String e(String str) {
        boolean z11;
        if (str != null && str.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            return ", " + str + ".";
        }
        return "";
    }
}
