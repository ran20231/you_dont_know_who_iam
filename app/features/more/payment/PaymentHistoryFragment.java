package com.forsale.app.features.more.payment;

import aa.s8;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.l;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.forsale.app.base.ActionViewsMode;
import de.d;
import g00.a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import t9.q0;
import w3.a;
import wz.h;
/* compiled from: PaymentHistoryFragment.kt */
/* loaded from: classes2.dex */
public final class PaymentHistoryFragment extends d<s8, PaymentHistoryViewModel> {
    private final h E;
    private final int F;
    private final h G;
    private final int H;

    public PaymentHistoryFragment() {
        final h b11;
        h a11;
        final a<Fragment> aVar = new a<Fragment>() { // from class: com.forsale.app.features.more.payment.PaymentHistoryFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new a<x0>() { // from class: com.forsale.app.features.more.payment.PaymentHistoryFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) a.this.invoke();
            }
        });
        this.E = FragmentViewModelLazyKt.b(this, s.b(PaymentHistoryViewModel.class), new a<w0>() { // from class: com.forsale.app.features.more.payment.PaymentHistoryFragment$special$$inlined$viewModels$default$3
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
        }, new a<w3.a>() { // from class: com.forsale.app.features.more.payment.PaymentHistoryFragment$special$$inlined$viewModels$default$4
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.more.payment.PaymentHistoryFragment$special$$inlined$viewModels$default$5
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
        this.F = t9.t0.K1;
        a11 = kotlin.d.a(new g00.a<de.h>() { // from class: com.forsale.app.features.more.payment.PaymentHistoryFragment$paymentAdapter$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final de.h invoke() {
                return new de.h(PaymentHistoryFragment.this.B());
            }
        });
        this.G = a11;
        this.H = t9.t0.U3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final de.h S() {
        return (de.h) this.G.getValue();
    }

    private final void V() {
        Y();
        X();
    }

    private final void X() {
        BuildersKt__Builders_commonKt.launch$default(B(), null, null, new PaymentHistoryFragment$loadData$1(this, null), 3, null);
    }

    private final void Y() {
        RecyclerView recyclerView = ((s8) m()).O;
        Context context = recyclerView.getContext();
        if (context != null) {
            o.f(context);
            i iVar = new i(context, 1);
            Drawable drawable = b.getDrawable(context, q0.M);
            if (drawable != null) {
                iVar.f(drawable);
            }
            recyclerView.setAdapter(S());
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            recyclerView.j(iVar);
        }
    }

    @Override // com.forsale.app.base.fragments.b
    protected int G() {
        return this.H;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: T */
    public PaymentHistoryViewModel B() {
        return (PaymentHistoryViewModel) this.E.getValue();
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return this.F;
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ((s8) m()).O.setAdapter(null);
        super.onDestroyView();
    }

    @v9.a(viewId = {ActionViewsMode.ERROR_RELOAD, ActionViewsMode.ERROR_REFRESH, ActionViewsMode.MAINTENANCE_RELOAD})
    public final void onError(View view) {
        o.i(view, "view");
        X();
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        V();
    }
}
