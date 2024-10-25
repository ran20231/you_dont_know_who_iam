package com.forsale.app.features.categories.listings.generalListings;

import com.forsale.app.datalayer.network.requestsbodies.MyListingsType;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GeneralListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel$refreshIfMyListingModified$1", f = "GeneralListingsViewModel.kt", l = {114, 115}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class GeneralListingsViewModel$refreshIfMyListingModified$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f30508a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ GeneralListingsViewModel f30509b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralListingsViewModel$refreshIfMyListingModified$1(GeneralListingsViewModel generalListingsViewModel, zz.a<? super GeneralListingsViewModel$refreshIfMyListingModified$1> aVar) {
        super(2, aVar);
        this.f30509b = generalListingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new GeneralListingsViewModel$refreshIfMyListingModified$1(this.f30509b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        jj.b bVar;
        jj.b bVar2;
        MutableStateFlow mutableStateFlow;
        Object value;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f30508a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    mutableStateFlow = this.f30509b.O;
                    do {
                        value = mutableStateFlow.getValue();
                        MyListingsType myListingsType = (MyListingsType) value;
                    } while (!mutableStateFlow.compareAndSet(value, MyListingsType.ACTIVE));
                    this.f30509b.c0();
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            bVar = this.f30509b.f30480x;
            kj.c e11 = bVar.e();
            this.f30508a = 1;
            obj = e11.c(this);
            if (obj == f11) {
                return f11;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            bVar2 = this.f30509b.f30480x;
            kj.c e12 = bVar2.e();
            this.f30508a = 2;
            if (e12.h(false, this) == f11) {
                return f11;
            }
            mutableStateFlow = this.f30509b.O;
            do {
                value = mutableStateFlow.getValue();
                MyListingsType myListingsType2 = (MyListingsType) value;
            } while (!mutableStateFlow.compareAndSet(value, MyListingsType.ACTIVE));
            this.f30509b.c0();
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((GeneralListingsViewModel$refreshIfMyListingModified$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
