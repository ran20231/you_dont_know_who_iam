package com.forsale.app.features.postad.extrainfo;

import aa.o9;
import android.os.Bundle;
import android.view.View;
import androidx.databinding.ObservableField;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.c0;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import com.forsale.app.features.postad.PostAdUtilsKt;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.extrainfo.PostAdExtraInfoViewModel;
import com.forsale.app.utils.CrashlyticsUtilsKt;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import com.google.android.material.chip.Chip;
import g00.l;
import java.util.Arrays;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import t9.y0;
import wz.h;
import wz.p;
/* compiled from: PostAdExtraInfoFragment.kt */
/* loaded from: classes2.dex */
public final class PostAdExtraInfoFragment extends we.b<o9, PostAdExtraInfoViewModel> {
    private final h E = FragmentViewModelLazyKt.b(this, s.b(PostAdViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.postad.extrainfo.PostAdExtraInfoFragment$special$$inlined$activityViewModels$default$1
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
    }, new g00.a<w3.a>() { // from class: com.forsale.app.features.postad.extrainfo.PostAdExtraInfoFragment$special$$inlined$activityViewModels$default$2
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
    }, new g00.a<t0.b>() { // from class: com.forsale.app.features.postad.extrainfo.PostAdExtraInfoFragment$special$$inlined$activityViewModels$default$3
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
    public PostAdExtraInfoViewModel.b F;
    private final h G;
    private final int H;

    /* compiled from: PostAdExtraInfoFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements c0<String> {
        a() {
            PostAdExtraInfoFragment.this = r1;
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(String str) {
            PostAdExtraInfoFragment postAdExtraInfoFragment = PostAdExtraInfoFragment.this;
            o.f(str);
            postAdExtraInfoFragment.h0(str);
        }
    }

    /* compiled from: PostAdExtraInfoFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b implements c0<Set<String>> {
        b() {
            PostAdExtraInfoFragment.this = r1;
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(Set<String> set) {
            if (set != null) {
                PostAdExtraInfoFragment postAdExtraInfoFragment = PostAdExtraInfoFragment.this;
                for (String str : set) {
                    postAdExtraInfoFragment.h0(str);
                }
            }
        }
    }

    /* compiled from: PostAdExtraInfoFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c implements c0<Boolean> {
        c() {
            PostAdExtraInfoFragment.this = r1;
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            o.f(bool);
            if (bool.booleanValue()) {
                ObservableField<String> Z0 = PostAdExtraInfoFragment.this.B().Z0();
                w wVar = w.f61809a;
                String string = PostAdExtraInfoFragment.this.getString(y0.f70708uc);
                o.h(string, "getString(...)");
                String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(PostAdExtraInfoFragment.this.B().g1())}, 1));
                o.h(format, "format(...)");
                Z0.k(format);
                return;
            }
            PostAdExtraInfoFragment.this.B().Z0().k(PostAdExtraInfoFragment.this.getString(y0.f70692tc));
        }
    }

    /* compiled from: PostAdExtraInfoFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d implements c0<String> {
        d() {
            PostAdExtraInfoFragment.this = r1;
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(String str) {
            PostAdExtraInfoFragment.this.B().c2(str);
        }
    }

    public PostAdExtraInfoFragment() {
        h b11;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.features.postad.extrainfo.PostAdExtraInfoFragment$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ PostAdExtraInfoFragment f35435f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, PostAdExtraInfoFragment postAdExtraInfoFragment) {
                    super(fragment, bundle);
                    this.f35435f = postAdExtraInfoFragment;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    PostAdViewModel e02;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    PostAdExtraInfoViewModel.b d02 = this.f35435f.d0();
                    e02 = this.f35435f.e0();
                    PostAdExtraInfoViewModel a11 = d02.a(e02);
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
        this.G = FragmentViewModelLazyKt.b(this, s.b(PostAdExtraInfoViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
        this.H = t9.t0.U1;
    }

    public static final /* synthetic */ o9 V(PostAdExtraInfoFragment postAdExtraInfoFragment) {
        return (o9) postAdExtraInfoFragment.m();
    }

    public final void a0(String str, boolean z11) {
        Chip chip = new Chip(((o9) m()).getRoot().getContext());
        chip.setCloseIconVisible(true);
        chip.setCheckable(false);
        chip.setText(str);
        chip.setTag(str);
        chip.setOnCloseIconClickListener(new we.c(this));
        ((o9) m()).Q.O.P.addView(chip);
        if (z11) {
            chip.post(new we.d(this));
        }
    }

    public static final void b0(PostAdExtraInfoFragment this$0, View view) {
        o.i(this$0, "this$0");
        ((o9) this$0.m()).Q.O.P.removeView(view);
        PostAdExtraInfoViewModel f02 = ((o9) this$0.m()).f0();
        if (f02 != null) {
            Object tag = view.getTag();
            o.g(tag, "null cannot be cast to non-null type kotlin.String");
            f02.R1((String) tag);
        }
    }

    public static final void c0(PostAdExtraInfoFragment this$0) {
        o.i(this$0, "this$0");
        ((o9) this$0.m()).Q.O.R.fullScroll(66);
    }

    public final PostAdViewModel e0() {
        return (PostAdViewModel) this.E.getValue();
    }

    private final void g0() {
        LifeCycleUtilsKt.b(this, new PostAdExtraInfoFragment$registerObservers$1(this, null));
        LifeCycleUtilsKt.b(this, new PostAdExtraInfoFragment$registerObservers$2(this, null));
        LifeCycleUtilsKt.b(this, new PostAdExtraInfoFragment$registerObservers$3(this, null));
        LifeCycleUtilsKt.b(this, new PostAdExtraInfoFragment$registerObservers$4(this, null));
        LifeCycleUtilsKt.b(this, new PostAdExtraInfoFragment$registerObservers$5(this, null));
        LifeCycleUtilsKt.b(this, new PostAdExtraInfoFragment$registerObservers$6(this, null));
        LifeCycleUtilsKt.b(this, new PostAdExtraInfoFragment$registerObservers$7(this, null));
        PostAdUtilsKt.b(this, e0());
        PostAdUtilsKt.c(this, e0());
        B().i1().observe(getViewLifecycleOwner(), new d());
        LifeCycleUtilsKt.b(this, new PostAdExtraInfoFragment$registerObservers$9(this, null));
        B().q1().observe(getViewLifecycleOwner(), new a());
        B().r1().observe(getViewLifecycleOwner(), new b());
        B().f1().observe(getViewLifecycleOwner(), new c());
        BuildersKt__Builders_commonKt.launch$default(t.a(this), null, null, new PostAdExtraInfoFragment$registerObservers$13(this, null), 3, null);
    }

    public final void h0(String str) {
        View findViewWithTag = ((o9) m()).Q.O.P.findViewWithTag(str);
        if (findViewWithTag != null) {
            ((o9) m()).Q.O.P.removeView(findViewWithTag);
        }
    }

    public final PostAdExtraInfoViewModel.b d0() {
        PostAdExtraInfoViewModel.b bVar = this.F;
        if (bVar != null) {
            return bVar;
        }
        o.w("factory");
        return null;
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: f0 */
    public PostAdExtraInfoViewModel B() {
        return (PostAdExtraInfoViewModel) this.G.getValue();
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return this.H;
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        CrashlyticsUtilsKt.a("post ad extra info", new l<tn.b, p>() { // from class: com.forsale.app.features.postad.extrainfo.PostAdExtraInfoFragment$onViewCreated$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(tn.b logScreenVisited) {
                PostAdViewModel e02;
                o.i(logScreenVisited, "$this$logScreenVisited");
                e02 = PostAdExtraInfoFragment.this.e0();
                logScreenVisited.b("intention", e02.k2().name());
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(tn.b bVar) {
                b(bVar);
                return p.f75480a;
            }
        });
        g0();
        B().Q1();
    }
}
