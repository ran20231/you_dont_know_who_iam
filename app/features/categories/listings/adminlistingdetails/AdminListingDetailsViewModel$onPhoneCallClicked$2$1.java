package com.forsale.app.features.categories.listings.adminlistingdetails;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import t9.y0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AdminListingDetailsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.adminlistingdetails.AdminListingDetailsViewModel$onPhoneCallClicked$2$1", f = "AdminListingDetailsViewModel.kt", l = {86}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AdminListingDetailsViewModel$onPhoneCallClicked$2$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28070a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AdminListingDetailsViewModel f28071b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdminListingDetailsViewModel$onPhoneCallClicked$2$1(AdminListingDetailsViewModel adminListingDetailsViewModel, zz.a<? super AdminListingDetailsViewModel$onPhoneCallClicked$2$1> aVar) {
        super(2, aVar);
        this.f28071b = adminListingDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AdminListingDetailsViewModel$onPhoneCallClicked$2$1(this.f28071b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28070a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            MutableSharedFlow<Integer> T = this.f28071b.T();
            Integer d11 = kotlin.coroutines.jvm.internal.a.d(y0.S4);
            this.f28070a = 1;
            if (T.emit(d11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AdminListingDetailsViewModel$onPhoneCallClicked$2$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
