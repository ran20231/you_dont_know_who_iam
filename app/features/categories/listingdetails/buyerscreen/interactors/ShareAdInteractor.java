package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus;
import com.forsale.app.features.categories.listingdetails.ShareText;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import com.forsale.app.utils.DynamicLinksUtils;
import g00.l;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: ShareAdInteractor.kt */
/* loaded from: classes2.dex */
public final class ShareAdInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final DynamicLinksUtils f26021a;

    public ShareAdInteractor(DynamicLinksUtils dynamicLinksUtils) {
        o.i(dynamicLinksUtils, "dynamicLinksUtils");
        this.f26021a = dynamicLinksUtils;
    }

    public final void a(final DetailsModel listingItemDetails, final l<? super ShareText, p> result) {
        o.i(listingItemDetails, "listingItemDetails");
        o.i(result, "result");
        DynamicLinksUtils.f(this.f26021a, this.f26021a.d(listingItemDetails.d().D(), ItemStatus.NORMAL), null, null, new l<String, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.ShareAdInteractor$getShareText$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void b(String it2) {
                o.i(it2, "it");
                result.invoke(new ShareText(it2, listingItemDetails.d().E(), String.valueOf(listingItemDetails.d().o()), listingItemDetails.d().t()));
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(String str) {
                b(str);
                return p.f75480a;
            }
        }, 6, null);
    }
}
