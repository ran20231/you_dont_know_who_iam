package com.forsale.app.features.more.buymoretoken;

import com.forsale.app.base.ViewStates;
import com.forsale.app.base.viewmodels.BaseStatefulViewModel;
import com.forsale.app.datalayer.network.entities.PaymentOptionEntity;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.PaymentOptionRepository;
import com.forsale.app.utils.OneShotEventHandler;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: BuyMoreTokenViewModel.kt */
/* loaded from: classes2.dex */
public final class BuyMoreTokenViewModel extends BaseStatefulViewModel {

    /* renamed from: l0  reason: collision with root package name */
    private final PaymentOptionRepository f31704l0;

    /* renamed from: m0  reason: collision with root package name */
    private final OneShotEventHandler<PaymentOptionEntity> f31705m0;

    /* renamed from: n0  reason: collision with root package name */
    private final OneShotEventHandler<List<PaymentOptionEntity>> f31706n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyMoreTokenViewModel(PaymentOptionRepository paymentOptionRepository, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(paymentOptionRepository, "paymentOptionRepository");
        o.i(baseRepository, "baseRepository");
        this.f31704l0 = paymentOptionRepository;
        this.f31705m0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f31706n0 = new OneShotEventHandler<>(null, 0, 3, null);
        z0();
    }

    public final OneShotEventHandler<PaymentOptionEntity> x0() {
        return this.f31705m0;
    }

    public final OneShotEventHandler<List<PaymentOptionEntity>> y0() {
        return this.f31706n0;
    }

    public final void z0() {
        v0().postValue(ViewStates.LOADING);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new BuyMoreTokenViewModel$loadPaymentOptions$1(this, null), 3, null);
    }
}
