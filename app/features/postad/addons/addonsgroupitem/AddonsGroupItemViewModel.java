package com.forsale.app.features.postad.addons.addonsgroupitem;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.network.entities.AddonsRequested;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.responses.Addon;
import com.forsale.app.datalayer.network.responses.AddonsGroup;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.features.postad.addons.addonitem.AddonItemViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import wz.p;
/* compiled from: AddonsGroupItemViewModel.kt */
/* loaded from: classes2.dex */
public final class AddonsGroupItemViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineScope f34456a;

    /* renamed from: b  reason: collision with root package name */
    private final AddonsGroup f34457b;

    /* renamed from: c  reason: collision with root package name */
    private final ListingDetailsEntity f34458c;

    /* renamed from: d  reason: collision with root package name */
    private final g00.a<p> f34459d;

    /* renamed from: e  reason: collision with root package name */
    private final g00.p<String, Boolean, p> f34460e;

    /* renamed from: f  reason: collision with root package name */
    private final b0<Boolean> f34461f;

    /* renamed from: g  reason: collision with root package name */
    private final List<AddonItemViewModel> f34462g;

    /* compiled from: AddonsGroupItemViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f34465a;

        static {
            int[] iArr = new int[ExpansionStatus.values().length];
            try {
                iArr[ExpansionStatus.NON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExpansionStatus.EXPANDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ExpansionStatus.COLLAPSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f34465a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddonsGroupItemViewModel(CoroutineScope coroutineScope, ExpansionStatus expansionStatus, AddonsGroup addonsGroup, ListingDetailsEntity listing, ApplicationResourcesRepository applicationResourcesRepository, g00.a<p> addonsSelectionListener, g00.p<? super String, ? super Boolean, p> recordSelection) {
        Boolean bool;
        int y11;
        o.i(coroutineScope, "coroutineScope");
        o.i(expansionStatus, "expansionStatus");
        o.i(addonsGroup, "addonsGroup");
        o.i(listing, "listing");
        o.i(applicationResourcesRepository, "applicationResourcesRepository");
        o.i(addonsSelectionListener, "addonsSelectionListener");
        o.i(recordSelection, "recordSelection");
        this.f34456a = coroutineScope;
        this.f34457b = addonsGroup;
        this.f34458c = listing;
        this.f34459d = addonsSelectionListener;
        this.f34460e = recordSelection;
        int i11 = a.f34465a[expansionStatus.ordinal()];
        if (i11 == 1) {
            bool = null;
        } else if (i11 == 2) {
            bool = Boolean.TRUE;
        } else if (i11 != 3) {
            throw new NoWhenBranchMatchedException();
        } else {
            bool = Boolean.FALSE;
        }
        this.f34461f = new b0<>(bool);
        List<Addon> addons = addonsGroup.getAddons();
        y11 = s.y(addons, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (Addon addon : addons) {
            arrayList.add(new AddonItemViewModel(this.f34456a, addon, this.f34457b, this.f34458c, applicationResourcesRepository, false, 32, null));
        }
        this.f34462g = arrayList;
    }

    public final List<AddonItemViewModel> a() {
        return this.f34462g;
    }

    public final AddonsGroup b() {
        return this.f34457b;
    }

    public final Set<Addon> c() {
        int y11;
        Set<Addon> c12;
        ArrayList<AddonItemViewModel> arrayList = new ArrayList();
        for (Object obj : this.f34462g) {
            if (((AddonItemViewModel) obj).l()) {
                arrayList.add(obj);
            }
        }
        y11 = s.y(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(y11);
        for (AddonItemViewModel addonItemViewModel : arrayList) {
            arrayList2.add(addonItemViewModel.c());
        }
        c12 = CollectionsKt___CollectionsKt.c1(arrayList2);
        return c12;
    }

    public final Set<AddonItemViewModel> d() {
        Set<AddonItemViewModel> c12;
        boolean z11;
        Object obj;
        boolean z12;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : this.f34462g) {
            AddonItemViewModel addonItemViewModel = (AddonItemViewModel) obj2;
            Iterator<T> it2 = this.f34458c.getAddonsRequested().iterator();
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

    public final b0<Boolean> e() {
        return this.f34461f;
    }

    public final void f(AddonItemViewModel addonItemViewModel, boolean z11) {
        o.i(addonItemViewModel, "addonItemViewModel");
        addonItemViewModel.n(z11);
        this.f34459d.invoke();
        this.f34460e.invoke(addonItemViewModel.c().getId(), Boolean.valueOf(z11));
        addonItemViewModel.k();
    }

    public /* synthetic */ AddonsGroupItemViewModel(CoroutineScope coroutineScope, ExpansionStatus expansionStatus, AddonsGroup addonsGroup, ListingDetailsEntity listingDetailsEntity, ApplicationResourcesRepository applicationResourcesRepository, g00.a aVar, g00.p pVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, expansionStatus, addonsGroup, listingDetailsEntity, applicationResourcesRepository, (i11 & 32) != 0 ? new g00.a<p>() { // from class: com.forsale.app.features.postad.addons.addonsgroupitem.AddonsGroupItemViewModel.1
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f75480a;
            }
        } : aVar, (i11 & 64) != 0 ? new g00.p<String, Boolean, p>() { // from class: com.forsale.app.features.postad.addons.addonsgroupitem.AddonsGroupItemViewModel.2
            public final void b(String str, boolean z11) {
                o.i(str, "<anonymous parameter 0>");
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(String str, Boolean bool) {
                b(str, bool.booleanValue());
                return p.f75480a;
            }
        } : pVar);
    }
}
