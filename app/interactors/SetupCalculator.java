package com.forsale.app.interactors;

import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import com.github.mikephil.charting.utils.Utils;
import kotlin.jvm.internal.o;
/* compiled from: SetupCalculator.kt */
/* loaded from: classes2.dex */
public final class SetupCalculator {

    /* renamed from: a  reason: collision with root package name */
    private final CategoriesRepositories f37467a;

    /* renamed from: b  reason: collision with root package name */
    private final RegionsRepository f37468b;

    /* renamed from: c  reason: collision with root package name */
    private final UserProfileInteractor f37469c;

    public SetupCalculator(CategoriesRepositories categoriesRepository, RegionsRepository regionsRepository, UserProfileInteractor userProfileInteractor) {
        o.i(categoriesRepository, "categoriesRepository");
        o.i(regionsRepository, "regionsRepository");
        o.i(userProfileInteractor, "userProfileInteractor");
        this.f37467a = categoriesRepository;
        this.f37468b = regionsRepository;
        this.f37469c = userProfileInteractor;
    }

    private final boolean a(UserEntity userEntity, int i11, Float f11) {
        float f12;
        Float freeAds;
        double d11 = Utils.DOUBLE_EPSILON;
        if (i11 == 1 && (freeAds = userEntity.getFreeAds()) != null) {
            d11 = Utils.DOUBLE_EPSILON + freeAds.floatValue();
        }
        Float premiumAds = userEntity.getPremiumAds();
        if (premiumAds != null) {
            d11 += premiumAds.floatValue();
        }
        if (f11 != null) {
            f12 = f11.floatValue();
        } else {
            f12 = 0.0f;
        }
        if (d11 >= f12) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0163 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0267  */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r28v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.forsale.app.datalayer.network.entities.ListingDetailsEntity r31, com.forsale.app.datalayer.network.entities.PostListingIntention r32, java.util.List<com.forsale.app.datalayer.network.responses.Addon> r33, kotlinx.coroutines.CoroutineScope r34, zz.a<? super com.forsale.app.models.CalculatorEntity> r35) {
        /*
            Method dump skipped, instructions count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.interactors.SetupCalculator.b(com.forsale.app.datalayer.network.entities.ListingDetailsEntity, com.forsale.app.datalayer.network.entities.PostListingIntention, java.util.List, kotlinx.coroutines.CoroutineScope, zz.a):java.lang.Object");
    }
}
