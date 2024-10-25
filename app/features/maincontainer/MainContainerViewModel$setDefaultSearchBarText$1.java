package com.forsale.app.features.maincontainer;

import com.google.android.gms.ads.AdRequest;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import t9.r0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainContainerViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerViewModel$setDefaultSearchBarText$1", f = "MainContainerViewModel.kt", l = {AdRequest.MAX_CONTENT_URL_LENGTH}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainContainerViewModel$setDefaultSearchBarText$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31519a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f31520b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MainContainerViewModel f31521c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerViewModel$setDefaultSearchBarText$1(int i11, MainContainerViewModel mainContainerViewModel, zz.a<? super MainContainerViewModel$setDefaultSearchBarText$1> aVar) {
        super(2, aVar);
        this.f31520b = i11;
        this.f31521c = mainContainerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MainContainerViewModel$setDefaultSearchBarText$1(this.f31520b, this.f31521c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        boolean z11;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31519a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            int i12 = this.f31520b;
            boolean z12 = false;
            if (i12 == r0.P5 || i12 == r0.G8) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 || i12 == r0.f70057r6) {
                z12 = true;
            }
            if (z12) {
                mutableSharedFlow = this.f31521c.Y0;
                this.f31519a = 1;
                if (mutableSharedFlow.emit(null, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MainContainerViewModel$setDefaultSearchBarText$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
