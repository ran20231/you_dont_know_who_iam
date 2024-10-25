package com.forsale.app.features.more.wanteditems;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WantedItemsViewModel.kt */
@d(c = "com.forsale.app.features.more.wanteditems.WantedItemsViewModel", f = "WantedItemsViewModel.kt", l = {28}, m = "dataSourceFactory")
/* loaded from: classes2.dex */
public final class WantedItemsViewModel$dataSourceFactory$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f33783a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WantedItemsViewModel f33784b;

    /* renamed from: c  reason: collision with root package name */
    int f33785c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WantedItemsViewModel$dataSourceFactory$1(WantedItemsViewModel wantedItemsViewModel, zz.a<? super WantedItemsViewModel$dataSourceFactory$1> aVar) {
        super(aVar);
        this.f33784b = wantedItemsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object y02;
        this.f33783a = obj;
        this.f33785c |= Integer.MIN_VALUE;
        y02 = this.f33784b.y0(this);
        return y02;
    }
}
