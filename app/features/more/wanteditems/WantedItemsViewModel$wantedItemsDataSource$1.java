package com.forsale.app.features.more.wanteditems;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WantedItemsViewModel.kt */
@d(c = "com.forsale.app.features.more.wanteditems.WantedItemsViewModel", f = "WantedItemsViewModel.kt", l = {27}, m = "wantedItemsDataSource")
/* loaded from: classes2.dex */
public final class WantedItemsViewModel$wantedItemsDataSource$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f33790a;

    /* renamed from: b  reason: collision with root package name */
    Object f33791b;

    /* renamed from: c  reason: collision with root package name */
    Object f33792c;

    /* renamed from: d  reason: collision with root package name */
    Object f33793d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f33794e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ WantedItemsViewModel f33795f;

    /* renamed from: g  reason: collision with root package name */
    int f33796g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WantedItemsViewModel$wantedItemsDataSource$1(WantedItemsViewModel wantedItemsViewModel, zz.a<? super WantedItemsViewModel$wantedItemsDataSource$1> aVar) {
        super(aVar);
        this.f33795f = wantedItemsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object D0;
        this.f33794e = obj;
        this.f33796g |= Integer.MIN_VALUE;
        D0 = this.f33795f.D0(this);
        return D0;
    }
}
