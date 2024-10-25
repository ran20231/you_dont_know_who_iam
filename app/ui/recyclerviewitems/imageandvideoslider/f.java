package com.forsale.app.ui.recyclerviewitems.imageandvideoslider;

import aa.mc;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.s;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowCollector;
import t9.t0;
import wz.p;
/* compiled from: SliderImagesAdapter.kt */
/* loaded from: classes3.dex */
public final class f extends RecyclerView.Adapter<a> {

    /* renamed from: a  reason: collision with root package name */
    private final d f39488a;

    /* renamed from: b  reason: collision with root package name */
    private final s f39489b;

    /* compiled from: SliderImagesAdapter.kt */
    /* loaded from: classes3.dex */
    public static final class a extends RecyclerView.d0 {

        /* renamed from: a  reason: collision with root package name */
        private final mc f39490a;

        /* renamed from: b  reason: collision with root package name */
        private final s f39491b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SliderImagesAdapter.kt */
        /* renamed from: com.forsale.app.ui.recyclerviewitems.imageandvideoslider.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0448a implements FlowCollector<Integer> {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f39493b;

            C0448a(d dVar) {
                this.f39493b = dVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(Integer num, zz.a<? super p> aVar) {
                if (num != null && (a.this.f39491b instanceof ImageSliderActivity)) {
                    String str = this.f39493b.c().get(num.intValue());
                    o.h(str, "get(...)");
                    ((ImageSliderActivity) a.this.f39491b).z0(str);
                }
                return p.f75480a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SliderImagesAdapter.kt */
        /* loaded from: classes3.dex */
        public static final class b implements FlowCollector<Integer> {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f39495b;

            b(d dVar) {
                this.f39495b = dVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(Integer num, zz.a<? super p> aVar) {
                if (num != null && (a.this.f39491b instanceof ImageSliderActivity)) {
                    String str = this.f39495b.c().get(num.intValue());
                    o.h(str, "get(...)");
                    ((ImageSliderActivity) a.this.f39491b).B0(str);
                }
                return p.f75480a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SliderImagesAdapter.kt */
        /* loaded from: classes3.dex */
        public static final class c implements FlowCollector<p> {
            c() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(p pVar, zz.a<? super p> aVar) {
                if (a.this.f39491b instanceof ImageSliderActivity) {
                    ((ImageSliderActivity) a.this.f39491b).finish();
                }
                return p.f75480a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc binding, s lifeCycleOwner) {
            super(binding.getRoot());
            o.i(binding, "binding");
            o.i(lifeCycleOwner, "lifeCycleOwner");
            this.f39490a = binding;
            this.f39491b = lifeCycleOwner;
        }

        public final void b(d item) {
            o.i(item, "item");
            mc mcVar = this.f39490a;
            mcVar.i0(item);
            mcVar.h0(Integer.valueOf(getBindingAdapterPosition()));
            s sVar = this.f39491b;
            if (sVar != null) {
                if (sVar.getLifecycle().b() != Lifecycle.State.DESTROYED) {
                    item.d().h(this.f39491b, new C0448a(item));
                    item.e().h(this.f39491b, new b(item));
                    item.b().h(this.f39491b, new c());
                }
                mcVar.u();
            }
        }
    }

    public f(d viewModel, s lifeCycleOwner) {
        o.i(viewModel, "viewModel");
        o.i(lifeCycleOwner, "lifeCycleOwner");
        this.f39488a = viewModel;
        this.f39489b = lifeCycleOwner;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c */
    public void onBindViewHolder(a viewHolder, int i11) {
        o.i(viewHolder, "viewHolder");
        viewHolder.b(this.f39488a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d */
    public a onCreateViewHolder(ViewGroup view, int i11) {
        o.i(view, "view");
        mc f02 = mc.f0(LayoutInflater.from(view.getContext()).inflate(t0.H2, view, false));
        o.h(f02, "bind(...)");
        return new a(f02, this.f39489b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f39488a.c().size();
    }
}
