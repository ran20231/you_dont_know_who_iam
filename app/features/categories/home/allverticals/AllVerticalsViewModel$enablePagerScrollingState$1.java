package com.forsale.app.features.categories.home.allverticals;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AllVerticalsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$enablePagerScrollingState$1", f = "AllVerticalsViewModel.kt", l = {257}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AllVerticalsViewModel$enablePagerScrollingState$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23427a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AllVerticalsViewModel f23428b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f23429c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllVerticalsViewModel$enablePagerScrollingState$1(AllVerticalsViewModel allVerticalsViewModel, boolean z11, zz.a<? super AllVerticalsViewModel$enablePagerScrollingState$1> aVar) {
        super(2, aVar);
        this.f23428b = allVerticalsViewModel;
        this.f23429c = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AllVerticalsViewModel$enablePagerScrollingState$1(this.f23428b, this.f23429c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f23427a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableStateFlow = this.f23428b.R;
            Boolean a11 = kotlin.coroutines.jvm.internal.a.a(this.f23429c);
            this.f23427a = 1;
            if (mutableStateFlow.emit(a11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AllVerticalsViewModel$enablePagerScrollingState$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
