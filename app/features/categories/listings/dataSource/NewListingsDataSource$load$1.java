package com.forsale.app.features.categories.listings.dataSource;

import com.google.android.gms.maps.model.PinConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewListingsDataSource.kt */
@d(c = "com.forsale.app.features.categories.listings.dataSource.NewListingsDataSource", f = "NewListingsDataSource.kt", l = {PinConfig.BITMAP_WIDTH_DP}, m = "load")
/* loaded from: classes2.dex */
public final class NewListingsDataSource$load$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    int f28953a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f28954b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NewListingsDataSource f28955c;

    /* renamed from: d  reason: collision with root package name */
    int f28956d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewListingsDataSource$load$1(NewListingsDataSource newListingsDataSource, a<? super NewListingsDataSource$load$1> aVar) {
        super(aVar);
        this.f28955c = newListingsDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28954b = obj;
        this.f28956d |= Integer.MIN_VALUE;
        return this.f28955c.f(null, this);
    }
}
