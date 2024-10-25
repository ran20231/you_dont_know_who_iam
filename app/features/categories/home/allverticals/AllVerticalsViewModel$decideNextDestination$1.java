package com.forsale.app.features.categories.home.allverticals;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.features.categories.home.allverticals.a;
import com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource;
import com.forsale.app.utils.analytics.HomeVisitedSources;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AllVerticalsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel$decideNextDestination$1", f = "AllVerticalsViewModel.kt", l = {453, 460}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AllVerticalsViewModel$decideNextDestination$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23421a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryEntity f23422b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AllVerticalsViewModel f23423c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f23424d;

    /* compiled from: AllVerticalsViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23425a;

        static {
            int[] iArr = new int[CategoryEntity.CategoryType.values().length];
            try {
                iArr[CategoryEntity.CategoryType.SUB_CATEGORIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f23425a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllVerticalsViewModel$decideNextDestination$1(CategoryEntity categoryEntity, AllVerticalsViewModel allVerticalsViewModel, String str, zz.a<? super AllVerticalsViewModel$decideNextDestination$1> aVar) {
        super(2, aVar);
        this.f23422b = categoryEntity;
        this.f23423c = allVerticalsViewModel;
        this.f23424d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AllVerticalsViewModel$decideNextDestination$1(this.f23422b, this.f23423c, this.f23424d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        CategoryListingsAnalyticSource verticalPage;
        MutableSharedFlow mutableSharedFlow2;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f23421a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            if (a.f23425a[this.f23422b.getCategoryType().ordinal()] == 1) {
                mutableSharedFlow2 = this.f23423c.P;
                a.AbstractC0259a.c cVar = new a.AbstractC0259a.c(this.f23422b, new CategoryListingsAnalyticSource.VerticalPage(this.f23424d));
                this.f23421a = 1;
                if (mutableSharedFlow2.emit(cVar, this) == f11) {
                    return f11;
                }
            } else {
                mutableSharedFlow = this.f23423c.P;
                CategoryEntity categoryEntity = this.f23422b;
                if (this.f23423c.O() == HomeVisitedSources.SUBCATEGORY_PAGE) {
                    verticalPage = new CategoryListingsAnalyticSource.SubCategoryPage(this.f23424d);
                } else {
                    verticalPage = new CategoryListingsAnalyticSource.VerticalPage(this.f23424d);
                }
                a.AbstractC0259a.b bVar = new a.AbstractC0259a.b(categoryEntity, verticalPage);
                this.f23421a = 2;
                if (mutableSharedFlow.emit(bVar, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AllVerticalsViewModel$decideNextDestination$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
