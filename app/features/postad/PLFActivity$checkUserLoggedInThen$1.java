package com.forsale.app.features.postad;

import com.forsale.app.features.auth.e;
import com.forsale.app.features.auth.login.SignInIntention;
import com.forsale.app.utils.analytics.auth.AuthenticationSourcePage;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PLFActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.PLFActivity$checkUserLoggedInThen$1", f = "PLFActivity.kt", l = {305}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PLFActivity$checkUserLoggedInThen$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33859a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PLFActivity f33860b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f33861c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SignInIntention f33862d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PLFActivity$checkUserLoggedInThen$1(PLFActivity pLFActivity, g00.a<wz.p> aVar, SignInIntention signInIntention, zz.a<? super PLFActivity$checkUserLoggedInThen$1> aVar2) {
        super(2, aVar2);
        this.f33860b = pLFActivity;
        this.f33861c = aVar;
        this.f33862d = signInIntention;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PLFActivity$checkUserLoggedInThen$1(this.f33860b, this.f33861c, this.f33862d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33859a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            PostAdViewModel x02 = this.f33860b.x0();
            this.f33859a = 1;
            obj = x02.x3(this);
            if (obj == f11) {
                return f11;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.f33861c.invoke();
        } else {
            com.forsale.app.features.auth.e T0 = this.f33860b.T0();
            AuthenticationSourcePage authenticationSourcePage = AuthenticationSourcePage.ADD_LISTING;
            SignInIntention signInIntention = this.f33862d;
            final g00.a<wz.p> aVar = this.f33861c;
            e.a.a(T0, authenticationSourcePage, signInIntention, null, new g00.a<wz.p>() { // from class: com.forsale.app.features.postad.PLFActivity$checkUserLoggedInThen$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ wz.p invoke() {
                    invoke2();
                    return wz.p.f75480a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    aVar.invoke();
                }
            }, 4, null);
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PLFActivity$checkUserLoggedInThen$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
