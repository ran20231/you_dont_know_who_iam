package com.forsale.app.features.categories.listingdetails.buyerscreen;

import com.forsale.app.features.categories.listingdetails.buyerscreen.t;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyerListingDetailsScreenViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$updateFollow$1", f = "BuyerListingDetailsScreenViewModel.kt", l = {716}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BuyerListingDetailsScreenViewModel$updateFollow$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25831a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsScreenViewModel f25832b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f25833c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerListingDetailsScreenViewModel$updateFollow$1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, boolean z11, zz.a<? super BuyerListingDetailsScreenViewModel$updateFollow$1> aVar) {
        super(2, aVar);
        this.f25832b = buyerListingDetailsScreenViewModel;
        this.f25833c = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new BuyerListingDetailsScreenViewModel$updateFollow$1(this.f25832b, this.f25833c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f25831a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            q d11 = this.f25832b.f25632a.d(this.f25832b.k0().getValue());
            if (d11 != null) {
                BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel = this.f25832b;
                boolean z11 = this.f25833c;
                mutableStateFlow = buyerListingDetailsScreenViewModel.Q;
                t.a aVar = new t.a(q.b(d11, null, null, FollowState.Companion.a(z11), null, 11, null));
                this.f25831a = 1;
                if (mutableStateFlow.emit(aVar, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((BuyerListingDetailsScreenViewModel$updateFollow$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
