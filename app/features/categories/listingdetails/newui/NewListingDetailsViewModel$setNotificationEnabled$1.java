package com.forsale.app.features.categories.listingdetails.newui;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewListingDetailsViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$setNotificationEnabled$1", f = "NewListingDetailsViewModel.kt", l = {294}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewListingDetailsViewModel$setNotificationEnabled$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27318a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewListingDetailsViewModel f27319b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f27320c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewListingDetailsViewModel$setNotificationEnabled$1(NewListingDetailsViewModel newListingDetailsViewModel, boolean z11, zz.a<? super NewListingDetailsViewModel$setNotificationEnabled$1> aVar) {
        super(2, aVar);
        this.f27319b = newListingDetailsViewModel;
        this.f27320c = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewListingDetailsViewModel$setNotificationEnabled$1(this.f27319b, this.f27320c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f27318a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableStateFlow = this.f27319b.f27199y0;
            Boolean a11 = kotlin.coroutines.jvm.internal.a.a(this.f27320c);
            this.f27318a = 1;
            if (mutableStateFlow.emit(a11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewListingDetailsViewModel$setNotificationEnabled$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
