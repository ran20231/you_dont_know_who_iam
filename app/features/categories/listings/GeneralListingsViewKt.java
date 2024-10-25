package com.forsale.app.features.categories.listings;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material.pullrefresh.PullRefreshIndicatorKt;
import androidx.compose.material.pullrefresh.PullRefreshKt;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.material.pullrefresh.PullRefreshStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.paging.PagingData;
import com.forsale.app.datalayer.network.requestsbodies.MyListingsType;
import com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel;
import com.forsale.app.features.categories.listings.paging.PagedListingsKt;
import com.forsale.app.features.categories.listings.paging.b;
import com.forsale.app.utils.ComposeLifeCycleUtilsKt;
import g00.a;
import g00.l;
import g00.q;
import j0.d;
import j0.d1;
import j0.e;
import j0.e1;
import j0.k;
import j0.n1;
import j0.v0;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.StateFlow;
import v0.b;
import wz.p;
/* compiled from: GeneralListingsView.kt */
/* loaded from: classes2.dex */
public final class GeneralListingsViewKt {
    public static final void a(final GeneralListingsViewModel viewModel, final a<p> onBackPressed, androidx.compose.runtime.a aVar, final int i11) {
        o.i(viewModel, "viewModel");
        o.i(onBackPressed, "onBackPressed");
        androidx.compose.runtime.a h11 = aVar.h(591378619);
        if (c.I()) {
            c.U(591378619, i11, -1, "com.forsale.app.features.categories.listings.GeneralListingsView (GeneralListingsView.kt:25)");
        }
        final n1 a11 = z.a(viewModel.V(), Boolean.FALSE, null, h11, 56, 2);
        PullRefreshState a12 = PullRefreshStateKt.a(b(a11), new GeneralListingsViewKt$GeneralListingsView$pullRefreshState$1(viewModel), 0.0f, 0.0f, h11, 0, 12);
        ComposeLifeCycleUtilsKt.b(null, new a<p>() { // from class: com.forsale.app.features.categories.listings.GeneralListingsViewKt$GeneralListingsView$1
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
                GeneralListingsViewModel.this.a0();
            }
        }, null, new a<p>() { // from class: com.forsale.app.features.categories.listings.GeneralListingsViewKt$GeneralListingsView$2
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
                GeneralListingsViewModel.this.d0();
            }
        }, h11, 0, 5);
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        androidx.compose.ui.c d11 = PullRefreshKt.d(aVar2, a12, false, 2, null);
        h11.C(733328855);
        b.a aVar3 = b.f74009a;
        a0 g11 = BoxKt.g(aVar3.o(), false, h11, 0);
        h11.C(-1323940314);
        int a13 = e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        a<ComposeUiNode> a14 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(d11);
        if (!(h11.k() instanceof d)) {
            e.c();
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
        List<MyListingsType> M = viewModel.M();
        GeneralListingsViewKt$GeneralListingsView$3$1 generalListingsViewKt$GeneralListingsView$3$1 = new GeneralListingsViewKt$GeneralListingsView$3$1(viewModel);
        ListingsTypes K = viewModel.K();
        StateFlow<PagingData<x9.b<?>>> I = viewModel.I();
        int intValue = ((Number) z.b(viewModel.L(), null, h11, 8, 1).getValue()).intValue();
        GeneralListingsViewKt$GeneralListingsView$3$2 generalListingsViewKt$GeneralListingsView$3$2 = new GeneralListingsViewKt$GeneralListingsView$3$2(viewModel);
        PagedListingsKt.a((MyListingsType) z.b(viewModel.S(), null, h11, 8, 1).getValue(), M, generalListingsViewKt$GeneralListingsView$3$1, K, I, intValue, boxScopeInstance, new l<com.forsale.app.features.categories.listings.paging.b, p>() { // from class: com.forsale.app.features.categories.listings.GeneralListingsViewKt$GeneralListingsView$3$5
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(com.forsale.app.features.categories.listings.paging.b state) {
                boolean b12;
                o.i(state, "state");
                if (state instanceof b.d) {
                    b12 = GeneralListingsViewKt.b(a11);
                    if (b12) {
                        GeneralListingsViewModel.this.h0(false);
                    }
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(com.forsale.app.features.categories.listings.paging.b bVar) {
                b(bVar);
                return p.f75480a;
            }
        }, new GeneralListingsViewKt$GeneralListingsView$3$3(viewModel), generalListingsViewKt$GeneralListingsView$3$2, onBackPressed, new GeneralListingsViewKt$GeneralListingsView$3$4(viewModel), h11, 1605696, (i11 >> 3) & 14);
        PullRefreshIndicatorKt.d(b(a11), a12, boxScopeInstance.e(aVar2, aVar3.m()), 0L, 0L, false, h11, PullRefreshState.f6708j << 3, 56);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.GeneralListingsViewKt$GeneralListingsView$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i12) {
                    GeneralListingsViewKt.a(GeneralListingsViewModel.this, onBackPressed, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }
}
