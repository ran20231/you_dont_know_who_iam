package com.forsale.app.ui.bottomsheets.listingdetailsselleraction;

import aa.e3;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.SellerActionType;
import com.forsale.app.ui.bottomsheets.listingdetailsselleraction.b;
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
/* compiled from: SellerActionResultBottomSheet.kt */
/* loaded from: classes3.dex */
public final class SellerActionResultBottomSheet extends vg.b<e3, com.forsale.app.ui.bottomsheets.listingdetailsselleraction.b> {
    public static final a G = new a(null);
    public static final int H = 8;
    private final l<Boolean, p> A;
    private final boolean B;
    private final int C;
    public b.a D;
    private final h E;
    private boolean F;

    /* renamed from: j  reason: collision with root package name */
    private final SellerActionType f38518j;

    /* renamed from: x  reason: collision with root package name */
    private final boolean f38519x;

    /* renamed from: y  reason: collision with root package name */
    private final boolean f38520y;

    /* renamed from: z  reason: collision with root package name */
    private final String f38521z;

    /* compiled from: SellerActionResultBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void b(a aVar, SellerActionType sellerActionType, boolean z11, boolean z12, String str, FragmentManager fragmentManager, boolean z13, l lVar, int i11, Object obj) {
            String str2;
            boolean z14;
            if ((i11 & 8) != 0) {
                str2 = null;
            } else {
                str2 = str;
            }
            if ((i11 & 32) != 0) {
                z14 = false;
            } else {
                z14 = z13;
            }
            aVar.a(sellerActionType, z11, z12, str2, fragmentManager, z14, lVar);
        }

        public final void a(SellerActionType sellerActionType, boolean z11, boolean z12, String str, FragmentManager fragmentManager, boolean z13, l<? super Boolean, p> onDismissDialog) {
            o.i(sellerActionType, "sellerActionType");
            o.i(fragmentManager, "fragmentManager");
            o.i(onDismissDialog, "onDismissDialog");
            new SellerActionResultBottomSheet(sellerActionType, z11, z12, str, onDismissDialog, z13).show(fragmentManager, "SellerActionBottomSheet");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SellerActionResultBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class b implements FlowCollector<p> {
        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            SellerActionResultBottomSheet.this.dismiss();
            return p.f75480a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SellerActionResultBottomSheet(SellerActionType sellerActionType, boolean z11, boolean z12, String str, l<? super Boolean, p> onDismissDialog, boolean z13) {
        h b11;
        o.i(sellerActionType, "sellerActionType");
        o.i(onDismissDialog, "onDismissDialog");
        this.f38518j = sellerActionType;
        this.f38519x = z11;
        this.f38520y = z12;
        this.f38521z = str;
        this.A = onDismissDialog;
        this.B = z13;
        this.C = t0.f70218h0;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsselleraction.SellerActionResultBottomSheet$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes3.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ SellerActionResultBottomSheet f38524f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, SellerActionResultBottomSheet sellerActionResultBottomSheet) {
                    super(fragment, bundle);
                    this.f38524f = sellerActionResultBottomSheet;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    SellerActionType sellerActionType;
                    boolean z11;
                    boolean z12;
                    String str;
                    boolean z13;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    b.a I = this.f38524f.I();
                    sellerActionType = this.f38524f.f38518j;
                    z11 = this.f38524f.f38519x;
                    z12 = this.f38524f.f38520y;
                    str = this.f38524f.f38521z;
                    z13 = this.f38524f.B;
                    b a11 = I.a(sellerActionType, z11, z12, str, Boolean.valueOf(z13));
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
        this.E = FragmentViewModelLazyKt.b(this, s.b(com.forsale.app.ui.bottomsheets.listingdetailsselleraction.b.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
        this.F = true;
    }

    private final void K() {
        OneShotEventHandler<p> C0 = t().C0();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C0.h(viewLifecycleOwner, new b());
    }

    public final b.a I() {
        b.a aVar = this.D;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w9.b
    /* renamed from: J */
    public com.forsale.app.ui.bottomsheets.listingdetailsselleraction.b t() {
        return (com.forsale.app.ui.bottomsheets.listingdetailsselleraction.b) this.E.getValue();
    }

    @Override // w9.b, androidx.fragment.app.j
    public int getTheme() {
        return z0.f70801k;
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        o.i(dialog, "dialog");
        this.A.invoke(Boolean.valueOf(this.f38520y));
        super.onDismiss(dialog);
    }

    @Override // w9.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        K();
    }

    @Override // w9.b
    protected int s() {
        return this.C;
    }

    @Override // w9.b
    public boolean w() {
        return this.F;
    }
}
