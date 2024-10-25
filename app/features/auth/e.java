package com.forsale.app.features.auth;

import com.forsale.app.features.auth.login.SignInIntention;
import com.forsale.app.utils.analytics.auth.AuthenticationSourcePage;
import wz.p;
/* compiled from: AuthenticationDelegationImp.kt */
/* loaded from: classes2.dex */
public interface e {

    /* compiled from: AuthenticationDelegationImp.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void a(e eVar, AuthenticationSourcePage authenticationSourcePage, SignInIntention signInIntention, g00.a aVar, g00.a aVar2, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 4) != 0) {
                    aVar = null;
                }
                if ((i11 & 8) != 0) {
                    aVar2 = null;
                }
                eVar.a(authenticationSourcePage, signInIntention, aVar, aVar2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doActionWithAuthentication");
        }
    }

    void a(AuthenticationSourcePage authenticationSourcePage, SignInIntention signInIntention, g00.a<p> aVar, g00.a<p> aVar2);
}
