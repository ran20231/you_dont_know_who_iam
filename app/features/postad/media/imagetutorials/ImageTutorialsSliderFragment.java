package com.forsale.app.features.postad.media.imagetutorials;

import aa.ca;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.c0;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.viewpager.widget.ViewPager;
import com.forsale.app.datalayer.database.CategoryRuleSet;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.media.imagetutorials.ImageTutorialSliderViewModel;
import com.forsale.app.features.postad.media.imagetutorials.pager.IndefinitePagerIndicator;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.RevealAnimationUtilKt;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import t9.s0;
import wz.p;
/* compiled from: ImageTutorialsSliderFragment.kt */
/* loaded from: classes2.dex */
public final class ImageTutorialsSliderFragment extends com.forsale.app.features.postad.media.imagetutorials.b {

    /* renamed from: g  reason: collision with root package name */
    private ca f35956g;

    /* renamed from: i  reason: collision with root package name */
    public ImageTutorialSliderViewModel.a f35958i;

    /* renamed from: j  reason: collision with root package name */
    private final wz.h f35959j;

    /* renamed from: x  reason: collision with root package name */
    private boolean f35960x;

    /* renamed from: y  reason: collision with root package name */
    private final b f35961y;

    /* renamed from: f  reason: collision with root package name */
    private final z3.i f35955f = new z3.i(s.b(h.class), new g00.a<Bundle>() { // from class: com.forsale.app.features.postad.media.imagetutorials.ImageTutorialsSliderFragment$special$$inlined$navArgs$1
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
    private final wz.h f35957h = FragmentViewModelLazyKt.b(this, s.b(PostAdViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.postad.media.imagetutorials.ImageTutorialsSliderFragment$special$$inlined$activityViewModels$default$1
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
    }, new g00.a<w3.a>() { // from class: com.forsale.app.features.postad.media.imagetutorials.ImageTutorialsSliderFragment$special$$inlined$activityViewModels$default$2
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
    }, new g00.a<t0.b>() { // from class: com.forsale.app.features.postad.media.imagetutorials.ImageTutorialsSliderFragment$special$$inlined$activityViewModels$default$3
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

    /* compiled from: ImageTutorialsSliderFragment.kt */
    /* loaded from: classes2.dex */
    static final class a implements c0<List<? extends CategoryRuleSet.Tutorial>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f35971b;

        a(View view) {
            this.f35971b = view;
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(List<CategoryRuleSet.Tutorial> list) {
            ImageTutorialsSliderFragment imageTutorialsSliderFragment = ImageTutorialsSliderFragment.this;
            View view = this.f35971b;
            o.f(list);
            imageTutorialsSliderFragment.H(view, list);
        }
    }

    /* compiled from: ImageTutorialsSliderFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends androidx.activity.o {
        b() {
            super(true);
        }

        @Override // androidx.activity.o
        public void d() {
            ImageTutorialsSliderFragment.this.E();
        }
    }

    public ImageTutorialsSliderFragment() {
        wz.h b11;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.features.postad.media.imagetutorials.ImageTutorialsSliderFragment$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ ImageTutorialsSliderFragment f35968f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, ImageTutorialsSliderFragment imageTutorialsSliderFragment) {
                    super(fragment, bundle);
                    this.f35968f = imageTutorialsSliderFragment;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    PostAdViewModel C;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    ImageTutorialSliderViewModel.a B = this.f35968f.B();
                    C = this.f35968f.C();
                    ImageTutorialSliderViewModel a11 = B.a(C);
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
        this.f35959j = FragmentViewModelLazyKt.b(this, s.b(ImageTutorialSliderViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
        this.f35961y = new b();
    }

    private final h A() {
        return (h) this.f35955f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostAdViewModel C() {
        return (PostAdViewModel) this.f35957h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageTutorialSliderViewModel D() {
        return (ImageTutorialSliderViewModel) this.f35959j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        View view = getView();
        if (view != null) {
            view.post(new Runnable() { // from class: com.forsale.app.features.postad.media.imagetutorials.g
                @Override // java.lang.Runnable
                public final void run() {
                    ImageTutorialsSliderFragment.G(ImageTutorialsSliderFragment.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(final ImageTutorialsSliderFragment this$0) {
        o.i(this$0, "this$0");
        View view = this$0.getView();
        if (view != null) {
            RevealAnimationUtilKt.a(view, this$0.A().b(), this$0.A().a(), new g00.a<p>() { // from class: com.forsale.app.features.postad.media.imagetutorials.ImageTutorialsSliderFragment$goBack$1$1
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
                    androidx.navigation.fragment.a.a(ImageTutorialsSliderFragment.this).h0();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(final View view, List<CategoryRuleSet.Tutorial> list) {
        FragmentManager childFragmentManager = getChildFragmentManager();
        o.h(childFragmentManager, "getChildFragmentManager(...)");
        ze.a aVar = new ze.a(list, childFragmentManager);
        ca caVar = this.f35956g;
        ca caVar2 = null;
        if (caVar == null) {
            o.w("binding");
            caVar = null;
        }
        caVar.W.setAdapter(aVar);
        ca caVar3 = this.f35956g;
        if (caVar3 == null) {
            o.w("binding");
            caVar3 = null;
        }
        caVar3.W.h0();
        ca caVar4 = this.f35956g;
        if (caVar4 == null) {
            o.w("binding");
            caVar4 = null;
        }
        caVar4.W.setRotationY(view.getResources().getInteger(s0.f70167a));
        ca caVar5 = this.f35956g;
        if (caVar5 == null) {
            o.w("binding");
            caVar5 = null;
        }
        caVar5.W.U(false, new ViewPager.k() { // from class: com.forsale.app.features.postad.media.imagetutorials.f
            @Override // androidx.viewpager.widget.ViewPager.k
            public final void a(View view2, float f11) {
                ImageTutorialsSliderFragment.I(view, view2, f11);
            }
        });
        ca caVar6 = this.f35956g;
        if (caVar6 == null) {
            o.w("binding");
            caVar6 = null;
        }
        IndefinitePagerIndicator indefinitePagerIndicator = caVar6.R;
        ca caVar7 = this.f35956g;
        if (caVar7 == null) {
            o.w("binding");
        } else {
            caVar2 = caVar7;
        }
        indefinitePagerIndicator.k(caVar2.W);
        z(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(View this_initSlider, View page, float f11) {
        o.i(this_initSlider, "$this_initSlider");
        o.i(page, "page");
        page.setRotationY(this_initSlider.getResources().getInteger(s0.f70167a));
    }

    private final void z(View view) {
        requireActivity().getOnBackPressedDispatcher().h(this.f35961y);
    }

    public final ImageTutorialSliderViewModel.a B() {
        ImageTutorialSliderViewModel.a aVar = this.f35958i;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        ca f02 = ca.f0(inflater, viewGroup, false);
        o.h(f02, "inflate(...)");
        this.f35956g = f02;
        ca caVar = null;
        if (f02 == null) {
            o.w("binding");
            f02 = null;
        }
        f02.h0(D());
        f02.U(getViewLifecycleOwner());
        ca caVar2 = this.f35956g;
        if (caVar2 == null) {
            o.w("binding");
        } else {
            caVar = caVar2;
        }
        return caVar.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f35961y.h();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        androidx.fragment.app.p activity = getActivity();
        o.g(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        androidx.appcompat.app.a supportActionBar = ((androidx.appcompat.app.d) activity).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.F();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        androidx.fragment.app.p activity = getActivity();
        o.g(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        androidx.appcompat.app.a supportActionBar = ((androidx.appcompat.app.d) activity).getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.l();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        D().k().observe(getViewLifecycleOwner(), new a(view));
        LifeCycleUtilsKt.b(this, new ImageTutorialsSliderFragment$onViewCreated$2(this, null));
        if (!this.f35960x) {
            RevealAnimationUtilKt.c(view, A().b(), A().a(), 2000L, null, new g00.a<p>() { // from class: com.forsale.app.features.postad.media.imagetutorials.ImageTutorialsSliderFragment$onViewCreated$3
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
                    ImageTutorialsSliderFragment.this.f35960x = true;
                }
            }, 8, null);
        }
    }
}
