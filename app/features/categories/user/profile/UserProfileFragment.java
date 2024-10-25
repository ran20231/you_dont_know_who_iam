package com.forsale.app.features.categories.user.profile;

import aa.sa;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.c0;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.features.categories.listings.ListingsAdapter;
import com.forsale.app.features.categories.listings.ListingsLayoutManager;
import com.forsale.app.features.categories.user.profile.UserProfileViewModel;
import com.forsale.app.ui.bottomsheets.useractions.ReportAbuseBottomSheet;
import com.forsale.app.ui.bottomsheets.useractions.ReportAbuseIntention;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.q;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import kr.b;
import kr.m;
import kr.n;
import wz.h;
import wz.p;
/* compiled from: UserProfileFragment.kt */
/* loaded from: classes2.dex */
public final class UserProfileFragment extends com.forsale.app.features.categories.user.profile.b<sa, UserProfileViewModel> {
    private final h A = FragmentViewModelLazyKt.b(this, s.b(SharedUserProfileViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.categories.user.profile.UserProfileFragment$special$$inlined$activityViewModels$default$1
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
    }, new g00.a<w3.a>() { // from class: com.forsale.app.features.categories.user.profile.UserProfileFragment$special$$inlined$activityViewModels$default$2
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
    }, new g00.a<t0.b>() { // from class: com.forsale.app.features.categories.user.profile.UserProfileFragment$special$$inlined$activityViewModels$default$3
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
    private final h B;
    private final h C;
    public UserProfileViewModel.a D;
    private final h E;
    private final int F;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserProfileFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<Integer> {
        a() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(Integer num, zz.a<? super p> aVar) {
            if (num != null && (UserProfileFragment.this.getActivity() instanceof UserProfileActivity)) {
                androidx.fragment.app.p activity = UserProfileFragment.this.getActivity();
                o.g(activity, "null cannot be cast to non-null type com.forsale.app.features.categories.user.profile.UserProfileActivity");
                ((UserProfileActivity) activity).S0(num.intValue());
            }
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserProfileFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b implements c0<List<? extends zc.b>> {
        b() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(List<zc.b> list) {
            lr.c J = UserProfileFragment.this.J();
            o.f(list);
            n.a.a(J, list, false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserProfileFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c implements FlowCollector<UserProfileData> {
        c() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(UserProfileData userProfileData, zz.a<? super p> aVar) {
            if (userProfileData != null) {
                new ReportAbuseBottomSheet(null, kotlin.coroutines.jvm.internal.a.d((int) userProfileData.c()), userProfileData.h(), null, ReportAbuseIntention.USER, 9, null).show(UserProfileFragment.this.getChildFragmentManager(), "REPORT_ABUSE_BOTTOM_SHEET");
            }
            return p.f75480a;
        }
    }

    public UserProfileFragment() {
        h a11;
        h a12;
        h b11;
        a11 = kotlin.d.a(new g00.a<lr.c<x9.b<?>, m<?>>>() { // from class: com.forsale.app.features.categories.user.profile.UserProfileFragment$itemsAdapter$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final lr.c<x9.b<?>, m<?>> invoke() {
                ListingsAdapter listingsAdapter = ListingsAdapter.f27997a;
                androidx.lifecycle.s viewLifecycleOwner = UserProfileFragment.this.getViewLifecycleOwner();
                o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                return listingsAdapter.invoke(viewLifecycleOwner);
            }
        });
        this.B = a11;
        a12 = kotlin.d.a(new g00.a<kr.b<m<?>>>() { // from class: com.forsale.app.features.categories.user.profile.UserProfileFragment$screenAdapter$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final kr.b<m<?>> invoke() {
                List e11;
                b.a aVar = kr.b.f61943t;
                e11 = q.e(UserProfileFragment.this.J());
                return aVar.g(e11);
            }
        });
        this.C = a12;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.features.categories.user.profile.UserProfileFragment$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ UserProfileFragment f31168f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, UserProfileFragment userProfileFragment) {
                    super(fragment, bundle);
                    this.f31168f = userProfileFragment;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    SharedUserProfileViewModel L;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    UserProfileViewModel.a M = this.f31168f.M();
                    L = this.f31168f.L();
                    UserProfileViewModel a11 = M.a(L);
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
        this.E = FragmentViewModelLazyKt.b(this, s.b(UserProfileViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
        this.F = t9.t0.f70241k2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lr.c<x9.b<?>, m<?>> J() {
        return (lr.c) this.B.getValue();
    }

    private final kr.b<m<?>> K() {
        return (kr.b) this.C.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedUserProfileViewModel L() {
        return (SharedUserProfileViewModel) this.A.getValue();
    }

    private final void Q() {
        UserProfileViewModel B = B();
        OneShotEventHandler<Integer> K0 = B.K0();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        K0.h(viewLifecycleOwner, new a());
        B.N0().observe(getViewLifecycleOwner(), new b());
        OneShotEventHandler<UserProfileData> L0 = B().L0();
        androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        L0.h(viewLifecycleOwner2, new c());
    }

    private final void S() {
        RecyclerView recyclerView = ((sa) m()).X;
        recyclerView.setAdapter(K());
        Context context = recyclerView.getContext();
        o.h(context, "getContext(...)");
        recyclerView.setLayoutManager(new ListingsLayoutManager(context, 2, K(), null, 8, null));
    }

    public final UserProfileViewModel.a M() {
        UserProfileViewModel.a aVar = this.D;
        if (aVar != null) {
            return aVar;
        }
        o.w("userProfileVMFactory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: O */
    public UserProfileViewModel B() {
        return (UserProfileViewModel) this.E.getValue();
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return this.F;
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        Q();
        S();
        return onCreateView;
    }
}
