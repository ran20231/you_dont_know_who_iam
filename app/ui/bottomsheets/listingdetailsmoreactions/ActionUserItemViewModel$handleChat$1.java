package com.forsale.app.ui.bottomsheets.listingdetailsmoreactions;

import com.forsale.app.utils.OneShotEventHandler;
import falcon.chat.entities.ChannelEntity;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActionUserItemViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.ActionUserItemViewModel$handleChat$1", f = "ActionUserItemViewModel.kt", l = {191}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ActionUserItemViewModel$handleChat$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38331a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ActionUserItemViewModel f38332b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionUserItemViewModel$handleChat$1(ActionUserItemViewModel actionUserItemViewModel, zz.a<? super ActionUserItemViewModel$handleChat$1> aVar) {
        super(2, aVar);
        this.f38332b = actionUserItemViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ActionUserItemViewModel$handleChat$1(this.f38332b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object g11;
        boolean z11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f38331a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
                g11 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            ActionUserItemViewModel actionUserItemViewModel = this.f38332b;
            this.f38331a = 1;
            g11 = actionUserItemViewModel.g(this);
            if (g11 == f11) {
                return f11;
            }
        }
        ActionUserItemViewModel actionUserItemViewModel2 = this.f38332b;
        if (((ChannelEntity) g11) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            actionUserItemViewModel2.q().i(new com.forsale.app.ui.bottomsheets.listingdetailschat.b(0, actionUserItemViewModel2.n(), actionUserItemViewModel2.l(), actionUserItemViewModel2.i(), actionUserItemViewModel2.F(), actionUserItemViewModel2.A(), null, null, actionUserItemViewModel2.o(), null, null, null, null, 7873, null));
        } else if (!z11) {
            OneShotEventHandler.d(actionUserItemViewModel2.z(), null, 1, null);
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ActionUserItemViewModel$handleChat$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
