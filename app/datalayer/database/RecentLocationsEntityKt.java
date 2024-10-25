package com.forsale.app.datalayer.database;

import dc.a;
import kotlin.jvm.internal.o;
/* compiled from: RecentLocationsEntity.kt */
/* loaded from: classes2.dex */
public final class RecentLocationsEntityKt {
    public static final a mapToLocationFilterModel(RecentLocationsEntity recentLocationsEntity) {
        o.i(recentLocationsEntity, "<this>");
        return new a(recentLocationsEntity.getId(), recentLocationsEntity.getLevel(), recentLocationsEntity.getParentId(), recentLocationsEntity.getTitle(), recentLocationsEntity.getArTitle(), recentLocationsEntity.getEnTitle(), recentLocationsEntity.getPath(), recentLocationsEntity.getEnPath(), recentLocationsEntity.getArPath(), 1);
    }

    public static final RecentLocationsEntity mapToRecentLocationEntity(a aVar, int i11) {
        o.i(aVar, "<this>");
        return new RecentLocationsEntity(aVar.e(), aVar.g(), aVar.h(), aVar.l(), aVar.b(), aVar.d(), aVar.i(), aVar.c(), aVar.a(), aVar.j(), i11);
    }
}
