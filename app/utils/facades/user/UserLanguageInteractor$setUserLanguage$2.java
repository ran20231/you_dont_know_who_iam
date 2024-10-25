package com.forsale.app.utils.facades.user;

import com.forsale.app.analytics.base.ForSaleDataTracker;
import com.forsale.app.analytics.base.e;
import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.datalayer.network.requestsbodies.SetLanguageBody;
import com.forsale.app.datalayer.network.services.UserProfileServices;
import com.forsale.app.features.auth.UserStatus;
import com.forsale.app.utils.Languages;
import com.forsale.app.utils.LocaleManager;
import com.forsale.core.netowrk.connectivityobserver.ConnectivityObserver;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserLanguageInteractor.kt */
@d(c = "com.forsale.app.utils.facades.user.UserLanguageInteractor$setUserLanguage$2", f = "UserLanguageInteractor.kt", l = {41, 42}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class UserLanguageInteractor$setUserLanguage$2 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f40238a;

    /* renamed from: b  reason: collision with root package name */
    Object f40239b;

    /* renamed from: c  reason: collision with root package name */
    int f40240c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ UserStatus f40241d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ UserLanguageInteractor f40242e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Languages f40243f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserLanguageInteractor$setUserLanguage$2(UserStatus userStatus, UserLanguageInteractor userLanguageInteractor, Languages languages, a<? super UserLanguageInteractor$setUserLanguage$2> aVar) {
        super(2, aVar);
        this.f40241d = userStatus;
        this.f40242e = userLanguageInteractor;
        this.f40243f = languages;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new UserLanguageInteractor$setUserLanguage$2(this.f40241d, this.f40242e, this.f40243f, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ConnectivityObserver connectivityObserver;
        UserProfileServices userProfileServices;
        Languages languages;
        UserLanguageInteractor userLanguageInteractor;
        ForSaleDataTracker forSaleDataTracker;
        f11 = b.f();
        int i11 = this.f40240c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    userLanguageInteractor = (UserLanguageInteractor) this.f40239b;
                    languages = (Languages) this.f40238a;
                    f.b(obj);
                    forSaleDataTracker = userLanguageInteractor.f40236c;
                    forSaleDataTracker.c(new e.b(languages));
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            if (this.f40241d == UserStatus.LoggedIn) {
                connectivityObserver = this.f40242e.f40237d;
                if (connectivityObserver.a() == ConnectivityObserver.NetworkStatus.Connected) {
                    userProfileServices = this.f40242e.f40234a;
                    SetLanguageBody setLanguageBody = new SetLanguageBody(this.f40243f);
                    this.f40240c = 1;
                    obj = userProfileServices.setLanguage(setLanguageBody, this);
                    if (obj == f11) {
                        return f11;
                    }
                }
            }
            return wz.p.f75480a;
        }
        if (((UserEntity) obj) != null) {
            languages = this.f40243f;
            UserLanguageInteractor userLanguageInteractor2 = this.f40242e;
            LocaleManager localeManager = LocaleManager.f39597a;
            this.f40238a = languages;
            this.f40239b = userLanguageInteractor2;
            this.f40240c = 2;
            if (localeManager.w(languages, this) == f11) {
                return f11;
            }
            userLanguageInteractor = userLanguageInteractor2;
            forSaleDataTracker = userLanguageInteractor.f40236c;
            forSaleDataTracker.c(new e.b(languages));
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((UserLanguageInteractor$setUserLanguage$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
