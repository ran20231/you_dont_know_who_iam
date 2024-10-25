package com.forsale.app.features.categories.listings.generalListings;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GeneralListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel$refresh$1", f = "GeneralListingsViewModel.kt", l = {175, 176}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class GeneralListingsViewModel$refresh$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f30506a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ GeneralListingsViewModel f30507b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralListingsViewModel$refresh$1(GeneralListingsViewModel generalListingsViewModel, zz.a<? super GeneralListingsViewModel$refresh$1> aVar) {
        super(2, aVar);
        this.f30507b = generalListingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new GeneralListingsViewModel$refresh$1(this.f30507b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f30506a;
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
            mutableStateFlow = this.f30507b.J;
            Boolean a11 = kotlin.coroutines.jvm.internal.a.a(true);
            this.f30506a = 1;
            if (mutableStateFlow.emit(a11, this) == f11) {
                return f11;
            }
        }
        GeneralListingsViewModel generalListingsViewModel = this.f30507b;
        this.f30506a = 2;
        if (generalListingsViewModel.N(this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((GeneralListingsViewModel$refresh$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
