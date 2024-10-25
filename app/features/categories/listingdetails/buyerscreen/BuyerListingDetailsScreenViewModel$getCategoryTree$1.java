package com.forsale.app.features.categories.listingdetails.buyerscreen;

import com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.CategoryTreeInteractor;
import com.forsale.app.features.categories.listingdetails.buyerscreen.t;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyerListingDetailsScreenViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$getCategoryTree$1", f = "BuyerListingDetailsScreenViewModel.kt", l = {374, 377}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BuyerListingDetailsScreenViewModel$getCategoryTree$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25696a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsScreenViewModel f25697b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f25698c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerListingDetailsScreenViewModel$getCategoryTree$1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, int i11, zz.a<? super BuyerListingDetailsScreenViewModel$getCategoryTree$1> aVar) {
        super(2, aVar);
        this.f25697b = buyerListingDetailsScreenViewModel;
        this.f25698c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new BuyerListingDetailsScreenViewModel$getCategoryTree$1(this.f25697b, this.f25698c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        CategoryTreeInteractor categoryTreeInteractor;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f25696a;
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
            categoryTreeInteractor = this.f25697b.f25660x;
            int i12 = this.f25698c;
            this.f25696a = 1;
            obj = categoryTreeInteractor.a(i12, this);
            if (obj == f11) {
                return f11;
            }
        }
        cb.a aVar = (cb.a) obj;
        if (aVar != null) {
            BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel = this.f25697b;
            mutableStateFlow = buyerListingDetailsScreenViewModel.Q;
            t tVar = (t) mutableStateFlow.getValue();
            if (tVar instanceof t.a) {
                mutableStateFlow2 = buyerListingDetailsScreenViewModel.Q;
                t.a aVar2 = new t.a(q.b(((t.a) tVar).a(), null, aVar, null, null, 13, null));
                this.f25696a = 2;
                if (mutableStateFlow2.emit(aVar2, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((BuyerListingDetailsScreenViewModel$getCategoryTree$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
