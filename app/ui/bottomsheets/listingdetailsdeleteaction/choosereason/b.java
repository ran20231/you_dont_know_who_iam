package com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.choosereason;

import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.OneShotEventHandler;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: DeleteActionViewModel.kt */
/* loaded from: classes3.dex */
public final class b extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final int f38196k0;

    /* renamed from: l0  reason: collision with root package name */
    private final boolean f38197l0;

    /* renamed from: m0  reason: collision with root package name */
    private final OneShotEventHandler<p> f38198m0;

    /* renamed from: n0  reason: collision with root package name */
    private final OneShotEventHandler<Integer> f38199n0;

    /* renamed from: o0  reason: collision with root package name */
    private final OneShotEventHandler<Integer> f38200o0;

    /* renamed from: p0  reason: collision with root package name */
    private final OneShotEventHandler<p> f38201p0;

    /* compiled from: DeleteActionViewModel.kt */
    /* loaded from: classes3.dex */
    public interface a {
        b a(int i11, boolean z11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i11, boolean z11, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(baseRepository, "baseRepository");
        this.f38196k0 = i11;
        this.f38197l0 = z11;
        this.f38198m0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38199n0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38200o0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38201p0 = new OneShotEventHandler<>(null, 0, 3, null);
    }

    public final void A0() {
        OneShotEventHandler.d(this.f38198m0, null, 1, null);
    }

    public final void B0() {
        this.f38200o0.i(Integer.valueOf(this.f38196k0));
    }

    public final void C0() {
        this.f38199n0.i(Integer.valueOf(this.f38196k0));
    }

    public final void D0() {
        OneShotEventHandler.d(this.f38201p0, null, 1, null);
    }

    public final OneShotEventHandler<p> v0() {
        return this.f38198m0;
    }

    public final OneShotEventHandler<Integer> w0() {
        return this.f38200o0;
    }

    public final boolean x0() {
        return this.f38197l0;
    }

    public final OneShotEventHandler<Integer> y0() {
        return this.f38199n0;
    }

    public final OneShotEventHandler<p> z0() {
        return this.f38201p0;
    }
}
