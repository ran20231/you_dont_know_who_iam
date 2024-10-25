package com.forsale.app.features.categories.home.homelandingscreen;

import com.forsale.app.datalayer.network.requestsbodies.GetListingDetailsBody;
import com.forsale.app.datalayer.network.requestsbodies.ListingDetailsType;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.services.ListingsService;
import com.forsale.app.utils.LocaleManager;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerticalViewModel.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$getItemDetails$1", f = "VerticalViewModel.kt", l = {487}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class VerticalViewModel$getItemDetails$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super ListingItemDetails>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23983a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VerticalViewModel f23984b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f23985c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalViewModel$getItemDetails$1(VerticalViewModel verticalViewModel, int i11, zz.a<? super VerticalViewModel$getItemDetails$1> aVar) {
        super(2, aVar);
        this.f23984b = verticalViewModel;
        this.f23985c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new VerticalViewModel$getItemDetails$1(this.f23984b, this.f23985c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ListingsService listingsService;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f23983a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                listingsService = this.f23984b.f23961s0;
                GetListingDetailsBody createListingDetails$default = GetListingDetailsBody.Companion.createListingDetails$default(GetListingDetailsBody.Companion, new ListingDetailsType.AdvId(this.f23985c), LocaleManager.f39597a.g(), null, 4, null);
                this.f23983a = 1;
                obj = listingsService.getListingDetails(createListingDetails$default, this);
                if (obj == f11) {
                    return f11;
                }
            }
            return (ListingItemDetails) obj;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super ListingItemDetails> aVar) {
        return ((VerticalViewModel$getItemDetails$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
