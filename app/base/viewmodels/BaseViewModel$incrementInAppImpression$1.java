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
@d(c = "com.forsale.app.base.viewmodels.BaseViewModel$incrementInAppImpression$1", f = "BaseViewModel.kt", l = {218, 219}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BaseViewModel$incrementInAppImpression$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22282a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BaseViewModel f22283b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ InAppMessageEntity f22284c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModel$incrementInAppImpression$1(BaseViewModel baseViewModel, InAppMessageEntity inAppMessageEntity, a<? super BaseViewModel$incrementInAppImpression$1> aVar) {
        super(2, aVar);
        this.f22283b = baseViewModel;
        this.f22284c = inAppMessageEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new BaseViewModel$incrementInAppImpression$1(this.f22283b, this.f22284c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object p02;
        f11 = b.f();
        int i11 = this.f22282a;
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
            InAppRepository A = this.f22283b.A();
            InAppMessageEntity inAppMessageEntity = this.f22284c;
            this.f22282a = 1;
            if (A.incrementInAppMessageImpression(inAppMessageEntity, this) == f11) {
                return f11;
            }
        }
        BaseViewModel baseViewModel = this.f22283b;
        InAppMessageEntity inAppMessageEntity2 = this.f22284c;
        this.f22282a = 2;
        p02 = baseViewModel.p0(inAppMessageEntity2, this);
        if (p02 == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((BaseViewModel$incrementInAppImpression$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
