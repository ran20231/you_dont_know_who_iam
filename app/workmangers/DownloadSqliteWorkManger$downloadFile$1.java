package com.forsale.app.workmangers;

import com.leanplum.internal.RequestBuilder;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DownloadSqliteWorkManger.kt */
@d(c = "com.forsale.app.workmangers.DownloadSqliteWorkManger", f = "DownloadSqliteWorkManger.kt", l = {67, 71}, m = RequestBuilder.ACTION_DOWNLOAD_FILE)
/* loaded from: classes3.dex */
public final class DownloadSqliteWorkManger$downloadFile$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f40571a;

    /* renamed from: b  reason: collision with root package name */
    Object f40572b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f40573c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ DownloadSqliteWorkManger f40574d;

    /* renamed from: e  reason: collision with root package name */
    int f40575e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadSqliteWorkManger$downloadFile$1(DownloadSqliteWorkManger downloadSqliteWorkManger, a<? super DownloadSqliteWorkManger$downloadFile$1> aVar) {
        super(aVar);
        this.f40574d = downloadSqliteWorkManger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object k11;
        this.f40573c = obj;
        this.f40575e |= Integer.MIN_VALUE;
        k11 = this.f40574d.k(null, this);
        return k11;
    }
}
