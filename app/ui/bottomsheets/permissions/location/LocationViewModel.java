package com.forsale.app.ui.bottomsheets.permissions.location;

import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.OneShotEventHandler;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: LocationViewModel.kt */
/* loaded from: classes3.dex */
public final class LocationViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final OneShotEventHandler<p> f38982k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationViewModel(BaseRepository baseRepository) {
        super(baseRepository);
        o.i(baseRepository, "baseRepository");
        this.f38982k0 = new OneShotEventHandler<>(null, 0, 3, null);
    }

    public final OneShotEventHandler<p> v0() {
        return this.f38982k0;
    }

    public final void w0() {
        this.f38982k0.i(p.f75480a);
    }
}
