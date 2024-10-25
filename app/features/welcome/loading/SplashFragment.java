package com.forsale.app.features.welcome.loading;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.c;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.fragment.app.p;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.navigation.h;
import com.adjust.sdk.Constants;
import com.forsale.app.App;
import com.forsale.app.datalayer.network.entities.SessionEntity;
import com.forsale.app.features.categories.listingdetails.buyerctas.ShowCTAsBottomSheetKt;
import com.forsale.app.features.maincontainer.MainContainerActivity;
import com.forsale.app.features.maincontainer.MainContainerViewModel;
import com.forsale.app.features.welcome.loading.LoadingViewModel;
import com.forsale.app.intializers.AnalyticInitializer;
import com.forsale.app.intializers.ProcessObserversInitializer;
import com.forsale.app.intializers.UtilsInitializer;
import com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.UserContactMode;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.CrashlyticsUtilsKt;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.q0;
import com.forsale.app.utils.t;
import com.forsale.app.utils.u;
import com.forsale.designSystem.bottomsheets.BottomSheetsKt;
import com.forsale.designSystem.bottomsheets.ModalBottomSheetState;
import com.forsale.designSystem.bottomsheets.ModalBottomSheetValue;
import com.forsale.designSystem.iconography.IconKt;
import com.forsale.designSystem.theme.ThemeKt;
import com.forsale.ui.components.StateKt;
import com.moengage.pushbase.MoEPushHelper;
import g00.q;
import j0.d1;
import j0.e1;
import j0.n1;
import j0.v0;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import t9.y0;
import v0.b;
import w3.a;
/* compiled from: SplashFragment.kt */
/* loaded from: classes2.dex */
public final class SplashFragment extends com.forsale.app.features.welcome.loading.a {
    public MoEPushHelper A;

    /* renamed from: f  reason: collision with root package name */
    private final wz.h f37301f;

    /* renamed from: g  reason: collision with root package name */
    private final wz.h f37302g;

    /* renamed from: h  reason: collision with root package name */
    private final z3.i f37303h;

    /* renamed from: i  reason: collision with root package name */
    private final wz.h f37304i;

    /* renamed from: j  reason: collision with root package name */
    private final t f37305j;

    /* renamed from: x  reason: collision with root package name */
    private final androidx.activity.result.b<String> f37306x;

    /* renamed from: y  reason: collision with root package name */
    private final AtomicBoolean f37307y;

    /* renamed from: z  reason: collision with root package name */
    private final boolean f37308z;
    static final /* synthetic */ n00.k<Object>[] C = {s.g(new PropertyReference1Impl(SplashFragment.class, "phonePermission", "getPhonePermission()Lcom/forsale/app/utils/PermissionsManager;", 0))};
    public static final a B = new a(null);
    public static final int D = 8;

    /* compiled from: SplashFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SplashFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f37342a;

        static {
            int[] iArr = new int[SessionEntity.AppStatus.values().length];
            try {
                iArr[SessionEntity.AppStatus.IN_MAINTENANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SessionEntity.AppStatus.FORCE_UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SessionEntity.AppStatus.OPTIONAL_UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37342a = iArr;
        }
    }

    /* compiled from: ViewsExtensions.kt */
    /* loaded from: classes2.dex */
    public static final class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i11) {
            SplashFragment.this.requireActivity().finish();
        }
    }

    public SplashFragment() {
        final wz.h b11;
        wz.h a11;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.features.welcome.loading.SplashFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.features.welcome.loading.SplashFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) g00.a.this.invoke();
            }
        });
        this.f37301f = FragmentViewModelLazyKt.b(this, s.b(LoadingViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.welcome.loading.SplashFragment$special$$inlined$viewModels$default$3
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.welcome.loading.SplashFragment$special$$inlined$viewModels$default$4
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.welcome.loading.SplashFragment$special$$inlined$viewModels$default$5
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
        this.f37302g = FragmentViewModelLazyKt.b(this, s.b(MainContainerViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.welcome.loading.SplashFragment$special$$inlined$activityViewModels$default$1
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.welcome.loading.SplashFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w3.a invoke() {
                w3.a aVar2;
                g00.a aVar3 = g00.a.this;
                if (aVar3 == null || (aVar2 = (w3.a) aVar3.invoke()) == null) {
                    w3.a defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                    o.h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                    return defaultViewModelCreationExtras;
                }
                return aVar2;
            }
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.welcome.loading.SplashFragment$special$$inlined$activityViewModels$default$3
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
        this.f37303h = new z3.i(s.b(k.class), new g00.a<Bundle>() { // from class: com.forsale.app.features.welcome.loading.SplashFragment$special$$inlined$navArgs$1
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
        a11 = kotlin.d.a(new g00.a<String>() { // from class: com.forsale.app.features.welcome.loading.SplashFragment$deepLink$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                k O;
                O = SplashFragment.this.O();
                return O.a();
            }
        });
        this.f37304i = a11;
        this.f37305j = t.f40536d.a(55, "android.permission.READ_PHONE_STATE");
        androidx.activity.result.b<String> registerForActivityResult = registerForActivityResult(new e.c(), d.f37344a);
        o.h(registerForActivityResult, "registerForActivityResult(...)");
        this.f37306x = registerForActivityResult;
        boolean z11 = false;
        this.f37307y = new AtomicBoolean(false);
        if (Build.VERSION.SDK_INT == 28 && !o.d(Build.VERSION.CODENAME, "REL")) {
            z11 = true;
        }
        this.f37308z = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(LoadingViewModel.c cVar) {
        if (cVar instanceof LoadingViewModel.c.a) {
            p requireActivity = requireActivity();
            o.h(requireActivity, "requireActivity(...)");
            com.forsale.app.utils.a.a(requireActivity);
            return;
        }
        p requireActivity2 = requireActivity();
        o.h(requireActivity2, "requireActivity(...)");
        com.forsale.app.utils.a.b(requireActivity2);
    }

    private final void J() {
        Intent intent;
        MainContainerActivity mainContainerActivity;
        String K = K();
        if (K != null && (intent = requireActivity().getIntent()) != null) {
            intent.setData(Uri.parse(K));
            intent.addFlags(32768);
            p requireActivity = requireActivity();
            if (requireActivity instanceof MainContainerActivity) {
                mainContainerActivity = (MainContainerActivity) requireActivity;
            } else {
                mainContainerActivity = null;
            }
            if (mainContainerActivity != null) {
                mainContainerActivity.y(intent);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String K() {
        return (String) this.f37304i.getValue();
    }

    private final MainContainerViewModel L() {
        return (MainContainerViewModel) this.f37302g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k O() {
        return (k) this.f37303h.getValue();
    }

    private final u Q() {
        return this.f37305j.a(this, C[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadingViewModel S() {
        return (LoadingViewModel) this.f37301f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final void T() {
        if (Build.VERSION.SDK_INT < 29 && !this.f37308z) {
            Q().f(new SplashFragment$handleDeviceId$1(this), new g00.a<wz.p>() { // from class: com.forsale.app.features.welcome.loading.SplashFragment$handleDeviceId$2
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
                    p requireActivity = SplashFragment.this.requireActivity();
                    o.h(requireActivity, "requireActivity(...)");
                    String p11 = ContextExtensionsKt.p(requireActivity);
                    if (p11 != null) {
                        SplashFragment.this.f0(p11);
                    }
                }
            });
            return;
        }
        p requireActivity = requireActivity();
        o.h(requireActivity, "requireActivity(...)");
        f0(ContextExtensionsKt.q(requireActivity));
    }

    private final void X(SessionEntity.AppStatus appStatus) {
        if (appStatus != null) {
            androidx.navigation.fragment.a.a(this).e0(l.f37396a.a(appStatus), new h.a().a());
        }
    }

    private final void Y(boolean z11, SessionEntity sessionEntity) {
        c0(z11, sessionEntity);
        if (z11) {
            J();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0() {
        MoEPushHelper M = M();
        p requireActivity = requireActivity();
        o.h(requireActivity, "requireActivity(...)");
        M.g(requireActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(List<String> list, g00.a<wz.p> aVar) {
        Context requireContext = requireContext();
        o.h(requireContext, "requireContext(...)");
        String string = getString(y0.f70755xb);
        o.h(string, "getString(...)");
        if (ContextExtensionsKt.f(requireContext)) {
            c.a aVar2 = new c.a(requireContext);
            aVar2.p("");
            aVar2.h(string);
            aVar2.m(requireContext.getString(y0.Z4), new q0(aVar));
            aVar2.j(requireContext.getString(y0.I4), new c());
            aVar2.d(false);
            aVar2.q();
        }
    }

    private final void c0(boolean z11, SessionEntity sessionEntity) {
        androidx.appcompat.app.d l11 = ContextExtensionsKt.l(requireContext());
        o.g(l11, "null cannot be cast to non-null type com.forsale.app.features.maincontainer.MainContainerActivity");
        ((MainContainerActivity) l11).P1(this, z11, sessionEntity);
    }

    private final void d0() {
        LifeCycleUtilsKt.b(this, new SplashFragment$registerObservers$1(this, null));
        LifeCycleUtilsKt.b(this, new SplashFragment$registerObservers$2(this, null));
        LifeCycleUtilsKt.b(this, new SplashFragment$registerObservers$3(this, null));
    }

    private final void e0() {
        ComponentName componentName;
        PackageManager packageManager = requireContext().getPackageManager();
        o.h(packageManager, "getPackageManager(...)");
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(requireContext().getPackageName());
        if (launchIntentForPackage != null) {
            componentName = launchIntentForPackage.getComponent();
        } else {
            componentName = null;
        }
        requireContext().startActivity(Intent.makeRestartActivityTask(componentName));
        Runtime.getRuntime().exit(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(String str) {
        Application application;
        p activity = getActivity();
        App app = null;
        if (activity != null) {
            application = activity.getApplication();
        } else {
            application = null;
        }
        if (application instanceof App) {
            app = (App) application;
        }
        if (app != null) {
            androidx.startup.a e11 = androidx.startup.a.e(app);
            e11.f(AnalyticInitializer.class);
            e11.f(ProcessObserversInitializer.class);
            e11.f(UtilsInitializer.class);
        }
        S().f0(str);
    }

    private final void g0(boolean z11, boolean z12) {
        S().H(z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void h0(SplashFragment splashFragment, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        splashFragment.g0(z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(-1504440503);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1504440503, i11, -1, "com.forsale.app.features.welcome.loading.SplashFragment.ContactUsBottomSheet (SplashFragment.kt:193)");
        }
        n1 b11 = z.b(S().K(), null, h11, 8, 1);
        ModalBottomSheetState k11 = BottomSheetsKt.k(ModalBottomSheetValue.Hidden, null, true, null, h11, 390, 10);
        final ab.a r11 = r(b11);
        if (r11 != null) {
            j0.u.d(Boolean.valueOf(r(b11).c()), new SplashFragment$ContactUsBottomSheet$1$1(r11, k11, null), h11, 64);
            ShowCTAsBottomSheetKt.b(k11, r11, r0.b.b(h11, -1100024191, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.welcome.loading.SplashFragment$ContactUsBottomSheet$1$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    if ((i12 & 11) == 2 && aVar2.i()) {
                        aVar2.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-1100024191, i12, -1, "com.forsale.app.features.welcome.loading.SplashFragment.ContactUsBottomSheet.<anonymous>.<anonymous> (SplashFragment.kt:209)");
                    }
                    if (ab.a.this.a() == UserContactMode.CALL_ONLY) {
                        c.a aVar3 = androidx.compose.ui.c.f7566a;
                        float f11 = 40;
                        androidx.compose.ui.c a11 = y0.e.a(SizeKt.i(SizeKt.u(aVar3, e2.h.l(f11)), e2.h.l(f11)), c0.g.f());
                        dk.a aVar4 = dk.a.f54291a;
                        int i13 = dk.a.f54292b;
                        yj.d f12 = aVar4.a(aVar2, i13).f();
                        int i14 = yj.d.f76453b;
                        androidx.compose.ui.c b12 = BackgroundKt.b(a11, f12.h(aVar2, i14), null, 2, null);
                        aVar2.C(733328855);
                        b.a aVar5 = v0.b.f74009a;
                        a0 g11 = BoxKt.g(aVar5.o(), false, aVar2, 0);
                        aVar2.C(-1323940314);
                        int a12 = j0.e.a(aVar2, 0);
                        j0.k s11 = aVar2.s();
                        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                        g00.a<ComposeUiNode> a13 = companion.a();
                        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(b12);
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
                        Updater.c(a14, g11, companion.e());
                        Updater.c(a14, s11, companion.g());
                        g00.p<ComposeUiNode, Integer, wz.p> b13 = companion.b();
                        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                            a14.u(Integer.valueOf(a12));
                            a14.p(Integer.valueOf(a12), b13);
                        }
                        c11.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                        aVar2.C(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
                        IconKt.a(p1.e.d(sj.d.f68678o, aVar2, 0), boxScopeInstance.e(aVar3, aVar5.e()), null, aVar4.a(aVar2, i13).f().j(aVar2, i14), false, e2.h.l(20), aVar2, 196616, 20);
                        aVar2.S();
                        aVar2.w();
                        aVar2.S();
                        aVar2.S();
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            }), new g00.l<String, wz.p>() { // from class: com.forsale.app.features.welcome.loading.SplashFragment$ContactUsBottomSheet$1$3

                /* compiled from: SplashFragment.kt */
                /* loaded from: classes2.dex */
                public /* synthetic */ class a {

                    /* renamed from: a  reason: collision with root package name */
                    public static final /* synthetic */ int[] f37327a;

                    static {
                        int[] iArr = new int[UserContactMode.values().length];
                        try {
                            iArr[UserContactMode.CALL_ONLY.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        f37327a = iArr;
                    }
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(String specificNumber) {
                    int i12;
                    LoadingViewModel S;
                    o.i(specificNumber, "specificNumber");
                    UserContactMode a11 = ab.a.this.a();
                    if (a11 == null) {
                        i12 = -1;
                    } else {
                        i12 = a.f37327a[a11.ordinal()];
                    }
                    if (i12 == 1) {
                        Context context = this.getContext();
                        if (context != null) {
                            ContextExtensionsKt.z(context, specificNumber);
                        }
                        S = this.S();
                        S.d0(specificNumber);
                    }
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(String str) {
                    b(str);
                    return wz.p.f75480a;
                }
            }, new g00.a<wz.p>() { // from class: com.forsale.app.features.welcome.loading.SplashFragment$ContactUsBottomSheet$1$4
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
                    LoadingViewModel S;
                    S = SplashFragment.this.S();
                    S.G();
                }
            }, h11, 448);
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.welcome.loading.SplashFragment$ContactUsBottomSheet$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    SplashFragment.this.q(aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    private static final ab.a r(n1<ab.a> n1Var) {
        return n1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(1340630741);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1340630741, i11, -1, "com.forsale.app.features.welcome.loading.SplashFragment.SplashScreenContent (SplashFragment.kt:115)");
        }
        n1 b11 = z.b(S().O(), null, h11, 8, 1);
        j0.u.d(t(b11), new SplashFragment$SplashScreenContent$1(this, b11, null), h11, 64);
        LoadingViewModel.c t11 = t(b11);
        if (t11 instanceof LoadingViewModel.c.a) {
            h11.C(-2024880938);
            LoadingViewModel.c t12 = t(b11);
            o.g(t12, "null cannot be cast to non-null type com.forsale.app.features.welcome.loading.LoadingViewModel.SplashState.Loading");
            LoadingViewModel.c.a aVar2 = (LoadingViewModel.c.a) t12;
            LoadingScreenUiKt.b(aVar2.c(), aVar2.d(), aVar2.a(), aVar2.b(), h11, 8);
            h11.S();
        } else if (t11 instanceof com.forsale.app.features.welcome.loading.c) {
            h11.C(-2024880497);
            int i12 = t9.q0.f69737d;
            int i13 = y0.Y;
            int i14 = y0.X;
            LoadingViewModel.c t13 = t(b11);
            o.g(t13, "null cannot be cast to non-null type com.forsale.app.features.welcome.loading.LoadingViewModel.SplashState.Failed.NetworkConnectionFailed");
            AppStatusUiKt.d(i12, i13, i14, ((com.forsale.app.features.welcome.loading.c) t13).a(), new g00.a<wz.p>() { // from class: com.forsale.app.features.welcome.loading.SplashFragment$SplashScreenContent$3
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
                    SplashFragment.h0(SplashFragment.this, false, true, 1, null);
                }
            }, new g00.a<wz.p>() { // from class: com.forsale.app.features.welcome.loading.SplashFragment$SplashScreenContent$4
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
                    LoadingViewModel S;
                    S = SplashFragment.this.S();
                    S.b0();
                }
            }, h11, 0);
            h11.S();
        } else if (o.d(t11, com.forsale.app.features.welcome.loading.d.f37382a)) {
            h11.C(-2024879786);
            StateKt.b(null, null, 0, 0, 0, new g00.a<wz.p>() { // from class: com.forsale.app.features.welcome.loading.SplashFragment$SplashScreenContent$5
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
                    SplashFragment.h0(SplashFragment.this, false, false, 3, null);
                }
            }, h11, 0, 31);
            h11.S();
        } else if (t11 instanceof h) {
            h11.C(-2024879643);
            LoadingViewModel.c t14 = t(b11);
            o.g(t14, "null cannot be cast to non-null type com.forsale.app.features.welcome.loading.LoadingViewModel.SplashState.Success.SpecialAppStatus");
            int i15 = b.f37342a[((h) t14).a().ordinal()];
            if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 != 3) {
                        h11.C(-2024878226);
                        h11.S();
                    } else {
                        h11.C(-2024878398);
                        h11.S();
                        LoadingViewModel.c t15 = t(b11);
                        o.g(t15, "null cannot be cast to non-null type com.forsale.app.features.welcome.loading.LoadingViewModel.SplashState.Success.SpecialAppStatus");
                        X(((h) t15).a());
                    }
                } else {
                    h11.C(-2024878857);
                    AppStatusUiKt.c(t9.q0.f69733c, y0.W, y0.V, new g00.a<wz.p>() { // from class: com.forsale.app.features.welcome.loading.SplashFragment$SplashScreenContent$8
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
                            Context context = SplashFragment.this.getContext();
                            if (context != null) {
                                ContextExtensionsKt.G(context);
                            }
                        }
                    }, h11, 0);
                    h11.S();
                }
            } else {
                h11.C(-2024879471);
                AppStatusUiKt.f(t9.q0.f69741e, y0.f70377b0, y0.f70360a0, new g00.a<wz.p>() { // from class: com.forsale.app.features.welcome.loading.SplashFragment$SplashScreenContent$6
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
                        SplashFragment.h0(SplashFragment.this, true, false, 2, null);
                    }
                }, new g00.a<wz.p>() { // from class: com.forsale.app.features.welcome.loading.SplashFragment$SplashScreenContent$7
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
                        LoadingViewModel S;
                        S = SplashFragment.this.S();
                        S.b0();
                    }
                }, h11, 0);
                h11.S();
            }
            h11.S();
        } else if (t11 instanceof g) {
            h11.C(-2024878136);
            h11.S();
            boolean R = TypeExtensionsKt.R(K());
            LoadingViewModel.c t16 = t(b11);
            o.g(t16, "null cannot be cast to non-null type com.forsale.app.features.welcome.loading.LoadingViewModel.SplashState.Success.NoSpecialAppStatus");
            Y(R, ((g) t16).a());
        } else if (o.d(t11, com.forsale.app.features.welcome.loading.b.f37380a)) {
            h11.C(-2024877881);
            h11.S();
            e0();
        } else if (o.d(t11, e.f37383a)) {
            h11.C(-2024877790);
            h11.S();
            T();
        } else {
            h11.C(-2024877752);
            h11.S();
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.welcome.loading.SplashFragment$SplashScreenContent$9
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i16) {
                    SplashFragment.this.s(aVar3, v0.a(i11 | 1));
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
    public static final LoadingViewModel.c t(n1<? extends LoadingViewModel.c> n1Var) {
        return n1Var.getValue();
    }

    public final MoEPushHelper M() {
        MoEPushHelper moEPushHelper = this.A;
        if (moEPushHelper != null) {
            return moEPushHelper;
        }
        o.w("moEPushHelper");
        return null;
    }

    public final AtomicBoolean V() {
        return this.f37307y;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        p requireActivity = requireActivity();
        o.h(requireActivity, "requireActivity(...)");
        ComposeView composeView = new ComposeView(requireActivity, null, 0, 6, null);
        composeView.setContent(r0.b.c(1818726527, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.welcome.loading.SplashFragment$onCreateView$1$1
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
                    androidx.compose.runtime.c.U(1818726527, i11, -1, "com.forsale.app.features.welcome.loading.SplashFragment.onCreateView.<anonymous>.<anonymous> (SplashFragment.kt:100)");
                }
                final SplashFragment splashFragment = SplashFragment.this;
                ThemeKt.a(null, null, r0.b.b(aVar, 253676438, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.welcome.loading.SplashFragment$onCreateView$1$1.1
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        if ((i12 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(253676438, i12, -1, "com.forsale.app.features.welcome.loading.SplashFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (SplashFragment.kt:101)");
                        }
                        SplashFragment.this.s(aVar2, 8);
                        SplashFragment.this.q(aVar2, 8);
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

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        L().H1(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i11, String[] permissions, int[] grantResults) {
        o.i(permissions, "permissions");
        o.i(grantResults, "grantResults");
        super.onRequestPermissionsResult(i11, permissions, grantResults);
        Q().d(i11, permissions, grantResults, new g00.l<List<? extends String>, wz.p>() { // from class: com.forsale.app.features.welcome.loading.SplashFragment$onRequestPermissionsResult$1

            /* compiled from: ViewsExtensions.kt */
            /* loaded from: classes2.dex */
            public static final class a implements DialogInterface.OnClickListener {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ SplashFragment f37350a;

                public a(SplashFragment splashFragment) {
                    this.f37350a = splashFragment;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    Context requireContext = this.f37350a.requireContext();
                    o.h(requireContext, "requireContext(...)");
                    ContextExtensionsKt.y(requireContext);
                }
            }

            /* compiled from: ViewsExtensions.kt */
            /* loaded from: classes2.dex */
            public static final class b implements DialogInterface.OnClickListener {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ SplashFragment f37351a;

                public b(SplashFragment splashFragment) {
                    this.f37351a = splashFragment;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    this.f37351a.requireActivity().finish();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(List<String> it2) {
                o.i(it2, "it");
                Context requireContext = SplashFragment.this.requireContext();
                o.h(requireContext, "requireContext(...)");
                String string = SplashFragment.this.getString(y0.f70771yb);
                o.h(string, "getString(...)");
                String string2 = SplashFragment.this.getString(y0.Z2);
                o.h(string2, "getString(...)");
                SplashFragment splashFragment = SplashFragment.this;
                if (ContextExtensionsKt.f(requireContext)) {
                    c.a aVar = new c.a(requireContext);
                    aVar.p(string);
                    aVar.h(string2);
                    aVar.m(requireContext.getString(y0.Z4), new a(splashFragment));
                    aVar.j(requireContext.getString(y0.I4), new b(splashFragment));
                    aVar.d(false);
                    aVar.q();
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(List<? extends String> list) {
                b(list);
                return wz.p.f75480a;
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CrashlyticsUtilsKt.a("Loading Screen", new g00.l<tn.b, wz.p>() { // from class: com.forsale.app.features.welcome.loading.SplashFragment$onResume$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(tn.b logScreenVisited) {
                String K;
                o.i(logScreenVisited, "$this$logScreenVisited");
                K = SplashFragment.this.K();
                if (K != null) {
                    logScreenVisited.b(Constants.DEEPLINK, K);
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(tn.b bVar) {
                b(bVar);
                return wz.p.f75480a;
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        SessionEntity.AppStatus value = S().J().getValue();
        if (value != null && value == SessionEntity.AppStatus.FORCE_UPDATE) {
            h0(this, true, false, 2, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"MissingPermission"})
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        d0();
    }

    /* compiled from: SplashFragment.kt */
    /* loaded from: classes2.dex */
    static final class d implements androidx.activity.result.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f37344a = new d();

        d() {
        }

        @Override // androidx.activity.result.a
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
            b(bool.booleanValue());
        }

        public final void b(boolean z11) {
        }
    }
}
