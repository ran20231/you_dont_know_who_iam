package com.forsale.app.ui.bottomsheets.listingdetailssellersettings;

import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.OneShotEventHandler;
import jj.b;
import kotlin.jvm.internal.o;
import wz.p;
import zz.a;
/* compiled from: SellerSettingsViewModel.kt */
/* loaded from: classes3.dex */
public final class SellerSettingsViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final b f38871k0;

    /* renamed from: l0  reason: collision with root package name */
    private final OneShotEventHandler<p> f38872l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerSettingsViewModel(b prefs, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(prefs, "prefs");
        o.i(baseRepository, "baseRepository");
        this.f38871k0 = prefs;
        this.f38872l0 = new OneShotEventHandler<>(null, 0, 3, null);
    }

    public final Object v0(a<? super String> aVar) {
        return this.f38871k0.c().a(aVar);
    }

    public final OneShotEventHandler<p> w0() {
        return this.f38872l0;
    }

    public final void x0() {
        OneShotEventHandler.d(this.f38872l0, null, 1, null);
    }
}
