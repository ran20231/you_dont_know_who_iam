package com.forsale.adserver.view.viewmodel;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BannerViewModel.kt */
@d(c = "com.forsale.adserver.view.viewmodel.BannerViewModel", f = "BannerViewModel.kt", l = {133}, m = "loadDataHandlingStates")
/* loaded from: classes2.dex */
public final class BannerViewModel$loadDataHandlingStates$1<T> extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f21608a;

    /* renamed from: b  reason: collision with root package name */
    Object f21609b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f21610c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ BannerViewModel f21611d;

    /* renamed from: e  reason: collision with root package name */
    int f21612e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerViewModel$loadDataHandlingStates$1(BannerViewModel bannerViewModel, a<? super BannerViewModel$loadDataHandlingStates$1> aVar) {
        super(aVar);
        this.f21611d = bannerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object k11;
        this.f21610c = obj;
        this.f21612e |= Integer.MIN_VALUE;
        k11 = this.f21611d.k(null, null, this);
        return k11;
    }
}
