package com.forsale.adserver.datalayer.local.repos;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DatabaseOffersRepo.kt */
@d(c = "com.forsale.adserver.datalayer.local.repos.DatabaseOffersRepo", f = "DatabaseOffersRepo.kt", l = {38}, m = "queryOffersCategory")
/* loaded from: classes2.dex */
public final class DatabaseOffersRepo$queryOffersCategory$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f20694a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f20695b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DatabaseOffersRepo f20696c;

    /* renamed from: d  reason: collision with root package name */
    int f20697d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatabaseOffersRepo$queryOffersCategory$1(DatabaseOffersRepo databaseOffersRepo, a<? super DatabaseOffersRepo$queryOffersCategory$1> aVar) {
        super(aVar);
        this.f20696c = databaseOffersRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20695b = obj;
        this.f20697d |= Integer.MIN_VALUE;
        return this.f20696c.i(this);
    }
}
