package com.forsale.core.netowrk.downloadmanger;

import android.annotation.SuppressLint;
import android.app.DownloadManager;
import android.database.Cursor;
import com.forsale.core.netowrk.connectivityobserver.ConnectivityObserver;
import com.forsale.core.netowrk.downloadmanger.DownloadStatus;
import falcon.chat.entities.MessageKt;
import g00.l;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Result;
import kotlin.f;
import kotlin.jvm.internal.o;
import qj.c;
import wz.p;
/* compiled from: DownloadMediaInteractor.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final c f40622a;

    /* renamed from: b  reason: collision with root package name */
    private final ConnectivityObserver f40623b;

    /* renamed from: c  reason: collision with root package name */
    private final DownloadManager f40624c;

    /* renamed from: d  reason: collision with root package name */
    private Timer f40625d;

    /* compiled from: DownloadMediaInteractor.kt */
    /* renamed from: com.forsale.core.netowrk.downloadmanger.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0461a extends TimerTask {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadManager.Query f40627b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l<Result<? extends DownloadStatus>, p> f40628c;

        /* JADX WARN: Multi-variable type inference failed */
        C0461a(DownloadManager.Query query, l<? super Result<? extends DownloadStatus>, p> lVar) {
            this.f40627b = query;
            this.f40628c = lVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        @SuppressLint({"Range"})
        public void run() {
            boolean z11;
            Cursor query = a.this.f40624c.query(this.f40627b);
            o.h(query, "query(...)");
            if (query.moveToFirst() && query.getColumnIndex(MessageKt.STATUS) >= 0) {
                Integer valueOf = Integer.valueOf(query.getInt(query.getColumnIndex(MessageKt.STATUS)));
                int intValue = valueOf.intValue();
                if (intValue != 8 && intValue != 16) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    l<Result<? extends DownloadStatus>, p> lVar = this.f40628c;
                    a aVar = a.this;
                    if (valueOf.intValue() == 8) {
                        Result.a aVar2 = Result.f61613b;
                        lVar.invoke(Result.a(Result.b(DownloadStatus.a.f40621a)));
                    } else {
                        Result.a aVar3 = Result.f61613b;
                        lVar.invoke(Result.a(Result.b(f.a(DownloadStatus.Failed.f40620a))));
                    }
                    query.close();
                    aVar.c();
                }
            }
        }
    }

    public a(c downloadRequestInteractor, ConnectivityObserver connectivityObserver, DownloadManager downloadManager) {
        o.i(downloadRequestInteractor, "downloadRequestInteractor");
        o.i(connectivityObserver, "connectivityObserver");
        o.i(downloadManager, "downloadManager");
        this.f40622a = downloadRequestInteractor;
        this.f40623b = connectivityObserver;
        this.f40624c = downloadManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        Timer timer = this.f40625d;
        if (timer != null) {
            if (timer != null) {
                timer.cancel();
            }
            this.f40625d = null;
        }
    }

    public final void d(String url, MediaType mediaType, l<? super Result<? extends DownloadStatus>, p> resultCallback) {
        o.i(url, "url");
        o.i(mediaType, "mediaType");
        o.i(resultCallback, "resultCallback");
        if (this.f40623b.a() == ConnectivityObserver.NetworkStatus.Connected) {
            DownloadManager.Query filterById = new DownloadManager.Query().setFilterById(this.f40624c.enqueue(this.f40622a.a(url, mediaType)));
            c();
            Timer timer = new Timer();
            this.f40625d = timer;
            timer.schedule(new C0461a(filterById, resultCallback), 100L, 1L);
            return;
        }
        Result.a aVar = Result.f61613b;
        resultCallback.invoke(Result.a(Result.b(f.a(DownloadStatus.Failed.f40620a))));
        c();
    }
}
