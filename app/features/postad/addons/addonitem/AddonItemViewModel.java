package com.forsale.app.features.postad.addons.addonitem;

import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import com.forsale.app.datalayer.network.entities.AddonsRequested;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.responses.Addon;
import com.forsale.app.datalayer.network.responses.AddonsGroup;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.text.s;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import t9.y0;
/* compiled from: AddonItemViewModel.kt */
/* loaded from: classes2.dex */
public final class AddonItemViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineScope f34427a;

    /* renamed from: b  reason: collision with root package name */
    private final Addon f34428b;

    /* renamed from: c  reason: collision with root package name */
    private final AddonsGroup f34429c;

    /* renamed from: d  reason: collision with root package name */
    private final ListingDetailsEntity f34430d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f34431e;

    /* renamed from: f  reason: collision with root package name */
    private final ObservableBoolean f34432f;

    /* renamed from: g  reason: collision with root package name */
    private final String f34433g;

    /* renamed from: h  reason: collision with root package name */
    private final MutableSharedFlow<Addon> f34434h;

    /* renamed from: i  reason: collision with root package name */
    private final SharedFlow<Addon> f34435i;

    /* renamed from: j  reason: collision with root package name */
    private final LiveData<Boolean> f34436j;

    /* renamed from: k  reason: collision with root package name */
    private final LiveData<Boolean> f34437k;

    public AddonItemViewModel(CoroutineScope coroutineScope, Addon addon, AddonsGroup addonsGroup, ListingDetailsEntity listing, ApplicationResourcesRepository applicationResourcesRepository, boolean z11) {
        o.i(coroutineScope, "coroutineScope");
        o.i(addon, "addon");
        o.i(addonsGroup, "addonsGroup");
        o.i(listing, "listing");
        o.i(applicationResourcesRepository, "applicationResourcesRepository");
        this.f34427a = coroutineScope;
        this.f34428b = addon;
        this.f34429c = addonsGroup;
        this.f34430d = listing;
        this.f34431e = z11;
        boolean z12 = false;
        this.f34432f = new ObservableBoolean(false);
        float price = addon.getPrice();
        String string = applicationResourcesRepository.getString(y0.K5, new Object[0]);
        this.f34433g = price + " " + string;
        MutableSharedFlow<Addon> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f34434h = MutableSharedFlow$default;
        this.f34435i = FlowKt.asSharedFlow(MutableSharedFlow$default);
        this.f34436j = new b0(Boolean.valueOf(b()));
        String badgeName = addon.getBadgeName();
        this.f34437k = new b0(Boolean.valueOf(!((badgeName == null || badgeName.length() == 0) ? true : z12)));
    }

    private final boolean b() {
        boolean z11;
        boolean v11;
        String helpUrl = this.f34428b.getHelpUrl();
        if (helpUrl != null) {
            v11 = s.v(helpUrl);
            if (!v11) {
                z11 = false;
                return !z11;
            }
        }
        z11 = true;
        return !z11;
    }

    public final Addon c() {
        return this.f34428b;
    }

    public final AddonsGroup d() {
        return this.f34429c;
    }

    public final long e() {
        return this.f34428b.getId().hashCode();
    }

    public final SharedFlow<Addon> f() {
        return this.f34435i;
    }

    public final LiveData<Boolean> g() {
        return this.f34436j;
    }

    public final String h() {
        return this.f34433g;
    }

    public final ObservableBoolean i() {
        return this.f34432f;
    }

    public final LiveData<Boolean> j() {
        return this.f34437k;
    }

    public final boolean k() {
        return this.f34428b.isPromote();
    }

    public final boolean l() {
        return this.f34431e;
    }

    public final void m() {
        BuildersKt__Builders_commonKt.launch$default(this.f34427a, null, null, new AddonItemViewModel$onPreviewClicked$1(this, null), 3, null);
    }

    public final void n(boolean z11) {
        this.f34431e = z11;
        o(!this.f34432f.j());
    }

    public final void o(boolean z11) {
        this.f34432f.k(z11);
    }

    public final void p(boolean z11) {
        this.f34431e = z11;
    }

    public /* synthetic */ AddonItemViewModel(CoroutineScope coroutineScope, Addon addon, AddonsGroup addonsGroup, ListingDetailsEntity listingDetailsEntity, ApplicationResourcesRepository applicationResourcesRepository, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, addon, addonsGroup, listingDetailsEntity, applicationResourcesRepository, (i11 & 32) != 0 ? listingDetailsEntity.getAddonsRequested().contains(AddonsRequested.Companion.createFrom(addon)) : z11);
    }
}
