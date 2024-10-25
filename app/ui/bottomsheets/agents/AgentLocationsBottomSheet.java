package com.forsale.app.ui.bottomsheets.agents;

import aa.u0;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.t;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import g00.l;
import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import t9.y0;
import t9.z0;
import w3.a;
import wz.h;
import wz.p;
/* compiled from: AgentLocationsBottomSheet.kt */
@SuppressLint({"ValidFragment"})
/* loaded from: classes3.dex */
public final class AgentLocationsBottomSheet extends c {

    /* renamed from: x */
    public static final a f37898x = new a(null);

    /* renamed from: y */
    public static final int f37899y = 8;

    /* renamed from: g */
    private int f37900g;

    /* renamed from: h */
    private final l<Integer, p> f37901h;

    /* renamed from: i */
    private u0 f37902i;

    /* renamed from: j */
    private final h f37903j;

    /* compiled from: AgentLocationsBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AgentLocationsBottomSheet(int i11, l<? super Integer, p> onLocationSelected) {
        final h b11;
        o.i(onLocationSelected, "onLocationSelected");
        this.f37900g = i11;
        this.f37901h = onLocationSelected;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.ui.bottomsheets.agents.AgentLocationsBottomSheet$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.ui.bottomsheets.agents.AgentLocationsBottomSheet$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) g00.a.this.invoke();
            }
        });
        this.f37903j = FragmentViewModelLazyKt.b(this, s.b(AgentLocationsViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.ui.bottomsheets.agents.AgentLocationsBottomSheet$special$$inlined$viewModels$default$3
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.ui.bottomsheets.agents.AgentLocationsBottomSheet$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w3.a invoke() {
                x0 c11;
                androidx.lifecycle.l lVar;
                w3.a aVar2;
                g00.a aVar3 = g00.a.this;
                if (aVar3 == null || (aVar2 = (w3.a) aVar3.invoke()) == null) {
                    c11 = FragmentViewModelLazyKt.c(b11);
                    if (c11 instanceof androidx.lifecycle.l) {
                        lVar = (androidx.lifecycle.l) c11;
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.agents.AgentLocationsBottomSheet$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final t0.b invoke() {
                x0 c11;
                androidx.lifecycle.l lVar;
                t0.b defaultViewModelProviderFactory;
                c11 = FragmentViewModelLazyKt.c(b11);
                if (c11 instanceof androidx.lifecycle.l) {
                    lVar = (androidx.lifecycle.l) c11;
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

    private final boolean A(int i11) {
        if (i11 != this.f37900g) {
            return true;
        }
        return false;
    }

    private final void D() {
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        String string = getString(y0.H4);
        o.h(string, "getString(...)");
        z(0, string, ref$IntRef.f61776a);
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(t.a(viewLifecycleOwner), null, null, new AgentLocationsBottomSheet$loadLocations$1(this, ref$IntRef, null), 3, null);
    }

    public static final void E(AgentLocationsBottomSheet this$0, RadioGroup radioGroup, int i11) {
        o.i(this$0, "this$0");
        boolean A = this$0.A(i11);
        this$0.G(i11);
        if (A) {
            this$0.dismiss();
        }
    }

    private final void G(int i11) {
        this.f37900g = i11;
        this.f37901h.invoke(Integer.valueOf(i11));
    }

    public final void z(int i11, String str, int i12) {
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
        u0 u0Var = this.f37902i;
        u0 u0Var2 = null;
        if (u0Var == null) {
            o.w("binding");
            u0Var = null;
        }
        RadioGroup radioGroup = u0Var.O;
        u0 u0Var3 = this.f37902i;
        if (u0Var3 == null) {
            o.w("binding");
        } else {
            u0Var2 = u0Var3;
        }
        RadioButton radioButton = new RadioButton(u0Var2.getRoot().getContext());
        radioButton.setText(str);
        radioButton.setId(i11);
        radioButton.setTextColor(-7829368);
        radioGroup.addView(radioButton, i12, layoutParams);
    }

    public final int B() {
        return this.f37900g;
    }

    public final AgentLocationsViewModel C() {
        return (AgentLocationsViewModel) this.f37903j.getValue();
    }

    @Override // androidx.fragment.app.j
    public int getTheme() {
        return z0.f70792b;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        u0 f02 = u0.f0(inflater, viewGroup, false);
        o.h(f02, "inflate(...)");
        this.f37902i = f02;
        u0 u0Var = null;
        if (f02 == null) {
            o.w("binding");
            f02 = null;
        }
        View root = f02.getRoot();
        u0 u0Var2 = this.f37902i;
        if (u0Var2 == null) {
            o.w("binding");
            u0Var2 = null;
        }
        u0Var2.h0(C());
        D();
        u0 u0Var3 = this.f37902i;
        if (u0Var3 == null) {
            o.w("binding");
        } else {
            u0Var = u0Var3;
        }
        u0Var.O.setOnCheckedChangeListener(new dg.b(this));
        return root;
    }
}
