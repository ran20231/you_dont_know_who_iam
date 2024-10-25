package com.forsale.app.features.categories.listings.category;

import androidx.fragment.app.FragmentManager;
import com.forsale.app.features.categories.listings.category.SortingOptionsBottomSheet;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import wz.p;
/* compiled from: CategoryListingsFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsFragment$registerSortingOptionsObservers$1", f = "CategoryListingsFragment.kt", l = {175}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CategoryListingsFragment$registerSortingOptionsObservers$1 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28347a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryListingsFragment f28348b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CategoryListingsFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsFragment$registerSortingOptionsObservers$1$1", f = "CategoryListingsFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsFragment$registerSortingOptionsObservers$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<f, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f28349a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CategoryListingsFragment f28350b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CategoryListingsFragment categoryListingsFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f28350b = categoryListingsFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(f fVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(fVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f28350b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f28349a == 0) {
                kotlin.f.b(obj);
                this.f28350b.B().L3();
                SortingOptionsBottomSheet.a aVar = SortingOptionsBottomSheet.f28633h;
                FragmentManager childFragmentManager = this.f28350b.getChildFragmentManager();
                o.h(childFragmentManager, "getChildFragmentManager(...)");
                aVar.a(childFragmentManager);
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsFragment$registerSortingOptionsObservers$1(CategoryListingsFragment categoryListingsFragment, zz.a<? super CategoryListingsFragment$registerSortingOptionsObservers$1> aVar) {
        super(1, aVar);
        this.f28348b = categoryListingsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new CategoryListingsFragment$registerSortingOptionsObservers$1(this.f28348b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28347a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            Flow<f> O2 = this.f28348b.B().O2();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28348b, null);
            this.f28347a = 1;
            if (FlowKt.collectLatest(O2, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((CategoryListingsFragment$registerSortingOptionsObservers$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
