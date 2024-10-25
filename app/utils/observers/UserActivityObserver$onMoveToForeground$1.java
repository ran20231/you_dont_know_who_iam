package com.forsale.app.utils.observers;

import com.forsale.app.datalayer.repositories.UserActivityRepository;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: UserActivityObserver.kt */
@d(c = "com.forsale.app.utils.observers.UserActivityObserver$onMoveToForeground$1", f = "UserActivityObserver.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class UserActivityObserver$onMoveToForeground$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f40384a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ UserActivityObserver f40385b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserActivityObserver$onMoveToForeground$1(UserActivityObserver userActivityObserver, zz.a<? super UserActivityObserver$onMoveToForeground$1> aVar) {
        super(2, aVar);
        this.f40385b = userActivityObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new UserActivityObserver$onMoveToForeground$1(this.f40385b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        UserActivityRepository userActivityRepository;
        f11 = b.f();
        int i11 = this.f40384a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            userActivityRepository = this.f40385b.f40382a;
            this.f40384a = 1;
            if (userActivityRepository.updateLastUserActivity(this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((UserActivityObserver$onMoveToForeground$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
