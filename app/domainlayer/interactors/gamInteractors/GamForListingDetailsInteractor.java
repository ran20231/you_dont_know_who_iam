package com.forsale.app.domainlayer.interactors.gamInteractors;

import com.forsale.app.datalayer.repositories.CategoriesRepositories;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import da.a;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: GamForListingDetailsInteractor.kt */
/* loaded from: classes2.dex */
public final class GamForListingDetailsInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final a f22450a;

    /* renamed from: b  reason: collision with root package name */
    private final CategoriesRepositories f22451b;

    public GamForListingDetailsInteractor(a gamForCategoryInteractor, CategoriesRepositories categoriesRepositories) {
        o.i(gamForCategoryInteractor, "gamForCategoryInteractor");
        o.i(categoriesRepositories, "categoriesRepositories");
        this.f22450a = gamForCategoryInteractor;
        this.f22451b = categoriesRepositories;
    }

    public final Object c(int i11, zz.a<? super AdManagerAdRequest> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new GamForListingDetailsInteractor$invoke$2(this, i11, null), aVar);
    }
}
