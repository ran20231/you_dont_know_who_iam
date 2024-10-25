package com.forsale.app.ui.bottomsheets.useractions;

import aa.in;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t;
import androidx.lifecycle.t0;
import com.forsale.app.datalayer.repositories.TranslationRepository;
import com.forsale.app.ui.bottomsheets.useractions.ReportAbuseViewModel;
import com.forsale.app.utils.CrashlyticsUtilsKt;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import t9.z0;
import wz.h;
/* compiled from: ReportAbuseBottomSheet.kt */
@SuppressLint({"ValidFragment"})
/* loaded from: classes3.dex */
public final class ReportAbuseBottomSheet extends com.forsale.app.ui.bottomsheets.useractions.a {
    public static final a B = new a(null);
    public static final int C = 8;
    private final h A;

    /* renamed from: g */
    private final Integer f39162g;

    /* renamed from: h */
    private final Integer f39163h;

    /* renamed from: i */
    private final String f39164i;

    /* renamed from: j */
    private final TranslationRepository.Translation f39165j;

    /* renamed from: x */
    private final ReportAbuseIntention f39166x;

    /* renamed from: y */
    private in f39167y;

    /* renamed from: z */
    public ReportAbuseViewModel.a f39168z;

    /* compiled from: ReportAbuseBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ReportAbuseBottomSheet() {
        this(null, null, null, null, null, 31, null);
    }

    public final ReportAbuseViewModel G() {
        return (ReportAbuseViewModel) this.A.getValue();
    }

    public static final void H(ReportAbuseBottomSheet this$0, View view) {
        o.i(this$0, "this$0");
        this$0.dismiss();
    }

    public final ReportAbuseIntention A() {
        return this.f39166x;
    }

    public final Integer B() {
        return this.f39162g;
    }

    public final TranslationRepository.Translation C() {
        return this.f39165j;
    }

    public final Integer D() {
        return this.f39163h;
    }

    public final String E() {
        return this.f39164i;
    }

    @Override // androidx.fragment.app.j
    public int getTheme() {
        return z0.f70792b;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        in f02 = in.f0(inflater, viewGroup, false);
        o.h(f02, "inflate(...)");
        this.f39167y = f02;
        in inVar = null;
        if (f02 == null) {
            o.w("binding");
            f02 = null;
        }
        View root = f02.getRoot();
        in inVar2 = this.f39167y;
        if (inVar2 == null) {
            o.w("binding");
            inVar2 = null;
        }
        inVar2.h0(G());
        BuildersKt__Builders_commonKt.launch$default(t.a(this), null, null, new ReportAbuseBottomSheet$onCreateView$1$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(t.a(this), null, null, new ReportAbuseBottomSheet$onCreateView$1$2(this, null), 3, null);
        in inVar3 = this.f39167y;
        if (inVar3 == null) {
            o.w("binding");
        } else {
            inVar = inVar3;
        }
        inVar.O.setOnClickListener(new sh.a(this));
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CrashlyticsUtilsKt.b("reportAbuseBottomSheet", null, 2, null);
    }

    public final ReportAbuseViewModel.a z() {
        ReportAbuseViewModel.a aVar = this.f39168z;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    public /* synthetic */ ReportAbuseBottomSheet(Integer num, Integer num2, String str, TranslationRepository.Translation translation, ReportAbuseIntention reportAbuseIntention, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : translation, (i11 & 16) != 0 ? null : reportAbuseIntention);
    }

    public ReportAbuseBottomSheet(Integer num, Integer num2, String str, TranslationRepository.Translation translation, ReportAbuseIntention reportAbuseIntention) {
        h b11;
        this.f39162g = num;
        this.f39163h = num2;
        this.f39164i = str;
        this.f39165j = translation;
        this.f39166x = reportAbuseIntention;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.useractions.ReportAbuseBottomSheet$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes3.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ ReportAbuseBottomSheet f39171f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, ReportAbuseBottomSheet reportAbuseBottomSheet) {
                    super(fragment, bundle);
                    this.f39171f = reportAbuseBottomSheet;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    ReportAbuseViewModel a11 = this.f39171f.z().a(this.f39171f.B(), this.f39171f.D(), this.f39171f.E(), this.f39171f.C(), this.f39171f.A());
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
        this.A = FragmentViewModelLazyKt.b(this, s.b(ReportAbuseViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
    }
}
