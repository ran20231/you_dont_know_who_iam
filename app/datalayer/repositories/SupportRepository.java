package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.network.services.SupportService;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import wz.p;
/* compiled from: SupportRepository.kt */
/* loaded from: classes2.dex */
public final class SupportRepository implements CoroutineScope {
    public static final int $stable = 8;
    private final ApplicationResourcesRepository applicationResourcesRepository;
    private final CoroutineContext coroutineContext;
    private final String osVersion;
    private final jj.b prefs;
    private final SupportService supportService;

    public SupportRepository(SupportService supportService, ApplicationResourcesRepository applicationResourcesRepository, jj.b prefs) {
        o.i(supportService, "supportService");
        o.i(applicationResourcesRepository, "applicationResourcesRepository");
        o.i(prefs, "prefs");
        this.supportService = supportService;
        this.applicationResourcesRepository = applicationResourcesRepository;
        this.prefs = prefs;
        this.coroutineContext = Dispatchers.getIO().plus(new SupportRepository$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key));
        this.osVersion = jj.a.f60556a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getDeviceInfo(java.lang.String r11, zz.a<? super java.lang.String> r12) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.SupportRepository.getDeviceInfo(java.lang.String, zz.a):java.lang.Object");
    }

    public final Object deviceId(zz.a<? super String> aVar) {
        return this.prefs.c().a(aVar);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final Object logError(int i11, int i12, zz.a<? super p> aVar) {
        Object f11;
        Object logError = logError(i11, this.applicationResourcesRepository.getString(i12, new Object[0]), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        return logError == f11 ? logError : p.f75480a;
    }

    public final Object userPhone(zz.a<? super String> aVar) {
        return this.prefs.l().d(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object logError(int r7, java.lang.String r8, zz.a<? super wz.p> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.forsale.app.datalayer.repositories.SupportRepository$logError$2
            if (r0 == 0) goto L13
            r0 = r9
            com.forsale.app.datalayer.repositories.SupportRepository$logError$2 r0 = (com.forsale.app.datalayer.repositories.SupportRepository$logError$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.SupportRepository$logError$2 r0 = new com.forsale.app.datalayer.repositories.SupportRepository$logError$2
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            kotlin.f.b(r9)
            goto L71
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.L$0
            com.forsale.app.datalayer.repositories.SupportRepository r8 = (com.forsale.app.datalayer.repositories.SupportRepository) r8
            kotlin.f.b(r9)
            goto L5a
        L41:
            kotlin.f.b(r9)
            com.forsale.app.datalayer.repositories.ApplicationResourcesRepository r9 = r6.applicationResourcesRepository
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r7 = r9.getString(r7, r2)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r5
            java.lang.Object r9 = r6.getDeviceInfo(r8, r0)
            if (r9 != r1) goto L59
            return r1
        L59:
            r8 = r6
        L5a:
            java.lang.String r9 = (java.lang.String) r9
            com.forsale.app.datalayer.network.services.SupportService r8 = r8.supportService
            com.forsale.app.datalayer.network.requestsbodies.LogErrorBody r2 = new com.forsale.app.datalayer.network.requestsbodies.LogErrorBody
            r2.<init>(r7, r9)
            r7 = 0
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r9 = r8.logError(r2, r0)
            if (r9 != r1) goto L71
            return r1
        L71:
            com.forsale.app.datalayer.network.entities.LogErrorEntity r9 = (com.forsale.app.datalayer.network.entities.LogErrorEntity) r9
            int r7 = r9.getMailSent()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "logError:MailSent"
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.Object[] r8 = new java.lang.Object[r3]
            x10.a.b(r7, r8)
            wz.p r7 = wz.p.f75480a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.SupportRepository.logError(int, java.lang.String, zz.a):java.lang.Object");
    }
}
