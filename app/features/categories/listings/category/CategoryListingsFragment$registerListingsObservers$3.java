package com.forsale.app.features.categories.listings.category;

import com.forsale.app.features.categories.listings.category.CategoryListingsViewModel;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import t9.y0;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsFragment$registerListingsObservers$3", f = "CategoryListingsFragment.kt", l = {338}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsFragment$registerListingsObservers$3 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28327a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryListingsFragment f28328b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CategoryListingsFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsFragment$registerListingsObservers$3$1", f = "CategoryListingsFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsFragment$registerListingsObservers$3$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CategoryListingsViewModel.d, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f28329a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f28330b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CategoryListingsFragment f28331c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CategoryListingsFragment categoryListingsFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f28331c = categoryListingsFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(CategoryListingsViewModel.d dVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(dVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28331c, aVar);
            anonymousClass1.f28330b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f28329a == 0) {
                kotlin.f.b(obj);
                CategoryListingsViewModel.d dVar = (CategoryListingsViewModel.d) this.f28330b;
                if (o.d(dVar, CategoryListingsViewModel.d.a.f28468a)) {
                    this.f28331c.i0();
                } else if (dVar instanceof CategoryListingsViewModel.d.b) {
                    if (((CategoryListingsViewModel.d.b) dVar).a()) {
                        CategoryListingsFragment categoryListingsFragment = this.f28331c;
                        String string = categoryListingsFragment.getString(y0.X4);
                        o.h(string, "getString(...)");
                        categoryListingsFragment.Q(string);
                    } else {
                        CategoryListingsFragment categoryListingsFragment2 = this.f28331c;
                        String string2 = categoryListingsFragment2.getString(y0.O4);
                        o.h(string2, "getString(...)");
                        categoryListingsFragment2.Q(string2);
                    }
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsFragment$registerListingsObservers$3(CategoryListingsFragment categoryListingsFragment, zz.a<? super CategoryListingsFragment$registerListingsObservers$3> aVar) {
        super(1, aVar);
        this.f28328b = categoryListingsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new CategoryListingsFragment$registerListingsObservers$3(this.f28328b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28327a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            SharedFlow<CategoryListingsViewModel.d> y22 = this.f28328b.B().y2();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28328b, null);
            this.f28327a = 1;
            if (FlowKt.collectLatest(y22, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((CategoryListingsFragment$registerListingsObservers$3) create(aVar)).invokeSuspend(p.f75480a);
    }
}
