package com.forsale.adserver.view.screens.beforeDetails;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.c0;
import androidx.lifecycle.t0;
import com.forsale.adserver.utils.ViewModelHiltExtensionsKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.adserver.utils.ViewModelHiltExtensionsKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.adserver.utils.ViewModelHiltExtensionsKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.adserver.utils.ViewModelHiltExtensionsKt$assistedViewModel$$inlined$viewModels$default$7;
import com.forsale.adserver.view.models.AdGeneralModel;
import com.forsale.adserver.view.screens.beforeDetails.customViews.ImagesGroup;
import com.forsale.adserver.view.viewmodel.ImpressionsViewModel;
import j9.f;
import java.io.Serializable;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import t8.m;
import wz.h;
/* compiled from: BeforeDetailsFragment.kt */
/* loaded from: classes2.dex */
public final class BeforeDetailsFragment extends g {
    public static final a D = new a(null);
    public static final int E = 8;
    private Integer A;
    public ImpressionsViewModel.b B;
    private final h C;

    /* renamed from: f  reason: collision with root package name */
    private AdGeneralModel f21093f;

    /* renamed from: g  reason: collision with root package name */
    private m f21094g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f21095h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f21096i;

    /* renamed from: j  reason: collision with root package name */
    private Integer f21097j = -1;

    /* renamed from: x  reason: collision with root package name */
    private String f21098x = "";

    /* renamed from: y  reason: collision with root package name */
    private String f21099y;

    /* renamed from: z  reason: collision with root package name */
    private String f21100z;

    /* compiled from: BeforeDetailsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BeforeDetailsFragment a(AdGeneralModel ad2, boolean z11, boolean z12, String str, String str2, Integer num) {
            o.i(ad2, "ad");
            BeforeDetailsFragment beforeDetailsFragment = new BeforeDetailsFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("AD_DETAILS", ad2);
            bundle.putBoolean("IS_OFFER", z11);
            bundle.putBoolean("IS_SPLASH", z12);
            Integer e11 = ad2.e();
            if (e11 != null) {
                bundle.putInt("OFFER_CATEGORY_ID", e11.intValue());
            }
            String f11 = ad2.f();
            if (f11 != null) {
                bundle.putString("OFFER_CATEGORY_NAME", f11);
            }
            if (str != null) {
                bundle.putString("BANNER_TYPE", str);
            }
            if (str2 != null) {
                bundle.putString("BANNER_SCREEN", str2);
            }
            if (num != null) {
                num.intValue();
                bundle.putInt("CATEGORY_ID", num.intValue());
            }
            beforeDetailsFragment.setArguments(bundle);
            return beforeDetailsFragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BeforeDetailsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b implements c0<j9.f> {
        b() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(j9.f it2) {
            o.i(it2, "it");
            if (it2 instanceof f.d) {
                Object a11 = ((f.d) it2).a();
                o.g(a11, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) a11).intValue();
                AdGeneralModel adGeneralModel = BeforeDetailsFragment.this.f21093f;
                m mVar = null;
                if (adGeneralModel == null) {
                    o.w("adDetails");
                    adGeneralModel = null;
                }
                adGeneralModel.p(intValue);
                m mVar2 = BeforeDetailsFragment.this.f21094g;
                if (mVar2 == null) {
                    o.w("binding");
                } else {
                    mVar = mVar2;
                }
                TextView likesNum = mVar.U;
                o.h(likesNum, "likesNum");
                m9.f.h(likesNum, intValue);
            } else if (it2 instanceof f.b) {
                ((f.b) it2).a().getMessage();
            }
        }
    }

    /* compiled from: BeforeDetailsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c implements ImagesGroup.a {
        c() {
        }

        @Override // com.forsale.adserver.view.screens.beforeDetails.customViews.ImagesGroup.a
        public void a() {
            Context context = BeforeDetailsFragment.this.getContext();
            if (context != null) {
                AdGeneralModel adGeneralModel = BeforeDetailsFragment.this.f21093f;
                if (adGeneralModel == null) {
                    o.w("adDetails");
                    adGeneralModel = null;
                }
                com.forsale.adserver.view.screens.detailsScreen.g.a(context, adGeneralModel, BeforeDetailsFragment.this.f21095h, BeforeDetailsFragment.this.f21096i, BeforeDetailsFragment.this.f21097j, BeforeDetailsFragment.this.f21098x, BeforeDetailsFragment.this.f21099y, BeforeDetailsFragment.this.f21100z, BeforeDetailsFragment.this.A);
            }
        }

        @Override // com.forsale.adserver.view.screens.beforeDetails.customViews.ImagesGroup.a
        public void b(int i11) {
            m mVar = BeforeDetailsFragment.this.f21094g;
            AdGeneralModel adGeneralModel = null;
            if (mVar == null) {
                o.w("binding");
                mVar = null;
            }
            ImageView adImage = mVar.O;
            o.h(adImage, "adImage");
            AdGeneralModel adGeneralModel2 = BeforeDetailsFragment.this.f21093f;
            if (adGeneralModel2 == null) {
                o.w("adDetails");
            } else {
                adGeneralModel = adGeneralModel2;
            }
            m9.b.d(adImage, m9.b.b(adGeneralModel).get(i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BeforeDetailsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d implements c0<j9.f> {
        d() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(j9.f it2) {
            o.i(it2, "it");
            if (it2 instanceof f.d) {
                Object a11 = ((f.d) it2).a();
                o.g(a11, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) a11).intValue();
                AdGeneralModel adGeneralModel = BeforeDetailsFragment.this.f21093f;
                m mVar = null;
                if (adGeneralModel == null) {
                    o.w("adDetails");
                    adGeneralModel = null;
                }
                adGeneralModel.q(intValue);
                m mVar2 = BeforeDetailsFragment.this.f21094g;
                if (mVar2 == null) {
                    o.w("binding");
                } else {
                    mVar = mVar2;
                }
                TextView viewsNum = mVar.V;
                o.h(viewsNum, "viewsNum");
                m9.f.h(viewsNum, intValue);
            } else if (it2 instanceof f.b) {
                ((f.b) it2).a().getMessage();
            }
        }
    }

    public BeforeDetailsFragment() {
        h b11;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.adserver.view.screens.beforeDetails.BeforeDetailsFragment$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtensions.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ BeforeDetailsFragment f21103f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, BeforeDetailsFragment beforeDetailsFragment) {
                    super(fragment, bundle);
                    this.f21103f = beforeDetailsFragment;
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
                @Override // androidx.lifecycle.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                protected <T extends androidx.lifecycle.q0> T e(java.lang.String r12, java.lang.Class<T> r13, androidx.lifecycle.k0 r14) {
                    /*
                        r11 = this;
                        java.lang.String r0 = "key"
                        kotlin.jvm.internal.o.i(r12, r0)
                        java.lang.String r12 = "modelClass"
                        kotlin.jvm.internal.o.i(r13, r12)
                        java.lang.String r12 = "handle"
                        kotlin.jvm.internal.o.i(r14, r12)
                        com.forsale.adserver.view.screens.beforeDetails.BeforeDetailsFragment r12 = r11.f21103f
                        com.forsale.adserver.view.viewmodel.ImpressionsViewModel$b r12 = r12.C()
                        com.forsale.adserver.view.viewmodel.ImpressionsViewModel$a r13 = new com.forsale.adserver.view.viewmodel.ImpressionsViewModel$a
                        com.forsale.adserver.view.screens.beforeDetails.BeforeDetailsFragment r14 = r11.f21103f
                        com.forsale.adserver.view.models.AdGeneralModel r14 = com.forsale.adserver.view.screens.beforeDetails.BeforeDetailsFragment.r(r14)
                        r0 = 0
                        java.lang.String r1 = "adDetails"
                        if (r14 != 0) goto L26
                        kotlin.jvm.internal.o.w(r1)
                        r14 = r0
                    L26:
                        int r14 = r14.b()
                        com.forsale.adserver.view.screens.beforeDetails.BeforeDetailsFragment r2 = r11.f21103f
                        java.lang.String r2 = com.forsale.adserver.view.screens.beforeDetails.BeforeDetailsFragment.z(r2)
                        com.forsale.adserver.view.screens.beforeDetails.BeforeDetailsFragment r3 = r11.f21103f
                        java.lang.Integer r3 = com.forsale.adserver.view.screens.beforeDetails.BeforeDetailsFragment.y(r3)
                        com.forsale.adserver.view.screens.beforeDetails.BeforeDetailsFragment r4 = r11.f21103f
                        java.lang.Integer r4 = com.forsale.adserver.view.screens.beforeDetails.BeforeDetailsFragment.x(r4)
                        com.forsale.adserver.view.screens.beforeDetails.BeforeDetailsFragment r5 = r11.f21103f
                        java.lang.String r5 = com.forsale.adserver.view.screens.beforeDetails.BeforeDetailsFragment.t(r5)
                        com.forsale.adserver.view.screens.beforeDetails.BeforeDetailsFragment r6 = r11.f21103f
                        java.lang.String r6 = com.forsale.adserver.view.screens.beforeDetails.BeforeDetailsFragment.s(r6)
                        com.forsale.adserver.view.screens.beforeDetails.BeforeDetailsFragment r7 = r11.f21103f
                        boolean r7 = com.forsale.adserver.view.screens.beforeDetails.BeforeDetailsFragment.A(r7)
                        com.forsale.adserver.view.screens.beforeDetails.BeforeDetailsFragment r8 = r11.f21103f
                        boolean r8 = com.forsale.adserver.view.screens.beforeDetails.BeforeDetailsFragment.B(r8)
                        com.forsale.adserver.view.screens.beforeDetails.BeforeDetailsFragment r9 = r11.f21103f
                        com.forsale.adserver.view.models.AdGeneralModel r9 = com.forsale.adserver.view.screens.beforeDetails.BeforeDetailsFragment.r(r9)
                        if (r9 != 0) goto L60
                        kotlin.jvm.internal.o.w(r1)
                        r9 = r0
                    L60:
                        java.lang.String r9 = r9.i()
                        m9.d$a r10 = m9.d.f63243a
                        java.lang.String r10 = r10.b()
                        boolean r9 = kotlin.jvm.internal.o.d(r9, r10)
                        r10 = 0
                        if (r9 == 0) goto L93
                        com.forsale.adserver.view.screens.beforeDetails.BeforeDetailsFragment r9 = r11.f21103f
                        com.forsale.adserver.view.models.AdGeneralModel r9 = com.forsale.adserver.view.screens.beforeDetails.BeforeDetailsFragment.r(r9)
                        if (r9 != 0) goto L7d
                        kotlin.jvm.internal.o.w(r1)
                        goto L7e
                    L7d:
                        r0 = r9
                    L7e:
                        java.lang.String r0 = r0.l()
                        r1 = 1
                        if (r0 == 0) goto L8e
                        boolean r0 = kotlin.text.k.v(r0)
                        if (r0 == 0) goto L8c
                        goto L8e
                    L8c:
                        r0 = r10
                        goto L8f
                    L8e:
                        r0 = r1
                    L8f:
                        if (r0 != 0) goto L93
                        r9 = r1
                        goto L94
                    L93:
                        r9 = r10
                    L94:
                        r0 = r13
                        r1 = r14
                        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                        com.forsale.adserver.view.viewmodel.ImpressionsViewModel r12 = r12.a(r13)
                        java.lang.String r13 = "null cannot be cast to non-null type T of com.forsale.adserver.utils.ViewModelHiltExtensionsKt.assistedViewModel.<no name provided>.invoke.<no name provided>.create"
                        kotlin.jvm.internal.o.g(r12, r13)
                        return r12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.view.screens.beforeDetails.BeforeDetailsFragment$special$$inlined$assistedViewModel$1.a.e(java.lang.String, java.lang.Class, androidx.lifecycle.k0):androidx.lifecycle.q0");
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
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new ViewModelHiltExtensionsKt$assistedViewModel$$inlined$viewModels$default$5(new ViewModelHiltExtensionsKt$assistedViewModel$$inlined$viewModels$default$4(this)));
        this.C = FragmentViewModelLazyKt.b(this, s.b(ImpressionsViewModel.class), new ViewModelHiltExtensionsKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionsKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
    }

    private final ImpressionsViewModel D() {
        return (ImpressionsViewModel) this.C.getValue();
    }

    private final void E(j9.e<j9.f> eVar) {
        eVar.observe(this, new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(BeforeDetailsFragment this$0, View view) {
        o.i(this$0, "this$0");
        Context context = this$0.getContext();
        if (context != null) {
            AdGeneralModel adGeneralModel = this$0.f21093f;
            if (adGeneralModel == null) {
                o.w("adDetails");
                adGeneralModel = null;
            }
            com.forsale.adserver.view.screens.detailsScreen.g.a(context, adGeneralModel, this$0.f21095h, this$0.f21096i, this$0.f21097j, this$0.f21098x, this$0.f21099y, this$0.f21100z, this$0.A);
        }
    }

    private final void H() {
        E(D().k());
        ImpressionsViewModel D2 = D();
        boolean z11 = this.f21095h;
        AdGeneralModel adGeneralModel = this.f21093f;
        if (adGeneralModel == null) {
            o.w("adDetails");
            adGeneralModel = null;
        }
        D2.p(z11, adGeneralModel.b());
    }

    private final void I() {
        J(D().l());
    }

    private final void J(j9.e<j9.f> eVar) {
        eVar.observe(this, new d());
    }

    public final ImpressionsViewModel.b C() {
        ImpressionsViewModel.b bVar = this.B;
        if (bVar != null) {
            return bVar;
        }
        o.w("factory");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("AD_DETAILS");
            o.g(serializable, "null cannot be cast to non-null type com.forsale.adserver.view.models.AdGeneralModel");
            this.f21093f = (AdGeneralModel) serializable;
            this.f21095h = arguments.getBoolean("IS_OFFER");
            this.f21096i = arguments.getBoolean("IS_SPLASH");
            this.f21097j = Integer.valueOf(arguments.getInt("OFFER_CATEGORY_ID"));
            this.f21098x = arguments.getString("OFFER_CATEGORY_NAME");
            this.f21099y = arguments.getString("BANNER_TYPE");
            this.f21100z = arguments.getString("BANNER_SCREEN");
            this.A = Integer.valueOf(arguments.getInt("CATEGORY_ID"));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        ViewDataBinding h11 = androidx.databinding.g.h(inflater, l8.g.f62321i, viewGroup, false);
        o.h(h11, "inflate(...)");
        m mVar = (m) h11;
        this.f21094g = mVar;
        m mVar2 = null;
        if (mVar == null) {
            o.w("binding");
            mVar = null;
        }
        AdGeneralModel adGeneralModel = this.f21093f;
        if (adGeneralModel == null) {
            o.w("adDetails");
            adGeneralModel = null;
        }
        mVar.f0(adGeneralModel);
        m mVar3 = this.f21094g;
        if (mVar3 == null) {
            o.w("binding");
        } else {
            mVar2 = mVar3;
        }
        return mVar2.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        I();
        H();
        m mVar = this.f21094g;
        m mVar2 = null;
        if (mVar == null) {
            o.w("binding");
            mVar = null;
        }
        mVar.R.setListener(new c());
        m mVar3 = this.f21094g;
        if (mVar3 == null) {
            o.w("binding");
        } else {
            mVar2 = mVar3;
        }
        mVar2.O.setOnClickListener(new View.OnClickListener() { // from class: com.forsale.adserver.view.screens.beforeDetails.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BeforeDetailsFragment.G(BeforeDetailsFragment.this, view2);
            }
        });
    }
}
