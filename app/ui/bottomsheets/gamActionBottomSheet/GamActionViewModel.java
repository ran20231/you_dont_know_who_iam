package com.forsale.app.ui.bottomsheets.gamActionBottomSheet;

import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.OneShotEventHandler;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: GamActionViewModel.kt */
/* loaded from: classes3.dex */
public final class GamActionViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final OneShotEventHandler<p> f38108k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamActionViewModel(BaseRepository baseRepository) {
        super(baseRepository);
        o.i(baseRepository, "baseRepository");
        this.f38108k0 = new OneShotEventHandler<>(null, 0, 3, null);
    }

    public final OneShotEventHandler<p> v0() {
        return this.f38108k0;
    }

    public final void w0() {
        OneShotEventHandler.d(this.f38108k0, null, 1, null);
    }
}
