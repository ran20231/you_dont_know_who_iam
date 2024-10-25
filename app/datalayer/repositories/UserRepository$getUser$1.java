package com.forsale.app.datalayer.repositories;

import com.google.android.gms.maps.model.PinConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.UserRepository", f = "UserRepository.kt", l = {PinConfig.BITMAP_LENGTH_DP, 41, 43}, m = "getUser")
/* loaded from: classes2.dex */
public final class UserRepository$getUser$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRepository$getUser$1(UserRepository userRepository, zz.a<? super UserRepository$getUser$1> aVar) {
        super(aVar);
        this.this$0 = userRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getUser(null, null, null, false, this);
    }
}
