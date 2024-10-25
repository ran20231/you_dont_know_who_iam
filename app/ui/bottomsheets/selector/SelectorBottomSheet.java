package com.forsale.app.ui.bottomsheets.selector;

import aa.c4;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.a0;
import g00.l;
import hi.b;
import java.util.List;
import kotlin.collections.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowCollector;
import kr.m;
import kr.s;
import t9.p0;
import t9.z0;
import w3.a;
import w9.f;
import wz.h;
import wz.p;
/* compiled from: SelectorBottomSheet.kt */
/* loaded from: classes3.dex */
public final class SelectorBottomSheet<T extends hi.b> extends f<c4, SelectorViewModel<T>> {

    /* renamed from: e  reason: collision with root package name */
    private final nh.a<T> f39086e;

    /* renamed from: f  reason: collision with root package name */
    private final l<T, p> f39087f;

    /* renamed from: g  reason: collision with root package name */
    private final int f39088g;

    /* renamed from: h  reason: collision with root package name */
    private final t0.b f39089h;

    /* renamed from: i  reason: collision with root package name */
    private final h f39090i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f39091j;

    /* renamed from: x  reason: collision with root package name */
    private final lr.a<m<? extends RecyclerView.d0>> f39092x;

    /* renamed from: y  reason: collision with root package name */
    private kr.b<m<? extends RecyclerView.d0>> f39093y;

    /* renamed from: z  reason: collision with root package name */
    public static final a f39085z = new a(null);
    public static final int A = 8;

    /* compiled from: SelectorBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T extends hi.b> void a(nh.a<T> selectorModel, FragmentManager fragmentManager, l<? super T, p> onActionDone) {
            o.i(selectorModel, "selectorModel");
            o.i(fragmentManager, "fragmentManager");
            o.i(onActionDone, "onActionDone");
            new SelectorBottomSheet(selectorModel, onActionDone).show(fragmentManager, "SelectorBottomSheet");
        }
    }

    /* compiled from: SelectorBottomSheet.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f39094a;

        static {
            int[] iArr = new int[SelectorType.values().length];
            try {
                iArr[SelectorType.GRID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelectorType.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f39094a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectorBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class c implements FlowCollector<p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SelectorBottomSheet<T> f39095a;

        c(SelectorBottomSheet<T> selectorBottomSheet) {
            this.f39095a = selectorBottomSheet;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            T value = this.f39095a.t().g().getValue();
            if (value != null) {
                ((SelectorBottomSheet) this.f39095a).f39087f.invoke(value);
            }
            this.f39095a.dismiss();
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectorBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class d implements FlowCollector<p> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SelectorBottomSheet<T> f39096a;

        d(SelectorBottomSheet<T> selectorBottomSheet) {
            this.f39096a = selectorBottomSheet;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            this.f39096a.dismiss();
            return p.f75480a;
        }
    }

    /* compiled from: SelectorBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class e implements s<m<?>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SelectorBottomSheet<T> f39097a;

        e(SelectorBottomSheet<T> selectorBottomSheet) {
            this.f39097a = selectorBottomSheet;
        }

        @Override // kr.s
        public void a(m<?> item, boolean z11) {
            o.i(item, "item");
            if (item instanceof hi.c) {
                ((hi.c) item).x().c(z11);
                kr.b bVar = ((SelectorBottomSheet) this.f39097a).f39093y;
                if (bVar != null) {
                    kr.b.I(bVar, ((SelectorBottomSheet) this.f39097a).f39092x.s(item), null, 2, null);
                }
            } else if (item instanceof hi.a) {
                ((hi.a) item).x().c(z11);
                kr.b bVar2 = ((SelectorBottomSheet) this.f39097a).f39093y;
                if (bVar2 != null) {
                    kr.b.I(bVar2, ((SelectorBottomSheet) this.f39097a).f39092x.s(item), null, 2, null);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectorBottomSheet(nh.a<T> selectorModel, l<? super T, p> onActionDone) {
        h a11;
        o.i(selectorModel, "selectorModel");
        o.i(onActionDone, "onActionDone");
        this.f39086e = selectorModel;
        this.f39087f = onActionDone;
        this.f39088g = t9.t0.f70302t0;
        w3.c cVar = new w3.c();
        cVar.a(kotlin.jvm.internal.s.b(SelectorViewModel.class), new l<w3.a, SelectorViewModel<T>>(this) { // from class: com.forsale.app.ui.bottomsheets.selector.SelectorBottomSheet$factory$1$1

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SelectorBottomSheet<T> f39098a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f39098a = this;
            }

            @Override // g00.l
            /* renamed from: b */
            public final SelectorViewModel<T> invoke(a initializer) {
                nh.a aVar;
                o.i(initializer, "$this$initializer");
                aVar = ((SelectorBottomSheet) this.f39098a).f39086e;
                return new SelectorViewModel<>(aVar);
            }
        });
        this.f39089h = cVar.b();
        a11 = kotlin.d.a(new g00.a<SelectorViewModel<T>>(this) { // from class: com.forsale.app.ui.bottomsheets.selector.SelectorBottomSheet$viewModel$2

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SelectorBottomSheet<T> f39099a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f39099a = this;
            }

            @Override // g00.a
            /* renamed from: b */
            public final SelectorViewModel<T> invoke() {
                SelectorBottomSheet<T> selectorBottomSheet = this.f39099a;
                q0 a12 = new t0(selectorBottomSheet, selectorBottomSheet.I()).a(SelectorViewModel.class);
                o.g(a12, "null cannot be cast to non-null type com.forsale.app.ui.bottomsheets.selector.SelectorViewModel<T of com.forsale.app.ui.bottomsheets.selector.SelectorBottomSheet>");
                return (SelectorViewModel) a12;
            }
        });
        this.f39090i = a11;
        this.f39091j = true;
        this.f39092x = lr.a.f62553j.a();
    }

    private final void C() {
        Drawable drawable;
        Context context = getContext();
        if (context != null && (drawable = androidx.core.content.b.getDrawable(context, t9.q0.f69825z)) != null) {
            o.f(drawable);
            bg.a aVar = new bg.a(drawable);
            int dimension = (int) context.getResources().getDimension(p0.f69720t);
            RecyclerView recyclerView = r().Q;
            if (recyclerView != null) {
                recyclerView.j(aVar);
                recyclerView.j(new a0(dimension, 0, 0, 6, null));
            }
        }
    }

    private final void D(List<? extends T> list) {
        for (T t11 : list) {
            lr.a<m<? extends RecyclerView.d0>> aVar = this.f39092x;
            hi.d<T> j11 = t().j(t11);
            androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
            o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            hi.a aVar2 = new hi.a(j11, viewLifecycleOwner);
            aVar2.d(aVar2.x().b());
            p pVar = p.f75480a;
            aVar.n(aVar2);
        }
    }

    private final void E(List<? extends T> list) {
        for (T t11 : list) {
            lr.a<m<? extends RecyclerView.d0>> aVar = this.f39092x;
            hi.d<T> j11 = t().j(t11);
            androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
            o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            hi.c cVar = new hi.c(j11, viewLifecycleOwner);
            cVar.d(cVar.x().b());
            p pVar = p.f75480a;
            aVar.n(cVar);
        }
    }

    private final void G() {
        int i11;
        SelectorType d11 = t().h().d();
        if (d11 == null) {
            i11 = -1;
        } else {
            i11 = b.f39094a[d11.ordinal()];
        }
        if (i11 != 1) {
            if (i11 != 2) {
                E(t().h().a());
                return;
            } else {
                E(t().h().a());
                return;
            }
        }
        D(t().h().a());
    }

    private final void H() {
        OneShotEventHandler<p> f11 = t().f();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        f11.h(viewLifecycleOwner, new c(this));
        OneShotEventHandler<p> e11 = t().e();
        androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        e11.h(viewLifecycleOwner2, new d(this));
    }

    private final s<m<?>> K() {
        return new e(this);
    }

    private final RecyclerView.o L() {
        int i11;
        int i12;
        SelectorType d11 = t().h().d();
        if (d11 == null) {
            i11 = -1;
        } else {
            i11 = b.f39094a[d11.ordinal()];
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return new LinearLayoutManager(getContext());
            }
            C();
            return new LinearLayoutManager(getContext());
        }
        Context context = getContext();
        Integer b11 = t().h().b();
        if (b11 != null) {
            i12 = b11.intValue();
        } else {
            i12 = 3;
        }
        return new GridLayoutManager(context, i12);
    }

    private final void M() {
        List e11;
        e11 = q.e(this.f39092x);
        this.f39093y = kr.b.f61943t.g(e11);
        RecyclerView recyclerView = r().Q;
        recyclerView.setLayoutManager(L());
        kr.b<m<? extends RecyclerView.d0>> bVar = this.f39093y;
        if (bVar != null) {
            sr.a a11 = sr.c.a(bVar);
            a11.z(K());
            a11.y(true);
            a11.x(t().h().f());
        }
        recyclerView.setAdapter(this.f39093y);
        G();
    }

    public final t0.b I() {
        return this.f39089h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w9.f
    /* renamed from: J */
    public SelectorViewModel<T> t() {
        return (SelectorViewModel) this.f39090i.getValue();
    }

    @Override // w9.f, androidx.fragment.app.j
    public int getTheme() {
        return z0.f70801k;
    }

    @Override // w9.f, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        M();
        H();
    }

    @Override // w9.f
    protected int s() {
        return this.f39088g;
    }

    @Override // w9.f
    public boolean w() {
        return this.f39091j;
    }
}
