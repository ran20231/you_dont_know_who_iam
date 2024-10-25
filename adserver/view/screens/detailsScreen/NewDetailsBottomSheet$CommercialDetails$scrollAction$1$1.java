package com.forsale.adserver.view.screens.detailsScreen;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
/* compiled from: NewDetailsBottomSheet.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheet$CommercialDetails$scrollAction$1$1", f = "NewDetailsBottomSheet.kt", l = {202, 203}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class NewDetailsBottomSheet$CommercialDetails$scrollAction$1$1 extends SuspendLambda implements g00.l<zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21258a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LazyGridState f21259b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewDetailsBottomSheet$CommercialDetails$scrollAction$1$1(LazyGridState lazyGridState, zz.a<? super NewDetailsBottomSheet$CommercialDetails$scrollAction$1$1> aVar) {
        super(1, aVar);
        this.f21259b = lazyGridState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(zz.a<?> aVar) {
        return new NewDetailsBottomSheet$CommercialDetails$scrollAction$1$1(this.f21259b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f21258a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            this.f21258a = 1;
            if (DelayKt.delay(100L, this) == f11) {
                return f11;
            }
        }
        LazyGridState lazyGridState = this.f21259b;
        this.f21258a = 2;
        if (LazyGridState.i(lazyGridState, 0, 0, this, 2, null) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super wz.p> aVar) {
        return ((NewDetailsBottomSheet$CommercialDetails$scrollAction$1$1) create(aVar)).invokeSuspend(wz.p.f75480a);
    }
}
