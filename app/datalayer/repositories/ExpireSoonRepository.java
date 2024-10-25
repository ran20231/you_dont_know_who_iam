package com.forsale.app.datalayer.repositories;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.network.responses.AboutToExpireListing;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.services.ListingsService;
import com.forsale.app.datalayer.network.services.MyListingsService;
import com.forsale.app.features.auth.UserStatus;
import com.forsale.app.utils.c0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q0;
import kotlin.d;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import wz.h;
import wz.p;
/* compiled from: ExpireSoonRepository.kt */
/* loaded from: classes2.dex */
public final class ExpireSoonRepository {
    public static final int $stable = 8;
    private final b0<Iterator<AboutToExpireListing>> aboutToExpireListings;
    private final b0<AboutToExpireListing> activeAboutToExpireListing;
    private final b0<ListingItemDetails> activeListingDetails;
    private final b0<Boolean> isActiveItemUp;
    private final b0<Boolean> isLoggedIn;
    private final ListingsService listingsService;
    private final MyListingsService myListingsService;
    private final b0<Long> responseTime;
    private final h timer$delegate;
    private final b0<Set<Integer>> viewedAds;

    public ExpireSoonRepository(MyListingsService myListingsService, ListingsService listingsService) {
        h a11;
        o.i(myListingsService, "myListingsService");
        o.i(listingsService, "listingsService");
        this.myListingsService = myListingsService;
        this.listingsService = listingsService;
        this.aboutToExpireListings = new b0<>();
        this.responseTime = new b0<>();
        a11 = d.a(new g00.a<c0>() { // from class: com.forsale.app.datalayer.repositories.ExpireSoonRepository$timer$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final c0 invoke() {
                return new c0(0L, 0L, null, 7, null);
            }
        });
        this.timer$delegate = a11;
        this.activeAboutToExpireListing = new b0<>();
        this.viewedAds = new b0<>(new LinkedHashSet());
        this.isLoggedIn = new b0<>();
        this.isActiveItemUp = new b0<>(Boolean.FALSE);
        this.activeListingDetails = new b0<>();
    }

    private final void changeActiveATEListing(AboutToExpireListing aboutToExpireListing) {
        getTimer().c();
        this.activeAboutToExpireListing.setValue(aboutToExpireListing);
        if (aboutToExpireListing == null) {
            return;
        }
        Long value = this.responseTime.getValue();
        o.f(value);
        c0.g(getTimer(), (aboutToExpireListing.getRemainingSeconds() - secondsSince(value.longValue())) * 1000, 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchATEListings(zz.a<? super List<AboutToExpireListing>> aVar) {
        return BuildersKt.withContext(Dispatchers.getMain(), new ExpireSoonRepository$fetchATEListings$2(this, null), aVar);
    }

    private final AboutToExpireListing getNextATEListing() {
        Iterator<AboutToExpireListing> value;
        Iterator<AboutToExpireListing> value2 = this.aboutToExpireListings.getValue();
        boolean z11 = false;
        if (value2 != null && value2.hasNext()) {
            z11 = true;
        }
        if (!z11 || (value = this.aboutToExpireListings.getValue()) == null) {
            return null;
        }
        return value.next();
    }

    private final void loadATEListings(boolean z11) {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new ExpireSoonRepository$loadATEListings$1(this, z11, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void loadATEListings$default(ExpireSoonRepository expireSoonRepository, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        expireSoonRepository.loadATEListings(z11);
    }

    private final long secondsSince(long j11) {
        return (System.currentTimeMillis() - j11) / 1000;
    }

    public final ListingItemDetails getListingDetails() {
        return this.activeListingDetails.getValue();
    }

    public final c0 getTimer() {
        return (c0) this.timer$delegate.getValue();
    }

    public final Set<Integer> getViewedAdsIds() {
        Set<Integer> e11;
        Set<Integer> value = this.viewedAds.getValue();
        if (value == null) {
            e11 = q0.e();
            return e11;
        }
        return value;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadListingDetails(zz.a<? super wz.p> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.datalayer.repositories.ExpireSoonRepository$loadListingDetails$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.datalayer.repositories.ExpireSoonRepository$loadListingDetails$1 r0 = (com.forsale.app.datalayer.repositories.ExpireSoonRepository$loadListingDetails$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.ExpireSoonRepository$loadListingDetails$1 r0 = new com.forsale.app.datalayer.repositories.ExpireSoonRepository$loadListingDetails$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r0 = r0.L$0
            com.forsale.app.datalayer.repositories.ExpireSoonRepository r0 = (com.forsale.app.datalayer.repositories.ExpireSoonRepository) r0
            kotlin.f.b(r6)
            goto L4e
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            kotlin.f.b(r6)
            kotlinx.coroutines.CoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.getIO()
            com.forsale.app.datalayer.repositories.ExpireSoonRepository$loadListingDetails$2 r2 = new com.forsale.app.datalayer.repositories.ExpireSoonRepository$loadListingDetails$2
            r2.<init>(r5, r3)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r2, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r0 = r5
        L4e:
            com.forsale.app.datalayer.network.responses.ListingItemDetails r6 = (com.forsale.app.datalayer.network.responses.ListingItemDetails) r6
            androidx.lifecycle.b0<com.forsale.app.datalayer.network.responses.ListingItemDetails> r0 = r0.activeListingDetails
            if (r6 == 0) goto L58
            com.forsale.app.datalayer.network.responses.ListingItemDetails r3 = r6.toExpireSoonItem()
        L58:
            r0.setValue(r3)
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.ExpireSoonRepository.loadListingDetails(zz.a):java.lang.Object");
    }

    public final Object onUserUpdate(UserStatus userStatus, zz.a<? super p> aVar) {
        Object f11;
        Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new ExpireSoonRepository$onUserUpdate$2(userStatus, this, null), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (withContext == f11) {
            return withContext;
        }
        return p.f75480a;
    }

    public final AboutToExpireListing pull() {
        Integer num;
        boolean b02;
        while (!o.d(this.isLoggedIn.getValue(), Boolean.FALSE) && !o.d(this.isActiveItemUp.getValue(), Boolean.TRUE)) {
            AboutToExpireListing value = this.activeAboutToExpireListing.getValue();
            if (value != null) {
                num = Integer.valueOf(value.getId());
            } else {
                num = null;
            }
            if (!getTimer().e()) {
                Set<Integer> value2 = this.viewedAds.getValue();
                o.f(value2);
                b02 = CollectionsKt___CollectionsKt.b0(value2, num);
                if (!b02) {
                    return this.activeAboutToExpireListing.getValue();
                }
            }
            AboutToExpireListing nextATEListing = getNextATEListing();
            if (nextATEListing == null) {
                changeActiveATEListing(null);
                return null;
            }
            Long value3 = this.responseTime.getValue();
            o.f(value3);
            if (nextATEListing.getRemainingSeconds() - secondsSince(value3.longValue()) > 0) {
                changeActiveATEListing(nextATEListing);
                return this.activeAboutToExpireListing.getValue();
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object recordViewedATEListings(java.util.List<java.lang.Integer> r7, zz.a<? super wz.p> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.forsale.app.datalayer.repositories.ExpireSoonRepository$recordViewedATEListings$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.datalayer.repositories.ExpireSoonRepository$recordViewedATEListings$1 r0 = (com.forsale.app.datalayer.repositories.ExpireSoonRepository$recordViewedATEListings$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.ExpireSoonRepository$recordViewedATEListings$1 r0 = new com.forsale.app.datalayer.repositories.ExpireSoonRepository$recordViewedATEListings$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r7 = r0.L$1
            com.forsale.app.datalayer.network.requestsbodies.AboutToExpireViewedRequestBody r7 = (com.forsale.app.datalayer.network.requestsbodies.AboutToExpireViewedRequestBody) r7
            java.lang.Object r7 = r0.L$0
            com.forsale.app.datalayer.repositories.ExpireSoonRepository r7 = (com.forsale.app.datalayer.repositories.ExpireSoonRepository) r7
            kotlin.f.b(r8)
            goto Lac
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            java.lang.Object r7 = r0.L$1
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.repositories.ExpireSoonRepository r2 = (com.forsale.app.datalayer.repositories.ExpireSoonRepository) r2
            kotlin.f.b(r8)
            goto L97
        L49:
            kotlin.f.b(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r2 = "EXPIRE SOON RECORDED "
            r8.append(r2)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            r2 = 0
            java.lang.Object[] r5 = new java.lang.Object[r2]
            x10.a.b(r8, r5)
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L6c
            wz.p r7 = wz.p.f75480a
            return r7
        L6c:
            androidx.lifecycle.b0<java.util.Iterator<com.forsale.app.datalayer.network.responses.AboutToExpireListing>> r8 = r6.aboutToExpireListings
            java.lang.Object r8 = r8.getValue()
            java.util.Iterator r8 = (java.util.Iterator) r8
            if (r8 == 0) goto L7d
            boolean r8 = r8.hasNext()
            if (r8 != 0) goto L7d
            r2 = r4
        L7d:
            if (r2 == 0) goto L96
            kotlinx.coroutines.MainCoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getMain()
            com.forsale.app.datalayer.repositories.ExpireSoonRepository$recordViewedATEListings$2 r2 = new com.forsale.app.datalayer.repositories.ExpireSoonRepository$recordViewedATEListings$2
            r5 = 0
            r2.<init>(r6, r5)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r2, r0)
            if (r8 != r1) goto L96
            return r1
        L96:
            r2 = r6
        L97:
            com.forsale.app.datalayer.network.requestsbodies.AboutToExpireViewedRequestBody r8 = new com.forsale.app.datalayer.network.requestsbodies.AboutToExpireViewedRequestBody
            r8.<init>(r7)
            com.forsale.app.datalayer.network.services.MyListingsService r7 = r2.myListingsService
            r0.L$0 = r2
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r7 = r7.setAboutToExpireListingViewed(r8, r0)
            if (r7 != r1) goto Lab
            return r1
        Lab:
            r7 = r2
        Lac:
            androidx.lifecycle.b0<java.util.Set<java.lang.Integer>> r7 = r7.viewedAds
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            r7.postValue(r8)
            wz.p r7 = wz.p.f75480a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.ExpireSoonRepository.recordViewedATEListings(java.util.List, zz.a):java.lang.Object");
    }

    public final void setATEListingViewed(int i11) {
        Set<Integer> value = this.viewedAds.getValue();
        if (value != null) {
            value.add(Integer.valueOf(i11));
        }
        Iterator<AboutToExpireListing> value2 = this.aboutToExpireListings.getValue();
        boolean z11 = false;
        if (value2 != null && value2.hasNext()) {
            z11 = true;
        }
        if (!z11) {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new ExpireSoonRepository$setATEListingViewed$1(this, null), 3, null);
        }
    }

    public final void setActiveItemStatus(boolean z11) {
        this.isActiveItemUp.setValue(Boolean.valueOf(z11));
    }
}
