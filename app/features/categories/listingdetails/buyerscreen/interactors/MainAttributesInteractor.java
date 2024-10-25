package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import com.forsale.app.datalayer.network.entities.ExtraAttr;
import com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.s;
import kotlin.jvm.internal.o;
/* compiled from: MainAttributesInteractor.kt */
/* loaded from: classes2.dex */
public final class MainAttributesInteractor {

    /* renamed from: a  reason: collision with root package name */
    private AttributesMapper.a f25975a;

    public MainAttributesInteractor(AttributesMapper.a attributeMapperFactory) {
        o.i(attributeMapperFactory, "attributeMapperFactory");
        this.f25975a = attributeMapperFactory;
    }

    private final List<ExtraAttr> b(List<BuyerListingDetailsResponseModel.Data.Listing.ExtraAttribute> list) {
        int y11;
        ArrayList arrayList = new ArrayList();
        List<BuyerListingDetailsResponseModel.Data.Listing.ExtraAttribute> list2 = list;
        y11 = s.y(list2, 10);
        ArrayList arrayList2 = new ArrayList(y11);
        for (BuyerListingDetailsResponseModel.Data.Listing.ExtraAttribute extraAttribute : list2) {
            arrayList2.add(Boolean.valueOf(arrayList.add(new ExtraAttr(extraAttribute.getId(), extraAttribute.getValue(), extraAttribute.getSize()))));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List<com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel.Data.Listing.ExtraAttribute> r7, zz.a<? super java.util.List<com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper.AttributesDataModel>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.MainAttributesInteractor$getMainAttributes$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.MainAttributesInteractor$getMainAttributes$1 r0 = (com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.MainAttributesInteractor$getMainAttributes$1) r0
            int r1 = r0.f25978c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25978c = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.MainAttributesInteractor$getMainAttributes$1 r0 = new com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.MainAttributesInteractor$getMainAttributes$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f25976a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25978c
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r3) goto L2d
            kotlin.f.b(r8)
            goto L79
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.f.b(r8)
            goto L51
        L39:
            kotlin.f.b(r8)
            if (r7 == 0) goto L7c
            com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper$a r8 = r6.f25975a
            java.util.List r7 = r6.b(r7)
            com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper r7 = r8.a(r7)
            r0.f25978c = r5
            java.lang.Object r8 = r7.b(r0)
            if (r8 != r1) goto L51
            return r1
        L51:
            r7 = r8
            java.util.List r7 = (java.util.List) r7
            java.util.Collection r7 = (java.util.Collection) r7
            if (r7 == 0) goto L61
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L5f
            goto L61
        L5f:
            r7 = 0
            goto L62
        L61:
            r7 = r5
        L62:
            r7 = r7 ^ r5
            if (r7 == 0) goto L66
            goto L67
        L66:
            r8 = r4
        L67:
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L7c
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.MainAttributesInteractor$getMainAttributes$2$2 r7 = new com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.MainAttributesInteractor$getMainAttributes$2$2
            r7.<init>(r4)
            r0.f25978c = r3
            java.lang.Object r8 = com.forsale.app.utils.CoroutinesExtensionsKt.a(r8, r7, r0)
            if (r8 != r1) goto L79
            return r1
        L79:
            java.util.List r8 = (java.util.List) r8
            r4 = r8
        L7c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.MainAttributesInteractor.a(java.util.List, zz.a):java.lang.Object");
    }
}
