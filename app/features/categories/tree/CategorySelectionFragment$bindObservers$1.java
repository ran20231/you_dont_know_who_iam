package com.forsale.app.features.categories.tree;

import android.os.Bundle;
import androidx.fragment.app.w;
import com.forsale.app.datalayer.database.CategoryEntity;
import g00.l;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* compiled from: CategorySelectionFragment.kt */
@d(c = "com.forsale.app.features.categories.tree.CategorySelectionFragment$bindObservers$1", f = "CategorySelectionFragment.kt", l = {76}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CategorySelectionFragment$bindObservers$1 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31102a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategorySelectionFragment f31103b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CategorySelectionFragment.kt */
    @d(c = "com.forsale.app.features.categories.tree.CategorySelectionFragment$bindObservers$1$1", f = "CategorySelectionFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.tree.CategorySelectionFragment$bindObservers$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CategoryEntity, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f31104a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f31105b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CategorySelectionFragment f31106c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CategorySelectionFragment categorySelectionFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f31106c = categorySelectionFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(CategoryEntity categoryEntity, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(categoryEntity, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f31106c, aVar);
            anonymousClass1.f31105b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f31104a == 0) {
                f.b(obj);
                CategorySelectionFragment categorySelectionFragment = this.f31106c;
                Bundle bundle = new Bundle();
                CategorySelectionFragment categorySelectionFragment2 = this.f31106c;
                bundle.putParcelable("Category_entity", (CategoryEntity) this.f31105b);
                androidx.navigation.fragment.a.a(categorySelectionFragment2).h0();
                p pVar = p.f75480a;
                w.b(categorySelectionFragment, "select_category_request_key", bundle);
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategorySelectionFragment$bindObservers$1(CategorySelectionFragment categorySelectionFragment, zz.a<? super CategorySelectionFragment$bindObservers$1> aVar) {
        super(1, aVar);
        this.f31103b = categorySelectionFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new CategorySelectionFragment$bindObservers$1(this.f31103b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f31102a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<CategoryEntity> E0 = this.f31103b.B().E0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f31103b, null);
            this.f31102a = 1;
            if (FlowKt.collectLatest(E0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((CategorySelectionFragment$bindObservers$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
