package com.forsale.app.utils.facades;

import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ZendeskSupport.kt */
@d(c = "com.forsale.app.utils.facades.ZendeskSupport$updateLiveChatInformation$1", f = "ZendeskSupport.kt", l = {86}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ZendeskSupport$updateLiveChatInformation$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f40149a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ZendeskSupport f40150b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f40151c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZendeskSupport$updateLiveChatInformation$1(ZendeskSupport zendeskSupport, String str, a<? super ZendeskSupport$updateLiveChatInformation$1> aVar) {
        super(2, aVar);
        this.f40150b = zendeskSupport;
        this.f40151c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new ZendeskSupport$updateLiveChatInformation$1(this.f40150b, this.f40151c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object t11;
        f11 = b.f();
        int i11 = this.f40149a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            ZendeskSupport zendeskSupport = this.f40150b;
            String str = this.f40151c;
            this.f40149a = 1;
            t11 = zendeskSupport.t(str, this);
            if (t11 == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((ZendeskSupport$updateLiveChatInformation$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
