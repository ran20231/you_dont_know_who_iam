package com.forsale.app.features.categories.listings.category;

import com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItemViewModel;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$togglePromotedPostCancelledState$1", f = "CategoryListingsViewModel.kt", l = {297, 301}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$togglePromotedPostCancelledState$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28617a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28618b;

    /* compiled from: CategoryListingsViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28619a;

        static {
            int[] iArr = new int[PromotedPostItemViewModel.PromotedPostState.values().length];
            try {
                iArr[PromotedPostItemViewModel.PromotedPostState.PAUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PromotedPostItemViewModel.PromotedPostState.SHOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PromotedPostItemViewModel.PromotedPostState.NOT_SHOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f28619a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$togglePromotedPostCancelledState$1(CategoryListingsViewModel categoryListingsViewModel, zz.a<? super CategoryListingsViewModel$togglePromotedPostCancelledState$1> aVar) {
        super(2, aVar);
        this.f28618b = categoryListingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsViewModel$togglePromotedPostCancelledState$1(this.f28618b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28617a;
        if (i11 != 0) {
            if (i11 == 1 || i11 == 2) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableStateFlow = this.f28618b.f28372n1;
            int i12 = a.f28619a[((PromotedPostItemViewModel.PromotedPostState) mutableStateFlow.getValue()).ordinal()];
            if (i12 == 1) {
                mutableStateFlow2 = this.f28618b.f28372n1;
                PromotedPostItemViewModel.PromotedPostState promotedPostState = PromotedPostItemViewModel.PromotedPostState.SHOWN;
                this.f28617a = 1;
                if (mutableStateFlow2.emit(promotedPostState, this) == f11) {
                    return f11;
                }
            } else if (i12 == 2) {
                mutableStateFlow3 = this.f28618b.f28372n1;
                PromotedPostItemViewModel.PromotedPostState promotedPostState2 = PromotedPostItemViewModel.PromotedPostState.PAUSED;
                this.f28617a = 2;
                if (mutableStateFlow3.emit(promotedPostState2, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryListingsViewModel$togglePromotedPostCancelledState$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
