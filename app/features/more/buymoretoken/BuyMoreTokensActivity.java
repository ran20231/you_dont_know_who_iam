package com.forsale.app.features.more.buymoretoken;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.l;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import com.forsale.app.datalayer.network.entities.PaymentOptionEntity;
import g00.a;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import qd.d;
import t9.r0;
import t9.t0;
import w3.a;
import wz.h;
import wz.p;
/* compiled from: BuyMoreTokensActivity.kt */
/* loaded from: classes2.dex */
public final class BuyMoreTokensActivity extends d<aa.c, BuyMoreTokenViewModel> {
    public static final a E = new a(null);
    public static final int F = 8;
    private final int A = t0.f70175b;
    private final h B;
    private final h C;
    private final h D;

    /* compiled from: BuyMoreTokensActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context) {
            o.i(context, "<this>");
            context.startActivity(new Intent(context, BuyMoreTokensActivity.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyMoreTokensActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b implements FlowCollector<PaymentOptionEntity> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f31718a = new b();

        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(PaymentOptionEntity paymentOptionEntity, zz.a<? super p> aVar) {
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyMoreTokensActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c implements FlowCollector<List<? extends PaymentOptionEntity>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f31719a = new c();

        c() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(List<PaymentOptionEntity> list, zz.a<? super p> aVar) {
            return p.f75480a;
        }
    }

    public BuyMoreTokensActivity() {
        h a11;
        h a12;
        final h b11;
        a11 = kotlin.d.a(new g00.a<NavHostFragment>() { // from class: com.forsale.app.features.more.buymoretoken.BuyMoreTokensActivity$navHost$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final NavHostFragment invoke() {
                Fragment k02 = BuyMoreTokensActivity.this.getChildFragmentManager().k0(r0.Y5);
                o.g(k02, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
                return (NavHostFragment) k02;
            }
        });
        this.B = a11;
        a12 = kotlin.d.a(new g00.a<NavController>() { // from class: com.forsale.app.features.more.buymoretoken.BuyMoreTokensActivity$navController$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final NavController invoke() {
                NavHostFragment I;
                I = BuyMoreTokensActivity.this.I();
                return I.q();
            }
        });
        this.C = a12;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.features.more.buymoretoken.BuyMoreTokensActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.features.more.buymoretoken.BuyMoreTokensActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) a.this.invoke();
            }
        });
        this.D = FragmentViewModelLazyKt.b(this, s.b(BuyMoreTokenViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.more.buymoretoken.BuyMoreTokensActivity$special$$inlined$viewModels$default$3
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.more.buymoretoken.BuyMoreTokensActivity$special$$inlined$viewModels$default$4
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.more.buymoretoken.BuyMoreTokensActivity$special$$inlined$viewModels$default$5
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

    /* JADX INFO: Access modifiers changed from: private */
    public final NavHostFragment I() {
        return (NavHostFragment) this.B.getValue();
    }

    private final void K() {
        B().x0().h(this, b.f31718a);
        B().y0().h(this, c.f31719a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: J */
    public BuyMoreTokenViewModel B() {
        return (BuyMoreTokenViewModel) this.D.getValue();
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return this.A;
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        K();
    }
}
