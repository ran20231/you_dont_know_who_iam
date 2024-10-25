package com.forsale.app.utils.analytics;

import com.forsale.app.datalayer.repositories.CategoryDao;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository;
import com.forsale.app.datalayer.repositories.LocationDao;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.datalayer.repositories.TranslationRepository;
import com.forsale.app.utils.s;
/* compiled from: AggregatedAllAnalyticsLogger_Factory.java */
/* loaded from: classes3.dex */
public final class e implements dagger.internal.b<AggregatedAllAnalyticsLogger> {
    public static AggregatedAllAnalyticsLogger a(AmplitudeLogger amplitudeLogger, LeanPlumLogger leanPlumLogger, d dVar, s sVar, m mVar, RegionsRepository regionsRepository, TranslationRepository translationRepository, ExtraAttributeRawRepository extraAttributeRawRepository, DistrictsRepository districtsRepository, CategoryDao categoryDao, LocationDao locationDao) {
        return new AggregatedAllAnalyticsLogger(amplitudeLogger, leanPlumLogger, dVar, sVar, mVar, regionsRepository, translationRepository, extraAttributeRawRepository, districtsRepository, categoryDao, locationDao);
    }
}
