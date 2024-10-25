package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime;

import aa.yj;
import android.view.View;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.c;
import androidx.compose.runtime.z;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.c0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.a0;
import com.forsale.designSystem.theme.ThemeKt;
import e2.h;
import falcon.chat.Chat;
import g00.l;
import j0.n1;
import java.util.List;
import kotlin.jvm.internal.o;
import kr.b;
import kr.m;
import pr.a;
import t9.p0;
import t9.r0;
import t9.t0;
import wz.p;
/* compiled from: ListingLifeTimeItem.kt */
/* loaded from: classes2.dex */
public final class ListingLifeTimeItem extends a<ListingLifeTimeViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    private final ListingLifeTimeItemViewModel f27779f;

    /* renamed from: g  reason: collision with root package name */
    private final Fragment f27780g;

    /* renamed from: h  reason: collision with root package name */
    private final FragmentManager f27781h;

    /* renamed from: i  reason: collision with root package name */
    private final l<Boolean, p> f27782i;

    /* renamed from: j  reason: collision with root package name */
    private final int f27783j;

    /* renamed from: k  reason: collision with root package name */
    private final int f27784k;

    /* compiled from: ListingLifeTimeItem.kt */
    /* loaded from: classes2.dex */
    public static final class ListingLifeTimeViewHolder extends b.c<ListingLifeTimeItem> {

        /* renamed from: a  reason: collision with root package name */
        private final yj f27785a;

        /* renamed from: b  reason: collision with root package name */
        private final lr.a<m<?>> f27786b;

        /* renamed from: c  reason: collision with root package name */
        private final b<m<?>> f27787c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ListingLifeTimeItem.kt */
        /* loaded from: classes2.dex */
        public static final class a implements c0<List<? extends Object>> {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ListingLifeTimeItem f27789b;

            a(ListingLifeTimeItem listingLifeTimeItem) {
                this.f27789b = listingLifeTimeItem;
            }

            @Override // androidx.lifecycle.c0
            /* renamed from: a */
            public final void onChanged(List<? extends Object> list) {
                ListingLifeTimeViewHolder.this.f27786b.r().clear();
                ListingLifeTimeViewHolder listingLifeTimeViewHolder = ListingLifeTimeViewHolder.this;
                ListingLifeTimeItem listingLifeTimeItem = this.f27789b;
                o.f(list);
                listingLifeTimeViewHolder.k(listingLifeTimeItem, list);
                RecyclerView.Adapter adapter = ListingLifeTimeViewHolder.this.f27785a.T.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ListingLifeTimeViewHolder(aa.yj r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f27785a = r3
                lr.a r3 = new lr.a
                r3.<init>()
                r2.f27786b = r3
                kr.b$a r0 = kr.b.f61943t
                kr.b r3 = r0.i(r3)
                r2.f27787c = r3
                r2.l()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.ListingLifeTimeItem.ListingLifeTimeViewHolder.<init>(aa.yj):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
            r0 = kotlin.collections.CollectionsKt___CollectionsKt.Q0(r12, r13);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void j(com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.ListingLifeTimeItem r11, java.util.List<? extends java.lang.Object> r12, int r13) {
            /*
                r10 = this;
                if (r12 == 0) goto L7f
                r0 = r12
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.List r0 = kotlin.collections.p.Q0(r0, r13)
                if (r0 == 0) goto L7f
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r0 = r0.iterator()
            L16:
                boolean r2 = r0.hasNext()
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L36
                java.lang.Object r2 = r0.next()
                boolean r5 = r2 instanceof com.forsale.app.datalayer.network.responses.listingdetails.ListingPinOption
                if (r5 == 0) goto L2f
                r5 = r2
                com.forsale.app.datalayer.network.responses.listingdetails.ListingPinOption r5 = (com.forsale.app.datalayer.network.responses.listingdetails.ListingPinOption) r5
                com.forsale.app.datalayer.network.responses.listingdetails.ListingPinOptionType r5 = r5.getType()
                if (r5 == 0) goto L30
            L2f:
                r3 = r4
            L30:
                if (r3 == 0) goto L16
                r1.add(r2)
                goto L16
            L36:
                java.util.Iterator r0 = r1.iterator()
            L3a:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L7f
                java.lang.Object r1 = r0.next()
                lr.a<kr.m<?>> r2 = r10.f27786b
                kr.m[] r5 = new kr.m[r4]
                ub.a r6 = new ub.a
                com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.LifeTimeStatusViewModel r7 = new com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.LifeTimeStatusViewModel
                com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.ListingLifeTimeItemViewModel r8 = r11.x()
                r7.<init>(r1, r8)
                androidx.fragment.app.Fragment r8 = r11.v()
                androidx.lifecycle.s r8 = r8.getViewLifecycleOwner()
                java.lang.String r9 = "getViewLifecycleOwner(...)"
                kotlin.jvm.internal.o.h(r8, r9)
                r6.<init>(r7, r8)
                r5[r3] = r6
                r2.n(r5)
                int r1 = r12.indexOf(r1)
                int r2 = r13 + (-1)
                if (r1 == r2) goto L3a
                lr.a<kr.m<?>> r1 = r10.f27786b
                kr.m[] r2 = new kr.m[r4]
                bg.c r5 = new bg.c
                r5.<init>()
                r2[r3] = r5
                r1.n(r2)
                goto L3a
            L7f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.ListingLifeTimeItem.ListingLifeTimeViewHolder.j(com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.ListingLifeTimeItem, java.util.List, int):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void k(ListingLifeTimeItem listingLifeTimeItem, List<? extends Object> list) {
            int i11 = 2;
            if (list.size() <= 2) {
                i11 = list.size();
            }
            if (listingLifeTimeItem.x().o().j()) {
                listingLifeTimeItem.x().o().k(false);
            } else if (o.d(listingLifeTimeItem.x().p().getValue(), Boolean.TRUE)) {
                i11 = list.size();
            }
            j(listingLifeTimeItem, list, i11);
        }

        private final void l() {
            int dimension = (int) Chat.f55705a.k().getResources().getDimension(p0.f69715o);
            RecyclerView recyclerView = this.f27785a.T;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setHasFixedSize(false);
            recyclerView.j(new a0(dimension, 0, dimension, 2, null));
        }

        @Override // kr.b.c
        /* renamed from: i */
        public void b(final ListingLifeTimeItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            yj yjVar = this.f27785a;
            yjVar.U(item.v().getViewLifecycleOwner());
            yjVar.h0(item.x());
            yjVar.T.setAdapter(this.f27787c);
            LifeCycleUtilsKt.b(item.v(), new ListingLifeTimeItem$ListingLifeTimeViewHolder$bindView$2(item, null));
            LifeCycleUtilsKt.b(item.v(), new ListingLifeTimeItem$ListingLifeTimeViewHolder$bindView$3(item, null));
            item.x().d().observe(item.v().getViewLifecycleOwner(), new a(item));
            this.f27785a.Q.setContent(r0.b.c(1727111423, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.ListingLifeTimeItem$ListingLifeTimeViewHolder$bindView$5
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar, int i11) {
                    if ((i11 & 11) == 2 && aVar.i()) {
                        aVar.L();
                        return;
                    }
                    if (c.I()) {
                        c.U(1727111423, i11, -1, "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.ListingLifeTimeItem.ListingLifeTimeViewHolder.bindView.<anonymous> (ListingLifeTimeItem.kt:88)");
                    }
                    final ListingLifeTimeItem listingLifeTimeItem = ListingLifeTimeItem.this;
                    ThemeKt.a(null, null, r0.b.b(aVar, -2006400248, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.ListingLifeTimeItem$ListingLifeTimeViewHolder$bindView$5.1
                        {
                            super(2);
                        }

                        private static final String c(n1<String> n1Var) {
                            return n1Var.getValue();
                        }

                        public final void b(androidx.compose.runtime.a aVar2, int i12) {
                            if ((i12 & 11) == 2 && aVar2.i()) {
                                aVar2.L();
                                return;
                            }
                            if (c.I()) {
                                c.U(-2006400248, i12, -1, "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.ListingLifeTimeItem.ListingLifeTimeViewHolder.bindView.<anonymous>.<anonymous> (ListingLifeTimeItem.kt:89)");
                            }
                            n1 b11 = z.b(ListingLifeTimeItem.this.x().i(), null, aVar2, 8, 1);
                            if (ListingLifeTimeItem.this.x().l().getBundle() != null) {
                                aVar2.C(622114289);
                                SellerBundleKt.a(ListingLifeTimeItem.this.x().l().getBundle(), c(b11), aVar2, 8);
                                aVar2.S();
                            } else {
                                aVar2.C(622114412);
                                SpacerKt.a(SizeKt.i(androidx.compose.ui.c.f7566a, h.l(24)), aVar2, 6);
                                aVar2.S();
                            }
                            if (c.I()) {
                                c.T();
                            }
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return p.f75480a;
                        }
                    }), aVar, 384, 3);
                    if (c.I()) {
                        c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar, Integer num) {
                    b(aVar, num.intValue());
                    return p.f75480a;
                }
            }));
        }

        @Override // kr.b.c
        /* renamed from: m */
        public void e(ListingLifeTimeItem item) {
            o.i(item, "item");
            item.x().d().removeObservers(item.v().getViewLifecycleOwner());
            this.f27785a.T.setAdapter(null);
            this.f27786b.r().clear();
            this.f27786b.q();
            this.f27787c.h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ListingLifeTimeItem(ListingLifeTimeItemViewModel listingLifeTimeViewModel, Fragment fragment, FragmentManager fragmentManager, l<? super Boolean, p> onActionDone) {
        o.i(listingLifeTimeViewModel, "listingLifeTimeViewModel");
        o.i(fragment, "fragment");
        o.i(fragmentManager, "fragmentManager");
        o.i(onActionDone, "onActionDone");
        this.f27779f = listingLifeTimeViewModel;
        this.f27780g = fragment;
        this.f27781h = fragmentManager;
        this.f27782i = onActionDone;
        this.f27783j = t0.K4;
        this.f27784k = r0.f70149y7;
    }

    @Override // kr.m
    public int getType() {
        return this.f27784k;
    }

    @Override // pr.a
    public int t() {
        return this.f27783j;
    }

    public final Fragment v() {
        return this.f27780g;
    }

    public final FragmentManager w() {
        return this.f27781h;
    }

    public final ListingLifeTimeItemViewModel x() {
        return this.f27779f;
    }

    public final l<Boolean, p> y() {
        return this.f27782i;
    }

    @Override // pr.a
    /* renamed from: z */
    public ListingLifeTimeViewHolder u(View v11) {
        o.i(v11, "v");
        yj f02 = yj.f0(v11);
        o.h(f02, "bind(...)");
        return new ListingLifeTimeViewHolder(f02);
    }
}
