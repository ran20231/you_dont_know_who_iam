package com.forsale.app.features.welcome.loading;

import com.forsale.designSystem.bottomsheets.ModalBottomSheetState;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: SplashFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.welcome.loading.SplashFragment$ContactUsBottomSheet$1$1", f = "SplashFragment.kt", l = {203, 204}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SplashFragment$ContactUsBottomSheet$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37321a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ab.a f37322b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f37323c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashFragment$ContactUsBottomSheet$1$1(ab.a aVar, ModalBottomSheetState modalBottomSheetState, zz.a<? super SplashFragment$ContactUsBottomSheet$1$1> aVar2) {
        super(2, aVar2);
        this.f37322b = aVar;
        this.f37323c = modalBottomSheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SplashFragment$ContactUsBottomSheet$1$1(this.f37322b, this.f37323c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f37321a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            if (this.f37322b.c()) {
                ModalBottomSheetState modalBottomSheetState = this.f37323c;
                this.f37321a = 1;
                if (modalBottomSheetState.Q(this) == f11) {
                    return f11;
                }
            } else {
                ModalBottomSheetState modalBottomSheetState2 = this.f37323c;
                this.f37321a = 2;
                if (modalBottomSheetState2.M(this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SplashFragment$ContactUsBottomSheet$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
