package com.forsale.app.features.categories.home;

import com.forsale.adserver.view.models.AdsModel;
import com.forsale.app.datalayer.network.requestsbodies.GetListingDetailsBody;
import com.forsale.app.datalayer.network.requestsbodies.ListingDetailsType;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus;
import com.forsale.app.datalayer.network.services.ListingsService;
import com.forsale.app.utils.LocaleManager;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoriesNavGraphViewModel.kt */
@d(c = "com.forsale.app.features.categories.home.CategoriesNavGraphViewModel$parseListingDeepLinking$1$1", f = "CategoriesNavGraphViewModel.kt", l = {77, 78, 82, 85}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoriesNavGraphViewModel$parseListingDeepLinking$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23308a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f23309b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CategoriesNavGraphViewModel f23310c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Integer f23311d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f23312e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoriesNavGraphViewModel$parseListingDeepLinking$1$1(String str, CategoriesNavGraphViewModel categoriesNavGraphViewModel, Integer num, int i11, a<? super CategoriesNavGraphViewModel$parseListingDeepLinking$1$1> aVar) {
        super(2, aVar);
        this.f23309b = str;
        this.f23310c = categoriesNavGraphViewModel;
        this.f23311d = num;
        this.f23312e = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new CategoriesNavGraphViewModel$parseListingDeepLinking$1$1(this.f23309b, this.f23310c, this.f23311d, this.f23312e, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        MutableSharedFlow mutableSharedFlow2;
        ListingsService listingsService;
        MutableSharedFlow mutableSharedFlow3;
        f11 = b.f();
        int i11 = this.f23308a;
        try {
        } catch (Exception unused) {
            x10.a.b("Adv Not Found", new Object[0]);
            mutableSharedFlow = this.f23310c.f23290y0;
            wz.p pVar = wz.p.f75480a;
            this.f23308a = 3;
            if (mutableSharedFlow.emit(pVar, this) == f11) {
                return f11;
            }
        }
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3 && i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.b(obj);
                } else {
                    f.b(obj);
                }
                return wz.p.f75480a;
            }
            f.b(obj);
        } else {
            f.b(obj);
            if (o.d(this.f23309b, ItemStatus.COMMERCIAL.getValue())) {
                listingsService = this.f23310c.f23277l0;
                GetListingDetailsBody createListingDetails$default = GetListingDetailsBody.Companion.createListingDetails$default(GetListingDetailsBody.Companion, new ListingDetailsType.AdvId(this.f23311d.intValue()), LocaleManager.f39597a.g(), null, 4, null);
                this.f23308a = 1;
                obj = listingsService.getListingDetails(createListingDetails$default, this);
                if (obj == f11) {
                    return f11;
                }
            } else {
                mutableSharedFlow2 = this.f23310c.f23284s0;
                Integer d11 = kotlin.coroutines.jvm.internal.a.d(this.f23312e);
                this.f23308a = 4;
                if (mutableSharedFlow2.emit(d11, this) == f11) {
                    return f11;
                }
                return wz.p.f75480a;
            }
        }
        mutableSharedFlow3 = this.f23310c.f23286u0;
        AdsModel adsModel$default = ListingItemDetails.toAdsModel$default((ListingItemDetails) obj, null, 1, null);
        this.f23308a = 2;
        if (mutableSharedFlow3.emit(adsModel$default, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((CategoriesNavGraphViewModel$parseListingDeepLinking$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
