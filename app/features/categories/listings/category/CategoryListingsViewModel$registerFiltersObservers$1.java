package com.forsale.app.features.categories.listings.category;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.utils.OneShotEventHandler;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$registerFiltersObservers$1", f = "CategoryListingsViewModel.kt", l = {587, 590}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$registerFiltersObservers$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28598a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28599b;

    /* compiled from: CategoryListingsViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28600a;

        static {
            int[] iArr = new int[CategoryEntity.CategoryType.values().length];
            try {
                iArr[CategoryEntity.CategoryType.LISTINGS_DISTRICT_FILTRATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CategoryEntity.CategoryType.LISTINGS_FULL_FILTRATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f28600a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$registerFiltersObservers$1(CategoryListingsViewModel categoryListingsViewModel, zz.a<? super CategoryListingsViewModel$registerFiltersObservers$1> aVar) {
        super(2, aVar);
        this.f28599b = categoryListingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsViewModel$registerFiltersObservers$1(this.f28599b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        CategoryEntity.CategoryType categoryType;
        int i11;
        OneShotEventHandler u22;
        FlowCollector flowCollector;
        OneShotEventHandler w22;
        FlowCollector flowCollector2;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i12 = this.f28598a;
        if (i12 != 0) {
            if (i12 == 1 || i12 == 2) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            CategoryEntity z22 = this.f28599b.z2();
            if (z22 != null) {
                categoryType = z22.getCategoryType();
            } else {
                categoryType = null;
            }
            if (categoryType == null) {
                i11 = -1;
            } else {
                i11 = a.f28600a[categoryType.ordinal()];
            }
            if (i11 == 1) {
                u22 = this.f28599b.u2();
                flowCollector = this.f28599b.O1;
                this.f28598a = 1;
                if (u22.e(flowCollector, this) == f11) {
                    return f11;
                }
            } else if (i11 == 2) {
                w22 = this.f28599b.w2();
                flowCollector2 = this.f28599b.M1;
                this.f28598a = 2;
                if (w22.e(flowCollector2, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryListingsViewModel$registerFiltersObservers$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
