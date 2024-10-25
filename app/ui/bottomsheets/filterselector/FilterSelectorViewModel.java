package com.forsale.app.ui.bottomsheets.filterselector;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.q0;
import androidx.lifecycle.z;
import com.forsale.app.utils.OneShotEventHandler;
import g00.l;
import hi.b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.collections.w;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.o;
import kotlin.text.s;
import wz.e;
import wz.p;
/* compiled from: FilterSelectorViewModel.kt */
/* loaded from: classes3.dex */
public final class FilterSelectorViewModel<T extends hi.b> extends q0 {
    private final b0<Boolean> A;
    private final z<Boolean> B;
    private final z<Boolean> C;
    private final b0<Boolean> D;
    private final LiveData<Boolean> E;
    private final z<Boolean> F;
    private final LiveData<Boolean> G;

    /* renamed from: a  reason: collision with root package name */
    private final FilterSelectorModel<T> f38069a;

    /* renamed from: b  reason: collision with root package name */
    private final b0<T> f38070b;

    /* renamed from: c  reason: collision with root package name */
    private final OneShotEventHandler<p> f38071c;

    /* renamed from: d  reason: collision with root package name */
    private final OneShotEventHandler<p> f38072d;

    /* renamed from: e  reason: collision with root package name */
    private final b0<p> f38073e;

    /* renamed from: f  reason: collision with root package name */
    private final LiveData<p> f38074f;

    /* renamed from: g  reason: collision with root package name */
    private final b0<List<T>> f38075g;

    /* renamed from: h  reason: collision with root package name */
    private final LiveData<List<T>> f38076h;

    /* renamed from: i  reason: collision with root package name */
    private final b0<Boolean> f38077i;

    /* renamed from: j  reason: collision with root package name */
    private final LiveData<Boolean> f38078j;

    /* renamed from: x  reason: collision with root package name */
    private final b0<String> f38079x;

    /* renamed from: y  reason: collision with root package name */
    private final b0<List<T>> f38080y;

    /* renamed from: z  reason: collision with root package name */
    private final LiveData<List<T>> f38081z;

    /* compiled from: Comparisons.kt */
    /* loaded from: classes3.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int a11;
            a11 = yz.b.a(Integer.valueOf(((hi.b) t11).getDisplayOrderSort()), Integer.valueOf(((hi.b) t12).getDisplayOrderSort()));
            return a11;
        }
    }

    /* compiled from: FilterSelectorViewModel.kt */
    /* loaded from: classes3.dex */
    static final class b implements c0, k {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f38084a;

        b(l function) {
            o.i(function, "function");
            this.f38084a = function;
        }

        @Override // kotlin.jvm.internal.k
        public final e<?> c() {
            return this.f38084a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c0) || !(obj instanceof k)) {
                return false;
            }
            return o.d(c(), ((k) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // androidx.lifecycle.c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38084a.invoke(obj);
        }
    }

    public FilterSelectorViewModel(FilterSelectorModel<T> selector) {
        o.i(selector, "selector");
        this.f38069a = selector;
        this.f38070b = new b0<>();
        Boolean bool = null;
        this.f38071c = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38072d = new OneShotEventHandler<>(null, 0, 3, null);
        b0<p> b0Var = new b0<>();
        this.f38073e = b0Var;
        this.f38074f = b0Var;
        b0<List<T>> b0Var2 = new b0<>();
        b0Var2.setValue(new ArrayList());
        this.f38075g = b0Var2;
        this.f38076h = b0Var2;
        b0<Boolean> b0Var3 = new b0<>();
        List<T> value = b0Var2.getValue();
        if (value != null) {
            o.f(value);
            bool = Boolean.valueOf(!value.isEmpty());
        }
        b0Var3.setValue(bool);
        this.f38077i = b0Var3;
        this.f38078j = b0Var3;
        b0<String> b0Var4 = new b0<>();
        this.f38079x = b0Var4;
        b0<List<T>> b0Var5 = new b0<>();
        b0Var5.setValue(w());
        this.f38080y = b0Var5;
        this.f38081z = b0Var5;
        this.A = new b0<>(Boolean.FALSE);
        final z<Boolean> zVar = new z<>();
        zVar.b(b0Var5, new b(new l<List<T>, p>() { // from class: com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorViewModel$showEmptyView$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(List<T> list) {
                boolean z11;
                z<Boolean> zVar2 = zVar;
                List<T> list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                zVar2.setValue(Boolean.valueOf(z11));
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(Object obj) {
                b((List) obj);
                return p.f75480a;
            }
        }));
        this.B = zVar;
        final z<Boolean> zVar2 = new z<>();
        zVar2.b(b0Var4, new b(new l<String, p>() { // from class: com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorViewModel$showClearSearch$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(String str) {
                boolean z11;
                boolean v11;
                z<Boolean> zVar3 = zVar2;
                if (str != null) {
                    v11 = s.v(str);
                    if (!v11) {
                        z11 = false;
                        zVar3.setValue(Boolean.valueOf(!z11));
                    }
                }
                z11 = true;
                zVar3.setValue(Boolean.valueOf(!z11));
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(String str) {
                b(str);
                return p.f75480a;
            }
        }));
        this.C = zVar2;
        b0<Boolean> b0Var6 = new b0<>(Boolean.valueOf(selector.c() != null));
        this.D = b0Var6;
        this.E = b0Var6;
        final z<Boolean> zVar3 = new z<>();
        zVar3.b(b0Var2, new b(new l<List<T>, p>(this) { // from class: com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorViewModel$_maxReached$1$1

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FilterSelectorViewModel<T> f38082a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f38082a = this;
            }

            public final void b(List<T> list) {
                p pVar;
                boolean z11;
                Integer c11 = this.f38082a.r().c();
                if (c11 != null) {
                    z<Boolean> zVar4 = zVar3;
                    int intValue = c11.intValue();
                    o.f(list);
                    if (list.size() >= intValue) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zVar4.setValue(Boolean.valueOf(z11));
                    pVar = p.f75480a;
                } else {
                    pVar = null;
                }
                if (pVar == null) {
                    zVar3.setValue(Boolean.FALSE);
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(Object obj) {
                b((List) obj);
                return p.f75480a;
            }
        }));
        this.F = zVar3;
        this.G = zVar3;
    }

    private final List<Integer> l() {
        List<Integer> n11;
        int y11;
        List<Integer> n12;
        if (o.d(this.A.getValue(), Boolean.FALSE)) {
            List<Integer> e11 = this.f38069a.e();
            if (e11 == null) {
                n12 = r.n();
                return n12;
            }
            return e11;
        }
        List<T> value = this.f38075g.getValue();
        if (value == null) {
            n11 = r.n();
            return n11;
        }
        List<T> list = value;
        y11 = kotlin.collections.s.y(list, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (T t11 : list) {
            arrayList.add(Integer.valueOf(t11.getSelectedId()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(T t11, T t12, boolean z11) {
        List<T> value;
        Boolean bool = null;
        if (z11) {
            List<T> value2 = this.f38075g.getValue();
            boolean z12 = false;
            if (value2 != null && !value2.contains(t11)) {
                z12 = true;
            }
            if (z12) {
                b0<List<T>> b0Var = this.f38075g;
                List<T> value3 = b0Var.getValue();
                if (value3 != null) {
                    value3.add(t12);
                } else {
                    value3 = null;
                }
                b0Var.postValue(value3);
                this.f38070b.postValue(t12);
            }
        } else if (!z11) {
            b0<List<T>> b0Var2 = this.f38075g;
            List<T> value4 = b0Var2.getValue();
            if (value4 != null) {
                value4.remove(t12);
            } else {
                value4 = null;
            }
            b0Var2.postValue(value4);
            this.f38070b.postValue(null);
        }
        b0<Boolean> b0Var3 = this.f38077i;
        if (this.f38075g.getValue() != null) {
            bool = Boolean.valueOf(!value.isEmpty());
        }
        b0Var3.postValue(bool);
    }

    private final List<T> w() {
        List<T> a12;
        List M0;
        a12 = CollectionsKt___CollectionsKt.a1(this.f38069a.b());
        final List<Integer> e11 = this.f38069a.e();
        if (e11 != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : a12) {
                if (e11.contains(Integer.valueOf(((hi.b) obj).getSelectedId()))) {
                    arrayList.add(obj);
                }
            }
            w.K(a12, new l<T, Boolean>() { // from class: com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorViewModel$initItemsList$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
                @Override // g00.l
                /* renamed from: b */
                public final Boolean invoke(b it2) {
                    o.i(it2, "it");
                    return Boolean.valueOf(e11.contains(Integer.valueOf(it2.getSelectedId())));
                }
            });
            M0 = CollectionsKt___CollectionsKt.M0(arrayList, new a());
            a12.addAll(0, M0);
        }
        return a12;
    }

    public final void A() {
        OneShotEventHandler.d(this.f38072d, null, 1, null);
    }

    public final void B() {
        this.f38075g.postValue(new ArrayList());
        this.f38073e.postValue(p.f75480a);
    }

    public final void C(String str) {
        boolean z11;
        List list;
        boolean G;
        List<T> a12;
        if (str != null) {
            this.A.postValue(Boolean.TRUE);
            if (str.length() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                list = CollectionsKt___CollectionsKt.a1(this.f38069a.b());
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : this.f38069a.b()) {
                    G = s.G(((hi.b) obj).getLabel(), str, true);
                    if (G) {
                        arrayList.add(obj);
                    }
                }
                list = arrayList;
            }
            b0<List<T>> b0Var = this.f38080y;
            a12 = CollectionsKt___CollectionsKt.a1(list);
            b0Var.postValue(a12);
        }
    }

    public final OneShotEventHandler<p> f() {
        return this.f38071c;
    }

    public final OneShotEventHandler<p> g() {
        return this.f38072d;
    }

    public final LiveData<Boolean> h() {
        return this.f38078j;
    }

    public final LiveData<Boolean> j() {
        return this.E;
    }

    public final LiveData<Boolean> k() {
        return this.G;
    }

    public final LiveData<p> m() {
        return this.f38074f;
    }

    public final LiveData<List<T>> o() {
        return this.f38081z;
    }

    public final b0<String> p() {
        return this.f38079x;
    }

    public final LiveData<List<T>> q() {
        return this.f38076h;
    }

    public final FilterSelectorModel<T> r() {
        return this.f38069a;
    }

    public final z<Boolean> s() {
        return this.C;
    }

    public final z<Boolean> t() {
        return this.B;
    }

    public final ai.a<T> x(final T item) {
        int i11;
        o.i(item, "item");
        T value = this.f38070b.getValue();
        if (value != null) {
            i11 = value.getSelectedId();
        } else {
            i11 = -1;
        }
        return new ai.a<>(item, i11, l(), new l<Pair<? extends T, ? extends Boolean>, p>() { // from class: com.forsale.app.ui.bottomsheets.filterselector.FilterSelectorViewModel$initViewModel$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Incorrect types in method signature: (Lcom/forsale/app/ui/bottomsheets/filterselector/FilterSelectorViewModel<TT;>;TT;)V */
            {
                super(1);
            }

            public final void b(Pair<? extends T, Boolean> pair) {
                o.i(pair, "<name for destructuring parameter 0>");
                boolean booleanValue = pair.b().booleanValue();
                FilterSelectorViewModel.this.v(item, (b) pair.a(), booleanValue);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(Object obj) {
                b((Pair) obj);
                return p.f75480a;
            }
        }, false, this.G, 16, null);
    }

    public final void y() {
        this.f38071c.i(p.f75480a);
    }

    public final void z() {
        this.f38079x.postValue("");
    }
}
