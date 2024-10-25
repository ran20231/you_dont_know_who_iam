package com.forsale.app.features.more.mytransactions;

import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
/* compiled from: MyTransactionsViewModel_Factory.java */
/* loaded from: classes2.dex */
public final class a implements dagger.internal.b<MyTransactionsViewModel> {
    public static MyTransactionsViewModel a(UserProfileInteractor userProfileInteractor, ApplicationResourcesRepository applicationResourcesRepository, DistrictsRepository districtsRepository, jj.b bVar, BaseRepository baseRepository) {
        return new MyTransactionsViewModel(userProfileInteractor, applicationResourcesRepository, districtsRepository, bVar, baseRepository);
    }
}
