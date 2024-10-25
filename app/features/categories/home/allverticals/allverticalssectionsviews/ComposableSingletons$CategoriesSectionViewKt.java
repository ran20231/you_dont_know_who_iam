package com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import c0.g;
import com.forsale.app.datalayer.database.CategoryEntity;
import e2.h;
import g00.q;
import g00.r;
import j0.d;
import j0.e1;
import j0.k;
import kotlin.jvm.internal.o;
import r0.b;
import v0.b;
import w.c;
import w.f;
import wz.p;
/* compiled from: CategoriesSectionView.kt */
/* loaded from: classes2.dex */
public final class ComposableSingletons$CategoriesSectionViewKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposableSingletons$CategoriesSectionViewKt f23580a = new ComposableSingletons$CategoriesSectionViewKt();

    /* renamed from: b  reason: collision with root package name */
    public static r<c, p, a, Integer, p> f23581b = b.c(895135755, false, new r<c, p, a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.ComposableSingletons$CategoriesSectionViewKt$lambda-1$1
        public final void b(c FixedGridView, p it2, a aVar, int i11) {
            o.i(FixedGridView, "$this$FixedGridView");
            o.i(it2, "it");
            if ((i11 & 641) == 128 && aVar.i()) {
                aVar.L();
                return;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(895135755, i11, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.ComposableSingletons$CategoriesSectionViewKt.lambda-1.<anonymous> (CategoriesSectionView.kt:84)");
            }
            Arrangement.f o11 = Arrangement.f3698a.o(h.l(8));
            b.InterfaceC0889b g11 = v0.b.f74009a.g();
            aVar.C(-483455358);
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            a0 a11 = e.a(o11, g11, aVar, 54);
            aVar.C(-1323940314);
            int a12 = j0.e.a(aVar, 0);
            k s11 = aVar.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(aVar2);
            if (!(aVar.k() instanceof d)) {
                j0.e.c();
            }
            aVar.I();
            if (aVar.f()) {
                aVar.y(a13);
            } else {
                aVar.t();
            }
            a a14 = Updater.a(aVar);
            Updater.c(a14, a11, companion.e());
            Updater.c(a14, s11, companion.g());
            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b11);
            }
            c11.invoke(e1.a(e1.b(aVar)), aVar, 0);
            aVar.C(2058660585);
            f fVar = f.f74891a;
            float f11 = 4;
            BoxKt.a(com.forsale.ui.components.skeleton.a.a(AspectRatioKt.b(aVar2, 1.0f, false, 2, null), true, g.c(h.l(f11)), 0L, 0L, aVar, 54, 12), aVar, 0);
            BoxKt.a(com.forsale.ui.components.skeleton.a.a(PaddingKt.k(SizeKt.i(SizeKt.h(aVar2, 0.0f, 1, null), h.l(16)), h.l(6), 0.0f, 2, null), true, g.c(h.l(f11)), 0L, 0L, aVar, 54, 12), aVar, 0);
            aVar.S();
            aVar.w();
            aVar.S();
            aVar.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }

        @Override // g00.r
        public /* bridge */ /* synthetic */ p d(w.c cVar, p pVar, a aVar, Integer num) {
            b(cVar, pVar, aVar, num.intValue());
            return p.f75480a;
        }
    });

    /* renamed from: c  reason: collision with root package name */
    public static g00.p<a, Integer, p> f23582c = r0.b.c(1950180040, false, new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.ComposableSingletons$CategoriesSectionViewKt$lambda-2$1
        public final void b(a aVar, int i11) {
            if ((i11 & 11) == 2 && aVar.i()) {
                aVar.L();
                return;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1950180040, i11, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.ComposableSingletons$CategoriesSectionViewKt.lambda-2.<anonymous> (CategoriesSectionView.kt:105)");
            }
            androidx.compose.ui.c b11 = BackgroundKt.b(SizeKt.f(androidx.compose.ui.c.f7566a, 0.0f, 1, null), dk.a.f54291a.a(aVar, dk.a.f54292b).e().h(aVar, yj.d.f76453b), null, 2, null);
            aVar.C(733328855);
            a0 g11 = BoxKt.g(v0.b.f74009a.o(), false, aVar, 0);
            aVar.C(-1323940314);
            int a11 = j0.e.a(aVar, 0);
            k s11 = aVar.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a12 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(b11);
            if (!(aVar.k() instanceof d)) {
                j0.e.c();
            }
            aVar.I();
            if (aVar.f()) {
                aVar.y(a12);
            } else {
                aVar.t();
            }
            a a13 = Updater.a(aVar);
            Updater.c(a13, g11, companion.e());
            Updater.c(a13, s11, companion.g());
            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
            if (a13.f() || !o.d(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.p(Integer.valueOf(a11), b12);
            }
            c11.invoke(e1.a(e1.b(aVar)), aVar, 0);
            aVar.C(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
            CategoriesSectionViewKt.e(CategoryEntity.Companion.getMockedCategories(10), ComposableSingletons$CategoriesSectionViewKt$lambda2$1$1$1.f23585a, aVar, 56);
            aVar.S();
            aVar.w();
            aVar.S();
            aVar.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ p invoke(a aVar, Integer num) {
            b(aVar, num.intValue());
            return p.f75480a;
        }
    });

    public final r<w.c, p, a, Integer, p> a() {
        return f23581b;
    }
}
