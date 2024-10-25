package com.forsale.app.features.postad;

import aa.w;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.app.c;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.lifecycle.c0;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t;
import androidx.lifecycle.t0;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.h;
import androidx.work.ExistingWorkPolicy;
import androidx.work.q;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.entities.PostListingIntention;
import com.forsale.app.features.auth.login.SignInIntention;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.addons.a;
import com.forsale.app.features.postad.maininfo.a;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$2;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$3;
import com.forsale.app.utils.analytics.PLFCloseTarget;
import com.forsale.app.utils.analytics.PLFSource;
import com.forsale.app.utils.b0;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.buttons.ButtonsKt;
import com.forsale.designSystem.theme.ThemeKt;
import g00.l;
import j0.d1;
import j0.e1;
import j0.v0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import n00.k;
import t9.r0;
import t9.t0;
import t9.u0;
import t9.y0;
import z3.n;
/* compiled from: PLFActivity.kt */
/* loaded from: classes2.dex */
public final class PLFActivity extends com.forsale.app.features.postad.b<w, PostAdViewModel> {
    static final /* synthetic */ k<Object>[] F = {s.g(new PropertyReference1Impl(PLFActivity.class, "authenticatorDelegator", "getAuthenticatorDelegator()Lcom/forsale/app/features/auth/AuthenticationDelegationI;", 0))};
    public static final int G = 8;
    private final wz.h A;
    public PostAdViewModel.a B;
    private final wz.h C;
    private final com.forsale.app.features.auth.f D;
    private final wz.h E;

    /* renamed from: i  reason: collision with root package name */
    private final int f33844i = t0.f70245l;

    /* renamed from: j  reason: collision with root package name */
    private final wz.h f33845j;

    /* renamed from: x  reason: collision with root package name */
    private final wz.h f33846x;

    /* renamed from: y  reason: collision with root package name */
    private final wz.h f33847y;

    /* renamed from: z  reason: collision with root package name */
    private final wz.h f33848z;

    /* compiled from: ViewsExtensions.kt */
    /* loaded from: classes2.dex */
    public static final class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i11) {
            PLFActivity.this.x0().f4();
        }
    }

    /* compiled from: ViewsExtensions.kt */
    /* loaded from: classes2.dex */
    public static final class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i11) {
            PLFActivity.this.x0().z3();
            PLFActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PLFActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c implements NavController.b {
        c() {
        }

        @Override // androidx.navigation.NavController.b
        public final void a(NavController navController, NavDestination destination, Bundle bundle) {
            Integer num;
            NavDestination e11;
            o.i(navController, "navController");
            o.i(destination, "destination");
            PostAdViewModel x02 = PLFActivity.this.x0();
            int q11 = destination.q();
            String valueOf = String.valueOf(destination.r());
            NavBackStackEntry L = navController.L();
            if (L != null && (e11 = L.e()) != null) {
                num = Integer.valueOf(e11.q());
            } else {
                num = null;
            }
            x02.W3(q11, valueOf, num);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PLFActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d implements c0<Boolean> {
        d() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            androidx.appcompat.app.a supportActionBar = PLFActivity.this.getSupportActionBar();
            if (supportActionBar != null) {
                o.f(bool);
                supportActionBar.t(bool.booleanValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PLFActivity.kt */
    /* loaded from: classes2.dex */
    public static final class e implements c0<Boolean> {
        e() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            PLFActivity.this.invalidateOptionsMenu();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PLFActivity.kt */
    /* loaded from: classes2.dex */
    public static final class f implements c0, kotlin.jvm.internal.k {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f33866a;

        f(l function) {
            o.i(function, "function");
            this.f33866a = function;
        }

        @Override // kotlin.jvm.internal.k
        public final wz.e<?> c() {
            return this.f33866a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c0) || !(obj instanceof kotlin.jvm.internal.k)) {
                return false;
            }
            return o.d(c(), ((kotlin.jvm.internal.k) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // androidx.lifecycle.c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f33866a.invoke(obj);
        }
    }

    public PLFActivity() {
        wz.h a11;
        wz.h a12;
        wz.h a13;
        wz.h a14;
        wz.h a15;
        wz.h a16;
        a11 = kotlin.d.a(new g00.a<NavHostFragment>() { // from class: com.forsale.app.features.postad.PLFActivity$navHostFragment$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final NavHostFragment invoke() {
                Fragment k02 = PLFActivity.this.getSupportFragmentManager().k0(r0.f70144y2);
                o.g(k02, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
                return (NavHostFragment) k02;
            }
        });
        this.f33845j = a11;
        a12 = kotlin.d.a(new g00.a<NavController>() { // from class: com.forsale.app.features.postad.PLFActivity$navController$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final NavController invoke() {
                NavHostFragment Y0;
                Y0 = PLFActivity.this.Y0();
                return Y0.q();
            }
        });
        this.f33846x = a12;
        a13 = kotlin.d.a(new g00.a<ListingDetailsEntity>() { // from class: com.forsale.app.features.postad.PLFActivity$listingDetails$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final ListingDetailsEntity invoke() {
                Parcelable parcelableExtra = PLFActivity.this.getIntent().getParcelableExtra("LISTING_DETAILS_KEY");
                if (parcelableExtra instanceof ListingDetailsEntity) {
                    return (ListingDetailsEntity) parcelableExtra;
                }
                return null;
            }
        });
        this.f33847y = a13;
        a14 = kotlin.d.a(new g00.a<PostListingIntention>() { // from class: com.forsale.app.features.postad.PLFActivity$intention$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final PostListingIntention invoke() {
                PostListingIntention postListingIntention;
                Serializable serializableExtra = PLFActivity.this.getIntent().getSerializableExtra("intention_key");
                if (serializableExtra instanceof PostListingIntention) {
                    postListingIntention = (PostListingIntention) serializableExtra;
                } else {
                    postListingIntention = null;
                }
                if (postListingIntention == null) {
                    return PostListingIntention.FULL_EDIT;
                }
                return postListingIntention;
            }
        });
        this.f33848z = a14;
        a15 = kotlin.d.a(new g00.a<PLFSource>() { // from class: com.forsale.app.features.postad.PLFActivity$source$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final PLFSource invoke() {
                Serializable serializableExtra = PLFActivity.this.getIntent().getSerializableExtra("source_key");
                if (serializableExtra instanceof PLFSource) {
                    return (PLFSource) serializableExtra;
                }
                return null;
            }
        });
        this.A = a15;
        this.C = new s0(s.b(PostAdViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$2(this), new g00.a<t0.b>() { // from class: com.forsale.app.features.postad.PLFActivity$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ PLFActivity f33851f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(p pVar, Bundle bundle, PLFActivity pLFActivity) {
                    super(pVar, bundle);
                    this.f33851f = pLFActivity;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    ListingDetailsEntity W0;
                    PostListingIntention V0;
                    PLFSource c12;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    PostAdViewModel.a U0 = this.f33851f.U0();
                    W0 = this.f33851f.W0();
                    V0 = this.f33851f.V0();
                    c12 = this.f33851f.c1();
                    PostAdViewModel a11 = U0.a(W0, V0, c12);
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
                return new a(p.this, p.this.getIntent().getExtras(), this);
            }
        }, new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$3(null, this));
        this.D = new com.forsale.app.features.auth.f(this);
        a16 = kotlin.d.a(new g00.a<n>() { // from class: com.forsale.app.features.postad.PLFActivity$rootFragment$2

            /* compiled from: PLFActivity.kt */
            /* loaded from: classes2.dex */
            public /* synthetic */ class a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f33896a;

                static {
                    int[] iArr = new int[PostListingIntention.values().length];
                    try {
                        iArr[PostListingIntention.NON.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PostListingIntention.NEW_LISTING.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PostListingIntention.FULL_EDIT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[PostListingIntention.BOOST.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[PostListingIntention.BOOST_LISTING_ABOUT_TO_EXPIRE.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f33896a = iArr;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final n invoke() {
                PostListingIntention V0;
                PostListingIntention V02;
                ListingDetailsEntity W0;
                PostListingIntention V03;
                ListingDetailsEntity W02;
                PostListingIntention V04;
                V0 = PLFActivity.this.V0();
                int i11 = a.f33896a[V0.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4 && i11 != 5) {
                                return null;
                            }
                            a.b bVar = com.forsale.app.features.postad.addons.a.f34409a;
                            W02 = PLFActivity.this.W0();
                            V04 = PLFActivity.this.V0();
                            return bVar.a(W02, V04);
                        }
                        a.c cVar = com.forsale.app.features.postad.maininfo.a.f35899a;
                        W0 = PLFActivity.this.W0();
                        V03 = PLFActivity.this.V0();
                        return cVar.a(W0, V03);
                    }
                    a.c cVar2 = com.forsale.app.features.postad.maininfo.a.f35899a;
                    V02 = PLFActivity.this.V0();
                    return cVar2.a(null, V02);
                }
                throw new IllegalArgumentException("You must pass an intention rather than EditListingIntention.NON");
            }
        });
        this.E = a16;
    }

    public static /* synthetic */ void R0(PLFActivity pLFActivity, SignInIntention signInIntention, g00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            signInIntention = null;
        }
        pLFActivity.Q0(signInIntention, aVar);
    }

    private final void S0(PLFCloseTarget pLFCloseTarget) {
        String string = getString(y0.Lb);
        o.h(string, "getString(...)");
        String string2 = getString(y0.Kb);
        o.h(string2, "getString(...)");
        int i11 = y0.Jb;
        int i12 = y0.Ib;
        if (ContextExtensionsKt.f(this)) {
            c.a aVar = new c.a(this);
            aVar.p(string);
            aVar.h(string2);
            aVar.m(getString(i11), new a());
            aVar.j(getString(i12), new b());
            aVar.d(false);
            aVar.q();
        }
        x0().c4(pLFCloseTarget);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostListingIntention V0() {
        return (PostListingIntention) this.f33848z.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ListingDetailsEntity W0() {
        return (ListingDetailsEntity) this.f33847y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavController X0() {
        return (NavController) this.f33846x.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavHostFragment Y0() {
        return (NavHostFragment) this.f33845j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.navigation.h Z0() {
        return h.a.i(new h.a(), X0().H().q(), true, false, 4, null).a();
    }

    private final n b1() {
        return (n) this.E.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PLFSource c1() {
        return (PLFSource) this.A.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e1() {
        BuildersKt__Builders_commonKt.launch$default(t.a(this), null, null, new PLFActivity$nextClicked$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f1() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new PLFActivity$onUserChanged$1(this, null), 3, null);
    }

    private final void g1() {
        X0().r(new c());
        if (b1() != null) {
            NavController X0 = X0();
            n b12 = b1();
            o.f(b12);
            X0.e0(b12, Z0());
        }
    }

    private final void i1() {
        setSupportActionBar(((w) o0()).R);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j1() {
        x10.a.b("updateCache::WorkManger schedule Clear", new Object[0]);
        q.h(this).c("CLEAR_CACHE_WORK_MANAGER");
        androidx.work.k G1 = x0().G1(25L, TimeUnit.DAYS);
        if (G1 != null) {
            q.h(this).f("java", ExistingWorkPolicy.REPLACE, G1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean k1(androidx.compose.runtime.a aVar, int i11) {
        aVar.C(694705205);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(694705205, i11, -1, "com.forsale.app.features.postad.PLFActivity.showActionButton (PLFActivity.kt:287)");
        }
        boolean booleanValue = ((Boolean) z.a(x0().Q1(), Boolean.TRUE, null, aVar, 56, 2).getValue()).booleanValue();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        aVar.S();
        return booleanValue;
    }

    public final void P0(androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(-909128292);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-909128292, i11, -1, "com.forsale.app.features.postad.PLFActivity.actionButton (PLFActivity.kt:263)");
        }
        final b0 b0Var = (b0) z.b(x0().R1(), null, h11, 8, 1).getValue();
        boolean booleanValue = ((Boolean) z.a(x0().P1(), Boolean.TRUE, null, h11, 56, 2).getValue()).booleanValue();
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        androidx.compose.ui.c i12 = PaddingKt.i(SizeKt.h(aVar2, 0.0f, 1, null), e2.h.l(24));
        h11.C(-483455358);
        a0 a11 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), h11, 0);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        j0.k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        g00.q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(i12);
        if (!(h11.k() instanceof j0.d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a13);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a14 = Updater.a(h11);
        Updater.c(a14, a11, companion.e());
        Updater.c(a14, s11, companion.g());
        g00.p<ComposeUiNode, Integer, wz.p> b11 = companion.b();
        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        w.f fVar = w.f.f74891a;
        ButtonsKt.d(new g00.a<wz.p>() { // from class: com.forsale.app.features.postad.PLFActivity$actionButton$1$1
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
                PLFActivity.this.e1();
            }
        }, SizeKt.h(aVar2, 0.0f, 1, null), null, null, null, null, null, booleanValue, null, null, r0.b.b(h11, 1417533622, true, new g00.q<w.t, androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.postad.PLFActivity$actionButton$1$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            public final void b(w.t FilledButton, androidx.compose.runtime.a aVar3, int i13) {
                String c12;
                o.i(FilledButton, "$this$FilledButton");
                if ((i13 & 81) == 16 && aVar3.i()) {
                    aVar3.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(1417533622, i13, -1, "com.forsale.app.features.postad.PLFActivity.actionButton.<anonymous>.<anonymous> (PLFActivity.kt:275)");
                }
                b0 b0Var2 = b0.this;
                aVar3.C(1070166363);
                if (b0Var2 == null) {
                    c12 = null;
                } else {
                    b0 b0Var3 = b0.this;
                    int b12 = b0Var2.b();
                    Object[] a15 = b0Var3.a();
                    c12 = p1.g.c(b12, Arrays.copyOf(a15, a15.length), aVar3, 64);
                }
                aVar3.S();
                if (c12 == null) {
                    c12 = "";
                }
                TextKt.a(c12, null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar3, 0, 0, 2046);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.q
            public /* bridge */ /* synthetic */ wz.p invoke(w.t tVar, androidx.compose.runtime.a aVar3, Integer num) {
                b(tVar, aVar3, num.intValue());
                return wz.p.f75480a;
            }
        }), h11, 48, 6, 892);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.postad.PLFActivity$actionButton$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i13) {
                    PLFActivity.this.P0(aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    public final void Q0(SignInIntention signInIntention, g00.a<wz.p> block) {
        o.i(block, "block");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new PLFActivity$checkUserLoggedInThen$1(this, block, signInIntention, null), 3, null);
    }

    public final com.forsale.app.features.auth.e T0() {
        return this.D.d(this, F[0]);
    }

    public final PostAdViewModel.a U0() {
        PostAdViewModel.a aVar = this.B;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BaseViewModelActivity
    /* renamed from: d1 */
    public PostAdViewModel x0() {
        return (PostAdViewModel) this.C.getValue();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent ev2) {
        o.i(ev2, "ev");
        if (getCurrentFocus() != null) {
            Object systemService = getSystemService("input_method");
            o.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            View currentFocus = getCurrentFocus();
            if (currentFocus != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
        return super.dispatchTouchEvent(ev2);
    }

    public final void h1() {
        final PostAdViewModel x02 = x0();
        LifeCycleUtilsKt.a(this, new PLFActivity$registerObservers$1$1(this, null));
        LifeCycleUtilsKt.a(this, new PLFActivity$registerObservers$1$2(x02, this, null));
        x02.j3().observe(this, new d());
        LifeCycleUtilsKt.a(this, new PLFActivity$registerObservers$1$4(x02, this, null));
        x02.t2().observe(this, new e());
        x02.C2().observe(this, new f(new l<PostAdViewModel.RepostNavigation, wz.p>() { // from class: com.forsale.app.features.postad.PLFActivity$registerObservers$1$6

            /* compiled from: PLFActivity.kt */
            /* loaded from: classes2.dex */
            public /* synthetic */ class a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f33894a;

                static {
                    int[] iArr = new int[PostAdViewModel.RepostNavigation.values().length];
                    try {
                        iArr[PostAdViewModel.RepostNavigation.BUNDLES.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PostAdViewModel.RepostNavigation.PLANS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f33894a = iArr;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(PostAdViewModel.RepostNavigation repostNavigation) {
                int i11;
                NavController X0;
                androidx.navigation.h Z0;
                NavController X02;
                androidx.navigation.h Z02;
                if (repostNavigation == null) {
                    i11 = -1;
                } else {
                    i11 = a.f33894a[repostNavigation.ordinal()];
                }
                if (i11 == 1) {
                    X0 = PLFActivity.this.X0();
                    n a11 = com.forsale.app.features.postad.bundles.f.f35078a.a(x02.o2(), x02.k2());
                    Z0 = PLFActivity.this.Z0();
                    X0.e0(a11, Z0);
                } else if (i11 == 2) {
                    X02 = PLFActivity.this.X0();
                    n b11 = com.forsale.app.features.postad.bundles.f.f35078a.b(x02.o2(), x02.k2());
                    Z02 = PLFActivity.this.Z0();
                    X02.e0(b11, Z02);
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(PostAdViewModel.RepostNavigation repostNavigation) {
                b(repostNavigation);
                return wz.p.f75480a;
            }
        }));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (o.d(x0().f2().getValue(), Boolean.TRUE)) {
            if (Y0().getChildFragmentManager().t0() == 0) {
                S0(PLFCloseTarget.PHYSICAL_BACK);
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override // com.forsale.app.features.postad.b, com.forsale.app.base.activities.BaseViewModelActivity, com.forsale.app.base.activities.BasePlainActivity, androidx.fragment.app.p, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i1();
        g1();
        h1();
        x0().e4(c1());
        ((w) o0()).O.setContent(r0.b.c(1744237321, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.postad.PLFActivity$onCreate$1
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
                    androidx.compose.runtime.c.U(1744237321, i11, -1, "com.forsale.app.features.postad.PLFActivity.onCreate.<anonymous> (PLFActivity.kt:114)");
                }
                final PLFActivity pLFActivity = PLFActivity.this;
                ThemeKt.a(null, null, r0.b.b(aVar, 259213010, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.postad.PLFActivity$onCreate$1.1
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        boolean k12;
                        if ((i12 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(259213010, i12, -1, "com.forsale.app.features.postad.PLFActivity.onCreate.<anonymous>.<anonymous> (PLFActivity.kt:115)");
                        }
                        k12 = PLFActivity.this.k1(aVar2, 8);
                        if (k12) {
                            PLFActivity.this.P0(aVar2, 8);
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
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(final Menu menu) {
        o.i(menu, "menu");
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(u0.f70352c, menu);
        MenuItem findItem = menu.findItem(r0.f69887e5);
        if (findItem != null) {
            NavDestination F2 = X0().F();
            boolean z11 = false;
            if (F2 != null && F2.q() == r0.f69832a2) {
                z11 = true;
            }
            findItem.setVisible(!z11);
        }
        x0().g2().observe(this, new f(new l<Boolean, wz.p>() { // from class: com.forsale.app.features.postad.PLFActivity$onCreateOptionsMenu$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(Boolean bool) {
                MenuItem menuItem;
                Menu menu2 = menu;
                if (menu2 != null) {
                    menuItem = menu2.findItem(r0.f69887e5);
                } else {
                    menuItem = null;
                }
                if (menuItem != null) {
                    o.f(bool);
                    menuItem.setEnabled(bool.booleanValue());
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(Boolean bool) {
                b(bool);
                return wz.p.f75480a;
            }
        }));
        return true;
    }

    @Override // com.forsale.app.features.postad.b, com.forsale.app.base.activities.BaseViewModelActivity, com.forsale.app.base.activities.BasePlainActivity, androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    protected void onDestroy() {
        x10.a.b("Activity: onDestroy", new Object[0]);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        o.i(item, "item");
        if (item.getItemId() == r0.f69887e5) {
            S0(PLFCloseTarget.NAVIGATION_CLOSE);
        }
        return super.onOptionsItemSelected(item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    public void onStop() {
        super.onStop();
        x0().I4();
    }

    @Override // androidx.appcompat.app.d
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BasePlainActivity
    public int p0() {
        return this.f33844i;
    }
}
