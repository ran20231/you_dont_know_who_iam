package com.forsale.app.features.postad.bundles;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.z;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import com.forsale.app.datalayer.network.entities.PostListingIntention;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.bundles.PostAdBundlesViewModel;
import com.forsale.app.features.postad.bundles.d;
import com.forsale.app.features.postad.bundles.f;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.NavigationUtilsKt;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import com.forsale.designSystem.SurfaceKt;
import com.forsale.designSystem.theme.ThemeKt;
import g00.l;
import j0.d1;
import j0.n1;
import j0.u;
import j0.v0;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import wz.p;
import z3.i;
/* compiled from: PostAdBundlesFragment.kt */
/* loaded from: classes2.dex */
public final class PostAdBundlesFragment extends c {

    /* renamed from: f  reason: collision with root package name */
    private final wz.h f34942f = FragmentViewModelLazyKt.b(this, s.b(PostAdViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.postad.bundles.PostAdBundlesFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // g00.a
        /* renamed from: b */
        public final w0 invoke() {
            w0 viewModelStore = Fragment.this.requireActivity().getViewModelStore();
            o.h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new g00.a<w3.a>() { // from class: com.forsale.app.features.postad.bundles.PostAdBundlesFragment$special$$inlined$activityViewModels$default$2
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
        }

        @Override // g00.a
        /* renamed from: b */
        public final w3.a invoke() {
            w3.a aVar;
            g00.a aVar2 = g00.a.this;
            if (aVar2 == null || (aVar = (w3.a) aVar2.invoke()) == null) {
                w3.a defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                o.h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
            return aVar;
        }
    }, new g00.a<t0.b>() { // from class: com.forsale.app.features.postad.bundles.PostAdBundlesFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // g00.a
        /* renamed from: b */
        public final t0.b invoke() {
            t0.b defaultViewModelProviderFactory = Fragment.this.requireActivity().getDefaultViewModelProviderFactory();
            o.h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    });

    /* renamed from: g  reason: collision with root package name */
    private final i f34943g = new i(s.b(e.class), new g00.a<Bundle>() { // from class: com.forsale.app.features.postad.bundles.PostAdBundlesFragment$special$$inlined$navArgs$1
        {
            super(0);
        }

        @Override // g00.a
        /* renamed from: b */
        public final Bundle invoke() {
            Bundle arguments = Fragment.this.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " has null arguments");
        }
    });

    /* renamed from: h  reason: collision with root package name */
    private final wz.h f34944h;

    /* renamed from: i  reason: collision with root package name */
    public PostAdBundlesViewModel.a f34945i;

    /* renamed from: j  reason: collision with root package name */
    private final wz.h f34946j;

    public PostAdBundlesFragment() {
        wz.h a11;
        wz.h b11;
        a11 = kotlin.d.a(new g00.a<PostListingIntention>() { // from class: com.forsale.app.features.postad.bundles.PostAdBundlesFragment$intention$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final PostListingIntention invoke() {
                e G;
                G = PostAdBundlesFragment.this.G();
                return G.a();
            }
        });
        this.f34944h = a11;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.features.postad.bundles.PostAdBundlesFragment$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ PostAdBundlesFragment f34958f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, PostAdBundlesFragment postAdBundlesFragment) {
                    super(fragment, bundle);
                    this.f34958f = postAdBundlesFragment;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    PostAdBundlesViewModel a11 = this.f34958f.D().a(this.f34958f.H());
                    o.g(a11, "null cannot be cast to non-null type T of com.forsale.app.utils.ViewModelHiltExtensionKt.assistedViewModel.<no name provided>.invoke.<no name provided>.create");
                    return a11;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final t0.b invoke() {
                return new a(Fragment.this, Fragment.this.getArguments(), this);
            }
        };
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5(new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4(this)));
        this.f34946j = FragmentViewModelLazyKt.b(this, s.b(PostAdBundlesViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostListingIntention E() {
        return (PostListingIntention) this.f34944h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e G() {
        return (e) this.f34943g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(d dVar) {
        I().I(dVar);
        if (o.d(dVar, d.a.f35073a)) {
            NavigationUtilsKt.d(androidx.navigation.fragment.a.a(this), f.d.f(f.f35078a, null, null, 3, null), null, 2, null);
        } else if (o.d(dVar, d.b.f35074a)) {
            NavigationUtilsKt.d(androidx.navigation.fragment.a.a(this), f.f35078a.c(), null, 2, null);
        } else {
            o.d(dVar, d.c.f35075a);
        }
    }

    private final void K() {
        LifeCycleUtilsKt.b(this, new PostAdBundlesFragment$registerObservers$1(this, null));
        LifeCycleUtilsKt.b(this, new PostAdBundlesFragment$registerObservers$2(this, null));
        LifeCycleUtilsKt.b(this, new PostAdBundlesFragment$registerObservers$3(this, null));
        LifeCycleUtilsKt.b(this, new PostAdBundlesFragment$registerObservers$4(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(-1014995336);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1014995336, i11, -1, "com.forsale.app.features.postad.bundles.PostAdBundlesFragment.Actions (PostAdBundlesFragment.kt:123)");
        }
        u.d(p.f75480a, new PostAdBundlesFragment$Actions$1(this, null), h11, 70);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.bundles.PostAdBundlesFragment$Actions$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    PostAdBundlesFragment.this.q(aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(androidx.compose.runtime.a aVar, final int i11) {
        String str;
        androidx.compose.runtime.a h11 = aVar.h(-215757832);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-215757832, i11, -1, "com.forsale.app.features.postad.bundles.PostAdBundlesFragment.BundlesScreen (PostAdBundlesFragment.kt:81)");
        }
        String str2 = null;
        final n1 b11 = z.b(I().y(), null, h11, 8, 1);
        n1 b12 = z.b(I().z(), null, h11, 8, 1);
        n1 b13 = z.b(I().C(), null, h11, 8, 1);
        boolean booleanValue = ((Boolean) z.a(H().P1(), Boolean.TRUE, null, h11, 56, 2).getValue()).booleanValue();
        PostAdBundlesViewModel I = I();
        Integer t11 = t(b12);
        h11.C(1197574559);
        if (t11 != null) {
            str2 = p1.g.b(t11.intValue(), h11, 0);
        }
        h11.S();
        if (str2 == null) {
            str = "";
        } else {
            str = str2;
        }
        BundlesViewKt.h(I, new l<com.forsale.app.datalayer.network.responses.Bundle, p>() { // from class: com.forsale.app.features.postad.bundles.PostAdBundlesFragment$BundlesScreen$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(com.forsale.app.datalayer.network.responses.Bundle it2) {
                o.i(it2, "it");
                PostAdBundlesFragment.this.I().G(it2);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(com.forsale.app.datalayer.network.responses.Bundle bundle) {
                b(bundle);
                return p.f75480a;
            }
        }, new g00.p<String, String, p>() { // from class: com.forsale.app.features.postad.bundles.PostAdBundlesFragment$BundlesScreen$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(String title, String url) {
                o.i(title, "title");
                o.i(url, "url");
                PostAdBundlesFragment.this.I().F(title, url);
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(String str3, String str4) {
                b(str3, str4);
                return p.f75480a;
            }
        }, new g00.a<p>() { // from class: com.forsale.app.features.postad.bundles.PostAdBundlesFragment$BundlesScreen$4
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
                PostAdBundlesFragment.this.I().J();
            }
        }, new g00.a<p>() { // from class: com.forsale.app.features.postad.bundles.PostAdBundlesFragment$BundlesScreen$5
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
                d s11;
                PostAdBundlesFragment postAdBundlesFragment = PostAdBundlesFragment.this;
                s11 = PostAdBundlesFragment.s(b11);
                postAdBundlesFragment.J(s11);
            }
        }, str, w(b13), booleanValue, h11, 8);
        q(h11, 8);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.bundles.PostAdBundlesFragment$BundlesScreen$6
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    PostAdBundlesFragment.this.r(aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d s(n1<? extends d> n1Var) {
        return n1Var.getValue();
    }

    private static final Integer t(n1<Integer> n1Var) {
        return n1Var.getValue();
    }

    private static final boolean w(n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }

    public final PostAdBundlesViewModel.a D() {
        PostAdBundlesViewModel.a aVar = this.f34945i;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    public final PostAdViewModel H() {
        return (PostAdViewModel) this.f34942f.getValue();
    }

    public final PostAdBundlesViewModel I() {
        return (PostAdBundlesViewModel) this.f34946j.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1000) {
            H().l2();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        Context requireContext = requireContext();
        o.h(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.b(viewLifecycleOwner));
        composeView.setContent(r0.b.c(1817590487, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.bundles.PostAdBundlesFragment$onCreateView$1$1
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
                    androidx.compose.runtime.c.U(1817590487, i11, -1, "com.forsale.app.features.postad.bundles.PostAdBundlesFragment.onCreateView.<anonymous>.<anonymous> (PostAdBundlesFragment.kt:68)");
                }
                final PostAdBundlesFragment postAdBundlesFragment = PostAdBundlesFragment.this;
                ThemeKt.a(null, null, r0.b.b(aVar, -1822163680, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.bundles.PostAdBundlesFragment$onCreateView$1$1.1
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        if ((i12 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-1822163680, i12, -1, "com.forsale.app.features.postad.bundles.PostAdBundlesFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (PostAdBundlesFragment.kt:69)");
                        }
                        long h11 = dk.a.f54291a.a(aVar2, dk.a.f54292b).e().h(aVar2, yj.d.f76453b);
                        final PostAdBundlesFragment postAdBundlesFragment2 = PostAdBundlesFragment.this;
                        SurfaceKt.c(null, null, h11, 0L, null, 0.0f, r0.b.b(aVar2, 430806108, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.postad.bundles.PostAdBundlesFragment.onCreateView.1.1.1.1
                            {
                                super(2);
                            }

                            public final void b(androidx.compose.runtime.a aVar3, int i13) {
                                if ((i13 & 11) == 2 && aVar3.i()) {
                                    aVar3.L();
                                    return;
                                }
                                if (androidx.compose.runtime.c.I()) {
                                    androidx.compose.runtime.c.U(430806108, i13, -1, "com.forsale.app.features.postad.bundles.PostAdBundlesFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PostAdBundlesFragment.kt:72)");
                                }
                                PostAdBundlesFragment.this.r(aVar3, 8);
                                if (androidx.compose.runtime.c.I()) {
                                    androidx.compose.runtime.c.T();
                                }
                            }

                            @Override // g00.p
                            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                                b(aVar3, num.intValue());
                                return p.f75480a;
                            }
                        }), aVar2, 1572864, 59);
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
        K();
        return composeView;
    }
}
