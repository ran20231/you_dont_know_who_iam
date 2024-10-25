package com.forsale.app.features.categories.listings.filtration.fullFiltration.arch;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PreSelectedFiltersFactory.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.PreSelectedFiltersFactory", f = "PreSelectedFiltersFactory.kt", l = {92, FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE}, m = "updateRangeFilters")
/* loaded from: classes2.dex */
public final class PreSelectedFiltersFactory$updateRangeFilters$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f29184a;

    /* renamed from: b  reason: collision with root package name */
    Object f29185b;

    /* renamed from: c  reason: collision with root package name */
    Object f29186c;

    /* renamed from: d  reason: collision with root package name */
    Object f29187d;

    /* renamed from: e  reason: collision with root package name */
    Object f29188e;

    /* renamed from: f  reason: collision with root package name */
    Object f29189f;

    /* renamed from: g  reason: collision with root package name */
    /* synthetic */ Object f29190g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ PreSelectedFiltersFactory f29191h;

    /* renamed from: i  reason: collision with root package name */
    int f29192i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreSelectedFiltersFactory$updateRangeFilters$1(PreSelectedFiltersFactory preSelectedFiltersFactory, a<? super PreSelectedFiltersFactory$updateRangeFilters$1> aVar) {
        super(aVar);
        this.f29191h = preSelectedFiltersFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object r11;
        this.f29190g = obj;
        this.f29192i |= Integer.MIN_VALUE;
        r11 = this.f29191h.r(null, null, this);
        return r11;
    }
}
