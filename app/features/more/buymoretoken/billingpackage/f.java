package com.forsale.app.features.more.buymoretoken.billingpackage;

import aa.e1;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.app.c;
import androidx.fragment.app.Fragment;
import com.forsale.app.features.more.WebActivity;
import com.forsale.app.features.more.WebType;
import com.forsale.app.features.more.buymoretoken.billingpackage.f;
import com.forsale.app.utils.ContextExtensionsKt;
import java.util.List;
import kotlin.jvm.internal.o;
import kr.b;
import t9.r0;
import t9.t0;
import t9.y0;
/* compiled from: BillingPackageItem.kt */
/* loaded from: classes2.dex */
public final class f extends pr.a<a> {

    /* renamed from: f  reason: collision with root package name */
    private final g f31776f;

    /* renamed from: g  reason: collision with root package name */
    private final Fragment f31777g;

    /* renamed from: h  reason: collision with root package name */
    private final int f31778h;

    /* renamed from: i  reason: collision with root package name */
    private final int f31779i;

    public f(g viewModel, Fragment fragment) {
        o.i(viewModel, "viewModel");
        o.i(fragment, "fragment");
        this.f31776f = viewModel;
        this.f31777g = fragment;
        this.f31778h = r0.D7;
        this.f31779i = t0.G;
    }

    @Override // kr.m
    public int getType() {
        return this.f31778h;
    }

    @Override // pr.a
    public int t() {
        return this.f31779i;
    }

    @Override // pr.a
    /* renamed from: v */
    public a u(View v11) {
        o.i(v11, "v");
        e1 f02 = e1.f0(v11);
        o.h(f02, "bind(...)");
        return new a(f02, this.f31777g);
    }

    public final g w() {
        return this.f31776f;
    }

    /* compiled from: BillingPackageItem.kt */
    /* loaded from: classes2.dex */
    public static final class a extends b.c<f> {

        /* renamed from: a  reason: collision with root package name */
        private final e1 f31780a;

        /* renamed from: b  reason: collision with root package name */
        private final Fragment f31781b;

        /* renamed from: c  reason: collision with root package name */
        private final int f31782c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(aa.e1 r3, androidx.fragment.app.Fragment r4) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                java.lang.String r0 = "fragment"
                kotlin.jvm.internal.o.i(r4, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f31780a = r3
                r2.f31781b = r4
                r3 = 1
                r2.f31782c = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.buymoretoken.billingpackage.f.a.<init>(aa.e1, androidx.fragment.app.Fragment):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(f item, a this$0, View view) {
            o.i(item, "$item");
            o.i(this$0, "this$0");
            item.w().h();
            o.f(view);
            this$0.i(view, item.w());
        }

        private final void i(View view, g gVar) {
            Context context = view.getContext();
            if (context != null) {
                gVar.g();
                int f11 = gVar.f();
                if (f11 != 0) {
                    if (f11 == 1) {
                        String string = context.getString(y0.Va);
                        o.h(string, "getString(...)");
                        if (ContextExtensionsKt.f(context)) {
                            c.a aVar = new c.a(context);
                            aVar.o(y0.R4);
                            aVar.h(string);
                            aVar.m(context.getString(y0.Z4), new DialogInterface$OnClickListenerC0349a());
                            aVar.d(false);
                            aVar.q();
                            return;
                        }
                        return;
                    }
                    return;
                }
                WebActivity.a aVar2 = WebActivity.I;
                Fragment fragment = this.f31781b;
                WebType webType = WebType.PAYMENT;
                String string2 = context.getString(y0.Sa);
                o.h(string2, "getString(...)");
                aVar2.e(fragment, webType, string2, gVar.e(), this.f31782c, 50);
            }
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void b(final f item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            e1 e1Var = this.f31780a;
            e1Var.h0(item.w());
            e1Var.u();
            this.f31780a.O.setOnClickListener(new View.OnClickListener() { // from class: com.forsale.app.features.more.buymoretoken.billingpackage.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f.a.h(f.this, this, view);
                }
            });
        }

        @Override // kr.b.c
        /* renamed from: j */
        public void e(f item) {
            o.i(item, "item");
        }

        /* compiled from: ViewsExtensions.kt */
        /* renamed from: com.forsale.app.features.more.buymoretoken.billingpackage.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class DialogInterface$OnClickListenerC0349a implements DialogInterface.OnClickListener {
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
            }
        }
    }
}
