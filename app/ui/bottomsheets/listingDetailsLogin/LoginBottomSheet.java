package com.forsale.app.ui.bottomsheets.listingDetailsLogin;

import aa.q2;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.l;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.forsale.app.features.auth.AuthActivity;
import com.forsale.app.features.auth.models.AuthIntention;
import com.forsale.app.utils.CrashlyticsUtilsKt;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.auth.AuthenticationSourcePage;
import g00.a;
import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import t9.t0;
import t9.z0;
import w3.a;
import wz.h;
import wz.p;
/* compiled from: LoginBottomSheet.kt */
/* loaded from: classes3.dex */
public final class LoginBottomSheet extends ng.a<q2, LoginViewModel> {

    /* renamed from: j  reason: collision with root package name */
    private final int f38121j = t0.f70197e0;

    /* renamed from: x  reason: collision with root package name */
    private final h f38122x;

    /* renamed from: y  reason: collision with root package name */
    private g00.a<p> f38123y;

    /* renamed from: z  reason: collision with root package name */
    public static final a f38120z = new a(null);
    public static final int A = 8;

    /* compiled from: LoginBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void b(a aVar, FragmentManager fragmentManager, g00.a aVar2, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                aVar2 = null;
            }
            aVar.a(fragmentManager, aVar2);
        }

        public final void a(FragmentManager fragmentManager, g00.a<p> aVar) {
            o.i(fragmentManager, "fragmentManager");
            LoginBottomSheet loginBottomSheet = new LoginBottomSheet();
            loginBottomSheet.f38123y = aVar;
            loginBottomSheet.show(fragmentManager, "LoginBottomSheet");
        }
    }

    /* compiled from: LoginBottomSheet.kt */
    /* loaded from: classes3.dex */
    static final class b implements FlowCollector<p> {
        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            Context context = LoginBottomSheet.this.getContext();
            if (context != null) {
                AuthActivity.f22470e.a(context, AuthIntention.SignIn, AuthenticationSourcePage.LISTING_DETAILS_CHAT);
            }
            return p.f75480a;
        }
    }

    /* compiled from: LoginBottomSheet.kt */
    /* loaded from: classes3.dex */
    static final class c implements FlowCollector<p> {
        c() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            LoginBottomSheet.this.dismiss();
            return p.f75480a;
        }
    }

    public LoginBottomSheet() {
        final h b11;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.ui.bottomsheets.listingDetailsLogin.LoginBottomSheet$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.ui.bottomsheets.listingDetailsLogin.LoginBottomSheet$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) a.this.invoke();
            }
        });
        this.f38122x = FragmentViewModelLazyKt.b(this, s.b(LoginViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.ui.bottomsheets.listingDetailsLogin.LoginBottomSheet$special$$inlined$viewModels$default$3
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.ui.bottomsheets.listingDetailsLogin.LoginBottomSheet$special$$inlined$viewModels$default$4
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.listingDetailsLogin.LoginBottomSheet$special$$inlined$viewModels$default$5
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
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w9.b
    /* renamed from: D */
    public LoginViewModel t() {
        return (LoginViewModel) this.f38122x.getValue();
    }

    @Override // w9.b, androidx.fragment.app.j
    public int getTheme() {
        return z0.f70801k;
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        o.i(dialog, "dialog");
        super.onDismiss(dialog);
        g00.a<p> aVar = this.f38123y;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CrashlyticsUtilsKt.b("chatNowBottomSheet", null, 2, null);
    }

    @Override // w9.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        OneShotEventHandler<p> w02 = t().w0();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        w02.h(viewLifecycleOwner, new b());
        OneShotEventHandler<p> v02 = t().v0();
        androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        v02.h(viewLifecycleOwner2, new c());
    }

    @Override // w9.b
    protected int s() {
        return this.f38121j;
    }
}
