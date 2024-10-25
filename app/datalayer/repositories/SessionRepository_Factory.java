package com.forsale.app.datalayer.repositories;

import android.content.Context;
import com.forsale.app.datalayer.network.services.AuthService;
import com.forsale.app.datalayer.network.services.SessionsService;
/* loaded from: classes2.dex */
public final class SessionRepository_Factory implements dagger.internal.b<SessionRepository> {
    private final vz.a<AuthService> authServiceProvider;
    private final vz.a<Context> contextProvider;
    private final vz.a<jj.b> prefProvider;
    private final vz.a<cv.b> rootBearProvider;
    private final vz.a<SessionDao> sessionDaoProvider;
    private final vz.a<SessionsService> sessionsServiceProvider;

    public SessionRepository_Factory(vz.a<Context> aVar, vz.a<SessionsService> aVar2, vz.a<SessionDao> aVar3, vz.a<cv.b> aVar4, vz.a<jj.b> aVar5, vz.a<AuthService> aVar6) {
        this.contextProvider = aVar;
        this.sessionsServiceProvider = aVar2;
        this.sessionDaoProvider = aVar3;
        this.rootBearProvider = aVar4;
        this.prefProvider = aVar5;
        this.authServiceProvider = aVar6;
    }

    public static SessionRepository_Factory create(vz.a<Context> aVar, vz.a<SessionsService> aVar2, vz.a<SessionDao> aVar3, vz.a<cv.b> aVar4, vz.a<jj.b> aVar5, vz.a<AuthService> aVar6) {
        return new SessionRepository_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6);
    }

    public static SessionRepository newInstance(Context context, SessionsService sessionsService, SessionDao sessionDao, cv.b bVar, jj.b bVar2, AuthService authService) {
        return new SessionRepository(context, sessionsService, sessionDao, bVar, bVar2, authService);
    }

    @Override // vz.a
    public SessionRepository get() {
        return newInstance(this.contextProvider.get(), this.sessionsServiceProvider.get(), this.sessionDaoProvider.get(), this.rootBearProvider.get(), this.prefProvider.get(), this.authServiceProvider.get());
    }
}
