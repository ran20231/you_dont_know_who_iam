package com.forsale.app.utils.facades.user;

import com.forsale.app.datalayer.database.UserEntity;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
import l8.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UpdateUserInteractor.kt */
@d(c = "com.forsale.app.utils.facades.user.UpdateUserInteractor$updateCachedUser$2", f = "UpdateUserInteractor.kt", l = {53, a.f62266c, 59, 56, a.f62267d, 69, 74}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class UpdateUserInteractor$updateCachedUser$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super UserEntity>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f40226a;

    /* renamed from: b  reason: collision with root package name */
    Object f40227b;

    /* renamed from: c  reason: collision with root package name */
    Object f40228c;

    /* renamed from: d  reason: collision with root package name */
    Object f40229d;

    /* renamed from: e  reason: collision with root package name */
    Object f40230e;

    /* renamed from: f  reason: collision with root package name */
    int f40231f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ UpdateUserInteractor f40232g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ UserEntity f40233h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateUserInteractor$updateCachedUser$2(UpdateUserInteractor updateUserInteractor, UserEntity userEntity, zz.a<? super UpdateUserInteractor$updateCachedUser$2> aVar) {
        super(2, aVar);
        this.f40232g = updateUserInteractor;
        this.f40233h = userEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new UpdateUserInteractor$updateCachedUser$2(this.f40232g, this.f40233h, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0138 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.facades.user.UpdateUserInteractor$updateCachedUser$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super UserEntity> aVar) {
        return ((UpdateUserInteractor$updateCachedUser$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
