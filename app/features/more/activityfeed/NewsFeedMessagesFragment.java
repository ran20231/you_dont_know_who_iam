package com.forsale.app.features.more.activityfeed;

import aa.i8;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.fragment.app.p;
import androidx.lifecycle.c0;
import androidx.lifecycle.l;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.base.ActionViewsMode;
import com.forsale.app.datalayer.network.responses.NewsFeedMessagesResponse;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import g00.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import md.b;
import w3.a;
import wz.h;
/* compiled from: NewsFeedMessagesFragment.kt */
/* loaded from: classes2.dex */
public final class NewsFeedMessagesFragment extends md.a<i8, NewsFeedViewModel> {
    public static final a I = new a(null);
    public static final int J = 8;
    private final h E;
    private final int F;
    public ApplicationResourcesRepository G;
    private final h H;

    /* compiled from: NewsFeedMessagesFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: NewsFeedMessagesFragment.kt */
    /* loaded from: classes2.dex */
    static final class b implements c0<List<? extends NewsFeedMessagesResponse.FeedMessage>> {
        b() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(List<NewsFeedMessagesResponse.FeedMessage> list) {
            md.b S = NewsFeedMessagesFragment.this.S();
            if (S != null) {
                o.f(list);
                S.e(list);
            }
        }
    }

    public NewsFeedMessagesFragment() {
        final h b11;
        h a11;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.features.more.activityfeed.NewsFeedMessagesFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.features.more.activityfeed.NewsFeedMessagesFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) a.this.invoke();
            }
        });
        this.E = FragmentViewModelLazyKt.b(this, s.b(NewsFeedViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.more.activityfeed.NewsFeedMessagesFragment$special$$inlined$viewModels$default$3
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.more.activityfeed.NewsFeedMessagesFragment$special$$inlined$viewModels$default$4
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.more.activityfeed.NewsFeedMessagesFragment$special$$inlined$viewModels$default$5
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
        this.F = t9.t0.F1;
        a11 = d.a(new g00.a<md.b>() { // from class: com.forsale.app.features.more.activityfeed.NewsFeedMessagesFragment$newsFeedAdapter$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final b invoke() {
                p activity = NewsFeedMessagesFragment.this.getActivity();
                if (activity != null) {
                    NewsFeedMessagesFragment newsFeedMessagesFragment = NewsFeedMessagesFragment.this;
                    return new b(new ArrayList(), newsFeedMessagesFragment, activity, newsFeedMessagesFragment.T());
                }
                return null;
            }
        });
        this.H = a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final md.b S() {
        return (md.b) this.H.getValue();
    }

    public final ApplicationResourcesRepository T() {
        ApplicationResourcesRepository applicationResourcesRepository = this.G;
        if (applicationResourcesRepository != null) {
            return applicationResourcesRepository;
        }
        o.w("resourcesRepo");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: V */
    public NewsFeedViewModel B() {
        return (NewsFeedViewModel) this.E.getValue();
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return this.F;
    }

    @Override // com.forsale.app.base.fragments.b, com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        RecyclerView recyclerView = ((i8) m()).O;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(S());
        B().y0().observe(getViewLifecycleOwner(), new b());
        return onCreateView;
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ((i8) m()).O.setAdapter(null);
        super.onDestroyView();
    }

    @v9.a(viewId = {ActionViewsMode.ERROR_RELOAD, ActionViewsMode.ERROR_REFRESH})
    public final void onError(View view) {
        o.i(view, "view");
        B().z0();
    }
}
