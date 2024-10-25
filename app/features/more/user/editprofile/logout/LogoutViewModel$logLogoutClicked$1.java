package com.forsale.app.features.more.user.editprofile.logout;

import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.utils.analytics.auth.logout.LogoutAnalyticsEvents;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LogoutViewModel.kt */
@d(c = "com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$logLogoutClicked$1", f = "LogoutViewModel.kt", l = {102}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LogoutViewModel$logLogoutClicked$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f33491a;

    /* renamed from: b  reason: collision with root package name */
    Object f33492b;

    /* renamed from: c  reason: collision with root package name */
    Object f33493c;

    /* renamed from: d  reason: collision with root package name */
    Object f33494d;

    /* renamed from: e  reason: collision with root package name */
    int f33495e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ LogoutViewModel f33496f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ boolean f33497g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoutViewModel$logLogoutClicked$1(LogoutViewModel logoutViewModel, boolean z11, a<? super LogoutViewModel$logLogoutClicked$1> aVar) {
        super(2, aVar);
        this.f33496f = logoutViewModel;
        this.f33497g = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new LogoutViewModel$logLogoutClicked$1(this.f33496f, this.f33497g, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        he.a aVar;
        Boolean a11;
        he.a aVar2;
        Object E0;
        he.a aVar3;
        LogoutAnalyticsEvents logoutAnalyticsEvents;
        f11 = b.f();
        int i11 = this.f33495e;
        if (i11 != 0) {
            if (i11 == 1) {
                aVar3 = (he.a) this.f33494d;
                a11 = (Boolean) this.f33493c;
                logoutAnalyticsEvents = (LogoutAnalyticsEvents) this.f33492b;
                aVar = (he.a) this.f33491a;
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            aVar = this.f33496f.f33449l0;
            LogoutAnalyticsEvents logoutAnalyticsEvents2 = LogoutAnalyticsEvents.LOGOUT_CLICKED;
            a11 = kotlin.coroutines.jvm.internal.a.a(this.f33497g);
            aVar2 = this.f33496f.f33449l0;
            LogoutViewModel logoutViewModel = this.f33496f;
            this.f33491a = aVar;
            this.f33492b = logoutAnalyticsEvents2;
            this.f33493c = a11;
            this.f33494d = aVar2;
            this.f33495e = 1;
            E0 = logoutViewModel.E0(this);
            if (E0 == f11) {
                return f11;
            }
            aVar3 = aVar2;
            logoutAnalyticsEvents = logoutAnalyticsEvents2;
            obj = E0;
        }
        aVar.c(logoutAnalyticsEvents, new qi.a(a11, aVar3.b((UserEntity) obj)));
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((LogoutViewModel$logLogoutClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
