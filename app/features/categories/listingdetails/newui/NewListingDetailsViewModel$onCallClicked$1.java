package com.forsale.app.features.categories.listingdetails.newui;

import com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel;
import com.forsale.app.utils.OneShotEventHandler;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewListingDetailsViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$onCallClicked$1", f = "NewListingDetailsViewModel.kt", l = {305}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewListingDetailsViewModel$onCallClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27287a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewListingDetailsViewModel f27288b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NewListingDetailsViewModel.ActionType f27289c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewListingDetailsViewModel$onCallClicked$1(NewListingDetailsViewModel newListingDetailsViewModel, NewListingDetailsViewModel.ActionType actionType, zz.a<? super NewListingDetailsViewModel$onCallClicked$1> aVar) {
        super(2, aVar);
        this.f27288b = newListingDetailsViewModel;
        this.f27289c = actionType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewListingDetailsViewModel$onCallClicked$1(this.f27288b, this.f27289c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f27287a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            OneShotEventHandler<NewListingDetailsViewModel.ActionType> a22 = this.f27288b.a2();
            NewListingDetailsViewModel.ActionType actionType = this.f27289c;
            this.f27287a = 1;
            if (a22.f(actionType, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewListingDetailsViewModel$onCallClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
