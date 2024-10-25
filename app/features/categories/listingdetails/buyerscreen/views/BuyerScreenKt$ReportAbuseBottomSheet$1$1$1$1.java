package com.forsale.app.features.categories.listingdetails.buyerscreen.views;

import com.forsale.designSystem.bottomsheets.ModalBottomSheetState;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* compiled from: BuyerScreen.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScreenKt$ReportAbuseBottomSheet$1$1$1$1", f = "BuyerScreen.kt", l = {474, 475}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BuyerScreenKt$ReportAbuseBottomSheet$1$1$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f26817a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f26818b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f26819c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerScreenKt$ReportAbuseBottomSheet$1$1$1$1(boolean z11, ModalBottomSheetState modalBottomSheetState, a<? super BuyerScreenKt$ReportAbuseBottomSheet$1$1$1$1> aVar) {
        super(2, aVar);
        this.f26818b = z11;
        this.f26819c = modalBottomSheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new BuyerScreenKt$ReportAbuseBottomSheet$1$1$1$1(this.f26818b, this.f26819c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f26817a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            if (this.f26818b) {
                ModalBottomSheetState modalBottomSheetState = this.f26819c;
                this.f26817a = 1;
                if (modalBottomSheetState.Q(this) == f11) {
                    return f11;
                }
            } else {
                ModalBottomSheetState modalBottomSheetState2 = this.f26819c;
                this.f26817a = 2;
                if (modalBottomSheetState2.M(this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((BuyerScreenKt$ReportAbuseBottomSheet$1$1$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
