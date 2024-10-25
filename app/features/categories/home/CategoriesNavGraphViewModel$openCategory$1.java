package com.forsale.app.features.categories.home;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.utils.analytics.SubCategoriesPosition;
import g00.p;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoriesNavGraphViewModel.kt */
@d(c = "com.forsale.app.features.categories.home.CategoriesNavGraphViewModel$openCategory$1", f = "CategoriesNavGraphViewModel.kt", l = {121, 124, 127}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoriesNavGraphViewModel$openCategory$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23298a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f23299b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f23300c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CategoriesNavGraphViewModel f23301d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ CategoryEntity f23302e;

    /* compiled from: CategoriesNavGraphViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23303a;

        static {
            int[] iArr = new int[CategoryEntity.CategoryType.values().length];
            try {
                iArr[CategoryEntity.CategoryType.SUB_CATEGORIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CategoryEntity.CategoryType.LISTINGS_DISTRICT_FILTRATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CategoryEntity.CategoryType.LISTINGS_FULL_FILTRATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CategoryEntity.CategoryType.LISTINGS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CategoryEntity.CategoryType.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f23303a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoriesNavGraphViewModel$openCategory$1(boolean z11, boolean z12, CategoriesNavGraphViewModel categoriesNavGraphViewModel, CategoryEntity categoryEntity, zz.a<? super CategoriesNavGraphViewModel$openCategory$1> aVar) {
        super(2, aVar);
        this.f23299b = z11;
        this.f23300c = z12;
        this.f23301d = categoriesNavGraphViewModel;
        this.f23302e = categoryEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoriesNavGraphViewModel$openCategory$1(this.f23299b, this.f23300c, this.f23301d, this.f23302e, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        MutableSharedFlow mutableSharedFlow2;
        MutableSharedFlow mutableSharedFlow3;
        f11 = b.f();
        int i11 = this.f23298a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2 && i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            if (this.f23299b && this.f23300c) {
                mutableSharedFlow3 = this.f23301d.f23278m0;
                CategoryEntity categoryEntity = this.f23302e;
                this.f23298a = 1;
                if (mutableSharedFlow3.emit(categoryEntity, this) == f11) {
                    return f11;
                }
            } else {
                int i12 = a.f23303a[this.f23302e.getCategoryType().ordinal()];
                if (i12 == 1) {
                    mutableSharedFlow = this.f23301d.f23280o0;
                    Pair pair = new Pair(this.f23302e, SubCategoriesPosition.DEFAULT);
                    this.f23298a = 2;
                    if (mutableSharedFlow.emit(pair, this) == f11) {
                        return f11;
                    }
                } else if (i12 == 2 || i12 == 3 || i12 == 4) {
                    mutableSharedFlow2 = this.f23301d.f23282q0;
                    CategoryEntity categoryEntity2 = this.f23302e;
                    this.f23298a = 3;
                    if (mutableSharedFlow2.emit(categoryEntity2, this) == f11) {
                        return f11;
                    }
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoriesNavGraphViewModel$openCategory$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
