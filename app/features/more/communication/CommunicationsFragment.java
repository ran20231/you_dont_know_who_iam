package com.forsale.app.features.more.communication;

import aa.a8;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Keep;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.l;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.viewpager.widget.ViewPager;
import c4.m;
import com.forsale.app.base.ActionViewsMode;
import com.forsale.app.features.auth.AuthActivity;
import com.forsale.app.features.auth.models.AuthIntention;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.ListingChatActivity;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.auth.AuthenticationSourcePage;
import g00.a;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.q;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import t9.q0;
import t9.y0;
import ux.k;
import v9.c;
import w3.a;
import wz.h;
import wz.i;
import wz.p;
/* compiled from: CommunicationsFragment.kt */
/* loaded from: classes2.dex */
public final class CommunicationsFragment extends sd.b<a8, MessagesViewModel> implements c {
    public static final a D = new a(null);
    public static final int E = 8;
    private final h A;
    private final int B;
    private com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.ownerlistingchats.b C;

    /* compiled from: CommunicationsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CommunicationsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b implements FlowCollector<p> {
        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            Context context = CommunicationsFragment.this.getContext();
            if (context != null) {
                AuthActivity.f22470e.a(context, AuthIntention.SignIn, AuthenticationSourcePage.PROFILE);
            }
            return p.f75480a;
        }
    }

    public CommunicationsFragment() {
        final h b11;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.features.more.communication.CommunicationsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.features.more.communication.CommunicationsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) a.this.invoke();
            }
        });
        this.A = FragmentViewModelLazyKt.b(this, s.b(MessagesViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.more.communication.CommunicationsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w0 invoke() {
                x0 c11;
                c11 = FragmentViewModelLazyKt.c(h.this);
                return c11.getViewModelStore();
            }
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.more.communication.CommunicationsFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w3.a invoke() {
                x0 c11;
                l lVar;
                w3.a aVar2;
                a aVar3 = a.this;
                if (aVar3 == null || (aVar2 = (w3.a) aVar3.invoke()) == null) {
                    c11 = FragmentViewModelLazyKt.c(b11);
                    if (c11 instanceof l) {
                        lVar = (l) c11;
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.more.communication.CommunicationsFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final t0.b invoke() {
                x0 c11;
                l lVar;
                t0.b defaultViewModelProviderFactory;
                c11 = FragmentViewModelLazyKt.c(b11);
                if (c11 instanceof l) {
                    lVar = (l) c11;
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
        this.B = t9.t0.B1;
    }

    public static final /* synthetic */ a8 H(CommunicationsFragment communicationsFragment) {
        return (a8) communicationsFragment.m();
    }

    private final com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.ownerlistingchats.b K() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        o.h(childFragmentManager, "getChildFragmentManager(...)");
        return new com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.ownerlistingchats.b(childFragmentManager, O());
    }

    private final List<Pair<String, Fragment>> O() {
        List<Pair<String, Fragment>> e11;
        k kVar = new k();
        kVar.s(new Intent(getContext(), ListingChatActivity.class));
        e11 = q.e(i.a(getString(y0.P5), kVar));
        return e11;
    }

    private final void Q() {
        LifeCycleUtilsKt.b(this, new CommunicationsFragment$registerObservers$1(this, null));
        OneShotEventHandler<p> x02 = B().x0();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        x02.h(viewLifecycleOwner, new b());
    }

    private final void S(androidx.appcompat.app.d dVar) {
        Toolbar toolbar = ((a8) m()).R;
        if (toolbar != null) {
            dVar.setSupportActionBar(toolbar);
            m.b(toolbar, androidx.navigation.fragment.a.a(this), null, 2, null);
            toolbar.setNavigationIcon(q0.f69764j2);
            toolbar.setTitle(L());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T() {
        ViewPager viewPager = ((a8) m()).Q;
        com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.ownerlistingchats.b bVar = this.C;
        if (bVar == null) {
            bVar = K();
            this.C = bVar;
        }
        viewPager.setAdapter(bVar);
        ((a8) m()).Q.setSaveFromParentEnabled(false);
    }

    public int L() {
        return y0.f70770ya;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: M */
    public MessagesViewModel B() {
        return (MessagesViewModel) this.A.getValue();
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return this.B;
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ((a8) m()).Q.setAdapter(null);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z11) {
        super.onHiddenChanged(z11);
        if (!z11) {
            B().C0();
        }
    }

    @Keep
    @v9.a(viewId = {ActionViewsMode.BTN_GO_TO_LOGIN_SCREEN})
    public final void onLoginClicked(View view) {
        o.i(view, "view");
        B().A0();
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        androidx.appcompat.app.d dVar;
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.p activity = getActivity();
        if (activity instanceof androidx.appcompat.app.d) {
            dVar = (androidx.appcompat.app.d) activity;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            S(dVar);
        }
        Q();
    }

    @Override // v9.c
    public void setStateViewsActions(View view) {
        c.a.c(this, view);
    }
}
