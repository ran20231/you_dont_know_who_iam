package com.forsale.app.ui.dialogs.uploadProgress;

import aa.io;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Window;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.g;
import androidx.lifecycle.LifecycleCoroutineScope;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.StateFlow;
import t9.t0;
import vh.a;
/* compiled from: UploadProgressDialog.kt */
/* loaded from: classes3.dex */
public final class UploadProgressDialog extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private final LifecycleCoroutineScope f39326a;

    /* renamed from: b  reason: collision with root package name */
    private final StateFlow<Integer> f39327b;

    /* renamed from: c  reason: collision with root package name */
    public ViewDataBinding f39328c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadProgressDialog(Context context, LifecycleCoroutineScope lifecycleScope, StateFlow<Integer> progressFlow) {
        super(context);
        o.i(context, "context");
        o.i(lifecycleScope, "lifecycleScope");
        o.i(progressFlow, "progressFlow");
        this.f39326a = lifecycleScope;
        this.f39327b = progressFlow;
    }

    private final void d(a aVar) {
        BuildersKt__Builders_commonKt.launch$default(this.f39326a, null, null, new UploadProgressDialog$registerObservers$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(int i11) {
        String str;
        ViewDataBinding c11 = c();
        o.g(c11, "null cannot be cast to non-null type com.forsale.app.databinding.UploadProgressLayoutBinding");
        io ioVar = (io) c11;
        ioVar.P.o(i11, true);
        TextView textView = ioVar.Q;
        a f02 = ioVar.f0();
        if (f02 != null) {
            str = f02.a(i11);
        } else {
            str = null;
        }
        textView.setText(str);
    }

    public final ViewDataBinding c() {
        ViewDataBinding viewDataBinding = this.f39328c;
        if (viewDataBinding != null) {
            return viewDataBinding;
        }
        o.w("binding");
        return null;
    }

    public final void e(ViewDataBinding viewDataBinding) {
        o.i(viewDataBinding, "<set-?>");
        this.f39328c = viewDataBinding;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding h11 = g.h(LayoutInflater.from(getContext()), t0.Q5, null, false);
        o.h(h11, "inflate(...)");
        e(h11);
        ViewDataBinding c11 = c();
        o.g(c11, "null cannot be cast to non-null type com.forsale.app.databinding.UploadProgressLayoutBinding");
        ((io) c11).g0(new a());
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        ViewDataBinding c12 = c();
        o.g(c12, "null cannot be cast to non-null type com.forsale.app.databinding.UploadProgressLayoutBinding");
        a f02 = ((io) c12).f0();
        if (f02 != null) {
            o.f(f02);
            d(f02);
        }
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        setContentView(c().getRoot());
    }
}
