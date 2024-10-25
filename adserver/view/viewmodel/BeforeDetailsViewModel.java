package com.forsale.adserver.view.viewmodel;

import com.forsale.adserver.usecases.GetBannerByIdUseCase;
import com.forsale.adserver.usecases.offersInteractors.OffersInteractor;
import j9.e;
import j9.f;
import kotlin.jvm.internal.o;
/* compiled from: BeforeDetailsViewModel.kt */
/* loaded from: classes2.dex */
public final class BeforeDetailsViewModel extends BaseViewModel {

    /* renamed from: b  reason: collision with root package name */
    private final OffersInteractor f21654b;

    /* renamed from: c  reason: collision with root package name */
    private final GetBannerByIdUseCase f21655c;

    /* renamed from: d  reason: collision with root package name */
    private final e<f> f21656d;

    public BeforeDetailsViewModel(OffersInteractor offersInteractor, GetBannerByIdUseCase bannersUseCase) {
        o.i(offersInteractor, "offersInteractor");
        o.i(bannersUseCase, "bannersUseCase");
        this.f21654b = offersInteractor;
        this.f21655c = bannersUseCase;
        this.f21656d = new e<>();
    }

    @Override // com.forsale.adserver.view.viewmodel.BaseViewModel
    public String e() {
        return "BEFORE_DETAILS";
    }

    public final void j(int i11, boolean z11) {
        if (z11) {
            m(i11);
        } else {
            k(i11);
        }
    }

    public final void k(int i11) {
        this.f21656d.postValue(f.c.f60482a);
        f(new BeforeDetailsViewModel$getBannerById$1(this, i11, null));
    }

    public final e<f> l() {
        return this.f21656d;
    }

    public final void m(int i11) {
        this.f21656d.postValue(f.c.f60482a);
        f(new BeforeDetailsViewModel$getOfferById$1(this, i11, null));
    }
}
