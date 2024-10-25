package com.forsale.app.ui.bottomsheets.listingdetailsselleraction;

import androidx.lifecycle.b0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import kotlin.jvm.internal.o;
/* compiled from: SellerActionViewModel.kt */
/* loaded from: classes3.dex */
public final class SellerActionViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final jj.b f38526k0;

    /* renamed from: l0  reason: collision with root package name */
    private final UserProfileInteractor f38527l0;

    /* renamed from: m0  reason: collision with root package name */
    private final OneShotEventHandler<Boolean> f38528m0;

    /* renamed from: n0  reason: collision with root package name */
    private final OneShotEventHandler<Boolean> f38529n0;

    /* renamed from: o0  reason: collision with root package name */
    private final b0<Boolean> f38530o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerActionViewModel(jj.b prefs, UserProfileInteractor userProfileInteractor, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(prefs, "prefs");
        o.i(userProfileInteractor, "userProfileInteractor");
        o.i(baseRepository, "baseRepository");
        this.f38526k0 = prefs;
        this.f38527l0 = userProfileInteractor;
        this.f38528m0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38529n0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38530o0 = new b0<>();
    }

    public final void v0(boolean z11) {
        this.f38530o0.postValue(Boolean.valueOf(z11));
        OneShotEventHandler.d(this.f38529n0, null, 1, null);
    }

    public final Object w0(zz.a<? super String> aVar) {
        return this.f38526k0.c().a(aVar);
    }

    public final OneShotEventHandler<Boolean> x0() {
        return this.f38528m0;
    }

    public final OneShotEventHandler<Boolean> y0() {
        return this.f38529n0;
    }

    public final b0<Boolean> z0() {
        return this.f38530o0;
    }
}
