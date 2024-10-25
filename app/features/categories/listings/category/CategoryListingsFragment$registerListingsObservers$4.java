package com.forsale.app.features.categories.listings.category;

import com.forsale.app.features.maincontainer.MainContainerViewModel;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsFragment$registerListingsObservers$4", f = "CategoryListingsFragment.kt", l = {355}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsFragment$registerListingsObservers$4 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28332a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryListingsFragment f28333b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CategoryListingsFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsFragment$registerListingsObservers$4$1", f = "CategoryListingsFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsFragment$registerListingsObservers$4$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<String, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f28334a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f28335b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CategoryListingsFragment f28336c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CategoryListingsFragment categoryListingsFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f28336c = categoryListingsFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(String str, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(str, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28336c, aVar);
            anonymousClass1.f28335b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MainContainerViewModel S;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f28334a == 0) {
                kotlin.f.b(obj);
                S = this.f28336c.S();
                S.K1((String) this.f28335b);
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsFragment$registerListingsObservers$4(CategoryListingsFragment categoryListingsFragment, zz.a<? super CategoryListingsFragment$registerListingsObservers$4> aVar) {
        super(1, aVar);
        this.f28333b = categoryListingsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new CategoryListingsFragment$registerListingsObservers$4(this.f28333b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28332a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            StateFlow<String> L2 = this.f28333b.B().L2();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28333b, null);
            this.f28332a = 1;
            if (FlowKt.collectLatest(L2, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((CategoryListingsFragment$registerListingsObservers$4) create(aVar)).invokeSuspend(p.f75480a);
    }
}
