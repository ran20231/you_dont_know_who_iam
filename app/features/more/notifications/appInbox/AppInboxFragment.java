package com.forsale.app.features.more.notifications.appInbox;

import aa.g7;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.c0;
import androidx.lifecycle.l;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.c;
import be.f;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.a0;
import g00.a;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import t9.t0;
import w3.a;
import wz.h;
/* compiled from: AppInboxFragment.kt */
/* loaded from: classes2.dex */
public final class AppInboxFragment extends f<g7, AppInboxViewModel> {
    private final int E = t0.A;
    private final h F;
    private final h G;

    /* compiled from: AppInboxFragment.kt */
    /* loaded from: classes2.dex */
    static final class a implements c0<List<? extends c>> {
        a() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(List<c> list) {
            AppInboxFragment.this.S().submitList(list);
        }
    }

    public AppInboxFragment() {
        final h b11;
        h a11;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.features.more.notifications.appInbox.AppInboxFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.features.more.notifications.appInbox.AppInboxFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) a.this.invoke();
            }
        });
        this.F = FragmentViewModelLazyKt.b(this, s.b(AppInboxViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.more.notifications.appInbox.AppInboxFragment$special$$inlined$viewModels$default$3
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.more.notifications.appInbox.AppInboxFragment$special$$inlined$viewModels$default$4
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.more.notifications.appInbox.AppInboxFragment$special$$inlined$viewModels$default$5
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
        a11 = d.a(new g00.a<be.a>() { // from class: com.forsale.app.features.more.notifications.appInbox.AppInboxFragment$messagesAdapter$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final be.a invoke() {
                androidx.lifecycle.s viewLifecycleOwner = AppInboxFragment.this.getViewLifecycleOwner();
                o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                return new be.a(viewLifecycleOwner);
            }
        });
        this.G = a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final be.a S() {
        return (be.a) this.G.getValue();
    }

    @Override // com.forsale.app.base.fragments.b
    protected int G() {
        return this.E;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: T */
    public AppInboxViewModel B() {
        return (AppInboxViewModel) this.F.getValue();
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return t9.t0.f70289r1;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        B().x0();
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = ((g7) m()).O;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        Context requireContext = requireContext();
        o.h(requireContext, "requireContext(...)");
        int i11 = TypeExtensionsKt.i(12, requireContext);
        Context requireContext2 = requireContext();
        o.h(requireContext2, "requireContext(...)");
        int i12 = TypeExtensionsKt.i(16, requireContext2);
        Context requireContext3 = requireContext();
        o.h(requireContext3, "requireContext(...)");
        recyclerView.j(new a0(i11, i12, TypeExtensionsKt.i(16, requireContext3)));
        recyclerView.setAdapter(S());
        B().z0().observe(getViewLifecycleOwner(), new a());
    }
}
