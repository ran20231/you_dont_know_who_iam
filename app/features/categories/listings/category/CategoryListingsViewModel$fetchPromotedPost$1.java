package com.forsale.app.features.categories.listings.category;

import com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItemViewModel;
import g00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$fetchPromotedPost$1", f = "CategoryListingsViewModel.kt", l = {243, 244}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$fetchPromotedPost$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f28479a;

    /* renamed from: b  reason: collision with root package name */
    Object f28480b;

    /* renamed from: c  reason: collision with root package name */
    int f28481c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28482d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$fetchPromotedPost$1(CategoryListingsViewModel categoryListingsViewModel, zz.a<? super CategoryListingsViewModel$fetchPromotedPost$1> aVar) {
        super(2, aVar);
        this.f28482d = categoryListingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsViewModel$fetchPromotedPost$1(this.f28482d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object J2;
        PromotedPostItemViewModel promotedPostItemViewModel;
        List<Integer> list;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28481c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    list = (List) this.f28480b;
                    promotedPostItemViewModel = (PromotedPostItemViewModel) this.f28479a;
                    kotlin.f.b(obj);
                    promotedPostItemViewModel.y(list, (List) obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            promotedPostItemViewModel = (PromotedPostItemViewModel) this.f28479a;
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            PromotedPostItemViewModel C2 = this.f28482d.C2();
            CategoryListingsViewModel categoryListingsViewModel = this.f28482d;
            this.f28479a = C2;
            this.f28481c = 1;
            J2 = categoryListingsViewModel.J2(this);
            if (J2 == f11) {
                return f11;
            }
            promotedPostItemViewModel = C2;
            obj = J2;
        }
        List<Integer> list2 = (List) obj;
        CategoryListingsViewModel categoryListingsViewModel2 = this.f28482d;
        this.f28479a = promotedPostItemViewModel;
        this.f28480b = list2;
        this.f28481c = 2;
        Object K2 = categoryListingsViewModel2.K2(this);
        if (K2 == f11) {
            return f11;
        }
        list = list2;
        obj = K2;
        promotedPostItemViewModel.y(list, (List) obj);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryListingsViewModel$fetchPromotedPost$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
