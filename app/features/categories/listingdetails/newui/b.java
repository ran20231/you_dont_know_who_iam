package com.forsale.app.features.categories.listingdetails.newui;

import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.forsale.app.datalayer.repositories.CategoryDao;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
/* compiled from: NewListingDetailsFragment_MembersInjector.java */
/* loaded from: classes2.dex */
public final class b implements cx.b<NewListingDetailsFragment> {
    public static void a(NewListingDetailsFragment newListingDetailsFragment, AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger) {
        newListingDetailsFragment.K = aggregatedAllAnalyticsLogger;
    }

    public static void b(NewListingDetailsFragment newListingDetailsFragment, CategoriesRepositories categoriesRepositories) {
        newListingDetailsFragment.O = categoriesRepositories;
    }

    public static void c(NewListingDetailsFragment newListingDetailsFragment, CategoryDao categoryDao) {
        newListingDetailsFragment.J = categoryDao;
    }

    public static void d(NewListingDetailsFragment newListingDetailsFragment, DistrictsRepository districtsRepository) {
        newListingDetailsFragment.N = districtsRepository;
    }

    public static void e(NewListingDetailsFragment newListingDetailsFragment, NewListingDetailsViewModel.a aVar) {
        newListingDetailsFragment.C = aVar;
    }

    public static void f(NewListingDetailsFragment newListingDetailsFragment, cx.a<ag.a> aVar) {
        newListingDetailsFragment.E = aVar;
    }

    public static void g(NewListingDetailsFragment newListingDetailsFragment, jj.b bVar) {
        newListingDetailsFragment.P = bVar;
    }

    public static void h(NewListingDetailsFragment newListingDetailsFragment, RegionsRepository regionsRepository) {
        newListingDetailsFragment.M = regionsRepository;
    }

    public static void i(NewListingDetailsFragment newListingDetailsFragment, ApplicationResourcesRepository applicationResourcesRepository) {
        newListingDetailsFragment.L = applicationResourcesRepository;
    }
}
