package com.forsale.app.features.categories.listings.category;

import com.forsale.app.features.maincontainer.MainContainerViewModel;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsFragment$registerListingsObservers$5", f = "CategoryListingsFragment.kt", l = {361}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsFragment$registerListingsObservers$5 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28337a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryListingsFragment f28338b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CategoryListingsFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsFragment$registerListingsObservers$5$1", f = "CategoryListingsFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsFragment$registerListingsObservers$5$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<Boolean, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f28339a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ boolean f28340b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CategoryListingsFragment f28341c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CategoryListingsFragment categoryListingsFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f28341c = categoryListingsFragment;
        }

        public final Object b(boolean z11, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(Boolean.valueOf(z11), aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28341c, aVar);
            anonymousClass1.f28340b = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, zz.a<? super p> aVar) {
            return b(bool.booleanValue(), aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MainContainerViewModel S;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f28339a == 0) {
                kotlin.f.b(obj);
                boolean z11 = this.f28340b;
                S = this.f28341c.S();
                S.J1(z11);
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsFragment$registerListingsObservers$5(CategoryListingsFragment categoryListingsFragment, zz.a<? super CategoryListingsFragment$registerListingsObservers$5> aVar) {
        super(1, aVar);
        this.f28338b = categoryListingsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new CategoryListingsFragment$registerListingsObservers$5(this.f28338b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28337a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            StateFlow<Boolean> W2 = this.f28338b.B().W2();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28338b, null);
            this.f28337a = 1;
            if (FlowKt.collectLatest(W2, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((CategoryListingsFragment$registerListingsObservers$5) create(aVar)).invokeSuspend(p.f75480a);
    }
}
