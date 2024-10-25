package com.forsale.app.ui.bottomsheets.autorepostplans;

import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.OneShotEventHandler;
import kotlin.jvm.internal.o;
/* compiled from: AutoRepostViewModel.kt */
/* loaded from: classes3.dex */
public final class AutoRepostViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final OneShotEventHandler<Boolean> f38039k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoRepostViewModel(BaseRepository baseRepository) {
        super(baseRepository);
        o.i(baseRepository, "baseRepository");
        this.f38039k0 = new OneShotEventHandler<>(null, 0, 3, null);
    }

    public final void v0() {
        this.f38039k0.i(Boolean.TRUE);
    }

    public final void w0() {
        this.f38039k0.i(Boolean.FALSE);
    }
}
