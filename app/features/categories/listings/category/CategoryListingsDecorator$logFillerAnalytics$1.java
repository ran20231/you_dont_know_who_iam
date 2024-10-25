package com.forsale.app.features.categories.listings.category;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.FillerType;
import g00.p;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsDecorator.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$logFillerAnalytics$1", f = "CategoryListingsDecorator.kt", l = {739, 735}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsDecorator$logFillerAnalytics$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f28224a;

    /* renamed from: b  reason: collision with root package name */
    Object f28225b;

    /* renamed from: c  reason: collision with root package name */
    Object f28226c;

    /* renamed from: d  reason: collision with root package name */
    Object f28227d;

    /* renamed from: e  reason: collision with root package name */
    int f28228e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ CategoryListingsDecorator f28229f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ FillerType f28230g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsDecorator$logFillerAnalytics$1(CategoryListingsDecorator categoryListingsDecorator, FillerType fillerType, zz.a<? super CategoryListingsDecorator$logFillerAnalytics$1> aVar) {
        super(2, aVar);
        this.f28229f = categoryListingsDecorator;
        this.f28230g = fillerType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsDecorator$logFillerAnalytics$1(this.f28229f, this.f28230g, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger;
        CategoryEntity categoryEntity;
        DistrictEntity districtEntity;
        FillerType fillerType;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger2;
        DistrictEntity districtEntity2;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28228e;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            categoryEntity = (CategoryEntity) this.f28225b;
            kotlin.f.b(obj);
            fillerType = (FillerType) this.f28227d;
            aggregatedAllAnalyticsLogger2 = (AggregatedAllAnalyticsLogger) this.f28224a;
            districtEntity2 = (DistrictEntity) this.f28226c;
        } else {
            kotlin.f.b(obj);
            aggregatedAllAnalyticsLogger = this.f28229f.B;
            categoryEntity = this.f28229f.f28103o;
            districtEntity = this.f28229f.f28104p;
            FillerType fillerType2 = this.f28230g;
            CategoryListingsDecorator categoryListingsDecorator = this.f28229f;
            this.f28224a = aggregatedAllAnalyticsLogger;
            this.f28225b = categoryEntity;
            this.f28226c = districtEntity;
            this.f28227d = fillerType2;
            this.f28228e = 1;
            Object U0 = CategoryListingsDecorator.U0(categoryListingsDecorator, false, false, this, 3, null);
            if (U0 == f11) {
                return f11;
            }
            fillerType = fillerType2;
            aggregatedAllAnalyticsLogger2 = aggregatedAllAnalyticsLogger;
            districtEntity2 = districtEntity;
            obj = U0;
        }
        this.f28224a = null;
        this.f28225b = null;
        this.f28226c = null;
        this.f28227d = null;
        this.f28228e = 2;
        if (AggregatedAllAnalyticsLoggerKt.e0(aggregatedAllAnalyticsLogger2, categoryEntity, districtEntity2, fillerType, (Map) obj, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryListingsDecorator$logFillerAnalytics$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
