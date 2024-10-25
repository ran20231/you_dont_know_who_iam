package com.forsale.app.features.categories.tree;

import androidx.databinding.ObservableField;
import androidx.lifecycle.b0;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import g00.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategorySelectionViewModel.kt */
@d(c = "com.forsale.app.features.categories.tree.CategorySelectionViewModel$loadCategoriesTree$1", f = "CategorySelectionViewModel.kt", l = {46, 46}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategorySelectionViewModel$loadCategoriesTree$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f31127a;

    /* renamed from: b  reason: collision with root package name */
    int f31128b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CategorySelectionViewModel f31129c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategorySelectionViewModel$loadCategoriesTree$1(CategorySelectionViewModel categorySelectionViewModel, zz.a<? super CategorySelectionViewModel$loadCategoriesTree$1> aVar) {
        super(2, aVar);
        this.f31129c = categorySelectionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategorySelectionViewModel$loadCategoriesTree$1(this.f31129c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        CategorySelectionViewModel categorySelectionViewModel;
        ObservableField observableField;
        b0 b0Var;
        ArrayList A0;
        f11 = b.f();
        int i11 = this.f31128b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    CategorySelectionViewModel categorySelectionViewModel2 = this.f31129c;
                    observableField = categorySelectionViewModel2.f31118n0;
                    observableField.k((List) obj);
                    b0Var = categorySelectionViewModel2.f31119o0;
                    A0 = categorySelectionViewModel2.A0();
                    b0Var.postValue(A0);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            categorySelectionViewModel = (CategorySelectionViewModel) this.f31127a;
            f.b(obj);
        } else {
            f.b(obj);
            categorySelectionViewModel = this.f31129c;
            RegionsRepository I = categorySelectionViewModel.I();
            this.f31127a = categorySelectionViewModel;
            this.f31128b = 1;
            obj = I.getCurrentRegionId(this);
            if (obj == f11) {
                return f11;
            }
        }
        int intValue = ((Number) obj).intValue();
        this.f31127a = null;
        this.f31128b = 2;
        obj = categorySelectionViewModel.C0(intValue, this);
        if (obj == f11) {
            return f11;
        }
        CategorySelectionViewModel categorySelectionViewModel22 = this.f31129c;
        observableField = categorySelectionViewModel22.f31118n0;
        observableField.k((List) obj);
        b0Var = categorySelectionViewModel22.f31119o0;
        A0 = categorySelectionViewModel22.A0();
        b0Var.postValue(A0);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategorySelectionViewModel$loadCategoriesTree$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
