package com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.lostinterest;

import androidx.lifecycle.b0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.network.services.MyListingsService;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel;
import com.forsale.app.utils.OneShotEventHandler;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import wz.p;
/* compiled from: DeleteListingLostInterestViewModel.kt */
/* loaded from: classes3.dex */
public final class DeleteListingLostInterestViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final int f38216k0;

    /* renamed from: l0  reason: collision with root package name */
    private final ListingDetailsViewModel f38217l0;

    /* renamed from: m0  reason: collision with root package name */
    private final jj.b f38218m0;

    /* renamed from: n0  reason: collision with root package name */
    private final MyListingsService f38219n0;

    /* renamed from: o0  reason: collision with root package name */
    private final b0<String> f38220o0;

    /* renamed from: p0  reason: collision with root package name */
    private final OneShotEventHandler<p> f38221p0;

    /* renamed from: q0  reason: collision with root package name */
    private final OneShotEventHandler<Boolean> f38222q0;

    /* compiled from: DeleteListingLostInterestViewModel.kt */
    /* loaded from: classes3.dex */
    public interface a {
        DeleteListingLostInterestViewModel a(int i11, ListingDetailsViewModel listingDetailsViewModel);
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DeleteListingLostInterestViewModel f38223a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.Key key, DeleteListingLostInterestViewModel deleteListingLostInterestViewModel) {
            super(key);
            this.f38223a = deleteListingLostInterestViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            this.f38223a.z0().i(Boolean.FALSE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteListingLostInterestViewModel(int i11, ListingDetailsViewModel listingDetailsViewModel, jj.b prefs, MyListingsService myListingsService, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(prefs, "prefs");
        o.i(myListingsService, "myListingsService");
        o.i(baseRepository, "baseRepository");
        this.f38216k0 = i11;
        this.f38217l0 = listingDetailsViewModel;
        this.f38218m0 = prefs;
        this.f38219n0 = myListingsService;
        this.f38220o0 = new b0<>();
        this.f38221p0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38222q0 = new OneShotEventHandler<>(null, 0, 3, null);
    }

    public final OneShotEventHandler<p> A0() {
        return this.f38221p0;
    }

    public final b0<String> B0() {
        return this.f38220o0;
    }

    public final void C0() {
        OneShotEventHandler.d(this.f38221p0, null, 1, null);
    }

    public final void D0() {
        BuildersKt__Builders_commonKt.launch$default(this, new b(CoroutineExceptionHandler.Key, this), null, new DeleteListingLostInterestViewModel$onSubmitClicked$2(this, null), 2, null);
    }

    public final OneShotEventHandler<Boolean> z0() {
        return this.f38222q0;
    }
}
