package com.forsale.app.workmangers;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DownloadSqliteWorkManger.kt */
@d(c = "com.forsale.app.workmangers.DownloadSqliteWorkManger", f = "DownloadSqliteWorkManger.kt", l = {40}, m = "doWork")
/* loaded from: classes3.dex */
public final class DownloadSqliteWorkManger$doWork$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f40566a;

    /* renamed from: b  reason: collision with root package name */
    Object f40567b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f40568c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ DownloadSqliteWorkManger f40569d;

    /* renamed from: e  reason: collision with root package name */
    int f40570e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadSqliteWorkManger$doWork$1(DownloadSqliteWorkManger downloadSqliteWorkManger, a<? super DownloadSqliteWorkManger$doWork$1> aVar) {
        super(aVar);
        this.f40569d = downloadSqliteWorkManger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f40568c = obj;
        this.f40570e |= Integer.MIN_VALUE;
        return this.f40569d.a(this);
    }
}
