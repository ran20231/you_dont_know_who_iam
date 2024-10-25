package com.forsale.app.features.more.notifications.notification;

import aa.m8;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.fragment.app.p;
import androidx.lifecycle.l;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.paging.DataSource;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.c;
import com.forsale.app.base.ActionViewsMode;
import com.forsale.app.datalayer.network.responses.NotificationMessagesResponse;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.a0;
import g00.a;
import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import w3.a;
import wz.h;
/* compiled from: NotificationMessagesFragment.kt */
/* loaded from: classes2.dex */
public final class NotificationMessagesFragment extends ce.a<m8, NotificationMessagesViewModel> {
    public static final a J = new a(null);
    public static final int K = 8;
    private final h E;
    private final int F;
    private final int G;
    public ApplicationResourcesRepository H;
    private final h I;

    /* compiled from: NotificationMessagesFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public NotificationMessagesFragment() {
        final h b11;
        h a11;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.features.more.notifications.notification.NotificationMessagesFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.features.more.notifications.notification.NotificationMessagesFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) a.this.invoke();
            }
        });
        this.E = FragmentViewModelLazyKt.b(this, s.b(NotificationMessagesViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.more.notifications.notification.NotificationMessagesFragment$special$$inlined$viewModels$default$3
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.more.notifications.notification.NotificationMessagesFragment$special$$inlined$viewModels$default$4
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.more.notifications.notification.NotificationMessagesFragment$special$$inlined$viewModels$default$5
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
        this.F = t9.t0.H1;
        this.G = t9.t0.B;
        a11 = d.a(new g00.a<c>() { // from class: com.forsale.app.features.more.notifications.notification.NotificationMessagesFragment$notificationMessagesAdapter$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final c invoke() {
                p activity = NotificationMessagesFragment.this.getActivity();
                if (activity != null) {
                    NotificationMessagesFragment notificationMessagesFragment = NotificationMessagesFragment.this;
                    androidx.lifecycle.s viewLifecycleOwner = notificationMessagesFragment.getViewLifecycleOwner();
                    o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    return new c(viewLifecycleOwner, activity, notificationMessagesFragment.T());
                }
                return null;
            }
        });
        this.I = a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c S() {
        return (c) this.I.getValue();
    }

    @Override // com.forsale.app.base.fragments.b
    protected int G() {
        return this.G;
    }

    public final ApplicationResourcesRepository T() {
        ApplicationResourcesRepository applicationResourcesRepository = this.H;
        if (applicationResourcesRepository != null) {
            return applicationResourcesRepository;
        }
        o.w("resourcesRepository");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: V */
    public NotificationMessagesViewModel B() {
        return (NotificationMessagesViewModel) this.E.getValue();
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return this.F;
    }

    @Override // com.forsale.app.base.fragments.b, com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        RecyclerView recyclerView = ((m8) m()).O;
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
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new NotificationMessagesFragment$onCreateView$1$2(this, null), 3, null);
        return onCreateView;
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ((m8) m()).O.setAdapter(null);
        super.onDestroyView();
    }

    @v9.a(viewId = {ActionViewsMode.ERROR_RELOAD, ActionViewsMode.ERROR_REFRESH})
    public final wz.p onError(View view) {
        PagedList<NotificationMessagesResponse.NotificationMessage> c11;
        DataSource<?, NotificationMessagesResponse.NotificationMessage> s11;
        o.i(view, "view");
        c S = S();
        if (S != null && (c11 = S.c()) != null && (s11 = c11.s()) != null) {
            s11.invalidate();
            return wz.p.f75480a;
        }
        return null;
    }
}
