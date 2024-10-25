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
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$logUpButtonClicked$1", f = "CategoryListingsViewModel.kt", l = {709, 707}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$logUpButtonClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f28542a;

    /* renamed from: b  reason: collision with root package name */
    Object f28543b;

    /* renamed from: c  reason: collision with root package name */
    int f28544c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28545d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$logUpButtonClicked$1(CategoryListingsViewModel categoryListingsViewModel, zz.a<? super CategoryListingsViewModel$logUpButtonClicked$1> aVar) {
        super(2, aVar);
        this.f28545d = categoryListingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsViewModel$logUpButtonClicked$1(this.f28545d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger;
        ListingsTypes D2;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger2;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28544c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            D2 = (ListingsTypes) this.f28543b;
            aggregatedAllAnalyticsLogger2 = (AggregatedAllAnalyticsLogger) this.f28542a;
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            aggregatedAllAnalyticsLogger = this.f28545d.f28381s0;
            D2 = this.f28545d.D2();
            CategoryListingsViewModel categoryListingsViewModel = this.f28545d;
            this.f28542a = aggregatedAllAnalyticsLogger;
            this.f28543b = D2;
            this.f28544c = 1;
            Object u32 = categoryListingsViewModel.u3(false, this);
            if (u32 == f11) {
                return f11;
            }
            aggregatedAllAnalyticsLogger2 = aggregatedAllAnalyticsLogger;
            obj = u32;
        }
        CategoryEntity z22 = this.f28545d.z2();
        this.f28542a = null;
        this.f28543b = null;
        this.f28544c = 2;
        if (AggregatedAllAnalyticsLoggerKt.k0(aggregatedAllAnalyticsLogger2, D2, (Map) obj, z22, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryListingsViewModel$logUpButtonClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
