package com.forsale.app.features.more.user.editprofile.logout;

import android.text.Html;
import com.forsale.app.datalayer.network.entities.CmsEntity;
import com.forsale.app.features.auth.UserStatus;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LogoutViewModel.kt */
@d(c = "com.forsale.app.features.more.user.editprofile.logout.LogoutViewModel$getLogoutText$1", f = "LogoutViewModel.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LogoutViewModel$getLogoutText$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33487a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ UserStatus f33488b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LogoutViewModel f33489c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f33490d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoutViewModel$getLogoutText$1(UserStatus userStatus, LogoutViewModel logoutViewModel, int i11, a<? super LogoutViewModel$getLogoutText$1> aVar) {
        super(2, aVar);
        this.f33488b = userStatus;
        this.f33489c = logoutViewModel;
        this.f33490d = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new LogoutViewModel$getLogoutText$1(this.f33488b, this.f33489c, this.f33490d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ie.a aVar;
        f11 = b.f();
        int i11 = this.f33487a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            if (this.f33488b != UserStatus.NotLoggedIn) {
                aVar = this.f33489c.f33448k0;
                int i12 = this.f33490d;
                this.f33487a = 1;
                obj = aVar.a(i12, 1, this);
                if (obj == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }
        this.f33489c.G0().k(Html.fromHtml(((CmsEntity) obj).getContent(), 63));
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((LogoutViewModel$getLogoutText$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
