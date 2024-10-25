package com.forsale.app.utils.facades.user;

import com.forsale.app.datalayer.database.UserEntity;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserProfileInteractor.kt */
@d(c = "com.forsale.app.utils.facades.user.UserProfileInteractor$updateCachedUser$2", f = "UserProfileInteractor.kt", l = {116, 117, 122, 119, WebSocketProtocol.PAYLOAD_SHORT, 132, 137}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class UserProfileInteractor$updateCachedUser$2 extends SuspendLambda implements p<CoroutineScope, a<? super UserEntity>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f40280a;

    /* renamed from: b  reason: collision with root package name */
    Object f40281b;

    /* renamed from: c  reason: collision with root package name */
    Object f40282c;

    /* renamed from: d  reason: collision with root package name */
    Object f40283d;

    /* renamed from: e  reason: collision with root package name */
    Object f40284e;

    /* renamed from: f  reason: collision with root package name */
    int f40285f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ UserProfileInteractor f40286g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ UserEntity f40287h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileInteractor$updateCachedUser$2(UserProfileInteractor userProfileInteractor, UserEntity userEntity, a<? super UserProfileInteractor$updateCachedUser$2> aVar) {
        super(2, aVar);
        this.f40286g = userProfileInteractor;
        this.f40287h = userEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new UserProfileInteractor$updateCachedUser$2(this.f40286g, this.f40287h, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0151 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0152  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.facades.user.UserProfileInteractor$updateCachedUser$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super UserEntity> aVar) {
        return ((UserProfileInteractor$updateCachedUser$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
