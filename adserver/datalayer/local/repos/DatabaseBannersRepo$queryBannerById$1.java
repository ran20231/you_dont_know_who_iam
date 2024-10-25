package com.forsale.adserver.datalayer.local.repos;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DatabaseBannersRepo.kt */
@d(c = "com.forsale.adserver.datalayer.local.repos.DatabaseBannersRepo", f = "DatabaseBannersRepo.kt", l = {24}, m = "queryBannerById")
/* loaded from: classes2.dex */
public final class DatabaseBannersRepo$queryBannerById$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f20680a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DatabaseBannersRepo f20681b;

    /* renamed from: c  reason: collision with root package name */
    int f20682c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatabaseBannersRepo$queryBannerById$1(DatabaseBannersRepo databaseBannersRepo, a<? super DatabaseBannersRepo$queryBannerById$1> aVar) {
        super(aVar);
        this.f20681b = databaseBannersRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20680a = obj;
        this.f20682c |= Integer.MIN_VALUE;
        return this.f20681b.a(0, 0, this);
    }
}
