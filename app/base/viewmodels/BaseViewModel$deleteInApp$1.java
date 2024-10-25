package com.forsale.app.base.viewmodels;

import com.forsale.app.datalayer.database.InAppMessageEntity;
import com.forsale.app.datalayer.repositories.InAppRepository;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseViewModel.kt */
@d(c = "com.forsale.app.base.viewmodels.BaseViewModel$deleteInApp$1", f = "BaseViewModel.kt", l = {203}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BaseViewModel$deleteInApp$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22276a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BaseViewModel f22277b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ InAppMessageEntity f22278c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModel$deleteInApp$1(BaseViewModel baseViewModel, InAppMessageEntity inAppMessageEntity, a<? super BaseViewModel$deleteInApp$1> aVar) {
        super(2, aVar);
        this.f22277b = baseViewModel;
        this.f22278c = inAppMessageEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new BaseViewModel$deleteInApp$1(this.f22277b, this.f22278c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f22276a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            InAppRepository A = this.f22277b.A();
            InAppMessageEntity inAppMessageEntity = this.f22278c;
            this.f22276a = 1;
            if (A.deleteInAppMessage(inAppMessageEntity, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((BaseViewModel$deleteInApp$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
