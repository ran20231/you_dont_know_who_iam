package com.forsale.app.ui.bottomsheets.permissions.gps;

import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.OneShotEventHandler;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: GPSViewModel.kt */
/* loaded from: classes3.dex */
public final class GPSViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final OneShotEventHandler<p> f38970k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GPSViewModel(BaseRepository baseRepository) {
        super(baseRepository);
        o.i(baseRepository, "baseRepository");
        this.f38970k0 = new OneShotEventHandler<>(null, 0, 3, null);
    }

    public final void v0() {
        this.f38970k0.i(p.f75480a);
    }
}
