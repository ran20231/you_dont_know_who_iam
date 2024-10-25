package com.forsale.app.datalayer.network.services;

import com.forsale.app.datalayer.network.entities.AddFavoriteEntity;
import com.forsale.app.datalayer.network.entities.RemoveFavoriteEntity;
import com.forsale.app.datalayer.network.requestsbodies.AddFavoriteBody;
import com.forsale.app.datalayer.network.requestsbodies.GetFavoritesBody;
import com.forsale.app.datalayer.network.requestsbodies.RemoveFavoriteBody;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import i10.a;
import i10.o;
/* compiled from: FavoritesService.kt */
/* loaded from: classes2.dex */
public interface FavoritesService {
    @o("Favorites/addFavorite")
    Object addFavorite(@a AddFavoriteBody addFavoriteBody, zz.a<? super AddFavoriteEntity> aVar);

    @o("Favorites/getFavorites")
    Object getFavorites(@a GetFavoritesBody getFavoritesBody, zz.a<? super ListingsResponse> aVar);

    @o("Favorites/removeFavorite")
    Object removeFavorites(@a RemoveFavoriteBody removeFavoriteBody, zz.a<? super RemoveFavoriteEntity> aVar);
}
