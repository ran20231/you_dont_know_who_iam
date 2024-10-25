package com.forsale.app.ui.bottomsheets.filterselector;

import aa.i2;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.utils.OneShotEventHandler;
import g00.l;
import hi.b;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowCollector;
import kr.m;
import kr.s;
import t9.z0;
import w3.a;
import wz.h;
import wz.p;
/* compiled from: FilterSelectorBottomSheet.kt */
/* loaded from: classes3.dex */
public final class FilterSelectorBottomSheet<T extends hi.b> extends w9.f<i2, FilterSelectorViewModel<T>> {

    /* renamed from: f */
    private l<? super List<? extends T>, p> f38042f;

    /* renamed from: h */
    private final t0.b f38044h;

    /* renamed from: i */
    private final h f38045i;

    /* renamed from: j */
    private boolean f38046j;

    /* renamed from: x */
    private final lr.a<m<? extends RecyclerView.d0>> f38047x;

    /* renamed from: y */
    private kr.b<m<? extends RecyclerView.d0>> f38048y;

    /* renamed from: z */
    public static final Companion f38040z = new Companion(null);
    public static final int A = 8;

    /* renamed from: e */
    private final h f38041e = kotlin.c.a(new g00.a<FilterSelectorModel<T>>(this) { // from class: com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorBottomSheet$selectorModel$2

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FilterSelectorBottomSheet<T> f38059a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.f38059a = this;
        }

        @Override // g00.a
        /* renamed from: b */
        public final FilterSelectorModel<T> invoke() {
            Bundle arguments = this.f38059a.getArguments();
            if (arguments == null) {
                return null;
            }
            Serializable serializable = arguments.getSerializable("SELECTOR_MODEL");
            if (!(serializable instanceof FilterSelectorModel)) {
                return null;
            }
            return (FilterSelectorModel) serializable;
        }
    });

    /* renamed from: g */
    private final int f38043g = t9.t0.W;

    /* compiled from: FilterSelectorBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T extends hi.b> void a(FilterSelectorModel<T> selectorModel, FragmentManager fragmentManager, final l<? super List<? extends T>, p> onActionDone) {
            o.i(selectorModel, "selectorModel");
            o.i(fragmentManager, "fragmentManager");
            o.i(onActionDone, "onActionDone");
            FilterSelectorBottomSheet filterSelectorBottomSheet = new FilterSelectorBottomSheet();
            Bundle bundle = new Bundle();
            bundle.putSerializable("SELECTOR_MODEL", selectorModel);
            filterSelectorBottomSheet.setArguments(bundle);
            filterSelectorBottomSheet.f38042f = new l<List<? extends T>, p>() { // from class: com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorBottomSheet$Companion$showFilterSelectorBottomSheet$1$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void b(List<? extends T> list) {
                    onActionDone.invoke(list);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(Object obj) {
                    b((List) obj);
                    return p.f75480a;
                }
            };
            filterSelectorBottomSheet.show(fragmentManager, "FilterSelectorBottomSheet");
        }
    }

    /* compiled from: FilterSelectorBottomSheet.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38050a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f38051b;

        static {
            int[] iArr = new int[FilterSelectorDisplayType.values().length];
            try {
                iArr[FilterSelectorDisplayType.GRID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FilterSelectorDisplayType.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f38050a = iArr;
            int[] iArr2 = new int[ListingsResponse.UISettings.FiltrationSetting.SelectionType.values().length];
            try {
                iArr2[ListingsResponse.UISettings.FiltrationSetting.SelectionType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ListingsResponse.UISettings.FiltrationSetting.SelectionType.MULTI.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f38051b = iArr2;
        }
    }

    /* compiled from: FilterSelectorBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class b implements FlowCollector<p> {

        /* renamed from: a */
        final /* synthetic */ FilterSelectorBottomSheet<T> f38052a;

        b(FilterSelectorBottomSheet<T> filterSelectorBottomSheet) {
            this.f38052a = filterSelectorBottomSheet;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            List<T> list;
            l lVar = ((FilterSelectorBottomSheet) this.f38052a).f38042f;
            if (lVar != null) {
                LiveData<List<T>> q11 = this.f38052a.t().q();
                if (q11 != null) {
                    list = q11.getValue();
                } else {
                    list = null;
                }
                lVar.invoke(list);
            }
            this.f38052a.dismiss();
            return p.f75480a;
        }
    }

    /* compiled from: FilterSelectorBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class c implements FlowCollector<p> {

        /* renamed from: a */
        final /* synthetic */ FilterSelectorBottomSheet<T> f38053a;

        c(FilterSelectorBottomSheet<T> filterSelectorBottomSheet) {
            this.f38053a = filterSelectorBottomSheet;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            this.f38053a.dismiss();
            return p.f75480a;
        }
    }

    /* compiled from: FilterSelectorBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class d implements c0<p> {

        /* renamed from: a */
        final /* synthetic */ FilterSelectorBottomSheet<T> f38054a;

        d(FilterSelectorBottomSheet<T> filterSelectorBottomSheet) {
            this.f38054a = filterSelectorBottomSheet;
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(p pVar) {
            l lVar = ((FilterSelectorBottomSheet) this.f38054a).f38042f;
            if (lVar != null) {
                lVar.invoke(null);
            }
            this.f38054a.dismiss();
        }
    }

    /* compiled from: FilterSelectorBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class e implements c0<String> {

        /* renamed from: a */
        final /* synthetic */ FilterSelectorBottomSheet<T> f38055a;

        e(FilterSelectorBottomSheet<T> filterSelectorBottomSheet) {
            this.f38055a = filterSelectorBottomSheet;
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(String str) {
            this.f38055a.t().C(str);
        }
    }

    /* compiled from: FilterSelectorBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class f implements c0<List<T>> {

        /* renamed from: a */
        final /* synthetic */ FilterSelectorBottomSheet<T> f38056a;

        f(FilterSelectorBottomSheet<T> filterSelectorBottomSheet) {
            this.f38056a = filterSelectorBottomSheet;
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(List<T> list) {
            this.f38056a.V();
        }
    }

    /* compiled from: FilterSelectorBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class g implements s<m<?>> {

        /* renamed from: a */
        final /* synthetic */ FilterSelectorBottomSheet<T> f38058a;

        g(FilterSelectorBottomSheet<T> filterSelectorBottomSheet) {
            this.f38058a = filterSelectorBottomSheet;
        }

        public static final void c(FilterSelectorBottomSheet this$0, m item) {
            o.i(this$0, "this$0");
            o.i(item, "$item");
            kr.b bVar = this$0.f38048y;
            if (bVar != null) {
                kr.b.I(bVar, this$0.f38047x.s(item), null, 2, null);
            }
        }

        @Override // kr.s
        public void a(m<?> item, boolean z11) {
            o.i(item, "item");
            if (item instanceof ai.d) {
                ((ai.d) item).x().f(z11);
                kr.b bVar = ((FilterSelectorBottomSheet) this.f38058a).f38048y;
                if (bVar != null) {
                    kr.b.I(bVar, ((FilterSelectorBottomSheet) this.f38058a).f38047x.s(item), null, 2, null);
                }
            } else if (item instanceof ai.c) {
                ((ai.c) item).x().f(z11);
                new Handler(Looper.getMainLooper()).post(new jg.a(this.f38058a, item));
            }
        }
    }

    public FilterSelectorBottomSheet() {
        h a11;
        h a12;
        a11 = kotlin.d.a(new g00.a<FilterSelectorModel<T>>(this) { // from class: com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorBottomSheet$selectorModel$2

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FilterSelectorBottomSheet<T> f38059a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f38059a = this;
            }

            @Override // g00.a
            /* renamed from: b */
            public final FilterSelectorModel<T> invoke() {
                Bundle arguments = this.f38059a.getArguments();
                if (arguments == null) {
                    return null;
                }
                Serializable serializable = arguments.getSerializable("SELECTOR_MODEL");
                if (!(serializable instanceof FilterSelectorModel)) {
                    return null;
                }
                return (FilterSelectorModel) serializable;
            }
        });
        this.f38041e = a11;
        this.f38043g = t9.t0.W;
        w3.c cVar = new w3.c();
        cVar.a(kotlin.jvm.internal.s.b(FilterSelectorViewModel.class), new l<w3.a, FilterSelectorViewModel<T>>(this) { // from class: com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorBottomSheet$factory$1$1

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FilterSelectorBottomSheet<T> f38057a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f38057a = this;
            }

            @Override // g00.l
            /* renamed from: b */
            public final FilterSelectorViewModel<T> invoke(a initializer) {
                FilterSelectorModel L;
                o.i(initializer, "$this$initializer");
                L = this.f38057a.L();
                o.f(L);
                return new FilterSelectorViewModel<>(L);
            }
        });
        this.f38044h = cVar.b();
        a12 = kotlin.d.a(new g00.a<FilterSelectorViewModel<T>>(this) { // from class: com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorBottomSheet$viewModel$2

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FilterSelectorBottomSheet<T> f38060a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f38060a = this;
            }

            @Override // g00.a
            /* renamed from: b */
            public final FilterSelectorViewModel<T> invoke() {
                FilterSelectorBottomSheet<T> filterSelectorBottomSheet = this.f38060a;
                q0 a13 = new t0(filterSelectorBottomSheet, filterSelectorBottomSheet.K()).a(FilterSelectorViewModel.class);
                o.g(a13, "null cannot be cast to non-null type com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorViewModel<T of com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorBottomSheet>");
                return (FilterSelectorViewModel) a13;
            }
        });
        this.f38045i = a12;
        this.f38046j = true;
        this.f38047x = lr.a.f62553j.a();
    }

    private final void E() {
        Drawable drawable;
        Context context = getContext();
        if (context != null && (drawable = androidx.core.content.b.getDrawable(context, t9.q0.Q2)) != null) {
            o.f(drawable);
            bg.a aVar = new bg.a(drawable);
            RecyclerView recyclerView = r().T;
            if (recyclerView != null) {
                recyclerView.j(aVar);
            }
        }
    }

    private final void G(List<? extends T> list) {
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            hi.b bVar = (hi.b) it2.next();
        }
    }

    private final void H(List<? extends T> list) {
        int i11 = a.f38051b[t().r().g().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                O(list);
                return;
            }
            return;
        }
        Q(list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x002e, code lost:
        r0 = kotlin.collections.CollectionsKt___CollectionsKt.X0(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x004e, code lost:
        r0 = kotlin.collections.CollectionsKt___CollectionsKt.X0(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x006e, code lost:
        r0 = kotlin.collections.CollectionsKt___CollectionsKt.X0(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void I() {
        /*
            r2 = this;
            com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorViewModel r0 = r2.t()
            com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorModel r0 = r0.r()
            com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorDisplayType r0 = r0.f()
            if (r0 != 0) goto L10
            r0 = -1
            goto L18
        L10:
            int[] r1 = com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorBottomSheet.a.f38050a
            int r0 = r0.ordinal()
            r0 = r1[r0]
        L18:
            r1 = 1
            if (r0 == r1) goto L5e
            r1 = 2
            if (r0 == r1) goto L3e
            com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorViewModel r0 = r2.t()
            androidx.lifecycle.LiveData r0 = r0.o()
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L36
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.p.X0(r0)
            if (r0 != 0) goto L3a
        L36:
            java.util.List r0 = kotlin.collections.p.n()
        L3a:
            r2.H(r0)
            goto L7d
        L3e:
            com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorViewModel r0 = r2.t()
            androidx.lifecycle.LiveData r0 = r0.o()
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L56
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.p.X0(r0)
            if (r0 != 0) goto L5a
        L56:
            java.util.List r0 = kotlin.collections.p.n()
        L5a:
            r2.H(r0)
            goto L7d
        L5e:
            com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorViewModel r0 = r2.t()
            androidx.lifecycle.LiveData r0 = r0.o()
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L76
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.p.X0(r0)
            if (r0 != 0) goto L7a
        L76:
            java.util.List r0 = kotlin.collections.p.n()
        L7a:
            r2.G(r0)
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorBottomSheet.I():void");
    }

    private final void J() {
        OneShotEventHandler<p> f11 = t().f();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        f11.h(viewLifecycleOwner, new b(this));
        OneShotEventHandler<p> g11 = t().g();
        androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        g11.h(viewLifecycleOwner2, new c(this));
        t().m().observe(getViewLifecycleOwner(), new d(this));
        t().p().observe(getViewLifecycleOwner(), new e(this));
        t().o().observe(getViewLifecycleOwner(), new f(this));
    }

    public final FilterSelectorModel<T> L() {
        return (FilterSelectorModel) this.f38041e.getValue();
    }

    private final void O(List<? extends T> list) {
        for (T t11 : list) {
            kr.b<m<? extends RecyclerView.d0>> bVar = this.f38048y;
            if (bVar != null) {
                lr.a<m<? extends RecyclerView.d0>> aVar = this.f38047x;
                ai.c cVar = new ai.c(t().x(t11), bVar);
                cVar.d(cVar.x().d());
                p pVar = p.f75480a;
                aVar.n(cVar);
            }
        }
    }

    private final void Q(List<? extends T> list) {
        for (T t11 : list) {
            kr.b<m<? extends RecyclerView.d0>> bVar = this.f38048y;
            if (bVar != null) {
                lr.a<m<? extends RecyclerView.d0>> aVar = this.f38047x;
                ai.d dVar = new ai.d(t().x(t11), bVar);
                dVar.d(dVar.x().d());
                p pVar = p.f75480a;
                aVar.n(dVar);
            }
        }
    }

    private final s<m<?>> S() {
        return new g(this);
    }

    private final RecyclerView.o T() {
        int i11;
        int i12;
        FilterSelectorDisplayType f11 = t().r().f();
        if (f11 == null) {
            i11 = -1;
        } else {
            i11 = a.f38050a[f11.ordinal()];
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return new LinearLayoutManager(getContext());
            }
            E();
            return new LinearLayoutManager(getContext());
        }
        Context context = getContext();
        Integer d11 = t().r().d();
        if (d11 != null) {
            i12 = d11.intValue();
        } else {
            i12 = 3;
        }
        return new GridLayoutManager(context, i12);
    }

    public final void V() {
        this.f38047x.q();
        I();
        kr.b<m<? extends RecyclerView.d0>> bVar = this.f38048y;
        if (bVar != null) {
            bVar.G();
        }
    }

    private final void X() {
        List e11;
        e11 = q.e(this.f38047x);
        this.f38048y = kr.b.f61943t.g(e11);
        RecyclerView recyclerView = r().T;
        recyclerView.setLayoutManager(T());
        kr.b<m<? extends RecyclerView.d0>> bVar = this.f38048y;
        if (bVar != null) {
            sr.a a11 = sr.c.a(bVar);
            a11.z(S());
            boolean z11 = true;
            a11.y(true);
            if (t().r().g() != ListingsResponse.UISettings.FiltrationSetting.SelectionType.MULTI) {
                z11 = false;
            }
            a11.x(z11);
        }
        recyclerView.setAdapter(this.f38048y);
        if (this.f38048y != null) {
            I();
        }
    }

    public final t0.b K() {
        return this.f38044h;
    }

    @Override // w9.f
    /* renamed from: M */
    public FilterSelectorViewModel<T> t() {
        return (FilterSelectorViewModel) this.f38045i.getValue();
    }

    @Override // w9.f, androidx.fragment.app.j
    public int getTheme() {
        return z0.f70801k;
    }

    @Override // w9.f, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        X();
        J();
    }

    @Override // w9.f
    protected int s() {
        return this.f38043g;
    }

    @Override // w9.f
    public boolean w() {
        return this.f38046j;
    }
}
