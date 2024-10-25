package com.forsale.app.ui.bottomsheets.wanteditems;

import aa.w1;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.fragment.app.w;
import androidx.lifecycle.l;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.forsale.app.utils.OneShotEventHandler;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import t9.z0;
import w3.a;
import wz.p;
/* compiled from: DeleteWantedItemBottomSheet.kt */
@SuppressLint({"ValidFragment"})
/* loaded from: classes3.dex */
public final class DeleteWantedItemBottomSheet extends k {

    /* renamed from: g  reason: collision with root package name */
    private final wz.h f39257g;

    /* renamed from: h  reason: collision with root package name */
    private w1 f39258h;

    /* compiled from: DeleteWantedItemBottomSheet.kt */
    /* loaded from: classes3.dex */
    static final class a implements FlowCollector<p> {
        a() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            w.b(DeleteWantedItemBottomSheet.this, "wanted Item changed", new Bundle());
            DeleteWantedItemBottomSheet.this.dismiss();
            return p.f75480a;
        }
    }

    public DeleteWantedItemBottomSheet() {
        final wz.h b11;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.ui.bottomsheets.wanteditems.DeleteWantedItemBottomSheet$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.ui.bottomsheets.wanteditems.DeleteWantedItemBottomSheet$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) g00.a.this.invoke();
            }
        });
        this.f39257g = FragmentViewModelLazyKt.b(this, s.b(DeleteWantedItemViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.ui.bottomsheets.wanteditems.DeleteWantedItemBottomSheet$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w0 invoke() {
                x0 c11;
                c11 = FragmentViewModelLazyKt.c(wz.h.this);
                return c11.getViewModelStore();
            }
        }, new g00.a<w3.a>() { // from class: com.forsale.app.ui.bottomsheets.wanteditems.DeleteWantedItemBottomSheet$special$$inlined$viewModels$default$4
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
                g00.a aVar3 = g00.a.this;
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.wanteditems.DeleteWantedItemBottomSheet$special$$inlined$viewModels$default$5
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

    @Override // androidx.fragment.app.j
    public int getTheme() {
        return z0.f70792b;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        w1 f02 = w1.f0(inflater, viewGroup, false);
        o.h(f02, "inflate(...)");
        this.f39258h = f02;
        w1 w1Var = null;
        if (f02 == null) {
            o.w("binding");
            f02 = null;
        }
        View root = f02.getRoot();
        w1 w1Var2 = this.f39258h;
        if (w1Var2 == null) {
            o.w("binding");
        } else {
            w1Var = w1Var2;
        }
        w1Var.h0(w());
        OneShotEventHandler<p> A0 = w().A0();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        A0.h(viewLifecycleOwner, new a());
        return root;
    }

    public final DeleteWantedItemViewModel w() {
        return (DeleteWantedItemViewModel) this.f39257g.getValue();
    }
}
