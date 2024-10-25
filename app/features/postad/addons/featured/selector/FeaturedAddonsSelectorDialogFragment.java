package com.forsale.app.features.postad.addons.featured.selector;

import aa.a6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.g;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.c0;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.responses.Addon;
import com.forsale.app.datalayer.network.responses.AddonsGroup;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.addons.addonsgroupitem.AddonsGroupItem;
import com.forsale.app.features.postad.addons.addonsgroupitem.AddonsGroupItemViewModel;
import com.forsale.app.features.postad.addons.featured.selector.FeaturedAddonsSelectorViewModel;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import g00.l;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import t9.z0;
import wz.h;
import wz.p;
/* compiled from: FeaturedAddonsSelectorDialogFragment.kt */
/* loaded from: classes2.dex */
public final class FeaturedAddonsSelectorDialogFragment extends b {

    /* renamed from: f  reason: collision with root package name */
    private final l<Set<Addon>, p> f34730f;

    /* renamed from: g  reason: collision with root package name */
    private final h f34731g;

    /* renamed from: h  reason: collision with root package name */
    public FeaturedAddonsSelectorViewModel.a f34732h;

    /* renamed from: i  reason: collision with root package name */
    private final h f34733i;

    /* renamed from: j  reason: collision with root package name */
    private final lr.a<AddonsGroupItem> f34734j;

    /* renamed from: x  reason: collision with root package name */
    private final kr.b<AddonsGroupItem> f34735x;

    /* compiled from: FeaturedAddonsSelectorDialogFragment.kt */
    /* loaded from: classes2.dex */
    static final class a implements c0<AddonsGroupItemViewModel> {
        a() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(AddonsGroupItemViewModel addonsGroupItemViewModel) {
            lr.a aVar = FeaturedAddonsSelectorDialogFragment.this.f34734j;
            o.f(addonsGroupItemViewModel);
            FeaturedAddonsSelectorDialogFragment featuredAddonsSelectorDialogFragment = FeaturedAddonsSelectorDialogFragment.this;
            aVar.n(new AddonsGroupItem(addonsGroupItemViewModel, featuredAddonsSelectorDialogFragment, featuredAddonsSelectorDialogFragment.y()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FeaturedAddonsSelectorDialogFragment(final AddonsGroup addonsGroup, final ListingDetailsEntity listing, l<? super Set<Addon>, p> onDone) {
        h b11;
        o.i(addonsGroup, "addonsGroup");
        o.i(listing, "listing");
        o.i(onDone, "onDone");
        this.f34730f = onDone;
        this.f34731g = FragmentViewModelLazyKt.b(this, s.b(PostAdViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.postad.addons.featured.selector.FeaturedAddonsSelectorDialogFragment$special$$inlined$activityViewModels$default$1
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.postad.addons.featured.selector.FeaturedAddonsSelectorDialogFragment$special$$inlined$activityViewModels$default$2
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.postad.addons.featured.selector.FeaturedAddonsSelectorDialogFragment$special$$inlined$activityViewModels$default$3
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
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.features.postad.addons.featured.selector.FeaturedAddonsSelectorDialogFragment$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ FeaturedAddonsSelectorDialogFragment f34744f;

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ AddonsGroup f34745g;

                /* renamed from: h  reason: collision with root package name */
                final /* synthetic */ ListingDetailsEntity f34746h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, FeaturedAddonsSelectorDialogFragment featuredAddonsSelectorDialogFragment, AddonsGroup addonsGroup, ListingDetailsEntity listingDetailsEntity) {
                    super(fragment, bundle);
                    this.f34744f = featuredAddonsSelectorDialogFragment;
                    this.f34745g = addonsGroup;
                    this.f34746h = listingDetailsEntity;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    PostAdViewModel x11;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    FeaturedAddonsSelectorViewModel.a w11 = this.f34744f.w();
                    AddonsGroup addonsGroup = this.f34745g;
                    ListingDetailsEntity listingDetailsEntity = this.f34746h;
                    x11 = this.f34744f.x();
                    FeaturedAddonsSelectorViewModel a11 = w11.a(addonsGroup, listingDetailsEntity, x11);
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
                return new a(Fragment.this, Fragment.this.getArguments(), this, addonsGroup, listing);
            }
        };
        b11 = d.b(LazyThreadSafetyMode.NONE, new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5(new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4(this)));
        this.f34733i = FragmentViewModelLazyKt.b(this, s.b(FeaturedAddonsSelectorViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
        lr.a<AddonsGroupItem> aVar2 = new lr.a<>();
        this.f34734j = aVar2;
        this.f34735x = kr.b.f61943t.i(aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostAdViewModel x() {
        return (PostAdViewModel) this.f34731g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FeaturedAddonsSelectorViewModel y() {
        return (FeaturedAddonsSelectorViewModel) this.f34733i.getValue();
    }

    @Override // androidx.fragment.app.j
    public int getTheme() {
        return z0.f70799i;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        setCancelable(false);
        a6 a6Var = (a6) g.h(inflater, t9.t0.f70170a1, viewGroup, false);
        a6Var.U(getViewLifecycleOwner());
        a6Var.f0(y());
        RecyclerView recyclerView = a6Var.S;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.f34735x);
        return a6Var.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        y().z0().observe(getViewLifecycleOwner(), new a());
        LifeCycleUtilsKt.b(this, new FeaturedAddonsSelectorDialogFragment$onViewCreated$2(this, null));
        LifeCycleUtilsKt.b(this, new FeaturedAddonsSelectorDialogFragment$onViewCreated$3(this, null));
    }

    public final FeaturedAddonsSelectorViewModel.a w() {
        FeaturedAddonsSelectorViewModel.a aVar = this.f34732h;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }
}
