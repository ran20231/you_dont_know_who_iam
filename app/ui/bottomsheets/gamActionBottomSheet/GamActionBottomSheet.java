package com.forsale.app.ui.bottomsheets.gamActionBottomSheet;

import aa.eb;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.l;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.forsale.app.utils.OneShotEventHandler;
import java.util.ArrayList;
import java.util.List;
import kg.c;
import kg.f;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.s;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowCollector;
import kr.m;
import kr.n;
import lr.a;
import t9.t0;
import t9.z0;
import w3.a;
import wz.h;
import wz.p;
/* compiled from: GamActionBottomSheet.kt */
/* loaded from: classes3.dex */
public final class GamActionBottomSheet extends f<eb, GamActionViewModel> {
    public static final a B = new a(null);
    public static final int C = 8;
    private final h A;

    /* renamed from: j  reason: collision with root package name */
    private final List<c> f38090j;

    /* renamed from: x  reason: collision with root package name */
    private final OneShotEventHandler<Boolean> f38091x;

    /* renamed from: y  reason: collision with root package name */
    private final h f38092y;

    /* renamed from: z  reason: collision with root package name */
    private final int f38093z;

    /* compiled from: GamActionBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(List<c> list, OneShotEventHandler<Boolean> oneShotEventHandler, FragmentManager fragmentManager) {
            o.i(list, "list");
            o.i(fragmentManager, "fragmentManager");
            if (oneShotEventHandler != null) {
                oneShotEventHandler.i(Boolean.TRUE);
            }
            new GamActionBottomSheet(list, oneShotEventHandler, null).show(fragmentManager, "CALLER_GAM");
        }
    }

    /* compiled from: GamActionBottomSheet.kt */
    /* loaded from: classes3.dex */
    static final class b implements FlowCollector<p> {
        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            GamActionBottomSheet.this.dismiss();
            return p.f75480a;
        }
    }

    public /* synthetic */ GamActionBottomSheet(List list, OneShotEventHandler oneShotEventHandler, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, oneShotEventHandler);
    }

    private final lr.a<m<?>> C() {
        return (lr.a) this.f38092y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w9.b
    /* renamed from: D */
    public GamActionViewModel t() {
        return (GamActionViewModel) this.A.getValue();
    }

    @Override // w9.b, androidx.fragment.app.j
    public int getTheme() {
        return z0.f70803m;
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        o.i(dialog, "dialog");
        super.onDismiss(dialog);
        OneShotEventHandler<Boolean> oneShotEventHandler = this.f38091x;
        if (oneShotEventHandler != null) {
            oneShotEventHandler.i(Boolean.FALSE);
        }
    }

    @Override // w9.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int y11;
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        ((eb) r()).O.setAdapter(kr.b.f61943t.i(C()));
        lr.a<m<?>> C2 = C();
        List<c> list = this.f38090j;
        y11 = s.y(list, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (c cVar : list) {
            androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
            o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            arrayList.add(new kg.b(cVar, viewLifecycleOwner, t().v0(), this.f38091x));
        }
        n.a.a(C2, arrayList, false, 2, null);
        OneShotEventHandler<p> v02 = t().v0();
        androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        v02.h(viewLifecycleOwner2, new b());
    }

    @Override // w9.b
    protected int s() {
        return this.f38093z;
    }

    private GamActionBottomSheet(List<c> list, OneShotEventHandler<Boolean> oneShotEventHandler) {
        h a11;
        final h b11;
        this.f38090j = list;
        this.f38091x = oneShotEventHandler;
        a11 = d.a(new g00.a<lr.a<m<?>>>() { // from class: com.forsale.app.ui.bottomsheets.gamActionBottomSheet.GamActionBottomSheet$itemsAdapter$2
            @Override // g00.a
            /* renamed from: b */
            public final a<m<?>> invoke() {
                return new a<>();
            }
        });
        this.f38092y = a11;
        this.f38093z = t0.f70283q2;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.ui.bottomsheets.gamActionBottomSheet.GamActionBottomSheet$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.ui.bottomsheets.gamActionBottomSheet.GamActionBottomSheet$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) g00.a.this.invoke();
            }
        });
        this.A = FragmentViewModelLazyKt.b(this, kotlin.jvm.internal.s.b(GamActionViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.ui.bottomsheets.gamActionBottomSheet.GamActionBottomSheet$special$$inlined$viewModels$default$3
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.ui.bottomsheets.gamActionBottomSheet.GamActionBottomSheet$special$$inlined$viewModels$default$4
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.gamActionBottomSheet.GamActionBottomSheet$special$$inlined$viewModels$default$5
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
}
