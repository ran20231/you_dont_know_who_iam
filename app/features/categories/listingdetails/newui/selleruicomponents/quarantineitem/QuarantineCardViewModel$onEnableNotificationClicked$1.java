package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.quarantineitem;

import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import l8.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: QuarantineCardViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.quarantineitem.QuarantineCardViewModel$onEnableNotificationClicked$1", f = "QuarantineCardViewModel.kt", l = {a.f62266c}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class QuarantineCardViewModel$onEnableNotificationClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27935a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ QuarantineCardViewModel f27936b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuarantineCardViewModel$onEnableNotificationClicked$1(QuarantineCardViewModel quarantineCardViewModel, zz.a<? super QuarantineCardViewModel$onEnableNotificationClicked$1> aVar) {
        super(2, aVar);
        this.f27936b = quarantineCardViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new QuarantineCardViewModel$onEnableNotificationClicked$1(this.f27936b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = b.f();
        int i11 = this.f27935a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f27936b.f27931f;
            wz.p pVar = wz.p.f75480a;
            this.f27935a = 1;
            if (mutableSharedFlow.emit(pVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((QuarantineCardViewModel$onEnableNotificationClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
