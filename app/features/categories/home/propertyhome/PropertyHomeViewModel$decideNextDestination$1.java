package com.forsale.app.features.categories.home.propertyhome;

import com.forsale.app.datalayer.database.CategoryEntity;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* compiled from: PropertyHomeViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel$decideNextDestination$1", f = "PropertyHomeViewModel.kt", l = {406, 409}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PropertyHomeViewModel$decideNextDestination$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f24805a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryEntity f24806b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PropertyHomeViewModel f24807c;

    /* compiled from: PropertyHomeViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24808a;

        static {
            int[] iArr = new int[CategoryEntity.CategoryType.values().length];
            try {
                iArr[CategoryEntity.CategoryType.SUB_CATEGORIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f24808a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyHomeViewModel$decideNextDestination$1(CategoryEntity categoryEntity, PropertyHomeViewModel propertyHomeViewModel, zz.a<? super PropertyHomeViewModel$decideNextDestination$1> aVar) {
        super(2, aVar);
        this.f24806b = categoryEntity;
        this.f24807c = propertyHomeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PropertyHomeViewModel$decideNextDestination$1(this.f24806b, this.f24807c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f24805a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            if (a.f24808a[this.f24806b.getCategoryType().ordinal()] == 1) {
                MutableSharedFlow<CategoryEntity> B = this.f24807c.B();
                CategoryEntity categoryEntity = this.f24806b;
                this.f24805a = 1;
                if (B.emit(categoryEntity, this) == f11) {
                    return f11;
                }
            } else {
                MutableSharedFlow<CategoryEntity> A = this.f24807c.A();
                CategoryEntity categoryEntity2 = this.f24806b;
                this.f24805a = 2;
                if (A.emit(categoryEntity2, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PropertyHomeViewModel$decideNextDestination$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
