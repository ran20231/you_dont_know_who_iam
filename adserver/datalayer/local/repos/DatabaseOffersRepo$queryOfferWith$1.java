package com.forsale.adserver.datalayer.local.repos;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DatabaseOffersRepo.kt */
@d(c = "com.forsale.adserver.datalayer.local.repos.DatabaseOffersRepo", f = "DatabaseOffersRepo.kt", l = {29}, m = "queryOfferWith")
/* loaded from: classes2.dex */
public final class DatabaseOffersRepo$queryOfferWith$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f20691a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DatabaseOffersRepo f20692b;

    /* renamed from: c  reason: collision with root package name */
    int f20693c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatabaseOffersRepo$queryOfferWith$1(DatabaseOffersRepo databaseOffersRepo, a<? super DatabaseOffersRepo$queryOfferWith$1> aVar) {
        super(aVar);
        this.f20692b = databaseOffersRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20691a = obj;
        this.f20693c |= Integer.MIN_VALUE;
        return this.f20692b.h(0, 0, this);
    }
}
