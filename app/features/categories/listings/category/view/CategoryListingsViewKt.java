package com.forsale.app.features.categories.listings.category.view;

import aa.q7;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.f0;
import androidx.compose.ui.input.pointer.m0;
import androidx.compose.ui.input.pointer.x;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.AndroidViewBindingKt;
import androidx.recyclerview.widget.RecyclerView;
import c0.g;
import coil.compose.AsyncImagePainter;
import com.forsale.app.datalayer.database.InAppMessageEntity;
import com.forsale.app.datalayer.database.TrendEntity;
import com.forsale.app.features.categories.listingdetails.ListingDetailsActivity;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.categories.listings.SortingStates;
import com.forsale.app.features.categories.listings.category.CategoryListingsViewModel;
import com.forsale.app.features.categories.listings.filtration.views.FiltersViewKt;
import com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItemViewModel;
import com.forsale.app.features.maincontainer.SearchBarKt;
import com.forsale.app.utils.analytics.AnalyticsDetailsSource;
import com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace;
import com.forsale.designSystem.SurfaceKt;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.buttons.ButtonFABData;
import com.forsale.designSystem.buttons.ButtonsKt;
import com.forsale.designSystem.layouts.PlaceHolderKt;
import com.forsale.designSystem.layouts.SectionTitleKt;
import com.forsale.designSystem.tags.TagData;
import com.forsale.designSystem.tags.TagsKt;
import com.forsale.ui.components.FabButtonKt;
import com.google.android.gms.ads.AdRequest;
import com.google.logging.type.LogSeverity;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import e2.h;
import e2.n;
import g00.l;
import g00.q;
import h5.d;
import j0.d1;
import j0.e;
import j0.e1;
import j0.k;
import j0.k0;
import j0.n1;
import j0.u;
import j0.v0;
import java.util.List;
import kotlin.collections.r;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import okhttp3.internal.http2.Http2;
import r.h0;
import r.j;
import t9.y0;
import v0.b;
import v0.i;
import w.f;
import w.t;
import wz.p;
/* compiled from: CategoryListingsView.kt */
/* loaded from: classes2.dex */
public final class CategoryListingsViewKt {
    public static final void a(final String imageUrl, a aVar, final int i11) {
        int i12;
        int i13;
        o.i(imageUrl, "imageUrl");
        a h11 = aVar.h(-1941296158);
        if ((i11 & 14) == 0) {
            if (h11.T(imageUrl)) {
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
        } else {
            if (c.I()) {
                c.U(-1941296158, i12, -1, "com.forsale.app.features.categories.listings.category.view.AnimatedPostImage (CategoryListingsView.kt:345)");
            }
            h11.C(-492369756);
            Object D = h11.D();
            a.C0064a c0064a = a.f7182a;
            if (D == c0064a.a()) {
                D = c0.e(Boolean.FALSE, null, 2, null);
                h11.u(D);
            }
            h11.S();
            final k0 k0Var = (k0) D;
            h11.C(1157296644);
            boolean T = h11.T(k0Var);
            Object D2 = h11.D();
            if (T || D2 == c0064a.a()) {
                D2 = new l<AsyncImagePainter.b.c, p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$AnimatedPostImage$animatedPostImage$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(AsyncImagePainter.b.c it2) {
                        o.i(it2, "it");
                        CategoryListingsViewKt.c(k0Var, true);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(AsyncImagePainter.b.c cVar) {
                        b(cVar);
                        return p.f75480a;
                    }
                };
                h11.u(D2);
            }
            h11.S();
            l lVar = (l) D2;
            h11.C(1157296644);
            boolean T2 = h11.T(k0Var);
            Object D3 = h11.D();
            if (T2 || D3 == c0064a.a()) {
                D3 = new l<AsyncImagePainter.b.d, p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$AnimatedPostImage$animatedPostImage$2$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(AsyncImagePainter.b.d it2) {
                        o.i(it2, "it");
                        CategoryListingsViewKt.c(k0Var, false);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(AsyncImagePainter.b.d dVar) {
                        b(dVar);
                        return p.f75480a;
                    }
                };
                h11.u(D3);
            }
            h11.S();
            AsyncImagePainter b11 = d.b(imageUrl, null, null, null, lVar, (l) D3, null, null, 0, h11, i12 & 14, 462);
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            float f11 = 16;
            androidx.compose.ui.c m11 = PaddingKt.m(aVar2, h.l(f11), h.l(f11), 0.0f, h.l(f11), 4, null);
            h11.C(733328855);
            a0 g11 = BoxKt.g(b.f74009a.o(), false, h11, 0);
            h11.C(-1323940314);
            int a11 = e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a12 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(m11);
            if (!(h11.k() instanceof j0.d)) {
                e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a12);
            } else {
                h11.t();
            }
            a a13 = Updater.a(h11);
            Updater.c(a13, g11, companion.e());
            Updater.c(a13, s11, companion.g());
            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
            if (a13.f() || !o.d(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.p(Integer.valueOf(a11), b12);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
            h11.C(1145780343);
            if (b(k0Var)) {
                PlaceHolderKt.a(y0.e.a(SizeKt.p(aVar2, h.l(56)), g.c(h.l(8))), h11, 0);
            }
            h11.S();
            ImageKt.a(b11, "Promoted Post image", y0.e.a(SizeKt.p(aVar2, h.l(56)), g.c(h.l(8))), null, androidx.compose.ui.layout.c.f8188a.a(), 0.0f, null, h11, 24624, 104);
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
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$AnimatedPostImage$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar3, int i14) {
                    CategoryListingsViewKt.a(imageUrl, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    private static final boolean b(k0<Boolean> k0Var) {
        return k0Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(k0<Boolean> k0Var, boolean z11) {
        k0Var.setValue(Boolean.valueOf(z11));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final java.lang.String r21, int r22, androidx.compose.runtime.a r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt.d(java.lang.String, int, androidx.compose.runtime.a, int, int):void");
    }

    public static final void e(a aVar, final int i11) {
        a h11 = aVar.h(325618162);
        if (i11 == 0 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(325618162, i11, -1, "com.forsale.app.features.categories.listings.category.view.AnimatedTag (CategoryListingsView.kt:332)");
            }
            dk.a aVar2 = dk.a.f54291a;
            int i12 = dk.a.f54292b;
            yj.d h12 = aVar2.a(h11, i12).h();
            int i13 = yj.d.f76453b;
            TagsKt.a(null, TagData.f42177a.d(), h12.j(h11, i13), aVar2.a(h11, i12).g().c(h11, i13), ComposableSingletons$CategoryListingsViewKt.f28850a.b(), h11, (TagData.f42178b << 3) | 24576, 1);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$AnimatedTag$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar3, int i14) {
                    CategoryListingsViewKt.e(aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void f(final CategoryListingsViewModel viewModel, final q7 binding, final g00.a<p> onBackPressed, final g00.a<p> onSearchBarClicked, a aVar, final int i11) {
        int i12;
        o.i(viewModel, "viewModel");
        o.i(binding, "binding");
        o.i(onBackPressed, "onBackPressed");
        o.i(onSearchBarClicked, "onSearchBarClicked");
        a h11 = aVar.h(-1688002322);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1688002322, i11, -1, "com.forsale.app.features.categories.listings.category.view.CategoryListingsView (CategoryListingsView.kt:96)");
        }
        n1 a11 = z.a(viewModel.Y2(), Boolean.FALSE, null, h11, 56, 2);
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        androidx.compose.ui.c f11 = SizeKt.f(aVar2, 0.0f, 1, null);
        h11.C(733328855);
        b.a aVar3 = b.f74009a;
        a0 g11 = BoxKt.g(aVar3.o(), false, h11, 0);
        h11.C(-1323940314);
        int a12 = e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(f11);
        if (!(h11.k() instanceof j0.d)) {
            e.c();
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
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
        h11.C(-483455358);
        a0 a15 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), aVar3.k(), h11, 0);
        h11.C(-1323940314);
        int a16 = e.a(h11, 0);
        k s12 = h11.s();
        g00.a<ComposeUiNode> a17 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, p> c12 = LayoutKt.c(aVar2);
        if (!(h11.k() instanceof j0.d)) {
            e.c();
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
        g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
        if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
            a18.u(Integer.valueOf(a16));
            a18.p(Integer.valueOf(a16), b12);
        }
        c12.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        h11.C(430359796);
        if (viewModel.h2()) {
            String F2 = viewModel.F2();
            if (F2 == null) {
                F2 = "";
            }
            boolean booleanValue = ((Boolean) z.b(viewModel.W2(), null, h11, 8, 1).getValue()).booleanValue();
            h11.C(1157296644);
            boolean T = h11.T(onBackPressed);
            Object D = h11.D();
            if (T || D == a.f7182a.a()) {
                D = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$CategoryListingsView$1$1$1$1
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
                        onBackPressed.invoke();
                    }
                };
                h11.u(D);
            }
            h11.S();
            g00.a aVar4 = (g00.a) D;
            h11.C(1157296644);
            boolean T2 = h11.T(onSearchBarClicked);
            Object D2 = h11.D();
            if (T2 || D2 == a.f7182a.a()) {
                D2 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$CategoryListingsView$1$1$2$1
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
                        onSearchBarClicked.invoke();
                    }
                };
                h11.u(D2);
            }
            h11.S();
            i12 = 8;
            SearchBarKt.a(F2, booleanValue, true, aVar4, (g00.a) D2, h11, 384);
        } else {
            i12 = 8;
        }
        h11.S();
        FiltersViewKt.h(viewModel, h11, i12);
        SpacerKt.a(BackgroundKt.b(SizeKt.h(SizeKt.i(aVar2, h.l(1)), 0.0f, 1, null), dk.a.f54291a.a(h11, dk.a.f54292b).e().d(h11, yj.d.f76453b), null, 2, null), h11, 0);
        l(viewModel, binding, onBackPressed, h11, (i11 & 896) | 72);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        w(PaddingKt.i(boxScopeInstance.e(aVar2, aVar3.c()), h.l(16)), g(a11), new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$CategoryListingsView$1$2
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
                RecyclerView recyclerView = q7.this.P;
                CategoryListingsViewModel categoryListingsViewModel = viewModel;
                recyclerView.I1();
                recyclerView.C1(0);
                categoryListingsViewModel.e3();
            }
        }, h11, 0);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$CategoryListingsView$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar5, int i13) {
                    CategoryListingsViewKt.f(CategoryListingsViewModel.this, binding, onBackPressed, onSearchBarClicked, aVar5, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    private static final boolean g(n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }

    public static final void h(final t tVar, final l<? super Boolean, p> onPromotedPostFinished, a aVar, final int i11) {
        int i12;
        int i13;
        int i14;
        o.i(tVar, "<this>");
        o.i(onPromotedPostFinished, "onPromotedPostFinished");
        a h11 = aVar.h(-425740324);
        if ((i11 & 14) == 0) {
            if (h11.T(tVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(onPromotedPostFinished)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-425740324, i12, -1, "com.forsale.app.features.categories.listings.category.view.CloseButton (CategoryListingsView.kt:323)");
            }
            androidx.compose.ui.c p11 = SizeKt.p(tVar.c(androidx.compose.ui.c.f7566a, b.f74009a.l()), h.l(48));
            h11.C(1157296644);
            boolean T = h11.T(onPromotedPostFinished);
            Object D = h11.D();
            if (T || D == a.f7182a.a()) {
                D = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$CloseButton$1$1
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
                        onPromotedPostFinished.invoke(Boolean.TRUE);
                    }
                };
                h11.u(D);
            }
            h11.S();
            ButtonsKt.g((g00.a) D, p11, false, null, null, ComposableSingletons$CategoryListingsViewKt.f28850a.a(), h11, 196608, 28);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$CloseButton$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar2, int i15) {
                    CategoryListingsViewKt.h(t.this, onPromotedPostFinished, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void i(String str, final boolean z11, final boolean z12, final g00.a<p> onResetFiltersClicked, final g00.a<p> onBackPressed, a aVar, final int i11, final int i12) {
        String str2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        o.i(onResetFiltersClicked, "onResetFiltersClicked");
        o.i(onBackPressed, "onBackPressed");
        a h11 = aVar.h(-454957638);
        int i19 = i12 & 1;
        if (i19 != 0) {
            i13 = i11 | 6;
            str2 = str;
        } else if ((i11 & 14) == 0) {
            str2 = str;
            if (h11.T(str)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            str2 = str;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (h11.a(z11)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 896) == 0) {
            if (h11.a(z12)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i13 |= i16;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            if (h11.F(onResetFiltersClicked)) {
                i17 = RecyclerView.l.FLAG_MOVED;
            } else {
                i17 = 1024;
            }
            i13 |= i17;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((57344 & i11) == 0) {
            if (h11.F(onBackPressed)) {
                i18 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i18 = 8192;
            }
            i13 |= i18;
        }
        if ((46811 & i13) == 9362 && h11.i()) {
            h11.L();
        } else {
            if (i19 != 0) {
                str2 = null;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-454957638, i13, -1, "com.forsale.app.features.categories.listings.category.view.EmptyState (CategoryListingsView.kt:418)");
            }
            if (z11) {
                h11.C(286374485);
                if (str2 != null) {
                    ListingsStateViewsKt.e(str2, h11, 0);
                }
                h11.S();
            } else {
                h11.C(286374611);
                if (z12) {
                    h11.C(286374638);
                    h11.C(1157296644);
                    boolean T = h11.T(onResetFiltersClicked);
                    Object D = h11.D();
                    if (T || D == a.f7182a.a()) {
                        D = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$EmptyState$2$1
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
                                onResetFiltersClicked.invoke();
                            }
                        };
                        h11.u(D);
                    }
                    h11.S();
                    ListingsStateViewsKt.c((g00.a) D, h11, 0);
                    h11.S();
                } else {
                    h11.C(286374747);
                    h11.C(1157296644);
                    boolean T2 = h11.T(onBackPressed);
                    Object D2 = h11.D();
                    if (T2 || D2 == a.f7182a.a()) {
                        D2 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$EmptyState$3$1
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
                                onBackPressed.invoke();
                            }
                        };
                        h11.u(D2);
                    }
                    h11.S();
                    ListingsStateViewsKt.d((g00.a) D2, h11, 0);
                    h11.S();
                }
                h11.S();
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            final String str3 = str2;
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$EmptyState$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar2, int i21) {
                    CategoryListingsViewKt.i(str3, z11, z12, onResetFiltersClicked, onBackPressed, aVar2, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void j(final boolean z11, final g00.a<p> retry, a aVar, final int i11) {
        int i12;
        int i13;
        int i14;
        o.i(retry, "retry");
        a h11 = aVar.h(-971798546);
        if ((i11 & 14) == 0) {
            if (h11.a(z11)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(retry)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-971798546, i12, -1, "com.forsale.app.features.categories.listings.category.view.ErrorState (CategoryListingsView.kt:437)");
            }
            if (z11) {
                h11.C(-2057809751);
                h11.C(1157296644);
                boolean T = h11.T(retry);
                Object D = h11.D();
                if (T || D == a.f7182a.a()) {
                    D = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$ErrorState$1$1
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
                            retry.invoke();
                        }
                    };
                    h11.u(D);
                }
                h11.S();
                ListingsStateViewsKt.b((g00.a) D, h11, 0);
                h11.S();
            } else {
                h11.C(-2057809675);
                h11.C(1157296644);
                boolean T2 = h11.T(retry);
                Object D2 = h11.D();
                if (T2 || D2 == a.f7182a.a()) {
                    D2 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$ErrorState$2$1
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
                            retry.invoke();
                        }
                    };
                    h11.u(D2);
                }
                h11.S();
                ListingsStateViewsKt.f((g00.a) D2, h11, 0);
                h11.S();
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$ErrorState$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar2, int i15) {
                    CategoryListingsViewKt.j(z11, retry, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void k(final q7 binding, final CategoryListingsViewModel categoryListingsViewModel, a aVar, final int i11) {
        o.i(binding, "binding");
        o.i(categoryListingsViewModel, "categoryListingsViewModel");
        a h11 = aVar.h(691224498);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(691224498, i11, -1, "com.forsale.app.features.categories.listings.category.view.ListingBindingView (CategoryListingsView.kt:141)");
        }
        AndroidViewBindingKt.a(new q<LayoutInflater, ViewGroup, Boolean, q7>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$ListingBindingView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            public final q7 b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
                o.i(layoutInflater, "<anonymous parameter 0>");
                o.i(viewGroup, "<anonymous parameter 1>");
                return q7.this;
            }

            @Override // g00.q
            public /* bridge */ /* synthetic */ q7 invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
                return b(layoutInflater, viewGroup, bool.booleanValue());
            }
        }, null, new l<q7, p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$ListingBindingView$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(q7 AndroidViewBinding) {
                o.i(AndroidViewBinding, "$this$AndroidViewBinding");
                AndroidViewBinding.f0(CategoryListingsViewModel.this);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(q7 q7Var) {
                b(q7Var);
                return p.f75480a;
            }
        }, h11, 0, 2);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$ListingBindingView$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar2, int i12) {
                    CategoryListingsViewKt.k(q7.this, categoryListingsViewModel, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void l(final CategoryListingsViewModel viewModel, final q7 binding, final g00.a<p> onBackPressed, a aVar, final int i11) {
        a aVar2;
        int i12;
        SortingStates sortingStates;
        o.i(viewModel, "viewModel");
        o.i(binding, "binding");
        o.i(onBackPressed, "onBackPressed");
        a h11 = aVar.h(798938045);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(798938045, i11, -1, "com.forsale.app.features.categories.listings.category.view.Listings (CategoryListingsView.kt:359)");
        }
        Flow<Boolean> T2 = viewModel.T2();
        Boolean bool = Boolean.FALSE;
        n1 a11 = z.a(T2, bool, null, h11, 56, 2);
        final n1 b11 = z.b(viewModel.r2(), null, h11, 8, 1);
        z.b(viewModel.X2(), null, h11, 8, 1);
        z.b(viewModel.i2(), null, h11, 8, 1);
        n1 a12 = LiveDataAdapterKt.a(viewModel.Q2(), h11, 8);
        n1 b12 = z.b(viewModel.N2(), null, h11, 8, 1);
        final n1 a13 = z.a(viewModel.M2(), bool, null, h11, 56, 2);
        c.a aVar3 = androidx.compose.ui.c.f7566a;
        androidx.compose.ui.c f11 = SizeKt.f(aVar3, 0.0f, 1, null);
        h11.C(733328855);
        b.a aVar4 = b.f74009a;
        a0 g11 = BoxKt.g(aVar4.o(), false, h11, 0);
        h11.C(-1323940314);
        int a14 = e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a15 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(f11);
        if (!(h11.k() instanceof j0.d)) {
            e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a15);
        } else {
            h11.t();
        }
        a a16 = Updater.a(h11);
        Updater.c(a16, g11, companion.e());
        Updater.c(a16, s11, companion.g());
        g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
        if (a16.f() || !o.d(a16.D(), Integer.valueOf(a14))) {
            a16.u(Integer.valueOf(a14));
            a16.p(Integer.valueOf(a14), b13);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
        CategoryListingsViewModel.c n11 = n(b11);
        if (n11 instanceof CategoryListingsViewModel.c.a) {
            h11.C(1151584604);
            h11.C(-483455358);
            a0 a17 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), aVar4.k(), h11, 0);
            h11.C(-1323940314);
            int a18 = e.a(h11, 0);
            k s12 = h11.s();
            g00.a<ComposeUiNode> a19 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c12 = LayoutKt.c(aVar3);
            if (!(h11.k() instanceof j0.d)) {
                e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a19);
            } else {
                h11.t();
            }
            a a21 = Updater.a(h11);
            Updater.c(a21, a17, companion.e());
            Updater.c(a21, s12, companion.g());
            g00.p<ComposeUiNode, Integer, p> b14 = companion.b();
            if (a21.f() || !o.d(a21.D(), Integer.valueOf(a18))) {
                a21.u(Integer.valueOf(a18));
                a21.p(Integer.valueOf(a18), b14);
            }
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            f fVar = f.f74891a;
            SearchBreadcrumbsKt.a(q(a13), viewModel, h11, 64);
            Integer o11 = o(a12);
            if (o11 != null) {
                i12 = o11.intValue();
            } else {
                i12 = 0;
            }
            boolean q11 = q(a13);
            com.forsale.app.features.categories.listings.category.f p11 = p(b12);
            if (p11 == null || (sortingStates = p11.a()) == null) {
                sortingStates = SortingStates.DEFAULT;
            }
            u(true, i12, sortingStates, q11, new CategoryListingsViewKt$Listings$1$1$1(viewModel), h11, 6);
            k(binding, viewModel, h11, 72);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            s(boxScopeInstance, viewModel.C2(), m(a11), new l<Boolean, p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$Listings$1$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(Boolean bool2) {
                    invoke(bool2.booleanValue());
                    return p.f75480a;
                }

                public final void invoke(boolean z11) {
                    CategoryListingsViewModel.this.s3(z11);
                }
            }, h11, 70);
            h11.S();
            aVar2 = h11;
        } else if (n11 instanceof CategoryListingsViewModel.c.b) {
            h11.C(1151585584);
            LazyDslKt.a(SizeKt.f(aVar3, 0.0f, 1, null), null, null, false, Arrangement.f3698a.b(), null, null, false, new l<LazyListScope, p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$Listings$1$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void b(LazyListScope LazyColumn) {
                    o.i(LazyColumn, "$this$LazyColumn");
                    final CategoryListingsViewModel categoryListingsViewModel = CategoryListingsViewModel.this;
                    final g00.a<p> aVar5 = onBackPressed;
                    final int i13 = i11;
                    final n1<CategoryListingsViewModel.c> n1Var = b11;
                    final n1<Boolean> n1Var2 = a13;
                    LazyListScope.l(LazyColumn, null, null, r0.b.c(253888120, true, new q<x.a, a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$Listings$1$3.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        public final void b(x.a item, a aVar6, int i14) {
                            CategoryListingsViewModel.c n12;
                            boolean q12;
                            List<TrendEntity> list;
                            o.i(item, "$this$item");
                            if ((i14 & 81) == 16 && aVar6.i()) {
                                aVar6.L();
                                return;
                            }
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.U(253888120, i14, -1, "com.forsale.app.features.categories.listings.category.view.Listings.<anonymous>.<anonymous>.<anonymous> (CategoryListingsView.kt:388)");
                            }
                            String H2 = CategoryListingsViewModel.this.H2();
                            boolean booleanValue = ((Boolean) z.b(CategoryListingsViewModel.this.W2(), null, aVar6, 8, 1).getValue()).booleanValue();
                            n12 = CategoryListingsViewKt.n(n1Var);
                            o.g(n12, "null cannot be cast to non-null type com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.ListingsState.Empty");
                            boolean a22 = ((CategoryListingsViewModel.c.b) n12).a();
                            final CategoryListingsViewModel categoryListingsViewModel2 = CategoryListingsViewModel.this;
                            g00.a<p> aVar7 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt.Listings.1.3.1.1
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
                                    CategoryListingsViewModel.this.k3(ListingsAnalytics$FiltersPlace.EMPTY_SCREEN);
                                }
                            };
                            final g00.a<p> aVar8 = aVar5;
                            aVar6.C(1157296644);
                            boolean T = aVar6.T(aVar8);
                            Object D = aVar6.D();
                            if (T || D == a.f7182a.a()) {
                                D = 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0078: CONSTRUCTOR  (r4v1 'D' java.lang.Object) = (r10v13 'aVar8' g00.a<wz.p> A[DONT_INLINE]) call: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$Listings$1$3$1$2$1.<init>(g00.a):void type: CONSTRUCTOR in method: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$Listings$1$3.1.b(x.a, androidx.compose.runtime.a, int):void, file: classes2.dex
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
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$Listings$1$3$1$2$1, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                                    	... 25 more
                                    */
                                /*
                                    this = this;
                                    java.lang.String r0 = "$this$item"
                                    kotlin.jvm.internal.o.i(r10, r0)
                                    r10 = r12 & 81
                                    r0 = 16
                                    if (r10 != r0) goto L17
                                    boolean r10 = r11.i()
                                    if (r10 != 0) goto L12
                                    goto L17
                                L12:
                                    r11.L()
                                    goto Ld4
                                L17:
                                    boolean r10 = androidx.compose.runtime.c.I()
                                    if (r10 == 0) goto L26
                                    r10 = -1
                                    java.lang.String r0 = "com.forsale.app.features.categories.listings.category.view.Listings.<anonymous>.<anonymous>.<anonymous> (CategoryListingsView.kt:388)"
                                    r1 = 253888120(0xf220678, float:7.9884625E-30)
                                    androidx.compose.runtime.c.U(r1, r12, r10, r0)
                                L26:
                                    com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r10 = com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.this
                                    java.lang.String r0 = r10.H2()
                                    com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r10 = com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.this
                                    kotlinx.coroutines.flow.StateFlow r10 = r10.W2()
                                    r12 = 8
                                    r1 = 1
                                    r8 = 0
                                    j0.n1 r10 = androidx.compose.runtime.z.b(r10, r8, r11, r12, r1)
                                    java.lang.Object r10 = r10.getValue()
                                    java.lang.Boolean r10 = (java.lang.Boolean) r10
                                    boolean r1 = r10.booleanValue()
                                    j0.n1<com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$c> r10 = r4
                                    com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$c r10 = com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt.y(r10)
                                    java.lang.String r12 = "null cannot be cast to non-null type com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.ListingsState.Empty"
                                    kotlin.jvm.internal.o.g(r10, r12)
                                    com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$c$b r10 = (com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.c.b) r10
                                    boolean r2 = r10.a()
                                    com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$Listings$1$3$1$1 r3 = new com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$Listings$1$3$1$1
                                    com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r10 = com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.this
                                    r3.<init>()
                                    g00.a<wz.p> r10 = r2
                                    r12 = 1157296644(0x44faf204, float:2007.563)
                                    r11.C(r12)
                                    boolean r12 = r11.T(r10)
                                    java.lang.Object r4 = r11.D()
                                    if (r12 != 0) goto L76
                                    androidx.compose.runtime.a$a r12 = androidx.compose.runtime.a.f7182a
                                    java.lang.Object r12 = r12.a()
                                    if (r4 != r12) goto L7e
                                L76:
                                    com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$Listings$1$3$1$2$1 r4 = new com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$Listings$1$3$1$2$1
                                    r4.<init>(r10)
                                    r11.u(r4)
                                L7e:
                                    r11.S()
                                    g00.a r4 = (g00.a) r4
                                    r6 = 0
                                    r7 = 0
                                    r5 = r11
                                    com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt.i(r0, r1, r2, r3, r4, r5, r6, r7)
                                    j0.n1<java.lang.Boolean> r10 = r5
                                    boolean r10 = com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt.z(r10)
                                    com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r12 = com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.this
                                    r0 = 64
                                    com.forsale.app.features.categories.listings.category.view.SearchBreadcrumbsKt.a(r10, r12, r11, r0)
                                    com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r10 = com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.this
                                    kotlin.Pair r10 = r10.R2()
                                    java.lang.Object r10 = r10.c()
                                    java.util.List r10 = (java.util.List) r10
                                    if (r10 == 0) goto Lac
                                    boolean r12 = r10.isEmpty()
                                    if (r12 != 0) goto Lac
                                    r0 = r10
                                    goto Lad
                                Lac:
                                    r0 = r8
                                Lad:
                                    if (r0 != 0) goto Lb0
                                    goto Lcb
                                Lb0:
                                    com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r10 = com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.this
                                    kotlin.Pair r12 = r10.R2()
                                    java.lang.Object r12 = r12.d()
                                    r1 = r12
                                    com.forsale.app.datalayer.database.TrendEntity r1 = (com.forsale.app.datalayer.database.TrendEntity) r1
                                    com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$Listings$1$3$1$4$1 r2 = new com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$Listings$1$3$1$4$1
                                    r2.<init>(r10)
                                    r3 = 0
                                    r5 = 8
                                    r6 = 8
                                    r4 = r11
                                    com.forsale.app.features.search.TrendingKt.b(r0, r1, r2, r3, r4, r5, r6)
                                Lcb:
                                    boolean r10 = androidx.compose.runtime.c.I()
                                    if (r10 == 0) goto Ld4
                                    androidx.compose.runtime.c.T()
                                Ld4:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$Listings$1$3.AnonymousClass1.b(x.a, androidx.compose.runtime.a, int):void");
                            }

                            @Override // g00.q
                            public /* bridge */ /* synthetic */ p invoke(x.a aVar6, a aVar7, Integer num) {
                                b(aVar6, aVar7, num.intValue());
                                return p.f75480a;
                            }
                        }), 3, null);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(LazyListScope lazyListScope) {
                        b(lazyListScope);
                        return p.f75480a;
                    }
                }, h11, 24582, 238);
                h11.S();
                aVar2 = h11;
            } else if (n11 instanceof CategoryListingsViewModel.c.C0310c) {
                aVar2 = h11;
                aVar2.C(1151586770);
                CategoryListingsViewModel.c n12 = n(b11);
                o.g(n12, "null cannot be cast to non-null type com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.ListingsState.Error");
                j(((CategoryListingsViewModel.c.C0310c) n12).a(), new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$Listings$1$4
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
                        CategoryListingsViewModel.y3(CategoryListingsViewModel.this, null, 1, null);
                    }
                }, aVar2, 0);
                aVar2.S();
            } else {
                aVar2 = h11;
                if (o.d(n11, CategoryListingsViewModel.c.e.f28467a)) {
                    aVar2.C(1151587021);
                    r(null, aVar2, 0, 1);
                    aVar2.S();
                } else {
                    aVar2.C(1151587095);
                    aVar2.S();
                }
            }
            aVar2.S();
            aVar2.w();
            aVar2.S();
            aVar2.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = aVar2.l();
            if (l11 != null) {
                l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$Listings$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(a aVar5, int i13) {
                        CategoryListingsViewKt.l(CategoryListingsViewModel.this, binding, onBackPressed, aVar5, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(a aVar5, Integer num) {
                        b(aVar5, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        private static final boolean m(n1<Boolean> n1Var) {
            return n1Var.getValue().booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CategoryListingsViewModel.c n(n1<? extends CategoryListingsViewModel.c> n1Var) {
            return n1Var.getValue();
        }

        private static final Integer o(n1<Integer> n1Var) {
            return n1Var.getValue();
        }

        private static final com.forsale.app.features.categories.listings.category.f p(n1<? extends com.forsale.app.features.categories.listings.category.f> n1Var) {
            return n1Var.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean q(n1<Boolean> n1Var) {
            return n1Var.getValue().booleanValue();
        }

        public static final void r(final ListingsTypes listingsTypes, a aVar, final int i11, final int i12) {
            int i13;
            int i14;
            a h11 = aVar.h(-825234863);
            int i15 = i12 & 1;
            if (i15 != 0) {
                i13 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (h11.T(listingsTypes)) {
                    i14 = 4;
                } else {
                    i14 = 2;
                }
                i13 = i14 | i11;
            } else {
                i13 = i11;
            }
            if ((i13 & 11) == 2 && h11.i()) {
                h11.L();
            } else {
                if (i15 != 0) {
                    listingsTypes = ListingsTypes.NORMAL_LISTINGS;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-825234863, i13, -1, "com.forsale.app.features.categories.listings.category.view.LoadingShimmerState (CategoryListingsView.kt:450)");
                }
                ListingsStateViewsKt.g(ScrollKt.f(androidx.compose.ui.c.f7566a, ScrollKt.c(0, h11, 0, 1), false, null, false, 14, null), listingsTypes, h11, (i13 << 3) & 112);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$LoadingShimmerState$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(a aVar2, int i16) {
                        CategoryListingsViewKt.r(ListingsTypes.this, aVar2, v0.a(i11 | 1), i12);
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        public static final void s(final w.c cVar, final PromotedPostItemViewModel promotedPostItemViewModel, final boolean z11, final l<? super Boolean, p> onPromotedPostFinished, a aVar, final int i11) {
            o.i(cVar, "<this>");
            o.i(promotedPostItemViewModel, "promotedPostItemViewModel");
            o.i(onPromotedPostFinished, "onPromotedPostFinished");
            a h11 = aVar.h(273027912);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(273027912, i11, -1, "com.forsale.app.features.categories.listings.category.view.PromotedPost (CategoryListingsView.kt:247)");
            }
            final n1 b11 = z.b(promotedPostItemViewModel.I(), null, h11, 8, 1);
            if (t(b11) == null) {
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
                d1 l11 = h11.l();
                if (l11 != null) {
                    l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$PromotedPost$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void b(a aVar2, int i12) {
                            CategoryListingsViewKt.s(w.c.this, promotedPostItemViewModel, z11, onPromotedPostFinished, aVar2, v0.a(i11 | 1));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return p.f75480a;
                        }
                    });
                    return;
                }
                return;
            }
            final Context context = (Context) h11.q(AndroidCompositionLocals_androidKt.g());
            h11.C(773894976);
            h11.C(-492369756);
            Object D = h11.D();
            a.C0064a c0064a = a.f7182a;
            if (D == c0064a.a()) {
                androidx.compose.runtime.f fVar = new androidx.compose.runtime.f(u.j(EmptyCoroutineContext.f61739a, h11));
                h11.u(fVar);
                D = fVar;
            }
            h11.S();
            final CoroutineScope a11 = ((androidx.compose.runtime.f) D).a();
            h11.S();
            h11.C(-492369756);
            Object D2 = h11.D();
            if (D2 == c0064a.a()) {
                D2 = r.a.b(0.0f, 0.0f, 2, null);
                h11.u(D2);
            }
            h11.S();
            final Animatable animatable = (Animatable) D2;
            int i12 = (i11 >> 6) & 14;
            u.d(Boolean.valueOf(z11), new CategoryListingsViewKt$PromotedPost$2(z11, promotedPostItemViewModel, animatable, onPromotedPostFinished, null), h11, i12 | 64);
            AnimatedVisibilityKt.d(z11, null, EnterExitTransitionKt.m(null, null, false, null, 15, null), EnterExitTransitionKt.y(null, null, false, null, 15, null), null, r0.b.b(h11, -106719888, true, new q<q.c, a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$PromotedPost$3

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: CategoryListingsView.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$PromotedPost$3$2", f = "CategoryListingsView.kt", l = {276}, m = "invokeSuspend")
                /* renamed from: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$PromotedPost$3$2  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass2 extends SuspendLambda implements g00.p<f0, zz.a<? super p>, Object> {

                    /* renamed from: a  reason: collision with root package name */
                    int f28791a;

                    /* renamed from: b  reason: collision with root package name */
                    private /* synthetic */ Object f28792b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ Animatable<Float, j> f28793c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ l<Boolean, p> f28794d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ CoroutineScope f28795e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass2(Animatable<Float, j> animatable, l<? super Boolean, p> lVar, CoroutineScope coroutineScope, zz.a<? super AnonymousClass2> aVar) {
                        super(2, aVar);
                        this.f28793c = animatable;
                        this.f28794d = lVar;
                        this.f28795e = coroutineScope;
                    }

                    @Override // g00.p
                    /* renamed from: b */
                    public final Object invoke(f0 f0Var, zz.a<? super p> aVar) {
                        return ((AnonymousClass2) create(f0Var, aVar)).invokeSuspend(p.f75480a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final zz.a<p> create(Object obj, zz.a<?> aVar) {
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f28793c, this.f28794d, this.f28795e, aVar);
                        anonymousClass2.f28792b = obj;
                        return anonymousClass2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object f11;
                        f11 = kotlin.coroutines.intrinsics.b.f();
                        int i11 = this.f28791a;
                        if (i11 != 0) {
                            if (i11 == 1) {
                                kotlin.f.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            kotlin.f.b(obj);
                            final f0 f0Var = (f0) this.f28792b;
                            final Animatable<Float, j> animatable = this.f28793c;
                            final l<Boolean, p> lVar = this.f28794d;
                            final CoroutineScope coroutineScope = this.f28795e;
                            g00.a<p> aVar = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt.PromotedPost.3.2.1

                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* compiled from: CategoryListingsView.kt */
                                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$PromotedPost$3$2$1$1", f = "CategoryListingsView.kt", l = {281}, m = "invokeSuspend")
                                /* renamed from: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$PromotedPost$3$2$1$1  reason: invalid class name and collision with other inner class name */
                                /* loaded from: classes2.dex */
                                public static final class C03141 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

                                    /* renamed from: a  reason: collision with root package name */
                                    int f28800a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ Animatable<Float, j> f28801b;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C03141(Animatable<Float, j> animatable, zz.a<? super C03141> aVar) {
                                        super(2, aVar);
                                        this.f28801b = animatable;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final zz.a<p> create(Object obj, zz.a<?> aVar) {
                                        return new C03141(this.f28801b, aVar);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        Object f11;
                                        f11 = kotlin.coroutines.intrinsics.b.f();
                                        int i11 = this.f28800a;
                                        if (i11 != 0) {
                                            if (i11 == 1) {
                                                kotlin.f.b(obj);
                                            } else {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                        } else {
                                            kotlin.f.b(obj);
                                            Animatable<Float, j> animatable = this.f28801b;
                                            Float c11 = kotlin.coroutines.jvm.internal.a.c(0.0f);
                                            this.f28800a = 1;
                                            if (Animatable.f(animatable, c11, null, null, null, this, 14, null) == f11) {
                                                return f11;
                                            }
                                        }
                                        return p.f75480a;
                                    }

                                    @Override // g00.p
                                    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
                                        return ((C03141) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
                                    }
                                }

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
                                    if (animatable.m().floatValue() >= f0Var.m1(h.l(-50))) {
                                        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C03141(animatable, null), 3, null);
                                    } else {
                                        lVar.invoke(Boolean.TRUE);
                                    }
                                }
                            };
                            final CoroutineScope coroutineScope2 = this.f28795e;
                            final Animatable<Float, j> animatable2 = this.f28793c;
                            g00.a<p> aVar2 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt.PromotedPost.3.2.2

                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* compiled from: CategoryListingsView.kt */
                                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$PromotedPost$3$2$2$1", f = "CategoryListingsView.kt", l = {286}, m = "invokeSuspend")
                                /* renamed from: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$PromotedPost$3$2$2$1  reason: invalid class name */
                                /* loaded from: classes2.dex */
                                public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

                                    /* renamed from: a  reason: collision with root package name */
                                    int f28804a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ Animatable<Float, j> f28805b;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    AnonymousClass1(Animatable<Float, j> animatable, zz.a<? super AnonymousClass1> aVar) {
                                        super(2, aVar);
                                        this.f28805b = animatable;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final zz.a<p> create(Object obj, zz.a<?> aVar) {
                                        return new AnonymousClass1(this.f28805b, aVar);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        Object f11;
                                        f11 = kotlin.coroutines.intrinsics.b.f();
                                        int i11 = this.f28804a;
                                        if (i11 != 0) {
                                            if (i11 == 1) {
                                                kotlin.f.b(obj);
                                            } else {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                        } else {
                                            kotlin.f.b(obj);
                                            Animatable<Float, j> animatable = this.f28805b;
                                            Float c11 = kotlin.coroutines.jvm.internal.a.c(0.0f);
                                            this.f28804a = 1;
                                            if (Animatable.f(animatable, c11, null, null, null, this, 14, null) == f11) {
                                                return f11;
                                            }
                                        }
                                        return p.f75480a;
                                    }

                                    @Override // g00.p
                                    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
                                        return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
                                    }
                                }

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
                                    BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass1(animatable2, null), 3, null);
                                }
                            };
                            final CoroutineScope coroutineScope3 = this.f28795e;
                            final Animatable<Float, j> animatable3 = this.f28793c;
                            g00.p<x, Float, p> pVar = new g00.p<x, Float, p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt.PromotedPost.3.2.3

                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* compiled from: CategoryListingsView.kt */
                                @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$PromotedPost$3$2$3$1", f = "CategoryListingsView.kt", l = {290}, m = "invokeSuspend")
                                /* renamed from: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$PromotedPost$3$2$3$1  reason: invalid class name */
                                /* loaded from: classes2.dex */
                                public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

                                    /* renamed from: a  reason: collision with root package name */
                                    int f28808a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ Animatable<Float, j> f28809b;

                                    /* renamed from: c  reason: collision with root package name */
                                    final /* synthetic */ float f28810c;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    AnonymousClass1(Animatable<Float, j> animatable, float f11, zz.a<? super AnonymousClass1> aVar) {
                                        super(2, aVar);
                                        this.f28809b = animatable;
                                        this.f28810c = f11;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final zz.a<p> create(Object obj, zz.a<?> aVar) {
                                        return new AnonymousClass1(this.f28809b, this.f28810c, aVar);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        Object f11;
                                        f11 = kotlin.coroutines.intrinsics.b.f();
                                        int i11 = this.f28808a;
                                        if (i11 != 0) {
                                            if (i11 == 1) {
                                                kotlin.f.b(obj);
                                            } else {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                        } else {
                                            kotlin.f.b(obj);
                                            Animatable<Float, j> animatable = this.f28809b;
                                            Float c11 = kotlin.coroutines.jvm.internal.a.c(animatable.m().floatValue() + this.f28810c);
                                            this.f28808a = 1;
                                            if (animatable.t(c11, this) == f11) {
                                                return f11;
                                            }
                                        }
                                        return p.f75480a;
                                    }

                                    @Override // g00.p
                                    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
                                        return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                public final void b(x change, float f12) {
                                    o.i(change, "change");
                                    BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new AnonymousClass1(animatable3, f12, null), 3, null);
                                }

                                @Override // g00.p
                                public /* bridge */ /* synthetic */ p invoke(x xVar, Float f12) {
                                    b(xVar, f12.floatValue());
                                    return p.f75480a;
                                }
                            };
                            this.f28791a = 1;
                            if (DragGestureDetectorKt.i(f0Var, null, aVar, aVar2, pVar, this, 1, null) == f11) {
                                return f11;
                            }
                        }
                        return p.f75480a;
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                public final void b(q.c AnimatedVisibility, a aVar2, int i13) {
                    o.i(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-106719888, i13, -1, "com.forsale.app.features.categories.listings.category.view.PromotedPost.<anonymous> (CategoryListingsView.kt:268)");
                    }
                    w.c cVar2 = w.c.this;
                    float f11 = 16;
                    androidx.compose.ui.c m11 = PaddingKt.m(androidx.compose.ui.c.f7566a, h.l(f11), h.l(12), h.l(f11), 0.0f, 8, null);
                    final Animatable<Float, j> animatable2 = animatable;
                    androidx.compose.ui.c c11 = m0.c(SizeKt.h(OffsetKt.a(m11, new l<e2.d, n>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$PromotedPost$3.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final long b(e2.d offset) {
                            int d11;
                            o.i(offset, "$this$offset");
                            d11 = i00.c.d(animatable2.m().floatValue());
                            return e2.o.a(0, d11);
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ n invoke(e2.d dVar) {
                            return n.b(b(dVar));
                        }
                    }), 0.0f, 1, null), p.f75480a, new AnonymousClass2(animatable, onPromotedPostFinished, a11, null));
                    aVar2.C(-492369756);
                    Object D3 = aVar2.D();
                    if (D3 == a.f7182a.a()) {
                        D3 = v.j.a();
                        aVar2.u(D3);
                    }
                    aVar2.S();
                    final PromotedPostItemViewModel promotedPostItemViewModel2 = promotedPostItemViewModel;
                    final n1<InAppMessageEntity> n1Var = b11;
                    final Context context2 = context;
                    androidx.compose.ui.c e11 = cVar2.e(i.a(ClickableKt.c(c11, (v.k) D3, null, false, null, null, new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$PromotedPost$3.4
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
                            InAppMessageEntity t11;
                            Integer itemId;
                            PromotedPostItemViewModel.this.Q();
                            t11 = CategoryListingsViewKt.t(n1Var);
                            if (t11 == null || (itemId = t11.getItemId()) == null) {
                                return;
                            }
                            ListingDetailsActivity.R.a(context2, (r33 & 1) != 0 ? null : null, (r33 & 2) != 0 ? null : null, (r33 & 4) != 0 ? -1 : itemId.intValue(), (r33 & 8) != 0 ? null : null, (r33 & 16) != 0 ? ListingsTypes.NORMAL_LISTINGS : null, (r33 & 32) != 0 ? null : AnalyticsDetailsSource.PROMOTED_LISTING.getValue(), (r33 & 64) != 0 ? null : null, (r33 & 128) != 0 ? null : null, (r33 & 256) != 0 ? null : null, (r33 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : null, (r33 & 1024) != 0 ? false : false, (r33 & RecyclerView.l.FLAG_MOVED) == 0 ? 0 : -1, (r33 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : null, (r33 & 8192) == 0 ? null : null, (r33 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r.n() : null);
                        }
                    }, 28, null), 2.0f), b.f74009a.m());
                    c0.f c12 = g.c(h.l(8));
                    dk.a aVar3 = dk.a.f54291a;
                    int i14 = dk.a.f54292b;
                    yj.d f12 = aVar3.a(aVar2, i14).f();
                    int i15 = yj.d.f76453b;
                    long m12 = f12.m(aVar2, i15);
                    long c13 = aVar3.a(aVar2, i14).g().c(aVar2, i15);
                    final l<Boolean, p> lVar = onPromotedPostFinished;
                    final int i16 = i11;
                    final n1<InAppMessageEntity> n1Var2 = b11;
                    SurfaceKt.c(e11, c12, m12, c13, null, 0.0f, r0.b.b(aVar2, 132415668, true, new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$PromotedPost$3.5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void b(a aVar4, int i17) {
                            InAppMessageEntity t11;
                            String str;
                            InAppMessageEntity t12;
                            String str2;
                            InAppMessageEntity t13;
                            int i18;
                            if ((i17 & 11) == 2 && aVar4.i()) {
                                aVar4.L();
                                return;
                            }
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.U(132415668, i17, -1, "com.forsale.app.features.categories.listings.category.view.PromotedPost.<anonymous>.<anonymous> (CategoryListingsView.kt:302)");
                            }
                            l<Boolean, p> lVar2 = lVar;
                            int i19 = i16;
                            n1<InAppMessageEntity> n1Var3 = n1Var2;
                            aVar4.C(693286680);
                            c.a aVar5 = androidx.compose.ui.c.f7566a;
                            Arrangement arrangement = Arrangement.f3698a;
                            Arrangement.e g11 = arrangement.g();
                            b.a aVar6 = b.f74009a;
                            a0 a12 = androidx.compose.foundation.layout.o.a(g11, aVar6.l(), aVar4, 0);
                            aVar4.C(-1323940314);
                            int a13 = e.a(aVar4, 0);
                            k s11 = aVar4.s();
                            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                            g00.a<ComposeUiNode> a14 = companion.a();
                            q<e1<ComposeUiNode>, a, Integer, p> c14 = LayoutKt.c(aVar5);
                            if (!(aVar4.k() instanceof j0.d)) {
                                e.c();
                            }
                            aVar4.I();
                            if (aVar4.f()) {
                                aVar4.y(a14);
                            } else {
                                aVar4.t();
                            }
                            a a15 = Updater.a(aVar4);
                            Updater.c(a15, a12, companion.e());
                            Updater.c(a15, s11, companion.g());
                            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
                            if (a15.f() || !o.d(a15.D(), Integer.valueOf(a13))) {
                                a15.u(Integer.valueOf(a13));
                                a15.p(Integer.valueOf(a13), b12);
                            }
                            c14.invoke(e1.a(e1.b(aVar4)), aVar4, 0);
                            aVar4.C(2058660585);
                            w.u uVar = w.u.f74924a;
                            t11 = CategoryListingsViewKt.t(n1Var3);
                            String str3 = null;
                            if (t11 != null) {
                                str = t11.getImage();
                            } else {
                                str = null;
                            }
                            aVar4.C(-763642195);
                            if (str != null) {
                                CategoryListingsViewKt.a(str, aVar4, 0);
                            }
                            aVar4.S();
                            float f13 = 16;
                            androidx.compose.ui.c d11 = t.d(uVar, PaddingKt.m(aVar5, h.l(12), h.l(f13), 0.0f, h.l(f13), 4, null), 1.0f, false, 2, null);
                            Arrangement.f o11 = arrangement.o(h.l(4));
                            aVar4.C(-483455358);
                            a0 a16 = androidx.compose.foundation.layout.e.a(o11, aVar6.k(), aVar4, 6);
                            aVar4.C(-1323940314);
                            int a17 = e.a(aVar4, 0);
                            k s12 = aVar4.s();
                            g00.a<ComposeUiNode> a18 = companion.a();
                            q<e1<ComposeUiNode>, a, Integer, p> c15 = LayoutKt.c(d11);
                            if (!(aVar4.k() instanceof j0.d)) {
                                e.c();
                            }
                            aVar4.I();
                            if (aVar4.f()) {
                                aVar4.y(a18);
                            } else {
                                aVar4.t();
                            }
                            a a19 = Updater.a(aVar4);
                            Updater.c(a19, a16, companion.e());
                            Updater.c(a19, s12, companion.g());
                            g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
                            if (a19.f() || !o.d(a19.D(), Integer.valueOf(a17))) {
                                a19.u(Integer.valueOf(a17));
                                a19.p(Integer.valueOf(a17), b13);
                            }
                            c15.invoke(e1.a(e1.b(aVar4)), aVar4, 0);
                            aVar4.C(2058660585);
                            f fVar2 = f.f74891a;
                            CategoryListingsViewKt.e(aVar4, 0);
                            t12 = CategoryListingsViewKt.t(n1Var3);
                            if (t12 != null) {
                                str2 = t12.getText();
                            } else {
                                str2 = null;
                            }
                            t13 = CategoryListingsViewKt.t(n1Var3);
                            if (t13 != null) {
                                str3 = t13.getImage();
                            }
                            if (str3 != null) {
                                i18 = 2;
                            } else {
                                i18 = 1;
                            }
                            CategoryListingsViewKt.d(str2, i18, aVar4, 0, 0);
                            aVar4.S();
                            aVar4.w();
                            aVar4.S();
                            aVar4.S();
                            CategoryListingsViewKt.h(uVar, lVar2, aVar4, ((i19 >> 6) & 112) | 6);
                            aVar4.S();
                            aVar4.w();
                            aVar4.S();
                            aVar4.S();
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.T();
                            }
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                            b(aVar4, num.intValue());
                            return p.f75480a;
                        }
                    }), aVar2, 1572864, 48);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(q.c cVar2, a aVar2, Integer num) {
                    b(cVar2, aVar2, num.intValue());
                    return p.f75480a;
                }
            }), h11, i12 | 200064, 18);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l12 = h11.l();
            if (l12 != null) {
                l12.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$PromotedPost$4
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(a aVar2, int i13) {
                        CategoryListingsViewKt.s(w.c.this, promotedPostItemViewModel, z11, onPromotedPostFinished, aVar2, v0.a(i11 | 1));
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
        public static final InAppMessageEntity t(n1<InAppMessageEntity> n1Var) {
            return n1Var.getValue();
        }

        public static final void u(final boolean z11, final int i11, final SortingStates sortingOptionState, final boolean z12, final l<? super SortingStates, p> onSortButtonClicked, a aVar, final int i12) {
            int i13;
            a aVar2;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            o.i(sortingOptionState, "sortingOptionState");
            o.i(onSortButtonClicked, "onSortButtonClicked");
            a h11 = aVar.h(311441194);
            if ((i12 & 14) == 0) {
                if (h11.a(z11)) {
                    i18 = 4;
                } else {
                    i18 = 2;
                }
                i13 = i18 | i12;
            } else {
                i13 = i12;
            }
            if ((i12 & 112) == 0) {
                if (h11.d(i11)) {
                    i17 = 32;
                } else {
                    i17 = 16;
                }
                i13 |= i17;
            }
            if ((i12 & 896) == 0) {
                if (h11.T(sortingOptionState)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i13 |= i16;
            }
            if ((i12 & 7168) == 0) {
                if (h11.a(z12)) {
                    i15 = RecyclerView.l.FLAG_MOVED;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            if ((57344 & i12) == 0) {
                if (h11.F(onSortButtonClicked)) {
                    i14 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i14 = 8192;
                }
                i13 |= i14;
            }
            final int i19 = i13;
            if ((46811 & i19) == 9362 && h11.i()) {
                h11.L();
                aVar2 = h11;
            } else {
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(311441194, i19, -1, "com.forsale.app.features.categories.listings.category.view.ResultCountSection (CategoryListingsView.kt:153)");
                }
                aVar2 = h11;
                AnimatedVisibilityKt.d(z11, null, EnterExitTransitionKt.o(r.g.k(MessageTemplateConstants.Values.CENTER_POPUP_HEIGHT, 0, null, 6, null), 0.0f, 2, null).c(EnterExitTransitionKt.m(r.g.k(LogSeverity.ERROR_VALUE, 0, h0.e(), 2, null), null, false, null, 14, null)), EnterExitTransitionKt.q(r.g.k(MessageTemplateConstants.Values.CENTER_POPUP_HEIGHT, 0, null, 6, null), 0.0f, 2, null).c(EnterExitTransitionKt.y(r.g.k(LogSeverity.ERROR_VALUE, 0, h0.e(), 2, null), null, false, null, 14, null)), null, r0.b.b(h11, -1046075902, true, new q<q.c, a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$ResultCountSection$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    public final void b(q.c AnimatedVisibility, a aVar3, int i21) {
                        o.i(AnimatedVisibility, "$this$AnimatedVisibility");
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-1046075902, i21, -1, "com.forsale.app.features.categories.listings.category.view.ResultCountSection.<anonymous> (CategoryListingsView.kt:169)");
                        }
                        int i22 = i11;
                        boolean z13 = z12;
                        SortingStates sortingStates = sortingOptionState;
                        l<SortingStates, p> lVar = onSortButtonClicked;
                        int i23 = i19;
                        CategoryListingsViewKt.v(i22, z13, sortingStates, lVar, aVar3, ((i23 >> 3) & 14) | ((i23 >> 6) & 112) | (i23 & 896) | ((i23 >> 3) & 7168));
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.q
                    public /* bridge */ /* synthetic */ p invoke(q.c cVar, a aVar3, Integer num) {
                        b(cVar, aVar3, num.intValue());
                        return p.f75480a;
                    }
                }), h11, 196608 | (i19 & 14), 18);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }
            d1 l11 = aVar2.l();
            if (l11 != null) {
                l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$ResultCountSection$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(a aVar3, int i21) {
                        CategoryListingsViewKt.u(z11, i11, sortingOptionState, z12, onSortButtonClicked, aVar3, v0.a(i12 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(a aVar3, Integer num) {
                        b(aVar3, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        public static final void v(final int i11, final boolean z11, final SortingStates sortingOptionState, final l<? super SortingStates, p> onSortButtonClicked, a aVar, final int i12) {
            final int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            o.i(sortingOptionState, "sortingOptionState");
            o.i(onSortButtonClicked, "onSortButtonClicked");
            a h11 = aVar.h(-376497357);
            if ((i12 & 14) == 0) {
                if (h11.d(i11)) {
                    i17 = 4;
                } else {
                    i17 = 2;
                }
                i13 = i17 | i12;
            } else {
                i13 = i12;
            }
            if ((i12 & 112) == 0) {
                if (h11.a(z11)) {
                    i16 = 32;
                } else {
                    i16 = 16;
                }
                i13 |= i16;
            }
            if ((i12 & 896) == 0) {
                if (h11.T(sortingOptionState)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            if ((i12 & 7168) == 0) {
                if (h11.F(onSortButtonClicked)) {
                    i14 = RecyclerView.l.FLAG_MOVED;
                } else {
                    i14 = 1024;
                }
                i13 |= i14;
            }
            if ((i13 & 5851) == 1170 && h11.i()) {
                h11.L();
            } else {
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-376497357, i13, -1, "com.forsale.app.features.categories.listings.category.view.ResultCountSectionItem (CategoryListingsView.kt:179)");
                }
                h11.C(-483455358);
                c.a aVar2 = androidx.compose.ui.c.f7566a;
                a0 a11 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), b.f74009a.k(), h11, 0);
                h11.C(-1323940314);
                int a12 = e.a(h11, 0);
                k s11 = h11.s();
                ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                g00.a<ComposeUiNode> a13 = companion.a();
                q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(aVar2);
                if (!(h11.k() instanceof j0.d)) {
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
                dk.a aVar3 = dk.a.f54291a;
                int i18 = dk.a.f54292b;
                yj.d e11 = aVar3.a(h11, i18).e();
                int i19 = yj.d.f76453b;
                float f11 = 8;
                float f12 = 16;
                SectionTitleKt.a(PaddingKt.l(BackgroundKt.b(aVar2, e11.h(h11, i19), null, 2, null), h.l(f12), h.l(f11), h.l(f12), h.l(f11)), null, r0.b.b(h11, 271927979, true, new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$ResultCountSectionItem$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r25v0, types: [androidx.compose.runtime.a, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r4v10 */
                    public final void b(a aVar4, int i21) {
                        if ((i21 & 11) == 2 && aVar4.i()) {
                            aVar4.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(271927979, i21, -1, "com.forsale.app.features.categories.listings.category.view.ResultCountSectionItem.<anonymous>.<anonymous> (CategoryListingsView.kt:191)");
                        }
                        c.a aVar5 = androidx.compose.ui.c.f7566a;
                        androidx.compose.ui.c h12 = SizeKt.h(aVar5, 0.0f, 1, null);
                        b.c i22 = b.f74009a.i();
                        Arrangement.f e12 = Arrangement.f3698a.e();
                        int i23 = i11;
                        final l<SortingStates, p> lVar = onSortButtonClicked;
                        final SortingStates sortingStates = sortingOptionState;
                        aVar4.C(693286680);
                        a0 a15 = androidx.compose.foundation.layout.o.a(e12, i22, aVar4, 54);
                        aVar4.C(-1323940314);
                        int a16 = e.a(aVar4, 0);
                        k s12 = aVar4.s();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.f8256m;
                        g00.a<ComposeUiNode> a17 = companion2.a();
                        q<e1<ComposeUiNode>, a, Integer, p> c12 = LayoutKt.c(h12);
                        if (!(aVar4.k() instanceof j0.d)) {
                            e.c();
                        }
                        aVar4.I();
                        if (aVar4.f()) {
                            aVar4.y(a17);
                        } else {
                            aVar4.t();
                        }
                        a a18 = Updater.a(aVar4);
                        Updater.c(a18, a15, companion2.e());
                        Updater.c(a18, s12, companion2.g());
                        g00.p<ComposeUiNode, Integer, p> b12 = companion2.b();
                        if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
                            a18.u(Integer.valueOf(a16));
                            a18.p(Integer.valueOf(a16), b12);
                        }
                        c12.invoke(e1.a(e1.b(aVar4)), aVar4, 0);
                        aVar4.C(2058660585);
                        androidx.compose.ui.c d11 = t.d(w.u.f74924a, aVar5, 1.0f, false, 2, null);
                        int f13 = b2.f.f16081b.f();
                        String c13 = p1.g.c(y0.f70606o9, new Object[]{Integer.valueOf(i23)}, aVar4, 64);
                        dk.a aVar6 = dk.a.f54291a;
                        int i24 = dk.a.f54292b;
                        TextKt.a(c13, d11, f13, 0, false, 0, 0, null, aVar6.c(aVar4, i24).r(), aVar6.a(aVar4, i24).e().j(aVar4, yj.d.f76453b), 0, aVar4, 0, 0, 1272);
                        aVar4.C(511388516);
                        boolean T = aVar4.T(lVar) | aVar4.T(sortingStates);
                        Object D = aVar4.D();
                        if (T || D == a.f7182a.a()) {
                            D = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x014e: CONSTRUCTOR  (r4v9 'D' java.lang.Object) = 
                                  (r13v0 'lVar' g00.l<com.forsale.app.features.categories.listings.SortingStates, wz.p> A[DONT_INLINE])
                                  (r12v0 'sortingStates' com.forsale.app.features.categories.listings.SortingStates A[DONT_INLINE])
                                 call: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$ResultCountSectionItem$1$1$1$1$1.<init>(g00.l, com.forsale.app.features.categories.listings.SortingStates):void type: CONSTRUCTOR in method: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$ResultCountSectionItem$1$1.b(androidx.compose.runtime.a, int):void, file: classes2.dex
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
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$ResultCountSectionItem$1$1$1$1$1, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                                	... 25 more
                                */
                            /*
                                Method dump skipped, instructions count: 429
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$ResultCountSectionItem$1$1.b(androidx.compose.runtime.a, int):void");
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                            b(aVar4, num.intValue());
                            return p.f75480a;
                        }
                    }), null, null, null, h11, 384, 58);
                    h11.C(1693821163);
                    if (z11) {
                        SpacerKt.a(BackgroundKt.b(SizeKt.i(SizeKt.h(aVar2, 0.0f, 1, null), h.l(f12)), aVar3.a(h11, i18).g().c(h11, i19), null, 2, null), h11, 0);
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
                    l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$ResultCountSectionItem$2
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void b(a aVar4, int i21) {
                            CategoryListingsViewKt.v(i11, z11, sortingOptionState, onSortButtonClicked, aVar4, v0.a(i12 | 1));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                            b(aVar4, num.intValue());
                            return p.f75480a;
                        }
                    });
                }
            }

            public static final void w(final androidx.compose.ui.c modifier, final boolean z11, final g00.a<p> onClick, a aVar, final int i11) {
                int i12;
                a aVar2;
                int i13;
                int i14;
                int i15;
                o.i(modifier, "modifier");
                o.i(onClick, "onClick");
                a h11 = aVar.h(-1419239611);
                if ((i11 & 14) == 0) {
                    if (h11.T(modifier)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i12 = i15 | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 112) == 0) {
                    if (h11.a(z11)) {
                        i14 = 32;
                    } else {
                        i14 = 16;
                    }
                    i12 |= i14;
                }
                if ((i11 & 896) == 0) {
                    if (h11.F(onClick)) {
                        i13 = 256;
                    } else {
                        i13 = 128;
                    }
                    i12 |= i13;
                }
                int i16 = i12;
                if ((i16 & 731) == 146 && h11.i()) {
                    h11.L();
                    aVar2 = h11;
                } else {
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-1419239611, i16, -1, "com.forsale.app.features.categories.listings.category.view.UpButton (CategoryListingsView.kt:131)");
                    }
                    if (z11) {
                        ButtonFABData a11 = ButtonFABData.f41024a.a();
                        Painter d11 = p1.e.d(sj.d.f68677n, h11, 0);
                        s.n e11 = h0.g.e(false, 0.0f, 0L, h11, 0, 7);
                        h11.C(1157296644);
                        boolean T = h11.T(onClick);
                        Object D = h11.D();
                        if (T || D == a.f7182a.a()) {
                            D = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$UpButton$1$1
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
                                    onClick.invoke();
                                }
                            };
                            h11.u(D);
                        }
                        h11.S();
                        aVar2 = h11;
                        FabButtonKt.a(modifier, (g00.a) D, a11, d11, 0L, 0L, 0.0f, null, e11, h11, (i16 & 14) | RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT | (ButtonFABData.f41025b << 6), 240);
                    } else {
                        aVar2 = h11;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }
                d1 l11 = aVar2.l();
                if (l11 != null) {
                    l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$UpButton$2
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void b(a aVar3, int i17) {
                            CategoryListingsViewKt.w(androidx.compose.ui.c.this, z11, onClick, aVar3, v0.a(i11 | 1));
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(a aVar3, Integer num) {
                            b(aVar3, num.intValue());
                            return p.f75480a;
                        }
                    });
                }
            }
        }
