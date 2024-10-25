package com.forsale.app.features.postad.plans;

import aa.w9;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.c0;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bg.f;
import com.forsale.app.base.ActionViewsMode;
import com.forsale.app.datalayer.network.responses.PlansResponse;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.plans.PostAdPlansViewModel;
import com.forsale.app.utils.CrashlyticsUtilsKt;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import com.forsale.app.utils.ViewsExtensionsKt;
import g00.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import wz.h;
import wz.p;
/* compiled from: PostAdPlansFragment.kt */
/* loaded from: classes2.dex */
public final class PostAdPlansFragment extends cf.a<w9, PostAdPlansViewModel> {
    public PostAdPlansViewModel.a E;
    private final h F;
    private final int G;
    private final h H;
    private final h I;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdPlansFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements c0<List<? extends PlansResponse.Plan>> {
        a() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(List<PlansResponse.Plan> list) {
            if (PostAdPlansFragment.Q(PostAdPlansFragment.this).Q.getAdapter() == null) {
                PostAdPlansFragment.this.b0(list);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdPlansFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b implements c0<String> {
        b() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(String str) {
            WebView generalDescription = PostAdPlansFragment.Q(PostAdPlansFragment.this).O;
            o.h(generalDescription, "generalDescription");
            ViewsExtensionsKt.u(generalDescription, str, null, null, false, 14, null);
        }
    }

    public PostAdPlansFragment() {
        h b11;
        h a11;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.features.postad.plans.PostAdPlansFragment$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ PostAdPlansFragment f36358f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, PostAdPlansFragment postAdPlansFragment) {
                    super(fragment, bundle);
                    this.f36358f = postAdPlansFragment;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    PostAdViewModel Y;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    PostAdPlansViewModel.a V = this.f36358f.V();
                    Y = this.f36358f.Y();
                    PostAdPlansViewModel a11 = V.a(Y);
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
        b11 = d.b(LazyThreadSafetyMode.NONE, new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5(new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4(this)));
        this.F = FragmentViewModelLazyKt.b(this, s.b(PostAdPlansViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
        this.G = t9.t0.Z1;
        this.H = FragmentViewModelLazyKt.b(this, s.b(PostAdViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.postad.plans.PostAdPlansFragment$special$$inlined$activityViewModels$default$1
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.postad.plans.PostAdPlansFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w3.a invoke() {
                w3.a aVar2;
                g00.a aVar3 = g00.a.this;
                if (aVar3 == null || (aVar2 = (w3.a) aVar3.invoke()) == null) {
                    w3.a defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                    o.h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                    return defaultViewModelCreationExtras;
                }
                return aVar2;
            }
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.postad.plans.PostAdPlansFragment$special$$inlined$activityViewModels$default$3
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
        a11 = d.a(new g00.a<f>() { // from class: com.forsale.app.features.postad.plans.PostAdPlansFragment$plansAdapter$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final f invoke() {
                String j11 = PostAdPlansFragment.this.B().H0().j();
                if (j11 == null) {
                    j11 = "";
                }
                final PostAdPlansFragment postAdPlansFragment = PostAdPlansFragment.this;
                return new f(j11, new l<f.b, p>() { // from class: com.forsale.app.features.postad.plans.PostAdPlansFragment$plansAdapter$2.1
                    {
                        super(1);
                    }

                    public final void b(f.b it2) {
                        o.i(it2, "it");
                        PostAdPlansFragment.this.B().P0(it2);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(f.b bVar) {
                        b(bVar);
                        return p.f75480a;
                    }
                });
            }
        });
        this.I = a11;
    }

    public static final /* synthetic */ w9 Q(PostAdPlansFragment postAdPlansFragment) {
        return (w9) postAdPlansFragment.m();
    }

    private final f X() {
        return (f) this.I.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostAdViewModel Y() {
        return (PostAdViewModel) this.H.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(List<PlansResponse.Plan> list) {
        int y11;
        RecyclerView recyclerView = ((w9) m()).Q;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setNestedScrollingEnabled(true);
        Drawable drawable = androidx.core.content.b.getDrawable(recyclerView.getContext(), t9.q0.f69825z);
        if (drawable != null) {
            o.f(drawable);
            recyclerView.j(new bg.a(drawable));
        }
        f X = X();
        ((w9) m()).Q.setAdapter(X);
        p pVar = null;
        if (list != null) {
            List<PlansResponse.Plan> list2 = list;
            y11 = kotlin.collections.s.y(list2, 10);
            ArrayList arrayList = new ArrayList(y11);
            for (PlansResponse.Plan plan : list2) {
                arrayList.add(new f.b(plan));
            }
            X.k(arrayList);
            Integer I0 = B().I0();
            if (I0 != null) {
                X.l(I0.intValue());
                pVar = p.f75480a;
            }
        }
        if (pVar == null) {
            x10.a.b("Plans list shouldn't be null", new Object[0]);
        }
    }

    private final void c0() {
        B().E0().observe(getViewLifecycleOwner(), new a());
        B().D0().observe(getViewLifecycleOwner(), new b());
    }

    public final PostAdPlansViewModel.a V() {
        PostAdPlansViewModel.a aVar = this.E;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: a0 */
    public PostAdPlansViewModel B() {
        return (PostAdPlansViewModel) this.F.getValue();
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return this.G;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        c0();
    }

    @v9.a(viewId = {ActionViewsMode.ERROR_RELOAD})
    public final void onError(View view) {
        o.i(view, "view");
        B().C0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        B().Q0(X().f());
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        CrashlyticsUtilsKt.a("post ad plans", new l<tn.b, p>() { // from class: com.forsale.app.features.postad.plans.PostAdPlansFragment$onViewCreated$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(tn.b logScreenVisited) {
                PostAdViewModel Y;
                o.i(logScreenVisited, "$this$logScreenVisited");
                Y = PostAdPlansFragment.this.Y();
                logScreenVisited.b("intention", Y.k2().name());
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(tn.b bVar) {
                b(bVar);
                return p.f75480a;
            }
        });
        LifeCycleUtilsKt.b(this, new PostAdPlansFragment$onViewCreated$2(this, null));
        B().O0();
        LifeCycleUtilsKt.b(this, new PostAdPlansFragment$onViewCreated$3(this, null));
    }
}
