package com.forsale.app.features.postad.addons.featured;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import com.forsale.app.datalayer.database.CategoryRuleSet;
import com.forsale.app.datalayer.network.entities.AddonsRequested;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.responses.Addon;
import com.forsale.app.datalayer.network.responses.AddonsGroup;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.features.postad.addons.addonitem.AddonItemViewModel;
import com.github.mikephil.charting.utils.Utils;
import g00.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import t9.y0;
import wz.p;
/* compiled from: FeaturedAddonItemViewModel.kt */
/* loaded from: classes2.dex */
public final class FeaturedAddonItemViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineScope f34706a;

    /* renamed from: b  reason: collision with root package name */
    private final AddonsGroup f34707b;

    /* renamed from: c  reason: collision with root package name */
    private final ListingDetailsEntity f34708c;

    /* renamed from: d  reason: collision with root package name */
    private final a<p> f34709d;

    /* renamed from: e  reason: collision with root package name */
    private final ApplicationResourcesRepository f34710e;

    /* renamed from: f  reason: collision with root package name */
    private final CategoryRuleSet.RuleSet f34711f;

    /* renamed from: g  reason: collision with root package name */
    private final a<p> f34712g;

    /* renamed from: h  reason: collision with root package name */
    private final CoroutineScope f34713h;

    /* renamed from: i  reason: collision with root package name */
    private final LiveData<String> f34714i;

    /* renamed from: j  reason: collision with root package name */
    private final LiveData<String> f34715j;

    /* renamed from: k  reason: collision with root package name */
    private final MutableStateFlow<Set<Addon>> f34716k;

    /* renamed from: l  reason: collision with root package name */
    private final StateFlow<Set<Addon>> f34717l;

    /* renamed from: m  reason: collision with root package name */
    private final List<AddonItemViewModel> f34718m;

    /* renamed from: n  reason: collision with root package name */
    private final String f34719n;

    /* renamed from: o  reason: collision with root package name */
    private final String f34720o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f34721p;

    /* renamed from: q  reason: collision with root package name */
    private final MutableSharedFlow<Pair<AddonsGroup, ListingDetailsEntity>> f34722q;

    /* renamed from: r  reason: collision with root package name */
    private final SharedFlow<Pair<AddonsGroup, ListingDetailsEntity>> f34723r;

    /* renamed from: s  reason: collision with root package name */
    private final MutableSharedFlow<p> f34724s;

    /* renamed from: t  reason: collision with root package name */
    private final SharedFlow<p> f34725t;

    public FeaturedAddonItemViewModel(CoroutineScope coroutineScope, AddonsGroup addonsGroup, ListingDetailsEntity listing, a<p> addonsSelectionListener, ApplicationResourcesRepository arr, CategoryRuleSet.RuleSet categoryRuleSet, a<p> navigateToMedia, CoroutineScope cs2) {
        Set c12;
        int y11;
        boolean z11;
        o.i(coroutineScope, "coroutineScope");
        o.i(addonsGroup, "addonsGroup");
        o.i(listing, "listing");
        o.i(addonsSelectionListener, "addonsSelectionListener");
        o.i(arr, "arr");
        o.i(categoryRuleSet, "categoryRuleSet");
        o.i(navigateToMedia, "navigateToMedia");
        o.i(cs2, "cs");
        this.f34706a = coroutineScope;
        this.f34707b = addonsGroup;
        this.f34708c = listing;
        this.f34709d = addonsSelectionListener;
        this.f34710e = arr;
        this.f34711f = categoryRuleSet;
        this.f34712g = navigateToMedia;
        this.f34713h = cs2;
        this.f34714i = new b0(addonsGroup.getTitle());
        this.f34715j = new b0(addonsGroup.getSubtitle());
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = addonsGroup.getAddons().iterator();
        while (true) {
            Object obj = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            Addon addon = (Addon) next;
            Iterator<T> it3 = this.f34708c.getAddonsRequested().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                AddonsRequested addonsRequested = (AddonsRequested) next2;
                if (o.d(addonsRequested.getAddon(), addon.getId()) && addonsRequested.getCatId() == addon.getCatId()) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    obj = next2;
                    break;
                }
            }
            if (obj != null) {
                arrayList.add(next);
            }
        }
        c12 = CollectionsKt___CollectionsKt.c1(arrayList);
        MutableStateFlow<Set<Addon>> MutableStateFlow = StateFlowKt.MutableStateFlow(c12);
        this.f34716k = MutableStateFlow;
        this.f34717l = FlowKt.asStateFlow(MutableStateFlow);
        List<Addon> addons = this.f34707b.getAddons();
        y11 = s.y(addons, 10);
        ArrayList arrayList2 = new ArrayList(y11);
        for (Addon addon2 : addons) {
            arrayList2.add(new AddonItemViewModel(this.f34706a, addon2, this.f34707b, this.f34708c, this.f34710e, false, 32, null));
        }
        this.f34718m = arrayList2;
        this.f34719n = g(this.f34717l.getValue());
        this.f34720o = h(this.f34717l.getValue());
        this.f34721p = f(this.f34717l.getValue());
        MutableSharedFlow<Pair<AddonsGroup, ListingDetailsEntity>> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f34722q = MutableSharedFlow$default;
        this.f34723r = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableSharedFlow<p> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f34724s = MutableSharedFlow$default2;
        this.f34725t = FlowKt.asSharedFlow(MutableSharedFlow$default2);
    }

    private final boolean f(Set<Addon> set) {
        if (set.size() > 0) {
            return true;
        }
        return false;
    }

    private final String g(Set<Addon> set) {
        int size = set.size();
        String value = this.f34714i.getValue();
        return size + " " + ((Object) value);
    }

    private final String h(Set<Addon> set) {
        String string = this.f34710e.getString(y0.f70398c4, new Object[0]);
        double d11 = Utils.DOUBLE_EPSILON;
        for (Addon addon : set) {
            d11 += addon.getPrice();
        }
        String string2 = this.f34710e.getString(y0.K5, new Object[0]);
        return string + ": " + d11 + " " + string2;
    }

    private final void v(Set<Addon> set) {
        this.f34716k.setValue(set);
        this.f34709d.invoke();
    }

    public final boolean i() {
        return this.f34721p;
    }

    public final a<p> j() {
        return this.f34712g;
    }

    public final SharedFlow<Pair<AddonsGroup, ListingDetailsEntity>> k() {
        return this.f34723r;
    }

    public final SharedFlow<p> l() {
        return this.f34725t;
    }

    public final StateFlow<Set<Addon>> m() {
        return this.f34717l;
    }

    public final Set<AddonItemViewModel> n() {
        Set<AddonItemViewModel> c12;
        boolean z11;
        Object obj;
        boolean z12;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : this.f34718m) {
            AddonItemViewModel addonItemViewModel = (AddonItemViewModel) obj2;
            Iterator<T> it2 = this.f34708c.getAddonsRequested().iterator();
            while (true) {
                z11 = true;
                if (it2.hasNext()) {
                    obj = it2.next();
                    AddonsRequested addonsRequested = (AddonsRequested) obj;
                    if (o.d(addonsRequested.getAddon(), addonItemViewModel.c().getId()) && addonsRequested.getCatId() == addonItemViewModel.c().getCatId()) {
                        z12 = true;
                        continue;
                    } else {
                        z12 = false;
                        continue;
                    }
                    if (z12) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj == null) {
                z11 = false;
            }
            if (z11) {
                arrayList.add(obj2);
            }
        }
        c12 = CollectionsKt___CollectionsKt.c1(arrayList);
        return c12;
    }

    public final LiveData<String> o() {
        return this.f34715j;
    }

    public final LiveData<String> p() {
        return this.f34714i;
    }

    public final String q() {
        return this.f34719n;
    }

    public final String r() {
        return this.f34720o;
    }

    public final void s(Set<Addon> set) {
        p pVar;
        if (set != null) {
            v(set);
            pVar = p.f75480a;
        } else {
            pVar = null;
        }
        if (pVar == null) {
            this.f34712g.invoke();
        }
    }

    public final void t() {
        BuildersKt__Builders_commonKt.launch$default(this.f34713h, null, null, new FeaturedAddonItemViewModel$onClick$1(this, null), 3, null);
    }

    public final void u() {
        BuildersKt__Builders_commonKt.launch$default(this.f34713h, null, null, new FeaturedAddonItemViewModel$openSelector$1(this, null), 3, null);
    }
}
