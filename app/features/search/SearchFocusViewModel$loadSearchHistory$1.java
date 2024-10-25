package com.forsale.app.features.search;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.repositories.SearchHistoryRepository;
import com.forsale.app.features.search.SearchAnalyticsData;
import com.forsale.app.features.search.SearchFocusViewModel;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchFocusViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchFocusViewModel$loadSearchHistory$1", f = "SearchFocusViewModel.kt", l = {286}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchFocusViewModel$loadSearchHistory$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36752a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SearchFocusViewModel f36753b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchFocusViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchFocusViewModel$loadSearchHistory$1$1", f = "SearchFocusViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.search.SearchFocusViewModel$loadSearchHistory$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.q<List<? extends SearchItemModel>, List<? extends CategoryEntity>, zz.a<? super Pair<? extends List<? extends SearchItemModel>, ? extends List<? extends CategoryEntity>>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f36754a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f36755b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f36756c;

        AnonymousClass1(zz.a<? super AnonymousClass1> aVar) {
            super(3, aVar);
        }

        @Override // g00.q
        /* renamed from: b */
        public final Object invoke(List<SearchItemModel> list, List<CategoryEntity> list2, zz.a<? super Pair<? extends List<SearchItemModel>, ? extends List<CategoryEntity>>> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(aVar);
            anonymousClass1.f36755b = list;
            anonymousClass1.f36756c = list2;
            return anonymousClass1.invokeSuspend(wz.p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f36754a == 0) {
                kotlin.f.b(obj);
                return new Pair((List) this.f36755b, (List) this.f36756c);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchFocusViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchFocusViewModel$loadSearchHistory$1$2", f = "SearchFocusViewModel.kt", l = {288}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.search.SearchFocusViewModel$loadSearchHistory$1$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements g00.p<Pair<? extends List<? extends SearchItemModel>, ? extends List<? extends CategoryEntity>>, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f36757a;

        /* renamed from: b  reason: collision with root package name */
        Object f36758b;

        /* renamed from: c  reason: collision with root package name */
        int f36759c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f36760d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchFocusViewModel f36761e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(SearchFocusViewModel searchFocusViewModel, zz.a<? super AnonymousClass2> aVar) {
            super(2, aVar);
            this.f36761e = searchFocusViewModel;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(Pair<? extends List<SearchItemModel>, ? extends List<CategoryEntity>> pair, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass2) create(pair, aVar)).invokeSuspend(wz.p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f36761e, aVar);
            anonymousClass2.f36760d = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            SearchHistoryRepository searchHistoryRepository;
            Object validateCategories;
            Pair pair;
            SearchFocusViewModel searchFocusViewModel;
            SearchFocusViewModel.SearchState searchState;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f36759c;
            if (i11 != 0) {
                if (i11 == 1) {
                    searchFocusViewModel = (SearchFocusViewModel) this.f36757a;
                    kotlin.f.b(obj);
                    searchState = (SearchFocusViewModel.SearchState) this.f36758b;
                    pair = (Pair) this.f36760d;
                    validateCategories = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.f.b(obj);
                Pair pair2 = (Pair) this.f36760d;
                SearchFocusViewModel searchFocusViewModel2 = this.f36761e;
                SearchFocusViewModel.SearchState U0 = searchFocusViewModel2.U0();
                searchHistoryRepository = this.f36761e.f36705p0;
                this.f36760d = pair2;
                this.f36757a = searchFocusViewModel2;
                this.f36758b = U0;
                this.f36759c = 1;
                validateCategories = searchHistoryRepository.validateCategories((List) pair2.c(), this);
                if (validateCategories == f11) {
                    return f11;
                }
                pair = pair2;
                searchFocusViewModel = searchFocusViewModel2;
                searchState = U0;
            }
            searchFocusViewModel.z1(SearchFocusViewModel.SearchState.b(searchState, (List) validateCategories, null, null, null, null, null, false, null, (List) pair.d(), null, SearchAnalyticsData.SearchSource.RECENT_SEARCH_CATEGORIES, 766, null));
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFocusViewModel$loadSearchHistory$1(SearchFocusViewModel searchFocusViewModel, zz.a<? super SearchFocusViewModel$loadSearchHistory$1> aVar) {
        super(2, aVar);
        this.f36753b = searchFocusViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SearchFocusViewModel$loadSearchHistory$1(this.f36753b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Flow g12;
        Flow f12;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36752a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            g12 = this.f36753b.g1();
            f12 = this.f36753b.f1();
            Flow combine = FlowKt.combine(g12, f12, new AnonymousClass1(null));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f36753b, null);
            this.f36752a = 1;
            if (FlowKt.collectLatest(combine, anonymousClass2, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SearchFocusViewModel$loadSearchHistory$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
