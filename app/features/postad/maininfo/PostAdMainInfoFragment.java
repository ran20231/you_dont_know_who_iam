package com.forsale.app.features.postad.maininfo;

import aa.s9;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.fragment.app.p;
import androidx.fragment.app.w;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.CategoryRuleSet;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.entities.PostListingIntention;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.maininfo.PostAdMainInfoViewModel;
import com.forsale.app.features.postad.maininfo.a;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.CrashlyticsUtilsKt;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.NavigationUtilsKt;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import g00.l;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import t9.y0;
import wz.h;
import z3.i;
/* compiled from: PostAdMainInfoFragment.kt */
/* loaded from: classes2.dex */
public final class PostAdMainInfoFragment extends ye.a<s9, PostAdMainInfoViewModel> {
    private final i A = new i(s.b(ye.b.class), new g00.a<Bundle>() { // from class: com.forsale.app.features.postad.maininfo.PostAdMainInfoFragment$special$$inlined$navArgs$1
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
    private final h B;
    private final h C;
    public PostAdViewModel.a D;
    private final h E;
    public PostAdMainInfoViewModel.a F;
    private final h G;
    private final int H;

    /* compiled from: ViewsExtensions.kt */
    /* loaded from: classes2.dex */
    public static final class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i11) {
            PostAdMainInfoFragment.this.X();
        }
    }

    /* compiled from: PostAdMainInfoFragment.kt */
    /* loaded from: classes2.dex */
    static final class c implements c0<CategoryRuleSet.RuleSet> {
        c() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(CategoryRuleSet.RuleSet ruleSet) {
            Integer num;
            PostAdMainInfoFragment.this.B().l1(ruleSet);
            b0<Integer> f32 = PostAdMainInfoFragment.this.T().f3();
            CategoryRuleSet.StringConfiguration title = ruleSet.getTitle();
            if (title != null) {
                num = Integer.valueOf(title.getMaxChars());
            } else {
                num = null;
            }
            f32.postValue(num);
            x10.a.b(ruleSet.toString(), new Object[0]);
        }
    }

    /* compiled from: PostAdMainInfoFragment.kt */
    /* loaded from: classes2.dex */
    static final class d implements c0<ListingDetailsEntity> {
        d() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(ListingDetailsEntity listingDetailsEntity) {
            Integer num;
            if (listingDetailsEntity != null) {
                num = listingDetailsEntity.getCategoryId();
            } else {
                num = null;
            }
            if (num == null) {
                PostAdMainInfoFragment.this.B().l1(null);
            }
        }
    }

    public PostAdMainInfoFragment() {
        h a11;
        h a12;
        h b11;
        a11 = kotlin.d.a(new g00.a<ListingDetailsEntity>() { // from class: com.forsale.app.features.postad.maininfo.PostAdMainInfoFragment$listingDetails$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final ListingDetailsEntity invoke() {
                ye.b S;
                S = PostAdMainInfoFragment.this.S();
                return S.a();
            }
        });
        this.B = a11;
        a12 = kotlin.d.a(new g00.a<PostListingIntention>() { // from class: com.forsale.app.features.postad.maininfo.PostAdMainInfoFragment$intention$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final PostListingIntention invoke() {
                ye.b S;
                S = PostAdMainInfoFragment.this.S();
                return S.b();
            }
        });
        this.C = a12;
        this.E = FragmentViewModelLazyKt.b(this, s.b(PostAdViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.postad.maininfo.PostAdMainInfoFragment$special$$inlined$activityViewModels$default$1
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.postad.maininfo.PostAdMainInfoFragment$special$$inlined$activityViewModels$default$2
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.postad.maininfo.PostAdMainInfoFragment$special$$inlined$activityViewModels$default$3
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
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.features.postad.maininfo.PostAdMainInfoFragment$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ PostAdMainInfoFragment f35803f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, PostAdMainInfoFragment postAdMainInfoFragment) {
                    super(fragment, bundle);
                    this.f35803f = postAdMainInfoFragment;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    PostAdMainInfoViewModel a11 = this.f35803f.Q().a(this.f35803f.T());
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
        this.G = FragmentViewModelLazyKt.b(this, s.b(PostAdMainInfoViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
        this.H = t9.t0.X1;
    }

    public static final /* synthetic */ s9 I(PostAdMainInfoFragment postAdMainInfoFragment) {
        return (s9) postAdMainInfoFragment.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O() {
        p activity = getActivity();
        if (activity != null) {
            String string = getString(y0.H1);
            o.h(string, "getString(...)");
            int i11 = y0.G1;
            int i12 = y0.F1;
            if (ContextExtensionsKt.f(activity)) {
                c.a aVar = new c.a(activity);
                aVar.p("");
                aVar.h(string);
                aVar.m(activity.getString(i11), new a());
                aVar.j(activity.getString(i12), new b());
                aVar.d(false);
                aVar.q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ye.b S() {
        return (ye.b) this.A.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostAdViewModel T() {
        return (PostAdViewModel) this.E.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X() {
        B().f1();
        Y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y() {
        NavigationUtilsKt.d(androidx.navigation.fragment.a.a(this), a.c.c(com.forsale.app.features.postad.maininfo.a.f35899a, false, 1, null), null, 2, null);
    }

    public final PostAdMainInfoViewModel.a Q() {
        PostAdMainInfoViewModel.a aVar = this.F;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: V */
    public PostAdMainInfoViewModel B() {
        return (PostAdMainInfoViewModel) this.G.getValue();
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return this.H;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CrashlyticsUtilsKt.a("post ad main info", new l<tn.b, wz.p>() { // from class: com.forsale.app.features.postad.maininfo.PostAdMainInfoFragment$onResume$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(tn.b logScreenVisited) {
                o.i(logScreenVisited, "$this$logScreenVisited");
                logScreenVisited.b("intention_data", PostAdMainInfoFragment.this.T().k2().name());
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(tn.b bVar) {
                b(bVar);
                return wz.p.f75480a;
            }
        });
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        w.c(this, "select_category_request_key", new g00.p<String, Bundle, wz.p>() { // from class: com.forsale.app.features.postad.maininfo.PostAdMainInfoFragment$onViewCreated$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(String requestKey, Bundle bundle2) {
                CategoryEntity categoryEntity;
                o.i(requestKey, "requestKey");
                o.i(bundle2, "bundle");
                Parcelable parcelable = bundle2.getParcelable("Category_entity");
                if (parcelable instanceof CategoryEntity) {
                    categoryEntity = (CategoryEntity) parcelable;
                } else {
                    categoryEntity = null;
                }
                PostAdViewModel T = PostAdMainInfoFragment.this.T();
                o.f(categoryEntity);
                PostAdViewModel.s4(T, categoryEntity, false, 2, null);
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(String str, Bundle bundle2) {
                b(str, bundle2);
                return wz.p.f75480a;
            }
        });
        ((s9) m()).f0(T());
        x10.a.b(T().toString(), new Object[0]);
        LifeCycleUtilsKt.b(this, new PostAdMainInfoFragment$onViewCreated$2(this, null));
        LifeCycleUtilsKt.b(this, new PostAdMainInfoFragment$onViewCreated$3(this, null));
        LifeCycleUtilsKt.b(this, new PostAdMainInfoFragment$onViewCreated$4(this, null));
        LifeCycleUtilsKt.b(this, new PostAdMainInfoFragment$onViewCreated$5(this, null));
        LifeCycleUtilsKt.b(this, new PostAdMainInfoFragment$onViewCreated$6(this, null));
        T().d2().observe(getViewLifecycleOwner(), new c());
        T().p2().observe(getViewLifecycleOwner(), new d());
        LifeCycleUtilsKt.b(this, new PostAdMainInfoFragment$onViewCreated$9(this, null));
        LifeCycleUtilsKt.b(this, new PostAdMainInfoFragment$onViewCreated$10(this, null));
        LifeCycleUtilsKt.b(this, new PostAdMainInfoFragment$onViewCreated$11(this, null));
        LifeCycleUtilsKt.b(this, new PostAdMainInfoFragment$onViewCreated$12(this, null));
        LifeCycleUtilsKt.b(this, new PostAdMainInfoFragment$onViewCreated$13(this, null));
        LifeCycleUtilsKt.b(this, new PostAdMainInfoFragment$onViewCreated$14(this, view, null));
    }

    /* compiled from: ViewsExtensions.kt */
    /* loaded from: classes2.dex */
    public static final class b implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i11) {
        }
    }
}
