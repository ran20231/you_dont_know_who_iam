package com.forsale.app.features.categories.home.homelandingscreen;

import g00.p;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerticalViewModel.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$mimicLandingBannerHide$1", f = "VerticalViewModel.kt", l = {281}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class VerticalViewModel$mimicLandingBannerHide$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f24051a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VerticalViewModel f24052b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalViewModel$mimicLandingBannerHide$1(VerticalViewModel verticalViewModel, zz.a<? super VerticalViewModel$mimicLandingBannerHide$1> aVar) {
        super(2, aVar);
        this.f24052b = verticalViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new VerticalViewModel$mimicLandingBannerHide$1(this.f24052b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        AtomicBoolean F1;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f24051a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            F1 = this.f24052b.F1();
            if (F1.get()) {
                mutableSharedFlow = this.f24052b.F0;
                wz.p pVar = wz.p.f75480a;
                this.f24051a = 1;
                if (mutableSharedFlow.emit(pVar, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((VerticalViewModel$mimicLandingBannerHide$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
