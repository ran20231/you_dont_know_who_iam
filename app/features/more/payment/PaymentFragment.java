package com.forsale.app.features.more.payment;

import aa.q8;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.l;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.viewpager.widget.ViewPager;
import com.forsale.app.features.more.mytransactions.MyTransactionsFragment;
import com.google.android.material.tabs.TabLayout;
import de.b;
import de.e;
import g00.a;
import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import t9.t0;
import t9.y0;
import w3.a;
import wz.h;
import z3.i;
/* compiled from: PaymentFragment.kt */
/* loaded from: classes2.dex */
public final class PaymentFragment extends b<q8, PaymentsViewModel> {
    private final int A = t0.J1;
    private final h B;
    private final i C;
    private final h D;
    private final h E;

    public PaymentFragment() {
        final h b11;
        h a11;
        h a12;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.features.more.payment.PaymentFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.features.more.payment.PaymentFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) a.this.invoke();
            }
        });
        this.B = FragmentViewModelLazyKt.b(this, s.b(PaymentsViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.more.payment.PaymentFragment$special$$inlined$viewModels$default$3
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.more.payment.PaymentFragment$special$$inlined$viewModels$default$4
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.more.payment.PaymentFragment$special$$inlined$viewModels$default$5
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
        this.C = new i(s.b(e.class), new g00.a<Bundle>() { // from class: com.forsale.app.features.more.payment.PaymentFragment$special$$inlined$navArgs$1
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
        a11 = d.a(new g00.a<Integer>() { // from class: com.forsale.app.features.more.payment.PaymentFragment$initialTabIndex$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Integer invoke() {
                return Integer.valueOf(PaymentFragment.this.I().a());
            }
        });
        this.D = a11;
        a12 = d.a(new g00.a<de.a>() { // from class: com.forsale.app.features.more.payment.PaymentFragment$pagerAdapter$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final de.a invoke() {
                FragmentManager childFragmentManager = PaymentFragment.this.getChildFragmentManager();
                o.h(childFragmentManager, "getChildFragmentManager(...)");
                String string = PaymentFragment.this.getString(y0.f70388bb);
                o.h(string, "getString(...)");
                String string2 = PaymentFragment.this.getString(y0.Wa);
                o.h(string2, "getString(...)");
                return new de.a(childFragmentManager, new String[]{string, string2}, new PaymentHistoryFragment(), new MyTransactionsFragment());
            }
        });
        this.E = a12;
    }

    private final de.a J() {
        return (de.a) this.E.getValue();
    }

    private final void L() {
        ((q8) m()).O.setSaveEnabled(false);
        ((q8) m()).O.setAdapter(J());
        ((q8) m()).P.setupWithViewPager(((q8) m()).O);
        ((q8) m()).O.setCurrentItem(H());
        TabLayout.g B = ((q8) m()).P.B(H());
        if (B != null) {
            B.l();
        }
        ((q8) m()).O.d(new a());
    }

    public final int H() {
        return ((Number) this.D.getValue()).intValue();
    }

    public final e I() {
        return (e) this.C.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: K */
    public PaymentsViewModel B() {
        return (PaymentsViewModel) this.B.getValue();
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return this.A;
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        L();
        B().w0(H());
    }

    /* compiled from: PaymentFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements ViewPager.j {
        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i11) {
            PaymentFragment.this.B().w0(i11);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void M(int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void z(int i11, float f11, int i12) {
        }
    }
}
