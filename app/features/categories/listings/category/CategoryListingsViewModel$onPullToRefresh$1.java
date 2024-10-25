package com.forsale.app.features.categories.listings.category;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import g00.p;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$onPullToRefresh$1", f = "CategoryListingsViewModel.kt", l = {634, 631}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$onPullToRefresh$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f28551a;

    /* renamed from: b  reason: collision with root package name */
    Object f28552b;

    /* renamed from: c  reason: collision with root package name */
    Object f28553c;

    /* renamed from: d  reason: collision with root package name */
    int f28554d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28555e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$onPullToRefresh$1(CategoryListingsViewModel categoryListingsViewModel, zz.a<? super CategoryListingsViewModel$onPullToRefresh$1> aVar) {
        super(2, aVar);
        this.f28555e = categoryListingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsViewModel$onPullToRefresh$1(this.f28555e, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger;
        ListingsTypes D2;
        CategoryEntity categoryEntity;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28554d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            D2 = (ListingsTypes) this.f28553c;
            categoryEntity = (CategoryEntity) this.f28552b;
            aggregatedAllAnalyticsLogger = (AggregatedAllAnalyticsLogger) this.f28551a;
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            aggregatedAllAnalyticsLogger = this.f28555e.f28381s0;
            CategoryEntity z22 = this.f28555e.z2();
            D2 = this.f28555e.D2();
            CategoryListingsViewModel categoryListingsViewModel = this.f28555e;
            this.f28551a = aggregatedAllAnalyticsLogger;
            this.f28552b = z22;
            this.f28553c = D2;
            this.f28554d = 1;
            Object u32 = categoryListingsViewModel.u3(false, this);
            if (u32 == f11) {
                return f11;
            }
            categoryEntity = z22;
            obj = u32;
        }
        this.f28551a = null;
        this.f28552b = null;
        this.f28553c = null;
        this.f28554d = 2;
        if (AggregatedAllAnalyticsLoggerKt.f0(aggregatedAllAnalyticsLogger, D2, (Map) obj, categoryEntity, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryListingsViewModel$onPullToRefresh$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
