package com.forsale.app.ui;

import androidx.databinding.ObservableBoolean;
import com.forsale.app.base.viewmodels.BaseStatefulViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.features.more.WebModel;
import com.forsale.app.utils.OneShotEventHandler;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: WebViewModel.kt */
/* loaded from: classes3.dex */
public final class c extends BaseStatefulViewModel {

    /* renamed from: l0  reason: collision with root package name */
    private final WebModel f39300l0;

    /* renamed from: m0  reason: collision with root package name */
    private final boolean f39301m0;

    /* renamed from: n0  reason: collision with root package name */
    private final OneShotEventHandler<WebModel> f39302n0;

    /* renamed from: o0  reason: collision with root package name */
    private final OneShotEventHandler<p> f39303o0;

    /* renamed from: p0  reason: collision with root package name */
    private final ObservableBoolean f39304p0;

    /* compiled from: WebViewModel.kt */
    /* loaded from: classes3.dex */
    public interface a {
        c a(WebModel webModel, boolean z11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(WebModel webModel, boolean z11, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(webModel, "webModel");
        o.i(baseRepository, "baseRepository");
        this.f39300l0 = webModel;
        this.f39301m0 = z11;
        this.f39302n0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f39303o0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f39304p0 = new ObservableBoolean(true);
    }

    public final void A0() {
        this.f39302n0.i(this.f39300l0);
    }

    public final void B0() {
        this.f39303o0.i(p.f75480a);
    }

    public final OneShotEventHandler<p> w0() {
        return this.f39303o0;
    }

    public final OneShotEventHandler<WebModel> x0() {
        return this.f39302n0;
    }

    public final ObservableBoolean y0() {
        return this.f39304p0;
    }

    public final boolean z0() {
        return this.f39301m0;
    }
}
