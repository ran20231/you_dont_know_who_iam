package com.forsale.app.features.categories.home.maincategories;

import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.HomeVisitedReleaseName;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainCategoriesViewModel.kt */
@d(c = "com.forsale.app.features.categories.home.maincategories.MainCategoriesViewModel$recordMainCategoryVisited$1", f = "MainCategoriesViewModel.kt", l = {FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainCategoriesViewModel$recordMainCategoryVisited$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f24401a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainCategoriesViewModel f24402b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainCategoriesViewModel$recordMainCategoryVisited$1(MainCategoriesViewModel mainCategoriesViewModel, zz.a<? super MainCategoriesViewModel$recordMainCategoryVisited$1> aVar) {
        super(2, aVar);
        this.f24402b = mainCategoriesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MainCategoriesViewModel$recordMainCategoryVisited$1(this.f24402b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        BaseRepository baseRepository;
        f11 = b.f();
        int i11 = this.f24401a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            baseRepository = this.f24402b.f24374p0;
            AggregatedAllAnalyticsLogger analyticsLogger = baseRepository.getAnalyticsLogger();
            HomeVisitedReleaseName homeVisitedReleaseName = HomeVisitedReleaseName.SINGLE_HOME;
            this.f24401a = 1;
            if (AggregatedAllAnalyticsLoggerKt.R(analyticsLogger, homeVisitedReleaseName, null, null, this, 6, null) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MainCategoriesViewModel$recordMainCategoryVisited$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
