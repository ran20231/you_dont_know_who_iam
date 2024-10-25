package com.forsale.app.features.categories.home.homelandingscreen;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.utils.analytics.SubCategoriesPosition;
import g00.p;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerticalViewModel.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$openSubCategory$1", f = "VerticalViewModel.kt", l = {289, 291}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class VerticalViewModel$openSubCategory$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f24053a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryEntity f24054b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ VerticalViewModel f24055c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SubCategoriesPosition f24056d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalViewModel$openSubCategory$1(CategoryEntity categoryEntity, VerticalViewModel verticalViewModel, SubCategoriesPosition subCategoriesPosition, zz.a<? super VerticalViewModel$openSubCategory$1> aVar) {
        super(2, aVar);
        this.f24054b = categoryEntity;
        this.f24055c = verticalViewModel;
        this.f24056d = subCategoriesPosition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new VerticalViewModel$openSubCategory$1(this.f24054b, this.f24055c, this.f24056d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        MutableSharedFlow mutableSharedFlow2;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f24053a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            if (this.f24054b.getCategoryType() == CategoryEntity.CategoryType.SUB_CATEGORIES) {
                mutableSharedFlow2 = this.f24055c.f23940d1;
                Pair pair = new Pair(this.f24054b, this.f24056d);
                this.f24053a = 1;
                if (mutableSharedFlow2.emit(pair, this) == f11) {
                    return f11;
                }
            } else {
                mutableSharedFlow = this.f24055c.R0;
                CategoryEntity categoryEntity = this.f24054b;
                this.f24053a = 2;
                if (mutableSharedFlow.emit(categoryEntity, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((VerticalViewModel$openSubCategory$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
