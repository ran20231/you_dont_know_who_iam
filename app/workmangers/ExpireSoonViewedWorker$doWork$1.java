package com.forsale.app.workmangers;

import com.google.android.gms.common.api.CommonStatusCodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExpireSoonViewedWorker.kt */
@d(c = "com.forsale.app.workmangers.ExpireSoonViewedWorker", f = "ExpireSoonViewedWorker.kt", l = {CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE}, m = "doWork")
/* loaded from: classes3.dex */
public final class ExpireSoonViewedWorker$doWork$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f40585a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ExpireSoonViewedWorker f40586b;

    /* renamed from: c  reason: collision with root package name */
    int f40587c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpireSoonViewedWorker$doWork$1(ExpireSoonViewedWorker expireSoonViewedWorker, a<? super ExpireSoonViewedWorker$doWork$1> aVar) {
        super(aVar);
        this.f40586b = expireSoonViewedWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40585a = obj;
        this.f40587c |= Integer.MIN_VALUE;
        return this.f40586b.a(this);
    }
}
