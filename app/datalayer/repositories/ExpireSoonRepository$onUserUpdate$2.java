package com.forsale.app.datalayer.repositories;

import androidx.lifecycle.b0;
import com.forsale.app.features.auth.UserStatus;
import g00.p;
import java.util.LinkedHashSet;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExpireSoonRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.ExpireSoonRepository$onUserUpdate$2", f = "ExpireSoonRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ExpireSoonRepository$onUserUpdate$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {
    final /* synthetic */ UserStatus $userStatus;
    int label;
    final /* synthetic */ ExpireSoonRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpireSoonRepository$onUserUpdate$2(UserStatus userStatus, ExpireSoonRepository expireSoonRepository, zz.a<? super ExpireSoonRepository$onUserUpdate$2> aVar) {
        super(2, aVar);
        this.$userStatus = userStatus;
        this.this$0 = expireSoonRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ExpireSoonRepository$onUserUpdate$2(this.$userStatus, this.this$0, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        b0 b0Var2;
        b0 b0Var3;
        b0 b0Var4;
        b0 b0Var5;
        b0 b0Var6;
        kotlin.coroutines.intrinsics.b.f();
        if (this.label == 0) {
            f.b(obj);
            if (this.$userStatus != UserStatus.LoggedIn) {
                b0Var = this.this$0.aboutToExpireListings;
                b0Var.setValue(null);
                b0Var2 = this.this$0.responseTime;
                b0Var2.setValue(null);
                this.this$0.getTimer().c();
                b0Var3 = this.this$0.activeAboutToExpireListing;
                b0Var3.setValue(null);
                b0Var4 = this.this$0.viewedAds;
                b0Var4.setValue(new LinkedHashSet());
                b0Var5 = this.this$0.isLoggedIn;
                b0Var5.setValue(kotlin.coroutines.jvm.internal.a.a(false));
            } else {
                ExpireSoonRepository.loadATEListings$default(this.this$0, false, 1, null);
                b0Var6 = this.this$0.isLoggedIn;
                b0Var6.setValue(kotlin.coroutines.jvm.internal.a.a(true));
            }
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ExpireSoonRepository$onUserUpdate$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
