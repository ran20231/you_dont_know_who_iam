package com.forsale.app.utils.facades.user;

import com.forsale.app.analytics.base.ForSaleDataTracker;
import com.forsale.app.datalayer.network.services.UserProfileServices;
import com.forsale.app.datalayer.repositories.UserRepository;
import com.forsale.app.features.auth.UserStatus;
import com.forsale.app.utils.Languages;
import com.forsale.app.utils.LocaleManager;
import com.forsale.core.netowrk.connectivityobserver.ConnectivityObserver;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import wz.p;
import zz.a;
/* compiled from: UserLanguageInteractor.kt */
/* loaded from: classes3.dex */
public final class UserLanguageInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final UserProfileServices f40234a;

    /* renamed from: b  reason: collision with root package name */
    private final UserRepository f40235b;

    /* renamed from: c  reason: collision with root package name */
    private final ForSaleDataTracker f40236c;

    /* renamed from: d  reason: collision with root package name */
    private final ConnectivityObserver f40237d;

    public UserLanguageInteractor(UserProfileServices userProfileServices, UserRepository userRepository, ForSaleDataTracker tracker, ConnectivityObserver connectivityObserver) {
        o.i(userProfileServices, "userProfileServices");
        o.i(userRepository, "userRepository");
        o.i(tracker, "tracker");
        o.i(connectivityObserver, "connectivityObserver");
        this.f40234a = userProfileServices;
        this.f40235b = userRepository;
        this.f40236c = tracker;
        this.f40237d = connectivityObserver;
    }

    public final Object d(a<? super String> aVar) {
        return LocaleManager.f39597a.h(aVar);
    }

    public final Object e(Languages languages, a<? super Boolean> aVar) {
        return LocaleManager.f39597a.w(languages, aVar);
    }

    public final Object f(UserStatus userStatus, Languages languages, a<? super p> aVar) {
        Object f11;
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new UserLanguageInteractor$setUserLanguage$2(userStatus, this, languages, null), aVar);
        f11 = b.f();
        if (withContext == f11) {
            return withContext;
        }
        return p.f75480a;
    }
}
