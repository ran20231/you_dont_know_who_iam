package com.forsale.app.features.postad.addons.addonsgroupitem;

import aa.ih;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.c0;
import com.forsale.app.features.postad.addons.addonitem.AddonItem;
import com.forsale.app.features.postad.addons.addonitem.AddonItemViewModel;
import com.forsale.app.features.postad.addons.addonsgroupitem.AddonsGroupItem;
import com.forsale.app.ui.recyclerviewitems.sectionfooteritem.SectionFooterItemViewModel;
import g00.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kr.b;
import kr.m;
import kr.s;
import pr.a;
import sr.c;
import t9.r0;
import t9.t0;
import wz.p;
/* compiled from: AddonsGroupItem.kt */
/* loaded from: classes2.dex */
public final class AddonsGroupItem extends a<ViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    private final AddonsGroupItemViewModel f34440f;

    /* renamed from: g  reason: collision with root package name */
    private final Fragment f34441g;

    /* renamed from: h  reason: collision with root package name */
    private final CoroutineScope f34442h;

    /* renamed from: i  reason: collision with root package name */
    private final int f34443i;

    /* renamed from: j  reason: collision with root package name */
    private final int f34444j;

    /* compiled from: AddonsGroupItem.kt */
    /* loaded from: classes2.dex */
    public static final class ViewHolder extends b.c<AddonsGroupItem> {

        /* renamed from: a  reason: collision with root package name */
        private final ih f34445a;

        /* renamed from: b  reason: collision with root package name */
        private final Fragment f34446b;

        /* renamed from: c  reason: collision with root package name */
        private final lr.a<m<?>> f34447c;

        /* renamed from: d  reason: collision with root package name */
        private final lr.a<m<?>> f34448d;

        /* renamed from: e  reason: collision with root package name */
        private final lr.a<m<?>> f34449e;

        /* renamed from: f  reason: collision with root package name */
        private kr.b<m<?>> f34450f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AddonsGroupItem.kt */
        /* loaded from: classes2.dex */
        public static final class a implements c0<Boolean> {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AddonsGroupItem f34452b;

            a(AddonsGroupItem addonsGroupItem) {
                this.f34452b = addonsGroupItem;
            }

            @Override // androidx.lifecycle.c0
            /* renamed from: a */
            public final void onChanged(Boolean bool) {
                ViewHolder.this.g(this.f34452b, bool);
            }
        }

        /* compiled from: AddonsGroupItem.kt */
        /* loaded from: classes2.dex */
        public static final class b implements s<m<?>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AddonsGroupItem f34453a;

            b(AddonsGroupItem addonsGroupItem) {
                this.f34453a = addonsGroupItem;
            }

            @Override // kr.s
            public void a(m<?> addonItem, boolean z11) {
                o.i(addonItem, "addonItem");
                if (addonItem instanceof AddonItem) {
                    this.f34453a.f34440f.f(((AddonItem) addonItem).x(), z11);
                }
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ViewHolder(aa.ih r6, androidx.fragment.app.Fragment r7) {
            /*
                r5 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r6, r0)
                java.lang.String r0 = "fragment"
                kotlin.jvm.internal.o.i(r7, r0)
                android.view.View r0 = r6.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r5.<init>(r0)
                r5.f34445a = r6
                r5.f34446b = r7
                lr.a r7 = new lr.a
                r7.<init>()
                r5.f34447c = r7
                lr.a r0 = new lr.a
                r0.<init>()
                r5.f34448d = r0
                lr.a r1 = new lr.a
                r1.<init>()
                r5.f34449e = r1
                kr.b$a r2 = kr.b.f61943t
                r3 = 3
                lr.a[] r3 = new lr.a[r3]
                r4 = 0
                r3[r4] = r7
                r7 = 1
                r3[r7] = r0
                r0 = 2
                r3[r0] = r1
                java.util.List r0 = kotlin.collections.p.q(r3)
                java.util.Collection r0 = (java.util.Collection) r0
                kr.b r0 = r2.g(r0)
                r5.f34450f = r0
                androidx.recyclerview.widget.RecyclerView r6 = r6.O
                androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
                android.content.Context r1 = r6.getContext()
                r0.<init>(r1)
                r6.setLayoutManager(r0)
                kr.b<kr.m<?>> r6 = r5.f34450f
                r6.setHasStableIds(r7)
                sr.a r6 = sr.c.a(r6)
                r6.y(r7)
                r6.x(r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.addons.addonsgroupitem.AddonsGroupItem.ViewHolder.<init>(aa.ih, androidx.fragment.app.Fragment):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(AddonsGroupItem addonsGroupItem, Boolean bool) {
            boolean z11;
            s<m<?>> j11 = j(addonsGroupItem);
            if (bool != null) {
                bool.booleanValue();
                m(addonsGroupItem);
            }
            if (bool != null) {
                z11 = bool.booleanValue();
            } else {
                z11 = true;
            }
            k(addonsGroupItem, z11);
            if (bool != null) {
                l(addonsGroupItem, bool.booleanValue(), addonsGroupItem.w());
            }
            c.a(this.f34450f).z(j11);
            this.f34445a.O.setAdapter(this.f34450f);
        }

        private final AddonItem i(AddonItemViewModel addonItemViewModel, AddonsGroupItem addonsGroupItem) {
            AddonItem addonItem = new AddonItem(addonItemViewModel, addonsGroupItem.x(), addonsGroupItem.f34440f.b().getBackgroundColor());
            addonItem.o(addonItemViewModel.e());
            addonItem.d(addonItemViewModel.l());
            return addonItem;
        }

        private final s<m<?>> j(AddonsGroupItem addonsGroupItem) {
            return new b(addonsGroupItem);
        }

        private final void k(AddonsGroupItem addonsGroupItem, boolean z11) {
            Object k02;
            int y11;
            if (z11) {
                List<AddonItemViewModel> a11 = addonsGroupItem.f34440f.a();
                y11 = kotlin.collections.s.y(a11, 10);
                ArrayList arrayList = new ArrayList(y11);
                for (AddonItemViewModel addonItemViewModel : a11) {
                    AddonItem i11 = i(addonItemViewModel, addonsGroupItem);
                    this.f34448d.n(i11);
                    arrayList.add(i11);
                }
            } else if (!z11) {
                k02 = CollectionsKt___CollectionsKt.k0(addonsGroupItem.f34440f.a());
                this.f34448d.n(i((AddonItemViewModel) k02, addonsGroupItem));
            }
        }

        private final void l(final AddonsGroupItem addonsGroupItem, boolean z11, CoroutineScope coroutineScope) {
            this.f34449e.n(new fi.a(new SectionFooterItemViewModel(coroutineScope, z11, addonsGroupItem.f34440f.a().size(), new l<Boolean, p>() { // from class: com.forsale.app.features.postad.addons.addonsgroupitem.AddonsGroupItem$ViewHolder$initFooterItem$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void invoke(boolean z12) {
                    AddonsGroupItem.ViewHolder.this.e(addonsGroupItem);
                    AddonsGroupItem.ViewHolder.this.g(addonsGroupItem, Boolean.valueOf(z12));
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return p.f75480a;
                }
            })));
        }

        private final void m(AddonsGroupItem addonsGroupItem) {
            ei.a aVar = new ei.a(new gi.a(addonsGroupItem.f34440f.b().getTitle(), addonsGroupItem.f34440f.b().getBackgroundColor(), addonsGroupItem.f34440f.b().getForegroundColor()));
            aVar.r(false);
            this.f34447c.n(aVar);
        }

        @Override // kr.b.c
        /* renamed from: h */
        public void b(AddonsGroupItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            item.f34440f.e().observe(this.f34446b.getViewLifecycleOwner(), new a(item));
        }

        @Override // kr.b.c
        /* renamed from: n */
        public void e(AddonsGroupItem item) {
            o.i(item, "item");
            this.f34445a.O.setAdapter(null);
            this.f34447c.r().clear();
            this.f34447c.q();
            this.f34448d.r().clear();
            this.f34448d.q();
            this.f34449e.r().clear();
            this.f34449e.q();
            item.f34440f.e().removeObservers(this.f34446b.getViewLifecycleOwner());
        }
    }

    public AddonsGroupItem(AddonsGroupItemViewModel viewModel, Fragment fragment, CoroutineScope coroutineScope) {
        o.i(viewModel, "viewModel");
        o.i(fragment, "fragment");
        o.i(coroutineScope, "coroutineScope");
        this.f34440f = viewModel;
        this.f34441g = fragment;
        this.f34442h = coroutineScope;
        this.f34443i = t0.f70187c4;
        this.f34444j = r0.Z6;
    }

    @Override // kr.m
    public int getType() {
        return this.f34444j;
    }

    @Override // pr.a
    public int t() {
        return this.f34443i;
    }

    public final CoroutineScope w() {
        return this.f34442h;
    }

    public final Fragment x() {
        return this.f34441g;
    }

    @Override // pr.a
    /* renamed from: y */
    public ViewHolder u(View v11) {
        o.i(v11, "v");
        ih f02 = ih.f0(v11);
        o.h(f02, "bind(...)");
        return new ViewHolder(f02, this.f34441g);
    }
}
