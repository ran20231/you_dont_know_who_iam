package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.SearchHistoryEntity;
import com.forsale.app.features.search.SearchItemModel;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import wz.p;
/* compiled from: SearchHistoryRepository.kt */
/* loaded from: classes2.dex */
public final class SearchHistoryRepository {
    public static final int $stable = 8;
    private final CategoriesRepositories categoriesRepositories;
    private final SearchHistoryDao searchHistoryDao;

    public SearchHistoryRepository(SearchHistoryDao searchHistoryDao, CategoriesRepositories categoriesRepositories) {
        o.i(searchHistoryDao, "searchHistoryDao");
        o.i(categoriesRepositories, "categoriesRepositories");
        this.searchHistoryDao = searchHistoryDao;
        this.categoriesRepositories = categoriesRepositories;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object checkIfExceedsLimit(SearchHistoryEntity.SearchHistorySource searchHistorySource, zz.a<? super p> aVar) {
        Object f11;
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new SearchHistoryRepository$checkIfExceedsLimit$2(this, searchHistorySource, null), aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (withContext == f11) {
            return withContext;
        }
        return p.f75480a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getSingle(String str, CategoryEntity categoryEntity, SearchHistoryEntity.SearchHistorySource searchHistorySource, zz.a<? super SearchHistoryEntity> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new SearchHistoryRepository$getSingle$2(categoryEntity, str, this, searchHistorySource, null), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object insert(SearchHistoryEntity searchHistoryEntity, zz.a<? super Long> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new SearchHistoryRepository$insert$2(this, searchHistoryEntity, null), aVar);
    }

    public final Object delete(SearchHistoryEntity searchHistoryEntity, zz.a<? super p> aVar) {
        Object f11;
        Object delete = this.searchHistoryDao.delete(searchHistoryEntity, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (delete == f11) {
            return delete;
        }
        return p.f75480a;
    }

    public final Object deleteAll(zz.a<? super p> aVar) {
        Object f11;
        Object deleteAll = this.searchHistoryDao.deleteAll(aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (deleteAll == f11) {
            return deleteAll;
        }
        return p.f75480a;
    }

    public final Object deleteById(int i11, zz.a<? super p> aVar) {
        Object f11;
        Object deleteById = this.searchHistoryDao.deleteById(i11, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (deleteById == f11) {
            return deleteById;
        }
        return p.f75480a;
    }

    public final Flow<List<CategoryEntity>> getAllMatchingCategoriesHistoryWithLimit() {
        final Flow<List<SearchHistoryEntity>> allBySourceWithLimit = this.searchHistoryDao.getAllBySourceWithLimit(SearchHistoryEntity.SearchHistorySource.MATCHING_CATEGORIES, 5);
        return new Flow<List<? extends CategoryEntity>>() { // from class: com.forsale.app.datalayer.repositories.SearchHistoryRepository$getAllMatchingCategoriesHistoryWithLimit$$inlined$mapNotNull$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.datalayer.repositories.SearchHistoryRepository$getAllMatchingCategoriesHistoryWithLimit$$inlined$mapNotNull$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @d(c = "com.forsale.app.datalayer.repositories.SearchHistoryRepository$getAllMatchingCategoriesHistoryWithLimit$$inlined$mapNotNull$1$2", f = "SearchHistoryRepository.kt", l = {238}, m = "emit")
                /* renamed from: com.forsale.app.datalayer.repositories.SearchHistoryRepository$getAllMatchingCategoriesHistoryWithLimit$$inlined$mapNotNull$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, zz.a r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.forsale.app.datalayer.repositories.SearchHistoryRepository$getAllMatchingCategoriesHistoryWithLimit$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.forsale.app.datalayer.repositories.SearchHistoryRepository$getAllMatchingCategoriesHistoryWithLimit$$inlined$mapNotNull$1$2$1 r0 = (com.forsale.app.datalayer.repositories.SearchHistoryRepository$getAllMatchingCategoriesHistoryWithLimit$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.forsale.app.datalayer.repositories.SearchHistoryRepository$getAllMatchingCategoriesHistoryWithLimit$$inlined$mapNotNull$1$2$1 r0 = new com.forsale.app.datalayer.repositories.SearchHistoryRepository$getAllMatchingCategoriesHistoryWithLimit$$inlined$mapNotNull$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r7)
                        goto L62
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.f.b(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.$this_unsafeFlow
                        java.util.List r6 = (java.util.List) r6
                        java.lang.Iterable r6 = (java.lang.Iterable) r6
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r2.<init>()
                        java.util.Iterator r6 = r6.iterator()
                    L43:
                        boolean r4 = r6.hasNext()
                        if (r4 == 0) goto L59
                        java.lang.Object r4 = r6.next()
                        com.forsale.app.datalayer.database.SearchHistoryEntity r4 = (com.forsale.app.datalayer.database.SearchHistoryEntity) r4
                        com.forsale.app.datalayer.database.CategoryEntity r4 = r4.getCategory()
                        if (r4 == 0) goto L43
                        r2.add(r4)
                        goto L43
                    L59:
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r2, r0)
                        if (r6 != r1) goto L62
                        return r1
                    L62:
                        wz.p r6 = wz.p.f75480a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.SearchHistoryRepository$getAllMatchingCategoriesHistoryWithLimit$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends CategoryEntity>> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        };
    }

    public final Flow<List<SearchItemModel>> getAllSearchHistoryWithLimit() {
        final Flow<List<SearchHistoryEntity>> allBySourceOrDefaultWithLimit = this.searchHistoryDao.getAllBySourceOrDefaultWithLimit(SearchHistoryEntity.SearchHistorySource.SEARCH_HISTORY, 5);
        return new Flow<List<? extends SearchItemModel>>() { // from class: com.forsale.app.datalayer.repositories.SearchHistoryRepository$getAllSearchHistoryWithLimit$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: com.forsale.app.datalayer.repositories.SearchHistoryRepository$getAllSearchHistoryWithLimit$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* compiled from: Emitters.kt */
                @d(c = "com.forsale.app.datalayer.repositories.SearchHistoryRepository$getAllSearchHistoryWithLimit$$inlined$map$1$2", f = "SearchHistoryRepository.kt", l = {223}, m = "emit")
                /* renamed from: com.forsale.app.datalayer.repositories.SearchHistoryRepository$getAllSearchHistoryWithLimit$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(zz.a aVar) {
                        super(aVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r9, zz.a r10) {
                    /*
                        r8 = this;
                        boolean r0 = r10 instanceof com.forsale.app.datalayer.repositories.SearchHistoryRepository$getAllSearchHistoryWithLimit$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r10
                        com.forsale.app.datalayer.repositories.SearchHistoryRepository$getAllSearchHistoryWithLimit$$inlined$map$1$2$1 r0 = (com.forsale.app.datalayer.repositories.SearchHistoryRepository$getAllSearchHistoryWithLimit$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.forsale.app.datalayer.repositories.SearchHistoryRepository$getAllSearchHistoryWithLimit$$inlined$map$1$2$1 r0 = new com.forsale.app.datalayer.repositories.SearchHistoryRepository$getAllSearchHistoryWithLimit$$inlined$map$1$2$1
                        r0.<init>(r10)
                    L18:
                        java.lang.Object r10 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r10)
                        goto L71
                    L29:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r10)
                        throw r9
                    L31:
                        kotlin.f.b(r10)
                        kotlinx.coroutines.flow.FlowCollector r10 = r8.$this_unsafeFlow
                        java.util.List r9 = (java.util.List) r9
                        java.lang.Iterable r9 = (java.lang.Iterable) r9
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r4 = 10
                        int r4 = kotlin.collections.p.y(r9, r4)
                        r2.<init>(r4)
                        java.util.Iterator r9 = r9.iterator()
                        r4 = 0
                    L4a:
                        boolean r5 = r9.hasNext()
                        if (r5 == 0) goto L68
                        java.lang.Object r5 = r9.next()
                        int r6 = r4 + 1
                        if (r4 >= 0) goto L5b
                        kotlin.collections.p.x()
                    L5b:
                        com.forsale.app.datalayer.database.SearchHistoryEntity r5 = (com.forsale.app.datalayer.database.SearchHistoryEntity) r5
                        com.forsale.app.features.search.SearchItemModel$a r7 = com.forsale.app.features.search.SearchItemModel.f36813h
                        com.forsale.app.features.search.SearchItemModel r4 = r7.g(r5, r4)
                        r2.add(r4)
                        r4 = r6
                        goto L4a
                    L68:
                        r0.label = r3
                        java.lang.Object r9 = r10.emit(r2, r0)
                        if (r9 != r1) goto L71
                        return r1
                    L71:
                        wz.p r9 = wz.p.f75480a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.SearchHistoryRepository$getAllSearchHistoryWithLimit$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.a):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends SearchItemModel>> flowCollector, zz.a aVar) {
                Object f11;
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), aVar);
                f11 = kotlin.coroutines.intrinsics.b.f();
                if (collect == f11) {
                    return collect;
                }
                return p.f75480a;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object insertNew(com.forsale.app.datalayer.database.SearchHistoryEntity r6, com.forsale.app.datalayer.database.SearchHistoryEntity.SearchHistorySource r7, zz.a<? super java.lang.Long> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.forsale.app.datalayer.repositories.SearchHistoryRepository$insertNew$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.datalayer.repositories.SearchHistoryRepository$insertNew$1 r0 = (com.forsale.app.datalayer.repositories.SearchHistoryRepository$insertNew$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.SearchHistoryRepository$insertNew$1 r0 = new com.forsale.app.datalayer.repositories.SearchHistoryRepository$insertNew$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.L$0
            kotlin.f.b(r8)
            goto L69
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.L$1
            r7 = r6
            com.forsale.app.datalayer.database.SearchHistoryEntity$SearchHistorySource r7 = (com.forsale.app.datalayer.database.SearchHistoryEntity.SearchHistorySource) r7
            java.lang.Object r6 = r0.L$0
            com.forsale.app.datalayer.repositories.SearchHistoryRepository r6 = (com.forsale.app.datalayer.repositories.SearchHistoryRepository) r6
            kotlin.f.b(r8)
            goto L54
        L43:
            kotlin.f.b(r8)
            r0.L$0 = r5
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r5.insert(r6, r0)
            if (r8 != r1) goto L53
            return r1
        L53:
            r6 = r5
        L54:
            r2 = r8
            java.lang.Number r2 = (java.lang.Number) r2
            r2.longValue()
            r0.L$0 = r8
            r2 = 0
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r6 = r6.checkIfExceedsLimit(r7, r0)
            if (r6 != r1) goto L68
            return r1
        L68:
            r6 = r8
        L69:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.SearchHistoryRepository.insertNew(com.forsale.app.datalayer.database.SearchHistoryEntity, com.forsale.app.datalayer.database.SearchHistoryEntity$SearchHistorySource, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object validateCategories(java.util.List<com.forsale.app.features.search.SearchItemModel> r7, zz.a<? super java.util.List<com.forsale.app.features.search.SearchItemModel>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.forsale.app.datalayer.repositories.SearchHistoryRepository$validateCategories$1
            if (r0 == 0) goto L13
            r0 = r8
            com.forsale.app.datalayer.repositories.SearchHistoryRepository$validateCategories$1 r0 = (com.forsale.app.datalayer.repositories.SearchHistoryRepository$validateCategories$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.SearchHistoryRepository$validateCategories$1 r0 = new com.forsale.app.datalayer.repositories.SearchHistoryRepository$validateCategories$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.L$1
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r0 = r0.L$0
            com.forsale.app.features.search.SearchItemModel$a r0 = (com.forsale.app.features.search.SearchItemModel.a) r0
            kotlin.f.b(r8)
            goto L54
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            kotlin.f.b(r8)
            com.forsale.app.features.search.SearchItemModel$a r8 = com.forsale.app.features.search.SearchItemModel.f36813h
            com.forsale.app.datalayer.repositories.CategoriesRepositories r2 = r6.categoriesRepositories
            java.util.List r4 = r8.b(r7)
            r0.L$0 = r8
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r0 = r2.validateCategoriesIdsByIds(r4, r0)
            if (r0 != r1) goto L51
            return r1
        L51:
            r5 = r0
            r0 = r8
            r8 = r5
        L54:
            java.util.List r8 = (java.util.List) r8
            java.util.List r7 = r0.i(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.SearchHistoryRepository.validateCategories(java.util.List, zz.a):java.lang.Object");
    }
}
