package com.forsale.app.workmangers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DownloadSqliteWorkManger.kt */
@d(c = "com.forsale.app.workmangers.DownloadSqliteWorkManger", f = "DownloadSqliteWorkManger.kt", l = {77}, m = "saveDBFile")
/* loaded from: classes3.dex */
public final class DownloadSqliteWorkManger$saveDBFile$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f40576a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f40577b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DownloadSqliteWorkManger f40578c;

    /* renamed from: d  reason: collision with root package name */
    int f40579d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadSqliteWorkManger$saveDBFile$1(DownloadSqliteWorkManger downloadSqliteWorkManger, a<? super DownloadSqliteWorkManger$saveDBFile$1> aVar) {
        super(aVar);
        this.f40578c = downloadSqliteWorkManger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11;
        this.f40577b = obj;
        this.f40579d |= Integer.MIN_VALUE;
        l11 = this.f40578c.l(null, this);
        return l11;
    }
}
