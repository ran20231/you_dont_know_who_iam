package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.network.services.RecommendService;
import com.forsale.app.datalayer.repositories.ListingsRepository;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.datalayer.repositories.TranslationRepository;
import com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o;
/* compiled from: RecommendedListInteractor.kt */
/* loaded from: classes2.dex */
public final class OtherAdsInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final RecommendService f25981a;

    /* renamed from: b  reason: collision with root package name */
    private final RegionsRepository f25982b;

    /* renamed from: c  reason: collision with root package name */
    private final TranslationRepository f25983c;

    /* renamed from: d  reason: collision with root package name */
    private final ListingsRepository f25984d;

    public OtherAdsInteractor(RecommendService recommendService, RegionsRepository regionsRepository, TranslationRepository translationRepository, ListingsRepository listingsRepository) {
        o.i(recommendService, "recommendService");
        o.i(regionsRepository, "regionsRepository");
        o.i(translationRepository, "translationRepository");
        o.i(listingsRepository, "listingsRepository");
        this.f25981a = recommendService;
        this.f25982b = regionsRepository;
        this.f25983c = translationRepository;
        this.f25984d = listingsRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0164 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0195 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0256 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x026a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x027f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0280  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Integer r22, java.lang.Integer r23, zz.a<? super com.forsale.app.datalayer.network.responses.ListingsResponse.Listings> r24) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.OtherAdsInteractor.b(java.lang.Integer, java.lang.Integer, zz.a):java.lang.Object");
    }

    static /* synthetic */ Object c(OtherAdsInteractor otherAdsInteractor, Integer num, Integer num2, zz.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = null;
        }
        if ((i11 & 2) != 0) {
            num2 = null;
        }
        return otherAdsInteractor.b(num, num2, aVar);
    }

    public final Object d(a aVar, zz.a<? super ListingsResponse.Listings> aVar2) {
        if (aVar instanceof a.C0278a) {
            return c(this, kotlin.coroutines.jvm.internal.a.d(((a.C0278a) aVar).a()), null, aVar2, 2, null);
        }
        if (aVar instanceof a.b) {
            return c(this, null, kotlin.coroutines.jvm.internal.a.d(((a.b) aVar).a()), aVar2, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
