package com.forsale.app.features.categories.listingdetails.buyerscreen;

import com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.FollowInteractor;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import rj.a;
import t9.y0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyerListingDetailsScreenViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$followUser$1", f = "BuyerListingDetailsScreenViewModel.kt", l = {748, 752, 753, 756}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BuyerListingDetailsScreenViewModel$followUser$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25692a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsScreenViewModel f25693b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f25694c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f25695d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerListingDetailsScreenViewModel$followUser$1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, boolean z11, String str, zz.a<? super BuyerListingDetailsScreenViewModel$followUser$1> aVar) {
        super(2, aVar);
        this.f25693b = buyerListingDetailsScreenViewModel;
        this.f25694c = z11;
        this.f25695d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new BuyerListingDetailsScreenViewModel$followUser$1(this.f25693b, this.f25694c, this.f25695d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        FollowInteractor followInteractor;
        boolean z11;
        MutableSharedFlow mutableSharedFlow2;
        boolean z12;
        Object Z0;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f25692a;
        try {
        } catch (Throwable unused) {
            mutableSharedFlow = this.f25693b.f25652k0;
            lf.a aVar = new lf.a(null, new a.b(y0.N4, new Object[0]), 1, null);
            this.f25692a = 4;
            if (mutableSharedFlow.emit(aVar, this) == f11) {
                return f11;
            }
        }
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    if (i11 == 4) {
                        kotlin.f.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    kotlin.f.b(obj);
                }
                return wz.p.f75480a;
            }
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            followInteractor = this.f25693b.f25661y;
            if (!this.f25694c) {
                z11 = true;
            } else {
                z11 = false;
            }
            String str = this.f25695d;
            this.f25692a = 1;
            obj = followInteractor.a(z11, str, this);
            if (obj == f11) {
                return f11;
            }
        }
        BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel = this.f25693b;
        boolean z13 = this.f25694c;
        if (!((Boolean) obj).booleanValue()) {
            mutableSharedFlow2 = buyerListingDetailsScreenViewModel.f25652k0;
            lf.a aVar2 = new lf.a(null, new a.b(y0.N4, new Object[0]), 1, null);
            this.f25692a = 3;
            if (mutableSharedFlow2.emit(aVar2, this) == f11) {
                return f11;
            }
        } else {
            if (!z13) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f25692a = 2;
            Z0 = buyerListingDetailsScreenViewModel.Z0(z12, this);
            if (Z0 == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((BuyerListingDetailsScreenViewModel$followUser$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
