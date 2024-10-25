package com.forsale.app.features.categories.listings.category;

import com.forsale.app.features.categories.listings.category.CategoryListingsViewModel;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import wz.p;
/* compiled from: CategoryListingsFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsFragment$popUpsObserver$2", f = "CategoryListingsFragment.kt", l = {230}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CategoryListingsFragment$popUpsObserver$2 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28308a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryListingsFragment f28309b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CategoryListingsFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsFragment$popUpsObserver$2$1", f = "CategoryListingsFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsFragment$popUpsObserver$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CategoryListingsViewModel.c, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f28310a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f28311b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CategoryListingsFragment f28312c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CategoryListingsFragment categoryListingsFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f28312c = categoryListingsFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(CategoryListingsViewModel.c cVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(cVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28312c, aVar);
            anonymousClass1.f28311b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f28310a == 0) {
                kotlin.f.b(obj);
                CategoryListingsViewModel.c cVar = (CategoryListingsViewModel.c) this.f28311b;
                this.f28312c.B().a3(cVar);
                if (cVar instanceof CategoryListingsViewModel.c.a.C0309c) {
                    this.f28312c.B().V1();
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsFragment$popUpsObserver$2(CategoryListingsFragment categoryListingsFragment, zz.a<? super CategoryListingsFragment$popUpsObserver$2> aVar) {
        super(1, aVar);
        this.f28309b = categoryListingsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new CategoryListingsFragment$popUpsObserver$2(this.f28309b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28308a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            StateFlow<CategoryListingsViewModel.c> r22 = this.f28309b.B().r2();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28309b, null);
            this.f28308a = 1;
            if (FlowKt.collectLatest(r22, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((CategoryListingsFragment$popUpsObserver$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
