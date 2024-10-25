package com.forsale.adserver.datalayer.local.repos;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DatabaseOffersRepo.kt */
@d(c = "com.forsale.adserver.datalayer.local.repos.DatabaseOffersRepo", f = "DatabaseOffersRepo.kt", l = {68}, m = "queryAllOffersByCategoryId")
/* loaded from: classes2.dex */
public final class DatabaseOffersRepo$queryAllOffersByCategoryId$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f20688a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DatabaseOffersRepo f20689b;

    /* renamed from: c  reason: collision with root package name */
    int f20690c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatabaseOffersRepo$queryAllOffersByCategoryId$1(DatabaseOffersRepo databaseOffersRepo, a<? super DatabaseOffersRepo$queryAllOffersByCategoryId$1> aVar) {
        super(aVar);
        this.f20689b = databaseOffersRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20688a = obj;
        this.f20690c |= Integer.MIN_VALUE;
        return this.f20689b.c(0, 0, this);
    }
}
