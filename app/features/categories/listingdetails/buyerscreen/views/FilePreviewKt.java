package com.forsale.app.features.categories.listingdetails.buyerscreen.views;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c0;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c0.g;
import coil.compose.AsyncImagePainter;
import com.forsale.app.features.categories.listingdetails.buyerscreen.views.FileMetaData;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper;
import com.forsale.designSystem.dividers.DividersKt;
import com.forsale.designSystem.iconography.IconKt;
import com.forsale.designSystem.layouts.CardsKt;
import com.google.logging.type.LogSeverity;
import dj.i;
import e2.h;
import g00.l;
import g00.q;
import j0.d1;
import j0.e1;
import j0.k0;
import j0.t0;
import j0.u;
import j0.v0;
import java.text.StringCharacterIterator;
import java.util.Arrays;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.w;
import kotlin.text.s;
import t9.q0;
import v.j;
import v.k;
import v0.b;
import w.f;
import wz.p;
import yj.d;
/* compiled from: FilePreview.kt */
/* loaded from: classes2.dex */
public final class FilePreviewKt {

    /* compiled from: FilePreview.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f26903a;

        static {
            int[] iArr = new int[FileMetaData.FileType.values().length];
            try {
                iArr[FileMetaData.FileType.PDF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f26903a = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v23 */
    public static final void a(final AttributesMapper.AttributesDataModel file, final l<? super FileMetaData, p> onFileClicked, androidx.compose.runtime.a aVar, final int i11) {
        dk.a aVar2;
        c.a aVar3;
        int i12;
        Arrangement arrangement;
        float f11;
        float f12;
        boolean z11;
        float f13;
        androidx.compose.runtime.a aVar4;
        boolean v11;
        boolean z12;
        ?? r72;
        int i13;
        boolean z13;
        o.i(file, "file");
        o.i(onFileClicked, "onFileClicked");
        androidx.compose.runtime.a h11 = aVar.h(2100548099);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(2100548099, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.FilePreview (FilePreview.kt:60)");
        }
        x10.a.b("FILE::" + file, new Object[0]);
        h11.C(-492369756);
        Object D = h11.D();
        a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
        if (D == c0064a.a()) {
            D = c0.e(new FileMetaData(null, null, null, null, 15, null), null, 2, null);
            h11.u(D);
        }
        h11.S();
        final k0 k0Var = (k0) D;
        Context context = (Context) h11.q(AndroidCompositionLocals_androidKt.g());
        u.d(context, new FilePreviewKt$FilePreview$1(file, context, k0Var, null), h11, 72);
        x10.a.b("FILE MD::" + b(k0Var), new Object[0]);
        Arrangement arrangement2 = Arrangement.f3698a;
        float f14 = (float) 0;
        float l11 = h.l(f14);
        b.a aVar5 = b.f74009a;
        Arrangement.m q11 = arrangement2.q(l11, aVar5.i());
        b.InterfaceC0889b j11 = aVar5.j();
        c.a aVar6 = c.f7566a;
        float f15 = 1;
        float l12 = h.l(f15);
        dk.a aVar7 = dk.a.f54291a;
        int i14 = dk.a.f54292b;
        d e11 = aVar7.a(h11, i14).e();
        int i15 = d.f76453b;
        long d11 = e11.d(h11, i15);
        float f16 = 8;
        c f17 = BorderKt.f(aVar6, l12, d11, g.c(h.l(f16)));
        k a11 = j.a();
        h11.C(511388516);
        boolean T = h11.T(onFileClicked) | h11.T(k0Var);
        Object D2 = h11.D();
        if (T || D2 == c0064a.a()) {
            D2 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.FilePreviewKt$FilePreview$2$1
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
                    FileMetaData b11;
                    l<FileMetaData, p> lVar = onFileClicked;
                    b11 = FilePreviewKt.b(k0Var);
                    lVar.invoke(b11);
                }
            };
            h11.u(D2);
        }
        h11.S();
        c c11 = ClickableKt.c(f17, a11, null, false, null, null, (g00.a) D2, 28, null);
        h11.C(-483455358);
        a0 a12 = e.a(q11, j11, h11, 54);
        h11.C(-1323940314);
        int a13 = j0.e.a(h11, 0);
        j0.k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a14 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(c11);
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
        c12.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        if (b(k0Var).f() == FileMetaData.FileType.PDF) {
            h11.C(1640964397);
            c b12 = BackgroundKt.b(y0.e.a(SizeKt.i(SizeKt.h(aVar6, 0.0f, 1, null), h.l(141)), g.c(h.l(f16))), aVar7.a(h11, i14).e().d(h11, i15), null, 2, null);
            h11.C(733328855);
            a0 g11 = BoxKt.g(aVar5.o(), false, h11, 0);
            h11.C(-1323940314);
            int a16 = j0.e.a(h11, 0);
            j0.k s12 = h11.s();
            g00.a<ComposeUiNode> a17 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c13 = LayoutKt.c(b12);
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
            Updater.c(a18, g11, companion.e());
            Updater.c(a18, s12, companion.g());
            g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
            if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
                a18.u(Integer.valueOf(a16));
                a18.p(Integer.valueOf(a16), b13);
            }
            c13.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            aVar2 = aVar7;
            f12 = f15;
            aVar3 = aVar6;
            f11 = f14;
            arrangement = arrangement2;
            i12 = i14;
            IconKt.a(p1.e.d(q0.E, h11, 0), BoxScopeInstance.f3756a.e(aVar6, aVar5.e()), null, aVar7.a(h11, i14).e().f(h11, i15), false, h.l(64), h11, 196616, 20);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            h11.S();
            f13 = f16;
            aVar4 = h11;
        } else {
            aVar2 = aVar7;
            aVar3 = aVar6;
            i12 = i14;
            arrangement = arrangement2;
            f11 = f14;
            f12 = f15;
            h11.C(1640964915);
            AsyncImagePainter a19 = h5.d.a(b(k0Var).a(), null, null, null, 0, h11, 0, 30);
            String f18 = file.f();
            if (f18 != null) {
                v11 = s.v(f18);
                if (!v11) {
                    z11 = false;
                    f13 = f16;
                    aVar4 = h11;
                    CardsKt.g(a19, 2.3333333f, false, z11, null, null, null, 0.0f, 0.0f, h11, 48, LogSeverity.ERROR_VALUE);
                    aVar4.S();
                }
            }
            z11 = true;
            f13 = f16;
            aVar4 = h11;
            CardsKt.g(a19, 2.3333333f, false, z11, null, null, null, 0.0f, 0.0f, h11, 48, LogSeverity.ERROR_VALUE);
            aVar4.S();
        }
        androidx.compose.runtime.a aVar8 = aVar4;
        dk.a aVar9 = aVar2;
        int i16 = i12;
        DividersKt.a(null, h.l(f12), aVar9.a(aVar8, i16).e().d(aVar8, i15), aVar8, 48, 1);
        c.a aVar10 = aVar3;
        c i17 = PaddingKt.i(SizeKt.h(aVar10, 0.0f, 1, null), h.l(f13));
        b.c i18 = aVar5.i();
        Arrangement.e g12 = arrangement.g();
        aVar8.C(693286680);
        a0 a21 = androidx.compose.foundation.layout.o.a(g12, i18, aVar8, 54);
        aVar8.C(-1323940314);
        int a22 = j0.e.a(aVar8, 0);
        j0.k s13 = aVar8.s();
        g00.a<ComposeUiNode> a23 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c14 = LayoutKt.c(i17);
        if (!(aVar8.k() instanceof j0.d)) {
            j0.e.c();
        }
        aVar8.I();
        if (aVar8.f()) {
            aVar8.y(a23);
        } else {
            aVar8.t();
        }
        androidx.compose.runtime.a a24 = Updater.a(aVar8);
        Updater.c(a24, a21, companion.e());
        Updater.c(a24, s13, companion.g());
        g00.p<ComposeUiNode, Integer, p> b14 = companion.b();
        if (a24.f() || !o.d(a24.D(), Integer.valueOf(a22))) {
            a24.u(Integer.valueOf(a22));
            a24.p(Integer.valueOf(a22), b14);
        }
        c14.invoke(e1.a(e1.b(aVar8)), aVar8, 0);
        aVar8.C(2058660585);
        w.u uVar = w.u.f74924a;
        IconKt.a(h5.d.a(Integer.valueOf(b(k0Var).d()), null, null, null, 0, aVar8, 0, 30), null, null, b(k0Var).e(aVar8, 0), false, h.l(40), aVar8, 196608, 22);
        SpacerKt.a(SizeKt.u(aVar10, h.l(f13)), aVar8, 6);
        Arrangement.m q12 = arrangement.q(h.l(f11), aVar5.i());
        b.InterfaceC0889b k11 = aVar5.k();
        aVar8.C(-483455358);
        a0 a25 = e.a(q12, k11, aVar8, 54);
        aVar8.C(-1323940314);
        int a26 = j0.e.a(aVar8, 0);
        j0.k s14 = aVar8.s();
        g00.a<ComposeUiNode> a27 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c15 = LayoutKt.c(aVar10);
        if (!(aVar8.k() instanceof j0.d)) {
            j0.e.c();
        }
        aVar8.I();
        if (aVar8.f()) {
            aVar8.y(a27);
        } else {
            aVar8.t();
        }
        androidx.compose.runtime.a a28 = Updater.a(aVar8);
        Updater.c(a28, a25, companion.e());
        Updater.c(a28, s14, companion.g());
        g00.p<ComposeUiNode, Integer, p> b15 = companion.b();
        if (a28.f() || !o.d(a28.D(), Integer.valueOf(a26))) {
            a28.u(Integer.valueOf(a26));
            a28.p(Integer.valueOf(a26), b15);
        }
        c15.invoke(e1.a(e1.b(aVar8)), aVar8, 0);
        aVar8.C(2058660585);
        aVar8.C(-868818643);
        if (b(k0Var).b().length() > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            i13 = 2;
            r72 = 1;
            CompositionLocalKt.b(new t0[]{TextKt.d().c(aVar9.c(aVar8, i16).c()), com.forsale.designSystem.TextKt.i().c(1)}, r0.b.b(aVar8, 276188398, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.FilePreviewKt$FilePreview$3$2$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar11, int i19) {
                    FileMetaData b16;
                    if ((i19 & 11) == 2 && aVar11.i()) {
                        aVar11.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(276188398, i19, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.FilePreview.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FilePreview.kt:127)");
                    }
                    b16 = FilePreviewKt.b(k0Var);
                    com.forsale.designSystem.TextKt.a(b16.b(), null, 0, 0, false, 0, 0, null, null, dk.a.f54291a.a(aVar11, dk.a.f54292b).e().m(aVar11, d.f76453b), 0, aVar11, 0, 0, 1534);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar11, Integer num) {
                    b(aVar11, num.intValue());
                    return p.f75480a;
                }
            }), aVar8, 56);
        } else {
            r72 = 1;
            i13 = 2;
        }
        aVar8.S();
        aVar8.C(-1613219075);
        if (b(k0Var).c().length() > 0) {
            z13 = r72;
        } else {
            z13 = false;
        }
        if (z13) {
            t0[] t0VarArr = new t0[i13];
            t0VarArr[0] = TextKt.d().c(aVar9.c(aVar8, i16).h());
            t0VarArr[r72] = com.forsale.designSystem.TextKt.i().c(Integer.valueOf((int) r72));
            CompositionLocalKt.b(t0VarArr, r0.b.b(aVar8, -892567451, r72, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.FilePreviewKt$FilePreview$3$2$1$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar11, int i19) {
                    FileMetaData b16;
                    if ((i19 & 11) == 2 && aVar11.i()) {
                        aVar11.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-892567451, i19, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.FilePreview.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FilePreview.kt:138)");
                    }
                    b16 = FilePreviewKt.b(k0Var);
                    com.forsale.designSystem.TextKt.a(b16.c(), null, 0, 0, false, 0, 0, null, null, dk.a.f54291a.a(aVar11, dk.a.f54292b).e().j(aVar11, d.f76453b), 0, aVar11, 0, 0, 1534);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar11, Integer num) {
                    b(aVar11, num.intValue());
                    return p.f75480a;
                }
            }), aVar8, 56);
        }
        aVar8.S();
        aVar8.S();
        aVar8.w();
        aVar8.S();
        aVar8.S();
        aVar8.S();
        aVar8.w();
        aVar8.S();
        aVar8.S();
        aVar8.S();
        aVar8.w();
        aVar8.S();
        aVar8.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l13 = aVar8.l();
        if (l13 != null) {
            l13.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.FilePreviewKt$FilePreview$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar11, int i19) {
                    FilePreviewKt.a(AttributesMapper.AttributesDataModel.this, onFileClicked, aVar11, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar11, Integer num) {
                    b(aVar11, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileMetaData b(k0<FileMetaData> k0Var) {
        return k0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(k0<FileMetaData> k0Var, FileMetaData fileMetaData) {
        k0Var.setValue(fileMetaData);
    }

    private static final String g(String str, float f11) {
        boolean z11;
        boolean z12;
        if (f11 == 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i.f54287a.invoke().c("File " + str + " is not valid");
            return "";
        }
        if (f11 == -1.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            i.f54287a.invoke().c("File " + str + " has no provided contentLength");
            return "";
        } else if (-1000.0f < f11 && f11 < 1000.0f) {
            return f11 + " B";
        } else {
            StringCharacterIterator stringCharacterIterator = new StringCharacterIterator("kMGTPE");
            while (true) {
                if (f11 > -999950.0f && f11 < 999950.0f) {
                    w wVar = w.f61809a;
                    String format = String.format("%.1f %cB", Arrays.copyOf(new Object[]{Double.valueOf(f11 / 1000.0d), Character.valueOf(stringCharacterIterator.current())}, 2));
                    o.h(format, "format(...)");
                    return format;
                }
                f11 /= 1000;
                stringCharacterIterator.next();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.forsale.app.features.categories.listingdetails.buyerscreen.views.FileMetaData$FileType, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper.AttributesDataModel r6, android.content.Context r7, zz.a<? super com.forsale.app.features.categories.listingdetails.buyerscreen.views.FileMetaData> r8) {
        /*
            boolean r7 = r8 instanceof com.forsale.app.features.categories.listingdetails.buyerscreen.views.FilePreviewKt$getFileMetaDAta$1
            if (r7 == 0) goto L13
            r7 = r8
            com.forsale.app.features.categories.listingdetails.buyerscreen.views.FilePreviewKt$getFileMetaDAta$1 r7 = (com.forsale.app.features.categories.listingdetails.buyerscreen.views.FilePreviewKt$getFileMetaDAta$1) r7
            int r0 = r7.f26908e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r7.f26908e = r0
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.buyerscreen.views.FilePreviewKt$getFileMetaDAta$1 r7 = new com.forsale.app.features.categories.listingdetails.buyerscreen.views.FilePreviewKt$getFileMetaDAta$1
            r7.<init>(r8)
        L18:
            java.lang.Object r8 = r7.f26907d
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r7.f26908e
            r2 = 1
            if (r1 == 0) goto L3f
            if (r1 != r2) goto L37
            java.lang.Object r6 = r7.f26906c
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref$ObjectRef) r6
            java.lang.Object r0 = r7.f26905b
            kotlin.jvm.internal.Ref$FloatRef r0 = (kotlin.jvm.internal.Ref$FloatRef) r0
            java.lang.Object r7 = r7.f26904a
            com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper$AttributesDataModel r7 = (com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper.AttributesDataModel) r7
            kotlin.f.b(r8)     // Catch: java.io.IOException -> L35
            goto L7e
        L35:
            r8 = move-exception
            goto L72
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            kotlin.f.b(r8)
            kotlin.jvm.internal.Ref$FloatRef r8 = new kotlin.jvm.internal.Ref$FloatRef
            r8.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            com.forsale.app.features.categories.listingdetails.buyerscreen.views.FileMetaData$FileType r3 = com.forsale.app.features.categories.listingdetails.buyerscreen.views.FileMetaData.FileType.Other
            r1.f61778a = r3
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.io.IOException -> L6d
            com.forsale.app.features.categories.listingdetails.buyerscreen.views.FilePreviewKt$getFileMetaDAta$2 r4 = new com.forsale.app.features.categories.listingdetails.buyerscreen.views.FilePreviewKt$getFileMetaDAta$2     // Catch: java.io.IOException -> L6d
            r5 = 0
            r4.<init>(r6, r1, r8, r5)     // Catch: java.io.IOException -> L6d
            r7.f26904a = r6     // Catch: java.io.IOException -> L6d
            r7.f26905b = r8     // Catch: java.io.IOException -> L6d
            r7.f26906c = r1     // Catch: java.io.IOException -> L6d
            r7.f26908e = r2     // Catch: java.io.IOException -> L6d
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r3, r4, r7)     // Catch: java.io.IOException -> L6d
            if (r7 != r0) goto L69
            return r0
        L69:
            r7 = r6
            r0 = r8
            r6 = r1
            goto L7e
        L6d:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r6
            r6 = r1
        L72:
            r8.printStackTrace()
            dj.i$a r1 = dj.i.f54287a
            dj.i r1 = r1.invoke()
            r1.f(r8)
        L7e:
            T r8 = r6.f61778a
            com.forsale.app.features.categories.listingdetails.buyerscreen.views.FileMetaData$FileType r8 = (com.forsale.app.features.categories.listingdetails.buyerscreen.views.FileMetaData.FileType) r8
            int[] r1 = com.forsale.app.features.categories.listingdetails.buyerscreen.views.FilePreviewKt.a.f26903a
            int r8 = r8.ordinal()
            r8 = r1[r8]
            if (r8 != r2) goto L91
            java.lang.String r8 = r7.c()
            goto L95
        L91:
            java.lang.String r8 = r7.c()
        L95:
            com.forsale.app.features.categories.listingdetails.buyerscreen.views.FileMetaData r1 = new com.forsale.app.features.categories.listingdetails.buyerscreen.views.FileMetaData
            java.lang.String r2 = r7.b()
            T r3 = r6.f61778a
            com.forsale.app.features.categories.listingdetails.buyerscreen.views.FileMetaData$FileType r4 = com.forsale.app.features.categories.listingdetails.buyerscreen.views.FileMetaData.FileType.PDF
            if (r3 != r4) goto Lc5
            java.lang.Float r3 = r7.g()
            if (r3 == 0) goto Lc5
            java.lang.Float r7 = r7.g()
            float r7 = r7.floatValue()
            java.lang.String r7 = com.forsale.app.utils.TypeExtensionsKt.U(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r7 = " KB"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            goto Lcf
        Lc5:
            java.lang.String r7 = r7.c()
            float r0 = r0.f61775a
            java.lang.String r7 = g(r7, r0)
        Lcf:
            T r6 = r6.f61778a
            com.forsale.app.features.categories.listingdetails.buyerscreen.views.FileMetaData$FileType r6 = (com.forsale.app.features.categories.listingdetails.buyerscreen.views.FileMetaData.FileType) r6
            r1.<init>(r2, r7, r6, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.views.FilePreviewKt.h(com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper$AttributesDataModel, android.content.Context, zz.a):java.lang.Object");
    }
}
