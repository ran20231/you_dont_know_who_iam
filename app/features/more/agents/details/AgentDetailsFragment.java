package com.forsale.app.features.more.agents.details;

import aa.a7;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.c0;
import androidx.lifecycle.l;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.forsale.app.datalayer.database.AgentEntity;
import com.forsale.app.datalayer.database.LocationEntity;
import com.forsale.app.features.more.agents.list.AgentContactType;
import com.forsale.app.ui.bottomsheets.agents.AgentContactBottomSheet;
import com.google.android.material.chip.Chip;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import nd.d;
import t9.r0;
import t9.t0;
import t9.u0;
import t9.y0;
import w3.a;
import w9.c;
import wz.h;
import wz.p;
/* compiled from: AgentDetailsFragment.kt */
/* loaded from: classes2.dex */
public final class AgentDetailsFragment extends d<a7, AgentDetailsViewModel> {
    private final int A = t0.f70268o1;
    private final h B;
    private final c C;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AgentDetailsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements c0<AgentEntity> {
        a() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(AgentEntity agentEntity) {
            if (agentEntity != null) {
                AgentDetailsFragment.this.K(agentEntity);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AgentDetailsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b implements c0<List<? extends LocationEntity>> {
        b() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(List<LocationEntity> list) {
            AgentDetailsFragment agentDetailsFragment = AgentDetailsFragment.this;
            o.f(list);
            agentDetailsFragment.M(list);
        }
    }

    public AgentDetailsFragment() {
        final h b11;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.features.more.agents.details.AgentDetailsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.features.more.agents.details.AgentDetailsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) g00.a.this.invoke();
            }
        });
        this.B = FragmentViewModelLazyKt.b(this, s.b(AgentDetailsViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.more.agents.details.AgentDetailsFragment$special$$inlined$viewModels$default$3
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.more.agents.details.AgentDetailsFragment$special$$inlined$viewModels$default$4
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
                g00.a aVar3 = g00.a.this;
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.more.agents.details.AgentDetailsFragment$special$$inlined$viewModels$default$5
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
        this.C = w9.d.a(new g00.l<c, p>() { // from class: com.forsale.app.features.more.agents.details.AgentDetailsFragment$menuSettings$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(c menuSettings) {
                o.i(menuSettings, "$this$menuSettings");
                menuSettings.d(Integer.valueOf(u0.f70350a));
                final AgentDetailsFragment agentDetailsFragment = AgentDetailsFragment.this;
                menuSettings.e(new g00.l() { // from class: com.forsale.app.features.more.agents.details.AgentDetailsFragment$menuSettings$1.1
                    {
                        super(1);
                    }

                    @Override // g00.l
                    /* renamed from: b */
                    public final Void invoke(MenuItem menuItem) {
                        AgentEntity value;
                        o.i(menuItem, "$this$null");
                        int itemId = menuItem.getItemId();
                        if (itemId == r0.S4) {
                            AgentEntity value2 = AgentDetailsFragment.this.B().v0().getValue();
                            if (value2 != null) {
                                new AgentContactBottomSheet(value2, AgentContactType.SMS).show(AgentDetailsFragment.this.getChildFragmentManager(), "");
                                return null;
                            }
                            return null;
                        } else if (itemId == r0.R4 && (value = AgentDetailsFragment.this.B().v0().getValue()) != null) {
                            new AgentContactBottomSheet(value, AgentContactType.CALL).show(AgentDetailsFragment.this.getChildFragmentManager(), "");
                            return null;
                        } else {
                            return null;
                        }
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(AgentEntity agentEntity) {
        B().A0(agentEntity);
        TextView textView = ((a7) m()).S;
        String name = agentEntity.getName();
        String string = getString(y0.X9);
        textView.setText(name + " " + string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(List<LocationEntity> list) {
        for (LocationEntity locationEntity : list) {
            Chip chip = new Chip(requireContext());
            chip.setText(locationEntity.getName());
            chip.setChipBackgroundColorResource(l8.c.f62276d);
            chip.setClickable(false);
            ((a7) m()).O.addView(chip);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: J */
    public AgentDetailsViewModel B() {
        return (AgentDetailsViewModel) this.B.getValue();
    }

    public final void L() {
        B().v0().observe(getViewLifecycleOwner(), new a());
        B().y0().observe(getViewLifecycleOwner(), new b());
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return this.A;
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        L();
    }

    @Override // com.forsale.app.base.fragments.a
    public c q() {
        return this.C;
    }
}
