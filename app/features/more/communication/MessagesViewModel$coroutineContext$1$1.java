package com.forsale.app.features.more.communication;

import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import zz.a;
/* compiled from: MessagesViewModel.kt */
@d(c = "com.forsale.app.features.more.communication.MessagesViewModel$coroutineContext$1$1", f = "MessagesViewModel.kt", l = {35}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class MessagesViewModel$coroutineContext$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31865a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Throwable f31866b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MessagesViewModel f31867c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessagesViewModel$coroutineContext$1$1(Throwable th2, MessagesViewModel messagesViewModel, a<? super MessagesViewModel$coroutineContext$1$1> aVar) {
        super(2, aVar);
        this.f31866b = th2;
        this.f31867c = messagesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new MessagesViewModel$coroutineContext$1$1(this.f31866b, this.f31867c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f31865a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            String message = this.f31866b.getMessage();
            if (message != null) {
                MutableSharedFlow<String> h02 = this.f31867c.h0();
                this.f31865a = 1;
                if (h02.emit(message, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((MessagesViewModel$coroutineContext$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
