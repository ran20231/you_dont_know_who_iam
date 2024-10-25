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
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseViewModel.kt */
@d(c = "com.forsale.app.base.viewmodels.BaseViewModel$consumePromotedPostAsync$2$1$1", f = "BaseViewModel.kt", l = {181}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BaseViewModel$consumePromotedPostAsync$2$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22273a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BaseViewModel f22274b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ InAppMessageEntity f22275c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModel$consumePromotedPostAsync$2$1$1(BaseViewModel baseViewModel, InAppMessageEntity inAppMessageEntity, a<? super BaseViewModel$consumePromotedPostAsync$2$1$1> aVar) {
        super(2, aVar);
        this.f22274b = baseViewModel;
        this.f22275c = inAppMessageEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new BaseViewModel$consumePromotedPostAsync$2$1$1(this.f22274b, this.f22275c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f22273a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            MutableSharedFlow<InAppMessageEntity> Y = this.f22274b.Y();
            InAppMessageEntity inAppMessageEntity = this.f22275c;
            this.f22273a = 1;
            if (Y.emit(inAppMessageEntity, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((BaseViewModel$consumePromotedPostAsync$2$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
