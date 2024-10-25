package com.forsale.app.features.categories.listingdetails.buyerscreen.mainattributes;

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
import coil.compose.SingletonAsyncImageKt;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.MediaTypes;
import com.forsale.app.features.categories.listingdetails.buyerscreen.views.FileMetaData;
import com.forsale.app.features.categories.listingdetails.buyerscreen.views.FilePreviewKt;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper;
import com.forsale.app.features.postad.extraattributes.enums.AttributeType;
import com.forsale.app.utils.Languages;
import com.forsale.app.utils.composeUtils.FixedGridViewKt;
import com.forsale.designSystem.TextKt;
import e2.h;
import g00.l;
import g00.q;
import j0.d1;
import j0.e1;
import j0.k;
import j0.v0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import t9.y0;
import v0.b;
import w.f;
import w.u;
import wz.p;
import y0.e;
import yj.d;
/* compiled from: SpecificationsSection.kt */
/* loaded from: classes2.dex */
public final class SpecificationsSectionKt {

    /* compiled from: SpecificationsSection.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f26086a;

        static {
            int[] iArr = new int[AttributeType.values().length];
            try {
                iArr[AttributeType.DROP_DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AttributeType.TEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AttributeType.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AttributeType.FILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f26086a = iArr;
        }
    }

    public static final void a(final AttributesMapper.AttributesDataModel extraAttribute, androidx.compose.runtime.a aVar, final int i11) {
        o.i(extraAttribute, "extraAttribute");
        androidx.compose.runtime.a h11 = aVar.h(1658185807);
        if (c.I()) {
            c.U(1658185807, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.mainattributes.SpecificationItem (SpecificationsSection.kt:84)");
        }
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        androidx.compose.ui.c a11 = e.a(SizeKt.i(aVar2, h.l(40)), g.c(h.l(8)));
        dk.a aVar3 = dk.a.f54291a;
        int i12 = dk.a.f54292b;
        d e11 = aVar3.a(h11, i12).e();
        int i13 = d.f76453b;
        androidx.compose.ui.c a12 = TestTagKt.a(BackgroundKt.b(a11, e11.h(h11, i13), null, 2, null), "attributeItem");
        h11.C(733328855);
        b.a aVar4 = b.f74009a;
        a0 g11 = BoxKt.g(aVar4.o(), false, h11, 0);
        h11.C(-1323940314);
        int a13 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a14 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(a12);
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
        Updater.c(a15, g11, companion.e());
        Updater.c(a15, s11, companion.g());
        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
        if (a15.f() || !o.d(a15.D(), Integer.valueOf(a13))) {
            a15.u(Integer.valueOf(a13));
            a15.p(Integer.valueOf(a13), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
        androidx.compose.ui.c j11 = PaddingKt.j(aVar2, h.l(12), h.l(10));
        Arrangement.f o11 = Arrangement.f3698a.o(h.l(6));
        b.c i14 = aVar4.i();
        h11.C(693286680);
        a0 a16 = androidx.compose.foundation.layout.o.a(o11, i14, h11, 54);
        h11.C(-1323940314);
        int a17 = j0.e.a(h11, 0);
        k s12 = h11.s();
        g00.a<ComposeUiNode> a18 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(j11);
        if (!(h11.k() instanceof j0.d)) {
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
        g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
        if (a19.f() || !o.d(a19.D(), Integer.valueOf(a17))) {
            a19.u(Integer.valueOf(a17));
            a19.p(Integer.valueOf(a17), b12);
        }
        c12.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        u uVar = u.f74924a;
        SingletonAsyncImageKt.a(extraAttribute.f(), extraAttribute.a(), null, null, null, null, null, 0.0f, null, 0, h11, 0, 1020);
        TextKt.a(c(extraAttribute, h11, 8), null, 0, 0, false, 0, 0, null, aVar3.c(h11, i12).c(), aVar3.a(h11, i12).e().m(h11, i13), 0, h11, 0, 0, 1278);
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
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.mainattributes.SpecificationsSectionKt$SpecificationItem$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar5, int i15) {
                    SpecificationsSectionKt.a(AttributesMapper.AttributesDataModel.this, aVar5, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void b(final DetailsModel details, final l<? super MediaTypes, p> onAttributeFileClicked, androidx.compose.runtime.a aVar, final int i11) {
        boolean z11;
        boolean z12;
        o.i(details, "details");
        o.i(onAttributeFileClicked, "onAttributeFileClicked");
        androidx.compose.runtime.a h11 = aVar.h(1968062402);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1968062402, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.mainattributes.SpecificationsSection (SpecificationsSection.kt:39)");
        }
        Arrangement arrangement = Arrangement.f3698a;
        float f11 = 8;
        float l11 = h.l(f11);
        b.a aVar2 = b.f74009a;
        Arrangement.m q11 = arrangement.q(l11, aVar2.i());
        c.a aVar3 = androidx.compose.ui.c.f7566a;
        androidx.compose.ui.c y11 = SizeKt.y(PaddingKt.i(aVar3, h.l(16)), null, false, 3, null);
        h11.C(-483455358);
        a0 a11 = androidx.compose.foundation.layout.e.a(q11, aVar2.k(), h11, 6);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(y11);
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
        f fVar = f.f74891a;
        String b12 = p1.g.b(y0.f70530k1, h11, 0);
        dk.a aVar4 = dk.a.f54291a;
        int i12 = dk.a.f54292b;
        TextKt.a(b12, TestTagKt.a(aVar3, "txtSpecifications"), 0, 0, false, 0, 0, null, aVar4.c(h11, i12).l(), aVar4.a(h11, i12).e().m(h11, d.f76453b), 0, h11, 48, 0, 1276);
        h11.C(890415742);
        List<AttributesMapper.AttributesDataModel> d11 = details.d().d();
        if (d11 != null) {
            List<AttributesMapper.AttributesDataModel> list = d11;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                AttributesMapper.AttributesDataModel attributesDataModel = (AttributesMapper.AttributesDataModel) obj;
                if (attributesDataModel.j() != AttributeType.BOOL && attributesDataModel.j() != AttributeType.FILE) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (((AttributesMapper.AttributesDataModel) obj2).j() == AttributeType.FILE) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    arrayList2.add(obj2);
                }
            }
            Arrangement.f o11 = Arrangement.f3698a.o(h.l(f11));
            h11.C(-483455358);
            c.a aVar5 = androidx.compose.ui.c.f7566a;
            a0 a15 = androidx.compose.foundation.layout.e.a(o11, b.f74009a.k(), h11, 6);
            h11.C(-1323940314);
            int a16 = j0.e.a(h11, 0);
            k s12 = h11.s();
            ComposeUiNode.Companion companion2 = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a17 = companion2.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(aVar5);
            if (!(h11.k() instanceof j0.d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a17);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a18 = Updater.a(h11);
            Updater.c(a18, a15, companion2.e());
            Updater.c(a18, s12, companion2.g());
            g00.p<ComposeUiNode, Integer, p> b13 = companion2.b();
            if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
                a18.u(Integer.valueOf(a16));
                a18.p(Integer.valueOf(a16), b13);
            }
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            f fVar2 = f.f74891a;
            FixedGridViewKt.a(arrayList, 2, SizeKt.y(aVar5, null, false, 3, null), h.l(f11), h.l(f11), ComposableSingletons$SpecificationsSectionKt.f26077a.a(), h11, 224696, 0);
            h11.C(663573304);
            if (!arrayList2.isEmpty()) {
                AttributesMapper.AttributesDataModel attributesDataModel2 = (AttributesMapper.AttributesDataModel) arrayList2.get(0);
                h11.C(1157296644);
                boolean T = h11.T(onAttributeFileClicked);
                Object D = h11.D();
                if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                    D = new l<FileMetaData, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.mainattributes.SpecificationsSectionKt$SpecificationsSection$1$1$1$1$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void b(FileMetaData media) {
                            o.i(media, "media");
                            if (media.f() != FileMetaData.FileType.PDF) {
                                onAttributeFileClicked.invoke(new MediaTypes.Images(0, media.a()));
                            } else {
                                onAttributeFileClicked.invoke(new MediaTypes.PDF(media));
                            }
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ p invoke(FileMetaData fileMetaData) {
                            b(fileMetaData);
                            return p.f75480a;
                        }
                    };
                    h11.u(D);
                }
                h11.S();
                FilePreviewKt.a(attributesDataModel2, (l) D, h11, 8);
            }
            h11.S();
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            p pVar = p.f75480a;
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
            l12.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.mainattributes.SpecificationsSectionKt$SpecificationsSection$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar6, int i13) {
                    SpecificationsSectionKt.b(DetailsModel.this, onAttributeFileClicked, aVar6, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar6, Integer num) {
                    b(aVar6, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    private static final String c(AttributesMapper.AttributesDataModel attributesDataModel, androidx.compose.runtime.a aVar, int i11) {
        String c11;
        aVar.C(-187168068);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-187168068, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.mainattributes.getSpecificationText (SpecificationsSection.kt:112)");
        }
        int i12 = a.f26086a[attributesDataModel.j().ordinal()];
        if (i12 != 1 && i12 != 2) {
            if (i12 != 3) {
                if (i12 != 4) {
                    c11 = attributesDataModel.a();
                } else {
                    c11 = attributesDataModel.c();
                }
            } else {
                c11 = String.valueOf(attributesDataModel.k(o.d(Languages.Companion.b().getValue(), Languages.ARABIC.getValue())));
            }
        } else {
            c11 = attributesDataModel.c();
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        aVar.S();
        return c11;
    }
}
