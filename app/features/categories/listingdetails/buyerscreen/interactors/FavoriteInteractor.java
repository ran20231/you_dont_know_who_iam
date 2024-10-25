package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import com.forsale.app.datalayer.network.services.FavoritesService;
import kotlin.jvm.internal.o;
/* compiled from: FavoriteInteractor.kt */
/* loaded from: classes2.dex */
public final class FavoriteInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final FavoritesService f25929a;

    public FavoriteInteractor(FavoritesService favoritesService) {
        o.i(favoritesService, "favoritesService");
        this.f25929a = favoritesService;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.forsale.app.datalayer.network.requestsbodies.AddFavoriteBody r5, zz.a<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.FavoriteInteractor$addFavorite$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.FavoriteInteractor$addFavorite$1 r0 = (com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.FavoriteInteractor$addFavorite$1) r0
            int r1 = r0.f25932c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25932c = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.FavoriteInteractor$addFavorite$1 r0 = new com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.FavoriteInteractor$addFavorite$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f25930a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25932c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.f.b(r6)
            com.forsale.app.datalayer.network.services.FavoritesService r6 = r4.f25929a
            r0.f25932c = r3
            java.lang.Object r6 = r6.addFavorite(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            com.forsale.app.datalayer.network.entities.AddFavoriteEntity r6 = (com.forsale.app.datalayer.network.entities.AddFavoriteEntity) r6
            int r5 = r6.isFavorite()
            boolean r5 = com.forsale.app.utils.TypeExtensionsKt.h0(r5)
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.FavoriteInteractor.a(com.forsale.app.datalayer.network.requestsbodies.AddFavoriteBody, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.forsale.app.datalayer.network.requestsbodies.RemoveFavoriteBody r5, zz.a<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.FavoriteInteractor$removeFavorites$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.FavoriteInteractor$removeFavorites$1 r0 = (com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.FavoriteInteractor$removeFavorites$1) r0
            int r1 = r0.f25935c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25935c = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.FavoriteInteractor$removeFavorites$1 r0 = new com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.FavoriteInteractor$removeFavorites$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f25933a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25935c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.f.b(r6)
            com.forsale.app.datalayer.network.services.FavoritesService r6 = r4.f25929a
            r0.f25935c = r3
            java.lang.Object r6 = r6.removeFavorites(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            com.forsale.app.datalayer.network.entities.RemoveFavoriteEntity r6 = (com.forsale.app.datalayer.network.entities.RemoveFavoriteEntity) r6
            int r5 = r6.isRemoved()
            boolean r5 = com.forsale.app.utils.TypeExtensionsKt.h0(r5)
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.a.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.FavoriteInteractor.b(com.forsale.app.datalayer.network.requestsbodies.RemoveFavoriteBody, zz.a):java.lang.Object");
    }
}
