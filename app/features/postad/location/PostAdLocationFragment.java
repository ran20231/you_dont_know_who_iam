package com.forsale.app.features.postad.location;

import aa.q9;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.location.PostAdLocationViewModel;
import com.forsale.app.ui.map.LocationPickerActivity;
import com.forsale.app.utils.CrashlyticsUtilsKt;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import com.forsale.app.utils.ViewsExtensionsKt;
import com.forsale.app.utils.facades.map.MapFacadeImpl;
import com.forsale.app.utils.facades.map.MarkerType;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.material.chip.Chip;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import t9.r0;
import t9.y0;
import wz.h;
import wz.p;
import xe.d;
import z3.i;
/* compiled from: PostAdLocationFragment.kt */
/* loaded from: classes2.dex */
public final class PostAdLocationFragment extends xe.a<q9, PostAdLocationViewModel> {
    public static final a G = new a(null);
    public static final int H = 8;
    public PostAdLocationViewModel.b A;
    private final h B = FragmentViewModelLazyKt.b(this, s.b(PostAdViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.postad.location.PostAdLocationFragment$special$$inlined$activityViewModels$default$1
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
    }, new g00.a<w3.a>() { // from class: com.forsale.app.features.postad.location.PostAdLocationFragment$special$$inlined$activityViewModels$default$2
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
    }, new g00.a<t0.b>() { // from class: com.forsale.app.features.postad.location.PostAdLocationFragment$special$$inlined$activityViewModels$default$3
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
    private final i C = new i(s.b(d.class), new g00.a<Bundle>() { // from class: com.forsale.app.features.postad.location.PostAdLocationFragment$special$$inlined$navArgs$1
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
    private final h D;
    private final int E;
    private final h F;

    /* compiled from: PostAdLocationFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(View levelView, Boolean bool) {
            boolean z11;
            o.i(levelView, "levelView");
            boolean z12 = true;
            if (bool != null) {
                z11 = bool.booleanValue();
            } else {
                z11 = true;
            }
            ViewsExtensionsKt.s(levelView, z11);
            if (bool != null && bool.booleanValue()) {
                z12 = false;
            }
            levelView.setClickable(z12);
        }
    }

    /* compiled from: PostAdLocationFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b implements c0<Pair<? extends Double, ? extends Double>> {
        b() {
            PostAdLocationFragment.this = r1;
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(Pair<Double, Double> pair) {
            if (pair != null) {
                PostAdLocationFragment postAdLocationFragment = PostAdLocationFragment.this;
                postAdLocationFragment.Y().d0(pair.c().doubleValue(), pair.d().doubleValue(), Float.valueOf(postAdLocationFragment.B().a2()));
            }
        }
    }

    /* compiled from: PostAdLocationFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c implements c0<MarkerType> {
        c() {
            PostAdLocationFragment.this = r1;
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(MarkerType markerType) {
            com.forsale.app.utils.facades.map.a Y = PostAdLocationFragment.this.Y();
            o.f(markerType);
            Y.r(markerType);
        }
    }

    public PostAdLocationFragment() {
        h b11;
        h a11;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.features.postad.location.PostAdLocationFragment$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ PostAdLocationFragment f35610f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, PostAdLocationFragment postAdLocationFragment) {
                    super(fragment, bundle);
                    this.f35610f = postAdLocationFragment;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    PostAdViewModel b02;
                    d a02;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    PostAdLocationViewModel.b X = this.f35610f.X();
                    b02 = this.f35610f.b0();
                    a02 = this.f35610f.a0();
                    PostAdLocationViewModel a11 = X.a(b02, Integer.valueOf(a02.a()));
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
        this.D = FragmentViewModelLazyKt.b(this, s.b(PostAdLocationViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
        this.E = t9.t0.W1;
        a11 = kotlin.d.a(new g00.a<MapFacadeImpl>() { // from class: com.forsale.app.features.postad.location.PostAdLocationFragment$mapFacade$2

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PostAdLocationFragment.kt */
            /* renamed from: com.forsale.app.features.postad.location.PostAdLocationFragment$mapFacade$2$1  reason: invalid class name */
            /* loaded from: classes2.dex */
            public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements g00.a<p> {
                AnonymousClass1(Object obj) {
                    super(0, obj, PostAdLocationViewModel.class, "onMapClick", "onMapClick()V", 0);
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ p invoke() {
                    m();
                    return p.f75480a;
                }

                public final void m() {
                    ((PostAdLocationViewModel) this.receiver).t2();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final MapFacadeImpl invoke() {
                int i11 = r0.S5;
                View root = PostAdLocationFragment.J(PostAdLocationFragment.this).getRoot();
                o.h(root, "getRoot(...)");
                androidx.lifecycle.s viewLifecycleOwner = PostAdLocationFragment.this.getViewLifecycleOwner();
                o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                return new MapFacadeImpl(i11, root, viewLifecycleOwner, new AnonymousClass1(PostAdLocationFragment.this.B()), null, null, null, true, 0.0f, 368, null);
            }
        });
        this.F = a11;
    }

    public static final /* synthetic */ q9 J(PostAdLocationFragment postAdLocationFragment) {
        return (q9) postAdLocationFragment.m();
    }

    private final void S() {
        LifeCycleUtilsKt.b(this, new PostAdLocationFragment$bindObservers$1(this, null));
        LifeCycleUtilsKt.b(this, new PostAdLocationFragment$bindObservers$2(this, null));
        LifeCycleUtilsKt.b(this, new PostAdLocationFragment$bindObservers$3(this, null));
        LifeCycleUtilsKt.b(this, new PostAdLocationFragment$bindObservers$4(this, null));
        B().m1().observe(getViewLifecycleOwner(), new b());
        B().G1().observe(getViewLifecycleOwner(), new c());
        LifeCycleUtilsKt.b(this, new PostAdLocationFragment$bindObservers$7(this, null));
        LifeCycleUtilsKt.b(this, new PostAdLocationFragment$bindObservers$8(this, null));
        LifeCycleUtilsKt.b(this, new PostAdLocationFragment$bindObservers$9(this, null));
        LifeCycleUtilsKt.b(this, new PostAdLocationFragment$bindObservers$10(this, null));
        LifeCycleUtilsKt.b(this, new PostAdLocationFragment$bindObservers$11(this, null));
        LifeCycleUtilsKt.b(this, new PostAdLocationFragment$bindObservers$12(this, null));
    }

    public final void T(String str) {
        Chip chip = new Chip(((q9) m()).getRoot().getContext());
        chip.setCloseIconVisible(true);
        chip.setCheckable(false);
        chip.setText(str);
        chip.setTag(str);
        chip.setOnCloseIconClickListener(new xe.c(this, str));
        ((q9) m()).S.Q.addView(chip);
    }

    public static final void V(PostAdLocationFragment this$0, String landMark, View view) {
        o.i(this$0, "this$0");
        o.i(landMark, "$landMark");
        ((q9) this$0.m()).S.Q.removeView(view);
        this$0.B().B2(landMark);
    }

    public final com.forsale.app.utils.facades.map.a Y() {
        return (com.forsale.app.utils.facades.map.a) this.F.getValue();
    }

    public final d a0() {
        return (d) this.C.getValue();
    }

    public final PostAdViewModel b0() {
        return (PostAdViewModel) this.B.getValue();
    }

    public final void d0() {
        MarkerType markerType;
        Pair<Double, Double> value = Y().p().getValue();
        if (value == null) {
            value = wz.i.a(Double.valueOf((double) Utils.DOUBLE_EPSILON), Double.valueOf((double) Utils.DOUBLE_EPSILON));
        }
        double doubleValue = value.a().doubleValue();
        double doubleValue2 = value.b().doubleValue();
        LocationPickerActivity.a aVar = LocationPickerActivity.G;
        float a22 = B().a2();
        b0<MarkerType> H1 = B().H1();
        if (H1 != null) {
            markerType = H1.getValue();
        } else {
            markerType = null;
        }
        MarkerType markerType2 = markerType;
        o.f(markerType2);
        aVar.c(this, doubleValue, doubleValue2, a22, markerType2, y0.R1);
    }

    public final void e0(String str) {
        View findViewWithTag = ((q9) m()).S.Q.findViewWithTag(str);
        if (findViewWithTag != null) {
            ((q9) m()).S.Q.removeView(findViewWithTag);
        }
    }

    public static final void f0(View view, Boolean bool) {
        G.a(view, bool);
    }

    public final PostAdLocationViewModel.b X() {
        PostAdLocationViewModel.b bVar = this.A;
        if (bVar != null) {
            return bVar;
        }
        o.w("factory");
        return null;
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: c0 */
    public PostAdLocationViewModel B() {
        return (PostAdLocationViewModel) this.D.getValue();
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return this.E;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        LocationPickerActivity.G.b(i11, i12, intent, new g00.p<Double, Double, p>() { // from class: com.forsale.app.features.postad.location.PostAdLocationFragment$onActivityResult$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(double d11, double d12) {
                PostAdLocationViewModel.G2(PostAdLocationFragment.this.B(), d11, d12, null, 4, null);
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(Double d11, Double d12) {
                b(d11.doubleValue(), d12.doubleValue());
                return p.f75480a;
            }
        });
    }

    @Override // com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        o.i(menu, "menu");
        o.i(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        menu.clear();
    }

    @Override // com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CrashlyticsUtilsKt.b("post ad locations", null, 2, null);
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        S();
    }
}
