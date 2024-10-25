package com.forsale.app.notifications.fcm;

import com.forsale.app.datalayer.repositories.ForSaleMessagingRepository;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ForSaleMessagingService.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.notifications.fcm.ForSaleMessagingService$onNewToken$1", f = "ForSaleMessagingService.kt", l = {48, 49}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ForSaleMessagingService$onNewToken$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37610a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ForSaleMessagingService f37611b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f37612c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForSaleMessagingService$onNewToken$1(ForSaleMessagingService forSaleMessagingService, String str, zz.a<? super ForSaleMessagingService$onNewToken$1> aVar) {
        super(2, aVar);
        this.f37611b = forSaleMessagingService;
        this.f37612c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ForSaleMessagingService$onNewToken$1(this.f37611b, this.f37612c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f37610a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            this.f37610a = 1;
            if (DelayKt.delay(1000L, this) == f11) {
                return f11;
            }
        }
        ForSaleMessagingRepository d11 = this.f37611b.d();
        String str = this.f37612c;
        this.f37610a = 2;
        if (d11.updatePushToken(str, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ForSaleMessagingService$onNewToken$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
