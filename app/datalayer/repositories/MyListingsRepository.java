package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.entities.PostListingIntention;
import com.forsale.app.datalayer.network.responses.NewListingResponse;
import com.forsale.app.datalayer.network.services.MyListingsService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o;
/* compiled from: MyListingsRepository.kt */
/* loaded from: classes2.dex */
public final class MyListingsRepository {
    public static final int $stable = 0;
    private final ListingDetailsEntityRepository listingDetailsEntityRepository;
    private final MyListingsService myListingsService;

    /* compiled from: MyListingsRepository.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostListingIntention.values().length];
            try {
                iArr[PostListingIntention.NON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostListingIntention.NEW_LISTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostListingIntention.FULL_EDIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PostListingIntention.BOOST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PostListingIntention.BOOST_LISTING_ABOUT_TO_EXPIRE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PostListingIntention.RE_POST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MyListingsRepository(MyListingsService myListingsService, ListingDetailsEntityRepository listingDetailsEntityRepository) {
        o.i(myListingsService, "myListingsService");
        o.i(listingDetailsEntityRepository, "listingDetailsEntityRepository");
        this.myListingsService = myListingsService;
        this.listingDetailsEntityRepository = listingDetailsEntityRepository;
    }

    private final boolean canClearCache(PostListingIntention postListingIntention, NewListingResponse newListingResponse) {
        if (!isEditMode(postListingIntention) && newListingResponse.isDraft() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object checkResponse(com.forsale.app.datalayer.network.entities.PostListingIntention r7, com.forsale.app.datalayer.network.entities.ListingDetailsEntity r8, com.forsale.app.datalayer.network.responses.NewListingResponse r9, zz.a<? super wz.p> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.forsale.app.datalayer.repositories.MyListingsRepository$checkResponse$1
            if (r0 == 0) goto L13
            r0 = r10
            com.forsale.app.datalayer.repositories.MyListingsRepository$checkResponse$1 r0 = (com.forsale.app.datalayer.repositories.MyListingsRepository$checkResponse$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.MyListingsRepository$checkResponse$1 r0 = new com.forsale.app.datalayer.repositories.MyListingsRepository$checkResponse$1
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4d
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.f.b(r10)
            goto Lbe
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            kotlin.f.b(r10)
            goto Laa
        L3c:
            java.lang.Object r7 = r0.L$2
            r9 = r7
            com.forsale.app.datalayer.network.responses.NewListingResponse r9 = (com.forsale.app.datalayer.network.responses.NewListingResponse) r9
            java.lang.Object r7 = r0.L$1
            com.forsale.app.datalayer.network.entities.PostListingIntention r7 = (com.forsale.app.datalayer.network.entities.PostListingIntention) r7
            java.lang.Object r8 = r0.L$0
            com.forsale.app.datalayer.repositories.MyListingsRepository r8 = (com.forsale.app.datalayer.repositories.MyListingsRepository) r8
            kotlin.f.b(r10)
            goto L92
        L4d:
            kotlin.f.b(r10)
            java.lang.String r10 = r9.getPaymentUrl()
            boolean r10 = kotlin.text.k.v(r10)
            r10 = r10 ^ r5
            if (r10 == 0) goto Lad
            int r10 = r9.getAdvId()
            r8.setId(r10)
            int r10 = r9.isDraft()
            java.lang.Integer r10 = kotlin.coroutines.jvm.internal.a.d(r10)
            r8.setDraft(r10)
            java.util.List r10 = r9.getAddonsApproved()
            r8.setApprovedAddons(r10)
            com.forsale.app.datalayer.repositories.ListingDetailsEntityRepository r8 = r6.listingDetailsEntityRepository
            int r10 = r9.getAdvId()
            int r2 = r9.isDraft()
            java.util.List r3 = r9.getAddonsApproved()
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r9
            r0.label = r5
            java.lang.Object r8 = r8.updatePostUpload(r10, r2, r3, r0)
            if (r8 != r1) goto L91
            return r1
        L91:
            r8 = r6
        L92:
            boolean r7 = r8.canClearCache(r7, r9)
            if (r7 == 0) goto Lc1
            com.forsale.app.datalayer.repositories.ListingDetailsEntityRepository r7 = r8.listingDetailsEntityRepository
            r8 = 0
            r0.L$0 = r8
            r0.L$1 = r8
            r0.L$2 = r8
            r0.label = r4
            java.lang.Object r7 = r7.deleteSuspended(r0)
            if (r7 != r1) goto Laa
            return r1
        Laa:
            wz.p r7 = wz.p.f75480a
            return r7
        Lad:
            boolean r7 = r6.canClearCache(r7, r9)
            if (r7 == 0) goto Lc1
            com.forsale.app.datalayer.repositories.ListingDetailsEntityRepository r7 = r6.listingDetailsEntityRepository
            r0.label = r3
            java.lang.Object r7 = r7.deleteSuspended(r0)
            if (r7 != r1) goto Lbe
            return r1
        Lbe:
            wz.p r7 = wz.p.f75480a
            return r7
        Lc1:
            wz.p r7 = wz.p.f75480a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.MyListingsRepository.checkResponse(com.forsale.app.datalayer.network.entities.PostListingIntention, com.forsale.app.datalayer.network.entities.ListingDetailsEntity, com.forsale.app.datalayer.network.responses.NewListingResponse, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleNewListing(ListingDetailsEntity listingDetailsEntity, zz.a<? super NewListingResponse> aVar) {
        if (listingDetailsEntity.getId() == -1) {
            return this.myListingsService.saveListingAsync(listingDetailsEntity, aVar);
        }
        listingDetailsEntity.setCachedAdv(kotlin.coroutines.jvm.internal.a.d(1));
        return this.myListingsService.editListingAsync(listingDetailsEntity, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object uploadListingSuspended(PostListingIntention postListingIntention, ListingDetailsEntity listingDetailsEntity, zz.a<? super NewListingResponse> aVar) {
        switch (WhenMappings.$EnumSwitchMapping$0[postListingIntention.ordinal()]) {
            case 1:
            case 2:
                return handleNewListing(listingDetailsEntity, aVar);
            case 3:
            case 4:
            case 5:
                return this.myListingsService.editListingAsync(listingDetailsEntity, aVar);
            case 6:
                listingDetailsEntity.setSourceItemId(kotlin.coroutines.jvm.internal.a.d(listingDetailsEntity.getId()));
                return this.myListingsService.saveListingAsync(listingDetailsEntity, aVar);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isEditMode(PostListingIntention intention) {
        o.i(intention, "intention");
        switch (WhenMappings.$EnumSwitchMapping$0[intention.ordinal()]) {
            case 1:
            case 2:
                return false;
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object uploadListing(com.forsale.app.datalayer.network.entities.PostListingIntention r6, com.forsale.app.datalayer.network.entities.ListingDetailsEntity r7, zz.a<? super com.forsale.app.datalayer.network.responses.NewListingResponse> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.forsale.app.datalayer.repositories.MyListingsRepository$uploadListing$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.datalayer.repositories.MyListingsRepository$uploadListing$1 r0 = (com.forsale.app.datalayer.repositories.MyListingsRepository$uploadListing$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.MyListingsRepository$uploadListing$1 r0 = new com.forsale.app.datalayer.repositories.MyListingsRepository$uploadListing$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.L$0
            com.forsale.app.datalayer.network.responses.NewListingResponse r6 = (com.forsale.app.datalayer.network.responses.NewListingResponse) r6
            kotlin.f.b(r8)
            goto L6f
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.L$2
            r7 = r6
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity r7 = (com.forsale.app.datalayer.network.entities.ListingDetailsEntity) r7
            java.lang.Object r6 = r0.L$1
            com.forsale.app.datalayer.network.entities.PostListingIntention r6 = (com.forsale.app.datalayer.network.entities.PostListingIntention) r6
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.repositories.MyListingsRepository r2 = (com.forsale.app.datalayer.repositories.MyListingsRepository) r2
            kotlin.f.b(r8)
            goto L5c
        L49:
            kotlin.f.b(r8)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r8 = r5.uploadListingSuspended(r6, r7, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            r2 = r5
        L5c:
            com.forsale.app.datalayer.network.responses.NewListingResponse r8 = (com.forsale.app.datalayer.network.responses.NewListingResponse) r8
            r0.L$0 = r8
            r4 = 0
            r0.L$1 = r4
            r0.L$2 = r4
            r0.label = r3
            java.lang.Object r6 = r2.checkResponse(r6, r7, r8, r0)
            if (r6 != r1) goto L6e
            return r1
        L6e:
            r6 = r8
        L6f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.MyListingsRepository.uploadListing(com.forsale.app.datalayer.network.entities.PostListingIntention, com.forsale.app.datalayer.network.entities.ListingDetailsEntity, zz.a):java.lang.Object");
    }
}
