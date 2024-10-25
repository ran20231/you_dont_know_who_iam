package com.forsale.app.features.postad.addons.featured.selector;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import androidx.lifecycle.r0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.responses.Addon;
import com.forsale.app.datalayer.network.responses.AddonsGroup;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.addons.addonsgroupitem.AddonsGroupItemViewModel;
import com.forsale.app.features.postad.addons.addonsgroupitem.ExpansionStatus;
import com.forsale.app.utils.analytics.CreateEditAdvActionType;
import java.util.Set;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import wz.p;
/* compiled from: FeaturedAddonsSelectorViewModel.kt */
/* loaded from: classes2.dex */
public final class FeaturedAddonsSelectorViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final ListingDetailsEntity f34757k0;

    /* renamed from: l0  reason: collision with root package name */
    private final PostAdViewModel f34758l0;

    /* renamed from: m0  reason: collision with root package name */
    private final b0<AddonsGroup> f34759m0;

    /* renamed from: n0  reason: collision with root package name */
    private final String f34760n0;

    /* renamed from: o0  reason: collision with root package name */
    private final String f34761o0;

    /* renamed from: p0  reason: collision with root package name */
    private final String f34762p0;

    /* renamed from: q0  reason: collision with root package name */
    private final String f34763q0;

    /* renamed from: r0  reason: collision with root package name */
    private final LiveData<AddonsGroupItemViewModel> f34764r0;

    /* renamed from: s0  reason: collision with root package name */
    private final MutableSharedFlow<Set<Addon>> f34765s0;

    /* renamed from: t0  reason: collision with root package name */
    private final SharedFlow<Set<Addon>> f34766t0;

    /* renamed from: u0  reason: collision with root package name */
    private final MutableSharedFlow<p> f34767u0;

    /* renamed from: v0  reason: collision with root package name */
    private final SharedFlow<p> f34768v0;

    /* compiled from: FeaturedAddonsSelectorViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {
        FeaturedAddonsSelectorViewModel a(AddonsGroup addonsGroup, ListingDetailsEntity listingDetailsEntity, PostAdViewModel postAdViewModel);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeaturedAddonsSelectorViewModel(AddonsGroup addonsGroup, ListingDetailsEntity listing, PostAdViewModel postAdViewModel, ApplicationResourcesRepository arr, BaseRepository baseRepository) {
        super(baseRepository);
        String str;
        String str2;
        String str3;
        String str4;
        o.i(addonsGroup, "addonsGroup");
        o.i(listing, "listing");
        o.i(postAdViewModel, "postAdViewModel");
        o.i(arr, "arr");
        o.i(baseRepository, "baseRepository");
        this.f34757k0 = listing;
        this.f34758l0 = postAdViewModel;
        b0<AddonsGroup> b0Var = new b0<>(addonsGroup);
        this.f34759m0 = b0Var;
        AddonsGroup value = b0Var.getValue();
        if (value != null) {
            str = value.getTitle();
        } else {
            str = null;
        }
        this.f34760n0 = str;
        AddonsGroup value2 = b0Var.getValue();
        if (value2 != null) {
            str2 = value2.getSubtitle();
        } else {
            str2 = null;
        }
        this.f34761o0 = str2;
        AddonsGroup value3 = b0Var.getValue();
        if (value3 != null) {
            str3 = value3.getBackgroundColor();
        } else {
            str3 = null;
        }
        this.f34762p0 = str3;
        AddonsGroup value4 = b0Var.getValue();
        if (value4 != null) {
            str4 = value4.getForegroundColor();
        } else {
            str4 = null;
        }
        this.f34763q0 = str4;
        this.f34764r0 = new b0(new AddonsGroupItemViewModel(r0.a(this), ExpansionStatus.NON, addonsGroup, listing, arr, null, new FeaturedAddonsSelectorViewModel$addonGroupViewModel$1(this), 32, null));
        MutableSharedFlow<Set<Addon>> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f34765s0 = MutableSharedFlow$default;
        this.f34766t0 = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableSharedFlow<p> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f34767u0 = MutableSharedFlow$default2;
        this.f34768v0 = FlowKt.asSharedFlow(MutableSharedFlow$default2);
    }

    private final void I0(CreateEditAdvActionType createEditAdvActionType, String str, boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new FeaturedAddonsSelectorViewModel$logAnalytics$1(this, createEditAdvActionType, str, z11, null), 3, null);
    }

    static /* synthetic */ void J0(FeaturedAddonsSelectorViewModel featuredAddonsSelectorViewModel, CreateEditAdvActionType createEditAdvActionType, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        featuredAddonsSelectorViewModel.I0(createEditAdvActionType, str, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M0(String str, boolean z11) {
        if (z11) {
            if (this.f34757k0.isEditMode()) {
                J0(this, CreateEditAdvActionType.EDIT_LISTING_ADDON_SELECTED, str, false, 4, null);
            } else {
                I0(CreateEditAdvActionType.ADD_LISTING_ADDON_SELECTED, str, true);
            }
        } else if (this.f34757k0.isEditMode()) {
            J0(this, CreateEditAdvActionType.EDIT_LISTING_ADDON_UNSELECTED, str, false, 4, null);
        } else {
            J0(this, CreateEditAdvActionType.ADD_LISTING_ADDON_UNSELECTED, str, false, 4, null);
        }
    }

    public final SharedFlow<p> A0() {
        return this.f34768v0;
    }

    public final SharedFlow<Set<Addon>> B0() {
        return this.f34766t0;
    }

    public final String C0() {
        return this.f34762p0;
    }

    public final String D0() {
        return this.f34763q0;
    }

    public final PostAdViewModel E0() {
        return this.f34758l0;
    }

    public final String G0() {
        return this.f34761o0;
    }

    public final String H0() {
        return this.f34760n0;
    }

    public final void K0() {
        BuildersKt__Builders_commonKt.launch$default(this.f34758l0, null, null, new FeaturedAddonsSelectorViewModel$onBack$1(this, null), 3, null);
    }

    public final void L0() {
        BuildersKt__Builders_commonKt.launch$default(this.f34758l0, null, null, new FeaturedAddonsSelectorViewModel$onDone$1(this, null), 3, null);
    }

    public final LiveData<AddonsGroupItemViewModel> z0() {
        return this.f34764r0;
    }
}
