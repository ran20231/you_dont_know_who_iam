package com.forsale.app.features.categories.listings.generalListings;

import com.forsale.app.datalayer.network.requestsbodies.MyListingsType;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GeneralListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel$setSelectedFilter$1", f = "GeneralListingsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class GeneralListingsViewModel$setSelectedFilter$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f30516a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ GeneralListingsViewModel f30517b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MyListingsType f30518c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralListingsViewModel$setSelectedFilter$1(GeneralListingsViewModel generalListingsViewModel, MyListingsType myListingsType, zz.a<? super GeneralListingsViewModel$setSelectedFilter$1> aVar) {
        super(2, aVar);
        this.f30517b = generalListingsViewModel;
        this.f30518c = myListingsType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new GeneralListingsViewModel$setSelectedFilter$1(this.f30517b, this.f30518c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        Object value;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f30516a == 0) {
            kotlin.f.b(obj);
            mutableStateFlow = this.f30517b.O;
            MyListingsType myListingsType = this.f30518c;
            do {
                value = mutableStateFlow.getValue();
                MyListingsType myListingsType2 = (MyListingsType) value;
            } while (!mutableStateFlow.compareAndSet(value, myListingsType));
            this.f30517b.c0();
            this.f30517b.b0();
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((GeneralListingsViewModel$setSelectedFilter$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
