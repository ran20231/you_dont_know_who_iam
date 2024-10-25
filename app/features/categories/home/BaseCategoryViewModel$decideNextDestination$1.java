package com.forsale.app.features.categories.home;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.utils.OneShotEventHandler;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseCategoryViewModel.kt */
@d(c = "com.forsale.app.features.categories.home.BaseCategoryViewModel$decideNextDestination$1", f = "BaseCategoryViewModel.kt", l = {40, 41}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BaseCategoryViewModel$decideNextDestination$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23265a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryEntity f23266b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BaseCategoryViewModel f23267c;

    /* compiled from: BaseCategoryViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23268a;

        static {
            int[] iArr = new int[CategoryEntity.CategoryType.values().length];
            try {
                iArr[CategoryEntity.CategoryType.SUB_CATEGORIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f23268a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCategoryViewModel$decideNextDestination$1(CategoryEntity categoryEntity, BaseCategoryViewModel baseCategoryViewModel, zz.a<? super BaseCategoryViewModel$decideNextDestination$1> aVar) {
        super(2, aVar);
        this.f23266b = categoryEntity;
        this.f23267c = baseCategoryViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new BaseCategoryViewModel$decideNextDestination$1(this.f23266b, this.f23267c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f23265a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            CategoryEntity categoryEntity = this.f23266b;
            if (categoryEntity != null) {
                BaseCategoryViewModel baseCategoryViewModel = this.f23267c;
                if (a.f23268a[categoryEntity.getCategoryType().ordinal()] == 1) {
                    OneShotEventHandler<CategoryEntity> A0 = baseCategoryViewModel.A0();
                    this.f23265a = 1;
                    if (A0.f(categoryEntity, this) == f11) {
                        return f11;
                    }
                } else {
                    OneShotEventHandler<CategoryEntity> z02 = baseCategoryViewModel.z0();
                    this.f23265a = 2;
                    if (z02.f(categoryEntity, this) == f11) {
                        return f11;
                    }
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((BaseCategoryViewModel$decideNextDestination$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
