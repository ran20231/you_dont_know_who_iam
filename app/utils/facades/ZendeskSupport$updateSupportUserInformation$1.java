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
@d(c = "com.forsale.app.utils.facades.ZendeskSupport$updateSupportUserInformation$1", f = "ZendeskSupport.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ZendeskSupport$updateSupportUserInformation$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f40152a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ZendeskSupport f40153b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f40154c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZendeskSupport$updateSupportUserInformation$1(ZendeskSupport zendeskSupport, String str, a<? super ZendeskSupport$updateSupportUserInformation$1> aVar) {
        super(2, aVar);
        this.f40153b = zendeskSupport;
        this.f40154c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new ZendeskSupport$updateSupportUserInformation$1(this.f40153b, this.f40154c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object s11;
        f11 = b.f();
        int i11 = this.f40152a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            ZendeskSupport zendeskSupport = this.f40153b;
            String str = this.f40154c;
            this.f40152a = 1;
            s11 = zendeskSupport.s(str, this);
            if (s11 == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((ZendeskSupport$updateSupportUserInformation$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
