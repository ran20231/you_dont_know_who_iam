package com.forsale.app.features.more.forsaleweb;

import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.features.more.forsaleweb.ForSaleWebViewModel;
/* compiled from: ForSaleWebActivity_MembersInjector.java */
/* loaded from: classes2.dex */
public final class b implements cx.b<ForSaleWebActivity> {
    public static void a(ForSaleWebActivity forSaleWebActivity, ForSaleWebViewModel.a aVar) {
        forSaleWebActivity.f31870x = aVar;
    }

    public static void b(ForSaleWebActivity forSaleWebActivity, ApplicationResourcesRepository applicationResourcesRepository) {
        forSaleWebActivity.A = applicationResourcesRepository;
    }
}
