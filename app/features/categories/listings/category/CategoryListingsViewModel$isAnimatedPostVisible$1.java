package com.forsale.app.features.categories.listings.category;

import com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItemViewModel;
import g00.q;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$isAnimatedPostVisible$1", f = "CategoryListingsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$isAnimatedPostVisible$1 extends SuspendLambda implements q<Boolean, PromotedPostItemViewModel.PromotedPostState, zz.a<? super Boolean>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28514a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ boolean f28515b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f28516c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28517d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$isAnimatedPostVisible$1(CategoryListingsViewModel categoryListingsViewModel, zz.a<? super CategoryListingsViewModel$isAnimatedPostVisible$1> aVar) {
        super(3, aVar);
        this.f28517d = categoryListingsViewModel;
    }

    public final Object b(boolean z11, PromotedPostItemViewModel.PromotedPostState promotedPostState, zz.a<? super Boolean> aVar) {
        CategoryListingsViewModel$isAnimatedPostVisible$1 categoryListingsViewModel$isAnimatedPostVisible$1 = new CategoryListingsViewModel$isAnimatedPostVisible$1(this.f28517d, aVar);
        categoryListingsViewModel$isAnimatedPostVisible$1.f28515b = z11;
        categoryListingsViewModel$isAnimatedPostVisible$1.f28516c = promotedPostState;
        return categoryListingsViewModel$isAnimatedPostVisible$1.invokeSuspend(p.f75480a);
    }

    @Override // g00.q
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, PromotedPostItemViewModel.PromotedPostState promotedPostState, zz.a<? super Boolean> aVar) {
        return b(bool.booleanValue(), promotedPostState, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        AtomicBoolean atomicBoolean3;
        boolean z11;
        AtomicBoolean atomicBoolean4;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f28514a == 0) {
            kotlin.f.b(obj);
            boolean z12 = this.f28515b;
            PromotedPostItemViewModel.PromotedPostState promotedPostState = (PromotedPostItemViewModel.PromotedPostState) this.f28516c;
            atomicBoolean = this.f28517d.f28376p1;
            atomicBoolean2 = this.f28517d.f28376p1;
            if ((atomicBoolean2.get() || z12) && promotedPostState == PromotedPostItemViewModel.PromotedPostState.SHOWN) {
                atomicBoolean3 = this.f28517d.f28366k1;
                if (!atomicBoolean3.get()) {
                    z11 = true;
                    atomicBoolean.set(z11);
                    atomicBoolean4 = this.f28517d.f28376p1;
                    return kotlin.coroutines.jvm.internal.a.a(atomicBoolean4.get());
                }
            }
            z11 = false;
            atomicBoolean.set(z11);
            atomicBoolean4 = this.f28517d.f28376p1;
            return kotlin.coroutines.jvm.internal.a.a(atomicBoolean4.get());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
