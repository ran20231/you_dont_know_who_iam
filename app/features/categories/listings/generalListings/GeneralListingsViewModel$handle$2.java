package com.forsale.app.features.categories.listings.generalListings;

import com.forsale.app.features.categories.listings.paging.b;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GeneralListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel$handle$2", f = "GeneralListingsViewModel.kt", l = {344}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class GeneralListingsViewModel$handle$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f30493a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ GeneralListingsViewModel f30494b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralListingsViewModel$handle$2(GeneralListingsViewModel generalListingsViewModel, zz.a<? super GeneralListingsViewModel$handle$2> aVar) {
        super(2, aVar);
        this.f30494b = generalListingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new GeneralListingsViewModel$handle$2(this.f30494b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f30493a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableStateFlow = this.f30494b.U;
            b.C0337b c0337b = new b.C0337b(false);
            this.f30493a = 1;
            if (mutableStateFlow.emit(c0337b, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((GeneralListingsViewModel$handle$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}