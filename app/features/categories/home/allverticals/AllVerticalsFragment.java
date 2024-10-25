package com.forsale.app.features.categories.home.allverticals;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Updater;
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
import com.forsale.adserver.view.models.AdsModel;
import com.forsale.adserver.view.models.DetailsIntention;
import com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheetKt;
import com.forsale.analytics.commercial.CommercialItemDetailsSource;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.features.categories.home.allverticals.c;
import com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource;
import com.forsale.app.features.maincontainer.MainContainerActivity;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.NavigationUtilsKt;
import com.forsale.app.utils.analytics.HomeVisitedSources;
import com.forsale.designSystem.dividers.DividersKt;
import com.forsale.designSystem.theme.ThemeKt;
import g00.q;
import j0.e1;
import j0.n1;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import q1.n;
import q1.r;
import w3.a;
import wz.p;
/* compiled from: AllVerticalsFragment.kt */
/* loaded from: classes2.dex */
public final class AllVerticalsFragment extends l {

    /* renamed from: f  reason: collision with root package name */
    private final wz.h f23352f;

    /* renamed from: g  reason: collision with root package name */
    public cx.a<ag.a> f23353g;

    public AllVerticalsFragment() {
        final wz.h b11;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.features.categories.home.allverticals.AllVerticalsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.features.categories.home.allverticals.AllVerticalsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) g00.a.this.invoke();
            }
        });
        this.f23352f = FragmentViewModelLazyKt.b(this, s.b(AllVerticalsViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.categories.home.allverticals.AllVerticalsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w0 invoke() {
                x0 c11;
                c11 = FragmentViewModelLazyKt.c(wz.h.this);
                return c11.getViewModelStore();
            }
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.categories.home.allverticals.AllVerticalsFragment$special$$inlined$viewModels$default$4
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.categories.home.allverticals.AllVerticalsFragment$special$$inlined$viewModels$default$5
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(AdsModel adsModel, com.forsale.adserver.view.screens.detailsScreen.a aVar, HomeVisitedSources homeVisitedSources) {
        CommercialItemDetailsSource commercialItemDetailsSource;
        Context context = getContext();
        if (context != null) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            if (homeVisitedSources == HomeVisitedSources.SUBCATEGORY_PAGE) {
                commercialItemDetailsSource = CommercialItemDetailsSource.SUB_CATEGORIES_SCREEN;
            } else {
                commercialItemDetailsSource = CommercialItemDetailsSource.VERTICAL_PAGE;
            }
            DetailsIntention detailsIntention = DetailsIntention.DETAILS_ONLY;
            o.f(parentFragmentManager);
            NewDetailsBottomSheetKt.f(context, adsModel, null, null, parentFragmentManager, detailsIntention, commercialItemDetailsSource, aVar, new g00.l<Boolean, p>() { // from class: com.forsale.app.features.categories.home.allverticals.AllVerticalsFragment$openCommercialDetails$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return p.f75480a;
                }

                public final void invoke(boolean z11) {
                    AllVerticalsViewModel z12;
                    z12 = AllVerticalsFragment.this.z();
                    z12.z(!z11);
                }
            }, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(CategoryEntity categoryEntity, CategoryListingsAnalyticSource categoryListingsAnalyticSource) {
        NavigationUtilsKt.d(androidx.navigation.fragment.a.a(this), c.C0261c.c(c.f23790a, categoryEntity, categoryEntity.getName(), categoryListingsAnalyticSource, null, null, null, null, null, false, 504, null), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(CategoryEntity categoryEntity, CategoryListingsAnalyticSource categoryListingsAnalyticSource) {
        NavigationUtilsKt.d(androidx.navigation.fragment.a.a(this), c.f23790a.a(categoryEntity, HomeVisitedSources.SUBCATEGORY_PAGE, categoryListingsAnalyticSource), null, 2, null);
    }

    private final void D() {
        LifeCycleUtilsKt.b(this, new AllVerticalsFragment$registerObservers$1(this, null));
    }

    private final void E(String str) {
        MainContainerActivity mainContainerActivity;
        androidx.appcompat.app.d l11 = ContextExtensionsKt.l(getActivity());
        if (l11 instanceof MainContainerActivity) {
            mainContainerActivity = (MainContainerActivity) l11;
        } else {
            mainContainerActivity = null;
        }
        if (mainContainerActivity != null) {
            mainContainerActivity.b2(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel r19, androidx.compose.runtime.a r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.allverticals.AllVerticalsFragment.q(com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel, androidx.compose.runtime.a, int, int):void");
    }

    private static final i r(n1<? extends i> n1Var) {
        return n1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AllVerticalsViewModel z() {
        return (AllVerticalsViewModel) this.f23352f.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        Context requireContext = requireContext();
        o.h(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(r0.b.c(-559938678, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.AllVerticalsFragment$onCreateView$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar, int i11) {
                if ((i11 & 11) == 2 && aVar.i()) {
                    aVar.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-559938678, i11, -1, "com.forsale.app.features.categories.home.allverticals.AllVerticalsFragment.onCreateView.<anonymous>.<anonymous> (AllVerticalsFragment.kt:65)");
                }
                final AllVerticalsFragment allVerticalsFragment = AllVerticalsFragment.this;
                ThemeKt.a(null, null, r0.b.b(aVar, 678928467, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.AllVerticalsFragment$onCreateView$1$1.1
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        if ((i12 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(678928467, i12, -1, "com.forsale.app.features.categories.home.allverticals.AllVerticalsFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (AllVerticalsFragment.kt:66)");
                        }
                        androidx.compose.ui.c c11 = n.c(androidx.compose.ui.c.f7566a, false, new g00.l<q1.s, p>() { // from class: com.forsale.app.features.categories.home.allverticals.AllVerticalsFragment.onCreateView.1.1.1.1
                            public final void b(q1.s semantics) {
                                o.i(semantics, "$this$semantics");
                                r.a(semantics, true);
                            }

                            @Override // g00.l
                            public /* bridge */ /* synthetic */ p invoke(q1.s sVar) {
                                b(sVar);
                                return p.f75480a;
                            }
                        }, 1, null);
                        AllVerticalsFragment allVerticalsFragment2 = AllVerticalsFragment.this;
                        aVar2.C(-483455358);
                        a0 a11 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), aVar2, 0);
                        aVar2.C(-1323940314);
                        int a12 = j0.e.a(aVar2, 0);
                        j0.k s11 = aVar2.s();
                        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                        g00.a<ComposeUiNode> a13 = companion.a();
                        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(c11);
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
                        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
                        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                            a14.u(Integer.valueOf(a12));
                            a14.p(Integer.valueOf(a12), b11);
                        }
                        c12.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                        aVar2.C(2058660585);
                        w.f fVar = w.f.f74891a;
                        DividersKt.a(null, 0.0f, 0L, aVar2, 0, 7);
                        allVerticalsFragment2.q(null, aVar2, 64, 1);
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
                b(aVar, num.intValue());
                return p.f75480a;
            }
        }));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        z().T();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        D();
    }
}
