package com.forsale.app.features.postad;

import androidx.work.q;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.entities.PostListingIntention;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository;
import com.forsale.app.datalayer.repositories.ListingDetailsEntityRepository;
import com.forsale.app.datalayer.repositories.MyListingsRepository;
import com.forsale.app.datalayer.repositories.PostAdAnonymousRepository;
import com.forsale.app.datalayer.repositories.ProhibitedKeywordsRepository;
import com.forsale.app.utils.analytics.PLFSource;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
/* compiled from: PostAdViewModel_Factory.java */
/* loaded from: classes2.dex */
public final class g {
    public static PostAdViewModel a(CategoriesRepositories categoriesRepositories, ExtraAttributeRawRepository extraAttributeRawRepository, PostAdRepository postAdRepository, PostAdAnonymousRepository postAdAnonymousRepository, q qVar, ProhibitedKeywordsRepository prohibitedKeywordsRepository, DistrictsRepository districtsRepository, ListingDetailsEntityRepository listingDetailsEntityRepository, MyListingsRepository myListingsRepository, com.forsale.app.utils.analytics.g gVar, a aVar, i iVar, e eVar, jj.b bVar, UserProfileInteractor userProfileInteractor, we.a aVar2, BaseRepository baseRepository, pe.a aVar3, pe.b bVar2, ListingDetailsEntity listingDetailsEntity, PostListingIntention postListingIntention, PLFSource pLFSource) {
        return new PostAdViewModel(categoriesRepositories, extraAttributeRawRepository, postAdRepository, postAdAnonymousRepository, qVar, prohibitedKeywordsRepository, districtsRepository, listingDetailsEntityRepository, myListingsRepository, gVar, aVar, iVar, eVar, bVar, userProfileInteractor, aVar2, baseRepository, aVar3, bVar2, listingDetailsEntity, postListingIntention, pLFSource);
    }
}
