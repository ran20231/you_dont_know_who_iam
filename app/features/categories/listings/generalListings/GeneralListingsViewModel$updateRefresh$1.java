package com.forsale.app.features.categories.listings.generalListings;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GeneralListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel$updateRefresh$1", f = "GeneralListingsViewModel.kt", l = {182}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class GeneralListingsViewModel$updateRefresh$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f30519a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ GeneralListingsViewModel f30520b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f30521c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralListingsViewModel$updateRefresh$1(GeneralListingsViewModel generalListingsViewModel, boolean z11, zz.a<? super GeneralListingsViewModel$updateRefresh$1> aVar) {
        super(2, aVar);
        this.f30520b = generalListingsViewModel;
        this.f30521c = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new GeneralListingsViewModel$updateRefresh$1(this.f30520b, this.f30521c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f30519a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableStateFlow = this.f30520b.J;
            Boolean a11 = kotlin.coroutines.jvm.internal.a.a(this.f30521c);
            this.f30519a = 1;
            if (mutableStateFlow.emit(a11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((GeneralListingsViewModel$updateRefresh$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
