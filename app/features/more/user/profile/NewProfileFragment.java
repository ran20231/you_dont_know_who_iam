package com.forsale.app.features.more.user.profile;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.network.entities.PostListingIntention;
import com.forsale.app.features.auth.AuthActivity;
import com.forsale.app.features.auth.e;
import com.forsale.app.features.auth.login.SignInIntention;
import com.forsale.app.features.auth.models.AuthIntention;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.maincontainer.HomeToolbars;
import com.forsale.app.features.maincontainer.MainContainerActivity;
import com.forsale.app.features.more.WebActivity;
import com.forsale.app.features.more.WebType;
import com.forsale.app.features.more.newprofile.NewProfileScreenKt;
import com.forsale.app.feedback.FeedbackSnackBarComponentKt;
import com.forsale.app.feedback.a;
import com.forsale.app.ui.bottomsheets.updateapp.UpdateAppAlertBottomSheet;
import com.forsale.app.utils.ComposeLifeCycleUtilsKt;
import com.forsale.app.utils.CrashlyticsUtilsKt;
import com.forsale.app.utils.FragmentsExtensionsKt;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.NavigationUtilsKt;
import com.forsale.app.utils.analytics.AnalyticsListingsSource;
import com.forsale.app.utils.analytics.SearchSource;
import com.forsale.app.utils.analytics.auth.AuthenticationSourcePage;
import com.forsale.designSystem.theme.ThemeKt;
import com.google.android.gms.ads.AdRequest;
import com.leanplum.internal.Constants;
import j0.d1;
import j0.e1;
import j0.v0;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;
import rj.a;
import t9.p0;
import t9.y0;
import v0.b;
import w3.a;
/* compiled from: NewProfileFragment.kt */
/* loaded from: classes2.dex */
public final class NewProfileFragment extends com.forsale.app.features.more.user.profile.a {

    /* renamed from: h  reason: collision with root package name */
    public static final a f33507h = new a(null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f33508i = 8;

    /* renamed from: f  reason: collision with root package name */
    private final wz.h f33509f;

    /* renamed from: g  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f33510g;

    /* compiled from: NewProfileFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: NewProfileFragment.kt */
    /* loaded from: classes2.dex */
    static final class b implements androidx.activity.result.a<ActivityResult> {
        b() {
        }

        @Override // androidx.activity.result.a
        /* renamed from: b */
        public final void a(ActivityResult activityResult) {
            Intent a11;
            String stringExtra;
            boolean z11;
            if (activityResult.b() == -1 && (a11 = activityResult.a()) != null && (stringExtra = a11.getStringExtra(Constants.Params.MESSAGE)) != null) {
                NewProfileFragment newProfileFragment = NewProfileFragment.this;
                if (stringExtra.length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    newProfileFragment.T().q0(new lf.a(null, new a.C0804a(stringExtra), 1, null));
                }
            }
        }
    }

    public NewProfileFragment() {
        final wz.h b11;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.features.more.user.profile.NewProfileFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.features.more.user.profile.NewProfileFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) g00.a.this.invoke();
            }
        });
        this.f33509f = FragmentViewModelLazyKt.b(this, kotlin.jvm.internal.s.b(NewProfileViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.more.user.profile.NewProfileFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w0 invoke() {
                x0 c11;
                c11 = FragmentViewModelLazyKt.c(wz.h.this);
                return c11.getViewModelStore();
            }
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.more.user.profile.NewProfileFragment$special$$inlined$viewModels$default$4
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.more.user.profile.NewProfileFragment$special$$inlined$viewModels$default$5
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
                    kotlin.jvm.internal.o.h(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                    return defaultViewModelProviderFactory2;
                }
                return defaultViewModelProviderFactory;
            }
        });
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new b());
        kotlin.jvm.internal.o.h(registerForActivityResult, "registerForActivityResult(...)");
        this.f33510g = registerForActivityResult;
    }

    public static /* synthetic */ void S(NewProfileFragment newProfileFragment, SignInIntention signInIntention, g00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            signInIntention = null;
        }
        newProfileFragment.Q(signInIntention, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V() {
        T().m0();
        CrashlyticsUtilsKt.b("new_profile", null, 2, null);
        s0();
        androidx.fragment.app.w.c(this, "deleteAccount", new g00.p<String, Bundle, wz.p>() { // from class: com.forsale.app.features.more.user.profile.NewProfileFragment$onCreate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(String key, Bundle bundle) {
                kotlin.jvm.internal.o.i(key, "key");
                kotlin.jvm.internal.o.i(bundle, "bundle");
                NewProfileFragment.this.T().r0(new lf.a(new a.C0430a(gk.b.f56934a), new a.b(y0.f70683t3, new Object[0])));
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(String str, Bundle bundle) {
                b(str, bundle);
                return wz.p.f75480a;
            }
        });
        androidx.fragment.app.w.c(this, "logoutAccount", new g00.p<String, Bundle, wz.p>() { // from class: com.forsale.app.features.more.user.profile.NewProfileFragment$onCreate$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(String key, Bundle bundle) {
                kotlin.jvm.internal.o.i(key, "key");
                kotlin.jvm.internal.o.i(bundle, "bundle");
                String string = bundle.getString("resultMessage");
                if (string != null) {
                    NewProfileFragment.this.T().r0(new lf.a(new a.C0430a(gk.b.f56934a), new a.C0804a(string)));
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(String str, Bundle bundle) {
                b(str, bundle);
                return wz.p.f75480a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X() {
        T().o0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(AuthIntention authIntention) {
        Intent intent;
        androidx.activity.result.b<Intent> bVar = this.f33510g;
        androidx.fragment.app.p activity = getActivity();
        if (activity != null) {
            intent = AuthActivity.a.c(AuthActivity.f22470e, activity, authIntention, AuthenticationSourcePage.PROFILE, null, 4, null);
        } else {
            intent = null;
        }
        bVar.a(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0() {
        S(this, null, new g00.a<wz.p>() { // from class: com.forsale.app.features.more.user.profile.NewProfileFragment$openBuyMoreToken$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ wz.p invoke() {
                invoke2();
                return wz.p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                FragmentsExtensionsKt.a(NewProfileFragment.this, b.f33670a.j(false, PostListingIntention.NON.getValue()));
            }
        }, 1, null);
    }

    private final void b0(WebType webType, String str, String str2) {
        Context context = getContext();
        if (context != null) {
            WebActivity.a.d(WebActivity.I, context, webType, str, str2, 0, null, 24, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c0(NewProfileFragment newProfileFragment, WebType webType, String str, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        newProfileFragment.b0(webType, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0() {
        FragmentsExtensionsKt.a(this, com.forsale.app.features.more.user.profile.b.f33670a.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e0(String str) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0() {
        androidx.fragment.app.p activity = getActivity();
        if (activity != null) {
            WebActivity.a aVar = WebActivity.I;
            WebType webType = WebType.GET_FREE_ADS_ALLOWANCE;
            String string = getString(y0.S1);
            kotlin.jvm.internal.o.h(string, "getString(...)");
            WebActivity.a.d(aVar, activity, webType, string, null, 0, null, 28, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0(String str) {
        WebType webType = WebType.INSTAGRAM;
        String string = getString(y0.f70421da);
        kotlin.jvm.internal.o.h(string, "getString(...)");
        b0(webType, string, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0(boolean z11) {
        if (z11) {
            Context context = getContext();
            if (context != null) {
                UpdateAppAlertBottomSheet updateAppAlertBottomSheet = new UpdateAppAlertBottomSheet(null, 1, null);
                FragmentManager childFragmentManager = getChildFragmentManager();
                kotlin.jvm.internal.o.h(childFragmentManager, "getChildFragmentManager(...)");
                updateAppAlertBottomSheet.a(childFragmentManager, context);
                return;
            }
            return;
        }
        androidx.navigation.fragment.a.a(this).d0(com.forsale.app.features.more.user.profile.b.f33670a.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0() {
        z3.n f11;
        f11 = com.forsale.app.features.more.user.profile.b.f33670a.f((r36 & 1) != 0 ? ListingsTypes.NORMAL_LISTINGS : ListingsTypes.MY_FAVORITES, (r36 & 2) != 0 ? null : getString(y0.f70539ka), (r36 & 4) != 0 ? -1 : 0, (r36 & 8) != 0 ? null : null, (r36 & 16) != 0 ? null : null, (r36 & 32) != 0 ? null : null, (r36 & 64) != 0 ? AnalyticsListingsSource.MORE : null, (r36 & 128) != 0 ? null : null, (r36 & 256) != 0 ? -1 : 0, (r36 & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 ? 0 : -1, (r36 & 1024) != 0, (r36 & RecyclerView.l.FLAG_MOVED) != 0 ? p0.f69709i : 0, (r36 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? SearchSource.SEARCH_BAR : null, (r36 & 8192) != 0 ? 0 : 0, (r36 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? HomeToolbars.SUB_CATEGORY_TOOLBAR : null, (r36 & 32768) == 0 ? false : false, (r36 & 65536) != 0 ? null : null);
        androidx.navigation.fragment.a.a(this).d0(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0() {
        NavigationUtilsKt.d(androidx.navigation.fragment.a.a(this), com.forsale.app.features.more.user.profile.b.f33670a.e(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k0() {
        z3.n f11;
        f11 = com.forsale.app.features.more.user.profile.b.f33670a.f((r36 & 1) != 0 ? ListingsTypes.NORMAL_LISTINGS : ListingsTypes.MY_LISTINGS, (r36 & 2) != 0 ? null : null, (r36 & 4) != 0 ? -1 : 0, (r36 & 8) != 0 ? null : null, (r36 & 16) != 0 ? null : null, (r36 & 32) != 0 ? null : null, (r36 & 64) != 0 ? AnalyticsListingsSource.MORE : null, (r36 & 128) != 0 ? null : null, (r36 & 256) != 0 ? -1 : 0, (r36 & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 ? 0 : -1, (r36 & 1024) != 0, (r36 & RecyclerView.l.FLAG_MOVED) != 0 ? p0.f69709i : 0, (r36 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? SearchSource.SEARCH_BAR : null, (r36 & 8192) != 0 ? 0 : 0, (r36 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? HomeToolbars.SUB_CATEGORY_TOOLBAR : null, (r36 & 32768) == 0 ? false : false, (r36 & 65536) != 0 ? null : null);
        androidx.navigation.fragment.a.a(this).d0(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0() {
        androidx.navigation.fragment.a.a(this).d0(com.forsale.app.features.more.user.profile.b.f33670a.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m0() {
        androidx.navigation.fragment.a.a(this).d0(com.forsale.app.features.more.user.profile.b.f33670a.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o0() {
        FragmentsExtensionsKt.a(this, com.forsale.app.features.more.user.profile.b.f33670a.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p0() {
        z3.n f11;
        f11 = com.forsale.app.features.more.user.profile.b.f33670a.f((r36 & 1) != 0 ? ListingsTypes.NORMAL_LISTINGS : ListingsTypes.MY_VIEW_HISTORY, (r36 & 2) != 0 ? null : getString(y0.f70722va), (r36 & 4) != 0 ? -1 : 0, (r36 & 8) != 0 ? null : null, (r36 & 16) != 0 ? null : null, (r36 & 32) != 0 ? null : null, (r36 & 64) != 0 ? AnalyticsListingsSource.MORE : null, (r36 & 128) != 0 ? null : null, (r36 & 256) != 0 ? -1 : 0, (r36 & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 ? 0 : -1, (r36 & 1024) != 0, (r36 & RecyclerView.l.FLAG_MOVED) != 0 ? p0.f69709i : 0, (r36 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? SearchSource.SEARCH_BAR : null, (r36 & 8192) != 0 ? 0 : 0, (r36 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? HomeToolbars.SUB_CATEGORY_TOOLBAR : null, (r36 & 32768) == 0 ? false : false, (r36 & 65536) != 0 ? null : null);
        androidx.navigation.fragment.a.a(this).d0(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(773864568);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(773864568, i11, -1, "com.forsale.app.features.more.user.profile.NewProfileFragment.FeedbackSnackBarComponentWithState (NewProfileFragment.kt:341)");
        }
        lf.a aVar2 = (lf.a) androidx.compose.runtime.z.a(T().C(), null, null, h11, 56, 2).getValue();
        if (aVar2 != null) {
            FeedbackSnackBarComponentKt.b(PaddingKt.i(androidx.compose.ui.c.f7566a, e2.h.l(16)), aVar2, new g00.a<wz.p>() { // from class: com.forsale.app.features.more.user.profile.NewProfileFragment$FeedbackSnackBarComponentWithState$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ wz.p invoke() {
                    invoke2();
                    return wz.p.f75480a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    NewProfileViewModel.s0(NewProfileFragment.this.T(), null, 1, null);
                }
            }, h11, (rj.a.f68042a << 3) | 6, 0);
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.user.profile.NewProfileFragment$FeedbackSnackBarComponentWithState$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i12) {
                    NewProfileFragment.this.q(aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0(String str) {
        WebType webType = WebType.TWITTER;
        String string = getString(y0.f70438ea);
        kotlin.jvm.internal.o.h(string, "getString(...)");
        b0(webType, string, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r0() {
        FragmentsExtensionsKt.a(this, com.forsale.app.features.more.user.profile.b.f33670a.k());
    }

    private final void s0() {
        LifeCycleUtilsKt.b(this, new NewProfileFragment$registerObservers$1(this, null));
    }

    public final void Q(SignInIntention signInIntention, final g00.a<wz.p> block) {
        kotlin.jvm.internal.o.i(block, "block");
        if (T().I().getValue().booleanValue()) {
            block.invoke();
            return;
        }
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "null cannot be cast to non-null type com.forsale.app.features.maincontainer.MainContainerActivity");
        e.a.a(((MainContainerActivity) activity).l1(), AuthenticationSourcePage.PROFILE, signInIntention, null, new g00.a<wz.p>() { // from class: com.forsale.app.features.more.user.profile.NewProfileFragment$checkUserLoggedInThen$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ wz.p invoke() {
                invoke2();
                return wz.p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                block.invoke();
            }
        }, 4, null);
    }

    public final NewProfileViewModel T() {
        return (NewProfileViewModel) this.f33509f.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i11, int i12, Intent intent) {
        String stringExtra;
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1000 && i12 == -1 && intent != null && (stringExtra = intent.getStringExtra("QR_RESULT_KEY")) != null) {
            T().t0(stringExtra);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.o.i(inflater, "inflater");
        super.onCreateView(inflater, viewGroup, bundle);
        Context requireContext = requireContext();
        kotlin.jvm.internal.o.h(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        composeView.setViewCompositionStrategy(new ViewCompositionStrategy.b(viewLifecycleOwner));
        composeView.setContent(r0.b.c(-813114544, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.user.profile.NewProfileFragment$onCreateView$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar, int i11) {
                if ((i11 & 11) == 2 && aVar.i()) {
                    aVar.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-813114544, i11, -1, "com.forsale.app.features.more.user.profile.NewProfileFragment.onCreateView.<anonymous>.<anonymous> (NewProfileFragment.kt:94)");
                }
                final NewProfileFragment newProfileFragment = NewProfileFragment.this;
                ThemeKt.a(null, null, r0.b.b(aVar, -817994329, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.user.profile.NewProfileFragment$onCreateView$1$1.1
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        if ((i12 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-817994329, i12, -1, "com.forsale.app.features.more.user.profile.NewProfileFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (NewProfileFragment.kt:95)");
                        }
                        NewProfileFragment.this.r(aVar2, 8);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return wz.p.f75480a;
                    }
                }), aVar, 384, 3);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
                b(aVar, num.intValue());
                return wz.p.f75480a;
            }
        }));
        return composeView;
    }

    public final void r(androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(735494513);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(735494513, i11, -1, "com.forsale.app.features.more.user.profile.NewProfileFragment.NewProfileScaffold (NewProfileFragment.kt:309)");
        }
        ComposeLifeCycleUtilsKt.b(new g00.a<wz.p>() { // from class: com.forsale.app.features.more.user.profile.NewProfileFragment$NewProfileScaffold$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ wz.p invoke() {
                invoke2();
                return wz.p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                NewProfileFragment.this.X();
            }
        }, null, new g00.a<wz.p>() { // from class: com.forsale.app.features.more.user.profile.NewProfileFragment$NewProfileScaffold$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ wz.p invoke() {
                invoke2();
                return wz.p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                NewProfileFragment.this.V();
            }
        }, null, h11, 0, 10);
        androidx.compose.ui.c c11 = q1.n.c(androidx.compose.ui.c.f7566a, false, new g00.l<q1.s, wz.p>() { // from class: com.forsale.app.features.more.user.profile.NewProfileFragment$NewProfileScaffold$3
            public final void b(q1.s semantics) {
                kotlin.jvm.internal.o.i(semantics, "$this$semantics");
                q1.r.a(semantics, true);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(q1.s sVar) {
                b(sVar);
                return wz.p.f75480a;
            }
        }, 1, null);
        androidx.compose.material.e0 l11 = ScaffoldKt.l(null, null, h11, 0, 3);
        ComposableSingletons$NewProfileFragmentKt composableSingletons$NewProfileFragmentKt = ComposableSingletons$NewProfileFragmentKt.f33502a;
        ScaffoldKt.b(c11, l11, composableSingletons$NewProfileFragmentKt.a(), composableSingletons$NewProfileFragmentKt.b(), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, r0.b.b(h11, 283143599, true, new g00.q<w.o, androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.user.profile.NewProfileFragment$NewProfileScaffold$4
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            public final void b(w.o padding, androidx.compose.runtime.a aVar2, int i12) {
                int i13;
                int i14;
                kotlin.jvm.internal.o.i(padding, "padding");
                if ((i12 & 14) == 0) {
                    if (aVar2.T(padding)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i13 = i14 | i12;
                } else {
                    i13 = i12;
                }
                if ((i13 & 91) == 18 && aVar2.i()) {
                    aVar2.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(283143599, i12, -1, "com.forsale.app.features.more.user.profile.NewProfileFragment.NewProfileScaffold.<anonymous> (NewProfileFragment.kt:320)");
                }
                c.a aVar3 = androidx.compose.ui.c.f7566a;
                androidx.compose.ui.c h12 = PaddingKt.h(SizeKt.f(aVar3, 0.0f, 1, null), padding);
                NewProfileFragment newProfileFragment = NewProfileFragment.this;
                aVar2.C(693286680);
                Arrangement arrangement = Arrangement.f3698a;
                Arrangement.e g11 = arrangement.g();
                b.a aVar4 = v0.b.f74009a;
                androidx.compose.ui.layout.a0 a11 = androidx.compose.foundation.layout.o.a(g11, aVar4.l(), aVar2, 0);
                aVar2.C(-1323940314);
                int a12 = j0.e.a(aVar2, 0);
                j0.k s11 = aVar2.s();
                ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                g00.a<ComposeUiNode> a13 = companion.a();
                g00.q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c12 = LayoutKt.c(h12);
                if (!(aVar2.k() instanceof j0.d)) {
                    j0.e.c();
                }
                aVar2.I();
                if (aVar2.f()) {
                    aVar2.y(a13);
                } else {
                    aVar2.t();
                }
                androidx.compose.runtime.a a14 = Updater.a(aVar2);
                Updater.c(a14, a11, companion.e());
                Updater.c(a14, s11, companion.g());
                g00.p<ComposeUiNode, Integer, wz.p> b11 = companion.b();
                if (a14.f() || !kotlin.jvm.internal.o.d(a14.D(), Integer.valueOf(a12))) {
                    a14.u(Integer.valueOf(a12));
                    a14.p(Integer.valueOf(a12), b11);
                }
                c12.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                aVar2.C(2058660585);
                w.u uVar = w.u.f74924a;
                aVar2.C(733328855);
                androidx.compose.ui.layout.a0 g12 = BoxKt.g(aVar4.o(), false, aVar2, 0);
                aVar2.C(-1323940314);
                int a15 = j0.e.a(aVar2, 0);
                j0.k s12 = aVar2.s();
                g00.a<ComposeUiNode> a16 = companion.a();
                g00.q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c13 = LayoutKt.c(aVar3);
                if (!(aVar2.k() instanceof j0.d)) {
                    j0.e.c();
                }
                aVar2.I();
                if (aVar2.f()) {
                    aVar2.y(a16);
                } else {
                    aVar2.t();
                }
                androidx.compose.runtime.a a17 = Updater.a(aVar2);
                Updater.c(a17, g12, companion.e());
                Updater.c(a17, s12, companion.g());
                g00.p<ComposeUiNode, Integer, wz.p> b12 = companion.b();
                if (a17.f() || !kotlin.jvm.internal.o.d(a17.D(), Integer.valueOf(a15))) {
                    a17.u(Integer.valueOf(a15));
                    a17.p(Integer.valueOf(a15), b12);
                }
                c13.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                aVar2.C(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
                NewProfileScreenKt.b(newProfileFragment.T(), aVar2, 8);
                androidx.compose.ui.c e11 = boxScopeInstance.e(aVar3, aVar4.b());
                aVar2.C(-483455358);
                androidx.compose.ui.layout.a0 a18 = androidx.compose.foundation.layout.e.a(arrangement.h(), aVar4.k(), aVar2, 0);
                aVar2.C(-1323940314);
                int a19 = j0.e.a(aVar2, 0);
                j0.k s13 = aVar2.s();
                g00.a<ComposeUiNode> a21 = companion.a();
                g00.q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c14 = LayoutKt.c(e11);
                if (!(aVar2.k() instanceof j0.d)) {
                    j0.e.c();
                }
                aVar2.I();
                if (aVar2.f()) {
                    aVar2.y(a21);
                } else {
                    aVar2.t();
                }
                androidx.compose.runtime.a a22 = Updater.a(aVar2);
                Updater.c(a22, a18, companion.e());
                Updater.c(a22, s13, companion.g());
                g00.p<ComposeUiNode, Integer, wz.p> b13 = companion.b();
                if (a22.f() || !kotlin.jvm.internal.o.d(a22.D(), Integer.valueOf(a19))) {
                    a22.u(Integer.valueOf(a19));
                    a22.p(Integer.valueOf(a19), b13);
                }
                c14.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                aVar2.C(2058660585);
                w.f fVar = w.f.f74891a;
                FeedbackSnackBarComponentKt.a(PaddingKt.i(aVar3, e2.h.l(16)), newProfileFragment.T().B(), aVar2, 70, 0);
                newProfileFragment.q(aVar2, 8);
                aVar2.S();
                aVar2.w();
                aVar2.S();
                aVar2.S();
                aVar2.S();
                aVar2.w();
                aVar2.S();
                aVar2.S();
                aVar2.S();
                aVar2.w();
                aVar2.S();
                aVar2.S();
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.q
            public /* bridge */ /* synthetic */ wz.p invoke(w.o oVar, androidx.compose.runtime.a aVar2, Integer num) {
                b(oVar, aVar2, num.intValue());
                return wz.p.f75480a;
            }
        }), h11, 3456, 12582912, 131056);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l12 = h11.l();
        if (l12 != null) {
            l12.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.user.profile.NewProfileFragment$NewProfileScaffold$5
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    NewProfileFragment.this.r(aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }
}
