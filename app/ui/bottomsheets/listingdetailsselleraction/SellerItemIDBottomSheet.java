package com.forsale.app.ui.bottomsheets.listingdetailsselleraction;

import aa.i3;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import com.forsale.app.ui.bottomsheets.listingdetailsselleraction.d;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import g00.l;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import t9.t0;
import t9.z0;
import wz.h;
import wz.p;
/* compiled from: SellerItemIDBottomSheet.kt */
/* loaded from: classes3.dex */
public final class SellerItemIDBottomSheet extends vg.c<i3, com.forsale.app.ui.bottomsheets.listingdetailsselleraction.d> {
    public static final a C = new a(null);
    public static final int D = 8;
    private final h A;
    private boolean B;

    /* renamed from: j  reason: collision with root package name */
    private final String f38531j;

    /* renamed from: x  reason: collision with root package name */
    private final l<Boolean, p> f38532x;

    /* renamed from: y  reason: collision with root package name */
    private final int f38533y;

    /* renamed from: z  reason: collision with root package name */
    public d.a f38534z;

    /* compiled from: SellerItemIDBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(String itemId, FragmentManager fragmentManager, l<? super Boolean, p> onDismissDialog) {
            o.i(itemId, "itemId");
            o.i(fragmentManager, "fragmentManager");
            o.i(onDismissDialog, "onDismissDialog");
            new SellerItemIDBottomSheet(itemId, onDismissDialog).show(fragmentManager, "SellerItemIDBottomSheet");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SellerItemIDBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class b implements FlowCollector<p> {
        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            SellerItemIDBottomSheet.this.dismiss();
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SellerItemIDBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class c implements FlowCollector<String> {
        c() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(String str, zz.a<? super p> aVar) {
            if (str != null) {
                SellerItemIDBottomSheet.this.E(str);
                SellerItemIDBottomSheet.this.t().z0().postValue(kotlin.coroutines.jvm.internal.a.a(true));
            }
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SellerItemIDBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class d implements c0<Boolean> {
        d() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            SellerItemIDBottomSheet.this.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SellerItemIDBottomSheet(String itemId, l<? super Boolean, p> onDismissDialog) {
        h b11;
        o.i(itemId, "itemId");
        o.i(onDismissDialog, "onDismissDialog");
        this.f38531j = itemId;
        this.f38532x = onDismissDialog;
        this.f38533y = t0.f70232j0;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerItemIDBottomSheet$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes3.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ SellerItemIDBottomSheet f38537f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, SellerItemIDBottomSheet sellerItemIDBottomSheet) {
                    super(fragment, bundle);
                    this.f38537f = sellerItemIDBottomSheet;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    String str;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    d.a G = this.f38537f.G();
                    str = this.f38537f.f38531j;
                    d a11 = G.a(str);
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
        this.A = FragmentViewModelLazyKt.b(this, s.b(com.forsale.app.ui.bottomsheets.listingdetailsselleraction.d.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
        this.B = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(String str) {
        Object obj;
        Context context = getContext();
        if (context != null) {
            obj = context.getSystemService("clipboard");
        } else {
            obj = null;
        }
        o.g(obj, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) obj).setPrimaryClip(ClipData.newPlainText(str, str));
    }

    private final void I() {
        OneShotEventHandler<p> v02 = t().v0();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        v02.h(viewLifecycleOwner, new b());
        OneShotEventHandler<String> w02 = t().w0();
        androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        w02.h(viewLifecycleOwner2, new c());
        t().z0().observe(getViewLifecycleOwner(), new d());
    }

    public final d.a G() {
        d.a aVar = this.f38534z;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w9.b
    /* renamed from: H */
    public com.forsale.app.ui.bottomsheets.listingdetailsselleraction.d t() {
        return (com.forsale.app.ui.bottomsheets.listingdetailsselleraction.d) this.A.getValue();
    }

    @Override // w9.b, androidx.fragment.app.j
    public int getTheme() {
        return z0.f70801k;
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Boolean bool;
        o.i(dialog, "dialog");
        l<Boolean, p> lVar = this.f38532x;
        b0<Boolean> z02 = t().z0();
        if (z02 == null || (bool = z02.getValue()) == null) {
            bool = Boolean.FALSE;
        }
        lVar.invoke(bool);
        super.onDismiss(dialog);
    }

    @Override // w9.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        I();
    }

    @Override // w9.b
    protected int s() {
        return this.f38533y;
    }

    @Override // w9.b
    public boolean w() {
        return this.B;
    }
}
