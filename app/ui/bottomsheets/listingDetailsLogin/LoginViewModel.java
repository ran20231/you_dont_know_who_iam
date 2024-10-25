package com.forsale.app.ui.bottomsheets.listingDetailsLogin;

import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.OneShotEventHandler;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: LoginViewModel.kt */
/* loaded from: classes3.dex */
public final class LoginViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final OneShotEventHandler<p> f38133k0;

    /* renamed from: l0  reason: collision with root package name */
    private final OneShotEventHandler<p> f38134l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginViewModel(BaseRepository baseRepository) {
        super(baseRepository);
        o.i(baseRepository, "baseRepository");
        this.f38133k0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38134l0 = new OneShotEventHandler<>(null, 0, 3, null);
    }

    public final OneShotEventHandler<p> v0() {
        return this.f38133k0;
    }

    public final OneShotEventHandler<p> w0() {
        return this.f38134l0;
    }

    public final void x0() {
        OneShotEventHandler.d(this.f38133k0, null, 1, null);
    }

    public final void y0() {
        OneShotEventHandler.d(this.f38133k0, null, 1, null);
        OneShotEventHandler.d(this.f38134l0, null, 1, null);
    }
}
