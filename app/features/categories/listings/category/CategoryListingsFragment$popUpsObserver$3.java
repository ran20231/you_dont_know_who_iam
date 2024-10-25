package com.forsale.app.features.categories.listings.category;

import com.forsale.app.datalayer.database.InAppMessageEntity;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* compiled from: CategoryListingsFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsFragment$popUpsObserver$3", f = "CategoryListingsFragment.kt", l = {242}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CategoryListingsFragment$popUpsObserver$3 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28313a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryListingsFragment f28314b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CategoryListingsFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsFragment$popUpsObserver$3$1", f = "CategoryListingsFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsFragment$popUpsObserver$3$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<InAppMessageEntity, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f28315a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f28316b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CategoryListingsFragment f28317c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CategoryListingsFragment categoryListingsFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f28317c = categoryListingsFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(InAppMessageEntity inAppMessageEntity, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(inAppMessageEntity, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28317c, aVar);
            anonymousClass1.f28316b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f28315a == 0) {
                kotlin.f.b(obj);
                InAppMessageEntity inAppMessageEntity = (InAppMessageEntity) this.f28316b;
                if (inAppMessageEntity != null) {
                    String text = inAppMessageEntity.getText();
                    x10.a.b("PROMOTED: viewModel.inAppMessageEvent.observe " + text, new Object[0]);
                    this.f28317c.B().C2().W(inAppMessageEntity);
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsFragment$popUpsObserver$3(CategoryListingsFragment categoryListingsFragment, zz.a<? super CategoryListingsFragment$popUpsObserver$3> aVar) {
        super(1, aVar);
        this.f28314b = categoryListingsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new CategoryListingsFragment$popUpsObserver$3(this.f28314b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28313a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            SharedFlow<InAppMessageEntity> z11 = this.f28314b.B().z();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28314b, null);
            this.f28313a = 1;
            if (FlowKt.collectLatest(z11, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((CategoryListingsFragment$popUpsObserver$3) create(aVar)).invokeSuspend(p.f75480a);
    }
}
