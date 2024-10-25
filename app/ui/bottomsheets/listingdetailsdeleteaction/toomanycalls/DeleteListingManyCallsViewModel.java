package com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.toomanycalls;

import androidx.lifecycle.b0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.services.MyListingsService;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.TypeExtensionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import wz.p;
/* compiled from: DeleteListingManyCallsViewModel.kt */
/* loaded from: classes3.dex */
public final class DeleteListingManyCallsViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final ListingDetailsViewModel f38289k0;

    /* renamed from: l0  reason: collision with root package name */
    private final ApplicationResourcesRepository f38290l0;

    /* renamed from: m0  reason: collision with root package name */
    private final MyListingsService f38291m0;

    /* renamed from: n0  reason: collision with root package name */
    private final jj.b f38292n0;

    /* renamed from: o0  reason: collision with root package name */
    private final OneShotEventHandler<p> f38293o0;

    /* renamed from: p0  reason: collision with root package name */
    private final OneShotEventHandler<ListingItemDetails> f38294p0;

    /* renamed from: q0  reason: collision with root package name */
    private final OneShotEventHandler<ListingItemDetails> f38295q0;

    /* renamed from: r0  reason: collision with root package name */
    private final OneShotEventHandler<Boolean> f38296r0;

    /* renamed from: s0  reason: collision with root package name */
    private final b0<Boolean> f38297s0;

    /* compiled from: DeleteListingManyCallsViewModel.kt */
    /* loaded from: classes3.dex */
    public interface a {
        DeleteListingManyCallsViewModel a(ListingDetailsViewModel listingDetailsViewModel);
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DeleteListingManyCallsViewModel f38298a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.Key key, DeleteListingManyCallsViewModel deleteListingManyCallsViewModel) {
            super(key);
            this.f38298a = deleteListingManyCallsViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            this.f38298a.A0().i(Boolean.FALSE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteListingManyCallsViewModel(ListingDetailsViewModel listingDetailsViewModel, ApplicationResourcesRepository appRepo, MyListingsService myListingsService, jj.b prefs, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(listingDetailsViewModel, "listingDetailsViewModel");
        o.i(appRepo, "appRepo");
        o.i(myListingsService, "myListingsService");
        o.i(prefs, "prefs");
        o.i(baseRepository, "baseRepository");
        this.f38289k0 = listingDetailsViewModel;
        this.f38290l0 = appRepo;
        this.f38291m0 = myListingsService;
        this.f38292n0 = prefs;
        this.f38293o0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38294p0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38295q0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38296r0 = new OneShotEventHandler<>(null, 0, 3, null);
        ListingItemDetails value = listingDetailsViewModel.Y0().getValue();
        this.f38297s0 = new b0<>(Boolean.valueOf(!TypeExtensionsKt.i0(value != null ? Integer.valueOf(value.isHideMyNumber()) : null)));
    }

    public final OneShotEventHandler<Boolean> A0() {
        return this.f38296r0;
    }

    public final OneShotEventHandler<p> B0() {
        return this.f38293o0;
    }

    public final OneShotEventHandler<ListingItemDetails> C0() {
        return this.f38295q0;
    }

    public final b0<Boolean> D0() {
        return this.f38297s0;
    }

    public final void E0() {
        ListingItemDetails value = this.f38289k0.Y0().getValue();
        if (value != null) {
            this.f38295q0.i(value);
        }
    }

    public final void G0() {
        OneShotEventHandler.d(this.f38293o0, null, 1, null);
    }

    public final void H0() {
        ListingItemDetails value = this.f38289k0.Y0().getValue();
        if (value != null) {
            BuildersKt__Builders_commonKt.launch$default(this, new b(CoroutineExceptionHandler.Key, this), null, new DeleteListingManyCallsViewModel$onSubmitClicked$1$2(this, value, null), 2, null);
        }
    }

    public final void y0() {
        ListingItemDetails value = this.f38289k0.Y0().getValue();
        if (value != null) {
            this.f38294p0.i(value);
        }
    }

    public final OneShotEventHandler<ListingItemDetails> z0() {
        return this.f38294p0;
    }
}
