package com.forsale.app.features.more.agents.list;

import aa.c7;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.t;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.forsale.app.base.ActionViewsMode;
import com.forsale.app.datalayer.database.AgentEntity;
import com.forsale.app.features.more.agents.list.AgentsFragment;
import com.forsale.app.features.more.agents.list.a;
import com.forsale.app.ui.bottomsheets.agents.AgentContactViewModel;
import com.forsale.app.ui.bottomsheets.agents.AgentLocationsBottomSheet;
import g00.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kr.m;
import od.g;
import t9.q0;
import t9.r0;
import t9.u0;
import w3.a;
import w9.c;
import wz.e;
import wz.h;
import wz.p;
/* compiled from: AgentsFragment.kt */
/* loaded from: classes2.dex */
public final class AgentsFragment extends g<c7, AgentsViewModel> {
    public static final a L = new a(null);
    public static final int M = 8;
    private final h E;
    private final int F;
    private final int G;
    private final lr.a<m<?>> H;
    private final c I;
    public a.InterfaceC0346a J;
    public AgentContactViewModel.a K;

    /* compiled from: AgentsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AgentsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b implements c0, k {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f31666a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(l function) {
            o.i(function, "function");
            this.f31666a = function;
        }

        @Override // kotlin.jvm.internal.k
        public final e<?> c() {
            return this.f31666a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c0) || !(obj instanceof k)) {
                return false;
            }
            return o.d(c(), ((k) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // androidx.lifecycle.c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f31666a.invoke(obj);
        }
    }

    public AgentsFragment() {
        final h b11;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.features.more.agents.list.AgentsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.features.more.agents.list.AgentsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) g00.a.this.invoke();
            }
        });
        this.E = FragmentViewModelLazyKt.b(this, s.b(AgentsViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.more.agents.list.AgentsFragment$special$$inlined$viewModels$default$3
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.more.agents.list.AgentsFragment$special$$inlined$viewModels$default$4
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.more.agents.list.AgentsFragment$special$$inlined$viewModels$default$5
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
        this.F = t9.t0.f70275p1;
        this.G = t9.t0.f70336y;
        this.H = new lr.a<>();
        this.I = w9.d.a(new l<c, p>() { // from class: com.forsale.app.features.more.agents.list.AgentsFragment$menuSettings$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(c menuSettings) {
                o.i(menuSettings, "$this$menuSettings");
                menuSettings.d(Integer.valueOf(u0.f70351b));
                final AgentsFragment agentsFragment = AgentsFragment.this;
                menuSettings.e(new l() { // from class: com.forsale.app.features.more.agents.list.AgentsFragment$menuSettings$1.1

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* compiled from: AgentsFragment.kt */
                    /* renamed from: com.forsale.app.features.more.agents.list.AgentsFragment$menuSettings$1$1$1  reason: invalid class name and collision with other inner class name */
                    /* loaded from: classes2.dex */
                    public /* synthetic */ class C03451 extends FunctionReferenceImpl implements l<Integer, p> {
                        C03451(Object obj) {
                            super(1, obj, b0.class, "postValue", "postValue(Ljava/lang/Object;)V", 0);
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ p invoke(Integer num) {
                            m(num);
                            return p.f75480a;
                        }

                        public final void m(Integer num) {
                            ((b0) this.receiver).postValue(num);
                        }
                    }

                    {
                        super(1);
                    }

                    @Override // g00.l
                    /* renamed from: b */
                    public final Void invoke(MenuItem menuItem) {
                        o.i(menuItem, "$this$null");
                        if (menuItem.getItemId() == r0.f69848b5) {
                            Integer value = AgentsFragment.this.B().w0().getValue();
                            if (value == null) {
                                value = 0;
                            }
                            new AgentLocationsBottomSheet(value.intValue(), new C03451(AgentsFragment.this.B().w0())).show(AgentsFragment.this.getChildFragmentManager(), "AgentLocationsBottomSheet");
                            return null;
                        }
                        return null;
                    }
                });
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(c cVar) {
                b(cVar);
                return p.f75480a;
            }
        });
    }

    private final void Y() {
        RecyclerView recyclerView = ((c7) m()).O;
        Context context = recyclerView.getContext();
        if (context != null) {
            o.f(context);
            i iVar = new i(context, 1);
            Drawable drawable = androidx.core.content.b.getDrawable(context, q0.M);
            if (drawable != null) {
                iVar.f(drawable);
            }
            recyclerView.setAdapter(kr.b.f61943t.i(this.H));
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            recyclerView.j(iVar);
        }
        B().w0().observe(getViewLifecycleOwner(), new b(new l<Integer, p>() { // from class: com.forsale.app.features.more.agents.list.AgentsFragment$initializeComponents$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(Integer num) {
                lr.a aVar;
                aVar = AgentsFragment.this.H;
                aVar.q();
                LiveData<List<AgentEntity>> x02 = AgentsFragment.this.B().x0();
                androidx.lifecycle.s viewLifecycleOwner = AgentsFragment.this.getViewLifecycleOwner();
                final AgentsFragment agentsFragment = AgentsFragment.this;
                x02.observe(viewLifecycleOwner, new AgentsFragment.b(new l<List<? extends AgentEntity>, p>() { // from class: com.forsale.app.features.more.agents.list.AgentsFragment$initializeComponents$2.1
                    {
                        super(1);
                    }

                    public final void b(List<AgentEntity> list) {
                        lr.a aVar2;
                        List a02;
                        aVar2 = AgentsFragment.this.H;
                        AgentsFragment agentsFragment2 = AgentsFragment.this;
                        o.f(list);
                        a02 = agentsFragment2.a0(list);
                        aVar2.n(new bg.b(a02, 2));
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(List<? extends AgentEntity> list) {
                        b(list);
                        return p.f75480a;
                    }
                }));
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(Integer num) {
                b(num);
                return p.f75480a;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<m<?>> a0(List<AgentEntity> list) {
        int y11;
        List<m<?>> X0;
        List<AgentEntity> list2 = list;
        y11 = kotlin.collections.s.y(list2, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (AgentEntity agentEntity : list2) {
            com.forsale.app.features.more.agents.list.a a11 = V().a(agentEntity);
            AgentContactViewModel a12 = T().a(agentEntity, t.a(this));
            FragmentManager childFragmentManager = getChildFragmentManager();
            o.h(childFragmentManager, "getChildFragmentManager(...)");
            androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
            o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            arrayList.add(new od.b(a11, a12, childFragmentManager, viewLifecycleOwner));
        }
        X0 = CollectionsKt___CollectionsKt.X0(arrayList);
        return X0;
    }

    @Override // com.forsale.app.base.fragments.b
    protected int G() {
        return this.G;
    }

    public final AgentContactViewModel.a T() {
        AgentContactViewModel.a aVar = this.K;
        if (aVar != null) {
            return aVar;
        }
        o.w("agentContactVMFactory");
        return null;
    }

    public final a.InterfaceC0346a V() {
        a.InterfaceC0346a interfaceC0346a = this.J;
        if (interfaceC0346a != null) {
            return interfaceC0346a;
        }
        o.w("agentVMFactory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: X */
    public AgentsViewModel B() {
        return (AgentsViewModel) this.E.getValue();
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return this.F;
    }

    @v9.a(viewId = {ActionViewsMode.ERROR_RELOAD, ActionViewsMode.ERROR_REFRESH, ActionViewsMode.MAINTENANCE_RELOAD})
    public final void onError(View view) {
        o.i(view, "view");
        B().x0();
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        Y();
    }

    @Override // com.forsale.app.base.fragments.a
    public c q() {
        return this.I;
    }
}
