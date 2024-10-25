package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat;

import com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel;
import com.forsale.app.utils.OneShotEventHandler;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UserActionsItem.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.UserActionsItem$UserActionsViewHolder$bindView$2", f = "UserActionsItem.kt", l = {35}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class UserActionsItem$UserActionsViewHolder$bindView$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27377a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ UserActionsItem f27378b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserActionsItem.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<NewListingDetailsViewModel.ActionType> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f27379a = new a();

        a() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(NewListingDetailsViewModel.ActionType actionType, zz.a<? super wz.p> aVar) {
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserActionsItem$UserActionsViewHolder$bindView$2(UserActionsItem userActionsItem, zz.a<? super UserActionsItem$UserActionsViewHolder$bindView$2> aVar) {
        super(2, aVar);
        this.f27378b = userActionsItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new UserActionsItem$UserActionsViewHolder$bindView$2(this.f27378b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f27377a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            OneShotEventHandler<NewListingDetailsViewModel.ActionType> a22 = this.f27378b.f27372f.a2();
            a aVar = a.f27379a;
            this.f27377a = 1;
            if (a22.e(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((UserActionsItem$UserActionsViewHolder$bindView$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
