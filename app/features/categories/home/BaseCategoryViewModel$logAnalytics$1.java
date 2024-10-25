package com.forsale.app.features.categories.home;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.features.categories.normal.SubCategoryAnalyticsSource;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.SubCategoriesPosition;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseCategoryViewModel.kt */
@d(c = "com.forsale.app.features.categories.home.BaseCategoryViewModel$logAnalytics$1", f = "BaseCategoryViewModel.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BaseCategoryViewModel$logAnalytics$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23272a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BaseCategoryViewModel f23273b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SubCategoriesPosition f23274c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCategoryViewModel$logAnalytics$1(BaseCategoryViewModel baseCategoryViewModel, SubCategoriesPosition subCategoriesPosition, a<? super BaseCategoryViewModel$logAnalytics$1> aVar) {
        super(2, aVar);
        this.f23273b = baseCategoryViewModel;
        this.f23274c = subCategoriesPosition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new BaseCategoryViewModel$logAnalytics$1(this.f23273b, this.f23274c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        CategoryEntity y02;
        f11 = b.f();
        int i11 = this.f23272a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            y02 = this.f23273b.y0();
            if (y02 != null) {
                BaseCategoryViewModel baseCategoryViewModel = this.f23273b;
                SubCategoriesPosition subCategoriesPosition = this.f23274c;
                AggregatedAllAnalyticsLogger r11 = baseCategoryViewModel.r();
                SubCategoryAnalyticsSource B0 = baseCategoryViewModel.B0();
                this.f23272a = 1;
                if (AggregatedAllAnalyticsLoggerKt.I(r11, y02, subCategoriesPosition, B0, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((BaseCategoryViewModel$logAnalytics$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
