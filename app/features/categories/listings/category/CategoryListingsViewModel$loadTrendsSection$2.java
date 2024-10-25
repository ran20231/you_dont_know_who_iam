package com.forsale.app.features.categories.listings.category;

import com.forsale.app.datalayer.database.TrendEntity;
import com.forsale.app.features.search.h0;
import g00.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import wz.i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$loadTrendsSection$2", f = "CategoryListingsViewModel.kt", l = {1051}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$loadTrendsSection$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28537a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28538b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CategoryListingsViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$loadTrendsSection$2$1", f = "CategoryListingsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$loadTrendsSection$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<List<? extends TrendEntity>, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f28539a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f28540b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CategoryListingsViewModel f28541c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CategoryListingsViewModel categoryListingsViewModel, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f28541c = categoryListingsViewModel;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(List<TrendEntity> list, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(list, aVar)).invokeSuspend(wz.p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28541c, aVar);
            anonymousClass1.f28540b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TrendEntity trendEntity;
            Object m02;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f28539a == 0) {
                kotlin.f.b(obj);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : (List) this.f28540b) {
                    if (((TrendEntity) obj2).isTitle()) {
                        arrayList.add(obj2);
                    } else {
                        arrayList2.add(obj2);
                    }
                }
                Pair pair = new Pair(arrayList, arrayList2);
                CategoryListingsViewModel categoryListingsViewModel = this.f28541c;
                Object c11 = pair.c();
                List list = null;
                if (((List) c11).isEmpty()) {
                    c11 = null;
                }
                List list2 = (List) c11;
                if (list2 != null) {
                    m02 = CollectionsKt___CollectionsKt.m0(list2);
                    trendEntity = (TrendEntity) m02;
                } else {
                    trendEntity = null;
                }
                Object d11 = pair.d();
                if (!((List) d11).isEmpty()) {
                    list = d11;
                }
                List list3 = list;
                if (list3 != null && trendEntity != null) {
                    categoryListingsViewModel.K3(i.a(list3, trendEntity));
                }
                return wz.p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$loadTrendsSection$2(CategoryListingsViewModel categoryListingsViewModel, zz.a<? super CategoryListingsViewModel$loadTrendsSection$2> aVar) {
        super(2, aVar);
        this.f28538b = categoryListingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsViewModel$loadTrendsSection$2(this.f28538b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        h0 h0Var;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28537a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            h0Var = this.f28538b.B0;
            Flow<List<TrendEntity>> b11 = h0Var.b();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28538b, null);
            this.f28537a = 1;
            if (FlowKt.collectLatest(b11, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryListingsViewModel$loadTrendsSection$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
