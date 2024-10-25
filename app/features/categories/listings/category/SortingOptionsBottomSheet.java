package com.forsale.app.features.categories.listings.category;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.z;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.features.categories.listings.SortingStates;
import com.forsale.app.features.categories.listings.filtration.views.CommonViewsKt;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.theme.ThemeKt;
import com.google.android.gms.ads.AdRequest;
import e2.v;
import g00.l;
import g00.q;
import j0.d1;
import j0.e1;
import j0.k;
import j0.n1;
import j0.v0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import okhttp3.internal.http2.Http2;
import t9.z0;
import v0.b;
import w.u;
import w3.a;
import wz.h;
import wz.p;
/* compiled from: SortingOptionsBottomSheet.kt */
/* loaded from: classes2.dex */
public final class SortingOptionsBottomSheet extends g {

    /* renamed from: h  reason: collision with root package name */
    public static final a f28633h = new a(null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f28634i = 8;

    /* renamed from: g  reason: collision with root package name */
    private final h f28635g;

    /* compiled from: SortingOptionsBottomSheet.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(FragmentManager fragmentManager) {
            o.i(fragmentManager, "fragmentManager");
            new SortingOptionsBottomSheet(null).show(fragmentManager, "SortingOptionsDialogFragment");
        }
    }

    public /* synthetic */ SortingOptionsBottomSheet(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CategoryListingsViewModel A() {
        return (CategoryListingsViewModel) this.f28635g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(final f fVar, androidx.compose.runtime.a aVar, final int i11) {
        SortingStates sortingStates;
        boolean z11;
        androidx.compose.runtime.a h11 = aVar.h(-716406592);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-716406592, i11, -1, "com.forsale.app.features.categories.listings.category.SortingOptionsBottomSheet.SetSortingStateItems (SortingOptionsBottomSheet.kt:64)");
        }
        List<SortingStates> list = (List) z.b(A().b2(), null, h11, 8, 1).getValue();
        if (list != null) {
            for (SortingStates sortingStates2 : list) {
                if (fVar == null || (sortingStates = fVar.a()) == null) {
                    sortingStates = SortingStates.DEFAULT;
                }
                if (sortingStates2 == sortingStates) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                x(sortingStates2, z11, new l<SortingStates, p>() { // from class: com.forsale.app.features.categories.listings.category.SortingOptionsBottomSheet$SetSortingStateItems$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(1);
                    }

                    public final void b(SortingStates it2) {
                        CategoryListingsViewModel A;
                        o.i(it2, "it");
                        A = SortingOptionsBottomSheet.this.A();
                        A.o3(it2);
                        SortingOptionsBottomSheet.this.dismiss();
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(SortingStates sortingStates3) {
                        b(sortingStates3);
                        return p.f75480a;
                    }
                }, h11, RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT);
            }
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.SortingOptionsBottomSheet$SetSortingStateItems$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    SortingOptionsBottomSheet.this.w(fVar, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    @Override // androidx.fragment.app.j
    public int getTheme() {
        return z0.f70803m;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        Context requireContext = requireContext();
        o.h(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(r0.b.c(903342428, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.SortingOptionsBottomSheet$onCreateView$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final f e(n1<? extends f> n1Var) {
                return n1Var.getValue();
            }

            public final void c(androidx.compose.runtime.a aVar, int i11) {
                CategoryListingsViewModel A;
                if ((i11 & 11) == 2 && aVar.i()) {
                    aVar.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(903342428, i11, -1, "com.forsale.app.features.categories.listings.category.SortingOptionsBottomSheet.onCreateView.<anonymous>.<anonymous> (SortingOptionsBottomSheet.kt:47)");
                }
                A = SortingOptionsBottomSheet.this.A();
                final n1 b11 = z.b(A.N2(), null, aVar, 8, 1);
                final SortingOptionsBottomSheet sortingOptionsBottomSheet = SortingOptionsBottomSheet.this;
                ThemeKt.a(null, null, r0.b.b(aVar, -1553146139, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.SortingOptionsBottomSheet$onCreateView$1$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        if ((i12 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-1553146139, i12, -1, "com.forsale.app.features.categories.listings.category.SortingOptionsBottomSheet.onCreateView.<anonymous>.<anonymous>.<anonymous> (SortingOptionsBottomSheet.kt:49)");
                        }
                        float f11 = 16;
                        androidx.compose.ui.c f12 = ScrollKt.f(PaddingKt.m(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), e2.h.l(f11), e2.h.l(18), e2.h.l(f11), 0.0f, 8, null), ScrollKt.c(0, aVar2, 0, 1), false, null, false, 14, null);
                        SortingOptionsBottomSheet sortingOptionsBottomSheet2 = SortingOptionsBottomSheet.this;
                        n1<f> n1Var = b11;
                        aVar2.C(-483455358);
                        a0 a11 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), aVar2, 0);
                        aVar2.C(-1323940314);
                        int a12 = j0.e.a(aVar2, 0);
                        k s11 = aVar2.s();
                        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                        g00.a<ComposeUiNode> a13 = companion.a();
                        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(f12);
                        if (!(aVar2.k() instanceof j0.d)) {
                            j0.e.c();
                        }
                        aVar2.I();
                        if (aVar2.f()) {
                            aVar2.y(a13);
                        } else {
                            aVar2.t();
                        }
                        androidx.compose.runtime.a a14 = Updater.a(aVar2);
                        Updater.c(a14, a11, companion.e());
                        Updater.c(a14, s11, companion.g());
                        g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
                        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                            a14.u(Integer.valueOf(a12));
                            a14.p(Integer.valueOf(a12), b12);
                        }
                        c11.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                        aVar2.C(2058660585);
                        w.f fVar = w.f.f74891a;
                        sortingOptionsBottomSheet2.w(SortingOptionsBottomSheet$onCreateView$1$1.e(n1Var), aVar2, 64);
                        aVar2.S();
                        aVar2.w();
                        aVar2.S();
                        aVar2.S();
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                }), aVar, 384, 3);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar, Integer num) {
                c(aVar, num.intValue());
                return p.f75480a;
            }
        }));
        return composeView;
    }

    public final void x(final SortingStates state, final boolean z11, final l<? super SortingStates, p> onOptionSelected, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        androidx.compose.ui.text.a0 b11;
        int i13;
        int i14;
        int i15;
        o.i(state, "state");
        o.i(onOptionSelected, "onOptionSelected");
        androidx.compose.runtime.a h11 = aVar.h(-2074254191);
        if ((i11 & 14) == 0) {
            if (h11.T(state)) {
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
            if (h11.F(onOptionSelected)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        int i16 = i12;
        if ((i16 & 731) == 146 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-2074254191, i16, -1, "com.forsale.app.features.categories.listings.category.SortingOptionsBottomSheet.SortingOptionItem (SortingOptionsBottomSheet.kt:83)");
            }
            androidx.compose.ui.c m11 = PaddingKt.m(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, e2.h.l(20), 7, null);
            h11.C(511388516);
            boolean T = h11.T(onOptionSelected) | h11.T(state);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.category.SortingOptionsBottomSheet$SortingOptionItem$1$1
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
                        onOptionSelected.invoke(state);
                    }
                };
                h11.u(D);
            }
            h11.S();
            androidx.compose.ui.c e11 = ClickableKt.e(m11, false, null, null, (g00.a) D, 7, null);
            b.c i17 = v0.b.f74009a.i();
            Arrangement.f e12 = Arrangement.f3698a.e();
            h11.C(693286680);
            a0 a11 = androidx.compose.foundation.layout.o.a(e12, i17, h11, 54);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(e11);
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
            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b12);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            String b13 = p1.g.b(state.getTitle(), h11, 0);
            dk.a aVar2 = dk.a.f54291a;
            int i18 = dk.a.f54292b;
            b11 = r18.b((r48 & 1) != 0 ? r18.f9207a.g() : 0L, (r48 & 2) != 0 ? r18.f9207a.k() : v.d(16), (r48 & 4) != 0 ? r18.f9207a.n() : null, (r48 & 8) != 0 ? r18.f9207a.l() : null, (r48 & 16) != 0 ? r18.f9207a.m() : null, (r48 & 32) != 0 ? r18.f9207a.i() : null, (r48 & 64) != 0 ? r18.f9207a.j() : null, (r48 & 128) != 0 ? r18.f9207a.o() : 0L, (r48 & 256) != 0 ? r18.f9207a.e() : null, (r48 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? r18.f9207a.u() : null, (r48 & 1024) != 0 ? r18.f9207a.p() : null, (r48 & RecyclerView.l.FLAG_MOVED) != 0 ? r18.f9207a.d() : 0L, (r48 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? r18.f9207a.s() : null, (r48 & 8192) != 0 ? r18.f9207a.r() : null, (r48 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r18.f9207a.h() : null, (r48 & 32768) != 0 ? r18.f9208b.h() : 0, (r48 & 65536) != 0 ? r18.f9208b.i() : 0, (r48 & 131072) != 0 ? r18.f9208b.e() : 0L, (r48 & 262144) != 0 ? r18.f9208b.j() : null, (r48 & 524288) != 0 ? r18.f9209c : null, (r48 & 1048576) != 0 ? r18.f9208b.f() : null, (r48 & 2097152) != 0 ? r18.f9208b.d() : 0, (r48 & 4194304) != 0 ? r18.f9208b.c() : 0, (r48 & 8388608) != 0 ? aVar2.c(h11, i18).a().f9208b.k() : null);
            TextKt.a(b13, null, 0, 0, false, 0, 0, null, b11, aVar2.a(h11, i18).e().m(h11, yj.d.f76453b), 0, h11, 0, 0, 1278);
            h11.C(511388516);
            boolean T2 = h11.T(onOptionSelected) | h11.T(state);
            Object D2 = h11.D();
            if (T2 || D2 == androidx.compose.runtime.a.f7182a.a()) {
                D2 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.category.SortingOptionsBottomSheet$SortingOptionItem$2$1$1
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
                        onOptionSelected.invoke(state);
                    }
                };
                h11.u(D2);
            }
            h11.S();
            CommonViewsKt.b(z11, (g00.a) D2, h11, (i16 >> 3) & 14);
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
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.category.SortingOptionsBottomSheet$SortingOptionItem$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i19) {
                    SortingOptionsBottomSheet.this.x(state, z11, onOptionSelected, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    private SortingOptionsBottomSheet() {
        final h b11;
        final g00.a<x0> aVar = new g00.a<x0>() { // from class: com.forsale.app.features.categories.listings.category.SortingOptionsBottomSheet$viewModel$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                Fragment requireParentFragment = SortingOptionsBottomSheet.this.requireParentFragment();
                o.h(requireParentFragment, "requireParentFragment(...)");
                return requireParentFragment;
            }
        };
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.features.categories.listings.category.SortingOptionsBottomSheet$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) g00.a.this.invoke();
            }
        });
        this.f28635g = FragmentViewModelLazyKt.b(this, s.b(CategoryListingsViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.categories.listings.category.SortingOptionsBottomSheet$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w0 invoke() {
                x0 c11;
                c11 = FragmentViewModelLazyKt.c(h.this);
                return c11.getViewModelStore();
            }
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.categories.listings.category.SortingOptionsBottomSheet$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w3.a invoke() {
                x0 c11;
                androidx.lifecycle.l lVar;
                w3.a aVar2;
                g00.a aVar3 = g00.a.this;
                if (aVar3 == null || (aVar2 = (w3.a) aVar3.invoke()) == null) {
                    c11 = FragmentViewModelLazyKt.c(b11);
                    if (c11 instanceof androidx.lifecycle.l) {
                        lVar = (androidx.lifecycle.l) c11;
                    } else {
                        lVar = null;
                    }
                    if (lVar != null) {
                        return lVar.getDefaultViewModelCreationExtras();
                    }
                    return a.C0905a.f75031b;
                }
                return aVar2;
            }
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.categories.listings.category.SortingOptionsBottomSheet$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final t0.b invoke() {
                x0 c11;
                androidx.lifecycle.l lVar;
                t0.b defaultViewModelProviderFactory;
                c11 = FragmentViewModelLazyKt.c(b11);
                if (c11 instanceof androidx.lifecycle.l) {
                    lVar = (androidx.lifecycle.l) c11;
                } else {
                    lVar = null;
                }
                if (lVar == null || (defaultViewModelProviderFactory = lVar.getDefaultViewModelProviderFactory()) == null) {
                    t0.b defaultViewModelProviderFactory2 = Fragment.this.getDefaultViewModelProviderFactory();
                    o.h(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                    return defaultViewModelProviderFactory2;
                }
                return defaultViewModelProviderFactory;
            }
        });
    }
}
