package com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet;

import androidx.compose.runtime.c0;
import com.forsale.app.features.postad.location.LocationLevels;
import g00.l;
import g00.p;
import j0.k0;
import j00.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import n00.k;
/* compiled from: LocationTreeNode.kt */
/* loaded from: classes2.dex */
public final class LocationTreeNode {

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f29884h = {s.e(new MutablePropertyReference1Impl(LocationTreeNode.class, "isSelected", "isSelected()Z", 0))};

    /* renamed from: i  reason: collision with root package name */
    public static final int f29885i = 8;

    /* renamed from: a  reason: collision with root package name */
    private final dc.a f29886a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Integer> f29887b;

    /* renamed from: c  reason: collision with root package name */
    private final p<LocationTreeNode, Boolean, wz.p> f29888c;

    /* renamed from: d  reason: collision with root package name */
    private final l<LocationTreeNode, wz.p> f29889d;

    /* renamed from: e  reason: collision with root package name */
    private final List<LocationTreeNode> f29890e;

    /* renamed from: f  reason: collision with root package name */
    private final d f29891f;

    /* renamed from: g  reason: collision with root package name */
    private final k0<Boolean> f29892g;

    /* compiled from: Delegates.kt */
    /* loaded from: classes2.dex */
    public static final class a extends j00.b<Boolean> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LocationTreeNode f29893b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, LocationTreeNode locationTreeNode) {
            super(obj);
            this.f29893b = locationTreeNode;
        }

        @Override // j00.b
        protected void a(k<?> property, Boolean bool, Boolean bool2) {
            o.i(property, "property");
            boolean booleanValue = bool2.booleanValue();
            boolean booleanValue2 = bool.booleanValue();
            if (booleanValue2 == booleanValue && booleanValue) {
                this.f29893b.f29889d.invoke(this.f29893b);
            }
            if (booleanValue2 != booleanValue) {
                this.f29893b.n(booleanValue);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LocationTreeNode(dc.a location, List<Integer> parentIds, p<? super LocationTreeNode, ? super Boolean, wz.p> onSelectionChanged, l<? super LocationTreeNode, wz.p> onReselected) {
        k0<Boolean> e11;
        o.i(location, "location");
        o.i(parentIds, "parentIds");
        o.i(onSelectionChanged, "onSelectionChanged");
        o.i(onReselected, "onReselected");
        this.f29886a = location;
        this.f29887b = parentIds;
        this.f29888c = onSelectionChanged;
        this.f29889d = onReselected;
        this.f29890e = new ArrayList();
        j00.a aVar = j00.a.f59932a;
        this.f29891f = new a(Boolean.FALSE, this);
        e11 = c0.e(Boolean.valueOf(!l()), null, 2, null);
        this.f29892g = e11;
    }

    private final void c(LocationTreeNode locationTreeNode, List<LocationTreeNode> list) {
        for (LocationTreeNode locationTreeNode2 : locationTreeNode.f29890e) {
            list.add(locationTreeNode2);
            c(locationTreeNode2, list);
        }
    }

    private final List<LocationTreeNode> k(final LocationTreeNode locationTreeNode) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f(new l<LocationTreeNode, Boolean>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationTreeNode$getWholeBranch$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // g00.l
            /* renamed from: b */
            public final Boolean invoke(LocationTreeNode it2) {
                o.i(it2, "it");
                return Boolean.valueOf(LocationTreeNode.this.j().contains(Integer.valueOf(it2.i().e())));
            }
        }));
        c(locationTreeNode, arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(boolean z11) {
        this.f29886a.m().setValue(Boolean.valueOf(z11));
        this.f29892g.setValue(Boolean.valueOf(!z11));
        this.f29888c.invoke(this, Boolean.valueOf(z11));
    }

    public final void d(List<LocationTreeNode> location) {
        o.i(location, "location");
        this.f29890e.addAll(location);
    }

    public final List<LocationTreeNode> e() {
        boolean z11;
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (LocationTreeNode locationTreeNode : this.f29890e) {
            arrayList.addAll(locationTreeNode.e());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            LocationTreeNode locationTreeNode2 = (LocationTreeNode) obj;
            if (locationTreeNode2.f29886a.g() > 0 && locationTreeNode2.f29886a.g() <= LocationLevels.BLOCK.getLevel()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final List<LocationTreeNode> f(l<? super LocationTreeNode, Boolean> predicate) {
        boolean z11;
        o.i(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        if (predicate.invoke(this).booleanValue()) {
            arrayList.add(this);
        }
        for (LocationTreeNode locationTreeNode : this.f29890e) {
            List<LocationTreeNode> f11 = locationTreeNode.f(predicate);
            if (!(true ^ f11.isEmpty())) {
                f11 = null;
            }
            if (f11 != null) {
                arrayList.addAll(f11);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            LocationTreeNode locationTreeNode2 = (LocationTreeNode) obj;
            if (locationTreeNode2.f29886a.g() > 0 && locationTreeNode2.f29886a.g() <= LocationLevels.BLOCK.getLevel()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final LocationTreeNode g(l<? super LocationTreeNode, Boolean> predicate) {
        o.i(predicate, "predicate");
        if (predicate.invoke(this).booleanValue()) {
            return this;
        }
        for (LocationTreeNode locationTreeNode : this.f29890e) {
            LocationTreeNode g11 = locationTreeNode.g(predicate);
            if (g11 != null) {
                return g11;
            }
        }
        return null;
    }

    public final List<LocationTreeNode> h() {
        return this.f29890e;
    }

    public final dc.a i() {
        return this.f29886a;
    }

    public final List<Integer> j() {
        return this.f29887b;
    }

    public final boolean l() {
        return ((Boolean) this.f29891f.getValue(this, f29884h[0])).booleanValue();
    }

    public final k0<Boolean> m() {
        return this.f29892g;
    }

    public final void o(LocationTreeNode node, boolean z11) {
        o.i(node, "node");
        if (z11) {
            node.f29886a.n(System.currentTimeMillis());
            ArrayList<LocationTreeNode> arrayList = new ArrayList();
            for (Object obj : k(node)) {
                if (((LocationTreeNode) obj).l()) {
                    arrayList.add(obj);
                }
            }
            for (LocationTreeNode locationTreeNode : arrayList) {
                locationTreeNode.p(false);
            }
        }
        node.p(z11);
    }

    public final void p(boolean z11) {
        this.f29891f.setValue(this, f29884h[0], Boolean.valueOf(z11));
    }
}
