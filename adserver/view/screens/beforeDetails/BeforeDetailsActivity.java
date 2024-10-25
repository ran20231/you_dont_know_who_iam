package com.forsale.adserver.view.screens.beforeDetails;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.c0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.viewpager.widget.ViewPager;
import com.forsale.adserver.view.models.AdGeneralModel;
import com.forsale.adserver.view.screens.beforeDetails.customViews.CustomViewPager;
import com.forsale.adserver.view.viewmodel.BeforeDetailsViewModel;
import j9.f;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import wz.h;
/* compiled from: BeforeDetailsActivity.kt */
/* loaded from: classes2.dex */
public final class BeforeDetailsActivity extends f {

    /* renamed from: e  reason: collision with root package name */
    private boolean f21079e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f21080f;

    /* renamed from: g  reason: collision with root package name */
    private String f21081g;

    /* renamed from: h  reason: collision with root package name */
    private String f21082h;

    /* renamed from: i  reason: collision with root package name */
    private Integer f21083i;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<AdGeneralModel> f21084j = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    private final h f21085x = new s0(s.b(BeforeDetailsViewModel.class), new g00.a<w0>() { // from class: com.forsale.adserver.view.screens.beforeDetails.BeforeDetailsActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // g00.a
        /* renamed from: b */
        public final w0 invoke() {
            return ComponentActivity.this.getViewModelStore();
        }
    }, new g00.a<t0.b>() { // from class: com.forsale.adserver.view.screens.beforeDetails.BeforeDetailsActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // g00.a
        /* renamed from: b */
        public final t0.b invoke() {
            return ComponentActivity.this.getDefaultViewModelProviderFactory();
        }
    }, new g00.a<w3.a>() { // from class: com.forsale.adserver.view.screens.beforeDetails.BeforeDetailsActivity$special$$inlined$viewModels$default$3
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
        }

        @Override // g00.a
        /* renamed from: b */
        public final w3.a invoke() {
            w3.a aVar;
            g00.a aVar2 = g00.a.this;
            if (aVar2 == null || (aVar = (w3.a) aVar2.invoke()) == null) {
                return this.getDefaultViewModelCreationExtras();
            }
            return aVar;
        }
    });

    /* renamed from: y  reason: collision with root package name */
    public t8.a f21086y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BeforeDetailsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a implements c0<j9.f> {
        a() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(j9.f it2) {
            o.i(it2, "it");
            if (it2 instanceof f.d) {
                CustomViewPager bannerSlider = BeforeDetailsActivity.this.u0().O;
                o.h(bannerSlider, "bannerSlider");
                l9.a.c(bannerSlider, -2431992);
                Object a11 = ((f.d) it2).a();
                o.g(a11, "null cannot be cast to non-null type com.forsale.adserver.view.models.AdGeneralModel");
                ArrayList arrayList = new ArrayList();
                arrayList.add((AdGeneralModel) a11);
                BeforeDetailsActivity.this.y0(arrayList);
            } else if (it2 instanceof f.b) {
                String message = ((f.b) it2).a().getMessage();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("error is ");
                sb2.append(message);
                BeforeDetailsActivity.this.finish();
            } else if (it2 instanceof f.c) {
                CustomViewPager bannerSlider2 = BeforeDetailsActivity.this.u0().O;
                o.h(bannerSlider2, "bannerSlider");
                l9.a.c(bannerSlider2, -2731992);
            }
        }
    }

    private final BeforeDetailsViewModel t0() {
        return (BeforeDetailsViewModel) this.f21085x.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v0(BeforeDetailsActivity this$0, View view) {
        o.i(this$0, "this$0");
        this$0.finish();
    }

    private final void w0() {
        t0().l().observe(this, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y0(ArrayList<AdGeneralModel> arrayList) {
        Integer num;
        CustomViewPager customViewPager = u0().O;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        o.h(supportFragmentManager, "getSupportFragmentManager(...)");
        customViewPager.setAdapter(new m8.a(supportFragmentManager, (AdGeneralModel[]) arrayList.toArray(new AdGeneralModel[0]), this.f21079e, this.f21080f, this.f21081g, this.f21082h, this.f21083i));
        if (arrayList.size() > 1) {
            u0().O.setAnimationEnabled(true);
            u0().O.setFadeEnabled(true);
            u0().O.setFadeFactor(0.7f);
        }
        TextView textView = u0().Q;
        androidx.viewpager.widget.a adapter = u0().O.getAdapter();
        if (adapter != null) {
            num = Integer.valueOf(adapter.d());
        } else {
            num = null;
        }
        textView.setText("1 / " + num);
        u0().O.d(new b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.adserver.view.screens.beforeDetails.f, androidx.fragment.app.p, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        ViewDataBinding j11 = androidx.databinding.g.j(this, l8.g.f62313a);
        o.h(j11, "setContentView(...)");
        x0((t8.a) j11);
        String stringExtra = getIntent().getStringExtra("AD_ID");
        if (stringExtra == null) {
            stringExtra = "-1";
        }
        this.f21079e = getIntent().getBooleanExtra("IS_OFFER", true);
        this.f21080f = getIntent().getBooleanExtra("IS_SPLASH", false);
        this.f21081g = getIntent().getStringExtra("BANNER_TYPE");
        this.f21082h = getIntent().getStringExtra("BANNER_SCREEN");
        this.f21083i = Integer.valueOf(getIntent().getIntExtra("CATEGORY_ID", 0));
        if (o.d(stringExtra, "-1")) {
            Serializable serializableExtra = getIntent().getSerializableExtra("GENERAL_LIST");
            o.g(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<com.forsale.adserver.view.models.AdGeneralModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.forsale.adserver.view.models.AdGeneralModel> }");
            ArrayList<AdGeneralModel> arrayList = (ArrayList) serializableExtra;
            this.f21084j = arrayList;
            y0(arrayList);
        } else {
            w0();
            t0().j(Integer.parseInt(stringExtra), this.f21079e);
        }
        u0().P.setOnClickListener(new View.OnClickListener() { // from class: com.forsale.adserver.view.screens.beforeDetails.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BeforeDetailsActivity.v0(BeforeDetailsActivity.this, view);
            }
        });
    }

    public final t8.a u0() {
        t8.a aVar = this.f21086y;
        if (aVar != null) {
            return aVar;
        }
        o.w("binding");
        return null;
    }

    public final void x0(t8.a aVar) {
        o.i(aVar, "<set-?>");
        this.f21086y = aVar;
    }

    /* compiled from: BeforeDetailsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b implements ViewPager.j {
        b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        @SuppressLint({"SetTextI18n"})
        public void z(int i11, float f11, int i12) {
            Integer num;
            TextView textView = BeforeDetailsActivity.this.u0().Q;
            int i13 = i11 + 1;
            androidx.viewpager.widget.a adapter = BeforeDetailsActivity.this.u0().O.getAdapter();
            if (adapter != null) {
                num = Integer.valueOf(adapter.d());
            } else {
                num = null;
            }
            textView.setText(i13 + " / " + num);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void M(int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i11) {
        }
    }
}
