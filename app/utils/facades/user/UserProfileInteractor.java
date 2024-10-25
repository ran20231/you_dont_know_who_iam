package com.forsale.app.utils.facades.user;

import com.forsale.app.analytics.base.AppInfoInteractor;
import com.forsale.app.analytics.base.ForSaleDataTracker;
import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.datalayer.network.entities.PostListingIntention;
import com.forsale.app.datalayer.network.entities.SessionEntity;
import com.forsale.app.datalayer.repositories.ExpireSoonRepository;
import com.forsale.app.datalayer.repositories.SessionRepository;
import com.forsale.app.datalayer.repositories.UserRepository;
import com.forsale.app.features.auth.UserLoginAuthoritiesInteractor;
import com.forsale.app.features.auth.UserStatus;
import com.forsale.app.features.webBrowser.interactors.cookiesInteractors.UpdateUserWebViewCookieInteractor;
import jj.b;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import wz.p;
/* compiled from: UserProfileInteractor.kt */
/* loaded from: classes3.dex */
public final class UserProfileInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final UserRepository f40244a;

    /* renamed from: b  reason: collision with root package name */
    private final SessionRepository f40245b;

    /* renamed from: c  reason: collision with root package name */
    private final b f40246c;

    /* renamed from: d  reason: collision with root package name */
    private final UserLoginAuthoritiesInteractor f40247d;

    /* renamed from: e  reason: collision with root package name */
    private final ChatInteractor f40248e;

    /* renamed from: f  reason: collision with root package name */
    private final ExpireSoonRepository f40249f;

    /* renamed from: g  reason: collision with root package name */
    private final AppInfoInteractor f40250g;

    /* renamed from: h  reason: collision with root package name */
    private final UpdateUserWebViewCookieInteractor f40251h;

    /* renamed from: i  reason: collision with root package name */
    private final ForSaleDataTracker f40252i;

    /* compiled from: UserProfileInteractor.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f40253a;

        static {
            int[] iArr = new int[PostListingIntention.values().length];
            try {
                iArr[PostListingIntention.BOOST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostListingIntention.RE_POST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f40253a = iArr;
        }
    }

    public UserProfileInteractor(UserRepository userRepository, SessionRepository sessionRepository, b pref, UserLoginAuthoritiesInteractor userLoginAuthoritiesInteractor, ChatInteractor chatInteractor, ExpireSoonRepository expireSoonRepository, AppInfoInteractor appInfoInteractor, UpdateUserWebViewCookieInteractor updateUserWebViewCookieInteractor, ForSaleDataTracker tracker) {
        o.i(userRepository, "userRepository");
        o.i(sessionRepository, "sessionRepository");
        o.i(pref, "pref");
        o.i(userLoginAuthoritiesInteractor, "userLoginAuthoritiesInteractor");
        o.i(chatInteractor, "chatInteractor");
        o.i(expireSoonRepository, "expireSoonRepository");
        o.i(appInfoInteractor, "appInfoInteractor");
        o.i(updateUserWebViewCookieInteractor, "updateUserWebViewCookieInteractor");
        o.i(tracker, "tracker");
        this.f40244a = userRepository;
        this.f40245b = sessionRepository;
        this.f40246c = pref;
        this.f40247d = userLoginAuthoritiesInteractor;
        this.f40248e = chatInteractor;
        this.f40249f = expireSoonRepository;
        this.f40250g = appInfoInteractor;
        this.f40251h = updateUserWebViewCookieInteractor;
        this.f40252i = tracker;
    }

    public static /* synthetic */ Object l(UserProfileInteractor userProfileInteractor, String str, String str2, zz.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        return userProfileInteractor.k(str, str2, aVar);
    }

    public static /* synthetic */ Object o(UserProfileInteractor userProfileInteractor, CoroutineScope coroutineScope, boolean z11, zz.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return userProfileInteractor.n(coroutineScope, z11, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(String str, zz.a<? super p> aVar) {
        Object f11;
        Object i11 = this.f40246c.l().i(str, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (i11 == f11) {
            return i11;
        }
        return p.f75480a;
    }

    public static /* synthetic */ Object v(UserProfileInteractor userProfileInteractor, UserEntity userEntity, boolean z11, zz.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return userProfileInteractor.t(userEntity, z11, aVar);
    }

    private final Object w(UserEntity userEntity, zz.a<? super UserEntity> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new UserProfileInteractor$updateCachedUser$2(this, userEntity, null), aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(zz.a<? super wz.p> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.utils.facades.user.UserProfileInteractor$clearUserSettings$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.utils.facades.user.UserProfileInteractor$clearUserSettings$1 r0 = (com.forsale.app.utils.facades.user.UserProfileInteractor$clearUserSettings$1) r0
            int r1 = r0.f40257d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40257d = r1
            goto L18
        L13:
            com.forsale.app.utils.facades.user.UserProfileInteractor$clearUserSettings$1 r0 = new com.forsale.app.utils.facades.user.UserProfileInteractor$clearUserSettings$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f40255b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f40257d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r6)
            goto L63
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f40254a
            com.forsale.app.utils.facades.user.UserProfileInteractor r2 = (com.forsale.app.utils.facades.user.UserProfileInteractor) r2
            kotlin.f.b(r6)
            goto L51
        L3c:
            kotlin.f.b(r6)
            jj.b r6 = r5.f40246c
            com.forsale.app.utils.prefUtils.preferences.UserPostsSharedPrefs r6 = r6.k()
            r0.f40254a = r5
            r0.f40257d = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            r2 = r5
        L51:
            jj.b r6 = r2.f40246c
            com.forsale.app.utils.prefUtils.preferences.UserSharedPref r6 = r6.l()
            r2 = 0
            r0.f40254a = r2
            r0.f40257d = r3
            java.lang.Object r6 = r6.f(r0)
            if (r6 != r1) goto L63
            return r1
        L63:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.facades.user.UserProfileInteractor.h(zz.a):java.lang.Object");
    }

    public final Object i(zz.a<? super UserEntity> aVar) {
        return this.f40244a.getCachedUser(aVar);
    }

    public final Flow<UserEntity> j() {
        return this.f40244a.getUserAsFlow();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(1:(1:(1:(2:13|14)(2:16|17))(4:18|19|20|(2:22|(1:24)(1:25))(1:26)))(5:27|28|29|20|(0)(0)))(2:31|32))(4:38|39|40|(1:42)(1:43))|33|(3:35|(1:37)|29)|20|(0)(0)))|51|6|7|(0)(0)|33|(0)|20|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:19:0x004b, B:36:0x007b, B:22:0x0053, B:31:0x006a, B:33:0x006e), top: B:50:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r8, java.lang.String r9, zz.a<? super com.forsale.app.datalayer.network.entities.SessionEntity> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.forsale.app.utils.facades.user.UserProfileInteractor$getSessionAndUpdate$1
            if (r0 == 0) goto L13
            r0 = r10
            com.forsale.app.utils.facades.user.UserProfileInteractor$getSessionAndUpdate$1 r0 = (com.forsale.app.utils.facades.user.UserProfileInteractor$getSessionAndUpdate$1) r0
            int r1 = r0.f40261d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40261d = r1
            goto L18
        L13:
            com.forsale.app.utils.facades.user.UserProfileInteractor$getSessionAndUpdate$1 r0 = new com.forsale.app.utils.facades.user.UserProfileInteractor$getSessionAndUpdate$1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f40259b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f40261d
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L59
            if (r2 == r6) goto L4f
            if (r2 == r5) goto L47
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r8 = r0.f40258a
            com.forsale.app.datalayer.network.entities.SessionEntity r8 = (com.forsale.app.datalayer.network.entities.SessionEntity) r8
            kotlin.f.b(r10)
            goto La1
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3f:
            java.lang.Object r8 = r0.f40258a
            com.forsale.app.utils.facades.user.UserProfileInteractor r8 = (com.forsale.app.utils.facades.user.UserProfileInteractor) r8
            kotlin.f.b(r10)
            goto L90
        L47:
            java.lang.Object r8 = r0.f40258a
            com.forsale.app.utils.facades.user.UserProfileInteractor r8 = (com.forsale.app.utils.facades.user.UserProfileInteractor) r8
            kotlin.f.b(r10)     // Catch: java.lang.Throwable -> L57
            goto L7b
        L4f:
            java.lang.Object r8 = r0.f40258a
            com.forsale.app.utils.facades.user.UserProfileInteractor r8 = (com.forsale.app.utils.facades.user.UserProfileInteractor) r8
            kotlin.f.b(r10)     // Catch: java.lang.Throwable -> L57
            goto L6a
        L57:
            r9 = move-exception
            goto L80
        L59:
            kotlin.f.b(r10)
            com.forsale.app.datalayer.repositories.SessionRepository r10 = r7.f40245b     // Catch: java.lang.Throwable -> L7e
            r0.f40258a = r7     // Catch: java.lang.Throwable -> L7e
            r0.f40261d = r6     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r10 = r10.getSession(r8, r9, r0)     // Catch: java.lang.Throwable -> L7e
            if (r10 != r1) goto L69
            return r1
        L69:
            r8 = r7
        L6a:
            com.forsale.app.datalayer.network.entities.SessionEntity r10 = (com.forsale.app.datalayer.network.entities.SessionEntity) r10     // Catch: java.lang.Throwable -> L57
            if (r10 != 0) goto L92
            com.forsale.app.datalayer.repositories.SessionRepository r9 = r8.f40245b     // Catch: java.lang.Throwable -> L57
            r0.f40258a = r8     // Catch: java.lang.Throwable -> L57
            r0.f40261d = r5     // Catch: java.lang.Throwable -> L57
            java.lang.Object r10 = r9.getCachedSessionNullable(r0)     // Catch: java.lang.Throwable -> L57
            if (r10 != r1) goto L7b
            return r1
        L7b:
            com.forsale.app.datalayer.network.entities.SessionEntity r10 = (com.forsale.app.datalayer.network.entities.SessionEntity) r10     // Catch: java.lang.Throwable -> L57
            goto L92
        L7e:
            r9 = move-exception
            r8 = r7
        L80:
            com.forsale.app.utils.ErrorHandlingExtensionsKt.a(r9)
            com.forsale.app.datalayer.repositories.SessionRepository r9 = r8.f40245b
            r0.f40258a = r8
            r0.f40261d = r4
            java.lang.Object r10 = r9.getCachedSessionNullable(r0)
            if (r10 != r1) goto L90
            return r1
        L90:
            com.forsale.app.datalayer.network.entities.SessionEntity r10 = (com.forsale.app.datalayer.network.entities.SessionEntity) r10
        L92:
            r9 = r8
            r8 = r10
            if (r8 == 0) goto La1
            r0.f40258a = r8
            r0.f40261d = r3
            java.lang.Object r9 = r9.u(r8, r0)
            if (r9 != r1) goto La1
            return r1
        La1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.facades.user.UserProfileInteractor.k(java.lang.String, java.lang.String, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(zz.a<? super java.lang.Integer> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.utils.facades.user.UserProfileInteractor$getUnreadCountInt$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.utils.facades.user.UserProfileInteractor$getUnreadCountInt$1 r0 = (com.forsale.app.utils.facades.user.UserProfileInteractor$getUnreadCountInt$1) r0
            int r1 = r0.f40265d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40265d = r1
            goto L18
        L13:
            com.forsale.app.utils.facades.user.UserProfileInteractor$getUnreadCountInt$1 r0 = new com.forsale.app.utils.facades.user.UserProfileInteractor$getUnreadCountInt$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f40263b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f40265d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f40262a
            com.forsale.app.utils.facades.user.ChatInteractor r0 = (com.forsale.app.utils.facades.user.ChatInteractor) r0
            kotlin.f.b(r6)
            goto L48
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            kotlin.f.b(r6)
            com.forsale.app.utils.facades.user.ChatInteractor r6 = r5.f40248e
            r0.f40262a = r6
            r0.f40265d = r3
            java.lang.Object r0 = r5.r(r0)
            if (r0 != r1) goto L45
            return r1
        L45:
            r4 = r0
            r0 = r6
            r6 = r4
        L48:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            int r6 = r0.a(r6)
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.a.d(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.facades.user.UserProfileInteractor.m(zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(kotlinx.coroutines.CoroutineScope r9, boolean r10, zz.a<? super com.forsale.app.datalayer.database.UserEntity> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.forsale.app.utils.facades.user.UserProfileInteractor$getUserAndUpdate$1
            if (r0 == 0) goto L13
            r0 = r11
            com.forsale.app.utils.facades.user.UserProfileInteractor$getUserAndUpdate$1 r0 = (com.forsale.app.utils.facades.user.UserProfileInteractor$getUserAndUpdate$1) r0
            int r1 = r0.f40268c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40268c = r1
            goto L18
        L13:
            com.forsale.app.utils.facades.user.UserProfileInteractor$getUserAndUpdate$1 r0 = new com.forsale.app.utils.facades.user.UserProfileInteractor$getUserAndUpdate$1
            r0.<init>(r8, r11)
        L18:
            r6 = r0
            java.lang.Object r11 = r6.f40266a
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r6.f40268c
            r2 = 1
            r7 = 0
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.f.b(r11)
            goto L4e
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            kotlin.f.b(r11)
            com.forsale.app.datalayer.repositories.UserRepository r1 = r8.f40244a
            com.forsale.app.utils.facades.user.UserProfileInteractor$getUserAndUpdate$2 r11 = new com.forsale.app.utils.facades.user.UserProfileInteractor$getUserAndUpdate$2
            r11.<init>(r8, r7)
            com.forsale.app.utils.facades.user.UserProfileInteractor$getUserAndUpdate$3 r3 = new com.forsale.app.utils.facades.user.UserProfileInteractor$getUserAndUpdate$3
            r3.<init>(r8, r7)
            r6.f40268c = r2
            r2 = r11
            r4 = r9
            r5 = r10
            java.lang.Object r11 = r1.getUser(r2, r3, r4, r5, r6)
            if (r11 != r0) goto L4e
            return r0
        L4e:
            com.forsale.app.datalayer.network.errorhandling.ForSaleDataResult r11 = (com.forsale.app.datalayer.network.errorhandling.ForSaleDataResult) r11
            java.lang.Object r9 = com.forsale.app.datalayer.network.errorhandling.ForSaleDataResultKt.getOrNull(r11)
            com.forsale.app.datalayer.database.UserEntity r9 = (com.forsale.app.datalayer.database.UserEntity) r9
            if (r9 != 0) goto L62
            dj.i$a r9 = dj.i.f54287a
            dj.i r9 = r9.invoke()
            r9.a(r7)
            goto L63
        L62:
            r7 = r9
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.facades.user.UserProfileInteractor.n(kotlinx.coroutines.CoroutineScope, boolean, zz.a):java.lang.Object");
    }

    public final Object p(PostListingIntention postListingIntention, CoroutineScope coroutineScope, zz.a<? super UserEntity> aVar) {
        int i11 = a.f40253a[postListingIntention.ordinal()];
        if (i11 != 1 && i11 != 2) {
            return i(aVar);
        }
        return o(this, coroutineScope, false, aVar, 2, null);
    }

    public final Object q(int i11, zz.a<? super UserStatus> aVar) {
        return this.f40247d.b(i11, aVar);
    }

    public final Object r(zz.a<? super Boolean> aVar) {
        return this.f40247d.c(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(com.forsale.app.datalayer.database.UserEntity r6, boolean r7, zz.a<? super wz.p> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.forsale.app.utils.facades.user.UserProfileInteractor$update$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.utils.facades.user.UserProfileInteractor$update$1 r0 = (com.forsale.app.utils.facades.user.UserProfileInteractor$update$1) r0
            int r1 = r0.f40279e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40279e = r1
            goto L18
        L13:
            com.forsale.app.utils.facades.user.UserProfileInteractor$update$1 r0 = new com.forsale.app.utils.facades.user.UserProfileInteractor$update$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f40277c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f40279e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r8)
            goto L63
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f40276b
            com.forsale.app.datalayer.database.UserEntity r6 = (com.forsale.app.datalayer.database.UserEntity) r6
            java.lang.Object r7 = r0.f40275a
            com.forsale.app.utils.facades.user.UserProfileInteractor r7 = (com.forsale.app.utils.facades.user.UserProfileInteractor) r7
            kotlin.f.b(r8)
            goto L55
        L40:
            kotlin.f.b(r8)
            if (r7 != 0) goto L54
            com.forsale.app.datalayer.repositories.UserRepository r7 = r5.f40244a
            r0.f40275a = r5
            r0.f40276b = r6
            r0.f40279e = r4
            java.lang.Object r7 = r7.updateCachedUser(r6, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r7 = r5
        L55:
            r8 = 0
            r0.f40275a = r8
            r0.f40276b = r8
            r0.f40279e = r3
            java.lang.Object r6 = r7.w(r6, r0)
            if (r6 != r1) goto L63
            return r1
        L63:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.facades.user.UserProfileInteractor.t(com.forsale.app.datalayer.database.UserEntity, boolean, zz.a):java.lang.Object");
    }

    public final Object u(SessionEntity sessionEntity, zz.a<? super p> aVar) {
        Object f11;
        Object updateCachedSession = this.f40245b.updateCachedSession(sessionEntity, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (updateCachedSession == f11) {
            return updateCachedSession;
        }
        return p.f75480a;
    }
}
