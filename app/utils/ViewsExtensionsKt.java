package com.forsale.app.utils;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.c;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.forsale.app.base.ViewStates;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import kotlinx.coroutines.Job;
import t9.t0;
import t9.y0;
/* compiled from: ViewsExtensions.kt */
/* loaded from: classes3.dex */
public final class ViewsExtensionsKt {
    public static final androidx.lifecycle.r A(final NativeCustomFormatAd nativeCustomFormatAd, androidx.lifecycle.s lifecycleOwner) {
        kotlin.jvm.internal.o.i(nativeCustomFormatAd, "<this>");
        kotlin.jvm.internal.o.i(lifecycleOwner, "lifecycleOwner");
        androidx.lifecycle.r rVar = new androidx.lifecycle.r() { // from class: com.forsale.app.utils.ViewsExtensionsKt$observe$5
            @androidx.lifecycle.d0(Lifecycle.Event.ON_DESTROY)
            public final void onDestroyContainer() {
                NativeCustomFormatAd.this.destroy();
            }
        };
        lifecycleOwner.getLifecycle().a(rVar);
        return rVar;
    }

    public static final androidx.lifecycle.r B(final Snackbar snackbar, androidx.lifecycle.s lifecycleOwner) {
        kotlin.jvm.internal.o.i(snackbar, "<this>");
        kotlin.jvm.internal.o.i(lifecycleOwner, "lifecycleOwner");
        androidx.lifecycle.f fVar = new androidx.lifecycle.f() { // from class: com.forsale.app.utils.ViewsExtensionsKt$observe$3
            @Override // androidx.lifecycle.f
            public void t(androidx.lifecycle.s owner) {
                kotlin.jvm.internal.o.i(owner, "owner");
                super.t(owner);
                if (Snackbar.this.M()) {
                    Snackbar.this.y();
                }
            }

            @Override // androidx.lifecycle.f
            public void z(androidx.lifecycle.s owner) {
                kotlin.jvm.internal.o.i(owner, "owner");
                super.z(owner);
                if (Snackbar.this.M()) {
                    Snackbar.this.y();
                }
            }
        };
        lifecycleOwner.getLifecycle().a(fVar);
        return fVar;
    }

    public static final androidx.lifecycle.r C(final Job job, androidx.lifecycle.s lifecycleOwner) {
        kotlin.jvm.internal.o.i(job, "<this>");
        kotlin.jvm.internal.o.i(lifecycleOwner, "lifecycleOwner");
        androidx.lifecycle.r rVar = new androidx.lifecycle.r() { // from class: com.forsale.app.utils.ViewsExtensionsKt$observe$7
            @androidx.lifecycle.d0(Lifecycle.Event.ON_DESTROY)
            public final void onDestroyContainer() {
                Job.DefaultImpls.cancel$default(Job.this, null, 1, null);
            }
        };
        lifecycleOwner.getLifecycle().a(rVar);
        return rVar;
    }

    public static final void D(Context context, b dialogParameters) {
        kotlin.jvm.internal.o.i(context, "<this>");
        kotlin.jvm.internal.o.i(dialogParameters, "dialogParameters");
        if (ContextExtensionsKt.f(context)) {
            c.a aVar = new c.a(context);
            aVar.p(dialogParameters.f());
            aVar.h(dialogParameters.a());
            Integer e11 = dialogParameters.e();
            if (e11 != null) {
                e11.intValue();
                aVar.m(context.getString(dialogParameters.e().intValue()), new k0(dialogParameters));
            }
            Integer b11 = dialogParameters.b();
            if (b11 != null) {
                b11.intValue();
                aVar.j(context.getString(dialogParameters.b().intValue()), new l0(dialogParameters));
            }
            aVar.d(false);
            aVar.q();
        }
    }

    public static final void E(Context context, GenericDialogParameters dialogParameters) {
        kotlin.jvm.internal.o.i(context, "<this>");
        kotlin.jvm.internal.o.i(dialogParameters, "dialogParameters");
        if (ContextExtensionsKt.f(context)) {
            c.a aVar = new c.a(context);
            Integer f11 = dialogParameters.f();
            if (f11 != null) {
                aVar.p(context.getString(f11.intValue()));
            }
            aVar.h(context.getString(dialogParameters.a()));
            Integer e11 = dialogParameters.e();
            if (e11 != null) {
                aVar.m(context.getString(e11.intValue()), new m0(dialogParameters));
            }
            Integer b11 = dialogParameters.b();
            if (b11 != null) {
                aVar.j(context.getString(b11.intValue()), new n0(dialogParameters));
            }
            aVar.d(false);
            aVar.q();
        }
    }

    public static final void F(GenericDialogParameters dialogParameters, DialogInterface dialogInterface, int i11) {
        kotlin.jvm.internal.o.i(dialogParameters, "$dialogParameters");
        g00.l<DialogInterface, wz.p> c11 = dialogParameters.c();
        kotlin.jvm.internal.o.f(dialogInterface);
        c11.invoke(dialogInterface);
    }

    public static final void G(GenericDialogParameters dialogParameters, DialogInterface dialogInterface, int i11) {
        kotlin.jvm.internal.o.i(dialogParameters, "$dialogParameters");
        g00.l<DialogInterface, wz.p> d11 = dialogParameters.d();
        kotlin.jvm.internal.o.f(dialogInterface);
        d11.invoke(dialogInterface);
    }

    public static final void H(b dialogParameters, DialogInterface dialogInterface, int i11) {
        kotlin.jvm.internal.o.i(dialogParameters, "$dialogParameters");
        dialogParameters.d().invoke();
    }

    public static final void I(b dialogParameters, DialogInterface dialogInterface, int i11) {
        kotlin.jvm.internal.o.i(dialogParameters, "$dialogParameters");
        dialogParameters.c().invoke();
    }

    public static final void J(Fragment fragment, String message) {
        kotlin.jvm.internal.o.i(fragment, "<this>");
        kotlin.jvm.internal.o.i(message, "message");
        View inflate = LayoutInflater.from(fragment.getContext()).inflate(t0.R0, (ViewGroup) null, false);
        Toast toast = new Toast(fragment.getContext());
        toast.setGravity(49, 5, 5);
        toast.setDuration(0);
        ((TextView) inflate.findViewById(t9.r0.M9)).setText(message);
        toast.setView(inflate);
        toast.show();
    }

    public static final void K(Context context, String title, String message, g00.a<wz.p> onYes, g00.a<wz.p> onNo) {
        kotlin.jvm.internal.o.i(context, "<this>");
        kotlin.jvm.internal.o.i(title, "title");
        kotlin.jvm.internal.o.i(message, "message");
        kotlin.jvm.internal.o.i(onYes, "onYes");
        kotlin.jvm.internal.o.i(onNo, "onNo");
        if (ContextExtensionsKt.f(context)) {
            c.a aVar = new c.a(context);
            aVar.p(title);
            aVar.h(message);
            aVar.m(context.getString(y0.f70551l5), new g0(onYes));
            aVar.j(context.getString(y0.W4), new h0(onNo));
            aVar.d(false);
            aVar.q();
        }
    }

    public static final void L(g00.a onYes, DialogInterface dialogInterface, int i11) {
        kotlin.jvm.internal.o.i(onYes, "$onYes");
        onYes.invoke();
    }

    public static final void M(g00.a onNo, DialogInterface dialogInterface, int i11) {
        kotlin.jvm.internal.o.i(onNo, "$onNo");
        onNo.invoke();
    }

    public static final void N(View view, float f11) {
        kotlin.jvm.internal.o.i(view, "<this>");
        view.setClickable(false);
        new Handler(Looper.getMainLooper()).postDelayed(new o0(view), f11 * 1000);
    }

    public static /* synthetic */ void O(View view, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 1.5f;
        }
        N(view, f11);
    }

    public static final void P(View this_unClickable) {
        kotlin.jvm.internal.o.i(this_unClickable, "$this_unClickable");
        this_unClickable.setClickable(true);
        this_unClickable.setAlpha(1.0f);
    }

    public static final void k(TextInputEditText textInputEditText, g00.l<? super String, wz.p> afterTextChanged) {
        kotlin.jvm.internal.o.i(textInputEditText, "<this>");
        kotlin.jvm.internal.o.i(afterTextChanged, "afterTextChanged");
        textInputEditText.addTextChangedListener(new a(afterTextChanged));
    }

    public static final void l(Activity activity, int i11) {
        kotlin.jvm.internal.o.i(activity, "<this>");
        new Handler(Looper.getMainLooper()).postDelayed(new i0(activity), i11 * 1000);
    }

    public static final void m(Activity this_closeActivity) {
        kotlin.jvm.internal.o.i(this_closeActivity, "$this_closeActivity");
        this_closeActivity.finish();
    }

    public static final void n(Button button, int i11) {
        kotlin.jvm.internal.o.i(button, "<this>");
        button.setEnabled(false);
        button.setAlpha(0.3f);
        new Handler(Looper.getMainLooper()).postDelayed(new p0(button), i11 * 1000);
    }

    public static final void o(Button this_disableButton) {
        kotlin.jvm.internal.o.i(this_disableButton, "$this_disableButton");
        this_disableButton.setEnabled(true);
        this_disableButton.setAlpha(1.0f);
    }

    public static final void p(View view, float f11) {
        kotlin.jvm.internal.o.i(view, "<this>");
        view.setEnabled(false);
        view.setAlpha(0.3f);
        new Handler(Looper.getMainLooper()).postDelayed(new j0(view), f11 * 1000);
    }

    public static /* synthetic */ void q(View view, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = 1.5f;
        }
        p(view, f11);
    }

    public static final void r(View this_disableView) {
        kotlin.jvm.internal.o.i(this_disableView, "$this_disableView");
        this_disableView.setEnabled(true);
        this_disableView.setAlpha(1.0f);
    }

    public static final void s(View view, boolean z11) {
        kotlin.jvm.internal.o.i(view, "<this>");
        view.setEnabled(z11);
        if (z11) {
            view.setAlpha(1.0f);
        } else {
            view.setAlpha(0.3f);
        }
    }

    public static final void t(WebView webView, String str, String str2, androidx.lifecycle.b0<ViewStates> b0Var, boolean z11) {
        boolean z12;
        kotlin.jvm.internal.o.i(webView, "<this>");
        boolean z13 = false;
        if (str != null && str.length() != 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z12) {
            x(webView, str, z11);
            return;
        }
        if (str2 == null || str2.length() == 0) {
            z13 = true;
        }
        if (!z13 && b0Var != null) {
            y(webView, str2, b0Var);
        }
    }

    public static /* synthetic */ void u(WebView webView, String str, String str2, androidx.lifecycle.b0 b0Var, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            b0Var = null;
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        t(webView, str, str2, b0Var, z11);
    }

    public static final boolean v(String str) {
        boolean z11;
        if (str != null && str.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11 || !Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
            return false;
        }
        return true;
    }

    public static final boolean w(String str) {
        kotlin.jvm.internal.o.i(str, "<this>");
        int length = str.length();
        if (6 > length || length >= 11) {
            return false;
        }
        return true;
    }

    private static final void x(WebView webView, String str, boolean z11) {
        if (z11) {
            WebSettings settings = webView.getSettings();
            settings.setBuiltInZoomControls(true);
            settings.setSupportZoom(true);
        }
        webView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
    }

    private static final void y(WebView webView, String str, androidx.lifecycle.b0<ViewStates> b0Var) {
        b0Var.postValue(ViewStates.LOADING);
        webView.setScrollBarStyle(33554432);
        webView.setWebViewClient(new ld.a(b0Var));
        webView.setClickable(false);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setCacheMode(2);
        webView.loadUrl(str);
    }

    public static final androidx.lifecycle.r z(final AdManagerAdView adManagerAdView, androidx.lifecycle.s lifecycleOwner) {
        kotlin.jvm.internal.o.i(adManagerAdView, "<this>");
        kotlin.jvm.internal.o.i(lifecycleOwner, "lifecycleOwner");
        androidx.lifecycle.r rVar = new androidx.lifecycle.r() { // from class: com.forsale.app.utils.ViewsExtensionsKt$observe$1
            @androidx.lifecycle.d0(Lifecycle.Event.ON_DESTROY)
            public final void onDestroyContainer() {
                AdManagerAdView.this.destroy();
            }

            @androidx.lifecycle.d0(Lifecycle.Event.ON_PAUSE)
            public final void onPauseContainer() {
                AdManagerAdView.this.pause();
            }

            @androidx.lifecycle.d0(Lifecycle.Event.ON_RESUME)
            public final void onResumeContainer() {
                AdManagerAdView.this.resume();
            }
        };
        lifecycleOwner.getLifecycle().a(rVar);
        return rVar;
    }

    /* compiled from: ViewsExtensions.kt */
    /* loaded from: classes3.dex */
    public static final class a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ g00.l<String, wz.p> f39700a;

        /* JADX WARN: Multi-variable type inference failed */
        a(g00.l<? super String, wz.p> lVar) {
            this.f39700a = lVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.f39700a.invoke(String.valueOf(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }
}
