package com.forsale.app.features.categories.listings.category;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.features.categories.listings.category.CategoryListingsDecorator;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import g00.p;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsDecorator.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$logScrolledListingsAnalytics$1", f = "CategoryListingsDecorator.kt", l = {778, 773}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsDecorator$logScrolledListingsAnalytics$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f28239a;

    /* renamed from: b  reason: collision with root package name */
    Object f28240b;

    /* renamed from: c  reason: collision with root package name */
    Object f28241c;

    /* renamed from: d  reason: collision with root package name */
    int f28242d;

    /* renamed from: e  reason: collision with root package name */
    int f28243e;

    /* renamed from: f  reason: collision with root package name */
    int f28244f;

    /* renamed from: g  reason: collision with root package name */
    int f28245g;

    /* renamed from: h  reason: collision with root package name */
    int f28246h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ CategoryListingsDecorator f28247i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ int f28248j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsDecorator$logScrolledListingsAnalytics$1(CategoryListingsDecorator categoryListingsDecorator, int i11, zz.a<? super CategoryListingsDecorator$logScrolledListingsAnalytics$1> aVar) {
        super(2, aVar);
        this.f28247i = categoryListingsDecorator;
        this.f28248j = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsDecorator$logScrolledListingsAnalytics$1(this.f28247i, this.f28248j, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger;
        CategoryEntity categoryEntity;
        DistrictEntity districtEntity;
        b0 b0Var;
        b0 b0Var2;
        b0 b0Var3;
        int intValue;
        Object U0;
        CategoryEntity categoryEntity2;
        DistrictEntity districtEntity2;
        int i11;
        int i12;
        int i13;
        int L0;
        MutableStateFlow mutableStateFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i14 = this.f28246h;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 == 2) {
                    kotlin.f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i15 = this.f28245g;
            int i16 = this.f28244f;
            int i17 = this.f28243e;
            i11 = this.f28242d;
            DistrictEntity districtEntity3 = (DistrictEntity) this.f28241c;
            CategoryEntity categoryEntity3 = (CategoryEntity) this.f28240b;
            aggregatedAllAnalyticsLogger = (AggregatedAllAnalyticsLogger) this.f28239a;
            kotlin.f.b(obj);
            intValue = i15;
            U0 = obj;
            i13 = i16;
            categoryEntity2 = categoryEntity3;
            i12 = i17;
            districtEntity2 = districtEntity3;
        } else {
            kotlin.f.b(obj);
            aggregatedAllAnalyticsLogger = this.f28247i.B;
            categoryEntity = this.f28247i.f28103o;
            districtEntity = this.f28247i.f28104p;
            b0Var = this.f28247i.E;
            Integer num = (Integer) b0Var.getValue();
            if (num == null) {
                num = kotlin.coroutines.jvm.internal.a.d(0);
            }
            int intValue2 = num.intValue();
            int i18 = this.f28248j;
            b0Var2 = this.f28247i.V;
            Integer num2 = (Integer) b0Var2.getValue();
            if (num2 == null) {
                num2 = kotlin.coroutines.jvm.internal.a.d(0);
            }
            int intValue3 = num2.intValue();
            b0Var3 = this.f28247i.f28105q;
            Integer num3 = (Integer) b0Var3.getValue();
            if (num3 == null) {
                num3 = kotlin.coroutines.jvm.internal.a.d(0);
            }
            intValue = num3.intValue();
            CategoryListingsDecorator categoryListingsDecorator = this.f28247i;
            this.f28239a = aggregatedAllAnalyticsLogger;
            this.f28240b = categoryEntity;
            this.f28241c = districtEntity;
            this.f28242d = intValue2;
            this.f28243e = i18;
            this.f28244f = intValue3;
            this.f28245g = intValue;
            this.f28246h = 1;
            U0 = CategoryListingsDecorator.U0(categoryListingsDecorator, false, false, this, 2, null);
            if (U0 == f11) {
                return f11;
            }
            categoryEntity2 = categoryEntity;
            districtEntity2 = districtEntity;
            i11 = intValue2;
            i12 = i18;
            i13 = intValue3;
        }
        L0 = this.f28247i.L0(CategoryListingsDecorator.ListingsSections.NORMAL);
        mutableStateFlow = this.f28247i.f28100a0;
        int intValue4 = ((Number) mutableStateFlow.getValue()).intValue() + L0;
        this.f28239a = null;
        this.f28240b = null;
        this.f28241c = null;
        this.f28246h = 2;
        if (AggregatedAllAnalyticsLoggerKt.i0(aggregatedAllAnalyticsLogger, categoryEntity2, districtEntity2, i11, i12, i13, intValue, (Map) U0, intValue4, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryListingsDecorator$logScrolledListingsAnalytics$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
