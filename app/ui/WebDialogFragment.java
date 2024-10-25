package com.forsale.app.ui;

import aa.ya;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.g;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.c0;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import com.forsale.app.base.ActionViewsMode;
import com.forsale.app.base.ViewStates;
import com.forsale.app.features.more.WebModel;
import com.forsale.app.ui.c;
import com.forsale.app.utils.CrashlyticsUtilsKt;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import com.forsale.app.utils.ViewsExtensionsKt;
import g00.l;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import t9.z0;
import v9.c;
import wz.e;
import wz.h;
import wz.p;
/* compiled from: WebDialogFragment.kt */
/* loaded from: classes3.dex */
public final class WebDialogFragment extends com.forsale.app.ui.a implements v9.c {
    public static final a C = new a(null);
    public static final int D = 8;
    private final int A;
    private ya B;

    /* renamed from: f  reason: collision with root package name */
    private final h f37837f;

    /* renamed from: g  reason: collision with root package name */
    private final h f37838g;

    /* renamed from: h  reason: collision with root package name */
    private g00.a<p> f37839h;

    /* renamed from: i  reason: collision with root package name */
    public c.a f37840i;

    /* renamed from: j  reason: collision with root package name */
    private final h f37841j;

    /* renamed from: x  reason: collision with root package name */
    private final int f37842x;

    /* renamed from: y  reason: collision with root package name */
    private final int f37843y;

    /* renamed from: z  reason: collision with root package name */
    private final int f37844z;

    /* compiled from: WebDialogFragment.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(WebModel webModel, boolean z11, FragmentManager fragmentManager, g00.a<p> onDismissAction) {
            o.i(webModel, "webModel");
            o.i(fragmentManager, "fragmentManager");
            o.i(onDismissAction, "onDismissAction");
            WebDialogFragment webDialogFragment = new WebDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("web_model", webModel);
            bundle.putBoolean("is_dark_mode", z11);
            webDialogFragment.setArguments(bundle);
            webDialogFragment.E(onDismissAction);
            webDialogFragment.show(fragmentManager, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WebDialogFragment.kt */
    /* loaded from: classes3.dex */
    public static final class b implements FlowCollector<WebModel> {
        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(WebModel webModel, zz.a<? super p> aVar) {
            if (webModel != null) {
                ya yaVar = WebDialogFragment.this.B;
                ya yaVar2 = null;
                if (yaVar == null) {
                    o.w("binding");
                    yaVar = null;
                }
                yaVar.R.getSettings().setJavaScriptEnabled(true);
                ya yaVar3 = WebDialogFragment.this.B;
                if (yaVar3 == null) {
                    o.w("binding");
                    yaVar3 = null;
                }
                yaVar3.R.getSettings().setSupportZoom(true);
                ya yaVar4 = WebDialogFragment.this.B;
                if (yaVar4 == null) {
                    o.w("binding");
                } else {
                    yaVar2 = yaVar4;
                }
                WebView webView = yaVar2.R;
                o.h(webView, "webView");
                ViewsExtensionsKt.u(webView, webModel.a(), webModel.b(), WebDialogFragment.this.z().v0(), false, 8, null);
            }
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WebDialogFragment.kt */
    /* loaded from: classes3.dex */
    public static final class c implements FlowCollector<p> {
        c() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            WebDialogFragment.this.dismiss();
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WebDialogFragment.kt */
    /* loaded from: classes3.dex */
    public static final class d implements c0, k {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f37850a;

        d(l function) {
            o.i(function, "function");
            this.f37850a = function;
        }

        @Override // kotlin.jvm.internal.k
        public final e<?> c() {
            return this.f37850a;
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
            this.f37850a.invoke(obj);
        }
    }

    public WebDialogFragment() {
        h a11;
        h a12;
        h b11;
        a11 = kotlin.d.a(new g00.a<WebModel>() { // from class: com.forsale.app.ui.WebDialogFragment$webModel$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final WebModel invoke() {
                WebModel webModel;
                Bundle arguments = WebDialogFragment.this.getArguments();
                if (arguments != null) {
                    webModel = (WebModel) arguments.getParcelable("web_model");
                } else {
                    webModel = null;
                }
                o.f(webModel);
                return webModel;
            }
        });
        this.f37837f = a11;
        a12 = kotlin.d.a(new g00.a<Boolean>() { // from class: com.forsale.app.ui.WebDialogFragment$isDarkMode$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Boolean invoke() {
                Bundle arguments = WebDialogFragment.this.getArguments();
                return Boolean.valueOf(arguments != null ? arguments.getBoolean("is_dark_mode") : false);
            }
        });
        this.f37838g = a12;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.ui.WebDialogFragment$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes3.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ WebDialogFragment f37847f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, WebDialogFragment webDialogFragment) {
                    super(fragment, bundle);
                    this.f37847f = webDialogFragment;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    c a11 = this.f37847f.y().a(this.f37847f.A(), this.f37847f.D());
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
                return new a(Fragment.this, Fragment.this.getArguments(), this);
            }
        };
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5(new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4(this)));
        this.f37841j = FragmentViewModelLazyKt.b(this, s.b(com.forsale.app.ui.c.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
        this.f37842x = t9.t0.Y0;
        this.f37843y = t9.t0.V0;
        this.f37844z = t9.t0.S0;
        this.A = t9.t0.T0;
    }

    private final void B() {
        z().A0();
    }

    private final void C() {
        z().x0().h(this, new b());
        z().w0().h(this, new c());
        z().v0().observe(this, new d(new l<ViewStates, p>() { // from class: com.forsale.app.ui.WebDialogFragment$initializeObservers$3

            /* compiled from: WebDialogFragment.kt */
            /* loaded from: classes3.dex */
            public /* synthetic */ class a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f37852a;

                static {
                    int[] iArr = new int[ViewStates.values().length];
                    try {
                        iArr[ViewStates.CONTENT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ViewStates.LOADING.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ViewStates.ERROR.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ViewStates.CONNECTION_ERROR.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ViewStates.Empty.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f37852a = iArr;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(ViewStates viewStates) {
                int i11;
                int i12;
                int i13;
                int i14;
                if (viewStates != null) {
                    WebDialogFragment webDialogFragment = WebDialogFragment.this;
                    int i15 = a.f37852a[viewStates.ordinal()];
                    ya yaVar = null;
                    if (i15 == 1) {
                        ya yaVar2 = webDialogFragment.B;
                        if (yaVar2 == null) {
                            o.w("binding");
                        } else {
                            yaVar = yaVar2;
                        }
                        yaVar.P.d();
                    } else if (i15 == 2) {
                        ya yaVar3 = webDialogFragment.B;
                        if (yaVar3 == null) {
                            o.w("binding");
                        } else {
                            yaVar = yaVar3;
                        }
                        StatefulLayout statefulLayout = yaVar.P;
                        i11 = webDialogFragment.f37842x;
                        statefulLayout.b(i11, webDialogFragment);
                    } else if (i15 == 3) {
                        ya yaVar4 = webDialogFragment.B;
                        if (yaVar4 == null) {
                            o.w("binding");
                        } else {
                            yaVar = yaVar4;
                        }
                        StatefulLayout statefulLayout2 = yaVar.P;
                        i12 = webDialogFragment.f37843y;
                        statefulLayout2.b(i12, webDialogFragment);
                    } else if (i15 == 4) {
                        ya yaVar5 = webDialogFragment.B;
                        if (yaVar5 == null) {
                            o.w("binding");
                        } else {
                            yaVar = yaVar5;
                        }
                        StatefulLayout statefulLayout3 = yaVar.P;
                        i13 = webDialogFragment.f37844z;
                        statefulLayout3.b(i13, webDialogFragment);
                    } else if (i15 == 5) {
                        ya yaVar6 = webDialogFragment.B;
                        if (yaVar6 == null) {
                            o.w("binding");
                        } else {
                            yaVar = yaVar6;
                        }
                        StatefulLayout statefulLayout4 = yaVar.P;
                        i14 = webDialogFragment.A;
                        statefulLayout4.b(i14, webDialogFragment);
                    }
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(ViewStates viewStates) {
                b(viewStates);
                return p.f75480a;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.forsale.app.ui.c z() {
        return (com.forsale.app.ui.c) this.f37841j.getValue();
    }

    public final WebModel A() {
        return (WebModel) this.f37837f.getValue();
    }

    public final boolean D() {
        return ((Boolean) this.f37838g.getValue()).booleanValue();
    }

    public final void E(g00.a<p> aVar) {
        this.f37839h = aVar;
    }

    @Override // androidx.fragment.app.j
    public int getTheme() {
        if (D()) {
            return z0.f70798h;
        }
        return z0.f70797g;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        ViewDataBinding h11 = g.h(inflater, t9.t0.f70262n2, viewGroup, false);
        o.h(h11, "inflate(...)");
        ya yaVar = (ya) h11;
        this.B = yaVar;
        ya yaVar2 = null;
        if (yaVar == null) {
            o.w("binding");
            yaVar = null;
        }
        View root = yaVar.getRoot();
        ya yaVar3 = this.B;
        if (yaVar3 == null) {
            o.w("binding");
        } else {
            yaVar2 = yaVar3;
        }
        yaVar2.f0(z());
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ya yaVar = this.B;
        if (yaVar == null) {
            o.w("binding");
            yaVar = null;
        }
        yaVar.R.stopLoading();
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        o.i(dialog, "dialog");
        super.onDismiss(dialog);
        g00.a<p> aVar = this.f37839h;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @v9.a(viewId = {ActionViewsMode.ERROR_RELOAD, ActionViewsMode.ERROR_REFRESH, ActionViewsMode.MAINTENANCE_RELOAD})
    public final void onError(View view) {
        o.i(view, "view");
        B();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CrashlyticsUtilsKt.b("WebDialogFragment", null, 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        B();
        C();
    }

    @Override // v9.c
    public void setStateViewsActions(View view) {
        c.a.c(this, view);
    }

    public final c.a y() {
        c.a aVar = this.f37840i;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }
}
