package com.forsale.app.features.categories.tree;

import com.forsale.app.datalayer.database.CategoryEntity;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* compiled from: CategorySelectionItemViewModel.kt */
@d(c = "com.forsale.app.features.categories.tree.CategorySelectionItemViewModel$setSelectedCategory$1", f = "CategorySelectionItemViewModel.kt", l = {22}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CategorySelectionItemViewModel$setSelectedCategory$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31113a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategorySelectionItemViewModel f31114b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CategoryEntity f31115c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategorySelectionItemViewModel$setSelectedCategory$1(CategorySelectionItemViewModel categorySelectionItemViewModel, CategoryEntity categoryEntity, zz.a<? super CategorySelectionItemViewModel$setSelectedCategory$1> aVar) {
        super(2, aVar);
        this.f31114b = categorySelectionItemViewModel;
        this.f31115c = categoryEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategorySelectionItemViewModel$setSelectedCategory$1(this.f31114b, this.f31115c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f31113a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            MutableSharedFlow<CategoryEntity> b11 = this.f31114b.b();
            CategoryEntity categoryEntity = this.f31115c;
            this.f31113a = 1;
            if (b11.emit(categoryEntity, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategorySelectionItemViewModel$setSelectedCategory$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
