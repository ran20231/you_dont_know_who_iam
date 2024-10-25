package com.forsale.app.base.viewmodels;

import com.forsale.app.datalayer.database.InAppMessageEntity;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import zz.a;
/* compiled from: BaseViewModel.kt */
@d(c = "com.forsale.app.base.viewmodels.BaseViewModel$consumeInAppMessage$1$1$2", f = "BaseViewModel.kt", l = {155}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BaseViewModel$consumeInAppMessage$1$1$2 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22254a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BaseViewModel f22255b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ InAppMessageEntity f22256c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModel$consumeInAppMessage$1$1$2(BaseViewModel baseViewModel, InAppMessageEntity inAppMessageEntity, a<? super BaseViewModel$consumeInAppMessage$1$1$2> aVar) {
        super(2, aVar);
        this.f22255b = baseViewModel;
        this.f22256c = inAppMessageEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new BaseViewModel$consumeInAppMessage$1$1$2(this.f22255b, this.f22256c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f22254a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            MutableSharedFlow<InAppMessageEntity> Y = this.f22255b.Y();
            InAppMessageEntity inAppMessageEntity = this.f22256c;
            this.f22254a = 1;
            if (Y.emit(inAppMessageEntity, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((BaseViewModel$consumeInAppMessage$1$1$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
