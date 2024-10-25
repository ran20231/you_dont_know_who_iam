package com.forsale.app.workmangers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import com.forsale.app.datalayer.network.services.UploaderServicesKtorImpl;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import wz.i;
/* compiled from: UploadMediaWorkManger.kt */
/* loaded from: classes3.dex */
public final class UploadMediaWorkManger extends CoroutineWorker {

    /* renamed from: e  reason: collision with root package name */
    public static final a f40590e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f40591f = 8;

    /* renamed from: d  reason: collision with root package name */
    public UploaderServicesKtorImpl f40592d;

    /* compiled from: UploadMediaWorkManger.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadMediaWorkManger(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        o.i(context, "context");
        o.i(workerParams, "workerParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(String str, int i11) {
        int i12 = 0;
        Pair[] pairArr = {i.a("IN_PROGRESS_PERCENTAGE", Integer.valueOf(i11)), i.a("MEDIA_TYPE", str)};
        d.a aVar = new d.a();
        while (i12 < 2) {
            Pair pair = pairArr[i12];
            i12++;
            aVar.b((String) pair.c(), pair.d());
        }
        d a11 = aVar.a();
        o.h(a11, "dataBuilder.build()");
        setProgressAsync(a11);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d8 A[Catch: all -> 0x00a4, TRY_LEAVE, TryCatch #0 {all -> 0x00a4, blocks: (B:30:0x008b, B:37:0x00ca, B:46:0x00d8, B:49:0x00e2), top: B:98:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2 A[Catch: all -> 0x00a4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00a4, blocks: (B:30:0x008b, B:37:0x00ca, B:46:0x00d8, B:49:0x00e2), top: B:98:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0103 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010c A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:12:0x0040, B:58:0x0108, B:60:0x010c, B:62:0x012b, B:64:0x0131, B:65:0x013f, B:67:0x0147, B:69:0x014d, B:70:0x015d, B:72:0x0165, B:73:0x0169, B:75:0x0173, B:77:0x0179, B:79:0x0186, B:81:0x018c, B:82:0x0196), top: B:100:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c2  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(zz.a<? super androidx.work.ListenableWorker.a> r26) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.workmangers.UploadMediaWorkManger.a(zz.a):java.lang.Object");
    }

    public final UploaderServicesKtorImpl j() {
        UploaderServicesKtorImpl uploaderServicesKtorImpl = this.f40592d;
        if (uploaderServicesKtorImpl != null) {
            return uploaderServicesKtorImpl;
        }
        o.w("uploaderServicesKtorImpl");
        return null;
    }
}
