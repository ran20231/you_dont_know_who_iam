package com.forsale.app.ui.bottomsheets.listingdetailsselleraction;

import androidx.lifecycle.b0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.OneShotEventHandler;
import java.util.Arrays;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.w;
import t9.y0;
import wz.p;
/* compiled from: SellerItemIDViewModel.kt */
/* loaded from: classes3.dex */
public final class d extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final String f38658k0;

    /* renamed from: l0  reason: collision with root package name */
    private final ApplicationResourcesRepository f38659l0;

    /* renamed from: m0  reason: collision with root package name */
    private final b0<String> f38660m0;

    /* renamed from: n0  reason: collision with root package name */
    private final b0<String> f38661n0;

    /* renamed from: o0  reason: collision with root package name */
    private final OneShotEventHandler<p> f38662o0;

    /* renamed from: p0  reason: collision with root package name */
    private final OneShotEventHandler<String> f38663p0;

    /* renamed from: q0  reason: collision with root package name */
    private final b0<Boolean> f38664q0;

    /* compiled from: SellerItemIDViewModel.kt */
    /* loaded from: classes3.dex */
    public interface a {
        d a(String str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String itemId, ApplicationResourcesRepository appRepo, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(itemId, "itemId");
        o.i(appRepo, "appRepo");
        o.i(baseRepository, "baseRepository");
        this.f38658k0 = itemId;
        this.f38659l0 = appRepo;
        b0<String> b0Var = new b0<>();
        this.f38660m0 = b0Var;
        b0<String> b0Var2 = new b0<>();
        this.f38661n0 = b0Var2;
        this.f38662o0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38663p0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38664q0 = new b0<>();
        w wVar = w.f61809a;
        String format = String.format("%s<%s>", Arrays.copyOf(new Object[]{appRepo.getString(y0.f70520j8, new Object[0]), itemId}, 2));
        o.h(format, "format(...)");
        b0Var.postValue(format);
        String format2 = String.format("%s-%s", Arrays.copyOf(new Object[]{appRepo.getString(y0.f70520j8, new Object[0]), itemId}, 2));
        o.h(format2, "format(...)");
        b0Var2.postValue(format2);
    }

    public final void A0() {
        OneShotEventHandler.d(this.f38662o0, null, 1, null);
    }

    public final void B0() {
        this.f38663p0.i(this.f38661n0.getValue());
    }

    public final OneShotEventHandler<p> v0() {
        return this.f38662o0;
    }

    public final OneShotEventHandler<String> w0() {
        return this.f38663p0;
    }

    public final b0<String> x0() {
        return this.f38660m0;
    }

    public final b0<String> y0() {
        return this.f38661n0;
    }

    public final b0<Boolean> z0() {
        return this.f38664q0;
    }
}
