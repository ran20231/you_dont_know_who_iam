package com.forsale.app.ui.bottomsheets.movetootherapp;

import aa.s3;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingSourceApp;
import com.forsale.app.ui.bottomsheets.movetootherapp.b;
import com.forsale.app.utils.CrashlyticsUtilsKt;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import t9.t0;
import t9.z0;
import wz.h;
import wz.p;
/* compiled from: MoveToOtherAppBottomSheet.kt */
/* loaded from: classes3.dex */
public final class MoveToOtherAppBottomSheet extends gh.a<s3, com.forsale.app.ui.bottomsheets.movetootherapp.b> {
    public static final a C = new a(null);
    public static final int D = 8;
    public b.a A;
    private final h B;

    /* renamed from: j  reason: collision with root package name */
    private final int f38949j = t0.f70267o0;

    /* renamed from: x  reason: collision with root package name */
    private final h f38950x;

    /* renamed from: y  reason: collision with root package name */
    private final h f38951y;

    /* renamed from: z  reason: collision with root package name */
    private final h f38952z;

    /* compiled from: MoveToOtherAppBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(String appToGo, String advID, String str, FragmentManager fragmentManager) {
            o.i(appToGo, "appToGo");
            o.i(advID, "advID");
            o.i(fragmentManager, "fragmentManager");
            MoveToOtherAppBottomSheet moveToOtherAppBottomSheet = new MoveToOtherAppBottomSheet();
            Bundle bundle = new Bundle();
            bundle.putString("ad_id", advID);
            bundle.putString("ad_title", str);
            bundle.putString("app_to_go", appToGo);
            moveToOtherAppBottomSheet.setArguments(bundle);
            moveToOtherAppBottomSheet.show(fragmentManager, "MoveToOtherAppBottomSheet");
        }
    }

    /* compiled from: MoveToOtherAppBottomSheet.kt */
    /* loaded from: classes3.dex */
    static final class b implements FlowCollector<Pair<? extends String, ? extends String>> {
        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(Pair<String, String> pair, zz.a<? super p> aVar) {
            if (pair != null) {
                MoveToOtherAppBottomSheet.this.dismiss();
                MoveToOtherAppBottomSheet.this.O(pair.c(), pair.d());
            }
            return p.f75480a;
        }
    }

    /* compiled from: MoveToOtherAppBottomSheet.kt */
    /* loaded from: classes3.dex */
    static final class c implements FlowCollector<p> {
        c() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            MoveToOtherAppBottomSheet.this.dismiss();
            return p.f75480a;
        }
    }

    public MoveToOtherAppBottomSheet() {
        h a11;
        h a12;
        h a13;
        h b11;
        a11 = d.a(new g00.a<String>() { // from class: com.forsale.app.ui.bottomsheets.movetootherapp.MoveToOtherAppBottomSheet$adId$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                String string;
                Bundle arguments = MoveToOtherAppBottomSheet.this.getArguments();
                return (arguments == null || (string = arguments.getString("ad_id")) == null) ? "" : string;
            }
        });
        this.f38950x = a11;
        a12 = d.a(new g00.a<String>() { // from class: com.forsale.app.ui.bottomsheets.movetootherapp.MoveToOtherAppBottomSheet$adTitle$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                String string;
                Bundle arguments = MoveToOtherAppBottomSheet.this.getArguments();
                return (arguments == null || (string = arguments.getString("ad_title")) == null) ? "" : string;
            }
        });
        this.f38951y = a12;
        a13 = d.a(new g00.a<String>() { // from class: com.forsale.app.ui.bottomsheets.movetootherapp.MoveToOtherAppBottomSheet$appToGo$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                String string;
                Bundle arguments = MoveToOtherAppBottomSheet.this.getArguments();
                return (arguments == null || (string = arguments.getString("app_to_go")) == null) ? ListingSourceApp.FORSALE.getValue() : string;
            }
        });
        this.f38952z = a13;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.movetootherapp.MoveToOtherAppBottomSheet$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes3.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ MoveToOtherAppBottomSheet f38955f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, MoveToOtherAppBottomSheet moveToOtherAppBottomSheet) {
                    super(fragment, bundle);
                    this.f38955f = moveToOtherAppBottomSheet;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    String J;
                    String H;
                    String I;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    b.a K = this.f38955f.K();
                    J = this.f38955f.J();
                    o.h(J, "access$getAppToGo(...)");
                    H = this.f38955f.H();
                    o.h(H, "access$getAdId(...)");
                    I = this.f38955f.I();
                    b a11 = K.a(J, H, I);
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
        b11 = d.b(LazyThreadSafetyMode.NONE, new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5(new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4(this)));
        this.B = FragmentViewModelLazyKt.b(this, s.b(com.forsale.app.ui.bottomsheets.movetootherapp.b.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String H() {
        return (String) this.f38950x.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String I() {
        return (String) this.f38951y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String J() {
        return (String) this.f38952z.getValue();
    }

    private final boolean M(PackageManager packageManager, String str) {
        try {
            packageManager.getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(String str, String str2) {
        Boolean bool;
        PackageManager packageManager;
        Context context = getContext();
        p pVar = null;
        if (context != null && (packageManager = context.getPackageManager()) != null) {
            bool = Boolean.valueOf(M(packageManager, str));
        } else {
            bool = null;
        }
        if (!o.d(bool, Boolean.TRUE)) {
            bool = null;
        }
        if (bool != null) {
            bool.booleanValue();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str2));
            intent.addFlags(268435456);
            intent.addFlags(67108864);
            startActivity(intent);
            pVar = p.f75480a;
        }
        if (pVar == null) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)));
            } catch (ActivityNotFoundException unused) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + str)));
            }
        }
    }

    public final b.a K() {
        b.a aVar = this.A;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w9.b
    /* renamed from: L */
    public com.forsale.app.ui.bottomsheets.movetootherapp.b t() {
        return (com.forsale.app.ui.bottomsheets.movetootherapp.b) this.B.getValue();
    }

    @Override // w9.b, androidx.fragment.app.j
    public int getTheme() {
        return z0.f70801k;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CrashlyticsUtilsKt.b("MoveToOtherAppBottomSheet", null, 2, null);
    }

    @Override // w9.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        OneShotEventHandler<Pair<String, String>> x02 = t().x0();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        x02.h(viewLifecycleOwner, new b());
        OneShotEventHandler<p> w02 = t().w0();
        androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        w02.h(viewLifecycleOwner2, new c());
    }

    @Override // w9.b
    protected int s() {
        return this.f38949j;
    }
}
