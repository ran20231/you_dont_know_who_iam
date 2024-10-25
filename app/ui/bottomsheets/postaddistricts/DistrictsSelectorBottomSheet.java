package com.forsale.app.ui.bottomsheets.postaddistricts;

import aa.u3;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.c0;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.ui.bottomsheets.postaddistricts.PostAdDistrictsViewModel;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import g00.l;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import kr.m;
import t9.t0;
import t9.z0;
import wz.h;
import wz.p;
/* compiled from: DistrictsSelectorBottomSheet.kt */
/* loaded from: classes3.dex */
public final class DistrictsSelectorBottomSheet extends kh.d<u3, PostAdDistrictsViewModel> {
    public static final a E = new a(null);
    public static final int F = 8;
    private final h A;
    private final lr.a<m<? extends RecyclerView.d0>> B;
    private kr.b<m<? extends RecyclerView.d0>> C;
    private boolean D;

    /* renamed from: j  reason: collision with root package name */
    private final int f38985j;

    /* renamed from: x  reason: collision with root package name */
    private final l<DistrictEntity, p> f38986x;

    /* renamed from: y  reason: collision with root package name */
    private final int f38987y;

    /* renamed from: z  reason: collision with root package name */
    public PostAdDistrictsViewModel.a f38988z;

    /* compiled from: DistrictsSelectorBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(int i11, FragmentManager fragmentManager, l<? super DistrictEntity, p> onActionDone) {
            o.i(fragmentManager, "fragmentManager");
            o.i(onActionDone, "onActionDone");
            new DistrictsSelectorBottomSheet(i11, onActionDone).show(fragmentManager, "PostAdDistrictsBottomSheet");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DistrictsSelectorBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class b implements c0<DistrictEntity> {
        b() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(DistrictEntity districtEntity) {
            DistrictsSelectorBottomSheet.this.K();
            DistrictsSelectorBottomSheet.this.O();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DistrictsSelectorBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class c implements FlowCollector<p> {
        c() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            DistrictEntity value = DistrictsSelectorBottomSheet.this.t().z0().getValue();
            if (value != null) {
                DistrictsSelectorBottomSheet districtsSelectorBottomSheet = DistrictsSelectorBottomSheet.this;
                districtsSelectorBottomSheet.f38986x.invoke(value);
                districtsSelectorBottomSheet.dismiss();
            }
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DistrictsSelectorBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class d implements c0<List<? extends DistrictEntity>> {
        d() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(List<DistrictEntity> list) {
            o.f(list);
            DistrictsSelectorBottomSheet districtsSelectorBottomSheet = DistrictsSelectorBottomSheet.this;
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                districtsSelectorBottomSheet.B.n(new kh.a(new kh.b((DistrictEntity) it2.next(), districtsSelectorBottomSheet.t().z0())));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DistrictsSelectorBottomSheet(int i11, l<? super DistrictEntity, p> onActionDone) {
        h b11;
        o.i(onActionDone, "onActionDone");
        this.f38985j = i11;
        this.f38986x = onActionDone;
        this.f38987y = t0.f70274p0;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.postaddistricts.DistrictsSelectorBottomSheet$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes3.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ DistrictsSelectorBottomSheet f38991f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, DistrictsSelectorBottomSheet districtsSelectorBottomSheet) {
                    super(fragment, bundle);
                    this.f38991f = districtsSelectorBottomSheet;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    int i11;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    PostAdDistrictsViewModel.a L = this.f38991f.L();
                    i11 = this.f38991f.f38985j;
                    PostAdDistrictsViewModel a11 = L.a(i11);
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
        this.A = FragmentViewModelLazyKt.b(this, s.b(PostAdDistrictsViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
        this.B = lr.a.f62553j.a();
        this.D = true;
    }

    private final void I() {
        Drawable drawable;
        Context context = getContext();
        if (context != null && (drawable = androidx.core.content.b.getDrawable(context, t9.q0.f69825z)) != null) {
            o.f(drawable);
            ((u3) r()).P.j(new bg.a(drawable));
        }
    }

    private final void J() {
        t().z0().observe(getViewLifecycleOwner(), new b());
        OneShotEventHandler<p> y02 = t().y0();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        y02.h(viewLifecycleOwner, new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K() {
        ((u3) r()).P.setAdapter(null);
        this.B.r().clear();
        this.B.q();
        kr.b<m<? extends RecyclerView.d0>> bVar = this.C;
        if (bVar != null) {
            bVar.h();
        }
        t().A0().removeObservers(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O() {
        List e11;
        e11 = q.e(this.B);
        this.C = kr.b.f61943t.g(e11);
        RecyclerView recyclerView = ((u3) r()).P;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.C);
        I();
        t().A0().observe(getViewLifecycleOwner(), new d());
    }

    public final PostAdDistrictsViewModel.a L() {
        PostAdDistrictsViewModel.a aVar = this.f38988z;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w9.b
    /* renamed from: M */
    public PostAdDistrictsViewModel t() {
        return (PostAdDistrictsViewModel) this.A.getValue();
    }

    @Override // w9.b, androidx.fragment.app.j
    public int getTheme() {
        return z0.f70801k;
    }

    @Override // w9.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        O();
        J();
    }

    @Override // w9.b
    protected int s() {
        return this.f38987y;
    }

    @Override // w9.b
    public boolean w() {
        return this.D;
    }
}
