package com.forsale.app.features.categories.listings.category.view;

import androidx.compose.animation.core.Animatable;
import com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItemViewModel;
import g00.l;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import r.j;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsView.kt */
@d(c = "com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$PromotedPost$2", f = "CategoryListingsView.kt", l = {260}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewKt$PromotedPost$2 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28773a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f28774b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f28775c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PromotedPostItemViewModel f28776d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Animatable<Float, j> f28777e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ l<Boolean, wz.p> f28778f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CategoryListingsView.kt */
    @d(c = "com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$PromotedPost$2$1", f = "CategoryListingsView.kt", l = {262}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listings.category.view.CategoryListingsViewKt$PromotedPost$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f28779a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PromotedPostItemViewModel f28780b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l<Boolean, wz.p> f28781c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(PromotedPostItemViewModel promotedPostItemViewModel, l<? super Boolean, wz.p> lVar, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f28780b = promotedPostItemViewModel;
            this.f28781c = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<wz.p> create(Object obj, a<?> aVar) {
            return new AnonymousClass1(this.f28780b, this.f28781c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = b.f();
            int i11 = this.f28779a;
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                long longValue = this.f28780b.H().getValue().longValue();
                this.f28779a = 1;
                if (DelayKt.delay(longValue, this) == f11) {
                    return f11;
                }
            }
            this.f28781c.invoke(kotlin.coroutines.jvm.internal.a.a(false));
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CategoryListingsViewKt$PromotedPost$2(boolean z11, PromotedPostItemViewModel promotedPostItemViewModel, Animatable<Float, j> animatable, l<? super Boolean, wz.p> lVar, a<? super CategoryListingsViewKt$PromotedPost$2> aVar) {
        super(2, aVar);
        this.f28775c = z11;
        this.f28776d = promotedPostItemViewModel;
        this.f28777e = animatable;
        this.f28778f = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        CategoryListingsViewKt$PromotedPost$2 categoryListingsViewKt$PromotedPost$2 = new CategoryListingsViewKt$PromotedPost$2(this.f28775c, this.f28776d, this.f28777e, this.f28778f, aVar);
        categoryListingsViewKt$PromotedPost$2.f28774b = obj;
        return categoryListingsViewKt$PromotedPost$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        CoroutineScope coroutineScope;
        f11 = b.f();
        int i11 = this.f28773a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
                coroutineScope = (CoroutineScope) this.f28774b;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.f28774b;
            if (!this.f28775c) {
                return wz.p.f75480a;
            }
            this.f28776d.T();
            Animatable<Float, j> animatable = this.f28777e;
            Float c11 = kotlin.coroutines.jvm.internal.a.c(0.0f);
            this.f28774b = coroutineScope2;
            this.f28773a = 1;
            if (animatable.t(c11, this) == f11) {
                return f11;
            }
            coroutineScope = coroutineScope2;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new AnonymousClass1(this.f28776d, this.f28778f, null), 2, null);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((CategoryListingsViewKt$PromotedPost$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
