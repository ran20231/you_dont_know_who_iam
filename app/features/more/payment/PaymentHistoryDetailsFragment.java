package com.forsale.app.features.more.payment;

import aa.u8;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.l;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.forsale.app.datalayer.network.entities.PaymentHistoryEntity;
import com.forsale.app.features.maincontainer.MainContainerActivity;
import com.forsale.app.features.postad.PLFActivity;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.FragmentsExtensionsKt;
import com.forsale.app.utils.t;
import com.forsale.app.utils.u;
import de.c;
import de.m;
import g00.a;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import n00.k;
import t9.t0;
import t9.y0;
import w3.a;
import wz.h;
import wz.p;
import z3.i;
/* compiled from: PaymentHistoryDetailsFragment.kt */
/* loaded from: classes2.dex */
public final class PaymentHistoryDetailsFragment extends c<u8, PaymentHistoryDetailsViewModel> {
    private final int A = t0.L1;
    private final h B;
    private final i C;
    private final h D;
    private final t E;
    static final /* synthetic */ k<Object>[] G = {s.g(new PropertyReference1Impl(PaymentHistoryDetailsFragment.class, "writePermission", "getWritePermission()Lcom/forsale/app/utils/PermissionsManager;", 0))};
    public static final a F = new a(null);
    public static final int H = 8;

    /* compiled from: PaymentHistoryDetailsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PaymentHistoryDetailsFragment() {
        final h b11;
        h a11;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.features.more.payment.PaymentHistoryDetailsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.features.more.payment.PaymentHistoryDetailsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) a.this.invoke();
            }
        });
        this.B = FragmentViewModelLazyKt.b(this, s.b(PaymentHistoryDetailsViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.more.payment.PaymentHistoryDetailsFragment$special$$inlined$viewModels$default$3
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.more.payment.PaymentHistoryDetailsFragment$special$$inlined$viewModels$default$4
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.more.payment.PaymentHistoryDetailsFragment$special$$inlined$viewModels$default$5
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
        this.C = new i(s.b(m.class), new g00.a<Bundle>() { // from class: com.forsale.app.features.more.payment.PaymentHistoryDetailsFragment$special$$inlined$navArgs$1
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
        a11 = d.a(new g00.a<PaymentHistoryEntity.PaymentRecord>() { // from class: com.forsale.app.features.more.payment.PaymentHistoryDetailsFragment$paymentRecord$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final PaymentHistoryEntity.PaymentRecord invoke() {
                return PaymentHistoryDetailsFragment.this.J().a();
            }
        });
        this.D = a11;
        this.E = t.f40536d.a(78, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    private final Bitmap I(View view) {
        p pVar;
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        o.h(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        Drawable background = view.getBackground();
        if (background != null) {
            o.f(background);
            view.getBackground().draw(canvas);
            pVar = p.f75480a;
        } else {
            pVar = null;
        }
        if (pVar == null) {
            canvas.drawColor(-1);
        }
        view.draw(canvas);
        return createBitmap;
    }

    private final PaymentHistoryEntity.PaymentRecord K() {
        return (PaymentHistoryEntity.PaymentRecord) this.D.getValue();
    }

    private final u M() {
        return this.E.a(this, G[0]);
    }

    private final void O() {
        S();
        ((u8) m()).O.setOnClickListener(new de.l(this));
    }

    public static final void Q(PaymentHistoryDetailsFragment this$0, View view) {
        o.i(this$0, "this$0");
        ConstraintLayout container = ((u8) this$0.m()).P;
        o.h(container, "container");
        this$0.T(container);
    }

    private final void S() {
        PaymentHistoryEntity.PaymentRecord K = K();
        if (K != null) {
            B().x0().setValue(K);
        }
    }

    @SuppressLint({"MissingPermission"})
    private final void T(View view) {
        final Bitmap I = I(view);
        u.g(M(), null, new g00.a<p>() { // from class: com.forsale.app.features.more.payment.PaymentHistoryDetailsFragment$shareReceipt$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Context requireContext = PaymentHistoryDetailsFragment.this.requireContext();
                o.h(requireContext, "requireContext(...)");
                String string = PaymentHistoryDetailsFragment.this.getString(y0.f70371ab);
                o.h(string, "getString(...)");
                ContextExtensionsKt.N(requireContext, string, I);
            }
        }, 1, null);
    }

    public final m J() {
        return (m) this.C.getValue();
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: L */
    public PaymentHistoryDetailsViewModel B() {
        return (PaymentHistoryDetailsViewModel) this.B.getValue();
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return this.A;
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i11, String[] permissions, int[] grantResults) {
        o.i(permissions, "permissions");
        o.i(grantResults, "grantResults");
        super.onRequestPermissionsResult(i11, permissions, grantResults);
        M().d(i11, permissions, grantResults, new g00.l<List<? extends String>, p>() { // from class: com.forsale.app.features.more.payment.PaymentHistoryDetailsFragment$onRequestPermissionsResult$1
            public final void b(List<String> it2) {
                o.i(it2, "it");
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(List<? extends String> list) {
                b(list);
                return p.f75480a;
            }
        });
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        MainContainerActivity mainContainerActivity;
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        androidx.appcompat.app.d b11 = FragmentsExtensionsKt.b(this);
        PLFActivity pLFActivity = null;
        if (b11 instanceof MainContainerActivity) {
            mainContainerActivity = (MainContainerActivity) b11;
        } else {
            mainContainerActivity = null;
        }
        if (mainContainerActivity != null) {
            Toolbar toolbar = ((u8) m()).S;
            o.h(toolbar, "toolbar");
            mainContainerActivity.Z1(toolbar);
        }
        androidx.appcompat.app.d b12 = FragmentsExtensionsKt.b(this);
        if (b12 instanceof PLFActivity) {
            pLFActivity = (PLFActivity) b12;
        }
        if (pLFActivity != null) {
            ((u8) m()).S.setVisibility(8);
        }
        O();
        B().B0();
    }
}
