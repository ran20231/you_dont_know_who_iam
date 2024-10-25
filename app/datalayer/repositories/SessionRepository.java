package com.forsale.app.datalayer.repositories;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.forsale.app.datalayer.network.entities.SessionEntity;
import com.forsale.app.datalayer.network.services.AuthService;
import com.forsale.app.datalayer.network.services.SessionsService;
import com.forsale.app.utils.OneShotEventHandler;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import wz.h;
import wz.p;
/* compiled from: SessionRepository.kt */
/* loaded from: classes2.dex */
public final class SessionRepository {
    private static final String BUSINESS_TYPE = "business_type";
    private static final h<Mutex> mutex$delegate;
    private final AuthService authService;
    private final Context context;
    private AtomicBoolean isSessionFetched;
    private final jj.b pref;
    private final cv.b rootBear;
    private final h sessionAsSingleLiveData$delegate;
    private final SessionDao sessionDao;
    private final SessionsService sessionsService;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SessionRepository.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Mutex getMutex() {
            return (Mutex) SessionRepository.mutex$delegate.getValue();
        }
    }

    static {
        h<Mutex> a11;
        a11 = d.a(new g00.a<Mutex>() { // from class: com.forsale.app.datalayer.repositories.SessionRepository$Companion$mutex$2
            @Override // g00.a
            public final Mutex invoke() {
                return MutexKt.Mutex$default(false, 1, null);
            }
        });
        mutex$delegate = a11;
    }

    public SessionRepository(Context context, SessionsService sessionsService, SessionDao sessionDao, cv.b rootBear, jj.b pref, AuthService authService) {
        h a11;
        o.i(context, "context");
        o.i(sessionsService, "sessionsService");
        o.i(sessionDao, "sessionDao");
        o.i(rootBear, "rootBear");
        o.i(pref, "pref");
        o.i(authService, "authService");
        this.context = context;
        this.sessionsService = sessionsService;
        this.sessionDao = sessionDao;
        this.rootBear = rootBear;
        this.pref = pref;
        this.authService = authService;
        this.isSessionFetched = new AtomicBoolean(false);
        a11 = d.a(new g00.a<OneShotEventHandler<SessionEntity>>() { // from class: com.forsale.app.datalayer.repositories.SessionRepository$sessionAsSingleLiveData$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final OneShotEventHandler<SessionEntity> invoke() {
                return new OneShotEventHandler<>(null, 0, 3, null);
            }
        });
        this.sessionAsSingleLiveData$delegate = a11;
    }

    public static /* synthetic */ Object getSession$default(SessionRepository sessionRepository, String str, String str2, zz.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        return sessionRepository.getSession(str, str2, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(6:18|19|20|(1:22)|13|14))(1:23))(4:31|(2:33|(1:35)(1:36))|13|14)|24|(1:26)|(4:28|(1:30)|20|(0))|13|14))|42|6|7|(0)(0)|24|(0)|(0)|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a5, code lost:
        if ((r8 instanceof java.io.IOException) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a7, code lost:
        x10.a.b("Auth:: " + r8.getMessage(), new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c0, code lost:
        x10.a.b("Auth:: " + r8.getMessage(), new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074 A[Catch: Exception -> 0x0041, TRY_ENTER, TryCatch #0 {Exception -> 0x0041, blocks: (B:13:0x002c, B:18:0x003d, B:37:0x0081, B:34:0x0074), top: B:46:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getUserTokenIfLoginFromVersionLowerThan24(com.forsale.app.datalayer.network.entities.SessionEntity r8, zz.a<? super wz.p> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.forsale.app.datalayer.repositories.SessionRepository$getUserTokenIfLoginFromVersionLowerThan24$1
            if (r0 == 0) goto L13
            r0 = r9
            com.forsale.app.datalayer.repositories.SessionRepository$getUserTokenIfLoginFromVersionLowerThan24$1 r0 = (com.forsale.app.datalayer.repositories.SessionRepository$getUserTokenIfLoginFromVersionLowerThan24$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.SessionRepository$getUserTokenIfLoginFromVersionLowerThan24$1 r0 = new com.forsale.app.datalayer.repositories.SessionRepository$getUserTokenIfLoginFromVersionLowerThan24$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L4b
            if (r2 == r6) goto L43
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            kotlin.f.b(r9)     // Catch: java.lang.Exception -> L41
            goto Ld8
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.lang.Object r8 = r0.L$0
            com.forsale.app.datalayer.repositories.SessionRepository r8 = (com.forsale.app.datalayer.repositories.SessionRepository) r8
            kotlin.f.b(r9)     // Catch: java.lang.Exception -> L41
            goto L81
        L41:
            r8 = move-exception
            goto La1
        L43:
            java.lang.Object r8 = r0.L$0
            com.forsale.app.datalayer.repositories.SessionRepository r8 = (com.forsale.app.datalayer.repositories.SessionRepository) r8
            kotlin.f.b(r9)
            goto L68
        L4b:
            kotlin.f.b(r9)
            com.forsale.app.datalayer.network.entities.SessionEntity$SessionStatus r8 = r8.getSessionStatus()
            com.forsale.app.datalayer.network.entities.SessionEntity$SessionStatus r9 = com.forsale.app.datalayer.network.entities.SessionEntity.SessionStatus.LOGGED_IN
            if (r8 != r9) goto Ld8
            jj.b r8 = r7.pref
            com.forsale.app.utils.prefUtils.preferences.UserSharedPref r8 = r8.l()
            r0.L$0 = r7
            r0.label = r6
            java.lang.Object r9 = r8.c(r0)
            if (r9 != r1) goto L67
            return r1
        L67:
            r8 = r7
        L68:
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            int r9 = r9.length()
            if (r9 != 0) goto L71
            goto L72
        L71:
            r6 = r5
        L72:
            if (r6 == 0) goto Ld8
            com.forsale.app.datalayer.network.services.AuthService r9 = r8.authService     // Catch: java.lang.Exception -> L41
            r0.L$0 = r8     // Catch: java.lang.Exception -> L41
            r0.label = r4     // Catch: java.lang.Exception -> L41
            java.lang.Object r9 = r9.getToken(r0)     // Catch: java.lang.Exception -> L41
            if (r9 != r1) goto L81
            return r1
        L81:
            r2 = r9
            com.forsale.app.datalayer.network.responses.AuthResponse r2 = (com.forsale.app.datalayer.network.responses.AuthResponse) r2     // Catch: java.lang.Exception -> L41
            jj.b r8 = r8.pref     // Catch: java.lang.Exception -> L41
            com.forsale.app.utils.prefUtils.preferences.UserSharedPref r8 = r8.l()     // Catch: java.lang.Exception -> L41
            com.forsale.app.datalayer.network.responses.AuthResponse$Data r2 = r2.getData()     // Catch: java.lang.Exception -> L41
            com.forsale.app.datalayer.network.responses.AuthResponse$Token r2 = r2.getToken()     // Catch: java.lang.Exception -> L41
            java.lang.String r2 = r2.getAccessToken()     // Catch: java.lang.Exception -> L41
            r0.L$0 = r9     // Catch: java.lang.Exception -> L41
            r0.label = r3     // Catch: java.lang.Exception -> L41
            java.lang.Object r8 = r8.h(r2, r0)     // Catch: java.lang.Exception -> L41
            if (r8 != r1) goto Ld8
            return r1
        La1:
            boolean r9 = r8 instanceof java.io.IOException
            java.lang.String r0 = "Auth:: "
            if (r9 == 0) goto Lc0
            java.lang.String r8 = r8.getMessage()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.Object[] r9 = new java.lang.Object[r5]
            x10.a.b(r8, r9)
            goto Ld8
        Lc0:
            java.lang.String r8 = r8.getMessage()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r0)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.Object[] r9 = new java.lang.Object[r5]
            x10.a.b(r8, r9)
        Ld8:
            wz.p r8 = wz.p.f75480a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.SessionRepository.getUserTokenIfLoginFromVersionLowerThan24(com.forsale.app.datalayer.network.entities.SessionEntity, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object notNullPushToken(java.lang.String r2, zz.a<? super java.lang.String> r3) {
        /*
            r1 = this;
            if (r2 == 0) goto Lb
            boolean r0 = kotlin.text.k.v(r2)
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            if (r0 != 0) goto Lf
            goto L10
        Lf:
            r2 = 0
        L10:
            if (r2 != 0) goto L16
            java.lang.Object r2 = com.forsale.app.notifications.fcm.FCMTopLevelFunctionsKt.d(r3)
        L16:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.SessionRepository.notNullPushToken(java.lang.String, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object preLoadGreetingImgIfPossible(com.forsale.app.datalayer.network.entities.SessionEntity r5, zz.a<? super wz.p> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.app.datalayer.repositories.SessionRepository$preLoadGreetingImgIfPossible$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.datalayer.repositories.SessionRepository$preLoadGreetingImgIfPossible$1 r0 = (com.forsale.app.datalayer.repositories.SessionRepository$preLoadGreetingImgIfPossible$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.SessionRepository$preLoadGreetingImgIfPossible$1 r0 = new com.forsale.app.datalayer.repositories.SessionRepository$preLoadGreetingImgIfPossible$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            java.lang.String r5 = (java.lang.String) r5
            kotlin.f.b(r6)
            goto L5e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r6)
            com.forsale.app.datalayer.network.entities.SessionEntity$Greeting r5 = r5.getGreeting()
            if (r5 == 0) goto L5e
            java.lang.String r5 = r5.getImageUrl()
            if (r5 == 0) goto L5e
            android.content.Context r6 = r4.context
            com.bumptech.glide.g r6 = com.bumptech.glide.Glide.u(r6)
            com.bumptech.glide.f r6 = r6.w(r5)
            java.lang.String r2 = "load(...)"
            kotlin.jvm.internal.o.h(r6, r2)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r5 = com.forsale.app.utils.TopLevelUtilityFunctionsKt.e(r6, r0)
            if (r5 != r1) goto L5e
            return r1
        L5e:
            wz.p r5 = wz.p.f75480a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.SessionRepository.preLoadGreetingImgIfPossible(com.forsale.app.datalayer.network.entities.SessionEntity, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateHomeId(Integer num, zz.a<? super p> aVar) {
        Object f11;
        if (num != null && !this.isSessionFetched.get()) {
            Object j11 = this.pref.l().j(num.intValue(), aVar);
            f11 = kotlin.coroutines.intrinsics.b.f();
            if (j11 == f11) {
                return j11;
            }
            return p.f75480a;
        }
        return p.f75480a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(4:18|19|20|22))(3:23|24|25))(4:40|41|42|(1:44)(1:45))|26|27|(2:29|(1:31)(3:32|20|22))(1:34)))|50|6|7|(0)(0)|26|27|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0075, code lost:
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0076, code lost:
        r1 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008a, code lost:
        return r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #0 {all -> 0x0075, blocks: (B:29:0x005b, B:31:0x005f), top: B:46:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getCachedSession(zz.a<? super com.forsale.app.datalayer.network.entities.SessionEntity> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.forsale.app.datalayer.repositories.SessionRepository$getCachedSession$1
            if (r0 == 0) goto L13
            r0 = r11
            com.forsale.app.datalayer.repositories.SessionRepository$getCachedSession$1 r0 = (com.forsale.app.datalayer.repositories.SessionRepository$getCachedSession$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.SessionRepository$getCachedSession$1 r0 = new com.forsale.app.datalayer.repositories.SessionRepository$getCachedSession$1
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r0.label
            r8 = 3
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L4a
            if (r1 == r3) goto L3f
            if (r1 == r2) goto L37
            if (r1 != r8) goto L2f
            kotlin.f.b(r11)
            goto L8b
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L37:
            java.lang.Object r1 = r0.L$0
            com.forsale.app.datalayer.repositories.SessionRepository r1 = (com.forsale.app.datalayer.repositories.SessionRepository) r1
            kotlin.f.b(r11)     // Catch: java.lang.Throwable -> L48
            goto L72
        L3f:
            java.lang.Object r1 = r0.L$0
            com.forsale.app.datalayer.repositories.SessionRepository r1 = (com.forsale.app.datalayer.repositories.SessionRepository) r1
            kotlin.f.b(r11)     // Catch: java.lang.Throwable -> L48
            r9 = r1
            goto L5b
        L48:
            r11 = move-exception
            goto L7a
        L4a:
            kotlin.f.b(r11)
            com.forsale.app.datalayer.repositories.SessionDao r11 = r10.sessionDao     // Catch: java.lang.Throwable -> L78
            r0.L$0 = r10     // Catch: java.lang.Throwable -> L78
            r0.label = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r11 = r11.getSession(r0)     // Catch: java.lang.Throwable -> L78
            if (r11 != r7) goto L5a
            return r7
        L5a:
            r9 = r10
        L5b:
            com.forsale.app.datalayer.network.entities.SessionEntity r11 = (com.forsale.app.datalayer.network.entities.SessionEntity) r11     // Catch: java.lang.Throwable -> L75
            if (r11 != 0) goto L8d
            r11 = 0
            r3 = 0
            r5 = 3
            r6 = 0
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L75
            r0.label = r2     // Catch: java.lang.Throwable -> L75
            r1 = r9
            r2 = r11
            r4 = r0
            java.lang.Object r11 = getSession$default(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L75
            if (r11 != r7) goto L71
            return r7
        L71:
            r1 = r9
        L72:
            com.forsale.app.datalayer.network.entities.SessionEntity r11 = (com.forsale.app.datalayer.network.entities.SessionEntity) r11     // Catch: java.lang.Throwable -> L48
            goto L8d
        L75:
            r11 = move-exception
            r1 = r9
            goto L7a
        L78:
            r11 = move-exception
            r1 = r10
        L7a:
            com.forsale.app.utils.ErrorHandlingExtensionsKt.a(r11)
            com.forsale.app.datalayer.repositories.SessionDao r11 = r1.sessionDao
            r1 = 0
            r0.L$0 = r1
            r0.label = r8
            java.lang.Object r11 = r11.getSession(r0)
            if (r11 != r7) goto L8b
            return r7
        L8b:
            com.forsale.app.datalayer.network.entities.SessionEntity r11 = (com.forsale.app.datalayer.network.entities.SessionEntity) r11
        L8d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.SessionRepository.getCachedSession(zz.a):java.lang.Object");
    }

    public final Object getCachedSessionNullable(zz.a<? super SessionEntity> aVar) {
        return this.sessionDao.getSession(aVar);
    }

    public final SessionEntity.Greeting getGreeting(SessionEntity.Greeting greeting, boolean z11, boolean z12) {
        if (greeting == null || z11 || z12) {
            return null;
        }
        return greeting;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0129 A[Catch: all -> 0x018f, TryCatch #3 {all -> 0x018f, blocks: (B:70:0x0173, B:58:0x0118, B:63:0x0129, B:66:0x0144, B:54:0x0102), top: B:90:0x0102 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0184 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getSession(java.lang.String r25, java.lang.String r26, zz.a<? super com.forsale.app.datalayer.network.entities.SessionEntity> r27) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.SessionRepository.getSession(java.lang.String, java.lang.String, zz.a):java.lang.Object");
    }

    public final Flow<SessionEntity> getSessionAsFlow() {
        return this.sessionDao.getSessionAsFlow();
    }

    public final OneShotEventHandler<SessionEntity> getSessionAsSingleLiveData() {
        return (OneShotEventHandler) this.sessionAsSingleLiveData$delegate.getValue();
    }

    public final LiveData<SessionEntity> getSessionLiveData() {
        return this.sessionDao.getSessionLiveData();
    }

    public final Object updateCachedSession(SessionEntity sessionEntity, zz.a<? super p> aVar) {
        Object f11;
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new SessionRepository$updateCachedSession$2(this, sessionEntity, null), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (withContext == f11) {
            return withContext;
        }
        return p.f75480a;
    }
}
