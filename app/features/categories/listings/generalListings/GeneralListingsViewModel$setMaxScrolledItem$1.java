package com.forsale.app.features.categories.listings.generalListings;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GeneralListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel$setMaxScrolledItem$1", f = "GeneralListingsViewModel.kt", l = {235}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class GeneralListingsViewModel$setMaxScrolledItem$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f30513a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f30514b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ GeneralListingsViewModel f30515c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralListingsViewModel$setMaxScrolledItem$1(int i11, GeneralListingsViewModel generalListingsViewModel, zz.a<? super GeneralListingsViewModel$setMaxScrolledItem$1> aVar) {
        super(2, aVar);
        this.f30514b = i11;
        this.f30515c = generalListingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new GeneralListingsViewModel$setMaxScrolledItem$1(this.f30514b, this.f30515c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f30513a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            if (this.f30514b > this.f30515c.L().getValue().intValue()) {
                mutableStateFlow = this.f30515c.G;
                Integer d11 = kotlin.coroutines.jvm.internal.a.d(this.f30514b);
                this.f30513a = 1;
                if (mutableStateFlow.emit(d11, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((GeneralListingsViewModel$setMaxScrolledItem$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
