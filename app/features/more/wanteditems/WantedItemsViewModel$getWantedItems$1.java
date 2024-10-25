package com.forsale.app.features.more.wanteditems;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WantedItemsViewModel.kt */
@d(c = "com.forsale.app.features.more.wanteditems.WantedItemsViewModel", f = "WantedItemsViewModel.kt", l = {31}, m = "getWantedItems")
/* loaded from: classes2.dex */
public final class WantedItemsViewModel$getWantedItems$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f33786a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f33787b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ WantedItemsViewModel f33788c;

    /* renamed from: d  reason: collision with root package name */
    int f33789d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WantedItemsViewModel$getWantedItems$1(WantedItemsViewModel wantedItemsViewModel, zz.a<? super WantedItemsViewModel$getWantedItems$1> aVar) {
        super(aVar);
        this.f33788c = wantedItemsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33787b = obj;
        this.f33789d |= Integer.MIN_VALUE;
        return this.f33788c.A0(this);
    }
}
