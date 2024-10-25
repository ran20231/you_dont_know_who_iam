package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime;

import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingLifeTimeItemViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.ListingLifeTimeItemViewModel$loadCurrency$1", f = "ListingLifeTimeItemViewModel.kt", l = {138, 139}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingLifeTimeItemViewModel$loadCurrency$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27830a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListingLifeTimeItemViewModel f27831b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingLifeTimeItemViewModel$loadCurrency$1(ListingLifeTimeItemViewModel listingLifeTimeItemViewModel, a<? super ListingLifeTimeItemViewModel$loadCurrency$1> aVar) {
        super(2, aVar);
        this.f27831b = listingLifeTimeItemViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new ListingLifeTimeItemViewModel$loadCurrency$1(this.f27831b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        f11 = b.f();
        int i11 = this.f27830a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            NewListingDetailsViewModel m11 = this.f27831b.m();
            this.f27830a = 1;
            obj = m11.H2(this);
            if (obj == f11) {
                return f11;
            }
        }
        RegionEntity regionEntity = (RegionEntity) obj;
        if (regionEntity != null) {
            mutableStateFlow = this.f27831b.f27825w;
            String currency = regionEntity.getCurrency();
            this.f27830a = 2;
            if (mutableStateFlow.emit(currency, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((ListingLifeTimeItemViewModel$loadCurrency$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
