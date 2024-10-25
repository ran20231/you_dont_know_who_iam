package com.forsale.app.ui.bottomsheets.gamActionBottomSheet.gamActionOptionsBottomSheet;

import aa.qb;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import com.forsale.app.ui.bottomsheets.gamActionBottomSheet.GamActionTypes;
import com.forsale.app.ui.bottomsheets.gamActionBottomSheet.gamActionOptionsBottomSheet.b;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowCollector;
import kr.m;
import kr.n;
import lg.c;
import lg.d;
import t9.z0;
import wz.h;
import wz.p;
/* compiled from: MultipleOptionsBottomSheet.kt */
/* loaded from: classes3.dex */
public final class MultipleOptionsBottomSheet extends lg.a<qb, com.forsale.app.ui.bottomsheets.gamActionBottomSheet.gamActionOptionsBottomSheet.b> {
    public static final a D = new a(null);
    public static final int E = 8;
    private final h A;
    private final int B;
    private final h C;

    /* renamed from: j  reason: collision with root package name */
    private final GamActionTypes f38109j;

    /* renamed from: x  reason: collision with root package name */
    private final List<String> f38110x;

    /* renamed from: y  reason: collision with root package name */
    private final OneShotEventHandler<Boolean> f38111y;

    /* renamed from: z  reason: collision with root package name */
    public b.a f38112z;

    /* compiled from: MultipleOptionsBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(List<String> values, GamActionTypes type, FragmentManager fragmentManager, OneShotEventHandler<Boolean> oneShotEventHandler) {
            o.i(values, "values");
            o.i(type, "type");
            o.i(fragmentManager, "fragmentManager");
            if (oneShotEventHandler != null) {
                oneShotEventHandler.i(Boolean.TRUE);
            }
            new MultipleOptionsBottomSheet(type, values, oneShotEventHandler, null).show(fragmentManager, "CALLER_GAM");
        }
    }

    /* compiled from: MultipleOptionsBottomSheet.kt */
    /* loaded from: classes3.dex */
    static final class b implements FlowCollector<p> {
        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            MultipleOptionsBottomSheet.this.dismiss();
            return p.f75480a;
        }
    }

    public /* synthetic */ MultipleOptionsBottomSheet(GamActionTypes gamActionTypes, List list, OneShotEventHandler oneShotEventHandler, DefaultConstructorMarker defaultConstructorMarker) {
        this(gamActionTypes, list, oneShotEventHandler);
    }

    private final lr.a<m<?>> E() {
        return (lr.a) this.C.getValue();
    }

    public final b.a D() {
        b.a aVar = this.f38112z;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w9.b
    /* renamed from: G */
    public com.forsale.app.ui.bottomsheets.gamActionBottomSheet.gamActionOptionsBottomSheet.b t() {
        return (com.forsale.app.ui.bottomsheets.gamActionBottomSheet.gamActionOptionsBottomSheet.b) this.A.getValue();
    }

    @Override // w9.b, androidx.fragment.app.j
    public int getTheme() {
        return z0.f70803m;
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        o.i(dialog, "dialog");
        super.onDismiss(dialog);
        OneShotEventHandler<Boolean> oneShotEventHandler = this.f38111y;
        if (oneShotEventHandler != null) {
            oneShotEventHandler.i(Boolean.FALSE);
        }
    }

    @Override // w9.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int y11;
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        ((qb) r()).O.setAdapter(kr.b.f61943t.i(E()));
        lr.a<m<?>> E2 = E();
        List<String> list = this.f38110x;
        y11 = s.y(list, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (String str : list) {
            d dVar = new d(str, this.f38109j);
            androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
            o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            arrayList.add(new c(dVar, viewLifecycleOwner, t().v0()));
        }
        n.a.a(E2, arrayList, false, 2, null);
        OneShotEventHandler<p> v02 = t().v0();
        androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        v02.h(viewLifecycleOwner2, new b());
    }

    @Override // w9.b
    protected int s() {
        return this.B;
    }

    private MultipleOptionsBottomSheet(GamActionTypes gamActionTypes, List<String> list, OneShotEventHandler<Boolean> oneShotEventHandler) {
        h b11;
        h a11;
        this.f38109j = gamActionTypes;
        this.f38110x = list;
        this.f38111y = oneShotEventHandler;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.gamActionBottomSheet.gamActionOptionsBottomSheet.MultipleOptionsBottomSheet$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes3.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ MultipleOptionsBottomSheet f38115f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, MultipleOptionsBottomSheet multipleOptionsBottomSheet) {
                    super(fragment, bundle);
                    this.f38115f = multipleOptionsBottomSheet;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    GamActionTypes gamActionTypes;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    b.a D = this.f38115f.D();
                    gamActionTypes = this.f38115f.f38109j;
                    b a11 = D.a(gamActionTypes);
                    o.g(a11, "null cannot be cast to non-null type T of com.forsale.app.utils.ViewModelHiltExtensionKt.assistedViewModel.<no name provided>.invoke.<no name provided>.create");
                    return a11;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final t0.b invoke() {
                return new a(Fragment.this, Fragment.this.getArguments(), this);
            }
        };
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5(new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4(this)));
        this.A = FragmentViewModelLazyKt.b(this, kotlin.jvm.internal.s.b(com.forsale.app.ui.bottomsheets.gamActionBottomSheet.gamActionOptionsBottomSheet.b.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
        this.B = t9.t0.f70325w2;
        a11 = kotlin.d.a(new g00.a<lr.a<m<?>>>() { // from class: com.forsale.app.ui.bottomsheets.gamActionBottomSheet.gamActionOptionsBottomSheet.MultipleOptionsBottomSheet$itemsAdapter$2
            @Override // g00.a
            /* renamed from: b */
            public final lr.a<m<?>> invoke() {
                return new lr.a<>();
            }
        });
        this.C = a11;
    }
}
