package com.forsale.app.features.categories.home.homelandingscreen;

import com.forsale.app.base.ViewStates;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerticalViewModel.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadHomeData$2", f = "VerticalViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class VerticalViewModel$loadHomeData$2 extends SuspendLambda implements p<VerticalViewModel, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23993a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f23994b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ VerticalViewModel f23995c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalViewModel$loadHomeData$2(boolean z11, VerticalViewModel verticalViewModel, zz.a<? super VerticalViewModel$loadHomeData$2> aVar) {
        super(2, aVar);
        this.f23994b = z11;
        this.f23995c = verticalViewModel;
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(VerticalViewModel verticalViewModel, zz.a<? super wz.p> aVar) {
        return ((VerticalViewModel$loadHomeData$2) create(verticalViewModel, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new VerticalViewModel$loadHomeData$2(this.f23994b, this.f23995c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f23993a == 0) {
            f.b(obj);
            if (!this.f23994b && this.f23995c.v0().getValue() != ViewStates.INITIAL && this.f23995c.v0().getValue() != ViewStates.ERROR && this.f23995c.v0().getValue() != ViewStates.CONNECTION_ERROR) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                this.f23995c.v0().setValue(ViewStates.LOADING);
            }
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
