package com.forsale.app.ui.bottomsheets.mediarequester;

import aa.q3;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.l;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.forsale.app.base.viewmodels.BaseViewModelInjected;
import fh.b;
import fh.c;
import g00.a;
import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import t9.t0;
import t9.z0;
import w3.a;
import wz.h;
import wz.p;
/* compiled from: MediaRequesterBottomSheet.kt */
/* loaded from: classes3.dex */
public final class MediaRequesterBottomSheet extends fh.a<q3, BaseViewModelInjected> {
    public static final a A = new a(null);
    public static final int B = 8;

    /* renamed from: j */
    private final g00.a<p> f38938j;

    /* renamed from: x */
    private final g00.a<p> f38939x;

    /* renamed from: y */
    private final int f38940y;

    /* renamed from: z */
    private final h f38941z;

    /* compiled from: MediaRequesterBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(FragmentManager fragmentManager, g00.a<p> requestAction, g00.a<p> continueAction) {
            o.i(fragmentManager, "<this>");
            o.i(requestAction, "requestAction");
            o.i(continueAction, "continueAction");
            new MediaRequesterBottomSheet(requestAction, continueAction).show(fragmentManager, (String) null);
        }
    }

    public MediaRequesterBottomSheet(g00.a<p> requestAction, g00.a<p> continueAction) {
        final h b11;
        o.i(requestAction, "requestAction");
        o.i(continueAction, "continueAction");
        this.f38938j = requestAction;
        this.f38939x = continueAction;
        this.f38940y = t0.f70260n0;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.ui.bottomsheets.mediarequester.MediaRequesterBottomSheet$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.ui.bottomsheets.mediarequester.MediaRequesterBottomSheet$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) a.this.invoke();
            }
        });
        this.f38941z = FragmentViewModelLazyKt.b(this, s.b(BaseViewModelInjected.class), new g00.a<w0>() { // from class: com.forsale.app.ui.bottomsheets.mediarequester.MediaRequesterBottomSheet$special$$inlined$viewModels$default$3
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.ui.bottomsheets.mediarequester.MediaRequesterBottomSheet$special$$inlined$viewModels$default$4
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.mediarequester.MediaRequesterBottomSheet$special$$inlined$viewModels$default$5
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

    public static final void G(MediaRequesterBottomSheet this$0, View view) {
        o.i(this$0, "this$0");
        this$0.dismiss();
        this$0.f38938j.invoke();
    }

    public static final void H(MediaRequesterBottomSheet this$0, View view) {
        o.i(this$0, "this$0");
        this$0.dismiss();
        this$0.f38939x.invoke();
    }

    @Override // w9.b
    /* renamed from: E */
    public BaseViewModelInjected t() {
        return (BaseViewModelInjected) this.f38941z.getValue();
    }

    @Override // w9.b, androidx.fragment.app.j
    public int getTheme() {
        return z0.f70801k;
    }

    @Override // w9.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        q3 q3Var = (q3) r();
        q3Var.P.setOnClickListener(new b(this));
        q3Var.O.setOnClickListener(new c(this));
    }

    @Override // w9.b
    protected int s() {
        return this.f38940y;
    }
}
