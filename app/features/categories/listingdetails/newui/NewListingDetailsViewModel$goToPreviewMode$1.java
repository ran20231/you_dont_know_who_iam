package com.forsale.app.features.categories.listingdetails.newui;

import androidx.lifecycle.b0;
import com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import okhttp3.internal.ws.WebSocketProtocol;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewListingDetailsViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$goToPreviewMode$1", f = "NewListingDetailsViewModel.kt", l = {263, 265}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewListingDetailsViewModel$goToPreviewMode$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27264a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewListingDetailsViewModel f27265b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewListingDetailsViewModel$goToPreviewMode$1(NewListingDetailsViewModel newListingDetailsViewModel, zz.a<? super NewListingDetailsViewModel$goToPreviewMode$1> aVar) {
        super(2, aVar);
        this.f27265b = newListingDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewListingDetailsViewModel$goToPreviewMode$1(this.f27265b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        b0 b0Var;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f27264a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    this.f27265b.p1();
                    this.f27265b.R1().Z1();
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            NewListingDetailsViewModel.J2(this.f27265b, AggregatedAllAnalyticsLogger.AdvActionEvents.MY_LISTING_PREVIEWED, null, false, false, false, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
            mutableSharedFlow = this.f27265b.B1;
            wz.p pVar = wz.p.f75480a;
            this.f27264a = 1;
            if (mutableSharedFlow.emit(pVar, this) == f11) {
                return f11;
            }
        }
        b0Var = this.f27265b.Y0;
        if (b0Var != null) {
            b0Var.postValue(NewListingDetailsViewModel.UserType.GUEST);
        }
        MutableStateFlow<Boolean> v12 = this.f27265b.R1().v1();
        Boolean a11 = kotlin.coroutines.jvm.internal.a.a(true);
        this.f27264a = 2;
        if (v12.emit(a11, this) == f11) {
            return f11;
        }
        this.f27265b.p1();
        this.f27265b.R1().Z1();
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewListingDetailsViewModel$goToPreviewMode$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
