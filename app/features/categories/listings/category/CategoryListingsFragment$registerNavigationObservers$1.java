package com.forsale.app.features.categories.listings.category;

import com.forsale.app.features.search.a;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsFragment$registerNavigationObservers$1", f = "CategoryListingsFragment.kt", l = {253}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsFragment$registerNavigationObservers$1 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28342a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryListingsFragment f28343b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CategoryListingsFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsFragment$registerNavigationObservers$1$1", f = "CategoryListingsFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsFragment$registerNavigationObservers$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<com.forsale.app.features.search.a, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f28344a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f28345b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CategoryListingsFragment f28346c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CategoryListingsFragment categoryListingsFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f28346c = categoryListingsFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(com.forsale.app.features.search.a aVar, zz.a<? super p> aVar2) {
            return ((AnonymousClass1) create(aVar, aVar2)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28346c, aVar);
            anonymousClass1.f28345b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f28344a == 0) {
                kotlin.f.b(obj);
                com.forsale.app.features.search.a aVar = (com.forsale.app.features.search.a) this.f28345b;
                if (aVar instanceof a.C0422a) {
                    a.C0422a c0422a = (a.C0422a) aVar;
                    this.f28346c.Y(c0422a.a(), c0422a.b());
                } else if (aVar instanceof a.b) {
                    a.b bVar = (a.b) aVar;
                    this.f28346c.a0(bVar.f(), bVar.g(), bVar.a(), bVar.b(), bVar.c(), bVar.e(), bVar.d());
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsFragment$registerNavigationObservers$1(CategoryListingsFragment categoryListingsFragment, zz.a<? super CategoryListingsFragment$registerNavigationObservers$1> aVar) {
        super(1, aVar);
        this.f28343b = categoryListingsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new CategoryListingsFragment$registerNavigationObservers$1(this.f28343b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28342a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            SharedFlow<com.forsale.app.features.search.a> t22 = this.f28343b.B().t2();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28343b, null);
            this.f28342a = 1;
            if (FlowKt.collectLatest(t22, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((CategoryListingsFragment$registerNavigationObservers$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
